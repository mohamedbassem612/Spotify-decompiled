package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ya6 extends vr31 {
    public final itz b;
    public final y7l c;
    public final llm d;

    public ya6(String str, wa6 wa6Var) {
        super(str);
        this.b = wa6Var.a;
        this.c = wa6Var.b;
        this.d = i3a.k(wa6Var.c);
    }

    @Override // p.vr31
    public final void e() {
        smo1.p(this.d, (CancellationException) null);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public final void g(int i) {
        ab6 ab6VarA;
        va6 va6Var = (va6) this.b.e.getValue();
        if (va6Var == null) {
            ab6VarA = null;
        } else {
            if (!va6Var.a) {
                va6Var = null;
            }
            if (va6Var != null) {
                ab6VarA = va6Var.a(this.a);
            } else {
                ab6VarA = null;
            }
        }
        if (ab6VarA == null || !ab6VarA.g) {
            this.c.b(i);
        } else {
            fn31.T(this.d, (o8n) null, 0, new xa6(this, ab6VarA, ((double) yoi1.p(i, 0, 100)) / 100.0d, null), 3);
        }
    }

    public final void j(int i) {
        va6 va6Var = (va6) this.b.e.getValue();
        ab6 ab6VarA = null;
        if (va6Var != null) {
            if (!va6Var.a) {
                va6Var = null;
            }
            if (va6Var != null) {
                ab6VarA = va6Var.a(this.a);
            }
        }
        if (ab6VarA == null || !ab6VarA.g) {
            this.c.c(i);
        } else {
            g(jch0.S(ab6VarA.e * 100.0d) + i);
        }
    }
}
