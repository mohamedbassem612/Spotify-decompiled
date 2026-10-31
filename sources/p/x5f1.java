package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x5f1 implements w5f1 {
    public final boolean a;
    public final pfn0 b;
    public final zen0 c;
    public ohd d;

    public x5f1(boolean z, boolean z2, pfn0 pfn0Var) {
        this.a = z2;
        this.b = pfn0Var;
        this.c = new zen0(Boolean.valueOf(z));
    }

    public final zen0 a() {
        return this.c;
    }

    public final void b() {
        ohd ohdVar = this.d;
        if (ohdVar != null) {
            ohdVar.q((Throwable) null);
        }
    }

    public final Object c(hfn0 hfn0Var, onm onmVar) {
        Object objA = this.b.a(hfn0Var, new tgg(this, new l8t0(this, (lnm) null, (byte) 17), hfn0Var, (lnm) null, (byte) 5), onmVar);
        return objA == d9n.a ? objA : rih1.a;
    }

    public final void dismiss() {
        ohd ohdVar;
        this.c.w1(Boolean.FALSE);
        if (!this.a || (ohdVar = this.d) == null) {
            return;
        }
        ohdVar.q((Throwable) null);
    }

    public final boolean isVisible() {
        zen0 zen0Var = this.c;
        return ((Boolean) zen0Var.c.getValue()).booleanValue() || ((Boolean) zen0Var.d.getValue()).booleanValue();
    }
}
