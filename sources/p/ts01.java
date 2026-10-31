package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ts01 extends vs01 {
    public final Throwable a;

    public ts01(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ts01) && u890.j(this.a, ((ts01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
