package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xk61 implements al61 {
    public final Exception a;

    public xk61(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xk61) && this.a.equals(((xk61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
