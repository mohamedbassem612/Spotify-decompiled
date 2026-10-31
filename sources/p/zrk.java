package p;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class zrk implements Executor {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Handler b;

    public /* synthetic */ zrk(Handler handler, byte b) {
        this.a = b;
        this.b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        this.b.post(runnable);
    }
}
