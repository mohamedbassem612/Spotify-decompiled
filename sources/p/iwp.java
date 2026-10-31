package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iwp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ iwp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final jwe1 a(ruz ruzVar, muz muzVar, String str, gn10 gn10Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new jwe1(muzVar, str, ruzVar, gn10Var, (Flowable) ((nwp) ((gbp) r7qVar).c).l.get());
            case 1:
                return new jwe1(muzVar, str, ruzVar, gn10Var, (Flowable) ((thq) r7qVar).b.D5.get());
            case 2:
                return new jwe1(muzVar, str, ruzVar, gn10Var, (Flowable) r7qVar.b.D5.get());
            default:
                return new jwe1(muzVar, str, ruzVar, gn10Var, (Flowable) r7qVar.b.D5.get());
        }
    }
}
