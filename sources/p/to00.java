package p;

import android.media.MediaFormat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class to00 implements moj1, i4d, rbu0 {
    public moj1 a;
    public i4d b;
    public moj1 c;
    public i4d d;

    @Override // p.moj1
    public final void a(long j, long j2, ie30 ie30Var, MediaFormat mediaFormat) {
        moj1 moj1Var = this.c;
        if (moj1Var != null) {
            moj1Var.a(j, j2, ie30Var, mediaFormat);
        }
        moj1 moj1Var2 = this.a;
        if (moj1Var2 != null) {
            moj1Var2.a(j, j2, ie30Var, mediaFormat);
        }
    }

    public final void b(int i, Object obj) {
        if (i == 7) {
            this.a = (moj1) obj;
            return;
        }
        if (i == 8) {
            this.b = (i4d) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        kxa1 kxa1Var = (kxa1) obj;
        if (kxa1Var == null) {
            this.c = null;
            this.d = null;
        } else {
            this.c = kxa1Var.getVideoFrameMetadataListener();
            this.d = kxa1Var.getCameraMotionListener();
        }
    }

    @Override // p.i4d
    public final void c(long j, float[] fArr) {
        i4d i4dVar = this.d;
        if (i4dVar != null) {
            i4dVar.c(j, fArr);
        }
        i4d i4dVar2 = this.b;
        if (i4dVar2 != null) {
            i4dVar2.c(j, fArr);
        }
    }

    @Override // p.i4d
    public final void d() {
        i4d i4dVar = this.d;
        if (i4dVar != null) {
            i4dVar.d();
        }
        i4d i4dVar2 = this.b;
        if (i4dVar2 != null) {
            i4dVar2.d();
        }
    }
}
