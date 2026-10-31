package p;

import android.graphics.Color;
import com.spotify.wrapped.v1.proto.StoryCard;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class zaf1 {
    public static final long a = fc11.G(24);
    public static final long b = fc11.G(13);
    public static final pxg1 c;
    public static final zu91 d;

    static {
        ilv.a.getClass();
        c = new pxg1(100, 100, flv.i);
        d = irn1.j0();
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0381  */
    /* JADX WARN: Code duplicated, block: B:134:0x0383  */
    /* JADX WARN: Code duplicated, block: B:141:0x0394  */
    /* JADX WARN: Code duplicated, block: B:144:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:146:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:149:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:150:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:152:0x0407  */
    /* JADX WARN: Code duplicated, block: B:154:0x0415  */
    /* JADX WARN: Code duplicated, block: B:155:0x0418  */
    public static final void a(iv21 iv21Var, u7h u7hVar, u7h u7hVar2, boolean z, boolean z2, boolean z3, int i, Function0 function0, String str, String str2, qim0 qim0Var, b0k b0kVar, int i2) {
        pxg1 pxg1VarJ0;
        zfv pxg1Var;
        zfv zfvVarJ0;
        qim0 qim0Var2;
        float f;
        Function0 function1;
        iv21 iv21Var2;
        boolean z4;
        u7h u7hVar3;
        boolean z5;
        boolean z6;
        Object objT;
        isl islVar;
        long j;
        zkt0 zkt0Var;
        boolean z7 = z2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-766640369);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.i(iv21Var) ? 4 : 2) | (x340Var.g(u7hVar) ? 32 : 16) | (x340Var.g(u7hVar2) ? 256 : 128) | (x340Var.h(z) ? 2048 : 1024) | (x340Var.h(z7) ? 16384 : 8192) | (x340Var.h(z3) ? 131072 : 65536) | (x340Var.e(i) ? 1048576 : 524288) | (x340Var.i(function0) ? 8388608 : 4194304) | (x340Var.g(str) ? 67108864 : 33554432) | (x340Var.g(str2) ? 536870912 : 268435456);
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && ((x340Var.g(qim0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            Float fValueOf = Float.valueOf(z ? 0.12f : 0.08f);
            if (z3) {
                ilv.a.getClass();
                pxg1VarJ0 = new pxg1(100, 32, flv.i);
            } else {
                pxg1VarJ0 = irn1.j0();
            }
            int i4 = i3 >> 9;
            int i5 = i4 & 112;
            tzg1 tzg1Var = rno1.a;
            float fFloatValue = ((Number) zod.G(fValueOf, z7, tzg1Var, pxg1VarJ0, x340Var, i5)).floatValue();
            kiv kivVar = t4k.h;
            float fM0 = ((wat) x340Var.k(kivVar)).M0((int) (i * fFloatValue));
            u7h u7hVarC = c(z ? u7hVar : u7hVar2, z7, z3, x340Var, i4 & 1008);
            Float fValueOf2 = Float.valueOf(z ? 1.0f : 0.0f);
            if (z3) {
                if (z) {
                    ilv.a.getClass();
                    pxg1Var = new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 132, flv.d);
                } else {
                    ilv.a.getClass();
                    pxg1Var = new pxg1(0, 100, flv.g);
                }
                z7 = z2;
                zfvVarJ0 = pxg1Var;
            } else {
                fM0 = fM0;
                zfvVarJ0 = irn1.j0();
            }
            Object objG = zod.G(fValueOf2, z7, tzg1Var, zfvVarJ0, (b0k) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x016f: INVOKE (r5v15 'objG' java.lang.Object) = 
                  (r22v2 'fValueOf2' java.lang.Float)
                  (r6v5 'z7' boolean)
                  (r7v4 'tzg1Var' p.tzg1)
                  (r8v7 'zfvVarJ0' p.zfv)
                  (wrap p.b0k:?: CAST (p.b0k) (r8v5 ?? I:??[OBJECT, ARRAY]))
                  (r10v5 'i5' int)
                 STATIC call: p.zod.G(java.lang.Object, boolean, p.tzg1, p.zfv, p.b0k, int):java.lang.Object A[DECLARE_VAR] (LINE:368) in method: p.zaf1.a(p.iv21, p.u7h, p.u7h, boolean, boolean, boolean, int, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes5.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v5 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1124
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.zaf1.a(p.iv21, p.u7h, p.u7h, boolean, boolean, boolean, int, kotlin.jvm.functions.Function0, java.lang.String, java.lang.String, p.qim0, p.b0k, int):void");
        }

        public static final void b(qim0 qim0Var, u7h u7hVar, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1509324139);
            int i2 = (x340Var.g(qim0Var) ? 4 : 2) | i | (x340Var.g(u7hVar) ? 32 : 16);
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                qim0 qim0VarH = u291.h(u291.f(qim0Var, 1.0f), 1.0f);
                qim0 qim0VarF = nim0.a;
                if (u7hVar != null) {
                    qim0VarF = dug.f(qim0VarF, u7hVar.a, d4o1.a);
                }
                qim0 qim0VarThen = qim0VarH.then(qim0VarF);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = v7f1.Y;
                    x340Var.s0(objT);
                }
                op71.g(x340Var, s161.a(qim0VarThen, (iu30) objT));
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yaf1(qim0Var, u7hVar, i, (byte) 0);
            }
        }

        public static final u7h c(u7h u7hVar, boolean z, boolean z2, b0k b0kVar, int i) {
            if (u7hVar == null) {
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(1280753719);
                x340Var.r(false);
                return null;
            }
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(1280753720);
            int i2 = u7h.l;
            u7h u7hVar2 = (u7h) zod.G(u7hVar, z, new tzg1(m4h.X0, new syf(kah.e, (byte) 20)), z2 ? c : d, x340Var2, i & 112);
            long j = u7hVar2.a;
            x340Var2.r(false);
            return u7hVar2;
        }

        public static final u7h d(String str) {
            u7h m231Var;
            if (str.length() == 0) {
                return null;
            }
            try {
                m231Var = new u7h(z4p1.e(Color.parseColor(str)));
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            return m231Var instanceof m231 ? null : m231Var;
        }
    }
