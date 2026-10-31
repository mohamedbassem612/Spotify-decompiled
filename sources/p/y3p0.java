package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class y3p0 {
    public final String a;
    public final String b;

    public y3p0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3p0)) {
            return false;
        }
        y3p0 y3p0Var = (y3p0) obj;
        return this.a.equals(y3p0Var.a) && this.b.equals(y3p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
