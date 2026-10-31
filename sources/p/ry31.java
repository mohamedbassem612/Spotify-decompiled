package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ry31 extends jmr0 {
    public final float f;
    public final p3v g;
    public final boolean h;

    public ry31(float f, p3v p3vVar, boolean z) {
        this.f = f;
        this.g = p3vVar;
        this.h = z;
    }

    public final long i() {
        return 9205357640488583168L;
    }

    public final void j(DrawScope drawScope) {
        float f = this.f;
        float fX0 = this.h ? 0.0f : drawScope.X0(qy31.a);
        ((dg8) drawScope.a1().b).r(fX0, fX0, fX0, fX0);
        try {
            p3v p3vVar = this.g;
            Float fValueOf = p3vVar != null ? Float.valueOf(drawScope.X0(p3vVar.a) - fX0) : null;
            qy31.b(drawScope, f, fValueOf);
            qy31.d(drawScope, f, fValueOf);
            qy31.c(drawScope, f, fValueOf);
            qy31.a(drawScope, f, fValueOf);
        } finally {
            float f2 = -fX0;
            ((dg8) drawScope.a1().b).r(f2, f2, f2, f2);
        }
    }
}
