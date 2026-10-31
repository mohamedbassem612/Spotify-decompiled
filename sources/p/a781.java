package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a781 {
    public final i281 a;
    public final boolean b;
    public final int c;

    public a781(i281 i281Var, boolean z, int i) {
        this.a = i281Var;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a781)) {
            return false;
        }
        a781 a781Var = (a781) obj;
        return this.a.equals(a781Var.a) && this.b == a781Var.b && this.c == a781Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
