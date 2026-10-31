package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q5x0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q8n b;
    public final /* synthetic */ j0a1 c;

    public /* synthetic */ q5x0(q8n q8nVar, j0a1 j0a1Var, byte b) {
        this.a = b;
        this.b = q8nVar;
        this.c = j0a1Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        q8n q8nVar = this.b;
        switch (b) {
            case 0:
                return rqt0.F(q8nVar, new pew0(this.c, (u4x0) obj, false, (lnm) null, (byte) 11)).ignoreElement().w().onErrorResumeNext(p5x0.b);
            default:
                return rqt0.F(q8nVar, new pew0(this.c, (m8x0) obj, false, (lnm) null, (byte) 12)).ignoreElement().w().onErrorResumeNext(l9x0.b);
        }
    }
}
