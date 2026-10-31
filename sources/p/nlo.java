package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nlo implements mko, hs80 {
    public final gjo a;
    public final glo b = new glo(this, (byte) 1);

    public nlo(qlw qlwVar, String str) {
        this.a = new gjo(qlwVar.a((String) null, new m95(str, (lnm) null, (byte) 1)), "Home Collection State Machine");
    }

    public final void a(Set set) {
        this.a.b(set);
    }

    public final kko b() {
        return this.b;
    }

    @Override // p.hs80
    public final r4u d(chm0 chm0Var) {
        return r4u.d(new hlo(chm0Var, (byte) 0), r4u.a(new l2a(this, (byte) 25)));
    }

    @Override // p.hs80
    public final void dispose() {
        this.a.a();
    }

    @Override // p.hs80
    public final void start() {
        this.a.c();
    }

    public final void stop() {
    }
}
