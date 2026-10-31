package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class acm implements bcm {
    public final hux a;

    public acm(hux huxVar) {
        this.a = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acm) && this.a.equals(((acm) obj).a);
    }

    public final int hashCode() {
        return l1d.C(2) + (this.a.hashCode() * 31);
    }
}
