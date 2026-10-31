package p;

import com.ravelin.core.model.RavelinError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class avz0 extends evz0 {
    public final /* synthetic */ y1t0 a;
    public final /* synthetic */ String b;

    public avz0(y1t0 y1t0Var, String str) {
        this.a = y1t0Var;
        this.b = str;
    }

    public final void a(RavelinError ravelinError) {
        ((ayh) this.a.b).y0(new IllegalStateException(l1d.m("Ravelin trackFingerprint failed: ", ravelinError.getMessage())));
    }

    public final void b() {
        ((ayh) this.a.b).m0(this.b);
    }
}
