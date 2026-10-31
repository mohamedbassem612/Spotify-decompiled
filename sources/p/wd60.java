package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class wd60 {
    public static final ajc0 a = new ajc0(z860.Q0);
    public static final ajc0 b = new ajc0(z860.O0);

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00de  */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0113  */
    /* JADX WARN: Code duplicated, block: B:79:0x0143  */
    /* JADX WARN: Code duplicated, block: B:80:0x015b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0189  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0213  */
    /* JADX WARN: Code duplicated, block: B:88:0x022c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0259  */
    /* JADX WARN: Code duplicated, block: B:92:0x025d  */
    /* JADX WARN: Code duplicated, block: B:95:0x026a  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void a(za60 za60Var, qim0 qim0Var, u7h u7hVar, djc0 djc0Var, zzq0 zzq0Var, b0k b0kVar, int i, int i2) {
        int i3;
        u7h u7hVar2;
        djc0 djc0Var2;
        boolean z;
        u7h u7hVar3;
        djc0 djc0Var3;
        qim0 qim0Var2;
        h311 h311VarV;
        int i4;
        qim0 qim0Var3;
        djc0 djc0Var4;
        u7h u7hVar4;
        qim0 qim0Var4;
        Object objT;
        Throwable th;
        qim0 qim0VarF;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        vnr0 vnr0VarG;
        String str;
        qim0 qim0Var5;
        boolean z3;
        float f;
        boolean z4;
        vnr0 vnr0Var;
        Throwable th2;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1244925516);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(za60Var) : x340Var.i(za60Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i3 | 48;
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                u7hVar2 = u7hVar;
                i6 |= x340Var.g(u7hVar2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    djc0Var2 = djc0Var;
                    int i8 = x340Var.i(djc0Var2) ? 2048 : 1024;
                    i6 |= i8;
                } else {
                    djc0Var2 = djc0Var;
                }
                i6 |= i8;
            } else {
                djc0Var2 = djc0Var;
            }
            if ((i & 24576) == 0) {
                if (x340Var.i(zzq0Var)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i6 |= i5;
            }
            if ((i6 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i6 & 1, z)) {
                x340Var.d0();
                i4 = i & 1;
                qim0Var3 = nim0.a;
                if (i4 != 0 || x340Var.E()) {
                    if (i7 != 0) {
                        u7hVar2 = null;
                    }
                    if ((i2 & 8) != 0) {
                        djc0Var4 = b;
                    } else {
                        djc0Var4 = djc0Var2;
                    }
                    djc0Var3 = djc0Var4;
                    u7hVar4 = u7hVar2;
                    qim0Var4 = qim0Var3;
                } else {
                    x340Var.b0();
                    u7hVar4 = u7hVar2;
                    djc0Var3 = djc0Var2;
                    qim0Var4 = qim0Var;
                }
                x340Var.s();
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = z860.P0;
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarF2, true, (iu30) objT);
                if (u7hVar4 != null) {
                    th = null;
                    qim0VarF = dug.f(qim0Var3, u7hVar4.a, d4o1.a);
                    if (qim0VarF == null) {
                    }
                    qim0 qim0VarW = uyn1.w(qim0VarB.then(qim0VarF), zzq0Var);
                    mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarW);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw th;
                    }
                    x340Var.m0();
                    z2 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z2) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var, lljVar);
                    lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var, lljVar3);
                    nko1.F(x340Var);
                    lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    vnr0VarG = za60Var.a.g(a, x340Var, 0);
                    vnr0 vnr0VarG2 = za60Var.b.g(djc0Var3, x340Var, 0);
                    str = za60Var.c;
                    if (str == null) {
                        x340Var.i0(770902888);
                        x340Var.r(false);
                        th2 = th;
                        qim0Var5 = qim0Var3;
                        z3 = false;
                        vnr0Var = vnr0VarG;
                        f = 1.0f;
                        z4 = true;
                    } else {
                        x340Var.i0(770902889);
                        qim0 qim0VarF3 = u291.f(qim0Var3, 1.0f);
                        jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                        int iHashCode2 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM2 = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF3);
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
                        Uri uri = Uri.parse(str);
                        ltx ltxVar = ltx.c;
                        nux nuxVar = new nux(ltxVar, ltxVar);
                        cua cuaVar = cbx.b(x340Var).f;
                        cua cuaVar2 = cbx.b(x340Var).f;
                        zvx zvxVar = new zvx();
                        cbx.a.getClass();
                        qim0Var5 = qim0Var3;
                        z3 = false;
                        f = 1.0f;
                        z4 = true;
                        eso1.e(uri, isl.a, sto1.o(u291.r(qim0Var3, 36.0f), 8.0f, (hw61) null, false, 0L, 0L, 30), (p3v) null, zvxVar, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1073744944, 0, 3520);
                        x340Var = x340Var;
                        vnr0Var = vnr0VarG;
                        qgo1.f(vnr0Var, c13.k(qim0Var5, 8.0f, x340Var, 1.0f, true), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                        x340Var.r(true);
                        x340Var.r(false);
                        th2 = rih1.a;
                    }
                    if (th2 == null) {
                        x340Var.i0(2103098557);
                        qgo1.f(vnr0Var, u291.f(qim0Var5, f), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                    } else {
                        x340Var.i0(2103077415);
                    }
                    x340Var.r(z3);
                    op71.g(x340Var, u291.h(u291.f(qim0Var5, f), 4.0f));
                    qgo1.f(vnr0VarG2, u291.f(qim0Var5, f), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                    x340Var.r(z4);
                    qim0Var2 = qim0Var4;
                    u7hVar3 = u7hVar4;
                } else {
                    th = null;
                }
                qim0VarF = qim0Var3;
                qim0 qim0VarW2 = uyn1.w(qim0VarB.then(qim0VarF), zzq0Var);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarW2);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw th;
                }
                x340Var.m0();
                z2 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z2) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf2, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                vnr0VarG = za60Var.a.g(a, x340Var, 0);
                vnr0 vnr0VarG3 = za60Var.b.g(djc0Var3, x340Var, 0);
                str = za60Var.c;
                if (str == null) {
                    x340Var.i0(770902888);
                    x340Var.r(false);
                    th2 = th;
                    qim0Var5 = qim0Var3;
                    z3 = false;
                    vnr0Var = vnr0VarG;
                    f = 1.0f;
                    z4 = true;
                } else {
                    x340Var.i0(770902889);
                    qim0 qim0VarF4 = u291.f(qim0Var3, 1.0f);
                    jw31 jw31VarA2 = ew31.a(h36.a, een.N0, x340Var, 0);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF4);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA2, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    Uri uri2 = Uri.parse(str);
                    ltx ltxVar2 = ltx.c;
                    nux nuxVar2 = new nux(ltxVar2, ltxVar2);
                    cua cuaVar3 = cbx.b(x340Var).f;
                    cua cuaVar4 = cbx.b(x340Var).f;
                    zvx zvxVar2 = new zvx();
                    cbx.a.getClass();
                    qim0Var5 = qim0Var3;
                    z3 = false;
                    f = 1.0f;
                    z4 = true;
                    eso1.e(uri2, isl.a, sto1.o(u291.r(qim0Var3, 36.0f), 8.0f, (hw61) null, false, 0L, 0L, 30), (p3v) null, zvxVar2, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, nuxVar2, false, false, x340Var, 1073744944, 0, 3520);
                    x340Var = x340Var;
                    vnr0Var = vnr0VarG;
                    qgo1.f(vnr0Var, c13.k(qim0Var5, 8.0f, x340Var, 1.0f, true), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                    x340Var.r(true);
                    x340Var.r(false);
                    th2 = rih1.a;
                }
                if (th2 == null) {
                    x340Var.i0(2103098557);
                    qgo1.f(vnr0Var, u291.f(qim0Var5, f), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                } else {
                    x340Var.i0(2103077415);
                }
                x340Var.r(z3);
                op71.g(x340Var, u291.h(u291.f(qim0Var5, f), 4.0f));
                qgo1.f(vnr0VarG3, u291.f(qim0Var5, f), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                x340Var.r(z4);
                qim0Var2 = qim0Var4;
                u7hVar3 = u7hVar4;
            } else {
                x340Var.b0();
                u7hVar3 = u7hVar2;
                djc0Var3 = djc0Var2;
                qim0Var2 = qim0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new j90((Object) za60Var, qim0Var2, (Object) u7hVar3, (Object) djc0Var3, (Object) zzq0Var, i, i2, (byte) 10);
            }
        }
        i6 = i3 | 432;
        u7hVar2 = u7hVar;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                djc0Var2 = djc0Var;
                if (x340Var.i(djc0Var2)) {
                }
                i6 |= i8;
            } else {
                djc0Var2 = djc0Var;
            }
            i6 |= i8;
        } else {
            djc0Var2 = djc0Var;
        }
        if ((i & 24576) == 0) {
            if (x340Var.i(zzq0Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i6 |= i5;
        }
        if ((i6 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i6 & 1, z)) {
            x340Var.d0();
            i4 = i & 1;
            qim0Var3 = nim0.a;
            if (i4 != 0) {
                if (i7 != 0) {
                    u7hVar2 = null;
                }
                if ((i2 & 8) != 0) {
                    djc0Var4 = b;
                } else {
                    djc0Var4 = djc0Var2;
                }
                djc0Var3 = djc0Var4;
                u7hVar4 = u7hVar2;
                qim0Var4 = qim0Var3;
            } else {
                if (i7 != 0) {
                    u7hVar2 = null;
                }
                if ((i2 & 8) != 0) {
                    djc0Var4 = b;
                } else {
                    djc0Var4 = djc0Var2;
                }
                djc0Var3 = djc0Var4;
                u7hVar4 = u7hVar2;
                qim0Var4 = qim0Var3;
            }
            x340Var.s();
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarF5 = u291.f(qim0Var4, 1.0f);
            objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = z860.P0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB2 = s161.b(qim0VarF5, true, (iu30) objT);
            if (u7hVar4 != null) {
                th = null;
                qim0VarF = dug.f(qim0Var3, u7hVar4.a, d4o1.a);
                if (qim0VarF == null) {
                }
                qim0 qim0VarW3 = uyn1.w(qim0VarB2.then(qim0VarF), zzq0Var);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarW3);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw th;
                }
                x340Var.m0();
                z2 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z2) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf3, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                vnr0VarG = za60Var.a.g(a, x340Var, 0);
                vnr0 vnr0VarG4 = za60Var.b.g(djc0Var3, x340Var, 0);
                str = za60Var.c;
                if (str == null) {
                    x340Var.i0(770902888);
                    x340Var.r(false);
                    th2 = th;
                    qim0Var5 = qim0Var3;
                    z3 = false;
                    vnr0Var = vnr0VarG;
                    f = 1.0f;
                    z4 = true;
                } else {
                    x340Var.i0(770902889);
                    qim0 qim0VarF6 = u291.f(qim0Var3, 1.0f);
                    jw31 jw31VarA3 = ew31.a(h36.a, een.N0, x340Var, 0);
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarF6);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(jw31VarA3, x340Var, lljVar);
                    nko1.H(xos0VarM4, x340Var, lljVar2);
                    x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar4);
                    Uri uri3 = Uri.parse(str);
                    ltx ltxVar3 = ltx.c;
                    nux nuxVar3 = new nux(ltxVar3, ltxVar3);
                    cua cuaVar5 = cbx.b(x340Var).f;
                    cua cuaVar6 = cbx.b(x340Var).f;
                    zvx zvxVar3 = new zvx();
                    cbx.a.getClass();
                    qim0Var5 = qim0Var3;
                    z3 = false;
                    f = 1.0f;
                    z4 = true;
                    eso1.e(uri3, isl.a, sto1.o(u291.r(qim0Var3, 36.0f), 8.0f, (hw61) null, false, 0L, 0L, 30), (p3v) null, zvxVar3, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, nuxVar3, false, false, x340Var, 1073744944, 0, 3520);
                    x340Var = x340Var;
                    vnr0Var = vnr0VarG;
                    qgo1.f(vnr0Var, c13.k(qim0Var5, 8.0f, x340Var, 1.0f, true), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                    x340Var.r(true);
                    x340Var.r(false);
                    th2 = rih1.a;
                }
                if (th2 == null) {
                    x340Var.i0(2103098557);
                    qgo1.f(vnr0Var, u291.f(qim0Var5, f), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                } else {
                    x340Var.i0(2103077415);
                }
                x340Var.r(z3);
                op71.g(x340Var, u291.h(u291.f(qim0Var5, f), 4.0f));
                qgo1.f(vnr0VarG4, u291.f(qim0Var5, f), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                x340Var.r(z4);
                qim0Var2 = qim0Var4;
                u7hVar3 = u7hVar4;
            } else {
                th = null;
            }
            qim0VarF = qim0Var3;
            qim0 qim0VarW4 = uyn1.w(qim0VarB2.then(qim0VarF), zzq0Var);
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarW4);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw th;
            }
            x340Var.m0();
            z2 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf4 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf4, x340Var, lljVar3);
            nko1.F(x340Var);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            vnr0VarG = za60Var.a.g(a, x340Var, 0);
            vnr0 vnr0VarG5 = za60Var.b.g(djc0Var3, x340Var, 0);
            str = za60Var.c;
            if (str == null) {
                x340Var.i0(770902888);
                x340Var.r(false);
                th2 = th;
                qim0Var5 = qim0Var3;
                z3 = false;
                vnr0Var = vnr0VarG;
                f = 1.0f;
                z4 = true;
            } else {
                x340Var.i0(770902889);
                qim0 qim0VarF7 = u291.f(qim0Var3, 1.0f);
                jw31 jw31VarA4 = ew31.a(h36.a, een.N0, x340Var, 0);
                int iHashCode5 = Long.hashCode(x340Var.T);
                xos0 xos0VarM5 = x340Var.m();
                qim0 qim0VarE5 = zr7.E(x340Var, qim0VarF7);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA4, x340Var, lljVar);
                nko1.H(xos0VarM5, x340Var, lljVar2);
                x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE5, x340Var, lljVar4);
                Uri uri4 = Uri.parse(str);
                ltx ltxVar4 = ltx.c;
                nux nuxVar4 = new nux(ltxVar4, ltxVar4);
                cua cuaVar7 = cbx.b(x340Var).f;
                cua cuaVar8 = cbx.b(x340Var).f;
                zvx zvxVar4 = new zvx();
                cbx.a.getClass();
                qim0Var5 = qim0Var3;
                z3 = false;
                f = 1.0f;
                z4 = true;
                eso1.e(uri4, isl.a, sto1.o(u291.r(qim0Var3, 36.0f), 8.0f, (hw61) null, false, 0L, 0L, 30), (p3v) null, zvxVar4, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, nuxVar4, false, false, x340Var, 1073744944, 0, 3520);
                x340Var = x340Var;
                vnr0Var = vnr0VarG;
                qgo1.f(vnr0Var, c13.k(qim0Var5, 8.0f, x340Var, 1.0f, true), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
                x340Var.r(true);
                x340Var.r(false);
                th2 = rih1.a;
            }
            if (th2 == null) {
                x340Var.i0(2103098557);
                qgo1.f(vnr0Var, u291.f(qim0Var5, f), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
            } else {
                x340Var.i0(2103077415);
            }
            x340Var.r(z3);
            op71.g(x340Var, u291.h(u291.f(qim0Var5, f), 4.0f));
            qgo1.f(vnr0VarG5, u291.f(qim0Var5, f), (a0e1) null, 0, false, (iu30) null, x340Var, 8, 60);
            x340Var.r(z4);
            qim0Var2 = qim0Var4;
            u7hVar3 = u7hVar4;
        } else {
            x340Var.b0();
            u7hVar3 = u7hVar2;
            djc0Var3 = djc0Var2;
            qim0Var2 = qim0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j90((Object) za60Var, qim0Var2, (Object) u7hVar3, (Object) djc0Var3, (Object) zzq0Var, i, i2, (byte) 10);
        }
    }
}
