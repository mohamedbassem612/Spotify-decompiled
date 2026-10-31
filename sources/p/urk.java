package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class urk implements hsw {
    public final int a;
    public final yd91 b;
    public final huz c = new huz(Boolean.TRUE, (byte) 10);

    public urk(Context context, br0 br0Var) {
        this.a = context.getColor(2131100289);
        this.b = new yd91(3, new d1c(br0Var, context, this, (byte) 27));
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.b;
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.c;
    }
}
