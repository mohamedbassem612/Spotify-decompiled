package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class z5t extends qx81 {
    public abstract qx81 C0();

    @Override // p.gmh1
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public qx81 y0(g8b0 g8b0Var) {
        return E0(C0());
    }

    @Override // p.a8b0
    public final zpi0 E() {
        return C0().E();
    }

    public z5t E0(qx81 qx81Var) {
        return new zgo0(qx81Var);
    }

    @Override // p.a8b0
    public final List r0() {
        return C0().r0();
    }

    @Override // p.a8b0
    public e0h1 s0() {
        return C0().s0();
    }

    @Override // p.a8b0
    public final h0h1 t0() {
        return C0().t0();
    }

    @Override // p.a8b0
    public boolean u0() {
        return C0().u0();
    }
}
