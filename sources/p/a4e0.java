package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a4e0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final ytp0 b;
    public final v75 c;
    public final q8n d;

    public /* synthetic */ a4e0(ytp0 ytp0Var, v75 v75Var, q8n q8nVar, byte b) {
        this.a = b;
        this.b = ytp0Var;
        this.c = v75Var;
        this.d = q8nVar;
    }

    public final ObservableSource apply(Observable observable) {
        switch (this.a) {
            case 0:
                return observable.switchMapSingle(new hod0(this, (byte) 3));
            default:
                return observable.switchMapSingle(new z8c0(this, (byte) 7));
        }
    }
}
