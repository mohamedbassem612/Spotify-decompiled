package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ztp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ ztp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final yvo0 a() {
        byte b = this.a;
        jly0 jly0Var = this.b;
        switch (b) {
            case 0:
                k9k k9kVar = (k9k) ((bsp) jly0Var).c;
                lzn0 lzn0Var = (lzn0) ((rvo0) k9kVar.b).c.get();
                c8o.l(lzn0Var);
                i8h1 i8h1Var = (i8h1) ((rvo0) k9kVar.b).o.get();
                c8o.l(i8h1Var);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new yvo0(lzn0Var, new bnj0(i8h1Var, new fjl0(yon1.P3().a, nik1.W2.a, (byte) 26), (byte) 18));
            default:
                toj0 toj0Var = (toj0) ((bsp) jly0Var).c;
                lzn0 lzn0Var2 = (lzn0) ((cwo0) toj0Var.b).b.get();
                c8o.l(lzn0Var2);
                i8h1 i8h1Var2 = (i8h1) ((cwo0) toj0Var.b).l.get();
                c8o.l(i8h1Var2);
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                return new yvo0(lzn0Var2, new bnj0(i8h1Var2, new fjl0(yon1.P3().a, nik1.W2.a, (byte) 26), (byte) 18));
        }
    }
}
