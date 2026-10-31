package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bp91 implements SingleTransformer, Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ip91 b;
    public final /* synthetic */ String c;

    public /* synthetic */ bp91(byte b, String str, ip91 ip91Var) {
        this.a = b;
        this.b = ip91Var;
        this.c = str;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        ip91 ip91Var = this.b;
        switch (b) {
            case 1:
                return ip91Var.g(this.c, (String) obj).map(vbx0.O0);
            default:
                String str = (String) obj;
                hn91 hn91Var = ip91Var.f;
                return new MaybeToSingle(cwl1.e0(hn91Var.c, new uk71((Object) hn91Var, (Object) str, (Object) this.c, (lnm) null, (byte) 17)).f(a4x0.N0), z6x.a).map(b4x0.N0).flatMap(new ap91(str, ip91Var));
        }
    }

    public Single c(Single single) {
        return single.flatMap(new ap91((byte) 0, this.c, this.b));
    }
}
