package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rpo implements d6o0 {
    public final /* synthetic */ l811 a;
    public final /* synthetic */ upo b;
    public final /* synthetic */ l811 c;
    public final /* synthetic */ c9n d;
    public final /* synthetic */ o8n e;
    public final /* synthetic */ float f;
    public final /* synthetic */ hnf g;
    public final /* synthetic */ hnf h;

    public rpo(l811 l811Var, upo upoVar, l811 l811Var2, c9n c9nVar, o8n o8nVar, float f, hnf hnfVar, hnf hnfVar2) {
        this.a = l811Var;
        this.b = upoVar;
        this.c = l811Var2;
        this.d = c9nVar;
        this.e = o8nVar;
        this.f = f;
        this.g = hnfVar;
        this.h = hnfVar2;
    }

    public final long M(int i, long j) {
        int i2 = (int) (4294967295L & j);
        if (Float.intBitsToFloat(i2) == 0.0f) {
            return 0L;
        }
        upo upoVar = this.b;
        if (i == 1) {
            l811 l811Var = this.a;
            if (!l811Var.a) {
                l811Var.a = true;
                upoVar.j++;
                upoVar.b.setValue(Boolean.FALSE);
                upoVar.i = upoVar.c();
            }
        }
        l811 l811Var2 = this.c;
        if (l811Var2.a || upoVar.c() == wy71.a) {
            if (i == 1) {
                upoVar.b(Float.intBitsToFloat(i2));
            }
            return j;
        }
        if (i != 1 || upoVar.c() != wy71.b || Float.intBitsToFloat(i2) >= 0.0f || upoVar.a.s() <= 0.0f) {
            return 0L;
        }
        l811Var2.a = true;
        upoVar.b(Float.intBitsToFloat(i2));
        return j;
    }

    public final Object Q0(long j, long j2, lnm lnmVar) {
        this.a.a = false;
        this.c.a = false;
        return new qui1(0L);
    }

    public final long h0(int i, long j, long j2) {
        l811 l811Var = this.c;
        if (l811Var.a) {
            return j2;
        }
        if (i != 1) {
            return 0L;
        }
        upo upoVar = this.b;
        if (upoVar.c() != wy71.b) {
            return 0L;
        }
        int i2 = (int) (4294967295L & j2);
        if (Float.intBitsToFloat(i2) <= 0.0f || upoVar.b(Float.intBitsToFloat(i2)) == 0.0f) {
            return 0L;
        }
        l811Var.a = true;
        return j2;
    }

    public final Object k0(long j, lnm lnmVar) {
        if (!this.c.a && this.b.c() != wy71.a) {
            return new qui1(0L);
        }
        fn31.T(this.d, this.e, 0, new qpo(this.b, j, this.f, this.g, this.h, null), 2);
        return new qui1(j);
    }
}
