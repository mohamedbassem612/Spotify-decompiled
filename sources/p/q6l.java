package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q6l implements r6l {
    public final hux a;

    public q6l(hux huxVar) {
        this.a = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6l) && u890.j(this.a, ((q6l) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
