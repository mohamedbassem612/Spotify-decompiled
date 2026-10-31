package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e5x0 extends i541 {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public e5x0(int i, String str, String str2, String str3, String str4) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5x0)) {
            return false;
        }
        e5x0 e5x0Var = (e5x0) obj;
        return u890.j(this.d, e5x0Var.d) && u890.j(this.e, e5x0Var.e) && u890.j(this.f, e5x0Var.f) && u890.j(this.g, e5x0Var.g) && this.h == e5x0Var.h;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.d.hashCode() * 31, 31, this.e), 31, this.f);
        String str = this.g;
        return Integer.hashCode(this.h) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
