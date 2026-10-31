package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zen1 extends v311 {
    public final u311 a;

    public zen1(u311 u311Var) {
        this.a = u311Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v311)) {
            return false;
        }
        return this.a.equals(((zen1) ((v311) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return f4i1.f("RecordingInfo{status=", this.a.toString(), "}");
    }
}
