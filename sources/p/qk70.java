package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qk70 {
    public final hux a;

    public qk70(hux huxVar) {
        this.a = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qk70) && u890.j(this.a, ((qk70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
