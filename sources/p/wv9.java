package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wv9 implements dw9 {
    public final String a;

    public wv9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wv9) && this.a.equals(((wv9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
