package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y1n0 implements qac0 {
    public final oo70 a;

    public y1n0(oo70 oo70Var) {
        this.a = oo70Var;
    }

    public final void a() {
        Logger.b("[ALSM] onTaskRemoved, Shutting down", new Object[0]);
        wo70 wo70Var = (wo70) this.a;
        wo70Var.getClass();
        c921.D(new no70(wo70Var, (lnm) null, (byte) 1));
    }
}
