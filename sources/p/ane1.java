package p;

import com.spotify.wrapped.v1.proto.Paragraph;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ane1 extends f311 {
    public final h290 a;
    public final String b;
    public final String c;
    public final Paragraph d;
    public final xgm1 e;
    public final ohm1 f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final sme1 k;
    public final String l;
    public final List m;
    public final ry71 n;
    public final aya1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f0p;

    public ane1(h290 h290Var, String str, String str2, Paragraph paragraph, xgm1 xgm1Var, ohm1 ohm1Var, boolean z, String str3, boolean z2, boolean z3, sme1 sme1Var, String str4, int i, List list, ry71 ry71Var, aya1 aya1Var) {
        this.a = h290Var;
        this.b = str;
        this.c = str2;
        this.d = paragraph;
        this.e = xgm1Var;
        this.f = ohm1Var;
        this.g = z;
        this.h = str3;
        this.i = z2;
        this.j = z3;
        this.k = sme1Var;
        this.l = str4;
        this.m = list;
        this.n = ry71Var;
        this.o = aya1Var;
        this.f0p = h290Var.isEmpty() ? 0 : yoi1.p(i, 0, h290Var.size() - 1);
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        h311 h311VarV;
        tme1 tme1Var;
        boolean z;
        tob1 tob1Var;
        ven0 ven0Var;
        qam1 qam1Var;
        xtb0 xtb0Var;
        qam1 qam1Var2;
        Integer num;
        float f;
        o95 o95Var;
        hdn0 hdn0Var;
        ven0 ven0Var2;
        qam1 qam1Var3;
        x340 x340Var2;
        ane1 ane1Var;
        hdn0 hdn0Var2;
        ven0 ven0Var3;
        qim0 qim0VarB;
        ane1 ane1Var2;
        qam1 qam1Var4;
        x340 x340Var3;
        o95 o95Var2;
        nim0 nim0Var;
        float f2;
        boolean z2;
        Object e971Var;
        o95 o95Var3;
        boolean z3;
        nim0 nim0VarA;
        ane1 ane1Var3 = this;
        Object obj = fkj0.X;
        x340 x340Var4 = (x340) b0kVar;
        x340Var4.k0(-549257039);
        j06 j06Var = x340Var4.a;
        if ((i & 6) == 0) {
            i2 = (x340Var4.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var4.g(rk41Var) : x340Var4.i(rk41Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var4.i(ane1Var3) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var4.Y(i3 & 1, (i3 & 1043) != 1042)) {
            h290 h290Var = ane1Var3.a;
            if (h290Var.isEmpty()) {
                h311VarV = x340Var4.v();
                if (h311VarV == null) {
                    return;
                } else {
                    tme1Var = new tme1(ane1Var3, i2cVar, rk41Var, function0, i, (byte) 0);
                }
            } else {
                Object objT = x340Var4.T();
                if (objT == obj) {
                    objT = bb00.h(ane1Var3.f0p, x340Var4);
                }
                hdn0 hdn0Var3 = (hdn0) objT;
                err0 err0Var = (err0) hdn0Var3;
                SceneTemplate.TimeMachineContent.Card2.YearEntry yearEntry = (SceneTemplate.TimeMachineContent.Card2.YearEntry) h290Var.get(err0Var.s());
                Object objT2 = x340Var4.T();
                if (objT2 == obj) {
                    objT2 = bb00.h(ane1Var3.f0p, x340Var4);
                }
                err0 err0Var2 = (hdn0) objT2;
                err0 err0Var3 = err0Var2;
                SceneTemplate.TimeMachineContent.Card2.YearEntry yearEntry2 = (SceneTemplate.TimeMachineContent.Card2.YearEntry) h290Var.get(err0Var3.s());
                xtb0 xtb0VarA = aub0.a(err0Var.s(), x340Var4, 2);
                Object objT3 = x340Var4.T();
                if (objT3 == obj) {
                    objT3 = v8r.q(Boolean.FALSE);
                    x340Var4.s0(objT3);
                }
                ven0 ven0Var4 = (ven0) objT3;
                int iS = err0Var.s();
                xgm1 xgm1Var = ane1Var3.e;
                ine1.b(iS, xgm1Var, x340Var4, 0);
                Object objT4 = x340Var4.T();
                if (objT4 == obj) {
                    objT4 = c97.b(0.0f);
                    x340Var4.s0(objT4);
                }
                o95 o95Var4 = (o95) objT4;
                Object objT5 = x340Var4.T();
                if (objT5 == obj) {
                    objT5 = v8r.q(new u7h(u7h.j));
                    x340Var4.s0(objT5);
                }
                ven0 ven0Var5 = (ven0) objT5;
                Object objT6 = x340Var4.T();
                if (objT6 == obj) {
                    objT6 = v8r.q(Boolean.TRUE);
                    x340Var4.s0(objT6);
                }
                ven0 ven0Var6 = (ven0) objT6;
                Object objT7 = x340Var4.T();
                if (objT7 == obj) {
                    objT7 = c97.b(1.0f);
                    x340Var4.s0(objT7);
                }
                o95 o95Var5 = (o95) objT7;
                qam1 qam1Var5 = (qam1) x340Var4.k(sam1.a);
                tob1 tob1VarH = rwq.h(xgm1Var.getState(), x340Var4, 0);
                StoryCard storyCard = ((wgm1) tob1VarH.getValue()).a;
                boolean zJ = u890.j(storyCard != null ? storyCard.getId() : null, ane1Var3.h);
                Object objT8 = x340Var4.T();
                if (objT8 == obj) {
                    objT8 = v8r.q((Object) null);
                    x340Var4.s0(objT8);
                }
                ven0 ven0Var7 = (ven0) objT8;
                Integer numValueOf = Integer.valueOf(err0Var.s());
                Boolean boolValueOf = Boolean.valueOf(zJ);
                boolean zH = x340Var4.h(zJ) | x340Var4.i(ane1Var3);
                Object objT9 = x340Var4.T();
                if (zH || objT9 == obj) {
                    objT9 = new ume1(zJ, ane1Var3, hdn0Var3, ven0Var7);
                    x340Var4.s0(objT9);
                }
                qxd0.h(numValueOf, boolValueOf, (iu30) objT9, x340Var4);
                StoryCard storyCard2 = ((wgm1) tob1VarH.getValue()).a;
                String id = storyCard2 != null ? storyCard2.getId() : null;
                Boolean boolValueOf2 = Boolean.valueOf(((wgm1) tob1VarH.getValue()).c.e);
                Boolean boolValueOf3 = Boolean.valueOf(((wgm1) tob1VarH.getValue()).c.a);
                boolean zH2 = x340Var4.h(zJ) | x340Var4.g(tob1VarH) | x340Var4.i(ane1Var3) | x340Var4.i(qam1Var5);
                Object objT10 = x340Var4.T();
                if (zH2 || objT10 == obj) {
                    objT10 = new vme1(zJ, ane1Var3, qam1Var5, tob1VarH, ven0Var6, hdn0Var3, null);
                    z = zJ;
                    ane1Var3 = ane1Var3;
                    tob1Var = tob1VarH;
                    ven0Var = ven0Var6;
                    hdn0Var3 = hdn0Var3;
                    qam1Var = qam1Var5;
                    x340Var4.s0(objT10);
                } else {
                    tob1Var = tob1VarH;
                    ven0Var = ven0Var6;
                    z = zJ;
                    qam1Var = qam1Var5;
                }
                qxd0.r(id, boolValueOf2, boolValueOf3, (vu30) objT10, x340Var4);
                Integer numValueOf2 = Integer.valueOf(err0Var.s());
                boolean zI = x340Var4.i(ane1Var3) | x340Var4.h(z) | x340Var4.g(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0246: ARITH (r0v31 'zI' boolean) = (wrap boolean:0x0241: ARITH (wrap boolean:0x0239: INVOKE (r12v1 'x340Var4' p.x340), (r1v4 'ane1Var3' p.ane1) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:570)) | (wrap boolean:0x023d: INVOKE (r12v1 'x340Var4' p.x340), (r2v12 'z' boolean) VIRTUAL call: p.x340.h(boolean):boolean A[WRAPPED] (LINE:574)) A[DONT_WRAP, WRAPPED] (LINE:578)) | (wrap boolean:0x0242: INVOKE (r12v1 'x340Var4' p.x340), (r29v0 p.xtb0) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:579)) A[DECLARE_VAR] (LINE:583) in method: p.ane1.d(p.i2c, p.rk41, kotlin.jvm.functions.Function0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes5.dex
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v0 p.xtb0
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2215
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.ane1.d(p.i2c, p.rk41, kotlin.jvm.functions.Function0, p.b0k, int):void");
            }

            @Override // p.qj41
            public final qk41 getDuration() {
                return nk41.a;
            }
        }
