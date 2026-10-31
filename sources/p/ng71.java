package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ng71 extends tg71 {
    public final Object a;
    public final z771 b;

    public ng71(Object obj, z771 z771Var) {
        this.a = obj;
        this.b = z771Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng71)) {
            return false;
        }
        ng71 ng71Var = (ng71) obj;
        return u890.j(this.a, ng71Var.a) && u890.j(this.b, ng71Var.b);
    }

    public final int hashCode() {
        int iB = e331.b(this.a) * 31;
        z771 z771Var = this.b;
        return iB + (z771Var == null ? 0 : z771Var.a.hashCode());
    }
}
