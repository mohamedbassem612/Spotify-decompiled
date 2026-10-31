package p;

import android.app.Activity;
import com.spotify.blend.tastematch.BlendStoryContainerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i7d implements dl4 {
    public final Object N0;
    public final Object O0;
    public final Object P0;
    public final Object Q0;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public i7d(daq daqVar, BlendStoryContainerActivity blendStoryContainerActivity) {
        this.b = daqVar;
        this.a = blendStoryContainerActivity;
        this.c = new p2p(daqVar, this, 1, (byte) 19);
        this.d = new p2p(daqVar, this, 0, (byte) 19);
        this.e = xqu.b(new p2p(daqVar, this, 4, (byte) 19));
        this.f = xqu.b(new p2p(daqVar, this, 3, (byte) 19));
        this.g = new p2p(daqVar, this, 2, (byte) 19);
        this.h = new p2p(daqVar, this, 6, (byte) 19);
        this.i = new p2p(daqVar, this, 8, (byte) 19);
        this.t = new p2p(daqVar, this, 7, (byte) 19);
        this.X = new p2p(daqVar, this, 9, (byte) 19);
        this.Y = new p2p(daqVar, this, 10, (byte) 19);
        this.Z = xqu.b(new p2p(daqVar, this, 5, (byte) 19));
        this.N0 = new p2p(daqVar, this, 11, (byte) 19);
        this.O0 = xqu.b(new p2p(daqVar, this, 14, (byte) 19));
        this.P0 = xqu.b(new p2p(daqVar, this, 13, (byte) 19));
        this.Q0 = new p2p(daqVar, this, 12, (byte) 19);
    }

    public static ArrayList i(List list) {
        qh51 sjkVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qh51 sjkVar2 = (jkk) it.next();
            if (sjkVar2 instanceof wjk) {
                sjkVar2 = ((wjk) sjkVar2).a;
            } else if (sjkVar2 instanceof vjk) {
                sjkVar2 = ((vjk) sjkVar2).a;
            } else if (sjkVar2 instanceof akk) {
                sjkVar2 = ((akk) sjkVar2).a;
            } else if (sjkVar2 instanceof bkk) {
                sjkVar2 = ((bkk) sjkVar2).a;
            } else if (sjkVar2 instanceof gkk) {
                sjkVar2 = ((gkk) sjkVar2).a;
            } else if (sjkVar2 instanceof fkk) {
                sjkVar2 = ((fkk) sjkVar2).a;
            } else if (!(sjkVar2 instanceof ikk)) {
                if (sjkVar2 instanceof hkk) {
                    sjkVar2 = ((hkk) sjkVar2).a;
                } else if (sjkVar2 instanceof ujk) {
                    sjkVar2 = ((ujk) sjkVar2).a;
                } else if (sjkVar2 instanceof yjk) {
                    sjkVar2 = ((yjk) sjkVar2).a;
                } else if (sjkVar2 instanceof zjk) {
                    sjkVar2 = ((zjk) sjkVar2).a;
                } else {
                    if (sjkVar2 instanceof xjk) {
                        xjk xjkVar = (xjk) sjkVar2;
                        sjkVar = new pjk(xjkVar.b, xjkVar.a);
                    } else if (sjkVar2 instanceof ckk) {
                        sjkVar = new sjk(((ckk) sjkVar2).a);
                    } else if (u890.j(sjkVar2, dkk.a)) {
                        sjkVar2 = new sjk((tje1) null);
                    } else {
                        if (!u890.j(sjkVar2, ekk.a)) {
                            eg.o();
                            return null;
                        }
                        sjkVar2 = null;
                    }
                    sjkVar2 = sjkVar;
                }
            }
            if (sjkVar2 != null) {
                arrayList.add(sjkVar2);
            }
        }
        return arrayList;
    }

    public void a(if00 if00Var, iu30 iu30Var, b0k b0kVar, int i) {
        if00 if00Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-903439755);
        int i2 = (x340Var.g(if00Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            xfx xfxVar = (xfx) this.b;
            p40 p40Var = (p40) this.d;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | x340Var.i(this) | ((i2 & 112) == 32) | x340Var.g(linkedHashMap);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new djx(this, if00Var, iu30Var, linkedHashMap);
                x340Var.s0(objT);
            }
            if00Var2 = if00Var;
            l4o1.d(if00Var2, xfxVar, p40Var, qim0VarF, (iu30) objT, x340Var, i3 | 512);
        } else {
            if00Var2 = if00Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xh00(this, if00Var2, iu30Var, i);
        }
    }

    public void b(if00 if00Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(964797986);
        int i2 = (x340Var.g(if00Var) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            new ArrayList();
            throw null;
        }
        x340Var.b0();
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hzw(this, if00Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01af  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0202  */
    /* JADX WARN: Code duplicated, block: B:88:0x0204  */
    /* JADX WARN: Code duplicated, block: B:92:0x020d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0235  */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v35 */
    public void c(nkk nkkVar, rxk0 rxk0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        ?? r5;
        vgk vgkVar;
        vgk ugkVar;
        Object objT;
        hdn0 hdn0Var;
        qim0 qim0Var3;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z;
        int i2;
        boolean z2;
        boolean zI;
        Object objT2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objT3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1460646269);
        int i3 = i | (x340Var.i(nkkVar) ? 4 : 2) | (x340Var.i(rxk0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072 | (x340Var.i(this) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            w9r w9rVar = (w9r) ((bhk) this.Z).j.getValue();
            if (w9rVar == null) {
                x340Var.i0(-1799071786);
                x340Var.r(false);
                r5 = 0;
            } else {
                x340Var.i0(-1799071785);
                p9k p9kVar = (p9k) ((idd1) this.Q0).getValue();
                String str = w9rVar.b;
                String str2 = w9rVar.c;
                String strO0 = cwl1.o0(x340Var, 2131956610);
                boolean zI2 = ((i3 & 896) == 256) | x340Var.i(this) | x340Var.g(w9rVar);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == m4cVar) {
                    objT4 = new d1c(this, iu30Var, w9rVar, (byte) 26);
                    x340Var.s0(objT4);
                }
                Function0 function0 = (Function0) objT4;
                boolean zI3 = x340Var.i(this);
                Object objT5 = x340Var.T();
                if (zI3 || objT5 == m4cVar) {
                    objT5 = new vjh(this, (byte) 15);
                    x340Var.s0(objT5);
                }
                r5 = 0;
                otw.c(p9kVar, new o9k(str, str2, strO0, function0, (Function0) objT5), (qim0) null, (ipb1) null, x340Var, 8, 12);
                x340Var.r(false);
            }
            boolean zI4 = x340Var.i(rxk0Var);
            Object objT6 = x340Var.T();
            if (zI4 || objT6 == m4cVar) {
                objT6 = new mwh(rxk0Var, (byte) 20);
                x340Var.s0(objT6);
            }
            h3h1 h3h1Var = new h3h1((iu30) objT6);
            xtb0 xtb0VarA = aub0.a((int) r5, x340Var, 3);
            i6o0 i6o0VarQ = k1o1.q(x340Var);
            olo0 olo0Var = nkkVar.d;
            if (olo0Var == null || !olo0Var.f) {
                tt6 tt6Var = nkkVar.e;
                if (tt6Var == null || !tt6Var.a) {
                    vgkVar = null;
                } else {
                    ugkVar = new ugk(tt6Var);
                }
                objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = bb00.h((int) r5, x340Var);
                }
                hdn0Var = (hdn0) objT;
                qim0Var3 = nim0.a;
                qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                gfh0VarC = t1c.c(een.d, (boolean) r5);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarD);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                qim0 qim0VarL = bmq0.L(qim0Var3, i6o0VarQ, (g6o0) null);
                zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, 16.0f, 7);
                boolean zI5 = x340Var.i(this);
                if ((i3 & 14) != 4 || x340Var.i(nkkVar)) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z6 = zI5 | z;
                i2 = i3 & 896;
                if (i2 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zI = z2 | z6 | x340Var.i(hdn0Var);
                objT2 = x340Var.T();
                if (!zI || objT2 == m4cVar) {
                    z3 = true;
                    ggh gghVar = new ggh(this, nkkVar, iu30Var, hdn0Var, (byte) 9);
                    x340Var.s0(gghVar);
                    objT2 = gghVar;
                } else {
                    z3 = true;
                }
                z4 = z3;
                s3o1.d(qim0VarL, xtb0VarA, zzq0VarJ, null, null, null, false, h3h1Var, (iu30) objT2, x340Var, 0, 248);
                x340Var = x340Var;
                x340Var.r(z4);
                if (vgkVar == null) {
                    x340Var.i0(-1796518099);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1796518098);
                    if (i2 == 256) {
                        z5 = z4;
                    } else {
                        z5 = false;
                    }
                    objT3 = x340Var.T();
                    if (z5 || objT3 == m4cVar) {
                        objT3 = new usj(iu30Var, (byte) 14);
                        x340Var.s0(objT3);
                    }
                    gm50.a(vgkVar, (iu30) objT3, (cfd) this.b, (ivo0) this.c, (qim0) null, x340Var, 0);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
                qim0Var2 = qim0Var3;
            } else {
                ugkVar = new vgk(olo0Var);
            }
            vgkVar = ugkVar;
            objT = x340Var.T();
            if (objT == m4cVar) {
                objT = bb00.h((int) r5, x340Var);
            }
            hdn0Var = (hdn0) objT;
            qim0Var3 = nim0.a;
            qim0 qim0VarD2 = u291.d(qim0Var3, 1.0f);
            gfh0VarC = t1c.c(een.d, (boolean) r5);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarD2);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            qim0 qim0VarL2 = bmq0.L(qim0Var3, i6o0VarQ, (g6o0) null);
            zzq0 zzq0VarJ2 = uyn1.j(0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean zI6 = x340Var.i(this);
            if ((i3 & 14) != 4) {
                z = true;
            } else {
                z = true;
            }
            boolean z7 = zI6 | z;
            i2 = i3 & 896;
            if (i2 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            zI = z2 | z7 | x340Var.i(hdn0Var);
            objT2 = x340Var.T();
            if (zI) {
                z3 = true;
                ggh gghVar2 = new ggh(this, nkkVar, iu30Var, hdn0Var, (byte) 9);
                x340Var.s0(gghVar2);
                objT2 = gghVar2;
            } else {
                z3 = true;
                ggh gghVar3 = new ggh(this, nkkVar, iu30Var, hdn0Var, (byte) 9);
                x340Var.s0(gghVar3);
                objT2 = gghVar3;
            }
            z4 = z3;
            s3o1.d(qim0VarL2, xtb0VarA, zzq0VarJ2, null, null, null, false, h3h1Var, (iu30) objT2, x340Var, 0, 248);
            x340Var = x340Var;
            x340Var.r(z4);
            if (vgkVar == null) {
                x340Var.i0(-1796518099);
                x340Var.r(false);
            } else {
                x340Var.i0(-1796518098);
                if (i2 == 256) {
                    z5 = z4;
                } else {
                    z5 = false;
                }
                objT3 = x340Var.T();
                if (z5) {
                    objT3 = new usj(iu30Var, (byte) 14);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new usj(iu30Var, (byte) 14);
                    x340Var.s0(objT3);
                }
                gm50.a(vgkVar, (iu30) objT3, (cfd) this.b, (ivo0) this.c, (qim0) null, x340Var, 0);
                x340Var = x340Var;
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 6, i, (Object) this, (Object) nkkVar, (Object) rxk0Var, (Object) iu30Var, (Object) qim0Var2);
        }
    }

    public void d(cj00 cj00Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        cj00 cj00Var2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-644237309);
        int i2 = i | (b0kVar3.i(cj00Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384 | (b0kVar3.i(this) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            i6o0 i6o0VarQ = k1o1.q(b0kVar3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
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
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            boolean zI = b0kVar3.i(this);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new yh00(this, (byte) 1);
                b0kVar3.s0(objT2);
            }
            cj00Var2 = cj00Var;
            dgo1.c("live-events-hub-root", (iu30) objT2, apo.r(1945770181, new sxj(this, cj00Var, iu30Var, i6o0VarQ, ven0Var, (byte) 24), b0kVar3), b0kVar3, 390);
            b0kVar2 = b0kVar3;
            r4o1.l(iu30Var, (uny) this.a, null, cj00Var2.e, b0kVar2, (i2 >> 3) & 14);
            ni00 ni00Var = (ni00) ven0Var.getValue();
            if (ni00Var == null) {
                b0kVar2.i0(1689393531);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1689393532);
                boolean zI2 = b0kVar2.i(ven0Var);
                Object objT3 = b0kVar2.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new iwr(ven0Var, (byte) 17);
                    b0kVar2.s0(objT3);
                }
                ryn1.c(ni00Var, (Function0) objT3, null, b0kVar2, 0);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            cj00Var2 = cj00Var;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(this, cj00Var2, iu30Var, qim0Var2, i, (byte) 12);
        }
    }

    public void e(cj00 cj00Var, iu30 iu30Var, d6o0 d6o0Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1716751838);
        int i2 = i | (b0kVar3.i(cj00Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(d6o0Var) ? 256 : 128) | (b0kVar3.i(iu30Var2) ? 2048 : 1024) | 24576 | (b0kVar3.i(this) ? 131072 : 65536);
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            upb0 upb0VarB = wpb0.b(b0kVar3);
            a6o1.c(upb0VarB, cj00Var.g, iu30Var, b0kVar3, (i2 << 3) & 896);
            pf50 pf50Var = new pf50(2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(qim0Var3, d6o0Var, (g6o0) null);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar3).g, 32, qim0VarL);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0VarJ = uyn1.j(16.0f, 0.0f, 16.0f, cbx.b(b0kVar3).b.f, 2);
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            d36 d36Var2 = new d36(16.0f, true, new um5(false));
            boolean zI = b0kVar3.i(this) | b0kVar3.i(cj00Var) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                lhx lhxVar = new lhx(this, cj00Var, iu30Var2, iu30Var, (byte) 7);
                b0kVar3.s0(lhxVar);
                objT = lhxVar;
            }
            b0kVar2 = b0kVar3;
            qim0Var2 = qim0Var3;
            dko1.g(pf50Var, qim0VarP, upb0VarB, zzq0VarJ, d36Var, d36Var2, null, false, null, (iu30) objT, b0kVar2, 0, 912);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy((Object) this, (Object) cj00Var, (Object) iu30Var, (Object) d6o0Var, (Object) iu30Var2, (Object) qim0Var2, i, (byte) 1);
        }
    }

    public void f(zj51 zj51Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-286948022);
        int i2 = i | (x340Var.g(zj51Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384 | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            int i3 = i2 & 14;
            boolean zI = ((i2 & 112) == 32) | x340Var.i(this) | (i3 == 4);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new rjk(this, zj51Var, iu30Var);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean z = i3 == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new mwh(zj51Var, (byte) 21);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var2, qim0VarF, (iu30) objT2, x340Var, 0, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hwd(i, this, zj51Var, iu30Var, qim0Var2, (byte) 24);
        }
    }

    public String g() {
        String stringExtra = ((BlendStoryContainerActivity) this.a).getIntent().getStringExtra("apps.music.features.blend-taste-match.key.PLAYLIST_URI");
        return stringExtra == null ? "" : stringExtra;
    }

    public w3l0 h() {
        return new w3l0(((vp11) this.b).h.path(), ((cp11) this.a).a);
    }

    public void j(rtb0 rtb0Var, ArrayList arrayList, iu30 iu30Var, int i) {
        rtb0Var.e(arrayList.size(), new da(new vx1(i, (byte) 10), arrayList, (byte) 12), new tjk(arrayList, (byte) 0), new j2i(2039820996, new oi1((Object) arrayList, (Object) this, (Object) arrayList, (Object) iu30Var, (byte) 4), true));
    }

    public void w(Object obj) {
        BlendStoryContainerActivity blendStoryContainerActivity = (BlendStoryContainerActivity) obj;
        ((t3b1) blendStoryContainerActivity).b1 = (jgu) ((p2p) this.d).get();
        ((t3b1) blendStoryContainerActivity).c1 = new tuk(xqu.a((p2p) this.g));
        blendStoryContainerActivity.g1 = (a2k) ((jly0) this.Z).get();
    }

    public i7d(qut0 qut0Var, w4h w4hVar, mwm1 mwm1Var, g7h g7hVar, el3 el3Var, uu00 uu00Var, xrc0 xrc0Var, iyc0 iyc0Var, kkg1 kkg1Var, jjk0 jjk0Var, ylk0 ylk0Var, q8n q8nVar, q8n q8nVar2, String str, mr20 mr20Var, sko skoVar, oj3 oj3Var) {
        this.a = qut0Var;
        this.b = w4hVar;
        this.c = mwm1Var;
        this.d = g7hVar;
        this.e = el3Var;
        this.f = uu00Var;
        this.g = xrc0Var;
        this.h = iyc0Var;
        this.i = kkg1Var;
        this.t = jjk0Var;
        this.X = ylk0Var;
        this.Y = str;
        this.Z = mr20Var;
        this.N0 = skoVar;
        this.O0 = oj3Var;
        this.P0 = q8nVar;
        this.Q0 = q8nVar2;
    }

    public i7d(xfx xfxVar, cfd cfdVar, ivo0 ivo0Var, kys kysVar, afs afsVar, bnr bnrVar, n7p n7pVar, ggr ggrVar, lbs lbsVar, u9u0 u9u0Var, q7r0 q7r0Var, bjx bjxVar, bhk bhkVar, q3c q3cVar, yqg yqgVar, xrk xrkVar, y1t0 y1t0Var) {
        this.a = xfxVar;
        this.b = cfdVar;
        this.c = ivo0Var;
        this.d = kysVar;
        this.e = afsVar;
        this.f = bnrVar;
        this.g = n7pVar;
        this.h = ggrVar;
        this.i = lbsVar;
        this.t = u9u0Var;
        this.X = q7r0Var;
        this.Y = bjxVar;
        this.Z = bhkVar;
        this.N0 = yqgVar;
        this.O0 = xrkVar;
        this.P0 = y1t0Var;
        this.Q0 = new idd1(new opg(this, (byte) 3));
    }

    public i7d(uny unyVar, xfx xfxVar, ksk0 ksk0Var, p40 p40Var, n7p n7pVar, hz5 hz5Var, nmr nmrVar, bnr bnrVar, zqm0 zqm0Var, afp afpVar, bfp bfpVar, z8x z8xVar, fod0 fod0Var, xrk xrkVar, q7r0 q7r0Var, u9u0 u9u0Var, mmr mmrVar) {
        this.a = unyVar;
        this.b = xfxVar;
        this.c = ksk0Var;
        this.d = p40Var;
        this.e = hz5Var;
        this.f = bfpVar;
        this.g = z8xVar;
        this.h = xrkVar;
        this.i = q7r0Var;
        this.t = u9u0Var;
        this.X = new idd1(new pdy(this, (byte) 21));
        this.Y = new idd1(new t3x(nmrVar, this, (byte) 18));
        this.Z = new idd1(new t3x(mmrVar, this, (byte) 17));
        this.N0 = new idd1(new xvy(zqm0Var, this, fod0Var, (byte) 3));
        this.O0 = n7pVar.a();
        this.P0 = new idd1(new t3x(bnrVar, this, (byte) 19));
        this.Q0 = new idd1(new t3x(this, afpVar, (byte) 16));
    }

    public i7d(Activity activity, lzn0 lzn0Var, byp0 byp0Var, b7n b7nVar, xrc0 xrc0Var, dxz0 dxz0Var, ayl aylVar, hx7 hx7Var, z5h1 z5h1Var, o241 o241Var, i1r0 i1r0Var, uu00 uu00Var, luk lukVar, q8n q8nVar, q8n q8nVar2, q8n q8nVar3, q8n q8nVar4, mr20 mr20Var, k740 k740Var, kdn0 kdn0Var) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = byp0Var;
        this.d = b7nVar;
        this.e = xrc0Var;
        this.f = dxz0Var;
        this.g = aylVar;
        this.h = hx7Var;
        this.i = z5h1Var;
        this.t = i1r0Var;
        this.X = uu00Var;
        this.Y = lukVar;
        this.Z = mr20Var;
        this.N0 = q8nVar;
        this.O0 = q8nVar2;
        this.P0 = q8nVar3;
        this.Q0 = q8nVar4;
    }

    public i7d(iac0 iac0Var, l8h1 l8h1Var, y1c1 y1c1Var, d0r d0rVar, xfx xfxVar, jus jusVar, yqg yqgVar, lzn0 lzn0Var, jto jtoVar, cp11 cp11Var, vp11 vp11Var, wf4 wf4Var, quc0 quc0Var, af10 af10Var, w6e0 w6e0Var, xmu0 xmu0Var, Boolean bool, opv0 opv0Var, dvp dvpVar, fcq fcqVar, Boolean bool2, mr20 mr20Var) {
        this.a = cp11Var;
        this.b = vp11Var;
        this.c = xfxVar;
        this.d = y1c1Var;
        this.e = iac0Var;
        this.f = d0rVar;
        this.g = af10Var;
        this.h = yqgVar;
        this.i = wf4Var;
        this.t = quc0Var;
        this.X = jusVar;
        this.Y = jtoVar;
        this.Z = bool2;
        this.N0 = mr20Var;
        this.O0 = jo80.a(dvpVar);
        this.P0 = jo80.a(fcqVar);
        this.Q0 = xqu.b(new j7p(this, (byte) 11));
    }

    public /* synthetic */ i7d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
        this.i = obj9;
        this.t = obj10;
        this.X = obj11;
        this.Y = obj12;
        this.Z = obj13;
        this.N0 = obj14;
        this.O0 = obj15;
        this.P0 = obj16;
        this.Q0 = obj17;
    }
}
