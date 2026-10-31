package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wke1 {
    public final String a;

    public wke1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wke1) && this.a.equals(((wke1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
