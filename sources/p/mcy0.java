package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mcy0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ cm0 b;
    public final /* synthetic */ tcy0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcy0(cm0 cm0Var, tcy0 tcy0Var, iu30 iu30Var) {
        super(2);
        this.b = cm0Var;
        this.c = tcy0Var;
        this.d = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                this.b.i(this.c, this.d, nim0.a, (b0k) obj, czo1.p(1));
                break;
            default:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (!b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b0kVar2.b0();
                } else {
                    this.b.i(this.c, this.d, null, b0kVar2, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mcy0(cm0 cm0Var, tcy0 tcy0Var, iu30 iu30Var, int i) {
        super(2);
        this.b = cm0Var;
        this.c = tcy0Var;
        this.d = iu30Var;
    }
}
