package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ww90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww90(float f, boolean z, wfx0 wfx0Var, iu30 iu30Var, iu30 iu30Var2, j2i j2iVar, qim0 qim0Var, int i) {
        super(2);
        j2i j2iVar2 = caj.a;
        this.b = f;
        this.c = z;
        this.f = wfx0Var;
        this.d = iu30Var;
        this.g = iu30Var2;
        this.h = j2iVar;
        this.i = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                acq0.t((lw90) obj6, (d6o0) obj5, (ldo) obj4, (ng20) obj3, this.c, this.d, this.b, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                j2i j2iVar = caj.a;
                int iP2 = czo1.p(i | 1);
                float f = this.b;
                boolean z = this.c;
                iu30 iu30Var = this.d;
                mym.h(f, z, (wfx0) obj6, iu30Var, (iu30) obj5, (j2i) obj4, (qim0) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww90(lw90 lw90Var, d6o0 d6o0Var, ldo ldoVar, ng20 ng20Var, boolean z, iu30 iu30Var, float f, int i) {
        super(2);
        this.f = lw90Var;
        this.g = d6o0Var;
        this.h = ldoVar;
        this.i = ng20Var;
        this.c = z;
        this.d = iu30Var;
        this.b = f;
        this.e = i;
    }
}
