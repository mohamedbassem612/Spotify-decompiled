package p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vlb extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Disposable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vlb(Disposable disposable, byte b) {
        super(1);
        this.a = b;
        this.b = disposable;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Disposable disposable = this.b;
        switch (b) {
            case 0:
                disposable.dispose();
                break;
            case 1:
                disposable.dispose();
                break;
            case 2:
                disposable.dispose();
                break;
            case 3:
                disposable.dispose();
                break;
            default:
                disposable.dispose();
                break;
        }
        return rih1Var;
    }
}
