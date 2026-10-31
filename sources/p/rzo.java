package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rzo {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ rzo(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final d430 a(kko kkoVar) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                asn asnVar = (asn) ((ewo) r7qVar).c;
                ijr ijrVar = (ijr) ((zb6) asnVar.a).e.get();
                c8o.l(ijrVar);
                g7h g7hVar = (g7h) ((zb6) asnVar.a).d.get();
                c8o.l(g7hVar);
                return new d430(ijrVar, g7hVar, kkoVar);
            case 1:
                g5p g5pVar = (g5p) ((nxo) r7qVar).c;
                ijr ijrVar2 = (ijr) g5pVar.b.W.get();
                c8o.l(ijrVar2);
                g7h g7hVarX = g5pVar.b.x();
                c8o.l(g7hVarX);
                return new d430(ijrVar2, g7hVarX, kkoVar);
            case 2:
                u9p u9pVar = (u9p) ((d7p) r7qVar).c;
                ijr ijrVar3 = (ijr) ((i1o) u9pVar.C).P.get();
                c8o.l(ijrVar3);
                g7h g7hVar2 = (g7h) ((i1o) u9pVar.C).z.get();
                c8o.l(g7hVar2);
                return new d430(ijrVar3, g7hVar2, kkoVar);
            case 3:
                wgp wgpVar = (wgp) ((lbp) r7qVar).c;
                ijr ijrVar4 = (ijr) wgpVar.a.F.get();
                c8o.l(ijrVar4);
                g7h g7hVar3 = (g7h) wgpVar.a.G.get();
                c8o.l(g7hVar3);
                return new d430(ijrVar4, g7hVar3, kkoVar);
            case 4:
                nwp nwpVar = (nwp) ((gbp) r7qVar).c;
                ijr ijrVarQ = nwpVar.a.q();
                c8o.l(ijrVarQ);
                g7h g7hVar4 = (g7h) ((daq) nwpVar.a.b).b7.get();
                c8o.l(g7hVar4);
                return new d430(ijrVarQ, g7hVar4, kkoVar);
            case 5:
                thq thqVar = (thq) r7qVar;
                return new d430((ijr) thqVar.c.o6.get(), (g7h) thqVar.b.b7.get(), kkoVar);
            case 6:
                r7q r7qVar2 = r7qVar;
                return new d430((ijr) r7qVar2.d.b3.get(), (g7h) r7qVar2.b.b7.get(), kkoVar);
            default:
                r7q r7qVar3 = r7qVar;
                return new d430((ijr) r7qVar3.d.n5.get(), (g7h) r7qVar3.b.b7.get(), kkoVar);
        }
    }
}
