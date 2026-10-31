package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xdl extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ idl b;
    public final /* synthetic */ kdl c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ vu30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdl(idl idlVar, kdl kdlVar, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var) {
        super(2);
        this.b = idlVar;
        this.c = kdlVar;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c(this.b, new hdl(this.c, this.d, this.e, this.f), (qim0) null, (ipb1) null, x340Var2, 72, 12);
                }
                break;
            default:
                ((Number) obj2).intValue();
                i541.a(this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(73));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdl(idl idlVar, kdl kdlVar, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, int i) {
        super(2);
        this.b = idlVar;
        this.c = kdlVar;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = vu30Var;
    }
}
