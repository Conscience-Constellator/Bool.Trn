package CC.Bool.Trn;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.concurrent.Callable;
import static CC.Util.Fun.Util.Try_Cal;
import static CC.Util.Fun.Util.Nuly_Calbl;

public class Task_On_Trnbl_Calbl
extends Task_On_Trnbl<Callable>
{
	@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public Callable Dfalt_Of_RsOrc()
	{return Nuly_Calbl;}

	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public Object On_MEt(Object PR)
	{return Try_Cal(On_RsOrc);}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public Object Of_MEt(Object PR)
	{return Try_Cal(Of_RsOrc);}

	@Finishd(Is_Finishd=true)
	public Task_On_Trnbl_Calbl(
		Callable On,
		Callable Of)
	{super(On,Of);}
		@Finishd(Is_Finishd=true)
		public Task_On_Trnbl_Calbl(
			Callable On)
		{super(On);}

	@Finishd(Is_Finishd=false)
	public static Onbl Gar_Onbl(Object SOrc)
	{
		return
			(SOrc instanceof Onbl Onbl)?Onbl:
			(SOrc instanceof Callable Task)?new Task_On_Trnbl_Calbl(Task):
			(SOrc instanceof Callable[] Taskg)?new Task_On_Trnbl_Calbl(
				Taskg[0],
				Taskg[1]):
			null;
	}
}