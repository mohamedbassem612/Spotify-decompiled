package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class gka0 extends i520 {
    @Override // p.i520
    public final void d(s8s0 s8s0Var) {
        if (s8s0Var.toFile().mkdir()) {
            return;
        }
        q420 q420VarG = g(s8s0Var);
        if (q420VarG == null || !q420VarG.c) {
            hhg1.l(s8s0Var, "failed to create directory: ");
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
