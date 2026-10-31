package p;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class olx0 {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public wz8 b;
    public ns40 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public static boolean b(llx0 llx0Var) {
        klx0 klx0Var = llx0Var.a;
        klx0 klx0Var2 = llx0Var.b;
        w4c0[] w4c0VarArr = klx0Var.a;
        if (w4c0VarArr.length == 1 && w4c0VarArr[0].b == 0) {
            w4c0[] w4c0VarArr2 = klx0Var2.a;
            if (w4c0VarArr2.length == 1 && w4c0VarArr2[0].b == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            ns40 ns40Var = new ns40("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.c = ns40Var;
            this.d = GLES20.glGetUniformLocation(ns40Var.a, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.a, "uTexMatrix");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.c.a, "aPosition");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
            fn31.t();
            this.f = iGlGetAttribLocation;
            int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.c.a, "aTexCoords");
            GLES20.glEnableVertexAttribArray(iGlGetAttribLocation2);
            fn31.t();
            this.g = iGlGetAttribLocation2;
            this.h = GLES20.glGetUniformLocation(this.c.a, "uTexture");
        } catch (GlUtil.GlException e) {
            oon1.w("Failed to initialize the program", e);
        }
    }
}
