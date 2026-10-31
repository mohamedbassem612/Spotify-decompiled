package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jfn0 implements lfn0 {
    public final String a;

    public jfn0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfn0) && this.a.equals(((jfn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
