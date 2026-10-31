package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lcu0 extends hab0 implements vu30 {
    public final /* synthetic */ short N0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lcu0(String str, String str2, String str3, String str4, boolean z, int i, qim0 qim0Var, String str5, boolean z2, String str6, boolean z3, int i2, int i3, int i4) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
        this.g = qim0Var;
        this.h = str5;
        this.i = z2;
        this.t = str6;
        this.X = z3;
        this.Y = i2;
        this.Z = i3;
        this.N0 = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Y | 1);
        int iP2 = czo1.p(this.Z);
        short s = this.N0;
        t3p1.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
