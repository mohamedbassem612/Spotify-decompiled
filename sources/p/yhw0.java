package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yhw0 extends thw0 {
    public final int a;
    public final on71 b;

    public yhw0(int i, on71 on71Var) {
        this.a = i;
        this.b = on71Var;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhw0)) {
            return false;
        }
        yhw0 yhw0Var = (yhw0) obj;
        return this.a == yhw0Var.a && this.b.equals(yhw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
