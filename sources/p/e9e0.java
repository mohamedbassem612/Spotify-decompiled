package p;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e9e0 extends Handler implements Runnable {
    public final int a;
    public final f9e0 b;
    public final long c;
    public d9e0 d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ eyh0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9e0(eyh0 eyh0Var, Looper looper, f9e0 f9e0Var, d9e0 d9e0Var, int i, long j) {
        super(looper);
        this.t = eyh0Var;
        this.b = f9e0Var;
        this.d = d9e0Var;
        this.a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.i = z;
        this.e = null;
        if (hasMessages(1)) {
            this.h = true;
            removeMessages(1);
            if (!z) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.h = true;
                    this.b.b();
                    Thread thread = this.g;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            this.t.c = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            d9e0 d9e0Var = this.d;
            d9e0Var.getClass();
            d9e0Var.n(this.b, jElapsedRealtime, jElapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        d9e0 d9e0Var = this.d;
        d9e0Var.getClass();
        d9e0Var.h(this.b, jElapsedRealtime, j, this.f);
        this.e = null;
        eyh0 eyh0Var = this.t;
        u8a0 u8a0Var = (u8a0) eyh0Var.b;
        e9e0 e9e0Var = (e9e0) eyh0Var.c;
        e9e0Var.getClass();
        u8a0Var.execute(e9e0Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 4) {
            throw ((Error) message.obj);
        }
        this.t.c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.c;
        d9e0 d9e0Var = this.d;
        d9e0Var.getClass();
        if (this.h) {
            d9e0Var.n(this.b, jElapsedRealtime, j, false);
            return;
        }
        int i2 = message.what;
        if (i2 == 2) {
            try {
                d9e0Var.j(this.b, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                oon1.w("Unexpected exception handling load completed", e);
                this.t.d = new Loader$UnexpectedLoaderException(e);
                return;
            }
        }
        if (i2 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.e = iOException;
        int i3 = this.f + 1;
        this.f = i3;
        o4t o4tVarO = d9e0Var.o(this.b, jElapsedRealtime, j, iOException, i3);
        int i4 = o4tVarO.a;
        if (i4 == 3) {
            this.t.d = this.e;
            return;
        }
        if (i4 != 2) {
            if (i4 == 1) {
                this.f = 1;
            }
            long jMin = o4tVarO.b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f - 1) * 1000, 5000);
            }
            eyh0 eyh0Var = this.t;
            dm5.y(((e9e0) eyh0Var.c) == null);
            eyh0Var.c = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(1, jMin);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = this.h;
                this.g = Thread.currentThread();
            }
            if (!z) {
                Trace.beginSection("load:".concat(this.b.getClass().getSimpleName()));
                try {
                    this.b.a();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (this.i) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.i) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Exception e2) {
            if (this.i) {
                return;
            }
            oon1.w("Unexpected exception loading stream", e2);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.i) {
                return;
            }
            oon1.w("OutOfMemory error loading stream", e3);
            obtainMessage(3, new Loader$UnexpectedLoaderException(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.i) {
                oon1.w("Unexpected error loading stream", e4);
                obtainMessage(4, e4).sendToTarget();
            }
            throw e4;
        }
    }
}
