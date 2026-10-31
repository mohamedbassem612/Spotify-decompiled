package p;

import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class su00 {
    public final PlayerState a;
    public final odn b;
    public final g5v0 c;
    public final String d;
    public final String e;
    public final String f;

    public su00(PlayerState playerState, odn odnVar, g5v0 g5v0Var, String str, String str2, String str3) {
        this.a = playerState;
        this.b = odnVar;
        this.c = g5v0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su00)) {
            return false;
        }
        su00 su00Var = (su00) obj;
        return this.a.equals(su00Var.a) && this.b.equals(su00Var.b) && u890.j(this.c, su00Var.c) && u890.j(this.d, su00Var.d) && this.e.equals(su00Var.e) && this.f.equals(su00Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31;
        g5v0 g5v0Var = this.c;
        int iHashCode2 = (iHashCode + (g5v0Var == null ? 0 : g5v0Var.hashCode())) * 31;
        String str = this.d;
        return this.f.hashCode() + cy30.d((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.e);
    }
}
