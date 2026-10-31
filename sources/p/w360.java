package p;

import androidx.media3.common.VideoFrameProcessingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w360 implements uoj1 {
    public long a;
    public final Object b;

    public w360(ff01 ff01Var) {
        this.b = ff01Var;
        this.a = 262144L;
    }

    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        ez81.a((ez81) this.b).execute(new zyh0(this, videoFrameProcessingException, (byte) 28));
    }

    public void b(long j, boolean z) {
        ez81 ez81Var = (ez81) this.b;
        if (j == 0) {
            ez81.p(ez81Var);
        }
        this.a = j;
        ez81.a(ez81Var).execute(new kym0(this, j, z, (byte) 1));
    }

    public void c(int i, int i2) {
        ez81.a((ez81) this.b).execute(new jym0(this, i, i2, (byte) 1));
    }

    public void e(float f) {
        ez81.a((ez81) this.b).execute(new iym0(this, f, (byte) 1));
    }

    public void h() {
        ez81.a((ez81) this.b).execute(new v241(this, (byte) 7));
    }

    public w360(ez81 ez81Var) {
        this.b = ez81Var;
    }
}
