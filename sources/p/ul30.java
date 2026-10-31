package p;

import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ul30 implements yt90 {
    public final ynb0 a;
    public final c9c0 b;
    public final b0a0 c;
    public final llm d;
    public MobiusLoop e;
    public String f;

    public ul30(ynb0 ynb0Var, c9c0 c9c0Var, b0a0 b0a0Var, q8n q8nVar) {
        this.a = ynb0Var;
        this.b = c9c0Var;
        this.c = b0a0Var;
        this.d = cy30.t(q8nVar);
    }

    @Override // p.yt90
    public final void start() {
        if (((no4) this.c.a.get()).T()) {
            c921.y(this.d, (o8n) null, 0, new j020(this, (lnm) null, (byte) 11), 3);
        }
    }

    @Override // p.yt90
    public final void stop() {
        op71.r(this.d.a);
        synchronized (this) {
            try {
                MobiusLoop mobiusLoop = this.e;
                if (mobiusLoop != null) {
                    mobiusLoop.dispose();
                }
                this.e = null;
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
