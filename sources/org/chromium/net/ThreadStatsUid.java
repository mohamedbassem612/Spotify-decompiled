package org.chromium.net;

import android.net.TrafficStats;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class ThreadStatsUid {
    private static final Method sClearThreadStatsUid;
    private static final Method sSetThreadStatsUid;

    static {
        try {
            sSetThreadStatsUid = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            sClearThreadStatsUid = TrafficStats.class.getMethod("clearThreadStatsUid", null);
        } catch (NoSuchMethodException | SecurityException e) {
            bhn0.o("Unable to get TrafficStats methods", e);
        }
    }

    public static void clear() {
        try {
            sClearThreadStatsUid.invoke(null, null);
        } catch (IllegalAccessException e) {
            bhn0.o("TrafficStats.clearThreadStatsUid failed", e);
        } catch (InvocationTargetException e2) {
            bhn0.o("TrafficStats.clearThreadStatsUid failed", e2);
        }
    }

    public static void set(int i) {
        try {
            sSetThreadStatsUid.invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            bhn0.o("TrafficStats.setThreadStatsUid failed", e);
        } catch (InvocationTargetException e2) {
            bhn0.o("TrafficStats.setThreadStatsUid failed", e2);
        }
    }
}
