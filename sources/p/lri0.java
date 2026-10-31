package p;

import com.spotify.podcast.access.proto.OfferExplanation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lri0 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final OfferExplanation e;

    public lri0(String str, String str2, int i, String str3, OfferExplanation offerExplanation) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = offerExplanation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lri0)) {
            return false;
        }
        lri0 lri0Var = (lri0) obj;
        return u890.j(this.a, lri0Var.a) && u890.j(this.b, lri0Var.b) && this.c == lri0Var.c && u890.j(this.d, lri0Var.d) && u890.j(this.e, lri0Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        OfferExplanation offerExplanation = this.e;
        return iD + (offerExplanation == null ? 0 : offerExplanation.hashCode());
    }

    public /* synthetic */ lri0() {
        this("", "", 0, "", null);
    }
}
