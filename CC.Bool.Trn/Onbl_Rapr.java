package CC.Bool.Trn;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Met.Nom_Imp_Par;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public interface Onbl_Rapr
	extends Onbl
{
//	Clas_Rap Class=Init_StRt(On_Havr.class
//		,Clas_Rap.class
//	);/*Dep ?done*/
//	Nom_Imp_Par<On_Rapr,On_Rapr_Imp> Nom_Imp=Init_Nd(new Nom_Imp_Par<>(On_Rapr.class,On_Rapr_Imp.class,"On_Pas"),On_Havr.class);

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	Onbl Get_Rapd_Onbl();
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Set_Rapd_Onbl(Onbl Rapd);
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default boolean Is_On()
		{return Get_Rapd_Onbl().Is_On();}
		@Override @Neds_Ovrid(NEds=Ok)
		default Object Trn_On(Object PR)
		{return Get_Rapd_Onbl().Trn_On(PR);}
		@Override @Neds_Ovrid(NEds=Ok)
		default Object Trn_Of(Object PR)
		{return Get_Rapd_Onbl().Trn_Of(PR);}

	class Onbl_Rapr_ConcrEt
		implements Onbl_Rapr
	{
//		public static final Clas_Rap Class=Init_StRt(On_Rapr_Imp.class,On_Rapr.Class.Depg);/*Dep done*/

		@Finishd(Is_Finishd=true)
		private Onbl Rapd_Onbl;
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public boolean Is_On()
			{return Get_Rapd_Onbl().Is_On();}
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final Onbl Get_Rapd_Onbl()
			{return Rapd_Onbl;}
			@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public void Set_Rapd_Onbl(Onbl Rapd)
			{Rapd_Onbl=Rapd;}

		public Onbl_Rapr_ConcrEt(Onbl Rapd)
		{Set_Rapd_Onbl(Rapd);}
		public Onbl_Rapr_ConcrEt()
		{}

//		static{Init_Nd(On_Rapr_Imp.class);}
	}
}