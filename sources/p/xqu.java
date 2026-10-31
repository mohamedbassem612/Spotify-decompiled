package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xqu implements jly0, ynb0 {
    public static final Object c = new Object();
    public volatile jly0 a;
    public volatile Object b = c;

    public xqu(jly0 jly0Var) {
        this.a = jly0Var;
    }

    public static ynb0 a(jly0 jly0Var) {
        if (jly0Var instanceof ynb0) {
            return (ynb0) jly0Var;
        }
        c8o.i(jly0Var);
        return new xqu(jly0Var);
    }

    public static jly0 b(jly0 jly0Var) {
        c8o.i(jly0Var);
        return jly0Var instanceof xqu ? jly0Var : new xqu(jly0Var);
    }

    @Override // p.kly0
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
