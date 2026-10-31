package p;

import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lw4 {
    public final Paint a;
    public int b = 3;
    public Shader c;
    public ColorFilter d;
    public uw4 e;

    public lw4(Paint paint) {
        this.a = paint;
    }

    public final void a(float f) {
        fdg1.X(this.a, f);
    }

    public final void b(int i) {
        if (jm5.j(this.b, i)) {
            return;
        }
        this.b = i;
        fdg1.Y(this.a, i);
    }

    public final void c(long j) {
        fdg1.Z(this.a, j);
    }

    public final void d(ColorFilter colorFilter) {
        this.d = colorFilter;
        fdg1.a0(this.a, colorFilter);
    }

    public final void e(Shader shader) {
        this.c = shader;
        fdg1.d0(this.a, shader);
    }

    public final void f(float f) {
        fdg1.h0(this.a, f);
    }

    public final void g(int i) {
        fdg1.i0(this.a, i);
    }
}
