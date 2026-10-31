package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xbn0 extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ qim0 Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ u7h d;
    public final /* synthetic */ cbn0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ j2i i;
    public final /* synthetic */ vu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbn0(String str, String str2, String str3, u7h u7hVar, cbn0 cbn0Var, Function0 function0, Function0 function1, vu30 vu30Var, j2i j2iVar, vu30 vu30Var2, boolean z, boolean z2, qim0 qim0Var, int i) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = u7hVar;
        this.e = cbn0Var;
        this.f = function0;
        this.g = function1;
        this.h = vu30Var;
        this.i = j2iVar;
        this.t = vu30Var2;
        this.X = z;
        this.Y = z2;
        this.Z = qim0Var;
        this.N0 = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.N0 | 1);
        ybn0.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, (b0k) obj, iP);
        return rih1.a;
    }
}
