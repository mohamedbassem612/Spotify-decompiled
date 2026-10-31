package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tnd extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ be50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnd(be50 be50Var, byte b) {
        super(1);
        this.a = b;
        this.b = be50Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        be50 be50Var = this.b;
        switch (b) {
            case 0:
                lsl lslVar = (lsl) obj;
                lslVar.V((((long) jch0.U(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)))) & 4294967295L) | (((long) jch0.U(Float.intBitsToFloat((int) (lslVar.j() >> 32)))) << 32), new snd(lslVar, (byte) 0), be50Var);
                m5n1.r(lslVar, be50Var);
                break;
            default:
                lsl lslVar2 = (lsl) obj;
                lslVar2.V(o0c.P(lslVar2.j()), new snd(lslVar2, (byte) 1), be50Var);
                lslVar2.s1();
                break;
        }
        return rih1Var;
    }
}
