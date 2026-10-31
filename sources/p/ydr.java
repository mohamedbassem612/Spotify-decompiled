package p;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ydr implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zdr b;
    public final /* synthetic */ slc0 c;
    public final /* synthetic */ int d;

    public /* synthetic */ ydr(zdr zdrVar, slc0 slc0Var, int i, byte b) {
        this.a = b;
        this.b = zdrVar;
        this.c = slc0Var;
        this.d = i;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                int i = this.d;
                return new CompletableFromAction(new xdr(this.b, this.c, (String) obj, i, (byte) 0));
            default:
                int i2 = this.d;
                return new CompletableFromAction(new xdr(this.b, this.c, (String) obj, i2, (byte) 1));
        }
    }
}
