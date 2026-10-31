package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ea61 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public ea61(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea61)) {
            return false;
        }
        ea61 ea61Var = (ea61) obj;
        return this.a.equals(ea61Var.a) && this.b.equals(ea61Var.b) && this.c.equals(ea61Var.c) && this.d == ea61Var.d;
    }

    public final int hashCode() {
        return l1d.C(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
