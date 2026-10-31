package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.device_context.v1.DeviceIdentity;
import com.spotify.device_context.v1.ReportedAttributes;
import com.spotify.device_context.v1.TargetDevice;
import com.spotify.libraryimportservice.tmm.ItemAlternative;
import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import com.spotify.ubiquity.v1.ExternalAccessoryDescription;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class r4o1 {
    public static final uh31 a = new uh31(0.16f, 0.1f, 0.08f, 0.1f);
    public static b180 b;

    public static final void A(vzq0 vzq0Var, d0r d0rVar, hvp0 hvp0Var, zob1 zob1Var, hw2 hw2Var, mjm mjmVar, xyf1 xyf1Var, r6h1 r6h1Var, iac0 iac0Var, kkw0 kkw0Var, fos fosVar, cm0 cm0Var, xzq xzqVar, qim0 qim0Var, b0k b0kVar, int i) {
        ng5 ng5Var = ng5.a1;
        ng5 ng5Var2 = ng5.Z0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(607002404);
        int i2 = i | (x340Var.g(vzq0Var) ? 4 : 2) | (x340Var.i(d0rVar) ? 32 : 16) | (x340Var.i(hvp0Var) ? 256 : 128) | (x340Var.i(zob1Var) ? 2048 : 1024) | (x340Var.i(hw2Var) ? 16384 : 8192) | (x340Var.i(mjmVar) ? 131072 : 65536) | (x340Var.g(xyf1Var) ? 1048576 : 524288) | (x340Var.i(r6h1Var) ? 8388608 : 4194304) | (x340Var.i(iac0Var) ? 67108864 : 33554432);
        int i3 = 72 | (x340Var.i(fosVar) ? 4 : 2) | (x340Var.i(cm0Var) ? 32 : 16) | (x340Var.i(xzqVar) ? 256 : 128) | (x340Var.i(ng5Var) ? 2048 : 1024) | (x340Var.i(ng5Var2) ? 16384 : 8192) | (x340Var.g(qim0Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 74899) == 74898) ? false : true)) {
            w2g0.c(qim0Var, (tl3) null, apo.r(1895212922, new cdh1(vzq0Var, hvp0Var, zob1Var, xyf1Var, d0rVar, iac0Var, kkw0Var, mjmVar, r6h1Var, hw2Var, fosVar, cm0Var, xzqVar, (Context) x340Var.k(AndroidCompositionLocals_androidKt.b)), x340Var), x340Var, ((i3 >> 15) & 14) | 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new woq0(vzq0Var, d0rVar, hvp0Var, zob1Var, hw2Var, mjmVar, xyf1Var, r6h1Var, iac0Var, kkw0Var, fosVar, cm0Var, xzqVar, qim0Var, i, (byte) 2);
        }
    }

    public static final void B(float f, zud zudVar, zud zudVar2, long j, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1708922158);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(zudVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(zudVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.f(j) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= x340Var.h(z) ? 131072 : 65536;
        }
        int i4 = i3;
        if (!x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            x340Var.b0();
            qim0Var2 = qim0Var;
        } else {
            if (zudVar == null && zudVar2 == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vud(f, zudVar, zudVar2, j, z, i);
                    return;
                }
                return;
            }
            boolean z2 = z && (zudVar == null || zudVar2 == null);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            pw31 pw31Var = pw31.a;
            if (zudVar != null) {
                x340Var.i0(-527491064);
                y4o1.j(zudVar, j, f, z2 ? u291.f(qim0Var3, 1.0f) : pw31Var.a(0.5f, qim0Var3, true), x340Var, ((i4 >> 3) & 14) | ((i4 >> 6) & 112) | ((i4 << 6) & 896));
                x340Var.r(false);
            } else if (z2) {
                x340Var.i0(-527216652);
                x340Var.r(false);
            } else {
                x340Var.i0(-527268546);
                op71.g(x340Var, pw31Var.a(0.5f, qim0Var3, true));
                x340Var.r(false);
            }
            if (z2) {
                x340Var.i0(-527128364);
                x340Var.r(false);
            } else {
                x340Var.i0(-527190829);
                op71.g(x340Var, u291.v(qim0Var3, oto1.w(f, 24, x340Var)));
                x340Var.r(false);
            }
            if (zudVar2 != null) {
                x340Var.i0(-527098201);
                y4o1.j(zudVar2, j, f, z2 ? u291.f(qim0Var3, 1.0f) : pw31Var.a(0.5f, qim0Var3, true), x340Var, ((i4 >> 6) & 126) | ((i4 << 6) & 896));
                x340Var.r(false);
            } else if (z2) {
                x340Var.i0(-526822828);
                x340Var.r(false);
            } else {
                x340Var.i0(-526874722);
                op71.g(x340Var, pw31Var.a(0.5f, qim0Var3, true));
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new wud(f, zudVar, zudVar2, j, qim0Var2, z, i);
        }
    }

    public static final void C(t5t0 t5t0Var, float f, float f2, float f3, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-441304504);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(t5t0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(f3) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float fN0 = ((wat) x340Var.k(t4k.h)).N0(f) * t5t0Var.g;
            int i3 = (int) (3.0f * f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, fN0);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
            Uri uri = Uri.parse(t5t0Var.b);
            String str = t5t0Var.c;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new axj(t5t0Var, f2, f3);
                x340Var.s0(objT);
            }
            iko1.f(uri, i3, i541.C(qim0VarD, (iu30) objT), str, x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wvb1(t5t0Var, f, f2, f3, i);
        }
    }

    public static final void D(c380 c380Var, float f, float f2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(788276804);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | (x340Var.d(f2) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float f3 = f * 0.33783785f;
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, 637822237, c380Var);
            while (itN.hasNext()) {
                C((t5t0) itN.next(), f3, f, f2, x340Var, (i2 << 3) & 8064);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c3c(c380Var, f, f2, qim0Var, i, (byte) 3);
        }
    }

    public static final void E(c380 c380Var, n511 n511Var, n511 n511Var2, bv30 bv30Var, Function0 function0, vu30 vu30Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        long jFloatToRawIntBits;
        float f;
        Object yvb1Var;
        char c;
        c380 c380Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2136550790);
        Function0 function1 = function0;
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.i(n511Var) ? 32 : 16) | (x340Var.i(n511Var2) ? 256 : 128) | (x340Var.i(bv30Var) ? 2048 : 1024) | (x340Var.i(function1) ? 16384 : 8192) | (x340Var.i(vu30Var) ? 131072 : 65536) | (x340Var.i(iu30Var) ? 1048576 : 524288) | (x340Var.i(qim0Var) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objT = x340Var.T();
            n511 n511Var3 = n511.e;
            if (objT == m4cVar) {
                objT = v8r.q(n511Var3);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            wat watVar = (wat) x340Var.k(t4k.h);
            float f2 = 0.33783785f * (n511Var.c - n511Var.a);
            float fX0 = watVar.X0(16.0f);
            float fX1 = watVar.X0(64.0f);
            n511 n511Var4 = (n511) ven0Var.getValue();
            if (n511Var.equals(n511Var3) || u890.j(n511Var4, n511Var3)) {
                jFloatToRawIntBits = 0;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n511Var.f() >> 32)) - Float.intBitsToFloat((int) (n511Var4.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n511Var.f() & 4294967295L)) - Float.intBitsToFloat((int) (n511Var4.f() & 4294967295L)))) & 4294967295L);
            }
            boolean zI = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new ry71(ven0Var, (byte) 10);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = ern1.x(qim0Var, (iu30) objT2);
            boolean zD = ((i2 & 14) == 4) | x340Var.d(f2) | x340Var.d(fX0) | x340Var.d(fX1) | x340Var.f(jFloatToRawIntBits) | x340Var.i(n511Var);
            Object objT3 = x340Var.T();
            if (zD || objT3 == m4cVar) {
                f = fX1;
                c = 0;
                c380Var2 = c380Var;
                yvb1Var = new yvb1(c380Var2, f2, fX0, f, jFloatToRawIntBits, n511Var);
                x340Var.s0(yvb1Var);
            } else {
                f = fX1;
                yvb1Var = objT3;
                c = 0;
                c380Var2 = c380Var;
            }
            gfh0 gfh0Var = (gfh0) yvb1Var;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, 1926387629, c380Var2);
            int i3 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                t5t0 t5t0Var = (t5t0) next;
                boolean zE = ((
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01f3: ARITH (r5v14 'zE' boolean) = (wrap boolean:?: TERNARY null = ((wrap int:0x01e6: ARITH (r19v0 int) & (7168 int) A[WRAPPED] (LINE:487)) == (2048 int)) ? true : false) | (wrap boolean:0x01ef: INVOKE (r9v1 'x340Var' p.x340), (r0v22 'i3' int) VIRTUAL call: p.x340.e(int):boolean A[WRAPPED] (LINE:496)) A[DECLARE_VAR] (LINE:500) in method: p.r4o1.E(p.c380, p.n511, p.n511, p.bv30, kotlin.jvm.functions.Function0, p.vu30, p.iu30, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
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
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v0 int
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 641
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.r4o1.E(p.c380, p.n511, p.n511, p.bv30, kotlin.jvm.functions.Function0, p.vu30, p.iu30, p.qim0, p.b0k, int):void");
            }

            public static final void F(y86 y86Var, b0k b0kVar, int i) {
                int i2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(2075342598);
                int i3 = i & 6;
                pbh pbhVar = pbh.a;
                if (i3 == 0) {
                    i2 = (x340Var.i(pbhVar) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.i(y86Var) ? 32 : 16;
                }
                if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarA = pbhVar.a(1.0f, nim0Var, true);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    uwo1.e(y86Var.c, exd0.s(i541.C(uyn1.x(qim0VarD, 16.0f), t16.e), t16.f), cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new du0((Object) y86Var, i, (byte) 4);
                }
            }

            public static final void G(int i, String str, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
                int i2;
                j2i j2iVar2;
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1850989985);
                if ((i & 6) == 0) {
                    i2 = i | (x340Var.g(str) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.i(j2iVar) ? 32 : 16;
                }
                int i3 = i2 | 384;
                if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var).e;
                    long j = cbx.a(x340Var).b.a;
                    qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    j2iVar2 = j2iVar;
                    uwo1.e(str, uyn1.B(qim0VarF2, 16.0f, 16.0f, 16.0f, 0.0f, 8), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, i3 & 14, 0, 2032);
                    dv20.l((i3 >> 3) & 14, j2iVar2, x340Var, true);
                    qim0Var2 = qim0Var3;
                } else {
                    j2iVar2 = j2iVar;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yw2(str, j2iVar2, qim0Var2, i);
                }
            }

            public static final List K(bro1 bro1Var) {
                return bro1Var instanceof vk7 ? Collections.singletonList(iab.a) : z6x.a;
            }

            public static final int L(psk pskVar) {
                int iOrdinal = pskVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return 1;
                }
                if (iOrdinal == 2) {
                    return 2;
                }
                eg.o();
                return 0;
            }

            public static final l2r0 M(psk pskVar) {
                int iOrdinal = pskVar.ordinal();
                if (iOrdinal == 0) {
                    return l2r0.c;
                }
                if (iOrdinal == 1) {
                    return l2r0.a;
                }
                if (iOrdinal == 2) {
                    return l2r0.b;
                }
                eg.o();
                return null;
            }

            public static final rxx0 N(chr0 chr0Var) {
                int iOrdinal = chr0Var.ordinal();
                if (iOrdinal == 0) {
                    return rxx0.a;
                }
                if (iOrdinal == 1) {
                    return rxx0.b;
                }
                if (iOrdinal == 2) {
                    return rxx0.c;
                }
                eg.o();
                return null;
            }

            public static final TargetDevice O(nnr nnrVar) {
                String str;
                ExternalAccessoryDescription externalAccessoryDescription = null;
                if (nnrVar == null) {
                    return null;
                }
                krd1 krd1VarN = TargetDevice.n();
                pm21 pm21VarN = ReportedAttributes.n();
                pm21VarN.n(nnrVar.c.name());
                krd1VarN.q(pm21VarN.build());
                kx7 kx7Var = nnrVar.B.a;
                if (!kx7Var.b()) {
                    k210 k210VarN = ExternalAccessoryDescription.n();
                    up7 up7Var = kx7Var.e;
                    int i = up7Var != null ? up7Var.a : 0;
                    int i2 = i == 0 ? -1 : fmm.a[l1d.C(i)];
                    String str2 = "";
                    if (i2 == 1) {
                        str = "car";
                    } else if (i2 == 2) {
                        str = "headphones";
                    } else if (i2 == 3) {
                        str = "speaker";
                    } else if (i2 != 4) {
                        str = i2 != 5 ? "" : "face_wearable";
                    } else {
                        str = "wearable";
                    }
                    k210VarN.n(str);
                    int iOrdinal = kx7Var.d.ordinal();
                    if (iOrdinal == 1) {
                        str2 = "aux";
                    } else if (iOrdinal == 2) {
                        str2 = "bluetooth_or_usb";
                    } else if (iOrdinal == 3) {
                        str2 = "bluetooth";
                    }
                    k210VarN.q(str2);
                    externalAccessoryDescription = (ExternalAccessoryDescription) k210VarN.build();
                }
                if (externalAccessoryDescription != null) {
                    pqt pqtVarN = DeviceIdentity.n();
                    pqtVarN.n(externalAccessoryDescription);
                    krd1VarN.n(pqtVarN.build());
                }
                return krd1VarN.build();
            }

            public static final vw21 P(iu30 iu30Var, Set set, vu30 vu30Var, vu30 vu30Var2) {
                return new vw21(new hws(iu30Var, (byte) 23), Collections.singletonMap(rih1.a, set), new k7f((byte) 13, vu30Var, false), vu30Var2, (vu30) null);
            }

            public static vw21 Q(iu30 iu30Var, Set set, vu30 vu30Var, vu30 vu30Var2) {
                return new vw21(new hws(iu30Var, (byte) 24), Collections.singletonMap(rih1.a, set), new fc3(vu30Var, (byte) 5), vu30Var2, urw.t);
            }

            public static final void R(upx0 upx0Var, String str, boolean z, Resources resources, iu30 iu30Var) {
                if (upx0Var instanceof spx0) {
                    boolean z2 = str.length() > 2000;
                    if (z2 && !z) {
                        int length = str.length() - 2000;
                        int i = length >= 0 ? length : 0;
                        iu30Var.invoke(new z76(str, new m46(resources.getQuantityString(2131820574, i, Integer.valueOf(i)))));
                    } else {
                        if (z2 || !z) {
                            return;
                        }
                        iu30Var.invoke(new a86(str));
                    }
                }
            }

            public static final boolean S(float f, float f2, float f3, n511 n511Var, n511 n511Var2, float f4) {
                n511 n511Var3 = n511.e;
                if (n511Var2.equals(n511Var3) || n511Var.equals(n511Var3)) {
                    return false;
                }
                float fE = l1d.e(n511Var.c, n511Var.a, f, Float.intBitsToFloat((int) (n511Var.f() >> 32)));
                float fE2 = l1d.e(n511Var.d, n511Var.b, f2, Float.intBitsToFloat((int) (n511Var.f() & 4294967295L)));
                float f5 = (f4 / 2.0f) * f3;
                float f6 = fE - f5;
                float f7 = fE2 - f5;
                float f8 = fE + f5;
                float f9 = fE2 + f5;
                return (n511Var2.a < f8) & (f6 < n511Var2.c) & (f7 < n511Var2.d) & (n511Var2.b < f9);
            }

            public static final uvx T(b0k b0kVar) {
                uwr uwrVar = cbx.a;
                float f = cbx.b(b0kVar).e.b;
                cvx cvxVar = cbx.b(b0kVar).b;
                zzq0 zzq0Var = new zzq0(f, 12.0f, f, 12.0f);
                zov0 zov0Var = cbx.b(b0kVar).g;
                return new uvx(0, (pgx) null, 0, zzq0Var, (zzq0) null, (tvx) null, (hw61) null, 0, new p3v(48.0f), 247);
            }

            public static final boolean U(udx0 udx0Var) {
                return V(udx0Var).equals(udx0Var.b) && !udx0Var.c;
            }

            public static final String V(udx0 udx0Var) {
                Set set = s4b1.f;
                String strS = uic.x(udx0Var.a).s();
                strS.getClass();
                return strS;
            }

            public static final int W(long j) {
                return Color.argb((int) (u7h.c(j) * 255.0f), (int) (u7h.g(j) * 255.0f), (int) (u7h.f(j) * 255.0f), (int) (u7h.d(j) * 255.0f));
            }

            public static final fc3 X(vu30 vu30Var) {
                return new fc3(vu30Var, (byte) 5);
            }

            public static void Y(int i, int i2) {
                String strX;
                if (i < 0 || i >= i2) {
                    if (i < 0) {
                        strX = y4o1.x("%s (%s) must not be negative", "index", Integer.valueOf(i));
                    } else {
                        if (i2 < 0) {
                            hhg1.n(f4i1.c(i2, "negative size: "));
                            return;
                        }
                        strX = y4o1.x("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
                    }
                    throw new IndexOutOfBoundsException(strX);
                }
            }

            public static void Z(int i, int i2) {
                if (i < 0 || i > i2) {
                    eg.g(b0(i, i2, "index"));
                }
            }

            public static final void a(fqh1 fqh1Var, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1462893055);
                int i2 = i | (x340Var.i(fqh1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(function2) ? 2048 : 1024);
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    boolean z = (i2 & 112) == 32;
                    Object objT = x340Var.T();
                    if (z || objT == fkj0.X) {
                        objT = new to1(function0, (lnm) null, (byte) 1);
                        x340Var.s0(objT);
                    }
                    qxd0.t(rih1.a, x340Var, (vu30) objT);
                    String str = fqh1Var.a;
                    String str2 = fqh1Var.b;
                    String str3 = fqh1Var.c;
                    z50 z50Var = z50.c;
                    mqo1.d(function2, null, null, str, str2, new zgx(str3, new gbx(z50Var, function1)), new zgx(fqh1Var.d, new gbx(z50Var, function2)), x340Var, ((i2 >> 9) & 14) | 2359296, 6);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new x2(i, (Object) fqh1Var, (Object) function0, (Object) function1, (Object) function2, (byte) 29);
                }
            }

            public static void a0(int i, int i2, int i3) {
                String strB0;
                if (i < 0 || i2 < i || i2 > i3) {
                    if (i < 0 || i > i3) {
                        strB0 = b0(i, i3, "start index");
                    } else {
                        strB0 = (i2 < 0 || i2 > i3) ? b0(i2, i3, "end index") : y4o1.x("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                    }
                    throw new IndexOutOfBoundsException(strB0);
                }
            }

            public static final void b(String str, nm6 nm6Var, d0r d0rVar, hw2 hw2Var, kt91 kt91Var, vzq0 vzq0Var, qim0 qim0Var, b0k b0kVar, int i) throws Throwable {
                Object bdh1Var;
                Throwable th;
                nm6 nm6Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(55822429);
                int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(nm6Var) ? 32 : 16) | (x340Var.i(d0rVar) ? 256 : 128) | (x340Var.i(hw2Var) ? 2048 : 1024) | (x340Var.i(kt91Var) ? 16384 : 8192) | (x340Var.g(vzq0Var) ? 131072 : 65536);
                if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
                    String strO0 = cwl1.o0(x340Var, 2131962690);
                    boolean zI = ((i2 & 112) == 32) | x340Var.i(kt91Var) | x340Var.g(strO0);
                    Object objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        th = null;
                        nm6Var2 = nm6Var;
                        bdh1Var = new bdh1(nm6Var2, kt91Var, strO0, (lnm) null, (byte) 0);
                        x340Var.s0(bdh1Var);
                    } else {
                        nm6Var2 = nm6Var;
                        bdh1Var = objT;
                        th = null;
                    }
                    qxd0.t(nm6Var2, x340Var, (vu30) bdh1Var);
                    qim0 qim0VarN = anm1.N("artists_dna_list_root", qim0Var);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
                    hzj.A.getClass();
                    if (x340Var.a == null) {
                        tgp1.p();
                        throw th;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    i1o1.e(hw2Var, new dl6(str, zhm0.f, uyn1.j(0.0f, 0.0f, 0.0f, vzq0Var.a(), 7)), d0rVar, null, null, poj.c, null, 0, null, x340Var, ((i2 >> 9) & 14) | 196672 | (i2 & 896), 236);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ydi0((Object) str, (Object) nm6Var, (Object) d0rVar, (Object) hw2Var, (Object) kt91Var, (Object) vzq0Var, (Object) qim0Var, i, (byte) 22);
                }
            }

            public static String b0(int i, int i2, String str) {
                if (i < 0) {
                    return y4o1.x("%s (%s) must not be negative", str, Integer.valueOf(i));
                }
                if (i2 >= 0) {
                    return y4o1.x("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                }
                hhg1.n(f4i1.c(i2, "negative size: "));
                return null;
            }

            public static final void c(String str, ItemAlternative itemAlternative, String str2, p410 p410Var, b0k b0kVar, int i) {
                m4c m4cVar = fkj0.X;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(895637379);
                int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(itemAlternative) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(p410Var) ? 2048 : 1024);
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    int i3 = i2 & 7168;
                    int i4 = i2 & 14;
                    boolean z = (i3 == 2048) | (i4 == 4);
                    Object objT = x340Var.T();
                    if (z || objT == m4cVar) {
                        objT = rqt0.u(new ld2((xe01) p410Var.h, str, (byte) 23));
                        x340Var.s0(objT);
                    }
                    ven0 ven0VarJ = f4p1.j((mr20) objT, (Object) null, (iac0) null, x340Var, 48, 14);
                    boolean z2 = (i4 == 4) | (i3 == 2048);
                    Object objT2 = x340Var.T();
                    if (z2 || objT2 == m4cVar) {
                        objT2 = new uah0(p410Var, str, (byte) 0);
                        x340Var.s0(objT2);
                    }
                    qxd0.i(str, (iu30) objT2, x340Var);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    qim0 qim0VarR = u291.r(nim0.a, 48.0f);
                    boolean z3 = (i4 == 4) | (i3 == 2048) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
                    Object objT3 = x340Var.T();
                    if (z3 || objT3 == m4cVar) {
                        k7h0 k7h0Var = new k7h0(p410Var, str, itemAlternative, str2, (byte) 1);
                        x340Var.s0(k7h0Var);
                        objT3 = k7h0Var;
                    }
                    qim0 qim0VarX = bin.x(qim0VarR, false, null, null, null, (Function0) objT3, 15);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
                    t(itemAlternative.getImageUrl(), x340Var, 0);
                    boolean z4 = ((tah0) ven0VarJ.getValue()) != null;
                    tah0 tah0Var = (tah0) ven0VarJ.getValue();
                    if (tah0Var == null) {
                        tah0Var = new tah0((String) null, 15);
                    }
                    d(z4, tah0Var, x340Var, 6);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new w0f0(i, str, itemAlternative, str2, p410Var, (byte) 10);
                }
            }

            /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
            /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
            public static final void d(boolean z, tah0 tah0Var, b0k b0kVar, int i) {
                Object objT;
                drr0 drr0Var;
                o091 o091Var = tah0Var.b;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(386724603);
                int i2 = (x340Var.h(z) ? 32 : 16) | i | (x340Var.g(tah0Var) ? 256 : 128);
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    n091 n091Var = n091.a;
                    boolean z2 = z && u890.j(o091Var, n091Var);
                    m4c m4cVar = fkj0.X;
                    x340Var.i0(173260939);
                    if (z) {
                        long j = tah0Var.d;
                        long j2 = tah0Var.c;
                        if (u890.j(o091Var, n091Var)) {
                            x340Var.i0(-933849705);
                            x340Var.r(false);
                            boolean zF = x340Var.f(j2) | x340Var.f(j);
                            Object objT2 = x340Var.T();
                            if (zF || objT2 == m4cVar) {
                                Long lValueOf = Long.valueOf(j);
                                if (j <= 0) {
                                    lValueOf = null;
                                }
                                long jLongValue = lValueOf != null ? lValueOf.longValue() : 10000L;
                                pkw0 pkw0Var = new pkw0(yoi1.o(j2 / jLongValue, 0.0f, 1.0f), (int) yoi1.r(jLongValue - j2, 0L, 2147483647L));
                                x340Var.s0(pkw0Var);
                                objT2 = pkw0Var;
                            }
                            pkw0 pkw0Var2 = (pkw0) objT2;
                            boolean zG = x340Var.g(pkw0Var2);
                            Object objT3 = x340Var.T();
                            if (zG || objT3 == m4cVar) {
                                objT3 = us71.i(pkw0Var2.a, x340Var);
                            }
                            drr0Var = (drr0) objT3;
                            boolean zG2 = x340Var.g(pkw0Var2) | x340Var.g(drr0Var);
                            Object objT4 = x340Var.T();
                            if (zG2 || objT4 == m4cVar) {
                                objT4 = new tfe0(pkw0Var2, drr0Var, (lnm) null, (byte) 19);
                                x340Var.s0(objT4);
                            }
                            qxd0.t(pkw0Var2, x340Var, (vu30) objT4);
                        } else {
                            x340Var.i0(-933900638);
                            objT = x340Var.T();
                            if (objT == m4cVar) {
                                objT = us71.i(0.0f, x340Var);
                            }
                            drr0Var = (drr0) objT;
                            x340Var.r(false);
                        }
                    } else {
                        x340Var.i0(-933900638);
                        objT = x340Var.T();
                        if (objT == m4cVar) {
                            objT = us71.i(0.0f, x340Var);
                        }
                        drr0Var = (drr0) objT;
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                    h2c h2cVar = h2c.a;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarB = h2cVar.b(nim0Var);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarF = dug.f(qim0VarB, ((vex) zex.a.e).c, d4o1.a);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
                        x340Var.i0(1666362226);
                        long j3 = cbx.a(x340Var).b.a;
                        avw0 avw0Var = cbx.b(x340Var).c;
                        zov0 zov0Var = cbx.b(x340Var).g;
                        qim0 qim0VarR = u291.r(nim0Var, 32.0f);
                        Object objT5 = x340Var.T();
                        if (objT5 == m4cVar) {
                            objT5 = s4h0.a1;
                            x340Var.s0(objT5);
                        }
                        qim0 qim0VarA = s161.a(qim0VarR, (iu30) objT5);
                        boolean zD = x340Var.d(2.0f) | x340Var.f(j3) | x340Var.g(drr0Var);
                        Object objT6 = x340Var.T();
                        if (zD || objT6 == m4cVar) {
                            objT6 = new kuj(j3, drr0Var, (byte) 3);
                            x340Var.s0(objT6);
                        }
                        j0o1.b(0, x340Var, (iu30) objT6, qim0VarA);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(1666972461);
                        x340Var.r(false);
                    }
                    spx spxVar = z2 ? spx.c : xpx.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var, z ? 2131957299 : 2131957288));
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    w0h1.a(spxVar, jslVar, u291.r(nim0Var, 16.0f), 0L, 0L, false, x340Var, 8, 56);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new kf2(z, (Object) tah0Var, i, (byte) 13);
                }
            }

            public static final void e(String str, d0r d0rVar, c380 c380Var, nm6 nm6Var, vzq0 vzq0Var, fos fosVar, kt91 kt91Var, xzq xzqVar, qim0 qim0Var, b0k b0kVar, int i) throws Throwable {
                nm6 nm6Var2;
                Object bdh1Var;
                int i2;
                Throwable th;
                int i3;
                int i4;
                c380 c380Var2 = c380Var;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(451851912);
                int i5 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(d0rVar) ? 32 : 16) | (x340Var.g(c380Var2) ? 256 : 128) | (x340Var.g(nm6Var) ? 2048 : 1024) | (x340Var.g(vzq0Var) ? 16384 : 8192) | (x340Var.i(fosVar) ? 131072 : 65536) | (x340Var.i(kt91Var) ? 1048576 : 524288) | (x340Var.i(xzqVar) ? 8388608 : 4194304);
                if (x340Var.Y(i5 & 1, (38347923 & i5) != 38347922)) {
                    String strO0 = cwl1.o0(x340Var, 2131962692);
                    boolean zI = ((i5 & 7168) == 2048) | x340Var.i(kt91Var) | x340Var.g(strO0);
                    Object objT = x340Var.T();
                    if (zI || objT == fkj0.X) {
                        i2 = 0;
                        th = null;
                        bdh1Var = new bdh1(nm6Var, kt91Var, strO0, (lnm) null, (byte) 1);
                        x340Var.s0(bdh1Var);
                    } else {
                        bdh1Var = objT;
                        i2 = 0;
                        th = null;
                    }
                    qxd0.t(nm6Var, x340Var, (vu30) bdh1Var);
                    qim0 qim0VarB = uyn1.B(anm1.N("artists_dna_list_root", qim0Var), 0.0f, 0.0f, 0.0f, vzq0Var.a(), 7);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, i2);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var.a == null) {
                        tgp1.p();
                        throw th;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    c380Var2 = c380Var;
                    nm6Var2 = nm6Var;
                    i1o1.e(xzqVar, new im6(str, c380Var2, th), d0rVar, null, null, poj.b, null, 0, null, x340Var, ((i5 >> 21) & 14) | 196608 | ((i5 << 3) & 896), 236);
                    if (nm6Var2 instanceof km6) {
                        x340Var = x340Var;
                        x340Var.i0(966811504);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(965953145);
                        wnb0 wnb0Var = new wnb0(1.0f, true);
                        if (nm6Var2 instanceof lm6) {
                            if (((lm6) nm6Var2).a.isEmpty()) {
                                i3 = 2;
                                i4 = 2;
                            }
                            otw.c(fosVar, new asf1(i4, i3), wnb0Var, (ipb1) null, x340Var, 8 | ((i5 >> 15) & 14), 8);
                            x340Var = x340Var;
                            x340Var.r(false);
                        } else if (!(nm6Var2 instanceof mm6) && !u890.j(nm6Var2, km6.a)) {
                            eg.o();
                            return;
                        }
                        i3 = 2;
                        i4 = 1;
                        otw.c(fosVar, new asf1(i4, i3), wnb0Var, (ipb1) null, x340Var, 8 | ((i5 >> 15) & 14), 8);
                        x340Var = x340Var;
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                } else {
                    nm6Var2 = nm6Var;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new zx(str, d0rVar, c380Var2, nm6Var2, vzq0Var, fosVar, kt91Var, xzqVar, qim0Var, i, (byte) 13);
                }
            }

            public static final void f(j2i j2iVar, j2i j2iVar2, vu30 vu30Var, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1070572584);
                int i2 = (x340Var.i(vu30Var) ? 256 : 128) | i;
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    Object objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = td4.e;
                        x340Var.s0(objT);
                    }
                    gfh0 gfh0Var = (gfh0) objT;
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
                    j2iVar.invoke(x340Var, 6);
                    j2iVar2.invoke(x340Var, 6);
                    if (vu30Var != null) {
                        x340Var.i0(-299901414);
                        us71.j((i2 >> 6) & 14, vu30Var, x340Var, false);
                    } else {
                        x340Var.i0(-706998669);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new oj2(j2iVar, j2iVar2, vu30Var, i, (byte) 17);
                }
            }

            public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(57074459);
                int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
                byte b2 = 18;
                if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                    String strO0 = cwl1.o0(x340Var, 2131952427);
                    ldx ldxVar = ldx.c;
                    gdx gdxVarR = yla.r(x340Var);
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    }
                    foo1.c(new gbx(new y50(strO0), function0), ldxVar, anm1.N("artifact-page-customize-prompt-button", u291.f(qim0Var, 1.0f)), jax.a, gdxVarR, null, null, null, null, null, apo.r(-1625707844, new nl(strO0, b2), x340Var), x340Var, 0, 48, 1992);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vd1(function0, qim0Var, i, (byte) 4);
                }
            }

            public static final void h(qim0 qim0Var, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(697613671);
                int i2 = i | 6;
                if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    long jC = cbx.a(x340Var).a.b.c();
                    qim0 qim0Var2 = nim0.a;
                    hr80.d(qim0Var2, 1.0f, jC, x340Var, 6, 0);
                    qim0Var = qim0Var2;
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new b5(qim0Var, i, (byte) 8);
                }
            }

            /* JADX WARN: Code duplicated, block: B:105:0x0238  */
            /* JADX WARN: Code duplicated, block: B:106:0x023b  */
            /* JADX WARN: Code duplicated, block: B:109:0x0249  */
            /* JADX WARN: Code duplicated, block: B:110:0x024b  */
            /* JADX WARN: Code duplicated, block: B:113:0x0251  */
            /* JADX WARN: Code duplicated, block: B:114:0x0253  */
            /* JADX WARN: Code duplicated, block: B:118:0x025d  */
            /* JADX WARN: Code duplicated, block: B:121:0x027a  */
            /* JADX WARN: Code duplicated, block: B:123:0x027e  */
            /* JADX WARN: Code duplicated, block: B:126:0x028d  */
            /* JADX WARN: Code duplicated, block: B:127:0x028f  */
            /* JADX WARN: Code duplicated, block: B:130:0x0295  */
            /* JADX WARN: Code duplicated, block: B:131:0x0297  */
            /* JADX WARN: Code duplicated, block: B:134:0x029b  */
            /* JADX WARN: Code duplicated, block: B:135:0x029d  */
            /* JADX WARN: Code duplicated, block: B:138:0x02a7  */
            /* JADX WARN: Code duplicated, block: B:139:0x02a9  */
            /* JADX WARN: Code duplicated, block: B:145:0x02c4  */
            public static final void i(String str, boolean z, upx0 upx0Var, String str2, boolean z2, iu30 iu30Var, boolean z3, Function0 function0, b0k b0kVar, int i) {
                int i2;
                b0k b0kVar2;
                m4c m4cVar;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7;
                Object objT;
                boolean z8;
                boolean z9;
                boolean z10;
                boolean z11;
                boolean z12;
                boolean zI;
                Object objT2;
                boolean z13;
                m4c m4cVar2 = fkj0.X;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(488308197);
                j06 j06Var = ((x340) b0kVar3).a;
                int i3 = i & 6;
                pbh pbhVar = pbh.a;
                if (i3 == 0) {
                    i2 = (b0kVar3.i(pbhVar) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= b0kVar3.g(str) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= b0kVar3.h(z) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= b0kVar3.i(upx0Var) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i2 |= b0kVar3.g(str2) ? 16384 : 8192;
                }
                if ((i & 196608) == 0) {
                    i2 |= b0kVar3.h(z2) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i2 |= b0kVar3.i(iu30Var) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    i2 |= b0kVar3.h(z3) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i2 |= b0kVar3.i(function0) ? 67108864 : 33554432;
                }
                if (b0kVar3.Y(i2 & 1, (i2 & 38347923) != 38347922)) {
                    ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
                    ven0 ven0VarS2 = v8r.s(function0, b0kVar3);
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarA = pbhVar.a(1.0f, nim0Var, true);
                    era eraVar = een.P0;
                    f36 f36Var = h36.c;
                    mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar3, 0);
                    int iHashCode = Long.hashCode(((x340) b0kVar3).T);
                    xos0 xos0VarM = b0kVar3.m();
                    qim0 qim0VarE = zr7.E(b0kVar3, qim0VarA);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar3.m0();
                    boolean z14 = ((x340) b0kVar3).S;
                    n4k n4kVar = hmb0.t1;
                    if (z14) {
                        b0kVar3.l(n4kVar);
                    } else {
                        b0kVar3.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, b0kVar3, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, b0kVar3, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, b0kVar3, lljVar3);
                    nko1.F(b0kVar3);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, b0kVar3, lljVar4);
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(b0kVar3).b.a;
                    long jA = cbx.a(b0kVar3).a.a.a();
                    long j2 = cbx.a(b0kVar3).c.b;
                    long j3 = cbx.a(b0kVar3).c.d;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    cvx cvxVar = cbx.b(b0kVar3).b;
                    int i4 = i2;
                    qim0 qim0VarR = i1p1.r(pbhVar.a(1.0f, uyn1.z(16.0f, 0.0f, 2, qim0VarF), true));
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar3, 0);
                    int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
                    xos0 xos0VarM2 = b0kVar3.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarR);
                    b0kVar3.m0();
                    if (((x340) b0kVar3).S) {
                        b0kVar3.l(n4kVar);
                    } else {
                        b0kVar3.v0();
                    }
                    nko1.H(mbhVarA2, b0kVar3, lljVar);
                    nko1.H(xos0VarM2, b0kVar3, lljVar2);
                    x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
                    nko1.H(qim0VarE2, b0kVar3, lljVar4);
                    qim0 qim0VarN = anm1.N("artifact-page-prompt-field", pbhVar.a(1.0f, u291.f(nim0Var, 1.0f), true));
                    int i5 = i4 & 112;
                    int i6 = i4 & 57344;
                    int i7 = i4 & 29360128;
                    boolean zI2 = (i6 == 16384) | (i5 == 32) | (i7 == 8388608) | b0kVar3.i(ven0VarS2) | b0kVar3.i(ven0VarS);
                    Object objT3 = b0kVar3.T();
                    if (zI2) {
                        m4cVar = m4cVar2;
                    } else {
                        m4cVar = m4cVar2;
                        if (objT3 == m4cVar) {
                        }
                        qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT3);
                        boolean zF = b0kVar3.f(j) | b0kVar3.f(jA) | b0kVar3.f(j2);
                        if (i6 == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        boolean zI3 = zF | z4 | b0kVar3.i(ven0VarS);
                        if (i5 == 32) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        boolean z15 = zI3 | z5;
                        if (i7 == 8388608) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z15 | z6;
                        objT = b0kVar3.T();
                        if (z7 || objT == m4cVar) {
                            r96 r96Var = new r96(j, jA, j2, str2, str, z3, ven0VarS);
                            b0kVar3.s0(r96Var);
                            objT = r96Var;
                        }
                        iu30 iu30Var2 = (iu30) objT;
                        if (i7 == 8388608) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean zI4 = z8 | b0kVar3.i(ven0VarS2);
                        if ((i4 & 458752) == 131072) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean z16 = zI4 | z9;
                        if (i5 == 32) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z17 = z16 | z10;
                        if (i6 == 16384) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean z18 = z17 | z11;
                        if ((i4 & 896) == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zI = z18 | z12 | b0kVar3.i(upx0Var) | b0kVar3.f(j3);
                        objT2 = b0kVar3.T();
                        if (!zI || objT2 == m4cVar) {
                            z13 = true;
                            t96 t96Var = new t96(z3, z2, str, str2, z, upx0Var, j3, ven0VarS2);
                            b0kVar3.s0(t96Var);
                            objT2 = t96Var;
                        } else {
                            z13 = true;
                        }
                        b0kVar2 = b0kVar3;
                        dm5.a(iu30Var2, qim0VarB, (iu30) objT2, b0kVar2, 0, 0);
                        b0kVar2.r(z13);
                        b0kVar2.r(z13);
                    }
                    o96 o96Var = new o96(str, str2, z3, ven0VarS2, ven0VarS, (byte) 0);
                    b0kVar3.s0(o96Var);
                    objT3 = o96Var;
                    qim0 qim0VarB2 = s161.b(qim0VarN, false, (iu30) objT3);
                    boolean zF2 = b0kVar3.f(j) | b0kVar3.f(jA) | b0kVar3.f(j2);
                    if (i6 == 16384) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean zI5 = zF2 | z4 | b0kVar3.i(ven0VarS);
                    if (i5 == 32) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z19 = zI5 | z5;
                    if (i7 == 8388608) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z19 | z6;
                    objT = b0kVar3.T();
                    if (z7) {
                        r96 r96Var2 = new r96(j, jA, j2, str2, str, z3, ven0VarS);
                        b0kVar3.s0(r96Var2);
                        objT = r96Var2;
                    } else {
                        r96 r96Var3 = new r96(j, jA, j2, str2, str, z3, ven0VarS);
                        b0kVar3.s0(r96Var3);
                        objT = r96Var3;
                    }
                    iu30 iu30Var3 = (iu30) objT;
                    if (i7 == 8388608) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean zI6 = z8 | b0kVar3.i(ven0VarS2);
                    if ((i4 & 458752) == 131072) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z110 = zI6 | z9;
                    if (i5 == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z111 = z110 | z10;
                    if (i6 == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z112 = z111 | z11;
                    if ((i4 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zI = z112 | z12 | b0kVar3.i(upx0Var) | b0kVar3.f(j3);
                    objT2 = b0kVar3.T();
                    if (zI) {
                        z13 = true;
                        t96 t96Var2 = new t96(z3, z2, str, str2, z, upx0Var, j3, ven0VarS2);
                        b0kVar3.s0(t96Var2);
                        objT2 = t96Var2;
                    } else {
                        z13 = true;
                        t96 t96Var3 = new t96(z3, z2, str, str2, z, upx0Var, j3, ven0VarS2);
                        b0kVar3.s0(t96Var3);
                        objT2 = t96Var3;
                    }
                    b0kVar2 = b0kVar3;
                    dm5.a(iu30Var3, qim0VarB2, (iu30) objT2, b0kVar2, 0, 0);
                    b0kVar2.r(z13);
                    b0kVar2.r(z13);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new u96(str, z, upx0Var, str2, z2, iu30Var, z3, function0, i);
                }
            }

            public static final void j(Function0 function0, boolean z, iu30 iu30Var, psk pskVar, String str, o86 o86Var, String str2, boolean z2, boolean z3, Function0 function1, boolean z4, boolean z5, Function0 function2, Function0 function3, b0k b0kVar, int i, int i2) {
                int i3;
                String str3;
                int i4;
                boolean z6;
                int i5;
                j2i j2iVarR;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1458899062);
                if ((i & 6) == 0) {
                    i3 = (x340Var.i(function0) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= x340Var.h(z) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i3 |= x340Var.i(iu30Var) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i3 |= x340Var.e(pskVar.ordinal()) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    str3 = str;
                    i3 |= x340Var.g(str3) ? 16384 : 8192;
                } else {
                    str3 = str;
                }
                if ((i & 196608) == 0) {
                    i3 |= x340Var.i(o86Var) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i3 |= x340Var.g(str2) ? 1048576 : 524288;
                }
                int i6 = i & 12582912;
                nim0 nim0Var = nim0.a;
                if (i6 == 0) {
                    i3 |= x340Var.i(nim0Var) ? 8388608 : 4194304;
                }
                if ((i & 100663296) == 0) {
                    i3 |= x340Var.h(false) ? 67108864 : 33554432;
                }
                if ((i & 805306368) == 0) {
                    i3 |= x340Var.h(z2) ? 536870912 : 268435456;
                }
                if ((i2 & 6) == 0) {
                    i4 = i2 | (x340Var.h(z3) ? 4 : 2);
                } else {
                    i4 = i2;
                }
                if ((i2 & 48) == 0) {
                    i4 |= x340Var.i(function1) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i4 |= x340Var.h(z4) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    z6 = z5;
                    i4 |= x340Var.h(z6) ? 2048 : 1024;
                } else {
                    z6 = z5;
                }
                if ((i2 & 24576) == 0) {
                    i4 |= x340Var.i(function2) ? 16384 : 8192;
                }
                if ((i2 & 196608) == 0) {
                    i4 |= x340Var.i(function3) ? 131072 : 65536;
                }
                if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
                    nko1.H(mbhVarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    j2i j2iVarR2 = apo.r(-1534413773, new oj2((Object) o86Var, (Object) str2, (Object) function0, (byte) 18), x340Var);
                    j2i j2iVarR3 = apo.r(36821010, new pp5(z4, z6, function2, function3, pskVar, str3), x340Var);
                    if (z) {
                        x340Var.i0(1620672089);
                        j2iVarR = apo.r(1087474864, new pp5(o86Var, iu30Var, (byte) 4), x340Var);
                        i5 = 0;
                        x340Var.r(false);
                    } else {
                        i5 = 0;
                        x340Var.i0(1621733745);
                        x340Var.r(false);
                        j2iVarR = null;
                    }
                    f(j2iVarR2, j2iVarR3, j2iVarR, x340Var, 54);
                    h(null, x340Var, i5);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new v96(function0, z, iu30Var, pskVar, str, o86Var, str2, z2, z3, function1, z4, z5, function2, function3, i, i2);
                }
            }

            public static final void k(t5t0 t5t0Var, n511 n511Var, n511 n511Var2, float f, float f2, zu30 zu30Var, Function0 function0, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
                int i2;
                Function0 function1;
                iu30 iu30Var3;
                x340 x340Var;
                float f3;
                m4c m4cVar;
                x340 x340Var2;
                drr0 drr0Var;
                t5t0 t5t0Var2 = t5t0Var;
                m4c m4cVar2 = fkj0.X;
                x340 x340Var3 = (x340) b0kVar;
                x340Var3.k0(-1120709224);
                if ((i & 6) == 0) {
                    i2 = (x340Var3.g(t5t0Var2) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var3.i(n511Var) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var3.i(n511Var2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var3.d(f) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    i2 |= x340Var3.d(f2) ? 16384 : 8192;
                }
                if ((196608 & i) == 0) {
                    i2 |= x340Var3.i(zu30Var) ? 131072 : 65536;
                }
                if ((1572864 & i) == 0) {
                    function1 = function0;
                    i2 |= x340Var3.i(function1) ? 1048576 : 524288;
                } else {
                    function1 = function0;
                }
                if ((12582912 & i) == 0) {
                    iu30Var3 = iu30Var;
                    i2 |= x340Var3.i(iu30Var3) ? 8388608 : 4194304;
                } else {
                    iu30Var3 = iu30Var;
                }
                if ((i & 100663296) == 0) {
                    i2 |= x340Var3.i(iu30Var2) ? 67108864 : 33554432;
                }
                if (x340Var3.Y(i2 & 1, (i2 & 38347923) != 38347922)) {
                    int i3 = t5t0Var2.a;
                    boolean zE = x340Var3.e(i3);
                    Object objT = x340Var3.T();
                    if (zE || objT == m4cVar2) {
                        objT = us71.i(t5t0Var2.d, x340Var3);
                    }
                    drr0 drr0Var2 = (drr0) objT;
                    boolean zE2 = x340Var3.e(i3);
                    Object objT2 = x340Var3.T();
                    if (zE2 || objT2 == m4cVar2) {
                        objT2 = us71.i(t5t0Var2.e, x340Var3);
                    }
                    drr0 drr0Var3 = (drr0) objT2;
                    boolean zE3 = x340Var3.e(i3);
                    Object objT3 = x340Var3.T();
                    if (zE3 || objT3 == m4cVar2) {
                        objT3 = us71.i(t5t0Var2.f, x340Var3);
                    }
                    drr0 drr0Var4 = (drr0) objT3;
                    boolean zE4 = x340Var3.e(i3);
                    Object objT4 = x340Var3.T();
                    if (zE4 || objT4 == m4cVar2) {
                        objT4 = us71.i(t5t0Var2.g, x340Var3);
                    }
                    drr0 drr0Var5 = (drr0) objT4;
                    ven0 ven0VarS = v8r.s(n511Var, x340Var3);
                    ven0 ven0VarS2 = v8r.s(n511Var2, x340Var3);
                    gra graVar = een.h;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    Integer numValueOf = Integer.valueOf(i3);
                    boolean zI = ((458752 & i2) == 131072) | ((i2 & 3670016) == 1048576) | x340Var3.i(ven0VarS) | x340Var3.i(drr0Var2) | x340Var3.i(drr0Var3) | x340Var3.i(drr0Var5) | x340Var3.i(drr0Var4) | ((234881024 & i2) == 67108864) | x340Var3.i(ven0VarS2) | ((i2 & 7168) == 2048) | ((29360128 & i2) == 8388608) | ((i2 & 57344) == 16384);
                    Object objT5 = x340Var3.T();
                    if (zI || objT5 == m4cVar2) {
                        m4cVar = m4cVar2;
                        x340Var2 = x340Var3;
                        Function0 function2 = function1;
                        drr0Var = drr0Var4;
                        uvb1 uvb1Var = new uvb1(function2, zu30Var, iu30Var2, f, ven0VarS, drr0Var2, drr0Var3, drr0Var5, drr0Var, ven0VarS2, iu30Var3, f2);
                        f3 = f;
                        x340Var2.s0(uvb1Var);
                        objT5 = uvb1Var;
                    } else {
                        f3 = f;
                        m4cVar = m4cVar2;
                        x340Var2 = x340Var3;
                        drr0Var = drr0Var4;
                    }
                    qim0 qim0VarB = f8d1.b(qim0VarD, numValueOf, (PointerInputEventHandler) objT5);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
                    float fS = drr0Var5.s() * ((wat) x340Var2.k(t4k.h)).N0(f3);
                    int i4 = (int) (3.0f * f3);
                    t5t0Var2 = t5t0Var;
                    Uri uri = Uri.parse(t5t0Var2.b);
                    String str = t5t0Var2.c;
                    qim0 qim0VarR = u291.r(nim0Var, fS);
                    boolean zI2 = x340Var2.i(drr0Var);
                    Object objT6 = x340Var2.T();
                    if (zI2 || objT6 == m4cVar) {
                        objT6 = new qg6(drr0Var, (byte) 23);
                        x340Var2.s0(objT6);
                    }
                    x340Var = x340Var2;
                    iko1.f(uri, i4, i541.C(qim0VarR, (iu30) objT6), str, x340Var, 0);
                    x340Var.r(true);
                } else {
                    x340Var = x340Var3;
                    f3 = f;
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vvb1(t5t0Var2, n511Var, n511Var2, f3, f2, zu30Var, function0, iu30Var, iu30Var2, i);
                }
            }

            public static final void l(iu30 iu30Var, uny unyVar, qim0 qim0Var, ri00 ri00Var, b0k b0kVar, int i) {
                int i2;
                qim0 qim0Var2;
                ri00 ri00Var2 = ri00Var;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(703847966);
                if ((i & 6) == 0) {
                    i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= (i & 64) == 0 ? x340Var.g(unyVar) : x340Var.i(unyVar) ? 32 : 16;
                }
                int i3 = i2 | 384;
                if ((i & 3072) == 0) {
                    i3 |= (i & 4096) == 0 ? x340Var.g(ri00Var2) : x340Var.i(ri00Var2) ? 2048 : 1024;
                }
                if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarB = uyn1.B(qim0Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
                    if (ri00Var == null) {
                        x340Var.i0(-1043211393);
                        x340Var.r(false);
                        ri00Var2 = ri00Var;
                    } else {
                        x340Var.i0(-1043211392);
                        ri00Var2 = ri00Var;
                        x720 x720Var = ri00Var2.a;
                        boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && x340Var.i(unyVar)));
                        Object objT = x340Var.T();
                        if (z || objT == fkj0.X) {
                            objT = new f0z(unyVar, iu30Var, (byte) 17);
                            x340Var.s0(objT);
                        }
                        zzo1.d(x720Var, (iu30) objT, null, null, x340Var, 0);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new m5r(i, iu30Var, unyVar, qim0Var2, ri00Var2, (byte) 22);
                }
            }

            public static final void m(Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1843146772);
                int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16) | (x340Var.i(function2) ? 256 : 128);
                if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                    String strO0 = cwl1.o0(x340Var, 2131952433);
                    String strO1 = cwl1.o0(x340Var, 2131952430);
                    String strO2 = cwl1.o0(x340Var, 2131952431);
                    z50 z50Var = z50.c;
                    mqo1.d(function2, null, null, strO0, strO1, new zgx(strO2, new gbx(z50Var, function0)), new zgx(cwl1.o0(x340Var, 2131952432), new gbx(z50Var, function1)), x340Var, ((i2 >> 6) & 14) | 2359296, 6);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new w96(function0, function1, function2, i, (byte) 0);
                }
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public static final void n(fa6 fa6Var, String str, j2i j2iVar, Function0 function0, boolean z, iu30 iu30Var, o86 o86Var, String str2, qim0 qim0Var, boolean z2, boolean z3, Function0 function1, boolean z4, boolean z5, Function0 function2, Function0 function3, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                int i2;
                Function0 function4;
                boolean z6;
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(2040057799);
                if ((i & 6) == 0) {
                    i2 = (x340Var.i(fa6Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.g(str) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.i(j2iVar) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    function4 = function0;
                    i2 |= x340Var.i(function4) ? 2048 : 1024;
                } else {
                    function4 = function0;
                }
                if ((i & 24576) == 0) {
                    z6 = z;
                    i2 |= x340Var.h(z6) ? 16384 : 8192;
                } else {
                    z6 = z;
                }
                if ((i & 196608) == 0) {
                    i2 |= x340Var.i(iu30Var) ? 131072 : 65536;
                }
                if ((i & 1572864) == 0) {
                    i2 |= x340Var.i(o86Var) ? 1048576 : 524288;
                }
                if ((i & 12582912) == 0) {
                    i2 |= x340Var.g(str2) ? 8388608 : 4194304;
                }
                int i3 = i2 | 100663296;
                if ((i & 805306368) == 0) {
                    i3 |= x340Var.h(false) ? 536870912 : 268435456;
                }
                int i4 = 128;
                int i5 = (x340Var.h(z2) ? 4 : 2) | (x340Var.h(z3) ? 32 : 16);
                if (x340Var.i(function1)) {
                    i4 = 256;
                }
                int i6 = i5 | i4 | (x340Var.h(z4) ? 2048 : 1024) | (x340Var.h(z5) ? 16384 : 8192) | (x340Var.i(function2) ? 131072 : 65536) | (x340Var.i(function3) ? 1048576 : 524288);
                int i7 = i3;
                if (x340Var.Y(i7 & 1, ((i3 & 306783379) == 306783378 && (599187 & i6) == 599186) ? false : true)) {
                    int iOrdinal = fa6Var.b.ordinal();
                    if (iOrdinal == 0) {
                        x340Var.i0(1990477329);
                        G((i7 >> 3) & 112, fa6Var.a.b, j2iVar, x340Var, null);
                        x340Var.r(false);
                    } else if (iOrdinal == 1) {
                        x340Var.i0(1990496644);
                        int i8 = i7 >> 9;
                        int i9 = i7 >> 3;
                        j(function0, z, iu30Var, psk.b, str, o86Var, str2, z2, z3, function1, z4, z5, function2, function3, x340Var, (i8 & 896) | (i8 & 14) | 3072 | (i8 & 112) | ((i7 << 9) & 57344) | (i9 & 458752) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | ((i6 << 27) & 1879048192), (i6 >> 3) & 524286);
                        x340Var.r(false);
                    } else {
                        if (iOrdinal != 2) {
                            throw p3d1.k(x340Var, 1990477335, false);
                        }
                        x340Var.i0(1990479749);
                        int i10 = i7 >> 9;
                        int i11 = i7 >> 3;
                        j(function4, z6, iu30Var, psk.c, str, o86Var, str2, z2, z3, function1, z4, z5, function2, function3, x340Var, (i10 & 896) | (i10 & 14) | 3072 | (i10 & 112) | ((i7 << 9) & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | ((i6 << 27) & 1879048192), (i6 >> 3) & 524286);
                        x340Var.r(false);
                    }
                    qim0Var2 = nim0.a;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new x96(fa6Var, str, j2iVar, function0, z, iu30Var, o86Var, str2, qim0Var2, z2, z3, function1, z4, z5, function2, function3, i);
                }
            }

            public static final void o(String str, Function0 function0, qim0 qim0Var, gbx gbxVar, b0k b0kVar, int i) {
                b0k b0kVar2;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(2004558403);
                int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | (b0kVar3.g(qim0Var) ? 256 : 128) | (b0kVar3.g(gbxVar) ? 2048 : 1024);
                if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    b0kVar2 = b0kVar3;
                    cwl1.b(i1p1.r(qim0Var), (tl3) null, d4o1.a, (pgx) null, uyn1.h(3, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(1653223034, new t1(str, function0, (byte) 3), b0kVar3), b0kVar2, ((i2 << 18) & 1879048192) | 24960, 48, 1514);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new qfx(i, str, function0, qim0Var, gbxVar, (byte) 26);
                }
            }

            public static final void p(int i, String str, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1167415310);
                int i2 = i | ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072;
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    uwr uwrVar = cbx.a;
                    mta mtaVar = cbx.b(x340Var).d;
                    cr31 cr31VarB = er31.b(32.0f);
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarF = dug.f(i1p1.q(qim0Var3, cr31VarB), u7h.b(u7h.f, 0.1f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                    jtr jtrVar = jtr.f;
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ktd.n(x340Var);
                    }
                    qim0 qim0VarV = bin.v(qim0VarF, (idn0) objT, jtrVar, false, null, null, function0, 28);
                    cvx cvxVar = cbx.b(x340Var).b;
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    qim0 qim0VarY = uyn1.y(qim0VarV, 16.0f, 6.0f);
                    zov0 zov0Var = cbx.b(x340Var).g;
                    qim0 qim0VarN = anm1.N("labeled.tool.button", u291.j(24.0f, 0.0f, 2, qim0VarY));
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = j9b0.a1;
                        x340Var.s0(objT2);
                    }
                    v1p1.b(48, 0, apo.r(2045299545, new cp9(huxVar, str, (byte) 5), x340Var), x340Var, s161.b(qim0VarN, true, (iu30) objT2));
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new dp9(huxVar, str, function0, qim0Var2, i, (byte) 2);
                }
            }

            public static final void q(gl8 gl8Var, ViewGroup viewGroup, vu30 vu30Var, iu30 iu30Var, b0k b0kVar, int i) {
                int i2;
                th61 th61Var = gl8Var.a;
                m4c m4cVar = fkj0.X;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(397068491);
                if ((i & 6) == 0) {
                    i2 = (x340Var.g(gl8Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.i(viewGroup) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.i(vu30Var) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
                }
                boolean z = true;
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    boolean zG = x340Var.g(th61Var) | x340Var.g(viewGroup);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        objT = (ute0) vu30Var.invoke(th61Var, viewGroup);
                        x340Var.s0(objT);
                    }
                    ute0 ute0Var = (ute0) objT;
                    int i3 = i2 >> 6;
                    Object[] objArr = new Object[0];
                    int i4 = (i3 & 112) ^ 48;
                    boolean zG2 = x340Var.g(ute0Var) | ((i4 > 32 && x340Var.g(iu30Var)) || (i3 & 48) == 32);
                    Object objT2 = x340Var.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new qte0(ute0Var, iu30Var, (byte) 1);
                        x340Var.s0(objT2);
                    }
                    iu30 iu30Var2 = (iu30) objT2;
                    boolean zG3 = x340Var.g(ute0Var);
                    if ((i4 <= 32 || !x340Var.g(iu30Var)) && (i3 & 48) != 32) {
                        z = false;
                    }
                    boolean z2 = zG3 | z;
                    Object objT3 = x340Var.T();
                    if (z2 || objT3 == m4cVar) {
                        objT3 = new qte0(ute0Var, iu30Var, (byte) 2);
                        x340Var.s0(objT3);
                    }
                    ebp1.d(xfo1.n(objArr, iu30Var2, (iu30) objT3, x340Var, 0, 4), null, x340Var, 0);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new etg0(gl8Var, viewGroup, vu30Var, iu30Var, i, (byte) 15);
                }
            }

            public static final void r(float f, long j, String str, qim0 qim0Var, b0k b0kVar, int i) {
                int i2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(56494783);
                if ((i & 6) == 0) {
                    i2 = (x340Var.d(f) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.f(j) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.g(str) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
                }
                if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
                    nko1.H(jw31VarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    int i3 = (i2 << 6) & 7168;
                    w0h1.a(wsx.c, isl.a, u291.r(nim0.a, oto1.w(f, 56, x340Var)), j, 0L, false, x340Var, wsx.d | 48 | i3, 48);
                    kk0.s(1.0f, true, x340Var);
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    cjc0 cjc0Var = new cjc0(1);
                    uwr uwrVar = cbx.a;
                    uwo1.e(upperCase, null, lee1.a(cbx.d(x340Var).b, 0L, ((wat) x340Var.k(t4k.h)).L(24.0f * f), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), j, new a0e1(5), null, 2, false, cjc0Var, 0, null, x340Var, i3, 0, 1698);
                    x340Var = x340Var;
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new uud(f, j, str, qim0Var, i, (byte) 0);
                }
            }

            public static final void s(Function0 function0, boolean z, boolean z2, boolean z3, String str, qim0 qim0Var, b0k b0kVar, int i) {
                b0k b0kVar2;
                String strK;
                jax haxVar;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(-1709319252);
                int i2 = i | (b0kVar3.i(function0) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.h(z2) ? 256 : 128) | (b0kVar3.h(z3) ? 2048 : 1024) | (b0kVar3.g(str) ? 16384 : 8192) | (b0kVar3.i(qim0Var) ? 131072 : 65536);
                if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
                    if (z2 && z3) {
                        strK = x0d.k(b0kVar3, -1197346856, 2131952415, b0kVar3, false);
                    } else {
                        b0kVar3.i0(-1197280547);
                        b0kVar3.r(false);
                        strK = str;
                    }
                    idx idxVar = new idx(4);
                    gdx gdxVarR = yla.r(b0kVar3);
                    if (z) {
                        b0kVar3.i0(-1978278176);
                        b0kVar3.r(false);
                        haxVar = jax.a;
                    } else {
                        b0kVar3.i0(-1978276688);
                        haxVar = new hax(cwl1.o0(b0kVar3, 2131952429));
                        b0kVar3.r(false);
                    }
                    boolean z4 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
                    Object objT = b0kVar3.T();
                    if (z4 || objT == fkj0.X) {
                        objT = new y96(z2, function0, (byte) 0);
                        b0kVar3.s0(objT);
                    }
                    Function0 function1 = (Function0) objT;
                    if (ihc1.y0(strK)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return;
                    } else {
                        b0kVar2 = b0kVar3;
                        foo1.c(new gbx(new y50(strK), function1), idxVar, anm1.N("artifact-page-generate-button", u291.f(qim0Var, 1.0f)), haxVar, gdxVarR, null, null, null, null, null, apo.r(726756365, new nl(strK, (byte) 19), b0kVar3), b0kVar2, 0, 48, 1992);
                    }
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new z96(function0, z, z2, z3, str, qim0Var, i);
                }
            }

            public static final void t(String str, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1802052114);
                int i2 = (x340Var.g(str) ? 4 : 2) | i;
                if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
                    Uri uri = Uri.parse(str);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    p3v p3vVar = new p3v(48.0f);
                    ltx ltxVar = ltx.c;
                    eso1.e(uri, isl.a, (qim0) null, p3vVar, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(ltxVar, ltxVar), false, false, x340Var, 1073741872, 0, 3572);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new y5d0(str, i, (byte) 21);
                }
            }

            public static final void u(UnmatchedItem unmatchedItem, Set set, boolean z, p410 p410Var, String str, Function0 function0, Function0 function1, vu30 vu30Var, b0k b0kVar, int i) {
                b0k b0kVar2;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(1631400308);
                int i2 = i | (b0kVar3.g(unmatchedItem) ? 4 : 2) | (b0kVar3.g(set) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.g(p410Var) ? 2048 : 1024) | (b0kVar3.g(str) ? 16384 : 8192) | (b0kVar3.i(function0) ? 131072 : 65536) | (b0kVar3.i(function1) ? 1048576 : 524288) | (b0kVar3.i(vu30Var) ? 8388608 : 4194304);
                if (b0kVar3.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
                    mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar3, 0);
                    int iHashCode = Long.hashCode(((x340) b0kVar3).T);
                    xos0 xos0VarM = b0kVar3.m();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarE = zr7.E(b0kVar3, nim0Var);
                    hzj.A.getClass();
                    if (((x340) b0kVar3).a == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar3.m0();
                    if (((x340) b0kVar3).S) {
                        b0kVar3.l(hmb0.t1);
                    } else {
                        b0kVar3.v0();
                    }
                    nko1.H(mbhVarA, b0kVar3, y580.O0);
                    nko1.H(xos0VarM, b0kVar3, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                    nko1.F(b0kVar3);
                    nko1.H(qim0VarE, b0kVar3, y580.Y);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    boolean z2 = (i2 & 112) == 32;
                    Object objT = b0kVar3.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new lu2(set, (byte) 3);
                        b0kVar3.s0(objT);
                    }
                    jto1.b(s161.b(qim0VarF, true, (iu30) objT), T(b0kVar3), null, false, null, null, new gbx(z50.c, function0), null, apo.r(-1678298380, new oa5(function1, (byte) 10), b0kVar3), apo.r(-1019915501, new wah0(unmatchedItem, (byte) 0), b0kVar3), null, apo.r(-1151718734, new wah0(unmatchedItem, (byte) 1), b0kVar3), apo.r(-493335855, new epe0((byte) 2, z), b0kVar3), null, null, apo.r(1481812782, new x9g0(set, unmatchedItem, (byte) 21), b0kVar3), b0kVar3, 905969728, 197040, 25788);
                    b0kVar2 = b0kVar3;
                    fq7.b(pbh.a, z, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(-856083518, new jb1((Object) unmatchedItem, (Object) set, (Object) p410Var, (Object) str, (Object) vu30Var, (byte) 19), b0kVar3), b0kVar2, 1572870 | ((i2 >> 3) & 112), 30);
                    b0kVar2.r(true);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new q3(unmatchedItem, set, z, p410Var, str, function0, function1, vu30Var, i);
                }
            }

            public static final void v(String str, ItemAlternative itemAlternative, boolean z, p410 p410Var, String str2, iu30 iu30Var, b0k b0kVar, int i) {
                b0k b0kVar2;
                ItemAlternative itemAlternative2 = itemAlternative;
                m4c m4cVar = fkj0.X;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(269216461);
                int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(itemAlternative2) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | (b0kVar3.g(p410Var) ? 2048 : 1024) | (b0kVar3.g(str2) ? 16384 : 8192) | (b0kVar3.i(iu30Var) ? 131072 : 65536);
                if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
                    String strF = f4i1.f(str, ":", itemAlternative2.getId());
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarB = uyn1.B(qim0VarF, cbx.b(b0kVar3).b.c, 0.0f, 0.0f, 0.0f, 14);
                    int i3 = i2 & 896;
                    boolean z2 = i3 == 256;
                    Object objT = b0kVar3.T();
                    if (z2 || objT == m4cVar) {
                        objT = new mj10((byte) 13, z);
                        b0kVar3.s0(objT);
                    }
                    qim0 qim0VarB2 = s161.b(qim0VarB, true, (iu30) objT);
                    uvx uvxVarT = T(b0kVar3);
                    boolean z3 = ((i2 & 458752) == 131072) | (i3 == 256);
                    Object objT2 = b0kVar3.T();
                    if (z3 || objT2 == m4cVar) {
                        objT2 = new z20(iu30Var, z, (byte) 18);
                        b0kVar3.s0(objT2);
                    }
                    itemAlternative2 = itemAlternative;
                    b0kVar2 = b0kVar3;
                    jto1.b(qim0VarB2, uvxVarT, null, false, null, null, new gbx(z50.c, (Function0) objT2), null, apo.r(544869207, new epe0((byte) 3, z), b0kVar3), apo.r(-1495805898, new c9y(strF, itemAlternative, str2, p410Var, (byte) 13), b0kVar3), null, apo.r(-2054116203, new xah0(itemAlternative2, (byte) 0), b0kVar3), null, null, null, apo.r(-1626882031, new xah0(itemAlternative2, (byte) 1), b0kVar3), b0kVar2, 905969728, 196656, 29884);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new wr1(str, (Object) itemAlternative2, z, (Object) p410Var, (Object) str2, (Object) iu30Var, i, (byte) 14);
                }
            }

            public static final void w(UnmatchedItem unmatchedItem, b0k b0kVar, int i) {
                b0k b0kVar2;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(1533844169);
                int i2 = (b0kVar3.g(unmatchedItem) ? 4 : 2) | i;
                if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                    Object objT = b0kVar3.T();
                    if (objT == fkj0.X) {
                        objT = s4h0.b1;
                        b0kVar3.s0(objT);
                    }
                    b0kVar2 = b0kVar3;
                    jto1.b(s161.b(qim0VarF, true, (iu30) objT), T(b0kVar3), null, false, null, null, null, null, null, apo.r(1717735922, new wah0(unmatchedItem, (byte) 2), b0kVar3), null, apo.r(1244285585, new wah0(unmatchedItem, (byte) 3), b0kVar3), null, null, null, apo.r(1267486477, new wah0(unmatchedItem, (byte) 4), b0kVar3), b0kVar2, 805306432, 196656, 30204);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new mbf0(unmatchedItem, i, (byte) 27);
                }
            }

            public static final void x(xm41 xm41Var, xm41 xm41Var2, jxa jxaVar, kge kgeVar, mr20 mr20Var, ViewGroup viewGroup, Function0 function0, LinkedHashSet linkedHashSet, vxf0 vxf0Var, vu30 vu30Var, Function0 function1, iu30 iu30Var, Function0 function2, b0k b0kVar, int i) {
                wh61 wh61Var;
                kh61 kh61Var;
                u380 u380Var;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(1759250740);
                int i2 = i | (x340Var.i(xm41Var) ? 4 : 2) | (x340Var.i(xm41Var2) ? 32 : 16) | (x340Var.i(jxaVar) ? 256 : 128) | (x340Var.i(kgeVar) ? 2048 : 1024) | (x340Var.i(mr20Var) ? 16384 : 8192) | (x340Var.i(viewGroup) ? 131072 : 65536) | (x340Var.i(function0) ? 1048576 : 524288) | (x340Var.i(linkedHashSet) ? 8388608 : 4194304) | (x340Var.i(vxf0Var) ? 67108864 : 33554432) | (x340Var.i(vu30Var) ? 536870912 : 268435456);
                int i3 = (x340Var.i(function1) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function2) ? 256 : 128);
                if (x340Var.Y(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 147) == 146) ? false : true)) {
                    iuw0 iuw0Var = new iuw0(kgeVar);
                    kh61 kh61Var2 = new kh61(xm41Var);
                    wh61 wh61Var2 = new wh61(mr20Var);
                    u380 u380VarC = mqo1.C(linkedHashSet);
                    m4c m4cVar = fkj0.X;
                    Object[] objArr = new Object[0];
                    boolean zG = x340Var.g(iuw0Var) | x340Var.g(wh61Var2) | x340Var.g(kh61Var2) | x340Var.i(u380VarC);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        objT = new al8(iuw0Var, wh61Var2, kh61Var2, u380VarC, (byte) 1);
                        wh61Var = wh61Var2;
                        kh61Var = kh61Var2;
                        u380Var = u380VarC;
                        x340Var.s0(objT);
                    } else {
                        wh61Var = wh61Var2;
                        kh61Var = kh61Var2;
                        u380Var = u380VarC;
                    }
                    iu30 iu30Var2 = (iu30) objT;
                    boolean zG2 = x340Var.g((Object) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0159: ARITH (r16v18 'zG2' boolean) = (wrap boolean:0x0153: ARITH (wrap boolean:0x014d: ARITH (wrap boolean:0x0145: INVOKE (r9v1 'x340Var' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r17v8 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:326)) | (wrap boolean:0x0149: INVOKE (r9v1 'x340Var' p.x340), (r11v7 'wh61Var' p.wh61) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:330)) A[DONT_WRAP, WRAPPED] (LINE:334)) | (wrap boolean:0x014f: INVOKE (r9v1 'x340Var' p.x340), (r2v4 'kh61Var' p.kh61) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED] (LINE:336)) A[DONT_WRAP, WRAPPED] (LINE:340)) | (wrap boolean:0x0155: INVOKE (r9v1 'x340Var' p.x340), (r4v5 'u380Var' p.u380) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:342)) A[DECLARE_VAR] (LINE:346) in method: p.r4o1.x(p.xm41, p.xm41, p.jxa, p.kge, p.mr20, android.view.ViewGroup, kotlin.jvm.functions.Function0, java.util.LinkedHashSet, p.vxf0, p.vu30, kotlin.jvm.functions.Function0, p.iu30, kotlin.jvm.functions.Function0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v8 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 492
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.r4o1.x(p.xm41, p.xm41, p.jxa, p.kge, p.mr20, android.view.ViewGroup, kotlin.jvm.functions.Function0, java.util.LinkedHashSet, p.vxf0, p.vu30, kotlin.jvm.functions.Function0, p.iu30, kotlin.jvm.functions.Function0, p.b0k, int):void");
                }

                public static final void y(xfx xfxVar, ivm0 ivm0Var, qim0 qim0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
                    int i2;
                    qim0 qim0Var2;
                    m4c m4cVar = fkj0.X;
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(-2121304008);
                    if ((i & 6) == 0) {
                        i2 = (x340Var.i(xfxVar) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= x340Var.i(ivm0Var) ? 32 : 16;
                    }
                    int i3 = i2 | 384;
                    if ((i & 3072) == 0) {
                        i3 |= x340Var.h(z) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= x340Var.i(iu30Var) ? 16384 : 8192;
                    }
                    if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
                        qim0 qim0Var3 = nim0.a;
                        qim0 qim0VarN = anm1.N("multi_user_member", qim0Var3);
                        boolean zI = ((i3 & 7168) == 2048) | x340Var.i(xfxVar) | ((i3 & 57344) == 16384);
                        Object objT = x340Var.T();
                        if (zI || objT == m4cVar) {
                            objT = new bnr0(xfxVar, z, iu30Var, (byte) 0);
                            x340Var.s0(objT);
                        }
                        iu30 iu30Var2 = (iu30) objT;
                        boolean zI2 = x340Var.i(ivm0Var);
                        Object objT2 = x340Var.T();
                        if (zI2 || objT2 == m4cVar) {
                            objT2 = new wvq0(ivm0Var, (byte) 14);
                            x340Var.s0(objT2);
                        }
                        dm5.a(iu30Var2, qim0VarN, (iu30) objT2, x340Var, 0, 0);
                        qim0Var2 = qim0Var3;
                    } else {
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new sx1((Object) xfxVar, (Object) ivm0Var, (Object) qim0Var2, z, (Object) iu30Var, i, (byte) 28);
                    }
                }

                /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
                public static final void z(y86 y86Var, psk pskVar, String str, upx0 upx0Var, String str2, boolean z, iu30 iu30Var, boolean z2, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
                    x340 x340Var = (x340) b0kVar;
                    x340Var.k0(1646484120);
                    int i2 = i | (x340Var.i(y86Var) ? 32 : 16) | (x340Var.e(pskVar.ordinal()) ? 256 : 128) | (x340Var.g(str) ? 2048 : 1024) | (x340Var.i(upx0Var) ? 16384 : 8192) | (x340Var.g(str2) ? 131072 : 65536) | (x340Var.h(z) ? 1048576 : 524288) | (x340Var.i(iu30Var) ? 8388608 : 4194304) | (x340Var.h(z2) ? 67108864 : 33554432) | (x340Var.i(function0) ? 536870912 : 268435456);
                    if (x340Var.Y(i2 & 1, (306783379 & i2) != 306783378)) {
                        int iOrdinal = pskVar.ordinal();
                        if (iOrdinal == 0) {
                            x340Var.i0(1723284686);
                            F(y86Var, x340Var, i2 & 126);
                            x340Var.r(false);
                        } else {
                            if (iOrdinal != 1 && iOrdinal != 2) {
                                throw p3d1.k(x340Var, 1723284057, false);
                            }
                            x340Var.i0(1723286471);
                            int i3 = ((i2 >> 6) & 112) | 6;
                            int i4 = i2 >> 3;
                            i(str, y86Var.k, upx0Var, str2, z, iu30Var, z2, function0, x340Var, i3 | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024));
                            x340Var.r(false);
                        }
                    } else {
                        x340Var.b0();
                    }
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new aa6(y86Var, pskVar, str, upx0Var, str2, z, iu30Var, z2, function0, i);
                    }
                }
            }
