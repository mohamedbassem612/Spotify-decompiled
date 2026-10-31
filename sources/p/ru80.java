package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ru80 extends lm5 {
    public final String d;
    public final String e;

    public ru80(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru80)) {
            return false;
        }
        ru80 ru80Var = (ru80) obj;
        return u890.j(this.d, ru80Var.d) && u890.j(this.e, ru80Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
