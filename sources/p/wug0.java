package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wug0 {
    public final String a;

    public wug0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wug0) && u890.j(this.a, ((wug0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
