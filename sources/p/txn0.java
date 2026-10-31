package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class txn0 implements uxn0 {
    public final gax a;

    public txn0(gax gaxVar) {
        this.a = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof txn0) && this.a.equals(((txn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
