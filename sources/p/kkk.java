package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kkk {
    public final xik a;

    public kkk(xik xikVar) {
        this.a = xikVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkk) && this.a.equals(((kkk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
