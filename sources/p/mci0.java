package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mci0 extends a8d1 implements dv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ hwt b;
    public /* synthetic */ zkm c;
    public /* synthetic */ ijo d;
    public /* synthetic */ Object e;
    public final /* synthetic */ yy4 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mci0(Object obj, yy4 yy4Var, lnm lnmVar, byte b) {
        super(6, lnmVar);
        this.a = b;
        this.h = obj;
        this.f = yy4Var;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yy4 yy4Var = this.f;
        Object obj7 = this.h;
        switch (b) {
            case 0:
                mci0 mci0Var = new mci0((eci0) obj7, yy4Var, (lnm) obj6, (byte) 0);
                mci0Var.g = (hci0) obj;
                mci0Var.b = (hwt) obj2;
                mci0Var.c = (zkm) obj3;
                mci0Var.d = (ijo) obj4;
                mci0Var.e = (y2u0) obj5;
                return mci0Var.invokeSuspend(rih1Var);
            case 1:
                mci0 mci0Var2 = new mci0((uei0) obj7, yy4Var, (lnm) obj6, (byte) 1);
                mci0Var2.g = (xei0) obj;
                mci0Var2.b = (hwt) obj2;
                mci0Var2.c = (zkm) obj3;
                mci0Var2.d = (ijo) obj4;
                mci0Var2.e = (y2u0) obj5;
                return mci0Var2.invokeSuspend(rih1Var);
            default:
                mci0 mci0Var3 = new mci0((ohi0) obj7, yy4Var, (lnm) obj6, (byte) 2);
                mci0Var3.g = (rhi0) obj;
                mci0Var3.b = (hwt) obj2;
                mci0Var3.c = (zkm) obj3;
                mci0Var3.d = (ijo) obj4;
                mci0Var3.e = (sq51) obj5;
                return mci0Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        yy4 yy4Var = this.f;
        Object obj2 = this.h;
        switch (b) {
            case 0:
                hci0 hci0Var = (hci0) this.g;
                hwt hwtVar = this.b;
                zkm zkmVar = this.c;
                ijo ijoVar = this.d;
                y2u0 y2u0Var = (y2u0) this.e;
                hm5.M(obj);
                eci0 eci0Var = (eci0) obj2;
                return new lci0(new t810(new ioj0(), zkmVar, hwtVar, ijoVar, eci0Var.a, yy4Var.g(), true, eci0Var.c, false, eci0Var.d, eci0Var.f, eci0Var.g, y2u0Var, (sq51) null, false, eci0Var.k, eci0Var.l, 346880), hci0Var, (iix0) null);
            case 1:
                xei0 xei0Var = (xei0) this.g;
                hwt hwtVar2 = this.b;
                zkm zkmVar2 = this.c;
                ijo ijoVar2 = this.d;
                y2u0 y2u0Var2 = (y2u0) this.e;
                hm5.M(obj);
                uei0 uei0Var = (uei0) obj2;
                return new afi0(new t810(new ioj0(), zkmVar2, hwtVar2, ijoVar2, uei0Var.a, yy4Var.g(), uei0Var.c, uei0Var.d, false, uei0Var.e, uei0Var.g, uei0Var.h, y2u0Var2, (sq51) null, uei0Var.k, uei0Var.l, uei0Var.m, 84736), xei0Var);
            default:
                rhi0 rhi0Var = (rhi0) this.g;
                hwt hwtVar3 = this.b;
                zkm zkmVar3 = this.c;
                ijo ijoVar3 = this.d;
                sq51 sq51Var = (sq51) this.e;
                hm5.M(obj);
                ohi0 ohi0Var = (ohi0) obj2;
                return new cii0(new t810(new ioj0(), zkmVar3, hwtVar3, ijoVar3, true, yy4Var.g(), ohi0Var.b, ohi0Var.c, false, false, false, false, (y2u0) null, sq51Var, false, ohi0Var.e, ohi0Var.f, 323328), rhi0Var);
        }
    }
}
