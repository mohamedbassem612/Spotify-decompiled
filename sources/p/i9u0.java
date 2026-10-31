package p;

import com.spotify.player.model.command.SeekToCommand;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i9u0 extends q9u0 {
    public final long a;

    public i9u0(long j) {
        this.a = j;
    }

    @Override // p.q9u0
    public final Object a(ogr ogrVar, ouz ouzVar, dqu dquVar, laz lazVar, fey feyVar, lmw lmwVar, puz puzVar, quz quzVar, mjv mjvVar, qmr qmrVar, rmr rmrVar, efr efrVar, tzo tzoVar) {
        return qmrVar.apply(this);
    }

    @Override // p.q9u0
    public final void b(yqb1 yqb1Var, o2b1 o2b1Var, zqb1 zqb1Var, utw0 utw0Var, yqb1 yqb1Var2, vr51 vr51Var, dn81 dn81Var, q881 q881Var, zqb1 zqb1Var2, wqb1 wqb1Var, xqb1 xqb1Var, y281 y281Var) {
        grb1 grb1Var = wqb1Var.a.b;
        grb1Var.b.b(this.a, SeekToCommand.Relative.BEGINNING);
        grb1Var.g(grb1Var.i, 1, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof i9u0) && ((i9u0) obj).a == this.a;
    }

    public final int hashCode() {
        return Long.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return "SeekTo{ms=" + this.a + '}';
    }
}
