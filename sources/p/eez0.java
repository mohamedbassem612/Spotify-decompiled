package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class eez0 {
    public final hux a;

    public eez0(hux huxVar) {
        this.a = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eez0) && u890.j(this.a, ((eez0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
