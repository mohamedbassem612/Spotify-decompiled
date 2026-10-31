package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yqu implements kly0 {
    public static final Object c = new Object();
    public volatile kly0 a;
    public volatile Object b;

    public static kly0 a(kly0 kly0Var) {
        if (kly0Var instanceof yqu) {
            return kly0Var;
        }
        yqu yquVar = new yqu();
        yquVar.b = c;
        yquVar.a = kly0Var;
        return yquVar;
    }

    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
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
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
