package pru03.E02;

public class PRU03E02Cotxe_Jordi_Vidal extends CotxeAbstracte implements InterfaceCotxe {

	public PRU03E02Cotxe_Jordi_Vidal(String marca, String model, TipusCanvi canvimanual) {
		super(marca, model, canvimanual);
	}
	
	EstatsMotorCotxe motor = EstatsMotorCotxe.Aturat;
	
	@Override
	public void arrancarMotor() throws Exception {
		if (motor.equals(EstatsMotorCotxe.Aturat)) {
			motor = EstatsMotorCotxe.EnMarxa;
		}
		else throw new Exception ("El coche ya esta arrancado.");
	}

	@Override
	public EstatsMotorCotxe comprovaMotor() {
		
		
		return null;
	}

	
	@Override
	public int getRevolucions() {
		
		if (motor.equals(EstatsMotorCotxe.EnMarxa)) {
			int revoluciones=(int)(Math.random()*6500+1);
			return revoluciones;
		}
		else return 0;
	}

	@Override
	public void aturarMotor() throws Exception {
		if (motor.equals(EstatsMotorCotxe.EnMarxa)) {
			motor = EstatsMotorCotxe.Aturat;
		}
		else throw new Exception ("El coche ya esta apagado.");
	}
	
	public static void main(String[] args) throws Exception {
		
		PRU03E02Cotxe_Jordi_Vidal Gatobus;
		Gatobus = new PRU03E02Cotxe_Jordi_Vidal("Ghibli", "Totoro", TipusCanvi.CanviManual);
		
		Gatobus.arrancarMotor();
		System.out.println(Gatobus.getRevolucions());
	}
	
}
