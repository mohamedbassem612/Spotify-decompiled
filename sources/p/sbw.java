package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sbw {
    public final String a;

    public sbw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sbw) && this.a.equals(((sbw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
