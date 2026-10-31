package p;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.ui.unit.TextUnit;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.extendedmetadata.proto.BatchedExtensionResponse;
import com.spotify.extendedmetadata.proto.EntityExtensionData;
import com.spotify.extendedmetadata.proto.EntityExtensionDataArray;
import defpackage.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class f7p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(gj1 gj1Var, iu30 iu30Var, q251 q251Var, gv51 gv51Var, d6o0 d6o0Var, v361 v361Var, fm50 fm50Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        iu30 iu30Var2;
        m4c m4cVar = fkj0.X;
        int i2 = gj1Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(942062472);
        int i3 = i | (b0kVar3.g(gj1Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(q251Var) ? 256 : 128) | (b0kVar3.i(gv51Var) ? 2048 : 1024) | (b0kVar3.i(d6o0Var) ? 16384 : 8192) | (b0kVar3.i(v361Var) ? 131072 : 65536) | (b0kVar3.g(fm50Var) ? 1048576 : 524288);
        if (b0kVar3.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean zE = b0kVar3.e(l1d.C(i2));
            Object objT = b0kVar3.T();
            if (zE || objT == m4cVar) {
                objT = c13.l(i2 == 4, b0kVar3);
            }
            ven0 ven0Var = (ven0) objT;
            Object[] objArr = new Object[0];
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = p4.c1;
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) objT2, b0kVar3, 48);
            j2i j2iVar = m4i.a;
            j2i j2iVarR = apo.r(-432856727, new ri1(gj1Var, iu30Var, d6o0Var, v361Var, gv51Var, ven0Var, ven0Var2, fm50Var, (byte) 0), b0kVar3);
            boolean zG = b0kVar3.g(ven0Var2);
            Object objT3 = b0kVar3.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new xj0(ven0Var2, (byte) 6);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            iu30Var2 = iu30Var;
            fuo1.a(j2iVar, j2iVarR, q251Var, (iu30) objT3, qim0Var, false, b0kVar2, (i3 & 896) | 24630, 32);
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                b0kVar2.i0(1676814551);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarD, u7h.b(cbx.a(b0kVar2).a.c, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                Object objT4 = b0kVar2.T();
                if (objT4 == m4cVar) {
                    objT4 = ktd.n(b0kVar2);
                }
                idn0 idn0Var = (idn0) objT4;
                Object objT5 = b0kVar2.T();
                if (objT5 == m4cVar) {
                    objT5 = p4.b1;
                    b0kVar2.s0(objT5);
                }
                qim0 qim0VarV = bin.v(qim0VarF, idn0Var, (ga80) null, false, (String) null, (pm31) null, (Function0) objT5, 28);
                Object objT6 = b0kVar2.T();
                if (objT6 == m4cVar) {
                    objT6 = uh1.f;
                    b0kVar2.s0(objT6);
                }
                qim0 qim0VarB = s161.b(qim0VarV, false, (iu30) objT6);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
                hzj.A.getClass();
                if (((x340) b0kVar2).a == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(hmb0.t1);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                xto1.e(u291.B(nim0Var, (gra) null, 3), 6, 0L, 0L, b0kVar2, 54, 12);
                b0kVar2.r(true);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1677340218);
                b0kVar2.r(false);
            }
            if (gj1Var.j) {
                b0kVar2.i0(1677385943);
                Collection collectionValues = gj1Var.h.values();
                ArrayList arrayList = new ArrayList(q7h.U(collectionValues, 10));
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    arrayList.add(((w4i1) it.next()).b);
                }
                c380 c380VarA = mqo1.A(arrayList);
                int i4 = i3 & 112;
                boolean z = i4 == 32;
                Object objT7 = b0kVar2.T();
                if (z || objT7 == m4cVar) {
                    objT7 = new cr0(iu30Var2, (byte) 15);
                    b0kVar2.s0(objT7);
                }
                Function0 function0 = (Function0) objT7;
                boolean z2 = i4 == 32;
                Object objT8 = b0kVar2.T();
                if (z2 || objT8 == m4cVar) {
                    objT8 = new cr0(iu30Var2, (byte) 16);
                    b0kVar2.s0(objT8);
                }
                yto.f(c380VarA, function0, (Function0) objT8, b0kVar2, 0);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1677665594);
                b0kVar2.r(false);
            }
        } else {
            b0kVar2 = b0kVar3;
            iu30Var2 = iu30Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new n((Object) gj1Var, (Object) iu30Var2, (Object) q251Var, (Object) gv51Var, (Object) d6o0Var, (Object) v361Var, (Object) fm50Var, (Object) qim0Var, i, (byte) 4);
        }
    }

    public static final void b(int i, tr80 tr80Var, int i2, int i3, iu30 iu30Var, qim0 qim0Var, int i4, iu30 iu30Var2, iu30 iu30Var3, String str, b0k b0kVar, int i5) {
        iu30 iu30Var4;
        iu30 iu30Var5;
        iu30 iu30Var6;
        iu30 iu30Var7;
        long j;
        int i6;
        m4c m4cVar = fkj0.X;
        int i7 = ((rr80) tr80Var).a;
        int i8 = ((rr80) tr80Var).b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1603783430);
        int i9 = (x340Var.g(str) ? 536870912 : 268435456) | i5 | (x340Var.e(i) ? 4 : 2) | (x340Var.i(tr80Var) ? 32 : 16) | (x340Var.e(i2) ? 256 : 128) | (x340Var.e(i3) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536) | 113246208;
        if (x340Var.Y(i9 & 1, (306783379 & i9) != 306783378)) {
            x340Var.d0();
            if ((i5 & 1) == 0 || x340Var.E()) {
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = pzo0.S0;
                    x340Var.s0(objT);
                }
                iu30 iu30Var8 = (iu30) objT;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = qep0.a;
                    x340Var.s0(objT2);
                }
                iu30Var6 = iu30Var8;
                iu30Var7 = (iu30) objT2;
            } else {
                x340Var.b0();
                iu30Var6 = iu30Var2;
                iu30Var7 = iu30Var3;
            }
            x340Var.s();
            int i10 = (i8 - i7) / i2;
            uwr uwrVar = cbx.a;
            long j2 = cbx.a(x340Var).b.c;
            long j3 = cbx.a(x340Var).b.b;
            lee1 lee1Var = cbx.d(x340Var).j;
            yae1 yae1VarQ = d5p1.q(0, x340Var, 1);
            boolean z = i + i2 <= i8;
            boolean z2 = i - i2 >= i7;
            String strO0 = cwl1.o0(x340Var, 2131959306);
            String strO1 = cwl1.o0(x340Var, 2131959305);
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            boolean zH = ((57344 & i9) == 16384) | ((((i9 & 1879048192) ^ 805306368) > 536870912 && x340Var.g(str)) || (i9 & 805306368) == 536870912) | x340Var.h(z) | x340Var.g(strO0) | ((i9 & 14) == 4) | ((i9 & 896) == 256) | x340Var.h(z2) | x340Var.g(strO1);
            Object objT3 = x340Var.T();
            if (zH || objT3 == m4cVar) {
                j = j3;
                i6 = 0;
                rep0 rep0Var = new rep0(str, z, strO0, z2, strO1, iu30Var, i, i2, (byte) 0);
                x340Var.s0(rep0Var);
                objT3 = rep0Var;
            } else {
                j = j3;
                i6 = 0;
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT3);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, i6);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            f(i6, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01d6: INVOKE (r12v5 'i6' int), (r32v1 ?? I:??[long, double]), (r15v1 'x340Var' p.x340), (null p.qim0) STATIC call: p.f7p1.f(int, long, p.b0k, p.qim0):void A[MD:(int, long, p.b0k, p.qim0):void (m)] (LINE:471) in method: p.f7p1.b(int, p.tr80, int, int, p.iu30, p.qim0, int, p.iu30, p.iu30, java.lang.String, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes7.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r32v1 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 582
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.f7p1.b(int, p.tr80, int, int, p.iu30, p.qim0, int, p.iu30, p.iu30, java.lang.String, p.b0k, int):void");
        }

        public static final void c(ia21 ia21Var, iu30 iu30Var, k811 k811Var, qim0 qim0Var, b0k b0kVar, int i) {
            int i2;
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1866827415);
            if ((i & 6) == 0) {
                i2 = (x340Var.g(ia21Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(iu30Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= (i & 512) == 0 ? x340Var.g(k811Var) : x340Var.i(k811Var) ? 256 : 128;
            }
            int i3 = i2 | 3072;
            if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                WeakHashMap weakHashMap = osl1.x;
                irn1.u(qim0VarD, apo.r(551854090, new iuy0(iu30Var, (byte) 7), x340Var), (vu30) null, new bgc0(lhc.g(x340Var).g, 32), apo.r(-73354160, new hho0(ia21Var, k811Var, iu30Var, (byte) 27), x340Var), x340Var, 24624, 4);
                qim0Var2 = qim0Var3;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new lzs0(i, ia21Var, iu30Var, k811Var, qim0Var2, (byte) 24);
            }
        }

        public static final void d(nb81 nb81Var, kls0 kls0Var, et90 et90Var, u961 u961Var, s24 s24Var, j7a1 j7a1Var, kb81 kb81Var, qim0 qim0Var, b0k b0kVar, int i) {
            qim0 qim0Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1689313221);
            int i2 = i | (x340Var.g(nb81Var) ? 4 : 2) | (x340Var.i(kls0Var) ? 32 : 16) | (x340Var.i(et90Var) ? 256 : 128) | (x340Var.i(u961Var) ? 2048 : 1024) | (x340Var.i(s24Var) ? 16384 : 8192) | (x340Var.i(j7a1Var) ? 131072 : 65536) | (x340Var.i(kb81Var) ? 1048576 : 524288) | 12582912;
            if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                irn1.u((qim0) null, thj.a, (vu30) null, (erl1) null, apo.r(1220357108, new pih(nb81Var, kb81Var, kls0Var, et90Var, u961Var, s24Var, j7a1Var), x340Var), x340Var, 24624, 13);
                qim0Var2 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new wy51(nb81Var, kls0Var, et90Var, u961Var, s24Var, j7a1Var, kb81Var, qim0Var2, i, (byte) 1);
            }
        }

        public static final void e(int i, tr80 tr80Var, int i2, int i3, int i4, int i5, long j, long j2, lee1 lee1Var, yae1 yae1Var, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, b0k b0kVar, int i6, int i7) {
            int i8;
            int i9;
            b0k b0kVar2;
            hdn0 hdn0Var;
            boolean z;
            float f;
            Object tep0Var;
            int i10;
            Integer num;
            qim0 qim0Var;
            tr80 tr80Var2 = tr80Var;
            Object obj = fkj0.X;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-914463256);
            if ((i6 & 6) == 0) {
                i8 = (b0kVar3.e(i) ? 4 : 2) | i6;
            } else {
                i8 = i6;
            }
            if ((i6 & 48) == 0) {
                i8 |= b0kVar3.i(tr80Var2) ? 32 : 16;
            }
            if ((i6 & 384) == 0) {
                i8 |= b0kVar3.e(i2) ? 256 : 128;
            }
            if ((i6 & 3072) == 0) {
                i8 |= b0kVar3.e(i3) ? 2048 : 1024;
            }
            if ((i6 & 24576) == 0) {
                i8 |= b0kVar3.e(i4) ? 16384 : 8192;
            }
            if ((196608 & i6) == 0) {
                i8 |= b0kVar3.e(i5) ? 131072 : 65536;
            }
            if ((1572864 & i6) == 0) {
                i8 |= b0kVar3.f(j) ? 1048576 : 524288;
            }
            if ((i6 & 12582912) == 0) {
                i8 |= b0kVar3.f(j2) ? 8388608 : 4194304;
            }
            if ((i6 & 100663296) == 0) {
                i8 |= b0kVar3.i(lee1Var) ? 67108864 : 33554432;
            }
            if ((i6 & 805306368) == 0) {
                i8 |= b0kVar3.i(yae1Var) ? 536870912 : 268435456;
            }
            if ((i7 & 6) == 0) {
                i9 = i7 | (b0kVar3.i(iu30Var) ? 4 : 2);
            } else {
                i9 = i7;
            }
            if ((i7 & 48) == 0) {
                i9 |= b0kVar3.i(iu30Var2) ? 32 : 16;
            }
            if ((i7 & 384) == 0) {
                i9 |= b0kVar3.i(iu30Var3) ? 256 : 128;
            }
            int i11 = i9;
            if (b0kVar3.Y(i8 & 1, ((i8 & 306783379) == 306783378 && (i11 & 147) == 146) ? false : true)) {
                wat watVar = (wat) b0kVar3.k(t4k.h);
                b0kVar3.i0(1669119395);
                uwr uwrVar = cbx.a;
                float fX0 = watVar.X0(cbx.b(b0kVar3).b.b);
                b0kVar3.r(false);
                b0kVar3.i0(1669121957);
                avw0 avw0Var = cbx.b(b0kVar3).c;
                float fX1 = watVar.X0(2.0f);
                b0kVar3.r(false);
                b0kVar3.i0(1669124548);
                cvx cvxVar = cbx.b(b0kVar3).b;
                float fX2 = watVar.X0(8.0f);
                b0kVar3.r(false);
                b0kVar3.i0(1669127139);
                float fX3 = watVar.X0(cbx.b(b0kVar3).b.f);
                b0kVar3.r(false);
                float f2 = cbx.b(b0kVar3).b.f;
                int i12 = i4 + 1;
                ss50 ss50Var = (ss50) b0kVar3.k(t4k.l);
                Object objT = b0kVar3.T();
                if (objT == obj) {
                    objT = qxd0.M(o6x.a, b0kVar3);
                    b0kVar3.s0(objT);
                }
                c9n c9nVar = (c9n) objT;
                int i13 = i8 & 896;
                boolean zG = b0kVar3.g(tr80Var2) | (i13 == 256);
                Object objT2 = b0kVar3.T();
                Object obj2 = objT2;
                if (zG || objT2 == obj) {
                    o95 o95VarB = c97.b(0.0f);
                    o95VarB.i(Float.valueOf(0.0f), Float.valueOf(i5));
                    b0kVar3.s0(o95VarB);
                    obj2 = o95VarB;
                }
                o95 o95Var = (o95) obj2;
                Object objT3 = b0kVar3.T();
                if (objT3 == obj) {
                    objT3 = v8r.q(Boolean.FALSE);
                    b0kVar3.s0(objT3);
                }
                ven0 ven0Var = (ven0) objT3;
                Object objT4 = b0kVar3.T();
                if (objT4 == obj) {
                    objT4 = bb00.h(-1, b0kVar3);
                }
                hdn0 hdn0Var2 = (hdn0) objT4;
                int i14 = i8;
                boolean zG2 = b0kVar3.g(tr80Var2) | (i13 == 256) | ((i8 & 7168) == 2048);
                Object objT5 = b0kVar3.T();
                if (zG2 || objT5 == obj) {
                    rr80 rr80VarO = yoi1.O(tr80Var, i2);
                    ArrayList arrayList = new ArrayList();
                    lr80 it = rr80VarO.iterator();
                    while (((sr80) it).c) {
                        Object next = it.next();
                        hdn0 hdn0Var3 = hdn0Var2;
                        if ((((Number) next).intValue() - ((rr80) tr80Var2).a) % i3 == 0) {
                            arrayList.add(next);
                        }
                        hdn0Var2 = hdn0Var3;
                    }
                    hdn0Var = hdn0Var2;
                    objT5 = o7h.p1(arrayList);
                    b0kVar3.s0(objT5);
                } else {
                    hdn0Var = hdn0Var2;
                }
                Set set = (Set) objT5;
                int i15 = i14 & 14;
                boolean zI = b0kVar3.i(o95Var) | (i15 == 4) | b0kVar3.i(tr80Var2) | (i13 == 256);
                Object objT6 = b0kVar3.T();
                if (zI || objT6 == obj) {
                    z = false;
                    f = f2;
                    objT6 = new utb0(o95Var, i, tr80Var2, i2, (lnm) null);
                    b0kVar3.s0(objT6);
                } else {
                    f = f2;
                    z = false;
                }
                qxd0.t(o95Var, b0kVar3, (vu30) objT6);
                Integer numValueOf = Integer.valueOf(i);
                Object value = ven0Var.getValue();
                ven0 ven0Var2 = ven0Var;
                boolean zI2 = b0kVar3.i(ven0Var2) | (i15 == 4 ? true : z) | b0kVar3.i(tr80Var2) | (i13 == 256 ? true : z) | b0kVar3.i(o95Var);
                Object objT7 = b0kVar3.T();
                if (zI2 || objT7 == obj) {
                    b0kVar2 = b0kVar3;
                    i10 = 131072;
                    num = numValueOf;
                    tep0Var = new tep0(ven0Var2, i, tr80Var2, i2, o95Var, (lnm) null, (byte) 0);
                    ven0Var2 = ven0Var2;
                    o95Var = o95Var;
                    b0kVar2.s0(tep0Var);
                } else {
                    i10 = 131072;
                    num = numValueOf;
                    tep0Var = objT7;
                    b0kVar2 = b0kVar3;
                }
                qxd0.s(num, value, (vu30) tep0Var, b0kVar2);
                qim0 qim0VarD = i541.D(u291.h(u291.f(nim0.a, 1.0f), f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039);
                boolean zD = b0kVar2.d((float) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0386: INVOKE (r2v20 'zD' boolean) = 
                      (r13v12 'b0kVar2' p.b0k)
                      (wrap float:?: CAST (float) (r24v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
                     VIRTUAL call: p.x340.d(float):boolean A[DECLARE_VAR] in method: p.f7p1.e(int, p.tr80, int, int, int, int, long, long, p.lee1, p.yae1, p.iu30, p.iu30, p.iu30, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes7.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r24v0 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1343
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.f7p1.e(int, p.tr80, int, int, int, int, long, long, p.lee1, p.yae1, p.iu30, p.iu30, p.iu30, p.b0k, int, int):void");
            }

            public static final void f(int i, long j, b0k b0kVar, qim0 qim0Var) {
                qim0 qim0Var2;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1141536507);
                int i2 = (x340Var.f(j) ? 4 : 2) | i | 48;
                if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    float fX0 = ((wat) x340Var.k(t4k.h)).X0(12.0f);
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarH = u291.h(qim0Var3, 12.0f);
                    boolean zD = x340Var.d(fX0) | ((i2 & 14) == 4);
                    Object objT = x340Var.T();
                    if (zD || objT == fkj0.X) {
                        objT = new qf0(j, fX0, (byte) 3);
                        x340Var.s0(objT);
                    }
                    j0o1.b(0, x340Var, (iu30) objT, qim0VarH);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new e82(j, qim0Var2, i, (byte) 6);
                }
            }

            public static final kub1 g(kh91 kh91Var) {
                Set set = kh91Var.a;
                if (set.contains(jh91.b)) {
                    return kub1.g;
                }
                return set.contains(jh91.a) ? kub1.f : kub1.N0;
            }

            public static InputConnection h(InputConnection inputConnection, EditorInfo editorInfo, gi80 gi80Var) {
                n8p1.A(editorInfo, "editorInfo must be non-null");
                if (Build.VERSION.SDK_INT >= 25) {
                    return new fi80(inputConnection, gi80Var);
                }
                return w5w.b(editorInfo).length == 0 ? inputConnection : new i860(inputConnection, gi80Var);
            }

            public static InputConnection i(AppCompatEditText appCompatEditText, InputConnection inputConnection, EditorInfo editorInfo) {
                return h(inputConnection, editorInfo, new bf70(appCompatEditText, (byte) 3));
            }

            public static nrk0 j(Integer num, r6h1 r6h1Var) {
                return new nrk0(num, r6h1Var);
            }

            public static long k() {
                return TextUnit.c;
            }

            public static final boolean l(View view) {
                RecyclerView recyclerView;
                if (view == null) {
                    return false;
                }
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        recyclerView = null;
                        break;
                    }
                    if (parent instanceof RecyclerView) {
                        recyclerView = (RecyclerView) parent;
                        break;
                    }
                    parent = parent.getParent();
                }
                if (recyclerView == null) {
                    return false;
                }
                View viewI = recyclerView.I(view);
                w611 w611VarT = viewI != null ? recyclerView.T(viewI) : null;
                return w611VarT != null && w611VarT.n() == -1;
            }

            public static final boolean m(String str) {
                return nhc1.Y(str, "spotify:local:", false);
            }

            public static final mr20 n(zob1 zob1Var, String str, boolean z) {
                return (!z || zob1Var == null) ? new huz((Object) null, (byte) 10) : rqt0.u(new ht20(new m9r0(zob1Var, str, (byte) 19), new pk50(2, (lnm) null, (byte) 29)));
            }

            public static final List o(p530 p530Var, Context context, boolean z, int i) {
                String str = p530Var.b;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                String string = z ? context.getString(2131956085) : context.getString(2131956084);
                string.getClass();
                se31 se31Var = new se31(new cf31(2, "empty-view", str2, string, "", context.getString(2131956081), "empty-view", false), "empty-view", new k3h1(i));
                return Collections.singletonList(new h8k1(se31Var, se31Var));
            }

            public static final ioj0 p(BatchedExtensionResponse batchedExtensionResponse, pv00 pv00Var) {
                ov00 ov00Var;
                Object next;
                ez00 m231Var;
                foj0 goj0Var;
                h290<EntityExtensionDataArray> h290VarQ = batchedExtensionResponse.q();
                ArrayList arrayList = new ArrayList();
                for (EntityExtensionDataArray entityExtensionDataArray : h290VarQ) {
                    h290 h290VarO = entityExtensionDataArray.o();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarO, 10));
                    Iterator it = h290VarO.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new mmr0((EntityExtensionData) it.next(), Integer.valueOf(entityExtensionDataArray.p())));
                    }
                    r7h.W(arrayList2, arrayList);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : arrayList) {
                    String entityUri = ((EntityExtensionData) ((mmr0) obj).a).getEntityUri();
                    Object objH = linkedHashMap.get(entityUri);
                    if (objH == null) {
                        objH = cfm0.h(entityUri, linkedHashMap);
                    }
                    ((List) objH).add(obj);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    List<mmr0> list = (List) entry.getValue();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (mmr0 mmr0Var : list) {
                        EntityExtensionData entityExtensionData = (EntityExtensionData) mmr0Var.a;
                        int iIntValue = ((Number) mmr0Var.b).intValue();
                        Iterator it2 = pv00Var.a.values().iterator();
                        do {
                            ov00Var = null;
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (((ov00) next).b() != iIntValue);
                        ov00 ov00Var2 = (ov00) next;
                        if (ov00Var2 != null) {
                            ov00Var = ov00Var2;
                        } else {
                            n57.e("No ExtendedMetadataPlugin registered for '" + iIntValue + "'. Registered plugins:\n" + pv00Var.b());
                        }
                        if (ov00Var != null) {
                            Class clsType = ov00Var.type();
                            int statusCode = entityExtensionData.o().getStatusCode();
                            if (statusCode == 200) {
                                try {
                                    m231Var = ov00Var.a(entityExtensionData.n().q().t());
                                } catch (Throwable th) {
                                    m231Var = new m231(th);
                                }
                                goj0Var = e331.a(m231Var) == null ? new goj0(m231Var) : new foj0(1);
                            } else {
                                goj0Var = (404 > statusCode || statusCode >= 452) ? new foj0(1) : new foj0(2);
                            }
                            linkedHashMap3.put(clsType, goj0Var);
                        }
                    }
                    linkedHashMap2.put(str, sqg0.U(linkedHashMap3));
                }
                return new ioj0(sqg0.U(linkedHashMap2));
            }

            public static fkh q(int i) {
                return fkh.a[i];
            }
        }
