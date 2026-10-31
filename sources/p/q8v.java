package p;

import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class q8v {
    public final eca a;
    public c8v b;

    public q8v(eca ecaVar) {
        this.a = ecaVar;
    }

    public abstract void a(Canvas canvas, float f);

    public abstract void b(Canvas canvas, Paint paint, float f, float f2, int i);

    public abstract void c(Canvas canvas, Paint paint);

    public int d() {
        ucg ucgVar = (ucg) this.a;
        return (ucgVar.h * 2) + ucgVar.g;
    }

    public int e() {
        ucg ucgVar = (ucg) this.a;
        return (ucgVar.h * 2) + ucgVar.g;
    }
}
