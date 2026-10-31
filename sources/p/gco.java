package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gco extends hab0 implements vu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ short O0;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ iu30 Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ res i;
    public final /* synthetic */ rao t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gco(String str, String str2, qim0 qim0Var, boolean z, long j, String str3, String str4, boolean z2, res resVar, rao raoVar, boolean z3, iu30 iu30Var, int i, int i2, int i3) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = qim0Var;
        this.d = z;
        this.e = j;
        this.f = str3;
        this.g = str4;
        this.h = z2;
        this.i = resVar;
        this.t = raoVar;
        this.X = z3;
        this.Y = iu30Var;
        this.Z = i;
        this.N0 = i2;
        this.O0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.Z | 1);
        int iP2 = czo1.p(this.N0);
        short s = this.O0;
        luo1.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (b0k) obj, iP, iP2, s);
        return rih1.a;
    }
}
