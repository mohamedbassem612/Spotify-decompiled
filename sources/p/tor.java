package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tor implements x2e {
    public final clr a;
    public final g0l b;
    public final q8n c;
    public c9n d;
    public final LinkedHashMap e = new LinkedHashMap();

    public tor(clr clrVar, g0l g0lVar, q8n q8nVar) {
        this.a = clrVar;
        this.b = g0lVar;
        this.c = q8nVar;
        this.d = cy30.t(q8nVar);
    }

    @Override // p.x2e
    public final void a() {
        smo1.q(this.d);
        this.e.clear();
    }

    @Override // p.x2e
    public final void b() {
        c9n c9nVarV = qmo1.v(this.d, new dor(this, (byte) 1));
        this.d = c9nVarV;
        c921.y(c9nVarV, (o8n) null, 0, new n1o(this, (lnm) null, (byte) 13), 3);
    }
}
