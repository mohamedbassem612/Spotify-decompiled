package p;

import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ezn1 {
    public static b180 a;

    public static final void a(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(782238557);
        byte b = 2;
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("clear_search_button", qim0Var3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, qim0VarN);
            ldx ldxVar = ldx.c;
            gdx gdxVarS = yla.s(x340Var);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new us21(function0, (byte) 17);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, qim0VarZ, null, gdxVarS, null, false, null, null, apo.r(-1036168282, new nl41(str, b), x340Var), x340Var, 48, 6, 984);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(function0, str, qim0Var2, i, (byte) 18);
        }
    }

    public static final void b(xcm xcmVar, iu30 iu30Var, b0k b0kVar, int i) {
        hz5 hz5Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1405450392);
        int i2 = (x340Var.i(xcmVar) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            z3q z3qVar = (z3q) x340Var.k(ibj1.b);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                usj usjVar = new usj(iu30Var, (byte) 24);
                switch (z3qVar.a) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        hz5Var = new hz5(new i3b((i4q) z3qVar.b.c.v2.get(), new xgc((byte) 13)), usjVar);
                        break;
                    case 1:
                        hz5Var = new hz5(new i3b((i4q) z3qVar.b.d.p4.get(), new xgc((byte) 13)), usjVar);
                        break;
                    default:
                        hz5Var = new hz5(new i3b((i4q) z3qVar.b.d.t2.get(), new xgc((byte) 13)), usjVar);
                        break;
                }
                objT = hz5Var;
                x340Var.s0(objT);
            }
            xpw xpwVar = (xpw) objT;
            boolean zG = x340Var.g(xcmVar.a);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                x340Var.s0(xcmVar);
                objT2 = xcmVar;
            }
            otw.c(xpwVar, (xcm) objT2, (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jjk(xcmVar, iu30Var, i, (byte) 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043  */
    /* JADX WARN: Code duplicated, block: B:20:0x0046  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x009c  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:69:0x0205  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void c(String str, String str2, String str3, qim0 qim0Var, float f, float f2, vu30 vu30Var, b0k b0kVar, int i, int i2) {
        float f3;
        int i3;
        int i4;
        int i5;
        vu30 vu30Var2;
        int i6;
        boolean z;
        b0k b0kVar2;
        float f4;
        vu30 vu30Var3;
        qim0 qim0Var2;
        h311 h311VarV;
        int i7;
        qim0 qim0Var3;
        vu30 vu30Var4;
        qim0 qim0Var4;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        Object objT;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1210279371);
        int i8 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | 3072;
        if ((i2 & 16) == 0) {
            f3 = f;
            int i9 = b0kVar3.d(f3) ? 16384 : 8192;
            int i10 = i8 | i9;
            if (b0kVar3.d(f2)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i4 = i10 | i3;
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((i & 1572864) == 0) {
                    vu30Var2 = vu30Var;
                    if (b0kVar3.i(vu30Var2)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
                if ((599187 & i4) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (b0kVar3.Y(i4 & 1, z)) {
                    b0kVar3.d0();
                    i7 = i & 1;
                    qim0Var3 = nim0.a;
                    if (i7 != 0 || b0kVar3.E()) {
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                            f3 = 0.0f;
                        }
                        if (i5 != 0) {
                            vu30Var4 = gli.a;
                        } else {
                            vu30Var4 = vu30Var2;
                        }
                        qim0Var4 = qim0Var3;
                    } else {
                        b0kVar3.b0();
                        if ((i2 & 16) != 0) {
                            i4 &= -57345;
                        }
                        i4 = i4;
                        vu30Var4 = vu30Var2;
                        qim0Var4 = qim0Var;
                    }
                    b0kVar3.s();
                    era eraVar = een.Q0;
                    qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(b0kVar3).a.c, d4o1.a);
                    mbhVarA = jbh.a(h36.c, eraVar, b0kVar3, 0);
                    iHashCode = Long.hashCode(((x340) b0kVar3).T);
                    xos0VarM = b0kVar3.m();
                    qim0VarE = zr7.E(b0kVar3, qim0VarF2);
                    hzj.A.getClass();
                    if (((x340) b0kVar3).a != null) {
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
                    lee1 lee1Var = cbx.d(b0kVar3).d;
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    cvx cvxVar2 = cbx.b(b0kVar3).b;
                    qim0 qim0VarB = uyn1.B(qim0Var3, 16.0f, 0.0f, 16.0f, 0.0f, 10);
                    objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = z6w.R0;
                        b0kVar3.s0(objT);
                    }
                    uwo1.e(str, s161.b(qim0VarB, false, (iu30) objT), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, i4 & 14, 0, 2024);
                    lee1 lee1Var2 = cbx.d(b0kVar3).g;
                    long j = cbx.a(b0kVar3).b.b;
                    cvx cvxVar3 = cbx.b(b0kVar3).b;
                    cvx cvxVar4 = cbx.b(b0kVar3).b;
                    cvx cvxVar5 = cbx.b(b0kVar3).b;
                    uwo1.e(str2, uyn1.A(qim0Var3, 16.0f, 16.0f, 16.0f, cbx.b(b0kVar3).b.b), lee1Var2, j, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, (i4 >> 3) & 14, 0, 2016);
                    eso1.e(Uri.parse(str3), isl.a, uyn1.z(f3, 0.0f, 2, u291.h(qim0Var3, f2)), (p3v) null, (zvx) null, (ecx) null, mif1.R0, een.h, (ColorFilter) null, (qux) null, false, false, b0kVar3, 199728, 0, 3856);
                    b0kVar2 = b0kVar3;
                    vu30Var4.invoke(b0kVar2, Integer.valueOf((i4 >> 18) & 14));
                    x0d.s(qim0Var3, cbx.b(b0kVar2).b.f, b0kVar2, true);
                    vu30Var3 = vu30Var4;
                    f4 = f3;
                    qim0Var2 = qim0Var4;
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                    f4 = f3;
                    vu30Var3 = vu30Var2;
                    qim0Var2 = qim0Var;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new n8w(str, str2, str3, qim0Var2, f4, f2, vu30Var3, i, i2);
                }
            }
            i4 |= 1572864;
            vu30Var2 = vu30Var;
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                b0kVar3.d0();
                i7 = i & 1;
                qim0Var3 = nim0.a;
                if (i7 != 0) {
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        f3 = 0.0f;
                    }
                    if (i5 != 0) {
                        vu30Var4 = gli.a;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    qim0Var4 = qim0Var3;
                } else {
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        f3 = 0.0f;
                    }
                    if (i5 != 0) {
                        vu30Var4 = gli.a;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    qim0Var4 = qim0Var3;
                }
                b0kVar3.s();
                era eraVar2 = een.Q0;
                qim0 qim0VarF3 = u291.f(qim0Var4, 1.0f);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarF4 = dug.f(qim0VarF3, cbx.a(b0kVar3).a.c, d4o1.a);
                mbhVarA = jbh.a(h36.c, eraVar2, b0kVar3, 0);
                iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0VarM = b0kVar3.m();
                qim0VarE = zr7.E(b0kVar3, qim0VarF4);
                hzj.A.getClass();
                if (((x340) b0kVar3).a != null) {
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
                lee1 lee1Var3 = cbx.d(b0kVar3).d;
                cvx cvxVar6 = cbx.b(b0kVar3).b;
                cvx cvxVar7 = cbx.b(b0kVar3).b;
                qim0 qim0VarB2 = uyn1.B(qim0Var3, 16.0f, 0.0f, 16.0f, 0.0f, 10);
                objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = z6w.R0;
                    b0kVar3.s0(objT);
                }
                uwo1.e(str, s161.b(qim0VarB2, false, (iu30) objT), lee1Var3, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, i4 & 14, 0, 2024);
                lee1 lee1Var4 = cbx.d(b0kVar3).g;
                long j2 = cbx.a(b0kVar3).b.b;
                cvx cvxVar8 = cbx.b(b0kVar3).b;
                cvx cvxVar9 = cbx.b(b0kVar3).b;
                cvx cvxVar10 = cbx.b(b0kVar3).b;
                uwo1.e(str2, uyn1.A(qim0Var3, 16.0f, 16.0f, 16.0f, cbx.b(b0kVar3).b.b), lee1Var4, j2, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, (i4 >> 3) & 14, 0, 2016);
                eso1.e(Uri.parse(str3), isl.a, uyn1.z(f3, 0.0f, 2, u291.h(qim0Var3, f2)), (p3v) null, (zvx) null, (ecx) null, mif1.R0, een.h, (ColorFilter) null, (qux) null, false, false, b0kVar3, 199728, 0, 3856);
                b0kVar2 = b0kVar3;
                vu30Var4.invoke(b0kVar2, Integer.valueOf((i4 >> 18) & 14));
                x0d.s(qim0Var3, cbx.b(b0kVar2).b.f, b0kVar2, true);
                vu30Var3 = vu30Var4;
                f4 = f3;
                qim0Var2 = qim0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                f4 = f3;
                vu30Var3 = vu30Var2;
                qim0Var2 = qim0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new n8w(str, str2, str3, qim0Var2, f4, f2, vu30Var3, i, i2);
            }
        }
        f3 = f;
        int i11 = i8 | i9;
        if (b0kVar3.d(f2)) {
            i3 = 131072;
        } else {
            i3 = 65536;
        }
        i4 = i11 | i3;
        i5 = i2 & 64;
        if (i5 != 0) {
            if ((i & 1572864) == 0) {
                vu30Var2 = vu30Var;
                if (b0kVar3.i(vu30Var2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                b0kVar3.d0();
                i7 = i & 1;
                qim0Var3 = nim0.a;
                if (i7 != 0) {
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        f3 = 0.0f;
                    }
                    if (i5 != 0) {
                        vu30Var4 = gli.a;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    qim0Var4 = qim0Var3;
                } else {
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        f3 = 0.0f;
                    }
                    if (i5 != 0) {
                        vu30Var4 = gli.a;
                    } else {
                        vu30Var4 = vu30Var2;
                    }
                    qim0Var4 = qim0Var3;
                }
                b0kVar3.s();
                era eraVar3 = een.Q0;
                qim0 qim0VarF5 = u291.f(qim0Var4, 1.0f);
                uwr uwrVar3 = cbx.a;
                qim0 qim0VarF6 = dug.f(qim0VarF5, cbx.a(b0kVar3).a.c, d4o1.a);
                mbhVarA = jbh.a(h36.c, eraVar3, b0kVar3, 0);
                iHashCode = Long.hashCode(((x340) b0kVar3).T);
                xos0VarM = b0kVar3.m();
                qim0VarE = zr7.E(b0kVar3, qim0VarF6);
                hzj.A.getClass();
                if (((x340) b0kVar3).a != null) {
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
                lee1 lee1Var5 = cbx.d(b0kVar3).d;
                cvx cvxVar11 = cbx.b(b0kVar3).b;
                cvx cvxVar12 = cbx.b(b0kVar3).b;
                qim0 qim0VarB3 = uyn1.B(qim0Var3, 16.0f, 0.0f, 16.0f, 0.0f, 10);
                objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = z6w.R0;
                    b0kVar3.s0(objT);
                }
                uwo1.e(str, s161.b(qim0VarB3, false, (iu30) objT), lee1Var5, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, i4 & 14, 0, 2024);
                lee1 lee1Var6 = cbx.d(b0kVar3).g;
                long j3 = cbx.a(b0kVar3).b.b;
                cvx cvxVar13 = cbx.b(b0kVar3).b;
                cvx cvxVar14 = cbx.b(b0kVar3).b;
                cvx cvxVar15 = cbx.b(b0kVar3).b;
                uwo1.e(str2, uyn1.A(qim0Var3, 16.0f, 16.0f, 16.0f, cbx.b(b0kVar3).b.b), lee1Var6, j3, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, (i4 >> 3) & 14, 0, 2016);
                eso1.e(Uri.parse(str3), isl.a, uyn1.z(f3, 0.0f, 2, u291.h(qim0Var3, f2)), (p3v) null, (zvx) null, (ecx) null, mif1.R0, een.h, (ColorFilter) null, (qux) null, false, false, b0kVar3, 199728, 0, 3856);
                b0kVar2 = b0kVar3;
                vu30Var4.invoke(b0kVar2, Integer.valueOf((i4 >> 18) & 14));
                x0d.s(qim0Var3, cbx.b(b0kVar2).b.f, b0kVar2, true);
                vu30Var3 = vu30Var4;
                f4 = f3;
                qim0Var2 = qim0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                f4 = f3;
                vu30Var3 = vu30Var2;
                qim0Var2 = qim0Var;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new n8w(str, str2, str3, qim0Var2, f4, f2, vu30Var3, i, i2);
            }
        }
        i4 |= 1572864;
        vu30Var2 = vu30Var;
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            b0kVar3.d0();
            i7 = i & 1;
            qim0Var3 = nim0.a;
            if (i7 != 0) {
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    f3 = 0.0f;
                }
                if (i5 != 0) {
                    vu30Var4 = gli.a;
                } else {
                    vu30Var4 = vu30Var2;
                }
                qim0Var4 = qim0Var3;
            } else {
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    f3 = 0.0f;
                }
                if (i5 != 0) {
                    vu30Var4 = gli.a;
                } else {
                    vu30Var4 = vu30Var2;
                }
                qim0Var4 = qim0Var3;
            }
            b0kVar3.s();
            era eraVar4 = een.Q0;
            qim0 qim0VarF7 = u291.f(qim0Var4, 1.0f);
            uwr uwrVar4 = cbx.a;
            qim0 qim0VarF8 = dug.f(qim0VarF7, cbx.a(b0kVar3).a.c, d4o1.a);
            mbhVarA = jbh.a(h36.c, eraVar4, b0kVar3, 0);
            iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0VarM = b0kVar3.m();
            qim0VarE = zr7.E(b0kVar3, qim0VarF8);
            hzj.A.getClass();
            if (((x340) b0kVar3).a != null) {
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
            lee1 lee1Var7 = cbx.d(b0kVar3).d;
            cvx cvxVar16 = cbx.b(b0kVar3).b;
            cvx cvxVar17 = cbx.b(b0kVar3).b;
            qim0 qim0VarB4 = uyn1.B(qim0Var3, 16.0f, 0.0f, 16.0f, 0.0f, 10);
            objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = z6w.R0;
                b0kVar3.s0(objT);
            }
            uwo1.e(str, s161.b(qim0VarB4, false, (iu30) objT), lee1Var7, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, i4 & 14, 0, 2024);
            lee1 lee1Var8 = cbx.d(b0kVar3).g;
            long j4 = cbx.a(b0kVar3).b.b;
            cvx cvxVar18 = cbx.b(b0kVar3).b;
            cvx cvxVar19 = cbx.b(b0kVar3).b;
            cvx cvxVar110 = cbx.b(b0kVar3).b;
            uwo1.e(str2, uyn1.A(qim0Var3, 16.0f, 16.0f, 16.0f, cbx.b(b0kVar3).b.b), lee1Var8, j4, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, (i4 >> 3) & 14, 0, 2016);
            eso1.e(Uri.parse(str3), isl.a, uyn1.z(f3, 0.0f, 2, u291.h(qim0Var3, f2)), (p3v) null, (zvx) null, (ecx) null, mif1.R0, een.h, (ColorFilter) null, (qux) null, false, false, b0kVar3, 199728, 0, 3856);
            b0kVar2 = b0kVar3;
            vu30Var4.invoke(b0kVar2, Integer.valueOf((i4 >> 18) & 14));
            x0d.s(qim0Var3, cbx.b(b0kVar2).b.f, b0kVar2, true);
            vu30Var3 = vu30Var4;
            f4 = f3;
            qim0Var2 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            f4 = f3;
            vu30Var3 = vu30Var2;
            qim0Var2 = qim0Var;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n8w(str, str2, str3, qim0Var2, f4, f2, vu30Var3, i, i2);
        }
    }

    public static final void d(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(484823565);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                int i3 = af5.e;
                objT = ob51.j(str, (pae1) null, 6);
                x340Var.s0(objT);
            }
            uwr uwrVar = cbx.a;
            uwo1.d((af5) objT, cbx.a(x340Var).b.b, anm1.N("upsell_bottom_sheet_legal_disclaimer", nim0.a), cbx.d(x340Var).m, new a0e1(3), null, 0, false, null, 0, null, null, x340Var, 0, 0, 4064);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nl41(str, i, (byte) 22);
        }
    }

    public static final void e(c8e1 c8e1Var, String str, String str2, lz20 lz20Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1139895025);
        int i2 = 12582912 | i | (x340Var.g(c8e1Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(lz20Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(iu30Var2) ? 131072 : 65536) | (x340Var.i(function0) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("search_field_text_input", qim0Var3);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(56.0f, 0.0f, 2, qim0VarN);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new sc21(str, (byte) 19);
                x340Var.s0(objT);
            }
            qim0 qim0VarP = vby0.p(s161.b(qim0VarJ, false, (iu30) objT), lz20Var);
            kua0 kua0Var = new kua0(0, (Boolean) null, 0, 3, 119);
            int i3 = i2 & 14;
            boolean z2 = ((458752 & i2) == 131072) | (i3 == 4);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new hf31(iu30Var2, c8e1Var, (byte) 22);
                x340Var.s0(objT2);
            }
            xea.d(c8e1Var, iu30Var, qim0VarP, false, lee1.a(cbx.d(x340Var).g, cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), kua0Var, new bua0((iu30) null, (iu30) null, (iu30) objT2, 47), true, 0, 0, (elk1) null, (iu30) null, new n6a1(cbx.a(x340Var).b.c), apo.r(90243980, new kj21(c8e1Var, function0, str2, str, (byte) 4), x340Var), x340Var, i3 | 102236160 | ((i2 >> 9) & 112), 196608, 15896);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(c8e1Var, str, str2, lz20Var, iu30Var, iu30Var2, function0, qim0Var2, i);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void f(nhb1 nhb1Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        float f;
        Uri uri;
        qim0 qim0Var2;
        ?? r2;
        float f2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-116132111);
        int i2 = i | (x340Var.i(nhb1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            if (z) {
                x340Var.i0(66203547);
                uwr uwrVar = cbx.a;
                f = cbx.b(x340Var).b.d + 16.0f;
                x340Var.r(false);
            } else {
                x340Var.i0(66205139);
                x340Var.r(false);
                f = 16.0f;
            }
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar2 = cbx.a;
            qim0 qim0VarN = anm1.N("upsell_bottom_sheet_content", uyn1.A(l6o1.H(dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12)), l6o1.C(0, 0, 1, x340Var), false, 14), f, 12.0f, f, 16.0f));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            boolean z2 = nhb1Var.e;
            qim0 qim0Var3 = nim0.a;
            if (z2) {
                x340Var.i0(-1347981628);
                d7e.g(0, 0, x340Var, anm1.N("upsell_bottom_sheet_premium_signifier", qim0Var3));
                ywx0.n(qim0Var3, 16.0f, x340Var, false);
            } else {
                x340Var.i0(-1347855737);
                x340Var.r(false);
            }
            gzh1 gzh1Var = nhb1Var.f;
            gzh1 gzh1Var2 = gzh1Var instanceof gzh1 ? gzh1Var : null;
            if (gzh1Var2 == null || z) {
                gzh1Var2 = null;
            }
            if (gzh1Var2 == null) {
                x340Var.i0(-1347752136);
                x340Var.r(false);
                f2 = 16.0f;
                qim0Var2 = qim0Var3;
                r2 = 0;
            } else {
                String str = gzh1Var2.a;
                x340Var.i0(-1347752135);
                boolean zG = x340Var.g(str);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    if (str == null || (uri = Uri.parse(str)) == null) {
                        uri = Uri.EMPTY;
                    }
                    objT = uri;
                    x340Var.s0(objT);
                }
                Uri uri2 = (Uri) objT;
                uri2.getClass();
                qim0 qim0VarR = u291.r(qim0Var3, 120.0f);
                cua cuaVar = cbx.b(x340Var).f;
                qim0Var2 = qim0Var3;
                r2 = 0;
                f2 = 16.0f;
                eso1.e(uri2, isl.a, anm1.N("upsell_bottom_sheet_image", i1p1.q(qim0VarR, er31.b(4.0f))), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
                x340Var = x340Var;
                ywx0.n(qim0Var2, 16.0f, x340Var, false);
            }
            String str2 = nhb1Var.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = cgb1.t;
                x340Var.s0(objT2);
            }
            x340 x340Var2 = x340Var;
            uwo1.e(str2, s161.b(qim0Var2, (boolean) r2, (iu30) objT2), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2024);
            op71.g(x340Var2, u291.r(qim0Var2, 8.0f));
            uwo1.e(nhb1Var.b, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2018);
            op71.g(x340Var2, u291.r(qim0Var2, 24.0f));
            z50 z50Var = z50.c;
            foo1.c(new gbx(z50Var, function0), new idx(4), null, null, null, null, null, null, null, null, apo.r(1732551708, new t52(nhb1Var, (byte) 1), x340Var2), x340Var2, 0, 48, 2044);
            x340Var = x340Var2;
            String str3 = nhb1Var.d;
            if (str3 == null) {
                x340Var.i0(-1346526148);
                x340Var.r((boolean) r2);
            } else {
                x340Var.i0(-1346526147);
                op71.g(x340Var, u291.r(qim0Var2, f2));
                foo1.c(new gbx(z50Var, function1), ldx.c, null, null, null, null, null, null, null, null, apo.r(571044961, new nl41(str3, (byte) 23), x340Var), x340Var, 0, 48, 2044);
                x340Var = x340Var;
                x340Var.r((boolean) r2);
            }
            vzh1 vzh1Var = nhb1Var.g;
            uzh1 uzh1Var = vzh1Var instanceof uzh1 ? (uzh1) vzh1Var : null;
            if (uzh1Var == null) {
                x340Var.i0(-1346215218);
                x340Var.r((boolean) r2);
            } else {
                x340Var.i0(-1346215217);
                op71.g(x340Var, u291.r(qim0Var2, f2));
                d(uzh1Var.c, x340Var, r2);
                x340Var.r((boolean) r2);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ihb1(nhb1Var, function0, function1, qim0Var, i, (byte) 0);
        }
    }

    public static void g(int i, int i2) {
        String strO;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strO = jzn1.o("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    hhg1.n(f4i1.c(i2, "negative size: "));
                    return;
                }
                strO = jzn1.o("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strO);
        }
    }

    public static int[] h(int i, int i2, int[] iArr) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[i <= 4 ? 8 : i * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    public static Object[] i(int i, Object obj, Object[] objArr) {
        if (i + 1 > objArr.length) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i <= 4 ? 8 : i * 2);
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
        }
        objArr[i] = obj;
        return objArr;
    }

    public static final Object j(Object obj, boolean z) {
        nja0 nja0Var;
        if (z) {
            obj = (kka0) obj;
            if ((obj instanceof jka0) && (nja0Var = ((jka0) obj).i) != null) {
                return new ika0(tia0.b(nja0Var.d).d());
            }
        }
        return obj;
    }

    public static void k(int i, int i2, int i3) {
        String strM;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM = m(i, i3, "start index");
            } else {
                strM = (i2 < 0 || i2 > i3) ? m(i2, i3, "end index") : jzn1.o("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM);
        }
    }

    public static String m(int i, int i2, String str) {
        if (i < 0) {
            return jzn1.o("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return jzn1.o("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hhg1.n(f4i1.c(i2, "negative size: "));
        return null;
    }

    public static ygr0 n(es41 es41Var, tr80 tr80Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        boolean zG = x340Var.g(es41Var) | x340Var.g(tr80Var) | ((((i & 896) ^ 384) > 256 && x340Var.h(true)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && x340Var.h(true)) || (i & 3072) == 2048);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new ygr0((tob1) yv91.a(new shq0(es41Var, tr80Var, (byte) 8)), true);
            x340Var.s0(objT);
        }
        return (ygr0) objT;
    }

    public static final jqg0 o(u601 u601Var) {
        return new jqg0(u601Var, k8b0.X0);
    }

    public static final c380 p(b0k b0kVar, int i) {
        uwr uwrVar = cbx.a;
        gmt gmtVar = (gmt) zex.a.c;
        xex xexVar = (xex) gmtVar.b;
        u7h u7hVar = new u7h(xexVar.c);
        u7h u7hVar2 = new u7h(xexVar.K);
        wex wexVar = (wex) gmtVar.c;
        c9 c9VarS = mqo1.s(u7hVar, u7hVar2, new u7h(wexVar.i), new u7h(wexVar.k));
        boolean zE = ((x340) b0kVar).e(i);
        x340 x340Var = (x340) b0kVar;
        boolean zG = zE | x340Var.g(c9VarS);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            if (i > 4) {
                i = 4;
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new phx(6, ((u7h) c9VarS.get(i2 % c9VarS.b())).a, "", (String) null, (String) null));
            }
            objT = mqo1.A(arrayList);
            x340Var.s0(objT);
        }
        return (c380) objT;
    }

    public static final vun0 q(q0a q0aVar, th30 th30Var) {
        ti30 ti30Var = q0aVar.a;
        Class cls = ti30Var.a;
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            eg.f(f4i1.f("ClassLoader of ", cls.getName(), " is null"));
            return null;
        }
        zf30 zf30VarA = th30Var.N().a(classLoader, cls.getName());
        zf30VarA.V0(ti30Var.b);
        zf30VarA.T0(ti30Var.c);
        return new vun0(zf30VarA, q0aVar.b);
    }

    public static final p6r0 r(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return yon1.G1("KID_ACCOUNT_CREATION_EDUCATION", "kid-account-creation/education", 877, "kid-account-creation");
        }
        if (yxa0Var instanceof uxa0) {
            AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
            return yon1.G1("KID_ACCOUNT_TRANSITION_EDUCATION", "kid-account-transition/education", 891, "kid-account-transition");
        }
        if (yxa0Var instanceof wxa0) {
            eg.m("ParentalConsentTransition should not reach the Education page");
            return null;
        }
        eg.o();
        return null;
    }

    public static final String s(String str, String str2, String str3, boolean z) {
        Set set = s4b1.f;
        String strZ = uic.x("spotify:internal:prompted-playlist:refine:".concat(uic.x(str).h())).z();
        if (strZ == null) {
            eg.m("Required value was null.");
            return null;
        }
        smc0 smc0VarN = k4p1.n();
        if (str2 != null) {
            smc0VarN.add("session_id=".concat(str2));
        }
        if (str3 != null) {
            smc0VarN.add("refinement_session_id=".concat(str3));
        }
        if (z) {
            smc0VarN.add("has_completed_refinement=true");
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        return !smc0VarK.isEmpty() ? f4i1.f(strZ, "?", o7h.y0(smc0VarK, "&", (String) null, (String) null, (iu30) null, 62)) : strZ;
    }

    public static final int t(sjz sjzVar) {
        int iOrdinal = sjzVar.ordinal();
        if (iOrdinal == 0) {
            return 3;
        }
        if (iOrdinal == 1) {
            return 4;
        }
        if (iOrdinal == 2) {
            return 6;
        }
        if (iOrdinal == 3) {
            return 1;
        }
        if (iOrdinal == 4) {
            return 2;
        }
        if (iOrdinal == 5) {
            return 7;
        }
        eg.o();
        return 0;
    }

    public static hfp1 u(BasePendingResult basePendingResult, phs0 phs0Var) {
        bsd1 bsd1Var = new bsd1();
        basePendingResult.b(new r9n1(basePendingResult, bsd1Var, phs0Var));
        return bsd1Var.a;
    }

    public static final lik1 v(yxa0 yxa0Var) {
        if (yxa0Var.equals(txa0.a) || (yxa0Var instanceof vxa0)) {
            return nik1.x3;
        }
        if (yxa0Var instanceof uxa0) {
            return cfm0.i("spotify:internal:kid-account-transition:education:", ((uxa0) yxa0Var).a, nik1.F3);
        }
        if (yxa0Var instanceof wxa0) {
            eg.m("ParentalConsentTransition should not reach the Education page");
            return null;
        }
        eg.o();
        return null;
    }
}
