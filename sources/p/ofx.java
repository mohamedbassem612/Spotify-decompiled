package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ofx implements u0i {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tfx b;

    public /* synthetic */ ofx(tfx tfxVar, byte b) {
        this.a = b;
        this.b = tfxVar;
    }

    public final qzh a(l0i l0iVar) {
        byte b = this.a;
        tfx tfxVar = this.b;
        switch (b) {
            case 0:
                sj8 sj8Var = (sj8) l0iVar;
                Context context = tfxVar.a;
                if (u890.j(sj8Var, qj8.a)) {
                    return new shr(new rjn(context));
                }
                if (u890.j(sj8Var, rj8.a)) {
                    return new zq31(context);
                }
                if (sj8Var == null) {
                    return new shr(new rjn(context));
                }
                eg.o();
                return null;
            case 1:
                if (l0iVar == null) {
                    return new eos(tfxVar.a, (byte) 5);
                }
                bhn0.d();
                return null;
            case 2:
                if (l0iVar == null) {
                    return new fcs(tfxVar.a, (byte) 8);
                }
                bhn0.d();
                return null;
            case 3:
                if (l0iVar == null) {
                    return new yxr(tfxVar.a, (byte) 1);
                }
                bhn0.d();
                return null;
            case 4:
                if (l0iVar == null) {
                    return new yir(tfxVar.a, (byte) 14);
                }
                bhn0.d();
                return null;
            case 5:
                hsz0 hsz0Var = (isz0) l0iVar;
                return hsz0Var instanceof hsz0 ? new bdk1(tfxVar.a, hsz0Var.a) : new gjs(tfxVar.a);
            default:
                if (l0iVar == null) {
                    return new fcs(tfxVar.a, (byte) 12);
                }
                bhn0.d();
                return null;
        }
    }
}
