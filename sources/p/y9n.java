package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y9n implements isw {
    public final /* synthetic */ byte a;
    public final idd1 b;
    public final idd1 c;

    public y9n(tzv0 tzv0Var, iu30 iu30Var) {
        this.a = (byte) 1;
        this.b = new idd1(new wpu0((byte) 25, tzv0Var, iu30Var));
        this.c = new idd1(new z6v0(this, (byte) 13));
    }

    public final void a(Object obj, ysw yswVar) {
        byte b = this.a;
        idd1 idd1Var = this.b;
        switch (b) {
            case 0:
                ((qzh) idd1Var.getValue()).f(new gan(((w9n) obj).a, false, 6));
                getView().setTag("CountdownElement");
                break;
            default:
                szv0 szv0Var = (szv0) obj;
                qzh qzhVar = (qzh) idd1Var.getValue();
                String str = szv0Var.b;
                long j = szv0Var.a;
                qzhVar.f(str != null ? new han(8, j, str, false) : new gan(j, false, 2));
                getView().setTag("PrereleaseCountdownElement");
                break;
        }
    }

    public final View getView() {
        switch (this.a) {
            case 0:
                break;
        }
        return (View) this.c.getValue();
    }

    public y9n(xfx xfxVar) {
        this.a = (byte) 0;
        this.b = new idd1(new x9n(xfxVar, (byte) 0));
        this.c = new idd1(new j3m(this, (byte) 18));
    }
}
