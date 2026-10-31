package p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tra implements Consumer {
    public final /* synthetic */ esa a;

    public tra(esa esaVar) {
        this.a = esaVar;
    }

    public final void accept(Object obj) {
        yzk yzkVar = (yzk) obj;
        esa esaVar = this.a;
        Disposable disposable = esaVar.k;
        if (disposable != null) {
            disposable.dispose();
        }
        Single singleFromCallable = Single.fromCallable(new sra(esaVar, (byte) 0));
        long j = yzkVar.c;
        if (j > 0) {
            singleFromCallable = singleFromCallable.delaySubscription(j, TimeUnit.MILLISECONDS, esaVar.c);
        }
        esaVar.k = singleFromCallable.subscribe();
    }
}
