package CC.Bool.Trn;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static CC.Util.Fun.Util.Nuly_Runbl;
import static CC.Util.Fun.Util.Run_thN_Rtrn_Nul;

public class Task_On_Trnbl_Runbl
extends Task_On_Trnbl<Runnable>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public Runnable Dfalt_Of_RsOrc()
	{return Nuly_Runbl;}

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public Object On_MEt(Object PR)
	{return Run_thN_Rtrn_Nul(On_RsOrc);}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public Object Of_MEt(Object PR)
	{return Run_thN_Rtrn_Nul(Of_RsOrc);}

	@Finishd(Is_Finishd=true)
	public Task_On_Trnbl_Runbl(
		Runnable On,
		Runnable Of)
	{super(On,Of);}
		@Finishd(Is_Finishd=true)
		public Task_On_Trnbl_Runbl(
			Runnable On)
		{super(On);}

	@Finishd(Is_Finishd=false)
	public static Onbl Gar_Onbl(Object SOrc)
	{
		return
			(SOrc instanceof Onbl Onbl)?Onbl:
			(SOrc instanceof Runnable Task)?new Task_On_Trnbl_Runbl(Task):
			(SOrc instanceof Runnable[] Taskg)?new Task_On_Trnbl_Runbl(
				Taskg[0],
				Taskg[1]):
			null;
	}
}