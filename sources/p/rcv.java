package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rcv implements vcv {
    public final xcv a;

    public rcv(xcv xcvVar) {
        this.a = xcvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rcv) && this.a.equals(((rcv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
