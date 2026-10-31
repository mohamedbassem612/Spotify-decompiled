package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rg11 extends o2p1 {
    public final String c;
    public final boolean d;

    public rg11(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg11)) {
            return false;
        }
        rg11 rg11Var = (rg11) obj;
        return this.c.equals(rg11Var.c) && this.d == rg11Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }
}
