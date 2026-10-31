package p;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class frw0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p1f0 b;
    public final /* synthetic */ iew c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ frw0(p1f0 p1f0Var, iew iewVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = p1f0Var;
        this.c = iewVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iew iewVar = this.c;
        p1f0 p1f0Var = this.b;
        switch (b) {
            case 0:
                return new frw0(p1f0Var, iewVar, lnmVar, (byte) 0);
            case 1:
                return new frw0(p1f0Var, iewVar, lnmVar, (byte) 1);
            default:
                return new frw0(p1f0Var, iewVar, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iew iewVar = this.c;
        p1f0 p1f0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ((rgy) p1f0Var.c).b(iewVar.b);
                return rih1Var;
            case 1:
                hm5.M(obj);
                lzn0 lzn0Var = (lzn0) p1f0Var.b;
                zpn zpnVar = ((dqn) p1f0Var.e).b.c;
                if ((zpnVar instanceof zpn) && zpnVar.b) {
                    tv80 tv80Var = iewVar.c;
                    ytw0 ytw0Var = jfv.b;
                    vx61 vx61Var = new vx61(tv80Var, fdg1.k0(1000, ngv.d), wls0.f);
                    String str = iewVar.a;
                    tv80 tv80Var2 = iewVar.c;
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("list-entity-music-shared-action", vx61Var);
                    lzn0Var.a(str, tv80Var2, bundle);
                } else {
                    lzn0Var.a(iewVar.a, iewVar.c, (Bundle) null);
                }
                return rih1Var;
            default:
                hm5.M(obj);
                lzn0 lzn0Var2 = (lzn0) p1f0Var.b;
                a1r0 a1r0Var = (a1r0) p1f0Var.d;
                dqn dqnVar = (dqn) p1f0Var.e;
                if (dqnVar.a && (dqnVar.b.c instanceof zpn)) {
                    ((cir0) p1f0Var.h).c().a(new y231(new eqn(iewVar.a, iewVar.c)));
                } else if (a1r0Var.h((Activity) p1f0Var.a)) {
                    a1r0Var.g();
                } else {
                    aqn aqnVar = dqnVar.b.c;
                    if (aqnVar instanceof vpn) {
                        lzn0Var2.e();
                    } else {
                        if (!(aqnVar instanceof zpn)) {
                            eg.o();
                            return null;
                        }
                        lzn0Var2.c();
                    }
                }
                return rih1Var;
        }
    }
}
