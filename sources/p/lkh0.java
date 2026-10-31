package p;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.b;
import androidx.media3.exoplayer.video.c;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lkh0 implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ b b;

    public lkh0(b bVar, yjh0 yjh0Var) {
        this.b = bVar;
        Handler handlerR = zoi1.r(this);
        this.a = handlerR;
        yjh0Var.d(this, handlerR);
    }

    public final void a(long j) {
        Surface surface;
        b bVar = this.b;
        bih1 bih1Var = bVar.j2;
        if (this != bVar.X2 || bVar.m1 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            bVar.U1 = true;
            return;
        }
        try {
            bVar.T0(j);
            z1k1 z1k1Var = bVar.S2;
            if (!z1k1Var.equals(z1k1.d) && !z1k1Var.equals(bVar.T2)) {
                bVar.T2 = z1k1Var;
                bih1Var.m(z1k1Var);
            }
            bVar.W1.e++;
            c cVar = bVar.m2;
            boolean z = cVar.e != 3;
            cVar.e = 3;
            cVar.k.getClass();
            cVar.g = zoi1.W(SystemClock.elapsedRealtime());
            if (z && (surface = bVar.C2) != null) {
                Handler handler = (Handler) bih1Var.b;
                if (handler != null) {
                    handler.post(new xdh(bih1Var, surface, SystemClock.elapsedRealtime(), (byte) 4));
                }
                bVar.F2 = true;
            }
            bVar.y0(j);
        } catch (ExoPlaybackException e) {
            bVar.V1 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = zoi1.a;
        a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
