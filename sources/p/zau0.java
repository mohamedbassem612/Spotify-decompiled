package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zau0 {
    public final boolean a;
    public final bpb1 b = gio1.b(Boolean.FALSE);
    public bbu0 c;

    public zau0(boolean z) {
        this.a = z;
    }

    public final r091 a() {
        g0f1 g0f1Var;
        bbu0 bbu0Var;
        bbu0 bbu0Var2 = this.c;
        if (bbu0Var2 == null || (g0f1Var = (g0f1) o7h.r0(bbu0Var2.d.a())) == null || (bbu0Var = this.c) == null || !bbu0Var.e) {
            return null;
        }
        return (r091) bbu0Var.b.invoke(g0f1Var, bbu0Var.d);
    }

    public final int b() {
        bbu0 bbu0Var = this.c;
        if (bbu0Var != null) {
            return bbu0Var.d.a().size();
        }
        return 0;
    }
}
