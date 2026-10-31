package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m7a implements qyo0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ m7a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((l7a) obj).a(nik1.l1.a);
                break;
            default:
                z1x z1xVar = (z1x) obj;
                z1xVar.l.b.m((Object) null, Boolean.FALSE);
                l4p1.u(z1xVar.n, new lt20(new fu20(o4p1.r(new pzs(new fu20(new m441(new l2w(hu20.d(new mr20[]{new m441(new l2w(new ve1(new x010(z1xVar.a, z1xVar.c, y1x.h, (byte) 1), (byte) 6), (lnm) null, z1xVar, (byte) 4)), new fu20(z1xVar.b, new x1x(z1xVar, null, (byte) 0), (byte) 1)}), (lnm) null, z1xVar, (byte) 3)), new x1x(z1xVar, null, (byte) 1), (byte) 1), z1xVar, (byte) 17), z1xVar.i), new x1x(z1xVar, null, (byte) 2), (byte) 1), new jk(3, (lnm) null, (byte) 26), (byte) 0));
                break;
        }
    }

    public final void d() {
        switch (this.a) {
            case 0:
                break;
            default:
                op71.q(((z1x) this.b).n.a, (CancellationException) null);
                break;
        }
    }

    private final void a() {
    }
}
