package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nxs extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ txs c;
    public final /* synthetic */ j4e d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nxs(txs txsVar, j4e j4eVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = txsVar;
        this.d = j4eVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        j4e j4eVar = this.d;
        txs txsVar = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new nxs(txsVar, j4eVar, lnmVar, (byte) 0);
            default:
                return new nxs(txsVar, j4eVar, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object invokeSuspend(Object obj) throws AbortFlowException {
        byte b = this.a;
        j4e j4eVar = this.d;
        txs txsVar = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                fts ftsVar = new fts(txsVar.j.d, (byte) 2);
                eum eumVar = new eum(j4eVar, (lnm) null, (byte) 27);
                this.b = true;
                Object objJ = b5p1.j(ftsVar, eumVar, this);
                return objJ == d9nVar ? d9nVar : objJ;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                nxs nxsVar = new nxs(txsVar, j4eVar, lnmVar, (byte) 0);
                this.b = true;
                Object objO = rc2.O(5000L, nxsVar, this);
                return objO == d9nVar ? d9nVar : objO;
        }
    }
}
