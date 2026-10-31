package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class khf extends jto1 {
    public final String b;

    public khf(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khf) && u890.j(this.b, ((khf) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
