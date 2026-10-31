package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class itd0 extends rtd0 {
    public final Throwable a;

    public itd0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof itd0) && this.a.equals(((itd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
