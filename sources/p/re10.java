package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class re10 implements me10 {
    public final psw X;
    public final v5n a;
    public final qe10 b;
    public final bcq c;
    public final String d;
    public final r6h1 e;
    public final iu30 f;
    public final idd1 g = new idd1(new f710(this, (byte) 3));
    public final eih1 h = f3o1.u();
    public final e7m0 i;
    public final p40 t;

    public re10(gw70 gw70Var, v5n v5nVar, qe10 qe10Var, bcq bcqVar, Scheduler scheduler, Scheduler scheduler2, String str, r6h1 r6h1Var, iu30 iu30Var) {
        this.a = v5nVar;
        this.b = qe10Var;
        this.c = bcqVar;
        this.d = str;
        this.e = r6h1Var;
        this.f = iu30Var;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(zd10.class, new bk1(this, (byte) 17));
        Connectable connectableA = RxConnectables.a(subtypeEffectHandlerBuilderC.h());
        this.i = cxm.w(new gi00(this, (byte) 6), new dq7(this, (byte) 8), connectableA, new z691((avl1) this, (byte) 14), new djx(this, scheduler, scheduler2, (byte) 15));
        this.t = new p40((byte) 8);
        j2i j2iVarJ = apo.j(415065090, new t20(gw70Var, this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVarJ, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.X;
    }

    public final mqw getBehavior() {
        return this.i;
    }
}
