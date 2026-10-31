package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uw90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw90(String str, boolean z, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = z;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        boolean z = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                acq0.s(str, z, iu30Var, b0kVar, czo1.p(1));
                break;
            default:
                y7y0.k(str, z, iu30Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
