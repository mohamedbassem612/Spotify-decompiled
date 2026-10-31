package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wx21 {
    public final String a;
    public final ox3 b;
    public final boolean c;

    public wx21(String str, ox3 ox3Var, boolean z) {
        this.a = str;
        this.b = ox3Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx21)) {
            return false;
        }
        wx21 wx21Var = (wx21) obj;
        return u890.j(this.a, wx21Var.a) && this.b == wx21Var.b && this.c == wx21Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
