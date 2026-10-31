package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xic1 implements ajc1 {
    public final Throwable a;

    public xic1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xic1) && this.a.equals(((xic1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
