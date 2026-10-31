package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yl41 extends ton1 {
    public final String c;
    public final String d;

    public yl41(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl41)) {
            return false;
        }
        yl41 yl41Var = (yl41) obj;
        return u890.j(this.c, yl41Var.c) && u890.j(this.d, yl41Var.d);
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String r() {
        return this.d;
    }

    public final String s() {
        return this.c;
    }
}
