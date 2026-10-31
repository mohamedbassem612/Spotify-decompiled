package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class px41 extends xyn1 {
    public final String b;
    public final String c;
    public final boolean d;

    public px41(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px41)) {
            return false;
        }
        px41 px41Var = (px41) obj;
        return u890.j(this.b, px41Var.b) && u890.j(this.c, px41Var.c) && this.d == px41Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(this.b.hashCode() * 31, 31, this.c);
    }
}
