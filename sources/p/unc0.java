package p;

import android.os.Build;
import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.AudioStream;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class unc0 implements Runnable {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public /* synthetic */ unc0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kz20 kz20Var;
        int iA;
        int iE;
        switch (this.a) {
            case 0:
                ss90.e((AtomicBoolean) this.b, (AtomicBoolean) this.c, (ssw0) this.d, (vnc0) this.e, this.f, (l811) this.g, (LinkedHashSet) this.h, w7x.a);
                return;
            default:
                w2z w2zVar = (w2z) this.d;
                synchronized (w2zVar.b) {
                    kz20Var = (kz20) w2zVar.c;
                    w2zVar.c = null;
                }
                if (kz20Var == null) {
                    return;
                }
                if (!kz20Var.a) {
                    lw7 lw7Var = (lw7) this.c;
                    Handler handler = ((jnh0) this.g).b;
                    if (handler == null) {
                        Logger.d("Abandon audio focus: Failed for user %s, no worker thread available", new Object[]{td6.c(kz20Var.d)});
                        return;
                    }
                    int i = Build.VERSION.SDK_INT;
                    uw7 uw7Var = (mw7) this.b;
                    if (i >= 26) {
                        iA = uw7Var.b(kz20Var.b(lw7Var, handler), kz20Var.d);
                    } else {
                        iA = uw7Var.a(kz20Var.d, lw7Var);
                    }
                    int i2 = kz20Var.d;
                    if (iA == 0) {
                        Logger.d("Abandon audio focus: Failed for user %s", new Object[]{td6.c(i2)});
                        return;
                    } else {
                        if (iA != 1) {
                            Logger.d("Abandon audio focus: Unknown result %d for user %s", new Object[]{Integer.valueOf(iA), td6.c(i2)});
                            return;
                        }
                        Logger.g("Abandon audio focus: Audio focus abandoned for user %s", new Object[]{td6.c(i2)});
                        ((yfu) this.e).s(false);
                        ((Handler) this.f).post(new up21(this, (byte) 0));
                        return;
                    }
                }
                Handler handler2 = ((jnh0) this.g).b;
                if (handler2 == null) {
                    Logger.d("Request audio focus: Failed for user %s, no worker thread available", new Object[]{td6.c(kz20Var.d)});
                    return;
                }
                int i3 = Build.VERSION.SDK_INT;
                uw7 uw7Var2 = (mw7) this.b;
                lw7 lw7Var2 = (lw7) this.c;
                if (i3 >= 26) {
                    iE = uw7Var2.f(kz20Var.b(lw7Var2, handler2), kz20Var.d);
                } else {
                    AudioStream audioStream = kz20Var.b;
                    int[] iArr = gnh0.a;
                    iE = uw7Var2.e(lw7Var2, iArr[audioStream.ordinal()] == 1 ? 4 : 3, iArr[kz20Var.b.ordinal()] == 1 ? 2 : 1, kz20Var.d);
                }
                if (iE == 0) {
                    kz20 kz20VarA = kz20.a(kz20Var, kz20Var.e + 1, 15);
                    w2z w2zVar2 = (w2z) this.d;
                    synchronized (w2zVar2.b) {
                        if (((kz20) w2zVar2.c) != null) {
                            Logger.k("Request audio focus: Failed for user %s, not retrying due to a new request", new Object[]{td6.c(kz20Var.d)});
                            return;
                        }
                        w2zVar2.c = kz20.a(kz20VarA, 0, 31);
                        Logger.k("Request audio focus: Failed for user %s, retrying in %d milliseconds", new Object[]{td6.c(kz20Var.d), 5000});
                        Handler handler3 = ((jnh0) this.g).b;
                        if (handler3 != null) {
                            handler3.postDelayed(this, 5000L);
                            return;
                        }
                        return;
                    }
                }
                int i4 = kz20Var.d;
                if (iE == 1) {
                    Logger.g("Request audio focus: Audio focus granted for user %s", new Object[]{td6.c(i4)});
                    yfu yfuVar = (yfu) this.e;
                    AudioStream audioStream2 = kz20Var.b;
                    enh0 enh0Var = kz20Var.c;
                    synchronized (yfuVar.b) {
                        xx20 xx20Var = (xx20) yfuVar.c;
                        xx20Var.a = true;
                        xx20Var.b = audioStream2;
                        xx20Var.c = enh0Var;
                    }
                    ((Handler) this.f).post(new up21(this, (byte) 1));
                    return;
                }
                if (iE != 2) {
                    Logger.d("Request audio focus: Unknown result %d for user %s", new Object[]{Integer.valueOf(iE), td6.c(i4)});
                    return;
                }
                Logger.g("Request audio focus: Audio focus delayed for user %s", new Object[]{td6.c(i4)});
                yfu yfuVar2 = (yfu) this.e;
                AudioStream audioStream3 = kz20Var.b;
                enh0 enh0Var2 = kz20Var.c;
                synchronized (yfuVar2.b) {
                    xx20 xx20Var2 = (xx20) yfuVar2.c;
                    xx20Var2.a = false;
                    xx20Var2.b = audioStream3;
                    xx20Var2.c = enh0Var2;
                }
                return;
        }
    }
}
