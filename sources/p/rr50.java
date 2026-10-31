package p;

import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rr50 implements Function0 {
    public final e6u a;
    public final e6u b;

    public rr50(e6u e6uVar, e6u e6uVar2) {
        this.a = e6uVar;
        this.b = e6uVar2;
    }

    public final Object invoke() {
        return ((Observable) this.a.invoke()).doOnEach(k530.Z).filter(bj20.e).flatMapCompletable(new dqu(this, (byte) 26));
    }
}
