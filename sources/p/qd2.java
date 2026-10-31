package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qd2 implements sd2 {
    public final gax a;

    public qd2(gax gaxVar) {
        this.a = gaxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd2) && this.a.equals(((qd2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
