package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bl50 implements dl50 {
    public final Throwable a;

    public bl50(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl50) && u890.j(this.a, ((bl50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
