package p;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class i1i implements lly0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ i1i(byte b) {
        this.a = b;
    }

    @Override // p.lly0
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return ExecutorsRegistrar.a();
            case 2:
                aob0 aob0Var = ExecutorsRegistrar.a;
                return new w5t(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new lro("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                aob0 aob0Var2 = ExecutorsRegistrar.a;
                return new w5t(Executors.newCachedThreadPool(new lro("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                aob0 aob0Var3 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new lro("Firebase Scheduler", 0, null));
            default:
                return null;
        }
    }
}
