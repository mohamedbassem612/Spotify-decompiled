package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ite0 implements kte0 {
    public final p480 a;

    public ite0(p480 p480Var) {
        this.a = p480Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ite0) && this.a.equals(((ite0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
