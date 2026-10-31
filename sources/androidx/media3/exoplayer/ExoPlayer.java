package androidx.media3.exoplayer;

import androidx.media3.exoplayer.image.ImageOutput;
import p.far;
import p.ie30;
import p.jca;
import p.qba;
import p.r8u0;
import p.rbu0;
import p.sbu0;
import p.uz3;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface ExoPlayer extends r8u0 {
    void C0(qba qbaVar);

    sbu0 G(rbu0 rbu0Var);

    far J0();

    ie30 L0();

    void N(qba qbaVar, long j);

    ie30 S();

    void W0(qba qbaVar);

    void a0(qba qbaVar);

    boolean isScrubbingModeEnabled();

    void k(int i);

    int p0();

    jca s0(int i);

    void setImageOutput(ImageOutput imageOutput);

    void setScrubbingModeEnabled(boolean z);

    void t0(uz3 uz3Var);

    void z0(uz3 uz3Var);
}
