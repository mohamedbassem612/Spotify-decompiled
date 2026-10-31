package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class py30 implements zfb0 {
    public final zfb0 a;
    public yfu b;

    public py30(zfb0 zfb0Var) {
        this.a = zfb0Var;
    }

    public final Observable a() {
        return this.a.a().map(new dp5(this, (byte) 19));
    }

    public final iy30 b(cxc cxcVar) {
        yfu yfuVar = this.b;
        if (yfuVar != null && cxcVar.equals((cxc) yfuVar.b)) {
            return (iy30) yfuVar.c;
        }
        ne neVar = new ne((byte) 10);
        neVar.a = cxcVar;
        neVar.g("https://spclient.wg.spotify.com/");
        neVar.c(tpq0.c());
        iy30 iy30Var = (iy30) neVar.j().b(iy30.class);
        this.b = new yfu(cxcVar, iy30Var, (byte) 14);
        return iy30Var;
    }

    public final Object getLast() {
        cxc cxcVar = (cxc) this.a.getLast();
        if (cxcVar == null) {
            return null;
        }
        return b(cxcVar);
    }
}
