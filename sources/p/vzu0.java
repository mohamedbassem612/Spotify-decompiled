package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vzu0 {
    public final String a;
    public final String b;
    public final uzu0 c;

    public vzu0(String str, String str2, uzu0 uzu0Var) {
        this.a = str;
        this.b = str2;
        this.c = uzu0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzu0)) {
            return false;
        }
        vzu0 vzu0Var = (vzu0) obj;
        return this.a.equals(vzu0Var.a) && this.b.equals(vzu0Var.b) && u890.j(this.c, vzu0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        uzu0 uzu0Var = this.c;
        return iD + (uzu0Var == null ? 0 : uzu0Var.hashCode());
    }
}
