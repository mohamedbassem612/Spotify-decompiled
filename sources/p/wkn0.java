package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wkn0 extends e711 {
    public final ViewGroup U0;
    public final Scheduler V0;
    public final Flowable W0;
    public final gw70 X0;
    public final ypa Y0;
    public final mr20 Z0;
    public final mr20 a1;
    public final iac0 b1;
    public final on4 c1;
    public final ViewGroup d1;
    public final ConstraintLayout e1;
    public final View f1;
    public final ImageView g1;
    public final EncoreTextView h1;
    public final int i1;
    public final int j1;
    public final int k1;
    public final int l1;
    public final int m1;
    public final vku n1;
    public xab1 o1;
    public xab1 p1;
    public final ek2 q1;
    public iac0 r1;
    public final idd1 s1;

    /* JADX WARN: Illegal instructions before constructor call */
    public wkn0(ViewGroup viewGroup, Scheduler scheduler, Flowable flowable, gw70 gw70Var, ypa ypaVar, mr20 mr20Var, mr20 mr20Var2, rm0 rm0Var, iac0 iac0Var, on4 on4Var) {
        View viewF = e711.F(2131624580, viewGroup);
        super(viewF);
        this.U0 = viewGroup;
        this.V0 = scheduler;
        this.W0 = flowable;
        this.X0 = gw70Var;
        this.Y0 = ypaVar;
        this.Z0 = mr20Var;
        this.a1 = mr20Var2;
        this.b1 = iac0Var;
        this.c1 = on4Var;
        this.d1 = (ViewGroup) viewGroup.getParent();
        this.e1 = viewF.findViewById(2131428198);
        tka0 tka0Var = dtw.C;
        View view = mhc.b(viewGroup.getContext(), viewGroup, f6o1.A(rm0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rih1.a, (ipb1) null, 112).w;
        this.f1 = view;
        this.g1 = (ImageView) viewF.findViewById(2131430109);
        this.h1 = viewF.findViewById(2131430975);
        this.i1 = viewGroup.getContext().getResources().getDisplayMetrics().widthPixels;
        this.j1 = viewGroup.getContext().getResources().getDisplayMetrics().heightPixels;
        this.k1 = viewGroup.getContext().getResources().getDimensionPixelSize(2131165945);
        this.l1 = viewGroup.getContext().getResources().getDimensionPixelSize(2131165946);
        this.m1 = viewGroup.getContext().getResources().getDimensionPixelSize(2131165944);
        this.n1 = new vku();
        ek2 ek2Var = new ek2(this, (byte) 14);
        this.q1 = ek2Var;
        this.s1 = new idd1(new zem0(this, (byte) 26));
        if (!on4Var.a()) {
            this.r1 = iac0Var;
            iac0Var.getLifecycle().a(ek2Var);
            vbm[] vbmVarArr = q601.a;
        }
        k8p1.o(viewF.findViewById(2131429700), view);
    }

    public final void E(int i, Object obj) {
        xap1.q(this.d1, new h5z(this, (byte) 2));
    }

    public final void G() {
        if (this.c1.a() && this.r1 == null) {
            iac0 iac0VarH = x9p1.h(((w611) this).a);
            if (iac0VarH == null) {
                n57.e("Carousel holder attached without a view-tree LifecycleOwner");
                iac0VarH = this.b1;
            }
            if (iac0VarH.getLifecycle().b() != w8c0.a) {
                this.r1 = iac0VarH;
                iac0VarH.getLifecycle().a(this.q1);
                vbm[] vbmVarArr = q601.a;
                this.Y0.getClass();
            }
        }
    }

    public final void H() {
        this.n1.c();
        xab1 xab1Var = this.o1;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    public final void I() {
    }
}
