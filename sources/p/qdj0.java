package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qdj0 implements ObservableTransformer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ kcs c;

    public /* synthetic */ qdj0(Set set, kcs kcsVar, byte b) {
        this.a = b;
        this.b = set;
        this.c = kcsVar;
    }

    public final ObservableSource apply(Observable observable) {
        byte b = this.a;
        kcs kcsVar = this.c;
        Set set = this.b;
        switch (b) {
            case 0:
                return observable.concatMap(new j2e0(set, kcsVar, (byte) 26));
            default:
                return observable.concatMap(new fad0(set, kcsVar, (byte) 28));
        }
    }
}
