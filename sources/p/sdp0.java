package p;

import com.spotify.wrapped.v1.proto.Paragraph;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sdp0 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final gqb f;
    public final Paragraph g;

    public sdp0(String str, String str2, long j, long j2, long j3, gqb gqbVar, Paragraph paragraph) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = gqbVar;
        this.g = paragraph;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdp0)) {
            return false;
        }
        sdp0 sdp0Var = (sdp0) obj;
        if (!this.a.equals(sdp0Var.a) || !this.b.equals(sdp0Var.b) || this.c != sdp0Var.c) {
            return false;
        }
        long j = sdp0Var.d;
        int i = u7h.l;
        return z4h1.b(this.d, j) && z4h1.b(this.e, sdp0Var.e) && u890.j(this.f, sdp0Var.f) && u890.j(this.g, sdp0Var.g);
    }

    public final int hashCode() {
        int iF = cy30.f(cy30.d(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        int i = u7h.l;
        int iF2 = cy30.f(cy30.f(iF, this.d, 31), this.e, 31);
        gqb gqbVar = this.f;
        int iHashCode = (iF2 + (gqbVar == null ? 0 : gqbVar.hashCode())) * 31;
        Paragraph paragraph = this.g;
        return iHashCode + (paragraph != null ? paragraph.hashCode() : 0);
    }
}
