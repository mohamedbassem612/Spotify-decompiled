package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e0e extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ short e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0e(c380 c380Var, String str, zau0 zau0Var, Function0 function0, vu30 vu30Var, vu30 vu30Var2, qim0 qim0Var, boolean z, xok0 xok0Var, int i, int i2) {
        super(2);
        this.f = c380Var;
        this.g = str;
        this.h = zau0Var;
        this.i = function0;
        this.t = vu30Var;
        this.X = vu30Var2;
        this.b = qim0Var;
        this.c = z;
        this.Y = xok0Var;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.f;
        Object obj9 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                short s = this.e;
                qim0 qim0Var = this.b;
                boolean z = this.c;
                wgo1.e((c380) obj8, (String) obj9, (zau0) obj7, (Function0) obj6, (vu30) obj5, (vu30) obj4, qim0Var, z, (xok0) obj3, (b0k) obj, iP, s);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                short s2 = this.e;
                qim0 qim0Var2 = this.b;
                boolean z2 = this.c;
                s3o1.d(qim0Var2, (xtb0) obj8, (vzq0) obj9, (g36) obj7, (nl3) obj6, (iq20) obj5, z2, (h3h1) obj4, (iu30) obj3, (b0k) obj, iP2, s2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                short s3 = this.e;
                boolean z3 = this.c;
                qim0 qim0Var3 = this.b;
                vxo1.h((String) obj9, (if5) obj8, z3, (gbx) obj7, (iu30) obj6, qim0Var3, (if5) obj5, (lax) obj4, (lbd1) obj3, (b0k) obj, iP3, s3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0e(String str, if5 if5Var, boolean z, gbx gbxVar, iu30 iu30Var, qim0 qim0Var, if5 if5Var2, lax laxVar, lbd1 lbd1Var, int i, int i2) {
        super(2);
        this.g = str;
        this.f = if5Var;
        this.c = z;
        this.h = gbxVar;
        this.i = iu30Var;
        this.b = qim0Var;
        this.t = if5Var2;
        this.X = laxVar;
        this.Y = lbd1Var;
        this.d = i;
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0e(qim0 qim0Var, xtb0 xtb0Var, vzq0 vzq0Var, g36 g36Var, nl3 nl3Var, iq20 iq20Var, boolean z, h3h1 h3h1Var, iu30 iu30Var, int i, int i2) {
        super(2);
        this.b = qim0Var;
        this.f = xtb0Var;
        this.g = vzq0Var;
        this.h = g36Var;
        this.i = nl3Var;
        this.t = iq20Var;
        this.c = z;
        this.X = h3h1Var;
        this.Y = iu30Var;
        this.d = i;
        this.e = i2;
    }
}
