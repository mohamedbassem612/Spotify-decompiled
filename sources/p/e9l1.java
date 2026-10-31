package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e9l1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g9l1 b;

    public /* synthetic */ e9l1(g9l1 g9l1Var, byte b) {
        this.a = b;
        this.b = g9l1Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                g9l1 g9l1Var = this.b;
                if (zBooleanValue) {
                    r091 r091Var = g9l1Var.h;
                    if (r091Var != null) {
                        r091Var.c();
                    }
                } else {
                    r091 r091Var2 = g9l1Var.h;
                    if (r091Var2 != null) {
                        r091Var2.k();
                    }
                }
                break;
            default:
                this.b.m = u890.j((bal1) obj, aal1.a);
                g9l1 g9l1Var2 = this.b;
                boolean zF = g9l1Var2.f(g9l1Var2.j);
                g9l1 g9l1Var3 = this.b;
                if (zF) {
                    g9l1Var3.d();
                } else if (!g9l1Var3.m) {
                    r091 r091Var3 = g9l1Var3.h;
                    if (r091Var3 != null) {
                        r091Var3.d();
                    }
                    g9l1 g9l1Var4 = this.b;
                    vq71 vq71Var = g9l1Var4.j;
                    g9l1Var4.e(new jt71(vq71Var != null ? vq71Var.g : null));
                }
                break;
        }
        return rih1.a;
    }
}
