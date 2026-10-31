package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k170 extends i170 {
    public long e;
    public boolean f;
    public final /* synthetic */ n170 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k170(n170 n170Var, l370 l370Var) {
        super(n170Var, l370Var);
        this.g = n170Var;
        this.e = -1L;
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:
    
        if (r18.f == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long O0(p.nac r19, long r20) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.k170.O0(p.nac, long):long");
    }

    public final void close() {
        boolean zG;
        if (((i170) this).c) {
            return;
        }
        if (this.f) {
            try {
                zG = z4n1.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.g.b.b();
                a(n170.f);
            }
        }
        ((i170) this).c = true;
    }
}
