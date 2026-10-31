package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class b6g1 implements d6g1 {
    public final kko a;

    public b6g1(kko kkoVar) {
        this.a = kkoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6g1) && u890.j(this.a, ((b6g1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
