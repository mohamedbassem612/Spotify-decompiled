package com.spotify.crashreporting.anrwatchdog.anrwatchdogruntime;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import p.bh;
import p.dwo;
import p.fge1;
import p.fn31;
import p.hge1;
import p.iu30;
import p.kly0;
import p.lg5;
import p.llm;
import p.lnm;
import p.m1d;
import p.n5;
import p.ng5;
import p.o8n;
import p.oab1;
import p.pge;
import p.q8n;
import p.qt71;
import p.smo1;
import p.us71;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a implements dwo {
    public final kly0 a;
    public final oab1 b;
    public final iu30 c;
    public final Function0 d;
    public final llm e;
    public volatile hge1 f;

    public a(q8n q8nVar, kly0 kly0Var, oab1 oab1Var) {
        n5 n5Var = new n5(1, new Handler(Looper.getMainLooper()), Handler.class, "post", "post(Ljava/lang/Runnable;)Z", 0, (byte) 13);
        ng5 ng5Var = ng5.b;
        this.a = kly0Var;
        this.b = oab1Var;
        this.c = n5Var;
        this.d = ng5Var;
        llm llmVarH = us71.h(q8nVar);
        this.e = llmVarH;
        fn31.T(llmVarH, (o8n) null, 0, new bh(this, (lnm) null, (byte) 13), 3);
    }

    public final boolean a(fge1 fge1Var) {
        m1d m1dVar = fge1Var.a;
        if (Debug.isDebuggerConnected() || Debug.waitingForDebugger() || m1dVar.a() != null) {
            return false;
        }
        try {
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.d.invoke();
            if (stackTraceElementArr.length == 0) {
                return b("empty_stack", null);
            }
            if (m1dVar.a() != null) {
                return false;
            }
            Exception exc = new Exception() { // from class: com.spotify.crashreporting.anrwatchdog.anrwatchdogruntime.AnrWatchdogDaemon$MainThreadStallException
            };
            exc.setStackTrace(stackTraceElementArr);
            return !(this.b.a.l(exc) instanceof pge);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return b("stack_capture_failed", e2);
        }
    }

    public final boolean b(String str, Exception exc) {
        Logger.b("ANR watchdog failure: %s", new Object[]{str});
        boolean z = this.b.a.l(new AnrWatchdogDaemon$AnrWatchdogFailureException("ANR watchdog failure: ".concat(str), exc)) instanceof pge;
        boolean z2 = !z;
        if (z) {
            Logger.b("ANR watchdog: diagnostic dropped because report queue is full or closed", new Object[0]);
        }
        return z2;
    }

    public final lg5 c() {
        try {
            return ((qt71) this.a.get()).a();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.a(e2, "ANR watchdog: configuration read failed", new Object[0]);
            return null;
        }
    }

    public final void shutdown() {
        smo1.p(this.e, (CancellationException) null);
        hge1 hge1Var = this.f;
        if (hge1Var != null) {
            hge1Var.b();
        }
    }
}
