package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b2x0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q8n b;
    public final /* synthetic */ bfd c;

    public /* synthetic */ b2x0(q8n q8nVar, bfd bfdVar, byte b) {
        this.a = b;
        this.b = q8nVar;
        this.c = bfdVar;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        q8n q8nVar = this.b;
        switch (b) {
            case 0:
                return rqt0.F(q8nVar, new glu0(this.c, (r1x0) obj, (lnm) null, (byte) 13)).toObservable();
            default:
                i4x0 i4x0Var = (i4x0) obj;
                return rqt0.F(q8nVar, new pew0(this.c, i4x0Var, false, (lnm) null, (byte) 9)).doOnError(new lyw0(i4x0Var, (byte) 2)).onErrorReturnItem(new y5x0(false, null)).toObservable();
        }
    }
}
