package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b0w0 extends cxm {
    public final tv80 d;

    public b0w0(tv80 tv80Var) {
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0w0) && u890.j(this.d, ((b0w0) obj).d);
    }

    public final int hashCode() {
        tv80 tv80Var = this.d;
        if (tv80Var == null) {
            return 0;
        }
        return tv80Var.hashCode();
    }
}
