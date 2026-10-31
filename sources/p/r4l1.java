package p;

import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r4l1 implements Transport {
    public final BehaviorSubject a = BehaviorSubject.f();

    public r4l1(kly0 kly0Var) {
        sam0 sam0Var = (xm41) kly0Var.get();
        sam0 sam0Var2 = sam0Var;
        sam0Var2.e(new bkk1(this, (byte) 5), new tak1(this, (byte) 10));
    }

    public final Single a() {
        return this.a.filter(b4x0.X0).map(c4x0.Y0).take(1L).singleOrError();
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Single callSingle(String str, String str2, byte[] bArr) {
        Observable observableFlatMapObservable = a().flatMapObservable(new q4l1(str, str2, bArr, (byte) 0));
        e4x0 e4x0Var = e4x0.W0;
        BehaviorSubject behaviorSubject = this.a;
        return observableFlatMapObservable.takeUntil(behaviorSubject.skipUntil(behaviorSubject.filter(e4x0Var)).filter(f4x0.W0)).firstElement().k(Single.never());
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final Observable callStream(String str, String str2, byte[] bArr) {
        Observable observableFlatMapObservable = a().flatMapObservable(new q4l1(str, str2, bArr, (byte) 1));
        e4x0 e4x0Var = e4x0.W0;
        BehaviorSubject behaviorSubject = this.a;
        return observableFlatMapObservable.takeUntil(behaviorSubject.skipUntil(behaviorSubject.filter(e4x0Var)).filter(f4x0.W0)).concatWith(Observable.never());
    }

    @Override // com.spotify.esperanto.esperanto.Transport
    public final byte[] callSync(String str, String str2, byte[] bArr) {
        return ((Transport) a().blockingGet()).callSync(str, str2, bArr);
    }
}
