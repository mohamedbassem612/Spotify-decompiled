package p;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class jim0 extends Handler {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jim0(Looper looper, byte b) {
        super(looper);
        this.a = b;
        switch (b) {
            case 5:
                super(looper);
                Looper.getMainLooper();
                break;
            case 6:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                iim0 iim0Var = (iim0) message.obj;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    yi7 yi7Var = iim0Var.a;
                    return;
                }
                yi7 yi7Var2 = iim0Var.a;
                Object obj = iim0Var.b[0];
                if (yi7Var2.d.get()) {
                    CountDownLatch countDownLatch = yi7Var2.f;
                    try {
                        dan1 dan1Var = yi7Var2.g;
                        if (dan1Var.h == yi7Var2) {
                            SystemClock.uptimeMillis();
                            dan1Var.h = null;
                            dan1Var.a();
                        }
                        countDownLatch.countDown();
                    } catch (Throwable th) {
                        countDownLatch.countDown();
                        throw th;
                    }
                    break;
                } else {
                    try {
                        dan1 dan1Var2 = yi7Var2.g;
                        if (dan1Var2.g != yi7Var2) {
                            if (dan1Var2.h == yi7Var2) {
                                SystemClock.uptimeMillis();
                                dan1Var2.h = null;
                                dan1Var2.a();
                            }
                        } else if (!dan1Var2.c) {
                            SystemClock.uptimeMillis();
                            dan1Var2.g = null;
                            h9e0 h9e0Var = dan1Var2.a;
                            if (h9e0Var != null) {
                                if (Looper.myLooper() == Looper.getMainLooper()) {
                                    h9e0Var.m(obj);
                                } else {
                                    h9e0Var.j(obj);
                                }
                            }
                        }
                        yi7Var2.f.countDown();
                    } catch (Throwable th2) {
                        yi7Var2.f.countDown();
                        throw th2;
                    }
                }
                yi7Var2.c = 3;
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jim0(Looper looper, byte b, boolean z) {
        super(looper);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jim0(Looper looper, h7o1 h7o1Var) {
        super(looper, h7o1Var);
        this.a = (byte) 4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jim0(Looper looper, pz40 pz40Var) {
        super(looper, pz40Var);
        this.a = (byte) 2;
        Looper.getMainLooper();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jim0(Looper looper, h7o1 h7o1Var, byte b) {
        super(looper, h7o1Var);
        this.a = (byte) 6;
        Looper.getMainLooper();
    }

    public jim0() {
        this.a = (byte) 1;
    }
}
