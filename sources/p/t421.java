package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t421 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q8n b;
    public final /* synthetic */ byp0 c;
    public final /* synthetic */ xrc0 d;

    public /* synthetic */ t421(q8n q8nVar, byp0 byp0Var, xrc0 xrc0Var, byte b) {
        this.a = b;
        this.b = q8nVar;
        this.c = byp0Var;
        this.d = xrc0Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        q8n q8nVar = this.b;
        switch (b) {
            case 0:
                return rqt0.F(q8nVar, new ciw0(this.c, (String) obj, this.d, false, (lnm) null, (byte) 11)).onErrorComplete().n();
            default:
                return Observable.fromIterable(((q421) obj).a).flatMap(new t421(q8nVar, this.c, this.d, (byte) 0));
        }
    }
}
