package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ozv0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public ozv0(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozv0)) {
            return false;
        }
        ozv0 ozv0Var = (ozv0) obj;
        return this.a.equals(ozv0Var.a) && u890.j(this.b, ozv0Var.b) && this.c == ozv0Var.c && this.d == ozv0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return l1d.C(this.d) + ab80.k(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }
}
