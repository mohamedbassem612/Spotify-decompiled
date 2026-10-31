package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qah0 implements h0r0 {
    public final yuj a;
    public final m9h0 b;
    public final kah0 c;
    public final p410 d;
    public final ov20 e;
    public final sah0 f;
    public final cbr0 g;

    public qah0(yuj yujVar, m9h0 m9h0Var, kah0 kah0Var, p410 p410Var, ov20 ov20Var, sah0 sah0Var) {
        this.a = yujVar;
        this.b = m9h0Var;
        this.c = kah0Var;
        this.d = p410Var;
        this.e = ov20Var;
        this.f = sah0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.g = new cbr0(new dbr0[]{new bn70(yon1.G1("LIBRARY_IMPORT_MATCH_REVIEW", "library-import/match-review", 908, "library-import"), new lik1("spotify:library-import:review"), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.g;
    }

    public final p2r0 b() {
        o6e0 o6e0Var = new o6e0(new oxa0(this, null, (byte) 13), f46.I(new p6e0[]{new p6e0()}));
        n7e0 n7e0Var = new n7e0(new nah0(this), new mbf0(this, (byte) 26), bk20.Z, oah0.a);
        return yuj.b(this.a, o6e0Var, new j2i(-903143824, new pah0(this, (byte) 0), true), n7e0Var);
    }
}
