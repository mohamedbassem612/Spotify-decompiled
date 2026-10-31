package app.p000rive.core;

import java.util.Map;
import kotlin.Metadata;
import p.eth;
import p.mmr0;
import p.sqg0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lapp/rive/core/EGLError;", "", "()V", "EGL_ERROR_MAP", "", "", "", "getEGL_ERROR_MAP", "()Ljava/util/Map;", "errorString", "eglError", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EGLError {
    public static final EGLError INSTANCE = new EGLError();
    private static final Map<Integer, String> EGL_ERROR_MAP = sqg0.J(new mmr0[]{new mmr0(12288, "EGL_SUCCESS"), new mmr0(12289, "EGL_NOT_INITIALIZED"), new mmr0(12290, "EGL_BAD_ACCESS"), new mmr0(12291, "EGL_BAD_ALLOC"), new mmr0(12292, "EGL_BAD_ATTRIBUTE"), new mmr0(12294, "EGL_BAD_CONTEXT"), new mmr0(12293, "EGL_BAD_CONFIG"), new mmr0(12295, "EGL_BAD_CURRENT_SURFACE"), new mmr0(12296, "EGL_BAD_DISPLAY"), new mmr0(12301, "EGL_BAD_SURFACE"), new mmr0(12297, "EGL_BAD_MATCH"), new mmr0(12300, "EGL_BAD_PARAMETER"), new mmr0(12298, "EGL_BAD_NATIVE_PIXMAP"), new mmr0(12299, "EGL_BAD_NATIVE_WINDOW"), new mmr0(12302, "EGL_CONTEXT_LOST")});
    public static final int $stable = 8;

    private EGLError() {
    }

    public final String errorString(int eglError) {
        String str = EGL_ERROR_MAP.get(Integer.valueOf(eglError));
        if (str != null) {
            return str;
        }
        eth.h(16);
        return "Unknown EGL error 0x".concat(Integer.toString(eglError, 16));
    }

    public final Map<Integer, String> getEGL_ERROR_MAP() {
        return EGL_ERROR_MAP;
    }
}
