package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vij1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ adj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vij1(adj1 adj1Var) {
        super(2);
        this.a = (byte) 0;
        this.b = adj1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        adj1 adj1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    w0h1.a(c2p1.s(adj1Var, x340Var2).a, new jsl(c2p1.s(adj1Var, x340Var2).c), u291.r(nim0.a, 16.0f), cbx.a(x340Var2).c.a, 0L, true, x340Var2, 196616, 16);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                x3p1.h(adj1Var, (b0k) obj, czo1.p(1));
                break;
            default:
                ((Number) obj2).intValue();
                x3p1.h(adj1Var, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vij1(adj1 adj1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = adj1Var;
    }
}
