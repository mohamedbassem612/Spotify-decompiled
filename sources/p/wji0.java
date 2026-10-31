package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wji0 {
    public final String a;

    public wji0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wji0) && u890.j(this.a, ((wji0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
