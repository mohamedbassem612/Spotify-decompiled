package p;

import android.os.Process;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class oo21 extends Thread {
    public final /* synthetic */ byte a = 0;

    public oo21(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Process.setThreadPriority(10);
                super.run();
                return;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ oo21(Runnable runnable, String str) {
        super(runnable, str);
    }
}
