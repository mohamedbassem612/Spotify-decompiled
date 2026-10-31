package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jf71 {
    public final String a;

    public jf71(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jf71) && u890.j(this.a, ((jf71) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return u6t.Y0.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
