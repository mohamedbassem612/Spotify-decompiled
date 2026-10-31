package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u200 implements y600 {
    public final String a;
    public final double b;

    public u200(String str, double d) {
        this.a = str;
        this.b = d;
    }

    public final double a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u200)) {
            return false;
        }
        u200 u200Var = (u200) obj;
        return u890.j(this.a, u200Var.a) && Double.compare(this.b, u200Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
