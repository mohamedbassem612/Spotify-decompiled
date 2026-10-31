package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class exh implements nwo0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ exh(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // p.nwo0
    public final owo0 a(q2p0 q2p0Var, ivn0 ivn0Var, v1r0 v1r0Var, kko kkoVar) {
        byte b = this.a;
        byte b2 = 0;
        byte b3 = 1;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new fxh(new mwh(this, (byte) 1), (cce) obj2, b2);
            case 1:
                return new r7m((jwp) obj, q2p0Var.e(), (uji1) obj2, b2);
            case 2:
                return new xiu((o290) obj, (jjh1) obj2);
            case 3:
                return new e7o((qmr) obj, (Context) obj2, b3);
            case 4:
                return new fxh((uu00) obj, (sp00) obj2, b3);
            case 5:
                return new bnf0(q2p0Var, (mre0) obj, (fdc) obj2);
            case 6:
                return new e7o((upa0) obj, new ojm((lzn0) obj2), (byte) 4);
            case 7:
                return new fxh((rzo0) obj, (bnj0) obj2, (byte) 2);
            case 8:
                return new e7o((qvp) obj, (xy4) obj2, (byte) 5);
            case 9:
                return new fxh(new j3y0(this, q2p0Var, (byte) 22), (mlw0) obj2, (byte) 3);
            case 10:
                return new r7m(kkoVar, (wvp) obj, (Context) obj2, b3);
            default:
                return new ro91(q2p0Var.e(), q2p0Var.c().a(), q2p0Var.c().d(), q2p0Var.c().c(), (lmw) obj, (dxy) obj2);
        }
    }
}
