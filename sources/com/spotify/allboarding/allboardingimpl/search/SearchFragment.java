package com.spotify.allboarding.allboardingimpl.search;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.transition.TransitionInflater;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import com.spotify.allboarding.allboardingimpl.search.ui.ToolbarSearchFieldView;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.a7h1;
import p.aiq0;
import p.bck1;
import p.bhk1;
import p.bqk0;
import p.bt3;
import p.cad1;
import p.dm5;
import p.e3h1;
import p.e821;
import p.edr0;
import p.eq80;
import p.f351;
import p.ffe1;
import p.ft3;
import p.g22;
import p.g351;
import p.g54;
import p.gw70;
import p.h351;
import p.hid0;
import p.hv41;
import p.i351;
import p.i8h1;
import p.iw4;
import p.j2i;
import p.j351;
import p.jik1;
import p.jp80;
import p.jqb0;
import p.jyh0;
import p.k351;
import p.k3s;
import p.k7h1;
import p.kd51;
import p.kdn0;
import p.l6h1;
import p.ld51;
import p.lik1;
import p.mbh0;
import p.mlw0;
import p.n6r0;
import p.n7h1;
import p.n8p;
import p.o6r0;
import p.o7h;
import p.oa41;
import p.of61;
import p.op80;
import p.p6r0;
import p.q6x;
import p.qm3;
import p.qpj0;
import p.rc11;
import p.se11;
import p.ts3;
import p.u890;
import p.u961;
import p.ul4;
import p.wch;
import p.x6h1;
import p.xhk1;
import p.xjn;
import p.y6h1;
import p.yg30;
import p.yon1;
import p.zf30;
import p.zl7;
import p.znb0;
import p.zw81;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/spotify/allboarding/allboardingimpl/search/SearchFragment;", "Lp/zf30;", "Lp/o6r0;", "Lp/jik1;", "Lp/yg30;", "injector", "<init>", "(Lp/yg30;)V", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SearchFragment extends zf30 implements o6r0, jik1 {
    public final yg30 F1;
    public ffe1 G1;
    public iw4 H1;
    public gw70 I1;
    public ld51 J1;
    public edr0 K1;
    public i8h1 L1;
    public l6h1 M1;
    public ul4 N1;
    public n8p O1;
    public final bck1 P1;
    public RecyclerView Q1;
    public hv41 R1;
    public ViewGroup S1;
    public ViewGroup T1;
    public View U1;
    public TextView V1;
    public TextView W1;
    public Button X1;
    public boolean Y1;
    public u961 Z1;
    public final k351 a2;
    public final zl7 b2;
    public boolean c2;
    public final lik1 d2;

    public SearchFragment(yg30 yg30Var) {
        this.F1 = yg30Var;
        i351 i351Var = new i351(this, (byte) 2);
        znb0 znb0VarS = dm5.S(3, new jqb0(new jqb0(this, (byte) 16), (byte) 17));
        this.P1 = new bck1(rc11.a.b(kd51.class), new g22(znb0VarS, (byte) 11), i351Var, new g22(znb0VarS, (byte) 12));
        this.a2 = new k351(this);
        this.b2 = new zl7(this, (byte) 19);
        this.c2 = true;
        this.d2 = ts3.SEARCH.b;
    }

    public final void D0() {
        Y0().b(3);
        ((zf30) this).h1 = true;
    }

    public final void F0(Bundle bundle) {
        edr0 edr0Var = this.K1;
        if (edr0Var == null) {
            u890.C("sessionIdProvider");
            throw null;
        }
        bundle.putString("SEARCH_SESSION_ID", edr0Var.b(of61.b).toString());
        bundle.putString("SAVED_SEARCH_QUERY", b1().f);
    }

    public final void G0() {
        ((zf30) this).h1 = true;
        if (a1()) {
            return;
        }
        u961 u961Var = this.Z1;
        if (u961Var == null) {
            u890.C("searchField");
            throw null;
        }
        ((CopyOnWriteArraySet) u961Var.a).add(this.a2);
        u961 u961Var2 = this.Z1;
        if (u961Var2 == null) {
            u890.C("searchField");
            throw null;
        }
        ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) u961Var2.d;
        AppCompatEditText queryEditText = toolbarSearchFieldView.getQueryEditText();
        queryEditText.requestFocus();
        queryEditText.postDelayed(new g54(queryEditText, (byte) 19), 250L);
        e821 e821Var = toolbarSearchFieldView.O0;
        e821.e(new Animator[]{(ObjectAnimator) e821Var.c, (AnimatorSet) e821Var.a});
        u961 u961Var3 = this.Z1;
        if (u961Var3 == null) {
            u890.C("searchField");
            throw null;
        }
        Editable text = ((ToolbarSearchFieldView) u961Var3.d).getQueryEditText().getText();
        String string = text != null ? text.toString() : null;
        if (string == null || string.length() <= 0) {
            return;
        }
        b1().T(string);
    }

    public final void H0() {
        ((zf30) this).h1 = true;
        if (a1()) {
            return;
        }
        u961 u961Var = this.Z1;
        if (u961Var == null) {
            u890.C("searchField");
            throw null;
        }
        ((CopyOnWriteArraySet) u961Var.a).remove(this.a2);
        Context contextP0 = P0();
        View viewQ0 = Q0();
        InputMethodManager inputMethodManager = (InputMethodManager) contextP0.getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(viewQ0.getWindowToken(), 0);
        }
    }

    public final void I0(View view, Bundle bundle) {
        ViewGroup viewGroup;
        Y0().e(3, false);
        if (!a1()) {
            ffe1 ffe1VarZ0 = Z0();
            i8h1 i8h1Var = (i8h1) ffe1VarZ0.b;
            bqk0 bqk0Var = (bqk0) ffe1VarZ0.c;
            x6h1 x6h1VarC = bqk0Var.b.c();
            x6h1VarC.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            k7h1Var.e = bqk0Var.c;
            i8h1Var.f(k7h1Var.a(), (Set) null);
            View viewFindViewById = view.findViewById(2131428620);
            ((ViewGroup) viewFindViewById).setBackgroundColor(P0().getColor(2131100141));
            this.T1 = (ViewGroup) viewFindViewById;
            this.U1 = view.findViewById(2131428619);
            ViewGroup viewGroup2 = this.T1;
            if (viewGroup2 == null) {
                u890.C("emptyState");
                throw null;
            }
            this.V1 = (TextView) viewGroup2.findViewById(R.id.text1);
            ViewGroup viewGroup3 = this.T1;
            if (viewGroup3 == null) {
                u890.C("emptyState");
                throw null;
            }
            this.W1 = (TextView) viewGroup3.findViewById(R.id.text2);
            ViewGroup viewGroup4 = this.T1;
            if (viewGroup4 == null) {
                u890.C("emptyState");
                throw null;
            }
            Button button = (Button) viewGroup4.findViewById(2131428621);
            this.X1 = button;
            button.setOnClickListener(new hid0(this, (byte) 27));
            mbh0 mbh0VarA = se11.a(kd51.Y, b1().X.getUrl());
            String str = mbh0VarA != null ? (String) o7h.q0(mbh0VarA.a()) : null;
            if (u890.j(str, "SHOW_CATEGORY")) {
                viewGroup = (ViewGroup) view.findViewById(2131429841);
            } else {
                viewGroup = u890.j(str, "ARTIST") ? (ViewGroup) view.findViewById(2131429839) : (ViewGroup) view.findViewById(2131429839);
            }
            this.S1 = viewGroup;
            ToolbarSearchFieldView toolbarSearchFieldView = (ToolbarSearchFieldView) view.findViewById(2131430847);
            Context contextP0 = P0();
            toolbarSearchFieldView.getClass();
            u961 u961Var = new u961(contextP0, toolbarSearchFieldView, true);
            this.Z1 = u961Var;
            ((ToolbarSearchFieldView) u961Var.d).getSearchPlaceHolder().setVisibility(8);
            u961 u961Var2 = this.Z1;
            if (u961Var2 == null) {
                u890.C("searchField");
                throw null;
            }
            u961Var2.b = new mlw0(this, (byte) 28);
            if (u961Var2 == null) {
                u890.C("searchField");
                throw null;
            }
            u961Var2.p();
            N0().J().a(n0(), new g351(this, (byte) 1));
            gw70 gw70Var = this.I1;
            if (gw70Var == null) {
                u890.C("imageLoader");
                throw null;
            }
            this.R1 = new hv41(gw70Var, new h351(this, (byte) 1), new h351(this, (byte) 2));
            RecyclerView recyclerViewFindViewById = view.findViewById(2131430842);
            this.Q1 = recyclerViewFindViewById;
            k3s k3sVar = new k3s();
            ((zw81) k3sVar).g = false;
            recyclerViewFindViewById.setItemAnimator(k3sVar);
            RecyclerView recyclerView = this.Q1;
            if (recyclerView == null) {
                u890.C("searchRecyclerView");
                throw null;
            }
            hv41 hv41Var = this.R1;
            if (hv41Var == null) {
                u890.C("rvAdapter");
                throw null;
            }
            recyclerView.setAdapter(hv41Var);
            RecyclerView recyclerView2 = this.Q1;
            if (recyclerView2 == null) {
                u890.C("searchRecyclerView");
                throw null;
            }
            recyclerView2.m(this.b2);
            b1().t.f(n0(), new qpj0(this, (byte) 10));
        }
        Y0().a(3);
        if (a1()) {
            Y0().e(5, false);
            aiq0.a(view, new jyh0(view, this, (byte) 19));
        }
    }

    public final iw4 Y0() {
        iw4 iw4Var = this.H1;
        if (iw4Var != null) {
            return iw4Var;
        }
        u890.C("pageLoadTimeKeeper");
        throw null;
    }

    public final ffe1 Z0() {
        ffe1 ffe1Var = this.G1;
        if (ffe1Var != null) {
            return ffe1Var;
        }
        u890.C("ubiSearchLogger");
        throw null;
    }

    public final boolean a1() {
        ul4 ul4Var = this.N1;
        if (ul4Var != null) {
            return ul4Var.f();
        }
        u890.C("properties");
        throw null;
    }

    public final kd51 b1() {
        return (kd51) this.P1.getValue();
    }

    public final void c1(String str, String str2, String str3) {
        TextView textView = this.V1;
        if (textView == null) {
            u890.C("emptyStateTitle");
            throw null;
        }
        textView.setText(str);
        TextView textView2 = this.V1;
        if (textView2 == null) {
            u890.C("emptyStateTitle");
            throw null;
        }
        textView2.setVisibility(str.length() > 0 ? 0 : 8);
        TextView textView3 = this.W1;
        if (textView3 == null) {
            u890.C("emptyStateSubtitle");
            throw null;
        }
        textView3.setText(str2);
        TextView textView4 = this.W1;
        if (textView4 == null) {
            u890.C("emptyStateSubtitle");
            throw null;
        }
        textView4.setVisibility(str2.length() > 0 ? 0 : 8);
        Button button = this.X1;
        if (button == null) {
            u890.C("emptyStateBtn");
            throw null;
        }
        button.setText(str3);
        Button button2 = this.X1;
        if (button2 != null) {
            button2.setVisibility(str3.length() > 0 ? 0 : 8);
        } else {
            u890.C("emptyStateBtn");
            throw null;
        }
    }

    public final void d1(boolean z) {
        if (z) {
            Z0().l();
        }
        View view = this.U1;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        } else {
            u890.C("emptyStateContainer");
            throw null;
        }
    }

    public final n6r0 e() {
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("ALLBOARDING_SEARCH", "allboarding/search", 148, qm3.b);
    }

    public final void e1(long j, boolean z) {
        ViewGroup viewGroup = this.S1;
        if (!z) {
            if (viewGroup == null) {
                u890.C("loadingView");
                throw null;
            }
            if (viewGroup.getVisibility() != 8) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(j);
                alphaAnimation.setFillAfter(true);
                alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
                alphaAnimation.setAnimationListener(new cad1(viewGroup, (byte) 1));
                viewGroup.startAnimation(alphaAnimation);
                return;
            }
            return;
        }
        if (viewGroup == null) {
            u890.C("loadingView");
            throw null;
        }
        if (viewGroup.getVisibility() != 0) {
            viewGroup.setVisibility(0);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(j);
            alphaAnimation2.setFillAfter(true);
            alphaAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
            viewGroup.startAnimation(alphaAnimation2);
        }
        ffe1 ffe1VarZ0 = Z0();
        i8h1 i8h1Var = (i8h1) ffe1VarZ0.b;
        bqk0 bqk0Var = (bqk0) ffe1VarZ0.c;
        x6h1 x6h1VarC = bqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("skeleton_view", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = bqk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public final void f1(boolean z) {
        RecyclerView recyclerView = this.Q1;
        if (recyclerView != null) {
            recyclerView.setVisibility(z ? 0 : 8);
        } else {
            u890.C("searchRecyclerView");
            throw null;
        }
    }

    /* JADX INFO: renamed from: getViewUri, reason: from getter */
    public final lik1 getD2() {
        return this.d2;
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        edr0 edr0Var = this.K1;
        of61 of61Var = of61.b;
        if (bundle == null) {
            if (edr0Var == null) {
                u890.C("sessionIdProvider");
                throw null;
            }
            edr0Var.a(of61Var);
        } else {
            if (edr0Var == null) {
                u890.C("sessionIdProvider");
                throw null;
            }
            edr0Var.c(of61Var, bundle.getString("SEARCH_SESSION_ID"));
            String string = bundle.getString("SAVED_SEARCH_QUERY");
            if (string != null) {
                b1().f = string;
            }
        }
        kd51 kd51VarB1 = b1();
        Parcelable parcelable = O0().getParcelable("allboarding-search-arg");
        parcelable.getClass();
        SearchConfiguration searchConfiguration = (SearchConfiguration) parcelable;
        kd51VarB1.X = searchConfiguration;
        kdn0 kdn0Var = kd51VarB1.t;
        bhk1 bhk1Var = (bhk1) kdn0Var.e();
        kdn0Var.j(bhk1Var != null ? bhk1.a(bhk1Var, null, searchConfiguration.getInitialText(), searchConfiguration.getPlaceholder(), 249) : null);
        e0().m = TransitionInflater.from(P0()).inflateTransition(R.transition.move);
        iw4.d(Y0(), oa41.N0);
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ComposeView composeViewInflate;
        Y0().e(2, false);
        if (a1()) {
            Parcelable parcelable = O0().getParcelable("allboarding-search-arg");
            parcelable.getClass();
            SearchConfiguration searchConfiguration = (SearchConfiguration) parcelable;
            n8p n8pVar = this.O1;
            if (n8pVar == null) {
                u890.C("searchElementFactory");
                throw null;
            }
            ft3 ft3VarA = n8pVar.a(new bt3(new h351(this, (byte) 0), new i351(this, (byte) 0), new i351(this, (byte) 1), new j351(this, (byte) 0), new j351(this, (byte) 1)));
            composeViewInflate = new ComposeView(P0(), (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            op80 jp80Var = new jp80(composeViewInflate);
            i8h1 i8h1Var = this.L1;
            if (i8h1Var == null) {
                u890.C("ubiLogger");
                throw null;
            }
            l6h1 l6h1Var = this.M1;
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
            xhk1.c(composeViewInflate, jp80Var);
            composeViewInflate.setContent(new j2i(710333046, new f351(this, ft3VarA, searchConfiguration), true));
            N0().J().a(n0(), new g351(this, (byte) 0));
        } else {
            composeViewInflate = layoutInflater.inflate(2131626106, viewGroup, false);
        }
        Y0().a(2);
        composeViewInflate.getClass();
        return composeViewInflate;
    }
}
