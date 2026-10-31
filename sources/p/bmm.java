package p;

import com.spotify.common.uri.SpotifyUriParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bmm {
    public final y6b1 a;

    public bmm(String str) {
        y6b1 y6b1Var;
        if (str == null || str.length() == 0) {
            y6b1Var = null;
        } else {
            try {
                y6b1Var = new y6b1(str, false);
            } catch (SpotifyUriParserException unused) {
                y6b1Var = null;
            }
        }
        this.a = y6b1Var;
    }

    public final boolean equals(Object obj) {
        y6b1 y6b1Var;
        y6b1 y6b1Var2;
        if (!(obj instanceof bmm) || (y6b1Var = this.a) == null || (y6b1Var2 = ((bmm) obj).a) == null) {
            return false;
        }
        if (y6b1Var.j(y6b1Var2)) {
            return true;
        }
        return sto1.m(y6b1Var.toString()) && sto1.m(y6b1Var2.toString());
    }

    public final int hashCode() {
        y6b1 y6b1Var = this.a;
        if (y6b1Var == null) {
            return 1;
        }
        v6b1 v6b1Var = y6b1Var.c;
        if (v6b1Var != v6b1.N0 && v6b1Var != v6b1.O0) {
            return y6b1Var.hashCode();
        }
        String str = y6b1Var.e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        y6b1 y6b1Var = this.a;
        String string = y6b1Var != null ? y6b1Var.toString() : null;
        return (string == null || string.length() == 0) ? "<empty>" : string;
    }
}
