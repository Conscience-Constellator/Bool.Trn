package CC.Bool.Trn;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import CC.Bool.Trn.Flagd_On_Trnbl.Flagd_On_Trnbl_Imp;

import static CC.COd.Neds_Ovrid.Ok;
import static CC.COd.Neds_Ovrid.Yes;

public abstract class Task_On_Trnbl<MEt_RsOrc> extends Flagd_On_Trnbl_Imp
{
	@Finishd(Is_Finishd=true)
	public MEt_RsOrc
		On_RsOrc,
		Of_RsOrc;
		/**For cases where,
		 * 	only On_RsOrc is given,
		 * 	& Of_RsOrc is to be nully.*/
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		public abstract MEt_RsOrc Dfalt_Of_RsOrc();
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		public final void Set_RsOrcg(
			MEt_RsOrc On,
			MEt_RsOrc Of)
		{
			On_RsOrc=On;
			Of_RsOrc=Of;
		}
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			public final void Set_RsOrcg(
				MEt_RsOrc On)
			{Set_RsOrcg(On,Dfalt_Of_RsOrc());}

	@Finishd(Is_Finishd=true)
	public Task_On_Trnbl(
		MEt_RsOrc On,
		MEt_RsOrc Of)
	{Set_RsOrcg(On,Of);}
		@Finishd(Is_Finishd=true)
		public Task_On_Trnbl(
			MEt_RsOrc On)
		{Set_RsOrcg(On);}
}