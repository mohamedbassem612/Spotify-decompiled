package p;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i210 {
    public final zsc a;
    public final bqb1 b;
    public final h241 c;
    public final e42 d;
    public final llm e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final LinkedHashSet g = new LinkedHashSet();
    public boolean h;

    public i210(zsc zscVar, bqb1 bqb1Var, h241 h241Var, e42 e42Var, q8n q8nVar) {
        this.a = zscVar;
        this.b = bqb1Var;
        this.c = h241Var;
        this.d = e42Var;
        this.e = l1d.x(q8nVar);
    }

    public final void a(m210 m210Var) {
        if (this.h) {
            c921.y(this.e, (o8n) null, 0, new hl1(true, this, m210Var, (lnm) null, (byte) 6), 3);
        } else {
            LinkedHashSet linkedHashSet = this.f;
            if (linkedHashSet.contains(m210Var)) {
                return;
            }
            linkedHashSet.add(m210Var);
        }
    }
}
