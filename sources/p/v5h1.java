package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class v5h1 extends k1o1 {
    public final int b;
    public final z0i c;

    public v5h1(int i, z0i z0iVar) {
        this.b = i;
        this.c = z0iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5h1)) {
            return false;
        }
        v5h1 v5h1Var = (v5h1) obj;
        return this.b == v5h1Var.b && u890.j(this.c, v5h1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }
}
