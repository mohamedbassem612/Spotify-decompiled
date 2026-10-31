package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rz00 {
    public final Object a;
    public final int b;

    public rz00(int i, s2j0 s2j0Var) {
        this.a = s2j0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rz00)) {
            return false;
        }
        rz00 rz00Var = (rz00) obj;
        return this.a == rz00Var.a && this.b == rz00Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
