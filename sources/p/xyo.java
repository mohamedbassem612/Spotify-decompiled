package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xyo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ xyo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public static l2v0 a(xyo xyoVar, c9n c9nVar, p421 p421Var, bpb1 bpb1Var, int i) {
        p421 p421Var2 = (i & 2) != 0 ? null : p421Var;
        bpb1 bpb1Var2 = (i & 4) != 0 ? null : bpb1Var;
        byte b = 22;
        switch (xyoVar.a) {
            case 0:
                ezo ezoVar = (ezo) xyoVar.b.c;
                Activity activityA = ((hc3) ezoVar.v).a();
                c8o.l(activityA);
                Activity activityA2 = ((hc3) ezoVar.v).a();
                c8o.l(activityA2);
                efr efrVar = new efr(activityA2, b);
                luk lukVarB = ((hc3) ezoVar.v).b();
                c8o.l(lukVarB);
                lo9 lo9Var = new lo9(lukVarB);
                pvc pvcVar = new pvc((byte) 22);
                q8n q8nVarD = ((hc3) ezoVar.v).d();
                c8o.l(q8nVarD);
                return new l2v0(activityA, efrVar, lo9Var, pvcVar, q8nVarD, c9nVar, p421Var2, bpb1Var2);
            case 1:
                nap napVar = (nap) xyoVar.b.c;
                return new l2v0(napVar.F, new efr(napVar.V, b), new lo9(napVar.p), napVar.Y, napVar.Z, c9nVar, p421Var2, bpb1Var2);
            case 2:
                c21 c21Var = (c21) xyoVar.b.c;
                Activity activity = (Activity) ((i7d) c21Var.b).a;
                c8o.l(activity);
                Activity activity2 = (Activity) ((i7d) c21Var.b).a;
                c8o.l(activity2);
                efr efrVar2 = new efr(activity2, b);
                luk lukVar = (luk) ((i7d) c21Var.b).Y;
                c8o.l(lukVar);
                lo9 lo9Var2 = new lo9(lukVar);
                pvc pvcVar2 = new pvc((byte) 22);
                q8n q8nVar = (q8n) ((i7d) c21Var.b).P0;
                c8o.l(q8nVar);
                return new l2v0(activity, efrVar2, lo9Var2, pvcVar2, q8nVar, c9nVar, p421Var2, bpb1Var2);
            default:
                nb3 nb3Var = (nb3) ((chp) xyoVar.b).c;
                Activity activityA3 = ((w530) nb3Var.a).a();
                c8o.l(activityA3);
                Activity activityA4 = ((w530) nb3Var.a).a();
                c8o.l(activityA4);
                efr efrVar3 = new efr(activityA4, b);
                luk lukVar2 = (luk) ((w530) nb3Var.a).I.get();
                c8o.l(lukVar2);
                lo9 lo9Var3 = new lo9(lukVar2);
                pvc pvcVar3 = new pvc((byte) 22);
                q8n q8nVar2 = (q8n) ((w530) nb3Var.a).O.get();
                c8o.l(q8nVar2);
                return new l2v0(activityA3, efrVar3, lo9Var3, pvcVar3, q8nVar2, c9nVar, p421Var2, bpb1Var2);
        }
    }
}
