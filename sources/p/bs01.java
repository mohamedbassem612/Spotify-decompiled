package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bs01 extends vxo1 {
    public final String c;
    public final int d;

    public bs01(String str, int i) {
        this.c = str;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs01)) {
            return false;
        }
        bs01 bs01Var = (bs01) obj;
        return u890.j(this.c, bs01Var.c) && this.d == bs01Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
