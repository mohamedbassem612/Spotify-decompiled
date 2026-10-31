package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nwm0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o0i b;
    public final /* synthetic */ wdm c;

    public /* synthetic */ nwm0(o0i o0iVar, wdm wdmVar, byte b) {
        this.a = b;
        this.b = o0iVar;
        this.c = wdmVar;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        Long lA;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o0i o0iVar = this.b;
        wdm wdmVar = this.c;
        switch (b) {
            case 0:
                i091 i091Var = (i091) obj;
                n2u0 n2u0Var = o0iVar.c.b;
                if (n2u0Var != null) {
                    l2u0 l2u0VarW = k4k.w(i091Var);
                    ny7 ny7Var = (ny7) wdmVar.h;
                    if (ny7Var == null) {
                        u890.C("audioData");
                        throw null;
                    }
                    ju7 ju7Var = ny7Var.a;
                    n2u0Var.b(l2u0.a(l2u0VarW, false, ju7Var.c, 0L, !ju7Var.f, null, 439));
                }
                return rih1Var;
            default:
                eal1 eal1Var = (eal1) obj;
                if (eal1Var instanceof dal1) {
                    n2u0 n2u0Var2 = o0iVar.c.b;
                    if (n2u0Var2 != null && (lA = n2u0Var2.a()) != null) {
                        long jLongValue = lA.longValue();
                        r091 r091Var = (r091) wdmVar.X;
                        if (r091Var != null) {
                            r091Var.h(((long) ((dal1) eal1Var).a) + jLongValue);
                        }
                    }
                } else {
                    if (!(eal1Var instanceof cal1)) {
                        eg.o();
                        return null;
                    }
                    r091 r091Var2 = (r091) wdmVar.X;
                    if (r091Var2 != null) {
                        r091Var2.h(((cal1) eal1Var).a);
                    }
                }
                return rih1Var;
        }
    }
}
