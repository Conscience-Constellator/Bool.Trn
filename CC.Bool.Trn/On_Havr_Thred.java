package CC.Bool.Trn;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import static java.lang.System.out;

public class On_Havr_Thred extends Thread
{
//	public static final Clas_Rap Class=Init_StRt(On_Havr_Thred.class,
//		Clas_Rap.class
//	);/*Dep ?done*/

	public Onbl Rapd_Havr;
		public Onbl Get_Havr(){return Rapd_Havr;}
		public void Set_Havr(Onbl Havr){this.Rapd_Havr=Havr;}
		public Object PR;
			public Object Get_Par(){return PR;}
			public void Set_Par(Object PR){this.PR=PR;}
		@Override
		public void run()
		{
			out.println("Thread:"+Rapd_Havr.getClass().getCanonicalName());
			Get_Havr().Trn_On(PR);
		}
	public static void Run(Onbl Havr)
	{new On_Havr_Thred(Havr).start();}

	public static Thread Branch(Runnable Do)
	{
		out.println("Branch");

		Thread Thred=new Thread(Do);
		Thred.start();

		return Thred;
	}

	public On_Havr_Thred(Onbl Rapd_Havr)
	{Set_Havr(Rapd_Havr);}
	public On_Havr_Thred(Onbl Rapd_Havr,Object PR)
	{
		this(Rapd_Havr);
		Set_Par(PR);
	}
	public On_Havr_Thred()
	{}

//	static{Init_Nd(On_Havr_Thred.class);}
}