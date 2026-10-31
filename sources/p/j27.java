package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j27 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j27(float f, xtb0 xtb0Var, c380 c380Var, boolean z, ven0 ven0Var, int i, iu30 iu30Var, String str, String str2) {
        super(2);
        this.b = f;
        this.c = xtb0Var;
        this.g = c380Var;
        this.e = z;
        this.d = ven0Var;
        this.f = i;
        this.h = iu30Var;
        this.i = str;
        this.t = str2;
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        byte b = this.a;
        int i = this.f;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.t;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.d;
        Object obj8 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                float f = this.b;
                int iP = czo1.p(1);
                foo1.b((c380) obj8, this.f, this.e, (vu30) obj3, (iu30) obj6, (Function0) obj7, (Function0) obj5, (qim0) obj4, f, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                wxo1.b((i2c) obj8, (String) obj6, (w61) obj5, this.b, (vu30) obj3, (Function0) obj7, this.e, (j2i) obj4, (b0k) obj, iP2);
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    zzq0 zzq0VarJ = uyn1.j(12.0f, this.b, 12.0f, 0.0f, 8);
                    qim0 qim0VarR = i1p1.r(nim0.a);
                    xtb0 xtb0Var = (xtb0) obj3;
                    boolean zE = x340Var2.e(i) | x340Var2.i((c380) obj8) | x340Var2.h(this.e) | x340Var2.i((ven0) obj7) | x340Var2.g((iu30) obj6) | x340Var2.g((String) obj5) | x340Var2.g((String) obj4);
                    c380 c380Var = (c380) obj8;
                    String str = (String) obj4;
                    iu30 iu30Var = (iu30) obj6;
                    String str2 = (String) obj5;
                    ven0 ven0Var = (ven0) obj7;
                    Object objT = x340Var2.T();
                    if (zE || objT == fkj0.X) {
                        objT = new hf6(c380Var, str, this.e, this.f, iu30Var, str2, ven0Var);
                        x340Var2.s0(objT);
                    }
                    ujo1.d(qim0VarR, xtb0Var, zzq0VarJ, false, null, null, null, false, null, (iu30) objT, x340Var2, 0, 504);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j27(i2c i2cVar, String str, w61 w61Var, float f, vu30 vu30Var, Function0 function0, boolean z, j2i j2iVar, int i) {
        super(2);
        this.g = i2cVar;
        this.h = str;
        this.i = w61Var;
        this.b = f;
        this.c = vu30Var;
        this.d = function0;
        this.e = z;
        this.t = j2iVar;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j27(c380 c380Var, int i, boolean z, vu30 vu30Var, iu30 iu30Var, Function0 function0, Function0 function1, qim0 qim0Var, float f, int i2) {
        super(2);
        this.g = c380Var;
        this.f = i;
        this.e = z;
        this.c = vu30Var;
        this.h = iu30Var;
        this.d = function0;
        this.i = function1;
        this.t = qim0Var;
        this.b = f;
    }
}
