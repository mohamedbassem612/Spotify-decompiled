package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bp41 implements Activity.ScreenCaptureCallback {
    public final ynb0 a;
    public final ynb0 b;
    public final llm c;

    public bp41(ynb0 ynb0Var, ynb0 ynb0Var2, q8n q8nVar) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = cy30.t(q8nVar);
    }

    @Override // android.app.Activity.ScreenCaptureCallback
    public final void onScreenCaptured() {
        c921.y(this.c, (o8n) null, 0, new i7u0(this, (lnm) null, (byte) 6), 3);
    }
}
