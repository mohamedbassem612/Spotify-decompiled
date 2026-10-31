package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pk7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk7(cce cceVar, o0i o0iVar, z0i z0iVar, boolean z, int i, int i2) {
        super(2);
        this.e = cceVar;
        this.f = o0iVar;
        this.g = z0iVar;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    zen0 zen0Var = (zen0) obj5;
                    bby bbyVarE = xay.e(2, irn1.o0(160, 0, null, 6));
                    pxg1 pxg1VarO0 = irn1.o0(160, 0, null, 6);
                    int i2 = this.c;
                    boolean zE = x340Var2.e(i2);
                    Object objT = x340Var2.T();
                    if (zE || objT == fkj0.X) {
                        objT = new uv4(i2, (byte) 2);
                        x340Var2.s0(objT);
                    }
                    fq7.d(zen0Var, (qim0) null, bbyVarE.a(xay.o(pxg1VarO0, (iu30) objT)), (ln00) null, (String) null, apo.r(-1050112085, new ok7(i, (iu30) obj3, (c380) obj4, this.b), x340Var2), x340Var2, 196608, 26);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                y2o1.g((xtb0) obj5, (mlr0) obj4, this.b, (Function0) obj3, this.c, (b0k) obj, czo1.p(i | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                rqg0.q(this.c, iP, (Function0) obj5, (Function0) obj4, (b0k) obj, (qim0) obj3, this.b);
                break;
            default:
                ((Number) obj2).intValue();
                ajo1.m((cce) obj5, (o0i) obj4, (z0i) obj3, this.b, this.c, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk7(int i, int i2, Function0 function0, Function0 function1, qim0 qim0Var, boolean z) {
        super(2);
        this.c = i;
        this.b = z;
        this.e = function0;
        this.f = function1;
        this.g = qim0Var;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk7(xtb0 xtb0Var, mlr0 mlr0Var, boolean z, Function0 function0, int i, int i2) {
        super(2);
        this.e = xtb0Var;
        this.f = mlr0Var;
        this.b = z;
        this.g = function0;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk7(zen0 zen0Var, int i, c380 c380Var, int i2, boolean z, iu30 iu30Var) {
        super(2);
        this.e = zen0Var;
        this.c = i;
        this.f = c380Var;
        this.d = i2;
        this.b = z;
        this.g = iu30Var;
    }
}
