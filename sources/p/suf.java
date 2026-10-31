package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class suf implements uuf {
    public final String a;

    public suf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof suf) && u890.j(this.a, ((suf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
