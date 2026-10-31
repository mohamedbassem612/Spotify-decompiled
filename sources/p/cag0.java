package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cag0 extends ton1 {
    public final String c;
    public final boolean d;

    public cag0(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cag0)) {
            return false;
        }
        cag0 cag0Var = (cag0) obj;
        return this.c.equals(cag0Var.c) && this.d == cag0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
