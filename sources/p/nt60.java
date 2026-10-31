package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nt60 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k9r b;
    public final /* synthetic */ n381 c;
    public final /* synthetic */ nfa0 d;

    public nt60(xgc xgcVar, k9r k9rVar, n381 n381Var, nfa0 nfa0Var) {
        this.a = (byte) 1;
        this.b = k9rVar;
        this.c = n381Var;
        this.d = nfa0Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        k9r k9rVar = this.b;
        n381 n381Var = this.c;
        nfa0 nfa0Var = this.d;
        switch (b) {
            case 0:
                at60 at60Var = (at60) obj;
                String string = UUID.randomUUID().toString();
                String str = at60Var.d;
                wea0 wea0Var = at60Var.e;
                return rca.z((rca) n381Var.b, new n47(str, wea0Var.a, at60Var.c.name(), string), (fq21) null, 2, (Object) null).compose(new iir((Object) k9rVar, (Object) new wu60(at60Var.d, wea0Var, at60Var.g, at60Var.f ? 2 : 1, string), (byte) 9)).map(new wb00(nfa0Var, (byte) 16)).onErrorReturn(sl10.i).toObservable();
            case 1:
                bt60 bt60Var = (bt60) obj;
                String string2 = UUID.randomUUID().toString();
                return rqt0.F(o6x.a, new f530(this.c, bt60Var, string2, (lnm) null, (byte) 18)).compose(new b8p1(this.b, bt60Var.b, bt60Var.c, string2, (byte) 6)).map(new bm00(nfa0Var, (byte) 15)).onErrorReturn(as10.f);
            case 2:
                dt60 dt60Var = (dt60) obj;
                return rca.r((rca) n381Var.b, (fq21) null, 1, (Object) null).compose(new k9r(dt60Var.b, k9rVar, dt60Var.c, (byte) 23)).map(new dqu((Object) nfa0Var, (byte) 28)).onErrorReturn(ws10.f).toObservable();
            default:
                et60 et60Var = (et60) obj;
                return rca.I((rca) n381Var.b, new wj11(et60Var.b), (fq21) null, 2, (Object) null).compose(new b8p1(et60Var.c, this.b, 2, et60Var.d, (byte) 7)).map(new vx40(et60Var, nfa0Var, (byte) 12)).onErrorReturn(new laz(et60Var, (byte) 19)).toObservable();
        }
    }

    public nt60(xgc xgcVar, n381 n381Var, k9r k9rVar, nfa0 nfa0Var) {
        this.a = (byte) 0;
        this.c = n381Var;
        this.b = k9rVar;
        this.d = nfa0Var;
    }

    public /* synthetic */ nt60(n381 n381Var, k9r k9rVar, nfa0 nfa0Var, byte b) {
        this.a = b;
        this.c = n381Var;
        this.b = k9rVar;
        this.d = nfa0Var;
    }
}
