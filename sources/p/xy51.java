package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xy51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ cv30 i;
    public final /* synthetic */ cv30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy51(int i, int i2, y9e1 y9e1Var, id01 id01Var, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i3) {
        super(2);
        this.b = i;
        this.e = i2;
        this.f = y9e1Var;
        this.g = id01Var;
        this.d = iu30Var;
        this.c = function0;
        this.h = function1;
        this.i = function2;
        this.t = function3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.t;
        vu30 vu30Var2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) vu30Var2;
                Function0 function1 = (Function0) vu30Var;
                int iP = czo1.p(102236673);
                int i = this.b;
                int i2 = this.e;
                iu30 iu30Var = this.d;
                Function0 function2 = this.c;
                yy51.a(i, i2, (y9e1) obj5, (id01) obj4, iu30Var, function2, (Function0) obj3, function0, function1, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.e | 1);
                int i3 = this.b;
                Function0 function3 = this.c;
                lmt0.n(i3, (qim0) obj5, function3, (xtb0) obj4, (h3h1) obj3, vu30Var2, vu30Var, this.d, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy51(int i, qim0 qim0Var, Function0 function0, xtb0 xtb0Var, h3h1 h3h1Var, vu30 vu30Var, vu30 vu30Var2, iu30 iu30Var, int i2) {
        super(2);
        this.b = i;
        this.f = qim0Var;
        this.c = function0;
        this.g = xtb0Var;
        this.h = h3h1Var;
        this.i = vu30Var;
        this.t = vu30Var2;
        this.d = iu30Var;
        this.e = i2;
    }
}
