package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d2 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(String str, float f, byte b) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = this.b;
                int length = str.length();
                nim0 nim0Var = nim0.a;
                if (length <= 0) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-1118599171);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    x0d.s(nim0Var, 8.0f, x340Var2, false);
                } else {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-1118913728);
                    cjc0 cjc0Var = new cjc0(1);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var3).b;
                    uwo1.e(str, uyn1.B(nim0Var, this.c, 8.0f, 0.0f, 0.0f, 12), null, 0L, null, null, 2, false, cjc0Var, 0, null, x340Var3, 0, 0, 1724);
                    x340Var3.r(false);
                }
                break;
            default:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (this.b.length() <= 0) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(-285792393);
                    x340Var5.r(false);
                } else {
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(-285995412);
                    cjc0 cjc0Var2 = new cjc0(1);
                    uwo1.e(this.b, uyn1.B(nim0.a, this.c, 0.0f, 0.0f, 0.0f, 14), null, 0L, null, null, 2, false, cjc0Var2, 0, null, x340Var6, 0, 0, 1724);
                    x340Var6.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
