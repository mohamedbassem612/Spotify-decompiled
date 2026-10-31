package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class weu0 implements FlowableTransformer {
    public static final weu0 a = new weu0();

    @Override // io.reactivex.rxjava3.core.FlowableTransformer
    public final moy0 a(Flowable flowable) {
        return flowable.J(y580.o1).t(Functions.a);
    }
}
