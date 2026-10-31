package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class g5t implements jly0 {
    public jly0 a;

    public static void a(jly0 jly0Var, jly0 jly0Var2) {
        g5t g5tVar = (g5t) jly0Var;
        if (g5tVar.a == null) {
            g5tVar.a = jly0Var2;
        } else {
            bhn0.w();
        }
    }

    @Override // p.kly0
    public final Object get() {
        jly0 jly0Var = this.a;
        if (jly0Var != null) {
            return jly0Var.get();
        }
        bhn0.w();
        return null;
    }
}
