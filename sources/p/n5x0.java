package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n5x0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q8n b;
    public final /* synthetic */ j0a1 c;

    public /* synthetic */ n5x0(q8n q8nVar, j0a1 j0a1Var, byte b) {
        this.a = b;
        this.b = q8nVar;
        this.c = j0a1Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        q8n q8nVar = this.b;
        switch (b) {
            case 0:
                l4x0 l4x0Var = (l4x0) obj;
                return rqt0.F(q8nVar, new pew0(l4x0Var, this.c, false, (lnm) null, (byte) 10)).cast(q6x0.class).onErrorReturnItem(new j6x0(l4x0Var.e, 3, null)).toObservable();
            default:
                return rqt0.F(q8nVar, new pew0(this.c, (n8x0) obj, false, (lnm) null, (byte) 13)).ignoreElement().w().onErrorResumeNext(m9x0.b);
        }
    }
}
