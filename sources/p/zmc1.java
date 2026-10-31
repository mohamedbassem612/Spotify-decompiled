package p;

import io.reactivex.rxjava3.core.Observable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zmc1 implements Function0 {
    public final e6u a;
    public final nfb0 b;

    public zmc1(e6u e6uVar, nfb0 nfb0Var) {
        this.a = e6uVar;
        this.b = nfb0Var;
    }

    public final Object invoke() {
        return ((Observable) this.a.invoke()).doOnError(iqa1.X).onErrorComplete().doOnNext(new z2a1(this, (byte) 10)).ignoreElements();
    }
}
