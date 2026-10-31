package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mvc0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xrc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mvc0(xrc0 xrc0Var, byte b) {
        super(1);
        this.a = b;
        this.b = xrc0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rsc0 rsc0Var = this.b;
        switch (b) {
            case 0:
                return rsc0Var.n((qvc0) obj);
            case 1:
                return rsc0Var.o(((nwc0) obj).a);
            case 2:
                return ljo1.s((nwc0) obj, new mvc0(rsc0Var, (byte) 1));
            case 3:
                return rsc0Var.p((rxc0) obj);
            case 4:
                return ljo1.s((rxc0) obj, new mvc0(rsc0Var, (byte) 3));
            case 5:
                return new mnc0(rsc0Var.k(((xxc0) obj).a, wxc0.a), (byte) 4);
            default:
                return ljo1.s((xxc0) obj, new mvc0(rsc0Var, (byte) 5));
        }
    }
}
