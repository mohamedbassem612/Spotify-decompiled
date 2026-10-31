package p;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class be4 implements hxq0 {
    public final wat a;
    public long b = 9205357640488583168L;
    public final wlv c;
    public final hrr0 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final l5t i;

    public be4(Context context, wat watVar, long j, zzq0 zzq0Var) {
        this.a = watVar;
        wlv wlvVar = new wlv(context, z4p1.G(j));
        this.c = wlvVar;
        this.d = xto.s(rih1.a, f331.X0);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        j8d1 j8d1VarA = f8d1.a(new ae4(this, (byte) 0));
        this.i = Build.VERSION.SDK_INT >= 31 ? new lgc1(j8d1VarA, this, wlvVar) : new fw40(j8d1VarA, this, wlvVar, zzq0Var);
    }

    @Override // p.hxq0
    public final x4t a() {
        return this.i;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Code duplicated, block: B:105:0x0211  */
    /* JADX WARN: Code duplicated, block: B:106:0x0215  */
    /* JADX WARN: Code duplicated, block: B:109:0x0225  */
    /* JADX WARN: Code duplicated, block: B:111:0x022a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0232  */
    /* JADX WARN: Code duplicated, block: B:114:0x0236  */
    /* JADX WARN: Code duplicated, block: B:116:0x0239 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x023f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0247  */
    /* JADX WARN: Code duplicated, block: B:127:0x0269  */
    /* JADX WARN: Code duplicated, block: B:138:0x0292  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:160:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f A[PHI: r7
      0x012f: PHI (r7v9 float) = (r7v8 float), (r7v12 float) binds: [B:73:0x015d, B:62:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0132  */
    /* JADX WARN: Code duplicated, block: B:67:0x013a  */
    /* JADX WARN: Code duplicated, block: B:77:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ed  */
    @Override // p.hxq0
    public final long b(long j, int i, iu30 iu30Var) {
        long j2;
        float fIntBitsToFloat;
        int i2;
        float fJ;
        float fIntBitsToFloat2;
        long jFloatToRawIntBits;
        long jF;
        long jF2;
        boolean z;
        boolean zF;
        int i3;
        long j3;
        boolean z2;
        int i4;
        boolean z3;
        if (Size.g(this.g)) {
            return ((Offset) iu30Var.invoke(new Offset(j))).a;
        }
        boolean z4 = this.f;
        boolean z5 = true;
        wlv wlvVar = this.c;
        if (!z4) {
            if (wlv.g(wlvVar.f)) {
                i(0L);
            }
            if (wlv.g(wlvVar.g)) {
                j(0L);
            }
            if (wlv.g(wlvVar.d)) {
                k(0L);
            }
            if (wlv.g(wlvVar.e)) {
                h(0L);
            }
            this.f = true;
        }
        int i5 = gw4.a;
        float f = q1o1.g(i, 2) ? 4.0f : 1.0f;
        long jH = Offset.h(f, j);
        int i6 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i6) != 0.0f) {
            if (!wlv.g(wlvVar.d) || Float.intBitsToFloat(i6) >= 0.0f) {
                j2 = 4294967295L;
                if (wlv.g(wlvVar.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    float fH = h(jH);
                    if (!wlv.g(wlvVar.e)) {
                        wlvVar.b().finish();
                    }
                    fIntBitsToFloat = fH == Float.intBitsToFloat((int) (jH & 4294967295L)) ? Float.intBitsToFloat(i6) : fH / f;
                }
            } else {
                float fK = k(jH);
                j2 = 4294967295L;
                if (!wlv.g(wlvVar.d)) {
                    wlvVar.e().finish();
                }
                fIntBitsToFloat = fK == Float.intBitsToFloat((int) (jH & 4294967295L)) ? Float.intBitsToFloat(i6) : fK / f;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else if (!wlv.g(wlvVar.f) && Float.intBitsToFloat(i2) < 0.0f) {
                fJ = i(jH);
                if (!wlv.g(wlvVar.f)) {
                    wlvVar.c().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jH >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fJ / f;
                }
            } else if (wlv.g(wlvVar.g) || Float.intBitsToFloat(i2) <= 0.0f) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fJ = j(jH);
                if (!wlv.g(wlvVar.g)) {
                    wlvVar.d().finish();
                }
                if (fJ == Float.intBitsToFloat((int) (jH >> 32))) {
                    fIntBitsToFloat2 = Float.intBitsToFloat(i2);
                } else {
                    fIntBitsToFloat2 = fJ / f;
                }
            }
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
            if (!Offset.c(jFloatToRawIntBits, 0L)) {
                g();
            }
            jF = Offset.f(j, jFloatToRawIntBits);
            long j4 = ((Offset) iu30Var.invoke(new Offset(jF))).a;
            jF2 = Offset.f(jF, j4);
            if ((Float.intBitsToFloat((int) (jF >> 32)) == 0.0f || Float.intBitsToFloat((int) (jF & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j4 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j4 & j2)) != 0.0f) && (wlv.g(wlvVar.f) || wlv.g(wlvVar.d) || wlv.g(wlvVar.g) || wlv.g(wlvVar.e)))) {
                e();
            }
            if (q1o1.g(i, 1)) {
                i3 = (int) (jF2 >> 32);
                if (Float.intBitsToFloat(i3) > 0.5f) {
                    j3 = jF2;
                    i(j3);
                } else {
                    j3 = jF2;
                    if (Float.intBitsToFloat(i3) < -0.5f) {
                        j(j3);
                    } else {
                        z2 = false;
                    }
                    i4 = (int) (j3 & j2);
                    if (Float.intBitsToFloat(i4) > 1056964608) {
                        k(j3);
                    } else {
                        if (Float.intBitsToFloat(i4) < -1090519040) {
                            h(j3);
                        } else {
                            z3 = false;
                        }
                        if (!z2 || z3) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    z3 = true;
                    if (z2) {
                    }
                    z = true;
                }
                z2 = true;
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    k(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        h(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            } else {
                z = false;
            }
            if (!Offset.c(jF, 0L)) {
                if (wlv.f(wlvVar.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                    zF = false;
                } else {
                    qon1.w(wlvVar.c(), Float.intBitsToFloat(i2));
                    zF = wlv.f(wlvVar.f);
                }
                if (wlv.f(wlvVar.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    qon1.w(wlvVar.d(), Float.intBitsToFloat(i2));
                    if (!zF || wlv.f(wlvVar.g)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (wlv.f(wlvVar.d) && Float.intBitsToFloat(i6) < 0.0f) {
                    qon1.w(wlvVar.e(), Float.intBitsToFloat(i6));
                    if (!zF || wlv.f(wlvVar.d)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (wlv.f(wlvVar.e) && Float.intBitsToFloat(i6) > 0.0f) {
                    qon1.w(wlvVar.b(), Float.intBitsToFloat(i6));
                    if (!zF || wlv.f(wlvVar.e)) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                if (!zF && !z) {
                    z5 = false;
                }
                z = z5;
            }
            if (z) {
                g();
            }
            return Offset.g(jFloatToRawIntBits, j4);
        }
        j2 = 4294967295L;
        fIntBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
            fIntBitsToFloat2 = 0.0f;
        } else if (!wlv.g(wlvVar.f)) {
            if (wlv.g(wlvVar.g)) {
                fIntBitsToFloat2 = 0.0f;
            } else {
                fIntBitsToFloat2 = 0.0f;
            }
        } else if (wlv.g(wlvVar.g)) {
            fIntBitsToFloat2 = 0.0f;
        } else {
            fIntBitsToFloat2 = 0.0f;
        }
        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        if (!Offset.c(jFloatToRawIntBits, 0L)) {
            g();
        }
        jF = Offset.f(j, jFloatToRawIntBits);
        long j5 = ((Offset) iu30Var.invoke(new Offset(jF))).a;
        jF2 = Offset.f(jF, j5);
        if (Float.intBitsToFloat((int) (jF >> 32)) == 0.0f) {
            e();
        } else {
            e();
        }
        if (q1o1.g(i, 1)) {
            i3 = (int) (jF2 >> 32);
            if (Float.intBitsToFloat(i3) > 0.5f) {
                j3 = jF2;
                i(j3);
            } else {
                j3 = jF2;
                if (Float.intBitsToFloat(i3) < -0.5f) {
                    j(j3);
                } else {
                    z2 = false;
                }
                i4 = (int) (j3 & j2);
                if (Float.intBitsToFloat(i4) > 1056964608) {
                    k(j3);
                } else {
                    if (Float.intBitsToFloat(i4) < -1090519040) {
                        h(j3);
                    } else {
                        z3 = false;
                    }
                    if (z2) {
                    }
                    z = true;
                }
                z3 = true;
                if (z2) {
                }
                z = true;
            }
            z2 = true;
            i4 = (int) (j3 & j2);
            if (Float.intBitsToFloat(i4) > 1056964608) {
                k(j3);
            } else {
                if (Float.intBitsToFloat(i4) < -1090519040) {
                    h(j3);
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                z = true;
            }
            z3 = true;
            if (z2) {
            }
            z = true;
        } else {
            z = false;
        }
        if (!Offset.c(jF, 0L)) {
            if (wlv.f(wlvVar.f)) {
                zF = false;
            } else {
                zF = false;
            }
            if (wlv.f(wlvVar.g)) {
                qon1.w(wlvVar.d(), Float.intBitsToFloat(i2));
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (wlv.f(wlvVar.d)) {
                qon1.w(wlvVar.e(), Float.intBitsToFloat(i6));
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (wlv.f(wlvVar.e)) {
                qon1.w(wlvVar.b(), Float.intBitsToFloat(i6));
                if (zF) {
                    zF = true;
                } else {
                    zF = true;
                }
            }
            if (!zF) {
                z5 = false;
            }
            z = z5;
        }
        if (z) {
            g();
        }
        return Offset.g(jFloatToRawIntBits, j5);
    }

    @Override // p.hxq0
    public final boolean c() {
        wlv wlvVar = this.c;
        EdgeEffect edgeEffect = wlvVar.d;
        if (edgeEffect != null && qon1.p(edgeEffect) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect2 = wlvVar.e;
        if (edgeEffect2 != null && qon1.p(edgeEffect2) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect3 = wlvVar.f;
        if (edgeEffect3 != null && qon1.p(edgeEffect3) != 0.0f) {
            return true;
        }
        EdgeEffect edgeEffect4 = wlvVar.g;
        return (edgeEffect4 == null || qon1.p(edgeEffect4) == 0.0f) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p.hxq0
    public final Object d(long j, vu30 vu30Var, lnm lnmVar) {
        yd4 yd4Var;
        float fM;
        float fM2;
        long j2;
        if (lnmVar instanceof yd4) {
            yd4Var = (yd4) lnmVar;
            int i = yd4Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yd4Var.d = i - Integer.MIN_VALUE;
            } else {
                yd4Var = new yd4(this, (onm) lnmVar);
            }
        } else {
            yd4Var = new yd4(this, (onm) lnmVar);
        }
        Object objInvoke = yd4Var.b;
        int i2 = yd4Var.d;
        rih1 rih1Var = rih1.a;
        wlv wlvVar = this.c;
        if (i2 == 0) {
            hm5.M(objInvoke);
            boolean zG = Size.g(this.g);
            d9n d9nVar = d9n.a;
            if (zG) {
                qui1 qui1VarA = qui1.a(j);
                yd4Var.d = 1;
                if (vu30Var.invoke(qui1VarA, yd4Var) != d9nVar) {
                    return rih1Var;
                }
            } else {
                boolean zG2 = wlv.g(wlvVar.f);
                wat watVar = this.a;
                if (!zG2 || qui1.d(j) >= 0.0f) {
                    fM = (!wlv.g(wlvVar.g) || qui1.d(j) <= 0.0f) ? 0.0f : -qon1.m(wlvVar.d(), -qui1.d(j), Float.intBitsToFloat((int) (this.g >> 32)), watVar);
                } else {
                    fM = qon1.m(wlvVar.c(), qui1.d(j), Float.intBitsToFloat((int) (this.g >> 32)), watVar);
                }
                if (!wlv.g(wlvVar.d) || qui1.e(j) >= 0.0f) {
                    fM2 = (!wlv.g(wlvVar.e) || qui1.e(j) <= 0.0f) ? 0.0f : -qon1.m(wlvVar.b(), -qui1.e(j), Float.intBitsToFloat((int) (4294967295L & this.g)), watVar);
                } else {
                    fM2 = qon1.m(wlvVar.e(), qui1.e(j), Float.intBitsToFloat((int) (4294967295L & this.g)), watVar);
                }
                long jG = j2h1.g(fM, fM2);
                if (!qui1.c(jG)) {
                    g();
                }
                long jF = qui1.f(j, jG);
                qui1 qui1VarA2 = qui1.a(jF);
                yd4Var.a = jF;
                yd4Var.d = 2;
                objInvoke = vu30Var.invoke(qui1VarA2, yd4Var);
                if (objInvoke != d9nVar) {
                    j2 = jF;
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objInvoke);
            return rih1Var;
        }
        if (i2 != 2) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = yd4Var.a;
        hm5.M(objInvoke);
        long jF2 = qui1.f(j2, ((qui1) objInvoke).j());
        this.f = false;
        if (qui1.d(jF2) > 0.0f) {
            qon1.u(wlvVar.c(), jch0.U(qui1.d(jF2)));
        } else if (qui1.d(jF2) < 0.0f) {
            qon1.u(wlvVar.d(), -jch0.U(qui1.d(jF2)));
        }
        if (qui1.e(jF2) > 0.0f) {
            qon1.u(wlvVar.e(), jch0.U(qui1.e(jF2)));
        } else if (qui1.e(jF2) < 0.0f) {
            qon1.u(wlvVar.b(), -jch0.U(qui1.e(jF2)));
        }
        e();
        return rih1Var;
    }

    public final void e() {
        boolean z;
        wlv wlvVar = this.c;
        EdgeEffect edgeEffect = wlvVar.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = wlvVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = wlvVar.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = wlvVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            g();
        }
    }

    public final long f() {
        long jO = this.b;
        if ((9223372034707292159L & jO) == 9205357640488583168L) {
            jO = zno1.o(this.g);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jO >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jO & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void g() {
        if (this.e) {
            this.d.setValue(rih1.a);
        }
    }

    public final float h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectB = this.c.b();
        return qon1.p(edgeEffectB) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * (-qon1.v(edgeEffectB, -fIntBitsToFloat2, 1.0f - fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectC = this.c.c();
        return qon1.p(edgeEffectC) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * qon1.v(edgeEffectC, fIntBitsToFloat2, 1.0f - fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    public final float j(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() & 4294967295L));
        int i = (int) (j >> 32);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect edgeEffectD = this.c.d();
        return qon1.p(edgeEffectD) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-qon1.v(edgeEffectD, -fIntBitsToFloat2, fIntBitsToFloat)) : Float.intBitsToFloat(i);
    }

    public final float k(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (f() >> 32));
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect edgeEffectE = this.c.e();
        return qon1.p(edgeEffectE) == 0.0f ? Float.intBitsToFloat((int) (this.g & 4294967295L)) * qon1.v(edgeEffectE, fIntBitsToFloat2, fIntBitsToFloat) : Float.intBitsToFloat(i);
    }

    public final void l(long j) {
        boolean zC = Size.c(this.g, 0L);
        boolean zC2 = Size.c(j, this.g);
        this.g = j;
        if (!zC2) {
            int iU = jch0.U(Float.intBitsToFloat((int) (j >> 32)));
            long jU = (((long) jch0.U(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iU) << 32);
            wlv wlvVar = this.c;
            wlvVar.c = jU;
            EdgeEffect edgeEffect = wlvVar.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jU >> 32), (int) (jU & 4294967295L));
            }
            EdgeEffect edgeEffect2 = wlvVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jU >> 32), (int) (jU & 4294967295L));
            }
            EdgeEffect edgeEffect3 = wlvVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jU & 4294967295L), (int) (jU >> 32));
            }
            EdgeEffect edgeEffect4 = wlvVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jU & 4294967295L), (int) (jU >> 32));
            }
            EdgeEffect edgeEffect5 = wlvVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jU >> 32), (int) (jU & 4294967295L));
            }
            EdgeEffect edgeEffect6 = wlvVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jU >> 32), (int) (jU & 4294967295L));
            }
            EdgeEffect edgeEffect7 = wlvVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jU & 4294967295L), (int) (jU >> 32));
            }
            EdgeEffect edgeEffect8 = wlvVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jU), (int) (jU >> 32));
            }
        }
        if (zC || zC2) {
            return;
        }
        e();
    }
}
