package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w2k0 implements k4k0 {
    public final b8w0 a;

    public w2k0(b8w0 b8w0Var) {
        this.a = b8w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2k0) && this.a == ((w2k0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
