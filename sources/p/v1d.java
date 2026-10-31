package p;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class v1d {
    public static final v1d a = new v1d();

    public void a(qr70 qr70Var, vnd vndVar) {
        int i;
        wnd wndVar = (wnd) qr70Var.h(i4i1.B0, (Object) null);
        eqq0 eqq0Var = eqq0.c;
        sy8 sy8Var = wnd.h;
        HashSet hashSet = new HashSet();
        xdn0 xdn0VarD = xdn0.d();
        ArrayList arrayList = new ArrayList();
        yen0 yen0VarA = yen0.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        eqq0 eqq0VarB = eqq0.b(xdn0VarD);
        ArrayList arrayList3 = new ArrayList(arrayList);
        tod1 tod1Var = tod1.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = yen0VarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        new wnd(arrayList2, eqq0VarB, -1, arrayList3, false, new tod1(arrayMap), null);
        if (wndVar != null) {
            int i2 = wndVar.c;
            vndVar.a(wndVar.d);
            eqq0Var = wndVar.b;
            i = i2;
        } else {
            i = -1;
        }
        vndVar.d = xdn0.n(eqq0Var);
        vndVar.b = ((Integer) qr70Var.h(z1d.c, Integer.valueOf(i))).intValue();
        vndVar.b(new qnd((CameraCaptureSession.CaptureCallback) qr70Var.h(z1d.g, new u1d())));
        vndVar.i(l2a.l(qr70Var).d());
    }
}
