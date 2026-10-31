package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class prk implements hsw {
    public final /* synthetic */ byte a = 0;
    public final huz b = new huz(Boolean.TRUE, (byte) 10);
    public final yd91 c;

    public prk(Context context, cx0 cx0Var) {
        this.c = new yd91(3, new gmj(cx0Var, context, (byte) 15));
    }

    @Override // p.xe91
    public final yd91 d() {
        byte b = this.a;
        return this.c;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        byte b = this.a;
        return this.b;
    }

    public prk(wkp wkpVar) {
        this.c = new yd91(3, new pr90(wkpVar, (byte) 8));
    }
}
