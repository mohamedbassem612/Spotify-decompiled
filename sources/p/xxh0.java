package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class xxh0 {
    public boolean c;
    public nj7 e;
    public final Object a = new Object();
    public final wxh0 b = new wxh0(this);
    public WeakReference d = new WeakReference(null);

    public final void a(yxh0 yxh0Var, Handler handler) {
        if (this.c) {
            this.c = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompat = yxh0Var.g;
            long j = playbackStateCompat == null ? 0L : playbackStateCompat.e;
            boolean z = playbackStateCompat != null && playbackStateCompat.a == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                e();
            } else {
                if (z || !z2) {
                    return;
                }
                f();
            }
        }
    }

    public boolean d(Intent intent) {
        yxh0 yxh0Var;
        nj7 nj7Var;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.a) {
                yxh0Var = (yxh0) this.d.get();
                nj7Var = this.e;
            }
            if (yxh0Var != null && nj7Var != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                f0i0 f0i0VarB = yxh0Var.b();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(yxh0Var, nj7Var);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    a(yxh0Var, nj7Var);
                    return true;
                }
                if (!this.c) {
                    this.c = true;
                    nj7Var.sendMessageDelayed(nj7Var.obtainMessage(1, f0i0VarB), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                nj7Var.removeMessages(1);
                this.c = false;
                PlaybackStateCompat playbackStateCompat = yxh0Var.g;
                if (((playbackStateCompat == null ? 0L : playbackStateCompat.e) & 32) != 0) {
                    p();
                }
                return true;
            }
        }
        return false;
    }

    public final void t(yxh0 yxh0Var, Handler handler) {
        synchronized (this.a) {
            try {
                this.d = new WeakReference(yxh0Var);
                nj7 nj7Var = this.e;
                nj7 nj7Var2 = null;
                if (nj7Var != null) {
                    nj7Var.removeCallbacksAndMessages(null);
                }
                if (handler != null) {
                    nj7Var2 = new nj7(this, handler.getLooper(), (byte) 8);
                }
                this.e = nj7Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
    }

    public void f() {
    }

    public void p() {
    }

    public void q() {
    }

    public void s() {
    }

    public void l(long j) {
    }

    public void m(RatingCompat ratingCompat) {
    }

    public void n(int i) {
    }

    public void o(int i) {
    }

    public void r(long j) {
    }

    public void c(String str, Bundle bundle) {
    }

    public void g(String str, Bundle bundle) {
    }

    public void h(String str, Bundle bundle) {
    }

    public void i(Uri uri, Bundle bundle) {
    }

    public void j(String str, Bundle bundle) {
    }

    public void k(Uri uri, Bundle bundle) {
    }

    public void b(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }
}
