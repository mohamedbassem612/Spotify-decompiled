package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e900 implements h900 {
    public final Throwable a;

    public e900(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e900) && this.a.equals(((e900) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
