package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.mobius.First;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xix extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xix(boolean z, boolean z2, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = z;
        this.c = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        boolean z2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    qro1.e(z2, z, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                qro1.e(z2, z, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                rnf0 rnf0Var = (rnf0) obj2;
                Set setO1 = o7h.o1(vby0.x((qnf0) obj));
                if (z2 || z) {
                    setO1.add(vby0.A(rnf0Var));
                }
                return First.c(rnf0Var, setO1);
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    nim0 nim0Var = nim0.a;
                    if (z2) {
                        x340Var4.i0(-819735909);
                        Object objT = x340Var4.T();
                        if (objT == m4cVar) {
                            objT = kei1.W0;
                            x340Var4.s0(objT);
                        }
                        xto1.e(s161.a(nim0Var, (iu30) objT), 2, ((u7h) x340Var4.k(qgx.a)).a, u7h.j, x340Var4, 48, 0);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(-819480252);
                        Object objT2 = x340Var4.T();
                        if (objT2 == m4cVar) {
                            objT2 = kei1.X0;
                            x340Var4.s0(objT2);
                        }
                        uwo1.e(z ? x0d.k(x340Var4, 943399576, 2131963640, x340Var4, false) : x0d.k(x340Var4, 943402266, 2131963641, x340Var4, false), s161.a(nim0Var, (iu30) objT2), null, 0L, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2044);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xix(boolean z, boolean z2, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = z2;
    }
}
