package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mhv0 extends xap1 {
    public final String c;
    public final String d;
    public final ti e;
    public final String f;

    public mhv0(String str, String str2, ti tiVar, String str3) {
        this.c = str;
        this.d = str2;
        this.e = tiVar;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhv0)) {
            return false;
        }
        mhv0 mhv0Var = (mhv0) obj;
        return u890.j(this.c, mhv0Var.c) && u890.j(this.d, mhv0Var.d) && u890.j(this.e, mhv0Var.e) && u890.j(this.f, mhv0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d)) * 31;
        String str = this.f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
