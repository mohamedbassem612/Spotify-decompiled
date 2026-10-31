package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lt91 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wh41 b;

    public /* synthetic */ lt91(wh41 wh41Var, byte b) {
        this.a = b;
        this.b = wh41Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        wh41 wh41Var = this.b;
        switch (b) {
            case 0:
                ((qrg0) ((ynb0) wh41Var.e).get()).b(4);
                ((kt91) wh41Var.d).b();
                break;
            default:
                ((qrg0) ((ynb0) wh41Var.e).get()).b(4);
                ((kt91) wh41Var.d).b();
                break;
        }
    }
}
