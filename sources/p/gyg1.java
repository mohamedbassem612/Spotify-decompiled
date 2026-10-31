package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gyg1 {
    public final sxg1 a;
    public final sxg1 b;
    public final sxg1 c;
    public final sxg1 d;
    public final sxg1 e;

    public gyg1(sxg1 sxg1Var, sxg1 sxg1Var2, sxg1 sxg1Var3, sxg1 sxg1Var4, sxg1 sxg1Var5) {
        this.a = sxg1Var;
        this.b = sxg1Var2;
        this.c = sxg1Var3;
        this.d = sxg1Var4;
        this.e = sxg1Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyg1)) {
            return false;
        }
        gyg1 gyg1Var = (gyg1) obj;
        return this.a.equals(gyg1Var.a) && this.b.equals(gyg1Var.b) && this.c.equals(gyg1Var.c) && this.d.equals(gyg1Var.d) && u890.j(this.e, gyg1Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        sxg1 sxg1Var = this.e;
        return iHashCode + (sxg1Var == null ? 0 : sxg1Var.hashCode());
    }
}
