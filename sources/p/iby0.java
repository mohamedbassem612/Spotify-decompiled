package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iby0 {
    public final int a;
    public final z771 b;
    public final wa71 c;

    public iby0(int i, z771 z771Var, wa71 wa71Var) {
        this.a = i;
        this.b = z771Var;
        this.c = wa71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iby0)) {
            return false;
        }
        iby0 iby0Var = (iby0) obj;
        return this.a == iby0Var.a && u890.j(this.b, iby0Var.b) && u890.j(this.c, iby0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xvj1.j(this.b.a, l1d.C(this.a) * 31, 31);
    }
}
