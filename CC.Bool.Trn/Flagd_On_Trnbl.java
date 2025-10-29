package CC.Bool.Trn;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

/**This class specifies the behaviour of Onbl,
 * by requiring instance have A flag that says whether they're on,
 * & defining "meat" methods, that perform the primary work of turning methods,
 * to be performed chronologically inward from flag-setting in their turning method.*/
public interface Flagd_On_Trnbl extends Onbl
{
	@Lin_DclAr @Finishd(Is_Finishd=true)
	void Set_Is_On(boolean Is);

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Object On_MEt(Object PR)
	{return null;}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Object Of_MEt(Object PR)
	{return null;}

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Object Trn_On(Object PR)
	{
		Set_Is_On(true);
		return On_MEt(PR);
	}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default Object Trn_Of(Object PR)
	{
		Object Rsult=Of_MEt(PR);
		Set_Is_On(false);

		return Rsult;
	}

	class Flagd_On_Trnbl_Imp implements Flagd_On_Trnbl
	{
	//	public static final Clas_Rap Class=Init_StRt(On_Havr_Imp.class,On_Havr.Class.Depg);/*Dep done*/

		@Finishd(Is_Finishd=true)
		private boolean Is_On;
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final boolean Is_On()
			{return Is_On;}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public void Set_Is_On(boolean Is)
			{Is_On=Is;}

		//default
	//	boolean Is_On();//{return Try_Get(getClass(),"On",this);}
		//default
	//	void Set_On(boolean On);//{Try_Set(getClass(),"On",this,On);}

		public Flagd_On_Trnbl_Imp()
		{}

	//	static{Init_Nd(On_Havr_Imp.class);}
	}
}