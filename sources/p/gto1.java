package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class gto1 {
    public static b180 a;

    public static hw61 A(uvx uvxVar, hw61 hw61Var, b0k b0kVar, int i) {
        if ((i & 2) != 0) {
            hw61Var = null;
        }
        if (hw61Var == null) {
            hw61Var = uvxVar.g;
        }
        x340 x340Var = (x340) b0kVar;
        if (hw61Var == null) {
            x340Var.i0(-564110884);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            hw61Var = er31.b(6.0f);
        } else {
            x340Var.i0(-564112031);
        }
        x340Var.r(false);
        return hw61Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static tvx B(int i, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        tvx tvxVar;
        int iC = l1d.C(i2);
        if (iC == 0 || iC == 1) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(2041037441);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            tvx tvxVar2 = new tvx(2.0f, 12.0f, 8.0f);
            x340Var.r(false);
            return tvxVar2;
        }
        if (iC != 2) {
            if (iC != 3 && iC != 4) {
                throw p3d1.k((x340) b0kVar, 2041035749, false);
            }
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(2041069409);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar4 = cbx.b(x340Var2).b;
            cvx cvxVar5 = cbx.b(x340Var2).b;
            cvx cvxVar6 = cbx.b(x340Var2).b;
            tvx tvxVar3 = new tvx(4.0f, 12.0f, 8.0f);
            x340Var2.r(false);
            return tvxVar3;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(-1152069612);
        int iC2 = l1d.C(i);
        if (iC2 == 0) {
            x340Var3.i0(2041049489);
            uwr uwrVar3 = cbx.a;
            cvx cvxVar7 = cbx.b(x340Var3).b;
            cvx cvxVar8 = cbx.b(x340Var3).b;
            cvx cvxVar9 = cbx.b(x340Var3).b;
            tvxVar = new tvx(4.0f, 12.0f, 8.0f);
            x340Var3.r(false);
        } else if (iC2 != 1) {
            if (iC2 != 2) {
                throw p3d1.k(x340Var3, 2041046446, false);
            }
            x340Var3.i0(2041049489);
            uwr uwrVar4 = cbx.a;
            cvx cvxVar10 = cbx.b(x340Var3).b;
            cvx cvxVar11 = cbx.b(x340Var3).b;
            cvx cvxVar12 = cbx.b(x340Var3).b;
            tvxVar = new tvx(4.0f, 12.0f, 8.0f);
            x340Var3.r(false);
        } else {
            x340Var3.i0(2041058929);
            uwr uwrVar5 = cbx.a;
            cvx cvxVar13 = cbx.b(x340Var3).b;
            cvx cvxVar14 = cbx.b(x340Var3).b;
            cvx cvxVar15 = cbx.b(x340Var3).b;
            tvxVar = new tvx(2.0f, 12.0f, 8.0f);
            x340Var3.r(false);
        }
        x340Var3.r(false);
        return tvxVar;
    }

    public static final yit C(j6o j6oVar) {
        boolean z = j6oVar instanceof i6o;
        bk8 bk8Var = bk8.Z;
        if (!z) {
            if (j6oVar instanceof f6o) {
                return new yit(new h3f0(((f6o) j6oVar).a), bk8Var, (n5o) null, 12);
            }
            return null;
        }
        i6o i6oVar = (i6o) j6oVar;
        String str = i6oVar.a;
        String str2 = i6oVar.b;
        return new yit(new x2f0(str, str2), bk8Var, new n5o(str, str2), 8);
    }

    public static final void a(c380 c380Var, n041 n041Var, b0k b0kVar, int i) {
        byte b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(468435359);
        byte b2 = 2;
        int i2 = ((i & 6) == 0 ? (x340Var.i(c380Var) ? 4 : 2) | i : i) | (x340Var.g(n041Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int size = c380Var.size();
            t0z t0zVar = mpg0.d;
            int iB = t0zVar.b();
            if (size > iB) {
                size = iB;
            }
            List listD1 = o7h.d1(t0zVar, size);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
            int i3 = vz31.b;
            qim0 qim0VarS = exd0.s(qim0VarD2, rz31.c);
            int i4 = i2 & 112;
            boolean zG = (i4 == 32) | x340Var.g(listD1);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new d4(n041Var, listD1, b2);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarS);
            cwl1.f(i3o1.n(2131233868, x340Var, 0), (String) null, u291.r(j9k1.x(nim0Var, new lw11(f8.a, (byte) 21)), 23.75f), (tl3) null, (j6m) null, 0.0f, new f2b(n041Var.a(), 5), x340Var, 56, 56);
            x340Var.i0(1590534921);
            for (mmr0 mmr0Var : o7h.v1(listD1, c380Var)) {
                mpg0 mpg0Var = (mpg0) mmr0Var.a;
                q041 q041Var = (q041) mmr0Var.b;
                lit litVar = mpg0Var.a;
                l(q041Var, n041Var, u291.r(eqr0.C(nim0Var, litVar.a - 2.5f, litVar.b - 2.5f), mpg0Var.a.c + 5.0f), x340Var, i4);
            }
            b = 0;
            x340Var.r(false);
            x340Var.r(true);
        } else {
            b = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(c380Var, n041Var, i, b);
        }
    }

    public static final void b(n041 n041Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-99963998);
        int i2 = (x340Var.g(n041Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            vz31.b(n041Var, qim0Var, apo.r(-1491053334, new h8(n041Var, (byte) 0), x340Var), x340Var, ((i2 << 3) & 112) | 3462);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i8(n041Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void c(wz31 wz31Var, n041 n041Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(423295245);
        int i2 = (x340Var.i(wz31Var) ? 4 : 2) | i | (x340Var.g(n041Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Configuration configuration = (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a);
            boolean zG = x340Var.g(wz31Var) | x340Var.g(configuration);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                Locale localeB = yoi1.A(configuration).b(0);
                if (localeB == null) {
                    localeB = Locale.ROOT;
                }
                Resources resources = context.getResources();
                localeB.getClass();
                objT = crm0.C(wz31Var, resources, localeB);
                x340Var.s0(objT);
            }
            vz31.b(n041Var, qim0Var, apo.r(-1140549947, new n891(wz31Var, n041Var, (p041) objT, (byte) 1), x340Var), x340Var, (i2 & 112) | 3462);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j8(wz31Var, n041Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void d(ArrayList arrayList, n041 n041Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1511557134);
        int i2 = (x340Var.g(arrayList) ? 4 : 2) | i | (x340Var.g(n041Var) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            w2g0.c(qim0Var, (tl3) null, apo.r(-1396805176, new k8((Object) arrayList, (Object) o8.a(x340Var), (Object) n041Var, (Object) d5p1.q(0, x340Var, 1), (byte) 0), x340Var), x340Var, ((i2 >> 6) & 14) | 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q1((Object) arrayList, (Object) n041Var, (Object) qim0Var, i, (byte) 1);
        }
    }

    public static final void e(p041 p041Var, n041 n041Var, b0k b0kVar, int i) {
        byte b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1732012201);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.g(p041Var) ? 4 : 2) | i | (x340Var.g(n041Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            n8 n8VarA = o8.a(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            String str = p041Var.a;
            ArrayList arrayList = p041Var.c;
            vz31.a(0, n041Var.a(), str, x340Var, null, n8VarA.a);
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            b = 1;
            i(cwl1.o0(x340Var, 2131961375), p041Var.b, n041Var, null, x340Var, (i2 << 3) & 896);
            if (arrayList.isEmpty()) {
                x340Var.i0(-1453385933);
                x340Var.r(false);
            } else {
                x340Var.i0(-1453454164);
                d(arrayList, n041Var, new wnb0(1.0f, true), x340Var, i2 & 112);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            b = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n2(p041Var, n041Var, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void f(String str, String str2, qim0 qim0Var, boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z3;
        boolean z4;
        h311 h311VarV;
        qim0 qim0Var3;
        int i5;
        int i6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1008034962);
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(str2) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (x340Var.h(z)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i3 |= i6;
            }
            i4 = i3 | 24576;
            if ((196608 & i) == 0) {
                if (x340Var.i(iu30Var)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i4 |= i5;
            }
            if ((74899 & i4) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                if (i7 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                k(str, apo.r(-555281224, new y5d0(str2, (byte) 25), x340Var), qim0Var3, z, true, iu30Var, x340Var, (i4 & 14) | 48 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                qim0Var2 = qim0Var3;
                z4 = true;
            } else {
                x340Var.b0();
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new oli0(str, str2, qim0Var2, z, z4, iu30Var, i, i2);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) == 0) {
            if (x340Var.h(z)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        i4 = i3 | 24576;
        if ((196608 & i) == 0) {
            if (x340Var.i(iu30Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i4 |= i5;
        }
        if ((74899 & i4) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i4 & 1, z3)) {
            if (i7 != 0) {
                qim0Var3 = nim0.a;
            } else {
                qim0Var3 = qim0Var2;
            }
            k(str, apo.r(-555281224, new y5d0(str2, (byte) 25), x340Var), qim0Var3, z, true, iu30Var, x340Var, (i4 & 14) | 48 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            qim0Var2 = qim0Var3;
            z4 = true;
        } else {
            x340Var.b0();
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oli0(str, str2, qim0Var2, z, z4, iu30Var, i, i2);
        }
    }

    public static final void g(String str, af5 af5Var, cqs0 cqs0Var, qim0 qim0Var, boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(943033189);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(af5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(cqs0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 1048576 : 524288;
        }
        byte b = 1;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = (i2 & 14) | 48;
            int i4 = i2 >> 3;
            k(str, apo.r(1958285439, new ul(af5Var, cqs0Var, b), x340Var), qim0Var, z, z2, iu30Var, x340Var, i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bw1(str, af5Var, cqs0Var, qim0Var, z, z2, iu30Var, i);
        }
    }

    public static final void h(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1059296855);
        int i2 = (b0kVar3.i(function0) ? 4 : 2) | i | 48;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(b0kVar3, 2131952924);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("PersonalAppsError", u291.f(qim0Var3, 1.0f)), null, null, false, null, null, null, null, null, null, null, null, apo.r(-1234203358, new t1(strO0, function0, (byte) 6), b0kVar3), null, null, f7j.b, b0kVar2, 0, 196992, 28670);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(function0, qim0Var2, i, (byte) 19);
        }
    }

    public static final void i(String str, String str2, n041 n041Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String str3;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1276892708);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str2;
            i2 |= x340Var.g(str3) ? 32 : 16;
        } else {
            str3 = str2;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(n041Var) : x340Var.i(n041Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            n8 n8VarA = o8.a(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            lee1 lee1Var = n8VarA.b;
            lee1 lee1Var2 = n8VarA.c;
            boolean z = n041Var.b;
            vex vexVar = n041Var.c;
            jch0.c(str, (qim0) null, lee1.a(lee1Var, z ? vexVar.l : vexVar.e, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (iu30) null, 0, false, 1, 0, (x9h) null, (m0e1) null, x340Var, (i3 & 14) | 1572864, 954);
            jch0.c(str3, j9k1.x(qim0Var3, new t041(1, lee1Var2.b.c)), lee1.a(lee1Var2, n041Var.a(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (iu30) null, 0, false, 1, 0, (x9h) null, (m0e1) null, x340Var, ((i3 >> 3) & 14) | 1769472, 920);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, str, str2, n041Var, qim0Var2, (byte) 0);
        }
    }

    public static final void j(ArrayList arrayList, vi11 vi11Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        vzq0 vzq0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1493825673);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vi11Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            vzq0Var2 = vzq0Var;
            i2 |= x340Var.i(vzq0Var2) ? 256 : 128;
        } else {
            vzq0Var2 = vzq0Var;
        }
        int i3 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            boolean zI = x340Var.i(nim0Var) | x340Var.i(arrayList) | x340Var.i(vi11Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ccb1(arrayList, vi11Var);
                x340Var.s0(objT);
            }
            ujo1.d(null, null, vzq0Var2, false, d36Var, null, null, false, null, (iu30) objT, x340Var, i2 & 896, 491);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cyc1(arrayList, vi11Var, vzq0Var, i, (byte) 0);
        }
    }

    public static final void k(String str, j2i j2iVar, qim0 qim0Var, boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        boolean z3;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(592729314);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            i2 |= b0kVar2.h(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar2.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar2.i(iu30Var) ? 131072 : 65536;
        }
        if (b0kVar2.Y(i2 & 1, (74899 & i2) != 74898)) {
            fra fraVar = een.N0;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarY = uyn1.y(qim0VarZ, 16.0f, 8.0f);
            pm31 pm31Var = new pm31(2);
            boolean z4 = (458752 & i2) == 131072;
            Object objT = b0kVar2.T();
            if (z4 || objT == m4cVar) {
                objT = new mhg0(iu30Var, (byte) 26);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarD = qmo1.D(qim0VarY, z3, z2, pm31Var, (iu30) objT, 8);
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = fii0.O0;
                b0kVar2.s0(objT2);
            }
            qim0 qim0VarN = anm1.N("member-details-toggle-row-root-description", s161.b(qim0VarD, true, (iu30) objT2));
            jw31 jw31VarA = ew31.a(h36.g, fraVar, b0kVar2, 54);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z5 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int i3 = i2;
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            lee1 lee1Var = cbx.d(b0kVar2).g;
            long j = cbx.a(b0kVar2).b.a;
            nim0 nim0Var = nim0.a;
            uwo1.e(str, anm1.N("member-details-toggle-row-title", nim0Var), lee1Var, j, new a0e1(5), null, 0, false, null, 0, null, b0kVar2, (i3 & 14) | 48, 0, 2016);
            j2iVar.invoke(b0kVar2, Integer.valueOf((i3 >> 3) & 14));
            b0kVar2.r(true);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(nim0Var, 12.0f));
            tad1 tad1VarM = hxo1.m(cbx.a(b0kVar2).b.a, cbx.a(b0kVar2).b.f, cbx.a(b0kVar2).b.b, cbx.a(b0kVar2).a.b.a(), cbx.a(b0kVar2).b.b, b0kVar2, 65420);
            b0kVar2 = b0kVar2;
            ljo1.j(z, null, anm1.N("member-details-toggle-row-switch", nim0Var), z2, tad1VarM, null, b0kVar2, ((i3 >> 9) & 14) | 432 | (i3 & 57344), 72);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wl(str, j2iVar, qim0Var, z, z2, iu30Var, i, (byte) 1);
        }
    }

    public static final void l(q041 q041Var, n041 n041Var, qim0 qim0Var, b0k b0kVar, int i) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-898156500);
        int i2 = i | (x340Var.i(q041Var) ? 4 : 2) | (x340Var.g(n041Var) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarQ = i1p1.q(qim0Var, er31.b(4.5f));
            long jA = n041Var.a();
            vex vexVar = n041Var.c;
            boolean z2 = n041Var.b;
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF = dug.f(dug.f(i1p1.q(uyn1.x(dug.f(qim0VarQ, jA, u5j1Var), 2.5f), er31.b(2.0f)), n041Var.a, u5j1Var), z2 ? vexVar.i : vexVar.b, u5j1Var);
            boolean zI = x340Var.i(q041Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new m8(q041Var, (byte) 0);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, false, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            yk4 yk4Var = q041Var.b;
            nim0 nim0Var = nim0.a;
            if (yk4Var != null) {
                x340Var.i0(355198581);
                cwl1.g(yk4Var, (String) null, u291.d(nim0Var, 1.0f), mif1.P0, 3, x340Var, 25008, 104);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(355497018);
                z = true;
                w0h1.a(ltx.c, isl.a, u291.d(nim0Var, 0.5f), z2 ? vexVar.l : vexVar.e, 0L, false, x340Var, ltx.d | 432, 48);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q1((Object) q041Var, (Object) n041Var, (Object) qim0Var, i, (byte) 2);
        }
    }

    public static final llm m() {
        return smo1.e(flo1.l(guo1.B(), new sf01(olj0.T0)));
    }

    public static final void n(g1i g1iVar) {
        g65 g65Var = new g65((byte) 3);
        jd11 jd11Var = rc11.a;
        g1iVar.k(g65Var, jd11Var.b(String.class));
        g1iVar.k(new g65((byte) 1), jd11Var.b(s8s0.class));
        q05 q05Var = new q05((byte) 3);
        tka0 tka0VarB = jd11Var.b(j2i1.class);
        ArrayList arrayList = (ArrayList) g1iVar.d;
        arrayList.add(new mmr0(q05Var, tka0VarB));
        arrayList.add(new mmr0(new r2i1(), jd11Var.b(j2i1.class)));
        g1iVar.j(new j67((byte) 6), jd11Var.b(j2i1.class));
        g1iVar.j(new j67((byte) 1), jd11Var.b(byte[].class));
        g1iVar.j(new j67((byte) 4), jd11Var.b(j2i1.class));
    }

    public static final void o(g1i g1iVar, pf01 pf01Var) {
        if (((Boolean) kto1.w(pf01Var.b.n, z1a1.a)).booleanValue()) {
            ((ArrayList) g1iVar.e).add(new el70((byte) 25));
            ((ArrayList) g1iVar.f).add(new el70((byte) 26));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    public static zzq0 p(int i, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        x340 x340Var;
        int iC;
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar).b;
        int iC2 = l1d.C(i);
        float f = 8.0f;
        if (iC2 == 0) {
            x340Var = (x340) b0kVar;
            x340Var.i0(1417846691);
            iC = l1d.C(i2);
            if (iC != 0) {
                x340Var.i0(1154117834);
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 4.0f;
            } else if (iC != 1 || iC == 2) {
                x340Var.i0(1154121354);
                cvx cvxVar3 = cbx.b(x340Var).b;
                x340Var.r(false);
            } else {
                if (iC != 3 && iC != 4) {
                    throw p3d1.k(x340Var, 1154115647, false);
                }
                x340Var.i0(1154124937);
                cvx cvxVar4 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 12.0f;
            }
            x340Var.r(false);
        } else if (iC2 != 1) {
            if (iC2 != 2) {
                throw p3d1.k((x340) b0kVar, 1154111575, false);
            }
            x340Var = (x340) b0kVar;
            x340Var.i0(1417846691);
            iC = l1d.C(i2);
            if (iC != 0) {
                x340Var.i0(1154117834);
                cvx cvxVar5 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 4.0f;
            } else if (iC != 1) {
                x340Var.i0(1154121354);
                cvx cvxVar6 = cbx.b(x340Var).b;
                x340Var.r(false);
            } else {
                x340Var.i0(1154121354);
                cvx cvxVar7 = cbx.b(x340Var).b;
                x340Var.r(false);
            }
            x340Var.r(false);
        } else {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1418205578);
            int iC3 = l1d.C(i2);
            if (iC3 == 0 || iC3 == 1) {
                x340Var2.i0(1154130602);
                cvx cvxVar8 = cbx.b(x340Var2).b;
                x340Var2.r(false);
            } else {
                if (iC3 != 2 && iC3 != 3 && iC3 != 4) {
                    throw p3d1.k(x340Var2, 1154127224, false);
                }
                x340Var2.i0(1154135305);
                f = cbx.b(x340Var2).b.b;
                x340Var2.r(false);
            }
            x340Var2.r(false);
        }
        return new zzq0(12.0f, f, 12.0f, f);
    }

    public static tac0 q(qd41 qd41Var) {
        return new tac0(qd41Var, false);
    }

    public static final Locale s(Iterable iterable) {
        Object next;
        Iterator it = iterable.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((nv7) next).b);
        nv7 nv7Var = (nv7) next;
        if (nv7Var != null) {
            return nv7Var.a;
        }
        return null;
    }

    public static final byte[] t(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            bArrDigest.getClass();
            return bArrDigest;
        } catch (NoSuchAlgorithmException e) {
            eg.j(e);
            return null;
        }
    }

    public static final String u(byte[] bArr) {
        return String.format("%064x", Arrays.copyOf(new Object[]{new BigInteger(1, t(bArr))}, 1));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static float x(int i, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        float f = 16.0f;
        if (iC != 0) {
            if (iC == 1) {
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(-1838616538);
                int iC2 = l1d.C(i2);
                if (iC2 == 0) {
                    x340Var.i0(-1167686550);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    x340Var.r(false);
                } else if (iC2 == 1) {
                    x340Var.i0(-1167683737);
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    x340Var.r(false);
                    f = 24.0f;
                } else {
                    if (iC2 != 2 && iC2 != 3 && iC2 != 4) {
                        throw p3d1.k(x340Var, -1167688868, false);
                    }
                    x340Var.i0(-1167678710);
                    uwr uwrVar3 = cbx.a;
                    zov0 zov0Var3 = cbx.b(x340Var).g;
                    x340Var.r(false);
                    f = 48.0f;
                }
                x340Var.r(false);
                return f;
            }
            if (iC != 2) {
                throw p3d1.k((x340) b0kVar, -1167708919, false);
            }
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-1839114274);
        int iC3 = l1d.C(i2);
        if (iC3 == 0) {
            x340Var2.i0(-1167702710);
            uwr uwrVar4 = cbx.a;
            zov0 zov0Var4 = cbx.b(x340Var2).g;
            x340Var2.r(false);
        } else if (iC3 == 1) {
            x340Var2.i0(-1167699897);
            uwr uwrVar5 = cbx.a;
            zov0 zov0Var5 = cbx.b(x340Var2).g;
            x340Var2.r(false);
            f = 24.0f;
        } else if (iC3 == 2) {
            x340Var2.i0(-1167697206);
            uwr uwrVar6 = cbx.a;
            zov0 zov0Var6 = cbx.b(x340Var2).g;
            x340Var2.r(false);
            f = 48.0f;
        } else if (iC3 == 3) {
            x340Var2.i0(-1167694390);
            uwr uwrVar7 = cbx.a;
            zov0 zov0Var7 = cbx.b(x340Var2).g;
            x340Var2.r(false);
            f = 64.0f;
        } else {
            if (iC3 != 4) {
                throw p3d1.k(x340Var2, -1167704924, false);
            }
            x340Var2.i0(-1167691542);
            uwr uwrVar8 = cbx.a;
            zov0 zov0Var8 = cbx.b(x340Var2).g;
            x340Var2.r(false);
            f = 88.0f;
        }
        x340Var2.r(false);
        return f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static float y(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC == 0) {
            x340 x340Var = (x340) b0kVar;
            x340Var.i0(1713184290);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            x340Var.r(false);
            return 32.0f;
        }
        if (iC == 1) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1713186655);
            uwr uwrVar2 = cbx.a;
            mta mtaVar2 = cbx.b(x340Var2).d;
            x340Var2.r(false);
            return 48.0f;
        }
        if (iC != 2 && iC != 3 && iC != 4) {
            throw p3d1.k((x340) b0kVar, 1713182055, false);
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(1713190977);
        uwr uwrVar3 = cbx.a;
        mta mtaVar3 = cbx.b(x340Var3).d;
        x340Var3.r(false);
        return 56.0f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public String r(int i, byte[] bArr, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            t8e1.n("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
            return null;
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!eso1.n(b)) {
                break;
            }
            i++;
            eso1.o(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (eso1.n(b2)) {
                int i7 = i5 + 1;
                eso1.o(b2, cArr, i5);
                int i8 = i6;
                while (i8 < i3) {
                    byte b3 = bArr[i8];
                    if (!eso1.n(b3)) {
                        break;
                    }
                    i8++;
                    eso1.o(b3, cArr, i7);
                    i7++;
                }
                i5 = i7;
                i = i8;
            } else {
                if (!(b2 < -32)) {
                    if (b2 < -16) {
                        if (i6 >= i3 - 1) {
                            throw InvalidProtocolBufferException.a();
                        }
                        int i9 = i + 2;
                        i += 3;
                        eso1.w(b2, bArr[i6], bArr[i9], cArr, i5);
                        i5++;
                    } else {
                        if (i6 >= i3 - 2) {
                            throw InvalidProtocolBufferException.a();
                        }
                        byte b4 = bArr[i6];
                        int i10 = i + 3;
                        byte b5 = bArr[i + 2];
                        i += 4;
                        eso1.v(b2, b4, b5, bArr[i10], cArr, i5);
                        i5 += 2;
                    }
                } else {
                    if (i6 >= i3) {
                        throw InvalidProtocolBufferException.a();
                    }
                    i += 2;
                    eso1.x(b2, bArr[i6], cArr, i5);
                    i5++;
                }
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.loi1 */
    public int v(String str, byte[] bArr, int i, int i2) throws loi1 {
        int i3;
        int i4;
        char cCharAt;
        int length = str.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
            bArr[i4] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new loi1(i6, length);
                        }
                        hhg1.d(cCharAt2, i7);
                        return 0;
                    }
                    int i9 = i6 + 1;
                    if (i9 != str.length()) {
                        char cCharAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i10 = i7 + 3;
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new loi1(i6 - 1, length);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i11 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
    }

    public boolean w(int i, byte[] bArr, int i2) {
        return z(i, bArr, i2) == 0;
    }

    public int z(int i, byte[] bArr, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return soi1.d(i3, bArr, i2);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return soi1.d(i3, bArr, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }
}
