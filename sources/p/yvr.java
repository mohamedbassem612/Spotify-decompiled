package p;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.drm.DefaultDrmSession$UnexpectedDrmSessionException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yvr extends Handler {
    public boolean a;
    public final /* synthetic */ awr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvr(awr awrVar, Looper looper) {
        super(looper);
        this.b = awrVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        d2e0 d2e0Var;
        zvr zvrVar = (zvr) message.obj;
        try {
            int i = message.what;
            if (i == 1) {
                awr awrVar = this.b;
                e = awrVar.l.r(awrVar.m, (zn00) zvrVar.d);
            } else {
                if (i != 2) {
                    throw new RuntimeException();
                }
                awr awrVar2 = this.b;
                e = awrVar2.l.f(awrVar2.m, (xn00) zvrVar.d);
                synchronized (this.b.f14p) {
                    try {
                        dg90 dg90Var = this.b.z;
                        if (dg90Var != null && (d2e0Var = e.b) != null) {
                            c2e0 c2e0VarA = d2e0Var.a();
                            c2e0VarA.a = zvrVar.a;
                            c2e0VarA.f = SystemClock.elapsedRealtime() - zvrVar.c;
                            ((v280) dg90Var.b).c(new d2e0(c2e0VarA));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (MediaDrmCallbackException e) {
            e = e;
            zvr zvrVar2 = (zvr) message.obj;
            if (zvrVar2.b) {
                int i2 = zvrVar2.e + 1;
                zvrVar2.e = i2;
                if (i2 <= this.b.j.m(3)) {
                    c2e0 c2e0Var = new c2e0(zvrVar2.a, e.a, SystemClock.elapsedRealtime());
                    c2e0Var.d = e.b;
                    c2e0Var.e = e.c;
                    c2e0Var.f = SystemClock.elapsedRealtime() - zvrVar2.c;
                    c2e0Var.g = e.d;
                    d2e0 d2e0Var2 = new d2e0(c2e0Var);
                    DataSourceException defaultDrmSession$UnexpectedDrmSessionException = e.getCause() instanceof IOException ? (IOException) e.getCause() : new DefaultDrmSession$UnexpectedDrmSessionException(e.getCause());
                    ij81 ij81Var = this.b.j;
                    int i3 = zvrVar2.e;
                    ij81Var.getClass();
                    while (true) {
                        if (defaultDrmSession$UnexpectedDrmSessionException == null) {
                            jMin = Math.min((i3 - 1) * 1000, 5000);
                            break;
                        }
                        if ((defaultDrmSession$UnexpectedDrmSessionException instanceof ParserException) || (defaultDrmSession$UnexpectedDrmSessionException instanceof FileNotFoundException) || (defaultDrmSession$UnexpectedDrmSessionException instanceof HttpDataSource$CleartextNotPermittedException) || (defaultDrmSession$UnexpectedDrmSessionException instanceof Loader$UnexpectedLoaderException) || ((defaultDrmSession$UnexpectedDrmSessionException instanceof DataSourceException) && defaultDrmSession$UnexpectedDrmSessionException.a == 2008)) {
                            jMin = -9223372036854775807L;
                            break;
                        }
                        defaultDrmSession$UnexpectedDrmSessionException = defaultDrmSession$UnexpectedDrmSessionException.getCause();
                    }
                    if (jMin != -9223372036854775807L) {
                        synchronized (this.b.f14p) {
                            dg90 dg90Var2 = this.b.z;
                            if (dg90Var2 != null) {
                                ((v280) dg90Var2.b).c(d2e0Var2);
                            }
                            synchronized (this) {
                                try {
                                    if (!this.a) {
                                        sendMessageDelayed(Message.obtain(message), jMin);
                                        return;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
            oon1.I("Key/provisioning request produced an unexpected exception. Not retrying.", e);
        }
        ij81 ij81Var2 = this.b.j;
        long j = zvrVar.a;
        ij81Var2.getClass();
        synchronized (this) {
            try {
                if (!this.a) {
                    this.b.o.obtainMessage(message.what, Pair.create(zvrVar.d, e)).sendToTarget();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
