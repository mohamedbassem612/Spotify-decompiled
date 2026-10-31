package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ul extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af5 b;
    public final /* synthetic */ cqs0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ul(af5 af5Var, cqs0 cqs0Var, byte b) {
        super(2);
        this.a = b;
        this.b = af5Var;
        this.c = cqs0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    uwo1.d(this.b, cbx.a(x340Var2).b.b, anm1.N("account-details-toggle-row-description", nim0Var), cbx.d(x340Var2).j, new a0e1(5), null, 0, false, null, 0, null, this.c, x340Var2, 384, 0, 2016);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar2 = cbx.a;
                    uwo1.d(this.b, cbx.a(x340Var4).b.b, anm1.N("member-details-toggle-row-description", nim0Var), cbx.d(x340Var4).j, new a0e1(5), null, 0, false, null, 0, null, this.c, x340Var4, 384, 0, 2016);
                }
                break;
        }
        return rih1Var;
    }
}
