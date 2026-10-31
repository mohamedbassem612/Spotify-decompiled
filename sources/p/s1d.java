package p;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s1d implements l3d {
    public final String a;
    public final w2d b;
    public final ps7 c;
    public d1d e;
    public final r1d f;
    public final g4r h;
    public final Object d = new Object();
    public ArrayList g = null;

    public s1d(String str, d4d d4dVar) {
        str.getClass();
        this.a = str;
        w2d w2dVarB = d4dVar.b(str);
        this.b = w2dVarB;
        ps7 ps7Var = new ps7((byte) 14, false);
        ps7Var.b = this;
        this.c = ps7Var;
        this.h = qqn1.i(w2dVarB);
        new HashMap();
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            j2h1.M("Camera2EncoderProfilesProvider");
        }
        this.f = new r1d(new jy8(5, null));
    }

    @Override // p.l3d
    public final int a() {
        return j(0);
    }

    @Override // p.l3d
    public final String b() {
        return this.a;
    }

    @Override // p.l3d
    public final void c(d2d d2dVar) {
        synchronized (this.d) {
            try {
                d1d d1dVar = this.e;
                if (d1dVar != null) {
                    d1dVar.c.execute(new ny2((Object) d1dVar, (Object) d2dVar, (byte) 18));
                    return;
                }
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == d2dVar) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.l3d
    public final int d() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        o0c.k("Unable to get the lens facing of the camera.", num != null);
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            return 0;
        }
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        hhg1.n(gvg.e(iIntValue, "The given lens facing integer: ", " can not be recognized."));
        return 0;
    }

    @Override // p.l3d
    public final List e(int i) {
        ua91 ua91VarB = this.b.b();
        HashMap map = (HashMap) ua91VarB.e;
        Size[] sizeArr = null;
        if (!map.containsKey(Integer.valueOf(i))) {
            Size[] highResolutionOutputSizes = ((StreamConfigurationMap) ((ezb1) ua91VarB.b).b).getHighResolutionOutputSizes(i);
            if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
                highResolutionOutputSizes = ((zhq0) ua91VarB.c).c(highResolutionOutputSizes, i);
            }
            map.put(Integer.valueOf(i), highResolutionOutputSizes);
            if (highResolutionOutputSizes != null) {
                sizeArr = (Size[]) highResolutionOutputSizes.clone();
            }
        } else if (((Size[]) map.get(Integer.valueOf(i))) != null) {
            sizeArr = (Size[]) ((Size[]) map.get(Integer.valueOf(i))).clone();
        }
        return sizeArr != null ? Arrays.asList(sizeArr) : Collections.EMPTY_LIST;
    }

    @Override // p.l3d
    public final g4r f() {
        return this.h;
    }

    @Override // p.l3d
    public final List g(int i) {
        Size[] sizeArrG = this.b.b().G(i);
        return sizeArrG != null ? Arrays.asList(sizeArrG) : Collections.EMPTY_LIST;
    }

    @Override // p.l3d
    public final void h(Executor executor, a1d a1dVar) {
        synchronized (this.d) {
            try {
                d1d d1dVar = this.e;
                if (d1dVar != null) {
                    d1dVar.c.execute(new c45((Object) d1dVar, (Object) executor, (Object) a1dVar, (byte) 3));
                    return;
                }
                ArrayList arrayList = this.g;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.g = arrayList;
                }
                arrayList.add(new Pair(a1dVar, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.l3d
    public final String i() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // p.l3d
    public final int j(int i) {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return mqn1.s(mqn1.G(i), num.intValue(), 1 == d());
    }

    public final void k(d1d d1dVar) {
        String strC;
        synchronized (this.d) {
            try {
                this.e = d1dVar;
                ArrayList<Pair> arrayList = this.g;
                byte b = 3;
                if (arrayList != null) {
                    for (Pair pair : arrayList) {
                        d1d d1dVar2 = this.e;
                        d1dVar2.c.execute(new c45(d1dVar2, (Executor) pair.second, (d2d) pair.first, b));
                    }
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            strC = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iIntValue == 1) {
            strC = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iIntValue == 2) {
            strC = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iIntValue != 3) {
            strC = iIntValue != 4 ? f4i1.c(iIntValue, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else {
            strC = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        }
        "Device Level: ".concat(strC);
        j2h1.z(4, j2h1.J("Camera2CameraInfo"));
    }
}
