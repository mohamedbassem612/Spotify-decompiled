package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gcd implements jcd {
    public final th61 a;

    public gcd(th61 th61Var) {
        this.a = th61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gcd) && this.a.equals(((gcd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
