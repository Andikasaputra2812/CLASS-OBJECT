
public class main {

	
	public static void main(String[] args) {
		Kotak kotakHitam = new Kotak();
		
		kotakHitam.setPanjang(20);
		kotakHitam.setLebar(10);
		
		kotakHitam.hitungLuas();
		kotakHitam.hitungKeliling();
	
		System.out.println("Panjang : " + kotakHitam.getPanjang());
		System.out.println("Lebar : " + kotakHitam.getLebar());
		System.out.println("LuasKotak : " + kotakHitam.getLuas());
		System.out.println("KelilingKotak " + kotakHitam.getKeliling());
		System.out.println("___________________________________________");
				
		{
			//Hasil Mahasiswa
			mahasiswa mhs1 = new mahasiswa();
			mhs1.setNama("Andika Saputra");
			mhs1.setNim("D0217305");
			mhs1.setAlamat("campalagiang");
			mhs1.setGolonganDarah("O");
			mhs1.setStatus("Mahasiswa");
			mhs1.setTinggiBadan(163);
			mhs1.setBeratBadan(45);
			
			System.out.println("Nama : " + mhs1.getNama());
			System.out.println("Nim : " + mhs1.getNim());
			System.out.println("Alamat : " + mhs1.getAlamat());
			System.out.println("GolonganDarah : " + mhs1.getGolonganDarah());
			System.out.println("Status : " + mhs1.getStatus());
			System.out.println("TinggiBadan : " + mhs1.getTinggiBadan());
			System.out.println("BeratBadan : " + mhs1.getBaratBadan());
			System.out.println("---------------------------------------------");

			System.out.println("------Object Kelas node------");
			//membuat object darikelas node
			node node = new node();
			
			//method setter node
			node.label = "Pepsi";
			node.Value = 1;
			
			//method getter node
			System.out.println("Nama Label : " + node.getlabel());
			System.out.println("jumlah label : " + node.getValue());
			
			
			//membuat object darikelas stack
			stack stack = new stack();
			System.out.println("------Object Kelas stack------");
			stack.value[0] = "Andika Saputra";
			stack.value[1] = "Aldi";
			stack.value[2]= "Arham";
			stack.value[3]= "Andika";
			stack.value[4]= "Andika";
			stack.value[5]= "Andika";
			stack.value[6]= "Andika";
			stack.value[7]= "Andika";
			stack.value[8]= "Andika";
			stack.value[9]= "Andika";
			stack.value[10]= "Andika";
			stack.value[11]= "Andika";
			stack.value[12]= "Andika";
			stack.value[13]= "Andika";
			stack.value[14]= "Andika";
			stack.value[15]= "Andika";
			stack.value[16]= "Andika";
			stack.value[17]= "Andika";
			stack.value[18]= "Andika";
			stack.value[19]= "Andika";
			stack.value[20]= "Andika";
			stack.value[21]= "Andika";
			stack.value[22]= "Andika";
			stack.value[23]= "Andika";
			stack.value[24]= "Andika";
			stack.value[25]= "Andika";
			stack.value[26]= "Andika";
			stack.value[27]= "Andika";
			stack.value[28]= "Andika";
			stack.value[29]= "Andika";
			stack.value[30]= "Andika";
			stack.value[31]= "Andika";
			stack.value[32]= "Andika";
			stack.value[33]= "Andika";
			stack.value[34]= "Andika";
			stack.value[35]= "Andika";
			stack.value[36]= "Andika";
			stack.value[37]= "Andika";
			stack.value[38]= "Andika";
			stack.value[39]= "Andika";
			stack.value[40]= "Andika";
			stack.value[41]= "Andika";
			stack.value[42]= "Andika";
			stack.value[43]= "Andika";
			stack.value[44]= "Andika";
			stack.value[45]= "Andika";
			stack.value[46]= "Andika";
			stack.value[47]= "Andika";
			stack.value[48]= "Andika";
			stack.value[49]= "Andika";
			stack.value[50]= "Andika";
			stack.value[51]= "Andika";
			stack.value[52]= "Andika";
			stack.value[53]= "Andika";
			stack.value[54]= "Andika";
			stack.value[55]= "Andika";
			stack.value[56]= "Andika";
			stack.value[57]= "Andika";
			stack.value[58]= "Andika";
			stack.value[59]= "Andika";
			stack.value[60]= "Andika";
			stack.value[61]= "Andika";
			stack.value[62]= "Andika";
			stack.value[63]= "Andika";
			stack.value[64]= "Andika";
			stack.value[65]= "Andika";
			stack.value[66]= "Andika";
			stack.value[67]= "Andika";
			stack.value[68]= "Andika";
			stack.value[69]= "Andika";
			stack.value[70]= "Andika";
			stack.value[71]= "Andika";
			stack.value[72]= "Andika";
			stack.value[73]= "Andika";
			stack.value[74]= "Andika";
			stack.value[75]= "Andika";
			stack.value[76]= "Andika";
			stack.value[77]= "Andika";
			stack.value[78]= "Andika";
			stack.value[79]= "Andika";
			stack.value[80]= "Andika";
			stack.value[81]= "Andika";
			stack.value[82]= "Andika";
			stack.value[83]= "Andika";
			stack.value[84]= "Andika";
			stack.value[85]= "Andika";
			stack.value[86]= "Andika";
			stack.value[87]= "Andika";
			stack.value[88]= "Andika";
			stack.value[89]= "Andika";
			stack.value[90]= "Andika";
			stack.value[91]= "Andika";
			stack.value[92]= "Andika";
			stack.value[93]= "Andika";
			stack.value[94]= "Andika";
			stack.value[95]= "Andika";
			stack.value[96]= "Andika";
			stack.value[97]= "Andika";
			stack.value[98]= "Andika";
			stack.value[99]= "Andika";
			for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};
		}

}	
}
