package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class htl implements gdr0 {
    public final float a;
    public final int b;
    public final p3v c;

    public htl(float f, int i, p3v p3vVar) {
        this.a = f;
        this.b = i;
        this.c = p3vVar;
    }

    public final int a(wat watVar, int i) {
        int i2;
        float f;
        float fM0 = watVar.M0(i) + this.a;
        if (p3v.b(fM0, 768.0f) < 0) {
            i2 = 1;
        } else {
            i2 = p3v.b(fM0, 1024.0f) < 0 ? 2 : 3;
        }
        if (this.b <= i2) {
            f = 0.0f;
        } else {
            qim0 qim0Var = ctl.a;
            f = 30.0f;
        }
        float f2 = (fM0 - f) / i2;
        p3v p3vVar = this.c;
        if (p3vVar != null) {
            float f3 = p3vVar.a;
            if (p3v.b(f3, f2) < 0) {
                return watVar.i0(f3);
            }
        }
        return watVar.i0(f2);
    }
}
