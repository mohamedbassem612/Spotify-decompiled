package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tu81 implements vu81 {
    public final Throwable a;

    public tu81(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tu81) && u890.j(this.a, ((tu81) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
