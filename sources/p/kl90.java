package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kl90 implements pyl {
    public final q0g0 a;

    public kl90(q0g0 q0g0Var) {
        this.a = q0g0Var;
    }

    public final y3h1 b(y3h1 y3h1Var, int i) {
        return (y3h1) this.a.invoke(y3h1Var, Integer.valueOf(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kl90) && this.a == ((kl90) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
