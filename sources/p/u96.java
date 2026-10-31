package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u96 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u96(String str, boolean z, upx0 upx0Var, String str2, boolean z2, iu30 iu30Var, boolean z3, Function0 function0, int i) {
        super(2);
        this.g = str;
        this.c = z;
        this.i = upx0Var;
        this.h = str2;
        this.d = z2;
        this.t = iu30Var;
        this.e = z3;
        this.b = function0;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.f;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.c;
                boolean z2 = this.d;
                r4o1.i((String) obj6, z, (upx0) obj4, (String) obj5, z2, (iu30) obj3, this.e, this.b, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                Function0 function0 = this.b;
                cyo1.c((ct10) obj6, (htr) obj5, function0, (Function0) obj4, (qim0) obj3, this.c, this.d, this.e, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                Function0 function1 = this.b;
                boolean z3 = this.c;
                boolean z4 = this.d;
                boolean z5 = this.e;
                gm50.f((xpw) obj5, function1, z3, z4, z5, (String) obj6, (qim0) obj4, (xpw) obj3, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                Integer num = (Integer) obj4;
                int iP4 = czo1.p(9);
                boolean z6 = this.c;
                boolean z7 = this.d;
                boolean z8 = this.e;
                Function0 function2 = this.b;
                acf1.b((List) obj6, (iu30) obj3, z6, z7, z8, function2, (List) obj5, num, this.f, (b0k) obj, iP4);
                break;
            default:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                boolean z9 = this.c;
                boolean z10 = this.d;
                boolean z11 = this.e;
                Function0 function3 = this.b;
                qon1.h((String) obj6, z9, z10, z11, function3, (Function0) obj5, (qim0) obj4, (idn0) obj3, (b0k) obj, iP5);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u96(String str, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, qim0 qim0Var, idn0 idn0Var, int i) {
        super(2);
        this.g = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.b = function0;
        this.h = function1;
        this.i = qim0Var;
        this.t = idn0Var;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u96(List list, iu30 iu30Var, boolean z, boolean z2, boolean z3, Function0 function0, List list2, Integer num, int i, int i2) {
        super(2);
        this.g = list;
        this.t = iu30Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.b = function0;
        this.h = list2;
        this.i = num;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u96(xpw xpwVar, Function0 function0, boolean z, boolean z2, boolean z3, String str, qim0 qim0Var, xpw xpwVar2, int i) {
        super(2);
        this.h = xpwVar;
        this.b = function0;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.g = str;
        this.i = qim0Var;
        this.t = xpwVar2;
        this.f = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u96(ct10 ct10Var, htr htrVar, Function0 function0, Function0 function1, qim0 qim0Var, boolean z, boolean z2, boolean z3, int i) {
        super(2);
        this.g = ct10Var;
        this.h = htrVar;
        this.b = function0;
        this.i = function1;
        this.t = qim0Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
    }
}
