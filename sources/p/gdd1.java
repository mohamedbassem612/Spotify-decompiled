package p;

import android.hardware.camera2.CameraCaptureSession;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gdd1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdd1 b;

    public /* synthetic */ gdd1(hdd1 hdd1Var, byte b) {
        this.a = b;
        this.b = hdd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        hdd1 hdd1Var = this.b;
        switch (b) {
            case 0:
                hdd1Var.g(hdd1Var);
                return;
            default:
                hdd1Var.l("Session call super.close()");
                o0c.p(hdd1Var.g, "Need to call openCaptureSession before using this API.");
                a680 a680Var = hdd1Var.b;
                synchronized (a680Var.b) {
                    ((LinkedHashSet) a680Var.d).add(hdd1Var);
                    break;
                }
                ((CameraCaptureSession) ((q59) hdd1Var.g.b).b).close();
                hdd1Var.d.execute(new gdd1(hdd1Var, (byte) 0));
                return;
        }
    }
}
