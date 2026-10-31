package io.reactivex.rxjava3.android.schedulers;

import android.os.Handler;
import android.os.Looper;
import io.reactivex.rxjava3.android.plugins.RxAndroidPlugins;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class AndroidSchedulers {
    public static final Scheduler a = RxAndroidPlugins.a(new a());

    public static final class MainHolder {
        public static final Scheduler a = new HandlerScheduler(new Handler(Looper.getMainLooper()));
    }
}
