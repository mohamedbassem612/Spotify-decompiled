package com.spotify.tome.pageactivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.Metadata;
import p.a1r0;
import p.a2k;
import p.a6q;
import p.adh1;
import p.aq8;
import p.bax;
import p.bbr0;
import p.daq;
import p.f0i;
import p.fmo;
import p.h1r0;
import p.hds;
import p.hho0;
import p.hw4;
import p.i3;
import p.i83;
import p.iac0;
import p.j0r0;
import p.j1e1;
import p.jeh;
import p.jma;
import p.jon1;
import p.k1c0;
import p.ki10;
import p.kjg;
import p.l0r0;
import p.lnn0;
import p.mir0;
import p.nhc;
import p.o0r0;
import p.o241;
import p.ozp0;
import p.p0r0;
import p.p410;
import p.p811;
import p.qdd1;
import p.qmo;
import p.r7q;
import p.rg30;
import p.rqq0;
import p.rwq0;
import p.s7q;
import p.t3b1;
import p.u890;
import p.vku;
import p.vn41;
import p.w0r0;
import p.war0;
import p.wc30;
import p.yun0;
import p.zlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/spotify/tome/pageactivity/PageActivity;", "Lp/t3b1;", "Lp/bbr0;", "Lp/rqq0;", "Lp/bax;", "Lp/l0r0;", "Lp/adh1;", "<init>", "()V", "src_main_java_com_spotify_tome_pageactivity-pageactivity"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class PageActivity extends t3b1 implements bbr0, rqq0, bax, l0r0, adh1 {
    public static final /* synthetic */ int y1 = 0;
    public a2k f1;
    public a1r0 g1;
    public lnn0 h1;
    public a6q i1;
    public hds j1;
    public k1c0 k1;
    public final qmo l1 = new qmo();
    public ki10 m1;
    public wc30 n1;
    public r7q o1;
    public h1r0 p1;
    public kjg q1;
    public boolean r1;
    public final vku s1;
    public final p0r0 t1;
    public final mir0 u1;
    public p410 v1;
    public final fmo w1;
    public boolean x1;

    public PageActivity() {
        vku vkuVar = new vku();
        this.s1 = vkuVar;
        p0r0 p0r0Var = new p0r0(vkuVar, new j0r0(this, (byte) 0));
        this.t1 = p0r0Var;
        this.u1 = nhc.p(p0r0Var);
        this.w1 = new fmo(this, (byte) 5);
    }

    @Override // p.adh1
    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getX1() {
        return this.x1;
    }

    @Override // p.bbr0
    public final war0 b0(Class cls) {
        ki10 ki10Var = this.m1;
        if (ki10Var != null) {
            return ki10Var.b0(cls);
        }
        u890.C("fallbackPropertyResolver");
        throw null;
    }

    @Override // p.t3b1, p.lir0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final mir0 getU1() {
        return this.u1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.l0r0
    public final void g(Intent intent) {
        intent.setExtrasClassLoader(getClassLoader());
        p410 p410Var = this.v1;
        if (p410Var != null) {
            p410Var.w(intent);
        } else {
            u890.C("navigationSystem");
            throw null;
        }
    }

    @Override // p.t3b1
    public final rg30 l0() {
        a2k a2kVar = this.f1;
        if (a2kVar != null) {
            return a2kVar;
        }
        u890.C("compositeFragmentFactory");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.t3b1
    public final void m0() {
        j1e1.q(this);
        r7q r7qVar = this.o1;
        if (r7qVar == null) {
            u890.C("properties");
            throw null;
        }
        if (((hw4) r7qVar.get()).a()) {
            qdd1 qdd1VarH = jma.h();
            zlv.a(this, qdd1VarH, qdd1VarH);
        }
        a6q a6qVar = this.i1;
        if (a6qVar == null) {
            u890.C("navigationSystemFactory");
            throw null;
        }
        r7q r7qVar2 = a6qVar.a;
        s7q s7qVar = r7qVar2.d;
        daq daqVar = r7qVar2.b;
        this.v1 = new p410(this, this, this, (w0r0) s7qVar.Si.get(), (yun0) s7qVar.Z6.get(), (jeh) s7qVar.oj.get(), (o241) daqVar.u4.get(), (Flowable) daqVar.z2.get(), (vn41) daqVar.a.e5.get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.t3b1
    public final void onCreate(Bundle bundle) {
        View view;
        View view2;
        if (Build.VERSION.SDK_INT < 34) {
            overridePendingTransition(0, 0);
        } else {
            overrideActivityTransition(0, 0, 0);
            overrideActivityTransition(1, 0, 0);
        }
        super.onCreate(bundle);
        setContentView(2131624568);
        k1c0 k1c0Var = this.k1;
        if (k1c0Var == null) {
            u890.C("legacyPropertyResolver");
            throw null;
        }
        this.m1 = new ki10(this.l1, k1c0Var);
        p410 p410Var = this.v1;
        if (p410Var == null) {
            u890.C("navigationSystem");
            throw null;
        }
        p410Var.m(this.w1);
        p410 p410Var2 = this.v1;
        if (p410Var2 == null) {
            u890.C("navigationSystem");
            throw null;
        }
        p410Var2.m(this.t1);
        if (bundle != null) {
            this.r1 = bundle.getBoolean("initial_intent_handled");
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(2131430272);
        frameLayout.getClass();
        lnn0 lnn0Var = this.h1;
        if (lnn0Var == null) {
            u890.C("navCatcherRegistry");
            throw null;
        }
        jon1.F(frameLayout, lnn0Var, 5, "PageActivity");
        if (!this.r1) {
            g(getIntent());
            this.r1 = true;
        }
        wc30 wc30Var = this.n1;
        if (wc30Var == null) {
            u890.C("orientationPagePropertyObserver");
            throw null;
        }
        wc30Var.a();
        ViewParent parent = frameLayout.getParent();
        FrameLayout frameLayout2 = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout2 != null) {
            view = new View(frameLayout2.getContext());
            view.setBackgroundColor(-16777216);
            frameLayout2.addView(view, new FrameLayout.LayoutParams(0, -1, 3));
        } else {
            view = null;
        }
        if (frameLayout2 != null) {
            view2 = new View(frameLayout2.getContext());
            view2.setBackgroundColor(-16777216);
            frameLayout2.addView(view2, new FrameLayout.LayoutParams(0, -1, 5));
        } else {
            view2 = null;
        }
        rwq0.s(frameLayout, new hho0(frameLayout, view, this, view2));
        kjg kjgVar = this.q1;
        if (kjgVar == null) {
            u890.C("clientMessagingPlatformActivityPluginRegister");
            throw null;
        }
        kjgVar.a(this);
        p811 p811Var = new p811();
        p811Var.a = new j0r0(this, (byte) 1);
        ozp0 ozp0Var = new ozp0(p811Var, this, (byte) 13);
        ((f0i) this).a.a(new i83(aq8.v(J(), (iac0) null, new i3(p811Var, (byte) 11), 3), (byte) 15));
        hds hdsVar = this.j1;
        if (hdsVar != null) {
            hdsVar.b.add(new o0r0(ozp0Var));
        } else {
            u890.C("navigationOnBackStackChangeListener");
            throw null;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        wc30 wc30Var = this.n1;
        if (wc30Var == null) {
            u890.C("orientationPagePropertyObserver");
            throw null;
        }
        wc30Var.b();
        p410 p410Var = this.v1;
        if (p410Var == null) {
            u890.C("navigationSystem");
            throw null;
        }
        p410Var.A(this.w1);
        p410 p410Var2 = this.v1;
        if (p410Var2 == null) {
            u890.C("navigationSystem");
            throw null;
        }
        p410Var2.A(this.t1);
        p410 p410Var3 = this.v1;
        if (p410Var3 == null) {
            u890.C("navigationSystem");
            throw null;
        }
        p410Var3.v();
        this.s1.c();
    }

    @Override // p.t3b1
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        g(intent);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("initial_intent_handled", this.r1);
    }

    public final void onStart() {
        super.onStart();
        h1r0 h1r0Var = this.p1;
        if (h1r0Var != null) {
            h1r0Var.b();
        } else {
            u890.C("uiPluginPoints");
            throw null;
        }
    }

    public final void onStop() {
        super.onStop();
        h1r0 h1r0Var = this.p1;
        if (h1r0Var != null) {
            h1r0Var.a();
        } else {
            u890.C("uiPluginPoints");
            throw null;
        }
    }
}
