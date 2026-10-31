package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x8v0 implements it80 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ x8v0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // p.it80
    public final void a(ajq0 ajq0Var) {
        switch (this.a) {
            case 0:
                ajq0Var.K(blc0.SHOW_SHOW, "Handle routing to podcast specific entity page", new vgq0(this, (byte) 13));
                break;
            default:
                ajq0Var.G(blc0.PPT_OFFER, "Opens a Premium Partner Trial (PPT) offer on a WebView", new ifl1(this, (byte) 29));
                ajq0Var.G(blc0.PPT_MARKET_OFFER, "Opens a Premium Partner Trial (PPT) offer with market code on a WebView", new ifl1(this, (byte) 29));
                break;
        }
    }
}
