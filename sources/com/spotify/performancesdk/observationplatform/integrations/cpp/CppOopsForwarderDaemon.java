package com.spotify.performancesdk.observationplatform.integrations.cpp;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import p.ax4;
import p.dwo;
import p.hhp0;
import p.ihp0;
import p.kj41;
import p.nif1;
import p.npj0;
import p.q7h;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\u0015J\u0019\u0010$\u001a\u0004\u0018\u00010\u00192\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J!\u00103\u001a\u0004\u0018\u0001022\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"H\u0016¢\u0006\u0004\b3\u00104J!\u00106\u001a\u0004\u0018\u0001052\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"H\u0016¢\u0006\u0004\b6\u00107J)\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b;\u0010<J)\u0010>\u001a\u0004\u0018\u00010=2\u0006\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\"2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b>\u0010?J'\u0010D\u001a\u0004\u0018\u00010C2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00072\u0006\u0010B\u001a\u000208H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\f2\u0006\u00100\u001a\u00020\"H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\fH\u0016¢\u0006\u0004\bH\u0010IR\"\u0010K\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR \u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020W0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010VR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020Y0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010V¨\u0006["}, d2 = {"Lcom/spotify/performancesdk/observationplatform/integrations/cpp/CppOopsForwarderDaemon;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsBridgeDelegate;", "Lp/dwo;", "Lp/ax4;", "perfTrackingProperties", "<init>", "(Lp/ax4;)V", "", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsSpan;", "spans", "Lp/nif1;", "trace", "Lp/rih1;", "applySpans", "(Ljava/util/List;Lp/nif1;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;", "traceDidStart", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;)V", "Ljava/util/UUID;", "traceId", "traceDidCancel", "(Ljava/util/UUID;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedTrace;", "traceDidStop", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedTrace;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedObservationView;", "scenario", "scenarioDidStart", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedObservationView;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedObservationView;", "scenarioDidStop", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsEndedObservationView;)V", "scenarioViewId", "scenarioDidCancel", "", "yieldKey", "claimYieldedScenario", "(Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedObservationView;", "claimYieldedTrace", "(Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsStartedTrace;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedTrace;", "yieldedTrace", "traceDidYield", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedTrace;)V", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedObservationView;", "yieldedScenario", "scenarioDidYield", "(Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsYieldedObservationView;)V", "key", "unit", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppCounter;", "createCounter", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppCounter;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppGauge;", "createGauge", "(Ljava/lang/String;Ljava/lang/String;)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppGauge;", "", "pollPtr", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableGauge;", "createObservableGauge", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableGauge;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableCounter;", "createObservableCounter", "(Ljava/lang/String;Ljava/lang/String;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppObservableCounter;", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppMetricDefinition;", "metrics", "callbackPtr", "Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppBatchObservableInstrument;", "registerBatchMetrics", "(Ljava/util/List;J)Lcom/spotify/performancesdk/observationplatform/integrations/cpp/OopsCppBatchObservableInstrument;", "unregisterObservableMetric", "(Ljava/lang/String;)V", "shutdown", "()V", "Lp/ihp0;", "observationPlatform", "Lp/ihp0;", "getObservationPlatform$src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp_cpp_oops_forwarder", "()Lp/ihp0;", "setObservationPlatform$src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp_cpp_oops_forwarder", "(Lp/ihp0;)V", "", "metricsEnabled", "Z", "Ljava/util/concurrent/ConcurrentHashMap;", "ongoingTraces", "Ljava/util/concurrent/ConcurrentHashMap;", "Lp/kj41;", "ongoingScenarios", "", "observableHandles", "src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp-cpp_oops_forwarder"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class CppOopsForwarderDaemon implements OopsBridgeDelegate, dwo {
    private final boolean metricsEnabled;
    private final ConcurrentHashMap<String, Object> observableHandles;
    private final ConcurrentHashMap<UUID, kj41> ongoingScenarios;
    private ihp0 observationPlatform = hhp0.a;
    private final ConcurrentHashMap<UUID, nif1> ongoingTraces = new ConcurrentHashMap<>();

    public CppOopsForwarderDaemon(ax4 ax4Var) {
        this.metricsEnabled = ax4Var.i();
        OopsBridge.INSTANCE.setDelegate(this);
        this.ongoingScenarios = new ConcurrentHashMap<>();
        this.observableHandles = new ConcurrentHashMap<>();
    }

    private final void applySpans(List<OopsSpan> spans, nif1 trace) {
        for (OopsSpan oopsSpan : spans) {
            trace.d(oopsSpan.getStartTimestampNanos() / 1000, oopsSpan.getEndTimestampNanos() / 1000, oopsSpan.getKey());
        }
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsStartedObservationView claimYieldedScenario(String yieldKey) {
        kj41 kj41VarH = this.observationPlatform.h(yieldKey);
        if (kj41VarH == null) {
            return null;
        }
        this.ongoingScenarios.put(kj41VarH.getId(), kj41VarH);
        return new OopsStartedObservationView(kj41VarH.getId(), kj41VarH.getKey(), kj41VarH.b() * 1000);
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsStartedTrace claimYieldedTrace(String yieldKey) {
        nif1 nif1VarM = this.observationPlatform.m(yieldKey);
        if (nif1VarM == null) {
            return null;
        }
        this.ongoingTraces.put(nif1VarM.getId(), nif1VarM);
        return new OopsStartedTrace(nif1VarM.getId(), nif1VarM.getKey(), nif1VarM.b() * 1000);
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsCppCounter createCounter(String key, String unit) {
        if (this.metricsEnabled) {
            return new createCounter.1(this.observationPlatform.e(key, CppOopsForwarderDaemonKt.access$parseUnit(unit)));
        }
        return null;
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsCppGauge createGauge(String key, String unit) {
        if (this.metricsEnabled) {
            return new createGauge.1(this.observationPlatform.q(key, CppOopsForwarderDaemonKt.access$parseUnit(unit)));
        }
        return null;
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsCppObservableCounter createObservableCounter(String key, String unit, long pollPtr) {
        if (!this.metricsEnabled) {
            return null;
        }
        this.observableHandles.put(key, this.observationPlatform.r(key, CppOopsForwarderDaemonKt.access$parseUnit(unit), new createObservableCounter.handle.1(pollPtr)));
        return new createObservableCounter.1();
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsCppObservableGauge createObservableGauge(String key, String unit, long pollPtr) {
        if (!this.metricsEnabled) {
            return null;
        }
        this.observableHandles.put(key, this.observationPlatform.r(key, CppOopsForwarderDaemonKt.access$parseUnit(unit), new createObservableGauge.handle.1(pollPtr)));
        return new createObservableGauge.1();
    }

    /* JADX INFO: renamed from: getObservationPlatform$src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp_cpp_oops_forwarder, reason: from getter */
    public final ihp0 getObservationPlatform() {
        return this.observationPlatform;
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public OopsCppBatchObservableInstrument registerBatchMetrics(List<OopsCppMetricDefinition> metrics, long callbackPtr) {
        if (!this.metricsEnabled) {
            return null;
        }
        List<OopsCppMetricDefinition> list = metrics;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (OopsCppMetricDefinition oopsCppMetricDefinition : list) {
            arrayList.add(new npj0(oopsCppMetricDefinition.getKey(), CppOopsForwarderDaemonKt.access$parseInstrument(oopsCppMetricDefinition.getInstrument()), CppOopsForwarderDaemonKt.access$parseUnit(oopsCppMetricDefinition.getUnit())));
        }
        return new registerBatchMetrics.1(this.observationPlatform.j(arrayList, new registerBatchMetrics.handle.1(callbackPtr)));
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void scenarioDidCancel(UUID scenarioViewId) {
        scenarioViewId.toString();
        kj41 kj41VarRemove = this.ongoingScenarios.remove(scenarioViewId);
        if (kj41VarRemove == null) {
            return;
        }
        kj41VarRemove.cancel();
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void scenarioDidStart(OopsStartedObservationView scenario) {
        scenario.getKey();
        kj41 kj41VarF = this.observationPlatform.f(scenario.getKey(), scenario.getViewId());
        kj41VarF.d(scenario.getStartTimestampNanos() / 1000);
        this.ongoingScenarios.put(scenario.getViewId(), kj41VarF);
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void scenarioDidStop(OopsEndedObservationView scenario) {
        scenario.getKey();
        kj41 kj41VarRemove = this.ongoingScenarios.remove(scenario.getViewId());
        if (kj41VarRemove == null) {
            return;
        }
        kj41VarRemove.c(scenario.getAttributes()).d(scenario.getStartTimestampNanos() / 1000);
        kj41VarRemove.a(scenario.getEndTimestampNanos() / 1000);
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void scenarioDidYield(OopsYieldedObservationView yieldedScenario) {
        kj41 kj41VarRemove = this.ongoingScenarios.remove(yieldedScenario.getViewId());
        if (kj41VarRemove == null) {
            return;
        }
        kj41VarRemove.c(yieldedScenario.getAttributes());
        this.observationPlatform.b(kj41VarRemove, yieldedScenario.getYieldKey());
    }

    public final void setObservationPlatform$src_main_java_com_spotify_performancesdk_observationplatform_integrations_cpp_cpp_oops_forwarder(ihp0 ihp0Var) {
        this.observationPlatform = ihp0Var;
    }

    @Override // p.dwo
    public void shutdown() {
        Iterator<String> it = this.observableHandles.keySet().iterator();
        while (it.hasNext()) {
            this.observationPlatform.unregisterObservableMetric(it.next());
        }
        this.observableHandles.clear();
        OopsBridge.INSTANCE.setDelegate(null);
        this.ongoingTraces.clear();
        this.ongoingScenarios.clear();
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void traceDidCancel(UUID traceId) {
        this.ongoingTraces.remove(traceId);
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void traceDidStart(OopsStartedTrace trace) {
        this.ongoingTraces.put(trace.getTraceId(), this.observationPlatform.k(trace.getKey(), trace.getTraceId(), Long.valueOf(trace.getStartTimestampNanos() / 1000)));
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void traceDidStop(OopsEndedTrace trace) {
        nif1 nif1VarRemove = this.ongoingTraces.remove(trace.getTraceId());
        if (nif1VarRemove == null) {
            return;
        }
        for (Map.Entry entry : trace.getAttributes().entrySet()) {
            nif1VarRemove.setAttribute((String) entry.getKey(), (String) entry.getValue());
        }
        applySpans(trace.getSpans(), nif1VarRemove);
        nif1VarRemove.stop();
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void traceDidYield(OopsYieldedTrace yieldedTrace) {
        nif1 nif1VarRemove = this.ongoingTraces.remove(yieldedTrace.getTraceId());
        if (nif1VarRemove == null) {
            return;
        }
        for (Map.Entry entry : yieldedTrace.getAttributes().entrySet()) {
            nif1VarRemove.setAttribute((String) entry.getKey(), (String) entry.getValue());
        }
        applySpans(yieldedTrace.getSpans(), nif1VarRemove);
        this.observationPlatform.c(nif1VarRemove, yieldedTrace.getYieldKey());
    }

    @Override // com.spotify.performancesdk.observationplatform.integrations.cpp.OopsBridgeDelegate
    public void unregisterObservableMetric(String key) {
        if (this.metricsEnabled) {
            this.observableHandles.remove(key);
            this.observationPlatform.unregisterObservableMetric(key);
        }
    }
}
