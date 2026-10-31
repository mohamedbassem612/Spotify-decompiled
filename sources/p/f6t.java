package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f6t implements x9h {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f6t(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final long a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                g6t g6tVar = (g6t) obj;
                long j = ((ci31) ((f6t) g6tVar.V0).b).c;
                if (j != 16) {
                    return j;
                }
                vh31 vh31Var = (vh31) lcc.z(g6tVar, ai31.a);
                if (vh31Var != null) {
                    long j2 = vh31Var.a;
                    if (j2 != 16) {
                        return j2;
                    }
                }
                return ((u7h) lcc.z(g6tVar, wrl.a)).a;
            case 1:
                g6t g6tVar2 = (g6t) obj;
                long j3 = ((di31) ((f6t) g6tVar2.V0).b).b;
                if (j3 != 16) {
                    return j3;
                }
                wh31 wh31Var = (wh31) lcc.z(g6tVar2, bi31.a);
                if (wh31Var != null) {
                    long j4 = wh31Var.a;
                    if (j4 != 16) {
                        return j4;
                    }
                }
                long j5 = ((u7h) lcc.z(g6tVar2, xrl.a)).a;
                return (((bbh) lcc.z(g6tVar2, cbh.a)).d() || ((double) z4p1.B(j5)) >= 0.5d) ? j5 : u7h.f;
            case 2:
                return ((u7h) ((tob1) obj).getValue()).a;
            case 3:
                return ((ci31) obj).c;
            default:
                return ((di31) obj).b;
        }
    }
}
