package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hi10 {
    public final String a;
    public final int b;
    public final String c;
    public final String d = "";

    public hi10(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi10)) {
            return false;
        }
        hi10 hi10Var = (hi10) obj;
        return this.a.equals(hi10Var.a) && this.b == hi10Var.b && this.c.equals(hi10Var.c) && this.d.equals(hi10Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(kaa0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }
}
