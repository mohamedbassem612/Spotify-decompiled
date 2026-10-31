package rxdogtag2;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.functions.BiFunction;
import p.gnc1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class m implements BiFunction {
    public final /* synthetic */ byte a;
    public final /* synthetic */ RxDogTag.Configuration b;

    public /* synthetic */ m(RxDogTag.Configuration configuration, byte b) {
        this.a = b;
        this.b = configuration;
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return RxDogTag.lambda$installWithBuilder$0(this.b, (Observable) obj, (Observer) obj2);
            case 1:
                return RxDogTag.lambda$installWithBuilder$1(this.b, (Flowable) obj, (gnc1) obj2);
            case 2:
                return RxDogTag.lambda$installWithBuilder$2(this.b, (Single) obj, (SingleObserver) obj2);
            case 3:
                return RxDogTag.lambda$installWithBuilder$3(this.b, (Maybe) obj, (MaybeObserver) obj2);
            default:
                return RxDogTag.lambda$installWithBuilder$4(this.b, (Completable) obj, (CompletableObserver) obj2);
        }
    }
}
