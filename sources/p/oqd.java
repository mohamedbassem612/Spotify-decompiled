package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oqd extends pqd {
    public final String a;

    public oqd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oqd) && this.a.equals(((oqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
