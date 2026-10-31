package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jvw extends hab0 implements vu30 {
    public final /* synthetic */ Function0 N0;
    public final /* synthetic */ qim0 O0;
    public final /* synthetic */ int P0;
    public final /* synthetic */ int Q0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ Function0 Z;
    public final /* synthetic */ vvw a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvw(vvw vvwVar, int i, String str, iu30 iu30Var, iu30 iu30Var2, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, boolean z, String str2, Function0 function5, Function0 function6, qim0 qim0Var, int i2, int i3) {
        super(2);
        this.a = vvwVar;
        this.b = i;
        this.c = str;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = function0;
        this.g = function1;
        this.h = function2;
        this.i = function3;
        this.t = function4;
        this.X = z;
        this.Y = str2;
        this.Z = function5;
        this.N0 = function6;
        this.O0 = qim0Var;
        this.P0 = i2;
        this.Q0 = i3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.P0 | 1);
        int iP2 = czo1.p(this.Q0);
        dgo1.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}
