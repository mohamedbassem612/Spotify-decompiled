package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s281 {
    public final double a;
    public final String b;
    public final String c;

    public s281(String str, String str2, double d) {
        this.a = d;
        this.b = str;
        this.c = str2;
    }

    public final double a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s281)) {
            return false;
        }
        s281 s281Var = (s281) obj;
        return Double.compare(this.a, s281Var.a) == 0 && this.b.equals(s281Var.b) && this.c.equals(s281Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Double.hashCode(this.a) * 31, 31, this.b);
    }
}
