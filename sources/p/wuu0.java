package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wuu0 extends xuu0 {
    public final String a;

    public wuu0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wuu0) && u890.j(this.a, ((wuu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
