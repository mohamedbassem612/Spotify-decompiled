package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kyf1 implements myf1 {
    public final String a;
    public final String b;

    public kyf1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyf1)) {
            return false;
        }
        kyf1 kyf1Var = (kyf1) obj;
        return u890.j(this.a, kyf1Var.a) && u890.j(this.b, kyf1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
