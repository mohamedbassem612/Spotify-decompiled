package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mz80 extends hab0 implements vu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ qim0 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz80(String str, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, boolean z4, boolean z5, boolean z6, int i) {
        super(2);
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = function0;
        this.f = function1;
        this.g = function2;
        this.h = qim0Var;
        this.i = z4;
        this.t = z5;
        this.X = z6;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        nz80.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP);
        return rih1.a;
    }
}
