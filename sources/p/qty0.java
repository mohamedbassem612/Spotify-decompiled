package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qty0 extends xty0 {
    public final tb0 a;

    public qty0(tb0 tb0Var) {
        this.a = tb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qty0) && this.a.equals(((qty0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
