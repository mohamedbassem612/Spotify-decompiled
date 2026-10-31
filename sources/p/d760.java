package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d760 extends hab0 implements vu30 {
    public final /* synthetic */ gw70 X;
    public final /* synthetic */ esv0 Y;
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d760(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function0 function0, Function0 function1, Function0 function2, gw70 gw70Var, esv0 esv0Var, int i) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = function0;
        this.i = function1;
        this.t = function2;
        this.X = gw70Var;
        this.Y = esv0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        ejo1.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP);
        return rih1.a;
    }
}
