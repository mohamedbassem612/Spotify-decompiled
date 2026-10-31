package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v51 implements Connectable {
    public final View N0;
    public final ComposeView O0;
    public final ComposeView P0;
    public final PublishSubject Q0;
    public x3p1 R0;
    public final r4u S0;
    public final r4u T0;
    public final xzl0 X;
    public final yzl0 Y;
    public final PublishSubject Z = new PublishSubject();
    public final gid a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final i8h1 f;
    public final qhe0 g;
    public final vzl0 h;
    public final wdl0 i;
    public final zdl0 t;

    public v51(LayoutInflater layoutInflater, ViewGroup viewGroup, gid gidVar, boolean z, boolean z2, boolean z3, boolean z4, i8h1 i8h1Var, qhe0 qhe0Var, vzl0 vzl0Var, wdl0 wdl0Var, zdl0 zdl0Var, xzl0 xzl0Var, yzl0 yzl0Var) {
        this.a = gidVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = i8h1Var;
        this.g = qhe0Var;
        this.h = vzl0Var;
        this.i = wdl0Var;
        this.t = zdl0Var;
        this.X = xzl0Var;
        this.Y = yzl0Var;
        View viewInflate = layoutInflater.inflate(2131624657, viewGroup, false);
        this.N0 = viewInflate;
        this.O0 = viewInflate.findViewById(2131427549);
        this.P0 = viewInflate.findViewById(2131428474);
        this.Q0 = new PublishSubject();
        this.R0 = l51.c;
        this.S0 = r4u.a(new ymm0(this, (byte) 7));
        this.T0 = new r4u(new x6o0(this, (byte) 7), new t7o0(this, (byte) 8));
    }

    @Override // com.spotify.mobius.Connectable
    public final Connection L(Consumer consumer) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.b(this.Q0.subscribe((io.reactivex.rxjava3.functions.Consumer) new dn(consumer, (byte) 2)));
        return new cn(this, compositeDisposable, (byte) 2);
    }

    public final void a(x3p1 x3p1Var) {
        int i;
        d51 d51Var;
        this.R0 = x3p1Var;
        boolean z = x3p1Var instanceof f51;
        ComposeView composeView = this.O0;
        if (!z) {
            composeView.setVisibility(8);
            composeView.setContent(r3i.a);
        }
        if (x3p1Var.equals(l51.c)) {
            return;
        }
        boolean z2 = x3p1Var instanceof p51;
        wfg wfgVar = wfg.a;
        PublishSubject publishSubject = this.Q0;
        qhe0 qhe0Var = this.g;
        View view = this.N0;
        if (z2) {
            p51 p51Var = (p51) x3p1Var;
            String string = view.getContext().getString(2131955696);
            String string2 = view.getContext().getString(2131955690);
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            t8h1.n(qhe0Var, yon1.B2());
            String strY = p51Var.y();
            String strX = p51Var.x();
            b(new j0f0(strY, strX.length() == 0 ? null : strX, (hux) null, new h0f0(string, new u51(this, (byte) 20)), new h0f0(string2, new u51(this, (byte) 21)), new i3u(4, false, false, false), new u51(this, (byte) 22), (Function0) null, 132));
            publishSubject.onNext(wfgVar);
            return;
        }
        if (x3p1Var instanceof g51) {
            g51 g51Var = (g51) x3p1Var;
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            t8h1.n(qhe0Var, yon1.w());
            String strY2 = g51Var.y();
            String strX2 = g51Var.x();
            b(new j0f0(strY2, strX2.length() == 0 ? null : strX2, (hux) null, new h0f0(view.getContext().getString(2131955693), new y4(this, g51Var, (byte) 14)), (h0f0) null, new i3u(4, false, false, false), new u51(this, (byte) 5), (Function0) null, 148));
            publishSubject.onNext(wfgVar);
            return;
        }
        if (x3p1Var instanceof m51) {
            int iC = l1d.C(((m51) x3p1Var).x());
            if (iC == 0) {
                String string3 = view.getContext().getString(2131959672);
                String string4 = view.getContext().getString(2131959671);
                String string5 = view.getContext().getString(2131959668);
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                d51Var = new d51(string3, string4, string5, yon1.A2(), xap1.w().l().p());
            } else if (iC == 1) {
                String string6 = view.getContext().getString(2131959667);
                String string7 = view.getContext().getString(2131959666);
                String string8 = view.getContext().getString(2131959673);
                AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                d51Var = new d51(string6, string7, string8, yon1.y2(), hap1.r().q().n());
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                String string9 = view.getContext().getString(2131959670);
                String string10 = view.getContext().getString(2131959669);
                String string11 = view.getContext().getString(2131959668);
                AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                d51Var = new d51(string9, string10, string11, yon1.z2(), uap1.i().k().p());
            }
            String strA = d51Var.a();
            String strB = d51Var.b();
            String strC = d51Var.c();
            n6r0 n6r0VarD = d51Var.d();
            w7h1 w7h1VarE = d51Var.e();
            t8h1.n(qhe0Var, n6r0VarD);
            b(new j0f0(strA, strB, (hux) null, new h0f0(strC, new y4(this, w7h1VarE, (byte) 15)), (h0f0) null, new i3u(4, false, false, false), new u51(this, (byte) 16), (Function0) null, 148));
            publishSubject.onNext(wfgVar);
            return;
        }
        boolean z3 = x3p1Var instanceof o51;
        gid gidVar = this.a;
        if (z3) {
            o51 o51Var = (o51) x3p1Var;
            int i2 = (this.b || this.c) ? 2131955689 : 2131955693;
            gidVar.p();
            String strY3 = o51Var.y();
            String strX3 = o51Var.x();
            b(new j0f0(strY3, strX3.length() == 0 ? null : strX3, (hux) null, new h0f0(view.getContext().getString(i2), new y4(this, o51Var, (byte) 16)), (h0f0) null, new i3u(4, false, false, false), (Function0) null, (Function0) null, 212));
            publishSubject.onNext(wfgVar);
            return;
        }
        if (x3p1Var instanceof h51) {
            h51 h51Var = (h51) x3p1Var;
            AtomicReferenceArray atomicReferenceArray6 = p6r0.e;
            t8h1.n(qhe0Var, yon1.l5());
            String strY4 = h51Var.y();
            String strX4 = h51Var.x();
            b(new j0f0(strY4, strX4.length() == 0 ? null : strX4, (hux) null, new h0f0(view.getContext().getString(2131955691), new u51(this, (byte) 6)), new h0f0(view.getContext().getString(2131955690), new u51(this, (byte) 7)), new i3u(4, false, false, false), new u51(this, (byte) 8), (Function0) null, 132));
            publishSubject.onNext(wfgVar);
            return;
        }
        if (x3p1Var instanceof k51) {
            f31 f31VarX = ((k51) x3p1Var).x();
            if (u890.j(f31VarX, c31.a)) {
                AtomicReferenceArray atomicReferenceArray7 = p6r0.e;
                t8h1.n(qhe0Var, yon1.l5());
                b(new j0f0(view.getContext().getString(2131962502), view.getContext().getString(2131962501), (hux) null, new h0f0(view.getContext().getString(2131955691), new u51(this, (byte) 2)), new h0f0(view.getContext().getString(2131955690), new u51(this, (byte) 3)), new i3u(4, false, false, false), new u51(this, (byte) 4), (Function0) null, 132));
                return;
            } else if (u890.j(f31VarX, d31.a)) {
                b(new j0f0(view.getContext().getString(2131957214), view.getContext().getString(2131957213), (hux) null, new h0f0(view.getContext().getString(2131955693), new u51(this, (byte) 15)), (h0f0) null, new i3u(4, false, false, false), (Function0) null, (Function0) null, 212));
                return;
            } else if (u890.j(f31VarX, e31.a)) {
                b(new j0f0(view.getContext().getString(2131957212), (String) null, (hux) null, new h0f0(view.getContext().getString(2131955693), new u51(this, (byte) 18)), (h0f0) null, new i3u(4, false, false, false), (Function0) null, (Function0) null, 214));
                return;
            } else {
                eg.o();
                return;
            }
        }
        if (x3p1Var instanceof n51) {
            n51 n51Var = (n51) x3p1Var;
            gidVar.o();
            AtomicReferenceArray atomicReferenceArray8 = p6r0.e;
            t8h1.n(qhe0Var, yon1.n5());
            g2d1 g2d1VarX = n51Var.x();
            if (u890.j(g2d1VarX, e2d1.a)) {
                i = 5;
            } else if (u890.j(g2d1VarX, a2d1.a)) {
                i = 3;
            } else if (u890.j(g2d1VarX, z1d1.a)) {
                i = 2;
            } else {
                if (!u890.j(g2d1VarX, d2d1.a)) {
                    if (u890.j(g2d1VarX, y1d1.a)) {
                        eg.m("EmailSignup is handled as ExitFlowDialog, not RegistrationDisabledDialog");
                        return;
                    } else {
                        hhg1.o(g2d1VarX, "Unsupported identity for RegistrationDisabledDialog: ");
                        return;
                    }
                }
                i = 4;
            }
            b(new j0f0(n51Var.y(), view.getContext().getString(2131955746), (hux) null, new h0f0(view.getContext().getString(2131955693), new hh(this, zr7.F(i), n51Var, (byte) 2)), (h0f0) null, new i3u(4, false, false, false), new u51(this, (byte) 19), (Function0) null, 148));
            publishSubject.onNext(wfgVar);
            return;
        }
        if (x3p1Var instanceof i51) {
            i51 i51Var = (i51) x3p1Var;
            bk8 bk8VarX = i51Var.x();
            int i3 = bk8VarX == null ? -1 : q51.a[bk8VarX.ordinal()];
            if (i3 == 1) {
                b(new j0f0(i51Var.z(), (String) null, (hux) null, new h0f0(view.getContext().getString(2131958002), new u51(this, (byte) 13)), new h0f0(view.getContext().getString(2131958003), new u51(this, (byte) 14)), new i3u(4, false, false, false), (Function0) null, (Function0) null, 198));
            } else if (i3 == 2 || i3 == 3) {
                String strZ = i51Var.z();
                String strY5 = i51Var.y();
                b(new j0f0(strZ, strY5.length() == 0 ? null : strY5, (hux) null, new h0f0(view.getContext().getString(2131955693), new u51(this, (byte) 17)), (h0f0) null, new i3u(4, false, false, false), (Function0) null, (Function0) null, 212));
            } else {
                AtomicReferenceArray atomicReferenceArray9 = p6r0.e;
                t8h1.n(qhe0Var, yon1.C2());
                b(new j0f0(i51Var.z(), (String) null, (hux) null, new h0f0(view.getContext().getString(2131955693), new u51(this, (byte) 9)), (h0f0) null, new i3u(4, false, false, false), new u51(this, (byte) 10), (Function0) null, 150));
            }
            publishSubject.onNext(wfgVar);
            return;
        }
        if (x3p1Var instanceof j51) {
            j51 j51Var = (j51) x3p1Var;
            AtomicReferenceArray atomicReferenceArray10 = p6r0.e;
            t8h1.n(qhe0Var, yon1.u3());
            String strY6 = j51Var.y();
            String strX5 = j51Var.x();
            b(new j0f0(strY6, strX5.length() == 0 ? null : strX5, (hux) null, new h0f0(view.getContext().getString(2131955696), new u51(this, (byte) 11)), (h0f0) null, new i3u(4, false, false, false), new u51(this, (byte) 12), (Function0) null, 148));
            publishSubject.onNext(wfgVar);
            return;
        }
        if (x3p1Var.equals(e51.c) || x3p1Var.equals(l51.d)) {
            return;
        }
        if (!z) {
            eg.o();
            return;
        }
        f51 f51Var = (f51) x3p1Var;
        gidVar.l(f51Var.x(), f51Var.y());
        t8h1.n(qhe0Var, a4p1.e(f51Var.x()));
        qhe0Var.F();
        String strR = k1o1.r(view.getContext(), f51Var.y());
        t51 t51Var = new t51(this, f51Var, (byte) 0);
        t51 t51Var2 = new t51(this, f51Var, (byte) 1);
        t51 t51Var3 = new t51(f51Var, this, (byte) 3);
        composeView.setVisibility(0);
        composeView.setContent(apo.j(-966457104, new s51(f51Var, strR, t51Var2, t51Var, t51Var3, this, (byte) 1), true));
    }

    public final void b(j0f0 j0f0Var) {
        this.P0.setContent(apo.j(-1593946688, new n2(j0f0Var, this, (byte) 9), true));
    }
}
