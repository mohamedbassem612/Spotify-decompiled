package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e5k1 extends m5k1 {
    public final e7i0 a;

    public e5k1(e7i0 e7i0Var) {
        this.a = e7i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5k1) && this.a.equals(((e5k1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
