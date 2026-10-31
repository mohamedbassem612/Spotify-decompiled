package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v9j0 extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ lee1 d;
    public final /* synthetic */ djc0 e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ v9j0(String str, long j, lee1 lee1Var, djc0 djc0Var, int i, qim0 qim0Var, int i2, iu30 iu30Var, String str2, int i3, int i4, byte b) {
        super(2);
        this.a = b;
        this.b = str;
        this.c = j;
        this.d = lee1Var;
        this.e = djc0Var;
        this.f = i;
        this.g = qim0Var;
        this.h = i2;
        this.i = iu30Var;
        this.t = str2;
        this.X = i3;
        this.Y = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.X;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                short s = this.Y;
                y9j0.q(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP, s);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                short s2 = this.Y;
                y9j0.q(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, iP2, s2);
                break;
        }
        return rih1Var;
    }
}
