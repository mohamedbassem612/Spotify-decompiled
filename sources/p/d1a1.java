package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d1a1 extends q1a1 {
    public final sea0 a;

    public d1a1(sea0 sea0Var) {
        this.a = sea0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1a1) && this.a.equals(((d1a1) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
