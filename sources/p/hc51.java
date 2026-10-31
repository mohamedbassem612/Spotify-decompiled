package p;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hc51 {
    public final zle1 a;
    public final llm c;
    public View e;
    public fc51 f;
    public final AtomicReference b = new AtomicReference(new ec51());
    public final xgn0 d = ygn0.a();

    public hc51(zle1 zle1Var, q8n q8nVar) {
        this.a = zle1Var;
        this.c = l1d.x(q8nVar);
    }

    public final void a(wb51 wb51Var) {
        if (wb51Var != null && e(new u841(wb51Var, (byte) 7)).b()) {
            b();
        }
    }

    public final void b() {
        View view;
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f;
        if (onAttachStateChangeListener != null && (view = this.e) != null) {
            view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.f = null;
        this.e = null;
    }

    public final boolean c(int i) {
        yb51 yb51VarE = e(new p4g0(i, (byte) 19));
        if (yb51VarE.b()) {
            b();
        }
        return yb51VarE.b();
    }

    public final wb51 d(int i) {
        yb51 yb51VarE = e(new p4g0(i, (byte) 21));
        if (!yb51VarE.b()) {
            return null;
        }
        b();
        if (i == 2) {
            return null;
        }
        return wb51.a(yb51VarE.d().c());
    }

    public final yb51 e(vu30 vu30Var) {
        AtomicReference atomicReference;
        ec51 ec51Var;
        yb51 yb51Var;
        ec51 ec51VarA;
        long jA = ((s45) this.a).a.a();
        do {
            atomicReference = this.b;
            ec51Var = (ec51) atomicReference.get();
            long jMax = Math.max(jA, ec51Var.d());
            yb51Var = (yb51) vu30Var.invoke(ec51Var, Long.valueOf(jMax));
            ec51VarA = ec51.a(yb51Var.d(), 0, 0L, 0L, 0, 0, (Integer) null, (ac51) null, jMax, 127);
        } while (!fd21.j(atomicReference, ec51Var, ec51VarA));
        zb51 zb51VarC = yb51Var.c();
        if (zb51VarC != null) {
            c921.y(this.c, (o8n) null, 0, new sew0(this, zb51VarC, (lnm) null, (byte) 21), 3);
        }
        return yb51.a(yb51Var, ec51VarA);
    }
}
