package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class g7v extends hab0 implements vu30 {
    public final /* synthetic */ h7v N0;
    public final /* synthetic */ Function0 X;
    public final /* synthetic */ iu30 Y;
    public final /* synthetic */ Function0 Z;
    public final /* synthetic */ Float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ gra d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ float h;
    public final /* synthetic */ vfx0 i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7v(Float f, float f2, float f3, gra graVar, String str, String str2, String str3, float f4, vfx0 vfx0Var, iu30 iu30Var, Function0 function0, iu30 iu30Var2, Function0 function1, h7v h7vVar, int i) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = graVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = f4;
        this.i = vfx0Var;
        this.t = iu30Var;
        this.X = function0;
        this.Y = iu30Var2;
        this.Z = function1;
        this.N0 = h7vVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(196615);
        bs51.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, (b0k) obj, iP);
        return rih1.a;
    }
}
