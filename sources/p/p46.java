package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p46 implements t46 {
    public final Throwable a;

    public p46(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p46) && this.a.equals(((p46) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
