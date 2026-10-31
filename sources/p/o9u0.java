package p;

import com.spotify.player.model.command.SkipToPrevTrackCommand;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o9u0 extends q9u0 {
    public final SkipToPrevTrackCommand a;

    public o9u0(SkipToPrevTrackCommand skipToPrevTrackCommand) {
        skipToPrevTrackCommand.getClass();
        this.a = skipToPrevTrackCommand;
    }

    @Override // p.q9u0
    public final Object a(ogr ogrVar, ouz ouzVar, dqu dquVar, laz lazVar, fey feyVar, lmw lmwVar, puz puzVar, quz quzVar, mjv mjvVar, qmr qmrVar, rmr rmrVar, efr efrVar, tzo tzoVar) {
        return mjvVar.apply(this);
    }

    @Override // p.q9u0
    public final void b(yqb1 yqb1Var, o2b1 o2b1Var, zqb1 zqb1Var, utw0 utw0Var, yqb1 yqb1Var2, vr51 vr51Var, dn81 dn81Var, q881 q881Var, zqb1 zqb1Var2, wqb1 wqb1Var, xqb1 xqb1Var, y281 y281Var) {
        zqb1Var2.a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o9u0) {
            return ((o9u0) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final SkipToPrevTrackCommand n() {
        return this.a;
    }

    public final String toString() {
        return "SkipToPrevTrackWithCommand{command=" + this.a + '}';
    }
}
