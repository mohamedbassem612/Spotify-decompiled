package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o5y0 {
    public final String a;
    public final String b;

    public o5y0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5y0)) {
            return false;
        }
        o5y0 o5y0Var = (o5y0) obj;
        return u890.j(this.a, o5y0Var.a) && this.b.equals(o5y0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
