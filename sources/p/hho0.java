package p;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.scrollsita.v1.Section;
import com.spotify.tome.pageactivity.PageActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hho0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hho0(FrameLayout frameLayout, View view, PageActivity pageActivity, View view2) {
        super(3);
        this.a = (byte) 1;
        this.b = frameLayout;
        this.c = view;
        this.d = view2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        Integer numValueOf;
        lex lexVar = (lex) this.b;
        i2c i2cVar = (i2c) obj;
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        x340Var.i0(1865411544);
        t0z t0zVar = sc11.b;
        ArrayList arrayList = new ArrayList(q7h.U(t0zVar, 10));
        Iterator it = t0zVar.iterator();
        while (it.hasNext()) {
            arrayList.add(cwl1.o0(x340Var, b2p1.A((sc11) it.next())));
        }
        x340Var.r(false);
        int i = hjl.i(i2cVar.b);
        Object obj4 = fkj0.X;
        float fN = uyn1.n(lexVar.a, (flb0) x340Var.k(t4k.n)) + 6.0f;
        lee1 lee1Var = lexVar.e;
        yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
        int iI0 = ((wat) x340Var.k(t4k.h)).i0(fN);
        boolean zG = x340Var.g(arrayList) | x340Var.g(lee1Var) | x340Var.e(iI0) | x340Var.g(yae1VarQ);
        Object objT = x340Var.T();
        Object obj5 = null;
        if (zG || objT == obj4) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                numValueOf = Integer.valueOf((int) (yae1.a(yae1VarQ, (String) it2.next(), lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
                while (it2.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf((int) (yae1.a(yae1VarQ, (String) it2.next(), lee1Var, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c >> 32));
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
            } else {
                numValueOf = null;
            }
            objT = Integer.valueOf((numValueOf != null ? numValueOf.intValue() : 0) + iI0 + iI0);
            x340Var.s0(objT);
        }
        int iIntValue = ((Number) objT).intValue();
        int iI1 = ((wat) x340Var.k(t4k.h)).i0(8.0f);
        boolean zE = x340Var.e(arrayList.size()) | x340Var.e(i) | x340Var.e(iIntValue) | x340Var.e(iI1);
        Object objT2 = x340Var.T();
        if (zE || objT2 == obj4) {
            int size = arrayList.size();
            rr80 rr80VarM = ebp1.m(size, 1, -1);
            ArrayList arrayList2 = new ArrayList();
            lr80 it3 = rr80VarM.iterator();
            while (((sr80) it3).c) {
                Object next = it3.next();
                if (size % ((Number) next).intValue() == 0) {
                    arrayList2.add(next);
                }
            }
            for (Object obj6 : arrayList2) {
                int iIntValue2 = ((Number) obj6).intValue();
                if (((iIntValue2 - 1) * iI1) + (iIntValue2 * iIntValue) <= i) {
                    obj5 = obj6;
                    break;
                }
            }
            Integer num = (Integer) obj5;
            objT2 = Integer.valueOf(num != null ? num.intValue() : 1);
            x340Var.s0(objT2);
        }
        k5p1.d((qim0) null, new d36(8.0f, true, new um5(false)), new d36(8.0f, true, new um5(false)), (pl3) null, ((Number) objT2).intValue(), 0, apo.r(-1702254698, new c9y(arrayList, (Set) this.c, (iu30) this.d, lexVar, (byte) 28), x340Var), x340Var, 1572864, 41);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        hw11 hw11Var = (hw11) this.d;
        ((Number) obj3).intValue();
        List list = (List) this.b;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarA = ((nw31) obj).a(1.0f, nim0Var, true);
        x340 x340Var = (b0k) obj2;
        Object objT = x340Var.T();
        j06 j06Var = x340Var.a;
        if (objT == fkj0.X) {
            objT = ou11.S0;
            x340Var.s0(objT);
        }
        boolean z = false;
        qim0 qim0VarB = s161.b(qim0VarA, false, (iu30) objT);
        maa maaVar = (maa) this.c;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
        if (maaVar == null) {
            x340Var.i0(1063203858);
            x340Var.r(false);
        } else {
            x340Var.i0(1063203859);
            otw.c(maaVar, hw11Var, (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(false);
        }
        x340Var.r(true);
        if (list.isEmpty()) {
            x340Var.i0(1448011497);
            x340Var.r(false);
        } else {
            x340Var.i0(1447659461);
            qim0 qim0VarN = anm1.N("releases_header_trailing_actions", nim0Var);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
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
            x340Var.i0(357815095);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                otw.c((maa) it.next(), hw11Var.a, (qim0) null, (ipb1) null, x340Var, 0, 12);
                z = z;
            }
            boolean z3 = z;
            us71.m(x340Var, z3, true, z3);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0201  */
    /* JADX WARN: Code duplicated, block: B:27:0x021e  */
    /* JADX WARN: Code duplicated, block: B:29:0x024c  */
    /* JADX WARN: Code duplicated, block: B:32:0x026e  */
    /* JADX WARN: Code duplicated, block: B:40:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:43:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:45:0x0317  */
    private final Object e(Object obj, Object obj2, Object obj3) {
        m4c m4cVar;
        boolean z;
        m4c m4cVar2;
        z50 z50Var;
        boolean zI;
        Object objT;
        k811 k811Var;
        iu30 iu30Var;
        era eraVar;
        x340 x340Var;
        m4c m4cVar3;
        boolean z2;
        k811 k811Var2;
        iu30 iu30Var2;
        boolean zI2;
        Object objT2;
        boolean z3;
        hax haxVar;
        Object objT3;
        x340 x340Var2 = (b0k) obj2;
        ((Number) obj3).intValue();
        era eraVar2 = een.Q0;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarW = uyn1.w(u291.d(nim0Var, 1.0f), (vzq0) obj);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var2).b;
        cvx cvxVar2 = cbx.b(x340Var2).b;
        qim0 qim0VarH = l6o1.H(uyn1.B(qim0VarW, 16.0f, 0.0f, 16.0f, cbx.b(x340Var2).b.b, 2), l6o1.C(0, 0, 1, x340Var2), false, 14);
        ia21 ia21Var = (ia21) this.b;
        String str = ia21Var.a;
        k811 k811Var3 = (k811) this.c;
        iu30 iu30Var3 = (iu30) this.d;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
        x340 x340Var3 = x340Var2;
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarH);
        hzj.A.getClass();
        x340 x340Var4 = x340Var2;
        if (x340Var4.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var4.m0();
        if (x340Var4.S) {
            x340Var4.l(hmb0.t1);
        } else {
            x340Var4.v0();
        }
        nko1.H(mbhVarA, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        cvx cvxVar3 = cbx.b(x340Var2).b;
        String strN = eqq.n(nim0Var, 8.0f, x340Var2, 2131961166, x340Var2);
        lee1 lee1Var = cbx.d(x340Var2).e;
        Object objT4 = x340Var4.T();
        m4c m4cVar4 = fkj0.X;
        if (objT4 == m4cVar4) {
            objT4 = ma21.b;
            x340Var4.s0(objT4);
        }
        uwo1.e(strN, s161.b(nim0Var, false, (iu30) objT4), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2040);
        cvx cvxVar4 = cbx.b(x340Var2).b;
        op71.g(x340Var2, u291.h(nim0Var, 16.0f));
        String strN0 = cwl1.n0(2131961172, new Object[]{"[REMOVE_PARENT_DISPLAY_NAME_PLACEHOLDER]"}, x340Var2);
        zma1 zma1Var = cbx.d(x340Var2).k.a;
        boolean z4 = ia21Var.b;
        boolean zG = x340Var4.g(strN0) | x340Var4.g(str) | x340Var4.g(zma1Var);
        Object objT5 = x340Var4.T();
        if (!zG) {
            m4cVar = m4cVar4;
            if (objT5 != m4cVar) {
                z = false;
            }
            m4cVar2 = m4cVar;
            uwo1.f((af5) objT5, (qim0) null, cbx.d(x340Var2).j, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var2, 0, 0, 4090);
            cvx cvxVar5 = cbx.b(x340Var2).b;
            uwo1.e(eqq.n(nim0Var, 12.0f, x340Var2, 2131961167, x340Var2), (qim0) null, cbx.d(x340Var2).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
            cvx cvxVar6 = cbx.b(x340Var2).b;
            uwo1.e(eqq.n(nim0Var, 12.0f, x340Var2, 2131961170, x340Var2), (qim0) null, cbx.d(x340Var2).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
            op71.g(x340Var2, u291.h(nim0Var, cbx.b(x340Var2).b.d));
            z50Var = z50.c;
            if (z4) {
                x340Var4.i0(-1088560146);
                qim0 qim0VarN = anm1.N("remove_parent_progress", new tq60(eraVar2));
                objT3 = x340Var4.T();
                if (objT3 == m4cVar2) {
                    objT3 = ma21.c;
                    x340Var4.s0(objT3);
                }
                xto1.e(s161.a(qim0VarN, (iu30) objT3), 3, 0L, 0L, x340Var2, 48, 12);
                x340Var4.r(false);
                iu30Var = iu30Var3;
                z2 = false;
                x340Var = x340Var4;
                eraVar = eraVar2;
                m4cVar3 = m4cVar2;
                k811Var = k811Var3;
            } else {
                x340Var4.i0(-1088291593);
                zI = x340Var4.i(k811Var3) | x340Var4.g(iu30Var3);
                objT = x340Var4.T();
                if (zI || objT == m4cVar2) {
                    objT = new na21(k811Var3, iu30Var3, (byte) 0);
                    x340Var4.s0(objT);
                }
                k811Var = k811Var3;
                iu30Var = iu30Var3;
                eraVar = eraVar2;
                x340Var = x340Var4;
                m4cVar3 = m4cVar2;
                z2 = false;
                foo1.c(new gbx(z50Var, (Function0) objT), new idx(4), new tq60(eraVar2), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, ddj.b, x340Var2, 0, 48, 2040);
                x340Var.r(false);
            }
            cvx cvxVar7 = cbx.b((b0k) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02c0: IGET (r3v16 'cvxVar7' p.cvx) = 
                  (wrap p.wux:0x02bc: INVOKE (wrap p.b0k:?: CAST (p.b0k) (r13v8 ?? I:??[OBJECT, ARRAY])) STATIC call: p.cbx.b(p.b0k):p.wux A[WRAPPED] (LINE:701))
                 A[DECLARE_VAR] (LINE:705) p.wux.b p.cvx in method: p.hho0.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes11.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v8 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 841
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.hho0.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:38:0x02cc  */
        /* JADX WARN: Code duplicated, block: B:40:0x02e0  */
        /* JADX WARN: Code duplicated, block: B:42:0x030b  */
        /* JADX WARN: Code duplicated, block: B:45:0x0329  */
        /* JADX WARN: Code duplicated, block: B:49:0x0396  */
        /* JADX WARN: Code duplicated, block: B:52:0x039b  */
        /* JADX WARN: Code duplicated, block: B:53:0x039d  */
        /* JADX WARN: Code duplicated, block: B:57:0x03b8  */
        /* JADX WARN: Code duplicated, block: B:58:0x03ce  */
        /* JADX WARN: Code duplicated, block: B:61:0x0421  */
        /* JADX WARN: Code duplicated, block: B:63:0x0425  */
        private final Object f(Object obj, Object obj2, Object obj3) {
            m4c m4cVar;
            boolean z;
            m4c m4cVar2;
            dzo1 dzo1Var;
            boolean zI;
            Object objT;
            iu30 iu30Var;
            m4c m4cVar3;
            dzo1 dzo1Var2;
            k811 k811Var;
            boolean z2;
            k811 k811Var2;
            iu30 iu30Var2;
            boolean zI2;
            Object objT2;
            m4c m4cVar4;
            boolean z3;
            hax haxVar;
            boolean zI3;
            Object objT3;
            Object objT4;
            x340 x340Var = (b0k) obj2;
            ((Number) obj3).intValue();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarW = uyn1.w(u291.d(nim0Var, 1.0f), (vzq0) obj);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarH = l6o1.H(uyn1.z(16.0f, 0.0f, 2, qim0VarW), l6o1.C(0, 0, 1, x340Var), false, 14);
            era eraVar = een.Q0;
            vb21 vb21Var = (vb21) this.b;
            String str = vb21Var.b;
            k811 k811Var3 = (k811) this.c;
            iu30 iu30Var3 = (iu30) this.d;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            x340 x340Var2 = x340Var;
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
            hzj.A.getClass();
            x340 x340Var3 = x340Var;
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            boolean z4 = x340Var3.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
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
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.c));
            String str2 = vb21Var.c;
            boolean z5 = vb21Var.e;
            if (str2 == null) {
                str2 = "";
            }
            Uri uri = Uri.parse(str2);
            String str3 = vb21Var.a;
            Integer num = vb21Var.d;
            bmq0.a(uri, (qim0) null, hcx.e, str3, str, num != null ? z4p1.e(num.intValue() | (-16777216)) : u7h.k, 0L, false, x340Var, 384, 194);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            uwo1.e(str, (qim0) null, cbx.d(x340Var).d, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String strO0 = cwl1.o0(x340Var, 2131961184);
            lee1 lee1Var = cbx.d(x340Var).e;
            Object objT5 = x340Var3.T();
            m4c m4cVar5 = fkj0.X;
            if (objT5 == m4cVar5) {
                objT5 = ma21.t;
                x340Var3.s0(objT5);
            }
            uwo1.e(strO0, s161.b(nim0Var, false, (iu30) objT5), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            String strN0 = cwl1.n0(2131961186, new Object[]{"[REMOVE_TEEN_DISPLAY_NAME_PLACEHOLDER]"}, x340Var);
            zma1 zma1Var = cbx.d(x340Var).k.a;
            boolean zG = x340Var3.g(strN0) | x340Var3.g(str) | x340Var3.g(zma1Var);
            Object objT6 = x340Var3.T();
            if (!zG) {
                m4cVar = m4cVar5;
                if (objT6 != m4cVar) {
                    z = false;
                }
                m4cVar2 = m4cVar;
                uwo1.f((af5) objT6, (qim0) null, cbx.d(x340Var).j, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4090);
                cvx cvxVar4 = cbx.b(x340Var).b;
                uwo1.e(eqq.n(nim0Var, 16.0f, x340Var, 2131961185, x340Var), (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
                cvx cvxVar5 = cbx.b(x340Var).b;
                uwo1.e(eqq.n(nim0Var, 16.0f, x340Var, 2131961180, x340Var), (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
                cvx cvxVar6 = cbx.b(x340Var).b;
                uwo1.e(eqq.n(nim0Var, 16.0f, x340Var, 2131961189, x340Var), (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
                x340Var3.r(true);
                op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.d));
                dzo1Var = z50.c;
                if (z5) {
                    x340Var3.i0(563064078);
                    qim0 qim0VarN = anm1.N("remove_teen_progress", nim0Var);
                    objT4 = x340Var3.T();
                    if (objT4 == m4cVar2) {
                        objT4 = ma21.X;
                        x340Var3.s0(objT4);
                    }
                    xto1.e(s161.a(qim0VarN, (iu30) objT4), 3, 0L, 0L, x340Var, 48, 12);
                    x340Var3.r(false);
                    iu30Var = iu30Var3;
                    z2 = false;
                    dzo1Var2 = dzo1Var;
                    m4cVar3 = m4cVar2;
                    k811Var = k811Var3;
                } else {
                    x340Var3.i0(563254108);
                    zI = x340Var3.i(k811Var3) | x340Var3.g(iu30Var3);
                    objT = x340Var3.T();
                    if (zI || objT == m4cVar2) {
                        objT = new zb21(k811Var3, iu30Var3, (byte) 0);
                        x340Var3.s0(objT);
                    }
                    iu30Var = iu30Var3;
                    m4cVar3 = m4cVar2;
                    dzo1Var2 = dzo1Var;
                    k811Var = k811Var3;
                    z2 = false;
                    foo1.c(new gbx(dzo1Var, (Function0) objT), new idx(4), (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, fdj.c, x340Var, 0, 48, 2044);
                    x340Var3.r(false);
                }
                cvx cvxVar7 = cbx.b((b0k) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0376: IGET (r3v36 'cvxVar7' p.cvx) = 
                      (wrap p.wux:0x0372: INVOKE (wrap p.b0k:?: CAST (p.b0k) (r13v10 ?? I:??[OBJECT, ARRAY])) STATIC call: p.cbx.b(p.b0k):p.wux A[WRAPPED] (LINE:883))
                     A[DECLARE_VAR] (LINE:887) p.wux.b p.cvx in method: p.hho0.f(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes11.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v10 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1097
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.hho0.f(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Code duplicated, block: B:144:0x0403  */
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                url1 prl1Var;
                String strS;
                lee1 lee1Var;
                String str;
                byte b = this.a;
                h2c h2cVar = h2c.a;
                gex0 gex0Var = h36.a;
                n4k n4kVar = hmb0.t1;
                nim0 nim0Var = nim0.a;
                rih1 rih1Var = rih1.a;
                Object obj4 = this.d;
                Object obj5 = this.b;
                Object obj6 = this.c;
                switch (b) {
                    case 0:
                        ((Number) obj3).intValue();
                        iho1.i((xho0) obj5, (Function0) obj6, (Function0) obj4, (b0k) obj2, 0);
                        return rih1Var;
                    case 1:
                        hsl1 hsl1Var = (hsl1) obj2;
                        nk80 nk80VarI = hsl1Var.a.i(130);
                        FrameLayout frameLayout = (FrameLayout) obj5;
                        View view = (View) obj6;
                        View view2 = (View) obj4;
                        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        if (marginLayoutParams != null) {
                            int i = marginLayoutParams.leftMargin;
                            int i2 = nk80VarI.a;
                            int i3 = nk80VarI.c;
                            if (i == i2 && marginLayoutParams.rightMargin == i3) {
                                marginLayoutParams = null;
                            }
                            if (marginLayoutParams != null) {
                                marginLayoutParams.leftMargin = i2;
                                marginLayoutParams.rightMargin = i3;
                                frameLayout.setLayoutParams(marginLayoutParams);
                            }
                        }
                        if (view != null) {
                            int i4 = nk80VarI.a;
                            int i5 = PageActivity.y1;
                            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                            FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams2 : null;
                            if (layoutParams3 != null) {
                                if (layoutParams3.width == i4) {
                                    layoutParams3 = null;
                                }
                                if (layoutParams3 != null) {
                                    layoutParams3.width = i4;
                                    view.setLayoutParams(layoutParams3);
                                }
                            }
                        }
                        if (view2 != null) {
                            int i6 = nk80VarI.c;
                            int i7 = PageActivity.y1;
                            ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                            FrameLayout.LayoutParams layoutParams5 = layoutParams4 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams4 : null;
                            if (layoutParams5 != null) {
                                FrameLayout.LayoutParams layoutParams6 = layoutParams5.width != i6 ? layoutParams5 : null;
                                if (layoutParams6 != null) {
                                    layoutParams6.width = i6;
                                    view2.setLayoutParams(layoutParams6);
                                }
                            }
                        }
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 36) {
                            prl1Var = new url1(hsl1Var);
                        } else if (i8 >= 35) {
                            prl1Var = new trl1(hsl1Var);
                        } else if (i8 >= 34) {
                            prl1Var = new srl1(hsl1Var);
                        } else if (i8 >= 31) {
                            prl1Var = new rrl1(hsl1Var);
                        } else if (i8 >= 30) {
                            prl1Var = new qrl1(hsl1Var);
                        } else {
                            prl1Var = i8 >= 29 ? new prl1(hsl1Var) : new nrl1(hsl1Var);
                        }
                        prl1Var.d(2, nk80.c(0, nk80VarI.b, 0, nk80VarI.d));
                        return prl1Var.b();
                    case 2:
                        vzq0 vzq0Var = (vzq0) obj;
                        b0k b0kVar = (b0k) obj2;
                        ((Number) obj3).intValue();
                        uwr uwrVar = cbx.a;
                        j1e1.f((qim0) null, ((xex) ((gmt) zex.a.c).b).z, b0kVar, 0, 1);
                        ujo1.a(uyn1.B(nim0.a, 0.0f, vzq0Var.d(), 0.0f, 0.0f, 13), l6o1.C(0, 0, 1, b0kVar), apo.r(-368514147, new b2o0(vzq0Var, (str0) obj5, (iu30) obj6, (lik1) obj4, (byte) 11), b0kVar), b0kVar, 384, 0);
                        return rih1Var;
                    case 3:
                        x340 x340Var = (b0k) obj2;
                        ((Number) obj3).intValue();
                        qim0 qim0VarP = vby0.p(nim0Var, (lz20) obj5);
                        smp0 smp0Var = (smp0) obj6;
                        ovs0 ovs0Var = (ovs0) obj4;
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        x340 x340Var2 = x340Var;
                        int iHashCode = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM = x340Var2.m();
                        qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
                        hzj.A.getClass();
                        x340 x340Var3 = x340Var;
                        if (x340Var3.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var3.m0();
                        if (x340Var3.S) {
                            x340Var3.l(n4kVar);
                        } else {
                            x340Var3.v0();
                        }
                        nko1.H(gfh0VarC, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        String str2 = ovs0Var.f;
                        if (str2 == null) {
                            str2 = "";
                        }
                        otw.c(smp0Var, new kxs0(str2), (qim0) null, (ipb1) null, x340Var, 0, 12);
                        x340Var3.r(true);
                        return rih1Var;
                    case 4:
                        yxo1.h((k8t0) obj5, (iu30) obj6, (xfx) obj4, (vzq0) obj, (b0k) obj2, (((Number) obj3).intValue() << 12) & 57344);
                        return rih1Var;
                    case 5:
                        ((Number) obj3).intValue();
                        ((hou0) obj5).e((String) obj6, (x4i1) obj4, (qim0) null, (b0k) obj2, 0);
                        return rih1Var;
                    case 6:
                        ((Number) obj3).intValue();
                        PlaylistRequestDecorationPolicy playlistRequestDecorationPolicy = hou0.g;
                        ((hou0) obj5).h((aou0) obj6, (iu30) obj4, (b0k) obj2, 0);
                        return rih1Var;
                    case 7:
                        ((Number) obj3).intValue();
                        vru0 vru0Var = (vru0) obj4;
                        iu30 iu30Var = (iu30) obj6;
                        boolean z = ((dsu0) obj5).d;
                        x340 x340Var4 = (b0k) obj2;
                        Object objT = x340Var4.T();
                        m4c m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = lqu0.S0;
                            x340Var4.s0(objT);
                        }
                        qim0 qim0VarA = s161.a(nim0Var, (iu30) objT);
                        boolean zG = x340Var4.g(iu30Var) | x340Var4.i(vru0Var);
                        Object objT2 = x340Var4.T();
                        if (zG || objT2 == m4cVar) {
                            objT2 = new aft0(iu30Var, vru0Var, (byte) 24);
                            x340Var4.s0(objT2);
                        }
                        aex.b(z, (iu30) objT2, qim0VarA, (String) null, 0, (idn0) null, (ga80) null, x340Var4, 0, 120);
                        return rih1Var;
                    case 8:
                        x340 x340Var5 = (b0k) obj2;
                        ((Number) obj3).intValue();
                        ifx0 ifx0Var = (ifx0) ((ven0) obj5).getValue();
                        if (ifx0Var == null) {
                            x340 x340Var6 = x340Var5;
                            x340Var6.i0(2038563926);
                            x340Var6.r(false);
                        } else {
                            x340 x340Var7 = x340Var5;
                            x340Var7.i0(2038563927);
                            gfx0.b(ifx0Var, (Function0) obj6, (qim0) obj4, x340Var7, 0);
                            x340Var7.r(false);
                        }
                        return rih1Var;
                    case 9:
                        ((Number) obj3).intValue();
                        qlb qlbVar = (qlb) obj6;
                        ven0 ven0Var = (ven0) obj5;
                        x340 x340Var8 = (b0k) obj2;
                        boolean zI = x340Var8.i(ven0Var);
                        Object objT3 = x340Var8.T();
                        if (zI || objT3 == fkj0.X) {
                            objT3 = new vk1(ven0Var, (lnm) null, (byte) 23);
                            x340Var8.s0(objT3);
                        }
                        qxd0.t(rih1Var, x340Var8, (vu30) objT3);
                        jd6 jd6Var = (jd6) qlbVar.f;
                        String str3 = (String) qlbVar.e;
                        String str4 = ((p3y0) obj4).a;
                        if (str4 != null) {
                            Set set = s4b1.f;
                            strS = uic.x(str4).s();
                        } else {
                            strS = null;
                        }
                        i1o1.e(jd6Var, new l3o(str3, 2, u890.j(strS, str3)), qlbVar.b, (qim0) null, (ipb1) null, laj.b, (xu30) null, 0, (xu30) null, x340Var8, 196616, 236);
                        return rih1Var;
                    case 10:
                        ((Number) obj3).intValue();
                        de40 de40Var = (de40) obj5;
                        a6y0 a6y0Var = (a6y0) obj6;
                        iu30 iu30Var2 = (iu30) obj4;
                        x340 x340Var9 = (b0k) obj2;
                        boolean zG2 = x340Var9.g(iu30Var2) | x340Var9.i(a6y0Var);
                        Object objT4 = x340Var9.T();
                        if (zG2 || objT4 == fkj0.X) {
                            objT4 = new g1x0(iu30Var2, a6y0Var, (byte) 18);
                            x340Var9.s0(objT4);
                        }
                        de40Var.e(a6y0Var, (Function0) objT4, x340Var9, 0);
                        return rih1Var;
                    case 11:
                        x340 x340Var10 = (b0k) obj2;
                        ((Number) obj3).intValue();
                        long j = ((i2c) obj).b;
                        Bitmap bitmap = (Bitmap) obj5;
                        if (hjl.i(j) < bitmap.getWidth() || hjl.h(j) < bitmap.getHeight()) {
                            x340 x340Var11 = x340Var10;
                            x340Var11.i0(-1679543961);
                            x340Var11.r(false);
                        } else {
                            x340 x340Var12 = x340Var10;
                            x340Var12.i0(-1679814963);
                            cwl1.g(new yk4(bitmap), (String) obj6, anm1.N("reprise_qr_code_image", u291.d(nim0Var, 1.0f)), ((jzy0) obj4).a, 0, x340Var12, 0, 104);
                            x340Var12.r(false);
                        }
                        return rih1Var;
                    case 12:
                        uwr uwrVar2 = cbx.a;
                        x340 x340Var13 = (b0k) obj2;
                        ((Number) obj3).intValue();
                        p9z0 p9z0Var = (p9z0) obj5;
                        String str5 = (String) obj6;
                        ven0 ven0Var2 = (ven0) obj4;
                        gra graVar = een.d;
                        gfh0 gfh0VarC2 = t1c.c(graVar, false);
                        x340 x340Var14 = x340Var13;
                        int iHashCode2 = Long.hashCode(x340Var14.T);
                        xos0 xos0VarM2 = x340Var14.m();
                        qim0 qim0VarE2 = zr7.E(x340Var13, nim0Var);
                        hzj.A.getClass();
                        x340 x340Var15 = x340Var13;
                        if (x340Var15.a == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var15.m0();
                        if (x340Var15.S) {
                            x340Var15.l(n4kVar);
                        } else {
                            x340Var15.v0();
                        }
                        nko1.H(gfh0VarC2, x340Var13, y580.O0);
                        nko1.H(xos0VarM2, x340Var13, y580.N0);
                        nko1.H(Integer.valueOf(iHashCode2), x340Var13, y580.R0);
                        nko1.F(x340Var13);
                        nko1.H(qim0VarE2, x340Var13, y580.Y);
                        String strE = gvg.e(((Number) ven0Var2.getValue()).intValue(), " (", ")");
                        if (p9z0Var.d) {
                            x340Var15.i0(610668105);
                            lee1Var = cbx.d(x340Var13).p;
                            x340Var15.r(false);
                        } else {
                            x340Var15.i0(610669796);
                            lee1Var = cbx.d(x340Var13).n;
                            x340Var15.r(false);
                        }
                        lee1 lee1Var2 = lee1Var;
                        long j2 = cbx.a(x340Var13).b.c;
                        qim0 qim0VarA2 = h2cVar.a(nim0Var, graVar);
                        boolean zG3 = x340Var15.g(str5);
                        Object objT5 = x340Var15.T();
                        if (zG3 || objT5 == fkj0.X) {
                            objT5 = new q4z0(str5, (byte) 3);
                            x340Var15.s0(objT5);
                        }
                        uwo1.e(strE, s161.b(qim0VarA2, false, (iu30) objT5), lee1Var2, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var13, 0, 0, 2032);
                        x340Var15.r(true);
                        return rih1Var;
                    case 13:
                        int iIntValue = ((Number) obj).intValue();
                        x340 x340Var16 = (b0k) obj2;
                        int iIntValue2 = ((Number) obj3).intValue();
                        kuy kuyVar = (kuy) obj6;
                        List list = (List) obj5;
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= x340Var16.e(iIntValue) ? 4 : 2;
                        }
                        x340 x340Var17 = x340Var16;
                        if (!x340Var17.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            x340Var17.b0();
                        } else if (iIntValue < list.size()) {
                            x340Var17.i0(-1727491241);
                            kuyVar.h((iez0) obj4, (aez0) list.get(iIntValue), x340Var17, 0);
                            x340Var17.r(false);
                        } else {
                            x340Var17.i0(-1727403821);
                            kuyVar.f((xpw) ((ynb0) kuyVar.g).get(), x340Var17, 0);
                            x340Var17.r(false);
                        }
                        return rih1Var;
                    case 14:
                        x340 x340Var18 = (b0k) obj2;
                        ((Number) obj3).intValue();
                        ss50 ss50Var = (ss50) obj6;
                        iu30 iu30Var3 = (iu30) obj4;
                        for (myz0 myz0Var : (c380) obj5) {
                            String str6 = myz0Var.a;
                            x340 x340Var19 = x340Var18;
                            boolean zI2 = x340Var19.i(ss50Var) | x340Var19.g(iu30Var3) | x340Var19.i(myz0Var);
                            Object objT6 = x340Var19.T();
                            if (zI2 || objT6 == fkj0.X) {
                                objT6 = new tyz0(ss50Var, iu30Var3, myz0Var, (byte) 0);
                                x340Var19.s0(objT6);
                            }
                            epo1.h(0, str6, (Function0) objT6, x340Var19, (qim0) null);
                        }
                        return rih1Var;
                    case 15:
                        x340 x340Var20 = (b0k) obj2;
                        ((Number) obj3).intValue();
                        a701 a701Var = (c701) obj5;
                        if (a701Var instanceof a701) {
                            x340 x340Var21 = x340Var20;
                            x340Var21.i0(-1189113024);
                            v601 v601Var = a701Var.a;
                            String str7 = v601Var.a;
                            String str8 = v601Var.c;
                            String str9 = v601Var.d;
                            dbg1 dbg1Var = new dbg1(str7, str8, str9, ago1.u(v601Var.f, v601Var.g, str9, str7, v601Var.e, false), v601Var.f, v601Var.g, false, 1, bbp1.q(v601Var.i));
                            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), 256.0f);
                            e701 e701Var = (e701) obj6;
                            iu30 iu30Var4 = (iu30) obj4;
                            gfh0 gfh0VarC3 = t1c.c(een.d, false);
                            int iHashCode3 = Long.hashCode(x340Var21.T);
                            xos0 xos0VarM3 = x340Var21.m();
                            qim0 qim0VarE3 = zr7.E(x340Var21, qim0VarH);
                            hzj.A.getClass();
                            if (x340Var21.a == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var21.m0();
                            if (x340Var21.S) {
                                x340Var21.l(n4kVar);
                            } else {
                                x340Var21.v0();
                            }
                            nko1.H(gfh0VarC3, x340Var21, y580.O0);
                            nko1.H(xos0VarM3, x340Var21, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode3), x340Var21, y580.R0);
                            nko1.F(x340Var21);
                            nko1.H(qim0VarE3, x340Var21, y580.Y);
                            otw.c(q1o1.u((wpw) e701Var.h, (qim0) null, (FrameLayout.LayoutParams) null, 7), dbg1Var, anm1.N("transcript", h2cVar.b(nim0Var)), (ipb1) null, x340Var21, 0, 8);
                            qim0 qim0VarB = h2cVar.b(nim0Var);
                            boolean zG4 = x340Var21.g(iu30Var4);
                            Object objT7 = x340Var21.T();
                            if (zG4 || objT7 == fkj0.X) {
                                objT7 = new j9z0(iu30Var4, (byte) 18);
                                x340Var21.s0(objT7);
                            }
                            t1c.a(bin.x(qim0VarB, false, (String) null, (pm31) null, (idn0) null, (Function0) objT7, 15), x340Var21, 0);
                            x340Var21.r(true);
                            x340Var21.r(false);
                        } else {
                            x340 x340Var22 = x340Var20;
                            x340Var22.i0(-1187800298);
                            x340Var22.r(false);
                        }
                        return rih1Var;
                    case 16:
                        i2c i2cVar = (i2c) obj;
                        x340 x340Var23 = (b0k) obj2;
                        int iIntValue3 = ((Number) obj3).intValue();
                        ezj ezjVar = (ezj) obj5;
                        if ((iIntValue3 & 6) == 0) {
                            iIntValue3 |= x340Var23.g(i2cVar) ? 4 : 2;
                        }
                        x340 x340Var24 = x340Var23;
                        if (x340Var24.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                            hjl hjlVar = new hjl(i2cVar.b);
                            boolean zI3 = x340Var24.i(ezjVar) | ((iIntValue3 & 14) == 4);
                            Object objT8 = x340Var24.T();
                            if (zI3 || objT8 == fkj0.X) {
                                objT8 = new p2z0(ezjVar, i2cVar, (lnm) null, (byte) 8);
                                x340Var24.s0(objT8);
                            }
                            qxd0.t(hjlVar, x340Var24, (vu30) objT8);
                            mbl1 mbl1Var = (mbl1) obj6;
                            if (mbl1Var == null) {
                                x340Var24.i0(-904757860);
                                x340Var24.r(false);
                            } else {
                                x340Var24.i0(-904757859);
                                Integer num = ((j701) obj4).e;
                                op71.h(mbl1Var, num != null ? new u7h(z4p1.e(num.intValue())) : null, (lee1) null, x340Var24, 48);
                                x340Var24.r(false);
                            }
                        } else {
                            x340Var24.b0();
                        }
                        return rih1Var;
                    case 17:
                        x340 x340Var25 = (b0k) obj2;
                        ((Number) obj3).intValue();
                        if (((br0) obj5) == null || ((dey) obj6) == null) {
                            x340 x340Var26 = x340Var25;
                            x340Var26.i0(-1076212060);
                            rj01 rj01Var = (rj01) obj4;
                            cuo1.v(rj01Var.i, rj01Var.X, x340Var26, 0);
                            x340Var26.r(false);
                        } else {
                            x340 x340Var27 = x340Var25;
                            x340Var27.i0(-1076297341);
                            otw.c((br0) obj5, (dey) obj6, (qim0) null, (ipb1) null, x340Var27, 0, 12);
                            x340Var27.r(false);
                        }
                        return rih1Var;
                    case 18:
                        x340 x340Var28 = (b0k) obj2;
                        int iIntValue4 = ((Number) obj3).intValue();
                        m4c m4cVar2 = fkj0.X;
                        ney0 ney0Var = (ney0) obj5;
                        iu30 iu30Var5 = (iu30) obj4;
                        x340 x340Var29 = x340Var28;
                        if (x340Var29.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                            gm50 gm50Var = ney0Var.i;
                            boolean z2 = ney0Var.e;
                            String str10 = ney0Var.c;
                            if (str10 == null) {
                                str = ney0Var.b;
                            } else {
                                str = str10.length() > 0 ? str10 : null;
                                if (str == null) {
                                    str = ney0Var.b;
                                }
                            }
                            String str11 = str;
                            ycm ycmVar = (ycm) obj6;
                            String str12 = ney0Var.k;
                            String str13 = nik1.x0.a;
                            boolean zG5 = x340Var29.g(iu30Var5);
                            Object objT9 = x340Var29.T();
                            if (zG5 || objT9 == m4cVar2) {
                                objT9 = new fr01(iu30Var5, (byte) 4);
                                x340Var29.s0(objT9);
                            }
                            Function0 function0 = (Function0) objT9;
                            boolean zG6 = x340Var29.g(iu30Var5);
                            Object objT10 = x340Var29.T();
                            if (zG6 || objT10 == m4cVar2) {
                                objT10 = new fr01(iu30Var5, (byte) 5);
                                x340Var29.s0(objT10);
                            }
                            kyo1.l(gm50Var, z2, str11, ycmVar, str12, str13, function0, (Function0) objT10, x340Var29, 0);
                        } else {
                            x340Var29.b0();
                        }
                        return rih1Var;
                    case 19:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        x340 x340Var30 = (b0k) obj2;
                        int iIntValue5 = ((Number) obj3).intValue();
                        kt01 kt01Var = (kt01) obj6;
                        vyq0 vyq0Var = kt01Var.g;
                        agc0 agc0Var = kt01Var.f;
                        m4c m4cVar3 = fkj0.X;
                        vv01 vv01Var = (zv01) obj5;
                        iu30 iu30Var6 = (iu30) obj4;
                        if ((iIntValue5 & 6) == 0) {
                            iIntValue5 |= x340Var30.h(zBooleanValue) ? 4 : 2;
                        }
                        x340 x340Var31 = x340Var30;
                        if (!x340Var31.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                            x340Var31.b0();
                        } else if (zBooleanValue && (vv01Var instanceof vv01)) {
                            x340Var31.i0(1001613139);
                            boolean z3 = kt01Var.N0;
                            idd1 idd1Var = kt01Var.O0;
                            if (z3) {
                                x340Var31.i0(1001627089);
                                vv01 vv01Var2 = vv01Var;
                                gw70 gw70Var = kt01Var.Y;
                                i3h i3hVar = kt01Var.Z;
                                boolean zG7 = x340Var31.g(iu30Var6);
                                Object objT11 = x340Var31.T();
                                if (zG7 || objT11 == m4cVar3) {
                                    objT11 = new fr01(iu30Var6, (byte) 6);
                                    x340Var31.s0(objT11);
                                }
                                Function0 function1 = (Function0) objT11;
                                boolean zG8 = x340Var31.g(iu30Var6);
                                Object objT12 = x340Var31.T();
                                if (zG8 || objT12 == m4cVar3) {
                                    objT12 = new fr01(iu30Var6, (byte) 7);
                                    x340Var31.s0(objT12);
                                }
                                byo1.i(vv01Var2, agc0Var, vyq0Var, gw70Var, i3hVar, idd1Var, function1, (Function0) objT12, x340Var31, 0);
                                x340Var31.r(false);
                            } else {
                                x340Var31.i0(1002154895);
                                vv01 vv01Var3 = vv01Var;
                                fgx fgxVar = kt01Var.h;
                                boolean zG9 = x340Var31.g(iu30Var6);
                                Object objT13 = x340Var31.T();
                                if (zG9 || objT13 == m4cVar3) {
                                    objT13 = new fr01(iu30Var6, (byte) 8);
                                    x340Var31.s0(objT13);
                                }
                                Function0 function2 = (Function0) objT13;
                                boolean zG10 = x340Var31.g(iu30Var6);
                                Object objT14 = x340Var31.T();
                                if (zG10 || objT14 == m4cVar3) {
                                    objT14 = new fr01(iu30Var6, (byte) 9);
                                    x340Var31.s0(objT14);
                                }
                                byo1.j(vv01Var3, agc0Var, vyq0Var, fgxVar, idd1Var, function2, (Function0) objT14, x340Var31, 0);
                                x340Var31.r(false);
                            }
                            x340Var31.r(false);
                        } else {
                            x340Var31.i0(1002621197);
                            lq01.a(vv01Var.i(), vv01Var.h(), (qim0) null, x340Var31, 0);
                            x340Var31.r(false);
                        }
                        return rih1Var;
                    case 20:
                        x340 x340Var32 = (b0k) obj2;
                        int iIntValue6 = ((Number) obj3).intValue();
                        iu30 iu30Var7 = (iu30) obj4;
                        kob1 kob1Var = (kob1) obj5;
                        x340 x340Var33 = x340Var32;
                        if (x340Var33.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                            hxz0 hxz0Var = kob1Var.t;
                            boolean z4 = kob1Var.q;
                            if (hxz0Var == null || z4) {
                                hxz0Var = null;
                            }
                            j2i j2iVarR = apo.r(-438839813, new ffx0(kob1Var, (ycm) obj6, iu30Var7, (byte) 21), x340Var33);
                            if (hxz0Var != null) {
                                x340Var33.i0(-51243339);
                                jw31 jw31VarA = ew31.a(gex0Var, een.N0, x340Var33, 48);
                                int iHashCode4 = Long.hashCode(x340Var33.T);
                                xos0 xos0VarM4 = x340Var33.m();
                                qim0 qim0VarE4 = zr7.E(x340Var33, nim0Var);
                                hzj.A.getClass();
                                if (x340Var33.a == null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var33.m0();
                                if (x340Var33.S) {
                                    x340Var33.l(n4kVar);
                                } else {
                                    x340Var33.v0();
                                }
                                nko1.H(jw31VarA, x340Var33, y580.O0);
                                nko1.H(xos0VarM4, x340Var33, y580.N0);
                                nko1.H(Integer.valueOf(iHashCode4), x340Var33, y580.R0);
                                nko1.F(x340Var33);
                                nko1.H(qim0VarE4, x340Var33, y580.Y);
                                c380 c380Var = hxz0Var.a;
                                int i9 = hxz0Var.b;
                                boolean zG11 = x340Var33.g(iu30Var7);
                                Object objT15 = x340Var33.T();
                                if (zG11 || objT15 == fkj0.X) {
                                    objT15 = new fr01(iu30Var7, (byte) 13);
                                    x340Var33.s0(objT15);
                                }
                                yoo1.m(c380Var, i9, (Function0) objT15, (qim0) null, x340Var33, 0);
                                ktd.s(j2iVarR, x340Var33, 6, true, false);
                            } else if (z4) {
                                x340Var33.i0(-50827629);
                                x340Var33.r(false);
                            } else {
                                x340Var33.i0(-50871835);
                                j2iVarR.invoke(x340Var33, 6);
                                x340Var33.r(false);
                            }
                        } else {
                            x340Var33.b0();
                        }
                        return rih1Var;
                    case 21:
                        ((Number) obj3).intValue();
                        ky01 ky01Var = (ky01) obj5;
                        gy01 gy01Var = (gy01) obj6;
                        iu30 iu30Var8 = (iu30) obj4;
                        x340 x340Var34 = (b0k) obj2;
                        boolean zG12 = x340Var34.g(iu30Var8);
                        Object objT16 = x340Var34.T();
                        if (zG12 || objT16 == fkj0.X) {
                            objT16 = new fr01(iu30Var8, (byte) 18);
                            x340Var34.s0(objT16);
                        }
                        ky01Var.g(gy01Var, (Function0) objT16, x340Var34, 0);
                        return rih1Var;
                    case 22:
                        ((Number) obj3).intValue();
                        d511 d511Var = (d511) obj5;
                        e511 e511Var = d511Var.c;
                        String str14 = ((b511) obj6).a;
                        x340 x340Var35 = (b0k) obj2;
                        iu30 iu30Var9 = (iu30) obj4;
                        boolean zI4 = x340Var35.i(d511Var) | x340Var35.g(iu30Var9);
                        Object objT17 = x340Var35.T();
                        if (zI4 || objT17 == fkj0.X) {
                            objT17 = new nt01(d511Var, iu30Var9, (byte) 4);
                            x340Var35.s0(objT17);
                        }
                        e511Var.a(384, str14, x340Var35, (iu30) objT17);
                        return rih1Var;
                    case 23:
                        return a(obj, obj2, obj3);
                    case 24:
                        ((Number) obj3).intValue();
                        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                        lz20 lz20Var = (lz20) obj4;
                        i3u i3uVar = ud11.a;
                        vd11.a((y7e1) obj5, (Function0) obj6, f8d1.b(qim0VarF, lz20Var, new ae4(lz20Var, (byte) 6)), vby0.p(nim0Var, lz20Var), (b0k) obj2, 0);
                        return rih1Var;
                    case 25:
                        return d(obj, obj2, obj3);
                    case 26:
                        x340 x340Var36 = (b0k) obj2;
                        ((Number) obj3).intValue();
                        a221 a221Var = (a221) obj6;
                        px31 px31Var = (px31) obj5;
                        if (u890.j(px31Var, mx31.a) || u890.j(px31Var, kx31.a)) {
                            x340 x340Var37 = x340Var36;
                            x340Var37.i0(-1883165245);
                            a221Var.g(x340Var37, 0);
                            x340Var37.r(false);
                        } else {
                            x340 x340Var38 = x340Var36;
                            x340Var38.i0(-1883163624);
                            a221Var.e((m0u) obj4, x340Var38, 0);
                            x340Var38.r(false);
                        }
                        return rih1Var;
                    case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                        return e(obj, obj2, obj3);
                    case 28:
                        return f(obj, obj2, obj3);
                    default:
                        x340 x340Var39 = (b0k) obj2;
                        int iIntValue7 = ((Number) obj3).intValue();
                        ven0 ven0Var3 = (ven0) obj6;
                        fu31 fu31Var = (fu31) obj5;
                        x340 x340Var40 = x340Var39;
                        if (x340Var40.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                            qim0 qim0VarH2 = pqo.h(u291.f(nim0Var, 1.0f), !fu31Var.b.g);
                            boolean zG13 = x340Var40.g(ven0Var3);
                            Object objT18 = x340Var40.T();
                            if (zG13 || objT18 == fkj0.X) {
                                objT18 = new r9y0(ven0Var3, (byte) 11);
                                x340Var40.s0(objT18);
                            }
                            qim0 qim0VarU = lrn1.u(qim0VarH2, (iu30) objT18);
                            ru31 ru31Var = (ru31) obj4;
                            jw31 jw31VarA2 = ew31.a(gex0Var, een.Z, x340Var40, 0);
                            int iHashCode5 = Long.hashCode(x340Var40.T);
                            xos0 xos0VarM5 = x340Var40.m();
                            qim0 qim0VarE5 = zr7.E(x340Var40, qim0VarU);
                            hzj.A.getClass();
                            if (x340Var40.a == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var40.m0();
                            if (x340Var40.S) {
                                x340Var40.l(n4kVar);
                            } else {
                                x340Var40.v0();
                            }
                            nko1.H(jw31VarA2, x340Var40, y580.O0);
                            nko1.H(xos0VarM5, x340Var40, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode5), x340Var40, y580.R0);
                            nko1.F(x340Var40);
                            nko1.H(qim0VarE5, x340Var40, y580.Y);
                            ru31Var.g(x340Var40, 0);
                            ru31Var.j(fu31Var, x340Var40, 0);
                            x340Var40.r(true);
                        } else {
                            x340Var40.b0();
                        }
                        return rih1Var;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ hho0(Object obj, Object obj2, Object obj3, byte b) {
                super(3);
                this.a = b;
                this.b = obj;
                this.c = obj2;
                this.d = obj3;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public hho0(k8t0 k8t0Var, iu30 iu30Var, xfx xfxVar) {
                super(3);
                this.a = (byte) 4;
                this.b = k8t0Var;
                this.c = iu30Var;
                this.d = xfxVar;
            }
        }
