package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lw91 {
    public final String a;
    public final boolean b;

    public lw91(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw91)) {
            return false;
        }
        lw91 lw91Var = (lw91) obj;
        return u890.j(this.a, lw91Var.a) && this.b == lw91Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
