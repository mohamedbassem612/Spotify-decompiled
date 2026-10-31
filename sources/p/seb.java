package p;

import j$.time.Clock;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class seb extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public seb(String str, Function0 function0, iu30 iu30Var, qim0 qim0Var, max maxVar, tra0 tra0Var, w9u0 w9u0Var, boolean z, String str2, Function0 function1, boolean z2, int i) {
        super(2);
        this.f = str;
        this.b = function0;
        this.i = iu30Var;
        this.e = qim0Var;
        this.g = maxVar;
        this.h = tra0Var;
        this.X = w9u0Var;
        this.c = z;
        this.Y = str2;
        this.t = function1;
        this.d = z2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.t;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.i;
        Object obj9 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                int iP = czo1.p(1);
                boolean z = this.c;
                boolean z2 = this.d;
                Function0 function0 = this.b;
                vbe.r((eus0) obj9, z, (y7e1) obj7, z2, (lz20) obj6, (iu30) obj8, function0, (Function0) obj3, (Function0) obj5, (xu30) obj4, qim0Var, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                Function0 function1 = this.b;
                boolean z3 = this.c;
                boolean z4 = this.d;
                qim0 qim0Var2 = this.e;
                i8p1.f((t7q0) obj9, (bc71) obj7, function1, (yxb0) obj6, (nu) obj8, (yuu0) obj3, (e821) obj5, z3, z4, qim0Var2, (tyq) obj4, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                qim0 qim0Var3 = this.e;
                boolean z5 = this.c;
                boolean z6 = this.d;
                Function0 function2 = this.b;
                im80.e((List) obj9, (iu30) obj8, (iu30) obj7, qim0Var3, (Set) obj6, (kl80) obj3, z5, z6, function2, (iu30) obj5, (Clock) obj4, (b0k) obj, iP3);
                break;
            default:
                ((Number) obj2).intValue();
                boolean z7 = this.d;
                int iP4 = czo1.p(1);
                Function0 function3 = this.b;
                qim0 qim0Var4 = this.e;
                boolean z8 = this.c;
                nz80.d((String) obj9, function3, (iu30) obj8, qim0Var4, (max) obj7, (tra0) obj6, (w9u0) obj5, z8, (String) obj4, (Function0) obj3, z7, (b0k) obj, iP4);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public seb(List list, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, Set set, kl80 kl80Var, boolean z, boolean z2, Function0 function0, iu30 iu30Var3, Clock clock, int i) {
        super(2);
        this.f = list;
        this.i = iu30Var;
        this.g = iu30Var2;
        this.e = qim0Var;
        this.h = set;
        this.t = kl80Var;
        this.c = z;
        this.d = z2;
        this.b = function0;
        this.X = iu30Var3;
        this.Y = clock;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public seb(t7q0 t7q0Var, bc71 bc71Var, Function0 function0, yxb0 yxb0Var, nu nuVar, yuu0 yuu0Var, e821 e821Var, boolean z, boolean z2, qim0 qim0Var, tyq tyqVar, int i) {
        super(2);
        this.f = t7q0Var;
        this.g = bc71Var;
        this.b = function0;
        this.h = yxb0Var;
        this.i = nuVar;
        this.t = yuu0Var;
        this.X = e821Var;
        this.c = z;
        this.d = z2;
        this.e = qim0Var;
        this.Y = tyqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public seb(eus0 eus0Var, boolean z, y7e1 y7e1Var, boolean z2, lz20 lz20Var, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, xu30 xu30Var, qim0 qim0Var, int i) {
        super(2);
        this.f = eus0Var;
        this.c = z;
        this.g = y7e1Var;
        this.d = z2;
        this.h = lz20Var;
        this.i = iu30Var;
        this.b = function0;
        this.t = function1;
        this.X = function2;
        this.Y = xu30Var;
        this.e = qim0Var;
    }
}
