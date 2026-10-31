package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nlg1 extends nmn1 {
    public final String b;
    public final boolean c;
    public final yq00 d;

    public nlg1(String str, boolean z, yq00 yq00Var) {
        this.b = str;
        this.c = z;
        this.d = yq00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlg1)) {
            return false;
        }
        nlg1 nlg1Var = (nlg1) obj;
        return u890.j(this.b, nlg1Var.b) && this.c == nlg1Var.c && u890.j(this.d, nlg1Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.b.hashCode() * 31, 31, this.c);
        yq00 yq00Var = this.d;
        return iG + (yq00Var == null ? 0 : yq00Var.hashCode());
    }
}
