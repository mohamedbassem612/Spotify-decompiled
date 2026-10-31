package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o1m1 implements r1m1 {
    public final li20 a;

    public o1m1(li20 li20Var) {
        this.a = li20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1m1) && this.a == ((o1m1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
