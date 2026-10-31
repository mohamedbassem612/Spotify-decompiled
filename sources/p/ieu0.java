package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ieu0 extends leu0 {
    public final Throwable a;

    public ieu0(Throwable th) {
        this.a = th;
    }

    public final Throwable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ieu0) && this.a.equals(((ieu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
