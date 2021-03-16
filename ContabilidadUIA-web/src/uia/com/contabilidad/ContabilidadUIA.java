package uia.com.contabilidad;

import java.util.ArrayList;

import uia.com.contabilidad.clientes.InfoUIA;
import uia.com.contabilidad.gestor.DecoradorProveedores;
import uia.com.contabilidad.gestor.Gestor;
import uia.com.contabilidad.proveedores.Proveedor;
import uia.com.presentacion.ClienteJSP;

public class ContabilidadUIA {
		
	    public Gestor contabilidad =  null;
		public DecoradorProveedores gestorProveedores = null;		
		public ArrayList<ClienteJSP> listaProveedores = null;
		public ArrayList<ClienteJSP> listaCuentas = null;
		public ArrayList<ClienteJSP> listaCompras = null;
		public ArrayList<ClienteJSP> listaCheques = null;
		public Proveedor proveedor = null;
		public String clienteId="";

		public ContabilidadUIA()
		{
		 contabilidad = new Gestor("C:\\Users\\leolu\\Downloads\\Nueva carpeta\\Contabilidad-UIA-web-2-master\\ContabilidadUIA-web\\ListaProveedores.json");		
		 gestorProveedores = new DecoradorProveedores(contabilidad, "proveedor");		 
		 gestorProveedores.Print();
		 listaProveedores = gestorProveedores.getLista();
		}
		
		
		public ArrayList<ClienteJSP> getListaProveedores() {
			return listaProveedores;
		}



		public void setListaProveedores(ArrayList<ClienteJSP> listaProveedores) {
			this.listaProveedores = listaProveedores;
		}


		public DecoradorProveedores getGestorProveedores() {
			return gestorProveedores;
		}

		public void setGestorProveedores(DecoradorProveedores gestorProveedores) {
			this.gestorProveedores = gestorProveedores;
		}


		public ClienteJSP getClienteById(String clienteId) {
			// TODO Auto-generated method stub
			return null;
		}


		public void borraCliente(String clienteId) {
			// TODO Auto-generated method stub
			
		}


		public ArrayList<ClienteJSP> getAllClientes() {
			// TODO Auto-generated method stub
			return null;
		}


		public void checkCliente(ClienteJSP cliente) {
			// TODO Auto-generated method stub
			
		}


		public ArrayList<ClienteJSP> getCuentas(String clienteName) 
		{
			this.listaCuentas = proveedor.getListaCuentas();
			return this.listaCuentas;
		}


		public ArrayList<ClienteJSP> getCompras(String clienteId) {
			this.clienteId = clienteId;
			proveedor = (Proveedor) this.gestorProveedores.busca(clienteId);
			listaCompras = proveedor.getLista();
			return listaCompras;
		}

		public ArrayList<ClienteJSP> getListaCompras(String clienteId) {
			this.clienteId = clienteId;
			getCompras(this.clienteId);
			return listaCompras;
		}
		
		
		
		public ArrayList<ClienteJSP> getCheques(String clienteId) {
			this.clienteId = clienteId;
			proveedor = (Proveedor) this.gestorProveedores.busca(clienteId);
			listaCheques = proveedor.getLista();
			return listaCheques;
		}
		
		public ArrayList<ClienteJSP> getListaCheques(String clienteId) {
			this.clienteId = clienteId;
			getCheques(this.clienteId);
			return listaCheques;
		}
}
