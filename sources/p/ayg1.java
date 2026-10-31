package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ayg1 {
    public Float a;
    public jfe b;

    public final jfe a(int i, int i2, x340 x340Var) {
        m4c m4cVar = fkj0.X;
        boolean z = (((i2 & 14) ^ 6) > 4 && x340Var.e(i)) || (i2 & 6) == 4;
        Object objT = x340Var.T();
        if (z || objT == m4cVar) {
            objT = mno1.a(-1, 0, 6);
            x340Var.s0(objT);
        }
        jfe jfeVar = (jfe) objT;
        boolean zI = x340Var.i(this) | x340Var.i(jfeVar);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new rzf1(this, jfeVar, (byte) 8);
            x340Var.s0(objT2);
        }
        qxd0.i(jfeVar, (iu30) objT2, x340Var);
        return jfeVar;
    }

    public final void b(float f) {
        if (Math.abs(f) > Float.MAX_VALUE || u890.h(this.a, f)) {
            return;
        }
        this.a = Float.valueOf(f);
        jfe jfeVar = this.b;
        if (jfeVar != null) {
            jfeVar.l(new rj31("yNormalised", yoi1.o(f, 0.0f, 1.0f)));
        }
    }
}
