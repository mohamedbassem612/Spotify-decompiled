package com.spotify.performance.coldstartupmusicintegration;

import com.spotify.base.java.logging.Logger;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import p.c510;
import p.i94;
import p.jxg;
import p.k4p1;
import p.l1d;
import p.lxg;
import p.nod;
import p.o7h;
import p.pne1;
import p.s45;
import p.t45;
import p.u890;
import p.zle1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010%R\"\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020'0&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/spotify/performance/coldstartupmusicintegration/ColdStartupCppForwarder;", "Lp/jxg;", "<init>", "()V", "Lp/pne1;", "sampleTimeMeasurements", "(Lp/pne1;)Lp/pne1;", "", "name", "", "timestamp", "duration", c510.c, "Lp/rih1;", "logCoreTimeKeeperPoint", "(Ljava/lang/String;JJLjava/lang/String;)V", "key", "value", "logColdStartupMetadata", "(Ljava/lang/String;Ljava/lang/String;)V", "logMainPoint", "(Ljava/lang/String;JJ)V", "logBuilderPoint", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "Lp/zle1;", "timeKeeper", "Lp/lxg;", "coldStartupTimeKeeper", "installTimeKeeper", "(Lp/zle1;Lp/lxg;)V", "outcome", "onColdStartupCompleted", "(Ljava/lang/String;)V", "Lp/lxg;", "Lp/zle1;", "", "MAX_FEATURE_BUILDERS_COUNT", "I", "Ljava/util/concurrent/ConcurrentHashMap;", "Lp/t45;", "builders", "Ljava/util/concurrent/ConcurrentHashMap;", "src_main_java_com_spotify_performance_coldstartupmusicintegration-coldstartupmusicintegration"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class ColdStartupCppForwarder implements jxg {
    private static final int MAX_FEATURE_BUILDERS_COUNT = 50;
    private static lxg coldStartupTimeKeeper;
    private static zle1 timeKeeper;
    public static final ColdStartupCppForwarder INSTANCE = new ColdStartupCppForwarder();
    private static ConcurrentHashMap<String, t45> builders = new ConcurrentHashMap<>();

    private ColdStartupCppForwarder() {
    }

    private final void logBuilderPoint(String category, String name, long timestamp, long duration) {
        zle1 zle1Var = timeKeeper;
        if (zle1Var != null) {
            ConcurrentHashMap<String, t45> concurrentHashMap = builders;
            t45 t45Var = concurrentHashMap.get(category);
            if (t45Var == null) {
                t45 t45VarA = ((s45) zle1Var).a(category);
                t45 t45VarPutIfAbsent = concurrentHashMap.putIfAbsent(category, t45VarA);
                t45Var = t45VarPutIfAbsent == null ? t45VarA : t45VarPutIfAbsent;
            }
            t45.c(t45Var, name, timestamp, duration, 24);
        }
    }

    public static final void logColdStartupMetadata(String key, String value) {
        t45 t45Var;
        lxg lxgVar = coldStartupTimeKeeper;
        if (lxgVar == null || (t45Var = ((i94) lxgVar).e) == null) {
            return;
        }
        t45Var.b(key, value);
    }

    public static final void logCoreTimeKeeperPoint(String name, long timestamp, long duration, String category) {
        if (category.equals("cold_startup")) {
            INSTANCE.logMainPoint(name, timestamp, duration);
        } else {
            INSTANCE.logBuilderPoint(category, name, timestamp, duration);
        }
    }

    private final void logMainPoint(String name, long timestamp, long duration) {
        lxg lxgVar = coldStartupTimeKeeper;
        if (lxgVar == null) {
            Logger.e(new IllegalStateException("Cold Startup Time Keeper Not initialized"), l1d.m("Unable to add measurement point ", name), new Object[0]);
            return;
        }
        t45 t45Var = ((i94) lxgVar).e;
        if (t45Var != null) {
            Long lValueOf = Long.valueOf(timestamp);
            Long lValueOf2 = Long.valueOf(duration);
            if (t45Var.i == null) {
                t45Var.i = lValueOf;
            }
            t45Var.m.add(new nod(name, null, lValueOf, lValueOf2));
        }
    }

    private final pne1 sampleTimeMeasurements(pne1 pne1Var) {
        return pne1.a(pne1Var, o7h.p1(o7h.d1(k4p1.C(pne1Var.e), 50)), null, 495);
    }

    public final void installTimeKeeper(zle1 timeKeeper2, lxg coldStartupTimeKeeper2) {
        timeKeeper = timeKeeper2;
        coldStartupTimeKeeper = coldStartupTimeKeeper2;
        ((i94) coldStartupTimeKeeper2).d(this);
    }

    @Override // p.jxg
    public void onColdStartupCompleted(String outcome) {
        Iterator<Map.Entry<String, t45>> it = builders.entrySet().iterator();
        while (it.hasNext()) {
            t45 value = it.next().getValue();
            pne1 pne1VarE = value.e();
            if (u890.j(value.a, "core_feature_builders")) {
                pne1VarE = INSTANCE.sampleTimeMeasurements(pne1VarE);
            }
            zle1 zle1Var = timeKeeper;
            if (zle1Var != null) {
                ((s45) zle1Var).b(pne1VarE);
            }
        }
        builders.clear();
    }
}
