package p;

import androidx.compose.ui.input.pointer.CancelTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i8d1 implements wat, lnm {
    public final /* synthetic */ j8d1 a;
    public final ohd b;
    public ohd c;
    public cav0 d = cav0.b;
    public final /* synthetic */ j8d1 e;

    public i8d1(j8d1 j8d1Var, ohd ohdVar) {
        this.e = j8d1Var;
        this.a = j8d1Var;
        this.b = ohdVar;
    }

    @Override // p.wat
    public final long I(int i) {
        return this.a.I(i);
    }

    @Override // p.wat
    public final long L(float f) {
        return this.a.L(f);
    }

    @Override // p.wat
    public final float M0(int i) {
        return this.a.M0(i);
    }

    @Override // p.wat
    public final float N0(float f) {
        return f / this.a.h();
    }

    @Override // p.wat
    public final float U0() {
        return this.a.U0();
    }

    @Override // p.wat
    public final float X0(float f) {
        return this.a.h() * f;
    }

    public final Object a(cav0 cav0Var, lnm lnmVar) {
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        this.d = cav0Var;
        this.c = ohdVar;
        return ohdVar.r();
    }

    public final long b() {
        j8d1 j8d1Var = this.e;
        long jK1 = j8d1Var.k1(oap1.B(j8d1Var).b1.e());
        long j = j8d1Var.Y0;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK1 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK1 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final e8k1 c() {
        return oap1.B(this.e).b1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, vu30 vu30Var, faa faaVar) {
        g8d1 g8d1Var;
        ohd ohdVar;
        if (faaVar instanceof g8d1) {
            g8d1Var = (g8d1) faaVar;
            int i = g8d1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                g8d1Var.d = i - Integer.MIN_VALUE;
            } else {
                g8d1Var = new g8d1(this, faaVar);
            }
        } else {
            g8d1Var = new g8d1(this, faaVar);
        }
        Object objInvoke = g8d1Var.b;
        int i2 = g8d1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objInvoke);
                if (j <= 0 && (ohdVar = this.c) != null) {
                    ohdVar.resumeWith(new m231(new PointerEventTimeoutCancellationException(j)));
                }
                this = c921.y(this.e.v1(), (o8n) null, 0, new jt0(j, this, (lnm) null, (byte) 2), 3);
                g8d1Var.a = this;
                g8d1Var.d = 1;
                objInvoke = vu30Var.invoke(this, g8d1Var);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = g8d1Var.a;
                hm5.M(objInvoke);
            }
            this.d(CancelTimeoutCancellationException.a);
            return objInvoke;
        } catch (Throwable th) {
            this.d(CancelTimeoutCancellationException.a);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j, vu30 vu30Var, faa faaVar) {
        h8d1 h8d1Var;
        if (faaVar instanceof h8d1) {
            h8d1Var = (h8d1) faaVar;
            int i = h8d1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h8d1Var.c = i - Integer.MIN_VALUE;
            } else {
                h8d1Var = new h8d1(this, faaVar);
            }
        } else {
            h8d1Var = new h8d1(this, faaVar);
        }
        Object obj = h8d1Var.a;
        int i2 = h8d1Var.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            h8d1Var.c = 1;
            Object objD = d(j, vu30Var, h8d1Var);
            d9n d9nVar = d9n.a;
            return objD == d9nVar ? d9nVar : objD;
        } catch (PointerEventTimeoutCancellationException unused) {
            return null;
        }
    }

    public final o8n getContext() {
        return o6x.a;
    }

    @Override // p.wat
    public final float h() {
        return this.a.h();
    }

    @Override // p.wat
    public final int i0(float f) {
        return this.a.i0(f);
    }

    @Override // p.wat
    public final long k1(long j) {
        return this.a.k1(j);
    }

    @Override // p.wat
    public final float q0(long j) {
        return this.a.q0(j);
    }

    public final void resumeWith(Object obj) {
        j8d1 j8d1Var = this.e;
        synchronized (j8d1Var.V0) {
            j8d1Var.U0.k(this);
        }
        this.b.resumeWith(obj);
    }

    @Override // p.wat
    public final long s(float f) {
        return this.a.s(f);
    }

    @Override // p.wat
    public final long t(long j) {
        return this.a.t(j);
    }

    @Override // p.wat
    public final float y(long j) {
        return this.a.y(j);
    }
}
