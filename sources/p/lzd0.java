package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lzd0 implements qzd0 {
    public final String a;

    public lzd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lzd0) && this.a.equals(((lzd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
