package p;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.ContextTrack;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class neg1 extends e711 {
    public final ViewGroup U0;
    public final pt V0;
    public final qtw W0;
    public final uym0 X0;
    public final v1k Y0;
    public final gkd Z0;
    public final y3o0 a1;
    public final iac0 b1;
    public final sn4 c1;
    public final WeakReference d1;
    public final FrameLayout e1;
    public final dtw f1;
    public final idd1 g1;
    public final idd1 h1;
    public final dtw i1;

    public neg1(ViewGroup viewGroup, pt ptVar, qtw qtwVar, uym0 uym0Var, v1k v1kVar, gkd gkdVar, y3o0 y3o0Var, iac0 iac0Var, sn4 sn4Var, et90 et90Var) {
        super(e711.F(2131626287, viewGroup));
        this.U0 = viewGroup;
        this.V0 = ptVar;
        this.W0 = qtwVar;
        this.X0 = uym0Var;
        this.Y0 = v1kVar;
        this.Z0 = gkdVar;
        this.a1 = y3o0Var;
        this.b1 = iac0Var;
        this.c1 = sn4Var;
        while (!u890.j(viewGroup.getTag(), 2131430188)) {
            viewGroup = (ViewGroup) viewGroup.getParent();
        }
        this.d1 = new WeakReference(viewGroup);
        this.e1 = (FrameLayout) ((w611) this).a.findViewById(2131428218);
        tka0 tka0Var = dtw.C;
        dtw dtwVarD = null;
        dtw dtwVarB = mhc.b(((w611) this).a.getContext(), (ViewGroup) ((w611) this).a, f6o1.A(et90Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new jpx0((ContextTrack) null), (ipb1) null, 112);
        this.f1 = dtwVarB;
        this.g1 = new idd1(new leg1(this, (byte) 0));
        this.h1 = new idd1(new leg1(this, (byte) 1));
        boolean zE = this.c1.e();
        View view = ((w611) this).a;
        if (zE) {
            dtwVarD = mhc.d(view.getContext(), (ViewGroup) ((w611) this).a, f6o1.A(this.X0, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), (drw) null, 24);
            k8p1.o(((w611) this).a.findViewById(2131430091), dtwVarD.w);
        } else {
            view.findViewById(2131430091).setVisibility(8);
        }
        this.i1 = dtwVarD;
        k8p1.o(((w611) this).a.findViewById(2131430550), dtwVarB.w);
        this.b1.getLifecycle().a(new i83(this, (byte) 25));
    }

    public static final void J(neg1 neg1Var, int i) {
        View view;
        FrameLayout frameLayout = neg1Var.e1;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i;
        frameLayout.setLayoutParams(marginLayoutParams);
        dtw dtwVar = neg1Var.i1;
        if (dtwVar == null || (view = dtwVar.w) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = i;
        view.setLayoutParams(marginLayoutParams2);
    }

    public final void E(int i, Object obj) {
        Object m231Var;
        long jP;
        ContextTrack contextTrack = (ContextTrack) obj;
        String strUri = contextTrack.uri();
        if (strUri == null) {
            strUri = "";
        }
        try {
            String strY = l4o1.y(contextTrack);
            strY.getClass();
            m231Var = Integer.valueOf(Color.parseColor(strY));
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) == null) {
            jP = z4p1.e(((Number) m231Var).intValue());
        } else {
            int i2 = u7h.l;
            jP = nfb.p();
        }
        ((dtw) this.g1.getValue()).f(new hx9(strUri, jP));
        dtw dtwVar = (dtw) this.h1.getValue();
        String strQ = l4o1.q(contextTrack);
        dtwVar.f(new owl(strUri, strQ != null ? strQ : ""));
        this.f1.f(new jpx0(contextTrack));
        dtw dtwVar2 = this.i1;
        if (dtwVar2 != null) {
            dtwVar2.f(new qym0(strUri, true));
        }
        this.Y0.C(strUri, this.a1);
        ViewGroup viewGroup = (ViewGroup) this.d1.get();
        if (viewGroup != null) {
            this.Z0.a(viewGroup);
        }
        View view = ((w611) this).a;
        aiq0.a(view, new jyh0(view, this, (byte) 27));
    }

    public final void I() {
        this.Z0.b();
    }
}
