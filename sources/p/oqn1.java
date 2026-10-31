package p;

import android.net.Uri;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class oqn1 {
    public static final el70 a = new el70((byte) 16);
    public static b180 b;

    public static final void a(wol wolVar, bs40 bs40Var, boolean z, String str, b0k b0kVar, int i) {
        int i2;
        bs40 bs40Var2;
        boolean z2;
        String str2;
        yr40 zr40Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1509978065);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(wolVar) : x340Var.i(wolVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            bs40Var2 = bs40Var;
            i2 |= x340Var.i(bs40Var2) ? 32 : 16;
        } else {
            bs40Var2 = bs40Var;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= x340Var.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i2 |= x340Var.g(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        int i3 = i & 24576;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            lg31 lg31Var = wolVar.b;
            if (lg31Var != null) {
                zr40Var = new yr40(lg31Var.c, lg31Var.d, lg31Var.a, lg31Var.b, str2, lg31Var.e, z2);
            } else {
                zr40Var = new zr40(wolVar.c);
            }
            otw.c(bs40Var2, zr40Var, nim0Var, (ipb1) null, x340Var, ((i2 >> 3) & 14) | ((i2 >> 6) & 896), 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d30(wolVar, bs40Var, z, str, i);
        }
    }

    public static final void b(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-161112089);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958409);
            String strO1 = cwl1.o0(x340Var, 2131958408);
            String strO2 = cwl1.o0(x340Var, 2131958407);
            String strO3 = cwl1.o0(x340Var, 2131958407);
            if (ihc1.y0(strO3)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            zgx zgxVar = new zgx(strO2, new gbx(new y50(strO3), function0));
            String strO4 = cwl1.o0(x340Var, 2131958405);
            String strO5 = cwl1.o0(x340Var, 2131958405);
            if (ihc1.y0(strO5)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            mqo1.d(function1, (i3u) null, (hux) null, strO0, strO1, zgxVar, new zgx(strO4, new gbx(new y50(strO5), function1)), x340Var, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, b2);
        }
    }

    public static final void c(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2142073124);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131958409);
            String strO1 = cwl1.o0(x340Var, 2131958408);
            String strO2 = cwl1.o0(x340Var, 2131958406);
            String strO3 = cwl1.o0(x340Var, 2131958406);
            if (ihc1.y0(strO3)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            zgx zgxVar = new zgx(strO2, new gbx(new y50(strO3), function0));
            String strO4 = cwl1.o0(x340Var, 2131958405);
            String strO5 = cwl1.o0(x340Var, 2131958405);
            if (ihc1.y0(strO5)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            mqo1.d(function1, (i3u) null, (hux) null, strO0, strO1, zgxVar, new zgx(strO4, new gbx(new y50(strO5), function1)), x340Var, ((i2 >> 3) & 14) | 2359296, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, b2);
        }
    }

    public static final void d(c380 c380Var, lp10 lp10Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(133868444);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lp10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarN = anm1.N("group-details-members-list-test-tag", l6o1.H(u291.f(bmq0.L(nim0.a, k1o1.q(x340Var), (g6o0) null), 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, -415649508, c380Var);
            int i3 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                xj50 xj50Var = (xj50) next;
                String str = xj50Var.a;
                boolean zE = x340Var.e(i3);
                Object objT = x340Var.T();
                if (zE || objT == fkj0.X) {
                    objT = new uv4(i3, (byte) 29);
                    x340Var.s0(objT);
                }
                dgo1.c(str, (iu30) objT, apo.r(2068512938, new xx00(lp10Var, xj50Var, iu30Var, (byte) 28), x340Var), x340Var, 384);
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10((Object) c380Var, (Object) lp10Var, (Object) iu30Var, i, (byte) 20);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1534888732);
        if (x340Var.Y(i & 1, i != 0)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            boolean zI = x340Var.i(view);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new xy2(view, (byte) 6);
                x340Var.s0(objT);
            }
            qxd0.i(rih1.a, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02ca  */
    public static final void f(List list, i4d0 i4d0Var, upb0 upb0Var, qim0 qim0Var, iu30 iu30Var, vzq0 vzq0Var, iu30 iu30Var2, boolean z, tvb0 tvb0Var, b0k b0kVar, int i, int i2) {
        int i3;
        iu30 iu30Var3;
        int i4;
        boolean z2;
        int i5;
        b0k b0kVar2;
        vzq0 vzq0Var2;
        iu30 iu30Var4;
        boolean z3;
        iu30 iu30Var5;
        Object obj;
        boolean z4;
        Object obj2;
        int i6;
        int i7;
        iu30 iu30Var6;
        boolean z5;
        Object objT;
        iu30 iu30Var7;
        Object obj3 = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1405579193);
        int i8 = (b0kVar3.g(list) ? 4 : 2) | i | (b0kVar3.g(i4d0Var) ? 32 : 16) | (b0kVar3.g(upb0Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i8 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
        }
        int i9 = i8 | (b0kVar3.i(iu30Var) ? 16384 : 8192);
        int i10 = i2 & 32;
        if (i10 != 0) {
            i3 = i9 | 196608;
        } else {
            i3 = i9 | (b0kVar3.g(vzq0Var) ? 131072 : 65536);
        }
        int i11 = i2 & 64;
        if (i11 != 0) {
            i4 = i3 | 1572864;
            iu30Var3 = iu30Var2;
        } else {
            iu30Var3 = iu30Var2;
            i4 = i3 | (b0kVar3.i(iu30Var3) ? 1048576 : 524288);
        }
        int i12 = i2 & 128;
        if (i12 != 0) {
            i5 = i4 | 12582912;
            z2 = z;
        } else {
            z2 = z;
            i5 = i4 | (b0kVar3.h(z2) ? 8388608 : 4194304);
        }
        int i13 = i5 | (b0kVar3.g(tvb0Var) ? 67108864 : 33554432);
        if (b0kVar3.Y(i13 & 1, (i13 & 38347923) != 38347922)) {
            vzq0 vzq0VarH = i10 != 0 ? uyn1.h(3, 0.0f, 0.0f) : vzq0Var;
            if (i11 != 0) {
                Object objT2 = b0kVar3.T();
                if (objT2 == obj3) {
                    objT2 = tsm1.h;
                    b0kVar3.s0(objT2);
                }
                iu30Var5 = (iu30) objT2;
            } else {
                iu30Var5 = iu30Var3;
            }
            boolean z6 = i12 != 0 ? false : z2;
            int i14 = i13 & 268435454;
            fdc fdcVar = upb0Var.d;
            b0kVar3.i0(-1515949401);
            tvb0Var.f = iu30Var;
            Object objT3 = b0kVar3.T();
            if (objT3 == obj3) {
                int[] iArr = {((err0) fdcVar.c).s()};
                b0kVar3.s0(iArr);
                obj = iArr;
            } else {
                obj = objT3;
            }
            int[] iArr2 = (int[]) obj;
            int i15 = i14 >> 6;
            int i16 = (i15 & 14) ^ 6;
            boolean z7 = (i16 > 4 && b0kVar3.g(upb0Var)) || (i15 & 6) == 4;
            Object objT4 = b0kVar3.T();
            if (z7 || objT4 == obj3) {
                z4 = true;
                int[] iArr3 = {((err0) fdcVar.c).s(), ((err0) fdcVar.d).s()};
                b0kVar3.s0(iArr3);
                obj2 = iArr3;
            } else {
                z4 = true;
                obj2 = objT4;
            }
            int[] iArr4 = (int[]) obj2;
            boolean z8 = ((i16 <= 4 || !b0kVar3.g(upb0Var)) && (i15 & 6) != 4) ? false : z4;
            Object objT5 = b0kVar3.T();
            if (z8 || objT5 == obj3) {
                objT5 = yv91.a(new g4k1(iArr4, upb0Var, (byte) 21));
                b0kVar3.s0(objT5);
            }
            tob1 tob1Var = (tob1) objT5;
            Object objT6 = b0kVar3.T();
            if (objT6 == obj3) {
                mdt mdtVarA = yv91.a(new zg6(upb0Var, iArr2, z6, tob1Var, (byte) 5));
                b0kVar3.s0(mdtVarA);
                i6 = 32;
                objT6 = mdtVarA;
            } else {
                i6 = 32;
            }
            tob1 tob1Var2 = (tob1) objT6;
            pkk1 pkk1Var = (pkk1) tob1Var2.getValue();
            int i17 = (i13 & 112) ^ 48;
            boolean zI = b0kVar3.i(tvb0Var) | (((i17 <= i6 || !b0kVar3.g(i4d0Var)) && (i13 & 48) != i6) ? false : z4);
            Object objT7 = b0kVar3.T();
            if (zI || objT7 == obj3) {
                i7 = i17;
                az80 az80Var = new az80(tvb0Var, i4d0Var, tob1Var2, (lnm) null, (byte) 5);
                b0kVar3.s0(az80Var);
                objT7 = az80Var;
            } else {
                i7 = i17;
            }
            qxd0.s(pkk1Var, i4d0Var, (vu30) objT7, b0kVar3);
            Object objT8 = b0kVar3.T();
            if (objT8 == obj3) {
                objT8 = new HashSet();
                b0kVar3.s0(objT8);
            }
            HashSet hashSet = (HashSet) objT8;
            int i18 = (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x021a: ARITH (r5v15 'i18' int) = (wrap int:0x0218: ARITH (r20v8 int) & (14 int) A[WRAPPED] (LINE:537)) ^ (6 int) A[DECLARE_VAR] (LINE:539) in method: p.oqn1.f(java.util.List, p.i4d0, p.upb0, p.qim0, p.iu30, p.vzq0, p.iu30, boolean, p.tvb0, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes7.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r20v8 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 806
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.oqn1.f(java.util.List, p.i4d0, p.upb0, p.qim0, p.iu30, p.vzq0, p.iu30, boolean, p.tvb0, p.b0k, int, int):void");
        }

        public static final void g(xtb0 xtb0Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(358753786);
            int i2 = i | (x340Var.i(xtb0Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = yv91.a(new nxb0(xtb0Var, (byte) 29));
                    x340Var.s0(objT);
                }
                tob1 tob1Var = (tob1) objT;
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = yv91.a(new ks41(xtb0Var, tob1Var, (byte) 0));
                    x340Var.s0(objT2);
                }
                boolean zBooleanValue = ((Boolean) ((tob1) objT2).getValue()).booleanValue();
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = ej41.h;
                    x340Var.s0(objT3);
                }
                bby bbyVarA = xay.p(1, (iu30) objT3).a(xay.e(3, (ni20) null));
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = ej41.i;
                    x340Var.s0(objT4);
                }
                fq7.g(zBooleanValue, qim0Var, bbyVarA, xay.t(1, (iu30) objT4).a(xay.f(3, (ni20) null)), (String) null, apo.r(-662070238, new oa5(function0, (byte) 22), x340Var), x340Var, ((i2 >> 3) & 112) | 196608, 16);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new hl11(xtb0Var, function0, qim0Var, i, (byte) 17);
            }
        }

        public static final dpg1 h(l6o0 l6o0Var) {
            p811 p811Var = new p811();
            don1.F(l6o0Var, new q94(p811Var, (byte) 3));
            return (dpg1) p811Var.a;
        }

        public static htv i(htv htvVar, ilq0 ilq0Var) {
            etv etvVar = htvVar.j;
            c380 c380Var = etvVar.c;
            ilq0 ilq0VarB1 = ilq0Var.b1(htvVar);
            if (ilq0VarB1 != null) {
                htv htvVarM = m(htvVar, etv.a(etvVar, etvVar.a + 1, o7h.O0(ilq0VarB1, etvVar.b.subList(0, etvVar.a)), (c380) null, 4));
                c380 c380Var2 = htvVarM.l;
                if (!u890.j(c380Var2, htvVar.l)) {
                    return u890.j(c380Var2, c380Var) ? m(htvVar, new etv(3, c380Var)) : htvVarM;
                }
            }
            return htvVar;
        }

        public static final Next j(ofg0 ofg0Var, w5k1 w5k1Var) {
            ibg0 ibg0Var = ofg0Var.b;
            String str = ofg0Var.a;
            int iOrdinal = w5k1Var.ordinal();
            if (iOrdinal == 0) {
                boolean z = ofg0Var.f;
                Boolean bool = ofg0Var.c;
                return (z || bool == null) ? Next.j() : Next.i(ofg0.a(ofg0Var, Boolean.valueOf(!bool.booleanValue()), (Boolean) null, (Boolean) null, true, false, false, 219), Collections.singleton(new ueg0(str, ibg0Var, !bool.booleanValue())));
            }
            if (iOrdinal == 1) {
                boolean z2 = ofg0Var.g;
                Boolean bool2 = ofg0Var.d;
                return (z2 || bool2 == null) ? Next.j() : Next.i(ofg0.a(ofg0Var, (Boolean) null, Boolean.valueOf(!bool2.booleanValue()), (Boolean) null, false, true, false, 183), Collections.singleton(new teg0(str, ibg0Var, !bool2.booleanValue())));
            }
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            boolean z3 = ofg0Var.h;
            Boolean bool3 = ofg0Var.e;
            return (z3 || bool3 == null) ? Next.j() : Next.i(ofg0.a(ofg0Var, (Boolean) null, (Boolean) null, Boolean.valueOf(!bool3.booleanValue()), false, false, true, 111), Collections.singleton(new veg0(str, ibg0Var, true ^ bool3.booleanValue())));
        }

        public static final uar0 k(op80 op80Var) {
            return op80Var.a(zj20.S0);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0069  */
        public static x6b1 l(String str) {
            String string;
            boolean zI0;
            String path;
            List<String> pathSegments;
            if (!nhc1.Y(str, "spotify://", false)) {
                if (nhc1.Y(str, "spotify:", false)) {
                    String strX = nhc1.X(str, "spotify:", "spotify:///");
                    int iX0 = ihc1.x0(strX, new char[]{'?', '#'}, 0, false);
                    if (iX0 == -1) {
                        iX0 = strX.length();
                    }
                    int iP = yoi1.p(11, 0, strX.length());
                    int iP2 = yoi1.p(iX0, iP, strX.length());
                    StringBuilder sb = new StringBuilder(strX);
                    while (iP < iP2) {
                        if (sb.charAt(iP) == ':') {
                            sb.setCharAt(iP, '/');
                        }
                        iP++;
                    }
                    string = sb.toString();
                } else {
                    string = str;
                }
                Uri uri = Uri.parse(string);
                if (uri != null) {
                    String scheme = uri.getScheme();
                    if (scheme != null) {
                        int iHashCode = scheme.hashCode();
                        if (iHashCode != -1998723398) {
                            zI0 = iHashCode != 3213448 ? o7h.i0(x6b1.e, uri.getHost()) : o7h.i0(x6b1.e, uri.getHost());
                        } else if (scheme.equals("spotify")) {
                            zI0 = true;
                        } else {
                            zI0 = false;
                        }
                    } else {
                        zI0 = false;
                    }
                    if (zI0 && (path = uri.getPath()) != null && !ihc1.h0(path, "//", false) && (pathSegments = uri.getPathSegments()) != null && !pathSegments.isEmpty()) {
                        String str2 = (String) o7h.s0(pathSegments);
                        String strSubstring = (str2 != null && nhc1.Y(str2, "intl-", false)) ? str2.substring(5) : null;
                        if (strSubstring != null) {
                            pathSegments = o7h.k0(pathSegments, 1);
                        }
                        if (!pathSegments.isEmpty()) {
                            xkg0 xkg0Var = new xkg0();
                            Set<String> queryParameterNames = uri.getQueryParameterNames();
                            if (queryParameterNames != null) {
                                for (String str3 : queryParameterNames) {
                                    String queryParameter = uri.getQueryParameter(str3);
                                    if (queryParameter != null) {
                                        xkg0Var.put(str3, queryParameter);
                                    }
                                }
                            }
                            if (strSubstring != null) {
                                xkg0Var.put("intl", strSubstring);
                            }
                            return new x6b1(str, pathSegments, xkg0Var.b(), uri.getFragment());
                        }
                    }
                }
            }
            return null;
        }

        public static htv m(htv htvVar, etv etvVar) {
            htv htvVarA = htv.a(htvVar, false, false, false, (x7i1) null, gtv.a(htvVar.h, false, false, false, (Integer) null, false, 991), (Map) null, etvVar, (ArrayList) null, etvVar.c, 1407);
            int i = 0;
            for (ilq0 ilq0Var : etvVar.g) {
                i++;
                ilq0 ilq0VarB1 = ilq0Var.b1(htvVarA);
                if (ilq0VarB1 != null) {
                    htv htvVarP0 = ilq0VarB1.p0(htvVarA);
                    htvVarA = ilq0Var instanceof bhk0 ? htv.a(htvVarP0, false, false, false, (x7i1) null, gtv.a(htvVarP0.h, false, false, false, Integer.valueOf(i), false, 991), (Map) null, (etv) null, (ArrayList) null, (c380) null, 3967) : htvVarP0;
                }
            }
            return htvVarA;
        }

        public static final mmr0 n(Object obj, Object obj2) {
            return new mmr0(obj, obj2);
        }

        public static final int o(int i) {
            int iC = l1d.C(i);
            if (iC == 0) {
                return 1;
            }
            if (iC == 1) {
                return 2;
            }
            if (iC == 2) {
                return 0;
            }
            eg.o();
            return 0;
        }

        public static final k4m p(int i) {
            int iC = l1d.C(i);
            if (iC == 0) {
                return k4m.a;
            }
            if (iC == 1) {
                return k4m.b;
            }
            if (iC == 2) {
                return k4m.d;
            }
            eg.o();
            return null;
        }

        public static final c380 q(mdz mdzVar) {
            return mqo1.A(f46.i0(new ell[]{mdzVar.i ? ell.b : null, qqn1.X(mdzVar) ? ell.d : null}));
        }
    }
