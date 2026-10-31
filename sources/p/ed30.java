package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ed30 implements dwo {
    public final y2g0 a;
    public final fd30 b;
    public volatile boolean c;

    public ed30(qrt qrtVar, t2j0 t2j0Var, vfb0 vfb0Var, yqg yqgVar, md4 md4Var, y2g0 y2g0Var) {
        fd30 fd30Var;
        this.a = y2g0Var;
        if (fap1.h(md4Var.a().a) != null) {
            fd30Var = new fd30(qrtVar, t2j0Var, vfb0Var, yqgVar, new cc00(md4Var, (byte) 11));
            y2g0Var.a(new hs20(this, fd30Var, (byte) 2));
        } else {
            fd30Var = null;
        }
        this.b = fd30Var;
    }

    public final void shutdown() {
        this.c = true;
        fd30 fd30Var = this.b;
        if (fd30Var != null) {
            this.a.b("removeLocationRefreshObserver", new f710(fd30Var, (byte) 14));
        }
    }
}
