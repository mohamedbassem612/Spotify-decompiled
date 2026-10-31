package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ap50 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zv31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ap50(zv31 zv31Var, byte b) {
        super(3);
        this.a = b;
        this.b = zv31Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        zv31 zv31Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    hux huxVar = zv31Var.c.a;
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    qim0 qim0VarV = u291.v(nim0Var, 24.0f);
                    zov0 zov0Var2 = cbx.b(x340Var2).g;
                    w0h1.a(huxVar, isl.a, anm1.N("groupable-device-icon", u291.h(qim0VarV, 24.0f)), cbx.a(x340Var2).b.b, 0L, false, x340Var2, 56, 48);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x340Var4.b0();
                } else {
                    String str = zv31Var.b.a;
                    qim0 qim0VarN = anm1.N("groupable-device-name", nim0Var);
                    cjc0 cjc0Var = new cjc0(1);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str, qim0VarN, cbx.d(x340Var4).g, cbx.a(x340Var4).b.a, null, null, 2, false, cjc0Var, 0, null, x340Var4, 1572912, 0, 1712);
                }
                break;
            case 2:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x340Var6.b0();
                } else {
                    nyn1.d(zv31Var, x340Var6, 0);
                }
                break;
            case 3:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (!x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x340Var8.b0();
                } else {
                    nyn1.e(zv31Var, x340Var8, 0);
                }
                break;
            case 4:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x340Var10.b0();
                } else {
                    tm80.i(zv31Var, x340Var10, 0);
                }
                break;
            case 5:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var12 = x340Var11;
                if (!x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x340Var12.b0();
                } else {
                    List list = zv31Var.h;
                    tm80.n(list != null ? mqo1.A(list) : null, x340Var12, 0);
                }
                break;
            default:
                x340 x340Var13 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x340Var14.b0();
                } else {
                    tm80.o(zv31Var.b, x340Var14, 0);
                }
                break;
        }
        return rih1Var;
    }
}
