package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mzc1 {
    public final String a;
    public final String b;

    public mzc1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzc1)) {
            return false;
        }
        mzc1 mzc1Var = (mzc1) obj;
        return u890.j(this.a, mzc1Var.a) && u890.j(this.b, mzc1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public /* synthetic */ mzc1(String str) {
        this(str, null);
    }
}
