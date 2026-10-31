package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x0d1 implements v0d1 {
    public static final p58 d = new p58((byte) 9);
    public final Object a = new Object();
    public volatile v0d1 b;
    public Object c;

    public x0d1(v0d1 v0d1Var) {
        this.b = v0d1Var;
    }

    public final Object get() {
        v0d1 v0d1Var = this.b;
        v0d1 v0d1Var2 = d;
        if (v0d1Var != v0d1Var2) {
            synchronized (this.a) {
                try {
                    if (this.b != v0d1Var2) {
                        Object obj = this.b.get();
                        this.c = obj;
                        this.b = v0d1Var2;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        String strL = this.b;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (strL == d) {
            strL = td6.l(new StringBuilder("<supplier that returned "), this.c, ">");
        }
        return td6.l(sb, strL, ")");
    }
}
