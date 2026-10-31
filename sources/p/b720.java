package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b720 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ vu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b720(ven0 ven0Var, vu30 vu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = ven0Var;
        this.c = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        vu30 vu30Var = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                uha1 uha1Var = (uha1) obj;
                int iIntValue = ((Number) obj2).intValue();
                ven0Var.setValue(uha1Var);
                vu30Var.invoke(uha1Var, Integer.valueOf(iIntValue));
                return rih1.a;
            default:
                tlc1 tlc1Var = (tlc1) obj;
                pzm.k(tlc1Var.M0(((afh0) o7h.q0(tlc1Var.P("measurable", new j2i(-1291496922, new k7f((byte) 19, vu30Var, false), true)))).H(((hjl) obj2).a).b), ven0Var);
                return tlc1Var.S(0, 0, b7x.a, xdc0.Q0);
        }
    }
}
