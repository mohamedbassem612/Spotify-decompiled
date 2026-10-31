package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ubk0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubk0(Function0 function0, int i, boolean z, qim0 qim0Var, float f, boolean z2, boolean z3, String str, int i2) {
        super(2);
        this.b = function0;
        this.c = i;
        this.d = z;
        this.e = qim0Var;
        this.f = f;
        this.g = z2;
        this.h = z3;
        this.i = str;
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
                    g3p1.g(this.b, this.c, this.d, anm1.N("mixing_play_button", this.e), this.f, this.g, this.h, this.i, x340Var2, 0);
                }
                break;
            default:
                ((Number) obj2).intValue();
                g3p1.g(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubk0(qim0 qim0Var, Function0 function0, int i, boolean z, float f, boolean z2, boolean z3, String str) {
        super(2);
        this.e = qim0Var;
        this.b = function0;
        this.c = i;
        this.d = z;
        this.f = f;
        this.g = z2;
        this.h = z3;
        this.i = str;
    }
}
