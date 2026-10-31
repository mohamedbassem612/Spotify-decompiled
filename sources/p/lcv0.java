package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lcv0 extends e9p1 {
    public final String c;
    public final boolean d;

    public lcv0(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcv0)) {
            return false;
        }
        lcv0 lcv0Var = (lcv0) obj;
        return this.c.equals(lcv0Var.c) && this.d == lcv0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
