package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jkj1 extends lkj1 {
    public final String a;

    public jkj1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jkj1) && this.a.equals(((jkj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
