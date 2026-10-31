package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lki0 extends hso1 {
    public final String b;
    public final boolean c;

    public lki0(String str, boolean z) {
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lki0)) {
            return false;
        }
        lki0 lki0Var = (lki0) obj;
        return u890.j(this.b, lki0Var.b) && this.c == lki0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
