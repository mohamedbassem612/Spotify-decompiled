package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mz0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ fb91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz0(fb91 fb91Var, boolean z) {
        super(3);
        this.a = (byte) 0;
        this.c = fb91Var;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    q3p1.g(this.c, this.b, x340Var2, 0);
                }
                break;
            case 1:
                tb91 tb91Var = (tb91) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? x340Var3.g(tb91Var) : x340Var3.i(tb91Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var4.b0();
                } else {
                    lb91 lb91Var = lb91.a;
                    qim0 qim0VarH = u291.h(nim0Var, dsa0.m(x340Var4, 2131166967));
                    Object objT = x340Var4.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = e3.d1;
                        x340Var4.s0(objT);
                    }
                    vu30 vu30Var = (vu30) objT;
                    Object objT2 = x340Var4.T();
                    if (objT2 == m4cVar) {
                        objT2 = o40.f;
                        x340Var4.s0(objT2);
                    }
                    lb91Var.b(tb91Var, qim0VarH, this.b, this.c, vu30Var, (xu30) objT2, 0.0f, 0.0f, x340Var4, 221192 | (iIntValue2 & 14), 128);
                }
                break;
            case 2:
                tb91 tb91Var2 = (tb91) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= (iIntValue3 & 8) == 0 ? x340Var5.g(tb91Var2) : x340Var5.i(tb91Var2) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x340Var6.b0();
                } else {
                    lb91 lb91Var2 = lb91.a;
                    uwr uwrVar = cbx.a;
                    avw0 avw0Var = cbx.b(x340Var6).c;
                    qim0 qim0VarH2 = u291.h(nim0Var, 4.0f);
                    Object objT3 = x340Var6.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT3 == m4cVar2) {
                        objT3 = lgx.t;
                        x340Var6.s0(objT3);
                    }
                    vu30 vu30Var2 = (vu30) objT3;
                    Object objT4 = x340Var6.T();
                    if (objT4 == m4cVar2) {
                        objT4 = gft.S0;
                        x340Var6.s0(objT4);
                    }
                    lb91Var2.b(tb91Var2, qim0VarH2, this.b, this.c, vu30Var2, (xu30) objT4, 0.0f, 0.0f, x340Var6, 221192 | (iIntValue3 & 14), 128);
                }
                break;
            default:
                tb91 tb91Var3 = (tb91) obj;
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? x340Var7.g(tb91Var3) : x340Var7.i(tb91Var3) ? 4 : 2;
                }
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x340Var8.b0();
                } else {
                    int i = iIntValue4;
                    lb91 lb91Var3 = lb91.a;
                    qim0 qim0VarH3 = u291.h(nim0Var, 3.0f);
                    Object objT5 = x340Var8.T();
                    m4c m4cVar3 = fkj0.X;
                    if (objT5 == m4cVar3) {
                        objT5 = qr51.f;
                        x340Var8.s0(objT5);
                    }
                    vu30 vu30Var3 = (vu30) objT5;
                    Object objT6 = x340Var8.T();
                    if (objT6 == m4cVar3) {
                        objT6 = krz0.X0;
                        x340Var8.s0(objT6);
                    }
                    lb91Var3.b(tb91Var3, qim0VarH3, this.b, this.c, vu30Var3, (xu30) objT6, 0.0f, 0.0f, x340Var8, 221192 | (i & 14), 128);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz0(boolean z, fb91 fb91Var, byte b) {
        super(3);
        this.a = b;
        this.b = z;
        this.c = fb91Var;
    }
}
