package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class iig0 implements lzi0 {
    public lzi0[] a;

    @Override // p.lzi0
    public final wvz0 a(Class cls) {
        for (lzi0 lzi0Var : this.a) {
            if (lzi0Var.b(cls)) {
                return lzi0Var.a(cls);
            }
        }
        hhg1.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p.lzi0
    public final boolean b(Class cls) {
        for (lzi0 lzi0Var : this.a) {
            if (lzi0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
