package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ffb extends hab0 implements vu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffb(String str, String str2, String str3, iu30 iu30Var, qim0 qim0Var, String str4, String str5, Function0 function0, Function0 function1, Function0 function2, boolean z, int i, int i2) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = iu30Var;
        this.e = qim0Var;
        this.f = str4;
        this.g = str5;
        this.h = function0;
        this.i = function1;
        this.t = function2;
        this.X = z;
        this.Y = i;
        this.Z = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        int iP2 = czo1.p(this.Z);
        qtg.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}
