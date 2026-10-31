package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kdw extends z0o1 {
    public final tv80 c;

    public kdw(tv80 tv80Var) {
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kdw) && u890.j(this.c, ((kdw) obj).c);
    }

    public final int hashCode() {
        tv80 tv80Var = this.c;
        if (tv80Var == null) {
            return 0;
        }
        return tv80Var.hashCode();
    }
}
