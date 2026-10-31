package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vii0 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ cv30 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vii0(String str, if5 if5Var, String str2, boolean z, gbx gbxVar, boolean z2, boolean z3, String str3, iu30 iu30Var, qim0 qim0Var, lax laxVar, int i) {
        super(2);
        this.g = str;
        this.h = if5Var;
        this.i = str2;
        this.b = z;
        this.t = gbxVar;
        this.c = z2;
        this.d = z3;
        this.X = str3;
        this.e = iu30Var;
        this.f = qim0Var;
        this.Y = laxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.Y;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.f;
        Function0 function0 = this.e;
        Object obj8 = this.h;
        Object obj9 = this.g;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                eqr0.f((hob1) obj9, (iu30) function0, (Function0) obj8, this.b, (qim0) obj7, (yqg) obj6, (znb0) obj5, this.c, (i091) obj4, this.d, (vu30) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(65);
                c921.f((String) obj9, (if5) obj8, (String) obj6, this.b, (gbx) obj5, this.c, this.d, (String) obj4, (iu30) function0, (qim0) obj7, (lax) obj3, (b0k) obj, iP2);
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                String str = (String) obj9;
                byte b2 = 0;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    qim0 qim0VarN = anm1.N("wrapped-story-card", nim0.a);
                    boolean zG = x340Var2.g(str);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new bek1(str, (byte) 17);
                        x340Var2.s0(objT);
                    }
                    w2g0.c(f8d1.b(s161.b(qim0VarN, false, (iu30) objT), rih1Var, new edh((Function0) obj8, function0, (Function0) obj7, b2)).then(new sch0()), (tl3) null, apo.r(255951660, new ib7((i3k) obj6, (tjz) obj5, (Function0) obj4, (ycl1) obj3, this.b, this.c, this.d), x340Var2), x340Var2, 3072, 6);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vii0(String str, Function0 function0, Function0 function1, Function0 function2, i3k i3kVar, tjz tjzVar, Function0 function3, ycl1 ycl1Var, boolean z, boolean z2, boolean z3) {
        super(2);
        this.g = str;
        this.h = function0;
        this.e = function1;
        this.f = function2;
        this.i = i3kVar;
        this.t = tjzVar;
        this.X = function3;
        this.Y = ycl1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vii0(hob1 hob1Var, iu30 iu30Var, Function0 function0, boolean z, qim0 qim0Var, yqg yqgVar, znb0 znb0Var, boolean z2, i091 i091Var, boolean z3, vu30 vu30Var, int i) {
        super(2);
        this.g = hob1Var;
        this.e = iu30Var;
        this.h = function0;
        this.b = z;
        this.f = qim0Var;
        this.i = yqgVar;
        this.t = znb0Var;
        this.c = z2;
        this.X = i091Var;
        this.d = z3;
        this.Y = vu30Var;
    }
}
