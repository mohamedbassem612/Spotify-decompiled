package p;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import com.spotify.concertcampaignview.v1.CtaType;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class lap1 {
    public static b180 a;
    public static b180 b;

    public static final void a(xxh xxhVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-6422168);
        int i2 = (x340Var.g(xxhVar) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nyx.a(2, (wux) null, apo.r(370842357, new qff(xxhVar), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pxh(xxhVar, qim0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:18:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    public static final void b(qim0 qim0Var, int i, long j, j2i j2iVar, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        long j2;
        int i6;
        boolean z;
        j2i j2iVar2;
        qim0 qim0Var2;
        long j3;
        h311 h311VarV;
        int i7;
        long j4;
        Object objT;
        m4c m4cVar;
        tob1 tob1Var;
        boolean zI;
        Object objT2;
        tob1 tob1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1693640974);
        int i8 = i2 | 6;
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                i4 = i;
                i8 |= x340Var.e(i4) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                i8 |= 384;
                j2 = j;
            } else {
                j2 = j;
                if ((i2 & 384) == 0) {
                    if (x340Var.f(j2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i8 |= i6;
                }
            }
            if ((i8 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i8 & 1, z)) {
                if (i9 != 0) {
                    i7 = CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER;
                } else {
                    i7 = i4;
                }
                if (i5 != 0) {
                    j4 = 200;
                } else {
                    j4 = j2;
                }
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT);
                }
                tob1Var = (ven0) objT;
                zI = x340Var.i(tob1Var) | ((i8 & 896) == 256);
                objT2 = x340Var.T();
                if (!zI || objT2 == m4cVar) {
                    tob1Var2 = tob1Var;
                    kv2 kv2Var = new kv2(j4, tob1Var2, (lnm) null, (byte) 6);
                    x340Var.s0(kv2Var);
                    objT2 = kv2Var;
                } else {
                    tob1Var2 = tob1Var;
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT2);
                boolean zBooleanValue = ((Boolean) tob1Var2.getValue()).booleanValue();
                bby bbyVarE = xay.e(2, irn1.o0(i7, 0, 0, 6));
                j2iVar2 = j2iVar;
                j2i j2iVarR = apo.r(-2020279526, new rv71(j2iVar2, (byte) 12), x340Var);
                qim0 qim0Var3 = nim0.a;
                fq7.g(zBooleanValue, qim0Var3, bbyVarE, (ln00) null, (String) null, j2iVarR, x340Var, 196656, 24);
                j3 = j4;
                i4 = i7;
                qim0Var2 = qim0Var3;
            } else {
                j2iVar2 = j2iVar;
                x340Var.b0();
                qim0Var2 = qim0Var;
                j3 = j2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new s4t(qim0Var2, i4, j3, j2iVar2, i2, i3);
            }
        }
        i8 = i2 | 54;
        i4 = i;
        i5 = i3 & 4;
        if (i5 != 0) {
            i8 |= 384;
            j2 = j;
        } else {
            j2 = j;
            if ((i2 & 384) == 0) {
                if (x340Var.f(j2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i8 |= i6;
            }
        }
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i8 & 1, z)) {
            if (i9 != 0) {
                i7 = CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER;
            } else {
                i7 = i4;
            }
            if (i5 != 0) {
                j4 = 200;
            } else {
                j4 = j2;
            }
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            tob1Var = (ven0) objT;
            zI = x340Var.i(tob1Var) | ((i8 & 896) == 256);
            objT2 = x340Var.T();
            if (zI) {
                tob1Var2 = tob1Var;
                kv2 kv2Var2 = new kv2(j4, tob1Var2, (lnm) null, (byte) 6);
                x340Var.s0(kv2Var2);
                objT2 = kv2Var2;
            } else {
                tob1Var2 = tob1Var;
                kv2 kv2Var3 = new kv2(j4, tob1Var2, (lnm) null, (byte) 6);
                x340Var.s0(kv2Var3);
                objT2 = kv2Var3;
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            boolean zBooleanValue2 = ((Boolean) tob1Var2.getValue()).booleanValue();
            bby bbyVarE2 = xay.e(2, irn1.o0(i7, 0, 0, 6));
            j2iVar2 = j2iVar;
            j2i j2iVarR2 = apo.r(-2020279526, new rv71(j2iVar2, (byte) 12), x340Var);
            qim0 qim0Var4 = nim0.a;
            fq7.g(zBooleanValue2, qim0Var4, bbyVarE2, (ln00) null, (String) null, j2iVarR2, x340Var, 196656, 24);
            j3 = j4;
            i4 = i7;
            qim0Var2 = qim0Var4;
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
            qim0Var2 = qim0Var;
            j3 = j2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s4t(qim0Var2, i4, j3, j2iVar2, i2, i3);
        }
    }

    public static final void c(qim0 qim0Var, long j, xu30 xu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2076555638);
        int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i | (x340Var.f(j) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ps((byte) 17, j);
                x340Var.s0(objT);
            }
            j0o1.b(6, x340Var, (iu30) objT, qim0VarD);
            hrt.k(54, xu30Var, h2c.a, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qi6((Object) qim0Var, j, (Object) xu30Var, i, (byte) 11);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(hyo1 hyo1Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-929459174);
        int i2 = (x340Var.g(hyo1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = hyo1Var instanceof d471;
            qim0 qim0VarQ = nim0.a;
            if (z) {
                x340Var.i0(136040646);
                d471 d471Var = (d471) hyo1Var;
                if (d471Var.d) {
                    qim0VarQ = i1p1.q(qim0VarQ, er31.a);
                }
                int i3 = d471Var.c;
                mta mtaVar = cbx.b(x340Var).d;
                f(i3, 0, x340Var, u291.r(qim0VarQ, 56.0f));
                x340Var.r(false);
            } else if (hyo1Var instanceof e471) {
                x340Var.i0(142944078);
                mta mtaVar2 = cbx.b(x340Var).d;
                c(u291.r(qim0VarQ, 56.0f), f5p1.k(x340Var, 2131103927), apo.r(-2062030639, new tmp0(hyo1Var, (byte) 0), x340Var), x340Var, 384);
                x340Var.r(false);
            } else {
                if (!(hyo1Var instanceof f471)) {
                    throw p3d1.k(x340Var, 142934726, false);
                }
                x340Var.i0(142960080);
                mta mtaVar3 = cbx.b(x340Var).d;
                qim0 qim0VarR = u291.r(qim0VarQ, 56.0f);
                uwr uwrVar = cbx.a;
                c(qim0VarR, cbx.a(x340Var).a.b.a(), apo.r(-226187792, new tmp0(hyo1Var, (byte) 1), x340Var), x340Var, 384);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nso0(hyo1Var, i, (byte) 3);
        }
    }

    public static final void e(String str, String str2, String str3, String str4, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        boolean z2;
        hax haxVar;
        hax haxVar2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2139160838);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(str3) ? 256 : 128) | (x340Var2.g(str4) ? 2048 : 1024) | (x340Var2.h(z) ? 16384 : 8192) | (x340Var2.i(function0) ? 131072 : 65536) | (x340Var2.i(function1) ? 1048576 : 524288) | 12582912;
        if (x340Var2.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarP, 16.0f, 12.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0Var2 = qim0Var3;
            uwo1.e(str, uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 8.0f, 7), cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i2 & 14, 0, 2016);
            uwo1.e(str2, uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, cbx.b(x340Var2).b.b, 7), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, (i2 >> 3) & 14, 0, 2016);
            boolean z3 = (458752 & i2) == 131072;
            Object objT = x340Var2.T();
            if (z3 || objT == m4cVar) {
                objT = new lpx0(function0, (byte) 28);
                x340Var2.s0(objT);
            }
            z50 z50Var = z50.c;
            gbx gbxVar = new gbx(z50Var, (Function0) objT);
            idx idxVar = new idx(4);
            hax haxVar3 = jax.a;
            if (z) {
                x340Var2.i0(715494101);
                haxVar = new hax(cwl1.o0(x340Var2, 2131952283));
                z2 = false;
                x340Var2.r(false);
            } else {
                z2 = false;
                x340Var2.i0(715602260);
                x340Var2.r(false);
                haxVar = haxVar3;
            }
            cvx cvxVar4 = cbx.b(x340Var2).b;
            foo1.c(gbxVar, idxVar, anm1.N("RequestButton", uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7)), haxVar, null, null, null, null, z ? qdj.a : null, null, apo.r(-449752795, new p9y0(str3, (byte) 23), x340Var2), x340Var2, 0, 48, 1512);
            boolean z4 = (i2 & 3670016) == 1048576;
            Object objT2 = x340Var2.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new lpx0(function1, (byte) 29);
                x340Var2.s0(objT2);
            }
            gbx gbxVar2 = new gbx(z50Var, (Function0) objT2);
            ldx ldxVar = ldx.c;
            if (z) {
                x340Var2.i0(716652757);
                hax haxVar4 = new hax(cwl1.o0(x340Var2, 2131952283));
                x340Var2.r(false);
                haxVar2 = haxVar4;
            } else {
                x340Var2.i0(716760916);
                x340Var2.r(false);
                haxVar2 = haxVar3;
            }
            cvx cvxVar5 = cbx.b(x340Var2).b;
            foo1.c(gbxVar2, ldxVar, anm1.N("DismissButton", uyn1.B(qim0Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7)), haxVar2, null, null, null, null, null, null, apo.r(-850927154, new p9y0(str4, (byte) 24), x340Var2), x340Var2, 0, 48, 2024);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q3(str, str2, str3, str4, z, function0, function1, qim0Var2, i);
        }
    }

    public static final void f(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1243852520);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0Var2 = qim0Var;
            nl70.c(i3o1.n(i, x340Var, i3 & 14), (String) null, qim0Var2, u7h.k, x340Var, 3128 | ((i3 << 3) & 896), 0);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 23, i, i2, qim0Var2);
        }
    }

    public static final ffv0 g(View view, Rect rect, dg30 dg30Var) {
        nk80 nk80VarI;
        Object obj;
        DisplayMetrics displayMetrics = dg30Var.getResources().getDisplayMetrics();
        View decorView = dg30Var.getWindow().getDecorView();
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1VarA = s7k1.a(decorView);
        if (hsl1VarA == null || (nk80VarI = hsl1VarA.a.i(519)) == null) {
            nk80VarI = nk80.e;
        }
        Rect rect2 = new Rect(0, 0, displayMetrics.widthPixels - nk80VarI.c, displayMetrics.heightPixels - nk80VarI.d);
        int iCenterX = rect.centerX() - (view.getWidth() / 2);
        int i = rect2.left;
        if (iCenterX >= i) {
            i = iCenterX;
        }
        int width = rect2.right - view.getWidth();
        int i2 = i > width ? width : i;
        ffv0 ffv0Var = new ffv0(1, i2, rect.top - view.getHeight(), iCenterX - i2, ((rect.top - view.getHeight()) - rect2.top) / rect2.height());
        int i3 = rect.right;
        int iCenterY = rect.centerY() - (view.getHeight() / 2);
        int i4 = rect2.top;
        if (iCenterY >= i4) {
            i4 = iCenterY;
        }
        int height = rect2.bottom - view.getHeight();
        int i5 = i4 > height ? height : i4;
        ffv0 ffv0Var2 = new ffv0(2, i3, i5, iCenterY - i5, ((rect2.right - rect.right) - view.getWidth()) / rect2.width());
        int iCenterX2 = rect.centerX() - (view.getWidth() / 2);
        int i6 = rect2.left;
        if (iCenterX2 >= i6) {
            i6 = iCenterX2;
        }
        int width2 = rect2.right - view.getWidth();
        int i7 = i6 > width2 ? width2 : i6;
        int i8 = rect.bottom;
        ffv0 ffv0Var3 = new ffv0(3, i7, i8, i7 - iCenterX2, ((rect2.bottom - i8) - view.getHeight()) / rect2.height());
        int width3 = rect.left - view.getWidth();
        int iCenterY2 = rect.centerY() - (view.getHeight() / 2);
        int i9 = rect2.top;
        if (iCenterY2 >= i9) {
            i9 = iCenterY2;
        }
        int height2 = rect2.bottom - view.getHeight();
        int i10 = i9 > height2 ? height2 : i9;
        Iterator it = p7h.M(new ffv0[]{ffv0Var, ffv0Var2, ffv0Var3, new ffv0(4, width3, i10, i10 - iCenterY2, ((rect.left - view.getWidth()) - rect2.left) / rect2.width())}).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float f = ((ffv0) next).e;
                do {
                    Object next2 = it.next();
                    float f2 = ((ffv0) next2).e;
                    if (Float.compare(f, f2) < 0) {
                        next = next2;
                        f = f2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        obj.getClass();
        return (ffv0) obj;
    }

    public static final boolean j(int i, int i2) {
        return i == i2;
    }

    public static final sck1 k(View view) {
        while (view != null) {
            Object tag = view.getTag(2131431637);
            sck1 sck1Var = tag instanceof sck1 ? (sck1) tag : null;
            if (sck1Var != null) {
                return sck1Var;
            }
            Object objP = dm5.P(view);
            view = objP instanceof View ? (View) objP : null;
        }
        return null;
    }

    public static int l(int i) {
        return Integer.hashCode(i);
    }

    public static zok0 n(String str) {
        return new zok0(str, (byte) 2);
    }

    public static final void o(View view, sck1 sck1Var) {
        view.setTag(2131431637, sck1Var);
    }

    public static final void p(View view, h3h1 h3h1Var) {
        if (h3h1Var != null) {
            xhk1.c(view, h3h1Var);
        }
    }

    public static Bundle q(n12 n12Var) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGS_KEY", n12Var);
        return bundle;
    }

    public static String r(int i) {
        if (i == 0) {
            return "Clamp";
        }
        if (i == 1) {
            return "Repeated";
        }
        if (i == 2) {
            return "Mirror";
        }
        return i == 3 ? "Decal" : "Unknown";
    }

    public static kf30 s(ajn0 ajn0Var) {
        return new kf30(new lf30(ajn0Var.b(), kf30.c.a, ajn0Var));
    }

    public hjj0 h(gkj0 gkj0Var) {
        ByteBuffer byteBuffer = ((gar) gkj0Var).d;
        byteBuffer.getClass();
        dm5.m(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return i(gkj0Var, byteBuffer);
    }

    public abstract hjj0 i(gkj0 gkj0Var, ByteBuffer byteBuffer);

    public abstract l7h1 m();
}
