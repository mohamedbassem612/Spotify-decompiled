package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class afv0 {
    public final String a;
    public final String b;
    public final int c;

    public afv0(int i, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afv0)) {
            return false;
        }
        afv0 afv0Var = (afv0) obj;
        return u890.j(this.a, afv0Var.a) && this.b.equals(afv0Var.b) && this.c == afv0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
