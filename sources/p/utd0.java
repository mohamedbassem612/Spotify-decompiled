package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class utd0 extends gud0 {
    public final Throwable a;

    public utd0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof utd0) && this.a.equals(((utd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
