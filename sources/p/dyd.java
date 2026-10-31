package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dyd extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lzn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dyd(lzn0 lzn0Var, byte b) {
        super(4);
        this.a = b;
        this.b = lzn0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        lzn0 lzn0Var = this.b;
        switch (b) {
            case 0:
                yxd yxdVar = (yxd) obj2;
                rxd rxdVar = (rxd) obj3;
                tqw tqwVar = (tqw) obj4;
                if (!(rxdVar instanceof rxd)) {
                    eg.o();
                    return null;
                }
                if ((yxdVar instanceof xxd) && tqwVar != null) {
                    lzn0Var.a(rxdVar.a, n3o1.y(tqwVar), (Bundle) null);
                }
                return rih1.a;
            default:
                f1p0 f1p0Var = (f1p0) obj;
                return Completable.m(new CompletableSource[]{new CompletableFromAction(new qs4(f1p0Var, lzn0Var, (tqw) obj4)), f1p0Var.e});
        }
    }
}
