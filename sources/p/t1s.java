package p;

import io.reactivex.rxjava3.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t1s implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ t1s(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
    }
}
