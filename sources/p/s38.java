package p;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class s38 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s38(up41 up41Var, IOException iOException, boolean z) {
        this.a = (byte) 5;
        this.c = up41Var;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                em3 em3Var = (em3) this.c;
                boolean z = this.b;
                t38 t38Var = (t38) em3Var.c;
                String str = zoi1.a;
                t38Var.k(z);
                return;
            case 1:
                w0d w0dVar = (w0d) this.c;
                boolean z2 = this.b;
                if (w0dVar.a == z2) {
                    return;
                }
                w0dVar.a = z2;
                if (!z2) {
                    CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("The camera control has became inactive.");
                    mzc mzcVar = (mzc) w0dVar.g;
                    if (mzcVar != null) {
                        mzcVar.c(cameraControl$OperationCanceledException);
                        w0dVar.g = null;
                        return;
                    }
                    return;
                }
                if (w0dVar.b) {
                    d1d d1dVar = (d1d) w0dVar.c;
                    mzc mzcVar2 = new mzc();
                    mzcVar2.c = new it21();
                    pzc pzcVar = new pzc(mzcVar2);
                    mzcVar2.b = pzcVar;
                    mzcVar2.a = x0d.class;
                    try {
                        d1dVar.c.execute(new ny2(d1dVar, mzcVar2, (byte) 19));
                        mzcVar2.a = "updateSessionConfigAsync";
                        break;
                    } catch (Exception e) {
                        pzcVar.a(e);
                    }
                    poz0.F(pzcVar).b(new fe(w0dVar, (byte) 11), (g661) w0dVar.d);
                    w0dVar.b = false;
                    return;
                }
                return;
            case 2:
                p1d p1dVar = (p1d) this.c;
                boolean z3 = this.b;
                p1dVar.c1 = z3;
                if (z3 && p1dVar.h1 == 4) {
                    p1dVar.I(false);
                    return;
                }
                return;
            case 3:
                qwu qwuVar = (qwu) this.c;
                boolean z4 = this.b;
                mxr mxrVar = qwuVar.j;
                mxrVar.getClass();
                mxrVar.A(qwuVar, z4);
                return;
            case 4:
                boolean z5 = this.b;
                g7a0 g7a0Var = (g7a0) this.c;
                if (!z5) {
                    Window window = g7a0Var.e;
                    f7a0 f7a0Var = g7a0Var.j;
                    i5t i5tVar = (i5t) window.getDecorView().getTag(2131429976);
                    if (i5tVar != null) {
                        synchronized (i5tVar) {
                            i5tVar.a.remove(f7a0Var);
                        }
                        if (i5tVar.a.isEmpty()) {
                            try {
                                window.removeOnFrameMetricsAvailableListener(i5tVar);
                                break;
                            } catch (IllegalArgumentException unused) {
                            }
                            window.getDecorView().setTag(2131429976, null);
                        }
                    }
                    g7a0Var.g = 0L;
                    return;
                }
                if (g7a0Var.g == 0) {
                    Window window2 = g7a0Var.e;
                    f7a0 f7a0Var2 = g7a0Var.j;
                    if (window2.getDecorView().isHardwareAccelerated()) {
                        i5t i5tVar2 = (i5t) window2.getDecorView().getTag(2131429976);
                        if (i5tVar2 == null) {
                            i5t i5tVar3 = new i5t(p7h.O(new Window.OnFrameMetricsAvailableListener[]{f7a0Var2}));
                            if (i5t.b == null) {
                                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                                handlerThread.start();
                                i5t.b = new Handler(handlerThread.getLooper());
                            }
                            window2.getDecorView().setTag(2131429976, i5tVar3);
                            window2.addOnFrameMetricsAvailableListener(i5tVar3, i5t.b);
                        } else {
                            synchronized (i5tVar2) {
                                i5tVar2.a.add(f7a0Var2);
                            }
                        }
                        g7a0Var.g = System.nanoTime();
                        return;
                    }
                    return;
                }
                return;
            default:
                up41 up41Var = (up41) this.c;
                boolean z6 = this.b;
                dqu dquVar = (dqu) ((w62) up41Var.b).g;
                dquVar.getClass();
                mk60 mk60Var = (mk60) dquVar.b;
                dm5.y(mk60Var.k);
                if (z6 && mk60Var.m == null) {
                    mk60Var.f();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ s38(Object obj, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ s38(boolean z, g7a0 g7a0Var) {
        this.a = (byte) 4;
        this.b = z;
        this.c = g7a0Var;
    }
}
