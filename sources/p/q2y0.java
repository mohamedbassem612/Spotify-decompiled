package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q2y0 extends hab0 implements vu30 {
    public final /* synthetic */ Object N0;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2y0(String str, ton1 ton1Var, mvh1 mvh1Var, int i, String str2, mvh1 mvh1Var2, mvh1 mvh1Var3, Function0 function0, iu30 iu30Var, iu30 iu30Var2, bih1 bih1Var, int i2, int i3) {
        super(2);
        this.h = str;
        this.i = ton1Var;
        this.t = mvh1Var;
        this.b = i;
        this.X = str2;
        this.Y = mvh1Var2;
        this.Z = mvh1Var3;
        this.c = function0;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.N0 = bih1Var;
        this.f = i2;
        this.g = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        Object obj3 = this.N0;
        Object obj4 = this.Z;
        Object obj5 = this.Y;
        Object obj6 = this.X;
        Object obj7 = this.t;
        Object obj8 = this.i;
        Object obj9 = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP = czo1.p(i | 1);
                int i2 = this.b;
                Function0 function0 = this.c;
                iu30 iu30Var = this.d;
                ryn1.g((List) obj9, (p40) obj8, (hz5) obj7, (op41) obj6, i2, (xmu0) obj5, function0, iu30Var, (Function0) obj4, this.e, qim0Var, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.f | 1);
                int iP3 = czo1.p(i);
                int i3 = this.b;
                Function0 function1 = this.c;
                iu30 iu30Var2 = this.d;
                iu30 iu30Var3 = this.e;
                eko1.o((String) obj9, (ton1) obj8, (mvh1) obj7, i3, (String) obj6, (mvh1) obj5, (mvh1) obj4, function1, iu30Var2, iu30Var3, (bih1) obj3, (b0k) obj, iP2, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2y0(List list, p40 p40Var, hz5 hz5Var, op41 op41Var, int i, xmu0 xmu0Var, Function0 function0, iu30 iu30Var, Function0 function1, iu30 iu30Var2, qim0 qim0Var, int i2, int i3) {
        super(2);
        this.h = list;
        this.i = p40Var;
        this.t = hz5Var;
        this.X = op41Var;
        this.b = i;
        this.Y = xmu0Var;
        this.c = function0;
        this.d = iu30Var;
        this.Z = function1;
        this.e = iu30Var2;
        this.N0 = qim0Var;
        this.f = i2;
        this.g = i3;
    }
}
