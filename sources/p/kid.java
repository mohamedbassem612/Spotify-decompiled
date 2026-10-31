package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.betamax.player.VideoSurfaceView;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kid extends e711 {
    public final Observable U0;
    public final m2p V0;
    public final Single W0;
    public final kma X0;
    public final gw70 Y0;
    public final u601 Z0;
    public final Scheduler a1;
    public final iac0 b1;
    public final zm4 c1;
    public final vku d1;
    public final ViewGroup e1;
    public final ImageView f1;
    public final VideoSurfaceView g1;
    public final ImageView h1;
    public final List i1;
    public uoa j1;
    public l62 k1;
    public final ek2 l1;
    public iac0 m1;

    /* JADX WARN: Illegal instructions before constructor call */
    public kid(Observable observable, m2p m2pVar, Single single, kma kmaVar, gw70 gw70Var, u601 u601Var, Scheduler scheduler, iac0 iac0Var, zm4 zm4Var, ViewGroup viewGroup) {
        View viewF = e711.F(2131624027, viewGroup);
        super(viewF);
        this.U0 = observable;
        this.V0 = m2pVar;
        this.W0 = single;
        this.X0 = kmaVar;
        this.Y0 = gw70Var;
        this.Z0 = u601Var;
        this.a1 = scheduler;
        this.b1 = iac0Var;
        this.c1 = zm4Var;
        this.d1 = new vku();
        this.e1 = mgo1.p(viewGroup);
        this.f1 = (ImageView) b8k1.n(viewF, 2131429622);
        VideoSurfaceView videoSurfaceViewN = b8k1.n(viewF, 2131431606);
        this.g1 = videoSurfaceViewN;
        this.h1 = (ImageView) b8k1.n(viewF, 2131428829);
        ek2 ek2Var = new ek2(this, (byte) 1);
        this.l1 = ek2Var;
        videoSurfaceViewN.setScaleType(b3k1.c);
        this.i1 = Collections.singletonList(new hid(this));
        if (zm4Var.f()) {
            return;
        }
        this.m1 = iac0Var;
        iac0Var.getLifecycle().a(ek2Var);
    }

    public static final jid J(kid kidVar) {
        return new jid(kidVar, (byte) 0);
    }

    public final void E(int i, Object obj) {
        final byte b = 0;
        this.d1.a(this.U0.firstOrError().subscribe(new Consumer(this) { // from class: p.iid
            public final /* synthetic */ kid b;

            {
                this.b = this;
            }

            public final void accept(Object obj2) {
                byte b2 = b;
                kid kidVar = this.b;
                switch (b2) {
                    case 0:
                        kidVar.K((l62) obj2);
                        break;
                    default:
                        qma qmaVar = (qma) obj2;
                        if (kidVar.j1 == null) {
                            soa soaVarF = kidVar.V0.a(qmaVar).f();
                            soaVarF.w = "canvas-ad";
                            soaVarF.u = new w2k1();
                            soaVarF.z = kidVar.X0;
                            soaVarF.v = new ArrayList(kidVar.i1);
                            soaVarF.x = false;
                            soaVarF.y = true;
                            uoa uoaVarA = soaVarF.a();
                            uoaVarA.p(2);
                            kidVar.j1 = uoaVarA;
                        }
                        l62 l62Var = kidVar.k1;
                        if (l62Var != null) {
                            kidVar.K(l62Var);
                        }
                        break;
                }
            }
        }, fcc.d));
    }

    public final void G() {
        if (this.c1.f() && this.m1 == null) {
            iac0 iac0VarH = x9p1.h(((w611) this).a);
            if (iac0VarH == null) {
                n57.e("Carousel holder attached without a view-tree LifecycleOwner");
                iac0VarH = this.b1;
            }
            if (iac0VarH.getLifecycle().b() != w8c0.a) {
                this.m1 = iac0VarH;
                iac0VarH.getLifecycle().a(this.l1);
            }
        }
        uoa uoaVar = this.j1;
        VideoSurfaceView videoSurfaceView = this.g1;
        if (uoaVar != null) {
            uoaVar.d(videoSurfaceView);
        }
        xap1.s(videoSurfaceView);
        uoa uoaVar2 = this.j1;
        if (uoaVar2 != null) {
            uoaVar2.l();
        }
    }

    public final void H() {
        uoa uoaVar = this.j1;
        if (uoaVar != null) {
            uoaVar.f();
        }
        VideoSurfaceView videoSurfaceView = this.g1;
        videoSurfaceView.setVisibility(8);
        this.f1.setVisibility(8);
        this.h1.setVisibility(8);
        uoa uoaVar2 = this.j1;
        if (uoaVar2 != null) {
            uoaVar2.k(videoSurfaceView);
        }
    }

    public final void I() {
        uoa uoaVar = this.j1;
        if (uoaVar != null) {
            uoaVar.u();
        }
    }

    public final void K(l62 l62Var) {
        this.k1 = l62Var;
        VideoSurfaceView videoSurfaceView = this.g1;
        videoSurfaceView.setVisibility(8);
        ImageView imageView = this.f1;
        imageView.setVisibility(8);
        this.h1.setVisibility(8);
        ti tiVar = l62Var.Z;
        if (!(tiVar instanceof jsn)) {
            if (!(tiVar instanceof isn)) {
                L(tiVar.a);
                return;
            }
            String str = ((isn) tiVar).c;
            xap1.s(imageView);
            this.Y0.f(str).k(imageView, (ird1) null);
            return;
        }
        jsn jsnVar = (jsn) tiVar;
        xap1.s(videoSurfaceView);
        uoa uoaVar = this.j1;
        if (uoaVar != null) {
            uoaVar.d(videoSurfaceView);
            oot0 oot0Var = new oot0(0L, 0L, true, false, (hu7) null, (tne1) null, false, 243);
            String str2 = jsnVar.c;
            uoaVar.q(true);
            uoaVar.h(new o2u0(str2, 14, (Map) null), oot0Var);
        }
    }

    public final void L(String str) {
        ImageView imageView = this.h1;
        xap1.s(imageView);
        ViewGroup viewGroup = this.e1;
        mgo1.l(b8k1.n(viewGroup, 2131427919), b8k1.n(viewGroup, 2131427918), imageView, this.Z0.getValue() instanceof ck7);
        mgo1.w(imageView, str, this.Y0);
    }
}
