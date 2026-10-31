package p;

import j$.time.LocalDate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kjd0 extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ iu30 X;
    public final /* synthetic */ qim0 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ LocalDate t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjd0(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, LocalDate localDate, iu30 iu30Var, qim0 qim0Var, int i2, int i3) {
        super(2);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.t = localDate;
        this.X = iu30Var;
        this.Y = qim0Var;
        this.Z = i2;
        this.N0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        int iP2 = czo1.p(this.N0);
        m0p1.h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2);
        return rih1.a;
    }
}
