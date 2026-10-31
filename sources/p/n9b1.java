package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.ContextTrack;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n9b1 extends e711 implements wes0 {
    public static final /* synthetic */ int r1 = 0;
    public final ViewGroup U0;
    public final gw70 V0;
    public final d0r W0;
    public final iu30 X0;
    public final sn4 Y0;
    public final FrameLayout Z0;
    public final ImageView a1;
    public final View b1;
    public final int c1;
    public final dtw d1;
    public final View e1;
    public final dtw f1;
    public final View g1;
    public final View h1;
    public final int i1;
    public final int j1;
    public final int k1;
    public final int l1;
    public final int m1;
    public final llm n1;
    public xab1 o1;
    public final eg7 p1;
    public final o3r q1;

    /* JADX WARN: Illegal instructions before constructor call */
    public n9b1(ViewGroup viewGroup, gw70 gw70Var, d0r d0rVar, uym0 uym0Var, et90 et90Var, iu30 iu30Var, sn4 sn4Var) {
        dtw dtwVarD;
        View viewF = e711.F(2131626190, viewGroup);
        super(viewF);
        this.U0 = viewGroup;
        this.V0 = gw70Var;
        this.W0 = d0rVar;
        this.X0 = iu30Var;
        this.Y0 = sn4Var;
        ViewGroup viewGroupJ = J(viewGroup);
        FrameLayout frameLayout = (FrameLayout) viewF.findViewById(2131428268);
        this.Z0 = frameLayout;
        this.a1 = (ImageView) viewF.findViewById(2131429612);
        this.b1 = viewF.findViewById(2131430319);
        this.c1 = viewF.getContext().getResources().getDimensionPixelSize(2131165908);
        tka0 tka0Var = dtw.C;
        dtw dtwVarB = mhc.b(viewF.getContext(), (ViewGroup) viewF, f6o1.A(et90Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new jpx0(null), (ipb1) null, 112);
        this.d1 = dtwVarB;
        View view = dtwVarB.w;
        ((FrameLayout) viewF).addView(view, new FrameLayout.LayoutParams(-2, -2, 8388659));
        this.e1 = view;
        if (sn4Var.d()) {
            dtwVarD = mhc.d(viewF.getContext(), frameLayout, f6o1.A(uym0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
            k8p1.o(viewF.findViewById(2131430091), dtwVarD.w);
        } else {
            viewF.findViewById(2131430091).setVisibility(8);
            dtwVarD = null;
        }
        this.f1 = dtwVarD;
        View viewFindViewById = viewGroupJ.findViewById(2131427919);
        if (viewFindViewById == null && (viewFindViewById = viewGroupJ.findViewById(2131430422)) == null) {
            bhn0.i("The layout is missing content barriers (carousel_item_safe_barrier_top/bottom), needed to position the square cover art");
            throw null;
        }
        this.g1 = viewFindViewById;
        View viewFindViewById2 = viewGroupJ.findViewById(2131427918);
        if (viewFindViewById2 == null && (viewFindViewById2 = viewGroupJ.findViewById(2131430421)) == null) {
            bhn0.i("The layout is missing content barriers (carousel_item_safe_barrier_top/bottom), needed to position the square cover art");
            throw null;
        }
        this.h1 = viewFindViewById2;
        this.i1 = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels;
        this.j1 = viewGroup.getContext().getResources().getDisplayMetrics().heightPixels;
        this.k1 = viewGroup.getContext().getResources().getDimensionPixelSize(2131167050);
        this.l1 = viewGroup.getContext().getResources().getDimensionPixelSize(2131167051);
        this.m1 = viewGroup.getContext().getResources().getDimensionPixelSize(2131167049);
        j0d1 j0d1VarB = guo1.B();
        fns fnsVar = igu.a;
        this.n1 = smo1.e(flo1.l(j0d1VarB, pyf0.a.f));
        this.p1 = new eg7(this, (byte) 23);
        this.q1 = w3p1.o(new l4r(new wlu(rc11.a.b(xkk1.class)), 1, v3b1.O0, new j4r(v3b1.Z), v3b1.P0), v3b1.N0);
    }

    public static ViewGroup J(View view) {
        return u890.j(view.getTag(), 2131430188) ? (ViewGroup) view : J((ViewGroup) view.getParent());
    }

    public final void E(int i, Object obj) {
        ContextTrack contextTrack = (ContextTrack) obj;
        xab1 xab1Var = this.o1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.o1 = null;
        xap1.q(this.U0, new pud0(this, contextTrack, (byte) 1));
        this.X0.invoke(new kdn(false, contextTrack.uri()));
        this.d1.f(new jpx0(contextTrack));
        dtw dtwVar = this.f1;
        if (dtwVar != null) {
            dtwVar.f(new qym0(contextTrack.uri(), true));
        }
    }

    public final void G() {
        this.h1.addOnLayoutChangeListener(this.p1);
    }

    public final void H() {
        xab1 xab1Var = this.o1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.o1 = null;
        this.h1.removeOnLayoutChangeListener(this.p1);
    }

    public final void I() {
        xab1 xab1Var = this.o1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.o1 = null;
    }

    public final void K(String str) {
        int i = this.i1 - (this.k1 * 2);
        ixg ixgVarF = this.V0.f(str);
        ixgVarF.l(2131233988);
        ixgVarF.p(i, i, 1);
        ixgVarF.d();
        ImageView imageView = this.a1;
        ixgVarF.s(new fr31(Integer.valueOf(imageView.getContext().getResources().getDimensionPixelSize(2131167033))));
        ixgVarF.k(imageView, (ird1) null);
    }

    public final void L() {
        int bottom = this.g1.getBottom() + this.l1;
        int i = this.i1;
        int i2 = this.k1;
        int i3 = (i - i2) - i2;
        int top = (this.h1.getTop() - this.m1) - bottom;
        int iMin = (int) (((double) Math.min(i, this.j1)) * 0.1d);
        int iMin2 = Math.min(i3, top);
        if (iMin2 < 0) {
            iMin2 = 0;
        }
        if (iMin2 < iMin) {
            iMin2 = 0;
        }
        int iF = l1d.f(top, iMin2, 2, bottom);
        FrameLayout frameLayout = this.Z0;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.height = iMin2;
        layoutParams.width = iMin2;
        layoutParams.setMargins(0, iF, 0, 0);
        frameLayout.setLayoutParams(layoutParams);
        View view = this.e1;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
        int i4 = this.c1;
        layoutParams2.topMargin = iF + i4;
        layoutParams2.setMarginStart(((i - iMin2) / 2) + i4);
        view.setLayoutParams(layoutParams2);
    }

    public final void c() {
        ImageView imageView = this.a1;
        int visibility = imageView.getVisibility();
        View view = this.b1;
        if (visibility == 0) {
            view.setVisibility(4);
        } else {
            xap1.p(view, imageView);
        }
    }

    public final void d() {
        this.a1.setVisibility(4);
        this.b1.setVisibility(0);
    }
}
