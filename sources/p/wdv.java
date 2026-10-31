package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wdv {
    public final String a;

    public wdv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdv) && u890.j(this.a, ((wdv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
