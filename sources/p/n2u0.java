package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n2u0 {
    public final yqg a;
    public final bpb1 b;
    public final bpb1 c;

    public n2u0(yqg yqgVar) {
        this.a = yqgVar;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.b = bpb1VarB;
        this.c = bpb1VarB;
    }

    public final Long a() {
        l2u0 l2u0Var = (l2u0) this.c.getValue();
        if (l2u0Var == null) {
            return null;
        }
        boolean z = l2u0Var.a;
        long jB = l2u0Var.b;
        if (z) {
            jB = (long) (((this.a.b() - l2u0Var.e) * l2u0Var.f) + jB);
        }
        return Long.valueOf(jB);
    }

    public final void b(l2u0 l2u0Var) {
        this.b.l(l2u0Var);
    }
}
