package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o4k0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ s5k0 b;
    public final /* synthetic */ r4k0 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4k0(r4k0 r4k0Var, s5k0 s5k0Var, iu30 iu30Var) {
        super(3);
        this.c = r4k0Var;
        this.b = s5k0Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        r4k0 r4k0Var = this.c;
        s5k0 s5k0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                r4k0Var.e(s5k0Var, iu30Var, (b0k) obj2, 0);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                eth.a(s5k0Var.c, (qim0) null, irn1.o0(500, 0, (dlv) null, 6), "status-crossfade", apo.r(1101210180, new c9y(r4k0Var, (vzq0) obj, s5k0Var, iu30Var), b0kVar), b0kVar, 27648, 2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4k0(s5k0 s5k0Var, r4k0 r4k0Var, iu30 iu30Var) {
        super(3);
        this.b = s5k0Var;
        this.c = r4k0Var;
        this.d = iu30Var;
    }
}
