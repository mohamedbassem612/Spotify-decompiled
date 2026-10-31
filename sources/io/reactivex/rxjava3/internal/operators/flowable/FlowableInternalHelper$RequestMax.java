package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.functions.Consumer;
import p.pnc1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class FlowableInternalHelper$RequestMax implements Consumer<pnc1> {
    public static final FlowableInternalHelper$RequestMax a;
    public static final /* synthetic */ FlowableInternalHelper$RequestMax[] b;

    static {
        FlowableInternalHelper$RequestMax flowableInternalHelper$RequestMax = new FlowableInternalHelper$RequestMax("INSTANCE", 0);
        a = flowableInternalHelper$RequestMax;
        b = new FlowableInternalHelper$RequestMax[]{flowableInternalHelper$RequestMax};
    }

    public static FlowableInternalHelper$RequestMax valueOf(String str) {
        return (FlowableInternalHelper$RequestMax) Enum.valueOf(FlowableInternalHelper$RequestMax.class, str);
    }

    public static FlowableInternalHelper$RequestMax[] values() {
        return (FlowableInternalHelper$RequestMax[]) b.clone();
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        ((pnc1) obj).request(Long.MAX_VALUE);
    }
}
