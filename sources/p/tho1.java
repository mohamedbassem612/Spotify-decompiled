package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class tho1 {
    public static final Object a = new Object();
    public static b180 b;

    public static String A(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case grn1.d /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final void a(float f, iu30 iu30Var, xu30 xu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-300955701);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(72.0f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            boolean zI = ((i2 & 14) == 4) | ((i2 & 112) == 32) | x340Var.i(cvxVar) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ih6(cvxVar, f, iu30Var);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            xu30Var.invoke(new p3v((cvxVar.c + 16.0f) - 16.0f), x340Var, Integer.valueOf((i2 >> 6) & 112));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jh6((Object) iu30Var, f, (Object) xu30Var, i, (byte) 0);
        }
    }

    public static final void b(boolean z, float f, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1168711529);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            boolean zI = ((i2 & 14) == 4) | x340Var.i(cvxVar) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new lh6(z, cvxVar, f);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            int i3 = (((((i2 >> 3) & 112) | ((i2 >> 9) & 14)) << 6) & 896) | 6;
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l((i3 >> 6) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mh6(z, f, (Object) qim0Var, (cv30) j2iVar, i, (byte) 0);
        }
    }

    public static final void c(float f, float f2, float f3, iu30 iu30Var, iu30 iu30Var2, j2i j2iVar, j2i j2iVar2, vu30 vu30Var, xu30 xu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        iu30 iu30Var3;
        j2i j2iVar3;
        float f4 = f3;
        xu30 xu30Var2 = xu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-954618038);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.d(f2) ? 32 : 16) | (x340Var.d(f4) ? 256 : 128) | (x340Var.d(72.0f) ? 2048 : 1024) | (x340Var.i(vu30Var) ? 67108864 : 33554432) | (x340Var.i(xu30Var2) ? 536870912 : 268435456);
        if (x340Var.Y(i2 & 1, ((306783379 & i2) == 306783378 && ((x340Var.g(qim0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            float f5 = cvxVar.c;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new xj0(ven0Var, (byte) 22);
                x340Var.s0(objT2);
            }
            qim0 qim0VarG0 = irn1.g0(qim0VarD, (iu30) objT2);
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarG0);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
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
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            pbh pbhVar = pbh.a;
            if (vu30Var != null) {
                x340Var.i0(-694121808);
                qim0 qim0VarZ = uyn1.z(f5, 0.0f, 2, u291.f(nim0Var, 1.0f));
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                us71.j((i2 >> 24) & 14, vu30Var, x340Var, true);
                op71.g(x340Var, u291.h(nim0Var, 8.0f));
                op71.g(x340Var, u291.h(pbhVar.a(1.0f, nim0Var, false), f5 - 8.0f));
                x340Var.r(false);
            } else {
                x340Var.i0(-693810444);
                x340Var.r(false);
            }
            qim0 qim0VarS = u291.s(nim0Var, f, f2);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new gp0(ven0Var, iu30Var, (byte) 2);
                x340Var.s0(objT3);
            }
            qim0 qim0VarG1 = irn1.g0(qim0VarS, (iu30) objT3);
            gfh0 gfh0VarC3 = t1c.c(een.d, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarG1);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC3, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            int i3 = i2 >> 18;
            j2iVar.invoke(x340Var, 6);
            x340Var.r(true);
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            op71.g(x340Var, u291.h(pbhVar.a(1.0f, nim0Var, false), cvxVar.e - 8.0f));
            qim0 qim0VarB = uyn1.B(uyn1.z(f5, 0.0f, 2, u291.f(nim0Var, 1.0f)), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 48);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM5, x340Var, lljVar2);
            x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar4);
            j2iVar3 = j2iVar2;
            j2iVar3.invoke(x340Var, 6);
            op71.g(x340Var, u291.h(pbhVar.a(1.0f, nim0Var, false), f5 - 8.0f));
            x340Var.r(true);
            x340Var.r(true);
            if (xu30Var != null) {
                x340Var.i0(-362382919);
                f4 = f3;
                iu30Var3 = iu30Var2;
                xu30Var2 = xu30Var;
                a(f4, iu30Var3, xu30Var2, x340Var, (i3 & 7168) | ((i2 >> 6) & 126) | 384);
                x340Var.r(false);
            } else {
                f4 = f3;
                iu30Var3 = iu30Var2;
                xu30Var2 = xu30Var;
                x340Var.i0(-362162850);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            iu30Var3 = iu30Var2;
            j2iVar3 = j2iVar2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nh6(f, f2, f4, iu30Var, iu30Var3, j2iVar, j2iVar3, vu30Var, xu30Var2, qim0Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(h67 h67Var, String str, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1392170546);
        int i2 = (x340Var.i(h67Var) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (h67Var instanceof e67) {
                x340Var.i0(2141071012);
                g(((e67) h67Var).a, str, x340Var, i2 & 1008);
                x340Var.r(false);
            } else {
                if (!(h67Var instanceof g67)) {
                    throw p3d1.k(x340Var, 2141069678, false);
                }
                x340Var.i0(2141076804);
                m(((g67) h67Var).a, str, x340Var, i2 & 1008);
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(h67Var, str, qim0Var2, i, (byte) 5);
        }
    }

    public static final void e(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(461239995);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 32 : 16;
        }
        int i3 = i2;
        if (x340Var2.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            eso1.e(Uri.parse("https://learning-public-assets-cdn.spotifycdn.com/quiz/quotes.png"), isl.a, u291.f(nim0.a, 1.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4088);
            uwr uwrVar = cbx.a;
            gxo1.c(str, null, cbx.d(x340Var2).c, cbx.a(x340Var2).b.a, null, 0, false, null, null, 0.0f, (FontWeight) ((bjx) ajx.a.c).d, null, x340Var2, i3 & 14, 0, 3058);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0(str, qim0Var, i, (byte) 16);
        }
    }

    public static final void f(String str, String str2, Function0 function0, qim0 qim0Var, String str3, b0k b0kVar, int i, int i2) {
        String str4;
        int i3;
        x340 x340Var;
        String str5;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(882590601);
        int i4 = (x340Var2.g(str) ? 4 : 2) | i | (x340Var2.g(str2) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= x340Var2.i(function0) ? 256 : 128;
        }
        int i5 = i4 | 3072;
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i4 | 27648;
            str4 = str3;
        } else {
            str4 = str3;
            i3 = i5 | (x340Var2.g(str4) ? 16384 : 8192);
        }
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            if (i6 != 0) {
                str4 = null;
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarB, 16.0f, 12.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 54);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e(str, new wnb0(1.0f, true), cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var2, (i3 & 14) | 1572864, 0, 1712);
            x340Var = x340Var2;
            if (function0 != null) {
                x340Var.i0(1383606902);
                zzq0 zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
                String str6 = str4 == null ? str2 : str4;
                boolean z = (i3 & 896) == 256;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new ugj(function0, (byte) 28);
                    x340Var.s0(objT);
                }
                Function0 function1 = (Function0) objT;
                if (ihc1.y0(str6)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    cwl1.b((qim0) null, (tl3) null, (hw61) null, (pgx) null, zzq0VarH, (max) null, false, (idn0) null, ny3.a, new gbx(new y50(str6), function1), (gbx) null, apo.r(-1995692673, new kaf(str2, (byte) 18), x340Var), x340Var, 100687872, 48, 1263);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(1384005717);
                x340Var.r(false);
            }
            x340Var.r(true);
            str5 = str4;
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            str5 = str4;
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nym(str, str2, function0, qim0Var2, str5, i, i2);
        }
    }

    public static final void g(zz70 zz70Var, String str, b0k b0kVar, int i) {
        int i2;
        Uri uri;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1513060934);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(zz70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (zz70Var instanceof yz70) {
                uri = Uri.parse(((yz70) zz70Var).a);
            } else {
                if (!(zz70Var instanceof xz70)) {
                    eg.o();
                    return;
                }
                uri = Uri.parse(((xz70) zz70Var).a);
            }
            eso1.e(uri, new jsl(str), i1p1.q(u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3), er31.b(24.0f)), (p3v) null, (zvx) null, (ecx) null, mif1.S0, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 224256, 0, 3968);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(zz70Var, str, i);
        }
    }

    public static final void h(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1515769514);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ebg0(iu30Var, (byte) 26);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            ldx ldxVar = ldx.c;
            gdx gdxVarR = yla.r(x340Var);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.c;
            cvx cvxVar = cbx.b(x340Var).b;
            foo1.c(gbxVar, ldxVar, anm1.N("allboarding_contextual_audio_maybe_later_button", nim0.a), null, gdx.b(gdxVarR, new zzq0(f, 8.0f, f, 8.0f), 0.0f, 0.0f, 0.0f, 62), null, null, null, null, null, xzi.a, x340Var, 0, 48, 2008);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b30((byte) 24, i, iu30Var, false);
        }
    }

    public static final void i(Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(2020456015);
        int i2 = i | (b0kVar3.i(function0) ? 4 : 2) | (b0kVar3.i(function1) ? 32 : 16) | (b0kVar3.i(function2) ? 256 : 128) | (b0kVar3.i(qim0Var) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(b0kVar3).b.c, 0.0f, 2, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarZ);
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
            float f = cbx.b(b0kVar3).b.c;
            nim0 nim0Var = nim0.a;
            uwo1.e(ydh.g(f, 2131954566, b0kVar3, b0kVar3, nim0Var), u291.f(nim0Var, 1.0f), cbx.d(b0kVar3).d, cbx.a(b0kVar3).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2016);
            cvx cvxVar = cbx.b(b0kVar3).b;
            uwo1.e(ydh.g(16.0f, 2131954562, b0kVar3, b0kVar3, nim0Var), u291.f(nim0Var, 1.0f), cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, new a0e1(3), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2016);
            op71.g(b0kVar3, u291.h(nim0Var, cbx.b(b0kVar3).b.c));
            idx idxVar = new idx(4);
            String strO0 = cwl1.o0(b0kVar3, 2131954563);
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), idxVar, null, jax.a, null, null, null, null, null, null, a4j.a, b0kVar3, 0, 48, 2028);
            b0kVar2 = b0kVar3;
            j(function1, function2, ab80.o(nim0Var, cbx.b(b0kVar2).b.c, b0kVar2, nim0Var, 1.0f), b0kVar2, (i2 >> 3) & 126);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            x0d.s(nim0Var, 16.0f, b0kVar2, true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n3n(function0, function1, function2, qim0Var, i, (byte) 2);
        }
    }

    public static final void j(Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function2;
        int i2;
        b0k b0kVar2;
        smc0 smc0Var;
        zma1 zma1Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1908416580);
        if ((i & 6) == 0) {
            function2 = function0;
            i2 = (b0kVar3.i(function2) ? 4 : 2) | i;
        } else {
            function2 = function0;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131954555);
            String strO1 = cwl1.o0(b0kVar3, 2131954565);
            String strN0 = cwl1.n0(2131954564, new Object[]{strO0, strO1}, b0kVar3);
            uwr uwrVar = cbx.a;
            zma1 zma1Var2 = new zma1(cbx.a(b0kVar3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
            zma1 zma1Var3 = new zma1(cbx.a(b0kVar3).b.b, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534);
            smc0 smc0VarN = k4p1.n();
            int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
            if (iW0 >= 0) {
                smc0Var = smc0VarN;
                smc0Var.add(new xkc0(iW0, strO0.length() + iW0, strO0, "platform_rules", function2));
            } else {
                smc0Var = smc0VarN;
            }
            int iW1 = ihc1.w0(strN0, strO1, 0, false, 6);
            if (iW1 >= 0) {
                smc0Var.add(new xkc0(iW1, strO1.length() + iW1, strO1, "terms_of_use", function1));
            }
            List<xkc0> listA1 = o7h.a1(k4p1.k(smc0Var), new ktg0((byte) 4));
            b0kVar3.i0(-37249086);
            ye5 ye5Var = new ye5();
            b0kVar3.i0(-37247775);
            int i3 = 0;
            for (xkc0 xkc0Var : listA1) {
                if (i3 < xkc0Var.a) {
                    zma1Var = zma1Var3;
                    int iO = ye5Var.o(zma1Var);
                    try {
                        ye5Var.g(strN0.substring(i3, xkc0Var.a));
                        ye5Var.k(iO);
                    } catch (Throwable th) {
                        ye5Var.k(iO);
                        throw th;
                    }
                } else {
                    zma1Var = zma1Var3;
                }
                StringBuilder sb = ye5Var.a;
                int length = sb.length();
                int iO2 = ye5Var.o(zma1Var2);
                try {
                    ye5Var.g(xkc0Var.c);
                    ye5Var.k(iO2);
                    String str = xkc0Var.d;
                    boolean zG = b0kVar3.g(xkc0Var);
                    Object objT = b0kVar3.T();
                    if (zG || objT == fkj0.X) {
                        objT = new lq00(xkc0Var, (byte) 3);
                        b0kVar3.s0(objT);
                    }
                    ye5Var.a(new kjc0(str, (pae1) null, (rjc0) objT), length, sb.length());
                    i3 = xkc0Var.b;
                    zma1Var3 = zma1Var;
                } catch (Throwable th2) {
                    ye5Var.k(iO2);
                    throw th2;
                }
            }
            zma1 zma1Var4 = zma1Var3;
            b0kVar3.r(false);
            if (i3 < strN0.length()) {
                int iO3 = ye5Var.o(zma1Var4);
                try {
                    ye5Var.g(strN0.substring(i3));
                    ye5Var.k(iO3);
                } catch (Throwable th3) {
                    ye5Var.k(iO3);
                    throw th3;
                }
            }
            af5 af5VarP = ye5Var.p();
            b0kVar3.r(false);
            uwr uwrVar2 = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.f(af5VarP, qim0Var, cbx.d(b0kVar3).m, null, new a0e1(3), null, 0, false, null, 0, null, null, b0kVar2, (i2 >> 3) & 112, 0, 4072);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pj2(function0, function1, qim0Var, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void k(e2z0 e2z0Var, tlq tlqVar, vlq vlqVar, boolean z, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        iu30 iu30Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-263760469);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.i(e2z0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(tlqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(vlqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 16384 : 8192;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            klz0 klz0Var = (klz0) b0kVar2.k(llz0.a);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new tl11((ulq) ((ojq) tlqVar.a.c).Z0.get());
                b0kVar2.s0(objT);
            }
            tl11 tl11Var = (tl11) objT;
            boolean z2 = e2z0Var.d;
            boolean z3 = e2z0Var.c;
            k1z0 k1z0Var = e2z0Var.b;
            y2z0 y2z0Var = z2 ? new y2z0(e2z0Var.e) : z2z0.a;
            String str = k1z0Var.a;
            eh5 eh5Var = k1z0Var.g;
            String str2 = k1z0Var.b;
            String str3 = e2z0Var.a;
            int i3 = i2 & 57344;
            boolean z4 = i3 == 16384;
            Object objT2 = b0kVar2.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new ccy0(iu30Var, (byte) 24);
                b0kVar2.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            boolean z5 = i3 == 16384;
            Object objT3 = b0kVar2.T();
            if (z5 || objT3 == m4cVar) {
                objT3 = new ccy0(iu30Var, (byte) 25);
                b0kVar2.s0(objT3);
            }
            b3z0 b3z0Var = new b3z0(str, str2, str3, y2z0Var, z, function0, (Function0) objT3);
            cir0 cir0Var = (cir0) b0kVar2.k(k2r0.a);
            boolean zG = b0kVar2.g(k1z0Var.a);
            Object objT4 = b0kVar2.T();
            if (zG || objT4 == m4cVar) {
                ojq ojqVar = (ojq) vlqVar.a.c;
                wlq wlqVar = (wlq) ojqVar.c1.get();
                xlq xlqVar = (xlq) ojqVar.d1.get();
                zja1 zja1Var = (zja1) ojqVar.f.get();
                q8n q8nVar = (q8n) ((jiz0) ojqVar.b).a.get();
                c8o.l(q8nVar);
                objT4 = new d3z0(b3z0Var, cir0Var, wlqVar, xlqVar, zja1Var, q8nVar);
                b0kVar2.s0(objT4);
            }
            d3z0 d3z0Var = (d3z0) objT4;
            String upperCase = (z3 ? klz0Var.b.b.e : klz0Var.b.b.f).toUpperCase(Locale.ROOT);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z6 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            pbh pbhVar = pbh.a;
            qim0 qim0VarH = l6o1.H(pbhVar.a(1.0f, qim0VarF, true), l6o1.C(0, 0, 1, b0kVar2), false, 14);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarH);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarZ);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            op71.g(b0kVar2, pbhVar.a(1.0f, nim0Var, true));
            gxo1.c(upperCase, null, lee1.a(cbx.d(b0kVar2).a, 0L, fc11.G(96), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, fc11.D(0.83d), (u8e1) null, (wdt0) null, (shc0) null, 0, 16646141), z3 ? klz0Var.a.c : klz0Var.a.d, null, 0, false, new cjc0(1), new px8(fc11.G(60), fc11.G(96), 0L, new mx8(1), 4), 50.0f, (FontWeight) ((bjx) ajx.a.c).d, null, b0kVar2, 134217728, 0, 2162);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.r(nim0Var, 8.0f));
            vkk1 vkk1Var = eh5Var.b;
            if (vkk1Var == null) {
                b0kVar2.i0(1114183780);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1114183781);
                n(vkk1Var, u291.f(nim0Var, 1.0f), b0kVar2, 0);
                ywx0.n(nim0Var, cbx.b(b0kVar2).b.a, b0kVar2, false);
            }
            gxo1.c(eh5Var.d, null, cbx.d(b0kVar2).e, cbx.a(b0kVar2).b.a, null, 0, false, bjc0.a, null, 0.0f, null, null, b0kVar2, 0, 0, 3954);
            b0kVar2 = b0kVar2;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.r(nim0Var, 16.0f));
            if (eh5Var.c.isEmpty()) {
                iu30Var2 = iu30Var;
                b0kVar2.i0(1114909739);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1114706968);
                boolean z7 = i3 == 16384;
                Object objT5 = b0kVar2.T();
                if (z7 || objT5 == m4cVar) {
                    iu30Var2 = iu30Var;
                    objT5 = new ccy0(iu30Var2, (byte) 23);
                    b0kVar2.s0(objT5);
                } else {
                    iu30Var2 = iu30Var;
                }
                w361.f(0, (Function0) objT5, b0kVar2, (qim0) null);
                ywx0.n(nim0Var, cbx.b(b0kVar2).b.c, b0kVar2, false);
            }
            op71.g(b0kVar2, pbhVar.a(1.0f, nim0Var, true));
            if (eh5Var.e.isEmpty()) {
                b0kVar2.i0(1115229163);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1115031197);
                otw.c(tl11Var, new rl11(eh5Var.e), (qim0) null, (ipb1) null, b0kVar2, 8, 12);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            otw.c(d3z0Var, b3z0Var, uyn1.z(16.0f, 0.0f, 2, nim0Var), (ipb1) null, b0kVar2, 72, 8);
            b0kVar2.r(true);
        } else {
            iu30Var2 = iu30Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(e2z0Var, tlqVar, vlqVar, z, iu30Var2, i, (byte) 3);
        }
    }

    public static final void l(boolean z, String str, Function0 function0, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-810066091);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.g(nim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            long jB = z ? u7h.f : u7h.b(u7h.f, 0.3f, 0.0f, 0.0f, 0.0f, 14);
            qim0 qim0VarZ = uyn1.z(10.0f, 0.0f, 2, nim0Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            jtr jtrVar = jtr.f;
            int i4 = i2 & 14;
            boolean z2 = ((i2 & 896) == 256) | (i4 == 4);
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new y96(z, function0, (byte) 7);
                x340Var.s0(objT2);
            }
            qim0 qim0VarV = bin.v(qim0VarZ, idn0Var, jtrVar, false, null, null, (Function0) objT2, 28);
            cr31 cr31Var = er31.a;
            qim0 qim0VarQ = i1p1.q(qim0VarV, cr31Var);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            qim0 qim0VarR = u291.r(qim0VarQ, 32.0f);
            avw0 avw0Var = cbx.b(x340Var).c;
            qqb qqbVarD = k1u.d(2.0f, jB);
            qim0 qim0VarN = anm1.N("swatch", d1u.F(qim0VarR, qqbVarD.a, qqbVarD.b, cr31Var));
            boolean z3 = (i4 == 4) | ((i2 & 112) == 32);
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new cl1(z, str, (byte) 26);
                x340Var.s0(objT3);
            }
            qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT3);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l((i2 >> 12) & 14, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0(z, str, function0, j2iVar, i);
        }
    }

    public static final void m(j2k1 j2k1Var, String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1309300294);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            uwo1.e("FIXME render video", null, null, 0L, null, null, 0, false, null, 0, null, x340Var, 6, 0, 2046);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0(j2k1Var, str, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void n(vkk1 vkk1Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-802954326);
        int i2 = (x340Var.i(vkk1Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (vkk1Var instanceof tkk1) {
            x340Var.i0(1455010467);
            e(i2 & 112, ((tkk1) vkk1Var).a, x340Var, qim0Var);
            x340Var.r(false);
        } else {
            if (!(vkk1Var instanceof ukk1)) {
                throw p3d1.k(x340Var, 1455009102, false);
            }
            x340Var.i0(1455013965);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            x340Var.i0(-605286230);
            for (skk1 skk1Var : ((ukk1) vkk1Var).a) {
                d(skk1Var.a, skk1Var.b, null, x340Var, 0);
            }
            us71.m(x340Var, false, true, false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(vkk1Var, qim0Var, i, (byte) 9);
        }
    }

    public static final boolean o(qqb1 qqb1Var, int i, mqs0 mqs0Var) {
        boolean z;
        synchronized (a) {
            int i2 = qqb1Var.d;
            if (i2 == i) {
                qqb1Var.c = mqs0Var;
                z = true;
                qqb1Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static final void p(csr0 csr0Var) {
        lmb0 lmb0Var = oap1.B(csr0Var).f1;
        lmb0Var.p.Q0 = true;
        c6f0 c6f0Var = lmb0Var.q;
        if (c6f0Var != null) {
            c6f0Var.X0 = true;
        }
    }

    public static final boolean q(px3 px3Var, String str, j9k1 j9k1Var) {
        if (px3Var == px3.c && sgy.i(str)) {
            return j9k1Var.equals(fql.b) || j9k1Var.equals(eql.b);
        }
        return false;
    }

    public static void t(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }

    public static final k460 u(i460 i460Var) {
        return new k460(i460Var.a, i460Var.b, i460Var.c, i460Var.e, i460Var.d);
    }

    public static final s460 v(hvl1 hvl1Var) {
        return new s460(2, 482, hvl1Var.a, (String) null, hvl1Var.c, hvl1Var.d, hvl1Var.h);
    }

    public static final rhq0 w(mhq0 mhq0Var) {
        lay layVar = mhq0Var.c;
        String str = layVar.b;
        String str2 = layVar.a;
        String str3 = mhq0Var.a;
        String str4 = mhq0Var.b;
        return new rhq0(str2, !ihc1.y0(str4) ? new phq0(str4) : null, str, str3, 48);
    }

    public static final lzg1 x(prb1 prb1Var) {
        return new lzg1(prb1Var.a, prb1Var.b, prb1Var.c, prb1Var.d);
    }

    public static final lzg1 y(jzg1 jzg1Var) {
        lay layVar = jzg1Var.c;
        return new lzg1(layVar.a, jzg1Var.a, layVar.c, layVar.b);
    }

    public static final j4e z(b4e b4eVar) {
        zod.n("Must be called from the main thread.");
        ion1 ion1Var = ((ca61) b4eVar).a;
        String str = null;
        if (ion1Var != null) {
            try {
                con1 con1Var = (con1) ion1Var;
                Parcel parcelB1 = con1Var.b1(3, con1Var.a1());
                String string = parcelB1.readString();
                parcelB1.recycle();
                str = string;
            } catch (RemoteException unused) {
                ca61.b.b("Unable to call %s on %s.", new Object[]{"getSessionId", ion1.class.getSimpleName()});
            }
        }
        return new j4e(str, b4eVar);
    }

    public abstract void s();

    public void r() {
    }
}
