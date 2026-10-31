package p;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rch extends qy2 {
    public static final bub0 t = new bub0(rch.class);
    public q280 g;
    public final boolean h;
    public qch i;

    public rch(q280 q280Var, boolean z) {
        super(q280Var.size());
        this.g = q280Var;
        this.h = z;
    }

    public final void D(q280 q280Var) {
        int iQ = qy2.e.q(this);
        dm5.z(iQ >= 0, "Less than 0 remaining futures");
        if (iQ == 0) {
            if (q280Var != null) {
                mjh1 mjh1VarK = q280Var.k();
                while (mjh1VarK.hasNext()) {
                    Future future = (Future) mjh1VarK.next();
                    if (!future.isCancelled()) {
                        try {
                            iho1.o(future);
                        } catch (ExecutionException e) {
                            E(e.getCause());
                        } catch (Throwable th) {
                            E(th);
                        }
                    }
                }
            }
            B();
            qch qchVar = this.i;
            if (qchVar != null) {
                try {
                    qchVar.c.execute(qchVar);
                } catch (RejectedExecutionException e2) {
                    qchVar.d.v(e2);
                }
            }
            this.g = null;
        }
    }

    public final void E(Throwable th) {
        th.getClass();
        boolean z = this.h;
        bub0 bub0Var = t;
        if (z && !v(th)) {
            Set setC = C();
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    bub0Var.a().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
                    return;
                } else if (!setC.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        if (th instanceof Error) {
            bub0Var.a().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    public final void F() {
        Objects.requireNonNull(this.g);
        if (this.g.isEmpty()) {
            qch qchVar = this.i;
            if (qchVar != null) {
                try {
                    qchVar.c.execute(qchVar);
                    return;
                } catch (RejectedExecutionException e) {
                    qchVar.d.v(e);
                    return;
                }
            }
            return;
        }
        boolean z = this.h;
        l5u l5uVar = l5u.a;
        if (!z) {
            ny2 ny2Var = new ny2(this, (Object) null, (byte) 1);
            mjh1 mjh1VarK = this.g.k();
            while (mjh1VarK.hasNext()) {
                n8d0 n8d0Var = (n8d0) mjh1VarK.next();
                if (n8d0Var.isDone()) {
                    D(null);
                } else {
                    n8d0Var.b(ny2Var, l5uVar);
                }
            }
            return;
        }
        mjh1 mjh1VarK2 = this.g.k();
        int i = 0;
        while (mjh1VarK2.hasNext()) {
            n8d0 n8d0Var2 = (n8d0) mjh1VarK2.next();
            int i2 = i + 1;
            if (n8d0Var2.isDone()) {
                G(n8d0Var2);
            } else {
                n8d0Var2.b(new ny2(this, i, n8d0Var2), l5uVar);
            }
            i = i2;
        }
    }

    public final void G(n8d0 n8d0Var) {
        try {
            if (n8d0Var.isCancelled()) {
                this.g = null;
                cancel(false);
            } else {
                try {
                    iho1.o(n8d0Var);
                } catch (ExecutionException e) {
                    E(e.getCause());
                } catch (Throwable th) {
                    E(th);
                }
            }
        } finally {
            D(null);
        }
    }

    @Override // p.v6
    public final void l() {
        q280 q280Var = this.g;
        this.g = null;
        this.i = null;
        if (isCancelled() && (q280Var != null)) {
            boolean zX = x();
            mjh1 mjh1VarK = q280Var.k();
            while (mjh1VarK.hasNext()) {
                ((Future) mjh1VarK.next()).cancel(zX);
            }
        }
    }

    @Override // p.v6
    public final void r() {
        qch qchVar = this.i;
        if (qchVar != null) {
            qchVar.c();
        }
    }

    @Override // p.v6
    public final String s() {
        q280 q280Var = this.g;
        if (q280Var == null) {
            return super.s();
        }
        return "futures=" + q280Var;
    }
}
