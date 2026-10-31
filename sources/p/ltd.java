package p;

import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ltd {
    public final float a;
    public final float b;
    public final float c;

    public ltd(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    public final tob1 a(boolean z, idn0 idn0Var, b0k b0kVar, int i) {
        o95 o95Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1763481333);
        float f = this.a;
        if (idn0Var == null) {
            x340Var.i0(167751211);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = ktd.o(f, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            x340Var.r(false);
            x340Var.r(false);
            return ven0Var;
        }
        x340Var.i0(167824247);
        x340Var.r(false);
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = new bw91();
            x340Var.s0(objT2);
        }
        bw91 bw91Var = (bw91) objT2;
        boolean z2 = true;
        boolean z3 = (((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && x340Var.g(idn0Var)) || (i & 48) == 32;
        Object objT3 = x340Var.T();
        if (z3 || objT3 == m4cVar) {
            objT3 = new vec(idn0Var, bw91Var, null, (byte) 1);
            x340Var.s0(objT3);
        }
        qxd0.t(idn0Var, x340Var, (vu30) objT3);
        qt80 qt80Var = (qt80) o7h.C0(bw91Var);
        if (!z || (qt80Var instanceof r9w0)) {
            f = 0.0f;
        } else if (qt80Var instanceof dy60) {
            f = this.b;
        } else if (qt80Var instanceof ry20) {
            f = 0.0f;
        } else if (qt80Var instanceof o5v) {
            f = this.c;
        }
        Object objT4 = x340Var.T();
        if (objT4 == m4cVar) {
            objT4 = new o95(new p3v(f), rno1.c, (Object) null, 12);
            x340Var.s0(objT4);
        }
        o95 o95Var2 = (o95) objT4;
        p3v p3vVar = new p3v(f);
        boolean zI = x340Var.i(o95Var2) | x340Var.d(f) | ((((i & 14) ^ 6) > 4 && x340Var.h(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !x340Var.g(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean zI2 = zI | z2 | x340Var.i(qt80Var);
        Object objT5 = x340Var.T();
        if (zI2 || objT5 == m4cVar) {
            o95Var = o95Var2;
            wec wecVar = new wec(o95Var, f, z, this, qt80Var, null, (byte) 1);
            x340Var.s0(wecVar);
            objT5 = wecVar;
        } else {
            o95Var = o95Var2;
        }
        qxd0.t(p3vVar, x340Var, (vu30) objT5);
        ie5 ie5Var = o95Var.c;
        x340Var.r(false);
        return ie5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ltd)) {
            return false;
        }
        ltd ltdVar = (ltd) obj;
        return p3v.c(this.a, ltdVar.a) && p3v.c(0.0f, 0.0f) && p3v.c(0.0f, 0.0f) && p3v.c(this.b, ltdVar.b) && p3v.c(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.hashCode(0.0f) + x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, 0.0f), 31, 0.0f), 31, this.b);
    }
}
