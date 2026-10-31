package p;

import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fa5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa5(Uri uri, String str, qim0 qim0Var, k9 k9Var, jmr0 jmr0Var, boolean z, long j, int i) {
        super(2);
        this.f = uri;
        this.g = str;
        this.b = qim0Var;
        this.h = k9Var;
        this.i = jmr0Var;
        this.c = z;
        this.d = j;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.i;
        Object obj4 = this.g;
        Object obj5 = this.b;
        Object obj6 = this.h;
        Object obj7 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                ka5.a((p3g) obj7, (mt71) obj4, this.d, (l4g) obj6, (qim0) obj5, (f08) obj3, this.c, (b0k) obj, czo1.p(i | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                bpo1.d((Uri) obj7, (String) obj4, (qim0) obj5, (k9) obj6, (jmr0) obj3, this.c, this.d, (b0k) obj, czo1.p(i | 1));
                break;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                ven0 ven0Var = (ven0) obj4;
                err0 err0Var = (hdn0) obj7;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    float fS = err0Var.s();
                    fb91 fb91VarT = fuo1.t(x340Var2);
                    boolean zI = x340Var2.i(err0Var) | x340Var2.i(ven0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new ntb(err0Var, ven0Var);
                        x340Var2.s0(objT);
                    }
                    iu30 iu30Var = (iu30) objT;
                    boolean zE = x340Var2.e(i) | x340Var2.i(err0Var) | x340Var2.i((ven0) obj6) | x340Var2.g((iu30) obj5) | x340Var2.i(ven0Var);
                    hdn0 hdn0Var = (hdn0) obj7;
                    iu30 iu30Var2 = (iu30) obj5;
                    ven0 ven0Var2 = (ven0) obj6;
                    Object objT2 = x340Var2.T();
                    if (zE || objT2 == m4cVar) {
                        lzm lzmVar = new lzm(hdn0Var, this.e, iu30Var2, ven0Var2, ven0Var);
                        x340Var2.s0(lzmVar);
                        objT2 = lzmVar;
                    }
                    rb91.a(fS, iu30Var, qim0VarF, this.c, (Function0) objT2, fb91VarT, (idn0) null, 11, apo.r(-1650189070, new rvh((byte) 3, this.d), x340Var2), ihi.a, (jsg) obj3, x340Var2, 905969664, 0, 64);
                }
                break;
            default:
                ((Number) obj2).intValue();
                bmq0.b((Uri) obj7, (hcx) obj4, (String) obj6, (n6a1) obj3, this.d, this.c, (qim0) obj5, (b0k) obj, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa5(Uri uri, hcx hcxVar, String str, n6a1 n6a1Var, long j, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.f = uri;
        this.g = hcxVar;
        this.h = str;
        this.i = n6a1Var;
        this.d = j;
        this.c = z;
        this.b = qim0Var;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa5(p3g p3gVar, mt71 mt71Var, long j, l4g l4gVar, qim0 qim0Var, f08 f08Var, boolean z, int i) {
        super(2);
        this.f = p3gVar;
        this.g = mt71Var;
        this.d = j;
        this.h = l4gVar;
        this.b = qim0Var;
        this.i = f08Var;
        this.c = z;
        this.e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa5(hdn0 hdn0Var, ven0 ven0Var, boolean z, ven0 ven0Var2, int i, iu30 iu30Var, jsg jsgVar, long j) {
        super(2);
        this.f = hdn0Var;
        this.g = ven0Var;
        this.c = z;
        this.h = ven0Var2;
        this.e = i;
        this.b = iu30Var;
        this.i = jsgVar;
        this.d = j;
    }
}
