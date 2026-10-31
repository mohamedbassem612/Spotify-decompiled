package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jey0 {
    public final i7e0 a;

    public jey0(i7e0 i7e0Var) {
        this.a = i7e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jey0) && this.a.equals(((jey0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
