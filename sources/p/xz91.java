package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xz91 implements yz91 {
    public final String a;
    public final String b;

    public xz91(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz91)) {
            return false;
        }
        xz91 xz91Var = (xz91) obj;
        return this.a.equals(xz91Var.a) && u890.j(this.b, xz91Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
