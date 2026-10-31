package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wh21 {
    public final String a;

    public wh21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh21) && u890.j(this.a, ((wh21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
