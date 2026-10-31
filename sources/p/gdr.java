package p;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gdr {
    public static final bma1 c;
    public static final bma1 d;
    public final dma1 a;
    public final ReentrantLock b = new ReentrantLock();

    static {
        nbc nbcVar = bma1.b;
        c = nbcVar.q("deeplink.session.id");
        d = nbcVar.q("deeplink.session.stage");
    }

    public gdr(x8c0 x8c0Var, dma1 dma1Var) {
        this.a = dma1Var;
        x8c0Var.a(new ct6(this, (byte) 5));
    }

    public final String a(fdr fdrVar) {
        sqm sqmVar = new sqm(fdrVar, this, (byte) 20);
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        Object objInvoke = sqmVar.invoke();
        reentrantLock.unlock();
        return (String) objInvoke;
    }

    public final mmr0 b() {
        dma1 dma1Var = this.a;
        bma1 bma1Var = c;
        String strF = ((ima1) dma1Var).n(bma1Var) ? dma1Var.f(bma1Var) : null;
        bma1 bma1Var2 = d;
        String strF2 = ((ima1) dma1Var).n(bma1Var2) ? dma1Var.f(bma1Var2) : null;
        return new mmr0(strF, strF2 != null ? o6p1.l(strF2) : null);
    }
}
