package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.Connectables;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp/dqd0;", "Lp/zf30;", "Lp/ug30;", "Lp/fn10;", "Lp/jik1;", "<init>", "()V", "src_main_java_com_spotify_liveroom_nowplayingbar-nowplayingbar"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class dqd0 extends zf30 implements ug30, fn10, jik1 {
    public final gn10 F1;
    public q1p0 G1;
    public d3q H1;
    public ns10 I1;
    public m7p0 J1;
    public MobiusLoop.Controller K1;
    public kqd0 L1;
    public final idd1 M1;
    public final lik1 N1;

    public dqd0() {
        gn10 gn10Var = mno1.G;
        this.F1 = gn10Var;
        this.M1 = new idd1(new jgd0(this, (byte) 4));
        wwo1.J(this, new a690(gn10Var));
        this.N1 = nik1.L2;
    }

    public final String A(Context context) {
        return "";
    }

    public final void D0() {
        MobiusLoop.Controller controller = this.K1;
        if (controller == null) {
            u890.C("mobiusController");
            throw null;
        }
        controller.stop();
        ((zf30) this).h1 = true;
        ns10 ns10Var = this.I1;
        if (ns10Var != null) {
            ns10Var.d.c();
        } else {
            u890.C("liveRoomStreamErrorPresenter");
            throw null;
        }
    }

    public final void E0() {
        ((zf30) this).h1 = true;
        MobiusLoop.Controller controller = this.K1;
        if (controller == null) {
            u890.C("mobiusController");
            throw null;
        }
        controller.start();
        ns10 ns10Var = this.I1;
        if (ns10Var != null) {
            ns10Var.a();
        } else {
            u890.C("liveRoomStreamErrorPresenter");
            throw null;
        }
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        MobiusLoop.Controller controller = this.K1;
        if (controller == null) {
            u890.C("mobiusController");
            throw null;
        }
        f610 f610Var = f610.X;
        kqd0 kqd0Var = this.L1;
        if (kqd0Var == null) {
            u890.C("views");
            throw null;
        }
        controller.c(Connectables.a(f610Var, kqd0Var));
        m7p0 m7p0Var = this.J1;
        if (m7p0Var == null) {
            u890.C("nowPlayingVisibilityStateUpdater");
            throw null;
        }
        l7p0 l7p0Var = (l7p0) this.M1.getValue();
        Bundle bundle = ((zf30) this).f;
        m7p0Var.b(l7p0Var, new g7p0(bundle != null ? bundle.getBoolean("large_screen_layout_enabled", false) : false));
    }

    public final void H0() {
        MobiusLoop.Controller controller = this.K1;
        if (controller == null) {
            u890.C("mobiusController");
            throw null;
        }
        controller.disconnect();
        ((zf30) this).h1 = true;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getF1() {
        return this.F1;
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.G1("NOWPLAYING_LIVEROOMNOWPLAYINGBAR", "nowplaying/liveroomnowplayingbar", 1356, "nowplaying"), (qir0) null, 4));
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getN1() {
        return this.N1;
    }

    public final String s() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("NOWPLAYING_LIVEROOMNOWPLAYINGBAR", "nowplaying/liveroomnowplayingbar", 1356, "nowplaying").a;
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q1p0 q1p0Var = this.G1;
        if (q1p0Var == null) {
            u890.C("injector");
            throw null;
        }
        this.K1 = q1p0Var.a(cto1.q(n0()));
        d3q d3qVar = this.H1;
        if (d3qVar == null) {
            u890.C("viewsFactory");
            throw null;
        }
        Bundle bundle2 = ((zf30) this).f;
        boolean z = bundle2 != null ? bundle2.getBoolean("large_screen_layout_enabled", false) : false;
        p2q p2qVar = d3qVar.a;
        teq teqVar = p2qVar.d;
        toj0 toj0Var = (toj0) p2qVar.e;
        daq daqVar = (daq) toj0Var.c;
        daq daqVar2 = p2qVar.b;
        xzf xzfVarE = teqVar.b.E();
        r7q r7qVar = teqVar.N0;
        ziq ziqVar = teqVar.a;
        Resources resources = (Resources) r7qVar.get();
        gw70 gw70Var = (gw70) daqVar2.d8.get();
        ruz ruzVarA = ((cyp) ((jly0) toj0Var.e).get()).a();
        gn10 gn10VarR = j310.r((dqd0) toj0Var.b);
        Flowable flowable = (Flowable) daqVar.D5.get();
        qs10 qs10Var = qs10.b1;
        dfm dfmVar = new dfm(ruzVarA, gn10VarR, flowable.x(qs10Var).j(mo9.Y).J(a020.a1), ((Flowable) daqVar.D5.get()).j(mo9.O0), ((Flowable) daqVar.D5.get()).j(mo9.N0), ((Flowable) daqVar.D5.get()).x(qs10Var).J(fj10.Z0).t(Functions.a), (pe) daqVar.p9.get(), new qmr((in4) ((p2q) toj0Var.f).get()));
        snr snrVar = (snr) ziqVar.Jb.get();
        for forVar = (for) ziqVar.Lb.get();
        i8h1 i8h1Var = (i8h1) daqVar.A5.get();
        h0p0 h0p0VarW = k9o0.w();
        tzo tzoVarY = h1l.y((b8p) daqVar.f4.get());
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        kqd0 kqd0Var = new kqd0(layoutInflater, viewGroup, z, xzfVarE, resources, gw70Var, dfmVar, snrVar, forVar, new cr6(i8h1Var, h0p0VarW, new rzo0(tzoVarY, yon1.Y2(), nik1.m1, (byte) 0), (m7p0) daqVar.q9.get(), new x5j1((ao0) daqVar.Hk.get(), (byte) 4)), (i8h1) daqVar2.A5.get(), (l6h1) daqVar2.fg.get(), k9o0.w(), (cqd0) teqVar.b.Qa.get());
        this.L1 = kqd0Var;
        Bundle bundle3 = ((zf30) this).f;
        boolean z2 = bundle3 != null ? bundle3.getBoolean("large_screen_layout_enabled", false) : false;
        View view = kqd0Var.h;
        if (z2) {
            fn31.T(cto1.q(n0()), (o8n) null, 0, new q4d0(this, view, (lnm) null, (byte) 14), 3);
        }
        return view;
    }

    public final void y0() {
        m7p0 m7p0Var = this.J1;
        if (m7p0Var == null) {
            u890.C("nowPlayingVisibilityStateUpdater");
            throw null;
        }
        m7p0Var.a((l7p0) this.M1.getValue());
        ((zf30) this).h1 = true;
    }
}
