package p;

import android.os.Trace;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class d9a0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ d9a0(String str, Runnable runnable, byte b) {
        this.a = b;
        this.b = str;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Runnable runnable = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                eo41.a("Cronet JavaUrlRequest#executeOnExecutor " + str + " running callback");
                try {
                    runnable.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                eo41.a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnUserExecutor " + str + " running callback");
                try {
                    runnable.run();
                    Trace.endSection();
                    return;
                } catch (Throwable th3) {
                    try {
                        Trace.endSection();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }
}
