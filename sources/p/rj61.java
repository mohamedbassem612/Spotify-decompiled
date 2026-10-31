package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rj61 extends oqo1 {
    public final String d;
    public final String e;

    public rj61(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj61)) {
            return false;
        }
        rj61 rj61Var = (rj61) obj;
        return this.d.equals(rj61Var.d) && u890.j(this.e, rj61Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode() * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
