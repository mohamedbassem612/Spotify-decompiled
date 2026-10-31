package p;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x83 {
    public final Context a;
    public final e93 b;
    public final hc3 c;
    public final iac0 d;
    public final tyo e;
    public final uyo f;
    public final r3x0 g;
    public final u961 h;
    public final lc3 i;
    public final zob1 j;
    public final drp0 k;
    public final myq0 l;
    public final waz0 m;
    public final qa2 n;
    public final b93 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cyp f79p;
    public final u44 q;
    public final kly0 r;
    public final kly0 s;
    public final yd3 t;
    public final kly0 u;
    public final boolean v;
    public final vb2 w;
    public final q8n x;
    public final xe01 y;

    public x83(Context context, e93 e93Var, hc3 hc3Var, iac0 iac0Var, tyo tyoVar, uyo uyoVar, r3x0 r3x0Var, u961 u961Var, lc3 lc3Var, zob1 zob1Var, drp0 drp0Var, myq0 myq0Var, waz0 waz0Var, qa2 qa2Var, b93 b93Var, cyp cypVar, u44 u44Var, fwo fwoVar, fwo fwoVar2, yd3 yd3Var, fwo fwoVar3, boolean z, vb2 vb2Var, q8n q8nVar) {
        this.a = context;
        this.b = e93Var;
        this.c = hc3Var;
        this.d = iac0Var;
        this.e = tyoVar;
        this.f = uyoVar;
        this.g = r3x0Var;
        this.h = u961Var;
        this.i = lc3Var;
        this.j = zob1Var;
        this.k = drp0Var;
        this.l = myq0Var;
        this.m = waz0Var;
        this.n = qa2Var;
        this.o = b93Var;
        this.f79p = cypVar;
        this.q = u44Var;
        this.r = fwoVar;
        this.s = fwoVar2;
        this.t = yd3Var;
        this.u = fwoVar3;
        this.v = z;
        this.w = vb2Var;
        this.x = q8nVar;
        this.y = d5p1.t(new x010(zob1Var, waz0Var.e(), new l2(3, (lnm) null, (byte) 3), (byte) 1), cto1.q(iac0Var), new alb1(5000L, Long.MAX_VALUE), new nfm((Map) zob1Var.getValue(), waz0Var.a()));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:53:0x019c  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x0233  */
    /* JADX WARN: Code duplicated, block: B:73:0x0283  */
    /* JADX WARN: Code duplicated, block: B:78:0x0291  */
    /* JADX WARN: Code duplicated, block: B:80:0x0294  */
    /* JADX WARN: Code duplicated, block: B:81:0x0297  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c1  */
    public final mlj0 a(wto wtoVar, zob1 zob1Var, d0r d0rVar) {
        long j;
        vjj0 vjj0Var;
        vjj0 vjj0Var2;
        vjj0 vjj0Var3;
        Long l;
        Boolean bool;
        byte b;
        byte b2;
        vjj0 vjj0Var4;
        boolean zA;
        hoj0 hoj0VarC;
        lql lqlVar;
        byte b3;
        Object obj;
        xe01 xe01VarT;
        vjj0 vjj0Var5;
        goj0 goj0VarA;
        bql bqlVar;
        long j2;
        Long lValueOf;
        boolean zR;
        Long lValueOf2;
        goj0 goj0VarA2;
        ioj0 ioj0Var = (ioj0) zob1Var.getValue();
        String str = wtoVar.a;
        hoj0 hoj0VarC2 = ioj0Var.c(zoy0.class, str);
        zoy0 zoy0Var = (hoj0VarC2 == null || (goj0VarA2 = hoj0VarC2.a()) == null) ? null : (zoy0) goj0VarA2.a;
        lc3 lc3Var = this.i;
        boolean z = lc3Var.d;
        yd3 yd3Var = this.t;
        bpb1 bpb1Var = yd3Var.g;
        xe01 xe01Var = yd3Var.h;
        if (yd3Var.l) {
            j = 0;
        } else {
            yd3Var.l = true;
            if (z) {
                zR = true;
                j = 0;
            } else {
                j = 0;
                zR = (zoy0Var == null || zoy0Var.c <= 0) ? false : l4o1.R(zoy0Var);
            }
            bpb1Var.m((Object) null, Boolean.valueOf(zR));
            if (((Boolean) bpb1Var.getValue()).booleanValue()) {
                if (zoy0Var != null) {
                    long j3 = zoy0Var.c;
                    lValueOf2 = Long.valueOf(j3);
                    if (j3 <= j) {
                        lValueOf2 = null;
                    }
                } else {
                    lValueOf2 = null;
                }
                if (lValueOf2 == null) {
                    yd3Var.a();
                }
            }
        }
        boolean zBooleanValue = ((Boolean) bpb1Var.getValue()).booleanValue();
        String str2 = lc3Var.c;
        tp11 tp11Var = str2 != null ? new tp11(str2) : rp11.a;
        xj20 xj20Var = xj20.e;
        String str3 = wtoVar.f.c;
        hc3 hc3Var = this.c;
        Function0 hhVar = ((abm) hc3Var.L0.get()).a() ? new hh(zob1Var, this, wtoVar, (byte) 11) : null;
        flj0 flj0Var = new flj0(new clj0(3), 1);
        ptk ptkVarC = hc3Var.c();
        boolean z2 = ptkVarC.g;
        boolean z3 = ptkVarC.h;
        boolean z4 = z2 || z3;
        o3r o3rVarO = w3p1.o(new l4r(new xv00(rc11.a.b(f7l1.class)), 2, q83.h, new j4r(q83.t), q83.i), q83.X);
        x010 x010Var = new x010(d3p1.F(d0rVar, o3rVarO, str), this.j, new l2(3, (lnm) null, (byte) 4), (byte) 1);
        iac0 iac0Var = this.d;
        u9c0 u9c0VarQ = cto1.q(iac0Var);
        alb1 alb1Var = new alb1(5000L, Long.MAX_VALUE);
        Boolean bool2 = Boolean.FALSE;
        xe01 xe01VarT2 = d5p1.t(x010Var, u9c0VarQ, alb1Var, bool2);
        e93 e93Var = this.b;
        vjj0 vjj0Var6 = new vjj0(new db(e93Var, d0rVar, o3rVarO, xe01VarT2, (byte) 9));
        vjj0 vjj0Var7 = new vjj0(new cc2(e93Var, this, (byte) 8));
        vjj0 vjj0Var8 = new vjj0(new t6(e93Var, str, this, (byte) 17));
        byte b4 = 15;
        if (!z3) {
            if (z4) {
                vjj0Var2 = null;
            } else {
                vjj0Var = new vjj0(new t6(e93Var, this, rcm.a, b4));
            }
            klj0 klj0Var = new klj0(true, new vjj0(new t6(this, e93Var, d0rVar, (byte) 18)));
            vjj0 vjj0Var9 = new vjj0(new v83(e93Var, (byte) 2));
            if (z4) {
                vjj0Var3 = new vjj0(new t6(e93Var, this, tcm.a, (byte) 15));
            } else {
                vjj0Var3 = null;
            }
            blj0 blj0Var = new blj0(0, vjj0Var6, vjj0Var7, vjj0Var8, vjj0Var2, (vjj0) null, klj0Var, vjj0Var9, vjj0Var3, 33);
            jlj0 jlj0Var = new jlj0(242, (String) null, true, false, this.q.a());
            if (zoy0Var != null) {
                j2 = zoy0Var.c;
                lValueOf = Long.valueOf(j2);
                if (j2 > j) {
                    l = lValueOf;
                } else {
                    l = null;
                }
            } else {
                l = null;
            }
            q01 q01Var = new q01(0, this.s, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 12);
            q01 q01Var2 = new q01(0, this.t, yd3.class, "onCountdownFinished", "onCountdownFinished()V", 0, (byte) 13);
            if (zBooleanValue || l == null) {
                bool = bool2;
                b = 0;
                b2 = 1;
                vjj0Var4 = null;
            } else {
                bool = bool2;
                b = 0;
                b2 = 1;
                vjj0Var4 = new vjj0(new db(q01Var, q01Var2, xe01Var, l, (byte) 10));
            }
            llj0 llj0Var = new llj0(xj20Var, (iqy) null, hhVar, blj0Var, (hlj0) null, vjj0Var4, new vjj0(new v83(e93Var, b)), str3, flj0Var, jlj0Var, (nx50) null, 50390);
            zA = ((abm) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0262: INVOKE (r2v23 'zA' boolean) = 
                  (wrap p.abm:0x0260: CHECK_CAST (p.abm) (wrap java.lang.Object:0x025c: INVOKE (wrap p.kly0:0x025a: IGET (r36v0 ?? I:??[OBJECT, ARRAY]) A[WRAPPED] (LINE:603) p.hc3.L0 p.kly0) INTERFACE call: p.kly0.get():java.lang.Object A[WRAPPED] (LINE:605)))
                 VIRTUAL call: p.abm.a():boolean (LINE:611) in method: p.x83.a(p.wto, p.zob1, p.d0r):p.mlj0, file: /workspace/spotify-analysis/dex-input/classes5.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r36v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 745
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.x83.a(p.wto, p.zob1, p.d0r):p.mlj0");
        }

        public final boolean b() {
            return ((eu4) this.r.get()).k();
        }
    }
