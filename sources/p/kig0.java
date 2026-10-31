package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kig0 implements nzi0 {
    public nzi0[] a;

    @Override // p.nzi0
    public final yvz0 a(Class cls) {
        for (nzi0 nzi0Var : this.a) {
            if (nzi0Var.b(cls)) {
                return nzi0Var.a(cls);
            }
        }
        hhg1.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p.nzi0
    public final boolean b(Class cls) {
        for (nzi0 nzi0Var : this.a) {
            if (nzi0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
