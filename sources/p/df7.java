package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class df7 extends iqo1 {
    public final String d;
    public final String e;

    public df7(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df7)) {
            return false;
        }
        df7 df7Var = (df7) obj;
        return u890.j(this.d, df7Var.d) && u890.j(this.e, df7Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
