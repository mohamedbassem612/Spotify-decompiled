package p;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ls40 {
    public final String a;
    public final int b;
    public FloatBuffer c;
    public byte d;

    public ls40(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static ls40 b(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(i, 35722, iArr, 0);
        int i3 = iArr[0];
        byte[] bArr = new byte[i3];
        GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4] == 0) {
                i3 = i4;
                break;
            }
        }
        String str = new String(bArr, 0, i3);
        return new ls40(str, GLES20.glGetAttribLocation(i, str));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    public final void a() throws GlUtil.GlException {
        FloatBuffer floatBuffer = this.c;
        dm5.s(floatBuffer, "call setBuffer before bind");
        GLES20.glBindBuffer(34962, 0);
        GLES20.glVertexAttribPointer(this.b, (int) this.d, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.b);
        fn31.t();
    }

    public final void c(float[] fArr) {
        this.c = fn31.C(fArr);
        this.d = (byte) 4;
    }
}
