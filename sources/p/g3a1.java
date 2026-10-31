package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g3a1 implements h3a1 {
    public final ga61 a;

    public g3a1(ga61 ga61Var) {
        this.a = ga61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3a1) && this.a.equals(((g3a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
