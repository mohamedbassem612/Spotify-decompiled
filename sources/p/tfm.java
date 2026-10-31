package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tfm extends rzn1 {
    public final wfm f;
    public final wfm g;

    public tfm(wfm wfmVar, wfm wfmVar2) {
        this.f = wfmVar;
        this.g = wfmVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfm)) {
            return false;
        }
        tfm tfmVar = (tfm) obj;
        return this.f.equals(tfmVar.f) && this.g.equals(tfmVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + (this.f.hashCode() * 31);
    }
}
