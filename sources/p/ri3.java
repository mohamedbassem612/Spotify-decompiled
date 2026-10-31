package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ri3 extends vi3 {
    public final String a;
    public final String b;

    public ri3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri3)) {
            return false;
        }
        ri3 ri3Var = (ri3) obj;
        return this.a.equals(ri3Var.a) && u890.j(this.b, ri3Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
