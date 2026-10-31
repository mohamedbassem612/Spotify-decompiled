package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class swa1 implements anc0 {
    public final String a;
    public final koc0 b;
    public final hp91 c;
    public final e32 d;
    public final i3j0 e;
    public final q8n f;
    public xab1 g;

    public swa1(String str, koc0 koc0Var, hp91 hp91Var, e32 e32Var, i3j0 i3j0Var, q8n q8nVar) {
        this.a = str;
        this.b = koc0Var;
        this.c = hp91Var;
        this.d = e32Var;
        this.e = i3j0Var;
        this.f = q8nVar;
    }

    @Override // p.anc0
    public final void a() {
        xab1 xab1Var = this.g;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.g = null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r12 == r10) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(p.onm r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.swa1.d(p.onm):java.lang.Object");
    }

    @Override // p.anc0
    public final void n() {
        xab1 xab1Var = this.g;
        if (xab1Var == null || !xab1Var.isActive()) {
            this.g = fn31.T(smo1.e(this.f), (o8n) null, 0, new xba1(this, (lnm) null, (byte) 2), 3);
        }
    }

    @Override // p.anc0
    public final void q() {
        xab1 xab1Var = this.g;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.g = null;
    }
}
