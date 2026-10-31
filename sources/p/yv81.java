package p;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yv81 extends Thread {
    public final /* synthetic */ ConditionVariable a;
    public final /* synthetic */ zv81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yv81(zv81 zv81Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.b = zv81Var;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.a.open();
            this.b.h();
            this.b.b.getClass();
        }
    }
}
