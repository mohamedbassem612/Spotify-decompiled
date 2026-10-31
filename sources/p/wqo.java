package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wqo {
    public final String a;

    public wqo(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqo) && this.a.equals(((wqo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
