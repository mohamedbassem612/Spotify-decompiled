package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wz30 extends d040 {
    public final String a;

    public wz30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wz30) && u890.j(this.a, ((wz30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
