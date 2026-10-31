package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dv2 {
    public final String a;
    public final boolean b;
    public final String c;

    public dv2(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv2)) {
            return false;
        }
        dv2 dv2Var = (dv2) obj;
        return this.a.equals(dv2Var.a) && this.b == dv2Var.b && this.c.equals(dv2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
