package p;

import android.opengl.EGLContext;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aow {
    public final EGLContext a;
    public final EGLSurface b;

    public aow(EGLContext eGLContext, EGLSurface eGLSurface) {
        this.a = eGLContext;
        this.b = eGLSurface;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aow)) {
            return false;
        }
        aow aowVar = (aow) obj;
        return this.a.equals(aowVar.a) && this.b.equals(aowVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
