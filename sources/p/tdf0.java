package p;

import com.google.protobuf.Empty;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableScanSeed;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tdf0 {
    public final FlowableRefCount a;

    public tdf0(wz3 wz3Var) {
        Flowable flowable = wz3Var.callStream("spotify.analyzer_esperanto.proto.AnalyzerService", "SubLoudness", Empty.n()).map(s9w.g).toFlowable(BackpressureStrategy.b);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yz10 yz10Var = yz10.Y;
        flowable.getClass();
        this.a = new FlowableRefCount(new FlowableScanSeed(flowable, Functions.h(linkedHashMap), yz10Var).Q());
    }
}
