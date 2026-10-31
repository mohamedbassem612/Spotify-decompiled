package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hnd extends ind {
    public final String a;

    public hnd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnd) && this.a.equals(((hnd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
