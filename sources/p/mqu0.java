package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mqu0 {
    public final String a;
    public final String b;

    public mqu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqu0)) {
            return false;
        }
        mqu0 mqu0Var = (mqu0) obj;
        return this.a.equals(mqu0Var.a) && u890.j(this.b, mqu0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
