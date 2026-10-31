package p;

import android.net.Uri;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ghf1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hhf1 b;

    public /* synthetic */ ghf1(hhf1 hhf1Var, byte b) {
        this.a = b;
        this.b = hhf1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        hhf1 hhf1Var = this.b;
        switch (b) {
            case 0:
                hhf1Var.d.onNext(new khf1((Uri) obj));
                break;
            default:
                hhf1Var.d.onNext(new khf1(ihf1.a));
                break;
        }
    }
}
