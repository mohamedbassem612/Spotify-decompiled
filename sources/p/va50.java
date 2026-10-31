package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class va50 {
    public final int a;
    public final String b;
    public final String c;

    public va50(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va50)) {
            return false;
        }
        va50 va50Var = (va50) obj;
        return this.a == va50Var.a && this.b.equals(va50Var.b) && this.c.equals(va50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(l1d.C(this.a) * 31, 31, this.b);
    }
}
