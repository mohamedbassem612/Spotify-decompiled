package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q091 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r091 b;

    public /* synthetic */ q091(r091 r091Var, byte b) {
        this.a = b;
        this.b = r091Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        w590 w590Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        r091 r091Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    r091Var.g();
                }
                break;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    r091Var.g();
                }
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                cbu0 cbu0Var = r091Var.d;
                if (zBooleanValue) {
                    r091Var.h = ebp1.r(r091Var);
                    w590 w590Var2 = cbu0Var.c;
                    if (w590Var2 != null) {
                        w590Var2.o();
                    }
                } else if (r091Var.h && (w590Var = cbu0Var.c) != null) {
                    w590Var.r(null, null, null, null);
                }
                break;
            default:
                z590 z590Var = (z590) obj;
                bpb1 bpb1Var = r091Var.g;
                long j = z590Var.h;
                o091 o091Var = z590Var.c;
                lsm0 lsm0Var = z590Var.a;
                int i = z590Var.b ? 2 : lsm0Var != null ? 1 : 0;
                long j2 = z590Var.e;
                long j3 = z590Var.f;
                float f = o091Var.equals(n091.a) ? z590Var.g : 0.0f;
                boolean z = z590Var.d;
                y1k1 y1k1Var = z590Var.i;
                i091 i091Var = new i091(lsm0Var, i, j, j2, j3, f, z, o091Var, y1k1Var != null ? new p091(y1k1Var.a, y1k1Var.b) : null);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, i091Var);
                break;
        }
        return rih1Var;
    }
}
