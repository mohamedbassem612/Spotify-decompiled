package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tb91 implements r6v {
    public final int a;
    public Function0 b;
    public final ksg c;
    public final drr0 d;
    public iu30 e;
    public final boolean f = true;
    public final float[] g;
    public final err0 h;
    public final err0 i;
    public boolean j;
    public final err0 k;
    public final err0 l;
    public final qqq0 m;
    public final hrr0 n;
    public final ww21 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final drr0 f138p;
    public final drr0 q;
    public final p24 r;
    public final pfn0 s;

    public tb91(float f, int i, Function0 function0, ksg ksgVar) {
        float[] fArr;
        this.a = i;
        this.b = function0;
        this.c = ksgVar;
        this.d = new drr0(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.g = fArr;
        this.h = new err0(0);
        this.i = new err0(0);
        this.k = new err0(0);
        this.l = new err0(0);
        this.m = qqq0.b;
        this.n = v8r.q(Boolean.FALSE);
        this.o = new ww21(this, (byte) 11);
        ksg ksgVar2 = this.c;
        float fFloatValue = ((Number) ksgVar2.m()).floatValue();
        float fFloatValue2 = ((Number) ksgVar2.n()).floatValue() - fFloatValue;
        this.f138p = new drr0(dm5.T(0.0f, 0.0f, yoi1.o(fFloatValue2 == 0.0f ? 0.0f : (f - fFloatValue) / fFloatValue2, 0.0f, 1.0f)));
        this.q = new drr0(0.0f);
        this.r = new p24(this, (byte) 3);
        this.s = new pfn0();
    }

    @Override // p.r6v
    public final Object a(swn swnVar, rzu rzuVar) {
        Object objS = smo1.s(new sb91(this, swnVar, (lnm) null, (byte) 0), rzuVar);
        return objS == d9n.a ? objS : rih1.a;
    }

    public final void b(float f) {
        float fMax;
        float fMin;
        if (this.m == qqq0.a) {
            float fS = this.i.s();
            err0 err0Var = this.l;
            fMax = Math.max(fS - (err0Var.s() / 2.0f), 0.0f);
            fMin = Math.min(err0Var.s() / 2.0f, fMax);
        } else {
            float fS2 = this.h.s();
            err0 err0Var2 = this.k;
            fMax = Math.max(fS2 - (err0Var2.s() / 2.0f), 0.0f);
            fMin = Math.min(err0Var2.s() / 2.0f, fMax);
        }
        drr0 drr0Var = this.f138p;
        float fS3 = drr0Var.s() + f;
        drr0 drr0Var2 = this.q;
        drr0Var.t(drr0Var2.s() + fS3);
        drr0Var2.t(0.0f);
        float fD = rb91.d(drr0Var.s(), fMin, fMax, this.g);
        ksg ksgVar = this.c;
        float f2 = fMax - fMin;
        float fT = dm5.T(((Number) ksgVar.m()).floatValue(), ((Number) ksgVar.n()).floatValue(), yoi1.o(f2 == 0.0f ? 0.0f : (fD - fMin) / f2, 0.0f, 1.0f));
        if (fT == this.d.s()) {
            return;
        }
        iu30 iu30Var = this.e;
        if (iu30Var != null) {
            iu30Var.invoke(Float.valueOf(fT));
        } else {
            d(fT);
        }
    }

    public final float c() {
        ksg ksgVar = this.c;
        float fFloatValue = ((Number) ksgVar.m()).floatValue();
        float fFloatValue2 = ((Number) ksgVar.n()).floatValue() - fFloatValue;
        return yoi1.o(fFloatValue2 == 0.0f ? 0.0f : (yoi1.o(this.d.s(), ((Number) ksgVar.m()).floatValue(), ((Number) ksgVar.n()).floatValue()) - fFloatValue) / fFloatValue2, 0.0f, 1.0f);
    }

    public final void d(float f) {
        if (this.f) {
            ksg ksgVar = this.c;
            f = rb91.d(yoi1.o(f, ((Number) ksgVar.m()).floatValue(), ((Number) ksgVar.n()).floatValue()), ((Number) ksgVar.m()).floatValue(), ((Number) ksgVar.n()).floatValue(), this.g);
        }
        this.d.t(f);
    }
}
