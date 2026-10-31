package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fap {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ fap(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final l2v0 a(c9n c9nVar, b2v0 b2v0Var, ymd0 ymd0Var) {
        byte b = this.a;
        chp chpVar = this.b;
        switch (b) {
            case 0:
                nap napVar = (nap) ((d7p) chpVar).c;
                return new l2v0(napVar.F, new efr(napVar.V, (byte) 22), new lo9(napVar.f25p), napVar.j, napVar.W, c9nVar, b2v0Var, ymd0Var);
            case 1:
                c21 c21Var = (c21) ((lbp) chpVar).c;
                Activity activity = (Activity) ((i7d) c21Var.b).a;
                c8o.l(activity);
                Activity activity2 = (Activity) ((i7d) c21Var.b).a;
                c8o.l(activity2);
                efr efrVar = new efr(activity2, (byte) 22);
                luk lukVar = (luk) ((i7d) c21Var.b).Y;
                c8o.l(lukVar);
                lo9 lo9Var = new lo9(lukVar);
                lzn0 lzn0Var = (lzn0) ((i7d) c21Var.b).b;
                c8o.l(lzn0Var);
                z5h1 z5h1Var = (z5h1) ((i7d) c21Var.b).i;
                c8o.l(z5h1Var);
                return new l2v0(activity, efrVar, lo9Var, lzn0Var, z5h1Var, c9nVar, b2v0Var, ymd0Var);
            default:
                nb3 nb3Var = (nb3) chpVar.c;
                Activity activityA = ((w530) nb3Var.a).a();
                c8o.l(activityA);
                Activity activityA2 = ((w530) nb3Var.a).a();
                c8o.l(activityA2);
                efr efrVar2 = new efr(activityA2, (byte) 22);
                luk lukVar2 = (luk) ((w530) nb3Var.a).I.get();
                c8o.l(lukVar2);
                lo9 lo9Var2 = new lo9(lukVar2);
                lzn0 lzn0VarB = ((w530) nb3Var.a).b();
                c8o.l(lzn0VarB);
                z5h1 z5h1Var2 = (z5h1) ((w530) nb3Var.a).B.get();
                c8o.l(z5h1Var2);
                return new l2v0(activityA, efrVar2, lo9Var2, lzn0VarB, z5h1Var2, c9nVar, b2v0Var, ymd0Var);
        }
    }
}
