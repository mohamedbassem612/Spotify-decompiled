package p;

import android.content.Context;
import android.opengl.GLES20;
import android.os.Build;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ns40 {
    public final int a;
    public final ls40[] b;
    public final ms40[] c;
    public final HashMap d;
    public final HashMap e;
    public boolean f;

    public ns40(String str, String str2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.a = iGlCreateProgram;
        fn31.t();
        a(iGlCreateProgram, 35633, str);
        a(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        fn31.u("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.b = new ls40[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            ls40 ls40VarB = ls40.b(this.a, i);
            this.b[i] = ls40VarB;
            this.d.put(ls40VarB.a, ls40VarB);
        }
        this.e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr3, 0);
        this.c = new ms40[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            ms40 ms40VarB = ms40.b(this.a, i2);
            this.c[i2] = ms40VarB;
            this.e.put(ms40VarB.a, ms40VarB);
        }
        fn31.t();
    }

    public static void a(int i, int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        fn31.u(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        fn31.t();
    }

    public final void b() {
        for (ls40 ls40Var : this.b) {
            ls40Var.a();
        }
        for (ms40 ms40Var : this.c) {
            ms40Var.a(this.f);
        }
    }

    public final void c() {
        if (Build.VERSION.SDK_INT == 28) {
            return;
        }
        GLES20.glDeleteProgram(this.a);
        fn31.t();
    }

    public final void d(float[] fArr) {
        ls40 ls40Var = (ls40) this.d.get("aFramePosition");
        ls40Var.getClass();
        ls40Var.c(fArr);
    }

    public final void e(String str, float f) {
        ms40 ms40Var = (ms40) this.e.get(str);
        ms40Var.getClass();
        ms40Var.c(f);
    }

    public final void f(String str, float[] fArr) {
        ms40 ms40Var = (ms40) this.e.get(str);
        ms40Var.getClass();
        ms40Var.d(fArr);
    }

    public final void g(int i, String str) {
        ms40 ms40Var = (ms40) this.e.get(str);
        ms40Var.getClass();
        ms40Var.e(i);
    }

    public final void h(int i, int i2, String str) {
        ms40 ms40Var = (ms40) this.e.get(str);
        ms40Var.getClass();
        ms40Var.f(i, i2);
    }

    public ns40(Context context, int i, int i2) {
        this(zoi1.U(context, i), zoi1.U(context, i2));
    }
}
