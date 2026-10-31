package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d5x0 extends i541 {
    public final String d;
    public final String e;
    public final String f;

    public d5x0(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5x0)) {
            return false;
        }
        d5x0 d5x0Var = (d5x0) obj;
        return u890.j(this.d, d5x0Var.d) && u890.j(this.e, d5x0Var.e) && u890.j(this.f, d5x0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
