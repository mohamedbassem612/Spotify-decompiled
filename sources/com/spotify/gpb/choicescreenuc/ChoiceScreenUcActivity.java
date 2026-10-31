package com.spotify.gpb.choicescreenuc;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.encoremobile.component.icons.IconSpotifyLogo;
import com.spotify.mobius.android.MobiusLoopViewModel;
import java.util.Collections;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p.a6g;
import p.a7h1;
import p.a9g;
import p.b2r0;
import p.b6g;
import p.b7g;
import p.b7x;
import p.b8k1;
import p.b9g;
import p.bbn;
import p.bck1;
import p.bhn0;
import p.bs0;
import p.bwf;
import p.c6g;
import p.c7g;
import p.c9g;
import p.d6d1;
import p.d9g;
import p.drw;
import p.dsk0;
import p.dtw;
import p.e1r0;
import p.e3b1;
import p.e611;
import p.e9g;
import p.eg;
import p.f0i;
import p.f5g;
import p.f9g;
import p.fc11;
import p.ffe1;
import p.g0i;
import p.gik1;
import p.gw70;
import p.h5g;
import p.hma1;
import p.i5g;
import p.i7g;
import p.i9g;
import p.idd1;
import p.j1e;
import p.j5g;
import p.jhc1;
import p.k5g;
import p.l5g;
import p.lir0;
import p.m5g;
import p.m5n1;
import p.mhc;
import p.mir0;
import p.mzo;
import p.n9g;
import p.nik1;
import p.nt21;
import p.nww0;
import p.oe41;
import p.pf61;
import p.pn40;
import p.pwf;
import p.q01;
import p.qdd1;
import p.qh0;
import p.r6h1;
import p.r7k1;
import p.rc11;
import p.sb30;
import p.syf;
import p.tac0;
import p.tka0;
import p.ttk0;
import p.u6g;
import p.u890;
import p.u8g;
import p.uk;
import p.uo5;
import p.v5g;
import p.w5g;
import p.w7h1;
import p.x5g;
import p.x6h1;
import p.x7h1;
import p.xb30;
import p.xbp1;
import p.xj61;
import p.y5g;
import p.y6h1;
import p.yfu;
import p.z5g;
import p.z7h1;
import p.z8g;
import p.zf0;
import p.zhc0;
import p.zlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/spotify/gpb/choicescreenuc/ChoiceScreenUcActivity;", "Lp/mzo;", "Lp/lir0;", "Lp/bwf;", "<init>", "()V", "p/f5g", "p/g5g", "src_main_java_com_spotify_gpb_choicescreenuc-choicescreenuc"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChoiceScreenUcActivity extends mzo implements lir0, bwf {
    public static final f5g y1 = new f5g();
    public gw70 b1;
    public nww0 c1;
    public pf61 d1;
    public yfu e1;
    public n9g f1;
    public u8g g1;
    public b2r0 h1;
    public gik1 i1;
    public bbn j1;
    public ffe1 k1;
    public dsk0 l1;
    public qh0 p1;
    public zf0 r1;
    public dtw s1;
    public dtw t1;
    public View v1;
    public i9g w1;
    public f9g x1;
    public final bck1 m1 = new bck1(rc11.a.b(MobiusLoopViewModel.class), new h5g(this, (byte) 7), new h5g(this, (byte) 9), new h5g(this, (byte) 8));
    public final qh0 n1 = a0(new i5g(this, (byte) 0), new e1r0((byte) 10));
    public final qh0 o1 = a0(new i5g(this, (byte) 1), new e1r0((byte) 12));
    public final idd1 q1 = new idd1(new h5g(this, (byte) 0));
    public final idd1 u1 = new idd1(new h5g(this, (byte) 1));

    public final void K(String str) {
        e9g e9gVar;
        w7h1 w7h1Var;
        f9g f9gVar = this.x1;
        if (f9gVar == null || (e9gVar = f9gVar.d) == null) {
            return;
        }
        d9g d9gVar = e9gVar.b;
        dsk0 dsk0Var = this.l1;
        if (dsk0Var == null) {
            u890.C("ubiEventFactory");
            throw null;
        }
        x6h1 x6h1VarC = dsk0Var.b.c();
        x6h1VarC.i.add(new a7h1("error_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        boolean z = d9gVar instanceof c9g;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("positive_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        } else if (d9gVar instanceof a9g) {
            x6h1 x6h1VarC3 = y6h1VarA.c();
            x6h1VarC3.i.add(new a7h1("positive_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
        } else if (d9gVar instanceof z8g) {
            x6h1 x6h1VarC4 = y6h1VarA.c();
            x6h1VarC4.i.add(new a7h1("positive_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
        } else {
            if (!(d9gVar instanceof b9g)) {
                eg.o();
                return;
            }
            x6h1 x6h1VarC5 = y6h1VarA.c();
            x6h1VarC5.i.add(new a7h1("positive_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            y6h1 y6h1VarA2 = x6h1VarC5.a();
            String str2 = ((b9g) d9gVar).a;
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            if (str2 == null) {
                str2 = "";
            }
            w7h1Var = new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA2, r6h1.c, System.currentTimeMillis());
        }
        l0().m(w7h1Var, (xj61) null);
        o0(d9gVar);
    }

    public final mir0 c() {
        return new mir0(l0().a());
    }

    public final b2r0 l0() {
        b2r0 b2r0Var = this.h1;
        if (b2r0Var != null) {
            return b2r0Var;
        }
        u890.C("ubiLogger");
        throw null;
    }

    public final MobiusLoopViewModel m0() {
        return (MobiusLoopViewModel) this.m1.getValue();
    }

    public final gik1 n0() {
        gik1 gik1Var = this.i1;
        if (gik1Var != null) {
            return gik1Var;
        }
        u890.C("viewUbiImpressionLogger");
        throw null;
    }

    public final void o0(d9g d9gVar) {
        if (d9gVar instanceof c9g) {
            m0().U(i7g.a);
            return;
        }
        if (d9gVar instanceof a9g) {
            m0().U(b7g.a);
            return;
        }
        if (d9gVar instanceof z8g) {
            m0().U(u6g.a);
        } else if (d9gVar instanceof b9g) {
            m0().U(new c7g(((b9g) d9gVar).a));
        } else {
            eg.o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        f9g f9gVar;
        qdd1 qdd1Var = new qdd1(0, 0, 2, d6d1.U0);
        zlv.a(this, qdd1Var, qdd1Var);
        super.onCreate(bundle);
        if (this.j1 == null) {
            u890.C("countryPickerLauncher");
            throw null;
        }
        this.p1 = a0(new i5g(this, (byte) 2), new pn40(nik1.j2.a, (byte) 2));
        idd1 idd1Var = this.q1;
        this.l1 = new dsk0(UUID.fromString(((v5g) idd1Var.getValue()).b), (byte) 7);
        pf61 pf61Var = this.d1;
        if (pf61Var == null) {
            u890.C("sessionIdProvider");
            throw null;
        }
        String str = ((v5g) idd1Var.getValue()).a.a;
        pf61Var.b = str;
        hma1 hma1VarEdit = pf61Var.a.edit();
        hma1VarEdit.d(pf61.e, str);
        hma1VarEdit.g();
        pf61 pf61Var2 = this.d1;
        if (pf61Var2 == null) {
            u890.C("sessionIdProvider");
            throw null;
        }
        nt21 nt21Var = ((g0i) this).d;
        oe41 oe41Var = (oe41) nt21Var.c;
        oe41 oe41Var2 = (oe41) nt21Var.c;
        tac0 tac0Var = ((f0i) this).a;
        if (pf61Var2.d(tac0Var, oe41Var)) {
            yfu yfuVar = this.e1;
            if (yfuVar == null) {
                u890.C("gpbTracker");
                throw null;
            }
            yfuVar.d();
        }
        View viewInflate = getLayoutInflater().inflate(2131623994, (ViewGroup) null, false);
        int i = 2131427713;
        CardView cardViewT = m5n1.t(viewInflate, 2131427713);
        if (cardViewT != null) {
            i = 2131427714;
            if (((LinearLayout) m5n1.t(viewInflate, 2131427714)) != null) {
                i = 2131427715;
                TextView textView = (TextView) m5n1.t(viewInflate, 2131427715);
                if (textView != null) {
                    i = 2131427716;
                    TextView textView2 = (TextView) m5n1.t(viewInflate, 2131427716);
                    if (textView2 != null) {
                        i = 2131427717;
                        TextView textView3 = (TextView) m5n1.t(viewInflate, 2131427717);
                        if (textView3 != null) {
                            i = 2131427718;
                            TextView textView4 = (TextView) m5n1.t(viewInflate, 2131427718);
                            if (textView4 != null) {
                                i = 2131427719;
                                CardView cardViewT2 = m5n1.t(viewInflate, 2131427719);
                                if (cardViewT2 != null) {
                                    i = 2131427720;
                                    TextView textView5 = (TextView) m5n1.t(viewInflate, 2131427720);
                                    if (textView5 != null) {
                                        i = 2131427811;
                                        if (m5n1.t(viewInflate, 2131427811) != null) {
                                            i = 2131427826;
                                            View viewT = m5n1.t(viewInflate, 2131427826);
                                            if (viewT != null) {
                                                i = 2131427952;
                                                TextView textView6 = (TextView) m5n1.t(viewInflate, 2131427952);
                                                if (textView6 != null) {
                                                    i = 2131427953;
                                                    TextView textView7 = (TextView) m5n1.t(viewInflate, 2131427953);
                                                    if (textView7 != null) {
                                                        i = 2131427955;
                                                        TextView textView8 = (TextView) m5n1.t(viewInflate, 2131427955);
                                                        if (textView8 != null) {
                                                            i = 2131428219;
                                                            FrameLayout frameLayout = (FrameLayout) m5n1.t(viewInflate, 2131428219);
                                                            if (frameLayout != null) {
                                                                i = 2131428243;
                                                                EncoreButton encoreButtonT = m5n1.t(viewInflate, 2131428243);
                                                                if (encoreButtonT != null) {
                                                                    i = 2131428939;
                                                                    RecyclerView recyclerViewT = m5n1.t(viewInflate, 2131428939);
                                                                    if (recyclerViewT != null) {
                                                                        i = 2131429013;
                                                                        ConstraintLayout constraintLayoutT = m5n1.t(viewInflate, 2131429013);
                                                                        if (constraintLayoutT != null) {
                                                                            i = 2131429014;
                                                                            if (((ImageView) m5n1.t(viewInflate, 2131429014)) != null) {
                                                                                i = 2131429015;
                                                                                TextView textView9 = (TextView) m5n1.t(viewInflate, 2131429015);
                                                                                if (textView9 != null) {
                                                                                    i = 2131429695;
                                                                                    FrameLayout frameLayout2 = (FrameLayout) m5n1.t(viewInflate, 2131429695);
                                                                                    if (frameLayout2 != null) {
                                                                                        i = 2131429749;
                                                                                        AppCompatCheckBox appCompatCheckBoxT = m5n1.t(viewInflate, 2131429749);
                                                                                        if (appCompatCheckBoxT != null) {
                                                                                            i = 2131429750;
                                                                                            ConstraintLayout constraintLayoutT2 = m5n1.t(viewInflate, 2131429750);
                                                                                            if (constraintLayoutT2 != null) {
                                                                                                i = 2131429751;
                                                                                                TextView textView10 = (TextView) m5n1.t(viewInflate, 2131429751);
                                                                                                if (textView10 != null) {
                                                                                                    i = 2131429753;
                                                                                                    TextView textView11 = (TextView) m5n1.t(viewInflate, 2131429753);
                                                                                                    if (textView11 != null) {
                                                                                                        i = 2131429838;
                                                                                                        FrameLayout frameLayout3 = (FrameLayout) m5n1.t(viewInflate, 2131429838);
                                                                                                        if (frameLayout3 != null) {
                                                                                                            i = 2131431046;
                                                                                                            ConstraintLayout constraintLayoutT3 = m5n1.t(viewInflate, 2131431046);
                                                                                                            if (constraintLayoutT3 != null) {
                                                                                                                i = 2131431047;
                                                                                                                if (((IconSpotifyLogo) m5n1.t(viewInflate, 2131431047)) != null) {
                                                                                                                    i = 2131431048;
                                                                                                                    TextView textView12 = (TextView) m5n1.t(viewInflate, 2131431048);
                                                                                                                    if (textView12 != null) {
                                                                                                                        i = 2131431397;
                                                                                                                        Toolbar toolbarT = m5n1.t(viewInflate, 2131431397);
                                                                                                                        if (toolbarT != null) {
                                                                                                                            i = 2131431538;
                                                                                                                            NestedScrollView nestedScrollViewT = m5n1.t(viewInflate, 2131431538);
                                                                                                                            if (nestedScrollViewT != null) {
                                                                                                                                i = 2131431657;
                                                                                                                                ImageView imageView = (ImageView) m5n1.t(viewInflate, 2131431657);
                                                                                                                                if (imageView != null) {
                                                                                                                                    i = 2131431658;
                                                                                                                                    TextView textView13 = (TextView) m5n1.t(viewInflate, 2131431658);
                                                                                                                                    if (textView13 != null) {
                                                                                                                                        i = 2131431659;
                                                                                                                                        if (((ImageView) m5n1.t(viewInflate, 2131431659)) != null) {
                                                                                                                                            i = 2131431660;
                                                                                                                                            TextView textView14 = (TextView) m5n1.t(viewInflate, 2131431660);
                                                                                                                                            if (textView14 != null) {
                                                                                                                                                i = 2131431661;
                                                                                                                                                LinearLayout linearLayout = (LinearLayout) m5n1.t(viewInflate, 2131431661);
                                                                                                                                                if (linearLayout != null) {
                                                                                                                                                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                                                                                                                                    this.r1 = new zf0(linearLayout2, cardViewT, textView, textView2, textView3, textView4, cardViewT2, textView5, viewT, textView6, textView7, textView8, frameLayout, encoreButtonT, recyclerViewT, constraintLayoutT, textView9, frameLayout2, appCompatCheckBoxT, constraintLayoutT2, textView10, textView11, frameLayout3, constraintLayoutT3, textView12, toolbarT, nestedScrollViewT, imageView, textView13, textView14, linearLayout);
                                                                                                                                                    setContentView(linearLayout2);
                                                                                                                                                    oe41Var2.c("STATE_PROVIDER_KEY", new uk(this, (byte) 1));
                                                                                                                                                    Bundle bundleA = oe41Var2.a("STATE_PROVIDER_KEY");
                                                                                                                                                    if (bundleA != null && (f9gVar = (f9g) jhc1.t(bundleA, "STATE_KEY_SHOWN_ERROR", f9g.class)) != null) {
                                                                                                                                                        this.x1 = f9gVar;
                                                                                                                                                    }
                                                                                                                                                    m0().b.f(this, new j5g(this, (byte) 0));
                                                                                                                                                    m0().c.a(this, new j5g(this, (byte) 1), new j5g(this, (byte) 2));
                                                                                                                                                    tac0Var.a(new k5g(this, (byte) 0));
                                                                                                                                                    tka0 tka0Var = dtw.C;
                                                                                                                                                    zf0 zf0Var = this.r1;
                                                                                                                                                    if (zf0Var == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    FrameLayout frameLayout4 = zf0Var.m;
                                                                                                                                                    gw70 gw70Var = this.b1;
                                                                                                                                                    if (gw70Var == null) {
                                                                                                                                                        u890.C("imageLoader");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    nww0 nww0Var = this.c1;
                                                                                                                                                    if (nww0Var == null) {
                                                                                                                                                        u890.C("colorLoader");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    dtw dtwVarD = mhc.d(this, frameLayout4, new zhc0(gw70Var, nww0Var), (drw) null, 24);
                                                                                                                                                    this.s1 = dtwVarD;
                                                                                                                                                    zf0 zf0Var2 = this.r1;
                                                                                                                                                    if (zf0Var2 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var2.m.addView(dtwVarD.w);
                                                                                                                                                    zf0 zf0Var3 = this.r1;
                                                                                                                                                    if (zf0Var3 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    FrameLayout frameLayout5 = zf0Var3.r;
                                                                                                                                                    gw70 gw70Var2 = this.b1;
                                                                                                                                                    if (gw70Var2 == null) {
                                                                                                                                                        u890.C("imageLoader");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    nww0 nww0Var2 = this.c1;
                                                                                                                                                    if (nww0Var2 == null) {
                                                                                                                                                        u890.C("colorLoader");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    dtw dtwVarD2 = mhc.d(this, frameLayout5, new bs0(gw70Var2, nww0Var2, new q01(0, this, ChoiceScreenUcActivity.class, "onItemUnavailableGoBackClicked", "onItemUnavailableGoBackClicked()V", 0, (byte) 29)), (drw) null, 24);
                                                                                                                                                    this.t1 = dtwVarD2;
                                                                                                                                                    zf0 zf0Var4 = this.r1;
                                                                                                                                                    if (zf0Var4 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var4.r.addView(dtwVarD2.w);
                                                                                                                                                    zf0 zf0Var5 = this.r1;
                                                                                                                                                    if (zf0Var5 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var5.v.setMovementMethod(LinkMovementMethod.getInstance());
                                                                                                                                                    zf0 zf0Var6 = this.r1;
                                                                                                                                                    if (zf0Var6 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var6.j.setMovementMethod(LinkMovementMethod.getInstance());
                                                                                                                                                    zf0 zf0Var7 = this.r1;
                                                                                                                                                    if (zf0Var7 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var7.f.setMovementMethod(LinkMovementMethod.getInstance());
                                                                                                                                                    zf0 zf0Var8 = this.r1;
                                                                                                                                                    if (zf0Var8 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var8.l.setOnClickListener(new l5g(this, (byte) 2));
                                                                                                                                                    zf0 zf0Var9 = this.r1;
                                                                                                                                                    if (zf0Var9 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var9.f.setOnClickListener(new l5g(this, (byte) 3));
                                                                                                                                                    zf0 zf0Var10 = this.r1;
                                                                                                                                                    if (zf0Var10 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var10.x.setOnClickListener(new l5g(this, (byte) 4));
                                                                                                                                                    zf0 zf0Var11 = this.r1;
                                                                                                                                                    if (zf0Var11 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var11.p.setOnClickListener(new l5g(this, (byte) 5));
                                                                                                                                                    zf0 zf0Var12 = this.r1;
                                                                                                                                                    if (zf0Var12 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var12.u.setOnClickListener(new l5g(this, (byte) 6));
                                                                                                                                                    zf0 zf0Var13 = this.r1;
                                                                                                                                                    if (zf0Var13 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var13.s.setOnClickListener(new l5g(this, (byte) 7));
                                                                                                                                                    zf0 zf0Var14 = this.r1;
                                                                                                                                                    if (zf0Var14 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var14.n.setOnClickListener(new l5g(this, (byte) 8));
                                                                                                                                                    idd1 idd1Var2 = this.u1;
                                                                                                                                                    ((xb30) idd1Var2.getValue()).e = new syf(this, (byte) 1);
                                                                                                                                                    zf0 zf0Var15 = this.r1;
                                                                                                                                                    if (zf0Var15 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var15.o.setAdapter((xb30) idd1Var2.getValue());
                                                                                                                                                    zf0 zf0Var16 = this.r1;
                                                                                                                                                    if (zf0Var16 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var16.o.setItemAnimator((e611) null);
                                                                                                                                                    zf0 zf0Var17 = this.r1;
                                                                                                                                                    if (zf0Var17 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var17.o.j(new j1e(getResources().getDimensionPixelSize(2131167027), (byte) 12));
                                                                                                                                                    zf0 zf0Var18 = this.r1;
                                                                                                                                                    if (zf0Var18 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    zf0Var18.j.setOnClickListener(new l5g(this, (byte) 1));
                                                                                                                                                    zf0 zf0Var19 = this.r1;
                                                                                                                                                    if (zf0Var19 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    LinearLayout linearLayout3 = zf0Var19.a;
                                                                                                                                                    xbp1 xbp1Var = xbp1.P0;
                                                                                                                                                    WeakHashMap weakHashMap = b8k1.a;
                                                                                                                                                    r7k1.c(linearLayout3, xbp1Var);
                                                                                                                                                    n0();
                                                                                                                                                    zf0 zf0Var20 = this.r1;
                                                                                                                                                    if (zf0Var20 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1.b(zf0Var20.a);
                                                                                                                                                    gik1 gik1VarN0 = n0();
                                                                                                                                                    zf0 zf0Var21 = this.r1;
                                                                                                                                                    if (zf0Var21 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1VarN0.a(zf0Var21.a, new h5g(this, (byte) 2));
                                                                                                                                                    gik1 gik1VarN1 = n0();
                                                                                                                                                    zf0 zf0Var22 = this.r1;
                                                                                                                                                    if (zf0Var22 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1VarN1.a(zf0Var22.w, new h5g(this, (byte) 3));
                                                                                                                                                    gik1 gik1VarN2 = n0();
                                                                                                                                                    zf0 zf0Var23 = this.r1;
                                                                                                                                                    if (zf0Var23 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1VarN2.a(zf0Var23.E, new h5g(this, (byte) 4));
                                                                                                                                                    gik1 gik1VarN3 = n0();
                                                                                                                                                    zf0 zf0Var24 = this.r1;
                                                                                                                                                    if (zf0Var24 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1VarN3.a(zf0Var24.r, new h5g(this, (byte) 5));
                                                                                                                                                    dsk0 dsk0Var = this.l1;
                                                                                                                                                    if (dsk0Var == null) {
                                                                                                                                                        u890.C("ubiEventFactory");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    ttk0 ttk0Var = new ttk0(dsk0Var, (char) 0);
                                                                                                                                                    n0();
                                                                                                                                                    zf0 zf0Var25 = this.r1;
                                                                                                                                                    if (zf0Var25 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1.b(zf0Var25.A);
                                                                                                                                                    gik1 gik1VarN4 = n0();
                                                                                                                                                    zf0 zf0Var26 = this.r1;
                                                                                                                                                    if (zf0Var26 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1VarN4.a(zf0Var26.A, new m5g(ttk0Var, (byte) 0));
                                                                                                                                                    gik1 gik1VarN5 = n0();
                                                                                                                                                    zf0 zf0Var27 = this.r1;
                                                                                                                                                    if (zf0Var27 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1VarN5.a(zf0Var27.l, new m5g(ttk0Var, (byte) 1));
                                                                                                                                                    gik1 gik1VarN6 = n0();
                                                                                                                                                    zf0 zf0Var28 = this.r1;
                                                                                                                                                    if (zf0Var28 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1VarN6.a(zf0Var28.b, new m5g(ttk0Var, (byte) 2));
                                                                                                                                                    gik1 gik1VarN7 = n0();
                                                                                                                                                    zf0 zf0Var29 = this.r1;
                                                                                                                                                    if (zf0Var29 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1VarN7.a(zf0Var29.t, new m5g(ttk0Var, (byte) 3));
                                                                                                                                                    gik1 gik1VarN8 = n0();
                                                                                                                                                    zf0 zf0Var30 = this.r1;
                                                                                                                                                    if (zf0Var30 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1VarN8.a(zf0Var30.j, new m5g(ttk0Var, (byte) 4));
                                                                                                                                                    gik1 gik1VarN9 = n0();
                                                                                                                                                    zf0 zf0Var31 = this.r1;
                                                                                                                                                    if (zf0Var31 == null) {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                    gik1VarN9.a(zf0Var31.g, new m5g(ttk0Var, (byte) 5));
                                                                                                                                                    gik1 gik1VarN10 = n0();
                                                                                                                                                    zf0 zf0Var32 = this.r1;
                                                                                                                                                    if (zf0Var32 != null) {
                                                                                                                                                        gik1VarN10.a(zf0Var32.f, new m5g(ttk0Var, (byte) 6));
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        u890.C("viewBinding");
                                                                                                                                                        throw null;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    public final void onNewIntent(Intent intent) {
        super/*p.g0i*/.onNewIntent(intent);
        Logger.d("Shouldn't be trying to launch this repeatedly.", new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(String str) {
        setTitle(str);
        zf0 zf0Var = this.r1;
        if (zf0Var == null) {
            u890.C("viewBinding");
            throw null;
        }
        Toolbar toolbar = zf0Var.z;
        Drawable drawable = getDrawable(2131231434);
        if (drawable != null) {
            drawable.mutate().setTint(getColor(2131104462));
        } else {
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
        zf0 zf0Var2 = this.r1;
        if (zf0Var2 == null) {
            u890.C("viewBinding");
            throw null;
        }
        k0(zf0Var2.z);
        fc11 fc11VarI0 = i0();
        if (fc11VarI0 != null) {
            fc11VarI0.b0(true);
        }
        zf0 zf0Var3 = this.r1;
        if (zf0Var3 != null) {
            zf0Var3.z.setNavigationOnClickListener(new l5g(this, (byte) 0));
        } else {
            u890.C("viewBinding");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q0(c6g c6gVar) {
        int measuredHeight;
        if (c6gVar instanceof b6g) {
            View view = this.v1;
            if (view != null) {
                zf0 zf0Var = this.r1;
                if (zf0Var == null) {
                    u890.C("viewBinding");
                    throw null;
                }
                NestedScrollView nestedScrollView = zf0Var.A;
                gw70 gw70Var = this.b1;
                if (gw70Var == null) {
                    u890.C("imageLoader");
                    throw null;
                }
                uo5 uo5Var = new uo5(nestedScrollView, view, gw70Var, ((b6g) c6gVar).a);
                sb30 sb30Var = (sb30) uo5Var.d;
                ConstraintLayout constraintLayout = sb30Var.a;
                ConstraintLayout constraintLayout2 = sb30Var.a;
                constraintLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int[] iArr = new int[2];
                nestedScrollView.getLocationInWindow(iArr);
                int[] iArr2 = new int[2];
                view.getLocationInWindow(iArr2);
                int height = view.getHeight() + (iArr2[1] - iArr[1]);
                int dimensionPixelOffset = nestedScrollView.getResources().getDimensionPixelOffset(2131167027);
                if (constraintLayout2.getMeasuredHeight() + height + dimensionPixelOffset <= nestedScrollView.getHeight()) {
                    measuredHeight = view.getHeight() + iArr2[1] + dimensionPixelOffset;
                } else {
                    measuredHeight = iArr2[1] - (constraintLayout2.getMeasuredHeight() + dimensionPixelOffset);
                }
                ((PopupWindow) uo5Var.c).showAtLocation(nestedScrollView, 51, ((view.getWidth() - constraintLayout2.getMeasuredWidth()) / 2) + iArr2[0], measuredHeight);
                return;
            }
            return;
        }
        if (c6gVar instanceof y5g) {
            idd1 idd1Var = this.q1;
            this.o1.a(new e3b1(((v5g) idd1Var.getValue()).a, ((v5g) idd1Var.getValue()).b, ((y5g) c6gVar).a));
            return;
        }
        if (c6gVar instanceof x5g) {
            this.n1.a(((x5g) c6gVar).a);
            return;
        }
        if (c6gVar instanceof w5g) {
            Parcelable parcelable = ((w5g) c6gVar).a;
            int i = parcelable instanceof pwf ? 0 : -1;
            Intent intent = new Intent();
            intent.putExtra("ChoiceScreenUcActivity", true);
            intent.putExtra("EXTRA_CHECKOUT_RESULT", parcelable);
            setResult(i, intent);
            finish();
            return;
        }
        if (c6gVar instanceof a6g) {
            qh0 qh0Var = this.p1;
            if (qh0Var != null) {
                qh0Var.a(((a6g) c6gVar).a);
                return;
            } else {
                u890.C("launchCountryPicker");
                throw null;
            }
        }
        if (!(c6gVar instanceof z5g)) {
            eg.o();
            return;
        }
        ffe1 ffe1Var = this.k1;
        if (ffe1Var != null) {
            ffe1Var.i(((z5g) c6gVar).a);
        } else {
            u890.C("checkoutUrlLoader");
            throw null;
        }
    }

    public final void t(String str) {
        e9g e9gVar;
        w7h1 w7h1Var;
        f9g f9gVar = this.x1;
        if (f9gVar == null || (e9gVar = f9gVar.e) == null) {
            return;
        }
        d9g d9gVar = e9gVar.b;
        dsk0 dsk0Var = this.l1;
        if (dsk0Var == null) {
            u890.C("ubiEventFactory");
            throw null;
        }
        x6h1 x6h1VarC = dsk0Var.b.c();
        x6h1VarC.i.add(new a7h1("error_dialog", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        boolean z = d9gVar instanceof c9g;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("negative_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC2.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        } else if (d9gVar instanceof a9g) {
            x6h1 x6h1VarC3 = y6h1VarA.c();
            x6h1VarC3.i.add(new a7h1("negative_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
        } else if (d9gVar instanceof z8g) {
            x6h1 x6h1VarC4 = y6h1VarA.c();
            x6h1VarC4.i.add(new a7h1("negative_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC4.j = false;
            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
        } else {
            if (!(d9gVar instanceof b9g)) {
                eg.o();
                return;
            }
            x6h1 x6h1VarC5 = y6h1VarA.c();
            x6h1VarC5.i.add(new a7h1("negative_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            y6h1 y6h1VarA2 = x6h1VarC5.a();
            String str2 = ((b9g) d9gVar).a;
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            if (str2 == null) {
                str2 = "";
            }
            w7h1Var = new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA2, r6h1.c, System.currentTimeMillis());
        }
        l0().m(w7h1Var, (xj61) null);
        o0(d9gVar);
    }

    public final void x(String str) {
        f9g f9gVar = this.x1;
        if (f9gVar != null) {
            o0(f9gVar.c);
        }
    }
}
