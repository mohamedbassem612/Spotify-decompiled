package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class krf extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ Function0 X;
    public final /* synthetic */ xu30 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ vu30 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krf(String str, j2i j2iVar, float f, boolean z, vu30 vu30Var, float f2, float f3, String str2, String str3, Function0 function0, Function0 function1, xu30 xu30Var, int i, int i2) {
        super(2);
        this.a = str;
        this.b = j2iVar;
        this.c = f;
        this.d = z;
        this.e = vu30Var;
        this.f = f2;
        this.g = f3;
        this.h = str2;
        this.i = str3;
        this.t = function0;
        this.X = function1;
        this.Y = xu30Var;
        this.Z = i;
        this.N0 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        int iP2 = czo1.p(this.N0);
        wwo1.m(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}
