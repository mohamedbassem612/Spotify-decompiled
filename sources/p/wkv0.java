package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wkv0 implements clv0 {
    public final String a;

    public wkv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkv0) && u890.j(this.a, ((wkv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
