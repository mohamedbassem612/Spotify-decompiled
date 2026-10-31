package p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b5l1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c5l1 b;

    public /* synthetic */ b5l1(c5l1 c5l1Var, byte b) {
        this.a = b;
        this.b = c5l1Var;
    }

    public final void run() {
        byte b = this.a;
        c5l1 c5l1Var = this.b;
        switch (b) {
            case 0:
                y0g y0gVar = c5l1Var.J1;
                if (y0gVar == null) {
                    u890.C("childInitiatedAuthNavigator");
                    throw null;
                }
                kg0 kg0Var = y0gVar.c;
                z0g z0gVarB = y0gVar.f.b();
                if (z0gVarB == null) {
                    kg0Var.d(new ckt(3), true);
                    return;
                }
                int iC = l1d.C(z0gVarB.a);
                if (iC == 0) {
                    kg0Var.d(zjt.a, true);
                    return;
                } else if (iC == 1) {
                    fn31.T(y0gVar.h, (o8n) null, 0, new hsc(y0gVar, z0gVarB, (lnm) null, (byte) 29), 3);
                    return;
                } else {
                    eg.o();
                    return;
                }
            default:
                c5l1Var.Y0().c(new gjt(fjt.b, (String) null), new ifl1((Object) null, (byte) 25), true);
                return;
        }
    }
}
