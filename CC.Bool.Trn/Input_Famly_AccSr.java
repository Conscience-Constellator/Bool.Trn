package CC.Bool.Trn;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public abstract class Input_Famly_AccSr
{
	public String Prefx;
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public String Get_ID(Object ID)
		{return Prefx+ID;}

	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public Onbl Get(On_Trnbl_List List,Object ID)
	{return List.Get_Input(Get_ID(ID));}
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public void Set(On_Trnbl_List List,Object ID,Object Input_SOrc)
	{List.Set_Input(Get_ID(ID),Input_SOrc);}

	@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
	public int Get_Unit(On_Trnbl_List List,
		int Pos,
		int Neg)
	{return List.Get_Input_Unit(
		Get_ID(Pos),
		Get_ID(Neg));
	}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		public int Get_Unit(On_Trnbl_List List,
			int[] Axis)
		{return Get_Unit(List,
			Axis[0],
			Axis[1]);
		}

	public Input_Famly_AccSr(String Prefx)
	{this.Prefx=Prefx;}
}