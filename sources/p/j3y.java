package p;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j3y extends t2u {
    public final thn V1;
    public m3y W1;
    public final idd1 X1 = new idd1(new h3y(this));

    public j3y(thn thnVar) {
        this.V1 = thnVar;
    }

    @Override // p.zf30
    public final void D0() {
        ((MobiusLoop.Controller) this.X1.getValue()).stop();
        this.h1 = true;
    }

    @Override // p.zf30
    public final void E0() {
        this.h1 = true;
        ((MobiusLoop.Controller) this.X1.getValue()).start();
    }

    @Override // p.t2u, p.zf30
    public final void G0() {
        Window window;
        super.G0();
        Dialog dialog = this.Q1;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
    }

    @Override // p.t2u, p.zf30
    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    @Override // p.t2u, p.zf30
    public final void w0(Bundle bundle) {
        super.w0(bundle);
        e1(2, 2132017462);
    }

    @Override // p.zf30
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x2y x2yVar = new x2y();
        ((MobiusLoop.Controller) this.X1.getValue()).c(x2yVar);
        ComposeView composeView = new ComposeView(P0(), null, 0, 6, null);
        composeView.setOnClickListener(new zfs(this, (byte) 7));
        composeView.setContent(apo.j(269650925, new i3y(x2yVar, this), true));
        return composeView;
    }

    @Override // p.t2u, p.zf30
    public final void z0() {
        ((MobiusLoop.Controller) this.X1.getValue()).disconnect();
        super.z0();
    }
}
