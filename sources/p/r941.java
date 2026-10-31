package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r941 {
    public final dk3 a;

    public r941(dk3 dk3Var) {
        this.a = dk3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r941) && u890.j(this.a, ((r941) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
