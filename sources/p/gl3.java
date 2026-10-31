package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gl3 {
    public final tv80 a;

    public gl3(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gl3) && u890.j(this.a, ((gl3) obj).a);
    }

    public final int hashCode() {
        tv80 tv80Var = this.a;
        if (tv80Var == null) {
            return 0;
        }
        return tv80Var.hashCode();
    }
}
