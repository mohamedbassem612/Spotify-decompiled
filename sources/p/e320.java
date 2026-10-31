package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e320 implements f320 {
    public final r0c0 a;

    public e320(r0c0 r0c0Var) {
        this.a = r0c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e320) && this.a == ((e320) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
