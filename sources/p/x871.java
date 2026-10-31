package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x871 {
    public final p371 a;
    public final yn71 b;
    public final z771 c;

    public x871(p371 p371Var, yn71 yn71Var, z771 z771Var) {
        this.a = p371Var;
        this.b = yn71Var;
        this.c = z771Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x871)) {
            return false;
        }
        x871 x871Var = (x871) obj;
        return u890.j(this.a, x871Var.a) && u890.j(this.b, x871Var.b) && u890.j(this.c, x871Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        z771 z771Var = this.c;
        return iHashCode + (z771Var == null ? 0 : z771Var.a.hashCode());
    }
}
