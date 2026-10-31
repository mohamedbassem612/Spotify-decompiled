package p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class zpq0 implements k2t, ObservableOnSubscribe, Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zpq0(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public Object apply(Object obj) {
        String str = (String) this.a;
        String str2 = (String) this.b;
        String str3 = (String) ((Map) obj).get(str);
        return str3 == null ? str2 : str3;
    }

    @Override // p.k2t
    public void b(lly0 lly0Var) {
        k2t k2tVar = (k2t) this.a;
        k2t k2tVar2 = (k2t) this.b;
        k2tVar.b(lly0Var);
        k2tVar2.b(lly0Var);
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        o8n o8nVar = (o8n) this.a;
        mr20 mr20Var = (mr20) this.b;
        bhh1 bhh1Var = igu.b;
        bhh1Var.getClass();
        observableEmitter.setCancellable(new v141(c921.x(ilo1.B(bhh1Var, o8nVar), 3, new m311(mr20Var, observableEmitter, (lnm) null, (byte) 29))));
    }
}
