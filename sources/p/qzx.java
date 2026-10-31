package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qzx extends i1k0 {
    public final String e;
    public final String f;

    public qzx(String str) {
        this.e = str;
        this.f = "spotify:lex-experiments:".concat(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzx) && this.e.equals(((qzx) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // p.i1k0
    public final String p() {
        return this.f;
    }
}
