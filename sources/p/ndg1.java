package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ndg1 {
    public final String a;
    public final String b;

    public ndg1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndg1)) {
            return false;
        }
        ndg1 ndg1Var = (ndg1) obj;
        return u890.j(this.a, ndg1Var.a) && u890.j(this.b, ndg1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
