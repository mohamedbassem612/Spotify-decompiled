package p;

import androidx.camera.core.CameraControl$OperationCanceledException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class v0d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w0d b;
    public final /* synthetic */ mzc c;

    public /* synthetic */ v0d(w0d w0dVar, mzc mzcVar, byte b) {
        this.a = b;
        this.b = w0dVar;
        this.c = mzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        mzc mzcVar = this.c;
        w0d w0dVar = this.b;
        switch (b) {
            case 0:
                w0dVar.b = true;
                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                mzc mzcVar2 = (mzc) w0dVar.g;
                if (mzcVar2 != null) {
                    mzcVar2.c(cameraControl$OperationCanceledException);
                    w0dVar.g = null;
                }
                w0dVar.g = mzcVar;
                if (w0dVar.a) {
                    d1d d1dVar = (d1d) w0dVar.c;
                    mzc mzcVar3 = new mzc();
                    mzcVar3.c = new it21();
                    pzc pzcVar = new pzc(mzcVar3);
                    mzcVar3.b = pzcVar;
                    mzcVar3.a = x0d.class;
                    try {
                        d1dVar.c.execute(new ny2(d1dVar, mzcVar3, (byte) 19));
                        mzcVar3.a = "updateSessionConfigAsync";
                    } catch (Exception e) {
                        pzcVar.a(e);
                    }
                    poz0.F(pzcVar).b(new fe(w0dVar, (byte) 11), (g661) w0dVar.d);
                    w0dVar.b = false;
                }
                break;
            default:
                w0dVar.b = true;
                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                mzc mzcVar4 = (mzc) w0dVar.g;
                if (mzcVar4 != null) {
                    mzcVar4.c(cameraControl$OperationCanceledException2);
                    w0dVar.g = null;
                }
                w0dVar.g = mzcVar;
                if (w0dVar.a) {
                    d1d d1dVar2 = (d1d) w0dVar.c;
                    mzc mzcVar5 = new mzc();
                    mzcVar5.c = new it21();
                    pzc pzcVar2 = new pzc(mzcVar5);
                    mzcVar5.b = pzcVar2;
                    mzcVar5.a = x0d.class;
                    try {
                        d1dVar2.c.execute(new ny2(d1dVar2, mzcVar5, (byte) 19));
                        mzcVar5.a = "updateSessionConfigAsync";
                    } catch (Exception e2) {
                        pzcVar2.a(e2);
                    }
                    poz0.F(pzcVar2).b(new fe(w0dVar, (byte) 11), (g661) w0dVar.d);
                    w0dVar.b = false;
                }
                break;
        }
    }
}
