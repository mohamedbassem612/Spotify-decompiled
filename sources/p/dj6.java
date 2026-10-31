package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dj6 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public dj6(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj6)) {
            return false;
        }
        dj6 dj6Var = (dj6) obj;
        return this.a.equals(dj6Var.a) && this.b.equals(dj6Var.b) && this.c.equals(dj6Var.c) && this.d.equals(dj6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
