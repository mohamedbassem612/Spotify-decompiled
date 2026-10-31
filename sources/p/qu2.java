package p;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qu2 implements qyo0 {
    public final /* synthetic */ byte a;
    public xab1 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public qu2(Flowable flowable, u961 u961Var, c3s c3sVar, o241 o241Var, cn4 cn4Var, huh0 huh0Var, q8n q8nVar) {
        this.a = (byte) 1;
        this.c = cn4Var;
        this.d = huh0Var;
        vbm[] vbmVarArr = q601.a;
        kge kgeVar = new kge(flowable);
        this.e = kgeVar;
        this.f = h5p1.s(kgeVar, hu20.e(kgeVar, new afb1((lnm) null, u961Var, (byte) 14)), rqt0.u(new ph11(yoi1.g(((p241) o241Var).a), (byte) 21)), new xzu0(this, (lnm) null, (byte) 4));
        this.g = yoi1.g(c3sVar.e);
        this.h = smo1.e(flo1.l(q8nVar, guo1.B()).y(new v62(olj0.T0, (byte) 24)));
    }

    public void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-734139282);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            ven0 ven0VarH = rwq.h(((yo2) ((ynb0) this.d).get()).s, x340Var, 0);
            qpe qpeVar = (qpe) ((idd1) this.h).getValue();
            jre jreVar = (jre) ven0VarH.getValue();
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            otw.c(qpeVar, new ope(jreVar, uyn1.h(2, 8.0f, 0.0f), true), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nu2(this, i);
        }
    }

    public void b(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-142295447);
        int i2 = (x340Var.i(this) ? 32 : 16) | i;
        byte b = 0;
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            kiv kivVar = gfe0.a;
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ou2(this, b);
                x340Var.s0(objT);
            }
            mod.b(gfe0.d((Function0) objT, x340Var), apo.r(-1028574423, new pu2(j2iVar, b2), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n2(this, j2iVar, i, (byte) 23);
        }
    }

    public final void c() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                this.b = fn31.T(cto1.q((gj5) this.c), (o8n) null, 0, new qm(this, (lnm) null, (byte) 18), 3);
                break;
            default:
                xab1 xab1Var = this.b;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.b = fn31.T((llm) this.h, (o8n) null, 0, new fkj1(this, (lnm) null, (byte) 4), 3);
                break;
        }
    }

    public final void d() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                xab1 xab1Var = this.b;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                this.b = null;
                e();
                break;
            default:
                if (!((cn4) this.c).d()) {
                    smo1.p((llm) this.h, null);
                } else {
                    xab1 xab1Var2 = this.b;
                    if (xab1Var2 != null) {
                        xab1Var2.d((CancellationException) null);
                    }
                    this.b = null;
                }
                break;
        }
    }

    public void e() {
        ((yo2) ((ynb0) this.d).get()).A(false);
        View view = (ComposeView) this.g;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.g = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(PlayerState playerState, onm onmVar) {
        jqj1 jqj1Var;
        if (onmVar instanceof jqj1) {
            jqj1Var = (jqj1) onmVar;
            int i = jqj1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqj1Var.c = i - Integer.MIN_VALUE;
            } else {
                jqj1Var = new jqj1(this, onmVar);
            }
        } else {
            jqj1Var = new jqj1(this, onmVar);
        }
        Object obj = jqj1Var.a;
        int i2 = jqj1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableG = g(playerState);
                jqj1Var.c = 1;
                Object objI = fc11.i(completableG, jqj1Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to prefetch video manifest", new Object[0]);
        }
        return rih1.a;
    }

    public Completable g(PlayerState playerState) {
        huh0 huh0Var = (huh0) this.d;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        String str = contextTrack != null ? (String) contextTrack.metadata().get("associated_video_id") : null;
        if (str == null) {
            str = "";
        }
        return huh0Var.a("npv-manifests", new gx30(new li90[]{new uh90(null, str, null)}));
    }

    public qu2(gj5 gj5Var, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3) {
        this.a = (byte) 0;
        this.c = gj5Var;
        this.d = ynb0Var;
        this.e = ynb0Var2;
        this.f = ynb0Var3;
        this.h = new idd1(new ou2(this, (byte) 2));
    }
}
