package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class clh implements hlh {
    public final pkh a;

    public clh(pkh pkhVar) {
        this.a = pkhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof clh) && this.a.equals(((clh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
