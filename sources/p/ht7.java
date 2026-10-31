package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ht7 extends jt7 {
    public final e7i0 a;

    public ht7(e7i0 e7i0Var) {
        this.a = e7i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht7) && this.a.equals(((ht7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
