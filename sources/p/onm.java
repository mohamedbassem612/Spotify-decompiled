package p;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class onm extends faa {
    private final o8n _context;
    private transient lnm<Object> intercepted;

    public onm(lnm lnmVar) {
        this(lnmVar, lnmVar != null ? lnmVar.getContext() : null);
    }

    @Override // p.lnm
    public o8n getContext() {
        o8n o8nVar = this._context;
        o8nVar.getClass();
        return o8nVar;
    }

    public final lnm<Object> intercepted() {
        lnm<Object> lnmVar = this.intercepted;
        if (lnmVar != null) {
            return lnmVar;
        }
        q8n q8nVar = (q8n) getContext().A(wdu0.Y);
        lnm<Object> vfuVar = q8nVar != null ? new vfu(q8nVar, this) : this;
        this.intercepted = vfuVar;
        return vfuVar;
    }

    @Override // p.faa
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        lnm<Object> lnmVar = this.intercepted;
        if (lnmVar != null && lnmVar != this) {
            m8n m8nVarA = getContext().A(wdu0.Y);
            m8nVarA.getClass();
            vfu vfuVar = (vfu) lnmVar;
            do {
                unsafe = avg.a;
                j = vfu.i;
            } while (unsafe.getObjectVolatile(vfuVar, j) == hr80.b);
            Object objectVolatile = unsafe.getObjectVolatile(vfuVar, j);
            ohd ohdVar = objectVolatile instanceof ohd ? (ohd) objectVolatile : null;
            if (ohdVar != null) {
                ohdVar.m();
            }
        }
        this.intercepted = myh.b;
    }

    public onm(lnm lnmVar, o8n o8nVar) {
        super(lnmVar);
        this._context = o8nVar;
    }
}
