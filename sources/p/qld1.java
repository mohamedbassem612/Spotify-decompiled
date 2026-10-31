package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qld1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mmd1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qld1(mmd1 mmd1Var, byte b) {
        super(2);
        this.a = b;
        this.b = mmd1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        byte b3 = 0;
        byte b4 = 15;
        mmd1 mmd1Var = this.b;
        switch (b) {
            case 0:
                vcq vcqVar = mmd1Var.z;
                epb1 epb1Var = new epb1((zob1) obj);
                vcqVar.getClass();
                return new kpg0(new dd50(epb1Var), new old1(mmd1Var, b3));
            case 1:
                return new kpg0(new na9(mmd1Var.y.a, (byte) 6), new old1(mmd1Var, b2));
            case 2:
                r7q r7qVar = mmd1Var.A.a;
                teq teqVar = r7qVar.d;
                lsr lsrVar = (lsr) teqVar.Fd.get();
                z710 z710Var = (z710) teqVar.q9.get();
                daq daqVar = r7qVar.b;
                return new kpg0(new uus0((zob1) obj, lsrVar, z710Var, (gw70) daqVar.d8.get(), (zcq) teqVar.qh.get(), (zwz0) daqVar.U1.get()), new old1(mmd1Var, (byte) 5));
            case 3:
                return new kpg0(new nu(mmd1Var.a.getString(2131953500)), vkd1.P0);
            case 4:
                return new kpg0(new rm0(mmd1Var.i.a, (zob1) obj), new old1(mmd1Var, (byte) 9));
            case 5:
                return new kpg0(new nu(mmd1Var.a.getString(2131952594)), vkd1.R0);
            case 6:
                return new kpg0(mmd1Var.w.a((zob1) obj, c6g1.a, new kt31(true)), vkd1.U0);
            case 7:
                return new jpg0(new d83((byte) 1), new old1(mmd1Var, (byte) 8));
            case 8:
                return new jpg0(new mnb((ahr) ((scq) mmd1Var.f).b.d.Gd.get(), (zob1) obj), new old1(mmd1Var, (byte) 13));
            case 9:
                return new jpg0(mmd1Var.g.a((zob1) obj, mmd1Var.h), new old1(mmd1Var, b4));
            case 10:
                return new kpg0(new nu(mmd1Var.a.getString(2131960844)), vkd1.Y0);
            case 11:
                String str = (String) obj;
                est0 est0Var = mmd1Var.r;
                Set setSingleton = Collections.singleton(str);
                Flowable flowable = est0Var.a;
                vbm[] vbmVarArr = q601.a;
                return t5p1.j(new xkb1(new ks4(hu20.c(new kge(flowable), new zs40(setSingleton, (lnm) null, (byte) 1)), str, (byte) 4), (byte) 1), 3);
            case 12:
                hur hurVar = mmd1Var.s;
                return new soy0(Observable.defer(new zes(hurVar, (String) obj)).subscribeOn((Scheduler) hurVar.c).map(v560.W0).map(f2x0.S0).toFlowable(BackpressureStrategy.c));
            case 13:
                return new kpg0(mmd1Var.C, zld1.V0);
            case 14:
                return new kpg0(new qj0(new w460(mmd1Var.n, false, true, false, (a1r0) null, 56), imd1.Y), new old1(mmd1Var, (byte) 20));
            case 15:
                return new kpg0(new qj0(new smp0(mmd1Var.D, (xcq) mmd1Var.m.a.d.oh.get()), sld1.Z0), zld1.Y0);
            case 16:
                return new kpg0(new qj0(new w460(mmd1Var.n, false, true, false, (a1r0) null, 56), imd1.Y), new old1(mmd1Var, (byte) 21));
            case 17:
                mmd1Var.n.a((String) obj, (tv80) obj2, (Bundle) null);
                return rih1Var;
            default:
                kpc kpcVar = (kpc) obj;
                kpcVar.d((6 & 2) != 0 ? 1 : 2, (String) mmd1Var.E.getValue(), new old1(mmd1Var, (byte) 19), false);
                mp8 mp8Var = new mp8(new qld1(mmd1Var, (byte) 17), (byte) 15);
                kpcVar.b((String) mmd1Var.F.getValue(), null, false, false, false, null, iub.d1, new zu11(new rsc1(mmd1Var, (y1c1) obj2, mp8Var, (byte) 4)));
                p410 p410Var = mmd1Var.H;
                kpcVar.d((6 & 2) != 0 ? 1 : 2, (String) ((idd1) p410Var.h).getValue(), new mc10(p410Var, mmd1Var.b, (byte) 1), false);
                kpcVar.d(2, (String) mmd1Var.G.getValue(), new old1(mmd1Var, (byte) 23), false);
                kpcVar.n = orc1.X;
                return rih1Var;
        }
    }
}
