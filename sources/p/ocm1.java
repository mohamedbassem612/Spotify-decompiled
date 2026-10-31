package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ocm1 extends qcm1 {
    public final Throwable a;

    public ocm1(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ocm1) && u890.j(this.a, ((ocm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
