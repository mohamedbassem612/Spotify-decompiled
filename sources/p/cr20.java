package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cr20 extends tua0 {
    @Override // p.fba
    public final Object f(sua0 sua0Var, float f) {
        return Float.valueOf(l(sua0Var, f));
    }

    public final float k() {
        return l(this.c.c(), c());
    }

    public final float l(sua0 sua0Var, float f) {
        float f2;
        Object obj = sua0Var.b;
        Object obj2 = sua0Var.b;
        if (obj == null || sua0Var.c == null) {
            eg.m("Missing values for keyframe.");
            return 0.0f;
        }
        j2e0 j2e0Var = this.e;
        if (j2e0Var != null) {
            f2 = f;
            Float f3 = (Float) j2e0Var.j(sua0Var.g, sua0Var.h.floatValue(), (Float) obj2, (Float) sua0Var.c, f2, d(), this.d);
            if (f3 != null) {
                return f3.floatValue();
            }
        } else {
            f2 = f;
        }
        float fFloatValue = sua0Var.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Float) obj2).floatValue();
            sua0Var.i = fFloatValue;
        }
        float fFloatValue2 = sua0Var.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Float) sua0Var.c).floatValue();
            sua0Var.j = fFloatValue2;
        }
        return itj0.e(fFloatValue, fFloatValue2, f2);
    }
}
