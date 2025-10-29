package CC.Bool.Trn;

import CC.COd.Finishd;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Bool.Trn.Onbl_Rapr.Onbl_Rapr_ConcrEt;

public class NoOn extends Onbl_Rapr_ConcrEt
{
//	public static final Clas_Rap Class=Init_StRt(No.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

	@Override public boolean Is_On(){return !super.Is_On();}
	@Override public Object Trn_On(Object PR){return super.Trn_Of(PR);}
	@Override public Object Trn_Of(Object PR){return super.Trn_On(PR);}

	@Finishd(Is_Finishd=true)
	public NoOn(Onbl Rapd)
	{super(Rapd);}
	public NoOn()
	{}

//	static{Init_Nd(No.class);}
}