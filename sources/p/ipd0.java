package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ipd0 implements kko {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ kko b;
    public final /* synthetic */ Object c;

    public ipd0(jpd0 jpd0Var) {
        this.c = jpd0Var;
        this.b = jpd0Var.a.b();
    }

    public final zob1 a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.a();
    }

    public final Object b(String str, tv80 tv80Var, onm onmVar) {
        byte b = this.a;
        kko kkoVar = this.b;
        switch (b) {
            case 0:
                break;
        }
        return kkoVar.b(str, tv80Var, onmVar);
    }

    public final void c(Set set) {
        switch (this.a) {
            case 0:
                jpd0 jpd0Var = (jpd0) this.c;
                synchronized (jpd0Var.b) {
                    jpd0Var.b.addAll(set);
                    jpd0Var.a.a(o7h.p1(jpd0Var.b));
                }
                return;
            default:
                sw41 sw41Var = (sw41) this.c;
                synchronized (sw41Var.b) {
                    sw41Var.b.addAll(set);
                    sw41Var.a.a(o7h.p1(sw41Var.b));
                }
                return;
        }
    }

    public ipd0(sw41 sw41Var) {
        this.c = sw41Var;
        this.b = sw41Var.a.b();
    }
}
