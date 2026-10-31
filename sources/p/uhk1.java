package p;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uhk1 implements lc81 {
    public boolean a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public uhk1(ComposeView composeView, ViewGroup viewGroup) {
        this.b = composeView;
        this.c = bco0.a;
        this.f = new ien0(g(xhk1.a(viewGroup)));
        composeView.addOnAttachStateChangeListener(new y22(this, (byte) 25));
        p9p1.r(composeView, new thk1(this));
    }

    public void a() {
        f();
    }

    public void b(VideoSurfaceView videoSurfaceView) {
        this.f = videoSurfaceView;
    }

    public void c(String str, zau0 zau0Var) {
        uhk1 uhk1Var;
        xab1 xab1Var = (xab1) this.d;
        xab1 xab1VarU = null;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        if (zau0Var != null) {
            uhk1Var = this;
            xab1VarU = l4p1.u(zso1.H(((iac0) uhk1Var.b).getLifecycle()), o4p1.l(f5p1.q(zau0Var.b, new uk71(uhk1Var, zau0Var, str, (lnm) null, (byte) 8))));
        } else {
            uhk1Var = this;
        }
        uhk1Var.d = xab1VarU;
    }

    public boolean d() {
        return this.a;
    }

    public void e() {
        ViewParent parent;
        ComposeView composeView = (ComposeView) this.b;
        if (composeView.isAttachedToWindow() && (parent = composeView.getParent()) != null) {
            llm llmVar = (llm) this.d;
            if (llmVar == null || ((ViewParent) this.e) != parent) {
                if (llmVar != null) {
                    smo1.q(llmVar);
                }
                this.e = parent;
                fns fnsVar = igu.a;
                bs50 bs50Var = pyf0.a.f;
                j0d1 j0d1VarB = guo1.B();
                bs50Var.getClass();
                llm llmVarE = smo1.e(ilo1.B(bs50Var, j0d1VarB));
                ien0 ien0Var = xhk1.a;
                u601 u601VarB = xhk1.b(llmVarE, composeView);
                ((ien0) this.f).c(g((op80) u601VarB.getValue()));
                c921.y(llmVarE, (o8n) null, 0, new gqj1(u601VarB, this, (lnm) null, (byte) 6), 3);
                this.d = llmVarE;
            }
        }
    }

    public void f() {
        r091 r091Var = (r091) this.e;
        if (r091Var != null) {
            if (((Boolean) r091Var.e.a().getValue()).booleanValue() || ((Boolean) r091Var.d.b().getValue()).booleanValue()) {
                r091Var = null;
            }
            if (r091Var != null) {
                r091Var.d();
            }
        }
        r091 r091Var2 = (r091) this.e;
        if (r091Var2 != null) {
            r091Var2.g();
        }
        this.e = null;
    }

    public op80 g(op80 op80Var) {
        auw auwVarI = sap1.i(op80Var);
        if (auwVarI != null) {
            this.c = auwVarI;
        }
        return j6p1.k(j6p1.k(new jp80((Function0) w0n0.a1), new eq80((auw) this.c)), op80Var);
    }

    public uhk1(nwt nwtVar, iac0 iac0Var, yjp1 yjp1Var) {
        this.b = iac0Var;
        this.c = yjp1Var;
        l4p1.u(zso1.H(iac0Var.getLifecycle()), f5p1.q(nwtVar.a(), new wp41(this, (lnm) null, (byte) 17)));
    }

    public uhk1(Context context, s141 s141Var, bym1 bym1Var) {
        this.b = context;
        this.c = s141Var;
        this.d = bym1Var;
        this.e = new qbn1(this, true);
        this.f = new qbn1(this, false);
    }
}
