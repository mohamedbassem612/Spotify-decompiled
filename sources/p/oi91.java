package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oi91 extends mod {
    public final tv80 e;

    public oi91(tv80 tv80Var) {
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi91) && u890.j(this.e, ((oi91) obj).e);
    }

    public final int hashCode() {
        tv80 tv80Var = this.e;
        if (tv80Var == null) {
            return 0;
        }
        return tv80Var.hashCode();
    }
}
