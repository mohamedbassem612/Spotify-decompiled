package p;

import com.spotify.contentagnostic.v2.ColorSet;
import com.spotify.contentagnostic.v2.ColorSetContrastOptions;
import com.spotify.contentagnostic.v2.Image;
import com.spotify.contentagnostic.v2.ImageInstance;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class z1p1 {
    public static b180 a;
    public static b180 b;

    public static ArrayList A(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        ArrayList arrayList = new ArrayList();
        t890.h(arrayList, it);
        return arrayList;
    }

    public static ArrayList B(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        n3p1.j(length, "arraySize");
        ArrayList arrayList = new ArrayList(bmq0.Z(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    public static final long C(i091 i091Var, long j, yqg yqgVar, b0k b0kVar, int i) {
        long j2;
        frr0 frr0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        int i2 = (i & 112) ^ 48;
        boolean z = true;
        int i3 = (i & 896) ^ 384;
        boolean zG = x340Var.g(i091Var) | ((i2 > 32 && x340Var.f(j)) || (i & 48) == 32) | ((i3 > 256 && x340Var.g(yqgVar)) || (i & 384) == 256);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            long jB = yqgVar.b();
            if (j <= 0) {
                j2 = 0;
            } else {
                long jO = ebp1.o(i091Var, Long.valueOf(jB));
                if (jO < 0) {
                    jO = 0;
                }
                j2 = j - jO;
                if (j2 < 0) {
                    j2 = 0;
                }
            }
            objT = p3d1.m(j2, x340Var);
        }
        frr0 frr0Var2 = (frr0) objT;
        boolean zI = x340Var.i(i091Var) | x340Var.i(frr0Var2) | ((i2 > 32 && x340Var.f(j)) || (i & 48) == 32);
        if ((i3 <= 256 || !x340Var.g(yqgVar)) && (i & 384) != 256) {
            z = false;
        }
        boolean z2 = zI | z;
        Object objT2 = x340Var.T();
        if (z2 || objT2 == m4cVar) {
            frr0Var = frr0Var2;
            xn2 xn2Var = new xn2(i091Var, frr0Var, j, yqgVar, (lnm) null, (byte) 8);
            x340Var.s0(xn2Var);
            objT2 = xn2Var;
        } else {
            frr0Var = frr0Var2;
        }
        qxd0.t(frr0Var, x340Var, (vu30) objT2);
        return frr0Var.s();
    }

    public static AbstractList D(List list, su30 su30Var) {
        return list instanceof RandomAccess ? new omd0(list, su30Var) : new pmd0(list, su30Var);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0125  */
    /* JADX WARN: Code duplicated, block: B:103:0x014f  */
    /* JADX WARN: Code duplicated, block: B:106:0x015c  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1 A[PHI: r0 r10
      0x00e1: PHI (r0v24 int) = (r0v12 int), (r0v10 int), (r0v26 int) binds: [B:83:0x00ef, B:77:0x00dd, B:78:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r10v9 p.xtb0) = (r10v6 p.xtb0), (r10v3 p.xtb0), (r10v3 p.xtb0) binds: [B:83:0x00ef, B:77:0x00dd, B:78:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0103  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    public static final void a(jl9 jl9Var, int i, al9 al9Var, d0r d0rVar, qim0 qim0Var, xtb0 xtb0Var, boolean z, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        qim0 qim0Var2;
        xtb0 xtb0VarA;
        boolean z2;
        boolean z3;
        boolean z4;
        b0k b0kVar2;
        boolean z5;
        xtb0 xtb0Var2;
        h311 h311VarV;
        int i6;
        boolean z6;
        boolean z7;
        boolean zI;
        Object objT;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1227815612);
        if ((i2 & 6) == 0) {
            i4 = (b0kVar3.i(jl9Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 = i;
            i4 |= b0kVar3.e(i5) ? 32 : 16;
        } else {
            i5 = i;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? b0kVar3.g(al9Var) : b0kVar3.i(al9Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= b0kVar3.i(d0rVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            qim0Var2 = qim0Var;
            i4 |= b0kVar3.i(qim0Var2) ? 16384 : 8192;
        } else {
            qim0Var2 = qim0Var;
        }
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                xtb0VarA = xtb0Var;
                int i7 = b0kVar3.i(xtb0VarA) ? 131072 : 65536;
                i4 |= i7;
            } else {
                xtb0VarA = xtb0Var;
            }
            i4 |= i7;
        } else {
            xtb0VarA = xtb0Var;
        }
        int i8 = i3 & 64;
        if (i8 == 0) {
            if ((1572864 & i2) == 0) {
                z2 = z;
                i4 |= b0kVar3.h(z2) ? 1048576 : 524288;
            }
            z3 = false;
            if ((599187 & i4) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (b0kVar3.Y(i4 & 1, z4)) {
                b0kVar3.d0();
                if ((i2 & 1) != 0 || b0kVar3.E()) {
                    if ((i3 & 32) != 0) {
                        xtb0VarA = aub0.a(0, b0kVar3, 3);
                        i4 &= -458753;
                    }
                    if (i8 != 0) {
                        i6 = i4;
                        z6 = true;
                    }
                    b0kVar3.s();
                    boolean zI2 = b0kVar3.i(jl9Var);
                    if ((i6 & 112) == 32) {
                        z7 = true;
                    } else {
                        z7 = z3;
                    }
                    boolean z8 = z7 | zI2;
                    if ((i6 & 896) != 256 || ((i6 & 512) != 0 && b0kVar3.i(al9Var))) {
                        z3 = true;
                    }
                    zI = z3 | z8 | b0kVar3.i(d0rVar);
                    objT = b0kVar3.T();
                    if (zI || objT == fkj0.X) {
                        fu fuVar = new fu(jl9Var, i5, al9Var, d0rVar, (byte) 4);
                        b0kVar3.s0(fuVar);
                        objT = fuVar;
                    }
                    b0kVar2 = b0kVar3;
                    s3o1.d(qim0Var2, xtb0VarA, null, null, null, null, z6, null, (iu30) objT, b0kVar2, ((i6 >> 12) & 126) | (29360128 & (i6 << 3)), 380);
                    z5 = z6;
                } else {
                    b0kVar3.b0();
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                }
                i6 = i4;
                z6 = z2;
                b0kVar3.s();
                boolean zI3 = b0kVar3.i(jl9Var);
                if ((i6 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = z3;
                }
                boolean z9 = z7 | zI3;
                if ((i6 & 896) != 256) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                zI = z3 | z9 | b0kVar3.i(d0rVar);
                objT = b0kVar3.T();
                if (zI) {
                    fu fuVar2 = new fu(jl9Var, i5, al9Var, d0rVar, (byte) 4);
                    b0kVar3.s0(fuVar2);
                    objT = fuVar2;
                } else {
                    fu fuVar3 = new fu(jl9Var, i5, al9Var, d0rVar, (byte) 4);
                    b0kVar3.s0(fuVar3);
                    objT = fuVar3;
                }
                b0kVar2 = b0kVar3;
                s3o1.d(qim0Var2, xtb0VarA, null, null, null, null, z6, null, (iu30) objT, b0kVar2, ((i6 >> 12) & 126) | (29360128 & (i6 << 3)), 380);
                z5 = z6;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                z5 = z2;
            }
            xtb0Var2 = xtb0VarA;
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new rk9(jl9Var, i, al9Var, d0rVar, qim0Var, xtb0Var2, z5, i2, i3);
            }
        }
        i4 |= 1572864;
        z2 = z;
        z3 = false;
        if ((599187 & i4) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (b0kVar3.Y(i4 & 1, z4)) {
            b0kVar3.d0();
            if ((i2 & 1) != 0) {
                if ((i3 & 32) != 0) {
                    xtb0VarA = aub0.a(0, b0kVar3, 3);
                    i4 &= -458753;
                }
                if (i8 != 0) {
                    i6 = i4;
                    z6 = true;
                } else {
                    i6 = i4;
                    z6 = z2;
                }
            } else {
                if ((i3 & 32) != 0) {
                    xtb0VarA = aub0.a(0, b0kVar3, 3);
                    i4 &= -458753;
                }
                if (i8 != 0) {
                    i6 = i4;
                    z6 = true;
                } else {
                    i6 = i4;
                    z6 = z2;
                }
            }
            b0kVar3.s();
            boolean zI4 = b0kVar3.i(jl9Var);
            if ((i6 & 112) == 32) {
                z7 = true;
            } else {
                z7 = z3;
            }
            boolean z10 = z7 | zI4;
            if ((i6 & 896) != 256) {
                z3 = true;
            } else {
                z3 = true;
            }
            zI = z3 | z10 | b0kVar3.i(d0rVar);
            objT = b0kVar3.T();
            if (zI) {
                fu fuVar4 = new fu(jl9Var, i5, al9Var, d0rVar, (byte) 4);
                b0kVar3.s0(fuVar4);
                objT = fuVar4;
            } else {
                fu fuVar5 = new fu(jl9Var, i5, al9Var, d0rVar, (byte) 4);
                b0kVar3.s0(fuVar5);
                objT = fuVar5;
            }
            b0kVar2 = b0kVar3;
            s3o1.d(qim0Var2, xtb0VarA, null, null, null, null, z6, null, (iu30) objT, b0kVar2, ((i6 >> 12) & 126) | (29360128 & (i6 << 3)), 380);
            z5 = z6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z5 = z2;
        }
        xtb0Var2 = xtb0VarA;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rk9(jl9Var, i, al9Var, d0rVar, qim0Var, xtb0Var2, z5, i2, i3);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1794614229);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131953943);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).d;
            qim0 qim0VarA = uyn1.A(nim0.a, 16.0f, 8.0f, 16.0f, 16.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = tpg.g;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0VarA, false, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 20, i, false);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1355529269);
        int i2 = i | (x340Var2.i(function0) ? 4 : 2) | 48;
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(anm1.N("find-friend-tag", qim0Var3), 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            era eraVar = een.Q0;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
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
            qim0Var2 = qim0Var3;
            uwo1.e(cwl1.o0(x340Var2, 2131963590), null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 2, false, new cjc0(2), 0, null, x340Var2, 0, 0, 1714);
            String strO0 = cwl1.o0(x340Var2, 2131963589);
            if (ihc1.y0(strO0)) {
                hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                return;
            } else {
                foo1.c(new gbx(new y50(strO0), function0), new idx(), anm1.N("find-friend-button-tag", qim0Var2), null, yla.r(x340Var2), null, null, null, null, null, yoi.a, x340Var2, 0, 48, 2008);
                x340Var = x340Var2;
                x340Var.r(true);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(function0, qim0Var2, i, (byte) 28);
        }
    }

    public static final void d(boolean z, b0k b0kVar, int i) {
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1415239943);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            z2 = z;
            fq7.g(z2, (qim0) null, xay.e(2, irn1.o0(150, 0, null, 6)), xay.f(2, irn1.o0(150, 0, null, 6)), (String) null, t1j.a, x340Var, (i2 & 14) | 200064, 18);
        } else {
            z2 = z;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k750((byte) 11, i, z2);
        }
    }

    public static final void e(String str, boolean z, Function0 function0, lex lexVar, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1710499346);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(lexVar) ? 2048 : 1024) | (b0kVar3.i(qim0Var) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new hii0(function0, (byte) 16);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            poo1.g(z, (iu30) objT, new nex(6), lexVar, qim0Var, 0, null, null, null, null, null, null, null, false, null, apo.r(292892245, new tc11(lexVar, str, (byte) 0), b0kVar3), b0kVar2, ((i2 >> 3) & 14) | (i2 & 7168) | (i2 & 57344), 196608, 32736);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(str, z, function0, lexVar, qim0Var, i, (byte) 10);
        }
    }

    public static final void f(Set set, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-346105125);
        int i2 = (x340Var.g(sc11.b) ? 4 : 2) | i | (x340Var.g(set) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            lex lexVarZ = yoo1.z(x340Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            w2g0.c(qim0Var, (tl3) null, apo.r(-784650191, new hho0(lexVarZ, set, iu30Var, (byte) 23), x340Var), x340Var, ((i2 >> 9) & 14) | 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(set, iu30Var, qim0Var, i, (byte) 26);
        }
    }

    public static final void g(b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2044375240);
        int i3 = i & 6;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 = i | (x340Var.i(nim0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarD, 8.0f);
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
            uwo1.e(cwl1.o0(x340Var, 2131961347), null, cbx.d(x340Var).j, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2026);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zxd1(i, (byte) 0);
        }
    }

    public static final void h(gij1 gij1Var, iu30 iu30Var, iu30 iu30Var2, cce cceVar, o0i o0iVar, l6m l6mVar, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1400103539);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(gij1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(cceVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(l6mVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.g(qim0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.h(z) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0Var, ((vex) zex.a.b).a, d4o1.a);
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            who1.h(s161.b(qim0VarF, false, new tu(ufh0Var, (byte) 25)), apo.i(x340Var, -1488813576, new twj(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 21), gij1Var, l6mVar, iu30Var, z, iu30Var2, cceVar, o0iVar)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 21), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new brf(gij1Var, iu30Var, iu30Var2, cceVar, o0iVar, l6mVar, qim0Var, z, i);
        }
    }

    public static dn3 i() {
        return new dn3();
    }

    public static boolean j(List list, Object obj) {
        list.getClass();
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i = 0; i < size; i++) {
                if (!zno1.k(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !zno1.k(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static int t(b380 b380Var, Object obj) {
        int size = b380Var.size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(b380Var.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final go80 u(klm klmVar, adp0 adp0Var, adp0 adp0Var2) {
        return klmVar.a("PlaybackOopsSessionDaemon", new ocp0(adp0Var, adp0Var2, (byte) 0));
    }

    public static int v(b380 b380Var, Object obj) {
        for (int size = b380Var.size() - 1; size >= 0; size--) {
            if (obj.equals(b380Var.get(size))) {
                return size;
            }
        }
        return -1;
    }

    public static final afx w(ColorSet colorSet) {
        int i = ihx.f;
        return ihx.d(z4p1.f(colorSet.o().s(), colorSet.o().r(), colorSet.o().p(), colorSet.o().o()), z4p1.f(colorSet.p().s(), colorSet.p().r(), colorSet.p().p(), colorSet.p().o()), z4p1.f(colorSet.r().s(), colorSet.r().r(), colorSet.r().p(), colorSet.r().o()), z4p1.f(colorSet.t().s(), colorSet.t().r(), colorSet.t().p(), colorSet.t().o()), z4p1.f(colorSet.s().s(), colorSet.s().r(), colorSet.s().p(), colorSet.s().o()));
    }

    public static final pp70 x(ColorSetContrastOptions colorSetContrastOptions) {
        if (colorSetContrastOptions.equals(colorSetContrastOptions.getDefaultInstanceForType())) {
            return null;
        }
        return new pp70(w(colorSetContrastOptions.s()), w(colorSetContrastOptions.q()), w(colorSetContrastOptions.r()), new u7h(z4p1.f(colorSetContrastOptions.p().s(), colorSetContrastOptions.p().r(), colorSetContrastOptions.p().p(), colorSetContrastOptions.p().o())));
    }

    public static final mq70 y(Image image) {
        h290 h290VarQ = image.q();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
        Iterator it = h290VarQ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ImageInstance imageInstance = (ImageInstance) it.next();
            so20 so20Var = new so20(imageInstance.o().o());
            int i = rw70.b[imageInstance.p().ordinal()];
            vp70 vp70Var = vp70.c;
            if (i != 1) {
                if (i == 2) {
                    vp70Var = vp70.b;
                } else if (i == 3) {
                    vp70Var = vp70.d;
                } else if (i == 4) {
                    vp70Var = vp70.e;
                }
            }
            arrayList.add(new up70(so20Var, vp70Var));
        }
        return new mq70(arrayList, x(image.p()), rw70.a[image.r().ordinal()] != 1 ? 1 : 2);
    }

    public static ArrayList z() {
        return new ArrayList();
    }

    public String k() {
        return null;
    }

    public abstract String l();

    public String m() {
        return "forbidden_nav";
    }

    public String n() {
        return null;
    }

    public String o() {
        return null;
    }

    public String p() {
        return null;
    }

    public String q() {
        return null;
    }

    public String r() {
        return null;
    }

    public String s() {
        return null;
    }
}
