package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class beg1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xdg1 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ xv81 d;
    public final /* synthetic */ et90 e;
    public final /* synthetic */ qj0 f;
    public final /* synthetic */ zhy g;
    public final /* synthetic */ u710 h;
    public final /* synthetic */ ldo i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ beg1(xdg1 xdg1Var, iu30 iu30Var, xv81 xv81Var, et90 et90Var, qj0 qj0Var, zhy zhyVar, u710 u710Var, ldo ldoVar, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xdg1Var;
        this.c = iu30Var;
        this.d = xv81Var;
        this.e = et90Var;
        this.f = qj0Var;
        this.g = zhyVar;
        this.h = u710Var;
        this.i = ldoVar;
        this.t = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                boolean z = this.t;
                int iP = czo1.p(1);
                ha71.m(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, z, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                boolean z2 = this.t;
                int iP2 = czo1.p(1);
                ha71.m(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, z2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
