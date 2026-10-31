package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class csu {
    public final String a;

    public csu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csu) && this.a.equals(((csu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
