package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fcd1 {
    public final bpb1 a;
    public final bpb1 b;

    public fcd1() {
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.a = bpb1VarB;
        this.b = bpb1VarB;
    }

    public final void a(boolean z) {
        bpb1 bpb1Var;
        Object value;
        do {
            bpb1Var = this.a;
            value = bpb1Var.getValue();
            ((Boolean) value).getClass();
        } while (!bpb1Var.k(value, Boolean.valueOf(z)));
    }
}
