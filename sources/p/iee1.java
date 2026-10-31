package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class iee1 {
    public final String a;
    public String b;
    public boolean c = false;
    public xor0 d = null;

    public iee1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iee1)) {
            return false;
        }
        iee1 iee1Var = (iee1) obj;
        return u890.j(this.a, iee1Var.a) && u890.j(this.b, iee1Var.b) && this.c == iee1Var.c && u890.j(this.d, iee1Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        xor0 xor0Var = this.d;
        return iG + (xor0Var == null ? 0 : xor0Var.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
