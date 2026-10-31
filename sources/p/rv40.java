package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rv40 extends ten0 {
    @Override // p.ten0
    public final ten0 C(iu30 iu30Var, iu30 iu30Var2) {
        return (ten0) ((jv91) pv91.b(new dqc(new da(iu30Var, iu30Var2, (byte) 23), (byte) 5)));
    }

    @Override // p.ten0, p.jv91
    public final void c() {
        synchronized (pv91.c) {
            o();
        }
    }

    @Override // p.ten0, p.jv91
    public final void k() {
        oho1.z();
        throw null;
    }

    @Override // p.ten0, p.jv91
    public final void l() {
        oho1.z();
        throw null;
    }

    @Override // p.ten0, p.jv91
    public final void m() {
        pv91.c();
    }

    @Override // p.ten0, p.jv91
    public final jv91 u(iu30 iu30Var) {
        return (we01) ((jv91) pv91.b(new dqc(new qv40(iu30Var, (byte) 0), (byte) 5)));
    }

    @Override // p.ten0
    public final nln w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
