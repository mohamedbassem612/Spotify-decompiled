package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class f2p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ f2p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final j330 a(d0r d0rVar) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                ijr ijrVar = (ijr) ((qo8) ((c21) ((b2p) r7qVar).c).b).g.get();
                c8o.l(ijrVar);
                return new j330(ijrVar, d0rVar);
            case 1:
                ijr ijrVar2 = (ijr) ((j0k) ((uw0) ((d7p) r7qVar).c).d).u.get();
                c8o.l(ijrVar2);
                return new j330(ijrVar2, d0rVar);
            case 2:
                ijr ijrVarQ = ((nwp) ((gbp) r7qVar).c).a.q();
                c8o.l(ijrVarQ);
                return new j330(ijrVarQ, d0rVar);
            case 3:
                return new j330((ijr) ((thq) r7qVar).c.o6.get(), d0rVar);
            default:
                return new j330((ijr) r7qVar.d.n5.get(), d0rVar);
        }
    }
}
