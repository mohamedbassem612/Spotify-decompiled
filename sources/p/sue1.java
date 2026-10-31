package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sue1 implements tue1 {
    public final hux a;

    public sue1(hux huxVar) {
        this.a = huxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sue1) && u890.j(this.a, ((sue1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
