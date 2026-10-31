package p;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p19 {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public p19(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface == null) {
            bhn0.i("Null eglSurface");
            throw null;
        }
        this.a = eGLSurface;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p19) {
            p19 p19Var = (p19) obj;
            if (this.a.equals(p19Var.a) && this.b == p19Var.b && this.c == p19Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return gvg.j(sb, this.c, "}");
    }
}
