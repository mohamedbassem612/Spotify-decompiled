package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e6x0 extends q6x0 {
    public final Throwable a;

    public e6x0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e6x0) && this.a.equals(((e6x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
