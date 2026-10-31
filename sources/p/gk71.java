package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gk71 extends jk71 {
    public final int a;
    public final rn71 b;

    public gk71(int i, rn71 rn71Var) {
        this.a = i;
        this.b = rn71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk71)) {
            return false;
        }
        gk71 gk71Var = (gk71) obj;
        return this.a == gk71Var.a && this.b.equals(gk71Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
