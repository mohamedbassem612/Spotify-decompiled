package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iy81 implements jly0 {
    public static final Object c = new Object();
    public volatile jly0 a;
    public volatile Object b;

    public static jly0 a(jly0 jly0Var) {
        if ((jly0Var instanceof iy81) || (jly0Var instanceof xqu)) {
            return jly0Var;
        }
        c8o.i(jly0Var);
        iy81 iy81Var = new iy81();
        iy81Var.b = c;
        iy81Var.a = jly0Var;
        return iy81Var;
    }

    @Override // p.kly0
    public final Object get() {
        Object obj = this.b;
        if (obj != c) {
            return obj;
        }
        jly0 jly0Var = this.a;
        if (jly0Var == null) {
            return this.b;
        }
        Object obj2 = jly0Var.get();
        this.b = obj2;
        this.a = null;
        return obj2;
    }
}
