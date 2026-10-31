package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dh71 extends u1p1 {
    public final Throwable c;
    public final String d;

    public dh71(String str, Throwable th) {
        this.c = th;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dh71)) {
            return false;
        }
        dh71 dh71Var = (dh71) obj;
        return this.c.equals(dh71Var.c) && u890.j(this.d, dh71Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
