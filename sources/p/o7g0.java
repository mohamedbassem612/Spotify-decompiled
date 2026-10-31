package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o7g0 {
    public final iyr0 a;
    public final String b;

    public o7g0(String str, iyr0 iyr0Var) {
        this.a = iyr0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7g0)) {
            return false;
        }
        o7g0 o7g0Var = (o7g0) obj;
        return this.a == o7g0Var.a && u890.j(this.b, o7g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
