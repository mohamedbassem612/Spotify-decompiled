package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uab0 implements o960 {
    public final String a;

    public uab0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uab0) && this.a.equals(((uab0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
