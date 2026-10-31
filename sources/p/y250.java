package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y250 implements t1s0 {
    public final /* synthetic */ byte a;
    public final r0s0 b;
    public final lag c;
    public final n2s0 d;
    public final s2s0 e;

    public /* synthetic */ y250(r0s0 r0s0Var, lag lagVar, n2s0 n2s0Var, s2s0 s2s0Var, byte b) {
        this.a = b;
        this.b = r0s0Var;
        this.c = lagVar;
        this.d = n2s0Var;
        this.e = s2s0Var;
    }

    public final mr20 d() {
        byte b = this.a;
        n2s0 n2s0Var = this.d;
        switch (b) {
            case 0:
                return new qsc0(n2s0Var.c, n2s0Var, e3s0.d, (byte) 19);
            default:
                return new qsc0(n2s0Var.c, n2s0Var, e3s0.e, (byte) 19);
        }
    }

    public final void e() {
        Uri uri;
        byte b = this.a;
        r0s0 r0s0Var = this.b;
        switch (b) {
            case 0:
                String str = ((k9p1) r0s0Var.d).b;
                if ("com.android.vending".equals(str)) {
                    uri = Uri.parse("market://details?id=com.google.android.apps.maps");
                } else {
                    uri = "com.amazon.venezia".equals(str) ? Uri.parse("https://www.amazon.com/gp/mas/dl/android?p=com.google.android.apps.maps") : Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.maps");
                }
                ((Activity) r0s0Var.c).startActivity(new Intent("android.intent.action.VIEW", uri));
                break;
            default:
                ((qfl1) r0s0Var.b).d();
                break;
        }
    }

    public final void g(tv80 tv80Var) {
        switch (this.a) {
            case 0:
                fn31.T(smo1.e(flo1.l(op71.f(), igu.b)), (o8n) null, 0, new j020(this, null, (byte) 19), 3);
                break;
            default:
                fn31.T(smo1.e(flo1.l(op71.f(), igu.b)), (o8n) null, 0, new fkj1(this, (lnm) null, (byte) 15), 3);
                break;
        }
    }

    public final mr20 k() {
        byte b = this.a;
        s2s0 s2s0Var = this.e;
        switch (b) {
            case 0:
                return rqt0.u(h4p1.g(new l4f0(s2s0Var, e3s0.d, (lnm) null, (byte) 18)));
            default:
                return rqt0.u(h4p1.g(new l4f0(s2s0Var, e3s0.e, (lnm) null, (byte) 18)));
        }
    }
}
