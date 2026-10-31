package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bvd implements dvd {
    public final String a;
    public final j2i b;

    public bvd(String str, j2i j2iVar) {
        this.a = str;
        this.b = j2iVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bvd) && ((bvd) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
