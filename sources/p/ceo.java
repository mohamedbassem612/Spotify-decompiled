package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ceo implements dlv {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public ceo(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            StringBuilder sbM = gvg.m("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f, ", ", f2, ", ");
            sbM.append(f3);
            sbM.append(", ");
            sbM.append(f4);
            sbM.append(".");
            dmv0.a(sbM.toString());
        }
        long jO = xap1.o(f2, f4, new float[5]);
        this.e = Float.intBitsToFloat((int) (jO >> 32));
        this.f = Float.intBitsToFloat((int) (jO & 4294967295L));
    }

    @Override // p.dlv
    public final float a(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float fMax = Math.max(f, 1.1920929E-7f);
        float f2 = this.a;
        float f3 = this.c;
        float fT = xap1.t(0.0f - fMax, f2 - fMax, f3 - fMax, 1.0f - fMax);
        boolean zIsNaN = Float.isNaN(fT);
        float f4 = this.d;
        float f5 = this.b;
        if (zIsNaN) {
            StringBuilder sbM = gvg.m("The cubic curve with parameters (", f2, ", ", f5, ", ");
            gvg.t(sbM, f3, ", ", f4, ") has no solution at ");
            sbM.append(f);
            throw new IllegalArgumentException(sbM.toString());
        }
        float fR = xap1.r(f5, f4, fT);
        float f6 = this.e;
        if (fR < f6) {
            fR = f6;
        }
        float f7 = this.f;
        return fR > f7 ? f7 : fR;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ceo)) {
            return false;
        }
        ceo ceoVar = (ceo) obj;
        return this.a == ceoVar.a && this.b == ceoVar.b && this.c == ceoVar.c && this.d == ceoVar.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbM = gvg.m("CubicBezierEasing(a=", this.a, ", b=", this.b, ", c=");
        sbM.append(this.c);
        sbM.append(", d=");
        sbM.append(this.d);
        sbM.append(")");
        return sbM.toString();
    }
}
