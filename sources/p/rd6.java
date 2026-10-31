package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rd6 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ hw61 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rd6(hw61 hw61Var, int i, float f, qim0 qim0Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, int i2, int i3) {
        super(2);
        this.a = hw61Var;
        this.b = i;
        this.c = f;
        this.d = qim0Var;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = function3;
        this.i = function4;
        this.t = function5;
        this.X = i2;
        this.Y = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        lgo1.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, czo1.p(this.X | 1), this.Y);
        return rih1.a;
    }
}
