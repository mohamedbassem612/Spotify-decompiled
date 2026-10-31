package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dwj0 implements mwj0 {
    public final saj0 a;
    public final tv80 b;

    public dwj0(saj0 saj0Var, tv80 tv80Var) {
        this.a = saj0Var;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwj0)) {
            return false;
        }
        dwj0 dwj0Var = (dwj0) obj;
        return this.a == dwj0Var.a && this.b.equals(dwj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
