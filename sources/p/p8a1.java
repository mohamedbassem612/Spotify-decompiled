package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p8a1 {
    public final f7a1 a;

    public p8a1(f7a1 f7a1Var) {
        this.a = f7a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8a1) && u890.j(this.a, ((p8a1) obj).a);
    }

    public final int hashCode() {
        f7a1 f7a1Var = this.a;
        if (f7a1Var == null) {
            return 0;
        }
        return f7a1Var.a.hashCode();
    }
}
