package p;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h3d extends CameraDevice.StateCallback {
    public final /* synthetic */ byte a;
    public final Object b;

    public h3d(ArrayList arrayList) {
        this.a = (byte) 0;
        this.b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof i3d)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }

    public void a() {
        ArrayList<hdd1> arrayListL;
        synchronized (((a680) this.b).b) {
            arrayListL = ((a680) this.b).l();
            ((LinkedHashSet) ((a680) this.b).e).clear();
            ((LinkedHashSet) ((a680) this.b).c).clear();
            ((LinkedHashSet) ((a680) this.b).d).clear();
        }
        for (hdd1 hdd1Var : arrayListL) {
            synchronized (hdd1Var.a) {
                try {
                    List list = hdd1Var.k;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((j2t) it.next()).b();
                        }
                        hdd1Var.k = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hdd1Var.u.g();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((a680) this.b).b) {
            linkedHashSet.addAll((LinkedHashSet) ((a680) this.b).e);
            linkedHashSet.addAll((LinkedHashSet) ((a680) this.b).c);
        }
        ((g661) ((a680) this.b).a).execute(new fe(linkedHashSet, (byte) 20));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                break;
            default:
                b();
                a();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
                }
                return;
            default:
                b();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                synchronized (((a680) this.b).b) {
                    linkedHashSet.addAll((LinkedHashSet) ((a680) this.b).e);
                    linkedHashSet.addAll((LinkedHashSet) ((a680) this.b).c);
                    break;
                }
                ((g661) ((a680) this.b).a).execute(new xu7(linkedHashSet, i, (byte) 3));
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                break;
        }
    }

    private final void c(CameraDevice cameraDevice) {
    }

    public h3d(a680 a680Var) {
        this.a = (byte) 1;
        this.b = a680Var;
    }
}
