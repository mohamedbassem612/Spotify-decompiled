package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rtj1 implements cuj1 {
    public final Throwable a;

    public rtj1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rtj1) && this.a.equals(((rtj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
