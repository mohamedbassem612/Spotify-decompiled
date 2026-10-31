package p;

import com.spotify.betamax.transcoder.BetamaxTranscoderException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w7g1 {
    public final int a;
    public final String b;
    public final int c;
    public final BetamaxTranscoderException d;

    public w7g1(int i, String str, int i2, BetamaxTranscoderException betamaxTranscoderException) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = betamaxTranscoderException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w7g1) {
            w7g1 w7g1Var = (w7g1) obj;
            return this.a == w7g1Var.a && u890.j(this.b, w7g1Var.b) && this.c == w7g1Var.c && this.d == w7g1Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ab80.k(this.c, cy30.d(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }
}
