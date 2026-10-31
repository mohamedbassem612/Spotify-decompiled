package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r8v0 implements etq0 {
    public final /* synthetic */ gqq a;
    public final /* synthetic */ rfs b;
    public final /* synthetic */ String c;

    public r8v0(gqq gqqVar, rfs rfsVar, String str) {
        this.a = gqqVar;
        this.b = rfsVar;
        this.c = str;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
    }

    public final Observable b() {
        hqq hqqVar = (hqq) this.a.a.c;
        g7h g7hVar = (g7h) hqqVar.a.z0.get();
        c8o.l(g7hVar);
        return (Observable) new r961(this.b, this.c, g7hVar, (f210) hqqVar.J.get()).d;
    }
}
