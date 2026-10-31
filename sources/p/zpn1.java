package p;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.highlightsstats.EntityImage;
import com.spotify.highlightsstats.data.proto.v2.Grid3;
import com.spotify.kidsview.v2.proto.AccountControls;
import com.spotify.kidsview.v2.proto.VideoControls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zpn1 {
    public static final Object a = new Object();
    public static b180 b;

    public static final void a(List list, m0d m0dVar, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-677796476);
        int i2 = i | (b0kVar3.i(list) ? 4 : 2) | (b0kVar3.i(m0dVar) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = b0kVar3.g(list);
            Object objT = b0kVar3.T();
            if (zG || objT == obj) {
                objT = o7h.a1(list, new p0d((byte) 0));
                b0kVar3.s0(objT);
            }
            List list2 = (List) objT;
            int iIndexOf = list2.indexOf(m0dVar);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            xtb0 xtb0VarA = aub0.a(iIndexOf, b0kVar3, 2);
            y7e1 y7e1VarD = c4p1.D(0, 3, null, b0kVar3);
            String string = ihc1.e1(y7e1VarD.d().d.toString()).toString();
            boolean zG2 = b0kVar3.g(list2) | b0kVar3.g(string);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == obj) {
                if (string.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list2) {
                        m0d m0dVar2 = (m0d) obj2;
                        if (ihc1.h0(m0dVar2.c, string, true) || ihc1.h0(m0dVar2.b, string, true)) {
                            arrayList.add(obj2);
                        }
                    }
                    list2 = arrayList;
                }
                b0kVar3.s0(list2);
                objT2 = list2;
            }
            b0kVar2 = b0kVar3;
            anm1.a(function0, new i3u(231, false, false, false, false), apo.r(-413679219, new k40(y7e1VarD, xtb0VarA, (List) objT2, m0dVar, iu30Var, function0, (byte) 12), b0kVar3), b0kVar2, ((i2 >> 9) & 14) | 384, 0);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6((Object) list, (Object) m0dVar, iu30Var, (Object) function0, i, (byte) 29);
        }
    }

    public static final void b(m0d m0dVar, boolean z, Function0 function0, b0k b0kVar, int i) {
        long jC;
        boolean z2;
        lee1 lee1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-33678207);
        int i2 = i | (x340Var.i(m0dVar) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarJ = u291.j(64.0f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            if (z) {
                x340Var.i0(1994989418);
                uwr uwrVar = cbx.a;
                jC = cbx.a(x340Var).a.b.c();
                x340Var.r(false);
            } else {
                x340Var.i0(1994990092);
                x340Var.r(false);
                jC = u7h.j;
            }
            qim0 qim0VarX = bin.x(dug.f(qim0VarJ, jC, d4o1.a), false, null, null, null, function0, 15);
            boolean z3 = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new gy((byte) 9, z);
                x340Var.s0(objT);
            }
            qim0 qim0VarW = uyn1.w(s161.b(qim0VarX, true, (iu30) objT), uyn1.h(2, 16.0f, 0.0f));
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
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
            String str = m0dVar.c;
            if (z) {
                x340Var.i0(-1845443285);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(x340Var).h;
                z2 = false;
            } else {
                z2 = false;
                x340Var.i0(-1845442073);
                uwr uwrVar3 = cbx.a;
                lee1Var = cbx.d(x340Var).g;
            }
            x340Var.r(z2);
            uwo1.e(str, new wnb0(1.0f, true), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            uwo1.e(m0dVar.b, uyn1.B(nim0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zs((Object) m0dVar, z, (Object) function0, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x030b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0316  */
    /* JADX WARN: Code duplicated, block: B:115:0x0318  */
    /* JADX WARN: Code duplicated, block: B:119:0x0322  */
    public static final void c(w0m w0mVar, cx0 cx0Var, ujo ujoVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        ujo ujoVar2;
        iu30 iu30Var2;
        boolean z;
        m4c m4cVar;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objT;
        gra graVar = een.h;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-101225965);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(w0mVar) : x340Var.i(w0mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(cx0Var) : x340Var.i(cx0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ujoVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z5 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z5) {
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
            String str = w0mVar.a;
            int i4 = i3 & 7168;
            boolean z6 = i4 == 2048;
            Object objT2 = x340Var.T();
            if (z6 || objT2 == m4cVar2) {
                objT2 = new usj(iu30Var, (byte) 21);
                x340Var.s0(objT2);
            }
            iu30 iu30Var3 = (iu30) objT2;
            boolean z7 = i4 == 2048;
            Object objT3 = x340Var.T();
            if (z7 || objT3 == m4cVar2) {
                objT3 = new jzk(iu30Var, (byte) 8);
                x340Var.s0(objT3);
            }
            Function0 function0 = (Function0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar2) {
                objT4 = vll.c1;
                x340Var.s0(objT4);
            }
            otw.c(cx0Var, new rb51(str, iu30Var3, function0, (iu30) objT4, cwl1.o0(x340Var, 2131956231)), (qim0) null, (ipb1) null, x340Var, 8 | ((i3 >> 3) & 14), 12);
            if (w0mVar.c) {
                x340Var.i0(1506970075);
                qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                z = true;
                xto1.e(null, 0, 0L, 0L, x340Var, 0, 15);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                z = true;
                if (w0mVar.d) {
                    x340Var.i0(1507132732);
                    qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarD3);
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
                    uwo1.e(cwl1.o0(x340Var, 2131956229), null, null, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2046);
                    x340Var.r(true);
                    x340Var.r(false);
                } else {
                    if (w0mVar.b.isEmpty()) {
                        x340Var.i0(1507334263);
                        qim0 qim0VarD4 = u291.d(nim0Var, 1.0f);
                        gfh0 gfh0VarC3 = t1c.c(graVar, false);
                        int iHashCode4 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM4 = x340Var.m();
                        qim0 qim0VarE4 = zr7.E(x340Var, qim0VarD4);
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
                        uwo1.e(cwl1.o0(x340Var, 2131956230), null, null, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2046);
                        x340Var.r(true);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1507573428);
                        fvb0 fvb0VarZ = loo1.z(x340Var);
                        boolean zI = x340Var.i(fvb0VarZ) | (i4 == 2048);
                        Object objT5 = x340Var.T();
                        if (zI) {
                            m4cVar = m4cVar2;
                        } else {
                            m4cVar = m4cVar2;
                            if (objT5 != m4cVar) {
                                iu30Var2 = iu30Var;
                            }
                            qxd0.t(fvb0VarZ, x340Var, (vu30) objT5);
                            hab1 hab1Var = new hab1();
                            qim0 qim0VarD5 = u291.d(nim0Var, 1.0f);
                            uwr uwrVar = cbx.a;
                            cvx cvxVar = cbx.b(x340Var).b;
                            cvx cvxVar2 = cbx.b(x340Var).b;
                            cvx cvxVar3 = cbx.b(x340Var).b;
                            cvx cvxVar4 = cbx.b(x340Var).b;
                            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 4.0f);
                            cvx cvxVar5 = cbx.b(x340Var).b;
                            d36 d36Var = new d36(4.0f, true, new um5(false));
                            cvx cvxVar6 = cbx.b(x340Var).b;
                            if ((i3 & 14) != 4 || ((i3 & 8) != 0 && x340Var.i(w0mVar))) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            ujoVar2 = ujoVar;
                            boolean zI2 = z2 | x340Var.i(ujoVar2);
                            if (i4 == 2048) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            z4 = z3 | zI2;
                            objT = x340Var.T();
                            if (z4 || objT == m4cVar) {
                                objT = new o0d(w0mVar, ujoVar2, iu30Var2, (byte) 25);
                                x340Var.s0(objT);
                            }
                            boo1.f(hab1Var, qim0VarD5, fvb0VarZ, zzq0Var, 4.0f, d36Var, null, false, null, (iu30) objT, x340Var, 0);
                            x340Var.r(false);
                        }
                        iu30Var2 = iu30Var;
                        objT5 = new cuk(fvb0VarZ, iu30Var2, (lnm) null, (byte) 12);
                        x340Var.s0(objT5);
                        qxd0.t(fvb0VarZ, x340Var, (vu30) objT5);
                        hab1 hab1Var2 = new hab1();
                        qim0 qim0VarD6 = u291.d(nim0Var, 1.0f);
                        uwr uwrVar2 = cbx.a;
                        cvx cvxVar7 = cbx.b(x340Var).b;
                        cvx cvxVar8 = cbx.b(x340Var).b;
                        cvx cvxVar9 = cbx.b(x340Var).b;
                        cvx cvxVar10 = cbx.b(x340Var).b;
                        zzq0 zzq0Var2 = new zzq0(16.0f, 16.0f, 16.0f, 4.0f);
                        cvx cvxVar11 = cbx.b(x340Var).b;
                        d36 d36Var2 = new d36(4.0f, true, new um5(false));
                        cvx cvxVar12 = cbx.b(x340Var).b;
                        if ((i3 & 14) != 4) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        ujoVar2 = ujoVar;
                        boolean zI3 = z2 | x340Var.i(ujoVar2);
                        if (i4 == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z4 = z3 | zI3;
                        objT = x340Var.T();
                        if (z4) {
                            objT = new o0d(w0mVar, ujoVar2, iu30Var2, (byte) 25);
                            x340Var.s0(objT);
                        } else {
                            objT = new o0d(w0mVar, ujoVar2, iu30Var2, (byte) 25);
                            x340Var.s0(objT);
                        }
                        boo1.f(hab1Var2, qim0VarD6, fvb0VarZ, zzq0Var2, 4.0f, d36Var2, null, false, null, (iu30) objT, x340Var, 0);
                        x340Var.r(false);
                    }
                    x340Var.r(z);
                }
            }
            ujoVar2 = ujoVar;
            iu30Var2 = iu30Var;
            x340Var.r(z);
        } else {
            ujoVar2 = ujoVar;
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(i, w0mVar, cx0Var, ujoVar2, iu30Var2, (byte) 12);
        }
    }

    public static final void d(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2073459620);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            zzq0 zzq0Var = new zzq0(16.0f, 16.0f, 16.0f, 16.0f);
            ldx ldxVar = ldx.c;
            boolean z = (i3 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new z9t(function0, (byte) 20);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                qim0Var2 = qim0Var3;
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(str), function1), ldxVar, qim0VarF, null, null, zzq0Var, null, null, apo.r(1327752172, new f90(huxVar, (byte) 10), b0kVar3), null, apo.r(-1343387651, new qeu(str, (byte) 6), b0kVar3), b0kVar2, 806879280, 48, 1464);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new glf(str, huxVar, qim0Var2, function0, i, (byte) 1);
        }
    }

    public static final void e(wol wolVar, ujo ujoVar, Function0 function0, b0k b0kVar, int i) {
        h311 h311VarV;
        g1m g1mVar;
        boolean z;
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-814111879);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(wolVar) ? 4 : 2) | (x340Var.i(ujoVar) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            lg31 lg31Var = wolVar.b;
            if (lg31Var == null) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    g1mVar = new g1m(wolVar, ujoVar, function0, i, (byte) 1);
                }
            } else {
                String str = lg31Var.b;
                String str2 = lg31Var.a;
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cr31 cr31VarB = er31.b(8.0f);
                long jC = cbx.a(x340Var).a.b.c();
                boolean zG = x340Var.g(str2);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = v8r.q(Boolean.TRUE);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                Uri uri = Uri.parse(str2);
                fwx fwxVarG = hso1.G(box.c, 0L, 0L, x340Var, box.d, 30);
                boolean zI = x340Var.i(ven0Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new f4g(ven0Var, (byte) 22);
                    x340Var.s0(objT2);
                }
                iu30 iu30Var = (iu30) objT2;
                boolean zI2 = x340Var.i(ven0Var);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new f4g(ven0Var, (byte) 23);
                    x340Var.s0(objT3);
                }
                ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, fwxVarG, false, false, (j6m) null, iu30Var, (iu30) objT3, (iu30) null, 0L, x340Var, 2097152, 0, 118718);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarX = bin.x(u291.f(nim0Var, 1.0f), false, null, null, null, function0, 15);
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                nko1.H(mbhVarA, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                int i4 = lg31Var.c;
                qim0 qim0VarQ = i1p1.q(d7e.r((i4 <= 0 || (i2 = lg31Var.d) <= 0) ? 1.0f : yoi1.o(i4 / i2, 0.5f, 2.0f), qim0VarF, false), cr31VarB);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarQ);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                eso1.h(ni7VarA, ihc1.y0(str) ? isl.a : new jsl(str), u291.d(nim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, x340Var, 224256, 384);
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    x340Var.i0(886627365);
                    qim0 qim0VarL0 = cwl1.l0(dug.f(u291.d(nim0Var, 1.0f), jC, d4o1.a), jC, cr31VarB, 12);
                    z = false;
                    t1c.a(qim0VarL0, x340Var, 0);
                    x340Var.r(false);
                } else {
                    z = false;
                    x340Var.i0(886811877);
                    x340Var.r(false);
                }
                x340Var.r(true);
                String str3 = lg31Var.e;
                if (str3 == null || ujoVar == null) {
                    x340Var = x340Var;
                    x340Var.i0(952121599);
                    x340Var.r(z);
                } else {
                    x340Var.i0(952030304);
                    otw.c(ujoVar, new pof1(str3), (qim0) null, (ipb1) null, x340Var, (i3 >> 3) & 14, 12);
                    x340Var = x340Var;
                    x340Var.r(z);
                }
                x340Var.r(true);
            }
            h311VarV.d = g1mVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            g1mVar = new g1m(wolVar, ujoVar, function0, i, (byte) 0);
            h311VarV.d = g1mVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public static final void f(qim0 qim0Var, long j, b0k b0kVar, int i, int i2) {
        long j2;
        boolean z;
        long j3;
        h311 h311VarV;
        long j4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2417725);
        int i3 = i | (x340Var.g(qim0Var) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                j2 = j;
                i3 |= x340Var.f(j2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    j4 = u7h.f;
                } else {
                    j4 = j2;
                }
                eso1.h(i3o1.n(2131233947, x340Var, 0), isl.a, anm1.N("share.common.spotify.logo", qim0Var), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, een.g, new f2b(j4, 5), x340Var, 14352440, 24);
                j3 = j4;
            } else {
                x340Var.b0();
                j3 = j2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new a5b1(qim0Var, j3, i, i2);
            }
        }
        i3 |= 48;
        j2 = j;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                j4 = u7h.f;
            } else {
                j4 = j2;
            }
            eso1.h(i3o1.n(2131233947, x340Var, 0), isl.a, anm1.N("share.common.spotify.logo", qim0Var), (p3v) null, (zvx) null, (ecx) null, mif1.Q0, een.g, new f2b(j4, 5), x340Var, 14352440, 24);
            j3 = j4;
        } else {
            x340Var.b0();
            j3 = j2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a5b1(qim0Var, j3, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(wnm1 wnm1Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1948885243);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(wnm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(nim0.a) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (wnm1Var instanceof rnm1) {
            x340Var.i0(272982248);
            j((rnm1) wnm1Var, function0, x340Var, i2 & 1022);
            x340Var.r(false);
        } else if (wnm1Var instanceof unm1) {
            x340Var.i0(272984531);
            l((unm1) wnm1Var, function0, x340Var, i2 & 1022);
            x340Var.r(false);
        } else if (wnm1Var instanceof snm1) {
            x340Var.i0(272987345);
            k((snm1) wnm1Var, function0, x340Var, i2 & 1022);
            x340Var.r(false);
        } else if (wnm1Var instanceof tnm1) {
            x340Var.i0(272989973);
            i((tnm1) wnm1Var, function0, x340Var, i2 & 1022);
            x340Var.r(false);
        } else {
            if (!(wnm1Var instanceof vnm1)) {
                throw p3d1.k(x340Var, 272981476, false);
            }
            x340Var.i0(-127155310);
            m(function0, (vnm1) wnm1Var, x340Var, (i2 & 896) | ((i2 >> 3) & 14) | ((i2 << 3) & 112));
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exk1(wnm1Var, function0, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void h(aom1 aom1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(687849639);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(aom1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = aom1Var instanceof xnm1;
            qim0 qim0Var3 = nim0.a;
            if (z) {
                x340Var.i0(439780615);
                x340Var.r(false);
            } else if (aom1Var instanceof znm1) {
                x340Var.i0(-401453073);
                x4p1.f((i3 >> 6) & 14, 0, x340Var, qim0Var3);
                x340Var.r(false);
            } else {
                if (!(aom1Var instanceof wnm1)) {
                    throw p3d1.k(x340Var, -401456523, false);
                }
                x340Var.i0(439923494);
                g((wnm1) aom1Var, function0, x340Var, i3 & 1022);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1((byte) 23, i, aom1Var, qim0Var2, function0);
        }
    }

    public static final void i(tnm1 tnm1Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-761544052);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(tnm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            function1 = function0;
            lgo1.c(apo.r(-1156588147, new g2j1(tnm1Var, (byte) 26), x340Var), function1, cwl1.o0(x340Var, 2131957390), nim0Var, 0, ssj.d, x340Var, (i2 & 112) | 196614 | ((i2 << 3) & 7168), 16);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exk1(tnm1Var, function1, i);
        }
    }

    public static final void j(rnm1 rnm1Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1473447185);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(rnm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            function1 = function0;
            lgo1.c(apo.r(1072991826, new g2j1(rnm1Var, (byte) 27), x340Var), function1, cwl1.o0(x340Var, 2131957390), nim0Var, 0, ssj.a, x340Var, (i2 & 112) | 196614 | ((i2 << 3) & 7168), 16);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exk1(rnm1Var, function1, i);
        }
    }

    public static final void k(snm1 snm1Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1329746085);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(snm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            function1 = function0;
            lgo1.c(apo.r(-1724790180, new g2j1(snm1Var, (byte) 28), x340Var), function1, cwl1.o0(x340Var, 2131957390), nim0Var, 0, ssj.c, x340Var, (i2 & 112) | 196614 | ((i2 << 3) & 7168), 16);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exk1(snm1Var, function1, i);
        }
    }

    public static final void l(unm1 unm1Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1479274516);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(unm1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            function1 = function0;
            lgo1.c(apo.r(2127025005, new g2j1(unm1Var, (byte) 29), x340Var), function1, cwl1.o0(x340Var, 2131957390), nim0Var, 0, ssj.b, x340Var, (i2 & 112) | 196614 | ((i2 << 3) & 7168), 16);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exk1(unm1Var, function1, i);
        }
    }

    public static final void m(Function0 function0, vnm1 vnm1Var, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-620412652);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vnm1Var) ? 32 : 16;
        }
        int i3 = i & 384;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 << 3;
            function1 = function0;
            lgo1.c(apo.r(-1309080427, new eom1(vnm1Var, (byte) 0), x340Var), function1, cwl1.o0(x340Var, 2131957390), nim0Var, 0, ssj.e, x340Var, (i4 & 112) | 196614 | (i4 & 7168), 16);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new exk1(function1, vnm1Var, i);
        }
    }

    public static final kbf0 n(fcf0 fcf0Var, boolean z, boolean z2, bcf0 bcf0Var, float f, int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.j0(683659508);
        boolean z3 = (i2 & 2) != 0 ? true : z;
        boolean z4 = (i2 & 4) != 0 ? true : z2;
        bcf0 bcf0Var2 = (i2 & 16) != 0 ? null : bcf0Var;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        int i3 = (i2 & 64) != 0 ? 1 : i;
        if (i3 <= 0) {
            hhg1.f(gvg.e(i3, "Iterations must be a positive number (", ")."));
            return null;
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            hhg1.f(c13.h("Speed must be a finite number. It is ", f2, "."));
            return null;
        }
        kbf0 kbf0VarS = m5n1.S(x340Var);
        x340Var.j0(-180606964);
        Object objT = x340Var.T();
        if (objT == fkj0.X) {
            objT = c13.l(z3, x340Var);
        }
        ven0 ven0Var = (ven0) objT;
        x340Var.r(false);
        x340Var.j0(-180606834);
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        p5r p5rVar = qpi1.a;
        float f3 = f2 / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        x340Var.r(false);
        qxd0.u(new Object[]{fcf0Var, Boolean.valueOf(z3), bcf0Var2, Float.valueOf(f3), Integer.valueOf(i3)}, new ba5(z3, z4, kbf0VarS, fcf0Var, i3, false, f3, bcf0Var2, ven0Var, null), x340Var);
        x340Var.r(false);
        return kbf0VarS;
    }

    public static void o(ViewGroup viewGroup) {
        pg10 pg10Var = new pg10(2);
        ((jhg1) pg10Var).c = 300L;
        PathInterpolator pathInterpolator = hlv.e;
        ((jhg1) pg10Var).d = pathInterpolator;
        pg10 pg10Var2 = new pg10(1);
        ((jhg1) pg10Var2).c = 300L;
        ((jhg1) pg10Var2).b = 100L;
        ((jhg1) pg10Var2).d = pathInterpolator;
        glg1 glg1Var = new glg1();
        glg1Var.Y(0);
        glg1Var.U(pg10Var);
        glg1Var.U(pg10Var2);
        fjg1.a(viewGroup, glg1Var);
    }

    public static void p(ViewGroup viewGroup) {
        pg10 pg10Var = new pg10(1);
        ((jhg1) pg10Var).c = 300L;
        ((jhg1) pg10Var).b = 500L;
        ((jhg1) pg10Var).d = hlv.d;
        fjg1.a(viewGroup, pg10Var);
    }

    public static final Collection q(Collection collection, Collection collection2) {
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final int r(t3i0 t3i0Var) {
        if (t3i0Var instanceof s3i0) {
            return 1;
        }
        if (t3i0Var instanceof r3i0) {
            return 2;
        }
        eg.o();
        return 0;
    }

    public static AnimatorSet s(View view) {
        if (view.getVisibility() == 4) {
            return null;
        }
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        objectAnimatorOfFloat.setInterpolator(hlv.d);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new d20(view, (byte) 11));
        animatorSet.start();
        return animatorSet;
    }

    public static final zh91 t(ArrayList arrayList) {
        zh91 zh91Var = new zh91();
        for (Object obj : arrayList) {
            ypi0 ypi0Var = (zpi0) obj;
            if (ypi0Var != null && ypi0Var != ypi0.b) {
                zh91Var.add(obj);
            }
        }
        return zh91Var;
    }

    public static final ArrayList u(Grid3 grid3) {
        List itemsList = grid3.getItemsList();
        ArrayList arrayList = new ArrayList();
        Iterator it = itemsList.iterator();
        while (true) {
            kf50 kf50Var = null;
            if (!it.hasNext()) {
                break;
            }
            EntityImage entityImage = (EntityImage) it.next();
            if (entityImage.getImageUrl().length() != 0) {
                kf50Var = new kf50(entityImage.getImageUrl(), entityImage.o() == vgy.d);
            }
            if (kf50Var != null) {
                arrayList.add(kf50Var);
            }
        }
        if (arrayList.size() == 9) {
            return arrayList;
        }
        return null;
    }

    public static final tk v(AccountControls accountControls) {
        gjj1 gjj1Var;
        Boolean boolValueOf = accountControls.hasAllowExplicitContent() ? Boolean.valueOf(accountControls.getAllowExplicitContent()) : null;
        Boolean boolValueOf2 = accountControls.y() ? Boolean.valueOf(accountControls.r()) : null;
        if (accountControls.z()) {
            VideoControls videoControlsT = accountControls.t();
            gjj1Var = new gjj1(videoControlsT.s() ? Boolean.valueOf(videoControlsT.o()) : null, videoControlsT.r() ? Boolean.valueOf(videoControlsT.n()) : null, videoControlsT.t() ? Boolean.valueOf(videoControlsT.p()) : null);
        } else {
            gjj1Var = null;
        }
        return new tk(boolValueOf, boolValueOf2, gjj1Var, accountControls.x() ? Boolean.valueOf(accountControls.q()) : null, accountControls.u() ? Boolean.valueOf(accountControls.n()) : null, accountControls.w() ? Boolean.valueOf(accountControls.p()) : null, accountControls.v() ? Boolean.valueOf(accountControls.o()) : null);
    }

    public static final bla0 w(beg begVar) {
        Class clsP = bpi1.p(begVar);
        bla0 bla0Var = (bla0) (clsP != null ? rc11.a.b(clsP) : null);
        if (bla0Var != null) {
            return bla0Var;
        }
        tw20.x(begVar.k(), "Type parameter container is not resolved: ");
        return null;
    }

    public static final tgm x(z8z z8zVar, String str) {
        String str2 = z8zVar.g;
        c821 c821Var = z8zVar.f;
        return new tgm(str, false, false, false, false, false, false, (yh10) null, false, false, z8zVar.a ? 2 : 1, false, false, z8zVar.e, false, false, (iu30) null, false, z8zVar.d, (g371) null, c821Var, false, str2, (iu30) null, (p860) null, (mgo0) null, false, false, -44075010, 1);
    }

    public static arr0 y(int i, String str, String str2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return new arr0((i & 4) != 0 ? 1 : 2, str, str2);
    }
}
