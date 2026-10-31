package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wiy {
    public final String a;

    public wiy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wiy) && u890.j(this.a, ((wiy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
