package p;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o4n1 {
    public final d1d a;
    public final q4n1 b;
    public final kdn0 c;
    public final n4n1 d;
    public boolean e = false;
    public final m4n1 f = new m4n1(this);

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public o4n1(d1d d1dVar, w2d w2dVar, g661 g661Var) {
        Range range;
        n4n1 nz4Var;
        this.a = d1dVar;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) w2dVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError unused) {
                j2h1.N("ZoomControl");
                range = null;
            }
            if (range != null) {
                nz4Var = new nz4(w2dVar);
            } else {
                nz4Var = new zwa((Object) w2dVar, (byte) 23);
            }
        } else {
            nz4Var = new zwa((Object) w2dVar, (byte) 23);
        }
        this.d = nz4Var;
        q4n1 q4n1Var = new q4n1(nz4Var.e(), nz4Var.b());
        this.b = q4n1Var;
        q4n1Var.e();
        this.c = new kdn0(new c19(q4n1Var.d(), q4n1Var.b(), q4n1Var.c(), q4n1Var.a()));
        d1dVar.h(this.f);
    }
}
