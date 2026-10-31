package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k5o0 extends l5o0 {
    public final String a;
    public final String b;
    public final String c;

    public k5o0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5o0)) {
            return false;
        }
        k5o0 k5o0Var = (k5o0) obj;
        return this.a.equals(k5o0Var.a) && u890.j(this.b, k5o0Var.b) && this.c.equals(k5o0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
