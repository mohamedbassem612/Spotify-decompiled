package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lnk implements snk {
    public final String a;

    public lnk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lnk) && this.a.equals(((lnk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
