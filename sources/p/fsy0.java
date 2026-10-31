package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fsy0 extends hab0 implements vu30 {
    public final /* synthetic */ nyn1 N0;
    public final /* synthetic */ int O0;
    public final /* synthetic */ int P0;
    public final /* synthetic */ jtl1 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ qim0 Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ vgo1 b;
    public final /* synthetic */ wd50 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ cm10 g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fsy0(vgo1 vgo1Var, wd50 wd50Var, String str, String str2, String str3, cm10 cm10Var, Function0 function0, Function0 function1, Function0 function2, jtl1 jtl1Var, boolean z, qim0 qim0Var, nyn1 nyn1Var, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = vgo1Var;
        this.c = wd50Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = cm10Var;
        this.h = function0;
        this.i = function1;
        this.t = function2;
        this.X = jtl1Var;
        this.Y = z;
        this.Z = qim0Var;
        this.N0 = nyn1Var;
        this.O0 = i;
        this.P0 = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.P0;
        int i2 = this.O0;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i2 | 1);
                int iP2 = czo1.p(i);
                l6o1.j(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, (b0k) obj, iP, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i2 | 1);
                int iP4 = czo1.p(i);
                l6o1.m(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, (b0k) obj, iP3, iP4);
                break;
        }
        return rih1Var;
    }
}
