package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class e1h1 implements d0h1 {
    public int a() {
        return 3;
    }

    public abstract a8b0 b();

    public boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1h1)) {
            return false;
        }
        e1h1 e1h1Var = (e1h1) obj;
        return c() == e1h1Var.c() && a() == e1h1Var.a() && b().equals(e1h1Var.b());
    }

    public final int hashCode() {
        int iC = l1d.C(a());
        if (o1h1.l(b())) {
            return (iC * 31) + 19;
        }
        return (iC * 31) + (c() ? 17 : b().hashCode());
    }

    public final String toString() {
        if (c()) {
            return "*";
        }
        if (a() == 1) {
            return b().toString();
        }
        return xcg1.q(a()) + " " + b();
    }

    public e1h1 d(g8b0 g8b0Var) {
        return this;
    }
}
