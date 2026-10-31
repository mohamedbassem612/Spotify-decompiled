package com.spotify.allboarding.notificationpermission.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.encoremobile.buttons.PrimaryButtonView;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a7h1;
import p.bhn0;
import p.bnj0;
import p.bso0;
import p.cfm0;
import p.cj8;
import p.cso0;
import p.drj0;
import p.dso0;
import p.e1r0;
import p.e3h1;
import p.eq80;
import p.hma1;
import p.i8h1;
import p.ip41;
import p.j2i;
import p.jp80;
import p.jpa0;
import p.k7h1;
import p.l6h1;
import p.m5n1;
import p.n6r0;
import p.n7h1;
import p.o6r0;
import p.op80;
import p.p6r0;
import p.pf30;
import p.q6x;
import p.qj0;
import p.rok0;
import p.sap1;
import p.u890;
import p.uso0;
import p.vku;
import p.wch;
import p.x11;
import p.x6h1;
import p.xhk1;
import p.xjn;
import p.y3o0;
import p.y6h1;
import p.yg30;
import p.yon1;
import p.yvk0;
import p.zf30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/spotify/allboarding/notificationpermission/view/NotificationPermissionFragment;", "Lp/zf30;", "Lp/o6r0;", "Lp/yg30;", "injector", "<init>", "(Lp/yg30;)V", "src_main_java_com_spotify_allboarding_notificationpermission-notificationpermission"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationPermissionFragment extends zf30 implements o6r0 {
    public final yg30 F1;
    public drj0 G1;
    public rok0 H1;
    public uso0 I1;
    public jpa0 J1;
    public bnj0 K1;
    public yvk0 L1;
    public i8h1 M1;
    public l6h1 N1;
    public boolean O1;

    public NotificationPermissionFragment(yg30 yg30Var) {
        this.F1 = yg30Var;
    }

    public final void Y0() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ALLBOARDING_SCREEN_RESPONSE", new ip41(0, 3));
        sap1.m(this, "ALLBOARDING_SCREEN_RESPONSE", bundle);
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("PUSHOPTIN", "pushoptin", 1604, "pushoptin");
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
        jpa0 jpa0Var = this.J1;
        if (jpa0Var == null) {
            u890.C("permissionRequester");
            throw null;
        }
        y3o0 y3o0Var = new y3o0(this, (byte) 10);
        jpa0Var.b = (pf30) a0(new cj8(y3o0Var, (byte) 6), new e1r0((byte) 4));
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        uso0 uso0Var = this.I1;
        if (uso0Var == null) {
            u890.C("statusChecker");
            throw null;
        }
        int iA = uso0Var.a();
        if (!cfm0.c(iA)) {
            if (cfm0.d(iA)) {
                bnj0 bnj0Var = this.K1;
                if (bnj0Var == null) {
                    u890.C("enableNotificationChannel");
                    throw null;
                }
                bnj0Var.m();
            }
            Y0();
            return;
        }
        uso0 uso0Var2 = this.I1;
        if (uso0Var2 == null) {
            u890.C("statusChecker");
            throw null;
        }
        hma1 hma1VarEdit = uso0Var2.b.edit();
        hma1VarEdit.a(uso0.c, true);
        hma1VarEdit.h();
        if (this.O1 || bundle != null) {
            return;
        }
        rok0 rok0Var = this.H1;
        if (rok0Var == null) {
            u890.C("ubiLogger");
            throw null;
        }
        i8h1 i8h1Var = (i8h1) rok0Var.b;
        x6h1 x6h1VarC = ((yvk0) rok0Var.c).b.c();
        x6h1VarC.i.add(new a7h1("opt_in_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var.f(k7h1Var.a(), (Set) null);
        rok0 rok0Var2 = this.H1;
        if (rok0Var2 == null) {
            u890.C("ubiLogger");
            throw null;
        }
        i8h1 i8h1Var2 = (i8h1) rok0Var2.b;
        x6h1 x6h1VarC2 = ((yvk0) rok0Var2.c).b.c();
        x6h1VarC2.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        k7h1 k7h1Var2 = new k7h1();
        ((xjn) k7h1Var2).a = y6h1VarA2;
        ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
        i8h1Var2.f(k7h1Var2.a(), (Set) null);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.x0(layoutInflater, viewGroup, bundle);
        if (!this.O1) {
            View viewInflate = layoutInflater.inflate(2131625302, viewGroup, false);
            int i = 2131427374;
            PrimaryButtonView primaryButtonViewT = m5n1.t(viewInflate, 2131427374);
            if (primaryButtonViewT != null) {
                i = 2131428421;
                PrimaryButtonView primaryButtonViewT2 = m5n1.t(viewInflate, 2131428421);
                if (primaryButtonViewT2 != null) {
                    i = 2131428800;
                    if (m5n1.t(viewInflate, 2131428800) != null) {
                        i = 2131428921;
                        if (((LinearLayout) m5n1.t(viewInflate, 2131428921)) != null) {
                            i = 2131430164;
                            if (m5n1.t(viewInflate, 2131430164) != null) {
                                i = 2131430199;
                                if (m5n1.t(viewInflate, 2131430199) != null) {
                                    i = 2131431356;
                                    if (m5n1.t(viewInflate, 2131431356) != null) {
                                        this.G1 = new drj0((ScrollView) viewInflate, primaryButtonViewT, primaryButtonViewT2);
                                        primaryButtonViewT.setOnClickListener(new dso0(this, (byte) 0));
                                        drj0 drj0Var = this.G1;
                                        drj0Var.getClass();
                                        ((PrimaryButtonView) drj0Var.c).setOnClickListener(new dso0(this, (byte) 1));
                                        N0().J().a(n0(), new x11((byte) 2, true));
                                        drj0 drj0Var2 = this.G1;
                                        drj0Var2.getClass();
                                        return (ScrollView) drj0Var2.b;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            return null;
        }
        yvk0 yvk0Var = this.L1;
        if (yvk0Var == null) {
            u890.C("eventFactory");
            throw null;
        }
        qj0 qj0Var = new qj0(yvk0Var, new cso0(this, (byte) 0), new cso0(this, (byte) 1));
        ComposeView composeView = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        op80 jp80Var = new jp80(composeView);
        l6h1 l6h1Var = this.N1;
        if (l6h1Var == null) {
            u890.C("ubiDwellTimeLogger");
            throw null;
        }
        i8h1 i8h1Var = this.M1;
        if (i8h1Var == null) {
            u890.C("rawUbiLogger");
            throw null;
        }
        op80 eq80Var = new eq80(new e3h1(l6h1Var, (n7h1) null, i8h1Var));
        op80 wchVar = q6x.b;
        if (jp80Var.equals(wchVar) && eq80Var.equals(wchVar)) {
            jp80Var = wchVar;
        } else if (jp80Var.equals(wchVar)) {
            jp80Var = eq80Var;
        } else if (!eq80Var.equals(wchVar)) {
            wchVar = new wch(jp80Var, eq80Var);
            jp80Var = wchVar;
        }
        xhk1.c(composeView, jp80Var);
        composeView.setContent(new j2i(-1790700601, new bso0(qj0Var, this, (byte) 2), true));
        N0().J().a(n0(), new x11((byte) 2, true));
        return composeView;
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        jpa0 jpa0Var = this.J1;
        if (jpa0Var == null) {
            u890.C("permissionRequester");
            throw null;
        }
        pf30 pf30Var = (pf30) jpa0Var.b;
        if (pf30Var == null) {
            u890.C("requestPermissionLauncher");
            throw null;
        }
        pf30Var.b();
        bnj0 bnj0Var = this.K1;
        if (bnj0Var == null) {
            u890.C("enableNotificationChannel");
            throw null;
        }
        ((vku) bnj0Var.c).c();
        this.G1 = null;
    }
}
