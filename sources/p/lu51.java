package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lu51 implements awh0 {
    public final /* synthetic */ byte a = 1;
    public final q8n b;
    public c9n c;
    public final Object d;
    public final Object e;

    public lu51(jks jksVar, d5l d5lVar, q8n q8nVar) {
        this.d = jksVar;
        this.e = d5lVar;
        this.b = q8nVar;
        this.c = i3a.k(q8nVar);
    }

    public final void a() {
        switch (this.a) {
            case 0:
                smo1.p(this.c, (CancellationException) null);
                break;
            default:
                smo1.p(this.c, (CancellationException) null);
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                c9n c9nVarV = qmo1.v(this.c, new l451(this, (byte) 8));
                this.c = c9nVarV;
                fn31.T(c9nVarV, (o8n) null, 0, new b751(this, (lnm) null, (byte) 6), 3);
                break;
            default:
                c9n c9nVarV2 = qmo1.v(this.c, new j4f1(this, (byte) 15));
                this.c = c9nVarV2;
                fn31.T(c9nVarV2, (o8n) null, 0, new b0f1(this, (lnm) null, (byte) 10), 3);
                break;
        }
    }

    public lu51(p7s p7sVar, zor zorVar, q8n q8nVar) {
        this.d = p7sVar;
        this.e = zorVar;
        this.b = q8nVar;
        this.c = i3a.k(q8nVar);
    }
}
