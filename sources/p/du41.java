package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class du41 {
    public ct41 a;
    public hxq0 b;
    public iq20 c;
    public qqq0 d;
    public boolean e;
    public g6o0 f;
    public final bt41 g;
    public final zs41 h;
    public boolean i;
    public byte j = 1;
    public bs41 k = ws41.a;
    public final cu41 l = new cu41(this);
    public final waq0 m = new waq0(this, (byte) 14);

    public du41(ct41 ct41Var, hxq0 hxq0Var, iq20 iq20Var, qqq0 qqq0Var, boolean z, g6o0 g6o0Var, bt41 bt41Var, zs41 zs41Var) {
        this.a = ct41Var;
        this.b = hxq0Var;
        this.c = iq20Var;
        this.d = qqq0Var;
        this.e = z;
        this.f = g6o0Var;
        this.g = bt41Var;
        this.h = zs41Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, onm onmVar) throws Throwable {
        au41 au41Var;
        du41 du41Var;
        Throwable th;
        o811 o811Var;
        if (onmVar instanceof au41) {
            au41Var = (au41) onmVar;
            int i = au41Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                au41Var.d = i - Integer.MIN_VALUE;
            } else {
                au41Var = new au41(this, onmVar);
            }
        } else {
            au41Var = new au41(this, onmVar);
        }
        Object obj = au41Var.b;
        int i2 = au41Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o811Var = au41Var.a;
            try {
                hm5.M(obj);
                du41Var = this;
                du41Var.i = false;
                return qui1.a(o811Var.a);
            } catch (Throwable th2) {
                th = th2;
                du41Var = this;
                du41Var.i = false;
                throw th;
            }
        }
        hm5.M(obj);
        o811 o811Var2 = new o811();
        o811Var2.a = j;
        this.i = true;
        try {
            hfn0 hfn0Var = hfn0.a;
            du41Var = this;
            try {
                bu41 bu41Var = new bu41(du41Var, o811Var2, j, (lnm) null);
                au41Var.a = o811Var2;
                au41Var.d = 1;
                Object objG = du41Var.g(hfn0Var, bu41Var, au41Var);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
                o811Var = o811Var2;
                du41Var.i = false;
                return qui1.a(o811Var.a);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                du41Var.i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            du41Var = this;
        }
    }

    public final boolean b() {
        hxq0 hxq0Var;
        return this.a.d() || this.a.c() || ((hxq0Var = this.b) != null && hxq0Var.c());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0013  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public final Object c(long j, boolean z, a8d1 a8d1Var) {
        long jB;
        vu30 vx3Var;
        hxq0 hxq0Var;
        d9n d9nVar;
        Object objInvoke;
        if (z) {
            iq20 iq20Var = this.c;
            us41 us41Var = ws41.a;
            if (!(iq20Var instanceof ozr)) {
                if (this.d == qqq0.b) {
                    jB = qui1.b(j, 1, 0.0f, 0.0f);
                } else {
                    jB = qui1.b(j, 2, 0.0f, 0.0f);
                }
                vx3Var = new vx3(this, (lnm) null, (byte) 1);
                hxq0Var = this.b;
                d9nVar = d9n.a;
                if (hxq0Var == null && b()) {
                    Object objD = hxq0Var.d(jB, vx3Var, a8d1Var);
                    if (objD == d9nVar) {
                        return objD;
                    }
                } else {
                    objInvoke = vx3Var.invoke(qui1.a(jB), a8d1Var);
                    if (objInvoke == d9nVar) {
                        return objInvoke;
                    }
                }
            }
        } else {
            if (this.d == qqq0.b) {
                jB = qui1.b(j, 1, 0.0f, 0.0f);
            } else {
                jB = qui1.b(j, 2, 0.0f, 0.0f);
            }
            vx3Var = new vx3(this, (lnm) null, (byte) 1);
            hxq0Var = this.b;
            d9nVar = d9n.a;
            if (hxq0Var == null) {
                objInvoke = vx3Var.invoke(qui1.a(jB), a8d1Var);
                if (objInvoke == d9nVar) {
                    return objInvoke;
                }
            } else {
                objInvoke = vx3Var.invoke(qui1.a(jB), a8d1Var);
                if (objInvoke == d9nVar) {
                    return objInvoke;
                }
            }
        }
        return rih1.a;
    }

    public final long d(bs41 bs41Var, long j, int i) {
        l6o0 l6o0Var = this.f.a;
        l6o0 l6o0Var2 = null;
        if (l6o0Var != null && l6o0Var.N0) {
            l6o0Var2 = (l6o0) don1.r(l6o0Var);
        }
        long jM = l6o0Var2 != null ? l6o0Var2.M(i, j) : 0L;
        long jF = Offset.f(j, jM);
        long jF2 = f(i(bs41Var.f(h(f(Offset.a(jF, this.d == qqq0.b ? 1 : 2, 0.0f, 0.0f))))));
        bt41 bt41Var = this.g;
        if (bt41Var.N0) {
            oap1.k(bt41Var);
        }
        return Offset.g(Offset.g(jM, jF2), this.f.b(i, jF2, Offset.f(jF, jF2)));
    }

    public final float e(float f) {
        return this.e ? f * (-1.0f) : f;
    }

    public final long f(long j) {
        return this.e ? Offset.h(-1.0f, j) : j;
    }

    public final Object g(hfn0 hfn0Var, vu30 vu30Var, onm onmVar) {
        Object objA = this.a.a(hfn0Var, new n641(this, vu30Var, (lnm) null, (byte) 10), onmVar);
        return objA == d9n.a ? objA : rih1.a;
    }

    public final float h(long j) {
        return Float.intBitsToFloat((int) (this.d == qqq0.b ? j >> 32 : j & 4294967295L));
    }

    public final long i(float f) {
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == qqq0.b) {
            return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final float j(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        double dAtan2 = (float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)));
        qqq0 qqq0Var = this.d;
        if (dAtan2 >= 0.7853981633974483d) {
            if (qqq0Var == qqq0.a) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (qqq0Var == qqq0.b) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
