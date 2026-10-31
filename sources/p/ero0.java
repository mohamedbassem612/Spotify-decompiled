package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ero0 implements kro0 {
    public final Throwable a;

    public ero0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ero0) && this.a.equals(((ero0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
