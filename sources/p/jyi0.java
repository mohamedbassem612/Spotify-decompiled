package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jyi0 implements lyi0 {
    public final String a;

    public jyi0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyi0) && u890.j(this.a, ((jyi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
