package p;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ss40 {
    public static final ss40 e = new ss40(-1, -1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ss40(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public final void a() throws GlUtil.GlException {
        int i = this.a;
        if (i != -1) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            fn31.t();
        }
        int i2 = this.b;
        if (i2 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
            fn31.t();
        }
    }
}
