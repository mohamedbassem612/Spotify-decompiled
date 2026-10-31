package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.Connectables;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lp/o0p0;", "Lp/fac0;", "Lp/ug30;", "Lp/o6r0;", "Lp/jik1;", "<init>", "()V", "p/vhc", "src_main_java_com_spotify_nowplayingbar_nowplayingbarpage-nowplayingbarpage"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public final class o0p0 extends fac0 implements ug30, o6r0, jik1 {
    public final gn10 G1;
    public q1p0 H1;
    public cr6 I1;
    public o3q J1;
    public rzo0 K1;
    public m7p0 L1;
    public gh4 M1;
    public drj0 N1;
    public lnn0 O1;
    public MobiusLoop.Controller P1;
    public j2p0 Q1;
    public m1p0 R1;
    public fdc S1;
    public Function0 T1;
    public final idd1 U1;
    public b0c V1;
    public final idd1 W1;
    public final lik1 X1;

    public o0p0() {
        gn10 gn10Var = mno1.J;
        this.G1 = gn10Var;
        this.U1 = new idd1(new n0p0(this, (byte) 0));
        this.W1 = new idd1(new n0p0(this, (byte) 1));
        wwo1.J(this, new a690(gn10Var));
        this.X1 = nik1.m1;
    }

    public final String A(Context context) {
        return "";
    }

    public final void D0() {
        if (!Y0()) {
            MobiusLoop.Controller controller = this.P1;
            if (controller == null) {
                u890.C("mobiusController");
                throw null;
            }
            controller.stop();
        }
        super.D0();
    }

    public final void E0() {
        super.E0();
        if (Y0()) {
            return;
        }
        MobiusLoop.Controller controller = this.P1;
        if (controller != null) {
            controller.start();
        } else {
            u890.C("mobiusController");
            throw null;
        }
    }

    public final void G0() {
        super.G0();
        if (!Y0()) {
            MobiusLoop.Controller controller = this.P1;
            if (controller == null) {
                u890.C("mobiusController");
                throw null;
            }
            controller.c(Connectables.a(new hod0(this, (byte) 26), this.Q1));
        }
        cr6 cr6Var = this.I1;
        if (cr6Var == null) {
            u890.C("hatsConnectable");
            throw null;
        }
        m1p0 m1p0Var = this.R1;
        m1p0Var.getClass();
        this.V1 = new b0c((n1b0) cr6Var.L(new y11(m1p0Var, (byte) 15)), (byte) 5);
        m7p0 m7p0Var = this.L1;
        if (m7p0Var != null) {
            m7p0Var.b((l7p0) this.U1.getValue(), new g7p0(Z0()));
        } else {
            u890.C("nowPlayingVisibilityStateUpdater");
            throw null;
        }
    }

    public final void H0() {
        if (!Y0()) {
            MobiusLoop.Controller controller = this.P1;
            if (controller == null) {
                u890.C("mobiusController");
                throw null;
            }
            controller.disconnect();
        }
        b0c b0cVar = this.V1;
        if (b0cVar != null) {
            b0cVar.dispose();
        }
        this.V1 = null;
        super.H0();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    public final void I0(View view, Bundle bundle) {
        fdc fdcVar;
        super.I0(view, bundle);
        lnn0 lnn0Var = this.O1;
        lnm lnmVar = null;
        if (lnn0Var == null) {
            u890.C("navCatcherRegistry");
            throw null;
        }
        Bundle bundle2 = ((zf30) this).f;
        boolean z = bundle2 != null ? bundle2.getBoolean("embedded_in_bottom_sheet") : false;
        Bundle bundle3 = ((zf30) this).f;
        boolean z2 = bundle3 != null ? bundle3.getBoolean("large_screen_layout_enabled") : false;
        Bundle bundle4 = ((zf30) this).f;
        boolean z3 = bundle4 != null ? bundle4.getBoolean("emits_pane_events") : false;
        lik1 lik1Var = nik1.m1;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        p6r0 p6r0VarY2 = yon1.Y2();
        mir0 mir0Var = new mir0(kx40.g(yon1.Y2(), (qir0) null, 4));
        byte b = 1;
        if (z) {
            fdcVar = null;
        } else if (z2) {
            fdcVar = new fdc(lnn0.b(lnn0Var, onr0.b, 4), lik1Var, p6r0VarY2, mir0Var, (byte) 24);
        } else if (z3) {
            fdcVar = new fdc(lnn0.b(lnn0Var, onr0.c, 1), lik1Var, p6r0VarY2, mir0Var, (byte) 24);
        } else {
            fdcVar = null;
        }
        this.S1 = fdcVar;
        if (fdcVar != null) {
            fn31.T(cto1.q(n0()), (o8n) null, 0, new k0p0(this, fdcVar, lnmVar, b), 3);
        }
        if (Y0()) {
            fn31.T(cto1.q(n0()), (o8n) null, 0, new cto0(this, N0(), lnmVar, (byte) 2), 3);
        }
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final gn10 getG1() {
        return this.G1;
    }

    public final boolean Y0() {
        return ((Boolean) this.W1.getValue()).booleanValue();
    }

    public final boolean Z0() {
        Bundle bundle = ((zf30) this).f;
        if (bundle != null) {
            return bundle.getBoolean("large_screen_layout_enabled", false);
        }
        return false;
    }

    public final void a1() {
        MobiusLoop.Controller controller = this.P1;
        if (controller == null) {
            u890.C("mobiusController");
            throw null;
        }
        if (controller.isRunning()) {
            MobiusLoop.Controller controller2 = this.P1;
            if (controller2 == null) {
                u890.C("mobiusController");
                throw null;
            }
            controller2.stop();
            MobiusLoop.Controller controller3 = this.P1;
            if (controller3 != null) {
                controller3.disconnect();
            } else {
                u890.C("mobiusController");
                throw null;
            }
        }
    }

    public final mir0 c() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mir0(kx40.g(yon1.Y2(), (qir0) null, 4));
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.Y2();
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getX1() {
        return this.X1;
    }

    public final String s() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.Y2().a;
    }

    public final void v0(Context context) {
        nmn1.p(this);
        super/*p.zf30*/.v0(context);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer numValueOf;
        boolean z;
        j2p0 j2p0Var;
        q1p0 q1p0Var = this.H1;
        if (q1p0Var == null) {
            u890.C("injector");
            throw null;
        }
        this.P1 = q1p0Var.a(cto1.q(n0()));
        Bundle bundle2 = ((zf30) this).f;
        if (bundle2 != null) {
            numValueOf = bundle2.containsKey("background_color_override") ? Integer.valueOf(bundle2.getInt("background_color_override")) : null;
        } else {
            numValueOf = null;
        }
        Bundle bundle3 = ((zf30) this).f;
        boolean z2 = bundle3 != null ? bundle3.getBoolean("hide_add_to_element", false) : false;
        Bundle bundle4 = ((zf30) this).f;
        boolean z3 = bundle4 != null ? bundle4.getBoolean("navigation_allowed", true) : true;
        Context contextH0 = h0();
        if (contextH0 == null) {
            contextH0 = layoutInflater.getContext();
        }
        Context context = contextH0;
        rzo0 rzo0Var = this.K1;
        if (rzo0Var == null) {
            u890.C("hatsContainerFactory");
            throw null;
        }
        context.getClass();
        m1p0 m1p0Var = new m1p0((dx0) rzo0Var.b, context, (i8h1) rzo0Var.c, (l6h1) rzo0Var.d, Z0());
        this.R1 = m1p0Var;
        Bundle bundle5 = ((zf30) this).f;
        int dimensionPixelSize = ((bundle5 != null ? bundle5.getBoolean("embedded_in_bottom_sheet", false) : false) || Z0()) ? 0 : k0().getDimensionPixelSize(2131166044);
        o3q o3qVar = this.J1;
        if (o3qVar == null) {
            u890.C("viewsFactory");
            throw null;
        }
        Bundle bundle6 = ((zf30) this).f;
        h2p0 h2p0Var = new h2p0(bundle6 != null ? bundle6.getBoolean("embedded_in_bottom_sheet", false) : false, numValueOf, z2, z3, Z0(), this.T1, new y3o0(m1p0Var, (byte) 15), new ym(this, dimensionPixelSize, (byte) 18));
        switch (o3qVar.a) {
            case 0:
                p2q p2qVar = (p2q) o3qVar.b;
                daq daqVar = p2qVar.b;
                w2k1 w2k1Var = (w2k1) daqVar.L8.get();
                x4l x4lVar = (x4l) daqVar.Hj.get();
                int i = t380.c;
                xzf xzfVar = new xzf(new b291(x4lVar), (wnr) daqVar.hg.get(), (byte) 1);
                q8n q8nVar = (q8n) daqVar.V2.get();
                s7q s7qVar = (s7q) p2qVar.d;
                xfx xfxVar = (xfx) s7qVar.p3.get();
                uw0 uw0Var = (uw0) p2qVar.e;
                d0r d0rVar = (d0r) ((jly0) uw0Var.h).get();
                daq daqVar2 = (daq) uw0Var.e;
                u27 u27Var = new u27(d0rVar, (gw70) daqVar2.d8.get(), new bn4(false, (luk) daqVar2.L1.get()));
                daq daqVar3 = s7qVar.b;
                qtw qtwVarN = aan0.n((gw70) daqVar3.d8.get(), (woa) daqVar3.W8.get(), (kma) daqVar3.Od.get());
                FlowableFilter flowableFilterN = uw0Var.N();
                ruz ruzVarA = ((cyp) ((jly0) uw0Var.i).get()).a();
                s7q s7qVar2 = (s7q) uw0Var.f;
                Resources resources = (Resources) s7qVar2.i2.get();
                daq daqVar4 = (daq) uw0Var.e;
                qzo0 qzo0Var = new qzo0(flowableFilterN, ruzVarA, new azo0(resources, new l0x0((cbv) daqVar4.vq.get(), (i8h1) daqVar4.A5.get(), k9o0.w(), (byte) 7)), (d0r) ((jly0) uw0Var.h).get(), (o241) daqVar4.u4.get(), new yna0((Resources) s7qVar2.i2.get()), new ac10((xvo) daqVar4.H8.get(), (ln91) daqVar4.yf.get(), (pqs) daqVar4.ka.get(), (byte) 1), s7qVar2.U0(), new gid((Flowable) daqVar4.D5.get(), (Resources) s7qVar2.i2.get(), (byte) 20), new kp00((kt91) daqVar4.f8.get(), sd30.D((p2q) uw0Var.t, (p2q) uw0Var.X, (rh11) daqVar4.ia.get()), (byte) 21), new k811(new p2o0((u4q0) daqVar4.em.get(), (a1r0) s7qVar2.X0.get(), (am30) daqVar4.Qb.get(), xqu.a(s7qVar2.wj), (p2q) uw0Var.c, (q8n) daqVar4.w1.get(), (byte) 1), (rh11) daqVar4.ia.get(), (Flowable) daqVar4.D5.get(), (byte) 3), (cbv) daqVar4.vq.get(), (e7p0) s7qVar2.f3.get(), (yqg) daqVar4.J1.get(), k9o0.w(), (Resources) s7qVar2.i2.get(), daqVar4.i(), (vbs) daqVar4.wf.get(), (r1p0) ((jly0) uw0Var.Y).get(), (tap) ((jly0) uw0Var.Z).get());
                r1p0 r1p0Var = (r1p0) ((jly0) uw0Var.Y).get();
                ruz ruzVarA2 = ((cyp) ((jly0) uw0Var.i).get()).a();
                gn10 gn10VarR = j310.r((o0p0) uw0Var.d);
                FlowableMap flowableMapJ = uw0Var.N().j(mo9.Y).J(a020.a1);
                daq daqVar5 = (daq) uw0Var.e;
                dfm dfmVar = new dfm(ruzVarA2, gn10VarR, flowableMapJ, ((Flowable) daqVar5.D5.get()).j(mo9.O0), ((Flowable) daqVar5.D5.get()).j(mo9.N0), uw0Var.N().J(fj10.Z0).t(Functions.a), (pe) daqVar5.p9.get(), new qmr((in4) ((s7q) uw0Var.f).o9.get()));
                yl1 yl1Var = new yl1(uw0Var.N(), (fl3) ((s7q) uw0Var.f).n9.get(), (lik1) ((p2q) uw0Var.b).get());
                snr snrVar = (snr) s7qVar.P7.get();
                for forVar = (for) s7qVar.R7.get();
                daq daqVar6 = (daq) uw0Var.e;
                i8h1 i8h1Var = (i8h1) daqVar6.A5.get();
                h0p0 h0p0VarW = k9o0.w();
                tzo tzoVarY = h1l.y((b8p) daqVar6.f4.get());
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                cr6 cr6Var = new cr6(i8h1Var, h0p0VarW, new rzo0(tzoVarY, yon1.Y2(), nik1.m1, (byte) 0), (m7p0) daqVar6.q9.get(), new x5j1((ao0) daqVar6.Hk.get(), (byte) 4));
                r961 r961Var = new r961((r791) s7qVar.xj.get(), (i44) s7qVar.vh.get(), (Flowable) s7qVar.b.D5.get());
                i8h1 i8h1Var2 = (i8h1) daqVar.A5.get();
                l6h1 l6h1Var = (l6h1) daqVar.fg.get();
                h0p0 h0p0VarW2 = k9o0.w();
                gh4 gh4VarI = daqVar.i();
                zs21 zs21Var = (zs21) ((jly0) uw0Var.N0).get();
                FlowableFilter flowableFilterN2 = uw0Var.N();
                daq daqVar7 = (daq) uw0Var.e;
                tjq tjqVar = new tjq(flowableFilterN2, daqVar7.i(), (q8n) daqVar7.V2.get(), new l0x0((cbv) daqVar7.vq.get(), (i8h1) daqVar7.A5.get(), k9o0.w(), (byte) 7), (cbv) daqVar7.vq.get());
                FlowableMap flowableMapJ2 = uw0Var.N().j(mo9.Z).J(xi20.b1);
                daq daqVar8 = (daq) uw0Var.e;
                w2k1 w2k1Var2 = (w2k1) daqVar8.L8.get();
                yjj1 yjj1Var = (yjj1) daqVar8.zq.get();
                c3s c3sVar = (c3s) daqVar8.e6.get();
                qlb qlbVar = new qlb((gw70) daqVar8.d8.get(), (d0r) ((jly0) uw0Var.h).get());
                z = false;
                j2p0Var = new j2p0(layoutInflater, viewGroup, h2p0Var, w2k1Var, xzfVar, q8nVar, xfxVar, u27Var, qtwVarN, qzo0Var, r1p0Var, dfmVar, yl1Var, snrVar, forVar, cr6Var, r961Var, i8h1Var2, l6h1Var, h0p0VarW2, gh4VarI, zs21Var, tjqVar, new ikj1(flowableMapJ2, w2k1Var2, yjj1Var, c3sVar, qlbVar, new bv4(false, (luk) daqVar8.L1.get())));
                break;
            default:
                p2q p2qVar2 = (p2q) o3qVar.b;
                daq daqVar9 = p2qVar2.b;
                w2k1 w2k1Var3 = (w2k1) daqVar9.L8.get();
                teq teqVar = p2qVar2.d;
                xzf xzfVarE = teqVar.b.E();
                q8n q8nVar2 = (q8n) daqVar9.V2.get();
                xfx xfxVar2 = (xfx) teqVar.q1.get();
                wj3 wj3Var = (wj3) p2qVar2.e;
                d0r d0rVar2 = (d0r) ((jly0) wj3Var.f).get();
                daq daqVar10 = (daq) wj3Var.c;
                u27 u27Var2 = new u27(d0rVar2, (gw70) daqVar10.d8.get(), new bn4(false, (luk) daqVar10.L1.get()));
                daq daqVar11 = teqVar.b.a;
                qtw qtwVarN2 = aan0.n((gw70) daqVar11.d8.get(), (woa) daqVar11.W8.get(), (kma) daqVar11.Od.get());
                FlowableFilter flowableFilterO = wj3Var.o();
                ruz ruzVarA3 = ((cyp) ((jly0) wj3Var.g).get()).a();
                teq teqVar2 = (teq) wj3Var.d;
                Resources resources2 = (Resources) teqVar2.N0.get();
                daq daqVar12 = (daq) wj3Var.c;
                qzo0 qzo0Var2 = new qzo0(flowableFilterO, ruzVarA3, new azo0(resources2, new l0x0((cbv) daqVar12.vq.get(), (i8h1) daqVar12.A5.get(), k9o0.w(), (byte) 7)), (d0r) ((jly0) wj3Var.f).get(), (o241) daqVar12.u4.get(), new yna0((Resources) teqVar2.N0.get()), new ac10((xvo) daqVar12.H8.get(), (ln91) daqVar12.yf.get(), (pqs) daqVar12.ka.get(), (byte) 1), teqVar2.a.S(), new gid((Flowable) teqVar2.d.D5.get(), (Resources) teqVar2.N0.get(), (byte) 20), new kp00((kt91) daqVar12.f8.get(), sd30.D((p2q) wj3Var.h, (p2q) wj3Var.i, (rh11) daqVar12.ia.get()), (byte) 21), new k811(new p2o0((u4q0) daqVar12.em.get(), (a1r0) teqVar2.V0.get(), (am30) daqVar12.Qb.get(), xqu.a(teqVar2.b.ub), (p2q) wj3Var.t, (q8n) daqVar12.w1.get(), (byte) 1), (rh11) daqVar12.ia.get(), (Flowable) daqVar12.D5.get(), (byte) 3), (cbv) daqVar12.vq.get(), (e7p0) teqVar2.W4.get(), (yqg) daqVar12.J1.get(), k9o0.w(), (Resources) teqVar2.N0.get(), daqVar12.i(), (vbs) daqVar12.wf.get(), (r1p0) ((jly0) wj3Var.X).get(), (tap) ((jly0) wj3Var.Y).get());
                r1p0 r1p0Var2 = (r1p0) ((jly0) wj3Var.X).get();
                ruz ruzVarA4 = ((cyp) ((jly0) wj3Var.g).get()).a();
                gn10 gn10VarR2 = j310.r((o0p0) wj3Var.b);
                FlowableMap flowableMapJ3 = wj3Var.o().j(mo9.Y).J(a020.a1);
                daq daqVar13 = (daq) wj3Var.c;
                dfm dfmVar2 = new dfm(ruzVarA4, gn10VarR2, flowableMapJ3, ((Flowable) daqVar13.D5.get()).j(mo9.O0), ((Flowable) daqVar13.D5.get()).j(mo9.N0), wj3Var.o().J(fj10.Z0).t(Functions.a), (pe) daqVar13.p9.get(), new qmr((in4) ((p2q) wj3Var.Z).get()));
                yl1 yl1Var2 = new yl1(wj3Var.o(), (fl3) ((teq) wj3Var.d).b.xb.get(), (lik1) ((p2q) wj3Var.N0).get());
                snr snrVar2 = (snr) teqVar.a.Jb.get();
                for forVar2 = (for) teqVar.a.Lb.get();
                daq daqVar14 = (daq) wj3Var.c;
                i8h1 i8h1Var3 = (i8h1) daqVar14.A5.get();
                h0p0 h0p0VarW3 = k9o0.w();
                tzo tzoVarY2 = h1l.y((b8p) daqVar14.f4.get());
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                cr6 cr6Var2 = new cr6(i8h1Var3, h0p0VarW3, new rzo0(tzoVarY2, yon1.Y2(), nik1.m1, (byte) 0), (m7p0) daqVar14.q9.get(), new x5j1((ao0) daqVar14.Hk.get(), (byte) 4));
                yiq yiqVar = teqVar.b;
                teq teqVar3 = yiqVar.b;
                r961 r961Var2 = new r961((r791) teqVar3.y7.get(), (i44) teqVar3.v7.get(), (Flowable) yiqVar.a.D5.get());
                i8h1 i8h1Var4 = (i8h1) daqVar9.A5.get();
                l6h1 l6h1Var2 = (l6h1) daqVar9.fg.get();
                h0p0 h0p0VarW4 = k9o0.w();
                gh4 gh4VarI2 = daqVar9.i();
                zs21 zs21Var2 = (zs21) ((jly0) wj3Var.O0).get();
                FlowableFilter flowableFilterO2 = wj3Var.o();
                daq daqVar15 = (daq) wj3Var.c;
                tjq tjqVar2 = new tjq(flowableFilterO2, daqVar15.i(), (q8n) daqVar15.V2.get(), new l0x0((cbv) daqVar15.vq.get(), (i8h1) daqVar15.A5.get(), k9o0.w(), (byte) 7), (cbv) daqVar15.vq.get());
                FlowableMap flowableMapJ4 = wj3Var.o().j(mo9.Z).J(xi20.b1);
                daq daqVar16 = (daq) wj3Var.c;
                j2p0Var = new j2p0(layoutInflater, viewGroup, h2p0Var, w2k1Var3, xzfVarE, q8nVar2, xfxVar2, u27Var2, qtwVarN2, qzo0Var2, r1p0Var2, dfmVar2, yl1Var2, snrVar2, forVar2, cr6Var2, r961Var2, i8h1Var4, l6h1Var2, h0p0VarW4, gh4VarI2, zs21Var2, tjqVar2, new ikj1(flowableMapJ4, (w2k1) daqVar16.L8.get(), (yjj1) daqVar16.zq.get(), (c3s) daqVar16.e6.get(), new qlb((gw70) daqVar16.d8.get(), (d0r) ((jly0) wj3Var.f).get()), new bv4(false, (luk) daqVar16.L1.get())));
                z = false;
                break;
        }
        this.Q1 = j2p0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(z);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        Bundle bundle7 = ((zf30) this).f;
        if (!(bundle7 != null ? bundle7.getBoolean("embedded_in_bottom_sheet", z) : false)) {
            frameLayout.addView(m1p0Var.d);
        }
        j2p0 j2p0Var2 = this.Q1;
        j2p0Var2.getClass();
        View view = j2p0Var2.O0;
        if (view == null) {
            view = j2p0Var2.Z;
        }
        frameLayout.addView(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            return null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        int i2 = dimensionPixelSize;
        layoutParams2.setMarginStart(i2);
        layoutParams2.setMarginEnd(i2);
        layoutParams2.bottomMargin = i2;
        view.setLayoutParams(layoutParams2);
        if (Z0()) {
            fn31.T(cto1.q(n0()), (o8n) null, 0, new wkk0(this, view, m1p0Var, null, (byte) 20), 3);
        }
        return frameLayout;
    }

    public final void y0() {
        m7p0 m7p0Var = this.L1;
        if (m7p0Var == null) {
            u890.C("nowPlayingVisibilityStateUpdater");
            throw null;
        }
        m7p0Var.a((l7p0) this.U1.getValue());
        super.y0();
    }

    public final void z0() {
        fdc fdcVar = this.S1;
        if (fdcVar != null) {
            fdcVar.c0(false);
        }
        this.S1 = null;
        a1();
        j2p0 j2p0Var = this.Q1;
        if (j2p0Var != null) {
            y5u y5uVar = j2p0Var.N0;
            if (y5uVar != null) {
                tac0 tac0Var = y5uVar.b;
                w8c0 w8c0Var = tac0Var.i;
                w8c0 w8c0Var2 = w8c0.a;
                if (w8c0Var != w8c0Var2) {
                    tac0Var.i(w8c0Var2);
                }
            }
            j2p0.b(j2p0Var.Z);
        }
        this.Q1 = null;
        this.R1 = null;
        ((zf30) this).h1 = true;
    }
}
