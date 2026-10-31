package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hig0 implements kzi0 {
    public kzi0[] a;

    @Override // p.kzi0
    public final vvz0 a(Class cls) {
        for (kzi0 kzi0Var : this.a) {
            if (kzi0Var.b(cls)) {
                return kzi0Var.a(cls);
            }
        }
        hhg1.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // p.kzi0
    public final boolean b(Class cls) {
        for (kzi0 kzi0Var : this.a) {
            if (kzi0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
