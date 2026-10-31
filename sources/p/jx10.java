package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jx10 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx10(boolean z, nmo nmoVar, q10 q10Var, float f, boolean z2) {
        super(2);
        this.b = z;
        this.e = nmoVar;
        this.f = q10Var;
        this.c = f;
        this.d = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                jyo1.c(this.b, this.d, this.c, (qim0) obj4, (Function0) obj3, (b0k) obj, iP);
                break;
            case 1:
                q10 q10Var = (q10) obj3;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean z = this.b;
                    et40 et40Var = et40.a;
                    if (!z) {
                        x340Var2.i0(2077743039);
                        Object objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = v160.V0;
                            x340Var2.s0(objT);
                        }
                        c760.b((nmo) obj4, q10Var, iko1.x(et40Var, (iu30) objT), this.c, this.d, x340Var2, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(2077483011);
                        Object objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = v160.U0;
                            x340Var2.s0(objT2);
                        }
                        c760.c((nmo) obj4, q10Var, iko1.x(et40Var, (iu30) objT2), this.c, this.d, x340Var2, 0);
                        x340Var2.r(false);
                    }
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                yto.d((ArrayList) obj3, this.c, this.b, this.d, (qim0) obj4, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx10(ArrayList arrayList, float f, boolean z, boolean z2, qim0 qim0Var, int i) {
        super(2);
        this.f = arrayList;
        this.c = f;
        this.b = z;
        this.d = z2;
        this.e = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx10(boolean z, boolean z2, float f, qim0 qim0Var, Function0 function0, int i) {
        super(2);
        this.b = z;
        this.d = z2;
        this.c = f;
        this.e = qim0Var;
        this.f = function0;
    }
}
