package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jel implements qel {
    public final String a;

    public jel(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jel) && this.a.equals(((jel) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
