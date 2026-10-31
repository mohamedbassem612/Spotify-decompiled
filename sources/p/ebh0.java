package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ebh0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebh0(q401 q401Var, boolean z, boolean z2, boolean z3, o501 o501Var, ven0 ven0Var, hdn0 hdn0Var, boolean z4, e601 e601Var) {
        super(2);
        this.f = q401Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.g = o501Var;
        this.h = ven0Var;
        this.i = hdn0Var;
        this.e = z4;
        this.t = e601Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(196609);
                a6o1.g(this.b, this.c, this.d, this.e, (Function0) obj7, (iu30) obj3, (Function0) obj6, (Function0) obj5, (Function0) obj4, (b0k) obj, iP);
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    mod.b(oi7.a.a(((q401) obj7).d), apo.r(-162423003, new p401(this.b, this.c, this.d, (o501) obj6, (ven0) obj5, (hdn0) obj4, this.e, (e601) obj3), x340Var2), x340Var2, 56);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebh0(boolean z, boolean z2, boolean z3, boolean z4, Function0 function0, iu30 iu30Var, Function0 function1, Function0 function2, Function0 function3, int i) {
        super(2);
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = function0;
        this.t = iu30Var;
        this.g = function1;
        this.h = function2;
        this.i = function3;
    }
}
