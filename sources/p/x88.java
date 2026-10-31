package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x88 {
    public final boolean a;
    public final String b;
    public final b98 c;

    public x88(boolean z, String str, b98 b98Var) {
        this.a = z;
        this.b = str;
        this.c = b98Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x88)) {
            return false;
        }
        x88 x88Var = (x88) obj;
        return this.a == x88Var.a && this.b.equals(x88Var.b) && u890.j(this.c, x88Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b);
        b98 b98Var = this.c;
        return iD + (b98Var == null ? 0 : b98Var.hashCode());
    }
}
