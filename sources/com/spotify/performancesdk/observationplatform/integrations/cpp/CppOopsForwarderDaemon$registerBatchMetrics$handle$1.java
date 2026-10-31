package com.spotify.performancesdk.observationplatform.integrations.cpp;

import kotlin.Metadata;
import p.hab0;
import p.iu30;
import p.rih1;
import p.t311;
import p.uga;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp/uga;", "platformObserver", "Lp/rih1;", "invoke", "(Lp/uga;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class CppOopsForwarderDaemon$registerBatchMetrics$handle$1 extends hab0 implements iu30 {
    final /* synthetic */ long $callbackPtr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CppOopsForwarderDaemon$registerBatchMetrics$handle$1(long j) {
        super(1);
        this.$callbackPtr = j;
    }

    public final void invoke(final uga ugaVar) {
        OopsBridge.nativeBatchCallback(this.$callbackPtr, new OopsCppBatchObserver() { // from class: com.spotify.performancesdk.observationplatform.integrations.cpp.CppOopsForwarderDaemon$registerBatchMetrics$handle$1$adapter$1
            @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsCppBatchObserver
            public void observe(String key, double value) {
                ((t311) ugaVar).a(key, value);
            }
        });
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((uga) obj);
        return rih1.a;
    }
}
