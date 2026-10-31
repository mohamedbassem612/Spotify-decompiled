package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r7s0 extends p7s0 {
    public vkg a;
    public p6r0 b;
    public qir0 c;
    public boolean d;

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        p6r0 p6r0Var;
        super.onAttachedToWindow();
        vkg vkgVar = this.a;
        if (vkgVar == null || (p6r0Var = this.b) == null || this.d) {
            return;
        }
        vkgVar.U(p6r0Var, this.c);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        p6r0 p6r0Var;
        super.onDetachedFromWindow();
        vkg vkgVar = this.a;
        if (vkgVar == null || (p6r0Var = this.b) == null) {
            return;
        }
        vkgVar.h(p6r0Var, this.c);
    }

    @Override // android.app.Dialog
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.d = true;
    }
}
