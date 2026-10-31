package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class py01 extends ry01 {
    public final Throwable a;

    public py01(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof py01) && this.a.equals(((py01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
