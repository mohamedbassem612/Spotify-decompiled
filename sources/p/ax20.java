package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ax20 implements xpw {
    public final Context a;
    public final tdo b;
    public final js20 c;
    public final ia00 d = n3o1.q(this).a(je20.f, je20.g);
    public final f70 e = new f70((byte) 14);

    public ax20(Context context, tdo tdoVar, nfb nfbVar) {
        this.a = context;
        this.b = tdoVar;
        this.c = bzn1.w(this, new sty(1, this, ax20.class, "defaultState", "defaultState(Lcom/spotify/reinventfree/fmaupsellpage/element/FmaUpsellElement$Props;)Lcom/spotify/reinventfree/upsellui/standardupsell/StandardUpsellState;", 0, (byte) 26), nfbVar, new zw20(this, null, (byte) 0), new zw20(this, null, (byte) 1));
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
