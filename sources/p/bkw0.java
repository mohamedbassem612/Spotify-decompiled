package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bkw0 extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ o8a c;
    public final /* synthetic */ float[] d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ l811 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkw0(long j, long j2, o8a o8aVar, float[] fArr, float f, float f2, l811 l811Var) {
        super(1);
        this.a = j;
        this.b = j2;
        this.c = o8aVar;
        this.d = fArr;
        this.e = f;
        this.f = f2;
        this.g = l811Var;
    }

    public final Object invoke(Object obj) {
        o8a o8aVar;
        float fO = yoi1.o(((((Number) obj).longValue() - this.a) / 1000000) / this.b, 0.0f, 1.0f);
        float fA = klv.c.a(fO);
        int i = 0;
        while (true) {
            o8aVar = this.c;
            if (i >= 24) {
                break;
            }
            o8aVar.a.set(i, Float.valueOf((1.0f - fA) * this.d[i]));
            i++;
        }
        float f = this.e;
        o8aVar.b.t(l1d.e(this.f, f, fA, f));
        if (fO >= 1.0f) {
            this.g.a = true;
        }
        return rih1.a;
    }
}
