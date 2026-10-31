package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class x1v {
    public final byp0 a;
    public final xrc0 b;
    public final hx7 c;
    public final q8n d;
    public final m021 e;

    public x1v(byp0 byp0Var, xrc0 xrc0Var, hx7 hx7Var, q8n q8nVar, m021 m021Var) {
        this.a = byp0Var;
        this.b = xrc0Var;
        this.c = hx7Var;
        this.d = q8nVar;
        this.e = m021Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r10 == r5) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(java.lang.String r9, p.onm r10) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.x1v.a(java.lang.String, p.onm):java.io.Serializable");
    }

    public final Observable b(String str, boolean z) {
        m021 m021Var = this.e;
        return Observable.combineLatest(Observable.combineLatest((Observable) m021Var.c, (Observable) m021Var.b, mgx0.g), this.c.a(z), rqt0.F(this.d, new ymu(this, str, (lnm) null, (byte) 8)).toObservable(), fkj0.Q0);
    }
}
