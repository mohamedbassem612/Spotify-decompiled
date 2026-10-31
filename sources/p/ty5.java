package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ty5 implements nku {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ cv30 f;
    public final /* synthetic */ Object g;

    public ty5(kos kosVar, ft0 ft0Var, kos kosVar2, sy5 sy5Var, nx2 nx2Var, ven0 ven0Var) {
        this.c = kosVar;
        this.d = ft0Var;
        this.e = kosVar2;
        this.f = sy5Var;
        this.g = nx2Var;
        this.b = ven0Var;
    }

    public final void dispose() {
        byte b = this.a;
        iu30 iu30Var = this.f;
        kos kosVar = this.e;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.g;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ((kos) obj2).invoke();
                ((ft0) obj).invoke();
                kosVar.invoke();
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    ((sy5) iu30Var).invoke();
                    ((nx2) obj3).invoke();
                }
                break;
            default:
                tka0 tka0Var = otw.a;
                Object value = ven0Var.getValue();
                guj gujVar = (guj) ((ven0) obj3).getValue();
                Object obj4 = ((q811) obj2).a;
                if (obj4 == null) {
                    hhg1.n("Required value was null.");
                } else {
                    otw.f(value, gujVar, 0, (ztw) obj4, (op80) ((q811) obj).a, (String) kosVar, iu30Var);
                }
                break;
        }
    }

    public ty5(q811 q811Var, q811 q811Var2, String str, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2) {
        this.c = q811Var;
        this.d = q811Var2;
        this.e = str;
        this.f = iu30Var;
        this.b = ven0Var;
        this.g = ven0Var2;
    }
}
