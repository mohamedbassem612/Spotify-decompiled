package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class llb implements zrt0 {
    public final gst0 a;
    public final String b;
    public final Flowable c;

    public llb(gst0 gst0Var, String str, Flowable flowable) {
        this.a = gst0Var;
        this.b = str;
        this.c = flowable;
    }

    public final mr20 a(String str) {
        boolean zEquals = str.equals(this.b);
        gst0 gst0Var = this.a;
        if (!zEquals) {
            return gst0Var.a(str);
        }
        mr20 mr20VarA = gst0Var.a(str);
        vbm[] vbmVarArr = q601.a;
        return rqt0.u(new x010(mr20VarA, new kge(this.c), new qr0(this, (lnm) null, (byte) 7), (byte) 1));
    }
}
