package p;

import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o211 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cr6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o211(cr6 cr6Var, byte b) {
        super(1);
        this.a = b;
        this.b = cr6Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cr6 cr6Var = this.b;
        switch (b) {
            case 0:
                return new CompletableFromAction(new n211(cr6Var, (byte) 0));
            default:
                return new CompletableFromAction(new n211(cr6Var, (byte) 1));
        }
    }
}
