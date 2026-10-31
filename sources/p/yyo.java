package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yyo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ yyo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final tae a(c9n c9nVar, zob1 zob1Var) {
        byte b = this.a;
        byte b2 = 22;
        lbp lbpVar = this.b;
        switch (b) {
            case 0:
                ezo ezoVar = (ezo) ((fwo) lbpVar).c;
                hc3 hc3Var = (hc3) ezoVar.v;
                lzn0 lzn0VarH = hc3Var.h();
                c8o.l(lzn0VarH);
                twb twbVar = new twb((byte) 1);
                Activity activityA = hc3Var.a();
                c8o.l(activityA);
                hc3 hc3Var2 = (hc3) ezoVar.v;
                Activity activityA2 = hc3Var2.a();
                c8o.l(activityA2);
                efr efrVar = new efr(activityA2, b2);
                luk lukVarB = hc3Var2.b();
                c8o.l(lukVarB);
                xae xaeVar = new xae(activityA, efrVar, new lo9(lukVarB));
                q8n q8nVarD = hc3Var.d();
                c8o.l(q8nVarD);
                return new tae(new cab(lzn0VarH, twbVar, xaeVar, q8nVarD), c9nVar, zob1Var);
            case 1:
                return new tae(((nap) ((d7p) lbpVar).c).U, c9nVar, zob1Var);
            case 2:
                i7d i7dVar = (i7d) ((c21) lbpVar.c).b;
                lzn0 lzn0Var = (lzn0) i7dVar.b;
                c8o.l(lzn0Var);
                twb twbVar2 = new twb((byte) 1);
                Activity activity = (Activity) i7dVar.a;
                c8o.l(activity);
                Activity activity2 = (Activity) i7dVar.a;
                c8o.l(activity2);
                efr efrVar2 = new efr(activity2, b2);
                luk lukVar = (luk) i7dVar.Y;
                c8o.l(lukVar);
                xae xaeVar2 = new xae(activity, efrVar2, new lo9(lukVar));
                q8n q8nVar = (q8n) i7dVar.P0;
                c8o.l(q8nVar);
                return new tae(new cab(lzn0Var, twbVar2, xaeVar2, q8nVar), c9nVar, zob1Var);
            default:
                nb3 nb3Var = (nb3) ((chp) lbpVar).c;
                w530 w530Var = (w530) nb3Var.a;
                lzn0 lzn0VarB = w530Var.b();
                c8o.l(lzn0VarB);
                twb twbVar3 = new twb((byte) 1);
                Activity activityA3 = w530Var.a();
                c8o.l(activityA3);
                w530 w530Var2 = (w530) nb3Var.a;
                Activity activityA4 = w530Var2.a();
                c8o.l(activityA4);
                efr efrVar3 = new efr(activityA4, b2);
                luk lukVar2 = (luk) w530Var2.I.get();
                c8o.l(lukVar2);
                xae xaeVar3 = new xae(activityA3, efrVar3, new lo9(lukVar2));
                q8n q8nVar2 = (q8n) w530Var.O.get();
                c8o.l(q8nVar2);
                return new tae(new cab(lzn0VarB, twbVar3, xaeVar3, q8nVar2), c9nVar, zob1Var);
        }
    }
}
