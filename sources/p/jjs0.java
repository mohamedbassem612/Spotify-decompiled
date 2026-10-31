package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jjs0 implements nbj1 {
    public final int a;

    public jjs0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjs0) && this.a == ((jjs0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
