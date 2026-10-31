package p;

import android.hardware.camera2.CameraDevice;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class e3d implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i1d b;
    public final /* synthetic */ CameraDevice c;

    public /* synthetic */ e3d(i1d i1dVar, CameraDevice cameraDevice, byte b) {
        this.a = b;
        this.b = i1dVar;
        this.c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CameraDevice cameraDevice = this.c;
        i1d i1dVar = this.b;
        switch (b) {
            case 0:
                ((CameraDevice.StateCallback) i1dVar.b).onClosed(cameraDevice);
                break;
            case 1:
                ((CameraDevice.StateCallback) i1dVar.b).onDisconnected(cameraDevice);
                break;
            default:
                ((CameraDevice.StateCallback) i1dVar.b).onOpened(cameraDevice);
                break;
        }
    }
}
