package p;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iu20 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p811 b;

    public /* synthetic */ iu20(p811 p811Var, byte b) {
        this.a = b;
        this.b = p811Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    public final Object emit(Object obj, lnm lnmVar) throws AbortFlowException {
        byte b = this.a;
        p811 p811Var = this.b;
        switch (b) {
            case 0:
                p811Var.a = obj;
                throw new AbortFlowException(this);
            case 1:
                p811Var.a = obj;
                throw new AbortFlowException(this);
            default:
                p811Var.a = obj;
                return rih1.a;
        }
    }
}
