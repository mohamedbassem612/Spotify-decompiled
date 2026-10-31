package p;

import android.opengl.GLES20;
import com.spotify.pagematch.elements.cameralayer.OpenGLException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zb5 {
    public int a;
    public int b;
    public int c;
    public int d;
    public float y;
    public final float[] e = new float[16];
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public int m = -1;
    public int n = -1;
    public int o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f184p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public float z = 0.5f;
    public float A = 1.0f;
    public float B = 20.0f;
    public float C = 0.2f;
    public float D = 0.2f;
    public float E = 0.2f;
    public float F = 0.5f;
    public float G = 1.0f;
    public float H = 1.0f;
    public float I = 1.0f;

    public static int a(int i, String str) throws OpenGLException {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new OpenGLException(l1d.m("Shader compilation failed: ", strGlGetShaderInfoLog));
    }
}
