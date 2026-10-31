package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class arw0 implements brw0 {
    public final ces0 a;

    public arw0(ces0 ces0Var) {
        this.a = ces0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof arw0) && this.a.equals(((arw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
