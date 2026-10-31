package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e11 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u11 b;

    public /* synthetic */ e11(u11 u11Var, byte b) {
        this.a = b;
        this.b = u11Var;
    }

    public final Object apply(Object obj) {
        ig8 ig8Var;
        byte b = this.a;
        u11 u11Var = this.b;
        switch (b) {
            case 0:
                v2f0 v2f0Var = ((cxe0) obj).a;
                if (v2f0Var instanceof v2f0) {
                    ig8Var = new ig8(v2f0Var.a);
                } else {
                    ig8Var = v2f0Var instanceof w2f0 ? new ig8(((w2f0) v2f0Var).a) : null;
                }
                if (ig8Var != null) {
                    Single singleOnErrorReturn = u11Var.d.b(new gh8(ig8Var, new hh8(u11Var.h.a()), (yi01) null, u11Var.k.b())).map(ios.c).onErrorReturn(fmv.c);
                    singleOnErrorReturn.getClass();
                    return singleOnErrorReturn;
                }
                Single singleJust = Single.just(new g8o0(new IllegalStateException("Unsupported login type for re-authentication"), (bk8) null));
                singleJust.getClass();
                return singleJust;
            default:
                return new CompletableFromAction(new bm0(u11Var, (ni8) obj, (byte) 6)).d(u11Var.i.c.map(uml1.c)).onErrorReturn(pbo1.c);
        }
    }
}
