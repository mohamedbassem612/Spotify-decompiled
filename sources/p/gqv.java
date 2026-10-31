package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gqv extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqv(int i, String str, Function0 function0, fe5 fe5Var, qim0 qim0Var, idn0 idn0Var, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2);
        this.b = str;
        this.f = z;
        this.h = z2;
        this.i = z3;
        this.c = function0;
        this.e = qim0Var;
        this.t = z4;
        this.g = fe5Var;
        this.X = idn0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.X;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ((vqv) obj7).h((ftv) obj6, this.d, (ftv) obj5, this.f, (ru31) obj4, this.h, this.i, this.t, (cqs0) obj3, x340Var2, 0);
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                int i = this.d;
                boolean z = this.f;
                ((vqv) obj7).h((ftv) obj6, i, (ftv) obj5, z, (ru31) obj4, this.h, this.i, this.t, (cqs0) obj3, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                g0p1.h(czo1.p(this.d | 1), (String) obj7, (Function0) obj6, (fe5) obj4, (b0k) obj, (qim0) obj5, (idn0) obj3, this.f, this.h, this.i, this.t);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqv(vqv vqvVar, ftv ftvVar, int i, ftv ftvVar2, boolean z, ru31 ru31Var, boolean z2, boolean z3, boolean z4, cqs0 cqs0Var) {
        super(2);
        this.b = vqvVar;
        this.c = ftvVar;
        this.d = i;
        this.e = ftvVar2;
        this.f = z;
        this.g = ru31Var;
        this.h = z2;
        this.i = z3;
        this.t = z4;
        this.X = cqs0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqv(vqv vqvVar, ftv ftvVar, int i, ftv ftvVar2, boolean z, ru31 ru31Var, boolean z2, boolean z3, boolean z4, cqs0 cqs0Var, int i2) {
        super(2);
        this.b = vqvVar;
        this.c = ftvVar;
        this.d = i;
        this.e = ftvVar2;
        this.f = z;
        this.g = ru31Var;
        this.h = z2;
        this.i = z3;
        this.t = z4;
        this.X = cqs0Var;
    }
}
