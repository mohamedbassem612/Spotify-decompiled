package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s941 {
    public final dk3 a;

    public s941(dk3 dk3Var) {
        this.a = dk3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s941) && u890.j(this.a, ((s941) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
