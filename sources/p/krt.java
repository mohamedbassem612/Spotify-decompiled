package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class krt implements lrt {
    public final Throwable a;

    public krt(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof krt) && this.a.equals(((krt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
