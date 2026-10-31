package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class axu {
    public final Throwable a;

    public axu(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof axu) && this.a.equals(((axu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
