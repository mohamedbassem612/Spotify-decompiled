package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class c2x0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q8n b;
    public final /* synthetic */ bfd c;

    public /* synthetic */ c2x0(q8n q8nVar, bfd bfdVar, byte b) {
        this.a = b;
        this.b = q8nVar;
        this.c = bfdVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        bfd bfdVar = this.c;
        q8n q8nVar = this.b;
        switch (b) {
            case 0:
                return observable.switchMap(new b2x0(q8nVar, bfdVar, (byte) 0));
            default:
                return observable.flatMap(new b2x0(q8nVar, bfdVar, (byte) 1));
        }
    }
}
