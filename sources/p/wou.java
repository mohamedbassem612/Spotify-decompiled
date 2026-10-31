package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wou {
    public final String a;

    public wou(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wou) && u890.j(this.a, ((wou) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
