package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tuj1 implements wuj1 {
    public final Throwable a;

    public tuj1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tuj1) && this.a.equals(((tuj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
