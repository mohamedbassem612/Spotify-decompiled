package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yn7 implements ao7 {
    public final Throwable a;

    public yn7(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yn7) && u890.j(this.a, ((yn7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
