package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y7w0 implements a8w0 {
    public final t7w0 a;

    public y7w0(t7w0 t7w0Var) {
        this.a = t7w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7w0) && u890.j(this.a, ((y7w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
