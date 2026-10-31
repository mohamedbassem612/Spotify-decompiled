package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dsn0 extends nsn0 {
    public final y6r0 a;

    public dsn0(y6r0 y6r0Var) {
        this.a = y6r0Var;
    }

    public final boolean a() {
        return false;
    }

    public final String b() {
        return f4i1.f("cross_user_handoff(", this.a.a, ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsn0) && u890.j(this.a, ((dsn0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return super.toString();
    }
}
