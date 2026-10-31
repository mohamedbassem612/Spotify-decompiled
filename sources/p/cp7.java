package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cp7 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fp7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp7(fp7 fp7Var, byte b) {
        super(3);
        this.a = b;
        this.b = fp7Var;
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
                    this.b.g(64.0f, 64.0f, 0.0f, b0kVar2, 54, 4);
                }
                break;
            case 1:
                b0k b0kVar3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                b0k b0kVar4 = (x340) b0kVar3;
                if (!b0kVar4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b0kVar4.b0();
                } else {
                    this.b.g(200.0f, 20.0f, 0.0f, b0kVar4, 54, 4);
                }
                break;
            case 2:
                b0k b0kVar5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                b0k b0kVar6 = (x340) b0kVar5;
                if (!b0kVar6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    b0kVar6.b0();
                } else {
                    this.b.g(80.0f, 16.0f, 4.0f, b0kVar6, 438, 0);
                }
                break;
            case 3:
                b0k b0kVar7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                b0k b0kVar8 = (x340) b0kVar7;
                if (!b0kVar8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    b0kVar8.b0();
                } else {
                    this.b.g(200.0f, 40.0f, 0.0f, b0kVar8, 54, 4);
                }
                break;
            case 4:
                b0k b0kVar9 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                b0k b0kVar10 = (x340) b0kVar9;
                if (!b0kVar10.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    b0kVar10.b0();
                } else {
                    this.b.g(200.0f, 40.0f, 0.0f, b0kVar10, 54, 4);
                }
                break;
            default:
                b0k b0kVar11 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                b0k b0kVar12 = (x340) b0kVar11;
                if (!b0kVar12.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    b0kVar12.b0();
                } else {
                    this.b.g(200.0f, 20.0f, 0.0f, b0kVar12, 54, 4);
                }
                break;
        }
        return rih1Var;
    }
}
