package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l941 extends p941 {
    public final o0b0 a;

    public l941(o0b0 o0b0Var) {
        this.a = o0b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l941) && this.a.equals(((l941) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
