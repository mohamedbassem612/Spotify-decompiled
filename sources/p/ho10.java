package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ho10 implements jo10 {
    public final Throwable a;

    public ho10(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ho10) && u890.j(this.a, ((ho10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
