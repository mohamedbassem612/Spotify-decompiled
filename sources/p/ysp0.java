package p;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DrmSession;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ysp0 {
    public static final ie30 f;
    public final ConditionVariable a;
    public final cwr b;
    public final HandlerThread c;
    public final Handler d;
    public final b9v e;

    static {
        ge30 ge30Var = new ge30();
        ge30Var.s = new x8v(new w8v[0]);
        f = new ie30(ge30Var);
    }

    public ysp0(cwr cwrVar, b9v b9vVar) {
        this.b = cwrVar;
        this.e = b9vVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(handlerThread.getLooper());
        this.a = new ConditionVariable();
        uip0 uip0Var = new uip0(this, (byte) 2);
        Handler handler = new Handler(handlerThread.getLooper());
        CopyOnWriteArrayList copyOnWriteArrayList = b9vVar.c;
        a9v a9vVar = new a9v();
        a9vVar.a = handler;
        a9vVar.b = uip0Var;
        copyOnWriteArrayList.add(a9vVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.drm.DrmSession$DrmSessionException */
    public final y8v a(final int i, final ie30 ie30Var, final byte[] bArr) throws DrmSession.DrmSessionException {
        ie30Var.t.getClass();
        final em61 em61Var = new em61();
        ConditionVariable conditionVariable = this.a;
        conditionVariable.close();
        Runnable runnable = new Runnable() { // from class: p.xsp0
            @Override // java.lang.Runnable
            public final void run() {
                byte b = i;
                byte[] bArr2 = bArr;
                em61 em61Var2 = em61Var;
                ie30 ie30Var2 = ie30Var;
                ysp0 ysp0Var = this.a;
                cwr cwrVar = ysp0Var.b;
                try {
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    cwrVar.h(looperMyLooper, dbu0.c);
                    cwrVar.e();
                    try {
                        cwrVar.l(bArr2, b);
                        y8v y8vVarI = cwrVar.i(ysp0Var.e, ie30Var2);
                        y8vVarI.getClass();
                        em61Var2.u(y8vVarI);
                    } catch (Throwable th) {
                        cwrVar.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    em61Var2.v(th2);
                }
            }
        };
        Handler handler = this.d;
        handler.post(runnable);
        try {
            y8v y8vVar = (y8v) em61Var.get();
            conditionVariable.block();
            em61 em61Var2 = new em61();
            handler.post(new wsp0(this, y8vVar, em61Var2));
            try {
                if (em61Var2.get() == null) {
                    return y8vVar;
                }
                throw ((DrmSession.DrmSessionException) em61Var2.get());
            } catch (InterruptedException | ExecutionException e) {
                bhn0.p(e);
                return null;
            }
        } catch (InterruptedException | ExecutionException e2) {
            bhn0.p(e2);
            return null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.exoplayer.drm.DrmSession$DrmSessionException */
    public final byte[] b(ie30 ie30Var) throws DrmSession.DrmSessionException {
        y8v y8vVarA = a(2, ie30Var, null);
        em61 em61Var = new em61();
        this.d.post(new wsp0(this, em61Var, y8vVarA, (byte) 1));
        try {
            try {
                byte[] bArr = (byte[]) em61Var.get();
                bArr.getClass();
                c();
                return bArr;
            } catch (Throwable th) {
                c();
                throw th;
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void c() {
        em61 em61Var = new em61();
        this.d.post(new zyh0(this, em61Var, (byte) 12));
        try {
            em61Var.get();
        } catch (InterruptedException | ExecutionException e) {
            bhn0.p(e);
        }
    }
}
