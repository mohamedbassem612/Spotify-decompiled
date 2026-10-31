package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l8m1 implements o1i {
    public final g4k a;
    public final py7 b;
    public final xgm1 c;
    public final frl1 d;
    public final h2q0 e;
    public final fal1 f;
    public final m0t g;
    public final g9l1 h;
    public final hcl1 i;
    public final cce j;
    public final yqg k;
    public final q9l1 l;
    public final s84 m;
    public final tjz n;
    public final kly0 o;

    public l8m1(g4k g4kVar, py7 py7Var, xgm1 xgm1Var, frl1 frl1Var, h2q0 h2q0Var, fal1 fal1Var, m0t m0tVar, g9l1 g9l1Var, hcl1 hcl1Var, cce cceVar, yqg yqgVar, q9l1 q9l1Var, s84 s84Var, tjz tjzVar, kly0 kly0Var) {
        this.a = g4kVar;
        this.b = py7Var;
        this.c = xgm1Var;
        this.d = frl1Var;
        this.e = h2q0Var;
        this.f = fal1Var;
        this.g = m0tVar;
        this.h = g9l1Var;
        this.i = hcl1Var;
        this.j = cceVar;
        this.k = yqgVar;
        this.l = q9l1Var;
        this.m = s84Var;
        this.n = tjzVar;
        this.o = kly0Var;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(c8m1 c8m1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        boolean zBooleanValue;
        tob1 tob1Var;
        iac0 iac0Var;
        ven0 ven0Var;
        int i3;
        xhm1 xhm1Var;
        byte b;
        lnm lnmVar;
        c8m1 c8m1Var2;
        tob1 tob1Var2;
        ven0 ven0Var2;
        i3k i3kVar;
        o0i o0iVar2;
        Object hl0Var;
        boolean z;
        lnm lnmVar2;
        Object obj = fkj0.X;
        StoryCard storyCard = c8m1Var.c;
        hp80 hp80Var = o0iVar.e;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-317067678);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(c8m1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(o0iVar) : b0kVar3.i(o0iVar) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        int i4 = i2;
        if (b0kVar3.Y(i4 & 1, (i4 & 1043) != 1042)) {
            ven0 ven0VarH = rwq.h(this.f.d, b0kVar3, 0);
            xgm1 xgm1Var = this.c;
            boolean zEquals = storyCard.equals(((wgm1) rwq.h(xgm1Var.getState(), b0kVar3, 0).getValue()).a);
            boolean zG = b0kVar3.g(storyCard.getId());
            Object objT = b0kVar3.T();
            if (zG || objT == obj) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var3 = (ven0) objT;
            boolean z2 = storyCard.w() && storyCard.r().s() == 6;
            if (z2) {
                b0kVar3.i0(240660935);
                zBooleanValue = ((Boolean) h7w.y(b0kVar3).getValue()).booleanValue();
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1129444370);
                b0kVar3.r(false);
                zBooleanValue = false;
            }
            ven0 ven0VarS = v8r.s(Boolean.valueOf(zBooleanValue), b0kVar3);
            Boolean bool = (Boolean) ven0VarS.getValue();
            bool.getClass();
            boolean zI = b0kVar3.i(ven0VarS) | b0kVar3.h(zEquals) | b0kVar3.i(this);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == obj) {
                objT2 = new gqj1(zEquals, this, ven0VarS, (lnm) null);
                b0kVar3.s0(objT2);
            }
            qxd0.t(bool, b0kVar3, (vu30) objT2);
            boolean z3 = ((bal1) rwq.g(yoi1.g(this.g.d), aal1.a, (o8n) null, b0kVar3, 0, 2).getValue()) instanceof z9l1;
            Object objT3 = b0kVar3.T();
            if (objT3 == obj) {
                objT3 = (tjs0) this.o.get();
                b0kVar3.s0(objT3);
            }
            boolean z4 = !u890.j((tjs0) objT3, tjs0.b);
            Object objT4 = b0kVar3.T();
            if (objT4 == obj) {
                objT4 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT4);
            }
            tob1 tob1Var3 = (ven0) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == obj) {
                objT5 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT5);
            }
            ven0 ven0Var4 = (ven0) objT5;
            iac0 iac0Var2 = (iac0) b0kVar3.k(jfe0.a);
            ven0 ven0VarV = hso1.v(iac0Var2.getLifecycle(), b0kVar3);
            boolean zI2 = b0kVar3.i(tob1Var3) | b0kVar3.i(ven0Var4) | b0kVar3.i(iac0Var2);
            Object objT6 = b0kVar3.T();
            if (zI2 || objT6 == obj) {
                tob1Var = tob1Var3;
                objT6 = new jyi1(iac0Var2, tob1Var, ven0Var4, false, (byte) 18);
                iac0Var = iac0Var2;
                ven0Var = ven0Var4;
                b0kVar3.s0(objT6);
            } else {
                tob1Var = tob1Var3;
                iac0Var = iac0Var2;
                ven0Var = ven0Var4;
            }
            qxd0.i(iac0Var, (iu30) objT6, b0kVar3);
            boolean z5 = !zEquals || z3 || ((Boolean) tob1Var.getValue()).booleanValue();
            boolean zG2 = b0kVar3.g(storyCard.getId()) | b0kVar3.g(hp80Var);
            Object objT7 = b0kVar3.T();
            if (zG2 || objT7 == obj) {
                objT7 = new xhm1(storyCard.getId(), hp80Var);
                b0kVar3.s0(objT7);
            }
            xhm1 xhm1Var2 = (xhm1) objT7;
            if (!((Boolean) ven0Var3.getValue()).booleanValue() || !zEquals || !((w8c0) ven0VarV.getValue()).a(w8c0.d)) {
                xhm1Var2 = null;
            }
            ven0 ven0VarG = rwq.g(this.a.a(storyCard).c, g3k.a, (o8n) null, b0kVar3, 0, 2);
            boolean zI3 = b0kVar3.i(xhm1Var2) | b0kVar3.i(this);
            Object objT8 = b0kVar3.T();
            if (zI3 || objT8 == obj) {
                objT8 = new f2m1(xhm1Var2, this, (byte) 9);
                b0kVar3.s0(objT8);
            }
            ven0 ven0VarS2 = v8r.s(objT8, b0kVar3);
            Object objT9 = b0kVar3.T();
            if (objT9 == obj) {
                objT9 = new ycl1(xgm1Var, new e7m1(ven0VarS2, (byte) 4));
                b0kVar3.s0(objT9);
            }
            ycl1 ycl1Var = (ycl1) objT9;
            ven0 ven0VarH2 = rwq.h(ycl1Var.d, b0kVar3, 0);
            if (((Boolean) ven0VarH2.getValue()).booleanValue() && zEquals) {
                b0kVar3.i0(-1126509440);
                Boolean bool2 = (Boolean) ven0Var3.getValue();
                bool2.getClass();
                boolean zI4 = b0kVar3.i(this);
                Object objT10 = b0kVar3.T();
                if (zI4 || objT10 == obj) {
                    objT10 = new vbc1(this, (lnm) null, (byte) 25);
                    b0kVar3.s0(objT10);
                }
                qxd0.t(bool2, b0kVar3, (vu30) objT10);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1126294176);
                b0kVar3.r(false);
            }
            if (zEquals) {
                b0kVar3.i0(-1126241197);
                boolean zI5 = b0kVar3.i(this) | b0kVar3.i(c8m1Var) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && b0kVar3.i(o0iVar)));
                Object objT11 = b0kVar3.T();
                if (zI5 || objT11 == obj) {
                    objT11 = new hml1(this, c8m1Var, o0iVar, (byte) 4);
                    b0kVar3.s0(objT11);
                }
                qxd0.S((Function0) objT11, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1125552160);
                b0kVar3.r(false);
            }
            Boolean boolValueOf = Boolean.valueOf(zEquals);
            String id = storyCard.getId();
            boolean zH = b0kVar3.h(zEquals) | b0kVar3.i(this) | b0kVar3.i(c8m1Var);
            Object objT12 = b0kVar3.T();
            if (zH || objT12 == obj) {
                objT12 = new h8m1(zEquals, this, c8m1Var, (lnm) null);
                b0kVar3.s0(objT12);
            }
            qxd0.s(boolValueOf, id, (vu30) objT12, b0kVar3);
            Object objT13 = b0kVar3.T();
            if (objT13 == obj) {
                objT13 = yv91.a(new l5m1(ven0VarG, (byte) 1));
                b0kVar3.s0(objT13);
            }
            tob1 tob1Var4 = (tob1) objT13;
            boolean zI6 = b0kVar3.i(this) | b0kVar3.i(c8m1Var);
            Object objT14 = b0kVar3.T();
            if (zI6 || objT14 == obj) {
                objT14 = new t6j1(this, c8m1Var, (lnm) null, (byte) 27);
                b0kVar3.s0(objT14);
            }
            int i5 = i4 & 14;
            qxd0.t(c8m1Var, b0kVar3, (vu30) objT14);
            boolean zI7 = b0kVar3.i(this);
            Object objT15 = b0kVar3.T();
            if (zI7 || objT15 == obj) {
                objT15 = new i8m1(this, (byte) 1);
                b0kVar3.s0(objT15);
            }
            iu30 iu30Var = (iu30) objT15;
            int i6 = i4 & 112;
            boolean zI8 = b0kVar3.i(ven0Var3) | b0kVar3.i(this) | b0kVar3.i(ven0VarS) | (i6 == 32 || ((i4 & 64) != 0 && b0kVar3.i(o0iVar)));
            Object objT16 = b0kVar3.T();
            if (zI8 || objT16 == obj) {
                i3 = i6;
                xhm1Var = xhm1Var2;
                b = 1;
                lnmVar = null;
                m9i1 m9i1Var = new m9i1(this, ven0Var3, o0iVar, ven0VarS, (byte) 8);
                b0kVar3.s0(m9i1Var);
                objT16 = m9i1Var;
            } else {
                xhm1Var = xhm1Var2;
                b = 1;
                lnmVar = null;
                i3 = i6;
            }
            iu30 iu30Var2 = (iu30) objT16;
            boolean zI9 = b0kVar3.i(ven0Var3) | b0kVar3.i(this);
            Object objT17 = b0kVar3.T();
            if (zI9 || objT17 == obj) {
                objT17 = new f8m1(this, ven0Var3, b);
                b0kVar3.s0(objT17);
            }
            iu30 iu30Var3 = (iu30) objT17;
            boolean zI10 = b0kVar3.i(ven0Var3) | b0kVar3.i(this);
            Object objT18 = b0kVar3.T();
            if (zI10 || objT18 == obj) {
                objT18 = new f8m1(this, ven0Var3, (byte) 0);
                b0kVar3.s0(objT18);
            }
            boolean z6 = z2;
            d(c8m1Var, o0iVar, iu30Var, iu30Var2, iu30Var3, (iu30) objT18, b0kVar3, i5 | 64 | i3 | ((i4 << 9) & 3670016));
            l8m1 l8m1Var = this;
            Boolean bool3 = (Boolean) tob1Var4.getValue();
            bool3.getClass();
            boolean zI11 = b0kVar3.i(l8m1Var) | b0kVar3.i(c8m1Var) | b0kVar3.i(tob1Var4);
            Object objT19 = b0kVar3.T();
            if (zI11 || objT19 == obj) {
                q4m1 q4m1Var = new q4m1(l8m1Var, c8m1Var, tob1Var4, lnmVar, (byte) 2);
                c8m1Var2 = c8m1Var;
                tob1Var2 = tob1Var4;
                b0kVar3.s0(q4m1Var);
                objT19 = q4m1Var;
            } else {
                tob1Var2 = tob1Var4;
                c8m1Var2 = c8m1Var;
            }
            qxd0.t(bool3, b0kVar3, (vu30) objT19);
            i3k i3kVar2 = (i3k) ven0VarG.getValue();
            Boolean boolValueOf2 = Boolean.valueOf(z5);
            boolean z7 = z5;
            boolean zI12 = (i3 == 32 || ((i4 & 64) != 0 && b0kVar3.i(o0iVar))) | b0kVar3.i(ven0VarG) | b0kVar3.h(z6) | b0kVar3.i(l8m1Var) | b0kVar3.i(ven0Var) | b0kVar3.h(z7) | b0kVar3.i(ycl1Var);
            Object objT20 = b0kVar3.T();
            if (zI12 || objT20 == obj) {
                ven0 ven0Var5 = ven0Var;
                b0kVar2 = b0kVar3;
                ven0Var2 = ven0VarG;
                i3kVar = i3kVar2;
                v9i1 v9i1Var = new v9i1(o0iVar, z6, l8m1Var, z7, ycl1Var, ven0Var2, ven0Var5, (lnm) null);
                o0iVar2 = o0iVar;
                l8m1Var = l8m1Var;
                b0kVar2.s0(v9i1Var);
                objT20 = v9i1Var;
            } else {
                b0kVar2 = b0kVar3;
                o0iVar2 = o0iVar;
                ven0Var2 = ven0VarG;
                i3kVar = i3kVar2;
            }
            qxd0.s(i3kVar, boolValueOf2, (vu30) objT20, b0kVar2);
            ven0 ven0VarS3 = v8r.s(Boolean.valueOf((boolean) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04fa: INVOKE (r8v10 'ven0VarS3' p.ven0) = 
                  (wrap java.lang.Boolean:0x04f6: INVOKE (wrap boolean:?: CAST (boolean) (r25v3 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])) STATIC call: java.lang.Boolean.valueOf(boolean):java.lang.Boolean A[MD:(boolean):java.lang.Boolean (c), WRAPPED] (LINE:1271))
                  (r11v10 'b0kVar2' p.b0k)
                 STATIC call: p.v8r.s(java.lang.Object, p.b0k):p.ven0 A[DECLARE_VAR] (LINE:1275) in method: p.l8m1.c(p.c8m1, p.o0i, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes5.dex
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
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v3 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1502
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.l8m1.a(p.c8m1, p.o0i, p.qim0, p.b0k, int):void");
        }

        public final void d(c8m1 c8m1Var, o0i o0iVar, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, b0k b0kVar, int i) {
            int i2;
            iu30 iu30Var5;
            iu30 iu30Var6;
            c8m1 c8m1Var2 = c8m1Var;
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(810754492);
            if ((i & 6) == 0) {
                i2 = (x340Var.i(c8m1Var2) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= (i & 64) == 0 ? x340Var.g(o0iVar) : x340Var.i(o0iVar) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.i(iu30Var) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                iu30Var5 = iu30Var2;
                i2 |= x340Var.i(iu30Var5) ? 2048 : 1024;
            } else {
                iu30Var5 = iu30Var2;
            }
            if ((i & 24576) == 0) {
                iu30Var6 = iu30Var3;
                i2 |= x340Var.i(iu30Var6) ? 16384 : 8192;
            } else {
                iu30Var6 = iu30Var3;
            }
            if ((196608 & i) == 0) {
                i2 |= x340Var.i(iu30Var4) ? 131072 : 65536;
            }
            int i3 = i2;
            if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
                boolean zI = ((i3 & 896) == 256) | x340Var.i(c8m1Var2) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && x340Var.i(o0iVar))) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
                Object objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    bj81 bj81Var = new bj81((byte) 19, iu30Var, c8m1Var2, o0iVar, iu30Var5, iu30Var6, (lnm) null);
                    c8m1Var2 = c8m1Var2;
                    x340Var.s0(bj81Var);
                    objT = bj81Var;
                }
                qxd0.t(c8m1Var2, x340Var, (vu30) objT);
                boolean zI2 = ((458752 & i3) == 131072) | x340Var.i(c8m1Var2);
                Object objT2 = x340Var.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new f2m1(iu30Var4, c8m1Var2, (byte) 10);
                    x340Var.s0(objT2);
                }
                qxd0.i(c8m1Var2, (iu30) objT2, x340Var);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new kt3(this, c8m1Var2, o0iVar, iu30Var, iu30Var2, iu30Var3, iu30Var4, i, (byte) 27);
            }
        }
    }
