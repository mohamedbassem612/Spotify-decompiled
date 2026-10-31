package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nz21 implements rz21 {
    public final String a;
    public final String b;

    public nz21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz21)) {
            return false;
        }
        nz21 nz21Var = (nz21) obj;
        return this.a.equals(nz21Var.a) && u890.j(this.b, nz21Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
