package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class e0e0 {
    public static final float a = (48.0f + 4.0f) + 4.0f;

    public static final void a(rwd0 rwd0Var, lb50 lb50Var, yqg yqgVar, iu30 iu30Var, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, j2i j2iVar3, b0k b0kVar, int i) {
        int i2;
        j2i j2iVar4;
        lb50 lb50Var2;
        x340 x340Var;
        qim0 qim0Var2;
        wx60 wx60Var;
        g0e0 g0e0Var;
        String str;
        p0e0 p0e0Var;
        k0e0 h0e0Var;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        Object obj = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1736706187);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(rwd0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(lb50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(yqgVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(j2iVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            j2iVar4 = j2iVar2;
            i2 |= x340Var2.i(j2iVar4) ? 131072 : 65536;
        } else {
            j2iVar4 = j2iVar2;
        }
        int i5 = i2 | 1572864;
        if ((i & 12582912) == 0) {
            i5 |= x340Var2.i(j2iVar3) ? 8388608 : 4194304;
        }
        if (x340Var2.Y(i5 & 1, (i5 & 4793491) != 4793490)) {
            boolean zG = x340Var2.g(rwd0Var);
            Object objT = x340Var2.T();
            byte b = 1;
            if (zG || objT == obj) {
                zzd0 zzd0Var = rwd0Var.a;
                tle1 tle1Var = zzd0Var.k;
                String str2 = zzd0Var.c;
                pwd0 pwd0Var = zzd0Var.b;
                xzd0 xzd0Var = zzd0Var.a;
                String str3 = xzd0Var.c;
                String str4 = xzd0Var.a;
                String str5 = xzd0Var.b;
                boolean z4 = zzd0Var.h;
                l0e0 l0e0Var = new l0e0(str4, str5, z4);
                ArrayList arrayList = xzd0Var.d;
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList == null) {
                    wx60Var = null;
                } else {
                    yzd0 yzd0Var = (yzd0) o7h.q0(arrayList);
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ArrayList arrayList3 = arrayList;
                        yzd0 yzd0Var2 = (yzd0) it.next();
                        arrayList2.add(new vx60(yzd0Var2.b, yzd0Var2.a));
                        it = it;
                        arrayList = arrayList3;
                    }
                    ArrayList arrayList4 = arrayList;
                    String str6 = yzd0Var.a;
                    boolean z5 = yzd0Var.d;
                    int size = arrayList4.size() - 1;
                    wx60Var = new wx60(arrayList2, str6, z5, size < 0 ? 0 : size, yzd0Var.c);
                }
                vkf vkfVar = pwd0Var.d;
                if (zzd0Var.f && vkfVar != null) {
                    g0e0Var = new g0e0(vkfVar.a, str2, vkfVar.d, vkfVar.b, vkfVar.c);
                } else {
                    g0e0Var = null;
                }
                boolean z6 = zzd0Var.n;
                String str7 = zzd0Var.o;
                boolean z7 = !z4;
                g0e0 g0e0Var2 = g0e0Var;
                long j = tle1Var.b;
                if (!z6 || ihc1.y0(str7)) {
                    str = str3;
                    p0e0Var = null;
                } else {
                    str = str3;
                    p0e0Var = new p0e0(j, str7, str3, z7);
                }
                String str8 = pwd0Var.a;
                k3s0 k3s0Var = pwd0Var.b;
                boolean z8 = zzd0Var.g;
                boolean z9 = zzd0Var.e;
                boolean z10 = zzd0Var.l;
                boolean z11 = k3s0Var instanceof j3s0;
                o0e0 o0e0Var = m0e0.a;
                if (z11) {
                    j3s0 j3s0Var = (j3s0) k3s0Var;
                    h0e0Var = new j0e0(str, j3s0Var.b, str2, j3s0Var.e, z8 && z9 ? new n0e0((String) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01e0: CONSTRUCTOR (r26v6 'h0e0Var' p.k0e0) = 
                          (r24v4 'str' java.lang.String)
                          (wrap java.lang.String:0x01b7: IGET (r4v13 'j3s0Var' p.j3s0) A[WRAPPED] (LINE:440) p.j3s0.b java.lang.String)
                          (r3v3 'str2' java.lang.String)
                          (wrap int:0x01b9: IGET (r4v13 'j3s0Var' p.j3s0) A[WRAPPED] (LINE:442) p.j3s0.e int)
                          (wrap p.o0e0:?: TERNARY null = ((wrap boolean:?: TERNARY null = (((r5v2 'z8' boolean) != false && (r6v14 'z9' boolean) != false)) ? true : false) != false) ? (wrap ??:0x01cc: CONSTRUCTOR 
                          (wrap java.lang.String:?: CAST (java.lang.String) (r25v0 ?? I:??[OBJECT, ARRAY]))
                          (wrap boolean:0x01c3: NOT (r7v8 'z10' boolean) A[WRAPPED] (LINE:452))
                         A[WRAPPED] (LINE:458) call: p.n0e0.<init>(java.lang.String, boolean):void type: CONSTRUCTOR) : (r23v5 'o0e0Var' p.o0e0))
                         (LINE:478) call: p.j0e0.<init>(java.lang.String, java.lang.String, java.lang.String, int, p.o0e0):void type: CONSTRUCTOR in method: p.e0e0.a(p.rwd0, p.lb50, p.yqg, p.iu30, p.j2i, p.j2i, p.qim0, p.j2i, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes7.dex
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
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
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1129
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.e0e0.a(p.rwd0, p.lb50, p.yqg, p.iu30, p.j2i, p.j2i, p.qim0, p.j2i, p.b0k, int):void");
                }

                public static final void b(int i, String str, String str2, b0k b0kVar, gbx gbxVar, boolean z) {
                    x340 x340Var;
                    long j;
                    x340 x340Var2 = (x340) b0kVar;
                    x340Var2.k0(1900711019);
                    int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.g(str2) ? 256 : 128) | (x340Var2.i(gbxVar) ? 2048 : 1024);
                    if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
                        if (z) {
                            x340Var2.i0(1222196207);
                            uwr uwrVar = cbx.a;
                            j = cbx.a(x340Var2).a.c;
                            x340Var2.r(false);
                        } else {
                            x340Var2.i0(1222196726);
                            x340Var2.r(false);
                            j = u7h.j;
                        }
                        tob1 tob1VarA = w191.a(j, (fe5) null, "topBarBackground", x340Var2, 384, 10);
                        nim0 nim0Var = nim0.a;
                        qim0 qim0VarF = dug.f(u291.f(nim0Var, 1.0f), ((u7h) tob1VarA.getValue()).a, d4o1.a);
                        u85 u85Var = (erl1) x340Var2.k(szf0.b);
                        if (u85Var == null) {
                            x340Var2.i0(-241884180);
                            WeakHashMap weakHashMap = osl1.x;
                            u85Var = lhc.g(x340Var2).g;
                        } else {
                            x340Var2.i0(-241885792);
                        }
                        x340Var2.r(false);
                        qim0 qim0VarH = u291.h(too1.y(qim0VarF, new bgc0(u85Var, 16)), 56.0f);
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM = x340Var2.m();
                        qim0 qim0VarE = zr7.E(x340Var2, qim0VarH);
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
                        ldx ldxVar = ldx.c;
                        gra graVar = een.g;
                        h2c h2cVar = h2c.a;
                        wro1.h(gbxVar, ldxVar, dug.f(u291.r(uyn1.B(h2cVar.a(nim0Var, graVar), 4.0f, 0.0f, 0.0f, 0.0f, 14), 48.0f), z ? u7h.j : u7h.b(u7h.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), er31.a), (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1919096878, new y5d0(str2, (byte) 9), x340Var2), x340Var2, (i2 >> 9) & 14, 6, 1016);
                        fq7.g(z, uyn1.B(h2cVar.a(nim0Var, graVar), a, 0.0f, 16.0f, 0.0f, 10), xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(-1578504499, new z3y(str, (byte) 22), x340Var2), x340Var2, ((i2 >> 3) & 14) | 196608, 16);
                        x340Var = x340Var2;
                        x340Var.r(true);
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new c0e0(str, z, str2, gbxVar, i);
                    }
                }

                public static final void c(List list, j2i j2iVar, b0k b0kVar, int i) {
                    List list2;
                    j2i j2iVar2;
                    byte b;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-243998395);
                    j06 j06Var = x340Var.a;
                    int i2 = i | (x340Var.g(list) ? 4 : 2) | (x340Var.i(j2iVar) ? 32 : 16);
                    if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
                        String strO0 = cwl1.o0(x340Var, 2131957625);
                        uwr uwrVar = cbx.a;
                        lee1 lee1Var = cbx.d(x340Var).e;
                        cvx cvxVar = cbx.b(x340Var).b;
                        b = 0;
                        uwo1.e(strO0, anm1.N("LivestreamPage.UpcomingPartiesSection", uyn1.z(16.0f, 0.0f, 2, nim0Var)), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
                        cvx cvxVar2 = cbx.b(x340Var).b;
                        qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode2 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM2 = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
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
                        list2 = list;
                        j2iVar2 = j2iVar;
                        j2iVar2.J(list2, u291.f(nim0Var, 1.0f), x340Var, Integer.valueOf((i2 & 14) | ((i2 << 3) & 896)));
                        x340Var.r(true);
                        x340Var.r(true);
                    } else {
                        list2 = list;
                        j2iVar2 = j2iVar;
                        b = 0;
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new d0e0(list2, j2iVar2, i, b);
                    }
                }
            }
