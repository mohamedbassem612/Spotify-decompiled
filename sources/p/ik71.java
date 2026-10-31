package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ik71 extends jk71 {
    public final int a;
    public final rn71 b;

    public ik71(int i, rn71 rn71Var) {
        this.a = i;
        this.b = rn71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik71)) {
            return false;
        }
        ik71 ik71Var = (ik71) obj;
        return this.a == ik71Var.a && this.b.equals(ik71Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
