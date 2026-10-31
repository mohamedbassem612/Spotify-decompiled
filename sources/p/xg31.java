package p;

import android.os.Parcelable;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xg31 extends hab0 implements xu30 {
    public final /* synthetic */ boolean N0;
    public final /* synthetic */ fqm O0;
    public final /* synthetic */ c101 P0;
    public final /* synthetic */ ngs0 Q0;
    public final /* synthetic */ tob1 X;
    public final /* synthetic */ iu30 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ gg31 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ apl h;
    public final /* synthetic */ s880 i;
    public final /* synthetic */ sve t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg31(gg31 gg31Var, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, apl aplVar, s880 s880Var, sve sveVar, tob1 tob1Var, iu30 iu30Var, boolean z5, boolean z6, fqm fqmVar, c101 c101Var, ngs0 ngs0Var) {
        super(3);
        this.a = gg31Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str2;
        this.h = aplVar;
        this.i = s880Var;
        this.t = sveVar;
        this.X = tob1Var;
        this.Y = iu30Var;
        this.Z = z5;
        this.N0 = z6;
        this.O0 = fqmVar;
        this.P0 = c101Var;
        this.Q0 = ngs0Var;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:119:0x032b  */
    /* JADX WARN: Code duplicated, block: B:120:0x032f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0369  */
    /* JADX WARN: Code duplicated, block: B:126:0x036f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0379  */
    /* JADX WARN: Code duplicated, block: B:131:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:132:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:135:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:142:0x043a  */
    /* JADX WARN: Code duplicated, block: B:144:0x044a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x044c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0463  */
    /* JADX WARN: Code duplicated, block: B:151:0x0476  */
    /* JADX WARN: Code duplicated, block: B:152:0x047a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0480  */
    /* JADX WARN: Code duplicated, block: B:158:0x0489  */
    /* JADX WARN: Code duplicated, block: B:161:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:175:0x0510  */
    /* JADX WARN: Code duplicated, block: B:178:0x0527  */
    /* JADX WARN: Code duplicated, block: B:232:0x0708  */
    /* JADX WARN: Code duplicated, block: B:235:0x0715  */
    /* JADX WARN: Code duplicated, block: B:237:0x071b  */
    /* JADX WARN: Code duplicated, block: B:239:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:240:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[LOOP:0: B:67:0x0146->B:241:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:50:0x0112  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:53:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:66:0x0142  */
    /* JADX WARN: Code duplicated, block: B:69:0x014c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0184  */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    /* JADX WARN: Code duplicated, block: B:90:0x025a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0298  */
    /* JADX WARN: Code duplicated, block: B:95:0x029c  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:99:0x02bc  */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j06 j06Var;
        yk01 yk01Var;
        boolean zIsEmpty;
        boolean z;
        boolean z2;
        boolean zH;
        Object objT;
        float fX0;
        float fX1;
        hdn0 hdn0Var;
        apl aplVar;
        boolean zG;
        Object objT2;
        s880 s880Var;
        List list;
        Iterator it;
        boolean z3;
        tob1 tob1Var;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0Var;
        qim0 qim0VarE;
        boolean z4;
        Function0 function0;
        llj lljVar;
        vu30 vu30Var;
        boolean z5;
        boolean z6;
        vu30 vu30Var2;
        Function0 function1;
        llj lljVar2;
        tob1 tob1Var2;
        qim0 qim0Var2;
        qim0 qim0Var3;
        gra graVar;
        fg31 fg31Var;
        boolean z7;
        boolean z8;
        tob1 tob1Var3;
        iu30 iu30Var;
        boolean zG2;
        Object objT3;
        m4c m4cVar;
        apl aplVar2;
        gg31 gg31Var;
        tob1 tob1Var4;
        Object gqfVar;
        fg31 fg31Var2;
        bg31 bg31Var;
        fg31 fg31Var3;
        m4c m4cVar2;
        bg31 bg31Var2;
        boolean zI;
        Object objT4;
        m4c m4cVar3;
        era eraVar;
        boolean z9;
        x340 x340Var;
        bg31 bg31Var3;
        hdn0 hdn0Var2;
        boolean z10;
        float f;
        float f2;
        Function0 function2;
        float f3;
        boolean z11;
        boolean z12;
        boolean zG3;
        Object objT5;
        g2c g2cVar = (g2c) obj;
        ((Number) obj3).intValue();
        gra graVar2 = een.d;
        m4c m4cVar4 = fkj0.X;
        x340 x340Var2 = (b0k) obj2;
        Object objK = x340Var2.k(t4k.h);
        j06 j06Var2 = x340Var2.a;
        wat watVar = (wat) objK;
        gg31 gg31Var2 = this.a;
        bg31 bg31Var4 = gg31Var2.w;
        List list2 = gg31Var2.r;
        String str = gg31Var2.j;
        String strD = pcf.d(6, this.g, (String) null);
        boolean z13 = this.c;
        boolean z14 = this.f;
        if (z13 && this.d) {
            boolean z15 = this.e;
            if (z15 || z14) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    pj01 pj01Var = (pj01) next;
                    j06 j06Var3 = j06Var2;
                    Iterator it3 = it2;
                    if (pj01Var.b == sl01.c && !u890.j(pj01Var.c.a, this.b)) {
                        arrayList.add(next);
                    }
                    j06Var2 = j06Var3;
                    it2 = it3;
                }
                j06Var = j06Var2;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((pj01) it4.next()).c);
                }
                if (!arrayList2.isEmpty()) {
                    yk01Var = new yk01(4, str, strD, mqo1.F(arrayList2), z15);
                }
            } else {
                j06Var = j06Var2;
                yk01Var = null;
            }
            zIsEmpty = gg31Var2.q.isEmpty();
            if (yk01Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (zIsEmpty || z) {
                z2 = true;
            } else {
                z2 = false;
            }
            zH = x340Var2.h(z2);
            objT = x340Var2.T();
            if (zH || objT == m4cVar4) {
                if (zIsEmpty) {
                    fX0 = 0.0f;
                } else {
                    fX0 = watVar.X0(30.0f);
                }
                if (z) {
                    fX1 = watVar.X0(20.0f);
                } else {
                    fX1 = 0.0f;
                }
                objT = bb00.h((int) (fX0 + fX1), x340Var2);
            }
            hdn0Var = (hdn0) objT;
            aplVar = this.h;
            zG = x340Var2.g(aplVar);
            objT2 = x340Var2.T();
            boolean z16 = z2;
            s880Var = this.i;
            if (zG || objT2 == m4cVar4) {
                s880Var.getClass();
                if (aplVar instanceof mpl) {
                    z3 = true;
                } else if (aplVar instanceof wol) {
                    if (((wol) aplVar).b != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    if (!(aplVar instanceof ppl)) {
                        eg.o();
                        return null;
                    }
                    list = ((ppl) aplVar).b;
                    if ((list instanceof Collection) || !list.isEmpty()) {
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((opl) it.next()).c != null) {
                                    z3 = true;
                                }
                            }
                        }
                    }
                    z3 = false;
                }
                objT2 = c13.l(z3, x340Var2);
            }
            tob1Var = (ven0) objT2;
            era eraVar2 = een.P0;
            f36 f36Var = h36.c;
            mbhVarA = jbh.a(f36Var, eraVar2, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            yk01 yk01Var2 = yk01Var;
            qim0Var = nim0.a;
            qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            z4 = x340Var2.S;
            function0 = hmb0.t1;
            if (z4) {
                x340Var2.l(function0);
            } else {
                x340Var2.v0();
            }
            llj lljVar3 = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar3);
            llj lljVar4 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            lljVar = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar);
            nko1.F(x340Var2);
            vu30Var = y580.Y;
            nko1.H(qim0VarE, x340Var2, vu30Var);
            z5 = this.e;
            z6 = this.f;
            if (z5 || !gg31Var2.v || z6) {
                vu30Var2 = vu30Var;
                function1 = function0;
                lljVar2 = lljVar;
                tob1Var2 = tob1Var;
                qim0Var2 = qim0Var;
                qim0Var3 = null;
                x340Var2.i0(-1143814603);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1144198042);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(qim0Var, 0.0f, 4.0f, 0.0f, 8.0f, 5);
                qim0Var2 = qim0Var;
                gfh0 gfh0VarC = t1c.c(graVar2, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function0);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar3);
                nko1.H(xos0VarM2, x340Var2, lljVar4);
                x0d.q(iHashCode2, x340Var2, lljVar, x340Var2);
                nko1.H(qim0VarE2, x340Var2, vu30Var);
                vu30Var2 = vu30Var;
                tob1Var2 = tob1Var;
                function1 = function0;
                lljVar2 = lljVar;
                qim0Var3 = null;
                otw.c(this.t, new yvm(gg31Var2.l, true), (qim0) null, (ipb1) null, x340Var2, 8, 12);
                x340Var2.r(true);
                x340Var2.r(false);
            }
            qim0 qim0Var4 = qim0Var2;
            qim0 qim0VarK = d9y0.k(u291.f(qim0Var4, 1.0f), ((Number) this.X.getValue()).floatValue());
            if (z6 != 0) {
                graVar = een.i;
            } else {
                graVar = een.g;
            }
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarK);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar3);
            nko1.H(xos0VarM3, x340Var2, lljVar4);
            llj lljVar5 = lljVar2;
            x0d.q(iHashCode3, x340Var2, lljVar5, x340Var2);
            vu30 vu30Var3 = vu30Var2;
            nko1.H(qim0VarE3, x340Var2, vu30Var3);
            boolean zBooleanValue = ((Boolean) tob1Var2.getValue()).booleanValue();
            fg31Var = gg31Var2.n;
            s880Var.getClass();
            if (!(aplVar instanceof mpl) || (aplVar instanceof wol)) {
                z7 = false;
            } else {
                if (!(aplVar instanceof ppl)) {
                    eg.o();
                    return qim0Var3;
                }
                if (zBooleanValue && (fg31Var instanceof eg31) && !bg31Var4.equals(vf31.a) && z6 == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            z8 = z7;
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0Var4);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar3);
            nko1.H(xos0VarM4, x340Var2, lljVar4);
            x0d.q(iHashCode4, x340Var2, lljVar5, x340Var2);
            nko1.H(qim0VarE4, x340Var2, vu30Var3);
            Boolean bool = (Boolean) tob1Var2.getValue();
            bool.getClass();
            Object[] objArr = {fg31Var, bg31Var4, bool};
            tob1Var3 = tob1Var2;
            boolean zI2 = x340Var2.i(tob1Var3) | x340Var2.i(gg31Var2);
            iu30Var = this.Y;
            zG2 = zI2 | x340Var2.g(iu30Var) | x340Var2.i(aplVar);
            objT3 = x340Var2.T();
            if (!zG2) {
                m4cVar = m4cVar4;
                if (objT3 == m4cVar) {
                    gg31Var = gg31Var2;
                    bg31Var = bg31Var4;
                    fg31Var2 = fg31Var;
                    gqfVar = objT3;
                    aplVar2 = aplVar;
                    tob1Var4 = tob1Var3;
                }
                PointerInputEventHandler pointerInputEventHandler = (PointerInputEventHandler) gqfVar;
                bav0 bav0Var = f8d1.a;
                b8d1 b8d1Var = new b8d1((Object) null, (Object) null, objArr, pointerInputEventHandler, 3);
                fg31Var3 = fg31Var2;
                gfh0 gfh0VarC3 = t1c.c(graVar2, false);
                m4cVar2 = m4cVar;
                bg31Var2 = bg31Var;
                int iHashCode5 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM5 = x340Var2.m();
                qim0 qim0VarE5 = zr7.E(x340Var2, b8d1Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(function1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC3, x340Var2, lljVar3);
                nko1.H(xos0VarM5, x340Var2, lljVar4);
                x0d.q(iHashCode5, x340Var2, lljVar5, x340Var2);
                nko1.H(qim0VarE5, x340Var2, vu30Var3);
                String str2 = gg31Var.j;
                zI = x340Var2.i(tob1Var4);
                objT4 = x340Var2.T();
                if (!zI) {
                    m4cVar3 = m4cVar2;
                    if (objT4 == m4cVar3) {
                    }
                    tob1 tob1Var5 = tob1Var4;
                    w4i1 w4i1Var = gg31Var.l;
                    Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
                    gg31 gg31Var3 = gg31Var;
                    Function0 function3 = function1;
                    s880Var.a(aplVar2, this.g, str2, z6, (Function0) objT4, w4i1Var, (qim0) null, this.Z, this.N0, x340Var2, 0);
                    x340Var2.r(true);
                    if (z8) {
                        x340Var2.i0(-1711504529);
                        zG3 = x340Var2.g(iu30Var);
                        objT5 = x340Var2.T();
                        if (zG3 || objT5 == m4cVar3) {
                            objT5 = new dv11(iu30Var, (byte) 29);
                            x340Var2.s0(objT5);
                        }
                        cxm.h(0, (Function0) objT5, x340Var2, qim0Var3);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1711354613);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                    x340Var2.r(true);
                    if (z6 != 0) {
                        eraVar = een.R0;
                    } else {
                        eraVar = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x047a: MOVE (r14v3 'eraVar' p.era) = (r31v0 p.era) (LINE:1147) in method: p.xg31.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes5.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r31v0 p.era
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1825
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.xg31.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }
