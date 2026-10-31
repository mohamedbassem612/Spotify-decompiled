package p;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.spotify.pagematch.elements.cameralayer.OpenGLException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ac5 implements Runnable {
    public final /* synthetic */ ec5 a;
    public final /* synthetic */ SurfaceTexture b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public ac5(ec5 ec5Var, SurfaceTexture surfaceTexture, int i, int i2) {
        this.a = ec5Var;
        this.b = surfaceTexture;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws OpenGLException {
        ec5 ec5Var = this.a;
        zb5 zb5Var = ec5Var.a;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        if (u890.j(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY) || !EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            throw new OpenGLException("eglGetDisplay or eglInitialize failed");
        }
        ec5Var.b = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0);
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (!zEglChooseConfig || eGLConfig == null) {
            throw new OpenGLException("eglChooseConfig failed or no config found");
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (u890.j(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            throw new OpenGLException("eglCreateContext failed");
        }
        ec5Var.c = eGLContextEglCreateContext;
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplayEglGetDisplay, eGLConfig, this.b, new int[]{12344}, 0);
        if (u890.j(eGLSurfaceEglCreateWindowSurface, EGL14.EGL_NO_SURFACE) || !EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, eGLContextEglCreateContext)) {
            throw new OpenGLException("eglCreateWindowSurface or eglMakeCurrent failed");
        }
        ec5Var.d = eGLSurfaceEglCreateWindowSurface;
        zb5Var.getClass();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        int iA = zb5.a(35633, "uniform mat4 uMVPMatrix;\nattribute vec2 aPosition;\nattribute float aProgress;\nattribute float aEdgeDistance;\nvarying float vProgress;\nvarying float vEdgeDistance;\n\nvoid main() {\n    gl_Position = uMVPMatrix * vec4(aPosition, 0.0, 1.0);\n    vProgress = aProgress;\n    vEdgeDistance = aEdgeDistance;\n}");
        int iA2 = zb5.a(35632, "precision mediump float;\n\nvarying float vProgress;\nvarying float vEdgeDistance;\n\nuniform float uStrokeWidth;\nuniform vec3 uBaseColor;\nuniform float uBaseAlpha;\n\nconst float AA_WIDTH = 0.10;\nconst float MAX_MESH_WIDTH = 40.0;\n\nvoid main() {\n    float normalizedEdge = vEdgeDistance * MAX_MESH_WIDTH / uStrokeWidth;\n\n    if (normalizedEdge > 1.0) {\n        discard;\n    }\n\n    float edgeFactor = 1.0 - smoothstep(1.0 - AA_WIDTH, 1.0, normalizedEdge);\n    float alpha = uBaseAlpha * edgeFactor;\n    gl_FragColor = vec4(uBaseColor, alpha);\n}");
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iA);
        GLES20.glAttachShader(iGlCreateProgram, iA2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr2, 0);
        if (iArr2[0] == 0) {
            String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
            GLES20.glDeleteProgram(iGlCreateProgram);
            throw new OpenGLException(l1d.m("Base program linking failed: ", strGlGetProgramInfoLog));
        }
        zb5Var.a = iGlCreateProgram;
        GLES20.glDeleteShader(iA);
        GLES20.glDeleteShader(iA2);
        int iA3 = zb5.a(35633, "uniform mat4 uMVPMatrix;\nattribute vec2 aPosition;\nattribute float aProgress;\nattribute float aEdgeDistance;\nvarying float vProgress;\nvarying float vEdgeDistance;\n\nvoid main() {\n    gl_Position = uMVPMatrix * vec4(aPosition, 0.0, 1.0);\n    vProgress = aProgress;\n    vEdgeDistance = aEdgeDistance;\n}");
        int iA4 = zb5.a(35632, "precision mediump float;\n\nvarying float vProgress;\nvarying float vEdgeDistance;\n\nuniform float uSnake1Start;\nuniform float uSnake2Start;\nuniform float uSnakeLength;\nuniform float uGlobalAlpha;\nuniform float uFadeStart;\nuniform float uFadeEnd;\nuniform float uStrokeWidth;\nuniform vec3 uSnakeColor;\n\nconst float AA_WIDTH = 0.10;\nconst float MAX_MESH_WIDTH = 40.0;\n\nbool isInSnake(float progress, float start, float length) {\n    float end = start + length;\n    if (end <= 1.0) {\n        return progress >= start && progress <= end;\n    } else {\n        return progress >= start || progress <= (end - 1.0);\n    }\n}\n\nfloat getLocalProgress(float progress, float start, float length) {\n    float diff = progress - start;\n    if (diff < 0.0) diff += 1.0;\n    return diff / length;\n}\n\nvoid main() {\n    float normalizedEdge = vEdgeDistance * MAX_MESH_WIDTH / uStrokeWidth;\n\n    if (normalizedEdge > 1.0) {\n        discard;\n    }\n\n    bool inSnake1 = isInSnake(vProgress, uSnake1Start, uSnakeLength);\n    bool inSnake2 = isInSnake(vProgress, uSnake2Start, uSnakeLength);\n\n    if (!inSnake1 && !inSnake2) {\n        discard;\n    }\n\n    float localProgress = inSnake1\n        ? getLocalProgress(vProgress, uSnake1Start, uSnakeLength)\n        : getLocalProgress(vProgress, uSnake2Start, uSnakeLength);\n\n    float alpha = 1.0;\n    if (localProgress < uFadeStart) {\n        alpha = smoothstep(0.0, uFadeStart, localProgress);\n    } else if (localProgress > uFadeEnd) {\n        alpha = smoothstep(1.0, uFadeEnd, localProgress);\n    }\n\n    float edgeFactor = 1.0 - smoothstep(1.0 - AA_WIDTH, 1.0, normalizedEdge);\n    alpha *= edgeFactor * uGlobalAlpha;\n    gl_FragColor = vec4(uSnakeColor, alpha);\n}");
        int iGlCreateProgram2 = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram2, iA3);
        GLES20.glAttachShader(iGlCreateProgram2, iA4);
        GLES20.glLinkProgram(iGlCreateProgram2);
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram2, 35714, iArr3, 0);
        if (iArr3[0] == 0) {
            String strGlGetProgramInfoLog2 = GLES20.glGetProgramInfoLog(iGlCreateProgram2);
            GLES20.glDeleteProgram(iGlCreateProgram2);
            throw new OpenGLException(l1d.m("Snake program linking failed: ", strGlGetProgramInfoLog2));
        }
        zb5Var.b = iGlCreateProgram2;
        GLES20.glDeleteShader(iA3);
        GLES20.glDeleteShader(iA4);
        zb5Var.f = GLES20.glGetUniformLocation(zb5Var.a, "uMVPMatrix");
        zb5Var.g = GLES20.glGetUniformLocation(zb5Var.a, "uStrokeWidth");
        zb5Var.h = GLES20.glGetUniformLocation(zb5Var.a, "uBaseColor");
        zb5Var.i = GLES20.glGetUniformLocation(zb5Var.a, "uBaseAlpha");
        zb5Var.j = GLES20.glGetAttribLocation(zb5Var.a, "aPosition");
        zb5Var.k = GLES20.glGetAttribLocation(zb5Var.a, "aProgress");
        zb5Var.l = GLES20.glGetAttribLocation(zb5Var.a, "aEdgeDistance");
        zb5Var.m = GLES20.glGetUniformLocation(zb5Var.b, "uMVPMatrix");
        zb5Var.n = GLES20.glGetUniformLocation(zb5Var.b, "uSnake1Start");
        zb5Var.o = GLES20.glGetUniformLocation(zb5Var.b, "uSnake2Start");
        zb5Var.f184p = GLES20.glGetUniformLocation(zb5Var.b, "uSnakeLength");
        zb5Var.q = GLES20.glGetUniformLocation(zb5Var.b, "uGlobalAlpha");
        zb5Var.r = GLES20.glGetUniformLocation(zb5Var.b, "uFadeStart");
        zb5Var.s = GLES20.glGetUniformLocation(zb5Var.b, "uFadeEnd");
        zb5Var.t = GLES20.glGetUniformLocation(zb5Var.b, "uStrokeWidth");
        zb5Var.u = GLES20.glGetUniformLocation(zb5Var.b, "uSnakeColor");
        zb5Var.v = GLES20.glGetAttribLocation(zb5Var.b, "aPosition");
        zb5Var.w = GLES20.glGetAttribLocation(zb5Var.b, "aProgress");
        zb5Var.x = GLES20.glGetAttribLocation(zb5Var.b, "aEdgeDistance");
        int[] iArr4 = new int[1];
        GLES20.glGenBuffers(1, iArr4, 0);
        zb5Var.c = iArr4[0];
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        zb5Var.getClass();
        int i = this.c;
        int i2 = this.d;
        GLES20.glViewport(0, 0, i, i2);
        Matrix.orthoM(zb5Var.e, 0, 0.0f, i, 0.0f, i2, -1.0f, 1.0f);
        ec5Var.a();
    }
}
