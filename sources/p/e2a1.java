package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e2a1 implements m2a1 {
    public final sea0 a;

    public e2a1(sea0 sea0Var) {
        this.a = sea0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2a1) && this.a.equals(((e2a1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
