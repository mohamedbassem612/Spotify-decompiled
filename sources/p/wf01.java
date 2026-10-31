package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wf01 {
    public final upb a;
    public final up20 b;
    public final Object c = new Object();

    public wf01(upb upbVar, up20 up20Var) {
        this.a = upbVar;
        this.b = up20Var;
    }

    public final void a() {
        synchronized (this.c) {
            ((cg01) this.a.c).d(-1L);
            up20 up20Var = this.b;
            up20Var.a = 0;
            ((LinkedHashMap) up20Var.b).clear();
        }
    }

    public final void b(bsi0 bsi0Var) {
        synchronized (this.c) {
            cg01 cg01Var = (cg01) this.a.c;
            Object objRemove = cg01Var.a.remove(bsi0Var);
            if (objRemove != null) {
                cg01Var.c = cg01Var.b() - cg01Var.c(bsi0Var, objRemove);
                cg01Var.a(bsi0Var, objRemove, null);
            }
            if (objRemove != null) {
            }
            if (((LinkedHashMap) this.b.b).remove(bsi0Var) != null) {
            }
        }
    }

    public final void c(long j) {
        synchronized (this.c) {
            cg01 cg01Var = (cg01) this.a.c;
            cg01Var.b = j;
            cg01Var.d(j);
        }
    }
}
