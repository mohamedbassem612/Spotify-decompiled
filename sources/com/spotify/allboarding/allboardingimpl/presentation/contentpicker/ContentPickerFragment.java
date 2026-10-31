package com.spotify.allboarding.allboardingimpl.presentation.contentpicker;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.mobius.android.MobiusLoopViewModel;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import p.a0m;
import p.a4m;
import p.aok;
import p.at3;
import p.b0m;
import p.b8k1;
import p.bck1;
import p.bhn0;
import p.bxs0;
import p.c0m;
import p.cyo1;
import p.d0m;
import p.dm5;
import p.dtw;
import p.dxs0;
import p.e0m;
import p.e3h1;
import p.edr0;
import p.en3;
import p.eq80;
import p.es3;
import p.f4m;
import p.f6o1;
import p.fe41;
import p.g22;
import p.g521;
import p.g931;
import p.gw70;
import p.h0m;
import p.h3n;
import p.hid0;
import p.i0m;
import p.i3h1;
import p.i8h1;
import p.ij81;
import p.ipb1;
import p.iw4;
import p.j3h1;
import p.jik1;
import p.jp5;
import p.jp80;
import p.ka;
import p.l6h1;
import p.lcb0;
import p.lik1;
import p.lo9;
import p.m5n1;
import p.mhc;
import p.n6r0;
import p.n7h1;
import p.o6r0;
import p.op80;
import p.p6r0;
import p.pap1;
import p.phi0;
import p.pzl;
import p.q0t;
import p.q6x;
import p.qm3;
import p.qtw;
import p.r7k1;
import p.rc11;
import p.ro41;
import p.tka0;
import p.ts3;
import p.txs0;
import p.tzr0;
import p.u890;
import p.vws0;
import p.wch;
import p.wpo1;
import p.xhk1;
import p.xws0;
import p.ydb;
import p.yg30;
import p.yon1;
import p.z6x;
import p.zf30;
import p.znb0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/allboarding/allboardingimpl/presentation/contentpicker/ContentPickerFragment;", "Lp/zf30;", "Lp/o6r0;", "Lp/jik1;", "Lp/yg30;", "injector", "<init>", "(Lp/yg30;)V", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ContentPickerFragment extends zf30 implements o6r0, jik1 {
    public final yg30 F1;
    public j3h1 G1;
    public edr0 H1;
    public i8h1 I1;
    public l6h1 J1;
    public iw4 K1;
    public f4m L1;
    public final bck1 M1;
    public gw70 N1;
    public en3 O1;
    public boolean P1;
    public tzr0 Q1;
    public dtw R1;
    public dtw S1;
    public dtw T1;
    public dtw U1;
    public FrameLayout V1;
    public FrameLayout W1;
    public int X1;
    public List Y1;
    public List Z1;
    public txs0 a2;
    public at3 b2;
    public lcb0 c2;
    public final b0m d2;
    public final h0m e2;
    public boolean f2;
    public final lik1 g2;

    public ContentPickerFragment(yg30 yg30Var) {
        this.F1 = yg30Var;
        b0m b0mVar = new b0m(this, (byte) 10);
        znb0 znb0VarS = dm5.S(3, new ka(new ka(this, (byte) 13), (byte) 14));
        this.M1 = new bck1(rc11.a.b(a4m.class), new g22(znb0VarS, (byte) 4), b0mVar, new g22(znb0VarS, (byte) 5));
        this.Y1 = z6x.a;
        this.d2 = new b0m(this, (byte) 4);
        this.e2 = new h0m(this);
        this.f2 = true;
        this.g2 = ts3.CONTENT_PICKER.b;
    }

    public final void D0() {
        a1().b(3);
        ((zf30) this).h1 = true;
        a4m a4mVarD1 = d1();
        a4mVarD1.g.b(a4mVarD1.V(), "VIEW_STATE");
    }

    public final void I0(View view, Bundle bundle) {
        a1().e(3, false);
        ((MobiusLoopViewModel) d1()).c.c(this, new es3(this, (byte) 3));
        ((MobiusLoopViewModel) d1()).b.f(n0(), new e0m(this, (byte) 0));
        fe41 fe41Var = (fe41) pap1.w(this).h(2131428220).X.getValue();
        fe41Var.a("skipDialogResult").f(this, new e0m(this, (byte) 1));
        fe41Var.a("searchResult_mobius").f(this, new jp5(this, fe41Var, (byte) 2));
        N0().J().a(n0(), new ydb(this, (byte) 4));
        a1().a(3);
    }

    public final List Y0(ro41 ro41Var) {
        txs0 txs0VarM = wpo1.m(ro41Var);
        List list = ro41Var.c;
        if (list == this.Z1 && u890.j(txs0VarM, this.a2)) {
            return this.Y1;
        }
        this.Z1 = list;
        this.a2 = txs0VarM;
        ArrayList arrayListO = cyo1.o(list, wpo1.m(ro41Var));
        this.Y1 = arrayListO;
        return arrayListO;
    }

    public final PickerCollapsingTitleBar Z0() {
        tzr0 tzr0Var = this.Q1;
        tzr0Var.getClass();
        return (PickerCollapsingTitleBar) tzr0Var.d;
    }

    public final iw4 a1() {
        iw4 iw4Var = this.K1;
        if (iw4Var != null) {
            return iw4Var;
        }
        u890.C("pageLoadTimeKeeper");
        throw null;
    }

    public final i3h1 b1() {
        j3h1 j3h1Var = this.G1;
        if (j3h1Var != null) {
            return j3h1Var;
        }
        u890.C("pickerLogger");
        throw null;
    }

    public final GridRecyclerView c1() {
        tzr0 tzr0Var = this.Q1;
        tzr0Var.getClass();
        return (GridRecyclerView) tzr0Var.e;
    }

    public final a4m d1() {
        return (a4m) this.M1.getValue();
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("ALLBOARDING_CONTENTPICKER", "allboarding/contentpicker", 144, qm3.b);
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getG2() {
        return this.g2;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        iw4.d(a1(), aok.T0);
        super.w0(bundle);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle == null) {
            en3 en3Var = this.O1;
            if (en3Var == null) {
                u890.C("screenProvider");
                throw null;
            }
            d1().U(new pzl((ro41) en3Var.a));
        }
        byte b = 2;
        byte b2 = 0;
        a1().e(2, false);
        CoordinatorLayout coordinatorLayoutInflate = layoutInflater.inflate(2131625375, viewGroup, false);
        int i = 2131427841;
        View viewT = m5n1.t(coordinatorLayoutInflate, 2131427841);
        if (viewT != null) {
            int i2 = 2131427441;
            EncoreButton encoreButtonT = m5n1.t(viewT, 2131427441);
            if (encoreButtonT != null) {
                i2 = 2131428083;
                EncoreTextView encoreTextViewT = m5n1.t(viewT, 2131428083);
                if (encoreTextViewT != null) {
                    i2 = 2131430860;
                    EncoreButton encoreButtonT2 = m5n1.t(viewT, 2131430860);
                    if (encoreButtonT2 != null) {
                        i2 = 2131430916;
                        EncoreTextView encoreTextViewT2 = m5n1.t(viewT, 2131430916);
                        if (encoreTextViewT2 != null) {
                            phi0 phi0Var = new phi0((LinearLayout) viewT, encoreButtonT, encoreTextViewT, encoreButtonT2, encoreTextViewT2, (byte) 10);
                            CoordinatorLayout coordinatorLayout = coordinatorLayoutInflate;
                            i = 2131430336;
                            PickerCollapsingTitleBar pickerCollapsingTitleBar = (PickerCollapsingTitleBar) m5n1.t(coordinatorLayoutInflate, 2131430336);
                            if (pickerCollapsingTitleBar != null) {
                                i = 2131430338;
                                GridRecyclerView gridRecyclerView = (GridRecyclerView) m5n1.t(coordinatorLayoutInflate, 2131430338);
                                if (gridRecyclerView != null) {
                                    this.Q1 = new tzr0(coordinatorLayout, phi0Var, pickerCollapsingTitleBar, gridRecyclerView, (byte) 5);
                                    gw70 gw70Var = this.N1;
                                    if (gw70Var == null) {
                                        u890.C("imageLoader");
                                        throw null;
                                    }
                                    byte b3 = 3;
                                    this.b2 = new at3(gw70Var, new d0m(this, b), new d0m(this, b3));
                                    this.c2 = new lcb0(new c0m(this, b), new d0m(this, (byte) 4));
                                    GridRecyclerView gridRecyclerViewC1 = c1();
                                    at3 at3Var = this.b2;
                                    if (at3Var == null) {
                                        u890.C("rvAdapter");
                                        throw null;
                                    }
                                    gridRecyclerViewC1.setAdapter(at3Var);
                                    c1().setLayoutAnimation(null);
                                    c1().getItemAnimator().g = false;
                                    PickerCollapsingTitleBar pickerCollapsingTitleBarZ0 = Z0();
                                    lcb0 lcb0Var = this.c2;
                                    if (lcb0Var == null) {
                                        u890.C("tagRvAdapter");
                                        throw null;
                                    }
                                    pickerCollapsingTitleBarZ0.setFiltersRecyclerViewAdapter(lcb0Var);
                                    byte b4 = 9;
                                    if (!this.P1) {
                                        ((CopyOnWriteArraySet) Z0().e1.a).add(this.e2);
                                        GridRecyclerView gridRecyclerViewC2 = c1();
                                        PickerCollapsingTitleBar pickerCollapsingTitleBarZ1 = Z0();
                                        g931 g931Var = new g931(gridRecyclerViewC2, pickerCollapsingTitleBarZ1, new b0m(this, b4), (byte) 17);
                                        View searchFieldRoot = pickerCollapsingTitleBarZ1.getSearchFieldRoot();
                                        if (searchFieldRoot != null) {
                                            Button searchPlaceholder = pickerCollapsingTitleBarZ1.getSearchPlaceholder();
                                            gridRecyclerViewC2.setUpwardFocusTarget(searchFieldRoot);
                                            gridRecyclerViewC2.setOnExpandCollapsingTitleBar(new g521(g931Var, (byte) 29));
                                            searchFieldRoot.setOnKeyListener(new q0t(g931Var, b));
                                            if (searchPlaceholder != null) {
                                                searchPlaceholder.setOnClickListener(new hid0(g931Var, (byte) 26));
                                            }
                                        }
                                    }
                                    c1().k(new i0m((byte) 0));
                                    a1().a(2);
                                    byte b5 = 1;
                                    if (this.P1) {
                                        Z0().setHeaderComposeVisible(true);
                                        FrameLayout headerTitleComposeContainer = Z0().getB1();
                                        int dimensionPixelSize = k0().getDimensionPixelSize(2131165186);
                                        headerTitleComposeContainer.setMinimumHeight(dimensionPixelSize);
                                        ij81 ij81Var = new ij81(dimensionPixelSize, (byte) 9);
                                        WeakHashMap weakHashMap = b8k1.a;
                                        r7k1.c(headerTitleComposeContainer, ij81Var);
                                        b0m b0mVar = new b0m(this, b3);
                                        c0m c0mVar = new c0m(this, b5);
                                        d0m d0mVar = new d0m(this, b5);
                                        b0m b0mVar2 = this.d2;
                                        qtw qtwVarA = f6o1.A(new dxs0(b0mVar2, b0mVar, c0mVar, d0mVar), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                                        tka0 tka0Var = dtw.C;
                                        dtw dtwVarB = mhc.b(headerTitleComposeContainer.getContext(), headerTitleComposeContainer, qtwVarA, bxs0.g, (ipb1) null, 112);
                                        headerTitleComposeContainer.removeAllViews();
                                        headerTitleComposeContainer.addView(dtwVarB.w);
                                        this.S1 = dtwVarB;
                                        FrameLayout headerContentComposeContainer = Z0().getC1();
                                        dtw dtwVarB2 = mhc.b(headerContentComposeContainer.getContext(), headerContentComposeContainer, f6o1.A(new xws0(b0mVar2, new b0m(this, b2), new c0m(this, b2), new d0m(this, b2), new b0m(this, b5), new b0m(this, b)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), vws0.e, (ipb1) null, 112);
                                        headerContentComposeContainer.removeAllViews();
                                        headerContentComposeContainer.addView(dtwVarB2.w);
                                        this.T1 = dtwVarB2;
                                        tzr0 tzr0Var = this.Q1;
                                        tzr0Var.getClass();
                                        ((LinearLayout) ((phi0) tzr0Var.c).b).setVisibility(8);
                                        FrameLayout frameLayout = new FrameLayout(P0());
                                        h3n h3nVar = new h3n(-1, -2);
                                        h3nVar.c = 81;
                                        frameLayout.setLayoutParams(h3nVar);
                                        frameLayout.setAccessibilityLiveRegion(1);
                                        tzr0 tzr0Var2 = this.Q1;
                                        tzr0Var2.getClass();
                                        ((CoordinatorLayout) tzr0Var2.b).addView(frameLayout);
                                        this.W1 = frameLayout;
                                        r7k1.c(frameLayout, new a0m(this, b2));
                                        c1().setVisibility(8);
                                        FrameLayout frameLayout2 = new FrameLayout(P0());
                                        h3n h3nVar2 = new h3n(-1, -1);
                                        h3nVar2.b(new AppBarLayout.ScrollingViewBehavior());
                                        frameLayout2.setLayoutParams(h3nVar2);
                                        tzr0 tzr0Var3 = this.Q1;
                                        tzr0Var3.getClass();
                                        ((CoordinatorLayout) tzr0Var3.b).addView(frameLayout2, 1);
                                        this.V1 = frameLayout2;
                                        FrameLayout frameLayout3 = this.W1;
                                        if (frameLayout3 != null) {
                                            if (frameLayout2.getId() == -1) {
                                                frameLayout2.setId(View.generateViewId());
                                            }
                                            if (frameLayout3.getId() == -1) {
                                                frameLayout3.setId(View.generateViewId());
                                            }
                                            frameLayout2.setNextFocusDownId(frameLayout3.getId());
                                            frameLayout2.setNextFocusForwardId(frameLayout3.getId());
                                            frameLayout3.setNextFocusUpId(frameLayout2.getId());
                                        }
                                        Z0().setOnCollapseFractionChanged(new c0m(this, b3));
                                        tzr0 tzr0Var4 = this.Q1;
                                        tzr0Var4.getClass();
                                        CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) tzr0Var4.b;
                                        tzr0 tzr0Var5 = this.Q1;
                                        tzr0Var5.getClass();
                                        op80 jp80Var = new jp80((CoordinatorLayout) tzr0Var5.b);
                                        i8h1 i8h1Var = this.I1;
                                        if (i8h1Var == null) {
                                            u890.C("ubiLogger");
                                            throw null;
                                        }
                                        l6h1 l6h1Var = this.J1;
                                        if (l6h1Var == null) {
                                            u890.C("ubiDwellTimeLogger");
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
                                        xhk1.c(coordinatorLayout2, jp80Var);
                                    } else {
                                        tzr0 tzr0Var6 = this.Q1;
                                        tzr0Var6.getClass();
                                        ((LinearLayout) ((phi0) tzr0Var6.c).b).setAccessibilityLiveRegion(1);
                                        tzr0 tzr0Var7 = this.Q1;
                                        tzr0Var7.getClass();
                                        LinearLayout linearLayout = (LinearLayout) ((phi0) tzr0Var7.c).b;
                                        lo9 lo9Var = new lo9((Object) this, (byte) 21);
                                        WeakHashMap weakHashMap2 = b8k1.a;
                                        r7k1.c(linearLayout, lo9Var);
                                    }
                                    tzr0 tzr0Var8 = this.Q1;
                                    tzr0Var8.getClass();
                                    return (CoordinatorLayout) tzr0Var8.b;
                                }
                            }
                        }
                    }
                }
            }
            bhn0.i("Missing required view with ID: ".concat(viewT.getResources().getResourceName(i2)));
            return null;
        }
        bhn0.i("Missing required view with ID: ".concat(coordinatorLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public final void z0() {
        ((zf30) this).h1 = true;
        if (this.P1) {
            Z0().setOnCollapseFractionChanged(null);
        } else {
            ((CopyOnWriteArraySet) Z0().e1.a).remove(this.e2);
        }
        this.R1 = null;
        this.S1 = null;
        this.T1 = null;
        this.U1 = null;
        this.V1 = null;
        this.W1 = null;
        this.Z1 = null;
        this.a2 = null;
        this.Y1 = z6x.a;
    }
}
