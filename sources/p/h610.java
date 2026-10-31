package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h610 {
    public final g0l a;
    public final zor b;

    public h610(g0l g0lVar, zor zorVar) {
        this.a = g0lVar;
        this.b = zorVar;
    }

    public final Observable a() {
        return this.a.d().map(new n9v((byte) 15)).distinctUntilChanged();
    }

    public final void b(String str) {
        l0l l0lVarC = this.a.c();
        if (l0lVarC == null || l0lVarC.l()) {
            return;
        }
        l7l l7lVar = l7l.a;
        zor zorVar = this.b;
        zorVar.g(l7lVar);
        c921.y(zorVar.h, (o8n) null, 0, new clo(zorVar, str, (lnm) null, (byte) 15), 3);
    }
}
