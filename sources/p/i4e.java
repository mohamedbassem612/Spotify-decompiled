package p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i4e implements x2e {
    public final hts a;
    public final q8n b;
    public final ilr c;
    public c9n d;
    public final AtomicReference e = new AtomicReference(new lg61());

    public i4e(hts htsVar, q8n q8nVar, ilr ilrVar) {
        this.a = htsVar;
        this.b = q8nVar;
        this.c = ilrVar;
        this.d = cy30.t(q8nVar);
    }

    @Override // p.x2e
    public final void a() {
        smo1.q(this.d);
    }

    @Override // p.x2e
    public final void b() {
        c9n c9nVarV = qmo1.v(this.d, new d4e(this, (byte) 0));
        this.d = c9nVarV;
        c921.y(c9nVarV, (o8n) null, 0, new vk6(this, (lnm) null, (byte) 26), 3);
    }
}
