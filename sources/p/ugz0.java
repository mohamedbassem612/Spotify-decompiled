package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class ugz0 {
    public static final tgz0 Companion = new tgz0();
    public final zn21 a;
    public final ny01 b;

    public /* synthetic */ ugz0(int i, zn21 zn21Var, ny01 ny01Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = zn21Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = ny01Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugz0)) {
            return false;
        }
        ugz0 ugz0Var = (ugz0) obj;
        return u890.j(this.a, ugz0Var.a) && u890.j(this.b, ugz0Var.b);
    }

    public final int hashCode() {
        zn21 zn21Var = this.a;
        int iHashCode = (zn21Var == null ? 0 : zn21Var.hashCode()) * 31;
        ny01 ny01Var = this.b;
        return iHashCode + (ny01Var != null ? ny01Var.hashCode() : 0);
    }

    public ugz0(zn21 zn21Var, ny01 ny01Var) {
        this.a = zn21Var;
        this.b = ny01Var;
    }
}
