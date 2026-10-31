package p;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class xfu extends zrd1 {
    public int c;

    public xfu(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract lnm c();

    public Throwable d(Object obj) {
        nyh nyhVar = obj instanceof nyh ? (nyh) obj : null;
        if (nyhVar != null) {
            return nyhVar.a;
        }
        return null;
    }

    public final void g(Throwable th) {
        omo1.p(new i9n("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            vfu vfuVar = (vfu) c();
            onm onmVar = vfuVar.e;
            Object obj = vfuVar.g;
            o8n context = onmVar.getContext();
            Object objW = flo1.w(context, obj);
            faa0 faa0Var = null;
            fhh1 fhh1VarU = objW != flo1.a ? ulo1.u(onmVar, context, objW) : null;
            try {
                o8n context2 = onmVar.getContext();
                Object objH = h();
                Throwable thD = d(objH);
                if (thD == null && mp10.u(this.c)) {
                    faa0Var = (faa0) context2.A(fkj0.W0);
                }
                if (faa0Var != null && !faa0Var.isActive()) {
                    CancellationException cancellationExceptionG = faa0Var.g();
                    a(cancellationExceptionG);
                    onmVar.resumeWith(new m231(cancellationExceptionG));
                } else if (thD != null) {
                    onmVar.resumeWith(new m231(thD));
                } else {
                    onmVar.resumeWith(e(objH));
                }
            } finally {
                if (fhh1VarU == null || fhh1VarU.C0()) {
                    flo1.p(context, objW);
                }
            }
        } catch (DispatchException e) {
            omo1.p(e.a, c().getContext());
        } catch (Throwable th) {
            g(th);
        }
    }

    public void a(CancellationException cancellationException) {
    }

    public Object e(Object obj) {
        return obj;
    }
}
