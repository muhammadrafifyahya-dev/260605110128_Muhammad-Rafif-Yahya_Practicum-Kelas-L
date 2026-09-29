public class Zakat {
	public static void main (String [] args){
		int [] penghasilan = {3200000,3250000,3400000,3550000,3550000,3600000,3650000,3700000,3720000,3740000,3800000,4000000};
		int [] pengeluaran = {3100000,3150000,3200000,3300000,3350000,3400000,3400000,3460000,3500000,3600000,3680000,3700000};
		int totalhasil = 0;
		int totalkeluar = 0;
		
		for (int i = 0; i < 12; i++) {
			totalhasil += penghasilan[i];
			totalkeluar += pengeluaran[i];
		}
		
		int surplus = totalhasil - totalkeluar;
		System.out.println("Total Penghasilan : " + totalhasil);
		System.out.println("Total Pengeluaran : " + totalkeluar);
		System.out.println("Surplus           : " + surplus);
		
		double nisab = 2605000*0.025;
		System.out.println("Nisab	    	  : " + nisab);
		
		if (surplus >= nisab) {
			double zakat = surplus * 0.025;
			System.out.println("Kategori	  : MUZAKKI (KAYA)");
			System.out.println("Zakat		  : " + zakat);
		} 
		
		else {
		System.out.println("Kategori	  : MUSTAHIK (MISKIN)");
		System.out.println("Zakat		  : 0");
		}
	}
}