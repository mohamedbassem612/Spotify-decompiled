package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fp41 implements nr70 {
    public final nr70 a;
    public final Object b = new Object();
    public boolean c;

    public fp41(nr70 nr70Var) {
        this.a = nr70Var;
    }

    public final void a() {
        rih1 rih1Var;
        synchronized (this.b) {
            try {
                if (this.c) {
                    nr70 nr70Var = this.a;
                    if (nr70Var != null) {
                        nr70Var.clear();
                        rih1Var = rih1.a;
                    } else {
                        rih1Var = null;
                    }
                    if (rih1Var == null) {
                        j2h1.p("ScreenFlashWrapper");
                    }
                } else {
                    j2h1.M("ScreenFlashWrapper");
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
        }
    }

    @Override // p.nr70
    public final void clear() {
        a();
    }
}
