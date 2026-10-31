package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uu9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu9(long j, Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = j;
        this.c = obj;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                lsl lslVar = (lsl) obj;
                lslVar.a1().p().q();
                lslVar.a1().p().h(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
                m5n1.r(lslVar, (be50) obj2);
                lslVar.a1().p().i();
                break;
            default:
                sp21 sp21Var = (sp21) obj;
                sp21Var.l = Long.valueOf(j);
                sp21Var.u = (voe1) obj2;
                break;
        }
        return rih1Var;
    }
}
