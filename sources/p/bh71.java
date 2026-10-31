package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bh71 extends u1p1 {
    public final umt c;
    public final String d;

    public bh71(umt umtVar, String str) {
        this.c = umtVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bh71)) {
            return false;
        }
        bh71 bh71Var = (bh71) obj;
        return u890.j(this.c, bh71Var.c) && u890.j(this.d, bh71Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
