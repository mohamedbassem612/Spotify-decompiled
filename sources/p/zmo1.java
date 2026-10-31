package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.mobius.Next;
import com.spotify.player.model.PlayOrigin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zmo1 {
    public static b180 a;

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1442655279);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            uwr uwrVar = cbx.a;
            jap1.l(anm1.N("releases_empty_state", uyn1.z(0.0f, cbx.b(x340Var).b.d, 1, qim0VarF)), null, null, str, null, null, null, null, x340Var, (i2 << 9) & 7168, 502);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var2, i, (byte) 4);
        }
    }

    public static final void b(su6 su6Var, em0 em0Var, String str, d0r d0rVar, yzc0 yzc0Var, iac0 iac0Var, lik1 lik1Var, PlayOrigin playOrigin, pbq pbqVar, u961 u961Var, mxa1 mxa1Var, g0p g0pVar, rg51 rg51Var, e0p e0pVar, f0p f0pVar, d0p d0pVar, mw6 mw6Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        rg51 rg51Var2;
        x340 x340Var2;
        Object obj;
        int i2;
        d0r d0rVar2;
        d0r d0rVar3;
        List list;
        List list2;
        uq11 xq11Var;
        smc0 arrayList;
        x340 x340Var3;
        d0r d0rVar4;
        em0 em0Var2;
        String strU;
        int i3;
        u85 u85Var;
        x340 x340Var4;
        int i4;
        String str2 = (String) em0Var.b;
        Object obj2 = fkj0.X;
        List list3 = su6Var.a;
        x340 x340Var5 = (x340) b0kVar;
        x340Var5.k0(1362474137);
        int i5 = i | (x340Var5.g(su6Var) ? 4 : 2) | (x340Var5.g(em0Var) ? 32 : 16) | (x340Var5.g(str) ? 256 : 128) | (x340Var5.i(d0rVar) ? 2048 : 1024) | (x340Var5.i(yzc0Var) ? 16384 : 8192) | (x340Var5.i(iac0Var) ? 131072 : 65536) | (x340Var5.g(lik1Var) ? 1048576 : 524288) | (x340Var5.i(playOrigin) ? 8388608 : 4194304) | (x340Var5.i(pbqVar) ? 67108864 : 33554432) | (x340Var5.i(u961Var) ? 536870912 : 268435456);
        if (x340Var5.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (((((((((x340Var5.i(mxa1Var) ? (char) 4 : (char) 2) | (x340Var5.i(g0pVar) ? ' ' : (char) 16)) | (x340Var5.i(rg51Var) ? (char) 256 : (char) 128)) | (x340Var5.i(e0pVar) ? (char) 2048 : (char) 1024)) | (x340Var5.i(f0pVar) ? (char) 16384 : (char) 8192)) | (x340Var5.i(d0pVar) ? (char) 0 : (char) 0)) | (x340Var5.i(mw6Var) ? (char) 0 : (char) 0)) | 12582912) & 4793491) == 4793490) ? false : true)) {
            int i6 = 3670016 & i5;
            int i7 = i5 & 896;
            boolean zG = x340Var5.g(pbqVar) | x340Var5.g(d0rVar) | x340Var5.g(yzc0Var) | (i6 == 1048576) | x340Var5.g(playOrigin) | x340Var5.g(iac0Var) | (i7 == 256);
            Object objT = x340Var5.T();
            if (zG || objT == obj2) {
                rg51Var2 = rg51Var;
                x340Var2 = x340Var5;
                obj = obj2;
                i2 = i6;
                d0rVar2 = d0rVar;
                xzq xzqVar = new xzq(((zs11) pbqVar.f).a(d0rVar2, zvf1.a((zvf1) pbqVar.b, h2x0.P0, (String) null, (o3r) null, new iv81(pbqVar, lik1Var, (byte) 20), hea1.g, new kwf1(new ab8(yzc0Var, (vgm) pbqVar.g, lik1Var, (q8n) pbqVar.e), d0rVar, ((req) ((kly0) pbqVar.i).get()).a(iac0Var, a8o.v((peq) ((kly0) pbqVar.t).get(), new huz(Collections.singleton(str), (byte) 10)), playOrigin), (vb2) ((kly0) pbqVar.X).get(), (opv0) ((kly0) pbqVar.c).get(), (t740) ((kly0) pbqVar.d).get()), (sb2) null, 2682), (nu11) null), hea1.h);
                x340Var2.s0(xzqVar);
                objT = xzqVar;
            } else {
                obj = obj2;
                i2 = i6;
                d0rVar2 = d0rVar;
                rg51Var2 = rg51Var;
                x340Var2 = x340Var5;
            }
            tyq tyqVar = (tyq) objT;
            boolean zG2 = x340Var2.g(u961Var) | x340Var2.g(d0rVar2);
            Object objT2 = x340Var2.T();
            npc1 npc1Var = npc1.a;
            if (zG2 || objT2 == obj) {
                xzq xzqVar2 = new xzq(((zs11) u961Var.a).a(d0rVar2, new ls11((ds11) null, (ds11) null, (ds11) null, (ds11) null, (iu30) null, (iu30) null, (qrk) null, (iu30) null, (iu30) null, new re3((q8n) u961Var.d, (lzn0) u961Var.c), zhm0.d, 2, new o27(0, 1, null), (gye1) null, npc1Var, (sb2) null, (rru) null, false, (o3r) null, (o3r) null, (o3r) null, (o3r) null, bf3.a((bf3) u961Var.b, false, 1), (o3r) null, (cv11) null, (y5z) null, (bnw0) null, (bt11) null, 1, (o3r) null, -33611265, 495), (nu11) null), ra3.a1);
                x340Var2.s0(xzqVar2);
                objT2 = xzqVar2;
            }
            tyq tyqVar2 = (tyq) objT2;
            boolean zG3 = x340Var2.g(mxa1Var) | x340Var2.g(d0rVar2) | x340Var2.g(yzc0Var);
            Object objT3 = x340Var2.T();
            if (zG3 || objT3 == obj) {
                d0rVar3 = d0rVar2;
                objT3 = new xzq(((zs11) mxa1Var.b).a(d0rVar3, new ls11((ds11) null, (ds11) null, (ds11) null, (ds11) null, (iu30) null, (iu30) null, (qrk) null, (iu30) null, (iu30) null, new hke(yzc0Var, (vgm) mxa1Var.d, (h5q) mxa1Var.c, (e7p0) mxa1Var.e, (ytp0) mxa1Var.f, (kt91) mxa1Var.g, (q8n) mxa1Var.h), i2x0.U0, 2, (o27) null, (gye1) null, npc1Var, (sb2) null, (rru) null, false, wwj1.b, wwj1.c, (o3r) null, (o3r) null, wwj1.a, (o3r) null, (cv11) null, (y5z) null, (bnw0) null, (bt11) null, 2, (o3r) null, -39865857, 495), (nu11) null), fsj1.g);
                x340Var2.s0(objT3);
            } else {
                d0rVar3 = d0rVar2;
            }
            tyq tyqVar3 = (tyq) objT3;
            boolean zG4 = x340Var2.g(g0pVar) | x340Var2.g(rg51Var2);
            Object objT4 = x340Var2.T();
            if (zG4 || objT4 == obj) {
                kpg0 kpg0Var = new kpg0(new br0(rg51Var2), cv6.f);
                x340Var2.s0(kpg0Var);
                objT4 = kpg0Var;
            }
            kpg0 kpg0Var2 = (kpg0) objT4;
            boolean zG5 = x340Var2.g(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0387: INVOKE (r3v30 'zG5' boolean) = (r14v3 'x340Var2' p.x340), (r18v0 java.lang.Iterable) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[DECLARE_VAR] (LINE:904) in method: p.zmo1.b(p.su6, p.em0, java.lang.String, p.d0r, p.yzc0, p.iac0, p.lik1, com.spotify.player.model.PlayOrigin, p.pbq, p.u961, p.mxa1, p.g0p, p.rg51, p.e0p, p.f0p, p.d0p, p.mw6, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 java.lang.Iterable
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 2415
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.zmo1.b(p.su6, p.em0, java.lang.String, p.d0r, p.yzc0, p.iac0, p.lik1, com.spotify.player.model.PlayOrigin, p.pbq, p.u961, p.mxa1, p.g0p, p.rg51, p.e0p, p.f0p, p.d0p, p.mw6, p.qim0, p.b0k, int):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v4 */
        /* JADX WARN: Type inference failed for: r13v5, types: [boolean, byte] */
        /* JADX WARN: Type inference failed for: r13v6 */
        /* JADX WARN: Type inference failed for: r5v19 */
        /* JADX WARN: Type inference failed for: r5v20 */
        /* JADX WARN: Type inference failed for: r5v22 */
        public static final void c(lik1 lik1Var, String str, c380 c380Var, aod aodVar, hvp0 hvp0Var, i3b i3bVar, qim0 qim0Var, vzq0 vzq0Var, b0k b0kVar, int i) {
            int i2;
            String str2;
            qim0 qim0Var2;
            ?? r13;
            boolean z;
            m4c m4cVar = fkj0.X;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-425533295);
            if ((i & 6) == 0) {
                i2 = (x340Var.g(lik1Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                str2 = str;
                i2 |= x340Var.g(str2) ? 32 : 16;
            } else {
                str2 = str;
            }
            if ((i & 384) == 0) {
                i2 |= x340Var.g(c380Var) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= (i & 4096) == 0 ? x340Var.g(aodVar) : x340Var.i(aodVar) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i2 |= x340Var.i(hvp0Var) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i2 |= x340Var.i(i3bVar) ? 131072 : 65536;
            }
            int i3 = i2 | 1572864;
            if ((12582912 & i) == 0) {
                i3 |= x340Var.i(vzq0Var) ? 8388608 : 4194304;
            }
            if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
                x340Var.d0();
                int i4 = i & 1;
                qim0 qim0Var3 = nim0.a;
                if (i4 == 0 || x340Var.E()) {
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                x340Var.s();
                xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
                int i5 = i3 & 896;
                boolean zG = ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && x340Var.g(aodVar))) | ((i3 & 14) == 4) | x340Var.g(hvp0Var) | (i5 == 256) | ((i3 & 112) == 32) | x340Var.g(i3bVar);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    dnc0 dnc0VarB = hvp0.b(hvp0Var);
                    r13 = 1;
                    fta ftaVar = new fta(lik1Var, str2, c380Var, aodVar, dnc0VarB, i3bVar);
                    dnc0VarB.b(new gj50(new pke(ftaVar, (byte) 0), false), new pke(ftaVar, (byte) 2));
                    objT = dnc0VarB.a();
                    x340Var.s0(objT);
                } else {
                    r13 = 1;
                }
                x340Var.f0(-915571121, x340Var.K(xtb0VarA, c380Var));
                lnm lnmVar = null;
                q1d0 q1d0VarN = jyo1.n(xtb0VarA, (cnc0) objT, null, x340Var, 4);
                x340Var.r(false);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = (String) ((bpb1) aodVar.c).getValue();
                    x340Var.s0(objT2);
                }
                String str3 = (String) objT2;
                if (str3 != null) {
                    x340Var.i0(1682279851);
                    ?? r5 = i5 == 256 ? r13 : 0;
                    Object objT3 = x340Var.T();
                    if (r5 != 0 || objT3 == m4cVar) {
                        objT3 = Integer.valueOf(c380Var.indexOf(str3));
                        x340Var.s0(objT3);
                    }
                    int iIntValue = ((Number) objT3).intValue();
                    Integer numValueOf = Integer.valueOf(iIntValue);
                    boolean zE = x340Var.e(iIntValue) | x340Var.i(xtb0VarA);
                    Object objT4 = x340Var.T();
                    if (zE || objT4 == m4cVar) {
                        objT4 = new x0e(iIntValue, xtb0VarA, lnmVar, (byte) r13);
                        x340Var.s0(objT4);
                    }
                    qxd0.t(numValueOf, x340Var, (vu30) objT4);
                    z = false;
                    x340Var.r(false);
                } else {
                    z = false;
                    x340Var.i0(1682500881);
                    x340Var.r(false);
                }
                qim0 qim0VarZ = u291.z(qim0Var3, (fra) null, 3);
                gfh0 gfh0VarC = t1c.c(een.d, z);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
                mod.b(jxq0.a.a((Object) null), apo.r(-1091790761, new hwd(qim0Var2, xtb0VarA, vzq0Var, q1d0VarN), x340Var), x340Var, 56);
                j(xtb0VarA, null, x340Var, 6);
                x340Var.r((boolean) r13);
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new f1c(lik1Var, str, c380Var, aodVar, hvp0Var, i3bVar, qim0Var2, vzq0Var, i);
            }
        }

        public static final void d() {
            kl1 kl1Var = j761.a;
        }

        /* JADX WARN: Code duplicated, block: B:108:0x013f  */
        /* JADX WARN: Code duplicated, block: B:110:0x0143  */
        /* JADX WARN: Code duplicated, block: B:112:0x0151  */
        /* JADX WARN: Code duplicated, block: B:114:0x0155  */
        /* JADX WARN: Code duplicated, block: B:117:0x015b  */
        /* JADX WARN: Code duplicated, block: B:120:0x0163  */
        /* JADX WARN: Code duplicated, block: B:121:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:124:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:128:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:134:0x0219  */
        /* JADX WARN: Code duplicated, block: B:136:0x022e  */
        /* JADX WARN: Code duplicated, block: B:138:0x0233  */
        /* JADX WARN: Code duplicated, block: B:141:0x02cc  */
        /* JADX WARN: Code duplicated, block: B:144:0x02e3  */
        /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:49:0x0089  */
        /* JADX WARN: Code duplicated, block: B:51:0x008d  */
        /* JADX WARN: Code duplicated, block: B:53:0x0090  */
        /* JADX WARN: Code duplicated, block: B:55:0x0098  */
        /* JADX WARN: Code duplicated, block: B:56:0x009b  */
        /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:64:0x00af  */
        /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:83:0x00e7 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:93:0x0108  */
        /* JADX WARN: Code duplicated, block: B:95:0x0117  */
        /* JADX WARN: Instruction removed from duplicated block: B:93:0x0108, please report this as an issue */
        public static final void e(String str, qim0 qim0Var, ibx ibxVar, long j, a0e1 a0e1Var, mhc0 mhc0Var, int i, boolean z, int i2, s61 s61Var, iu30 iu30Var, b0k b0kVar, int i3, int i4) {
            int i5;
            long j2;
            a0e1 a0e1Var2;
            int i6;
            mhc0 mhc0Var2;
            int i7;
            int i8;
            int i9;
            boolean z2;
            x340 x340Var;
            int i10;
            s61 s61Var2;
            long j3;
            a0e1 a0e1Var3;
            mhc0 mhc0Var3;
            int i11;
            boolean z3;
            iu30 iu30Var2;
            h311 h311VarV;
            s61 s61Var3;
            Object objT;
            a0e1 a0e1Var4;
            mhc0 mhc0Var4;
            int i12;
            boolean z4;
            s61 s61Var4;
            iu30 iu30Var3;
            int i13;
            a0e1 a0e1Var5;
            mhc0 mhc0Var5;
            boolean z5;
            int i14;
            s61 s61Var5;
            int i15;
            lee1 lee1Var = ibxVar.b;
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.k0(181231482);
            if ((i3 & 6) == 0) {
                i5 = (x340Var2.g(str) ? 4 : 2) | i3;
            } else {
                i5 = i3;
            }
            if ((i3 & 48) == 0) {
                i5 |= x340Var2.i(qim0Var) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                i5 |= x340Var2.i(ibxVar) ? 256 : 128;
            }
            if ((i3 & 3072) == 0) {
                if ((i4 & 8) == 0) {
                    j2 = j;
                    int i16 = x340Var2.f(j2) ? 2048 : 1024;
                    i5 |= i16;
                } else {
                    j2 = j;
                }
                i5 |= i16;
            } else {
                j2 = j;
            }
            int i17 = i4 & 16;
            if (i17 == 0) {
                if ((i3 & 24576) == 0) {
                    a0e1Var2 = a0e1Var;
                    i5 |= x340Var2.g(a0e1Var2) ? 16384 : 8192;
                }
                i6 = i4 & 32;
                if (i6 != 0) {
                    if ((196608 & i3) == 0) {
                        mhc0Var2 = mhc0Var;
                        if (x340Var2.g(mhc0Var2)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i5 |= i7;
                    }
                    if ((1572864 & i3) == 0) {
                        if ((i4 & 64) == 0) {
                            i8 = i;
                            int i18 = x340Var2.e(i8) ? 1048576 : 524288;
                            i5 |= i18;
                        } else {
                            i8 = i;
                        }
                        i5 |= i18;
                    } else {
                        i8 = i;
                    }
                    i9 = i5 | 12582912;
                    if ((i3 & 100663296) == 0) {
                        if (x340Var2.e(i2)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i9 |= i15;
                    }
                    if ((i3 & 805306368) != 0) {
                        i9 |= ((i4 & 512) == 0 || !x340Var2.g(s61Var)) ? 268435456 : 536870912;
                    }
                    if ((i9 & 306783379) == 306783378) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (x340Var2.Y(i9 & 1, z2)) {
                        x340Var2.d0();
                        if ((i3 & 1) != 0 || x340Var2.E()) {
                            if ((i4 & 8) != 0) {
                                j2 = ((u7h) x340Var2.k(qgx.a)).a;
                                i9 &= -7169;
                            }
                            if (i17 != 0) {
                                a0e1Var2 = null;
                            }
                            if (i6 != 0) {
                                mhc0Var2 = null;
                            }
                            if ((i4 & 64) != 0) {
                                i9 &= -3670017;
                                i8 = 1;
                            }
                            if ((i4 & 512) != 0) {
                                s61Var3 = new s61(fc11.G(20), fc11.G(48), 96.0f, 75.0f, mqo1.A(p7h.M(new Integer[]{75, 80, 85, 90, 96})));
                                i9 &= -1879048193;
                            } else {
                                s61Var3 = s61Var;
                            }
                            objT = x340Var2.T();
                            if (objT == fkj0.X) {
                                objT = s8x.h;
                                x340Var2.s0(objT);
                            }
                            j3 = j2;
                            a0e1Var4 = a0e1Var2;
                            mhc0Var4 = mhc0Var2;
                            i12 = i8;
                            z4 = true;
                            s61Var4 = s61Var3;
                            iu30Var3 = (iu30) objT;
                            i13 = i9;
                        } else {
                            x340Var2.b0();
                            if ((i4 & 8) != 0) {
                                i9 &= -7169;
                            }
                            if ((i4 & 64) != 0) {
                                i9 &= -3670017;
                            }
                            if ((i4 & 512) != 0) {
                                i9 &= -1879048193;
                            }
                            i13 = i9;
                            j3 = j2;
                            a0e1Var4 = a0e1Var2;
                            mhc0Var4 = mhc0Var2;
                            i12 = i8;
                            z4 = z;
                            s61Var4 = s61Var;
                            iu30Var3 = iu30Var;
                        }
                        x340Var2.s();
                        if (Build.VERSION.SDK_INT >= 29 || !ouo1.W(str)) {
                            long j4 = j3;
                            a0e1Var5 = a0e1Var4;
                            mhc0Var5 = mhc0Var4;
                            i11 = i12;
                            z5 = z4;
                            x340Var2.i0(294216997);
                            if (mhc0Var5 != null) {
                                i14 = mhc0Var5.a;
                            } else {
                                i14 = lee1Var.b.g;
                            }
                            mhc0Var3 = mhc0Var5;
                            i10 = i2;
                            int i19 = i13;
                            s61Var5 = s61Var4;
                            uwo1.e(str, qim0Var, lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, i14, 14680063), j4, a0e1Var5, null, i11, z5, new cjc0(i10), 0, new px8(s61Var5.a, s61Var5.b, 0L, (mx8) null, 12), x340Var2, i19 & 33094782, 8, 544);
                            j3 = j4;
                            x340Var = x340Var2;
                            x340Var.r(false);
                        } else {
                            x340Var2.i0(293778998);
                            lee1 lee1Var2 = ibxVar.a;
                            FontWeight fontWeight = lee1Var.a.c;
                            r61.a(str, qim0Var, lee1Var2, j3, a0e1Var4, mhc0Var4, i12, z4, i2, iu30Var3, s61Var4, fontWeight != null ? Integer.valueOf(fontWeight.a) : null, x340Var2, (268434558 & i13) | 805306368, (i13 >> 27) & 14);
                            a0e1Var5 = a0e1Var4;
                            i11 = i12;
                            z5 = z4;
                            x340Var = x340Var2;
                            x340Var.r(false);
                            i10 = i2;
                            mhc0Var3 = mhc0Var4;
                            s61Var5 = s61Var4;
                        }
                        s61Var2 = s61Var5;
                        a0e1Var3 = a0e1Var5;
                        z3 = z5;
                        iu30Var2 = iu30Var3;
                    } else {
                        x340Var = x340Var2;
                        i10 = i2;
                        x340Var.b0();
                        s61Var2 = s61Var;
                        j3 = j2;
                        a0e1Var3 = a0e1Var2;
                        mhc0Var3 = mhc0Var2;
                        i11 = i8;
                        z3 = z;
                        iu30Var2 = iu30Var;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new hbx(str, qim0Var, ibxVar, j3, a0e1Var3, mhc0Var3, i11, z3, i10, s61Var2, iu30Var2, i3, i4);
                    }
                }
                i5 |= 196608;
                mhc0Var2 = mhc0Var;
                if ((1572864 & i3) == 0) {
                    if ((i4 & 64) == 0) {
                        i8 = i;
                        if (x340Var2.e(i8)) {
                        }
                        i5 |= i18;
                    } else {
                        i8 = i;
                    }
                    i5 |= i18;
                } else {
                    i8 = i;
                }
                i9 = i5 | 12582912;
                if ((i3 & 100663296) == 0) {
                    if (x340Var2.e(i2)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i9 |= i15;
                }
                if ((i3 & 805306368) != 0) {
                    i9 |= ((i4 & 512) == 0 || !x340Var2.g(s61Var)) ? 268435456 : 536870912;
                }
                if ((i9 & 306783379) == 306783378) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (x340Var2.Y(i9 & 1, z2)) {
                    x340Var2.d0();
                    if ((i3 & 1) != 0) {
                        if ((i4 & 8) != 0) {
                            j2 = ((u7h) x340Var2.k(qgx.a)).a;
                            i9 &= -7169;
                        }
                        if (i17 != 0) {
                            a0e1Var2 = null;
                        }
                        if (i6 != 0) {
                            mhc0Var2 = null;
                        }
                        if ((i4 & 64) != 0) {
                            i9 &= -3670017;
                            i8 = 1;
                        }
                        if ((i4 & 512) != 0) {
                            s61Var3 = new s61(fc11.G(20), fc11.G(48), 96.0f, 75.0f, mqo1.A(p7h.M(new Integer[]{75, 80, 85, 90, 96})));
                            i9 &= -1879048193;
                        } else {
                            s61Var3 = s61Var;
                        }
                        objT = x340Var2.T();
                        if (objT == fkj0.X) {
                            objT = s8x.h;
                            x340Var2.s0(objT);
                        }
                        j3 = j2;
                        a0e1Var4 = a0e1Var2;
                        mhc0Var4 = mhc0Var2;
                        i12 = i8;
                        z4 = true;
                        s61Var4 = s61Var3;
                        iu30Var3 = (iu30) objT;
                        i13 = i9;
                    } else {
                        if ((i4 & 8) != 0) {
                            j2 = ((u7h) x340Var2.k(qgx.a)).a;
                            i9 &= -7169;
                        }
                        if (i17 != 0) {
                            a0e1Var2 = null;
                        }
                        if (i6 != 0) {
                            mhc0Var2 = null;
                        }
                        if ((i4 & 64) != 0) {
                            i9 &= -3670017;
                            i8 = 1;
                        }
                        if ((i4 & 512) != 0) {
                            s61Var3 = new s61(fc11.G(20), fc11.G(48), 96.0f, 75.0f, mqo1.A(p7h.M(new Integer[]{75, 80, 85, 90, 96})));
                            i9 &= -1879048193;
                        } else {
                            s61Var3 = s61Var;
                        }
                        objT = x340Var2.T();
                        if (objT == fkj0.X) {
                            objT = s8x.h;
                            x340Var2.s0(objT);
                        }
                        j3 = j2;
                        a0e1Var4 = a0e1Var2;
                        mhc0Var4 = mhc0Var2;
                        i12 = i8;
                        z4 = true;
                        s61Var4 = s61Var3;
                        iu30Var3 = (iu30) objT;
                        i13 = i9;
                    }
                    x340Var2.s();
                    if (Build.VERSION.SDK_INT >= 29) {
                        long j5 = j3;
                        a0e1Var5 = a0e1Var4;
                        mhc0Var5 = mhc0Var4;
                        i11 = i12;
                        z5 = z4;
                        x340Var2.i0(294216997);
                        if (mhc0Var5 != null) {
                            i14 = mhc0Var5.a;
                        } else {
                            i14 = lee1Var.b.g;
                        }
                        mhc0Var3 = mhc0Var5;
                        i10 = i2;
                        int i110 = i13;
                        s61Var5 = s61Var4;
                        uwo1.e(str, qim0Var, lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, i14, 14680063), j5, a0e1Var5, null, i11, z5, new cjc0(i10), 0, new px8(s61Var5.a, s61Var5.b, 0L, (mx8) null, 12), x340Var2, i110 & 33094782, 8, 544);
                        j3 = j5;
                        x340Var = x340Var2;
                        x340Var.r(false);
                    } else {
                        long j6 = j3;
                        a0e1Var5 = a0e1Var4;
                        mhc0Var5 = mhc0Var4;
                        i11 = i12;
                        z5 = z4;
                        x340Var2.i0(294216997);
                        if (mhc0Var5 != null) {
                            i14 = mhc0Var5.a;
                        } else {
                            i14 = lee1Var.b.g;
                        }
                        mhc0Var3 = mhc0Var5;
                        i10 = i2;
                        int i111 = i13;
                        s61Var5 = s61Var4;
                        uwo1.e(str, qim0Var, lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, i14, 14680063), j6, a0e1Var5, null, i11, z5, new cjc0(i10), 0, new px8(s61Var5.a, s61Var5.b, 0L, (mx8) null, 12), x340Var2, i111 & 33094782, 8, 544);
                        j3 = j6;
                        x340Var = x340Var2;
                        x340Var.r(false);
                    }
                    s61Var2 = s61Var5;
                    a0e1Var3 = a0e1Var5;
                    z3 = z5;
                    iu30Var2 = iu30Var3;
                } else {
                    x340Var = x340Var2;
                    i10 = i2;
                    x340Var.b0();
                    s61Var2 = s61Var;
                    j3 = j2;
                    a0e1Var3 = a0e1Var2;
                    mhc0Var3 = mhc0Var2;
                    i11 = i8;
                    z3 = z;
                    iu30Var2 = iu30Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hbx(str, qim0Var, ibxVar, j3, a0e1Var3, mhc0Var3, i11, z3, i10, s61Var2, iu30Var2, i3, i4);
                }
            }
            i5 |= 24576;
            a0e1Var2 = a0e1Var;
            i6 = i4 & 32;
            if (i6 != 0) {
                if ((196608 & i3) == 0) {
                    mhc0Var2 = mhc0Var;
                    if (x340Var2.g(mhc0Var2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i5 |= i7;
                }
                if ((1572864 & i3) == 0) {
                    if ((i4 & 64) == 0) {
                        i8 = i;
                        if (x340Var2.e(i8)) {
                        }
                        i5 |= i18;
                    } else {
                        i8 = i;
                    }
                    i5 |= i18;
                } else {
                    i8 = i;
                }
                i9 = i5 | 12582912;
                if ((i3 & 100663296) == 0) {
                    if (x340Var2.e(i2)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i9 |= i15;
                }
                if ((i3 & 805306368) != 0) {
                    i9 |= ((i4 & 512) == 0 || !x340Var2.g(s61Var)) ? 268435456 : 536870912;
                }
                if ((i9 & 306783379) == 306783378) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (x340Var2.Y(i9 & 1, z2)) {
                    x340Var2.d0();
                    if ((i3 & 1) != 0) {
                        if ((i4 & 8) != 0) {
                            j2 = ((u7h) x340Var2.k(qgx.a)).a;
                            i9 &= -7169;
                        }
                        if (i17 != 0) {
                            a0e1Var2 = null;
                        }
                        if (i6 != 0) {
                            mhc0Var2 = null;
                        }
                        if ((i4 & 64) != 0) {
                            i9 &= -3670017;
                            i8 = 1;
                        }
                        if ((i4 & 512) != 0) {
                            s61Var3 = new s61(fc11.G(20), fc11.G(48), 96.0f, 75.0f, mqo1.A(p7h.M(new Integer[]{75, 80, 85, 90, 96})));
                            i9 &= -1879048193;
                        } else {
                            s61Var3 = s61Var;
                        }
                        objT = x340Var2.T();
                        if (objT == fkj0.X) {
                            objT = s8x.h;
                            x340Var2.s0(objT);
                        }
                        j3 = j2;
                        a0e1Var4 = a0e1Var2;
                        mhc0Var4 = mhc0Var2;
                        i12 = i8;
                        z4 = true;
                        s61Var4 = s61Var3;
                        iu30Var3 = (iu30) objT;
                        i13 = i9;
                    } else {
                        if ((i4 & 8) != 0) {
                            j2 = ((u7h) x340Var2.k(qgx.a)).a;
                            i9 &= -7169;
                        }
                        if (i17 != 0) {
                            a0e1Var2 = null;
                        }
                        if (i6 != 0) {
                            mhc0Var2 = null;
                        }
                        if ((i4 & 64) != 0) {
                            i9 &= -3670017;
                            i8 = 1;
                        }
                        if ((i4 & 512) != 0) {
                            s61Var3 = new s61(fc11.G(20), fc11.G(48), 96.0f, 75.0f, mqo1.A(p7h.M(new Integer[]{75, 80, 85, 90, 96})));
                            i9 &= -1879048193;
                        } else {
                            s61Var3 = s61Var;
                        }
                        objT = x340Var2.T();
                        if (objT == fkj0.X) {
                            objT = s8x.h;
                            x340Var2.s0(objT);
                        }
                        j3 = j2;
                        a0e1Var4 = a0e1Var2;
                        mhc0Var4 = mhc0Var2;
                        i12 = i8;
                        z4 = true;
                        s61Var4 = s61Var3;
                        iu30Var3 = (iu30) objT;
                        i13 = i9;
                    }
                    x340Var2.s();
                    if (Build.VERSION.SDK_INT >= 29) {
                        long j7 = j3;
                        a0e1Var5 = a0e1Var4;
                        mhc0Var5 = mhc0Var4;
                        i11 = i12;
                        z5 = z4;
                        x340Var2.i0(294216997);
                        if (mhc0Var5 != null) {
                            i14 = mhc0Var5.a;
                        } else {
                            i14 = lee1Var.b.g;
                        }
                        mhc0Var3 = mhc0Var5;
                        i10 = i2;
                        int i112 = i13;
                        s61Var5 = s61Var4;
                        uwo1.e(str, qim0Var, lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, i14, 14680063), j7, a0e1Var5, null, i11, z5, new cjc0(i10), 0, new px8(s61Var5.a, s61Var5.b, 0L, (mx8) null, 12), x340Var2, i112 & 33094782, 8, 544);
                        j3 = j7;
                        x340Var = x340Var2;
                        x340Var.r(false);
                    } else {
                        long j8 = j3;
                        a0e1Var5 = a0e1Var4;
                        mhc0Var5 = mhc0Var4;
                        i11 = i12;
                        z5 = z4;
                        x340Var2.i0(294216997);
                        if (mhc0Var5 != null) {
                            i14 = mhc0Var5.a;
                        } else {
                            i14 = lee1Var.b.g;
                        }
                        mhc0Var3 = mhc0Var5;
                        i10 = i2;
                        int i113 = i13;
                        s61Var5 = s61Var4;
                        uwo1.e(str, qim0Var, lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, i14, 14680063), j8, a0e1Var5, null, i11, z5, new cjc0(i10), 0, new px8(s61Var5.a, s61Var5.b, 0L, (mx8) null, 12), x340Var2, i113 & 33094782, 8, 544);
                        j3 = j8;
                        x340Var = x340Var2;
                        x340Var.r(false);
                    }
                    s61Var2 = s61Var5;
                    a0e1Var3 = a0e1Var5;
                    z3 = z5;
                    iu30Var2 = iu30Var3;
                } else {
                    x340Var = x340Var2;
                    i10 = i2;
                    x340Var.b0();
                    s61Var2 = s61Var;
                    j3 = j2;
                    a0e1Var3 = a0e1Var2;
                    mhc0Var3 = mhc0Var2;
                    i11 = i8;
                    z3 = z;
                    iu30Var2 = iu30Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new hbx(str, qim0Var, ibxVar, j3, a0e1Var3, mhc0Var3, i11, z3, i10, s61Var2, iu30Var2, i3, i4);
                }
            }
            i5 |= 196608;
            mhc0Var2 = mhc0Var;
            if ((1572864 & i3) == 0) {
                if ((i4 & 64) == 0) {
                    i8 = i;
                    if (x340Var2.e(i8)) {
                    }
                    i5 |= i18;
                } else {
                    i8 = i;
                }
                i5 |= i18;
            } else {
                i8 = i;
            }
            i9 = i5 | 12582912;
            if ((i3 & 100663296) == 0) {
                if (x340Var2.e(i2)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i9 |= i15;
            }
            if ((i3 & 805306368) != 0) {
                i9 |= ((i4 & 512) == 0 || !x340Var2.g(s61Var)) ? 268435456 : 536870912;
            }
            if ((i9 & 306783379) == 306783378) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (x340Var2.Y(i9 & 1, z2)) {
                x340Var2.d0();
                if ((i3 & 1) != 0) {
                    if ((i4 & 8) != 0) {
                        j2 = ((u7h) x340Var2.k(qgx.a)).a;
                        i9 &= -7169;
                    }
                    if (i17 != 0) {
                        a0e1Var2 = null;
                    }
                    if (i6 != 0) {
                        mhc0Var2 = null;
                    }
                    if ((i4 & 64) != 0) {
                        i9 &= -3670017;
                        i8 = 1;
                    }
                    if ((i4 & 512) != 0) {
                        s61Var3 = new s61(fc11.G(20), fc11.G(48), 96.0f, 75.0f, mqo1.A(p7h.M(new Integer[]{75, 80, 85, 90, 96})));
                        i9 &= -1879048193;
                    } else {
                        s61Var3 = s61Var;
                    }
                    objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = s8x.h;
                        x340Var2.s0(objT);
                    }
                    j3 = j2;
                    a0e1Var4 = a0e1Var2;
                    mhc0Var4 = mhc0Var2;
                    i12 = i8;
                    z4 = true;
                    s61Var4 = s61Var3;
                    iu30Var3 = (iu30) objT;
                    i13 = i9;
                } else {
                    if ((i4 & 8) != 0) {
                        j2 = ((u7h) x340Var2.k(qgx.a)).a;
                        i9 &= -7169;
                    }
                    if (i17 != 0) {
                        a0e1Var2 = null;
                    }
                    if (i6 != 0) {
                        mhc0Var2 = null;
                    }
                    if ((i4 & 64) != 0) {
                        i9 &= -3670017;
                        i8 = 1;
                    }
                    if ((i4 & 512) != 0) {
                        s61Var3 = new s61(fc11.G(20), fc11.G(48), 96.0f, 75.0f, mqo1.A(p7h.M(new Integer[]{75, 80, 85, 90, 96})));
                        i9 &= -1879048193;
                    } else {
                        s61Var3 = s61Var;
                    }
                    objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = s8x.h;
                        x340Var2.s0(objT);
                    }
                    j3 = j2;
                    a0e1Var4 = a0e1Var2;
                    mhc0Var4 = mhc0Var2;
                    i12 = i8;
                    z4 = true;
                    s61Var4 = s61Var3;
                    iu30Var3 = (iu30) objT;
                    i13 = i9;
                }
                x340Var2.s();
                if (Build.VERSION.SDK_INT >= 29) {
                    long j9 = j3;
                    a0e1Var5 = a0e1Var4;
                    mhc0Var5 = mhc0Var4;
                    i11 = i12;
                    z5 = z4;
                    x340Var2.i0(294216997);
                    if (mhc0Var5 != null) {
                        i14 = mhc0Var5.a;
                    } else {
                        i14 = lee1Var.b.g;
                    }
                    mhc0Var3 = mhc0Var5;
                    i10 = i2;
                    int i114 = i13;
                    s61Var5 = s61Var4;
                    uwo1.e(str, qim0Var, lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, i14, 14680063), j9, a0e1Var5, null, i11, z5, new cjc0(i10), 0, new px8(s61Var5.a, s61Var5.b, 0L, (mx8) null, 12), x340Var2, i114 & 33094782, 8, 544);
                    j3 = j9;
                    x340Var = x340Var2;
                    x340Var.r(false);
                } else {
                    long j10 = j3;
                    a0e1Var5 = a0e1Var4;
                    mhc0Var5 = mhc0Var4;
                    i11 = i12;
                    z5 = z4;
                    x340Var2.i0(294216997);
                    if (mhc0Var5 != null) {
                        i14 = mhc0Var5.a;
                    } else {
                        i14 = lee1Var.b.g;
                    }
                    mhc0Var3 = mhc0Var5;
                    i10 = i2;
                    int i115 = i13;
                    s61Var5 = s61Var4;
                    uwo1.e(str, qim0Var, lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, i14, 14680063), j10, a0e1Var5, null, i11, z5, new cjc0(i10), 0, new px8(s61Var5.a, s61Var5.b, 0L, (mx8) null, 12), x340Var2, i115 & 33094782, 8, 544);
                    j3 = j10;
                    x340Var = x340Var2;
                    x340Var.r(false);
                }
                s61Var2 = s61Var5;
                a0e1Var3 = a0e1Var5;
                z3 = z5;
                iu30Var2 = iu30Var3;
            } else {
                x340Var = x340Var2;
                i10 = i2;
                x340Var.b0();
                s61Var2 = s61Var;
                j3 = j2;
                a0e1Var3 = a0e1Var2;
                mhc0Var3 = mhc0Var2;
                i11 = i8;
                z3 = z;
                iu30Var2 = iu30Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hbx(str, qim0Var, ibxVar, j3, a0e1Var3, mhc0Var3, i11, z3, i10, s61Var2, iu30Var2, i3, i4);
            }
        }

        public static final void f(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
            List listM;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1846735478);
            int i2 = (x340Var.i(qim0Var) ? 32 : 16) | i;
            if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
                if (z) {
                    x340Var.i0(1860749062);
                    uwr uwrVar = cbx.a;
                    listM = p7h.M(new u7h[]{new u7h(cbx.a(x340Var).a.a.a()), new u7h(u7h.b(cbx.a(x340Var).a.a.a(), 0.0f, 0.0f, 0.0f, 0.0f, 14))});
                    x340Var.r(false);
                } else {
                    x340Var.i0(1860951430);
                    uwr uwrVar2 = cbx.a;
                    listM = p7h.M(new u7h[]{new u7h(u7h.b(cbx.a(x340Var).a.a.a(), 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(cbx.a(x340Var).a.a.a())});
                    x340Var.r(false);
                }
                t1c.a(dug.e(qim0Var, v9c.s(listM, 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new uc0(z, qim0Var, i, (byte) 2);
            }
        }

        public static final void g(mb60 mb60Var, hjp hjpVar, b0k b0kVar, int i) {
            mb60 mb60Var2;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1546643512);
            int i2 = (x340Var.i(mb60Var) ? 4 : 2) | i | (x340Var.i(hjpVar) ? 32 : 16);
            nim0 nim0Var = nim0.a;
            int i3 = i2 | (x340Var.i(nim0Var) ? 256 : 128);
            byte b = 0;
            if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = hjpVar.a();
                    x340Var.s0(objT);
                }
                ob60 ob60Var = (ob60) objT;
                mb60Var2 = mb60Var;
                irn1.u(nim0Var, esi.a, null, null, apo.r(1747984287, new dc60(ob60Var, mb60Var2, wpb1.C("highlight_details_carousel_".concat(mb60Var.f), ob60Var, mb60Var, x340Var, 576 | ((i3 << 6) & 896), 8), b), x340Var), x340Var, ((i3 >> 6) & 14) | 24624, 12);
                x340Var = x340Var;
            } else {
                mb60Var2 = mb60Var;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new jj50(mb60Var2, hjpVar, i, (byte) 8);
            }
        }

        public static final void h(int i, b0k b0kVar, iu30 iu30Var, c380 c380Var, qim0 qim0Var) {
            qim0 qim0Var2;
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.k0(-1035611069);
            int i2 = i | (b0kVar2.i(c380Var) ? 4 : 2) | (b0kVar2.i(iu30Var) ? 32 : 16) | 384;
            if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
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
                nko1.H(mbhVarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                String strO0 = cwl1.o0(b0kVar2, 2131960818);
                uwr uwrVar = cbx.a;
                gxo1.c(strO0, uyn1.x(qim0Var3, cbx.b(b0kVar2).e.b), cbx.d(b0kVar2).f, 0L, null, 0, false, null, null, 0.0f, null, null, b0kVar2, 0, 0, 4088);
                b0kVar2 = b0kVar2;
                qim0 qim0VarZ = uyn1.z(cbx.b(b0kVar2).e.b, 0.0f, 2, qim0Var3);
                cvx cvxVar = cbx.b(b0kVar2).b;
                d36 d36Var = new d36(8.0f, true, new um5(false));
                WeakHashMap weakHashMap = osl1.x;
                vk80 vk80VarC = hqq0.C(lhc.g(b0kVar2).g, b0kVar2);
                boolean zI = b0kVar2.i(c380Var) | ((i2 & 112) == 32);
                Object objT = b0kVar2.T();
                if (zI || objT == fkj0.X) {
                    objT = new li1((byte) 6, iu30Var, c380Var);
                    b0kVar2.s0(objT);
                }
                ujo1.d(qim0VarZ, null, vk80VarC, false, d36Var, null, null, false, null, (iu30) objT, b0kVar2, 0, 490);
                b0kVar2.r(true);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new w2y((byte) 1, i, iu30Var, c380Var, qim0Var2);
            }
        }

        public static final void i(String str, u7h u7hVar, tob1 tob1Var, b0k b0kVar, int i) {
            tob1 tob1Var2;
            pgr0 qgr0Var;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1991952517);
            int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(u7hVar) ? 32 : 16);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                j2i j2iVarR = apo.r(-606065061, new nl(str, (byte) 22), x340Var);
                uwr uwrVar = cbx.a;
                long j = cbx.a(x340Var).a.c;
                float fFloatValue = ((Number) tob1Var.getValue()).floatValue();
                if (u7hVar != null) {
                    long j2 = u7hVar.a;
                    qgr0Var = new pgr0(u7h.b(j2, dm5.T(0.8f, 1.0f, fFloatValue), 0.0f, 0.0f, 0.0f, 14), u7h.b(j2, dm5.T(0.6f, 1.0f, fFloatValue), 0.0f, 0.0f, 0.0f, 14));
                } else {
                    qgr0Var = new qgr0(u7h.b(j, fFloatValue, 0.0f, 0.0f, 0.0f, 14));
                }
                pgr0 pgr0Var = qgr0Var;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    tob1Var2 = tob1Var;
                    objT = new ygr0(tob1Var2, 4);
                    x340Var.s0(objT);
                } else {
                    tob1Var2 = tob1Var;
                }
                bzn1.e(null, j2iVarR, false, null, pgr0Var, null, (ygr0) objT, null, x340Var, 2097200, 173);
            } else {
                tob1Var2 = tob1Var;
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new zt6(str, u7hVar, tob1Var2, i, (byte) 1);
            }
        }

        public static final void j(xtb0 xtb0Var, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-344402214);
            int i2 = (x340Var.i(xtb0Var) ? 32 : 16) | i | 384;
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = yv91.a(new ih1(xtb0Var, (byte) 10));
                    x340Var.s0(objT);
                }
                boolean zBooleanValue = ((Boolean) ((tob1) objT).getValue()).booleanValue();
                qim0 qim0Var2 = nim0.a;
                if (zBooleanValue) {
                    x340Var.i0(590877432);
                    qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    f(6, x340Var, h2c.a.a(u291.h(qim0VarF, 32.0f), een.d), true);
                    x340Var.r(false);
                } else {
                    x340Var.i0(591081288);
                    x340Var.r(false);
                }
                qim0Var = qim0Var2;
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new a7e(xtb0Var, qim0Var, i, (byte) 1);
            }
        }

        public static final void k(eka1 eka1Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
            b0k b0kVar2;
            qim0 qim0Var2;
            b0k b0kVar3 = (x340) b0kVar;
            b0kVar3.k0(-1300594666);
            int i2 = i | (b0kVar3.i(eka1Var) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 384;
            if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                qim0 qim0Var3 = nim0.a;
                qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0Var3);
                uvx uvxVar = new uvx(0, ogx.e, 0, (vzq0) null, (zzq0) null, (tvx) null, er31.b(72.0f), 0, (p3v) null, 445);
                boolean z = (i2 & 112) == 32;
                Object objT = b0kVar3.T();
                if (z || objT == fkj0.X) {
                    objT = new lpx0(function0, (byte) 14);
                    b0kVar3.s0(objT);
                }
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarZ, uvxVar, null, false, null, null, new gbx(z50.c, (Function0) objT), null, null, abj.a, null, null, abj.b, null, null, apo.r(-967748526, new f2z0(eka1Var, (byte) 11), b0kVar3), b0kVar2, 805306432, 196992, 28092);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var2 = qim0Var;
            }
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ffx0(eka1Var, function0, qim0Var2, i, (byte) 8);
            }
        }

        public static final List l(t2b t2bVar, int i, int i2, ArrayList arrayList, edn0 edn0Var, int i3, int i4, int i5, boolean z, iu30 iu30Var) {
            int i6;
            edn0 edn0Var2;
            int i7;
            Object obj;
            int i8;
            if (t2bVar == null || arrayList.isEmpty() || (i6 = edn0Var.b) == 0) {
                return z6x.a;
            }
            int i9 = -1;
            int i10 = 0;
            if (i2 - i < 0 || i6 == 0) {
                edn0Var2 = mr80.a;
            } else {
                tr80 tr80VarQ = yoi1.Q(0, i6);
                int i11 = ((rr80) tr80VarQ).a;
                int i12 = ((rr80) tr80VarQ).b;
                int iC = -1;
                if (i11 <= i12) {
                    while (edn0Var.c(i11) <= i) {
                        iC = edn0Var.c(i11);
                        if (i11 == i12) {
                            break;
                        }
                        i11++;
                    }
                }
                if (iC == -1) {
                    edn0Var2 = mr80.a;
                } else {
                    edn0 edn0Var3 = mr80.a;
                    edn0Var2 = new edn0(1);
                    edn0Var2.a(iC);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj2 = arrayList.get(i13);
                int index = ((jsb0) obj2).getIndex();
                int[] iArr = edn0Var.a;
                int i14 = edn0Var.b;
                for (int i15 = i10; i15 < i14; i15++) {
                    if (iArr[i15] == index) {
                        arrayList3.add(obj2);
                        break;
                    }
                }
                i13++;
                i10 = 0;
            }
            int[] iArr2 = edn0Var2.a;
            int i16 = edn0Var2.b;
            int i17 = 0;
            while (i17 < i16) {
                int i18 = iArr2[i17];
                Iterator it = arrayList.iterator();
                int i19 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i19 = i9;
                        break;
                    }
                    if (((jsb0) it.next()).getIndex() == i18) {
                        break;
                    }
                    i19++;
                }
                jsb0 jsb0Var = i19 == i9 ? (jsb0) iu30Var.invoke(Integer.valueOf(i18)) : (jsb0) arrayList.remove(i19);
                int iZ = men1.z(jsb0Var, z);
                if (i19 == i9) {
                    i17 = i17;
                    i7 = Integer.MIN_VALUE;
                } else {
                    long jI = jsb0Var.i(0);
                    i7 = (int) (z ? jI & 4294967295L : jI >> 32);
                }
                int size2 = arrayList3.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList3.get(i20);
                    if (((jsb0) obj).getIndex() != i18) {
                        break;
                    }
                    i20++;
                }
                jsb0 jsb0Var2 = (jsb0) obj;
                if (jsb0Var2 != null) {
                    long jI2 = jsb0Var2.i(0);
                    i8 = (int) (z ? jI2 & 4294967295L : jI2 >> 32);
                } else {
                    i8 = Integer.MIN_VALUE;
                }
                int iMax = i7 == Integer.MIN_VALUE ? -i3 : Math.max(-i3, i7);
                if (i8 != Integer.MIN_VALUE) {
                    iMax = Math.min(iMax, i8 - iZ);
                }
                jsb0Var.e();
                jsb0Var.a(iMax, 0, i4, i5);
                arrayList2.add(jsb0Var);
                i17++;
                i9 = -1;
            }
            return arrayList2;
        }

        public static final ArrayList m(o5i0 o5i0Var, List list) {
            tr80 tr80VarK = p7h.K(list);
            ArrayList arrayList = new ArrayList();
            lr80 it = tr80VarK.iterator();
            while (((sr80) it).c) {
                Object next = it.next();
                oce1 oce1Var = (oce1) list.get(((Number) next).intValue());
                long j = oce1Var.a;
                long j2 = oce1Var.b;
                uvg1 uvg1Var = o5i0Var.a;
                long j3 = uvg1Var.a;
                if (j < uvg1Var.b && j2 > j3) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public static final Offset n(i8d1 i8d1Var, bav0 bav0Var, yo31 yo31Var) {
            long jG;
            long j;
            int i = bav0Var.e;
            List list = bav0Var.a;
            if ((i & 4096) == 0) {
                return null;
            }
            int i2 = bav0Var.f;
            if (i2 != 6 && i2 != 10 && i2 != 11 && i2 != 12) {
                return null;
            }
            j8d1 j8d1Var = i8d1Var.e;
            long jB = yo31Var.b(i8d1Var, bav0Var);
            hav0 hav0Var = (hav0) o7h.s0(list);
            if (hav0Var != null) {
                long j2 = hav0Var.l ^ (-9223372034707292160L);
                List listC = hav0Var.c();
                Offset offset = new Offset(0L);
                int size = listC.size();
                int i3 = 0;
                while (true) {
                    j = offset.a;
                    if (i3 >= size) {
                        break;
                    }
                    offset = new Offset(Offset.f(j, ((yg60) listC.get(i3)).d));
                    i3++;
                }
                jG = Offset.g(j2, j);
            } else {
                jG = 0;
            }
            long jG2 = Offset.g(jB, jG);
            if (Offset.c(jG2, 0L)) {
                return null;
            }
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((hav0) list.get(i4)).a();
            }
            return new Offset(jG2);
        }

        public static final Offset o(bav0 bav0Var) {
            long jG;
            long j;
            int i = bav0Var.f;
            List list = bav0Var.a;
            if (i != 10 && i != 11 && i != 12) {
                return null;
            }
            hav0 hav0Var = (hav0) o7h.s0(list);
            if (hav0Var != null) {
                long j2 = hav0Var.l ^ (-9223372034707292160L);
                List listC = hav0Var.c();
                Offset offset = new Offset(0L);
                int size = listC.size();
                int i2 = 0;
                while (true) {
                    j = offset.a;
                    if (i2 >= size) {
                        break;
                    }
                    offset = new Offset(Offset.f(j, ((yg60) listC.get(i2)).d));
                    i2++;
                }
                jG = Offset.g(j2, j);
            } else {
                jG = 0;
            }
            if (Offset.c(jG, 0L)) {
                return null;
            }
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((hav0) list.get(i3)).a();
            }
            return new Offset(jG);
        }

        public static final Float p(bav0 bav0Var) {
            int i = bav0Var.f;
            List list = bav0Var.a;
            if (i != 7 && i != 8 && i != 9) {
                return null;
            }
            List list2 = list;
            int size = list2.size();
            float f = 1.0f;
            for (int i2 = 0; i2 < size; i2++) {
                hav0 hav0Var = (hav0) list.get(i2);
                f *= hav0Var.k;
                List listC = hav0Var.c();
                int size2 = listC.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    f *= ((yg60) listC.get(i3)).c;
                }
            }
            if (f == 1.0f) {
                return null;
            }
            int size3 = list2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((hav0) list.get(i4)).a();
            }
            return Float.valueOf(f);
        }

        public static final u5i0 q(n5i0 n5i0Var, v5i0 v5i0Var) {
            o5i0 o5i0Var = new o5i0(new uvg1(n5i0Var.c, n5i0Var.d));
            ArrayList arrayListM = m(o5i0Var, v5i0Var.c);
            int i = n5i0Var.f;
            int i2 = n5i0Var.g;
            String str = n5i0Var.b;
            boolean z = n5i0Var.h;
            boolean z2 = n5i0Var.i;
            boolean z3 = n5i0Var.j;
            boolean z4 = n5i0Var.k;
            return new u5i0(v5i0Var, arrayListM, p5i0.a, str, o5i0Var, i, i2, z, z2, z3, z4, z4, n5i0Var.l, n5i0Var.m, n5i0Var.n, v5i0Var.g == null ? s5i0.a : new r5i0(b7x.a), 405504);
        }

        /* JADX WARN: Code duplicated, block: B:120:0x0132 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:121:0x0150 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x0122  */
        /* JADX WARN: Code duplicated, block: B:32:0x012f A[LOOP:2: B:28:0x0120->B:32:0x012f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:36:0x0139  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0271 -> B:98:0x027f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static final java.lang.Object r(p.i8d1 r33, p.bbc r34, p.w7d1 r35, p.faa r36) {
            /*
                Method dump skipped, instruction units count: 723
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.zmo1.r(p.i8d1, p.bbc, p.w7d1, p.faa):java.lang.Object");
        }

        public static final String s(String str) {
            return (String) ihc1.Q0(str, new String[]{"?"}, 0, 6).get(0);
        }

        public static final String t(Context context, Integer num, String str) {
            if (str != null) {
                return str;
            }
            if (num != null) {
                return context.getString(num.intValue());
            }
            return null;
        }

        public static final String u(Integer num, String str, b0k b0kVar) {
            String strK;
            x340 x340Var = (x340) b0kVar;
            if (str != null) {
                x340Var.i0(-333594097);
                x340Var.r(false);
                return str;
            }
            x340Var.i0(-1751462232);
            if (num == null) {
                x340Var.i0(-1751462233);
                x340Var.r(false);
                strK = null;
            } else {
                strK = kk0.k(x340Var, -1751462232, num, x340Var, false);
            }
            x340Var.r(false);
            return strK;
        }

        public static final void v() {
            fns fnsVar = igu.a;
            b3s b3sVar = b3s.c;
        }

        public static final Next w(u5i0 u5i0Var) {
            if (u5i0Var.X) {
                return u5i0Var.Z == 2 ? Next.h(u5i0Var) : Next.i(u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 2, false, (Bitmap) null, false, (t5i0) null, 1044479), Collections.singleton(t4i0.a));
            }
            u5i0 u5i0VarA = u5i0.a(u5i0Var, (v5i0) null, (ArrayList) null, (o5i0) null, false, 0, false, (Bitmap) null, false, (t5i0) null, 1046527);
            uvg1 uvg1Var = u5i0Var.e.a;
            return Next.i(u5i0VarA, dm61.B0(new v4i0[]{new u4i0(uvg1Var.a, uvg1Var.b, false), u5i0Var.Y ? q4i0.a : null}));
        }

        public static final op80 x(vq11 vq11Var, int i, op80 op80Var) {
            r6h1 r6h1Var;
            q6x h3h1Var;
            iu30 iu30Var;
            if (vq11Var == null) {
                h3h1Var = q6x.b;
            } else {
                h3h1 h3h1VarC = j0o1.C(op80Var);
                if (h3h1VarC == null || (iu30Var = h3h1VarC.b) == null || (r6h1Var = (r6h1) iu30Var.invoke(0)) == null) {
                    r6h1Var = r6h1.c;
                }
                h3h1Var = new h3h1(new xg6(r6h1Var, vq11Var, (byte) 16));
            }
            if (vq11Var != null) {
                i = vq11Var.b;
            }
            k3h1 k3h1Var = new k3h1(i);
            q6x q6xVar = q6x.b;
            if (h3h1Var.equals(q6xVar) && k3h1Var.equals(q6xVar)) {
                return q6xVar;
            }
            if (h3h1Var.equals(q6xVar)) {
                return k3h1Var;
            }
            return k3h1Var.equals(q6xVar) ? h3h1Var : new wch(h3h1Var, k3h1Var);
        }

        public static final Double y(Double d, String str, String str2) {
            double dDoubleValue = d.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return d;
            }
            StringBuilder sbN = gvg.n("Invalid volume[featureName: ", str, ", interactionId: ", str2, ", volume: ");
            sbN.append(d);
            sbN.append("]");
            n57.e(sbN.toString());
            return null;
        }

        public static int z(i4p1 i4p1Var) {
            Iterator it = i4p1Var.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }
    }
