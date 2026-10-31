package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ut90 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ut90(res resVar, byte b) {
        super(1);
        this.a = b;
        this.b = resVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                pt90 pt90Var = (pt90) obj;
                i5a1 i5a1Var = (i5a1) resVar.e;
                String str = pt90Var.a;
                dqi1 dqi1Var = new dqi1(25, "share-options-sheet", "share-link", (String) null, (String) null);
                xkg0 xkg0Var = new xkg0();
                xkg0Var.put("ssp", "1");
                xkg0Var.put("jam", "1");
                xkg0Var.put("app_destination", "socialsession");
                xkg0Var.put("ipl", "1");
                xkg0 xkg0VarB = xkg0Var.b();
                String str2 = (String) o7h.A0(ihc1.Q0(str, new String[]{":"}, 0, 6));
                Context context = i5a1Var.b;
                p2a0 p2a0Var = new p2a0(str, xkg0VarB, dqi1Var, context.getString(2131962321), context.getString(2131962322), l1d.m("https://shareables.scdn.co/publish/socialsession/", str2));
                String str3 = pt90Var.b;
                return new lt20(new x010(yoi1.g(i5a1Var.a(1, str3).toObservable()), ((v4o0) resVar.f).g, new t83(p2a0Var, new zo90(str, str3), (lnm) null, (byte) 5), (byte) 1), new i440(3, (lnm) null, (byte) 1), (byte) 0);
            default:
                ((qtr) obj).b(new jaz(resVar, (lnm) null, (byte) 6));
                return rih1.a;
        }
    }
}
