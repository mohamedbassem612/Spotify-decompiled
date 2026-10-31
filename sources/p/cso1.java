package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.android.permissionsimpl.PermissionsRequestActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class cso1 {
    public static b180 a;

    public static boolean A(byte b) {
        return b > -65;
    }

    public static Intent B(Context context, String... strArr) {
        if (strArr.length == 0) {
            hhg1.n("Permissions list is empty");
            return null;
        }
        Intent intent = new Intent(context, (Class<?>) PermissionsRequestActivity.class);
        int i = PermissionsRequestActivity.d;
        intent.putExtra("REQUESTED_PERMISSIONS", strArr);
        return intent;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void a(jlw0 jlw0Var, int i, String str, String str2, s171 s171Var, xwa xwaVar, qim0 qim0Var, b0k b0kVar, int i2, int i3) {
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(875344725);
        int i4 = i2 | (x340Var.i(jlw0Var) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.i(s171Var) ? 16384 : 8192) | (x340Var.i(xwaVar) ? 131072 : 65536);
        int i5 = i3 & 64;
        if (i5 == 0) {
            if ((i2 & 1572864) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.i(qim0Var2) ? 1048576 : 524288;
            }
            if ((599187 & i4) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i5 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                und.a(xwaVar, (qim0) null, 0.0f, apo.r(374124346, new ms7(jlw0Var, i, str, str2, s171Var, qim0Var4), x340Var), x340Var, ((i4 >> 15) & 14) | 3072, 6);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ns7(jlw0Var, i, str, str2, s171Var, xwaVar, qim0Var3, i2, i3);
            }
        }
        i4 |= 1572864;
        qim0Var2 = qim0Var;
        if ((599187 & i4) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            if (i5 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            und.a(xwaVar, (qim0) null, 0.0f, apo.r(374124346, new ms7(jlw0Var, i, str, str2, s171Var, qim0Var4), x340Var), x340Var, ((i4 >> 15) & 14) | 3072, 6);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns7(jlw0Var, i, str, str2, s171Var, xwaVar, qim0Var3, i2, i3);
        }
    }

    public static final void b(jlw0 jlw0Var, int i, String str, String str2, s171 s171Var, qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(683377460);
        int i3 = i2 | (x340Var.i(jlw0Var) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.i(s171Var) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            qim0 qim0VarF = dug.f(u291.d(zr7.i(qim0Var, gce0.a1), 1.0f), z4p1.e(i), d4o1.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var = cbx.b(x340Var).g;
            n9p1.j(jlw0Var, 88.0f, str, str2, 3, new wnb0(1.0f, true), 0, x340Var, (i3 & 14) | 24576 | (i3 & 896) | (i3 & 7168), 64);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0.a, 12.0f));
            sbl.o(s171Var, (qim0) null, 0, x340Var, (i3 >> 12) & 14, 6);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ms7(jlw0Var, i, str, str2, s171Var, qim0Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x027e  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c2  */
    public static final void c(String str, Function0 function0, boolean z, s4o s4oVar, c380 c380Var, j2i j2iVar, bxn bxnVar, iu30 iu30Var, ubc ubcVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        x340 x340Var;
        x340 x340Var2;
        m4c m4cVar;
        nim0 nim0Var;
        m4c m4cVar2;
        boolean z2;
        boolean z3;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-9885642);
        int i2 = i | (x340Var3.g(str) ? 4 : 2) | (x340Var3.i(function0) ? 32 : 16) | (x340Var3.h(z) ? 256 : 128) | (x340Var3.i(s4oVar) ? 2048 : 1024) | (x340Var3.i(c380Var) ? 16384 : 8192) | (x340Var3.g(bxnVar) ? 1048576 : 524288) | (x340Var3.i(iu30Var) ? 8388608 : 4194304) | (x340Var3.g(ubcVar) ? 67108864 : 33554432);
        if (x340Var3.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            int i3 = (i2 & 234881024) | (i2 & 8190) | 32768 | (57344 & i2) | 196608 | (i2 & 3670016) | (i2 & 29360128);
            x340Var3.i0(962312192);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            Object objT = x340Var3.T();
            m4c m4cVar3 = fkj0.X;
            if (objT == m4cVar3) {
                objT = ktd.n(x340Var3);
            }
            fra fraVar = een.N0;
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarA = da80.a(anm1.N("standard_header_creator_row", nim0Var2), (idn0) objT, jtr.f);
            boolean z4 = (((i3 & 112) ^ 48) > 32 && x340Var3.g(function0)) || (i3 & 48) == 32;
            Object objT2 = x340Var3.T();
            if (z4 || objT2 == m4cVar3) {
                objT2 = new j3n(function0, (byte) 8);
                x340Var3.s0(objT2);
            }
            qim0 qim0VarX = bin.x(qim0VarA, false, null, null, null, (Function0) objT2, 15);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarX);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(jw31VarA, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            if (c380Var.isEmpty()) {
                x340Var2 = x340Var3;
                m4cVar = m4cVar3;
                nim0Var = nim0Var2;
                x340Var2.i0(330790886);
                x340Var2.r(false);
            } else {
                x340Var3.i0(330533338);
                nim0Var = nim0Var2;
                m4cVar = m4cVar3;
                fc11.a(c380Var, (qim0) null, hcx.b, z ? hrx.c : null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var3, ((i3 >> 12) & 14) | 24968 | (hrx.d << 9), 482);
                x340Var2 = x340Var3;
                ywx0.n(nim0Var, 8.0f, x340Var2, false);
            }
            af5 af5Var = s4oVar.a;
            cjc0 cjc0Var = new cjc0(1);
            lee1 lee1Var = cbx.d(x340Var2).k;
            qim0 qim0VarN = anm1.N("standard_header_creator_row_creator", nim0Var);
            boolean zI = x340Var2.i(s4oVar);
            Object objT3 = x340Var2.T();
            if (zI) {
                m4cVar2 = m4cVar;
            } else {
                m4cVar2 = m4cVar;
                if (objT3 == m4cVar2) {
                }
                x340 x340Var4 = x340Var2;
                m4c m4cVar4 = m4cVar2;
                uwo1.f(af5Var, kx40.h(1.0f, s161.b(qim0VarN, false, (iu30) objT3), false), lee1Var, null, null, null, 2, false, cjc0Var, 0, null, null, x340Var4, 0, 0, 3768);
                x340Var = x340Var4;
                if (bxnVar != null || iu30Var == null) {
                    z2 = false;
                    x340Var.i0(332378086);
                    x340Var.r(false);
                } else {
                    x340Var.i0(331345972);
                    op71.g(x340Var, u291.r(nim0Var, 4.0f));
                    uwo1.e("•", null, cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, 6, 0, 2042);
                    op71.g(x340Var, u291.r(nim0Var, 4.0f));
                    if (((i3 & 29360128) ^ 12582912) <= 8388608 || !x340Var.g(iu30Var)) {
                        x340Var = x340Var;
                        x340Var = x340Var;
                        if ((i3 & 12582912) == 8388608) {
                            x340Var = x340Var;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        x340Var = x340Var;
                        z3 = true;
                    }
                    boolean z5 = ((((i3 & 3670016) ^ 1572864) > 1048576 && x340Var.i(bxnVar)) || (i3 & 1572864) == 1048576) | z3;
                    Object objT4 = x340Var.T();
                    if (z5 || objT4 == m4cVar4) {
                        objT4 = new sqm(iu30Var, bxnVar, (byte) 10);
                        x340Var.s0(objT4);
                    }
                    eso1.d((Function0) objT4, apo.r(1749379739, new h1m(bxnVar, cvxVar), x340Var), x340Var, 48);
                    z2 = false;
                    x340Var.r(false);
                }
                j2iVar2 = j2iVar;
                k4s0.i(6, j2iVar2, x340Var, true, z2);
            }
            objT3 = new fnn(s4oVar, (byte) 7);
            x340Var2.s0(objT3);
            x340 x340Var5 = x340Var2;
            m4c m4cVar5 = m4cVar2;
            uwo1.f(af5Var, kx40.h(1.0f, s161.b(qim0VarN, false, (iu30) objT3), false), lee1Var, null, null, null, 2, false, cjc0Var, 0, null, null, x340Var5, 0, 0, 3768);
            x340Var = x340Var5;
            if (bxnVar != null) {
                z2 = false;
                x340Var.i0(332378086);
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(332378086);
                x340Var.r(false);
            }
            j2iVar2 = j2iVar;
            k4s0.i(6, j2iVar2, x340Var, true, z2);
        } else {
            j2iVar2 = j2iVar;
            x340Var = x340Var3;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qw1(str, function0, z, s4oVar, c380Var, j2iVar2, bxnVar, iu30Var, ubcVar, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    public static final void d(Uri uri, ksl kslVar, qim0 qim0Var, j6m j6mVar, jmr0 jmr0Var, jmr0 jmr0Var2, tl3 tl3Var, b0k b0kVar, int i, int i2) {
        Uri uri2;
        int i3;
        qim0 qim0Var2;
        j6m j6mVar2;
        tl3 tl3Var2;
        jmr0 jmr0Var3;
        j6m j6mVar3;
        jmr0 jmr0Var4;
        jmr0 jmr0Var5;
        jmr0 jmr0Var6;
        int i4;
        j6m j6mVar4;
        tl3 tl3Var3;
        int i5;
        int i6;
        jmr0 jmr0VarE = jmr0Var;
        jmr0 jmr0Var7 = jmr0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1193210422);
        if ((i & 6) == 0) {
            uri2 = uri;
            i3 = (x340Var.g(uri2) ? 4 : 2) | i;
        } else {
            uri2 = uri;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(kslVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i3 |= x340Var.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j6mVar2 = j6mVar;
                int i7 = x340Var.i(j6mVar2) ? 2048 : 1024;
                i3 |= i7;
            } else {
                j6mVar2 = j6mVar;
            }
            i3 |= i7;
        } else {
            j6mVar2 = j6mVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) != 0) {
                i6 = 8192;
            } else {
                if ((32768 & i) == 0 ? x340Var.g(jmr0VarE) : x340Var.i(jmr0VarE)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
            }
            i3 |= i6;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) != 0) {
                i5 = 65536;
            } else {
                if ((i & 262144) == 0 ? x340Var.g(jmr0Var7) : x340Var.i(jmr0Var7)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
            }
            i3 |= i5;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                tl3Var2 = tl3Var;
                int i8 = x340Var.i(tl3Var2) ? 1048576 : 524288;
                i3 |= i8;
            } else {
                tl3Var2 = tl3Var;
            }
            i3 |= i8;
        } else {
            tl3Var2 = tl3Var;
        }
        int i9 = i3 | 12582912;
        if (x340Var.Y(i9 & 1, (4793491 & i9) != 4793490)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if ((i2 & 8) != 0) {
                    j6mVar2 = mif1.S0;
                    i9 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    jmr0VarE = hso1.E(2131232011, 0L, false, 0L, x340Var, 0, 14);
                    i9 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i9 &= -458753;
                    jmr0Var7 = jmr0VarE;
                }
                if ((i2 & 64) != 0) {
                    tl3Var2 = een.h;
                    i9 &= -3670017;
                }
                jmr0Var5 = jmr0VarE;
                jmr0Var6 = jmr0Var7;
                i4 = i9;
                j6mVar4 = j6mVar2;
                tl3Var3 = tl3Var2;
            } else {
                x340Var.b0();
                if ((i2 & 8) != 0) {
                    i9 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i9 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i9 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i9 &= -3670017;
                }
                jmr0Var5 = jmr0VarE;
                jmr0Var6 = jmr0Var7;
                i4 = i9;
                j6mVar4 = j6mVar2;
                tl3Var3 = tl3Var2;
                x340Var = x340Var;
            }
            x340Var.s();
            int i10 = i4 << 3;
            f(oi7.a(uri2, (gw70) null, (xb10) null, (yqi1) null, jmr0Var5, jmr0Var6, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, (i4 & 14) | 262144 | (458752 & i10) | 2097152 | (3670016 & i10) | (i10 & 234881024), 0, 130718), kslVar, qim0Var2, j6mVar4, tl3Var3, x340Var, (i4 & 8176) | ((i4 >> 6) & 57344), 32);
            tl3Var2 = tl3Var3;
            jmr0Var3 = jmr0Var5;
            jmr0Var4 = jmr0Var6;
            j6mVar3 = j6mVar4;
        } else {
            x340Var = x340Var;
            x340Var.b0();
            jmr0Var3 = jmr0VarE;
            j6mVar3 = j6mVar2;
            jmr0Var4 = jmr0Var7;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iux(uri, kslVar, qim0Var, j6mVar3, jmr0Var3, jmr0Var4, tl3Var2, i, i2);
        }
    }

    public static final void e(b180 b180Var, qim0 qim0Var, j6m j6mVar, tl3 tl3Var, b0k b0kVar, int i) {
        j6m j6mVar2;
        tl3 tl3Var2;
        int i2;
        j6m j6mVar3;
        tl3 tl3Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1378870814);
        int i3 = i | (x340Var.i(b180Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 256 : 128) | 9216;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                i2 = i3 & (-64513);
                j6mVar3 = mif1.S0;
                tl3Var3 = een.h;
            } else {
                x340Var.b0();
                i2 = i3 & (-64513);
                j6mVar3 = j6mVar;
                tl3Var3 = tl3Var;
            }
            x340Var.s();
            f(byo1.s(b180Var, x340Var), isl.a, qim0Var, j6mVar3, tl3Var3, x340Var, 56 | (i2 & 896), 32);
            j6mVar2 = j6mVar3;
            tl3Var2 = tl3Var3;
        } else {
            x340Var.b0();
            j6mVar2 = j6mVar;
            tl3Var2 = tl3Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(i, b180Var, qim0Var, j6mVar2, tl3Var2, (byte) 2);
        }
    }

    public static final void f(jmr0 jmr0Var, ksl kslVar, qim0 qim0Var, j6m j6mVar, tl3 tl3Var, b0k b0kVar, int i, int i2) {
        int i3;
        j6m j6mVar2;
        tl3 tl3Var2;
        tl3 tl3Var3;
        j6m j6mVar3;
        qim0 qim0Var2;
        qim0 qim0VarS;
        tl3 tl3Var4;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1921739616);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(jmr0Var) : x340Var.i(jmr0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(kslVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && x340Var.i(qim0Var)) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j6mVar2 = j6mVar;
                int i4 = x340Var.i(j6mVar) ? 2048 : 1024;
                i3 |= i4;
            } else {
                j6mVar2 = j6mVar;
            }
            i3 |= i4;
        } else {
            j6mVar2 = j6mVar;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                tl3Var2 = tl3Var;
                int i5 = x340Var.i(tl3Var2) ? 16384 : 8192;
                i3 |= i5;
            } else {
                tl3Var2 = tl3Var;
            }
            i3 |= i5;
        } else {
            tl3Var2 = tl3Var;
        }
        int i6 = i3 | 196608;
        if (x340Var.Y(i6 & 1, (74899 & i6) != 74898)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                if ((i2 & 4) != 0) {
                    qim0VarS = w0h1.s(x340Var);
                    i6 &= -897;
                } else {
                    qim0VarS = qim0Var;
                }
                if ((i2 & 8) != 0) {
                    j6mVar2 = mif1.S0;
                    i6 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    tl3Var2 = een.h;
                    i6 &= -57345;
                }
                tl3 tl3Var5 = tl3Var2;
                j6mVar3 = j6mVar2;
                tl3Var4 = tl3Var5;
                qim0Var3 = qim0VarS;
            } else {
                x340Var.b0();
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i6 &= -57345;
                }
                tl3 tl3Var6 = tl3Var2;
                j6mVar3 = j6mVar2;
                tl3Var4 = tl3Var6;
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            vq60 vq60Var = jw80.a;
            int i7 = (i6 & 14) | 8 | ((i6 >> 3) & 7168);
            int i8 = i6 << 3;
            cwl1.f(jmr0Var, kslVar instanceof jsl ? ((jsl) kslVar).a : null, qim0Var3.then(tsj0.a), tl3Var4, j6mVar3, 0.0f, (ColorFilter) null, x340Var, i7 | (57344 & i8) | (i8 & 3670016), 32);
            tl3Var3 = tl3Var4;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            tl3Var3 = tl3Var2;
            j6mVar3 = j6mVar2;
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90(jmr0Var, kslVar, qim0Var2, j6mVar3, tl3Var3, i, i2, (byte) 5);
        }
    }

    public static final void g(int i, int i2, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i3;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(551508998);
        if ((i2 & 6) == 0) {
            i3 = (x340Var2.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            int[] iArr = se01.a;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var2, 0);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            int i4 = i3;
            uwo1.e(cwl1.o0(x340Var2, 2131955633), null, cbx.d(x340Var2).j, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var2, 0, 0, 1786);
            float f = i;
            jsg jsgVar = new jsg(0.0f, 7.0f);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            boolean zE = x340Var2.e(7) | ((i4 & 112) == 32);
            Object objT = x340Var2.T();
            if (zE || objT == fkj0.X) {
                objT = new n601(iu30Var, (byte) 2);
                x340Var2.s0(objT);
            }
            luo1.e(f, (iu30) objT, wnb0Var, false, jsgVar, 6, null, 0L, 0L, null, 0L, 0L, 0L, x340Var2, 0, 8136);
            uwo1.e(cwl1.o0(x340Var2, 2131955633), null, cbx.d(x340Var2).b, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var2, 0, 0, 1786);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry1(i, iu30Var, qim0Var, i2, (byte) 3);
        }
    }

    public static final void h(fd01 fd01Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(138367580);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.e(fd01Var.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = 32;
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        int i4 = i2 | 384;
        boolean z = false;
        boolean z2 = true;
        if (x340Var2.Y(i4 & 1, (i4 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            yux yuxVar = cbx.b(x340Var2).e;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(yuxVar.b, 0.0f, 2, l6o1.t(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, x340Var2), 14));
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
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
            x340Var2.i0(1932765633);
            t0z t0zVar = fd01.g;
            t0zVar.getClass();
            d7 d7Var = new d7(t0zVar, (byte) 0);
            while (d7Var.hasNext()) {
                fd01 fd01Var2 = (fd01) d7Var.next();
                boolean z3 = fd01Var2 == fd01Var ? z2 : z;
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = atz0.P0;
                    x340Var2.s0(objT);
                }
                oex oexVar = new oex(0, (vu30) null, (vu30) objT, (vu30) null, 11);
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = atz0.Q0;
                    x340Var2.s0(objT2);
                }
                oex oexVar2 = new oex(0, (vu30) null, (vu30) objT2, (vu30) null, 11);
                lex lexVarZ = yoo1.z(x340Var2);
                boolean zE = ((i4 & 112) == i3 ? z2 : z) | x340Var2.e(fd01Var2.ordinal());
                Object objT3 = x340Var2.T();
                if (zE || objT3 == m4cVar) {
                    objT3 = new j3y0(iu30Var, fd01Var2, (byte) 24);
                    x340Var2.s0(objT3);
                }
                x340 x340Var3 = x340Var2;
                poo1.g(z3, (iu30) objT3, oexVar, lexVarZ, null, 0, oexVar2, null, null, null, null, null, null, false, null, apo.r(-2138851208, new ziz0(fd01Var2, (byte) 11), x340Var2), x340Var3, 0, 196608, 32688);
                z = z;
                x340Var2 = x340Var3;
                qim0Var3 = qim0Var3;
                d7Var = d7Var;
                i3 = 32;
                z2 = true;
            }
            x340Var = x340Var2;
            qim0Var2 = qim0Var3;
            x340Var.r(z);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(fd01Var, iu30Var, qim0Var2, i, (byte) 15);
        }
    }

    public static final void i(int i, b0k b0kVar, ziu ziuVar, iu30 iu30Var, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1998833763);
        int i2 = i | (x340Var.i(ziuVar) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 >> 3;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            biu biuVar = ziuVar.f.c;
            String str = biuVar.a;
            String str2 = biuVar.c;
            hti1 hti1Var = hti1.c;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cua cuaVar2 = cbx.b(x340Var).f;
            cr31 cr31VarD = er31.d(6.0f, 6.0f, 0.0f, 0.0f, 12);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(i1p1.q(nim0Var, cr31VarD), 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarF);
            String str3 = zyd1.d;
            boolean zI = x340Var.i(ziuVar) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new glb(ziuVar, iu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            f6o1.b(str, str2, hti1Var, qim0VarZ, str3, (Function0) objT, apo.r(-1692424711, new iq0(ziuVar, iu30Var, (byte) 3), x340Var), x340Var, 1573248, 0);
            cvx cvxVar2 = cbx.b(x340Var).b;
            aym.b((i2 & 14) | (i3 & 112), x340Var, ziuVar, iu30Var, uyn1.z(16.0f, 0.0f, 2, nim0Var));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jq0(ziuVar, qim0Var, iu30Var, i, (byte) 5);
        }
    }

    public static final void j(k8c0 k8c0Var, iac0 iac0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-709389590);
        int i2 = i | 16 | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                iac0Var = (iac0) x340Var.k(jfe0.a);
            } else {
                x340Var.b0();
            }
            x340Var.s();
            if (k8c0Var == k8c0.ON_DESTROY) {
                hhg1.n("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            ven0 ven0VarS = v8r.s(function0, x340Var);
            boolean zG = x340Var.g(ven0VarS) | x340Var.i(iac0Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new pg(iac0Var, k8c0Var, ven0VarS, (byte) 17);
                x340Var.s0(objT);
            }
            qxd0.i(iac0Var, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qg(k8c0Var, iac0Var, function0, i);
        }
    }

    public static final void k(Object obj, iac0 iac0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1220373486);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                iac0Var = (iac0) x340Var.k(jfe0.a);
            } else {
                x340Var.b0();
            }
            int i3 = i2 & (-113);
            x340Var.s();
            boolean zG = x340Var.g(obj) | x340Var.g(iac0Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new uac0(iac0Var.getLifecycle());
                x340Var.s0(objT);
            }
            l(iac0Var, (uac0) objT, iu30Var, x340Var, i3 & 896);
        } else {
            x340Var.b0();
        }
        iac0 iac0Var2 = iac0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x9c0(obj, iac0Var2, iu30Var, i, (byte) 1);
        }
    }

    public static final void l(iac0 iac0Var, uac0 uac0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(912823238);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iac0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(uac0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(uac0Var) | ((i2 & 896) == 256) | x340Var.i(iac0Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new pg(iac0Var, iu30Var, uac0Var, (byte) 18);
                x340Var.s0(objT);
            }
            qxd0.h(iac0Var, uac0Var, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05(iac0Var, uac0Var, iu30Var, i, (byte) 8);
        }
    }

    public static final void m(Object obj, iac0 iac0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1408314671);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                iac0Var = (iac0) x340Var.k(jfe0.a);
            } else {
                x340Var.b0();
            }
            int i3 = i2 & (-113);
            x340Var.s();
            boolean zG = x340Var.g(obj) | x340Var.g(iac0Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new zac0(iac0Var.getLifecycle());
                x340Var.s0(objT);
            }
            n(iac0Var, (zac0) objT, iu30Var, x340Var, i3 & 896);
        } else {
            x340Var.b0();
        }
        iac0 iac0Var2 = iac0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x9c0(obj, iac0Var2, iu30Var, i, (byte) 0);
        }
    }

    public static final void n(iac0 iac0Var, zac0 zac0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(228371534);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iac0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(zac0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(zac0Var) | ((i2 & 896) == 256) | x340Var.i(iac0Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new pg(iac0Var, iu30Var, zac0Var, (byte) 19);
                x340Var.s0(objT);
            }
            qxd0.h(iac0Var, zac0Var, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u05(iac0Var, zac0Var, iu30Var, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:68:0x0102  */
    /* JADX WARN: Code duplicated, block: B:71:0x015b  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01be  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x0218  */
    /* JADX WARN: Code duplicated, block: B:89:0x0265  */
    /* JADX WARN: Code duplicated, block: B:91:0x026b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0276  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void o(String str, String str2, qim0 qim0Var, String str3, max maxVar, iu30 iu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        boolean z;
        x340 x340Var;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        Object objT;
        m4c m4cVar;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        boolean z3;
        Object objT2;
        int i5;
        int i6;
        int i7;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1271926645);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(str2) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var2.g(qim0Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (x340Var2.g(str3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) != 0) {
                if (x340Var2.g(maxVar)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((196608 & i) == 0) {
                if (x340Var2.i(iu30Var)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            i4 = i3;
            if ((i4 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i4 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i8 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                qim0 qim0VarZ = u291.z(u291.f(qim0Var5, 1.0f), (fra) null, 3);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0VarZ);
                objT = x340Var2.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = fii0.Z;
                    x340Var2.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarZ2, true, (iu30) objT);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarB);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                z2 = x340Var2.S;
                n4kVar = hmb0.t1;
                if (z2) {
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
                qim0 qim0VarZ3 = u291.z(u291.f(qim0Var4, 1.0f), (fra) null, 3);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                qim0 qim0VarZ4 = uyn1.z(0.0f, 8.0f, 1, qim0VarZ3);
                jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 54);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ4);
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
                qim0 qim0Var6 = qim0Var5;
                uwo1.e(str, anm1.N("member-details-button-row-title", new wnb0(1.0f, true)), cbx.d(x340Var2).g, cbx.a(x340Var2).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var2, i4 & 14, 0, 2016);
                x340Var = x340Var2;
                if ((i4 & 458752) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new edi0(iu30Var, (byte) 9);
                    x340Var.s0(objT2);
                }
                foo1.g(new gbx(z50.c, (Function0) objT2), anm1.N("member-details-button-row-button", qim0Var4), maxVar, yla.s(x340Var), null, null, null, apo.r(1629344805, new y5d0(str2, (byte) 24), x340Var), x340Var, ((i4 >> 6) & 896) | 12582960, 112);
                x340Var.r(true);
                if (str3 != null || ihc1.y0(str3)) {
                    x340Var.i0(-74940947);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-75171773);
                    uwo1.e(str3, anm1.N("member-details-button-row-description", qim0Var4), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(5), null, 0, false, null, 0, null, x340Var, ((i4 >> 9) & 14) | 48, 0, 2016);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0Var3 = qim0Var6;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new bd5(str, str2, qim0Var3, str3, maxVar, iu30Var, i, i2);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i & 3072) == 0) {
            if (x340Var2.g(str3)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i & 24576) != 0) {
            if (x340Var2.g(maxVar)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i) == 0) {
            if (x340Var2.i(iu30Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        i4 = i3;
        if ((i4 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var2.Y(i4 & 1, z)) {
            qim0Var4 = nim0.a;
            if (i8 != 0) {
                qim0Var5 = qim0Var4;
            } else {
                qim0Var5 = qim0Var2;
            }
            qim0 qim0VarZ5 = u291.z(u291.f(qim0Var5, 1.0f), (fra) null, 3);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarZ6 = uyn1.z(16.0f, 0.0f, 2, qim0VarZ5);
            objT = x340Var2.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = fii0.Z;
                x340Var2.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarZ6, true, (iu30) objT);
            mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarB2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z2 = x340Var2.S;
            n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar5 = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar5);
            llj lljVar6 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar7 = y580.R0;
            nko1.H(numValueOf2, x340Var2, lljVar7);
            nko1.F(x340Var2);
            llj lljVar8 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar8);
            qim0 qim0VarZ7 = u291.z(u291.f(qim0Var4, 1.0f), (fra) null, 3);
            cvx cvxVar4 = cbx.b(x340Var2).b;
            qim0 qim0VarZ8 = uyn1.z(0.0f, 8.0f, 1, qim0VarZ7);
            jw31 jw31VarA2 = ew31.a(h36.g, een.N0, x340Var2, 54);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarZ8);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA2, x340Var2, lljVar5);
            nko1.H(xos0VarM3, x340Var2, lljVar6);
            x0d.q(iHashCode3, x340Var2, lljVar7, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar8);
            qim0 qim0Var7 = qim0Var5;
            uwo1.e(str, anm1.N("member-details-button-row-title", new wnb0(1.0f, true)), cbx.d(x340Var2).g, cbx.a(x340Var2).b.a, new a0e1(5), null, 0, false, null, 0, null, x340Var2, i4 & 14, 0, 2016);
            x340Var = x340Var2;
            if ((i4 & 458752) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            objT2 = x340Var.T();
            if (z3) {
                objT2 = new edi0(iu30Var, (byte) 9);
                x340Var.s0(objT2);
            } else {
                objT2 = new edi0(iu30Var, (byte) 9);
                x340Var.s0(objT2);
            }
            foo1.g(new gbx(z50.c, (Function0) objT2), anm1.N("member-details-button-row-button", qim0Var4), maxVar, yla.s(x340Var), null, null, null, apo.r(1629344805, new y5d0(str2, (byte) 24), x340Var), x340Var, ((i4 >> 6) & 896) | 12582960, 112);
            x340Var.r(true);
            if (str3 != null) {
                x340Var.i0(-74940947);
                x340Var.r(false);
            } else {
                x340Var.i0(-74940947);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var3 = qim0Var7;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bd5(str, str2, qim0Var3, str3, maxVar, iu30Var, i, i2);
        }
    }

    public static final void p(hc01 hc01Var, fd01 fd01Var, int i, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, Function0 function0, qim0 qim0Var, b0k b0kVar, int i2) {
        hc01 hc01Var2;
        qim0 qim0Var2;
        Function0 function1 = function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(16881563);
        int i3 = i2 | (x340Var.e(hc01Var.ordinal()) ? 4 : 2) | (x340Var.e(fd01Var.ordinal()) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(iu30Var2) ? 16384 : 8192) | (x340Var.i(iu30Var3) ? 131072 : 65536) | (x340Var.i(function1) ? 1048576 : 524288) | 12582912;
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            yux yuxVar = cbx.b(x340Var).e;
            float f = yuxVar.b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            float f2 = cvxVar.e;
            float f3 = cvxVar.c;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, f2, 7);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            lro1.c(cwl1.o0(x340Var, 2131955664), null, null, x340Var, 0, 6);
            r(0, cwl1.o0(x340Var, 2131955635), x340Var, uyn1.A(qim0Var3, f, f3, f, 16.0f));
            h(fd01Var, iu30Var2, null, x340Var, ((i3 >> 3) & 14) | ((i3 >> 9) & 112));
            r(0, cwl1.o0(x340Var, 2131955664), x340Var, uyn1.A(qim0Var3, f, f3, f, 16.0f));
            int i4 = i3 >> 6;
            hc01Var2 = hc01Var;
            w(hc01Var2, iu30Var, null, x340Var, (i3 & 14) | (i4 & 112));
            float f4 = yuxVar.b;
            g(i, (i4 & 14) | ((i3 >> 12) & 112), x340Var, iu30Var3, uyn1.B(qim0Var3, f4, cvxVar.c, f4, 0.0f, 8));
            float f5 = yuxVar.b;
            function1 = function0;
            t((i3 >> 18) & 14, function1, x340Var, uyn1.B(qim0Var3, f5, cvxVar.c, f5, 0.0f, 8));
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            hc01Var2 = hc01Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(hc01Var2, fd01Var, i, iu30Var, iu30Var2, iu30Var3, function1, qim0Var2, i2, (byte) 17);
        }
    }

    public static final void q(hc01 hc01Var, fd01 fd01Var, int i, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, Function0 function0, Function0 function1, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1369994889);
        int i3 = i2 | (x340Var.e(hc01Var.ordinal()) ? 4 : 2) | (x340Var.e(fd01Var.ordinal()) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(iu30Var2) ? 16384 : 8192) | (x340Var.i(iu30Var3) ? 131072 : 65536) | (x340Var.i(function0) ? 1048576 : 524288) | (x340Var.i(function1) ? 8388608 : 4194304);
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            x74.f(function1, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(212356406, new ni1(hc01Var, fd01Var, i, iu30Var, iu30Var2, iu30Var3, function0), x340Var), x340Var, ((i3 >> 21) & 14) | 12582912, 48, 1918);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3(hc01Var, fd01Var, i, iu30Var, iu30Var2, iu30Var3, function0, function1, i2, (byte) 18);
        }
    }

    public static final void r(int i, String str, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1012678959);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            uwo1.e(str, qim0Var, cbx.d(x340Var).e, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var, i2 & 126, 0, 1784);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xwj(str, qim0Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    public static final void s(if5 if5Var, qim0 qim0Var, lax laxVar, hux huxVar, b0k b0kVar, int i, int i2) {
        int i3;
        lax laxVar2;
        b0k b0kVar2;
        hux huxVar2;
        qim0 qim0Var2;
        h311 h311VarV;
        or61 or61Var;
        lax laxVar3;
        hux huxVar3;
        qim0 qim0Var3;
        int i4;
        int i5;
        lax laxVar4 = laxVar;
        hux huxVar4 = huxVar;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2006940515);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? b0kVar3.g(if5Var) : b0kVar3.i(if5Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        if ((i & 384) == 0) {
            if ((i2 & 4) != 0) {
                i5 = 128;
            } else {
                if ((i & 512) == 0 ? b0kVar3.g(laxVar4) : b0kVar3.i(laxVar4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
            }
            i6 |= i5;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) != 0) {
                i4 = 1024;
            } else {
                if ((i & 4096) == 0 ? b0kVar3.g(huxVar4) : b0kVar3.i(huxVar4)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
            }
            i6 |= i4;
        }
        if (b0kVar3.Y(i6 & 1, (i6 & 1171) != 1170)) {
            b0kVar3.d0();
            int i7 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i7 == 0 || b0kVar3.E()) {
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                    laxVar4 = iax.a;
                }
                if ((i2 & 8) != 0) {
                    huxVar4 = eox.c;
                    i6 &= -7169;
                }
                laxVar3 = laxVar4;
                huxVar3 = huxVar4;
                qim0Var3 = qim0Var4;
            } else {
                b0kVar3.b0();
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i6 &= -7169;
                }
                qim0Var3 = qim0Var;
                laxVar3 = laxVar4;
                huxVar3 = huxVar4;
            }
            b0kVar3.s();
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(b0kVar3).j;
            int i8 = (i6 & 14) | 8;
            String strO0 = cwl1.o0(b0kVar3, 2131962087);
            String strC = if5Var.c(b0kVar3);
            if (strC == null) {
                strC = "";
            }
            boolean zG = b0kVar3.g(strO0) | b0kVar3.g(strC);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                objT = new ec21(strO0, strC, (byte) 4);
                b0kVar3.s0(objT);
            }
            j2i j2iVarB = if5Var.b(s161.b(qim0Var4, false, (iu30) objT), lee1Var, (u7h) null, b0kVar3, 4096 | ((i8 << 9) & 7168), 4);
            if (j2iVarB == null) {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    or61Var = new or61(if5Var, qim0Var3, laxVar3, huxVar3, i, i2, (byte) 1);
                }
            } else {
                qim0 qim0Var5 = qim0Var3;
                laxVar2 = laxVar3;
                hux huxVar5 = huxVar3;
                uvx uvxVar = (uvx) b0kVar3.k(vvx.a);
                uvx uvxVarA = uvx.a(uvxVar, (pgx) null, 1, nmn1.m(gto1.p(uvxVar.a, b0kVar3, 1), null, new p3v(0.0f), null, null, 13), (vzq0) null, (tvx) null, (p3v) null, 499);
                max maxVarZ = mmo1.z(laxVar2, b0kVar3);
                qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
                Object objT2 = b0kVar3.T();
                if (objT2 == m4cVar) {
                    objT2 = rq61.d;
                    b0kVar3.s0(objT2);
                }
                b0kVar2 = b0kVar3;
                jto1.b(s161.b(qim0VarF, true, (iu30) objT2), uvxVarA, maxVarZ, false, null, null, null, null, null, null, null, null, null, null, null, apo.r(-148183335, new nu31(lee1Var, huxVar5, j2iVarB, (byte) 6), b0kVar3), b0kVar2, 64, 196608, 32760);
                qim0Var2 = qim0Var5;
                huxVar2 = huxVar5;
            }
            h311VarV.d = or61Var;
        }
        b0kVar3.b0();
        laxVar2 = laxVar4;
        b0kVar2 = b0kVar3;
        huxVar2 = huxVar4;
        qim0Var2 = qim0Var;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            or61Var = new or61(if5Var, qim0Var2, laxVar2, huxVar2, i, i2, (byte) 0);
            h311VarV.d = or61Var;
        }
    }

    public static final void t(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(730403884);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarX = bin.x(u291.f(qim0Var, 1.0f), false, null, null, null, function0, 15);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, wnb0Var);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            String strO0 = cwl1.o0(b0kVar3, 2131955658);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(b0kVar3).e, 0L, null, null, 0, false, new cjc0(1), 0, null, b0kVar3, 0, 0, 1786);
            b0kVar2 = b0kVar3;
            uwo1.e(cwl1.o0(b0kVar2, 2131955657), null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, null, null, 0, false, new cjc0(1), 0, null, b0kVar3, 0, 0, 1778);
            b0kVar2.r(true);
            w0h1.a(plx.c, isl.a, u291.r(nim0.a, 24.0f), cbx.a(b0kVar2).b.b, 0L, false, b0kVar2, plx.d | 48, 48);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 19);
        }
    }

    public static final void u(int i, b0k b0kVar, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1027535879);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).k;
            cpr0 cpr0Var = lee1Var.b;
            wat watVar = (wat) x340Var.k(t4k.h);
            float f = (pap1.y(new p3v(34.0f), new p3v((TextUnit.e(cpr0Var.c) ? watVar.y(cpr0Var.c) : watVar.y(lee1Var.a.b) * 1.3f) + 16.0f)).a * 2.0f) + 8.0f;
            hab1 hab1Var = new hab1();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(qim0Var3, 1.0f), f);
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            d36 d36Var = new d36(8.0f, true, new um5(false));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new li1((byte) 7, iu30Var, c380Var);
                x340Var.s0(objT);
            }
            boo1.e(hab1Var, qim0VarH, null, zzq0VarH, d36Var, 8.0f, null, false, null, (iu30) objT, x340Var, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w2y((byte) 2, i, iu30Var, c380Var, qim0Var2);
        }
    }

    public static final void v(hc01 hc01Var, boolean z, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1103677157);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.e(hc01Var.ordinal()) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            cr31 cr31VarB = er31.b(16.0f);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarX = bin.x(dug.f(i1p1.q(u291.r(qim0Var2, 80.0f).then(z ? d1u.E(2.0f, hc01Var.b, qim0Var2, cr31VarB) : qim0Var2), cr31VarB), hc01Var.a, d4o1.a), false, null, null, null, function0, 15);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var2);
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
            String strO0 = cwl1.o0(x340Var, 2131955663);
            uwr uwrVar = cbx.a;
            qim0Var = qim0Var2;
            uwo1.e(strO0, null, cbx.d(x340Var).b, hc01Var.b, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
            int iOrdinal = hc01Var.ordinal();
            if (iOrdinal == 0) {
                i2 = 2131955662;
            } else if (iOrdinal == 1) {
                i2 = 2131955665;
            } else if (iOrdinal == 2) {
                i2 = 2131955660;
            } else if (iOrdinal == 3) {
                i2 = 2131955661;
            } else {
                if (iOrdinal != 4) {
                    eg.o();
                    return;
                }
                i2 = 2131955666;
            }
            uwo1.e(cwl1.o0(x340Var, i2), null, cbx.d(x340Var).j, hc01Var.b, null, null, 0, false, new cjc0(1), 0, null, x340Var, 0, 0, 1778);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var3 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90((Object) hc01Var, z, (Object) function0, (Object) qim0Var3, i, (byte) 24);
        }
    }

    public static final void w(hc01 hc01Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-444513594);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(hc01Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            yux yuxVar = cbx.b(x340Var).e;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(yuxVar.b, 0.0f, 2, l6o1.t(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, x340Var), 14));
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            x340Var.i0(129705517);
            t0z t0zVar = hc01.h;
            t0zVar.getClass();
            d7 d7Var = new d7(t0zVar, (byte) 0);
            while (d7Var.hasNext()) {
                hc01 hc01Var2 = (hc01) d7Var.next();
                boolean z = hc01Var2 == hc01Var;
                boolean zE = ((i3 & 112) == 32) | x340Var.e(hc01Var2.ordinal());
                Object objT = x340Var.T();
                if (zE || objT == fkj0.X) {
                    objT = new zkz0(iu30Var, hc01Var2, (byte) 7);
                    x340Var.s0(objT);
                }
                v(hc01Var2, z, (Function0) objT, null, x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j5w0(hc01Var, iu30Var, qim0Var2, i, (byte) 16);
        }
    }

    public static rt01 y(wpw wpwVar, zob1 zob1Var, vu30 vu30Var) {
        return new rt01(wpwVar, vu30Var, zob1Var, igu.a);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    public static jc11 z(o5 o5Var, boolean z, boolean z2, Boolean bool, boolean z3, uqv0 uqv0Var, joj0 joj0Var) {
        lja0 lja0Var;
        jc11 jc11Var;
        ihy0 ihy0Var;
        gfy0 gfy0Var;
        lja0 lja0Var2 = (mka1) o5Var.d;
        gfy0 gfy0Var2 = gfy0.c;
        if (z) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + o5Var + ')').toString());
            }
            if (o5Var instanceof ihy0) {
                ihy0 ihy0Var2 = (ihy0) o5Var;
                if (ihy0Var2.h == gfy0Var2) {
                    return q1o1.h(uqv0Var, ihy0Var2.g.d(ajn0.e("DefaultImpls")), joj0Var);
                }
            }
            if (bool.booleanValue() && (o5Var instanceof jhy0)) {
                lja0 lja0Var3 = lja0Var2 instanceof lja0 ? lja0Var2 : null;
                tia0 tia0Var = lja0Var3 != null ? lja0Var3.b : null;
                if (tia0Var != null) {
                    kf30 kf30Var = new kf30(tia0Var.d().replace('/', '.'));
                    kf30 kf30VarB = kf30Var.b();
                    ajn0 ajn0VarG = kf30Var.a.g();
                    kf30 kf30Var2 = kf30.c;
                    lf30 lf30Var = lap1.s(ajn0VarG).a;
                    lf30Var.c();
                    String strReplace = lf30Var.a.replace('.', '$');
                    if (!kf30VarB.a.c()) {
                        strReplace = kf30VarB + '.' + strReplace;
                    }
                    bm00 bm00VarE = uqv0Var.e(strReplace);
                    if (bm00VarE != null) {
                        return (jc11) bm00VarE.b;
                    }
                    return null;
                }
            }
        }
        if (z2 && (o5Var instanceof ihy0)) {
            ihy0 ihy0Var3 = (ihy0) o5Var;
            if (ihy0Var3.h == gfy0.f && (ihy0Var = ihy0Var3.f) != null && ((gfy0Var = ihy0Var.h) == gfy0.b || gfy0Var == gfy0.d || (z3 && (gfy0Var == gfy0Var2 || gfy0Var == gfy0.e)))) {
                u6b0 u6b0Var = (mka1) ((o5) ihy0Var).d;
                u6b0 u6b0Var2 = u6b0Var instanceof u6b0 ? u6b0Var : null;
                if (u6b0Var2 != null) {
                    return u6b0Var2.a;
                }
            } else if (o5Var instanceof jhy0) {
                lja0Var = lja0Var2;
                jc11Var = lja0Var.c;
                if (jc11Var == null) {
                    return q1o1.h(uqv0Var, lja0Var.a(), joj0Var);
                }
                return jc11Var;
            }
        } else if ((o5Var instanceof jhy0) && (lja0Var2 instanceof lja0)) {
            lja0Var = lja0Var2;
            jc11Var = lja0Var.c;
            if (jc11Var == null) {
                return q1o1.h(uqv0Var, lja0Var.a(), joj0Var);
            }
            return jc11Var;
        }
        return null;
    }
}
