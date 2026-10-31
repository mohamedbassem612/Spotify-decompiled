package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class it31 {
    public float a = 0.0f;
    public boolean b = true;
    public buo1 c = null;
    public cv20 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it31)) {
            return false;
        }
        it31 it31Var = (it31) obj;
        return Float.compare(this.a, it31Var.a) == 0 && this.b == it31Var.b && u890.j(this.c, it31Var.c) && u890.j(this.d, it31Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(Float.hashCode(this.a) * 31, 31, this.b);
        buo1 buo1Var = this.c;
        int iHashCode = (iG + (buo1Var == null ? 0 : buo1Var.hashCode())) * 31;
        cv20 cv20Var = this.d;
        return iHashCode + (cv20Var != null ? cv20Var.hashCode() : 0);
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=" + this.d + ")";
    }
}
