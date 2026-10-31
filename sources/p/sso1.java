package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class sso1 implements tcn1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ndn1 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ sso1(ndn1 ndn1Var, Bundle bundle, byte b) {
        this.a = b;
        this.b = ndn1Var;
        this.c = bundle;
    }

    public final void e(hg70 hg70Var, bsd1 bsd1Var) {
        byte b = this.a;
        Bundle bundle = this.c;
        ndn1 ndn1Var = this.b;
        switch (b) {
            case 0:
                hg70Var.l0(bundle, new ibn1(ndn1Var, bsd1Var, (byte) 0));
                break;
            case 1:
                hg70Var.A0(bundle, new ibn1(ndn1Var, bsd1Var, (byte) 1));
                break;
            default:
                hg70Var.t0(bundle, new ibn1(ndn1Var, bsd1Var, (byte) 2));
                break;
        }
    }
}
