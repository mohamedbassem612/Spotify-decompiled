package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l5n1 implements s5n1 {
    public static final Object c = new Object();
    public volatile s5n1 a;
    public volatile Object b;

    public static l5n1 a(s5n1 s5n1Var) {
        if (s5n1Var instanceof l5n1) {
            return (l5n1) s5n1Var;
        }
        l5n1 l5n1Var = new l5n1();
        l5n1Var.b = c;
        l5n1Var.a = s5n1Var;
        return l5n1Var;
    }

    @Override // p.s5n1
    public final Object b() {
        Object objB;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objB = this.b;
                if (objB == obj2) {
                    objB = this.a.b();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objB) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objB + ". This is likely due to a circular dependency.");
                    }
                    this.b = objB;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objB;
    }
}
