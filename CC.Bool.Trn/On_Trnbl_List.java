package CC.Bool.Trn;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif;

import java.util.Map;
import java.util.HashMap;
import static CC.Bool.Trn.Task_On_Trnbl_Runbl.Gar_Onbl;
import CC.Bool.Trn.Flagd_On_Trnbl.Flagd_On_Trnbl_Imp;
import static CC.Math.Bool.CalculAt_Unit;
import static java.lang.System.out;
//import static CC.UI.ConsOl.Shud_Print;

public interface On_Trnbl_List
{
//	Clas_Rap Class=Init_StRt_Nd(Ong.class,
//		Clas_Rap.class
//	);/*Dep ?done*/

	static Flagd_On_Trnbl_Imp Dfalt_Onbl_()
	{return new Flagd_On_Trnbl_Imp();}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=false)
	default Onbl Get_Dfalt_Acount()
	{return Dfalt_Onbl_();}

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	Map<String,Onbl> Get_On_Trnbl_List();
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default boolean Cont_Sig_Lisnr(String NAm)
		{return Get_On_Trnbl_List().containsKey(NAm);}
		default Onbl Get_Sig_Lisnr(String NAm)
		{return Get_On_Trnbl_List().get(NAm);}
		@Lin_DclAr @Neds_Ovrid(NEds=Nutrl) @Finishd(Is_Finishd=false)
		default Onbl Get_Input(String NAm)
		{
//			if(Shud_Print("Get_Input"))
//			{out.println("Get_Input("+NAm+')');}

			Map<String,Onbl> Inputg=Get_On_Trnbl_List();
			if(Inputg.containsKey(NAm))
			{return Inputg.get(NAm);}
			else
			{
				Onbl Input=Get_Dfalt_Acount();

				Set_Input(NAm,Input);
				return Input;
			}
		}
		@Lin_DclAr @Finishd(Is_Finishd=true)
		default void Set_Input(String NAm,Object Input_SOrc)
		{
//			if(Shud_Print("Set_Input"))
			{out.println("Set_Input("+NAm+','+Input_SOrc+')');}

			Get_On_Trnbl_List().put(NAm,Gar_Onbl(Input_SOrc));
		}
			@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			default <Onbl_SOrc_Typ>void Set_Input(
				String[] NAmg,
				Onbl_SOrc_Typ[] SOrcg)
			{
				for(int IndX=0;
					IndX<NAmg.length;
					IndX+=1)
				{
					Set_Input(
						NAmg[IndX],
						SOrcg[IndX]);
				}
			}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Set_Input(Object[] Inputg)
		{
			for(int IndX=0;
				IndX<Inputg.length;
				IndX+=2)
			{
				Set_Input(
					(String)Inputg[IndX],
					Inputg[IndX+1]);
			}
		}
		default void Ad_Sig_Lisnr(String NAm,Onbl Lisnr)
		{
			if(!Cont_Sig_Lisnr(NAm))
			{Get_On_Trnbl_List().put(NAm,new Splitr());}
			((Splitr)Get_Sig_Lisnr(NAm)).Add(Lisnr);
		}
		default void Rmov_Sig_Lisnr(String NAm,Onbl Lisnr)
		{
			if(Cont_Sig_Lisnr(NAm))
			{((Splitr)Get_Sig_Lisnr(NAm)).Rmov(Lisnr);}
		}
		//<editor-fold desc="Trn">
		default void Trn_On(String NAm,Object In)
		{
			if(Cont_Sig_Lisnr(NAm))
			{Get_Sig_Lisnr(NAm).Trn_On(In);}
		}
		default void Trn_Of(String NAm,Object In)
		{
			if(Cont_Sig_Lisnr(NAm))
			{Get_Sig_Lisnr(NAm).Trn_Of(In);}
		}
		default void Trn_Onf(String NAm,Object In)
		{
			if(Cont_Sig_Lisnr(NAm))
			{Get_Sig_Lisnr(NAm).Trn_Onf(In);}
		}
		//</editor-fold>

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	default int Get_Input_Unit(
		String Pos,
		String Neg)
	{
		return //Print(1,Sub_Eql_StAtmnt(Pos,Neg),
			CalculAt_Unit(
				Get_Input(Pos).Is_On(),
				Get_Input(Neg).Is_On())//)
			;
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default int Get_Input_Unit(
			String[] Axis)
		{
			return Get_Input_Unit(
				Axis[0],
				Axis[1]);
		}

	@Finishd(Is_Finishd=true)
	class On_Trnbl_List_ConcrEt implements On_Trnbl_List
	{
		@Finishd(Is_Finishd=true)
		public Map<String,Onbl> List;
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final Map<String,Onbl> Get_On_Trnbl_List()
			{return List;}

		@Finishd(Is_Finishd=true)
		public On_Trnbl_List_ConcrEt(Map<String,Onbl> List)
		{this.List=List;}
			@Finishd(Is_Finishd=true)
			public On_Trnbl_List_ConcrEt()
			{this(new HashMap<>());}
	}
}