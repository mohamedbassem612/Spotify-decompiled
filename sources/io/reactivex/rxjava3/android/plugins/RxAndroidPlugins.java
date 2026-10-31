package io.reactivex.rxjava3.android.plugins;

import io.reactivex.rxjava3.android.schedulers.a;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import p.bhn0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class RxAndroidPlugins {
    public static Scheduler a(a aVar) {
        try {
            Scheduler scheduler = (Scheduler) aVar.call();
            if (scheduler != null) {
                return scheduler;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw ExceptionHelper.f(th);
        }
    }

    public static void b(Scheduler scheduler) {
        if (scheduler != null) {
            return;
        }
        bhn0.i("scheduler == null");
    }
}
