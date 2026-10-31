package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rzx extends i1k0 {
    public final String e;
    public final String f;

    public rzx(String str) {
        this.e = str;
        this.f = "spotify:lexicon:".concat(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzx) && this.e.equals(((rzx) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // p.i1k0
    public final String p() {
        return this.f;
    }
}
