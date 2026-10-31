package com.spotify.allboarding.allboardingimpl;

import android.os.Build;
import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.spotify.allboarding.entrypoint.EntryPoint;
import com.spotify.mobius.android.MobiusLoopViewModel;
import kotlin.Metadata;
import p.ai30;
import p.ajq0;
import p.bck1;
import p.cs3;
import p.d55;
import p.dg30;
import p.don0;
import p.ds3;
import p.edr0;
import p.eg;
import p.en3;
import p.es3;
import p.gir0;
import p.gj5;
import p.gon0;
import p.hn3;
import p.hnn0;
import p.idd1;
import p.j1e1;
import p.jgu;
import p.lir0;
import p.lmw;
import p.lt50;
import p.mir0;
import p.mu3;
import p.n36;
import p.of61;
import p.oon0;
import p.q59;
import p.qon0;
import p.r2b1;
import p.rc11;
import p.rg30;
import p.tg30;
import p.th30;
import p.u890;
import p.ve3;
import p.vnn0;
import p.w44;
import p.w4b1;
import p.wm3;
import p.z11;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/spotify/allboarding/allboardingimpl/AllboardingActivity;", "Lp/gj5;", "Lp/lt50;", "Lp/lir0;", "<init>", "()V", "p/x2g0", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class AllboardingActivity extends gj5 implements lt50, lir0 {
    public static final /* synthetic */ int l1 = 0;
    public mu3 a1;
    public jgu c1;
    public rg30 d1;
    public gir0 e1;
    public edr0 f1;
    public en3 g1;
    public q59 h1;
    public gon0 i1;
    public ajq0 k1;
    public final bck1 b1 = new bck1(rc11.a.b(hn3.class), new cs3(this, 1), new cs3(this, 3), new cs3(this, 2));
    public final idd1 j1 = new idd1(new cs3(this, 0));

    public final mir0 c() {
        gir0 gir0Var = this.e1;
        if (gir0Var != null) {
            return gir0Var.b;
        }
        u890.C("pageViewEventDispatcher");
        throw null;
    }

    public final jgu f() {
        jgu jguVar = this.c1;
        if (jguVar != null) {
            return jguVar;
        }
        u890.C("androidInjector");
        throw null;
    }

    public final hn3 l0() {
        return (hn3) this.b1.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        j1e1.q(this);
        byte b = 0;
        d55.i(getWindow(), Build.VERSION.SDK_INT <= 29);
        lmw lmwVar = ((dg30) this).U0;
        ai30 ai30Var = ((tg30) lmwVar.b).g;
        rg30 rg30Var = this.d1;
        if (rg30Var == null) {
            u890.C("fragmentFactory");
            throw null;
        }
        ((th30) ai30Var).B = rg30Var;
        super/*p.dg30*/.onCreate(bundle);
        setContentView(2131623990);
        NavHostFragment navHostFragmentF = ((tg30) lmwVar.b).g.F(2131430115);
        gon0 gon0VarY0 = navHostFragmentF.Y0();
        this.i1 = gon0VarY0;
        if (gon0VarY0 == null) {
            u890.C("navController");
            throw null;
        }
        gon0VarY0.C(((oon0) gon0VarY0.C.getValue()).b(2131755008), (Bundle) null);
        gon0 gon0Var = this.i1;
        if (gon0Var == null) {
            u890.C("navController");
            throw null;
        }
        ds3 ds3Var = new ds3(this);
        gon0Var.q.add(ds3Var);
        n36 n36Var = gon0Var.g;
        if (!n36Var.isEmpty()) {
            hnn0 hnn0Var = (hnn0) n36Var.last();
            vnn0 vnn0Var = hnn0Var.b;
            hnn0Var.a();
            ds3Var.a(vnn0Var);
        }
        gon0 gon0Var2 = this.i1;
        if (gon0Var2 == null) {
            u890.C("navController");
            throw null;
        }
        th30 th30VarG0 = navHostFragmentF.g0();
        en3 en3Var = this.g1;
        if (en3Var == null) {
            u890.C("screenProvider");
            throw null;
        }
        ve3 ve3Var = new ve3((Object) this, (byte) 4);
        ajq0 ajq0Var = new ajq0();
        ajq0Var.a = gon0Var2;
        ajq0Var.b = th30VarG0;
        ajq0Var.c = en3Var;
        ajq0Var.d = ve3Var;
        don0 don0Var = gon0Var2.c;
        if (don0Var == null) {
            eg.m("You must call setGraph() before calling getGraph()");
            throw null;
        }
        ajq0Var.e = new qon0(false, false, don0Var.Z, false, false, -1, -1, -1, -1);
        th30VarG0.j0("ALLBOARDING_SCREEN_RESPONSE", this, new w4b1((Object) ajq0Var, (byte) 16));
        this.k1 = ajq0Var;
        ((MobiusLoopViewModel) l0()).c.c(this, new es3(this, b));
        ((MobiusLoopViewModel) l0()).b.f(this, new z11(this, (byte) 1));
        edr0 edr0Var = this.f1;
        of61 of61Var = of61.a;
        if (bundle != null) {
            if (edr0Var != null) {
                edr0Var.c(of61Var, bundle.getString("SESSION_ID"));
                return;
            } else {
                u890.C("sessionIdProvider");
                throw null;
            }
        }
        if (edr0Var == null) {
            u890.C("sessionIdProvider");
            throw null;
        }
        edr0Var.a(of61Var);
        l0().U(new wm3((EntryPoint) this.j1.getValue()));
    }

    public final void onPause() {
        super/*p.dg30*/.onPause();
        hn3 hn3VarL0 = l0();
        hn3VarL0.g.b(hn3VarL0.V(), "FLOW_STATE");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*p.g0i*/.onSaveInstanceState(bundle);
        hn3 hn3VarL0 = l0();
        hn3VarL0.g.b(hn3VarL0.V(), "FLOW_STATE");
        edr0 edr0Var = this.f1;
        if (edr0Var != null) {
            bundle.putString("SESSION_ID", edr0Var.b(of61.a).toString());
        } else {
            u890.C("sessionIdProvider");
            throw null;
        }
    }

    public final void onStart() {
        super.onStart();
        q59 q59Var = this.h1;
        if (q59Var == null) {
            u890.C("branchInitializer");
            throw null;
        }
        if (((w44) q59Var.c).a()) {
            ((r2b1) q59Var.b).a(this);
        }
    }
}
