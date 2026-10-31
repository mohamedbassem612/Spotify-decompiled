package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mb10 extends cto1 {
    public final String b;

    public mb10(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb10) && u890.j(this.b, ((mb10) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String p() {
        return this.b;
    }
}
