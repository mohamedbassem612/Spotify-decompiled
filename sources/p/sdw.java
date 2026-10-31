package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sdw {
    public final String a;

    public sdw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdw) && u890.j(this.a, ((sdw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
