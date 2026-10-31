package p;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nz4 implements n4n1 {
    public final Range a;
    public final boolean b;

    public nz4(w2d w2dVar) {
        this.b = false;
        this.a = (Range) w2dVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.b = w2dVar.c();
    }

    public final float b() {
        return ((Float) this.a.getLower()).floatValue();
    }

    public final void d(fp8 fp8Var) {
        fp8Var.n(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(1.0f));
        if (this.b) {
            sf.Q(fp8Var);
        }
    }

    public final float e() {
        return ((Float) this.a.getUpper()).floatValue();
    }

    public final void c() {
    }

    public final void a(TotalCaptureResult totalCaptureResult) {
    }
}
