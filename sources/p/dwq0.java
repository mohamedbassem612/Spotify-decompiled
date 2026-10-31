package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dwq0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ zf11 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ vu30 f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ Function0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwq0(zf11 zf11Var, iu30 iu30Var, Function0 function0, Function0 function1, vu30 vu30Var, iu30 iu30Var2, Function0 function2, int i) {
        super(2);
        this.b = zf11Var;
        this.c = iu30Var;
        this.d = function0;
        this.e = function1;
        this.f = vu30Var;
        this.g = iu30Var2;
        this.h = function2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    mod.b(t331.a.a(this.b), apo.r(1493162510, new ydi0(cgj1.G(x340Var2), this.c, this.g, this.d, this.e, this.h, this.f), x340Var2), x340Var2, 56);
                }
                break;
            default:
                ((Number) obj2).intValue();
                mth1.h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwq0(zf11 zf11Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, Function0 function2, vu30 vu30Var) {
        super(2);
        this.b = zf11Var;
        this.c = iu30Var;
        this.g = iu30Var2;
        this.d = function0;
        this.e = function1;
        this.h = function2;
        this.f = vu30Var;
    }
}
