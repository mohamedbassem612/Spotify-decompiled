package com.spotify.checkout.spotifycheckout;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.spotify.checkout.elements.utils.AdditionalInfoView;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.mobius.android.MobiusLoopViewModel;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p.a2k;
import p.a3b1;
import p.ai0;
import p.ai30;
import p.aiw;
import p.azz;
import p.b2r0;
import p.b8k1;
import p.bbn;
import p.bck1;
import p.bhn0;
import p.bs0;
import p.bwf;
import p.c681;
import p.chw;
import p.cj8;
import p.cua;
import p.d400;
import p.d6d1;
import p.dg30;
import p.diw;
import p.drw;
import p.dsk0;
import p.dtw;
import p.dwf;
import p.eg;
import p.f0i;
import p.f3b1;
import p.fc11;
import p.ffe1;
import p.g0i;
import p.g400;
import p.gik1;
import p.gj5;
import p.gw70;
import p.h000;
import p.h3b1;
import p.hhg1;
import p.hhw;
import p.hyz;
import p.idd1;
import p.iu30;
import p.j1e1;
import p.j22;
import p.j2i;
import p.jfk1;
import p.jgu;
import p.jhc1;
import p.k5g;
import p.kdn0;
import p.kfk1;
import p.khw;
import p.ks6;
import p.lfk1;
import p.lir0;
import p.lmw;
import p.lt50;
import p.m3b1;
import p.m5n1;
import p.mfk1;
import p.mhc;
import p.mir0;
import p.nda1;
import p.nhw;
import p.nik1;
import p.nt21;
import p.nu9;
import p.nww0;
import p.o12;
import p.o7h;
import p.oe41;
import p.ohw;
import p.pn40;
import p.q881;
import p.qbs0;
import p.qdd1;
import p.qh0;
import p.r7k1;
import p.rc11;
import p.shw;
import p.t500;
import p.tg30;
import p.th30;
import p.tka0;
import p.u890;
import p.uas0;
import p.uk;
import p.vku;
import p.w2b1;
import p.wgk1;
import p.wvf;
import p.x2b1;
import p.xcs0;
import p.xhw;
import p.y2b1;
import p.y300;
import p.yhw;
import p.yt91;
import p.z2b1;
import p.zf30;
import p.zhc0;
import p.zlv;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/spotify/checkout/spotifycheckout/SpotifyCheckoutActivity;", "Lp/gj5;", "Lp/lt50;", "Lp/lir0;", "Lp/bwf;", "Lp/o12;", "<init>", "()V", "p/e1r0", "src_main_java_com_spotify_checkout_spotifycheckout-spotifycheckout"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SpotifyCheckoutActivity extends gj5 implements lt50, lir0, bwf, o12 {
    public static final /* synthetic */ int D1 = 0;
    public qh0 B1;
    public ai0 b1;
    public dtw c1;
    public dtw d1;
    public jgu e1;
    public m3b1 f1;
    public a2k g1;
    public j22 h1;
    public cua i1;
    public gw70 j1;
    public nww0 k1;
    public bbn l1;
    public yt91 m1;
    public b2r0 o1;
    public gik1 p1;
    public ffe1 q1;
    public dsk0 r1;
    public wgk1 s1;
    public ks6 v1;
    public uas0 y1;
    public qbs0 z1;
    public final idd1 a1 = new idd1(new x2b1(this, 1));
    public final bck1 n1 = new bck1(rc11.a.b(MobiusLoopViewModel.class), new x2b1(this, 17), new x2b1(this, 19), new x2b1(this, 18));
    public final kdn0 t1 = new kdn0();
    public final kdn0 u1 = new kdn0();
    public final vku w1 = new vku();
    public final vku x1 = new vku();
    public final PublishSubject A1 = new PublishSubject();
    public h3b1 C1 = h3b1.b;

    @Override // p.bwf
    public final void K(String str) {
        if (str.equals("TAG_SUBMIT_CPD_DIALOG")) {
            m0().U(g400.a);
        }
    }

    public final mir0 c() {
        return new mir0(d().a());
    }

    public final b2r0 d() {
        b2r0 b2r0Var = this.o1;
        if (b2r0Var != null) {
            return b2r0Var;
        }
        u890.C("ubiLogger");
        throw null;
    }

    public final jgu f() {
        jgu jguVar = this.e1;
        if (jguVar != null) {
            return jguVar;
        }
        u890.C("androidInjector");
        throw null;
    }

    public final void l0(uas0 uas0Var) {
        if (this.i1 == null) {
            u890.C("paymentFragmentFactory");
            throw null;
        }
        ai30 ai30Var = ((tg30) ((dg30) this).U0.b).g;
        ai0 ai0Var = this.b1;
        if (ai0Var == null) {
            u890.C("viewBinding");
            throw null;
        }
        int id = ((FrameLayout) ai0Var.f).getId();
        qbs0 qbs0VarF = ai30Var.F(id);
        byte b = 1;
        if (qbs0VarF == null) {
            nu9 nu9Var = new nu9(ai30Var);
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGS_KEY", uas0Var);
            nu9Var.k(id, nu9Var.j(bundle, qbs0.class), (String) null, 1);
            nu9Var.h();
            qbs0VarF = (qbs0) ai30Var.F(id);
        }
        this.z1 = qbs0VarF;
        ks6 ks6Var = this.v1;
        if (ks6Var == null) {
            u890.C("summaryBinding");
            throw null;
        }
        qbs0VarF.Q1.setValue((ConstraintLayout) ks6Var.a);
        byte b2 = 0;
        this.x1.b(new Disposable[]{qbs0VarF.G1.subscribe(new w2b1(this, b2)), qbs0VarF.H1.subscribe(new w2b1(this, b)), qbs0VarF.I1.subscribe(new w2b1(this, (byte) 2))});
        qbs0VarF.P1 = new x2b1(this, b2);
    }

    public final MobiusLoopViewModel m0() {
        return (MobiusLoopViewModel) this.n1.getValue();
    }

    public final gik1 n0() {
        gik1 gik1Var = this.p1;
        if (gik1Var != null) {
            return gik1Var;
        }
        u890.C("viewUbiImpressionLogger");
        throw null;
    }

    public final void o0(mfk1 mfk1Var) {
        if (mfk1Var instanceof lfk1) {
            m0().U(d400.a);
            return;
        }
        if (mfk1Var instanceof jfk1) {
            m0().U(hyz.a);
        } else if (mfk1Var instanceof kfk1) {
            m0().U(new azz(((kfk1) mfk1Var).a));
        } else {
            eg.o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:249:0x06e2 A[PHI: r3
      0x06e2: PHI (r3v13 int) = (r3v12 int), (r3v27 int) binds: [B:136:0x03e2, B:158:0x046b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:282:0x0734 A[PHI: r4
      0x0734: PHI (r4v6 int) = 
      (r4v5 int)
      (r4v7 int)
      (r4v8 int)
      (r4v9 int)
      (r4v10 int)
      (r4v11 int)
      (r4v12 int)
      (r4v13 int)
      (r4v14 int)
      (r4v15 int)
      (r4v16 int)
      (r4v17 int)
      (r4v18 int)
      (r4v19 int)
      (r4v20 int)
      (r4v21 int)
      (r4v22 int)
      (r4v23 int)
      (r4v24 int)
      (r4v25 int)
      (r4v26 int)
      (r4v27 int)
      (r4v28 int)
      (r4v29 int)
      (r4v30 int)
      (r4v31 int)
      (r4v32 int)
      (r4v33 int)
      (r4v34 int)
      (r4v35 int)
     binds: [B:21:0x00da, B:23:0x00e7, B:25:0x00f4, B:27:0x0101, B:29:0x010a, B:31:0x0117, B:33:0x0124, B:35:0x0131, B:37:0x013e, B:39:0x014b, B:41:0x0158, B:43:0x0165, B:45:0x0172, B:47:0x017f, B:49:0x018c, B:51:0x0199, B:53:0x01a6, B:55:0x01b3, B:57:0x01be, B:59:0x01cb, B:61:0x01d4, B:63:0x01dd, B:65:0x01ea, B:67:0x01f5, B:69:0x0202, B:71:0x020f, B:73:0x0218, B:75:0x0221, B:77:0x022a, B:79:0x0237] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:284:0x073a A[PHI: r1
      0x073a: PHI (r1v10 int) = (r1v9 int), (r1v12 int), (r1v13 int) binds: [B:13:0x00a6, B:15:0x00b3, B:17:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        byte b = 0;
        qdd1 qdd1Var = new qdd1(0, 0, 2, d6d1.U0);
        zlv.a(this, qdd1Var, qdd1Var);
        j1e1.q(this);
        lmw lmwVar = ((dg30) this).U0;
        ai30 ai30Var = ((tg30) lmwVar.b).g;
        a2k a2kVar = this.g1;
        if (a2kVar == null) {
            u890.C("compositeFragmentFactory");
            throw null;
        }
        ((th30) ai30Var).B = a2kVar;
        super/*p.dg30*/.onCreate(bundle);
        this.r1 = new dsk0(UUID.fromString(((f3b1) this.a1.getValue()).Z()), (byte) 6);
        if (this.l1 == null) {
            u890.C("countryPickerLauncher");
            throw null;
        }
        this.B1 = a0(new cj8(this, (byte) 13), new pn40(nik1.j2.a, (byte) 2));
        nt21 nt21Var = ((g0i) this).d;
        ((oe41) nt21Var.c).c("STATE_PROVIDER", new uk(this, (byte) 20));
        Bundle bundleA = ((oe41) nt21Var.c).a("STATE_PROVIDER");
        if (bundleA != null) {
            h3b1 h3b1Var = (h3b1) jhc1.v(bundleA, "STATE_KEY_RESULT", h3b1.class);
            if (h3b1Var != null) {
                r0(h3b1Var);
            }
            this.y1 = (uas0) jhc1.t(bundleA, "STATE_KEY_CURRENT_PAYMENT_ARGS", uas0.class);
        }
        CoordinatorLayout coordinatorLayoutInflate = getLayoutInflater().inflate(2131624016, (ViewGroup) null, false);
        int i = 2131427529;
        FrameLayout frameLayout = (FrameLayout) m5n1.t(coordinatorLayoutInflate, 2131427529);
        if (frameLayout != null) {
            i = 2131427531;
            Group groupT = m5n1.t(coordinatorLayoutInflate, 2131427531);
            if (groupT != null) {
                i = 2131427534;
                TextView textView = (TextView) m5n1.t(coordinatorLayoutInflate, 2131427534);
                if (textView != null) {
                    i = 2131427535;
                    TextView textView2 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131427535);
                    if (textView2 != null) {
                        int i2 = 2131427952;
                        TextView textView3 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131427952);
                        if (textView3 != null) {
                            i2 = 2131427953;
                            TextView textView4 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131427953);
                            if (textView4 != null) {
                                i2 = 2131427955;
                                TextView textView5 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131427955);
                                if (textView5 != null) {
                                    i2 = 2131428203;
                                    NestedScrollView nestedScrollViewT = m5n1.t(coordinatorLayoutInflate, 2131428203);
                                    if (nestedScrollViewT != null) {
                                        i2 = 2131428296;
                                        View viewT = m5n1.t(coordinatorLayoutInflate, 2131428296);
                                        if (viewT != null) {
                                            i2 = 2131428341;
                                            TextView textView6 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131428341);
                                            if (textView6 != null) {
                                                i2 = 2131428342;
                                                LinearLayout linearLayout = (LinearLayout) m5n1.t(coordinatorLayoutInflate, 2131428342);
                                                if (linearLayout != null) {
                                                    i2 = 2131428343;
                                                    ShapeableImageView shapeableImageViewT = m5n1.t(coordinatorLayoutInflate, 2131428343);
                                                    if (shapeableImageViewT != null) {
                                                        i2 = 2131428344;
                                                        ComposeView composeViewT = m5n1.t(coordinatorLayoutInflate, 2131428344);
                                                        if (composeViewT != null) {
                                                            i2 = 2131428345;
                                                            TextView textView7 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131428345);
                                                            if (textView7 != null) {
                                                                i2 = 2131428346;
                                                                TextView textView8 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131428346);
                                                                if (textView8 != null) {
                                                                    i2 = 2131428720;
                                                                    TextView textView9 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131428720);
                                                                    if (textView9 != null) {
                                                                        i2 = 2131428723;
                                                                        ConstraintLayout constraintLayoutT = m5n1.t(coordinatorLayoutInflate, 2131428723);
                                                                        if (constraintLayoutT != null) {
                                                                            i2 = 2131428732;
                                                                            TextView textView10 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131428732);
                                                                            if (textView10 != null) {
                                                                                i2 = 2131429695;
                                                                                FrameLayout frameLayout2 = (FrameLayout) m5n1.t(coordinatorLayoutInflate, 2131429695);
                                                                                if (frameLayout2 != null) {
                                                                                    i2 = 2131429771;
                                                                                    FrameLayout frameLayout3 = (FrameLayout) m5n1.t(coordinatorLayoutInflate, 2131429771);
                                                                                    if (frameLayout3 != null) {
                                                                                        i2 = 2131429817;
                                                                                        FrameLayout frameLayout4 = (FrameLayout) m5n1.t(coordinatorLayoutInflate, 2131429817);
                                                                                        if (frameLayout4 != null) {
                                                                                            i2 = 2131430133;
                                                                                            EncoreButton encoreButtonT = m5n1.t(coordinatorLayoutInflate, 2131430133);
                                                                                            if (encoreButtonT != null) {
                                                                                                i2 = 2131430304;
                                                                                                if (m5n1.t(coordinatorLayoutInflate, 2131430304) != null) {
                                                                                                    i2 = 2131430305;
                                                                                                    FrameLayout frameLayout5 = (FrameLayout) m5n1.t(coordinatorLayoutInflate, 2131430305);
                                                                                                    if (frameLayout5 != null) {
                                                                                                        i2 = 2131430307;
                                                                                                        View viewT2 = m5n1.t(coordinatorLayoutInflate, 2131430307);
                                                                                                        if (viewT2 != null) {
                                                                                                            i2 = 2131430308;
                                                                                                            View viewT3 = m5n1.t(coordinatorLayoutInflate, 2131430308);
                                                                                                            if (viewT3 != null) {
                                                                                                                i2 = 2131430309;
                                                                                                                LinearLayout linearLayout2 = (LinearLayout) m5n1.t(coordinatorLayoutInflate, 2131430309);
                                                                                                                if (linearLayout2 != null) {
                                                                                                                    i2 = 2131430310;
                                                                                                                    if (m5n1.t(coordinatorLayoutInflate, 2131430310) != null) {
                                                                                                                        i2 = 2131430311;
                                                                                                                        TextView textView11 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131430311);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i2 = 2131430461;
                                                                                                                            EncoreButton encoreButtonT2 = m5n1.t(coordinatorLayoutInflate, 2131430461);
                                                                                                                            if (encoreButtonT2 != null) {
                                                                                                                                i2 = 2131431169;
                                                                                                                                View viewT4 = m5n1.t(coordinatorLayoutInflate, 2131431169);
                                                                                                                                if (viewT4 != null) {
                                                                                                                                    i2 = 2131431170;
                                                                                                                                    View viewT5 = m5n1.t(coordinatorLayoutInflate, 2131431170);
                                                                                                                                    if (viewT5 != null) {
                                                                                                                                        i2 = 2131431171;
                                                                                                                                        View viewT6 = m5n1.t(coordinatorLayoutInflate, 2131431171);
                                                                                                                                        if (viewT6 != null) {
                                                                                                                                            i2 = 2131431172;
                                                                                                                                            LinearLayout linearLayout3 = (LinearLayout) m5n1.t(coordinatorLayoutInflate, 2131431172);
                                                                                                                                            if (linearLayout3 != null) {
                                                                                                                                                TextView textView12 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131431177);
                                                                                                                                                if (textView12 != null) {
                                                                                                                                                    int i3 = 2131431356;
                                                                                                                                                    TextView textView13 = (TextView) m5n1.t(coordinatorLayoutInflate, 2131431356);
                                                                                                                                                    if (textView13 != null) {
                                                                                                                                                        i3 = 2131431365;
                                                                                                                                                        if (m5n1.t(coordinatorLayoutInflate, 2131431365) != null) {
                                                                                                                                                            i3 = 2131431397;
                                                                                                                                                            Toolbar toolbarT = m5n1.t(coordinatorLayoutInflate, 2131431397);
                                                                                                                                                            if (toolbarT != null) {
                                                                                                                                                                i3 = 2131431551;
                                                                                                                                                                EncoreButton encoreButtonT3 = m5n1.t(coordinatorLayoutInflate, 2131431551);
                                                                                                                                                                if (encoreButtonT3 != null) {
                                                                                                                                                                    i3 = 2131431552;
                                                                                                                                                                    EncoreButton encoreButtonT4 = m5n1.t(coordinatorLayoutInflate, 2131431552);
                                                                                                                                                                    if (encoreButtonT4 != null) {
                                                                                                                                                                        CoordinatorLayout coordinatorLayout = coordinatorLayoutInflate;
                                                                                                                                                                        this.b1 = new ai0(coordinatorLayout, frameLayout, groupT, textView, textView2, textView3, textView4, textView5, nestedScrollViewT, viewT, textView6, linearLayout, shapeableImageViewT, composeViewT, textView7, textView8, textView9, constraintLayoutT, textView10, frameLayout2, frameLayout3, frameLayout4, encoreButtonT, frameLayout5, viewT2, viewT3, linearLayout2, textView11, encoreButtonT2, viewT4, viewT5, viewT6, linearLayout3, textView12, textView13, toolbarT, encoreButtonT3, encoreButtonT4);
                                                                                                                                                                        setContentView(coordinatorLayout);
                                                                                                                                                                        setTitle(getString(2131962876));
                                                                                                                                                                        ai0 ai0Var = this.b1;
                                                                                                                                                                        if (ai0Var == null) {
                                                                                                                                                                            u890.C("viewBinding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        Toolbar toolbar = (Toolbar) ai0Var.l1;
                                                                                                                                                                        Drawable drawable = getDrawable(2131231434);
                                                                                                                                                                        if (drawable != null) {
                                                                                                                                                                            drawable.mutate().setTint(getColor(2131104462));
                                                                                                                                                                        } else {
                                                                                                                                                                            drawable = null;
                                                                                                                                                                        }
                                                                                                                                                                        toolbar.setNavigationIcon(drawable);
                                                                                                                                                                        ai0 ai0Var2 = this.b1;
                                                                                                                                                                        if (ai0Var2 == null) {
                                                                                                                                                                            u890.C("viewBinding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        k0((Toolbar) ai0Var2.l1);
                                                                                                                                                                        fc11 fc11VarI0 = i0();
                                                                                                                                                                        byte b2 = 1;
                                                                                                                                                                        if (fc11VarI0 != null) {
                                                                                                                                                                            fc11VarI0.b0(true);
                                                                                                                                                                        }
                                                                                                                                                                        ai0 ai0Var3 = this.b1;
                                                                                                                                                                        if (ai0Var3 == null) {
                                                                                                                                                                            u890.C("viewBinding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        ((Toolbar) ai0Var3.l1).setNavigationOnClickListener(new z2b1(this, b));
                                                                                                                                                                        ai0 ai0Var4 = this.b1;
                                                                                                                                                                        if (ai0Var4 == null) {
                                                                                                                                                                            u890.C("viewBinding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        ((TextView) ai0Var4.Y).setOnClickListener(new z2b1(this, b2));
                                                                                                                                                                        ai0 ai0Var5 = this.b1;
                                                                                                                                                                        if (ai0Var5 == null) {
                                                                                                                                                                            u890.C("viewBinding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        ((TextView) ai0Var5.t).setMovementMethod(LinkMovementMethod.getInstance());
                                                                                                                                                                        tka0 tka0Var = dtw.C;
                                                                                                                                                                        ai0 ai0Var6 = this.b1;
                                                                                                                                                                        if (ai0Var6 == null) {
                                                                                                                                                                            u890.C("viewBinding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        FrameLayout frameLayout6 = (FrameLayout) ai0Var6.d;
                                                                                                                                                                        gw70 gw70Var = this.j1;
                                                                                                                                                                        if (gw70Var == null) {
                                                                                                                                                                            u890.C("imageLoader");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        nww0 nww0Var = this.k1;
                                                                                                                                                                        if (nww0Var == null) {
                                                                                                                                                                            u890.C("colorLoader");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        dtw dtwVarD = mhc.d(this, frameLayout6, new zhc0(gw70Var, nww0Var), (drw) null, 24);
                                                                                                                                                                        this.c1 = dtwVarD;
                                                                                                                                                                        ai0 ai0Var7 = this.b1;
                                                                                                                                                                        if (ai0Var7 == null) {
                                                                                                                                                                            u890.C("viewBinding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        ((FrameLayout) ai0Var7.d).addView(dtwVarD.w);
                                                                                                                                                                        ai0 ai0Var8 = this.b1;
                                                                                                                                                                        if (ai0Var8 == null) {
                                                                                                                                                                            u890.C("viewBinding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        FrameLayout frameLayout7 = (FrameLayout) ai0Var8.c;
                                                                                                                                                                        gw70 gw70Var2 = this.j1;
                                                                                                                                                                        if (gw70Var2 == null) {
                                                                                                                                                                            u890.C("imageLoader");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        nww0 nww0Var2 = this.k1;
                                                                                                                                                                        if (nww0Var2 == null) {
                                                                                                                                                                            u890.C("colorLoader");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        dtw dtwVarD2 = mhc.d(this, frameLayout7, new bs0(gw70Var2, nww0Var2, new nda1(0, this, SpotifyCheckoutActivity.class, "onItemUnavailableGoBackClicked", "onItemUnavailableGoBackClicked()V", 0, (byte) 3)), (drw) null, 24);
                                                                                                                                                                        this.d1 = dtwVarD2;
                                                                                                                                                                        ai0 ai0Var9 = this.b1;
                                                                                                                                                                        if (ai0Var9 == null) {
                                                                                                                                                                            u890.C("viewBinding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        ((FrameLayout) ai0Var9.c).addView(dtwVarD2.w);
                                                                                                                                                                        ai0 ai0Var10 = this.b1;
                                                                                                                                                                        if (ai0Var10 == null) {
                                                                                                                                                                            u890.C("viewBinding");
                                                                                                                                                                            throw null;
                                                                                                                                                                        }
                                                                                                                                                                        ((TextView) ai0Var10.t).setOnClickListener(new z2b1(this, (byte) 2));
                                                                                                                                                                        ConstraintLayout constraintLayoutInflate = getLayoutInflater().inflate(2131626220, (ViewGroup) null, false);
                                                                                                                                                                        int i4 = 2131427525;
                                                                                                                                                                        AdditionalInfoView additionalInfoViewT = m5n1.t(constraintLayoutInflate, 2131427525);
                                                                                                                                                                        if (additionalInfoViewT != null) {
                                                                                                                                                                            i4 = 2131427527;
                                                                                                                                                                            TextView textView14 = (TextView) m5n1.t(constraintLayoutInflate, 2131427527);
                                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                                i4 = 2131427532;
                                                                                                                                                                                TextView textView15 = (TextView) m5n1.t(constraintLayoutInflate, 2131427532);
                                                                                                                                                                                if (textView15 != null) {
                                                                                                                                                                                    i4 = 2131427533;
                                                                                                                                                                                    Group groupT2 = m5n1.t(constraintLayoutInflate, 2131427533);
                                                                                                                                                                                    if (groupT2 != null) {
                                                                                                                                                                                        int i5 = 2131427535;
                                                                                                                                                                                        TextView textView16 = (TextView) m5n1.t(constraintLayoutInflate, 2131427535);
                                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                                            i4 = 2131427897;
                                                                                                                                                                                            CardView cardViewT = m5n1.t(constraintLayoutInflate, 2131427897);
                                                                                                                                                                                            if (cardViewT != null) {
                                                                                                                                                                                                i4 = 2131428981;
                                                                                                                                                                                                Group groupT3 = m5n1.t(constraintLayoutInflate, 2131428981);
                                                                                                                                                                                                if (groupT3 != null) {
                                                                                                                                                                                                    i4 = 2131429683;
                                                                                                                                                                                                    if (m5n1.t(constraintLayoutInflate, 2131429683) != null) {
                                                                                                                                                                                                        i4 = 2131429684;
                                                                                                                                                                                                        ShapeableImageView shapeableImageViewT2 = m5n1.t(constraintLayoutInflate, 2131429684);
                                                                                                                                                                                                        if (shapeableImageViewT2 != null) {
                                                                                                                                                                                                            i4 = 2131429685;
                                                                                                                                                                                                            TextView textView17 = (TextView) m5n1.t(constraintLayoutInflate, 2131429685);
                                                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                                                i4 = 2131429688;
                                                                                                                                                                                                                TextView textView18 = (TextView) m5n1.t(constraintLayoutInflate, 2131429688);
                                                                                                                                                                                                                if (textView18 != null) {
                                                                                                                                                                                                                    i4 = 2131429689;
                                                                                                                                                                                                                    TextView textView19 = (TextView) m5n1.t(constraintLayoutInflate, 2131429689);
                                                                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                                                                        i4 = 2131429692;
                                                                                                                                                                                                                        TextView textView20 = (TextView) m5n1.t(constraintLayoutInflate, 2131429692);
                                                                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                                                                            i4 = 2131429980;
                                                                                                                                                                                                                            if (m5n1.t(constraintLayoutInflate, 2131429980) != null) {
                                                                                                                                                                                                                                i4 = 2131431168;
                                                                                                                                                                                                                                if (m5n1.t(constraintLayoutInflate, 2131431168) != null) {
                                                                                                                                                                                                                                    i5 = 2131431177;
                                                                                                                                                                                                                                    TextView textView21 = (TextView) m5n1.t(constraintLayoutInflate, 2131431177);
                                                                                                                                                                                                                                    if (textView21 != null) {
                                                                                                                                                                                                                                        i4 = 2131431344;
                                                                                                                                                                                                                                        RecyclerView recyclerViewT = m5n1.t(constraintLayoutInflate, 2131431344);
                                                                                                                                                                                                                                        if (recyclerViewT != null) {
                                                                                                                                                                                                                                            i4 = 2131431456;
                                                                                                                                                                                                                                            if (m5n1.t(constraintLayoutInflate, 2131431456) != null) {
                                                                                                                                                                                                                                                i4 = 2131431457;
                                                                                                                                                                                                                                                View viewT7 = m5n1.t(constraintLayoutInflate, 2131431457);
                                                                                                                                                                                                                                                if (viewT7 != null) {
                                                                                                                                                                                                                                                    i4 = 2131431458;
                                                                                                                                                                                                                                                    TextView textView22 = (TextView) m5n1.t(constraintLayoutInflate, 2131431458);
                                                                                                                                                                                                                                                    if (textView22 != null) {
                                                                                                                                                                                                                                                        i4 = 2131431459;
                                                                                                                                                                                                                                                        TextView textView23 = (TextView) m5n1.t(constraintLayoutInflate, 2131431459);
                                                                                                                                                                                                                                                        if (textView23 != null) {
                                                                                                                                                                                                                                                            i4 = 2131431460;
                                                                                                                                                                                                                                                            TextView textView24 = (TextView) m5n1.t(constraintLayoutInflate, 2131431460);
                                                                                                                                                                                                                                                            if (textView24 != null) {
                                                                                                                                                                                                                                                                this.v1 = new ks6(constraintLayoutInflate, additionalInfoViewT, textView14, textView15, groupT2, textView16, cardViewT, groupT3, shapeableImageViewT2, textView17, textView18, textView19, textView20, textView21, recyclerViewT, viewT7, textView22, textView23, textView24);
                                                                                                                                                                                                                                                                ai0 ai0Var11 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var11 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                ((ComposeView) ai0Var11.f1).setContent(new j2i(-1007304472, new a3b1(this, (byte) 2), true));
                                                                                                                                                                                                                                                                n0();
                                                                                                                                                                                                                                                                ai0 ai0Var12 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var12 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1.b((CoordinatorLayout) ai0Var12.a);
                                                                                                                                                                                                                                                                gik1 gik1VarN0 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var13 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var13 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN0.a((FrameLayout) ai0Var13.e, new x2b1(this, (byte) 8));
                                                                                                                                                                                                                                                                gik1 gik1VarN1 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var14 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var14 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN1.a((NestedScrollView) ai0Var14.U0, new x2b1(this, (byte) 9));
                                                                                                                                                                                                                                                                n0();
                                                                                                                                                                                                                                                                ai0 ai0Var15 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var15 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1.b((NestedScrollView) ai0Var15.U0);
                                                                                                                                                                                                                                                                gik1 gik1VarN2 = n0();
                                                                                                                                                                                                                                                                dtw dtwVar = this.c1;
                                                                                                                                                                                                                                                                if (dtwVar == null) {
                                                                                                                                                                                                                                                                    u890.C("lineItem");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN2.a(dtwVar.w.findViewById(2131430507), new x2b1(this, (byte) 10));
                                                                                                                                                                                                                                                                gik1 gik1VarN3 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var16 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var16 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN3.a((TextView) ai0Var16.Y, new x2b1(this, (byte) 11));
                                                                                                                                                                                                                                                                gik1 gik1VarN4 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var17 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var17 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN4.a((FrameLayout) ai0Var17.b, new x2b1(this, (byte) 12));
                                                                                                                                                                                                                                                                gik1 gik1VarN5 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var18 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var18 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN5.a((FrameLayout) ai0Var18.f, new x2b1(this, (byte) 13));
                                                                                                                                                                                                                                                                gik1 gik1VarN6 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var19 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var19 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN6.a((LinearLayout) ai0Var19.b1, new x2b1(this, (byte) 14));
                                                                                                                                                                                                                                                                gik1 gik1VarN7 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var20 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var20 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN7.a((LinearLayout) ai0Var20.c1, new x2b1(this, (byte) 15));
                                                                                                                                                                                                                                                                gik1 gik1VarN8 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var21 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var21 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN8.a((LinearLayout) ai0Var21.d1, new x2b1(this, (byte) 16));
                                                                                                                                                                                                                                                                gik1 gik1VarN9 = n0();
                                                                                                                                                                                                                                                                ks6 ks6Var = this.v1;
                                                                                                                                                                                                                                                                if (ks6Var == null) {
                                                                                                                                                                                                                                                                    u890.C("summaryBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN9.a((ConstraintLayout) ks6Var.a, new x2b1(this, (byte) 2));
                                                                                                                                                                                                                                                                gik1 gik1VarN10 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var22 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var22 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN10.a((TextView) ai0Var22.t, new x2b1(this, (byte) 3));
                                                                                                                                                                                                                                                                gik1 gik1VarN11 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var23 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var23 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN11.a((EncoreButton) ai0Var23.j1, new x2b1(this, (byte) 4));
                                                                                                                                                                                                                                                                gik1 gik1VarN12 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var24 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var24 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN12.a((EncoreButton) ai0Var24.k1, new x2b1(this, (byte) 5));
                                                                                                                                                                                                                                                                gik1 gik1VarN13 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var25 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var25 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN13.a((ConstraintLayout) ai0Var25.g1, new x2b1(this, (byte) 6));
                                                                                                                                                                                                                                                                gik1 gik1VarN14 = n0();
                                                                                                                                                                                                                                                                ai0 ai0Var26 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var26 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                gik1VarN14.a((FrameLayout) ai0Var26.c, new x2b1(this, (byte) 7));
                                                                                                                                                                                                                                                                m0().b.f(this, new y2b1(this, (byte) 0));
                                                                                                                                                                                                                                                                m0().c.a(this, new y2b1(this, (byte) 1), new y2b1(this, (byte) 2));
                                                                                                                                                                                                                                                                ai0 ai0Var27 = this.b1;
                                                                                                                                                                                                                                                                if (ai0Var27 == null) {
                                                                                                                                                                                                                                                                    u890.C("viewBinding");
                                                                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) ai0Var27.a;
                                                                                                                                                                                                                                                                q881 q881Var = new q881(this, (byte) 9);
                                                                                                                                                                                                                                                                WeakHashMap weakHashMap = b8k1.a;
                                                                                                                                                                                                                                                                r7k1.c(coordinatorLayout2, q881Var);
                                                                                                                                                                                                                                                                ((f0i) this).a.a(new k5g(this, (byte) 4));
                                                                                                                                                                                                                                                                ((tg30) lmwVar.b).g.j0("PAYMENT_FRAGMENT_RESULT_KEY", this, new c681(this, (byte) 11));
                                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                        i4 = i5;
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
                                                                                                                                                                                        } else {
                                                                                                                                                                                            i4 = i5;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i4)));
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    i = i3;
                                                                                                                                                } else {
                                                                                                                                                    i = 2131431177;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i = i2;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = i2;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = i2;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = i2;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = i2;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = i2;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = i2;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = i2;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = i2;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = i2;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = i2;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = i2;
                                                                                                }
                                                                                            } else {
                                                                                                i = i2;
                                                                                            }
                                                                                        } else {
                                                                                            i = i2;
                                                                                        }
                                                                                    } else {
                                                                                        i = i2;
                                                                                    }
                                                                                } else {
                                                                                    i = i2;
                                                                                }
                                                                            } else {
                                                                                i = i2;
                                                                            }
                                                                        } else {
                                                                            i = i2;
                                                                        }
                                                                    } else {
                                                                        i = i2;
                                                                    }
                                                                } else {
                                                                    i = i2;
                                                                }
                                                            } else {
                                                                i = i2;
                                                            }
                                                        } else {
                                                            i = i2;
                                                        }
                                                    } else {
                                                        i = i2;
                                                    }
                                                } else {
                                                    i = i2;
                                                }
                                            } else {
                                                i = i2;
                                            }
                                        } else {
                                            i = i2;
                                        }
                                    } else {
                                        i = i2;
                                    }
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = i2;
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(coordinatorLayoutInflate.getResources().getResourceName(i)));
    }

    public final void onDestroy() {
        super.onDestroy();
        this.w1.c();
        this.x1.c();
    }

    public final void onNewIntent(Intent intent) {
        super/*p.g0i*/.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        f3b1 f3b1Var = extras != null ? (f3b1) jhc1.t(extras, "EXTRA_ARGS", f3b1.class) : null;
        if (f3b1Var == null) {
            hhg1.n("Required value was null.");
        } else {
            f3b1Var.toString();
            m0().U(new h000((f3b1) this.a1.getValue(), f3b1Var));
        }
    }

    public final void p0() {
        lmw lmwVar = ((dg30) this).U0;
        ai30 ai30Var = ((tg30) lmwVar.b).g;
        ai0 ai0Var = this.b1;
        if (ai0Var == null) {
            u890.C("viewBinding");
            throw null;
        }
        zf30 zf30VarF = ai30Var.F(((FrameLayout) ai0Var.f).getId());
        if (zf30VarF != null) {
            nu9 nu9Var = new nu9(((tg30) lmwVar.b).g);
            nu9Var.m(zf30VarF);
            nu9Var.h();
        }
        this.x1.c();
        this.z1 = null;
    }

    public final void q0(uas0 uas0Var) {
        if (u890.j(uas0Var, this.y1)) {
            return;
        }
        if (uas0Var == null) {
            p0();
        } else {
            String str = uas0Var.a;
            uas0 uas0Var2 = this.y1;
            if (uas0Var2 == null) {
                l0(uas0Var);
            } else if (uas0Var.equals(new uas0(str, uas0Var2.b, uas0Var2.c, uas0Var2.d, uas0Var2.e, uas0Var2.f, uas0Var2.g, uas0Var2.h, uas0Var2.i))) {
                qbs0 qbs0Var = this.z1;
                if (qbs0Var != null) {
                    xcs0 xcs0Var = qbs0Var.W1;
                    if (xcs0Var == null) {
                        u890.C("paymentSessionStorage");
                        throw null;
                    }
                    xcs0Var.e(str, qbs0Var.Y0().d);
                    xcs0 xcs0Var2 = qbs0Var.W1;
                    if (xcs0Var2 == null) {
                        u890.C("paymentSessionStorage");
                        throw null;
                    }
                    xcs0Var2.c(str, qbs0Var.Y0().c);
                    qbs0Var.Z0().U(new t500(str));
                }
            } else {
                p0();
                l0(uas0Var);
            }
        }
        this.y1 = uas0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r0(h3b1 h3b1Var) {
        this.C1 = h3b1Var;
        int i = h3b1Var == h3b1.a ? -1 : 0;
        Intent intent = new Intent();
        intent.putExtra("EXTRA_CHECKOUT_RESULT", h3b1Var);
        setResult(i, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s0(diw diwVar) {
        if (diwVar instanceof xhw) {
            r0(((xhw) diwVar).a);
            return;
        }
        if (diwVar instanceof chw) {
            h3b1 h3b1Var = ((chw) diwVar).a;
            if (h3b1Var != null) {
                r0(h3b1Var);
            }
            finish();
            return;
        }
        if (diwVar instanceof nhw) {
            qh0 qh0Var = this.B1;
            if (qh0Var != null) {
                qh0Var.a(((nhw) diwVar).a);
                return;
            } else {
                u890.C("launchCountryPicker");
                throw null;
            }
        }
        if (diwVar instanceof khw) {
            this.A1.onNext(((khw) diwVar).a);
            return;
        }
        boolean z = diwVar instanceof yhw;
        lmw lmwVar = ((dg30) this).U0;
        if (z) {
            SubmitCheckoutResponse.Dialog dialog = ((yhw) diwVar).a;
            wvf wvfVar = new wvf(dialog.getTitle(), o7h.y0(dialog.q(), "\n\n", (String) null, (String) null, (iu30) null, 62), dialog.p(), null);
            dwf dwfVar = new dwf();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGS_KEY", wvfVar);
            dwfVar.T0(bundle);
            dwfVar.g1(((tg30) lmwVar.b).g, "TAG_SUBMIT_DIALOG");
            return;
        }
        if (diwVar instanceof hhw) {
            ffe1 ffe1Var = this.q1;
            if (ffe1Var != null) {
                ffe1Var.i(((hhw) diwVar).a);
                return;
            } else {
                u890.C("checkoutUrlLoader");
                throw null;
            }
        }
        if (diwVar instanceof aiw) {
            wvf wvfVar2 = new wvf(getString(2131953828), getString(2131953826), getString(2131953827), getString(R.string.cancel));
            dwf dwfVar2 = new dwf();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ARGS_KEY", wvfVar2);
            dwfVar2.T0(bundle2);
            dwfVar2.g1(((tg30) lmwVar.b).g, "TAG_SUBMIT_CPD_DIALOG");
            return;
        }
        if (diwVar instanceof ohw) {
            r0(h3b1.b);
            finish();
            Parcelable parcelable = ((ohw) diwVar).a;
            Intent intent = new Intent((Context) this, (Class<?>) SpotifyCheckoutActivity.class);
            intent.putExtra("EXTRA_ARGS", parcelable);
            startActivity(intent);
            return;
        }
        if (!(diwVar instanceof shw)) {
            eg.o();
            return;
        }
        qbs0 qbs0Var = this.z1;
        if (qbs0Var != null) {
            qbs0Var.Z0().U(y300.a);
        }
    }

    @Override // p.bwf
    public final void t(String str) {
    }

    @Override // p.bwf
    public final void x(String str) {
    }
}
