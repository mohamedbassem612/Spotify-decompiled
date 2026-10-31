package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nof1 {
    public final String a;
    public final String b;

    public nof1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        String str = this.b;
        return str == null ? this.a : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nof1)) {
            return false;
        }
        nof1 nof1Var = (nof1) obj;
        return this.a.equals(nof1Var.a) && u890.j(this.b, nof1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
