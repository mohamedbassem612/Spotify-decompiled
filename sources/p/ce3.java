package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ce3 implements hsw {
    public final /* synthetic */ byte a;
    public final Context b;
    public final fzo c;
    public final yd91 d;
    public final mr20 e;

    public ce3(Context context, koc0 koc0Var, fzo fzoVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = context;
                this.c = fzoVar;
                this.d = new yd91(3, new z6v0(this, (byte) 5));
                this.e = rqt0.u(new m9r0(((roc0) koc0Var).d(), this, (byte) 21));
                break;
            default:
                this.b = context;
                this.c = fzoVar;
                this.d = new yd91(3, new g82(this, (byte) 13));
                this.e = rqt0.u(new gk(((roc0) koc0Var).d(), this, (byte) 24));
                break;
        }
    }

    @Override // p.xe91
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }
}
