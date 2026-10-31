package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pnq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ pnq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final vyf1 a(sjw0 sjw0Var, zu30 zu30Var) {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                wj3 wj3Var = (wj3) ((ykq) jly0Var).c;
                agc0 agc0Var = (agc0) ((d111) wj3Var.c).w.get();
                c8o.l(agc0Var);
                q7j0 q7j0Var = new q7j0(agc0Var);
                qnq qnqVar = (qnq) ((jly0) wj3Var.g).get();
                d111 d111Var = (d111) wj3Var.c;
                Activity activity = (Activity) d111Var.d.get();
                c8o.l(activity);
                gw70 gw70Var = (gw70) d111Var.g.get();
                c8o.l(gw70Var);
                return new vyf1(q7j0Var, qnqVar, new nfx(activity, gw70Var, (byte) 5), sjw0Var, zu30Var);
            default:
                h72 h72Var = (h72) ((ipq) jly0Var).c;
                agc0 agc0VarM = ((oo91) h72Var.b).m();
                c8o.l(agc0VarM);
                q7j0 q7j0Var2 = new q7j0(agc0VarM);
                qnq qnqVar2 = (qnq) ((jly0) h72Var.c).get();
                oo91 oo91Var = (oo91) h72Var.b;
                Activity activityS = oo91Var.s();
                c8o.l(activityS);
                gw70 gw70VarB = oo91Var.b();
                c8o.l(gw70VarB);
                return new vyf1(q7j0Var2, qnqVar2, new nfx(activityS, gw70VarB, (byte) 5), sjw0Var, zu30Var);
        }
    }
}
