package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jqt0 {
    public final String a;

    public jqt0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqt0) && this.a.equals(((jqt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
