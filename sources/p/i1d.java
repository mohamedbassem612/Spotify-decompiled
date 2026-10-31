package p;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i1d extends CameraDevice.StateCallback {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public final Object c;

    public i1d(Executor executor, CameraDevice.StateCallback stateCallback) {
        this.c = executor;
        this.b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((p1d) obj).t("openCameraConfigAndClose camera closed");
                ((mzc) this.b).b((Object) null);
                break;
            default:
                ((Executor) obj).execute(new e3d(this, cameraDevice, (byte) 0));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((p1d) obj).t("openCameraConfigAndClose camera disconnected");
                ((mzc) this.b).b((Object) null);
                break;
            default:
                ((Executor) obj).execute(new e3d(this, cameraDevice, (byte) 1));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((p1d) obj).t("openCameraConfigAndClose camera error " + i);
                ((mzc) this.b).b((Object) null);
                break;
            default:
                ((Executor) obj).execute(new z0d((Object) this, (Object) cameraDevice, i, (byte) 3));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                p1d p1dVar = (p1d) obj;
                Executor executor = p1dVar.c;
                p1dVar.t("openCameraConfigAndClose camera opened");
                iod iodVar = new iod(p1dVar.e1, new g4r(Collections.EMPTY_LIST), false);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                g280 g280Var = new g280(surface);
                poz0.F(g280Var.e).b(new ny2((Object) surface, (Object) surfaceTexture, (byte) 21), n5u.a());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                xdn0 xdn0VarD = xdn0.d();
                ArrayList arrayList = new ArrayList();
                yen0 yen0VarA = yen0.a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ajq0 ajq0VarA = b29.a(g280Var);
                ajq0VarA.e = liv.d;
                linkedHashSet.add(ajq0VarA.j());
                p1dVar.t("Start configAndClose.");
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                eqq0 eqq0VarB = eqq0.b(xdn0VarD);
                ArrayList arrayList10 = new ArrayList(arrayList);
                tod1 tod1Var = tod1.b;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = yen0VarA.a;
                for (String str : arrayMap2.keySet()) {
                    arrayMap.put(str, arrayMap2.get(str));
                    arrayList6 = arrayList6;
                }
                bb61 bb61Var = new bb61(arrayList5, arrayList6, arrayList7, arrayList8, new wnd(arrayList9, eqq0VarB, 1, arrayList10, false, new tod1(arrayMap), null), null, null, null);
                wmy wmyVar = p1dVar.Y0;
                dce dceVarJ = poz0.J(jx30.a(upn1.t(new mx30(iodVar.k(bb61Var, cameraDevice, new hdd1((g4r) wmyVar.e, (g4r) wmyVar.f, (a680) wmyVar.d, (g661) wmyVar.a, (js50) wmyVar.b, (Handler) wmyVar.c)), (byte) 0))), new uk4(iodVar, g280Var, (byte) 4), executor);
                Objects.requireNonNull(cameraDevice);
                dceVarJ.b(new fe(cameraDevice, (byte) 13), executor);
                break;
            default:
                ((Executor) obj).execute(new e3d(this, cameraDevice, (byte) 2));
                break;
        }
    }

    public i1d(p1d p1dVar, mzc mzcVar) {
        this.c = p1dVar;
        this.b = mzcVar;
    }
}
