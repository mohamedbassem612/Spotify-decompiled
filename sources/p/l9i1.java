package p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l9i1 {
    public final wh41 a;
    public final a1r0 b;
    public final kly0 c;
    public final e680 d;
    public final aje0 e;
    public final h9i1 f;
    public final q8n g;
    public final boolean h;
    public final llm i;
    public faa0 j;
    public final sjf1 k = new sjf1(this);
    public WeakReference l;

    public l9i1(wh41 wh41Var, a1r0 a1r0Var, jly0 jly0Var, e680 e680Var, q8n q8nVar, aje0 aje0Var, h9i1 h9i1Var, q8n q8nVar2, boolean z) {
        this.a = wh41Var;
        this.b = a1r0Var;
        this.c = jly0Var;
        this.d = e680Var;
        this.e = aje0Var;
        this.f = h9i1Var;
        this.g = q8nVar2;
        this.h = z;
        this.i = smo1.e(q8nVar);
    }

    public final void a() {
        if (this.h || !((d35) this.c.get()).c()) {
            return;
        }
        faa0 faa0Var = this.j;
        if (faa0Var == null || !faa0Var.isActive()) {
            faa0 faa0Var2 = this.j;
            if (faa0Var2 != null) {
                faa0Var2.d(null);
            }
            this.j = c921.y(this.i, (o8n) null, 0, new k9i1(this, (lnm) null, (byte) 1), 3);
        }
    }
}
