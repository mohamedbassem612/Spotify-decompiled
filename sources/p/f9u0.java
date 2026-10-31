package p;

import com.spotify.player.model.command.PlayAsNextInQueueCommand;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f9u0 extends q9u0 {
    public final PlayAsNextInQueueCommand a;

    public f9u0(PlayAsNextInQueueCommand playAsNextInQueueCommand) {
        playAsNextInQueueCommand.getClass();
        this.a = playAsNextInQueueCommand;
    }

    @Override // p.q9u0
    public final Object a(ogr ogrVar, ouz ouzVar, dqu dquVar, laz lazVar, fey feyVar, lmw lmwVar, puz puzVar, quz quzVar, mjv mjvVar, qmr qmrVar, rmr rmrVar, efr efrVar, tzo tzoVar) {
        return feyVar.apply(this);
    }

    @Override // p.q9u0
    public final void b(yqb1 yqb1Var, o2b1 o2b1Var, zqb1 zqb1Var, utw0 utw0Var, yqb1 yqb1Var2, vr51 vr51Var, dn81 dn81Var, q881 q881Var, zqb1 zqb1Var2, wqb1 wqb1Var, xqb1 xqb1Var, y281 y281Var) {
        yqb1Var2.a(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f9u0) {
            return ((f9u0) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlayAsNextInQueue{command=" + this.a + '}';
    }
}
