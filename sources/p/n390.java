package p;

import android.os.Looper;
import android.os.Trace;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n390 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r390 b;

    public /* synthetic */ n390(r390 r390Var, byte b) {
        this.a = b;
        this.b = r390Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        r390 r390Var = this.b;
        switch (b) {
            case 0:
                yo00 yo00Var = r390Var.Z0;
                if (yo00Var != null) {
                    yo00Var.t0(r390Var.V0);
                    yo00Var.P(r390Var);
                    Trace.beginSection("BetamaxPlayer.ReleaseExoPlayer");
                    try {
                        yo00Var.y1();
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                r390Var.X0 = null;
                r390Var.Z0 = null;
                return;
            default:
                Looper looper = r390Var.h;
                if (looper.equals(Looper.getMainLooper())) {
                    return;
                }
                looper.quitSafely();
                return;
        }
    }
}
