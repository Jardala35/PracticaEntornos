class TestCuentaBancaria
{
	public static void main(String args[])
	{
		CuentaBancaria cuenta = new CuentaBancaria("1234521","Director Banco",100,0);
	CuentaBancaria c_secundaria = new CuentaBancaria("0123456789","Nombre Apellidos", 1000,5);  
		cuenta.reintegro(50);
		cuenta.ingreso(100);
		System.out.println("Saldo: " + cuenta.getSaldo());
	}
}
