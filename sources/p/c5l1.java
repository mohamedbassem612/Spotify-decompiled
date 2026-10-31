package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c5l1 extends zf30 {
    public static final Set S1 = dm61.z0("spotify:", "spotify://", "spotify:home", "spotify://home");
    public final iyh1 F1;
    public kg0 G1;
    public h5l1 H1;
    public Scheduler I1;
    public y0g J1;
    public a1g K1;
    public feh1 L1;
    public mbo0 M1;
    public p3n1 N1;
    public x2g1 O1;
    public final CompositeDisposable P1 = new CompositeDisposable();
    public final idd1 Q1 = new idd1(new z4l1(this, (byte) 0));
    public final idd1 R1 = new idd1(new z4l1(this, (byte) 1));

    public c5l1(iyh1 iyh1Var) {
        this.F1 = iyh1Var;
    }

    public final void F0(Bundle bundle) {
        h5l1 h5l1Var = this.H1;
        if (h5l1Var != null) {
            bundle.putBoolean("key_pses_request_suspended", h5l1Var.t);
        } else {
            u890.C("presenter");
            throw null;
        }
    }

    public final void I0(View view, Bundle bundle) {
        View viewFindViewById = view.findViewById(2131429832);
        if (((Boolean) this.R1.getValue()).booleanValue()) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
        } else {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            c921.y(cto1.q(n0()), (o8n) null, 0, new gqj1(this, viewFindViewById, (lnm) null, (byte) 10), 3);
        }
    }

    public final void J0(Bundle bundle) {
        ((zf30) this).h1 = true;
        h5l1 h5l1Var = this.H1;
        if (h5l1Var == null) {
            u890.C("presenter");
            throw null;
        }
        if (bundle == null || !bundle.getBoolean("key_pses_request_suspended", false)) {
            return;
        }
        h5l1Var.a();
    }

    public final kg0 Y0() {
        kg0 kg0Var = this.G1;
        if (kg0Var != null) {
            return kg0Var;
        }
        u890.C("zeroNavigator");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z0(onm onmVar) {
        a5l1 a5l1Var;
        if (onmVar instanceof a5l1) {
            a5l1Var = (a5l1) onmVar;
            int i = a5l1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a5l1Var.c = i - Integer.MIN_VALUE;
            } else {
                a5l1Var = new a5l1(this, onmVar);
            }
        } else {
            a5l1Var = new a5l1(this, onmVar);
        }
        Object objK = a5l1Var.a;
        int i2 = a5l1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                Context contextP0 = P0();
                feh1 feh1Var = this.L1;
                if (feh1Var == null) {
                    u890.C("unauthConfigurationProvider");
                    throw null;
                }
                af4 af4Var = new af4(feh1Var);
                mbo0 mbo0Var = this.M1;
                if (mbo0Var == null) {
                    u890.C("ageSignalOverride");
                    throw null;
                }
                p3n1 p3n1Var = this.N1;
                if (p3n1Var == null) {
                    u890.C("eventSenderPublisher");
                    throw null;
                }
                hcf1 hcf1Var = new hcf1(p3n1Var, (byte) 28);
                x2g1 x2g1Var = this.O1;
                if (x2g1Var == null) {
                    u890.C("trackerIds");
                    throw null;
                }
                eyh0 eyh0VarL = xzo1.i(contextP0, af4Var, mbo0Var, new feo0(hcf1Var, x2g1Var)).l();
                a5l1Var.c = 1;
                objK = eyh0VarL.K(a5l1Var);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objK);
            }
            fn2 fn2Var = (gn2) objK;
            if (fn2Var instanceof en2) {
                return null;
            }
            if (!(fn2Var instanceof fn2)) {
                throw new NoWhenBranchMatchedException();
            }
            if (fn2Var.a == 2) {
                return fn2Var;
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.k("WarmupFragment", new Object[]{"Warmup age verification failed, continuing", e2});
            return null;
        }
    }

    public final void v0(Context context) {
        this.F1.f(this);
        super.v0(context);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        h5l1 h5l1Var = this.H1;
        if (h5l1Var != null) {
            h5l1Var.a();
        } else {
            u890.C("presenter");
            throw null;
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131624700, viewGroup, false);
    }

    public final void z0() {
        this.P1.g();
        ((zf30) this).h1 = true;
    }
}
