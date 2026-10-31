package p;

import android.os.Build;
import android.os.Process;
import android.os.Trace;
import j$.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetExceptionImpl;
import org.chromium.net.impl.ImplVersion;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f9a0 {
    public final a4j1 a;
    public final Executor b;
    public final Executor c;
    public final /* synthetic */ i9a0 d;

    public f9a0(i9a0 i9a0Var, UrlRequest.Callback callback, Executor executor) {
        this.d = i9a0Var;
        this.a = new a4j1(callback);
        if (i9a0Var.h) {
            this.b = executor;
            this.c = null;
        } else {
            this.b = new g960(executor, (byte) 3);
            this.c = executor;
        }
    }

    public final z7o a() {
        Map asMap;
        String str;
        int i;
        long length;
        long length2;
        long j;
        int i2;
        i9a0 i9a0Var = this.d;
        v3i1 v3i1Var = i9a0Var.o;
        if (v3i1Var != null) {
            asMap = v3i1Var.g.getAsMap();
            v3i1 v3i1Var2 = i9a0Var.o;
            str = v3i1Var2.d;
            i = v3i1Var2.b;
        } else {
            asMap = Collections.EMPTY_MAP;
            str = "";
            i = 0;
        }
        String str2 = str;
        TreeMap treeMap = i9a0Var.d;
        if (treeMap == null) {
            length = 0;
        } else {
            length = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                String str3 = (String) entry.getKey();
                if (str3 != null) {
                    length += (long) str3.length();
                }
                String str4 = (String) entry.getValue();
                if (str4 != null) {
                    length += (long) str4.length();
                }
            }
        }
        if (asMap == null) {
            length2 = 0;
        } else {
            length2 = 0;
            for (Map.Entry entry2 : asMap.entrySet()) {
                String str5 = (String) entry2.getKey();
                if (str5 != null) {
                    length2 += (long) str5.length();
                }
                if (entry2.getValue() != null) {
                    for (String str6 : (List) entry2.getValue()) {
                        if (str6 != null) {
                            length2 += (long) str6.length();
                        }
                    }
                }
            }
        }
        if (asMap.containsKey("Content-Length")) {
            try {
                j = Long.parseLong((String) ((List) asMap.get("Content-Length")).get(0));
            } catch (NumberFormatException unused) {
                j = 0;
            }
        } else {
            j = -1;
        }
        Duration durationOfSeconds = Duration.ofSeconds(0L);
        Duration durationOfSeconds2 = Duration.ofSeconds(0L);
        int i3 = i9a0Var.f.get();
        if (i3 == 6) {
            i2 = 2;
        } else if (i3 == 7) {
            i2 = 1;
        } else {
            if (i3 != 8) {
                eg.m(gvg.e(i3, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                return null;
            }
            i2 = 3;
        }
        int i4 = i2;
        int i5 = i9a0Var.x;
        int i6 = i9a0Var.w;
        g9a0 g9a0Var = i9a0Var.r;
        return new z7o(length, -1L, length2, j, i, durationOfSeconds, durationOfSeconds2, str2, i4, i5, i6, g9a0Var != null ? ((w8a0) g9a0Var).h : 0, i9a0Var.y, Process.myUid(), ImplVersion.getCronetVersion());
    }

    public final void b(j9a0 j9a0Var, String str) {
        i9a0 i9a0Var = this.d;
        try {
            c(new z8a0(i9a0Var, j9a0Var, (byte) 1), str);
        } catch (RejectedExecutionException e) {
            i9a0Var.b(new CronetExceptionImpl("Exception posting task to executor", e));
        }
    }

    public final void c(Runnable runnable, String str) {
        eo41.a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor ".concat(str));
        try {
            this.b.execute(new d9a0(str, runnable, (byte) 1));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        this.d.c(new gv40(this, (byte) 7), "maybeReportMetrics");
    }
}
