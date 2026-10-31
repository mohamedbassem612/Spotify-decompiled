package com.spotify.music;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import p.adh1;
import p.ap31;
import p.b5b1;
import p.b8l;
import p.bbr0;
import p.c5b1;
import p.cdr;
import p.ciq;
import p.dn81;
import p.f8l;
import p.fdc;
import p.fmo;
import p.ggs0;
import p.gyf0;
import p.h851;
import p.hck1;
import p.his;
import p.i851;
import p.i94;
import p.idd1;
import p.j1e1;
import p.jma;
import p.l5v0;
import p.lxg;
import p.m021;
import p.m481;
import p.mir0;
import p.mjv;
import p.mmo;
import p.n57;
import p.nbr;
import p.nhc;
import p.ni61;
import p.nte0;
import p.nxg;
import p.o2q0;
import p.ouz;
import p.p7h;
import p.pn80;
import p.pyp0;
import p.qdd1;
import p.qpj0;
import p.r2b1;
import p.rg30;
import p.rn80;
import p.rqq0;
import p.rwq0;
import p.s45;
import p.t0n0;
import p.t2j0;
import p.t3b1;
import p.t45;
import p.t4t;
import p.th30;
import p.u890;
import p.uo5;
import p.uwn0;
import p.ve41;
import p.war0;
import p.we41;
import p.wh30;
import p.wxf0;
import p.xh81;
import p.y9h;
import p.yh0;
import p.ynb0;
import p.yun0;
import p.yxe1;
import p.yxn0;
import p.zia;
import p.zlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/spotify/music/SpotifyMainActivity;", "Lp/bbr0;", "Lp/adh1;", "Lp/nte0;", "<init>", "()V", "src_main_java_com_spotify_app_music_main-main"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class SpotifyMainActivity extends t3b1 implements bbr0, adh1, nte0, rqq0 {
    public t2j0 A1;
    public ynb0 B1;
    public mir0 C1;
    public c5b1 D1;
    public m021 E1;
    public mjv h1;
    public uwn0 i1;
    public mmo j1;
    public ynb0 k1;
    public ynb0 l1;
    public ynb0 m1;
    public ynb0 n1;
    public ap31 o1;
    public ni61 p1;
    public yh0 q1;
    public yxn0 r1;
    public ciq s1;
    public yun0 t1;
    public ynb0 u1;
    public ynb0 v1;
    public ynb0 w1;
    public ynb0 x1;
    public t0n0 y1;
    public xh81 z1;
    public final CopyOnWriteArrayList f1 = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList g1 = new CopyOnWriteArrayList();
    public final lxg F1 = nxg.a();
    public final zia G1 = zia.a(Boolean.FALSE);
    public final fmo H1 = new fmo(this, (byte) 8);
    public final idd1 I1 = new idd1(new b5b1(this, (byte) 0));
    public final dn81 J1 = new dn81(this, (byte) 9);
    public final idd1 K1 = new idd1(new b5b1(this, (byte) 2));

    @Override // p.adh1
    public final boolean D() {
        return q0().v();
    }

    public final f8l F() {
        return p0().b.e;
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        return q0().b0(cls);
    }

    @Override // p.t3b1, p.lir0
    public final mir0 c() {
        mir0 mir0Var = this.C1;
        if (mir0Var != null) {
            return mir0Var;
        }
        u890.C("pageViewObservable");
        throw null;
    }

    public final th30 e0() {
        return p0().b.i.t();
    }

    @Override // p.t3b1
    public final rg30 l0() {
        return new m481(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.t3b1
    public final void m0() {
        lxg lxgVar = this.F1;
        ((i94) lxgVar).e("main_activity_injection");
        j1e1.q(this);
        ((i94) lxgVar).a("main_activity_injection");
    }

    @Override // p.t3b1
    public final Bundle n0(Bundle bundle) {
        yh0 yh0Var = this.q1;
        if (yh0Var != null) {
            return yh0Var.a(bundle);
        }
        u890.C("sessionUiHost");
        throw null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        r0(i, i2, intent);
        s0();
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.t3b1
    public final void onCreate(Bundle bundle) {
        i94 i94Var = (i94) this.F1;
        i94Var.e("main_activity_on_create");
        t45 t45Var = i94Var.e;
        if (bundle == null) {
            if (t45Var != null) {
                t45Var.a("state_restore", "false");
            }
        } else if (t45Var != null) {
            t45Var.a("state_restore", "true");
        }
        if (u890.j(i94Var.n, Boolean.TRUE)) {
            i94Var.b("spotify_service_already_running");
        }
        Long l = i94Var.d;
        if (l != null) {
            if (((s45) i94Var.a).a.a() - l.longValue() > 10000000) {
                i94Var.b("app_was_running_in_background");
            }
        }
        setTheme(2132018158);
        qdd1 qdd1VarH = jma.h();
        zlv.a(this, qdd1VarH, qdd1VarH);
        super.onCreate(bundle);
        Bundle bundle2 = this.e1;
        ni61 ni61Var = this.p1;
        if (ni61Var == null) {
            u890.C("sessionUiTeardownRegistry");
            throw null;
        }
        yh0 yh0Var = this.q1;
        if (yh0Var == null) {
            u890.C("sessionUiHost");
            throw null;
        }
        this.E1 = ni61Var.b(yh0Var);
        p0().a = bundle2;
        if (!isTaskRoot() && getIntent().getData() == null && !u890.j(getIntent().getAction(), "android.intent.action.SEND") && !u890.j(getIntent().getAction(), "android.intent.action.SEND_MULTIPLE")) {
            ActivityManager activityManager = (ActivityManager) getSystemService("activity");
            if (isTaskRoot() || Build.VERSION.SDK_INT >= 30 || !activityManager.getAppTasks().isEmpty()) {
                finish();
                return;
            }
        }
        t0n0 t0n0Var = this.y1;
        if (t0n0Var == null) {
            u890.C("navigationBarActiveItemProvider");
            throw null;
        }
        xh81 xh81Var = this.z1;
        if (xh81Var == null) {
            u890.C("sideDrawerPageViewObservableProvider");
            throw null;
        }
        uo5 uo5Var = new uo5(t0n0Var, xh81Var);
        this.C1 = nhc.p(uo5Var);
        c5b1 c5b1Var = new c5b1(uo5Var);
        yun0 yun0Var = this.t1;
        if (yun0Var == null) {
            u890.C("fragmentChangeListener");
            throw null;
        }
        yun0Var.g(c5b1Var);
        this.D1 = c5b1Var;
        try {
            ciq ciqVar = this.s1;
            if (ciqVar == null) {
                u890.C("navigationSystemFactory");
                throw null;
            }
            ciqVar.a(this, this, new b5b1(this, (byte) 3), (ggs0) new hck1(this, new we41()).a(ggs0.class));
            q0().P();
            Intent intent = getIntent();
            if (intent != null && bundle2 == null) {
                onNewIntent(intent);
            }
            setVisible(false);
            o2q0 o2q0VarM = q0().M();
            yun0 yun0Var2 = this.t1;
            if (yun0Var2 == null) {
                u890.C("fragmentChangeListener");
                throw null;
            }
            yun0Var2.g(o2q0VarM);
            setContentView(2131624567);
            FrameLayout frameLayout = (FrameLayout) findViewById(2131429882);
            i94Var.e("content_view_creation");
            ap31 ap31VarQ0 = q0();
            LayoutInflater layoutInflater = getLayoutInflater();
            frameLayout.getClass();
            ap31VarQ0.E(layoutInflater, frameLayout);
            i94Var.a("content_view_creation");
            mjv mjvVar = this.h1;
            if (mjvVar == null) {
                u890.C("fragmentStackReader");
                throw null;
            }
            mjvVar.d(new l5v0(this, (byte) 24));
            yun0 yun0Var3 = this.t1;
            if (yun0Var3 == null) {
                u890.C("fragmentChangeListener");
                throw null;
            }
            yun0Var3.g(this.H1);
            b0(yxe1.class).d(new qpj0(this, (byte) 12));
            findViewById(2131431189).setProtections(p7h.M(new y9h(1), new y9h(4)));
            rwq0.s(frameLayout, new his(frameLayout, (byte) 2));
            i94Var.a("main_activity_on_create");
        } catch (BadParcelableException e) {
            Logger.e(e, "Failed to initialize navigation system with restored state", new Object[0]);
            finish();
            startActivity(getIntent());
        } catch (ClassNotFoundException e2) {
            Logger.e(e2, "Failed to initialize navigation system with restored state", new Object[0]);
            finish();
            startActivity(getIntent());
        }
    }

    public final void onDestroy() {
        yun0 yun0Var = this.t1;
        if (yun0Var == null) {
            u890.C("fragmentChangeListener");
            throw null;
        }
        yun0Var.d(this.H1);
        o2q0 o2q0VarM = q0().M();
        yun0 yun0Var2 = this.t1;
        if (yun0Var2 == null) {
            u890.C("fragmentChangeListener");
            throw null;
        }
        yun0Var2.d(o2q0VarM);
        c5b1 c5b1Var = this.D1;
        if (c5b1Var != null) {
            yun0 yun0Var3 = this.t1;
            if (yun0Var3 == null) {
                u890.C("fragmentChangeListener");
                throw null;
            }
            yun0Var3.d(c5b1Var);
        }
        mjv mjvVar = this.h1;
        if (mjvVar == null) {
            u890.C("fragmentStackReader");
            throw null;
        }
        mjvVar.d((l5v0) null);
        ynb0 ynb0Var = this.v1;
        if (ynb0Var == null) {
            u890.C("deeplinkPluginLifecycle");
            throw null;
        }
        ((cdr) ynb0Var.get()).a();
        ynb0 ynb0Var2 = this.x1;
        if (ynb0Var2 == null) {
            u890.C("deepLinkAttributionTrackersController");
            throw null;
        }
        ((nbr) ynb0Var2.get()).b.g();
        m021 m021Var = this.E1;
        if (m021Var != null) {
            m021Var.p();
        }
        this.E1 = null;
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.t3b1
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final void onPause() {
        super.onPause();
        ynb0 ynb0Var = this.m1;
        if (ynb0Var != null) {
            ((rn80) ynb0Var.get()).a();
        } else {
            u890.C("installReferrerRetriever");
            throw null;
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        r0(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr));
        s0();
        super/*p.dg30*/.onRequestPermissionsResult(i, strArr, iArr);
    }

    public final void onResume() {
        i94 i94Var = (i94) this.F1;
        i94Var.e("main_activity_on_resume");
        super.onResume();
        ynb0 ynb0Var = this.m1;
        if (ynb0Var == null) {
            u890.C("installReferrerRetriever");
            throw null;
        }
        rn80 rn80Var = (rn80) ynb0Var.get();
        pn80 pn80Var = rn80Var.b;
        if (pn80Var.i.h(pn80.j, false)) {
            pn80Var.a(null);
        } else {
            try {
                rn80Var.a.startConnection(new ouz(rn80Var, (byte) 16));
            } catch (SecurityException e) {
                n57.g("Unable to start connection", e);
            }
        }
        i94Var.a("main_activity_on_resume");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = p0().a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        } else {
            super.onSaveInstanceState(bundle);
        }
        ((ve41) this.K1.getValue()).e(bundle);
        yh0 yh0Var = this.q1;
        if (yh0Var != null) {
            yh0Var.b(bundle);
        } else {
            u890.C("sessionUiHost");
            throw null;
        }
    }

    public final boolean onSearchRequested() {
        ynb0 ynb0Var = this.l1;
        if (ynb0Var == null) {
            u890.C("searchRequestedPluginPoint");
            throw null;
        }
        Iterator it = ((i851) ynb0Var.get()).a().iterator();
        while (it.hasNext()) {
            ((h851) it.next()).a();
        }
        return false;
    }

    public final void onStart() {
        i94 i94Var = (i94) this.F1;
        i94Var.e("main_activity_on_start");
        super.onStart();
        yh0 yh0Var = this.q1;
        if (yh0Var == null) {
            u890.C("sessionUiHost");
            throw null;
        }
        if (yh0Var.c()) {
            i94Var.a("main_activity_on_start");
            return;
        }
        ynb0 ynb0Var = this.n1;
        if (ynb0Var == null) {
            u890.C("mainActivityMonitoringPluginPoint");
            throw null;
        }
        Iterator it = ((wxf0) ynb0Var.get()).a.iterator();
        while (it.hasNext()) {
            ((gyf0) it.next()).b();
        }
        ynb0 ynb0Var2 = this.u1;
        if (ynb0Var2 == null) {
            u890.C("foregroundFragmentChangedPluginPoint");
            throw null;
        }
        o2q0 o2q0Var = (o2q0) ynb0Var2.get();
        yun0 yun0Var = this.t1;
        if (yun0Var == null) {
            u890.C("fragmentChangeListener");
            throw null;
        }
        yun0Var.g(o2q0Var);
        ynb0 ynb0Var3 = this.w1;
        if (ynb0Var3 == null) {
            u890.C("branch");
            throw null;
        }
        ((r2b1) ynb0Var3.get()).a(this);
        i94Var.a("main_activity_on_start");
    }

    public final void onStateNotSaved() {
        super/*p.dg30*/.onStateNotSaved();
        s0();
    }

    public final void onStop() {
        super.onStop();
        ynb0 ynb0Var = this.u1;
        if (ynb0Var == null) {
            u890.C("foregroundFragmentChangedPluginPoint");
            throw null;
        }
        o2q0 o2q0Var = (o2q0) ynb0Var.get();
        yun0 yun0Var = this.t1;
        if (yun0Var == null) {
            u890.C("fragmentChangeListener");
            throw null;
        }
        yun0Var.d(o2q0Var);
        ynb0 ynb0Var2 = this.n1;
        if (ynb0Var2 == null) {
            u890.C("mainActivityMonitoringPluginPoint");
            throw null;
        }
        Iterator it = ((wxf0) ynb0Var2.get()).a.iterator();
        while (it.hasNext()) {
            ((gyf0) it.next()).a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        this.G1.accept(Boolean.valueOf(z));
    }

    public final t4t p0() {
        return (t4t) this.I1.getValue();
    }

    public final ap31 q0() {
        ap31 ap31Var = this.o1;
        if (ap31Var != null) {
            return ap31Var;
        }
        u890.C("rootUI");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.rqq0
    public final void r(int i) {
        super/*android.app.Activity*/.setRequestedOrientation(i);
    }

    public final void r0(int i, int i2, Intent intent) {
        Iterator it = this.g1.iterator();
        while (it.hasNext()) {
            fdc fdcVar = ((b8l) it.next()).a;
            if (fdcVar.O()) {
                fdcVar.N().c(i, i2, intent);
            } else {
                fdcVar.k0(new pyp0(i, i2, intent, (byte) 4));
            }
        }
    }

    public final void s0() {
        Iterator it = this.f1.iterator();
        while (it.hasNext()) {
            ((wh30) it.next()).a.i.u();
        }
    }

    public final void setRequestedOrientation(int i) {
        n57.e("Change orientation outside ForcedOrientationPagePropertyObserver is not allowed. Refer to com.spotify.tome.pagecapabilities.properties.ForcedOrientation Page property");
    }

    public final void setTitle(CharSequence charSequence) {
        n57.m("Don't call setTitle() directly, use setTitleForFragment() instead");
    }
}
