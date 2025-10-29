package CC.Bool.Trn;

import CC.Bool.Trn.Flagd_On_Trnbl.Flagd_On_Trnbl_Imp;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import java.util.List;
import java.util.ArrayList;

public class Splitr extends Flagd_On_Trnbl_Imp
{
//	public static final Clas_Rap Class=Init_StRt(Split.class
//		,Clas_Rap.class
//	);/*Dep ?done*/

	/*Trn methods return null, cuz result would be ambiguous between branches, unlike wrapped of Onbl_Rapr.*/
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public Object Trn_On(Object PR)
	{
		super.Trn_On(PR);
		for(Onbl Branch:Branchg)
		{Branch.Trn_On(PR);}

		return null;
	}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	public Object Trn_Of(Object PR)
	{
		super.Trn_Of(PR);
		for(Onbl Branch:Branchg)
		{Branch.Trn_Of(PR);}

		return null;
	}

	public List<Onbl> Branchg;
		@Lin_DclAr public Onbl Get(int IndX){return Branchg.get(IndX);}
		@Lin_DclAr public void Add(Onbl Branch){Branchg.add(Branch);}
		@Lin_DclAr public void Rmov(Onbl Branch){Branchg.remove(Branch);}

	@Finishd(Is_Finishd=true)
	public Splitr(List<Onbl> Branchg)
	{this.Branchg=Branchg;}
		@Finishd(Is_Finishd=true)
		public Splitr()
		{this(new ArrayList<>());}

//	static{Init_Nd(Split.class);}
}