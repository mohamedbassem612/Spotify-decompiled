package p;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uec1 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p811 b;

    public /* synthetic */ uec1(p811 p811Var, byte b) {
        this.a = b;
        this.b = p811Var;
    }

    public final void run() {
        byte b = this.a;
        p811 p811Var = this.b;
        switch (b) {
            case 0:
                Disposable disposable = (Disposable) p811Var.a;
                if (disposable != null) {
                    disposable.dispose();
                }
                break;
            case 1:
                Disposable disposable2 = (Disposable) p811Var.a;
                if (disposable2 != null) {
                    disposable2.dispose();
                }
                break;
            default:
                Disposable disposable3 = (Disposable) p811Var.a;
                if (disposable3 != null) {
                    disposable3.dispose();
                }
                break;
        }
    }
}
