package p;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.identity.proto.v3.Identity;
import com.spotify.legacyglue.icons.SpotifyIconView;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class axo1 {
    public static b180 a;

    public static final void a(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        Function0 function1;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1272057758);
        int i2 = i | 6 | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            era eraVar = een.Q0;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarY = uyn1.y(qim0Var3, 16.0f, 24.0f);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = db8.P0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarY, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
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
            String strO0 = cwl1.o0(x340Var, 2131954692);
            uwr uwrVar = cbx.a;
            qim0Var2 = qim0Var3;
            uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, qim0Var3), cbx.d(x340Var).e, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            uwo1.e(ydh.g(8.0f, 2131954691, x340Var, x340Var, qim0Var2), uyn1.z(16.0f, 0.0f, 2, qim0Var2), cbx.d(x340Var).j, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2024);
            op71.g(x340Var, u291.h(qim0Var2, 16.0f));
            function1 = function0;
            gfx.g(8, apo.r(-36021307, new wm(function1, (byte) 12), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            function1 = function0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vd1(qim0Var2, function1, i, (byte) 5);
        }
    }

    public static final void b(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1490571587);
        int i2 = i | (x340Var.h(z) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, 2131952040);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            vvm1.n(pox.c, cwl1.o0(x340Var, 2131952048), (qim0) null, x340Var, pox.d);
            vvm1.n(grx.c, cwl1.o0(x340Var, 2131952047), (qim0) null, x340Var, grx.d);
            vvm1.n(znx.c, cwl1.o0(x340Var, 2131952054), (qim0) null, x340Var, znx.d);
            vvm1.n(zkx.c, cwl1.o0(x340Var, 2131952046), (qim0) null, x340Var, zkx.d);
            vvm1.n(njx.c, cwl1.o0(x340Var, 2131952045), (qim0) null, x340Var, njx.d);
            if (z) {
                x340Var.i0(-2009144964);
                vvm1.n(gux.c, cwl1.o0(x340Var, 2131952039), (qim0) null, x340Var, gux.d);
                x340Var.r(false);
            } else {
                x340Var.i0(-2009009463);
                x340Var.r(false);
            }
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(ydh.g(8.0f, 2131952050, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).k, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            vvm1.n(xnx.c, cwl1.o0(x340Var, 2131952049), (qim0) null, x340Var, xnx.d);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dr0((byte) 25, i, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0364  */
    /* JADX WARN: Code duplicated, block: B:73:0x0368  */
    /* JADX WARN: Code duplicated, block: B:77:0x038a  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void c(w4t0 w4t0Var, a5t0 a5t0Var, pxp pxpVar, qxp qxpVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        vu30 vu30Var;
        g36 g36Var;
        qim0 qim0Var3;
        ?? r1;
        boolean z;
        qim0 qim0Var4;
        m4c m4cVar;
        boolean zI;
        Object objT;
        a5t0 a5t0Var2 = a5t0Var;
        pxp pxpVar2 = pxpVar;
        gra graVar = een.d;
        String str = a5t0Var2.a;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(308321520);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.i(w4t0Var) ? 4 : 2) | (b0kVar2.g(a5t0Var2) ? 32 : 16) | (b0kVar2.g(pxpVar2) ? 256 : 128) | (b0kVar2.g(qxpVar) ? 2048 : 1024) | 24576;
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            gra graVar2 = een.h;
            qim0 qim0Var5 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var5, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarR = i1p1.r(too1.y(qim0VarD, lhc.g(b0kVar2).e));
            gfh0 gfh0VarC = t1c.c(graVar2, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarR);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z2 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            vu30 vu30Var2 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, vu30Var2);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar2).b.c;
            kiv kivVar = t4k.h;
            float fX0 = ((wat) b0kVar2.k(kivVar)).X0(f);
            e5t0 e5t0Var = ((b5t0) rwq.h(w4t0Var.h, b0kVar2, 0).getValue()).a;
            if (e5t0Var == null) {
                hhg1.n("Required value was null.");
                return;
            }
            vxx0 vxx0Var = e5t0Var.c;
            b0kVar2.i0(1115718398);
            float fX1 = ((wat) b0kVar2.k(kivVar)).X0(cbx.b(b0kVar2).b.b);
            b0kVar2.r(false);
            Object objT2 = b0kVar2.T();
            m4c m4cVar2 = fkj0.X;
            if (objT2 == m4cVar2) {
                objT2 = bb00.h(0, b0kVar2);
            }
            hdn0 hdn0Var = (hdn0) objT2;
            Object objT3 = b0kVar2.T();
            if (objT3 == m4cVar2) {
                objT3 = yv91.a(new c1g0(fX1, fX0, hdn0Var));
                b0kVar2.s0(objT3);
            }
            tob1 tob1Var = (tob1) objT3;
            Object objT4 = b0kVar2.T();
            if (objT4 == m4cVar2) {
                objT4 = new bs91();
                b0kVar2.s0(objT4);
            }
            bs91 bs91Var = (bs91) objT4;
            Object objT5 = b0kVar2.T();
            if (objT5 == m4cVar2) {
                objT5 = qxd0.M(o6x.a, b0kVar2);
                b0kVar2.s0(objT5);
            }
            c9n c9nVar = (c9n) objT5;
            qim0 qim0VarY = voo1.y(u291.d(qim0Var5, 1.0f), voo1.f);
            era eraVar = een.P0;
            g36 g36Var2 = h36.c;
            mbh mbhVarA = jbh.a(g36Var2, eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarY);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, vu30Var2);
            qtg.e(0, e5t0Var.a, b0kVar2, lrn1.x(qim0Var5, 1.0f));
            yf20 yf20Var = e5t0Var.d;
            if (yf20Var == null) {
                b0kVar2.i0(97199810);
                b0kVar2.r(false);
                qim0Var3 = qim0Var5;
                g36Var = g36Var2;
                r1 = 0;
                vu30Var = vu30Var2;
                z = true;
            } else {
                b0kVar2.i0(97199811);
                qim0 qim0VarF = dug.f(u291.f(qim0Var5, 1.0f), cbx.a(b0kVar2).a.c, d4o1.a);
                cvx cvxVar = cbx.b(b0kVar2).b;
                cvx cvxVar2 = cbx.b(b0kVar2).b;
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                qim0 qim0VarX = lrn1.x(uyn1.A(qim0VarF, 16.0f, 4.0f, 16.0f, 8.0f), 1.0f);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                vu30Var = vu30Var2;
                int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM3 = b0kVar2.m();
                qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarX);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC2, b0kVar2, lljVar);
                nko1.H(xos0VarM3, b0kVar2, lljVar2);
                x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE3, b0kVar2, vu30Var);
                br0 br0Var = new br0((ve20) ((jly0) ((h72) qxpVar.a.c).i).get());
                fe20 fe20Var = new fe20(yf20Var, str);
                g36Var = g36Var2;
                qim0Var3 = qim0Var5;
                r1 = 0;
                z = true;
                otw.c(br0Var, fe20Var, (qim0) null, (ipb1) null, b0kVar2, 0, 12);
                b0kVar2.r(true);
                b0kVar2.r(false);
            }
            l6o1.d(w4t0Var, (int) ((Number) tob1Var.getValue()).floatValue(), null, b0kVar2, i2 & 14);
            b0kVar2.r(z);
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v1 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1090
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.axo1.c(p.w4t0, p.a5t0, p.pxp, p.qxp, p.qim0, p.b0k, int):void");
        }

        /* JADX WARN: Code duplicated, block: B:229:0x04f9  */
        public static final void d(j171 j171Var, String str, String str2, iu30 iu30Var, boolean z, Function0 function0, c380 c380Var, Function0 function1, Function0 function2, yxb0 yxb0Var, e821 e821Var, fqm fqmVar, h9n h9nVar, qim0 qim0Var, boolean z2, boolean z3, boolean z4, b0k b0kVar, int i) {
            j06 j06Var;
            e271 c271Var;
            byte b;
            qim0 qim0VarB;
            int i2;
            boolean z5;
            boolean z6;
            bc71 bc71Var;
            era eraVar;
            boolean z7;
            rb71 rb71VarA;
            m4c m4cVar = fkj0.X;
            tom tomVar = j171Var.j;
            lpl lplVar = tomVar.f;
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.k0(2065768448);
            j06 j06Var2 = ((x340) b0kVar2).a;
            int i3 = i | (b0kVar2.g(j171Var) ? 4 : 2) | (b0kVar2.g(str) ? 32 : 16) | (b0kVar2.g(str2) ? 256 : 128) | (b0kVar2.i(iu30Var) ? 2048 : 1024) | (b0kVar2.h(z) ? 16384 : 8192) | (b0kVar2.i(function0) ? 131072 : 65536) | (b0kVar2.g(c380Var) ? 1048576 : 524288) | (b0kVar2.i(function1) ? 8388608 : 4194304) | (b0kVar2.i(function2) ? 67108864 : 33554432) | (b0kVar2.i(yxb0Var) ? 536870912 : 268435456);
            int i4 = 3072 | (b0kVar2.i(e821Var) ? 4 : 2) | (b0kVar2.i(fqmVar) ? 32 : 16) | (b0kVar2.i(h9nVar) ? 256 : 128) | (b0kVar2.h(z2) ? 16384 : 8192) | (b0kVar2.h(z3) ? 131072 : 65536) | (b0kVar2.h(z4) ? 1048576 : 524288);
            if (b0kVar2.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 599187) == 599186) ? false : true)) {
                String strK = nzy.k(lplVar.a);
                bc71 bc71Var2 = lplVar.b;
                zb71 zb71VarL = wro1.L(bc71Var2);
                boolean zG = b0kVar2.g(strK) | b0kVar2.g(bc71Var2) | ((i4 & 57344) == 16384) | ((i4 & 3670016) == 1048576);
                Object objT = b0kVar2.T();
                if (zG || objT == m4cVar) {
                    if (!z2 || nzy.j(strK) || (bc71Var2 instanceof lb71) || (bc71Var2 instanceof jb71)) {
                        j06Var = j06Var2;
                        objT = null;
                    } else {
                        if (bc71Var2 instanceof sb71) {
                            sb71 sb71Var = (sb71) bc71Var2;
                            qz61 qz61Var = sb71Var.a;
                            zb71 zb71Var = sb71Var.b;
                            oz61 oz61VarL = zb71Var != null ? kuo1.l(zb71Var, z4) : null;
                            if (qz61Var == null || oz61VarL == null) {
                                j06Var = j06Var2;
                                if (qz61Var != null) {
                                    c271Var = new d271(qz61Var);
                                } else {
                                    c271Var = oz61VarL != null ? new c271(strK, oz61VarL) : new f271(strK);
                                }
                            } else {
                                j06Var = j06Var2;
                                c271Var = new e271(strK, qz61Var, oz61VarL);
                            }
                        } else {
                            j06Var = j06Var2;
                            c271Var = bc71Var2 instanceof zb71 ? new c271(strK, kuo1.l((zb71) bc71Var2, z4)) : new f271(strK);
                        }
                        objT = e821Var.h(c271Var);
                    }
                    b0kVar2.s0(objT);
                } else {
                    j06Var = j06Var2;
                }
                tyq tyqVar = (tyq) objT;
                ss50 ss50Var = (ss50) b0kVar2.k(t4k.l);
                String str3 = strK;
                qim0 qim0VarN = anm1.N("ShareCard", u291.f(qim0Var, 1.0f));
                era eraVar2 = een.P0;
                mbh mbhVarA = jbh.a(h36.c, eraVar2, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                boolean z8 = ((x340) b0kVar2).S;
                n4k n4kVar = hmb0.t1;
                if (z8) {
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
                i171 i171Var = j171Var.b;
                boolean z9 = i171Var instanceof f171;
                tob1 tob1VarB = z95.b(z9 ? 0.5f : 1.0f, irn1.o0(150, 0, mlv.d, 2), "dimAlpha", (iu30) null, b0kVar2, 3072, 20);
                b0kVar2 = b0kVar2;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarK = d9y0.k(u291.f(nim0Var, 1.0f), ((Number) tob1VarB.getValue()).floatValue());
                jw31 jw31VarA = ew31.a(z ? h36.b : h36.a, een.Z, b0kVar2, 48);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarK);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(jw31VarA, b0kVar2, lljVar);
                nko1.H(xos0VarM2, b0kVar2, lljVar2);
                x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar4);
                boolean z10 = ((zb71VarL == null || (rb71VarA = zb71VarL.a()) == null) ? null : rb71VarA.b) instanceof ob71;
                int i5 = i3 & 7168;
                boolean z11 = (i5 == 2048) | ((i3 & 14) == 4);
                Object objT2 = b0kVar2.T();
                if (z11 || objT2 == m4cVar) {
                    objT2 = new vf((byte) 1, iu30Var, j171Var);
                    b0kVar2.s0(objT2);
                }
                Function0 function3 = (Function0) objT2;
                boolean zI = (i5 == 2048) | b0kVar2.i(ss50Var);
                Object objT3 = b0kVar2.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new uyz0(ss50Var, iu30Var, (byte) 2);
                    b0kVar2.s0(objT3);
                }
                Function0 function4 = (Function0) objT3;
                boolean zI2 = b0kVar2.i(ss50Var) | (i5 == 2048);
                Object objT4 = b0kVar2.T();
                if (zI2 || objT4 == m4cVar) {
                    b = 1;
                    objT4 = new uyz0(ss50Var, iu30Var, (byte) 1);
                    b0kVar2.s0(objT4);
                } else {
                    b = 1;
                }
                Function0 function5 = (Function0) objT4;
                rih1 rih1Var = rih1.a;
                if (z10) {
                    b0kVar2.i0(-7910413);
                    b0kVar2.r(false);
                    qim0VarB = f8d1.b(nim0Var, rih1Var, new edh(function3, function4, function5, b));
                } else {
                    b0kVar2.i0(-7661669);
                    boolean zG2 = b0kVar2.g(function5) | b0kVar2.g(function4) | b0kVar2.g(function3);
                    Object objT5 = b0kVar2.T();
                    if (zG2 || objT5 == m4cVar) {
                        objT5 = new edh(function5, function4, function3, (byte) 2);
                        b0kVar2.s0(objT5);
                    }
                    qim0VarB = f8d1.b(nim0Var, rih1Var, (PointerInputEventHandler) objT5);
                    b0kVar2.r(false);
                }
                boolean z12 = tyqVar != null;
                boolean z13 = bc71Var2 instanceof sb71;
                sb71 sb71Var2 = z13 ? (sb71) bc71Var2 : null;
                boolean zS = luo1.s(sb71Var2 != null ? sb71Var2.a : null, z12, z3);
                qim0 qim0VarI = zr7.i(qim0VarB, new wf((Object) iu30Var, (Object) j171Var, (byte) 0));
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM3 = b0kVar2.m();
                qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarI);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, lljVar);
                nko1.H(xos0VarM3, b0kVar2, lljVar2);
                x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE3, b0kVar2, lljVar4);
                if (tyqVar != null) {
                    b0kVar2.i0(-405758937);
                    qim0 qim0VarD = u291.D(nim0Var, (era) null, 3);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar2).b;
                    qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarD);
                    String str4 = !z ? str2 : null;
                    if (zb71VarL != null) {
                        tf tfVar = new tf((Object) str3, (Object) str4, (Object) zb71VarL, zS, (byte) 0);
                        str3 = str3;
                        qim0VarZ = zr7.i(qim0VarZ, tfVar);
                    }
                    qim0 qim0Var2 = qim0VarZ;
                    z6 = true;
                    i2 = i3;
                    z5 = false;
                    puo1.h(tyqVar, str3, false, qim0Var2, b0kVar2, 384);
                    b0kVar2.r(false);
                } else {
                    i2 = i3;
                    z5 = false;
                    z6 = true;
                    b0kVar2.i0(-405159676);
                    lpl lplVar2 = lplVar;
                    String str5 = lplVar2.a;
                    String str6 = lplVar2.c;
                    if (z13) {
                        bc71 bc71Var3 = ((sb71) bc71Var2).b;
                        if (bc71Var3 == null) {
                            bc71Var3 = jb71.a;
                        }
                        bc71Var = bc71Var3;
                    } else {
                        bc71Var = bc71Var2;
                    }
                    otw.c(yxb0Var, new aq71(str5, !z ? str2 : null, str6, bc71Var, (sge0) null, 48), (qim0) null, (ipb1) null, b0kVar2, (i2 >> 27) & 14, 12);
                    b0kVar2.r(false);
                }
                b0kVar2.r(z6);
                if (c380Var.isEmpty() || zS) {
                    b0kVar2.i0(-5500504);
                    b0kVar2.r(z5);
                } else {
                    b0kVar2.i0(-5972603);
                    int i6 = i2 >> 6;
                    buo1.p(str, tomVar.a, c380Var, iu30Var, h9nVar, function1, function2, function0, anm1.N("ShareCardActions", nim0Var), b0kVar2, ((i2 >> 3) & 14) | 100663296 | ((i2 >> 12) & 896) | i5 | ((i4 << 6) & 57344) | (458752 & i6) | (i6 & 3670016) | ((i2 << 6) & 29360128));
                    b0kVar2.r(z5);
                }
                b0kVar2.r(z6);
                if (z) {
                    eraVar = een.R0;
                }
                if (z9) {
                    eraVar = eraVar2;
                    if (((f171) i171Var).a) {
                        z7 = z6;
                    } else {
                        eraVar = eraVar2;
                        z7 = z5;
                    }
                } else {
                    eraVar = eraVar2;
                    z7 = z5;
                }
                pbh pbhVar = pbh.a;
                fq7.b(pbhVar, z7, pbhVar.c(eraVar, nim0Var), (bby) null, (ln00) null, (String) null, apo.r(-707947314, new kj21(eraVar, fqmVar, j171Var, iu30Var, (byte) 8), b0kVar2), b0kVar2, 1572870, 28);
                b0kVar2.r(z6);
            } else {
                b0kVar2.b0();
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new z171(j171Var, str, str2, iu30Var, z, function0, c380Var, function1, function2, yxb0Var, e821Var, fqmVar, h9nVar, qim0Var, z2, z3, z4, i);
            }
        }

        public static final void e(n8d1 n8d1Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-820556148);
            int i2 = i | (x340Var.g(n8d1Var) ? 4 : 2) | 48;
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                Object value = n8d1Var.b.getValue();
                boolean z = (i2 & 14) == 4;
                Object objT = x340Var.T();
                if (z || objT == fkj0.X) {
                    objT = new hbz0(n8d1Var, (byte) 22);
                    x340Var.s0(objT);
                }
                j2i j2iVarR = apo.r(1740707421, new ub60(j2iVar, (byte) 1), x340Var);
                qim0 qim0Var3 = nim0.a;
                hm5.a(value, qim0Var3, (iu30) objT, (tl3) null, "SwapNode", (iu30) null, j2iVarR, x340Var, 1597488, 40);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new juc1(n8d1Var, qim0Var2, j2iVar, i, (byte) 3);
            }
        }

        public static void f(ct31 ct31Var, y570 y570Var, l670 l670Var) {
            spq0 spq0VarO = gc70.a.o((String) y570Var.g().j("accessoryRightIcon"));
            if (!spq0VarO.c()) {
                ct31Var.i((View) null);
                return;
            }
            SpotifyIconView spotifyIconViewZ = ioo1.z(ct31Var.getView().getContext(), (j4b1) spq0VarO.b());
            if (y570Var.j().containsKey("rightAccessoryClick")) {
                o670 o670Var = new o670(l670Var.c);
                o670Var.c("rightAccessoryClick");
                o670Var.g(y570Var);
                o670Var.f(spotifyIconViewZ);
                o670Var.d();
            }
            ct31Var.i(spotifyIconViewZ);
        }

        public static void g(tx31 tx31Var, y570 y570Var) {
            String str = y570Var.n().a.a;
            n57.j(!jhc1.F(str), "title is missing");
            tx31Var.setTitle(str);
            String str2 = y570Var.n().a.b;
            if (TextUtils.isEmpty(str2)) {
                tx31Var.setSubtitle((CharSequence) null);
                return;
            }
            if ("metadata".equals(y570Var.g().F("subtitleStyle", ""))) {
                tx31Var.m(str2);
            } else {
                tx31Var.setSubtitle(str2);
            }
            TextView subtitleView = tx31Var.getSubtitleView();
            String strB = y570Var.g().B("label");
            r4p1.h(subtitleView.getContext(), subtitleView, strB != null ? strB : "");
        }

        public static long h(int i, int i2) {
            int i3 = -1;
            int i4 = i2 == 0 ? -1 : poo.a[l1d.C(i2)];
            if (i4 != -1) {
                i3 = 1;
                if (i4 == 1) {
                    i3 = 0;
                } else if (i4 != 2) {
                    eg.o();
                    return 0L;
                }
            }
            return (((long) i) << 32) | (((long) i3) & 4294967295L);
        }

        public static final void i(View view) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof RecyclerView) {
                        childAt.setNestedScrollingEnabled(false);
                    }
                    childAt.getClass();
                    i(childAt);
                }
            }
        }

        public static final int j(long j) {
            int i = (int) (j & 4294967295L);
            if (i < 0) {
                return 0;
            }
            return i == 0 ? 1 : 2;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0086 A[Catch: Exception -> 0x00b3, CancellationException -> 0x00c2, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:13:0x0029, B:25:0x0073, B:27:0x007d, B:29:0x0083, B:44:0x00ac, B:30:0x0086, B:32:0x008a, B:36:0x009a, B:43:0x00a8, B:35:0x0092, B:21:0x004d), top: B:52:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: Exception -> 0x00b3, CancellationException -> 0x00c2, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:13:0x0029, B:25:0x0073, B:27:0x007d, B:29:0x0083, B:44:0x00ac, B:30:0x0086, B:32:0x008a, B:36:0x009a, B:43:0x00a8, B:35:0x0092, B:21:0x004d), top: B:52:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0090  */
        /* JADX WARN: Code duplicated, block: B:35:0x0092 A[Catch: Exception -> 0x00b3, CancellationException -> 0x00c2, TryCatch #0 {CancellationException -> 0x00c2, blocks: (B:13:0x0029, B:25:0x0073, B:27:0x007d, B:29:0x0083, B:44:0x00ac, B:30:0x0086, B:32:0x008a, B:36:0x009a, B:43:0x00a8, B:35:0x0092, B:21:0x004d), top: B:52:0x0021 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x009d  */
        /* JADX WARN: Code duplicated, block: B:38:0x009f  */
        /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:40:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public static final Object k(do70 do70Var, t2w t2wVar, onm onmVar) {
            kri1 kri1Var;
            t2w t2wVar2;
            Identity.SocialHandleResponse socialHandleResponse;
            tn70 tn70VarN;
            int i;
            zri1 wri1Var;
            if (onmVar instanceof kri1) {
                kri1Var = (kri1) onmVar;
                int i2 = kri1Var.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kri1Var.d = i2 - Integer.MIN_VALUE;
                } else {
                    kri1Var = new kri1(onmVar);
                }
            } else {
                kri1Var = new kri1(onmVar);
            }
            Object objJ = kri1Var.c;
            int i3 = kri1Var.d;
            int i4 = 2;
            d9n d9nVar = d9n.a;
            try {
                try {
                    if (i3 == 0) {
                        hm5.M(objJ);
                        kri1Var.a = do70Var;
                        kri1Var.b = t2wVar;
                        kri1Var.d = 1;
                        if (hap1.i(300L, kri1Var) != d9nVar) {
                        }
                        return d9nVar;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        t2wVar2 = kri1Var.b;
                        try {
                            hm5.M(objJ);
                            socialHandleResponse = (Identity.SocialHandleResponse) ((sy21) objJ).b;
                            if (socialHandleResponse == null && socialHandleResponse.o()) {
                                wri1Var = zri1.a;
                            } else {
                                tn70VarN = socialHandleResponse != null ? socialHandleResponse.n() : null;
                                if (tn70VarN == null) {
                                    i = -1;
                                } else {
                                    i = jri1.a[tn70VarN.ordinal()];
                                }
                                switch (i) {
                                    case 1:
                                        break;
                                    case 2:
                                        i4 = 3;
                                        break;
                                    case 3:
                                        i4 = 4;
                                        break;
                                    case 4:
                                        i4 = 5;
                                        break;
                                    case 5:
                                        i4 = 6;
                                        break;
                                    case 6:
                                        i4 = 7;
                                        break;
                                    default:
                                        i4 = 1;
                                        break;
                                }
                                wri1Var = new wri1(i4);
                            }
                            return new k3w(wri1Var, t2wVar2.b);
                        } catch (Exception unused) {
                            return new k3w(new wri1(8), t2wVar2.b);
                        }
                    }
                    t2wVar = kri1Var.b;
                    do70Var = kri1Var.a;
                    hm5.M(objJ);
                    un70 un70VarO = Identity.SocialHandleRequest.o();
                    un70VarO.n(t2wVar.b);
                    Identity.SocialHandleRequest socialHandleRequestBuild = un70VarO.build();
                    String str = t2wVar.a;
                    socialHandleRequestBuild.getClass();
                    Single singleG = do70Var.g(str, socialHandleRequestBuild);
                    kri1Var.a = null;
                    kri1Var.b = t2wVar;
                    kri1Var.d = 2;
                    objJ = fc11.j(singleG, kri1Var);
                    if (objJ != d9nVar) {
                        t2wVar2 = t2wVar;
                        socialHandleResponse = (Identity.SocialHandleResponse) ((sy21) objJ).b;
                        if (socialHandleResponse == null) {
                            if (socialHandleResponse != null) {
                            }
                            if (tn70VarN == null) {
                                i = -1;
                            } else {
                                i = jri1.a[tn70VarN.ordinal()];
                            }
                            switch (i) {
                                case 1:
                                    break;
                                case 2:
                                    i4 = 3;
                                    break;
                                case 3:
                                    i4 = 4;
                                    break;
                                case 4:
                                    i4 = 5;
                                    break;
                                case 5:
                                    i4 = 6;
                                    break;
                                case 6:
                                    i4 = 7;
                                    break;
                                default:
                                    i4 = 1;
                                    break;
                            }
                            wri1Var = new wri1(i4);
                        } else {
                            if (socialHandleResponse != null) {
                            }
                            if (tn70VarN == null) {
                                i = -1;
                            } else {
                                i = jri1.a[tn70VarN.ordinal()];
                            }
                            switch (i) {
                                case 1:
                                    break;
                                case 2:
                                    i4 = 3;
                                    break;
                                case 3:
                                    i4 = 4;
                                    break;
                                case 4:
                                    i4 = 5;
                                    break;
                                case 5:
                                    i4 = 6;
                                    break;
                                case 6:
                                    i4 = 7;
                                    break;
                                default:
                                    i4 = 1;
                                    break;
                            }
                            wri1Var = new wri1(i4);
                        }
                        return new k3w(wri1Var, t2wVar2.b);
                    }
                    return d9nVar;
                } catch (Exception unused2) {
                    t2wVar2 = t2wVar;
                    return new k3w(new wri1(8), t2wVar2.b);
                }
            } catch (CancellationException e) {
                throw e;
            }
        }

        public static final int l(boolean z, boolean z2) {
            return (z ? 2 : 1) + 1 + (z2 ? 1 : 0);
        }

        public static final ryx m(int i, b0k b0kVar, int i2) {
            e4j0 e4j0Var;
            boolean z = true;
            boolean z2 = (i2 & 2) == 0;
            if ((i2 & 4) != 0) {
                e4j0Var = (e4j0) ((x340) b0kVar).k(sfe0.a);
            } else {
                e4j0Var = null;
            }
            if ((((i & 112) ^ 48) <= 32 || !((x340) b0kVar).h(z2)) && (i & 48) != 32) {
                z = false;
            }
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                zzq0 zzq0Var = v4f1.a;
                objT = new ryx(new x5f1(false, z2, gfa.a), e4j0Var);
                x340Var.s0(objT);
            }
            return (ryx) objT;
        }

        public static final String n(a5j0 a5j0Var) {
            if (a5j0Var instanceof u4j0) {
                return "DataRequestReceived";
            }
            if (a5j0Var instanceof t4j0) {
                return "DataDispatched";
            }
            if (a5j0Var instanceof y4j0) {
                return "ViewDispatched";
            }
            if (a5j0Var instanceof x4j0) {
                return "Presented";
            }
            if (a5j0Var instanceof v4j0) {
                return "Discarded";
            }
            if (a5j0Var instanceof w4j0) {
                return "Dismissed";
            }
            if (a5j0Var instanceof z4j0) {
                return "ViewRequestReceived";
            }
            eg.o();
            return null;
        }

        public static final tkf o(ibf ibfVar) {
            String str;
            bbe1 bbe1Var = ibfVar.b;
            if (bbe1Var == null || (str = bbe1Var.a) == null) {
                return null;
            }
            y4i1 y4i1Var = ibfVar.d;
            String str2 = ibfVar.a;
            String str3 = y4i1Var.b;
            if (str3 == null) {
                str3 = "";
            }
            return new tkf(str2, str3, new okf(str), y4i1Var.c, y4i1Var.a instanceof hbi1, true, false);
        }

        public static final dtf p(u3f u3fVar, whf whfVar, iu30 iu30Var) {
            z6x arrayList;
            ibf ibfVar;
            ugf ugfVar = whfVar.b;
            tkf tkfVar = (tkf) iu30Var.invoke(ugfVar);
            boolean z = whfVar.c && (ugfVar == ugf.c || ugfVar == ugf.d);
            if (z) {
                arrayList = z6x.a;
            } else {
                List list = u3fVar.b;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (hashSet.add(((ibf) obj).a)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    tkf tkfVarO = o((ibf) it.next());
                    if (tkfVarO != null) {
                        arrayList.add(tkfVarO);
                    }
                }
            }
            tkf tkfVarO2 = null;
            if (!z && (ibfVar = u3fVar.a) != null) {
                tkfVarO2 = o(ibfVar);
            }
            return new dtf(tkfVarO2, o7h.N0((Iterable) arrayList, Collections.singletonList(tkfVar)), whfVar.d, whfVar.e);
        }
    }
