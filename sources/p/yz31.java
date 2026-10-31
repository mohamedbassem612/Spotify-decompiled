package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yz31 {
    public final String a;
    public final String b;

    public yz31(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz31)) {
            return false;
        }
        yz31 yz31Var = (yz31) obj;
        return u890.j(this.a, yz31Var.a) && u890.j(this.b, yz31Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
