package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bsu {
    public final String a;

    public bsu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bsu) && u890.j(this.a, ((bsu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
