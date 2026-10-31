package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class eoj0 {
    public final String a;
    public final String b;

    public eoj0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoj0)) {
            return false;
        }
        eoj0 eoj0Var = (eoj0) obj;
        return u890.j(this.a, eoj0Var.a) && u890.j(this.b, eoj0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
