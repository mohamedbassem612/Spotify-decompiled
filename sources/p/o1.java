package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ s1 b;
    public final /* synthetic */ h1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(h1 h1Var, s1 s1Var) {
        super(2);
        this.c = h1Var;
        this.b = s1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h1 h1Var = this.c;
        s1 s1Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                d0r d0rVar = s1Var.h;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (h1Var.c != 4) {
                    x340Var2.i0(-1674145602);
                    boolean zG = x340Var2.g(d0rVar);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = s1Var.e.a(d0rVar);
                        x340Var2.s0(objT);
                    }
                    otw.c((j330) objT, new p330(h1Var.a), (qim0) null, (ipb1) null, x340Var2, 72, 12);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-1674457927);
                    boolean zG2 = x340Var2.g(d0rVar);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new hho(d0rVar);
                        x340Var2.s0(objT2);
                    }
                    otw.c((hho) objT2, new uho(h1Var.a, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                    x340Var2.r(false);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                d0r d0rVar2 = s1Var.h;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    boolean zG3 = x340Var4.g(d0rVar2);
                    Object objT3 = x340Var4.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = s1Var.f.a(d0rVar2);
                        x340Var4.s0(objT3);
                    }
                    otw.c((tyq) objT3, new hri0(h1Var.a), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(s1 s1Var, h1 h1Var) {
        super(2);
        this.b = s1Var;
        this.c = h1Var;
    }
}
