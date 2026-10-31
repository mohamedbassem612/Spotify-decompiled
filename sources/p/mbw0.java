package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mbw0 {
    public final String a;
    public final gim0 b;
    public final String c;

    public mbw0(String str, gim0 gim0Var, String str2) {
        this.a = str;
        this.b = gim0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbw0)) {
            return false;
        }
        mbw0 mbw0Var = (mbw0) obj;
        return u890.j(this.a, mbw0Var.a) && u890.j(this.b, mbw0Var.b) && u890.j(this.c, mbw0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gim0 gim0Var = this.b;
        int iHashCode2 = (iHashCode + (gim0Var == null ? 0 : gim0Var.a.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(false) + xcg1.g(kaa0.f(0, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 961, 31), 31, true);
    }
}
