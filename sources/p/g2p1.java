package p;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.base.java.logging.Logger;
import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class g2p1 {
    public static b180 a;
    public static b180 b;

    public static final void A(int i, String str, Function0 function0, b0k b0kVar, boolean z) {
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(205610419);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = bin.x(dug.f(u291.d(nim0Var, 1.0f), f5p1.k(x340Var, 2131100252), d4o1.a), false, null, null, null, function0, 15);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            if (str == null) {
                x340Var.i0(341190028);
                x340Var.r(false);
                z2 = false;
            } else {
                x340Var.i0(341190029);
                z2 = false;
                cwl1.f(oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070), (String) null, u291.d(nim0Var, 1.0f), (tl3) null, mif1.Q0, 0.0f, new f2b(f5p1.k(x340Var, 2131102457), 16), x340Var, 48, 40);
                x340Var.r(false);
            }
            if (z) {
                x340Var = x340Var;
                x340Var.i0(341541569);
                String strO0 = cwl1.o0(x340Var, 2131963748);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).j;
                qim0 qim0VarA = h2c.a.a(nim0Var, een.X);
                float f = cbx.b(x340Var).b.e;
                float f2 = cbx.b(x340Var).b.e;
                cvx cvxVar = cbx.b(x340Var).b;
                x340 x340Var2 = x340Var;
                uwo1.e(strO0, uyn1.B(qim0VarA, f, 0.0f, f2, 16.0f, 2), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
                x340Var = x340Var2;
                x340Var.r(z2);
            } else {
                x340Var = x340Var;
                x340Var.i0(341924233);
                x340Var.r(z2);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c980((byte) 5, i, str, function0, z);
        }
    }

    public static final void B(float f, ven0 ven0Var) {
        pzm.k(f, ven0Var);
    }

    public static final RectF C(RectF rectF, int i) {
        RectF rectF2 = new RectF(rectF);
        switch (i) {
            case 2:
                rectF2.set(1.0f - rectF2.right, rectF2.top, 1.0f - rectF2.left, rectF2.bottom);
            case 1:
                return rectF2;
            case 3:
                rectF2.set(1.0f - rectF2.right, 1.0f - rectF2.bottom, 1.0f - rectF2.left, 1.0f - rectF2.top);
                return rectF2;
            case 4:
                rectF2.set(rectF2.left, 1.0f - rectF2.bottom, rectF2.right, 1.0f - rectF2.top);
                return rectF2;
            case 5:
                rectF2.set(rectF2.top, rectF2.left, rectF2.bottom, rectF2.right);
                return rectF2;
            case 6:
                rectF2.set(rectF2.top, 1.0f - rectF2.right, rectF2.bottom, 1.0f - rectF2.left);
                return rectF2;
            case 7:
                rectF2.set(1.0f - rectF2.bottom, 1.0f - rectF2.right, 1.0f - rectF2.top, 1.0f - rectF2.left);
                return rectF2;
            case 8:
                rectF2.set(1.0f - rectF2.bottom, rectF2.left, 1.0f - rectF2.top, rectF2.right);
                return rectF2;
            default:
                Logger.d("Unknown exif tag", new Object[0]);
                return rectF2;
        }
    }

    public static final gsg D() {
        bs50 bs50Var = o6x.a;
        try {
            fns fnsVar = igu.a;
            bs50Var = pyf0.a.f;
        } catch (jgo0 | IllegalStateException unused) {
        }
        return new gsg(bs50Var.y(guo1.B()));
    }

    public static fai0 E(gn31 gn31Var, hv30 hv30Var, dwl1 dwl1Var) {
        Object obj = new Object();
        fai0 fai0Var = new fai0();
        fai0Var.n(gn31Var, new knd0(dwl1Var, obj, hv30Var, fai0Var));
        return fai0Var;
    }

    public static a2u0 F(int i) {
        return (a2u0) a2u0.b.get(Integer.valueOf(i));
    }

    public static final wi20 G() {
        return wi20.c();
    }

    public static final void J(Matrix matrix, int i) {
        switch (i) {
            case 1:
                break;
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.postRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.postRotate(-90.0f);
                break;
            default:
                Logger.d("Unknown exif tag", new Object[0]);
                break;
        }
    }

    public static final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1813911808);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131951746);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(nim0.a, 0.0f, 16.0f, 0.0f, cbx.b(x340Var).b.a, 5), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqk((byte) 18, i, false);
        }
    }

    public static final void b(ziu ziuVar, xb10 xb10Var, iu30 iu30Var, b0k b0kVar, int i) {
        float f;
        float f2;
        m4c m4cVar = fkj0.X;
        diu diuVar = ziuVar.f;
        List list = diuVar.e;
        boolean z = ziuVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-807324256);
        int i2 = i | (x340Var.i(ziuVar) ? 4 : 2) | (x340Var.i(xb10Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            uwr uwrVar2 = cbx.a;
            Float fS = aym.s(list);
            float fFloatValue = fS != null ? fS.floatValue() : 1.0f;
            uwrVar2.getClass();
            if (fFloatValue <= 0.0f) {
                hhg1.n("Aspect ratio value must be bigger than zero.");
                return;
            }
            x340Var.i0(1550479320);
            String strO0 = diuVar.c.a;
            if (ihc1.y0(strO0)) {
                strO0 = cwl1.o0(x340Var, 2131951993);
            }
            x340Var.r(false);
            int i3 = i2 & 14;
            int iJ = up30.j(ziuVar, x340Var);
            float f3 = 16.0f;
            if (z) {
                x340Var.i0(820428040);
                cua cuaVar = cbx.b(x340Var).f;
                x340Var.r(false);
                f = 4.0f;
            } else {
                x340Var.i0(820495527);
                Float fS2 = aym.s(diuVar.e);
                if ((fS2 != null ? fS2.floatValue() : 1.0f) > 1.2f) {
                    x340Var.i0(820532417);
                    cua cuaVar2 = cbx.b(x340Var).f;
                    x340Var.r(false);
                    f = 16.0f;
                } else {
                    x340Var.i0(820602849);
                    cua cuaVar3 = cbx.b(x340Var).f;
                    x340Var.r(false);
                    f = 8.0f;
                }
                x340Var.r(false);
            }
            float f4 = fFloatValue;
            String str = strO0;
            tob1 tob1VarA = z95.a(f, irn1.o0(iJ, 0, null, 6), "image corner radius", x340Var, 384, 8);
            if (z) {
                x340Var.i0(820870317);
                cvx cvxVar = cbx.b(x340Var).b;
                x340Var.r(false);
                f2 = 16.0f;
            } else {
                x340Var.i0(820928008);
                x340Var.r(false);
                f2 = 0.0f;
            }
            tob1 tob1VarA2 = z95.a(f2, irn1.o0(iJ, 0, null, 6), "horizontal padding", x340Var, 384, 8);
            if (z) {
                x340Var.i0(821145101);
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
            } else {
                x340Var.i0(821206450);
                Float fS3 = aym.s(diuVar.e);
                if ((fS3 != null ? fS3.floatValue() : 1.0f) > 1.2f) {
                    x340Var.i0(821243588);
                    x340Var.r(false);
                    f3 = 0.0f;
                } else {
                    x340Var.i0(821280137);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            tob1 tob1VarA3 = z95.a(f3, irn1.o0(iJ, 0, null, 6), "vertical padding", x340Var, 384, 8);
            tob1 tob1VarB = z95.b(z ? 0.6f : 1.0f, irn1.o0(iJ, 0, null, 6), "image scale", (iu30) null, x340Var, 3072, 20);
            tob1 tob1VarB2 = z95.b(z ? -1.0f : 0.0f, irn1.o0(iJ, 0, null, 6), "image bias", (iu30) null, x340Var, 3072, 20);
            gra graVar = new gra(((Number) tob1VarB2.getValue()).floatValue(), ((Number) tob1VarB2.getValue()).floatValue());
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = uyn1.y(u291.B(nim0Var, graVar, 2), ((p3v) tob1VarA2.getValue()).a, ((p3v) tob1VarA3.getValue()).a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            fwx fwxVarG = hso1.G(box.c, 0L, 0L, x340Var, box.d, 30);
            qim0 qim0VarR = d7e.r(f4, u291.c(i1p1.q(nim0Var, er31.b(((p3v) tob1VarA.getValue()).a)), ((Number) tob1VarB.getValue()).floatValue()), false);
            int i4 = i2 & 896;
            boolean z2 = i4 == 256;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new p1(iu30Var, (byte) 26);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarR, false, null, null, null, (Function0) objT, 15);
            String strR = ila0.r(list);
            if (strR == null) {
                strR = "";
            }
            Uri uri = Uri.parse(strR);
            boolean z3 = i4 == 256;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new qj(iu30Var, (byte) 13);
                x340Var.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean zI = x340Var.i(ziuVar) | (i4 == 256);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new hq0(ziuVar, iu30Var, (byte) 2);
                x340Var.s0(objT3);
            }
            iu30 iu30Var3 = (iu30) objT3;
            boolean z4 = i4 == 256;
            Object objT4 = x340Var.T();
            if (z4 || objT4 == m4cVar) {
                objT4 = new qj(iu30Var, (byte) 14);
                x340Var.s0(objT4);
            }
            eso1.h(oi7.a(uri, (gw70) null, xb10Var, (yqi1) null, fwxVarG, fwxVarG, false, false, (j6m) null, iu30Var2, iu30Var3, (iu30) objT4, 0L, x340Var, ((i2 << 6) & 7168) | 2359296, 0, 102294), new jsl(str), qim0VarX, (p3v) null, (zvx) null, (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, x340Var, 0, 440);
            x340Var = x340Var;
            qim0 qim0VarA = h2c.a.a(nim0Var, een.t);
            boolean z5 = i4 == 256;
            Object objT5 = x340Var.T();
            if (z5 || objT5 == m4cVar) {
                objT5 = new p1(iu30Var, (byte) 27);
                x340Var.s0(objT5);
            }
            zod.d(ziuVar, qim0VarA, (Function0) objT5, x340Var, i3);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q1((Object) ziuVar, (Object) xb10Var, (Object) iu30Var, i, (byte) 12);
        }
    }

    public static final void c(jl9 jl9Var, w460 w460Var, al9 al9Var, d0r d0rVar, yqg yqgVar, b0k b0kVar, int i) {
        int i2;
        d0r d0rVar2;
        x340 x340Var;
        yqg yqgVar2;
        h311 h311VarV;
        ol9 ol9Var;
        String strK;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1130760184);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(jl9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(w460Var) : x340Var2.i(w460Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var2.g(al9Var) : x340Var2.i(al9Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            d0rVar2 = d0rVar;
            i2 |= x340Var2.i(d0rVar2) ? 2048 : 1024;
        } else {
            d0rVar2 = d0rVar;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.g(yqgVar) ? 16384 : 8192;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (jl9Var.a.isEmpty()) {
                h311VarV = x340Var2.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ol9Var = new ol9(jl9Var, w460Var, al9Var, d0rVar2, yqgVar, i, (byte) 0);
                }
            } else {
                yqgVar2 = yqgVar;
                int iD = b2p1.D(jl9Var, yqgVar2, x340Var2, (i2 & 14) | ((i2 >> 9) & 112));
                nim0 nim0Var = nim0.a;
                qim0 qim0VarY = voo1.y(u291.d(nim0Var, 1.0f), voo1.g);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                boolean z = x340Var2.S;
                n4k n4kVar = hmb0.t1;
                if (z) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var2, lljVar3);
                nko1.F(x340Var2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var2, lljVar4);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(nim0Var, 16.0f, 8.0f, 16.0f, 0.0f, 8);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int i3 = i2;
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                String str = jl9Var.c;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                if (jl9Var.d) {
                    strK = x0d.k(x340Var2, 1529658123, 2131953053, x340Var2, false);
                } else {
                    x340Var2.i0(1529760392);
                    x340Var2.r(false);
                    strK = null;
                }
                otw.c(w460Var, new s460(4, 620, str2, strK, (String) null, (String) null, false), (qim0) null, (ipb1) null, x340Var2, 8 | ((i3 >> 3) & 14), 12);
                x340Var = x340Var2;
                x340Var.r(true);
                View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
                boolean zI = x340Var.i(view);
                Object objT = x340Var.T();
                if (zI || objT == fkj0.X) {
                    objT = new xy2(view, (byte) 2);
                    x340Var.s0(objT);
                }
                dgo1.c(view, (iu30) objT, apo.r(-327334614, new xx(jl9Var, iD, al9Var, d0rVar, (byte) 21), x340Var), x340Var, 384);
                x340Var.r(true);
            }
            h311VarV.d = ol9Var;
        }
        x340Var = x340Var2;
        yqgVar2 = yqgVar;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ol9Var = new ol9(jl9Var, w460Var, al9Var, d0rVar, yqgVar2, i, (byte) 1);
            h311VarV.d = ol9Var;
        }
    }

    public static final void d(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2074490326);
        if (x340Var.Y(i & 1, i != 0)) {
            klx klxVar = klx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(nim0.a, 32.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            w0h1.a(klxVar, isl.a, uyn1.B(qim0VarR, 0.0f, 0.0f, 8.0f, 0.0f, 11), cbx.a(x340Var).b.f, 0L, false, x340Var, klx.d | 48, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqk((byte) 19, i, false);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1006611907);
        if (x340Var.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(nim0.a, 32.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarR2 = d7e.r(1.0f, uyn1.B(qim0VarR, 0.0f, 0.0f, 8.0f, 0.0f, 11), false);
            cr31 cr31Var = er31.a;
            qim0 qim0VarQ = i1p1.q(qim0VarR2, cr31Var);
            avw0 avw0Var = cbx.b(x340Var).c;
            t1c.a(d1u.E(2.0f, cbx.a(x340Var).c.b, qim0VarQ, cr31Var), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqk((byte) 20, i, false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(int i, b0k b0kVar, xxq xxqVar, pyq pyqVar, iu30 iu30Var, vzq0 vzq0Var) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        xxq xxqVar2;
        Object obj;
        xxq xxqVar3 = xxqVar;
        iu30 iu30Var2 = iu30Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-238298650);
        int i2 = (i & 6) == 0 ? (b0kVar3.i(vzq0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= b0kVar3.g(pyqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(xxqVar3) : b0kVar3.i(xxqVar3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 2048 : 1024;
        }
        boolean z = false;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            qim0 qim0VarW = uyn1.w(l6o1.H(dug.f(uyn1.B(qim0VarD, 16.0f, 0.0f, 16.0f, cbx.b(b0kVar3).b.e, 2), cbx.a(b0kVar3).a.c, d4o1.a), l6o1.C(0, 0, 1, b0kVar3), false, 14), vzq0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarW);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            a(b0kVar3, 0);
            h(b0kVar3, 0);
            int i3 = (i2 >> 6) & 126;
            g(xxqVar3, iu30Var2, b0kVar3, i3);
            b0kVar3.i0(690468809);
            for (g2r g2rVar : pyqVar.a) {
                String strO0 = cwl1.o0(b0kVar3, g2rVar.a);
                String strO1 = cwl1.o0(b0kVar3, g2rVar.b);
                byte b2 = g2rVar.d;
                b0k b0kVar4 = b0kVar3;
                k(strO0, strO1, cwl1.U(2131820650, b2, new Object[]{Integer.valueOf(b2)}, b0kVar3), cwl1.o0(b0kVar3, g2rVar.c), g2rVar.e, g2rVar.f, xxqVar3, iu30Var2, b0kVar4, (i2 << 12) & 33030144);
                xxqVar3 = xxqVar;
                iu30Var2 = iu30Var;
                z = false;
                b0kVar3 = b0kVar4;
            }
            boolean z2 = z;
            b0kVar2 = b0kVar3;
            b0kVar2.r(z2);
            int i4 = i2 & 896;
            xxqVar2 = xxqVar;
            v(pyqVar.d, pyqVar.e, xxqVar2, iu30Var, b0kVar3, i2 & 8064);
            iu30Var2 = iu30Var;
            if (pyqVar.g) {
                b0kVar2.i0(-69511473);
                boolean z3 = (i4 == 256 || ((i2 & 512) != 0 && b0kVar2.i(xxqVar2))) ? true : z2 ? 1 : 0;
                Object objT = b0kVar2.T();
                if (z3 || objT == fkj0.X) {
                    obj = objT;
                    dyq dyqVar = new dyq(xxqVar2, (lnm) null, z2 ? (byte) 1 : (byte) 0);
                    b0kVar2.s0(dyqVar);
                    obj = dyqVar;
                }
                obj = objT;
                qxd0.t(rih1.a, b0kVar2, (vu30) obj);
                j(xxqVar2, iu30Var2, b0kVar2, i3);
                b0kVar2.r(z2);
            } else {
                b0kVar2.i0(-69366362);
                b0kVar2.r(z2);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            xxqVar2 = xxqVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new eyq(vzq0Var, pyqVar, xxqVar2, iu30Var2, i);
        }
    }

    public static final void g(xxq xxqVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1804088854);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(xxqVar) : b0kVar3.i(xxqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarS = v8r.s(xxqVar, b0kVar3);
            ven0 ven0VarS2 = v8r.s(iu30Var, b0kVar3);
            String strO0 = cwl1.o0(b0kVar3, 2131954830);
            String strN0 = cwl1.n0(2131954800, new Object[]{strO0}, b0kVar3);
            boolean zG = b0kVar3.g(strN0) | b0kVar3.g(strO0);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
                int length = strO0.length() + iW0;
                ye5 ye5Var = new ye5();
                ye5Var.f(strN0.subSequence(0, iW0));
                vhg.c(ye5Var, strO0, "https://support.spotify.com/article/understanding-my-data/?plain", vhg.a, new xs3(ven0VarS, ven0VarS2, (byte) 6));
                ye5Var.f(strN0.subSequence(length, strN0.length()));
                objT = ye5Var.p();
                b0kVar3.s0(objT);
            }
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.d((af5) objT, cbx.a(b0kVar3).b.a, uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, cbx.b(b0kVar3).b.a, 7), cbx.d(b0kVar3).j, null, null, 0, false, null, 0, null, null, b0kVar2, 0, 0, 4080);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fyq(xxqVar, iu30Var, i, (byte) 0);
        }
    }

    public static final void h(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-293570275);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131954829);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).c;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ywq.e;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0VarB, false, (iu30) objT), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sqk((byte) 21, i, false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void i(int i, b0k b0kVar, xxq xxqVar, pyq pyqVar, iu30 iu30Var, vzq0 vzq0Var) throws NoWhenBranchMatchedException {
        int i2;
        pyq pyqVar2;
        xxq xxqVar2;
        vzq0 vzq0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-640337385);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(pyqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vzq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(xxqVar) : x340Var.i(xxqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            if (pyqVar.c || pyqVar.f) {
                x340Var.i0(-1726188402);
                int i3 = i2 >> 3;
                p(pyqVar, xxqVar, iu30Var, x340Var, (i2 & 14) | (i3 & 112) | (i3 & 896));
                x340Var.r(false);
            } else {
                x340Var.i0(-1726135547);
                x340Var.r(false);
            }
            f(((i2 >> 3) & 14) | ((i2 << 3) & 112) | (i2 & 896) | (i2 & 7168), x340Var, xxqVar, pyqVar, iu30Var, vzq0Var);
            xxqVar2 = xxqVar;
            pyqVar2 = pyqVar;
            vzq0Var2 = vzq0Var;
            if (pyqVar2.b) {
                x340Var.i0(-1726038362);
                t(u291.d(nim0Var, 1.0f), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(-1725977819);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            pyqVar2 = pyqVar;
            xxqVar2 = xxqVar;
            vzq0Var2 = vzq0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eyq(pyqVar2, vzq0Var2, xxqVar2, iu30Var, i);
        }
    }

    public static final void j(xxq xxqVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-996213630);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(xxqVar) : x340Var.i(xxqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new qzn(iu30Var, (byte) 14);
                x340Var.s0(objT);
            }
            mqo1.e((Function0) objT, null, null, phi.i, phi.j, apo.r(-24988028, new hyq(xxqVar, iu30Var, b2), x340Var), null, x340Var, 224256, 70);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fyq(xxqVar, iu30Var, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(String str, String str2, String str3, String str4, l3p1 l3p1Var, DataSectionType dataSectionType, xxq xxqVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        l3p1 l3p1Var2;
        iu30 iu30Var2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1596694278);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            l3p1Var2 = l3p1Var;
            i2 |= x340Var2.g(l3p1Var2) ? 16384 : 8192;
        } else {
            l3p1Var2 = l3p1Var;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.e(dataSectionType.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? x340Var2.g(xxqVar) : x340Var2.i(xxqVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            iu30Var2 = iu30Var;
            i2 |= x340Var2.i(iu30Var2) ? 8388608 : 4194304;
        } else {
            iu30Var2 = iu30Var;
        }
        if (x340Var2.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            int i3 = i2;
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            rqo1.g(0, 1, x340Var2, null);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).h;
            long j = cbx.a(x340Var2).b.a;
            float f = cbx.b(x340Var2).b.b;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, f, 0.0f, 4.0f, 5);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = ywq.f;
                x340Var2.s0(objT);
            }
            uwo1.e(str, s161.b(qim0VarB, false, (iu30) objT), lee1Var, j, null, null, 0, false, null, 0, null, x340Var2, i3 & 14, 0, 2032);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarB2 = uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            ktx ktxVar = ktx.c;
            zov0 zov0Var = cbx.b(x340Var2).g;
            qim0 qim0VarR = u291.r(nim0Var, 16.0f);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            w0h1.a(ktxVar, isl.a, uyn1.B(qim0VarR, 0.0f, 0.0f, 4.0f, 0.0f, 11), cbx.a(x340Var2).b.b, 0L, false, x340Var2, ktx.d | 48, 48);
            int i4 = i3 >> 6;
            uwo1.e(str3, null, cbx.d(x340Var2).m, cbx.a(x340Var2).b.b, null, null, 0, false, null, 0, null, x340Var2, i4 & 14, 0, 2034);
            x340Var2.r(true);
            uwo1.e(str2, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, cbx.b(x340Var2).b.b, 7), cbx.d(x340Var2).j, cbx.a(x340Var2).b.a, null, null, 0, false, null, 0, null, x340Var2, (i3 >> 3) & 14, 0, 2032);
            int i5 = i3 >> 9;
            l(l3p1Var2, str4, dataSectionType, xxqVar, iu30Var2, x340Var2, (i4 & 112) | ((i3 >> 12) & 14) | (i5 & 896) | (i5 & 7168) | (i5 & 57344));
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(str, str2, str3, str4, l3p1Var, dataSectionType, xxqVar, iu30Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void l(l3p1 l3p1Var, String str, DataSectionType dataSectionType, xxq xxqVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1299345543);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(l3p1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.e(dataSectionType.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(xxqVar) : x340Var.i(xxqVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            x340Var.b0();
        } else if (l3p1Var.equals(j2r.c)) {
            x340Var.i0(1164424514);
            String strO0 = cwl1.o0(x340Var, 2131954824);
            j2i j2iVar = phi.a;
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && x340Var.i(xxqVar))) | ((i2 & 57344) == 16384);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new iyq(xxqVar, dataSectionType, iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            m(((i2 >> 3) & 14) | 384, str, strO0, (Function0) objT, j2iVar, x340Var);
            x340Var.r(false);
        } else if (l3p1Var.equals(j2r.d)) {
            x340Var.i0(1164440585);
            String strO1 = cwl1.o0(x340Var, 2131954825);
            j2i j2iVar2 = phi.b;
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048 || ((i2 & 4096) != 0 && x340Var.i(xxqVar))) | ((i2 & 57344) == 16384);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new iyq(xxqVar, dataSectionType, iu30Var, (byte) 1);
                x340Var.s0(objT2);
            }
            m(((i2 >> 3) & 14) | 384, str, strO1, (Function0) objT2, j2iVar2, x340Var);
            x340Var.r(false);
        } else if (l3p1Var instanceof i2r) {
            x340Var.i0(1164456317);
            o((i2r) l3p1Var, x340Var, i2 & 14);
            x340Var.r(false);
        } else {
            if (!(l3p1Var instanceof h2r)) {
                throw p3d1.k(x340Var, 1164423885, false);
            }
            x340Var.i0(1164459345);
            h2r h2rVar = (h2r) l3p1Var;
            int i3 = i2 & 7168;
            int i4 = i2 & 57344;
            int i5 = i2 & 14;
            boolean z3 = (i3 == 2048 || ((i2 & 4096) != 0 && x340Var.i(xxqVar))) | (i4 == 16384) | (i5 == 4);
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new jyq(xxqVar, iu30Var, l3p1Var, (byte) 0);
                x340Var.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            boolean z4 = (i4 == 16384) | (i3 == 2048 || ((i2 & 4096) != 0 && x340Var.i(xxqVar))) | (i5 == 4);
            Object objT4 = x340Var.T();
            if (z4 || objT4 == m4cVar) {
                objT4 = new jyq(xxqVar, iu30Var, l3p1Var, (byte) 1);
                x340Var.s0(objT4);
            }
            Function0 function1 = (Function0) objT4;
            boolean z5 = (i4 == 16384) | (i3 == 2048 || ((i2 & 4096) != 0 && x340Var.i(xxqVar)));
            Object objT5 = x340Var.T();
            if (z5 || objT5 == m4cVar) {
                objT5 = new gyq(xxqVar, iu30Var, (byte) 1);
                x340Var.s0(objT5);
            }
            n(h2rVar, function0, function1, (Function0) objT5, x340Var, i5);
            x340Var = x340Var;
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq((byte) 0, i, l3p1Var, str, dataSectionType, xxqVar, iu30Var);
        }
    }

    public static final void m(int i, String str, String str2, Function0 function0, j2i j2iVar, b0k b0kVar) {
        String str3;
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1875400341);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (x340Var.g(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = u291.f(uyn1.B(nim0.a, 0.0f, 0.0f, 0.0f, cbx.b(x340Var).b.a, 7), 1.0f);
            boolean z = (i2 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new j3n(function0, (byte) 14);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT, 15);
            boolean z2 = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new i3o(str2, (byte) 4);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarX, true, (iu30) objT2);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar.invoke(x340Var, Integer.valueOf((i2 >> 6) & 14));
            uwo1.e(str3, null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lyq(str, str2, j2iVar, function0, i);
        }
    }

    public static final void n(h2r h2rVar, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        int i2;
        Function0 function3;
        h2r h2rVar2 = h2rVar;
        Function0 function4 = function1;
        Function0 function5 = function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-71225494);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(h2rVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function5) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, f, 7), 1.0f);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), cbx.a(x340Var).a.a.c(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function6 = hmb0.t1;
            if (z) {
                x340Var.l(function6);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(nim0Var, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function6);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String strO0 = cwl1.o0(x340Var, 2131954820);
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            String strN0 = cwl1.n0(2131954815, new Object[]{h2rVar2.c}, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ywq.g;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT);
            fra fraVar = een.Z;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                function3 = function6;
                x340Var.l(function3);
            } else {
                function3 = function6;
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            cvx cvxVar3 = cbx.b(x340Var).b;
            Function0 function7 = function3;
            uwo1.e(cwl1.o0(x340Var, 2131954816), uyn1.B(nim0Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            lee1 lee1Var2 = cbx.d(x340Var).j;
            long j2 = cbx.a(x340Var).b.a;
            cvx cvxVar4 = cbx.b(x340Var).b;
            uwo1.e(strN0, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), lee1Var2, j2, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
            gfx.f(6, apo.r(1931860688, new bvk(function0, (byte) 7), x340Var), x340Var);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ywq.h;
                x340Var.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(nim0Var, true, (iu30) objT2);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarB2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function7);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            cvx cvxVar5 = cbx.b(x340Var).b;
            uwo1.e(cwl1.o0(x340Var, 2131954812), uyn1.B(nim0Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            h2rVar2 = h2rVar;
            String strN1 = cwl1.n0(2131954811, new Object[]{h2rVar2.e}, x340Var);
            lee1 lee1Var3 = cbx.d(x340Var).j;
            long j3 = cbx.a(x340Var).b.a;
            cvx cvxVar6 = cbx.b(x340Var).b;
            uwo1.e(strN1, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), lee1Var3, j3, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var = x340Var;
            x340Var.r(true);
            cvx cvxVar7 = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            cvx cvxVar8 = cbx.b(x340Var).b;
            function4 = function1;
            function5 = function2;
            k5p1.d(null, new d36(8.0f, true, new um5(false)), d36Var, null, 0, 0, apo.r(-640862325, new myq(function5, function4, (byte) 0), x340Var), x340Var, 1572864, 57);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, h2rVar2, function0, function4, function5, (byte) 29);
        }
    }

    public static final void o(i2r i2rVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2044848904);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(i2rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, f, 7), 1.0f);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarF, er31.b(16.0f)), cbx.a(x340Var).a.a.c(), d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF2);
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
            byte b2 = i2rVar.d;
            String strN0 = cwl1.n0(2131954823, new Object[]{i2rVar.c, cwl1.U(2131820651, b2, new Object[]{Integer.valueOf(b2)}, x340Var)}, x340Var);
            lee1 lee1Var = cbx.d(x340Var).k;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(strN0, uyn1.x(nim0Var, 16.0f), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0((Object) i2rVar, i, (byte) 22);
        }
    }

    public static final void p(pyq pyqVar, xxq xxqVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1386455288);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(pyqVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(xxqVar) : x340Var.i(xxqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = pyqVar.c;
            rih1 rih1Var = rih1.a;
            if (z) {
                x340Var.i0(811166738);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32 || ((i2 & 64) != 0 && x340Var.i(xxqVar));
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new dyq(xxqVar, (lnm) null, (byte) 1);
                    x340Var.s0(objT);
                }
                qxd0.t(rih1Var, x340Var, (vu30) objT);
                int i4 = i2 & 896;
                boolean z3 = (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(xxqVar))) | (i4 == 256);
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new gyq(xxqVar, iu30Var, (byte) 2);
                    x340Var.s0(objT2);
                }
                Function0 function0 = (Function0) objT2;
                boolean z4 = (i3 == 32 || ((i2 & 64) != 0 && x340Var.i(xxqVar))) | (i4 == 256);
                Object objT3 = x340Var.T();
                if (z4 || objT3 == m4cVar) {
                    objT3 = new gyq(xxqVar, iu30Var, (byte) 3);
                    x340Var.s0(objT3);
                }
                q(function0, (Function0) objT3, x340Var, 0);
                x340Var.r(false);
            } else if (pyqVar.f) {
                x340Var.i0(811605202);
                int i5 = i2 & 112;
                boolean z5 = i5 == 32 || ((i2 & 64) != 0 && x340Var.i(xxqVar));
                Object objT4 = x340Var.T();
                if (z5 || objT4 == m4cVar) {
                    objT4 = new dyq(xxqVar, (lnm) null, (byte) 2);
                    x340Var.s0(objT4);
                }
                qxd0.t(rih1Var, x340Var, (vu30) objT4);
                int i6 = i2 & 896;
                boolean z6 = (i5 == 32 || ((i2 & 64) != 0 && x340Var.i(xxqVar))) | (i6 == 256);
                Object objT5 = x340Var.T();
                if (z6 || objT5 == m4cVar) {
                    objT5 = new gyq(xxqVar, iu30Var, (byte) 4);
                    x340Var.s0(objT5);
                }
                Function0 function1 = (Function0) objT5;
                boolean z7 = (i5 == 32 || ((i2 & 64) != 0 && x340Var.i(xxqVar))) | (i6 == 256);
                Object objT6 = x340Var.T();
                if (z7 || objT6 == m4cVar) {
                    objT6 = new gyq(xxqVar, iu30Var, (byte) 5);
                    x340Var.s0(objT6);
                }
                q(function1, (Function0) objT6, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(812012666);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nok((Object) pyqVar, (Object) xxqVar, (Object) iu30Var, i, (byte) 25);
        }
    }

    public static final void q(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1079762371);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j3n(function0, (byte) 18);
                x340Var.s0(objT);
            }
            mqo1.e((Function0) objT, null, null, phi.l, phi.m, apo.r(1962345797, new bvk(function1, (byte) 10), x340Var), apo.r(1077609990, new bvk(function0, (byte) 11), x340Var), x340Var, 1797120, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 11);
        }
    }

    public static final void r(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(13611675);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.e, 0.0f, 2, qim0VarF);
            long jA = cbx.a(x340Var).a.b.a();
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarL0 = cwl1.l0(qim0VarZ, jA, er31.b(48.0f), 12);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarL0);
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
            x(" ", u7h.j, false, null, false, null, null, x340Var, 390, 120);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fk01(i, (byte) 21);
        }
    }

    public static final void s(aak0 aak0Var, b0k b0kVar, int i) {
        aak0 aak0Var2;
        String strN0;
        String strN1;
        qim0 qim0Var;
        boolean z;
        boolean z2;
        u7h m231Var;
        long j;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        String str = aak0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-672065609);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(aak0Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Integer num = aak0Var.a;
            u7h u7hVar = null;
            if (num == null) {
                x340Var.i0(1631061205);
                x340Var.r(false);
                strN0 = null;
            } else {
                x340Var.i0(1631061206);
                strN0 = cwl1.n0(2131960777, new Object[]{Integer.valueOf(num.intValue())}, x340Var);
                x340Var.r(false);
            }
            if (str == null) {
                x340Var.i0(1631163009);
                x340Var.r(false);
                strN1 = null;
            } else {
                x340Var.i0(1631163010);
                strN1 = cwl1.n0(2131960778, new Object[]{str}, x340Var);
                x340Var.r(false);
            }
            String strY0 = o7h.y0(f46.i0(new String[]{strN0, strN1}), ", ", (String) null, (String) null, (iu30) null, 62);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarV = u291.v(qim0Var2, 51.0f);
            boolean zG = x340Var.g(strY0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new fki0(strY0, (byte) 13);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarV, false, (iu30) objT);
            mbh mbhVarA = jbh.a(new d36(3.0f, true, new um5(false)), een.R0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            if (strN0 == null) {
                x340Var.i0(691094710);
                x340Var.r(false);
                z2 = false;
                qim0Var = qim0Var2;
                z = true;
            } else {
                x340Var.i0(691094711);
                qim0 qim0VarH = u291.h(u291.f(qim0Var2, 1.0f), 18.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                uwr uwrVar = cbx.a;
                qim0Var = qim0Var2;
                z = true;
                z2 = false;
                uwo1.e(strN0, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                x340Var = x340Var;
                x340Var.r(true);
                x340Var.r(false);
            }
            if (str == null) {
                x340Var.i0(691398293);
                x340Var.r(z2);
                aak0Var2 = aak0Var;
            } else {
                x340Var.i0(691398294);
                qim0 qim0Var3 = qim0Var;
                qim0 qim0VarH2 = u291.h(qim0Var3, 18.0f);
                gfh0 gfh0VarC2 = t1c.c(een.i, z2);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarH2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar4);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar);
                qim0 qim0VarH3 = u291.h(qim0Var3, 14.0f);
                String str2 = aak0Var.c;
                if (str2 != null) {
                    try {
                        m231Var = new u7h(z4p1.e(Color.parseColor(str2)));
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    u7hVar = m231Var instanceof m231 ? null : m231Var;
                }
                u7h u7hVar2 = u7hVar;
                if (u7hVar2 == null) {
                    x340Var.i0(777199317);
                    uwr uwrVar2 = cbx.a;
                    j = cbx.a(x340Var).b.b;
                    x340Var.r(z2);
                } else {
                    x340Var.i0(777197302);
                    x340Var.r(z2);
                    j = u7hVar2.a;
                }
                uwr uwrVar3 = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                qim0 qim0VarF = dug.f(qim0VarH3, j, er31.b(4.0f));
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarF);
                gfh0 gfh0VarC3 = t1c.c(een.h, z2);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarZ);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar4);
                nko1.H(xos0VarM4, x340Var, lljVar3);
                x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar);
                x340 x340Var2 = x340Var;
                aak0Var2 = aak0Var;
                uwo1.e(str, null, cbx.d(x340Var).n, ((yex) zex.a.d).a, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2034);
                x340Var = x340Var2;
                us71.m(x340Var, z, z, z2);
            }
            x340Var.r(z);
        } else {
            aak0Var2 = aak0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yih0(aak0Var2, i, (byte) 28);
        }
    }

    public static final void t(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1814380334);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0Var, u7h.b(cbx.a(x340Var).a.a.a(), 0.8f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = lmm.e1;
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT, 14);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            xto1.e(h2c.a.a(nim0.a, een.h), 4, 0L, 0L, x340Var, 48, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 6);
        }
    }

    public static final void u(Function0 function0, vu30 vu30Var, String str, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(460041255);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(vu30Var) ? 32 : 16) | (x340Var.g(sc11.b) ? 256 : 128) | (x340Var.g(str) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(w7x.a);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(0);
                x340Var.s0(objT2);
            }
            x74.f(function0, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(-1908136888, new n2y0(str, ven0Var, (ven0) objT2, y7e1VarD, vu30Var), x340Var), x340Var, (i2 & 14) | 12582912, 48, 1918);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(i, function0, vu30Var, str, qim0Var2, (byte) 9);
        }
    }

    public static final void v(boolean z, boolean z2, xxq xxqVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(364792772);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(xxqVar) : x340Var.i(xxqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfx.g(4, apo.r(-32561167, new pa0(z, xxqVar, iu30Var, z2), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cla(z, z2, (Object) xxqVar, (Object) iu30Var, i, (byte) 1);
        }
    }

    public static final void w(float f, float f2, float f3, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1131844443);
        int i2 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.d(f2) ? 32 : 16) | (x340Var.d(f3) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(u291.v(eqr0.D(f, 0.0f, 2, qim0Var3), f2), f3);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            t1c.a(dug.f(i1p1.q(qim0VarH, er31.b(48.0f)), u7h.f, d4o1.a), x340Var, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nm71(f, f2, f3, qim0Var2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0133  */
    /* JADX WARN: Code duplicated, block: B:93:0x0181  */
    /* JADX WARN: Code duplicated, block: B:96:0x0190  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    public static final void x(String str, long j, boolean z, qim0 qim0Var, boolean z2, idn0 idn0Var, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        idn0 idn0Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z4;
        b0k b0kVar2;
        Function0 function1;
        boolean z5;
        idn0 idn0Var3;
        h311 h311VarV;
        qim0 qim0VarP;
        boolean z6;
        idn0 idn0Var4;
        Function0 function2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-897434542);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.h(z) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    if (b0kVar3.h(z3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        idn0Var2 = idn0Var;
                        if (b0kVar3.i(idn0Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (b0kVar3.i(function0)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i3 |= i9;
                    }
                    i10 = i3;
                    if ((i3 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (b0kVar3.Y(i10 & 1, z4)) {
                        qim0VarP = nim0.a;
                        if (i11 != 0) {
                            qim0Var2 = qim0VarP;
                        }
                        if (i4 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        if (i6 != 0) {
                            idn0Var4 = null;
                        } else {
                            idn0Var4 = idn0Var2;
                        }
                        if (i8 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        uwr uwrVar = cbx.a;
                        mta mtaVar = cbx.b(b0kVar3).d;
                        qim0 qim0VarQ = i1p1.q(qim0Var2, er31.b(48.0f));
                        if (function2 != null || idn0Var4 == null) {
                            b0kVar3.i0(700268526);
                            b0kVar3.r(false);
                        } else {
                            b0kVar3.i0(699866549);
                            mta mtaVar2 = cbx.b(b0kVar3).d;
                            qim0VarP = dgo1.p(qim0VarP, z6, idn0Var4, new vch(vno1.o(er31.b(48.0f), b0kVar3, 0)), true, new pm31(4), function2);
                            b0kVar3.r(false);
                        }
                        qim0 qim0VarThen = qim0VarQ.then(qim0VarP);
                        cvx cvxVar = cbx.b(b0kVar3).b;
                        b0kVar2 = b0kVar3;
                        cwl1.b(uyn1.z(16.0f, 0.0f, 2, qim0VarThen), (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(2020607753, new pje(z, str, j, (byte) 2), b0kVar3), b0kVar2, 100663296, 48, 1790);
                        function1 = function2;
                        z5 = z6;
                        idn0Var3 = idn0Var4;
                    } else {
                        b0kVar2 = b0kVar3;
                        b0kVar2.b0();
                        function1 = function0;
                        z5 = z3;
                        idn0Var3 = idn0Var2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new om71(str, j, z, qim0Var2, z5, idn0Var3, function1, i, i2);
                    }
                }
                i3 |= 196608;
                idn0Var2 = idn0Var;
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (b0kVar3.i(function0)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((i3 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (b0kVar3.Y(i10 & 1, z4)) {
                    qim0VarP = nim0.a;
                    if (i11 != 0) {
                        qim0Var2 = qim0VarP;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i6 != 0) {
                        idn0Var4 = null;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    uwr uwrVar2 = cbx.a;
                    mta mtaVar3 = cbx.b(b0kVar3).d;
                    qim0 qim0VarQ2 = i1p1.q(qim0Var2, er31.b(48.0f));
                    if (function2 != null) {
                        b0kVar3.i0(700268526);
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(700268526);
                        b0kVar3.r(false);
                    }
                    qim0 qim0VarThen2 = qim0VarQ2.then(qim0VarP);
                    cvx cvxVar2 = cbx.b(b0kVar3).b;
                    b0kVar2 = b0kVar3;
                    cwl1.b(uyn1.z(16.0f, 0.0f, 2, qim0VarThen2), (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(2020607753, new pje(z, str, j, (byte) 2), b0kVar3), b0kVar2, 100663296, 48, 1790);
                    function1 = function2;
                    z5 = z6;
                    idn0Var3 = idn0Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    function1 = function0;
                    z5 = z3;
                    idn0Var3 = idn0Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new om71(str, j, z, qim0Var2, z5, idn0Var3, function1, i, i2);
                }
            }
            i3 |= 24576;
            z3 = z2;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    idn0Var2 = idn0Var;
                    if (b0kVar3.i(idn0Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (b0kVar3.i(function0)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((i3 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (b0kVar3.Y(i10 & 1, z4)) {
                    qim0VarP = nim0.a;
                    if (i11 != 0) {
                        qim0Var2 = qim0VarP;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i6 != 0) {
                        idn0Var4 = null;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    uwr uwrVar3 = cbx.a;
                    mta mtaVar4 = cbx.b(b0kVar3).d;
                    qim0 qim0VarQ3 = i1p1.q(qim0Var2, er31.b(48.0f));
                    if (function2 != null) {
                        b0kVar3.i0(700268526);
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(700268526);
                        b0kVar3.r(false);
                    }
                    qim0 qim0VarThen3 = qim0VarQ3.then(qim0VarP);
                    cvx cvxVar3 = cbx.b(b0kVar3).b;
                    b0kVar2 = b0kVar3;
                    cwl1.b(uyn1.z(16.0f, 0.0f, 2, qim0VarThen3), (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(2020607753, new pje(z, str, j, (byte) 2), b0kVar3), b0kVar2, 100663296, 48, 1790);
                    function1 = function2;
                    z5 = z6;
                    idn0Var3 = idn0Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    function1 = function0;
                    z5 = z3;
                    idn0Var3 = idn0Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new om71(str, j, z, qim0Var2, z5, idn0Var3, function1, i, i2);
                }
            }
            i3 |= 196608;
            idn0Var2 = idn0Var;
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (b0kVar3.i(function0)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i3;
            if ((i3 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i10 & 1, z4)) {
                qim0VarP = nim0.a;
                if (i11 != 0) {
                    qim0Var2 = qim0VarP;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i6 != 0) {
                    idn0Var4 = null;
                } else {
                    idn0Var4 = idn0Var2;
                }
                if (i8 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                uwr uwrVar4 = cbx.a;
                mta mtaVar5 = cbx.b(b0kVar3).d;
                qim0 qim0VarQ4 = i1p1.q(qim0Var2, er31.b(48.0f));
                if (function2 != null) {
                    b0kVar3.i0(700268526);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(700268526);
                    b0kVar3.r(false);
                }
                qim0 qim0VarThen4 = qim0VarQ4.then(qim0VarP);
                cvx cvxVar4 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                cwl1.b(uyn1.z(16.0f, 0.0f, 2, qim0VarThen4), (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(2020607753, new pje(z, str, j, (byte) 2), b0kVar3), b0kVar2, 100663296, 48, 1790);
                function1 = function2;
                z5 = z6;
                idn0Var3 = idn0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                function1 = function0;
                z5 = z3;
                idn0Var3 = idn0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new om71(str, j, z, qim0Var2, z5, idn0Var3, function1, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                if (b0kVar3.h(z3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    idn0Var2 = idn0Var;
                    if (b0kVar3.i(idn0Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (b0kVar3.i(function0)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                i10 = i3;
                if ((i3 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (b0kVar3.Y(i10 & 1, z4)) {
                    qim0VarP = nim0.a;
                    if (i11 != 0) {
                        qim0Var2 = qim0VarP;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (i6 != 0) {
                        idn0Var4 = null;
                    } else {
                        idn0Var4 = idn0Var2;
                    }
                    if (i8 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    uwr uwrVar5 = cbx.a;
                    mta mtaVar6 = cbx.b(b0kVar3).d;
                    qim0 qim0VarQ5 = i1p1.q(qim0Var2, er31.b(48.0f));
                    if (function2 != null) {
                        b0kVar3.i0(700268526);
                        b0kVar3.r(false);
                    } else {
                        b0kVar3.i0(700268526);
                        b0kVar3.r(false);
                    }
                    qim0 qim0VarThen5 = qim0VarQ5.then(qim0VarP);
                    cvx cvxVar5 = cbx.b(b0kVar3).b;
                    b0kVar2 = b0kVar3;
                    cwl1.b(uyn1.z(16.0f, 0.0f, 2, qim0VarThen5), (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(2020607753, new pje(z, str, j, (byte) 2), b0kVar3), b0kVar2, 100663296, 48, 1790);
                    function1 = function2;
                    z5 = z6;
                    idn0Var3 = idn0Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    function1 = function0;
                    z5 = z3;
                    idn0Var3 = idn0Var2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new om71(str, j, z, qim0Var2, z5, idn0Var3, function1, i, i2);
                }
            }
            i3 |= 196608;
            idn0Var2 = idn0Var;
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (b0kVar3.i(function0)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i3;
            if ((i3 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i10 & 1, z4)) {
                qim0VarP = nim0.a;
                if (i11 != 0) {
                    qim0Var2 = qim0VarP;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i6 != 0) {
                    idn0Var4 = null;
                } else {
                    idn0Var4 = idn0Var2;
                }
                if (i8 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                uwr uwrVar6 = cbx.a;
                mta mtaVar7 = cbx.b(b0kVar3).d;
                qim0 qim0VarQ6 = i1p1.q(qim0Var2, er31.b(48.0f));
                if (function2 != null) {
                    b0kVar3.i0(700268526);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(700268526);
                    b0kVar3.r(false);
                }
                qim0 qim0VarThen6 = qim0VarQ6.then(qim0VarP);
                cvx cvxVar6 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                cwl1.b(uyn1.z(16.0f, 0.0f, 2, qim0VarThen6), (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(2020607753, new pje(z, str, j, (byte) 2), b0kVar3), b0kVar2, 100663296, 48, 1790);
                function1 = function2;
                z5 = z6;
                idn0Var3 = idn0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                function1 = function0;
                z5 = z3;
                idn0Var3 = idn0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new om71(str, j, z, qim0Var2, z5, idn0Var3, function1, i, i2);
            }
        }
        i3 |= 24576;
        z3 = z2;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                idn0Var2 = idn0Var;
                if (b0kVar3.i(idn0Var2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (b0kVar3.i(function0)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            i10 = i3;
            if ((i3 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i10 & 1, z4)) {
                qim0VarP = nim0.a;
                if (i11 != 0) {
                    qim0Var2 = qim0VarP;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                if (i6 != 0) {
                    idn0Var4 = null;
                } else {
                    idn0Var4 = idn0Var2;
                }
                if (i8 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                uwr uwrVar7 = cbx.a;
                mta mtaVar8 = cbx.b(b0kVar3).d;
                qim0 qim0VarQ7 = i1p1.q(qim0Var2, er31.b(48.0f));
                if (function2 != null) {
                    b0kVar3.i0(700268526);
                    b0kVar3.r(false);
                } else {
                    b0kVar3.i0(700268526);
                    b0kVar3.r(false);
                }
                qim0 qim0VarThen7 = qim0VarQ7.then(qim0VarP);
                cvx cvxVar7 = cbx.b(b0kVar3).b;
                b0kVar2 = b0kVar3;
                cwl1.b(uyn1.z(16.0f, 0.0f, 2, qim0VarThen7), (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(2020607753, new pje(z, str, j, (byte) 2), b0kVar3), b0kVar2, 100663296, 48, 1790);
                function1 = function2;
                z5 = z6;
                idn0Var3 = idn0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                function1 = function0;
                z5 = z3;
                idn0Var3 = idn0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new om71(str, j, z, qim0Var2, z5, idn0Var3, function1, i, i2);
            }
        }
        i3 |= 196608;
        idn0Var2 = idn0Var;
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (b0kVar3.i(function0)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        i10 = i3;
        if ((i3 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (b0kVar3.Y(i10 & 1, z4)) {
            qim0VarP = nim0.a;
            if (i11 != 0) {
                qim0Var2 = qim0VarP;
            }
            if (i4 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            if (i6 != 0) {
                idn0Var4 = null;
            } else {
                idn0Var4 = idn0Var2;
            }
            if (i8 != 0) {
                function2 = null;
            } else {
                function2 = function0;
            }
            uwr uwrVar8 = cbx.a;
            mta mtaVar9 = cbx.b(b0kVar3).d;
            qim0 qim0VarQ8 = i1p1.q(qim0Var2, er31.b(48.0f));
            if (function2 != null) {
                b0kVar3.i0(700268526);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(700268526);
                b0kVar3.r(false);
            }
            qim0 qim0VarThen8 = qim0VarQ8.then(qim0VarP);
            cvx cvxVar8 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            cwl1.b(uyn1.z(16.0f, 0.0f, 2, qim0VarThen8), (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(2020607753, new pje(z, str, j, (byte) 2), b0kVar3), b0kVar2, 100663296, 48, 1790);
            function1 = function2;
            z5 = z6;
            idn0Var3 = idn0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            function1 = function0;
            z5 = z3;
            idn0Var3 = idn0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new om71(str, j, z, qim0Var2, z5, idn0Var3, function1, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0356  */
    /* JADX WARN: Code duplicated, block: B:129:0x035a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0399  */
    /* JADX WARN: Code duplicated, block: B:133:0x039d  */
    /* JADX WARN: Code duplicated, block: B:137:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:139:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:154:0x048d  */
    /* JADX WARN: Code duplicated, block: B:158:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:161:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:162:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:168:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:189:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:202:0x043d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a3 A[LOOP:7: B:77:0x01a1->B:78:0x01a3, LOOP_END] */
    public static final void y(km71 km71Var, float f, iu30 iu30Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        Object obj;
        int size;
        ArrayList arrayList;
        int i2;
        m4c m4cVar;
        Iterator itN;
        int i3;
        wat watVar;
        ven0 ven0Var;
        float f2;
        float f3;
        boolean zI;
        float f4;
        Object objT;
        int i4;
        boolean z;
        Object objT2;
        boolean z2;
        Object next;
        int i5;
        bw91 bw91Var;
        boolean zI2;
        Object objT3;
        char c;
        float f5;
        float f6;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        era eraVar = een.P0;
        gra graVar = een.d;
        m4c m4cVar2 = fkj0.X;
        List list = km71Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1709973755);
        j06 j06Var = x340Var.a;
        int i6 = (i & 6) == 0 ? (x340Var.i(km71Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i6 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i6 & 1, (i6 & 147) != 146)) {
            int i7 = km71Var.b;
            wat watVar2 = (wat) x340Var.k(t4k.h);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar2) {
                objT4 = ktd.o(0.0f, x340Var);
            }
            ven0 ven0Var2 = (ven0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar2) {
                objT5 = ktd.o(0.0f, x340Var);
            }
            ven0 ven0Var3 = (ven0) objT5;
            boolean zE = x340Var.e(list.size());
            Object objT6 = x340Var.T();
            if (zE || objT6 == m4cVar2) {
                bw91 bw91Var2 = new bw91();
                int size2 = list.size();
                ArrayList arrayList2 = new ArrayList(size2);
                int i8 = 0;
                while (i8 < size2) {
                    arrayList2.add(new p3v(0.0f));
                    i8++;
                    size2 = size2;
                }
                bw91Var2.addAll(arrayList2);
                x340Var.s0(bw91Var2);
                obj = bw91Var2;
            } else {
                obj = objT6;
            }
            bw91 bw91Var3 = (bw91) obj;
            c380 c380VarA = mqo1.A(list);
            float f7 = ((p3v) ven0Var2.getValue()).a;
            c380 c380VarA2 = mqo1.A(bw91Var3);
            if (p3v.b(f7, 0.0f) <= 0 || c380VarA.isEmpty()) {
                size = c380VarA.size();
                arrayList = new ArrayList(size);
                i2 = 0;
                while (i2 < size) {
                    arrayList.add(new p3v(0.0f));
                    i2++;
                    size = size;
                }
            } else {
                if (!c380VarA2.isEmpty()) {
                    Iterator it = c380VarA2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Iterator it2 = it;
                            float f8 = f7;
                            if (p3v.b(((p3v) it.next()).a, 0.0f) > 0) {
                                f7 = f8;
                                it = it2;
                            } else {
                                size = c380VarA.size();
                                arrayList = new ArrayList(size);
                                i2 = 0;
                                while (i2 < size) {
                                    arrayList.add(new p3v(0.0f));
                                    i2++;
                                    size = size;
                                }
                            }
                        }
                    }
                }
                float f9 = f7;
                float f10 = ((p3v) c380VarA2.get(i7)).a;
                float size3 = f9 / c380VarA.size();
                if (p3v.b(f10, size3) <= 0) {
                    int size4 = c380VarA.size();
                    arrayList = new ArrayList(size4);
                    for (int i9 = 0; i9 < size4; i9++) {
                        arrayList.add(new p3v(size3));
                    }
                } else {
                    float size5 = c380VarA.size() > 1 ? (f9 - f10) / (c380VarA.size() - 1) : 0.0f;
                    int size6 = c380VarA.size();
                    arrayList = new ArrayList(size6);
                    float f11 = size5;
                    int i10 = 0;
                    while (i10 < size6) {
                        int i11 = i10;
                        if (i10 == i7) {
                            f6 = f10;
                            f5 = f6;
                        } else {
                            f5 = f10;
                            f6 = f11;
                        }
                        arrayList.add(new p3v(f6));
                        i10 = i11 + 1;
                        f10 = f5;
                    }
                }
            }
            c380 c380VarA3 = mqo1.A(arrayList);
            float f12 = f >= 0.0f ? f : i7;
            int size7 = c380VarA.size() - 1;
            if (size7 < 0) {
                size7 = 0;
            }
            double d = f12;
            int iP = yoi1.p((int) Math.floor(d), 0, size7);
            float f13 = f12;
            int iP2 = yoi1.p((int) Math.ceil(d), 0, size7);
            float fO = yoi1.o(f13 - iP, 0.0f, 1.0f);
            Iterator it3 = o7h.d1(c380VarA3, iP).iterator();
            float f14 = 0.0f;
            while (it3.hasNext()) {
                f14 += ((p3v) it3.next()).a;
                i7 = i7;
            }
            int i12 = i7;
            float f15 = 0.0f;
            for (Iterator it4 = o7h.d1(c380VarA3, iP2).iterator(); it4.hasNext(); it4 = it4) {
                f15 += ((p3v) it4.next()).a;
            }
            float fT = dm5.T(f14, f15, fO);
            float fT2 = dm5.T(((p3v) ((iP < 0 || iP >= c380VarA3.size()) ? new p3v(0.0f) : c380VarA3.get(iP))).a, ((p3v) ((iP2 < 0 || iP2 >= c380VarA3.size()) ? new p3v(0.0f) : c380VarA3.get(iP2))).a, fO);
            boolean zE2 = x340Var.e(c380VarA.size());
            Object objT7 = x340Var.T();
            Object obj2 = objT7;
            if (zE2 || objT7 == m4cVar2) {
                int size8 = c380VarA.size();
                ArrayList arrayList3 = new ArrayList(size8);
                for (int i13 = 0; i13 < size8; i13++) {
                    arrayList3.add(new jdn0());
                }
                x340Var.s0(arrayList3);
                obj2 = arrayList3;
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            List list2 = (List) obj2;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.e, 0.0f, 2, nim0Var);
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarF2 = dug.f(i1p1.q(qim0VarZ, er31.b(48.0f)), z4p1.e(Color.parseColor("#FF3C3C3C")), d4o1.a);
            boolean zI3 = x340Var.i(watVar2) | x340Var.i(ven0Var2);
            Object objT8 = x340Var.T();
            if (zI3) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT8 == m4cVar) {
                }
                qim0 qim0VarX = ern1.x(qim0VarF2, (iu30) objT8);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                qim0 qim0VarC = u291.C(u291.h(u291.f(nim0Var, 1.0f), 0.0f), eraVar, true);
                jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarC);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar4);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                itN = kk0.n(x340Var, qim0VarE3, lljVar, 1109145579, c380VarA);
                i3 = 0;
                while (itN.hasNext()) {
                    next = itN.next();
                    i5 = i3 + 1;
                    if (i3 >= 0) {
                        p7h.T();
                        throw null;
                    }
                    String str = (String) next;
                    bw91Var = bw91Var3;
                    zI2 = x340Var.i(watVar2) | x340Var.i(bw91Var) | x340Var.e(i3);
                    c380 c380Var = c380VarA;
                    objT3 = x340Var.T();
                    if (!zI2 || objT3 == m4cVar) {
                        c = 4;
                        objT3 = new ju01(watVar2, bw91Var, i3, (byte) 4);
                        x340Var.s0(objT3);
                    } else {
                        c = 4;
                    }
                    wat watVar3 = watVar2;
                    List list3 = list2;
                    x340 x340Var2 = x340Var;
                    x(str, u7h.j, false, ern1.x(nim0Var, (iu30) objT3), false, (idn0) list3.get(i3), null, x340Var2, 384, 80);
                    itN = itN;
                    i6 = i6;
                    watVar2 = watVar3;
                    x340Var = x340Var2;
                    c380VarA = c380Var;
                    bw91Var3 = bw91Var;
                    i3 = i5;
                    list2 = list3;
                    ven0Var3 = ven0Var3;
                }
                c380 c380Var2 = c380VarA;
                watVar = watVar2;
                ven0Var = ven0Var3;
                int i14 = i6;
                List list4 = list2;
                x340Var.r(false);
                x340Var.r(true);
                if (p3v.b(fT2, 0.0f) > 0 || p3v.b(((p3v) ven0Var.getValue()).a, 0.0f) <= 0) {
                    f2 = fT2;
                    f3 = fT;
                    x340Var.i0(1766637041);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1766558239);
                    f2 = fT2;
                    x340 x340Var3 = x340Var;
                    w(fT, f2, ((p3v) ven0Var.getValue()).a, null, x340Var3, 0);
                    f3 = fT;
                    x340Var = x340Var3;
                    x340Var.r(false);
                }
                qim0 qim0VarC2 = u291.C(nim0Var, eraVar, true);
                zI = x340Var.i(watVar) | x340Var.i(ven0Var);
                f4 = f2;
                objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new kxl(watVar, ven0Var, (byte) 5);
                    x340Var.s0(objT);
                }
                qim0 qim0VarX2 = ern1.x(qim0VarC2, (iu30) objT);
                uwr uwrVar2 = cbx.a;
                long j = cbx.a(x340Var).b.a;
                i4 = i14 & 896;
                if (i4 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objT2 = x340Var.T();
                if (!z || objT2 == m4cVar) {
                    iu30Var2 = iu30Var;
                    objT2 = new et61(iu30Var2, (byte) 4);
                    x340Var.s0(objT2);
                } else {
                    iu30Var2 = iu30Var;
                }
                x340 x340Var4 = x340Var;
                z(c380Var2, j, c380VarA3, list4, i12, qim0VarX2, (iu30) objT2, null, x340Var4, 3072);
                x340Var = x340Var4;
                if (p3v.b(f4, 0.0f) > 0 || p3v.b(((p3v) ven0Var.getValue()).a, 0.0f) <= 0) {
                    z2 = true;
                    x340Var.i0(1768247057);
                    x340Var.r(false);
                } else {
                    x340Var.i0(1767541683);
                    qim0 qim0VarR = i1p1.r(u291.h(u291.v(eqr0.D(f3, 0.0f, 2, nim0Var), f4), ((p3v) ven0Var.getValue()).a));
                    Object objT9 = x340Var.T();
                    if (objT9 == m4cVar) {
                        objT9 = qi71.N0;
                        x340Var.s0(objT9);
                    }
                    qim0 qim0VarA = s161.a(qim0VarR, (iu30) objT9);
                    gfh0 gfh0VarC3 = t1c.c(graVar, false);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarA);
                    hzj.A.getClass();
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var, lljVar4);
                    nko1.H(xos0VarM4, x340Var, lljVar3);
                    x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar);
                    qim0 qim0VarD = eqr0.D(-f3, 0.0f, 2, u291.C(nim0Var, eraVar, true));
                    long j2 = u7h.b;
                    boolean z4 = i4 == 256;
                    Object objT10 = x340Var.T();
                    if (z4 || objT10 == m4cVar) {
                        objT10 = new et61(iu30Var2, (byte) 5);
                        x340Var.s0(objT10);
                    }
                    z(c380Var2, j2, c380VarA3, list4, i12, qim0VarD, (iu30) objT10, null, x340Var, 3072);
                    x340Var = x340Var;
                    z2 = true;
                    x340Var.r(true);
                    x340Var.r(false);
                }
                x340Var.r(z2);
                x340Var.r(z2);
            }
            objT8 = new d(watVar2, ven0Var2, (byte) 20);
            x340Var.s0(objT8);
            qim0 qim0VarX3 = ern1.x(qim0VarF2, (iu30) objT8);
            gfh0 gfh0VarC4 = t1c.c(graVar, false);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarX3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC4, x340Var, lljVar4);
            nko1.H(xos0VarM5, x340Var, lljVar3);
            x0d.q(iHashCode5, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar);
            qim0 qim0VarC3 = u291.C(u291.h(u291.f(nim0Var, 1.0f), 0.0f), eraVar, true);
            jw31 jw31VarA2 = ew31.a(h36.e, een.Z, x340Var, 0);
            int iHashCode6 = Long.hashCode(x340Var.T);
            xos0 xos0VarM6 = x340Var.m();
            qim0 qim0VarE6 = zr7.E(x340Var, qim0VarC3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar4);
            nko1.H(xos0VarM6, x340Var, lljVar3);
            x0d.q(iHashCode6, x340Var, lljVar2, x340Var);
            itN = kk0.n(x340Var, qim0VarE6, lljVar, 1109145579, c380VarA);
            i3 = 0;
            while (itN.hasNext()) {
                next = itN.next();
                i5 = i3 + 1;
                if (i3 >= 0) {
                    p7h.T();
                    throw null;
                }
                String str2 = (String) next;
                bw91Var = bw91Var3;
                zI2 = x340Var.i(watVar2) | x340Var.i(bw91Var) | x340Var.e(i3);
                c380 c380Var3 = c380VarA;
                objT3 = x340Var.T();
                if (zI2) {
                    c = 4;
                    objT3 = new ju01(watVar2, bw91Var, i3, (byte) 4);
                    x340Var.s0(objT3);
                } else {
                    c = 4;
                    objT3 = new ju01(watVar2, bw91Var, i3, (byte) 4);
                    x340Var.s0(objT3);
                }
                wat watVar4 = watVar2;
                List list5 = list2;
                x340 x340Var5 = x340Var;
                x(str2, u7h.j, false, ern1.x(nim0Var, (iu30) objT3), false, (idn0) list5.get(i3), null, x340Var5, 384, 80);
                itN = itN;
                i6 = i6;
                watVar2 = watVar4;
                x340Var = x340Var5;
                c380VarA = c380Var3;
                bw91Var3 = bw91Var;
                i3 = i5;
                list2 = list5;
                ven0Var3 = ven0Var3;
            }
            c380 c380Var4 = c380VarA;
            watVar = watVar2;
            ven0Var = ven0Var3;
            int i15 = i6;
            List list6 = list2;
            x340Var.r(false);
            x340Var.r(true);
            if (p3v.b(fT2, 0.0f) > 0) {
                f2 = fT2;
                f3 = fT;
                x340Var.i0(1766637041);
                x340Var.r(false);
            } else {
                f2 = fT2;
                f3 = fT;
                x340Var.i0(1766637041);
                x340Var.r(false);
            }
            qim0 qim0VarC4 = u291.C(nim0Var, eraVar, true);
            zI = x340Var.i(watVar) | x340Var.i(ven0Var);
            f4 = f2;
            objT = x340Var.T();
            if (zI) {
                objT = new kxl(watVar, ven0Var, (byte) 5);
                x340Var.s0(objT);
            } else {
                objT = new kxl(watVar, ven0Var, (byte) 5);
                x340Var.s0(objT);
            }
            qim0 qim0VarX4 = ern1.x(qim0VarC4, (iu30) objT);
            uwr uwrVar3 = cbx.a;
            long j3 = cbx.a(x340Var).b.a;
            i4 = i15 & 896;
            if (i4 == 256) {
                z = true;
            } else {
                z = false;
            }
            objT2 = x340Var.T();
            if (z) {
                iu30Var2 = iu30Var;
                objT2 = new et61(iu30Var2, (byte) 4);
                x340Var.s0(objT2);
            } else {
                iu30Var2 = iu30Var;
                objT2 = new et61(iu30Var2, (byte) 4);
                x340Var.s0(objT2);
            }
            x340 x340Var6 = x340Var;
            z(c380Var4, j3, c380VarA3, list6, i12, qim0VarX4, (iu30) objT2, null, x340Var6, 3072);
            x340Var = x340Var6;
            if (p3v.b(f4, 0.0f) > 0) {
                z2 = true;
                x340Var.i0(1768247057);
                x340Var.r(false);
            } else {
                z2 = true;
                x340Var.i0(1768247057);
                x340Var.r(false);
            }
            x340Var.r(z2);
            x340Var.r(z2);
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jh6(km71Var, f, iu30Var2, i);
        }
    }

    public static final void z(c380 c380Var, long j, c380 c380Var2, List list, int i, qim0 qim0Var, iu30 iu30Var, vu30 vu30Var, b0k b0kVar, int i2) {
        x340 x340Var;
        vu30 vu30Var2;
        Function0 function0;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1186131097);
        long j2 = j;
        int i3 = i2 | (x340Var2.g(c380Var) ? 4 : 2) | (x340Var2.f(j2) ? 32 : 16) | (x340Var2.g(c380Var2) ? 256 : 128) | (x340Var2.i(list) ? 16384 : 8192) | (x340Var2.e(i) ? 131072 : 65536) | (x340Var2.i(qim0Var) ? 1048576 : 524288) | (x340Var2.i(iu30Var) ? 8388608 : 4194304) | 100663296;
        if (x340Var2.Y(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                objT = ea71.Y;
                x340Var2.s0(objT);
            }
            vu30 vu30Var3 = (vu30) objT;
            wat watVar = (wat) x340Var2.k(t4k.h);
            jw31 jw31VarA = ew31.a(h36.e, een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            Iterator itN = kk0.n(x340Var2, qim0VarE, y580.Y, 813612613, c380Var);
            int i4 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                String str = (String) next;
                boolean zI = x340Var2.i(watVar) | x340Var2.e(i4);
                Object objT2 = x340Var2.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new ju01(watVar, vu30Var3, i4, (byte) 5);
                    x340Var2.s0(objT2);
                }
                qim0 qim0VarV = u291.v(ern1.x(nim0.a, (iu30) objT2), ((p3v) ((i4 < 0 || i4 >= c380Var2.size()) ? new p3v(0.0f) : c380Var2.get(i4))).a);
                boolean z = i4 == i;
                idn0 idn0Var = (idn0) list.get(i4);
                if (iu30Var == null) {
                    x340Var2.i0(622726781);
                    x340Var2.r(false);
                    m4cVar = m4cVar;
                    function0 = null;
                } else {
                    x340Var2.i0(622726782);
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.e(i4);
                    Object objT3 = x340Var2.T();
                    if (zG || objT3 == m4cVar) {
                        objT3 = new ck0(iu30Var, i4, (byte) 21);
                        x340Var2.s0(objT3);
                    }
                    x340Var2.r(false);
                    function0 = (Function0) objT3;
                }
                x340 x340Var3 = x340Var2;
                x(str, j2, true, qim0VarV, z, idn0Var, function0, x340Var3, (i3 & 112) | 384, 0);
                j2 = j;
                vu30Var3 = vu30Var3;
                watVar = watVar;
                x340Var2 = x340Var3;
                i4 = i5;
                m4cVar = m4cVar;
            }
            vu30Var2 = vu30Var3;
            x340Var = x340Var2;
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            vu30Var2 = vu30Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qta0(c380Var, j, c380Var2, list, i, qim0Var, iu30Var, vu30Var2, i2);
        }
    }

    public abstract void H(int i);

    public abstract void I(Typeface typeface, boolean z);
}
