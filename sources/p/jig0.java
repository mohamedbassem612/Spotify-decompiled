package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jig0 implements mzi0 {
    public mzi0[] a;

    @Override // p.mzi0
    public final jzi0 a(Class cls) {
        for (mzi0 mzi0Var : this.a) {
            if (mzi0Var.b(cls)) {
                return mzi0Var.a(cls);
            }
        }
        hhg1.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p.mzi0
    public final boolean b(Class cls) {
        for (mzi0 mzi0Var : this.a) {
            if (mzi0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
