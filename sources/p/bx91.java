package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bx91 {
    public final String a;
    public final String b;
    public final boolean c;

    public bx91(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx91)) {
            return false;
        }
        bx91 bx91Var = (bx91) obj;
        return u890.j(this.a, bx91Var.a) && u890.j(this.b, bx91Var.b) && this.c == bx91Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
