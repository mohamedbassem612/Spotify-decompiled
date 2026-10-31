package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u401 implements f501 {
    public final Throwable a;

    public u401(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u401) && this.a.equals(((u401) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
