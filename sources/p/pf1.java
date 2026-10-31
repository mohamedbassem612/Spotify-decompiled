package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pf1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ af5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf1(af5 af5Var, byte b) {
        super(3);
        this.a = b;
        this.b = af5Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                uwo1.d(this.b, cbx.a(b0kVar).b.b, uyn1.x(aqb0.e((aqb0) obj, nim0Var), 16.0f), cbx.d(b0kVar).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar, 0, 0, 4080);
                break;
            case 1:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar2 = cbx.a;
                uwo1.d(this.b, cbx.a(b0kVar2).b.b, uyn1.x(aqb0.e((aqb0) obj, anm1.N("DisclaimerText", nim0Var)), 16.0f), cbx.d(b0kVar2).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4080);
                break;
            case 2:
                ((Number) obj3).intValue();
                uwo1.f(this.b, (qim0) null, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, (b0k) obj2, 0, 0, 4094);
                break;
            case 3:
                ((Number) obj3).intValue();
                uwo1.f(this.b, (qim0) null, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, (b0k) obj2, 0, 0, 4094);
                break;
            case 4:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x340Var2.b0();
                } else {
                    dro.s(this.b, null, x340Var2, 0);
                }
                break;
            case 5:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                uwo1.f(this.b, (qim0) null, cbx.d(b0kVar3).j, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar3, 0, 0, 4090);
                break;
            case 6:
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar4 = cbx.a;
                uwo1.d(this.b, cbx.a(b0kVar4).b.b, (qim0) null, cbx.d(b0kVar4).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar4, 0, 0, 4084);
                break;
            default:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar5 = cbx.a;
                uwo1.f(this.b, anm1.N("playlist_invitation_share_row_card_subtitle", nim0Var), cbx.d(b0kVar5).m, (x9h) null, (a0e1) null, (iu30) null, 2, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar5, 0, 0, 4024);
                break;
        }
        return rih1Var;
    }
}
