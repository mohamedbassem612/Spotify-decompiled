package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pb3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rt01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pb3(rt01 rt01Var, byte b) {
        super(1);
        this.a = b;
        this.b = rt01Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rt01 rt01Var = this.b;
        switch (b) {
            case 0:
                ((z2s) obj).R(yti0.class, (rt01) rt01Var.d, ra3.Q0, ra3.R0, ra3.S0, false, p83.U0);
                break;
            default:
                o4o1.o((y2s) obj, (kdn0) rt01Var.c, new pb3(rt01Var, (byte) 0));
                break;
        }
        return rih1Var;
    }
}
