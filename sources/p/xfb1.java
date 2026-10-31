package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xfb1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mta b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xfb1(mta mtaVar, byte b) {
        super(3);
        this.a = b;
        this.b = mtaVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (!b0kVar2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b0kVar2.b0();
                } else {
                    this.b.j(64.0f, 64.0f, 0.0f, b0kVar2, 54, 4);
                }
                break;
            case 1:
                b0k b0kVar3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                b0k b0kVar4 = (x340) b0kVar3;
                if (!b0kVar4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b0kVar4.b0();
                } else {
                    this.b.j(80.0f, 16.0f, 4.0f, b0kVar4, 438, 0);
                }
                break;
            default:
                b0k b0kVar5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                b0k b0kVar6 = (x340) b0kVar5;
                if (!b0kVar6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    b0kVar6.b0();
                } else {
                    this.b.j(200.0f, 20.0f, 0.0f, b0kVar6, 54, 4);
                }
                break;
        }
        return rih1Var;
    }
}
