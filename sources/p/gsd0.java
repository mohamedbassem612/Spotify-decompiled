package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gsd0 extends isd0 {
    public final Throwable a;
    public final String b;

    public gsd0(String str, Throwable th) {
        this.a = th;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsd0)) {
            return false;
        }
        gsd0 gsd0Var = (gsd0) obj;
        return this.a.equals(gsd0Var.a) && u890.j(this.b, gsd0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
