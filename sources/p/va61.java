package p;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class va61 extends ua61 {
    public static va61 d(i4i1 i4i1Var, Size size) {
        if (((a2d) i4i1Var.h(i4i1.C0, (Object) null)) == null) {
            bhn0.y((String) i4i1Var.h(jrd1.r0, i4i1Var.toString()), "Implementation is missing option unpacker for ");
            return null;
        }
        va61 va61Var = new va61();
        bb61 bb61Var = (bb61) i4i1Var.h(i4i1.A0, (Object) null);
        eqq0 eqq0Var = eqq0.c;
        int i = bb61.a().g.c;
        if (bb61Var != null) {
            i = bb61Var.g.c;
            for (CameraDevice.StateCallback stateCallback : bb61Var.c) {
                ArrayList arrayList = va61Var.c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : bb61Var.d) {
                ArrayList arrayList2 = va61Var.d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            va61Var.b.a(bb61Var.g.d);
            eqq0Var = bb61Var.g.b;
        }
        va61Var.b.d = xdn0.n(eqq0Var);
        if (i4i1Var instanceof qbw0) {
            Rational rational = gjw0.a;
            if (((PreviewPixelHDRnetQuirk) vvt.a.m(PreviewPixelHDRnetQuirk.class)) != null && !gjw0.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                xdn0 xdn0VarD = xdn0.d();
                xdn0VarD.r(z1d.J(CaptureRequest.TONEMAP_MODE), 2);
                va61Var.b.i(new z1d(eqq0.b(xdn0VarD), (byte) 9));
            }
        }
        va61Var.b.b = ((Integer) i4i1Var.h(z1d.c, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) i4i1Var.h(z1d.e, new i3d());
        ArrayList arrayList3 = va61Var.c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) i4i1Var.h(z1d.f, new u2d());
        ArrayList arrayList4 = va61Var.d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        qnd qndVar = new qnd((CameraCaptureSession.CaptureCallback) i4i1Var.h(z1d.g, new u1d()));
        va61Var.b.b(qndVar);
        ArrayList arrayList5 = va61Var.e;
        if (!arrayList5.contains(qndVar)) {
            arrayList5.add(qndVar);
        }
        sy8 sy8Var = i4i1.K0;
        Integer num = (Integer) i4i1Var.h(sy8Var, 0);
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            vnd vndVar = va61Var.b;
            if (iIntValue != 0) {
                ((xdn0) vndVar.d).r(sy8Var, num);
            }
        }
        int iT = i4i1Var.t();
        if (iT != 0) {
            vnd vndVar2 = va61Var.b;
            if (iT != 0) {
                ((xdn0) vndVar2.d).r(i4i1.J0, Integer.valueOf(iT));
            }
        }
        xdn0 xdn0VarD2 = xdn0.d();
        sy8 sy8Var2 = z1d.h;
        xdn0VarD2.r(sy8Var2, (String) i4i1Var.h(sy8Var2, (Object) null));
        sy8 sy8Var3 = z1d.d;
        Long l = (Long) i4i1Var.h(sy8Var3, -1L);
        l.getClass();
        xdn0VarD2.r(sy8Var3, l);
        va61Var.b.i(xdn0VarD2);
        va61Var.b.i(l2a.l(i4i1Var).d());
        return va61Var;
    }

    public final void a(qsk qskVar) {
        this.b.i(qskVar);
    }

    public final void b(j2t j2tVar, liv livVar, int i) {
        ajq0 ajq0VarA = b29.a(j2tVar);
        if (livVar == null) {
            bhn0.i("Null dynamicRange");
            return;
        }
        ajq0VarA.e = livVar;
        ajq0VarA.c = Integer.valueOf(i);
        this.a.add(ajq0VarA.j());
        ((HashSet) this.b.c).add(j2tVar);
    }

    public final bb61 c() {
        return new bb61(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.j(), this.f, this.g, this.h);
    }
}
