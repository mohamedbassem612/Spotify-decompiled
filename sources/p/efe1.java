package p;

import android.opengl.GLES20;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class efe1 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public FloatBuffer f;
    public FloatBuffer g;

    public static int a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        bhn0.g(strGlGetShaderInfoLog, "Shader compile failed: ");
        return 0;
    }
}
