package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class abm1 {
    public final kby a;

    public abm1(kby kbyVar) {
        this.a = kbyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abm1) && u890.j(this.a, ((abm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
