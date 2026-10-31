package p;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class g3c {
    public static final lee1 a = new lee1(0, fc11.G(11), (FontWeight) null, (FontFamily) null, 0, 0, 3, 0, 0, (shc0) null, 0, 16744445);

    public static final void a(int i, int i2, int i3, long j, long j2, long j3, iu30 iu30Var, qim0 qim0Var, Integer num, int i4, b0k b0kVar, int i5) {
        qim0 qim0Var2;
        ven0 ven0Var;
        char c;
        boolean z;
        boolean z2;
        drr0 drr0Var;
        ven0 ven0Var2;
        m4c m4cVar;
        float f;
        ven0 ven0Var3;
        float f2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1905901235);
        j06 j06Var = x340Var.a;
        int i6 = i5 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | (x340Var.e(i3) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024) | (x340Var.f(j2) ? 16384 : 8192) | (x340Var.f(j3) ? 131072 : 65536) | (x340Var.i(iu30Var) ? 1048576 : 524288) | 12582912 | (x340Var.g(num) ? 67108864 : 33554432) | (x340Var.e(i4) ? 536870912 : 268435456);
        if (x340Var.Y(i6 & 1, (i6 & 306783379) != 306783378)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            float f3 = x340Var.k(t4k.n) == flb0.b ? -1.0f : 1.0f;
            float fX0 = watVar.X0(24.0f);
            float f4 = (i3 - i2) * fX0;
            Object objT = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar2) {
                objT2 = us71.i((i - i2) * fX0, x340Var);
            }
            drr0 drr0Var2 = (drr0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar2) {
                objT3 = v8r.q(az31.a);
                x340Var.s0(objT3);
            }
            ven0 ven0Var4 = (ven0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar2) {
                objT4 = v8r.q((Object) null);
                x340Var.s0(objT4);
            }
            ven0 ven0Var5 = (ven0) objT4;
            Object objT5 = x340Var.T();
            Object obj = objT5;
            if (objT5 == m4cVar2) {
                o95 o95VarB = c97.b(drr0Var2.s());
                o95VarB.i(Float.valueOf(0.0f), Float.valueOf(f4));
                x340Var.s0(o95VarB);
                obj = o95VarB;
            }
            o95 o95Var = (o95) obj;
            Integer numValueOf = Integer.valueOf(i);
            Integer numValueOf2 = Integer.valueOf(i2);
            az31 az31Var = (az31) ven0Var4.getValue();
            int i7 = i6 & 112;
            boolean zI = x340Var.i(ven0Var4) | ((i6 & 14) == 4) | (i7 == 32) | x340Var.d(fX0) | x340Var.i(drr0Var2) | x340Var.i(o95Var);
            Object objT6 = x340Var.T();
            if (zI || objT6 == m4cVar2) {
                ven0Var = ven0Var5;
                c = 0;
                z = true;
                z2 = false;
                objT6 = new t2c(i, i2, fX0, o95Var, ven0Var4, drr0Var2, null);
                drr0Var = drr0Var2;
                ven0Var2 = ven0Var4;
                x340Var.s0(objT6);
            } else {
                ven0Var = ven0Var5;
                drr0Var = drr0Var2;
                ven0Var2 = ven0Var4;
                c = 0;
                z = true;
                z2 = false;
            }
            qxd0.r(numValueOf, numValueOf2, az31Var, (vu30) objT6, x340Var);
            Integer numValueOf3 = Integer.valueOf(i4);
            boolean zD = ((
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01f9: ARITH (r0v43 'zD' boolean) = (wrap boolean:0x01f4: ARITH (wrap boolean:0x01ef: ARITH (wrap boolean:0x01ea: ARITH (wrap boolean:0x01e5: ARITH (wrap boolean:0x01e0: ARITH (wrap boolean:?: TERNARY null = ((wrap int:0x01cd: ARITH (r21v0 int) & (234881024 int) A[WRAPPED] (LINE:462)) == (r13v5 'c' char)) ? (r21v2 'z' boolean) : (r23v1 'z2' boolean)) | (wrap boolean:?: TERNARY null = ((r1v6 'i7' int) == (32 ??[int, float, short, byte, char])) ? (r21v2 'z' boolean) : (r23v1 'z2' boolean)) A[DONT_WRAP, WRAPPED] (LINE:481)) | (wrap boolean:0x01e1: INVOKE (r14v1 'x340Var' p.x340), (r3v3 'fX0' float) VIRTUAL call: p.x340.d(float):boolean A[WRAPPED] (LINE:482)) A[DONT_WRAP, WRAPPED] (LINE:486)) | (wrap boolean:0x01e6: INVOKE (r14v1 'x340Var' p.x340), (r2v5 'drr0Var' p.drr0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:487)) A[DONT_WRAP, WRAPPED] (LINE:491)) | (wrap boolean:0x01eb: INVOKE (r14v1 'x340Var' p.x340), (r6v10 'ven0Var2' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:492)) A[DONT_WRAP, WRAPPED] (LINE:496)) | (wrap boolean:0x01f0: INVOKE (r14v1 'x340Var' p.x340), (r15v3 'ven0Var' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:497)) A[DONT_WRAP, WRAPPED] (LINE:501)) | (wrap boolean:0x01f5: INVOKE (r14v1 'x340Var' p.x340), (r4v9 'o95Var' p.o95) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:502)) A[DECLARE_VAR] (LINE:506) in method: p.g3c.a(int, int, int, long, long, long, p.iu30, p.qim0, java.lang.Integer, int, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes9.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1097
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.g3c.a(int, int, int, long, long, long, p.iu30, p.qim0, java.lang.Integer, int, p.b0k, int):void");
        }

        public static final Object b(o95 o95Var, float f, float f2, iu30 iu30Var, a8d1 a8d1Var) {
            Object objB = o95.b(o95Var, new Float(yoi1.o(jch0.U(yoi1.o(((Number) o95Var.e()).floatValue(), 0.0f, f2) / f) * f, 0.0f, f2)), irn1.l0(0.0f, 0.0f, (Object) null, 7), (Float) null, new c5a(iu30Var, (byte) 12), a8d1Var, 4);
            return objB == d9n.a ? objB : rih1.a;
        }
    }
