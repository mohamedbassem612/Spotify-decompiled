package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u0j1 {
    public final String a;
    public final String b;
    public final int c;

    public u0j1(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0j1)) {
            return false;
        }
        u0j1 u0j1Var = (u0j1) obj;
        return this.a.equals(u0j1Var.a) && this.b.equals(u0j1Var.b) && this.c == u0j1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
