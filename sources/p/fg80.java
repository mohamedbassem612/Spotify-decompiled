package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fg80 implements og80 {
    public final at80 a;
    public final md80 b;

    public fg80(at80 at80Var, md80 md80Var) {
        this.a = at80Var;
        this.b = md80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg80)) {
            return false;
        }
        fg80 fg80Var = (fg80) obj;
        return this.a == fg80Var.a && this.b == fg80Var.b;
    }

    public final int hashCode() {
        return l1d.C(4) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
