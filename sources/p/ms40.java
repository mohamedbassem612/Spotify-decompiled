package p;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ms40 {
    public final String a;
    public final int b;
    public final int c;
    public int f;
    public int g;
    public final float[] d = new float[16];
    public final int[] e = new int[4];
    public int h = 9729;

    public ms40(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public static ms40 b(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i, 35719, iArr, 0);
        int[] iArr2 = new int[1];
        int i3 = iArr[0];
        byte[] bArr = new byte[i3];
        GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4] == 0) {
                i3 = i4;
                break;
            }
        }
        String str = new String(bArr, 0, i3);
        return new ms40(str, GLES20.glGetUniformLocation(i, str), iArr2[0]);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public final void a(boolean z) throws GlUtil.GlException {
        int i;
        int[] iArr = this.e;
        int i2 = this.b;
        int i3 = this.c;
        if (i3 == 5124) {
            GLES20.glUniform1iv(i2, 1, iArr, 0);
            fn31.t();
            return;
        }
        float[] fArr = this.d;
        if (i3 == 5126) {
            GLES20.glUniform1fv(i2, 1, fArr, 0);
            fn31.t();
            return;
        }
        if (i3 != 35815 && i3 != 36198) {
            switch (i3) {
                case 35664:
                    GLES20.glUniform2fv(i2, 1, fArr, 0);
                    fn31.t();
                    return;
                case 35665:
                    GLES20.glUniform3fv(i2, 1, fArr, 0);
                    fn31.t();
                    return;
                case 35666:
                    GLES20.glUniform4fv(i2, 1, fArr, 0);
                    fn31.t();
                    return;
                case 35667:
                    GLES20.glUniform2iv(i2, 1, iArr, 0);
                    fn31.t();
                    return;
                case 35668:
                    GLES20.glUniform3iv(i2, 1, iArr, 0);
                    fn31.t();
                    return;
                case 35669:
                    GLES20.glUniform4iv(i2, 1, iArr, 0);
                    fn31.t();
                    return;
                default:
                    switch (i3) {
                        case 35675:
                            GLES20.glUniformMatrix3fv(i2, 1, false, fArr, 0);
                            fn31.t();
                            return;
                        case 35676:
                            GLES20.glUniformMatrix4fv(i2, 1, false, fArr, 0);
                            fn31.t();
                            return;
                        default:
                            switch (i3) {
                                case 35678:
                                case 35679:
                                    break;
                                default:
                                    eg.m(f4i1.c(i3, "Unexpected uniform type: "));
                                    break;
                            }
                            return;
                    }
            }
        }
        if (this.f == 0) {
            eg.m("No call to setSamplerTexId() before bind.");
            return;
        }
        GLES20.glActiveTexture(this.g + 33984);
        fn31.t();
        int i4 = 9729;
        switch (i3) {
            case 35678:
                i = 3553;
                break;
            case 35679:
                i = 32879;
                break;
            case 35815:
            case 36198:
                i4 = z ? 9728 : 9729;
                i = 36197;
                break;
            default:
                eg.m(f4i1.c(i3, "Unexpected sampler type: "));
                return;
        }
        fn31.r(i, this.f, i4);
        if (i3 == 35678) {
            if (this.h == 9987) {
                GLES20.glGenerateMipmap(3553);
                fn31.t();
            }
            GLES20.glTexParameteri(3553, 10241, this.h);
            fn31.t();
        }
        GLES20.glUniform1i(i2, this.g);
        fn31.t();
    }

    public final void c(float f) {
        this.d[0] = f;
    }

    public final void d(float[] fArr) {
        System.arraycopy(fArr, 0, this.d, 0, fArr.length);
    }

    public final void e(int i) {
        this.e[0] = i;
    }

    public final void f(int i, int i2) {
        this.f = i;
        this.g = i2;
    }
}
