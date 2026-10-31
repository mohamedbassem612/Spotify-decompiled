package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a0e0 {
    public final String a;
    public final String b;
    public final String c;

    public a0e0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0e0)) {
            return false;
        }
        a0e0 a0e0Var = (a0e0) obj;
        return this.a.equals(a0e0Var.a) && this.b.equals(a0e0Var.b) && this.c.equals(a0e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
