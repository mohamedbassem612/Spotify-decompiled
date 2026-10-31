package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wli0 implements xli0 {
    public final String a;

    public wli0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wli0) && u890.j(this.a, ((wli0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
