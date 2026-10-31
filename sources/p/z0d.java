package p;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.os.RemoteException;
import com.spotify.player.model.PlayerState;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class z0d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z0d(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ch61 ch61Var;
        byte b = this.a;
        int i = this.c;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((d2d) obj2).c(i, (sua) obj);
                break;
            case 1:
                ((d2d) obj2).b(i, (j2d) obj);
                break;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((b1d) obj2).b).onCaptureSequenceAborted((CameraCaptureSession) obj, i);
                break;
            case 3:
                ((CameraDevice.StateCallback) ((i1d) obj2).b).onError((CameraDevice) obj, i);
                break;
            case 4:
                c0i c0iVar = (c0i) obj2;
                Object obj3 = ((cp5) obj).b;
                String str = (String) c0iVar.a.get(Integer.valueOf(i));
                if (str != null) {
                    oh0 oh0Var = (oh0) c0iVar.e.get(str);
                    if ((oh0Var != null ? oh0Var.a : null) == null) {
                        c0iVar.g.remove(str);
                        c0iVar.f.put(str, obj3);
                    } else {
                        bh0 bh0Var = oh0Var.a;
                        if (c0iVar.d.remove(str)) {
                            bh0Var.a(obj3);
                        }
                    }
                    break;
                }
                break;
            case 5:
                ((c0i) obj2).c(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 6:
                p811 p811Var = (p811) obj2;
                Context context = (Context) obj;
                if (!dhn.a.contains(o580.class)) {
                    try {
                        ((p580) p811Var.a).a(b680.SUBS, new n580(i, context, (byte) 1));
                    } catch (Throwable th) {
                        dhn.a(o580.class, th);
                        return;
                    }
                    break;
                }
                break;
            case 7:
                e9d0 e9d0Var = (e9d0) obj;
                for (g9d0 g9d0Var : (CopyOnWriteArraySet) obj2) {
                    if (!g9d0Var.d) {
                        if (i != -1) {
                            g9d0Var.b.c(i);
                        }
                        g9d0Var.c = true;
                        e9d0Var.invoke(g9d0Var.a);
                    }
                }
                break;
            case 8:
                rlh0 rlh0Var = (rlh0) obj2;
                try {
                    ch61Var = (ch61) ((n8d0) obj).get();
                    dm5.s(ch61Var, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    oon1.I("Session operation failed", e);
                    ch61Var = new ch61(-1);
                } catch (CancellationException e2) {
                    oon1.I("Session operation cancelled", e2);
                    ch61Var = new ch61(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    oon1.I("Session operation failed", e);
                    ch61Var = new ch61(-1);
                }
                kh70 kh70Var = rlh0Var.C;
                if (kh70Var != null) {
                    try {
                        kh70Var.U0(rlh0Var.c, i, ch61Var.b());
                    } catch (RemoteException unused) {
                        oon1.H("Error in sending");
                        return;
                    }
                    break;
                }
                break;
            default:
                ((grb1) obj2).g((PlayerState) obj, i, true);
                break;
        }
    }

    public /* synthetic */ z0d(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = i;
    }
}
