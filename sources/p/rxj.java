package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rxj extends hab0 implements vu30 {
    public final /* synthetic */ List N0;
    public final /* synthetic */ String O0;
    public final /* synthetic */ ven0 P0;
    public final /* synthetic */ ven0 Q0;
    public final /* synthetic */ ven0 R0;
    public final /* synthetic */ c380 S0;
    public final /* synthetic */ List X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ tob1 Z;
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ cxc0 d;
    public final /* synthetic */ xtb0 e;
    public final /* synthetic */ vzq0 f;
    public final /* synthetic */ txj g;
    public final /* synthetic */ vu30 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxj(List list, List list2, List list3, cxc0 cxc0Var, xtb0 xtb0Var, vzq0 vzq0Var, txj txjVar, vu30 vu30Var, float f, List list4, List list5, boolean z, ven0 ven0Var, List list6, String str, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, c380 c380Var) {
        super(2);
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = cxc0Var;
        this.e = xtb0Var;
        this.f = vzq0Var;
        this.g = txjVar;
        this.h = vu30Var;
        this.i = f;
        this.t = list4;
        this.X = list5;
        this.Y = z;
        this.Z = ven0Var;
        this.N0 = list6;
        this.O0 = str;
        this.P0 = ven0Var2;
        this.Q0 = ven0Var3;
        this.R0 = ven0Var4;
        this.S0 = c380Var;
    }

    public static final int a(tr80 tr80Var, float f, ven0 ven0Var, drr0 drr0Var, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i = ((rr80) tr80Var).a;
            int i2 = ((rr80) tr80Var).b;
            int i3 = ((qtb0) obj).a;
            if (i <= i3 && i3 <= i2) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += ((qtb0) it.next()).q + ((int) f);
        }
        return (((int) ((Number) ven0Var.getValue()).floatValue()) + i4) - ((int) drr0Var.s());
    }

    /* JADX WARN: Code duplicated, block: B:115:0x052c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0548  */
    /* JADX WARN: Code duplicated, block: B:122:0x057b  */
    /* JADX WARN: Code duplicated, block: B:126:0x05ca  */
    public final Object invoke(Object obj, Object obj2) {
        rih1 rih1Var;
        List list;
        List list2;
        cxc0 cxc0Var;
        w061 w061Var;
        List list3;
        cxc0 cxc0Var2;
        txj txjVar;
        List list4;
        List list5;
        float f;
        List list6;
        List list7;
        txj txjVar2;
        String str;
        List list8;
        m4c m4cVar;
        List list9;
        int i;
        xtb0 xtb0Var;
        ven0 ven0Var;
        txj txjVar3;
        m4c m4cVar2;
        Integer num;
        Object objT;
        ven0 ven0VarG;
        boolean zI;
        Object objT2;
        txj txjVar4;
        boolean zI2;
        Object objT3;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar3 = fkj0.X;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        rih1 rih1Var2 = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var2;
        }
        Object objT4 = x340Var2.T();
        if (objT4 == m4cVar3) {
            objT4 = us71.i(0.0f, x340Var2);
        }
        drr0 drr0Var = (drr0) objT4;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
        Object objT5 = x340Var2.T();
        if (objT5 == m4cVar3) {
            objT5 = new qg6(drr0Var, (byte) 9);
            x340Var2.s0(objT5);
        }
        qim0 qim0VarX = ern1.x(qim0VarD, (iu30) objT5);
        xtb0 xtb0Var2 = this.e;
        i25 i25Var = xtb0Var2.e;
        gfh0 gfh0VarC = t1c.c(een.d, false);
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
        nko1.H(gfh0VarC, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        fq7.g(((Boolean) this.Q0.getValue()).booleanValue(), (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, cei.a, x340Var2, 200064, 18);
        x340 x340Var3 = x340Var2;
        List list10 = this.a;
        if (list10 == null || (list = this.b) == null || (list2 = this.c) == null || (cxc0Var = this.d) == null) {
            rih1Var = rih1Var2;
            x340Var3.i0(-1156835144);
            x340Var3.r(false);
        } else {
            x340Var3.i0(-1178865108);
            ven0 ven0Var2 = this.R0;
            if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                x340Var3.i0(-1179290304);
                boolean zG = x340Var3.g(xtb0Var2);
                Object objT6 = x340Var3.T();
                if (zG || objT6 == m4cVar3) {
                    objT6 = new ywj(xtb0Var2, ven0Var2, (lnm) null, (byte) 0);
                    x340Var3.s0(objT6);
                }
                qxd0.t(rih1Var2, x340Var3, (vu30) objT6);
                x340Var3.r(false);
            } else {
                x340Var3.i0(-1178805960);
                x340Var3.r(false);
            }
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            zzq0 zzq0VarJ = uyn1.j(0.0f, 16.0f, 0.0f, 0.0f, 13);
            u85 u85Var = (erl1) x340Var3.k(szf0.b);
            if (u85Var == null) {
                x340Var3.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(x340Var3).g;
            } else {
                x340Var3.i0(-241885792);
            }
            x340Var3.r(false);
            vk80 vk80VarC = hqq0.C(u85Var, x340Var3);
            hdh hdhVarN = this.f;
            if (hdhVarN == null) {
                hdhVarN = lnn1.n(zzq0VarJ, vk80VarC);
            }
            x340Var3.i0(793274002);
            wat watVar = (wat) x340Var3.k(t4k.h);
            cvx cvxVar2 = cbx.b(x340Var3).b;
            float fX0 = watVar.X0(12.0f);
            x340Var3.r(false);
            boolean zH = x340Var3.h(((Boolean) ven0Var2.getValue()).booleanValue());
            Object objT7 = x340Var3.T();
            if (zH || objT7 == m4cVar3) {
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    objT7 = null;
                } else {
                    n511 n511Var = ckk1.a;
                    objT7 = irn1.l0(0.0f, 400.0f, new qr80(4294967297L), 1);
                }
                x340Var3.s0(objT7);
            } else {
                drr0Var = drr0Var;
                rih1Var2 = rih1Var2;
            }
            n8b1 n8b1Var = (n8b1) objT7;
            Object objT8 = x340Var3.T();
            if (objT8 == m4cVar3) {
                objT8 = new dw91();
                x340Var3.s0(objT8);
            }
            dw91 dw91Var = (dw91) objT8;
            Object objT9 = x340Var3.T();
            if (objT9 == m4cVar3) {
                objT9 = us71.i(Float.MAX_VALUE, x340Var3);
            }
            drr0 drr0Var2 = (drr0) objT9;
            boolean zD = x340Var3.d(fX0);
            Object objT10 = x340Var3.T();
            ven0 ven0Var3 = this.P0;
            if (zD || objT10 == m4cVar3) {
                objT10 = yv91.a(new pxj(fX0, dw91Var, ven0Var3, drr0Var2));
                x340Var3.s0(objT10);
            }
            tob1 tob1Var = (tob1) objT10;
            int size = list.size() + 1;
            tr80 tr80VarQ = yoi1.Q(1, size);
            int size2 = list2.size() + size;
            boolean zIsEmpty = list10.isEmpty();
            txj txjVar5 = this.g;
            txjVar5.c(zIsEmpty, x340Var3, 0);
            r6h1 r6h1Var = txjVar5.i;
            boolean zE = x340Var3.e(list2.size()) | x340Var3.g(r6h1Var);
            Object objT11 = x340Var3.T();
            if (zE || objT11 == m4cVar3) {
                Integer numValueOf = Integer.valueOf(list2.size() + 1);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-playlist-entity-item-list";
                x6h1VarI.f = "7.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.c = numValueOf;
                y6h1 y6h1VarA = x6h1VarI.a();
                p7h.M(new String[]{"playlist/ondemand", "playlist", "playlist/filter", "album"});
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1VarA);
                objT11 = new r6h1(arrayList, r6h1Var.b);
                x340Var3.s0(objT11);
            }
            r6h1 r6h1Var3 = (r6h1) objT11;
            if (txjVar5.c) {
                x340Var3.i0(-1174759034);
                boolean zG2 = x340Var3.g(r6h1Var3);
                Object objT12 = x340Var3.T();
                if (zG2 || objT12 == m4cVar3) {
                    w061 w061Var2 = new w061((opp) ((uap) txjVar5.j.a.c).n.get(), txjVar5.f, r6h1Var3);
                    x340Var3.s0(w061Var2);
                    objT12 = w061Var2;
                }
                w061Var = (w061) objT12;
                x340Var3.r(false);
            } else {
                x340Var3.i0(-1174488714);
                x340Var3.r(false);
                w061Var = null;
            }
            qim0 qim0VarN = anm1.N("list_ux_platform_lazy_column", u291.d(nim0Var, 1.0f));
            Iterator it = this.S0.iterator();
            qim0 qim0VarL = qim0VarN;
            while (it.hasNext()) {
                qim0VarL = bmq0.L(qim0VarL, (d6o0) it.next(), (g6o0) null);
            }
            vu30 vu30Var = this.h;
            boolean zG3 = x340Var3.g(vu30Var) | x340Var3.i(txjVar5) | x340Var3.g(cxc0Var) | x340Var3.g(list);
            float f2 = this.i;
            boolean zD2 = zG3 | x340Var3.d(f2) | x340Var3.d(fX0) | x340Var3.g(list2);
            List list11 = this.t;
            boolean zG4 = zD2 | x340Var3.g(list11);
            List list12 = this.X;
            boolean zG5 = zG4 | x340Var3.g(list12) | x340Var3.g(n8b1Var);
            boolean z = this.Y;
            boolean zH2 = zG5 | x340Var3.h(z);
            tob1 tob1Var2 = this.Z;
            boolean zG6 = zH2 | x340Var3.g(tob1Var2) | x340Var3.i(r6h1Var3) | x340Var3.i(w061Var);
            List list13 = this.N0;
            boolean zG7 = zG6 | x340Var3.g(list13);
            Object objT13 = x340Var3.T();
            if (zG7 || objT13 == m4cVar3) {
                list3 = list11;
                cxc0Var2 = cxc0Var;
                txjVar = txjVar5;
                list4 = list;
                list5 = list2;
                objT13 = new kxj(vu30Var, list4, list5, list3, list12, list13, txjVar, cxc0Var2, f2, fX0, dw91Var, n8b1Var, z, tob1Var2, r6h1Var3, w061Var);
                f = fX0;
                x340Var3.s0(objT13);
            } else {
                list3 = list11;
                f = fX0;
                cxc0Var2 = cxc0Var;
                txjVar = txjVar5;
                list4 = list;
                list5 = list2;
            }
            ujo1.d(qim0VarL, xtb0Var2, hdhVarN, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT13, x340Var3, 0, 504);
            x340Var3 = x340Var3;
            String str2 = this.O0;
            if (str2 != null) {
                x340Var3.i0(-1164343468);
                boolean zG8 = x340Var3.g(tob1Var);
                Object objT14 = x340Var3.T();
                if (zG8 || objT14 == m4cVar3) {
                    objT14 = new bu2(tob1Var, (byte) 3);
                    x340Var3.s0(objT14);
                }
                Function0 function0 = (Function0) objT14;
                Object objT15 = x340Var3.T();
                if (objT15 == m4cVar3) {
                    objT15 = new qg6(drr0Var2, (byte) 10);
                    x340Var3.s0(objT15);
                }
                List list14 = list4;
                list6 = list5;
                list7 = list3;
                txj txjVar6 = txjVar;
                ta5 ta5Var = new ta5(list14, list6, list7, list13, txjVar6, str2, cxc0Var2, (byte) 9);
                list8 = list14;
                str = str2;
                txjVar6.f(function0, (iu30) objT15, apo.r(-949181991, ta5Var, x340Var3), x340Var3, 3462);
                txjVar2 = txjVar6;
                x340Var3 = x340Var3;
                x340Var3.r(false);
            } else {
                list6 = list5;
                list7 = list3;
                txjVar2 = txjVar;
                str = str2;
                list8 = list4;
                x340Var3.i0(-1163294056);
                x340Var3.r(false);
            }
            ven0 ven0VarS = v8r.s(str, x340Var3);
            boolean zG9 = x340Var3.g(list7) | x340Var3.g((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04a6: ARITH (r8v29 'zG9' boolean) = (wrap boolean:0x04a1: ARITH (wrap boolean:0x049c: ARITH (wrap boolean:0x0497: ARITH (wrap boolean:0x0492: ARITH (wrap boolean:0x048d: ARITH (wrap boolean:0x0488: ARITH (wrap boolean:0x0483: ARITH (wrap boolean:0x047e: ARITH (wrap boolean:0x0479: ARITH (wrap boolean:0x0472: ARITH (wrap boolean:0x046a: INVOKE (r11v7 'x340Var3' p.x340), (r15v15 'list7' java.util.List) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:1131)) | (wrap boolean:0x046e: INVOKE (r11v7 'x340Var3' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r34v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:1135)) A[DONT_WRAP, WRAPPED] (LINE:1139)) | (wrap boolean:0x0475: INVOKE (r11v7 'x340Var3' p.x340), (r1v15 'size2' int) VIRTUAL call: p.x340.e(int):boolean A[WRAPPED] (LINE:1142)) A[DONT_WRAP, WRAPPED] (LINE:1146)) | (wrap boolean:0x047a: INVOKE (r11v7 'x340Var3' p.x340), (r14v8 'list6' java.util.List) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:1147)) A[DONT_WRAP, WRAPPED] (LINE:1151)) | (wrap boolean:0x047f: INVOKE (r11v7 'x340Var3' p.x340), (r0v4 'list8' java.util.List) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:1152)) A[DONT_WRAP, WRAPPED] (LINE:1156)) | (wrap boolean:0x0484: INVOKE (r11v7 'x340Var3' p.x340), (r10v3 'xtb0Var2' p.xtb0) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:1157)) A[DONT_WRAP, WRAPPED] (LINE:1161)) | (wrap boolean:0x0489: INVOKE (r11v7 'x340Var3' p.x340), (r12v22 'tr80VarQ' p.tr80) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:1162)) A[DONT_WRAP, WRAPPED] (LINE:1166)) | (wrap boolean:0x048e: INVOKE (r11v7 'x340Var3' p.x340), (r2v17 'f' float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:1167)) A[DONT_WRAP, WRAPPED] (LINE:1171)) | (wrap boolean:0x0493: INVOKE (r11v7 'x340Var3' p.x340), (r12v21 'ven0Var3' p.ven0) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:1172)) A[DONT_WRAP, WRAPPED] (LINE:1176)) | (wrap boolean:0x0498: INVOKE (r11v7 'x340Var3' p.x340), (r13v7 'txjVar2' p.txj) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:1177)) A[DONT_WRAP, WRAPPED] (LINE:1181)) | (wrap boolean:0x049d: INVOKE (r11v7 'x340Var3' p.x340), (r3v3 'ven0VarS' p.ven0) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:1182)) A[DONT_WRAP, WRAPPED] (LINE:1186)) | (wrap boolean:0x04a2: INVOKE (r11v7 'x340Var3' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r35v0 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:1187)) A[DECLARE_VAR] (LINE:1191) in method: p.rxj.invoke(java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes8.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1547
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.rxj.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
