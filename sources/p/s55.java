package p;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Choreographer;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s55 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s55(byte b) {
        super(2, (lnm) null);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new s55(2, lnmVar, (byte) 0);
            case 1:
                return new s55(2, lnmVar, (byte) 1);
            case 2:
                return new s55(2, lnmVar, (byte) 2);
            case 3:
                return new s55(2, lnmVar, (byte) 3);
            case 4:
                return new s55(2, lnmVar, (byte) 4);
            case 5:
                return new s55(2, lnmVar, (byte) 5);
            case 6:
                return new s55(2, lnmVar, (byte) 6);
            case 7:
                return new s55(2, lnmVar, (byte) 7);
            case 8:
                return new s55(2, lnmVar, (byte) 8);
            case 9:
                return new s55(2, lnmVar, (byte) 9);
            case 10:
                return new s55(2, lnmVar, (byte) 10);
            case 11:
                return new s55(2, lnmVar, (byte) 11);
            case 12:
                return new s55(2, lnmVar, (byte) 12);
            case 13:
                return new s55(2, lnmVar, (byte) 13);
            case 14:
                return new s55(2, lnmVar, (byte) 14);
            case 15:
                return new s55(2, lnmVar, (byte) 15);
            case 16:
                return new s55(2, lnmVar, (byte) 16);
            case 17:
                return new s55(2, lnmVar, (byte) 17);
            case 18:
                return new s55(2, lnmVar, (byte) 18);
            case 19:
                return new s55(2, lnmVar, (byte) 19);
            case 20:
                return new s55(2, lnmVar, (byte) 20);
            case 21:
                return new s55(2, lnmVar, (byte) 21);
            case 22:
                return new s55(2, lnmVar, (byte) 22);
            case 23:
                return new s55(2, lnmVar, (byte) 23);
            case 24:
                return new s55(2, lnmVar, (byte) 24);
            case 25:
                return new s55(2, lnmVar, (byte) 25);
            case 26:
                return new s55(2, lnmVar, (byte) 26);
            case 27:
                return new s55(2, lnmVar, (byte) 27);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new s55(2, lnmVar, (byte) 28);
            default:
                return new s55(2, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = 2;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((jnd0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create(obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                String str = ((gq0) obj).a;
                new s55(i, (lnm) obj2, (byte) 8).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                String str2 = ((gq0) obj).a;
                new s55(i, (lnm) obj2, (byte) 9).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                String str3 = ((gq0) obj).a;
                new s55(i, (lnm) obj2, (byte) 10).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((Throwable) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return Boolean.TRUE;
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                String str4 = ((gq0) obj).a;
                new s55(i, (lnm) obj2, (byte) 14).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((bs41) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 18:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 21:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((bs41) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 23:
                create((r591) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 24:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 25:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                String str5 = ((gq0) obj).a;
                new s55(i, (lnm) obj2, (byte) 27).invokeSuspend(rih1Var);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                String str6 = ((gq0) obj).a;
                new s55(i, (lnm) obj2, (byte) 28).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                String str7 = ((gq0) obj).a;
                new s55(i, (lnm) obj2, (byte) 29).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        String m231Var;
        String str;
        EGLConfig eGLConfig;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                return Choreographer.getInstance();
            case 1:
                hm5.M(obj);
                return Choreographer.getInstance();
            case 2:
                hm5.M(obj);
                return rih1Var;
            case 3:
                hm5.M(obj);
                return rih1Var;
            case 4:
                hm5.M(obj);
                bpb1 bpb1Var = fk41.b;
                lnn1.t();
                return rih1Var;
            case 5:
                hm5.M(obj);
                return rih1Var;
            case 6:
                hm5.M(obj);
                return rih1Var;
            case 7:
                hm5.M(obj);
                return rih1Var;
            case 8:
                hm5.M(obj);
                return rih1Var;
            case 9:
                hm5.M(obj);
                return rih1Var;
            case 10:
                hm5.M(obj);
                return rih1Var;
            case 11:
                hm5.M(obj);
                return Boolean.TRUE;
            case 12:
                hm5.M(obj);
                try {
                    EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                    if (u890.j(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
                        str = "unknown (no display)";
                    } else {
                        int[] iArr = new int[2];
                        EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1);
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        int[] iArr2 = new int[1];
                        if (!EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12339, 1, 12324, 8, 12323, 8, 12322, 8, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] == 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                            str = "unknown (no config)";
                        } else {
                            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
                            try {
                                if (EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                                    m231Var = GLES20.glGetString(7937);
                                    if (m231Var == null) {
                                        m231Var = "unknown";
                                    }
                                    String strGlGetString = GLES20.glGetString(7936);
                                    if (strGlGetString != null && !ihc1.y0(strGlGetString) && !ihc1.h0(m231Var, strGlGetString, true)) {
                                        m231Var = strGlGetString + " " + m231Var;
                                    }
                                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                                    EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                                    EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                } else {
                                    m231Var = "unknown (makeCurrent failed)";
                                    EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                                    EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                                    EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                }
                                str = m231Var;
                            } finally {
                                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                                EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                                EGL14.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                                EGL14.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglCreateContext);
                            }
                        }
                    }
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                return e331.a(str) == null ? str : "unknown";
            case 13:
                hm5.M(obj);
                return rih1Var;
            case 14:
                hm5.M(obj);
                return rih1Var;
            case 15:
                hm5.M(obj);
                return rih1Var;
            case 16:
                hm5.M(obj);
                return rih1Var;
            case 17:
                hm5.M(obj);
                return rih1Var;
            case 18:
                hm5.M(obj);
                return rih1Var;
            case 19:
                hm5.M(obj);
                return rih1Var;
            case 20:
                hm5.M(obj);
                return rih1Var;
            case 21:
                hm5.M(obj);
                return rih1Var;
            case 22:
                hm5.M(obj);
                return rih1Var;
            case 23:
                hm5.M(obj);
                return rih1Var;
            case 24:
                hm5.M(obj);
                return rih1Var;
            case 25:
                hm5.M(obj);
                return rih1Var;
            case 26:
                hm5.M(obj);
                return rih1Var;
            case 27:
                hm5.M(obj);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                hm5.M(obj);
                return rih1Var;
            default:
                hm5.M(obj);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s55(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
