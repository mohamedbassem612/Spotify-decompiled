package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xae0 implements bce0 {
    public final Throwable a;

    public xae0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xae0) && this.a.equals(((xae0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
