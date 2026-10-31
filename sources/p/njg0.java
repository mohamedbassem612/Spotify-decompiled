package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class njg0 extends yjg0 {
    public final tb0 a;

    public njg0(tb0 tb0Var) {
        this.a = tb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njg0) && this.a.equals(((njg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
