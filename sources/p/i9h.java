package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i9h extends jmr0 {
    public final long f;
    public float g = 1.0f;
    public ColorFilter h;

    public i9h(long j) {
        this.f = j;
    }

    @Override // p.jmr0
    public final boolean a(float f) {
        this.g = f;
        return true;
    }

    @Override // p.jmr0
    public final boolean c(ColorFilter colorFilter) {
        this.h = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9h)) {
            return false;
        }
        long j = ((i9h) obj).f;
        int i = u7h.l;
        return z4h1.b(this.f, j);
    }

    public final int hashCode() {
        int i = u7h.l;
        return z4h1.c(this.f);
    }

    @Override // p.jmr0
    public final void j(DrawScope drawScope) {
        DrawScope.d0(drawScope, this.f, 0L, 0L, this.g, null, this.h, 86);
    }

    public final String toString() {
        return f4i1.f("ColorPainter(color=", u7h.h(this.f), ")");
    }
}
