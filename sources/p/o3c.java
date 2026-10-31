package p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o3c implements Application.ActivityLifecycleCallbacks {
    public int a;
    public HashSet b;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        n3c n3cVarH = n3c.h();
        i1k0.B("onActivityCreated, activity = " + activity + " branch: " + n3cVarH + " Activities on stack: " + this.b);
        if (n3cVarH == null) {
            return;
        }
        n3cVarH.m = 1;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        HashSet hashSet = this.b;
        n3c n3cVarH = n3c.h();
        i1k0.B("onActivityDestroyed, activity = " + activity + " branch: " + n3cVarH);
        if (n3cVarH == null) {
            return;
        }
        if (n3cVarH.f() == activity) {
            n3cVarH.h.clear();
        }
        hashSet.remove(activity.toString());
        i1k0.B("activitiesOnStack_: " + hashSet);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        n3c n3cVarH = n3c.h();
        i1k0.B("onActivityPaused, activity = " + activity + " branch: " + n3cVarH);
        if (n3cVarH == null) {
            return;
        }
        i1k0.B("activityCnt_: " + this.a);
        i1k0.B("activitiesOnStack_: " + this.b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0063  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean z;
        HashSet hashSet = this.b;
        n3c n3cVarH = n3c.h();
        i1k0.B("onActivityResumed, activity = " + activity + " branch: " + n3cVarH);
        if (n3cVarH == null) {
            return;
        }
        boolean z2 = n3c.q;
        i1k0.B("bypassIntentState: " + z2);
        if (!z2) {
            i1k0.B("onIntentReady " + activity + " removing INTENT_PENDING_WAIT_LOCK");
            n3cVarH.m = 2;
            y861 y861Var = n3cVarH.f;
            y861Var.r(t861.c);
            Intent intent = activity.getIntent();
            int i = n3cVarH.n;
            if (intent != null) {
                z = i != 1;
            }
            i1k0.B("onIntentReady intent: " + intent + " sessionState: " + l1d.F(i) + " grabIntentParams: " + z);
            if (z) {
                n3cVarH.o(activity.getIntent().getData(), activity);
            }
            y861Var.p("onIntentReady");
        }
        if (n3cVarH.n == 3 && !n3c.r) {
            i1k0.B("initializing session on user's behalf (onActivityResumed called but SESSION_STATE = UNINITIALISED)");
            m3c m3cVar = new m3c(activity);
            m3cVar.d();
            m3cVar.c();
        }
        hashSet.add(activity.toString());
        i1k0.B("activityCnt_: " + this.a);
        i1k0.B("activitiesOnStack_: " + hashSet);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        n3c n3cVarH = n3c.h();
        i1k0.B("onActivityStarted, activity = " + activity + " branch: " + n3cVarH + " Activities on stack: " + this.b);
        if (n3cVarH == null) {
            return;
        }
        n3cVarH.h = new WeakReference(activity);
        n3cVarH.m = 1;
        this.a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        n3c n3cVarH = n3c.h();
        i1k0.B("onActivityStopped, activity = " + activity + " branch: " + n3cVarH);
        if (n3cVarH == null) {
            return;
        }
        this.a--;
        i1k0.B("activityCnt_: " + this.a);
        if (this.a < 1) {
            n3cVarH.i = false;
            ne neVar = n3cVarH.b;
            ((w3c) neVar.e).a.clear();
            if (n3cVarH.n != 3) {
                n3cVarH.n = 3;
            }
            neVar.Y("bnc_no_value");
            neVar.Z("bnc_external_intent_uri", (String) null);
            b3g1 b3g1Var = n3cVarH.k;
            Context context = n3cVarH.d;
            b3g1Var.getClass();
            b3g1Var.a = ne.z(context).v("bnc_tracking_state");
            this.a = 0;
            i1k0.B("activityCnt_: reset to 0");
        }
        i1k0.B("activitiesOnStack_: " + this.b);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
