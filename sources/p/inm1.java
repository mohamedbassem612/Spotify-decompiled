package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class inm1 implements pnm1 {
    public final Throwable a;

    public inm1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inm1) && u890.j(this.a, ((inm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
