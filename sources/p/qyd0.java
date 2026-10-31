package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qyd0 implements azd0 {
    public final Throwable a;

    public qyd0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qyd0) && this.a.equals(((qyd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
