package p;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oi3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pi3 b;

    public /* synthetic */ oi3(pi3 pi3Var, byte b) {
        this.a = b;
        this.b = pi3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        pi3 pi3Var = this.b;
        switch (b) {
            case 0:
                pi3Var.k1(2);
                return;
            case 1:
                pi3Var.j1().k();
                pi3Var.dismiss();
                pi3Var.m1();
                return;
            case 2:
                pi3Var.k1(1);
                return;
            case 3:
                pi3Var.j1().k();
                pi3Var.dismiss();
                pi3Var.m1();
                return;
            case 4:
                pi3Var.j1().m();
                if (pi3Var.Z1 == null) {
                    u890.C("alexaUriProvider");
                    throw null;
                }
                pi3Var.X0(new Intent("android.intent.action.VIEW", Uri.parse("https://alexa.amazon.com/spa/index.html#settings/music-settings/service-preferences")));
                pi3Var.dismiss();
                return;
            default:
                pi3Var.j1().k();
                pi3Var.dismiss();
                pi3Var.m1();
                return;
        }
    }
}
