package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w5h1 extends k1o1 {
    public final int b;
    public final z0i c;

    public w5h1(int i, z0i z0iVar) {
        this.b = i;
        this.c = z0iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5h1)) {
            return false;
        }
        w5h1 w5h1Var = (w5h1) obj;
        return this.b == w5h1Var.b && u890.j(this.c, w5h1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }
}
