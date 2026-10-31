package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vxx extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vxx(byte b, int i, int i2) {
        super(3);
        this.a = b;
        this.b = i;
        this.c = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        int i2 = this.b;
        float f = 8.0f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                List list = (List) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(list) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    y1x0 y1x0Var = y1x0.R0;
                    lhd1 lhd1Var = (lhd1) list.get(i2);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    int iC = l1d.C(i);
                    if (iC == 0) {
                        x340Var2.i0(-1024614822);
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        x340Var2.r(false);
                    } else {
                        if (iC != 1) {
                            throw p3d1.k(x340Var2, -1024616557, false);
                        }
                        x340Var2.i0(-1024610892);
                        x340Var2.r(false);
                        f = 0.0f;
                    }
                    y1x0Var.a(new ugd1(lhd1Var, f, jhc1.p(x340Var2)), 0.0f, 0L, (hw61) null, x340Var2, 24576);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                for (int i3 = 0; i3 < i2; i3++) {
                    x340 x340Var4 = x340Var3;
                    if (i3 > 0) {
                        x340Var4.i0(2066434048);
                        fc11.g(dm5.Q(et40.a, 8.0f), x340Var4, 0);
                    } else {
                        x340Var4.i0(-365010705);
                    }
                    x340Var4.r(false);
                    jch0.f((gt40) null, 0, apo.r(-1701590803, new f13(i, (byte) 20), x340Var3), x340Var3, 3072, 7);
                }
                return rih1Var;
        }
    }
}
