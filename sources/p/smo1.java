package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.concertcampaignview.v1.CtaType;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class smo1 {
    public static final float[] a = {0.0f, -1.0f, 1.0f, 0.0f};
    public static b180 b;

    public static final nma0 A(kl1 kl1Var, Class cls, List list) {
        nma0[] nma0VarArr = (nma0[]) list.toArray(new nma0[0]);
        nma0 nma0VarK = syo1.k(cls, (nma0[]) Arrays.copyOf(nma0VarArr, nma0VarArr.length));
        if (nma0VarK != null) {
            return nma0VarK;
        }
        jd11 jd11Var = rc11.a;
        tka0 tka0VarB = jd11Var.b(cls);
        nma0 nma0Var = (nma0) vnw0.a.get(tka0VarB);
        if (nma0Var != null) {
            return nma0Var;
        }
        nma0 nma0VarO = kl1Var.o(list, tka0VarB);
        if (nma0VarO != null) {
            return nma0VarO;
        }
        if (cls.isInterface()) {
            return new tcv0(jd11Var.b(cls));
        }
        return null;
    }

    public static final ven0 B(int i, int i2, int i3, boolean z, boolean z2, String str, int i4, dlv dlvVar, b0k b0kVar) {
        return zod.S(new hsi1(str + "-" + i + "-" + i2, Float.valueOf(0.0f), Float.valueOf(1.0f), new pxg1(i4, i3, dlvVar), rno1.a), z, z2, (Function0) null, b0kVar, 8, 8);
    }

    public static gbx C(Function0 function0) {
        return new gbx(z50.c, function0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static final nma0 D(kl1 kl1Var, Type type) throws SerializationException {
        nma0 nma0VarF = F(kl1Var, type, true);
        if (nma0VarF != null) {
            return nma0VarF;
        }
        String strR = rc11.a.b(z(type)).r();
        if (strR == null) {
            strR = "<local class name not available>";
        }
        throw new SerializationException(f4i1.f("Serializer for class '", strR, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public static final void E(Type type) throws SerializationException {
        D(j761.a, type);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v21 p.nma0, still in use, count: 2, list:
          (r7v21 p.nma0) from 0x002a: IF  (r7v21 p.nma0) == (null p.nma0)  -> B:50:0x00e1 A[HIDDEN] (LINE:43)
          (r7v21 p.nma0) from 0x002e: PHI (r7 I:??) = (r7v21 p.nma0) binds: [B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:133)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final p.nma0 F(p.kl1 r7, java.lang.reflect.Type r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.smo1.F(p.kl1, java.lang.reflect.Type, boolean):p.nma0");
    }

    public static final boolean G(alp0 alp0Var) {
        l0l l0lVar;
        d2l d2lVar = alp0Var.b;
        return (d2lVar == null || (l0lVar = d2lVar.a) == null || !alp0Var.i || alp0Var.f || !alp0Var.d.b || !alp0Var.j || l0lVar.l() || l0lVar.getType() == f0u.Z) ? false : true;
    }

    public static boolean H(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static String I(Map map) {
        int size = map.size();
        eqr0.X(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static final void a(c380 c380Var, float f, int i, int i2, boolean z, boolean z2, boolean z3, Function0 function0, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i3) {
        int i4;
        Function0 function1;
        tzg1 tzg1Var;
        hsi1 hsi1Var;
        drr0 drr0Var;
        ven0 ven0VarS;
        m4c m4cVar = fkj0.X;
        Float fValueOf = Float.valueOf(0.0f);
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1083187342);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? b0kVar2.g(c380Var) : b0kVar2.i(c380Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= b0kVar2.d(f) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar2.e(i) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar2.e(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= b0kVar2.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= b0kVar2.h(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            function1 = function0;
            i4 |= b0kVar2.i(function1) ? 8388608 : 4194304;
        } else {
            function1 = function0;
        }
        if ((i3 & 100663296) == 0) {
            i4 |= b0kVar2.g(qim0Var) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i4 |= b0kVar2.i(j2iVar) ? 536870912 : 268435456;
        }
        if (b0kVar2.Y(i4 & 1, (i4 & 306783379) != 306783378)) {
            qam1 qam1Var = (qam1) b0kVar2.k(sam1.a);
            int i5 = i4 & 896;
            boolean z4 = i5 == 256;
            int i6 = i4;
            Object objT = b0kVar2.T();
            if (z4 || objT == m4cVar) {
                objT = us71.i(0.0f, b0kVar2);
            }
            drr0 drr0Var2 = (drr0) objT;
            boolean z5 = i5 == 256;
            Object objT2 = b0kVar2.T();
            if (z5 || objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                b0kVar2.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean z6 = i5 == 256;
            Object objT3 = b0kVar2.T();
            if (z6 || objT3 == m4cVar) {
                objT3 = bb00.h(0, b0kVar2);
            }
            err0 err0Var = (hdn0) objT3;
            hjn hjnVar = (hjn) ven0Var.getValue();
            tzg1 tzg1Var2 = rno1.a;
            if (hjnVar != null) {
                tzg1Var = tzg1Var2;
                hsi1Var = new hsi1(cy30.i(i, "crate-settle-", err0Var.s(), "-"), Float.valueOf(hjnVar.a), Float.valueOf(hjnVar.b), hjnVar.c ? irn1.o0(250, 0, null, 6) : irn1.l0(0.7f, 0.0f, null, 6), tzg1Var);
            } else {
                tzg1Var = tzg1Var2;
                hsi1Var = new hsi1(f4i1.c(i, "crate-idle-"), fValueOf, fValueOf, irn1.j0(), tzg1Var2);
            }
            boolean zG = b0kVar2.g(ven0Var) | ((i6 & 3670016) == 1048576) | b0kVar2.i(qam1Var) | ((i6 & 29360128) == 8388608) | b0kVar2.g(drr0Var2);
            Object objT4 = b0kVar2.T();
            if (zG || objT4 == m4cVar) {
                objT4 = new g96(z3, qam1Var, function1, ven0Var, drr0Var2);
                drr0Var = drr0Var2;
                b0kVar2.s0(objT4);
            } else {
                drr0Var = drr0Var2;
            }
            int i7 = i6 >> 9;
            int i8 = 8 | (i7 & 112);
            ven0 ven0VarR = zod.R(hsi1Var, z, (Function0) objT4, b0kVar2, i8, 0);
            if (i2 == 0) {
                b0kVar2.i0(-2083745535);
                ven0VarS = zod.S(new hsi1("nudge-hint", fValueOf, Float.valueOf(1.0f), new pxg1(1200, 2600, mlv.d), tzg1Var), z, z2, (Function0) null, b0kVar2, i8 | (i7 & 896), 8);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-2083235926);
                ven0VarS = v8r.s(fValueOf, b0kVar2);
                b0kVar2.r(false);
            }
            ven0 ven0Var2 = ven0VarS;
            int iL = p7h.L(c380Var);
            List list = k6f1.a;
            float f2 = (-((gjn) list.get(Math.min(iL, p7h.L(list)))).b) / 267.0f;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            j2i j2iVarR = apo.r(-1635180580, new m6f1(f2, f, i, err0Var, ven0Var, drr0Var, j2iVar, i2, c380Var, z, z2, ven0VarR, ven0Var2), b0kVar2);
            b0kVar2 = b0kVar2;
            w2g0.c(qim0VarF, (tl3) null, j2iVarR, b0kVar2, 3072, 6);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n6f1(c380Var, f, i, i2, z, z2, z3, function0, qim0Var, j2iVar, i3);
        }
    }

    public static final void b(int i, boolean z, Function0 function0, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        j2i j2iVar2;
        o95 o95Var;
        m4c m4cVar;
        o95 o95Var2;
        boolean z2;
        vu30 vu30Var;
        llj lljVar;
        vu30 vu30Var2;
        vu30 vu30Var3 = y580.Y;
        llj lljVar2 = y580.R0;
        vu30 vu30Var4 = y580.N0;
        llj lljVar3 = y580.O0;
        gra graVar = een.e;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1417652403);
        j06 j06Var = ((x340) b0kVar3).a;
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= b0kVar3.g(graVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.i(j2iVar) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT = b0kVar3.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = bb00.h(i, b0kVar3);
            }
            err0 err0Var = (hdn0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar2) {
                objT2 = v8r.q((Object) null);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar2) {
                objT3 = c97.b(1.0f);
                b0kVar3.s0(objT3);
            }
            o95 o95Var3 = (o95) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar2) {
                objT4 = c97.b(0.0f);
                b0kVar3.s0(objT4);
            }
            o95 o95Var4 = (o95) objT4;
            int i4 = i3 >> 9;
            ven0 ven0VarS = v8r.s(function0, b0kVar3);
            Integer numValueOf = Integer.valueOf(i);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = ((i3 & 14) == 4) | b0kVar3.i(o95Var4) | b0kVar3.i(o95Var3) | ((i3 & 112) == 32) | b0kVar3.g(ven0VarS);
            Object objT5 = b0kVar3.T();
            if (zI || objT5 == m4cVar2) {
                o95Var = o95Var3;
                m4cVar = m4cVar2;
                b0kVar2 = b0kVar3;
                o95Var2 = o95Var4;
                z2 = false;
                t9s t9sVar = new t9s(i, o95Var2, o95Var, z, err0Var, ven0Var, ven0VarS, (lnm) null);
                b0kVar2.s0(t9sVar);
                objT5 = t9sVar;
            } else {
                o95Var = o95Var3;
                b0kVar2 = b0kVar3;
                m4cVar = m4cVar2;
                o95Var2 = o95Var4;
                z2 = false;
            }
            qxd0.s(numValueOf, boolValueOf, (vu30) objT5, b0kVar2);
            Integer num = (Integer) ven0Var.getValue();
            nim0 nim0Var = nim0.a;
            n4k n4kVar = hmb0.t1;
            if (num == null) {
                b0kVar2.i0(-867891165);
                b0kVar2.r(z2);
                j2iVar2 = j2iVar;
                lljVar = lljVar2;
                vu30Var2 = vu30Var3;
                vu30Var = vu30Var4;
            } else {
                b0kVar2.i0(-867891164);
                int iIntValue = num.intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                Object objT6 = b0kVar2.T();
                if (objT6 == m4cVar) {
                    objT6 = nhe1.a1;
                    b0kVar2.s0(objT6);
                }
                qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT6);
                boolean zI2 = b0kVar2.i(o95Var2);
                Object objT7 = b0kVar2.T();
                if (zI2 || objT7 == m4cVar) {
                    objT7 = new wqe(o95Var2, (byte) 14);
                    b0kVar2.s0(objT7);
                }
                qim0 qim0VarC = i541.C(qim0VarA, (iu30) objT7);
                gfh0 gfh0VarC = t1c.c((tl3) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x018f: INVOKE (r6v10 'gfh0VarC' p.gfh0) = (wrap p.tl3:?: CAST (p.tl3) (r21v0 ?? I:??[OBJECT, ARRAY])), (r14v2 'z2' boolean) STATIC call: p.t1c.c(p.tl3, boolean):p.gfh0 A[DECLARE_VAR] (LINE:400) in method: p.smo1.b(int, boolean, kotlin.jvm.functions.Function0, p.j2i, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 624
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.smo1.b(int, boolean, kotlin.jvm.functions.Function0, p.j2i, p.b0k, int):void");
            }

            public static final void c(pu6 pu6Var, i8h1 i8h1Var, b0k b0kVar, int i) {
                b0k b0kVar2;
                List list = pu6Var.c;
                String str = pu6Var.a;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(859322372);
                int i2 = (b0kVar3.i(pu6Var) ? 4 : 2) | i | (b0kVar3.i(i8h1Var) ? 32 : 16);
                if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
                    tbr0 tbr0VarC = ((cir0) b0kVar3.k(k2r0.a)).c();
                    Object objT = b0kVar3.T();
                    Object obj = fkj0.X;
                    if (objT == obj) {
                        objT = new AtomicBoolean(false);
                        b0kVar3.s0(objT);
                    }
                    AtomicBoolean atomicBoolean = (AtomicBoolean) objT;
                    boolean zG = b0kVar3.g(y6b1.b(str).toString());
                    Object objT2 = b0kVar3.T();
                    if (zG || objT2 == obj) {
                        objT2 = new wrk0(y6b1.b(str).toString());
                        b0kVar3.s0(objT2);
                    }
                    wrk0 wrk0Var = (wrk0) objT2;
                    if (list.isEmpty()) {
                        b0kVar3.i0(2068309678);
                        boolean zI = b0kVar3.i(atomicBoolean) | b0kVar3.i(tbr0VarC);
                        Object objT3 = b0kVar3.T();
                        if (zI || objT3 == obj) {
                            objT3 = new ju6(atomicBoolean, tbr0VarC, null, (byte) 0);
                            b0kVar3.s0(objT3);
                        }
                        qxd0.t(rih1.a, b0kVar3, (vu30) objT3);
                        b0kVar3.r(false);
                        h311 h311VarV = b0kVar3.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ku6(pu6Var, i8h1Var, i, (byte) 0);
                            return;
                        }
                        return;
                    }
                    b0kVar3.i0(2068540318);
                    b0kVar3.r(false);
                    String str2 = pu6Var.b;
                    boolean zI2 = b0kVar3.i(i8h1Var) | b0kVar3.i(wrk0Var) | b0kVar3.i(atomicBoolean) | b0kVar3.i(tbr0VarC);
                    Object objT4 = b0kVar3.T();
                    if (zI2 || objT4 == obj) {
                        wb6 wb6Var = new wb6(i8h1Var, wrk0Var, atomicBoolean, tbr0VarC, (byte) 9);
                        b0kVar3.s0(wb6Var);
                        objT4 = wb6Var;
                    }
                    vu30 vu30Var = (vu30) objT4;
                    boolean zI3 = b0kVar3.i(i8h1Var) | b0kVar3.i(wrk0Var) | b0kVar3.i(atomicBoolean) | b0kVar3.i(tbr0VarC);
                    Object objT5 = b0kVar3.T();
                    if (zI3 || objT5 == obj) {
                        f80 f80Var = new f80(i8h1Var, wrk0Var, atomicBoolean, tbr0VarC, (byte) 7);
                        b0kVar3.s0(f80Var);
                        objT5 = f80Var;
                    }
                    b0kVar2 = b0kVar3;
                    d(str2, list, vu30Var, (Function0) objT5, b0kVar2, 64);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV2 = b0kVar2.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new ku6(pu6Var, i8h1Var, i, (byte) 1);
                }
            }

            public static final void d(String str, List list, vu30 vu30Var, Function0 function0, b0k b0kVar, int i) {
                x340 x340Var;
                long j;
                int i2;
                byte b2;
                gbx gbxVar;
                String str2 = str;
                List list2 = list;
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(-758293905);
                int i3 = i | (x340Var2.g(str2) ? 4 : 2) | (x340Var2.i(list2) ? 32 : 16) | (x340Var2.i(vu30Var) ? 256 : 128) | (x340Var2.i(function0) ? 2048 : 1024);
                if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
                    qim0 qim0Var = nim0.a;
                    qim0 qim0VarN = anm1.N("category_sheet", qim0Var);
                    kiv kivVar = xce0.a;
                    qim0 qim0VarH = l6o1.H(zr7.i(qim0VarN, gce0.c), l6o1.C(0, 0, 1, x340Var2), false, 14);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarH);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0VarP);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
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
                    nko1.H(mbhVarA, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    String strO0 = cwl1.o0(x340Var2, 2131953504);
                    qim0 qim0VarN2 = anm1.N("category_sheet_title", qim0Var);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    qim0 qim0VarZ2 = uyn1.z(0.0f, 16.0f, 1, qim0VarN2);
                    lee1 lee1Var = cbx.d(x340Var2).k;
                    long j2 = cbx.a(x340Var2).b.b;
                    qim0 qim0Var2 = qim0Var;
                    boolean z = false;
                    int i4 = i3;
                    uwo1.e(strO0, qim0VarZ2, lee1Var, j2, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2032);
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(772339809);
                    int size = list2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        b9e b9eVar = (b9e) list2.get(i5);
                        boolean zJ = u890.j(b9eVar.a, str2);
                        if (zJ) {
                            x340Var3.i0(845903109);
                            uwr uwrVar2 = cbx.a;
                            j = cbx.a(x340Var3).c.c;
                        } else {
                            x340Var3.i0(845904349);
                            uwr uwrVar3 = cbx.a;
                            j = cbx.a(x340Var3).b.a;
                        }
                        x340Var3.r(z);
                        qim0 qim0Var3 = qim0Var2;
                        qim0 qim0VarN3 = anm1.N("category_option_".concat(b9eVar.a), qim0Var3);
                        boolean zH = x340Var3.h(zJ);
                        Object objT = x340Var3.T();
                        if (zH || objT == m4cVar) {
                            objT = new gy((byte) 5, zJ);
                            x340Var3.s0(objT);
                        }
                        qim0 qim0VarB = s161.b(qim0VarN3, false, (iu30) objT);
                        cvx cvxVar3 = cbx.b(x340Var3).b;
                        zzq0 zzq0VarH = uyn1.h(1, 0.0f, 16.0f);
                        cvx cvxVar4 = cbx.b(x340Var3).b;
                        cvx cvxVar5 = cbx.b(x340Var3).b;
                        cvx cvxVar6 = cbx.b(x340Var3).b;
                        uvx uvxVar = new uvx(1, (pgx) null, 2, zzq0VarH, (zzq0) null, new tvx(2.0f, 16.0f, 2.0f), (hw61) null, 0, (p3v) null, 466);
                        if (zJ) {
                            x340Var3.i0(453961095);
                            String strO1 = cwl1.o0(x340Var3, 2131953503);
                            i2 = i4;
                            boolean z2 = (i2 & 7168) == 2048;
                            Object objT2 = x340Var3.T();
                            if (z2 || objT2 == m4cVar) {
                                objT2 = new lj2(function0, (byte) 8);
                                x340Var3.s0(objT2);
                            }
                            gbxVar = new gbx(new y50(strO1), (Function0) objT2);
                            b2 = 0;
                            x340Var3.r(false);
                        } else {
                            i2 = i4;
                            x340Var3.i0(454160270);
                            String strN0 = cwl1.n0(2131953502, new Object[]{b9eVar.b}, x340Var3);
                            boolean zI = ((i2 & 896) == 256) | x340Var3.i(b9eVar) | x340Var3.e(i5);
                            Object objT3 = x340Var3.T();
                            if (zI || objT3 == m4cVar) {
                                objT3 = new wv1((Object) vu30Var, (Object) b9eVar, i5, (byte) 2);
                                x340Var3.s0(objT3);
                            }
                            gbx gbxVar2 = new gbx(new y50(strN0), (Function0) objT3);
                            b2 = 0;
                            x340Var3.r(false);
                            gbxVar = gbxVar2;
                        }
                        qim0Var2 = qim0Var3;
                        x340 x340Var4 = x340Var3;
                        jto1.b(qim0VarB, uvxVar, null, false, null, null, gbxVar, null, apo.r(-204608177, new lu6(b9eVar, j, b2), x340Var3), null, null, null, zJ ? a7i.a : null, null, null, apo.r(-2096992555, new lu6(b9eVar, j, (byte) 1), x340Var3), x340Var4, 100663360, 196608, 28348);
                        x340Var3 = x340Var4;
                        i5++;
                        list2 = list;
                        size = size;
                        i4 = i2;
                        z = false;
                        str2 = str;
                    }
                    boolean z3 = z;
                    qim0 qim0Var4 = qim0Var2;
                    x340Var3.r(z3);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var3).b;
                    qim0 qim0VarN4 = anm1.N("category_sheet_cancel", ab80.o(qim0Var4, 12.0f, x340Var3, qim0Var4, 1.0f));
                    boolean z4 = (i4 & 7168) == 2048 ? true : z3;
                    Object objT4 = x340Var3.T();
                    if (z4 || objT4 == m4cVar) {
                        objT4 = new lj2(function0, (byte) 9);
                        x340Var3.s0(objT4);
                    }
                    gbx gbxVar3 = new gbx(z50.c, (Function0) objT4);
                    x340 x340Var5 = x340Var3;
                    gra graVar = een.h;
                    cvx cvxVar8 = cbx.b(x340Var5).b;
                    cwl1.b(qim0VarN4, graVar, d4o1.a, (pgx) null, uyn1.h(1, 0.0f, 16.0f), (max) null, false, (idn0) null, (ga80) null, gbxVar3, (gbx) null, a7i.b, x340Var5, 0, 48, 1512);
                    x340Var = x340Var5;
                    cvx cvxVar9 = cbx.b(x340Var).b;
                    x0d.s(qim0Var4, 16.0f, x340Var, true);
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new wb6(i, (Object) str, (Object) list, (Object) vu30Var, (Object) function0, (byte) 10);
                }
            }

            public static final llm e(o8n o8nVar) {
                if (o8nVar.A(fkj0.W0) == null) {
                    o8nVar = o8nVar.y(op71.f());
                }
                return new llm(o8nVar);
            }

            public static final void f(ArrayList arrayList, cmt cmtVar, String str, String str2, String str3, hjp hjpVar, kjp kjpVar, qim0 qim0Var, List list, b0k b0kVar, int i) {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1569571860);
                int i2 = i | (x340Var.g(arrayList) ? 4 : 2) | (x340Var.i(cmtVar) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.g(str3) ? 16384 : 8192) | (x340Var.i(hjpVar) ? 131072 : 65536) | (x340Var.i(kjpVar) ? 1048576 : 524288) | 12582912 | (x340Var.i(list) ? 67108864 : 33554432);
                if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
                    nyx.a(2, (wux) null, apo.r(-1250852767, new n(arrayList, list, cmtVar, str, str2, str3, hjpVar, kjpVar), x340Var), x340Var, 3078, 6);
                    qim0Var2 = nim0.a;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new zx(arrayList, cmtVar, str, str2, str3, hjpVar, kjpVar, qim0Var2, list, i);
                }
            }

            public static final llm g() {
                j0d1 j0d1VarB = guo1.B();
                fns fnsVar = igu.a;
                return new llm(flo1.l(j0d1VarB, pyf0.a));
            }

            public static final void h(float f, float f2, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(2002831511);
                int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.d(f2) ? 32 : 16);
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                    Object objT = x340Var.T();
                    if (z || objT == fkj0.X) {
                        objT = new o6f1(f, f2);
                        x340Var.s0(objT);
                    }
                    gfh0 gfh0Var = (gfh0) objT;
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0Var);
                    hzj.A.getClass();
                    if (x340Var.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0Var, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    dv20.l(6, j2iVar, x340Var, true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new c3c((byte) 5, f, f2, i, qim0Var, j2iVar);
                }
            }

            /* JADX WARN: Code duplicated, block: B:153:0x020c  */
            /* JADX WARN: Code duplicated, block: B:156:0x0245  */
            /* JADX WARN: Code duplicated, block: B:159:0x0254  */
            /* JADX WARN: Code duplicated, block: B:160:0x0256  */
            /* JADX WARN: Code duplicated, block: B:166:0x0262  */
            /* JADX WARN: Code duplicated, block: B:241:0x0389  */
            /* JADX WARN: Code duplicated, block: B:244:0x0392  */
            /* JADX WARN: Code duplicated, block: B:247:0x0398 A[PHI: r1
              0x0398: PHI (r1v63 int) = (r1v50 int), (r1v64 int) binds: [B:246:0x0396, B:242:0x038f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:248:0x039a  */
            /* JADX WARN: Code duplicated, block: B:251:0x03a8 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:254:0x03ba  */
            /* JADX WARN: Code duplicated, block: B:257:0x03dc  */
            /* JADX WARN: Code duplicated, block: B:258:0x03de  */
            /* JADX WARN: Code duplicated, block: B:261:0x03e3  */
            /* JADX WARN: Code duplicated, block: B:263:0x03e9  */
            /* JADX WARN: Code duplicated, block: B:269:0x03fb A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:270:0x03fd  */
            /* JADX WARN: Code duplicated, block: B:273:0x040d  */
            /* JADX WARN: Code duplicated, block: B:274:0x040f  */
            /* JADX WARN: Code duplicated, block: B:277:0x0416  */
            /* JADX WARN: Code duplicated, block: B:278:0x0418  */
            /* JADX WARN: Code duplicated, block: B:281:0x0420 A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:284:0x0426  */
            /* JADX WARN: Code duplicated, block: B:287:0x0444  */
            /* JADX WARN: Code duplicated, block: B:288:0x0446  */
            /* JADX WARN: Code duplicated, block: B:291:0x045c A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:292:0x045e  */
            /* JADX WARN: Code duplicated, block: B:295:0x046d  */
            /* JADX WARN: Code duplicated, block: B:297:0x0482  */
            /* JADX WARN: Code duplicated, block: B:299:0x0488  */
            /* JADX WARN: Code duplicated, block: B:305:0x0499  */
            /* JADX WARN: Code duplicated, block: B:307:0x049f  */
            /* JADX WARN: Code duplicated, block: B:313:0x04ae A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:314:0x04b0  */
            /* JADX WARN: Code duplicated, block: B:316:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:319:0x04f3  */
            /* JADX WARN: Code duplicated, block: B:320:0x04f5  */
            /* JADX WARN: Code duplicated, block: B:322:0x04f8  */
            /* JADX WARN: Code duplicated, block: B:323:0x0507  */
            public static final void i(final qim0 qim0Var, jkr0 jkr0Var, final vzq0 vzq0Var, final qqq0 qqq0Var, ru91 ru91Var, final boolean z, final hxq0 hxq0Var, int i, final float f, final gdr0 gdr0Var, d6o0 d6o0Var, final iu30 iu30Var, final nl3 nl3Var, final pl3 pl3Var, final xu91 xu91Var, final j2i j2iVar, b0k b0kVar, final int i2, final int i3) {
                int i4;
                int i5;
                xu91 xu91Var2;
                ru91 ru91Var2;
                jkr0 jkr0Var2;
                int i6;
                x340 x340Var;
                d6o0 d6o0Var2;
                m4c m4cVar;
                Function0 function0;
                int i7;
                ven0 ven0VarS;
                ven0 ven0VarS2;
                boolean zG;
                Object objT;
                ima0 ima0Var;
                Object objT2;
                c9n c9nVar;
                boolean z2;
                Object objT3;
                Function0 function1;
                int i8;
                int i9;
                boolean z3;
                boolean zG2;
                Object wjr0Var;
                m4c m4cVar2;
                c9n c9nVar2;
                int i10;
                qqq0 qqq0Var2;
                ima0 ima0Var2;
                qqq0 qqq0Var3;
                boolean z4;
                boolean zH;
                Object objT4;
                boolean z5;
                boolean z6;
                boolean z7;
                Object objT5;
                p5c p5cVar;
                flb0 flb0Var;
                boolean z8;
                boolean zG3;
                Object objT6;
                qim0 qim0Var2;
                qim0 qim0VarZ;
                qqq0 qqq0Var4;
                qim0 qim0VarX;
                boolean z9;
                qim0 qim0VarThen;
                boolean z10;
                Object objT7;
                m4c m4cVar3 = fkj0.X;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(-572816025);
                if ((i2 & 6) == 0) {
                    i4 = i2 | (x340Var2.g(qim0Var) ? 4 : 2);
                } else {
                    i4 = i2;
                }
                if ((i2 & 48) == 0) {
                    i4 |= x340Var2.g(jkr0Var) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i4 |= x340Var2.g(vzq0Var) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    i4 |= x340Var2.h(false) ? 2048 : 1024;
                }
                if ((i2 & 24576) == 0) {
                    i4 |= x340Var2.e(qqq0Var.ordinal()) ? 16384 : 8192;
                }
                if ((i2 & 196608) == 0) {
                    i4 |= x340Var2.g(ru91Var) ? 131072 : 65536;
                }
                if ((i2 & 1572864) == 0) {
                    i4 |= x340Var2.h(z) ? 1048576 : 524288;
                }
                if ((i2 & 12582912) == 0) {
                    i4 |= x340Var2.g(hxq0Var) ? 8388608 : 4194304;
                }
                if ((i2 & 100663296) == 0) {
                    i4 |= x340Var2.e(i) ? 67108864 : 33554432;
                }
                if ((i2 & 805306368) == 0) {
                    i4 |= x340Var2.d(f) ? 536870912 : 268435456;
                }
                if ((i3 & 6) == 0) {
                    i5 = i3 | (x340Var2.g(gdr0Var) ? 4 : 2);
                } else {
                    i5 = i3;
                }
                if ((i3 & 48) == 0) {
                    i5 |= x340Var2.i(d6o0Var) ? 32 : 16;
                }
                if ((i3 & 384) == 0) {
                    i5 |= x340Var2.i(iu30Var) ? 256 : 128;
                }
                if ((i3 & 3072) == 0) {
                    i5 |= x340Var2.g(nl3Var) ? 2048 : 1024;
                }
                if ((i3 & 24576) == 0) {
                    i5 |= x340Var2.g(pl3Var) ? 16384 : 8192;
                }
                if ((i3 & 196608) == 0) {
                    xu91Var2 = xu91Var;
                    i5 |= x340Var2.g(xu91Var2) ? 131072 : 65536;
                } else {
                    xu91Var2 = xu91Var;
                }
                if ((i3 & 1572864) == 0) {
                    i5 |= x340Var2.i(j2iVar) ? 1048576 : 524288;
                }
                int i11 = i5;
                if (x340Var2.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (599187 & i11) == 599186) ? false : true)) {
                    if (i < 0) {
                        tf80.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i);
                    }
                    int i12 = i4 & 112;
                    boolean z11 = i12 == 32;
                    Object objT8 = x340Var2.T();
                    if (z11) {
                        m4cVar = m4cVar3;
                    } else {
                        m4cVar = m4cVar3;
                        if (objT8 == m4cVar) {
                        }
                        function0 = (Function0) objT8;
                        int i13 = i4 >> 3;
                        i7 = i13 & 14;
                        int i14 = i11 >> 15;
                        int i15 = i7 | (i14 & 112) | (i11 & 896);
                        ven0VarS = v8r.s(j2iVar, x340Var2);
                        ven0VarS2 = v8r.s(iu30Var, x340Var2);
                        zG = ((((i15 & 14) ^ 6) <= 4 && x340Var2.g(jkr0Var)) || (i15 & 6) == 4) | x340Var2.g(ven0VarS) | x340Var2.g(ven0VarS2) | x340Var2.g(function0);
                        objT = x340Var2.T();
                        if (zG || objT == m4cVar) {
                            c4x0 c4x0Var = c4x0.f;
                            uc9 uc9Var = new uc9(ven0VarS, ven0VarS2, function0, (byte) 5);
                            yt91 yt91Var = yv91.a;
                            objT = new i1w(new mdt(new qga0(new mdt(uc9Var, c4x0Var), jkr0Var, (byte) 3), c4x0Var), tob1.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 7);
                            x340Var2.s0(objT);
                        }
                        ima0Var = (ima0) objT;
                        objT2 = x340Var2.T();
                        if (objT2 == m4cVar) {
                            objT2 = qxd0.M(o6x.a, x340Var2);
                            x340Var2.s0(objT2);
                        }
                        c9nVar = (c9n) objT2;
                        if (i12 == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objT3 = x340Var2.T();
                        if (z2 || objT3 == m4cVar) {
                            objT3 = new lsb0(jkr0Var, (byte) 1);
                            x340Var2.s0(objT3);
                        }
                        function1 = (Function0) objT3;
                        int i16 = i4 >> 9;
                        int i17 = (i4 & 65520) | (i16 & 458752) | (i16 & 3670016) | ((i11 << 21) & 29360128);
                        int i18 = i11 << 15;
                        i8 = i17 | (i18 & 234881024) | (i18 & 1879048192);
                        boolean zG4 = ((((i8 & 112) ^ 48) <= 32 && x340Var2.g(jkr0Var)) || (i8 & 48) == 32) | ((((i8 & 896) ^ 384) <= 256 && x340Var2.g(vzq0Var)) || (i8 & 384) == 256) | ((((i8 & 7168) ^ 3072) <= 2048 && x340Var2.h(false)) || (i8 & 3072) == 2048) | ((((57344 & i8) ^ 24576) <= 16384 && x340Var2.e(qqq0Var.ordinal())) || (i8 & 24576) == 16384) | ((((i8 & 234881024) ^ 100663296) <= 67108864 && x340Var2.g(nl3Var)) || (i8 & 100663296) == 67108864) | ((((i8 & 1879048192) ^ 805306368) <= 536870912 && x340Var2.g(pl3Var)) || (i8 & 805306368) == 536870912) | ((((i8 & 3670016) ^ 1572864) <= 1048576 && x340Var2.d(f)) || (i8 & 1572864) == 1048576) | ((((i8 & 29360128) ^ 12582912) <= 8388608 && x340Var2.g(gdr0Var)) || (i8 & 12582912) == 8388608) | ((((i14 & 14) ^ 6) <= 4 && x340Var2.g(xu91Var2)) || (i14 & 6) == 4) | x340Var2.g(function1);
                        if (((i8 & 458752) ^ 196608) > 131072) {
                            i9 = i;
                            if (!x340Var2.e(i9)) {
                                z3 = true;
                            }
                            zG2 = zG4 | z3 | x340Var2.g(c9nVar);
                            Object objT9 = x340Var2.T();
                            if (!zG2 || objT9 == m4cVar) {
                                m4c m4cVar4 = m4cVar;
                                i6 = i9;
                                m4cVar2 = m4cVar4;
                                x340Var = x340Var2;
                                c9nVar2 = c9nVar;
                                i10 = 4;
                                qqq0Var2 = qqq0Var;
                                wjr0Var = new wjr0(jkr0Var, qqq0Var2, vzq0Var, f, gdr0Var, ima0Var, function1, pl3Var, nl3Var, i6, xu91Var2, c9nVar2);
                                ima0Var2 = ima0Var;
                                x340Var.s0(wjr0Var);
                            } else {
                                m4c m4cVar5 = m4cVar;
                                i6 = i9;
                                m4cVar2 = m4cVar5;
                                ima0Var2 = ima0Var;
                                qqq0Var2 = qqq0Var;
                                c9nVar2 = c9nVar;
                                wjr0Var = objT9;
                                i10 = 4;
                                x340Var = x340Var2;
                            }
                            hsb0 hsb0Var = (hsb0) wjr0Var;
                            qqq0Var3 = qqq0.a;
                            if (qqq0Var2 == qqq0Var3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            zH = (((i7 ^ 6) <= i10 && x340Var.g(jkr0Var)) || (i13 & 6) == i10) | x340Var.h(z4);
                            objT4 = x340Var.T();
                            if (zH || objT4 == m4cVar2) {
                                objT4 = new atb0(
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x03ff: CONSTRUCTOR (r6v4 'objT4' java.lang.Object) = (r3v0 p.jkr0), (r2v50 'z4' boolean) (LINE:1024) call: p.atb0.<init>(p.jkr0, boolean):void type: CONSTRUCTOR in method: p.smo1.i(p.qim0, p.jkr0, p.vzq0, p.qqq0, p.ru91, boolean, p.hxq0, int, float, p.gdr0, p.d6o0, p.iu30, p.nl3, p.pl3, p.xu91, p.j2i, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v0 p.jkr0
                                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                    */
                                /*
                                    Method dump skipped, instruction units count: 1403
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: p.smo1.i(p.qim0, p.jkr0, p.vzq0, p.qqq0, p.ru91, boolean, p.hxq0, int, float, p.gdr0, p.d6o0, p.iu30, p.nl3, p.pl3, p.xu91, p.j2i, p.b0k, int, int):void");
                            }

                            /* JADX WARN: Code duplicated, block: B:100:0x0458  */
                            /* JADX WARN: Code duplicated, block: B:101:0x045c  */
                            /* JADX WARN: Code duplicated, block: B:103:0x04d6  */
                            /* JADX WARN: Code duplicated, block: B:106:0x04e8  */
                            /* JADX WARN: Code duplicated, block: B:108:0x04f4  */
                            /* JADX WARN: Code duplicated, block: B:109:0x04f6  */
                            /* JADX WARN: Code duplicated, block: B:115:0x0503  */
                            /* JADX WARN: Code duplicated, block: B:119:0x0516  */
                            /* JADX WARN: Code duplicated, block: B:123:0x051f  */
                            /* JADX WARN: Code duplicated, block: B:125:0x0539  */
                            /* JADX WARN: Code duplicated, block: B:84:0x039e  */
                            /* JADX WARN: Code duplicated, block: B:85:0x03a2  */
                            /* JADX WARN: Code duplicated, block: B:88:0x03e1  */
                            /* JADX WARN: Code duplicated, block: B:90:0x03fe  */
                            /* JADX WARN: Code duplicated, block: B:91:0x0400  */
                            /* JADX WARN: Code duplicated, block: B:97:0x040d  */
                            public static final void j(e0s0 e0s0Var, pkp pkpVar, b7b b7bVar, iu30 iu30Var, b0k b0kVar, int i) {
                                iu30 iu30Var2;
                                Function0 function0;
                                m4c m4cVar;
                                m4c m4cVar2;
                                int i2;
                                boolean z;
                                boolean z2;
                                Object objT;
                                Object objT2;
                                boolean z3;
                                Object objT3;
                                llj lljVar = y580.Y;
                                llj lljVar2 = y580.R0;
                                llj lljVar3 = y580.N0;
                                llj lljVar4 = y580.O0;
                                era eraVar = een.P0;
                                m4c m4cVar3 = fkj0.X;
                                x340 x340Var = (x340) b0kVar;
                                x340Var.k0(957362545);
                                j06 j06Var = x340Var.a;
                                int i3 = (i & 6) == 0 ? (x340Var.g(e0s0Var) ? 4 : 2) | i : i;
                                if ((i & 48) == 0) {
                                    i3 |= (i & 64) == 0 ? x340Var.g(pkpVar) : x340Var.i(pkpVar) ? 32 : 16;
                                }
                                if ((i & 384) == 0) {
                                    i3 |= x340Var.i(b7bVar) ? 256 : 128;
                                }
                                if ((i & 3072) == 0) {
                                    i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
                                }
                                if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                                    Object objT4 = x340Var.T();
                                    if (objT4 == m4cVar3) {
                                        objT4 = new t060();
                                        x340Var.s0(objT4);
                                    }
                                    t060 t060Var = (t060) objT4;
                                    uwr uwrVar = cbx.a;
                                    cvx cvxVar = cbx.b(x340Var).b;
                                    nim0 nim0Var = nim0.a;
                                    int i4 = i3;
                                    qim0 qim0VarF = dug.f(u291.f(nim0Var, 1.0f), cbx.a(x340Var).a.a.a(), d4o1.a);
                                    WeakHashMap weakHashMap = osl1.x;
                                    qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarF);
                                    era eraVar2 = een.Q0;
                                    f36 f36Var = h36.c;
                                    mbh mbhVarA = jbh.a(f36Var, eraVar2, x340Var, 54);
                                    int iHashCode = Long.hashCode(x340Var.T);
                                    xos0 xos0VarM = x340Var.m();
                                    qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
                                    hzj.A.getClass();
                                    if (j06Var == null) {
                                        tgp1.p();
                                        throw null;
                                    }
                                    x340Var.m0();
                                    boolean z4 = x340Var.S;
                                    Function0 function1 = hmb0.t1;
                                    if (z4) {
                                        x340Var.l(function1);
                                    } else {
                                        x340Var.v0();
                                    }
                                    nko1.H(mbhVarA, x340Var, lljVar4);
                                    nko1.H(xos0VarM, x340Var, lljVar3);
                                    x0d.q(iHashCode, x340Var, lljVar2, x340Var);
                                    nko1.H(qim0VarE, x340Var, lljVar);
                                    qim0 qim0VarH = l6o1.H(kx40.h(1.0f, u291.f(nim0Var, 1.0f), false), l6o1.C(0, 0, 1, x340Var), false, 14);
                                    mbh mbhVarA2 = jbh.a(f36Var, eraVar2, x340Var, 54);
                                    int iHashCode2 = Long.hashCode(x340Var.T);
                                    xos0 xos0VarM2 = x340Var.m();
                                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
                                    x340Var.m0();
                                    if (x340Var.S) {
                                        x340Var.l(function1);
                                    } else {
                                        x340Var.v0();
                                    }
                                    nko1.H(mbhVarA2, x340Var, lljVar4);
                                    nko1.H(xos0VarM2, x340Var, lljVar3);
                                    x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                                    nko1.H(qim0VarE2, x340Var, lljVar);
                                    otw.c(t060Var, new k060(2131956947), u291.f(nim0Var, 1.0f), (ipb1) null, x340Var, 384, 8);
                                    qim0 qim0VarX = uyn1.x(u291.f(nim0Var, 1.0f), 16.0f);
                                    mbh mbhVarA3 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 48);
                                    int iHashCode3 = Long.hashCode(x340Var.T);
                                    xos0 xos0VarM3 = x340Var.m();
                                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
                                    x340Var.m0();
                                    if (x340Var.S) {
                                        function0 = function1;
                                        x340Var.l(function0);
                                    } else {
                                        function0 = function1;
                                        x340Var.v0();
                                    }
                                    nko1.H(mbhVarA3, x340Var, lljVar4);
                                    nko1.H(xos0VarM3, x340Var, lljVar3);
                                    x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                                    nko1.H(qim0VarE3, x340Var, lljVar);
                                    Function0 function2 = function0;
                                    uwo1.e(e0s0Var.d, null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                                    qim0 qim0VarX2 = uyn1.x(nim0Var, 8.0f);
                                    mbh mbhVarA4 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
                                    int iHashCode4 = Long.hashCode(x340Var.T);
                                    xos0 xos0VarM4 = x340Var.m();
                                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarX2);
                                    x340Var.m0();
                                    if (x340Var.S) {
                                        x340Var.l(function2);
                                    } else {
                                        x340Var.v0();
                                    }
                                    nko1.H(mbhVarA4, x340Var, lljVar4);
                                    nko1.H(xos0VarM4, x340Var, lljVar3);
                                    x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
                                    nko1.H(qim0VarE4, x340Var, lljVar);
                                    x340Var.i0(464691374);
                                    for (String str : e0s0Var.e.a) {
                                        uwr uwrVar2 = cbx.a;
                                        ha71.a(str, cbx.a(x340Var).b.a, x340Var, 0);
                                    }
                                    x340Var.r(false);
                                    x340Var.r(true);
                                    mbh mbhVarA5 = jbh.a(new d36(4.0f, true, new um5(false)), eraVar, x340Var, 0);
                                    int iHashCode5 = Long.hashCode(x340Var.T);
                                    xos0 xos0VarM5 = x340Var.m();
                                    qim0 qim0VarE5 = zr7.E(x340Var, nim0Var);
                                    hzj.A.getClass();
                                    x340Var.m0();
                                    if (x340Var.S) {
                                        x340Var.l(function2);
                                    } else {
                                        x340Var.v0();
                                    }
                                    nko1.H(mbhVarA5, x340Var, lljVar4);
                                    nko1.H(xos0VarM5, x340Var, lljVar3);
                                    x0d.q(iHashCode5, x340Var, lljVar2, x340Var);
                                    nko1.H(qim0VarE5, x340Var, lljVar);
                                    String strO0 = cwl1.o0(x340Var, 2131956905);
                                    uwr uwrVar3 = cbx.a;
                                    uwo1.e(strO0, null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                                    String strO1 = cwl1.o0(x340Var, 2131956908);
                                    lee1 lee1VarA = lee1.a(cbx.d(x340Var).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, TextDecoration.c, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16773119);
                                    long j = cbx.a(x340Var).b.a;
                                    int i5 = i4 & 7168;
                                    boolean z5 = i5 == 2048;
                                    Object objT5 = x340Var.T();
                                    if (z5) {
                                        m4cVar = m4cVar3;
                                    } else {
                                        m4cVar = m4cVar3;
                                        if (objT5 != m4cVar) {
                                            m4cVar2 = m4cVar;
                                        }
                                        qim0 qim0VarX3 = bin.x(nim0Var, false, null, null, null, (Function0) objT5, 15);
                                        m4c m4cVar4 = m4cVar2;
                                        uwo1.e(strO1, qim0VarX3, lee1VarA, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                                        x340Var.r(true);
                                        if (e0s0Var.i) {
                                            i2 = 2131956907;
                                        } else {
                                            i2 = 2131956906;
                                        }
                                        uwo1.e(cwl1.o0(x340Var, i2), null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                                        x340Var = x340Var;
                                        z = true;
                                        x340Var.r(true);
                                        x340Var.r(true);
                                        if (e0s0Var.g) {
                                            x340Var.i0(1992839700);
                                            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                                            mta mtaVar = cbx.b(x340Var).d;
                                            qim0 qim0VarB = u291.b(0.0f, 56.0f, 1, qim0VarF2);
                                            if (i5 == 2048) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            objT3 = x340Var.T();
                                            if (z3 || objT3 == m4cVar4) {
                                                objT3 = new g0s0(iu30Var, (byte) 3);
                                                x340Var.s0(objT3);
                                            }
                                            qim0 qim0VarX4 = uyn1.x(bin.x(qim0VarB, false, null, null, null, (Function0) objT3, 15), 16.0f);
                                            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var, 48);
                                            int iHashCode6 = Long.hashCode(x340Var.T);
                                            xos0 xos0VarM6 = x340Var.m();
                                            qim0 qim0VarE6 = zr7.E(x340Var, qim0VarX4);
                                            x340Var.m0();
                                            if (x340Var.S) {
                                                x340Var.l(function2);
                                            } else {
                                                x340Var.v0();
                                            }
                                            nko1.H(jw31VarA, x340Var, lljVar4);
                                            nko1.H(xos0VarM6, x340Var, lljVar3);
                                            x0d.q(iHashCode6, x340Var, lljVar2, x340Var);
                                            nko1.H(qim0VarE6, x340Var, lljVar);
                                            tkx tkxVar = tkx.c;
                                            long j2 = cbx.a(x340Var).b.a;
                                            zov0 zov0Var = cbx.b(x340Var).g;
                                            w0h1.a(tkxVar, isl.a, u291.r(nim0Var, 24.0f), j2, 0L, false, x340Var, tkx.d | 48, 48);
                                            uwo1.e(cwl1.n0(2131956942, new Object[]{e0s0Var.b}, x340Var), null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                                            x340Var = x340Var;
                                            z = true;
                                            x340Var.r(true);
                                            x340Var.r(false);
                                        } else {
                                            x340Var.i0(1993682683);
                                            x340Var.r(false);
                                        }
                                        x340Var.r(z);
                                        if (e0s0Var.h) {
                                            x340Var.i0(-2086427746);
                                            String str2 = e0s0Var.b;
                                            if (i5 == 2048) {
                                                z2 = z;
                                            } else {
                                                z2 = false;
                                            }
                                            objT = x340Var.T();
                                            if (!z2 || objT == m4cVar4) {
                                                iu30Var2 = iu30Var;
                                                objT = new g0s0(iu30Var2, (byte) 4);
                                                x340Var.s0(objT);
                                            } else {
                                                iu30Var2 = iu30Var;
                                            }
                                            Function0 function3 = (Function0) objT;
                                            if (i5 != 2048) {
                                                z = false;
                                            }
                                            objT2 = x340Var.T();
                                            if (z || objT2 == m4cVar4) {
                                                objT2 = new g0s0(iu30Var2, (byte) 5);
                                                x340Var.s0(objT2);
                                            }
                                            b7bVar.a(str2, function3, (Function0) objT2, x340Var, (i4 << 3) & 7168);
                                            x340Var.r(false);
                                        } else {
                                            iu30Var2 = iu30Var;
                                            x340Var.i0(-2086224975);
                                            x340Var.r(false);
                                        }
                                    }
                                    m4cVar2 = m4cVar;
                                    objT5 = new g0s0(iu30Var, (byte) 2);
                                    x340Var.s0(objT5);
                                    qim0 qim0VarX5 = bin.x(nim0Var, false, null, null, null, (Function0) objT5, 15);
                                    m4c m4cVar5 = m4cVar2;
                                    uwo1.e(strO1, qim0VarX5, lee1VarA, j, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                                    x340Var.r(true);
                                    if (e0s0Var.i) {
                                        i2 = 2131956907;
                                    } else {
                                        i2 = 2131956906;
                                    }
                                    uwo1.e(cwl1.o0(x340Var, i2), null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                                    x340Var = x340Var;
                                    z = true;
                                    x340Var.r(true);
                                    x340Var.r(true);
                                    if (e0s0Var.g) {
                                        x340Var.i0(1992839700);
                                        qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                                        mta mtaVar2 = cbx.b(x340Var).d;
                                        qim0 qim0VarB2 = u291.b(0.0f, 56.0f, 1, qim0VarF3);
                                        if (i5 == 2048) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        objT3 = x340Var.T();
                                        if (z3) {
                                            objT3 = new g0s0(iu30Var, (byte) 3);
                                            x340Var.s0(objT3);
                                        } else {
                                            objT3 = new g0s0(iu30Var, (byte) 3);
                                            x340Var.s0(objT3);
                                        }
                                        qim0 qim0VarX6 = uyn1.x(bin.x(qim0VarB2, false, null, null, null, (Function0) objT3, 15), 16.0f);
                                        jw31 jw31VarA2 = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var, 48);
                                        int iHashCode7 = Long.hashCode(x340Var.T);
                                        xos0 xos0VarM7 = x340Var.m();
                                        qim0 qim0VarE7 = zr7.E(x340Var, qim0VarX6);
                                        x340Var.m0();
                                        if (x340Var.S) {
                                            x340Var.l(function2);
                                        } else {
                                            x340Var.v0();
                                        }
                                        nko1.H(jw31VarA2, x340Var, lljVar4);
                                        nko1.H(xos0VarM7, x340Var, lljVar3);
                                        x0d.q(iHashCode7, x340Var, lljVar2, x340Var);
                                        nko1.H(qim0VarE7, x340Var, lljVar);
                                        tkx tkxVar2 = tkx.c;
                                        long j3 = cbx.a(x340Var).b.a;
                                        zov0 zov0Var2 = cbx.b(x340Var).g;
                                        w0h1.a(tkxVar2, isl.a, u291.r(nim0Var, 24.0f), j3, 0L, false, x340Var, tkx.d | 48, 48);
                                        uwo1.e(cwl1.n0(2131956942, new Object[]{e0s0Var.b}, x340Var), null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                                        x340Var = x340Var;
                                        z = true;
                                        x340Var.r(true);
                                        x340Var.r(false);
                                    } else {
                                        x340Var.i0(1993682683);
                                        x340Var.r(false);
                                    }
                                    x340Var.r(z);
                                    if (e0s0Var.h) {
                                        x340Var.i0(-2086427746);
                                        String str3 = e0s0Var.b;
                                        if (i5 == 2048) {
                                            z2 = z;
                                        } else {
                                            z2 = false;
                                        }
                                        objT = x340Var.T();
                                        if (z2) {
                                            iu30Var2 = iu30Var;
                                            objT = new g0s0(iu30Var2, (byte) 4);
                                            x340Var.s0(objT);
                                        } else {
                                            iu30Var2 = iu30Var;
                                            objT = new g0s0(iu30Var2, (byte) 4);
                                            x340Var.s0(objT);
                                        }
                                        Function0 function4 = (Function0) objT;
                                        if (i5 != 2048) {
                                            z = false;
                                        }
                                        objT2 = x340Var.T();
                                        if (z) {
                                            objT2 = new g0s0(iu30Var2, (byte) 5);
                                            x340Var.s0(objT2);
                                        } else {
                                            objT2 = new g0s0(iu30Var2, (byte) 5);
                                            x340Var.s0(objT2);
                                        }
                                        b7bVar.a(str3, function4, (Function0) objT2, x340Var, (i4 << 3) & 7168);
                                        x340Var.r(false);
                                    } else {
                                        iu30Var2 = iu30Var;
                                        x340Var.i0(-2086224975);
                                        x340Var.r(false);
                                    }
                                } else {
                                    iu30Var2 = iu30Var;
                                    x340Var.b0();
                                }
                                h311 h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new etg0(e0s0Var, pkpVar, b7bVar, iu30Var2, i, (byte) 27);
                                }
                            }

                            public static final void k(c380 c380Var, hmq hmqVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
                                qim0 qim0Var2;
                                x340 x340Var = (x340) b0kVar;
                                x340Var.k0(-600751773);
                                int i2 = i | (x340Var.i(c380Var) ? 4 : 2) | (x340Var.i(hmqVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
                                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                                    i6o0 i6o0VarQ = k1o1.q(x340Var);
                                    qim0 qim0Var3 = nim0.a;
                                    qim0 qim0VarF = u291.f(bmq0.L(qim0Var3, i6o0VarQ, (g6o0) null), 1.0f);
                                    WeakHashMap weakHashMap = osl1.x;
                                    vk80 vk80VarC = hqq0.C(lhc.g(x340Var).g, x340Var);
                                    boolean zI = x340Var.i(c380Var) | x340Var.i(hmqVar) | ((i2 & 896) == 256);
                                    Object objT = x340Var.T();
                                    if (zI || objT == fkj0.X) {
                                        objT = new ozu0(c380Var, iu30Var, hmqVar, (byte) 16);
                                        x340Var.s0(objT);
                                    }
                                    s3o1.d(qim0VarF, null, vk80VarC, null, null, null, false, null, (iu30) objT, x340Var, 0, 506);
                                    qim0Var2 = qim0Var3;
                                } else {
                                    x340Var.b0();
                                    qim0Var2 = qim0Var;
                                }
                                h311 h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new pby0(c380Var, hmqVar, iu30Var, qim0Var2, i, (byte) 2);
                                }
                            }

                            public static final void l(yj41 yj41Var, gjn gjnVar, int i, float f, float f2, float f3, Function0 function0, int i2, boolean z, boolean z2, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i3) {
                                int i4;
                                ven0 ven0Var;
                                x340 x340Var;
                                boolean z3;
                                ven0 ven0VarB;
                                x340 x340Var2;
                                float f4;
                                x340 x340Var3 = (x340) b0kVar;
                                x340Var3.k0(-242619592);
                                int i5 = i3 | (x340Var3.i(yj41Var) ? 4 : 2) | (x340Var3.g(gjnVar) ? 32 : 16) | (x340Var3.e(i) ? 256 : 128) | (x340Var3.d(f) ? 2048 : 1024) | (x340Var3.d(f2) ? 16384 : 8192) | (x340Var3.d(f3) ? 131072 : 65536) | (x340Var3.e(i2) ? 8388608 : 4194304) | (x340Var3.h(z) ? 67108864 : 33554432) | (x340Var3.h(z2) ? 536870912 : 268435456);
                                int i6 = (x340Var3.i(function1) ? (char) 4 : (char) 2) | (x340Var3.i(function2) ? ' ' : (char) 16) | (x340Var3.g(qim0Var) ? (char) 256 : (char) 128);
                                if (x340Var3.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i6 & 147) == 146) ? false : true)) {
                                    boolean z4 = i == 0;
                                    boolean z5 = i2 > 0;
                                    if (z5) {
                                        i4 = (i * 33) + 150;
                                    } else {
                                        i4 = i >= 7 ? CtaType.CTA_CANT_ATTEND_FIELD_NUMBER : ((i % 4) + 1) * 100;
                                    }
                                    x340Var3.i0(-1521433568);
                                    ceo ceoVar = x6f1.a;
                                    int i7 = i4;
                                    ven0 ven0VarB2 = B(i, i2, i7, z, z2, "coverPos", z5 ? CtaType.SEE_ALL_SHOWS_FIELD_NUMBER : 1000, z5 ? x6f1.b : x6f1.a, x340Var3);
                                    if (z5) {
                                        x340Var3.i0(372541456);
                                        ven0Var = ven0VarB2;
                                        ven0VarB = B(i, i2, i7, z, z2, "coverAlpha", 100, x6f1.c, x340Var3);
                                        x340Var = x340Var3;
                                        z3 = false;
                                        x340Var.r(false);
                                    } else {
                                        ven0Var = ven0VarB2;
                                        x340Var = x340Var3;
                                        z3 = false;
                                        x340Var.i0(372649119);
                                        x340Var.r(false);
                                        ven0VarB = null;
                                    }
                                    pdn pdnVar = new pdn(ven0Var, ven0VarB);
                                    x340Var.r(z3);
                                    yk4 yk4Var = new yk4(yj41Var.a);
                                    cbx.a.getClass();
                                    ecx ecxVarA = uwr.a();
                                    qim0 qim0VarC = eqr0.C(qim0Var, (gjnVar.a / 267.0f) * f, ((gjnVar.b / 267.0f) * f) + f3);
                                    int i8 = i5 & 7168;
                                    boolean zG = (i8 == 2048 ? true : z3) | ((i5 & 112) == 32 ? true : z3) | ((29360128 & i5) == 8388608 ? true : z3) | x340Var.g(pdnVar) | ((458752 & i5) == 131072 ? true : z3) | x340Var.h(z4) | ((i6 & 14) == 4 ? true : z3) | ((i6 & 112) == 32 ? true : z3) | ((i5 & 896) == 256 ? true : z3);
                                    if ((57344 & i5) == 16384) {
                                        z3 = true;
                                    }
                                    boolean z6 = z3 | zG;
                                    Object objT = x340Var.T();
                                    if (z6 || objT == fkj0.X) {
                                        boolean z7 = z4;
                                        x340Var2 = x340Var;
                                        f4 = f;
                                        p6f1 p6f1Var = new p6f1(f4, gjnVar, function0, i2, pdnVar, f3, z7, function1, function2, i, f2);
                                        x340Var2.s0(p6f1Var);
                                        objT = p6f1Var;
                                    } else {
                                        x340Var2 = x340Var;
                                        f4 = f;
                                    }
                                    x340Var3 = x340Var2;
                                    eso1.f(yk4Var, isl.a, lrn1.x(i541.C(qim0VarC, (iu30) objT), k6f1.a.size() - i), new p3v(f4), (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, x340Var3, i8 | 24624, 448);
                                } else {
                                    x340Var3.b0();
                                }
                                h311 h311VarV = x340Var3.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new q6f1(yj41Var, gjnVar, i, f, f2, f3, function0, i2, z, z2, function1, function2, qim0Var, i3);
                                }
                            }

                            public static final void m(int i, int i2, Function0 function0, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z, boolean z2) {
                                j2i j2iVar2;
                                gra graVar = een.e;
                                x340 x340Var = (x340) b0kVar;
                                x340Var.k0(399808061);
                                int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.g(qim0Var) ? 16384 : 8192);
                                if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
                                    gfh0 gfh0VarC = t1c.c(graVar, false);
                                    int iHashCode = Long.hashCode(x340Var.T);
                                    xos0 xos0VarM = x340Var.m();
                                    qim0 qim0VarE = zr7.E(x340Var, qim0Var);
                                    hzj.A.getClass();
                                    if (x340Var.a == null) {
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
                                    if (z2) {
                                        x340Var.i0(-1965673229);
                                        j2iVar2 = j2iVar;
                                        b(i, z, function0, j2iVar2, x340Var, (i3 & 126) | 28032);
                                        x340Var.r(false);
                                    } else {
                                        x340Var.i0(-1965439427);
                                        j2iVar2 = j2iVar;
                                        j2iVar2.invoke(Integer.valueOf(i), x340Var, Integer.valueOf((i3 & 14) | 48));
                                        x340Var.r(false);
                                    }
                                    x340Var.r(true);
                                } else {
                                    j2iVar2 = j2iVar;
                                    x340Var.b0();
                                }
                                h311 h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new bmg(function0, qim0Var, z, z2, j2iVar2, i, i2);
                                }
                            }

                            public static final int n(int i) {
                                if (i == 1) {
                                    return 2;
                                }
                                if (i != 2) {
                                    return i != 3 ? 1 : 4;
                                }
                                return 3;
                            }

                            public static final vwh0 o(w2z w2zVar, p7s p7sVar, String str) {
                                return new vwh0(w2zVar, p7sVar, str);
                            }

                            public static final void p(c9n c9nVar, CancellationException cancellationException) {
                                faa0 faa0VarA = c9nVar.J().A(fkj0.W0);
                                if (faa0VarA != null) {
                                    faa0VarA.d(cancellationException);
                                } else {
                                    hhg1.o(c9nVar, "Scope cannot be cancelled because it does not have a job: ");
                                }
                            }

                            public static void r(c9n c9nVar, String str) {
                                p(c9nVar, lgo1.b(str, null));
                            }

                            public static final Object s(vu30 vu30Var, lnm lnmVar) {
                                fn41 fn41Var = new fn41(lnmVar, lnmVar.getContext());
                                return wgo1.E(fn41Var, true, fn41Var, vu30Var);
                            }

                            public static final void t(c9n c9nVar) {
                                op71.x(c9nVar.J());
                            }

                            public static final boolean u(c9n c9nVar) {
                                faa0 faa0VarA = c9nVar.J().A(fkj0.W0);
                                if (faa0VarA != null) {
                                    return faa0VarA.isActive();
                                }
                                return true;
                            }

                            public static final boolean v(iix0 iix0Var) {
                                if (iix0Var == null) {
                                    return false;
                                }
                                if (iix0Var instanceof hix0) {
                                    return ((hix0) iix0Var).a;
                                }
                                if (!(iix0Var instanceof gix0)) {
                                    eg.o();
                                    return false;
                                }
                                gix0 gix0Var = (gix0) iix0Var;
                                long j = gix0Var.b;
                                return j > 0 && gix0Var.c >= j;
                            }

                            public static final boolean w(Uri uri) {
                                Set set = s4b1.f;
                                return uic.x(uri.toString()).c == blc0.ti;
                            }

                            public static String x(String str, String str2) {
                                int length = str.length() - str2.length();
                                if (length < 0 || length > 1) {
                                    hhg1.n("Invalid input received");
                                    return null;
                                }
                                StringBuilder sb = new StringBuilder(str2.length() + str.length());
                                for (int i = 0; i < str.length(); i++) {
                                    sb.append(str.charAt(i));
                                    if (str2.length() > i) {
                                        sb.append(str2.charAt(i));
                                    }
                                }
                                return sb.toString();
                            }

                            public static final Map y(Uri uri) {
                                String string = uri.toString();
                                int iV0 = ihc1.v0(string, '?', 0, 6);
                                if (iV0 < 0 || iV0 >= string.length() - 1) {
                                    return b7x.a;
                                }
                                List listQ0 = ihc1.Q0(string.substring(iV0 + 1), new String[]{"&"}, 0, 6);
                                ArrayList arrayList = new ArrayList();
                                Iterator it = listQ0.iterator();
                                while (it.hasNext()) {
                                    List listQ1 = ihc1.Q0((String) it.next(), new String[]{"="}, 2, 2);
                                    mmr0 mmr0Var = listQ1.size() == 2 ? new mmr0(Uri.decode((String) listQ1.get(0)), Uri.decode((String) listQ1.get(1))) : null;
                                    if (mmr0Var != null) {
                                        arrayList.add(mmr0Var);
                                    }
                                }
                                return sqg0.T(arrayList);
                            }

                            public static final Class z(Type type) {
                                if (type instanceof Class) {
                                    return (Class) type;
                                }
                                if (type instanceof ParameterizedType) {
                                    return z(((ParameterizedType) type).getRawType());
                                }
                                if (type instanceof WildcardType) {
                                    return z((Type) f46.j0(((WildcardType) type).getUpperBounds()));
                                }
                                if (type instanceof GenericArrayType) {
                                    return z(((GenericArrayType) type).getGenericComponentType());
                                }
                                StringBuilder sb = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
                                sb.append(type);
                                sb.append(" has type ");
                                hhg1.n(us71.f(rc11.a, type.getClass(), sb));
                                return null;
                            }
                        }
