package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m8r0 implements pdy0 {
    public final boolean a;
    public final int b;
    public final luk c;
    public final idd1 d;

    public m8r0(int i, luk lukVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = lukVar;
        this.d = new idd1(new gyq0(this, (byte) 11));
    }

    public final boolean a() {
        m8r0 m8r0Var = (m8r0) this.d.getValue();
        return m8r0Var != null ? m8r0Var.a() : this.a;
    }

    public final int b() {
        m8r0 m8r0Var = (m8r0) this.d.getValue();
        return m8r0Var != null ? m8r0Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("gradient_border_enabled", "page-match-entry-point", a()), new fpb("gradient_border_max_event_count", "page-match-entry-point", b(), 0, 1000)});
    }

    public m8r0(luk lukVar) {
        this(0, lukVar, false);
    }
}
