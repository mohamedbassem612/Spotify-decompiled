package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l020 implements ObservableTransformer {
    public final /* synthetic */ jyo0 a;
    public final /* synthetic */ fu41 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ hs41 d;
    public final /* synthetic */ lv4 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ bw8 h;
    public final /* synthetic */ yqg i;

    public l020(jyo0 jyo0Var, fu41 fu41Var, long j, hs41 hs41Var, lv4 lv4Var, boolean z, boolean z2, bw8 bw8Var, yqg yqgVar) {
        this.a = jyo0Var;
        this.b = fu41Var;
        this.c = j;
        this.d = hs41Var;
        this.e = lv4Var;
        this.f = z;
        this.g = z2;
        this.h = bw8Var;
        this.i = yqgVar;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.switchMapSingle(new k020(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i));
    }
}
