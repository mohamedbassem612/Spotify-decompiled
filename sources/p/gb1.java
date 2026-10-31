package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gb1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p251 b;
    public final /* synthetic */ bb1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb1(p251 p251Var, bb1 bb1Var, byte b) {
        super(2);
        this.a = b;
        this.b = p251Var;
        this.c = bb1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bb1 bb1Var = this.c;
        Object[] objArr = 0;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    otw.c(this.b, new l251(bb1Var.d, cwl1.o0(x340Var2, 2131951889), cwl1.o0(x340Var2, 2131951881)), (qim0) null, (ipb1) null, x340Var2, 6, 12);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    bzn1.e(null, apo.r(1113981195, new gb1(this.b, bb1Var, objArr == true ? 1 : 0), x340Var4), false, null, null, null, null, null, x340Var4, 432, 249);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    l251 l251Var = new l251(bb1Var.d, cwl1.o0(x340Var6, 2131952302), cwl1.o0(x340Var6, 2131951881));
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var6).b;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarF);
                    cvx cvxVar2 = cbx.b(x340Var6).b;
                    cvx cvxVar3 = cbx.b(x340Var6).b;
                    qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 16.0f, 0.0f, 8.0f, 5);
                    u85 u85Var = (erl1) x340Var6.k(szf0.b);
                    if (u85Var == null) {
                        x340Var6.i0(-241884180);
                        WeakHashMap weakHashMap = osl1.x;
                        u85Var = lhc.g(x340Var6).g;
                    } else {
                        x340Var6.i0(-241885792);
                    }
                    x340Var6.r(false);
                    otw.c(this.b, l251Var, too1.y(qim0VarB, new bgc0(u85Var, 32)), (ipb1) null, x340Var6, 6, 8);
                }
                break;
        }
        return rih1Var;
    }
}
