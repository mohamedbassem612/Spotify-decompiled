package p;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.creativeworkplatform.encore.elements.ArtworkShadow;
import com.spotify.creativeworkplatform.encore.elements.ArtworkView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.encoreconsumermobile.elements.metadatarow.MetadataRow;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.encoremobile.viewstub.EncoreViewStub;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class avn implements htn {
    public final View N0;
    public final View O0;
    public final boolean P0;
    public final boolean Q0;
    public final otn R0;
    public iu30 S0;
    public final r4u T0;
    public final h72 U0;
    public final View V0;
    public final FrameLayout W0;
    public final View X;
    public final View X0;
    public final View Y;
    public final idd1 Y0;
    public final View Z;
    public final idd1 Z0;
    public final Context a;
    public final BehaviorRetainingAppBarLayout a1;
    public final gw70 b;
    public final ArtworkView b1;
    public final View c;
    public final s17 c1;
    public final View d;
    public ArtworkShadow d1;
    public final boolean e;
    public x37 e1;
    public final View f;
    public final View g;
    public final View h;
    public final View i;
    public final View t;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.constraintlayout.widget.ConstraintLayout */
    public avn(Context context, gw70 gw70Var, View view, itn itnVar, View view2, boolean z, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10, View view11, View view12, boolean z2, boolean z3, otn otnVar) throws ConstraintLayout {
        int i;
        ConstraintLayout constraintLayout;
        View view13;
        this.a = context;
        this.b = gw70Var;
        this.c = view;
        this.d = view2;
        this.e = z;
        this.f = view3;
        this.g = view4;
        this.h = view5;
        this.i = view6;
        this.t = view7;
        this.X = view8;
        this.Y = view9;
        this.Z = view10;
        this.N0 = view11;
        this.O0 = view12;
        this.P0 = z2;
        this.Q0 = z3;
        this.R0 = otnVar;
        h72 h72VarG = h72.G(LayoutInflater.from(context));
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) h72VarG.b;
        WeakHashMap weakHashMap = b8k1.a;
        if (Build.VERSION.SDK_INT >= 26) {
            u7k1.c(behaviorRetainingAppBarLayout, false);
        }
        behaviorRetainingAppBarLayout.setTouchscreenBlocksFocus(false);
        this.U0 = h72VarG;
        if (otnVar instanceof ktn) {
            i = 2131624462;
        } else {
            if (!(otnVar instanceof ltn) && !(otnVar instanceof ntn) && !(otnVar instanceof mtn)) {
                eg.o();
                throw null;
            }
            i = 2131624627;
        }
        ConstraintLayout constraintLayoutF = h360.f(h72VarG, i);
        this.V0 = constraintLayoutF;
        this.Y0 = new idd1(new qun(this, (byte) 1));
        this.Z0 = new idd1(new qun(this, (byte) 0));
        this.a1 = behaviorRetainingAppBarLayout;
        behaviorRetainingAppBarLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        behaviorRetainingAppBarLayout.setStateListAnimator(null);
        if (z3) {
            h360.e(h72VarG);
        }
        ((View) h72VarG.f).setVisibility(z3 ? 0 : 8);
        ((Toolbar) h72VarG.X).setBackground(context.getDrawable(2131233977));
        behaviorRetainingAppBarLayout.setBackgroundColor(context.getColor(R.color.transparent));
        ((BackButtonView) h72VarG.e).setAccessibilityTraversalAfter(constraintLayoutF.findViewById(2131428380).getId());
        h360.i(h72VarG, new kjk(this, h72VarG, (byte) 26));
        aiq0.a(behaviorRetainingAppBarLayout, new nx30(behaviorRetainingAppBarLayout, this, h72VarG));
        b8k1.q(constraintLayoutF.findViewById(2131428380), true);
        ((BehaviorRetainingAppBarLayout) h72VarG.d).addOnAttachStateChangeListener(new y22(this, (byte) 4));
        if (view != null) {
            EncoreViewStub encoreViewStubFindViewById = constraintLayoutF.findViewById(2131428881);
            encoreViewStubFindViewById.getClass();
            encoreViewStubFindViewById.setVisibility(0);
            k8p1.o(encoreViewStubFindViewById, view);
        }
        ArrayList arrayList = new ArrayList();
        mmr0 mmr0Var = new mmr0(2131428357, itnVar != null ? itnVar.b : null);
        mmr0 mmr0Var2 = new mmr0(2131428358, itnVar != null ? itnVar.c : null);
        if (itnVar != null) {
            view13 = itnVar.d;
            constraintLayout = null;
        } else {
            constraintLayout = null;
            view13 = null;
        }
        Map mapJ = sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0(2131428359, view13), new mmr0(2131428360, itnVar != null ? itnVar.e : constraintLayout), new mmr0(2131428361, itnVar != null ? itnVar.f : constraintLayout), new mmr0(2131428378, itnVar != null ? itnVar.g : constraintLayout)});
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapJ.entrySet()) {
            if (((View) entry.getValue()) != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        List listS = sqg0.S(linkedHashMap);
        int i2 = 0;
        for (Object obj : listS) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw constraintLayout;
            }
            mmr0 mmr0Var3 = (mmr0) obj;
            int iIntValue = ((Number) mmr0Var3.a).intValue();
            View view14 = (View) mmr0Var3.b;
            EncoreViewStub encoreViewStubFindViewById2 = constraintLayoutF.findViewById(iIntValue);
            if (view14 == null) {
                hhg1.n("Required value was null.");
                throw constraintLayout;
            }
            encoreViewStubFindViewById2.getClass();
            ViewGroup.LayoutParams layoutParams = view14.getLayoutParams();
            ConstraintLayout constraintLayoutValueOf = layoutParams != null ? Integer.valueOf(layoutParams.width) : constraintLayout;
            ViewGroup.LayoutParams layoutParams2 = view14.getLayoutParams();
            ConstraintLayout constraintLayoutValueOf2 = layoutParams2 != null ? Integer.valueOf(layoutParams2.height) : constraintLayout;
            k8p1.o(encoreViewStubFindViewById2, view14);
            if (view14.getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams3 = view14.getLayoutParams();
                if (layoutParams3 == null) {
                    bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    throw constraintLayout;
                }
                if (constraintLayoutValueOf != null) {
                    layoutParams3.width = constraintLayoutValueOf.intValue();
                }
                if (constraintLayoutValueOf2 != null) {
                    layoutParams3.height = constraintLayoutValueOf2.intValue();
                }
                view14.setLayoutParams(layoutParams3);
            }
            arrayList.add(Integer.valueOf(iIntValue));
            view14.setSaveEnabled(false);
            if (i2 == 0) {
                ViewGroup.LayoutParams layoutParams4 = encoreViewStubFindViewById2.getLayoutParams();
                int marginStart = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams4).getMarginStart() : 0;
                boolean z4 = constraintLayoutF instanceof ConstraintLayout;
                ConstraintLayout constraintLayout2 = z4 ? constraintLayoutF : constraintLayout;
                if (constraintLayout2 != null) {
                    ConstraintLayout constraintLayout3 = z4 ? constraintLayoutF : constraintLayout;
                    if (constraintLayout3 != null) {
                        int i4 = marginStart - (itnVar != null ? itnVar.a : 0);
                        kil kilVar = new kil();
                        kilVar.f(constraintLayout3);
                        kilVar.h(view14.getId(), 6, 2131429062, 6, i4);
                        kilVar.b(constraintLayout3);
                    }
                    nun nunVar = new nun(constraintLayout2);
                    WeakHashMap weakHashMap2 = b8k1.a;
                    r7k1.c(constraintLayout2, nunVar);
                    constraintLayout2.addOnAttachStateChangeListener(new y22(constraintLayout2, (byte) 3));
                }
            }
            if (i2 < p7h.L(listS)) {
                view14.setNextFocusForwardId(((Number) ((mmr0) listS.get(i3)).a).intValue());
            }
            if (i2 == p7h.L(listS)) {
                view14.setTag("lastHeaderAction");
            }
            i2 = i3;
        }
        ConstraintLayout constraintLayout4 = constraintLayoutF instanceof ConstraintLayout ? constraintLayoutF : constraintLayout;
        if (constraintLayout4 != null) {
            kil kilVar2 = new kil();
            kilVar2.f(constraintLayout4);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kilVar2.e(((Number) it.next()).intValue(), 4);
            }
            kilVar2.b(constraintLayout4);
        }
        h72 h72Var = this.U0;
        Context context2 = this.a;
        View view15 = this.d;
        if (view15 != null) {
            if (this.Q0) {
                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(2131165727);
                View view16 = new View(context2);
                view16.setBackground(view16.getContext().getDrawable(2131230979));
                view16.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize, 17));
                FrameLayout frameLayout = new FrameLayout(context2);
                frameLayout.addView(view16);
                frameLayout.addView(view15, new FrameLayout.LayoutParams(-2, -2, 17));
                this.W0 = frameLayout;
                this.X0 = view16;
                k8p1.o((ViewStub) h72Var.c, frameLayout);
                ConstraintLayout layoutParams5 = frameLayout.getLayoutParams();
                ConstraintLayout constraintLayout5 = layoutParams5 instanceof qzg ? (qzg) layoutParams5 : constraintLayout;
                if (constraintLayout5 != null) {
                    ((qzg) constraintLayout5).a = 1;
                }
            } else {
                k8p1.o((ViewStub) h72Var.c, view15);
                ConstraintLayout layoutParams6 = view15.getLayoutParams();
                ConstraintLayout constraintLayout6 = layoutParams6 instanceof qzg ? (qzg) layoutParams6 : constraintLayout;
                if (constraintLayout6 != null) {
                    ((qzg) constraintLayout6).a = 1;
                }
            }
        }
        View view17 = this.f;
        if (view17 != null) {
            EncoreViewStub encoreViewStubFindViewById3 = constraintLayoutF.findViewById(2131428369);
            encoreViewStubFindViewById3.getClass();
            encoreViewStubFindViewById3.setVisibility(0);
            k8p1.o(encoreViewStubFindViewById3, view17);
        }
        View view18 = this.g;
        if (view18 != null) {
            EncoreViewStub encoreViewStubFindViewById4 = constraintLayoutF.findViewById(2131428371);
            encoreViewStubFindViewById4.getClass();
            encoreViewStubFindViewById4.setVisibility(0);
            k8p1.o(encoreViewStubFindViewById4, view18);
        }
        View view19 = this.h;
        if (view19 != null) {
            EncoreViewStub encoreViewStubFindViewById5 = constraintLayoutF.findViewById(2131428376);
            encoreViewStubFindViewById5.getClass();
            encoreViewStubFindViewById5.setVisibility(0);
            k8p1.o(encoreViewStubFindViewById5, view19);
            ConstraintLayout layoutParams7 = view19.getLayoutParams();
            ConstraintLayout constraintLayout7 = layoutParams7 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams7 : constraintLayout;
            if (constraintLayout7 != null) {
                ((ViewGroup.MarginLayoutParams) constraintLayout7).topMargin = 0;
            }
        }
        View view20 = this.i;
        if (view20 != null) {
            View viewFindViewById = constraintLayoutF.findViewById(2131428379);
            viewFindViewById.setVisibility(0);
            k8p1.o(viewFindViewById, view20);
            ConstraintLayout layoutParams8 = view20.getLayoutParams();
            ConstraintLayout constraintLayout8 = layoutParams8 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams8 : constraintLayout;
            if (constraintLayout8 != null) {
                ((ViewGroup.MarginLayoutParams) constraintLayout8).topMargin = 0;
            }
        }
        View view21 = this.Z;
        if (view21 != null) {
            ConstraintLayout constraintLayout9 = (MetadataRow) constraintLayoutF.findViewById(2131428373);
            constraintLayout9.getClass();
            constraintLayout9.setVisibility(0);
            constraintLayout9.addView(view21);
        }
        View view22 = this.t;
        if (view22 != null) {
            View viewFindViewById2 = constraintLayoutF.findViewById(2131428363);
            viewFindViewById2.setVisibility(0);
            k8p1.o(viewFindViewById2, view22);
            ConstraintLayout layoutParams9 = view22.getLayoutParams();
            ConstraintLayout constraintLayout10 = layoutParams9 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams9 : constraintLayout;
            if (constraintLayout10 != null) {
                ((ViewGroup.MarginLayoutParams) constraintLayout10).topMargin = 0;
            }
        }
        View view23 = this.X;
        if (view23 != null) {
            View viewFindViewById3 = constraintLayoutF.findViewById(2131428377);
            viewFindViewById3.setVisibility(0);
            k8p1.o(viewFindViewById3, view23);
        }
        View view24 = this.Y;
        if (view24 != null) {
            View viewFindViewById4 = constraintLayoutF.findViewById(2131428381);
            viewFindViewById4.setVisibility(0);
            k8p1.o(viewFindViewById4, view24);
        }
        View view25 = this.O0;
        if (view25 != null) {
            EncoreViewStub encoreViewStubFindViewById6 = constraintLayoutF.findViewById(2131428366);
            encoreViewStubFindViewById6.getClass();
            encoreViewStubFindViewById6.setVisibility(0);
            k8p1.o(encoreViewStubFindViewById6, view25);
        }
        View view26 = this.N0;
        if (view26 != null) {
            view26.setNextFocusForwardId(2131428357);
            EncoreViewStub encoreViewStubFindViewById7 = constraintLayoutF.findViewById(2131428368);
            encoreViewStubFindViewById7.getClass();
            encoreViewStubFindViewById7.setVisibility(0);
            k8p1.o(encoreViewStubFindViewById7, view26);
        }
        this.b1 = (ArtworkView) constraintLayoutF.findViewById(2131428364);
        this.c1 = new s17(this.a1.getResources().getDimensionPixelSize(2131165794));
        ArtworkView artworkView = this.b1;
        if (artworkView == null) {
            u890.C("artworkView");
            throw constraintLayout;
        }
        artworkView.setViewContext(new g47(this.b));
        e(tsn.a);
        ConstraintLayout constraintLayout11 = this.V0;
        ConstraintLayout constraintLayout12 = constraintLayout11 instanceof ViewGroup ? (ViewGroup) constraintLayout11 : constraintLayout;
        if (constraintLayout12 != null) {
            mf20 mf20Var = new mf20(z561.T(eln.c1, new i46(constraintLayout12, (byte) 8)));
            while (mf20Var.hasNext()) {
                View view27 = (View) mf20Var.next();
                view27.setTextAlignment(5);
                view27.setTextDirection(5);
            }
        }
        View view28 = this.V0;
        TextView textView = (TextView) view28.findViewById(2131428380);
        otn otnVar2 = this.R0;
        textView.setMaxLines(otnVar2.a);
        ((TextView) view28.findViewById(2131428374)).setMaxLines(otnVar2.b);
        this.T0 = r4u.c(new r4u[]{r4u.d(fmv.U0, r4u.a(new vun(this, (byte) 0))), r4u.d(new bvn(wun.b, (byte) 0), r4u.a(new zwa(this, (byte) 22))), r4u.d(new bvn(xun.b, (byte) 0), new r4u(v560.T0, new l2a(this, (byte) 23))), r4u.d(qz70.T0, new r4u(b6j0.S0, new h9n(this, (byte) 2))), r4u.d(new bvn(run.b, (byte) 0), new r4u(bbn.T0, new sun(this, (byte) 0))), r4u.d(new bvn(tun.b, (byte) 0), new r4u(ios.T0, new v9c(this, (byte) 3))), r4u.d(new bvn(uun.b, (byte) 0), r4u.a(new i6b(this, (byte) 22))), new r4u(new ofr((byte) 28), new rjn(this, (byte) 1))});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ArtworkView artworkView, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = artworkView.getLayoutParams();
        if (layoutParams2 == null || layoutParams2.width != i || (layoutParams = artworkView.getLayoutParams()) == null || layoutParams.height != i2) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i, i2);
            layoutParams3.gravity = 17;
            artworkView.setLayoutParams(layoutParams3);
            artworkView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public final int b(vsn vsnVar) {
        Resources resources = this.a1.getResources();
        boolean z = vsnVar instanceof tsn;
        otn otnVar = this.R0;
        if (z) {
            if (otnVar instanceof ktn) {
                return resources.getDimensionPixelSize(2131165586);
            }
            if (otnVar instanceof ltn) {
                return resources.getDimensionPixelSize(2131165588);
            }
            if (otnVar instanceof ntn) {
                return resources.getDimensionPixelSize(2131165591);
            }
            if (otnVar instanceof mtn) {
                return resources.getDimensionPixelSize(2131165588);
            }
            eg.o();
            return 0;
        }
        if (!(vsnVar instanceof usn)) {
            eg.o();
            return 0;
        }
        if (!(otnVar instanceof mtn)) {
            return Math.min(((resources.getDisplayMetrics().widthPixels - (resources.getDimensionPixelSize(2131165902) * 2)) * 9) / 16, resources.getDimensionPixelSize(2131165587));
        }
        int width = this.V0.getWidth();
        Integer numValueOf = Integer.valueOf(width);
        if (width <= 0) {
            numValueOf = null;
        }
        return ((numValueOf != null ? numValueOf.intValue() : resources.getDisplayMetrics().widthPixels) * 9) / 16;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View, android.widget.ImageView, com.spotify.creativeworkplatform.encore.elements.ArtworkView] */
    public final void e(vsn vsnVar) {
        if (this.R0 instanceof mtn) {
            View view = this.V0;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(2131428372);
            View viewFindViewById = view.findViewById(2131428372);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams == null) {
                bhn0.i("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            qhl qhlVar = (qhl) layoutParams;
            ((ViewGroup.MarginLayoutParams) qhlVar).width = 0;
            qhlVar.t = 2131429062;
            qhlVar.v = 2131429061;
            viewFindViewById.setLayoutParams(qhlVar);
            x37 x37Var = this.e1;
            if (x37Var != null) {
                frameLayout.getClass();
                frameLayout.removeOnLayoutChangeListener(x37Var);
            }
            x37 x37Var2 = new x37(this, vsnVar, (byte) 4);
            this.e1 = x37Var2;
            frameLayout.addOnLayoutChangeListener(x37Var2);
            k(vsnVar, frameLayout.getWidth());
            return;
        }
        int iB = b(vsnVar);
        boolean z = vsnVar instanceof usn;
        ?? r4 = this.b1;
        if (z) {
            int i = (iB * 16) / 9;
            if (r4 != 0) {
                a(r4, i, iB);
                return;
            } else {
                u890.C("artworkView");
                throw null;
            }
        }
        if (r4 == 0) {
            u890.C("artworkView");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams2 = r4.getLayoutParams();
        if (layoutParams2 == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams2.width = iB;
        layoutParams2.height = iB;
        r4.setLayoutParams(layoutParams2);
        if (r4 != 0) {
            r4.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            u890.C("artworkView");
            throw null;
        }
    }

    public final void f(Object obj) {
        this.T0.e((btn) obj);
    }

    public final View getView() {
        return this.a1;
    }

    public final void k(vsn vsnVar, int i) {
        if (i <= 0) {
            return;
        }
        int i2 = vsnVar instanceof usn ? (i * 9) / 16 : i;
        ArtworkView artworkView = this.b1;
        if (artworkView != null) {
            a(artworkView, i, i2);
        } else {
            u890.C("artworkView");
            throw null;
        }
    }

    public final void n(iu30 iu30Var) {
        this.S0 = iu30Var;
    }
}
