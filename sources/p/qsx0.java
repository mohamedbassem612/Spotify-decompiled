package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qsx0 extends ktx0 {
    public final tv80 a;

    public qsx0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qsx0) && u890.j(this.a, ((qsx0) obj).a);
    }

    public final int hashCode() {
        tv80 tv80Var = this.a;
        if (tv80Var == null) {
            return 0;
        }
        return tv80Var.hashCode();
    }
}
