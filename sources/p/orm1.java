package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class orm1 {
    public final pr61 a;
    public final pr61 b;
    public final pr61 c;

    public orm1(pr61 pr61Var, pr61 pr61Var2, pr61 pr61Var3) {
        this.a = pr61Var;
        this.b = pr61Var2;
        this.c = pr61Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orm1)) {
            return false;
        }
        orm1 orm1Var = (orm1) obj;
        return this.a.equals(orm1Var.a) && this.b.equals(orm1Var.b) && this.c.equals(orm1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
