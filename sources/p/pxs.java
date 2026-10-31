package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pxs implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ txs b;

    public /* synthetic */ pxs(txs txsVar, byte b) {
        this.a = b;
        this.b = txsVar;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        txs txsVar = this.b;
        switch (b) {
            case 0:
                s5l s5lVar = (s5l) obj;
                k7l k7lVar = (k7l) txsVar.n.get();
                if (k7lVar instanceof j7l) {
                    Object objI = txsVar.i(s5lVar, ((j7l) k7lVar).b, lnmVar);
                    return objI == d9nVar ? objI : rih1Var;
                }
                if (k7lVar instanceof i7l) {
                    Logger.k("CastBasic->%s", new Object[]{"Ignoring pull-to-local command"});
                    return rih1Var;
                }
                if (k7lVar == null) {
                    Logger.k("CastBasic->%s", new Object[]{"Route selection without a transfer command? sus"});
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                Object objE = txsVar.e(((i4f0) obj).a, lnmVar);
                return objE == d9nVar ? objE : rih1Var;
        }
    }
}
