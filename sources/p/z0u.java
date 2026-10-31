package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class z0u extends r6 implements r8n {
    public final /* synthetic */ km0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public z0u(km0 km0Var) {
        olj0 olj0Var = olj0.T0;
        this.b = km0Var;
        super(olj0Var);
    }

    public final void p(Throwable th, o8n o8nVar) {
        ((ro30) this.b.c).t("Diagnostic report initialization failed due to ".concat(th.getClass().getSimpleName()));
        Logger.d("Diagnostic report initialization failed (%s)", new Object[]{th.getClass().getSimpleName()});
    }
}
