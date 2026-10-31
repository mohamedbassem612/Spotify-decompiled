package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pts0 implements tts0 {
    public final String a;
    public final long b;

    public pts0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pts0)) {
            return false;
        }
        pts0 pts0Var = (pts0) obj;
        return this.a.equals(pts0Var.a) && this.b == pts0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
