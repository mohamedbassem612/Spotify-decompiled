package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yjl1 {
    public final Throwable a;

    public yjl1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yjl1) && this.a.equals(((yjl1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
