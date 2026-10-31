package p;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class j421 extends t2u {
    public final jf11 V1;
    public zzs W1;

    public j421(jf11 jf11Var) {
        this.V1 = jf11Var;
    }

    @Override // p.zf30
    public final void I0(View view, Bundle bundle) {
        c921.y(cto1.q(n0()), (o8n) null, 0, new i421(this, (lnm) null, (byte) 2), 3);
    }

    @Override // p.t2u
    public final Dialog c1(Bundle bundle) {
        Object value;
        Dialog dialogC1 = super.c1(bundle);
        dialogC1.setOnKeyListener(new qfm(this, (byte) 1));
        zzs zzsVarI1 = i1();
        l0l l0lVarB = zzsVarI1.b();
        if (l0lVarB != null) {
            bpb1 bpb1Var = zzsVarI1.e;
            do {
                value = bpb1Var.getValue();
            } while (!bpb1Var.k(value, zzsVarI1.a(l0lVarB, Double.valueOf(zzsVarI1.d.c()))));
            zzsVarI1.f.onNext(rih1.a);
        }
        Window window = dialogC1.getWindow();
        if (window != null) {
            window.addFlags(32);
            window.addFlags(262144);
        }
        return dialogC1;
    }

    public final zzs i1() {
        zzs zzsVar = this.W1;
        if (zzsVar != null) {
            return zzsVar;
        }
        u890.C("viewModel");
        throw null;
    }

    @Override // p.t2u, p.zf30
    public final void v0(Context context) {
        this.V1.f(this);
        super.v0(context);
    }

    @Override // p.t2u, p.zf30
    public final void w0(Bundle bundle) {
        super.w0(bundle);
        e1(0, 2132018437);
        e0().i = 2130772046;
        e0().k = 2130772047;
    }

    @Override // p.zf30
    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeView = new ComposeView(P0(), null, 0, 6, null);
        composeView.setContent(apo.j(540027737, new g421(this, (byte) 1), true));
        return composeView;
    }
}
