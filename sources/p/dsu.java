package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dsu {
    public final String a;

    public dsu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsu) && this.a.equals(((dsu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
