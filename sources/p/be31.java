package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class be31 implements yw0 {
    public boolean a;
    public final /* synthetic */ pg5 b;
    public final /* synthetic */ ynb0 c;

    public be31(pg5 pg5Var, ynb0 ynb0Var) {
        this.b = pg5Var;
        this.c = ynb0Var;
    }

    public final void start() {
        if (((de31) this.b.a.get()).a()) {
            ((ay0) this.c.get()).f();
            this.a = true;
        }
    }

    public final void stop() {
        if (this.a) {
            ((ay0) this.c.get()).g();
            this.a = false;
        }
    }
}
