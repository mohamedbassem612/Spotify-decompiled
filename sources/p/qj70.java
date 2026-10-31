package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qj70 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rj70 b;

    public /* synthetic */ qj70(rj70 rj70Var, byte b) {
        this.a = b;
        this.b = rj70Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rj70 rj70Var = this.b;
        switch (b) {
            case 0:
                zfr.p(rj70Var.c, 3);
                break;
            case 1:
                zfr.p(rj70Var.c, 3);
                break;
            case 2:
                rj70Var.k.a(ano0.d);
                rj70Var.d.b(null);
                break;
            default:
                zfr.p(rj70Var.c, 1);
                break;
        }
    }
}
