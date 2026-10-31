package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class clw0 implements elw0 {
    public final kbb a;

    public clw0(kbb kbbVar) {
        this.a = kbbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clw0) && this.a.equals(((clw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
