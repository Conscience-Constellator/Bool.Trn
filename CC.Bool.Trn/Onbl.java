package CC.Bool.Trn;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Feld_Rap.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Met.Nom_Imp_Par;

import static java.lang.System.out;
import CC.$.$Q.$Bool;
import CC.Trnbl;

public interface Onbl extends Trnbl,$Bool
{
	/*
	Clas_Rap Class=Init_StRt_Nd(On_Havr.class,
		Clas_Rap.class);
	/*Dep ?done*/
//	Nom_Imp_Par<On_Havr,On_Havr_Imp> Nom_Imp=new Nom_Imp_Par<>(On_Havr.class,On_Havr_Imp.class,"On_Havr");

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	boolean Is_On();
		@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default boolean $Bool()
		{return Is_On();}
		@Lin_DclAr
		Object Trn_On(Object PR);
			static Object Trn_On(Object PR,Onbl On_Of)
			{
				return (On_Of!=null)?
					On_Of.Trn_On(PR):
					null;
			}
		@Lin_DclAr
		Object Trn_Of(Object PR);
			static Object Trn_Of(Object PR,Onbl Havr)
			{
				return (Havr!=null)?
					Havr.Trn_Of(PR):
					null;
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default Object Trn_Bool(boolean On,Object PR)
		{
			return (On)?
				Trn_On(PR):
				Trn_Of(PR);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default Object Trn_No(Object PR)
		{
			out.println("No");

			return Trn_Bool(!Is_On(),PR);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default Object Trn_Onf(Object PR)
		{
			Trn_On(PR);

			return Trn_Of(PR);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default Object Trn_Ofn(Object PR)
		{
			Trn_Of(PR);

			return Trn_On(PR);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default Object Trn_Boomrang(boolean On,Object PR)
		{
			return (On)?
				Trn_Onf(PR):
				Trn_Ofn(PR);
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default Object Trn_WAvr(Object PR)
			{
				out.println("WAvr");

				return Trn_Boomrang(!Is_On(),PR);
			}
}