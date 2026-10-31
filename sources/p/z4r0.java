package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z4r0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ahi0 b;
    public final /* synthetic */ g5r0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4r0(ahi0 ahi0Var, g5r0 g5r0Var, boolean z, Function0 function0, byte b) {
        super(3);
        this.a = b;
        this.b = ahi0Var;
        this.c = g5r0Var;
        this.d = z;
        this.e = function0;
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
                    this.b.f(this.c, this.d, this.e, b0kVar2, 0);
                }
                break;
            case 1:
                b0k b0kVar3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                b0k b0kVar4 = (x340) b0kVar3;
                if (!b0kVar4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b0kVar4.b0();
                } else {
                    this.b.f(this.c, this.d, this.e, b0kVar4, 0);
                }
                break;
            default:
                b0k b0kVar5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                b0k b0kVar6 = (x340) b0kVar5;
                if (!b0kVar6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    b0kVar6.b0();
                } else {
                    this.b.f(this.c, this.d, this.e, b0kVar6, 0);
                }
                break;
        }
        return rih1Var;
    }
}
