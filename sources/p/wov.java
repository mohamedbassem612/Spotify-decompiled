package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wov implements yov {
    public final String a;

    public wov(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wov) && this.a.equals(((wov) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
