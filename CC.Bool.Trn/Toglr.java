package CC.Bool.Trn;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.COd.Finishd;
import CC.Bool.Trn.Onbl_Rapr.Onbl_Rapr_ConcrEt;

public class Toglr extends Onbl_Rapr_ConcrEt
{
//	public static final Clas_Rap Class=Init_StRt(Toggle.class,
//		Clas_Rap.class
//	);/*Dep ?done*/

	@Override
	public Object Trn_On(Object PR)
	{return Get_Rapd_Onbl().Trn_No(PR);}
	@Override
	public Object Trn_Of(Object PR)
	{return null;}

	@Finishd(Is_Finishd=true)
	public Toglr(Onbl Rapd)
	{super(Rapd);}
	public Toglr()
	{}

//	static{Init_Nd(Toglr.class);}
}