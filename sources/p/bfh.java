package p;

import com.spotify.userinteractivityservice.usercomments.v1.proto.GetCommentCardResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bfh {
    public final String a;
    public final GetCommentCardResponse b;
    public final lik1 c;
    public final int d;
    public final uwe1 e;

    public bfh(String str, GetCommentCardResponse getCommentCardResponse, lik1 lik1Var, int i, uwe1 uwe1Var) {
        this.a = str;
        this.b = getCommentCardResponse;
        this.c = lik1Var;
        this.d = i;
        this.e = uwe1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfh)) {
            return false;
        }
        bfh bfhVar = (bfh) obj;
        return this.a.equals(bfhVar.a) && this.b.equals(bfhVar.b) && this.c.equals(bfhVar.c) && this.d == bfhVar.d && this.e.equals(bfhVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a), 31);
    }
}
