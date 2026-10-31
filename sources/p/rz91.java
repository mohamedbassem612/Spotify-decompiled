package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rz91 implements yz91 {
    public final String a;
    public final String b;

    public rz91(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz91)) {
            return false;
        }
        rz91 rz91Var = (rz91) obj;
        return u890.j(this.a, rz91Var.a) && u890.j(this.b, rz91Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
