package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fvw0 extends gvw0 {
    public final Throwable a;

    public fvw0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fvw0) && u890.j(this.a, ((fvw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
