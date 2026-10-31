package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nbd1 implements obd1 {
    public final gax a;

    public nbd1(gax gaxVar) {
        this.a = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbd1) && this.a.equals(((nbd1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
