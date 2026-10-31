package p;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.concertcampaignview.v1.CtaType;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class kln1 {
    public static b180 a;

    public static final boolean A(v54 v54Var) {
        int iOrdinal = v54Var.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return false;
        }
        eg.o();
        return false;
    }

    public static final fuc B(wsc0 wsc0Var) {
        List<zuc0> list = wsc0Var.e;
        ArrayList arrayList = new ArrayList();
        for (zuc0 zuc0Var : list) {
            fjf1 fjf1Var = zuc0Var.p;
            ytc ytcVar = null;
            fjf1 fjf1Var2 = fjf1Var instanceof fjf1 ? fjf1Var : null;
            if (fjf1Var2 != null) {
                String str = zuc0Var.c;
                String str2 = zuc0Var.a;
                String str3 = zuc0Var.i;
                xif1 xif1Var = fjf1Var2.a;
                String str4 = xif1Var.a;
                ben benVar = xif1Var.b;
                String str5 = benVar.b;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = benVar.c;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = benVar.a;
                String str8 = benVar.d;
                vsc vscVar = new vsc(str4, new btc(str7, str5, str6, str8 != null ? str8 : ""));
                List list2 = fjf1Var2.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new wsc(((yif1) it.next()).a));
                }
                ytcVar = new ytc(str, str2, str3, vscVar, arrayList2, zuc0Var.k, zuc0Var.c(), zuc0Var.j);
            }
            if (ytcVar != null) {
                arrayList.add(ytcVar);
            }
        }
        List<o5k> list3 = wsc0Var.f.G;
        ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
        for (o5k o5kVar : list3) {
            arrayList3.add(new r5k(o5kVar.a, o5kVar.b));
        }
        return new fuc(arrayList, arrayList3, wsc0Var.a, (int) wsc0Var.g, wsc0Var.d);
    }

    public static final mr20 C(koc0 koc0Var, nfa0 nfa0Var, q8n q8nVar) {
        roc0 roc0Var = (roc0) koc0Var;
        return o4p1.r(new x010(rqt0.u(new kr41(roc0Var.c(), (byte) 21)), rqt0.u(new vlj1(rqt0.u(new kr41(roc0Var.d(), (byte) 20)), nfa0Var, (byte) 16)), b8m1.h, (byte) 1), q8nVar);
    }

    /* JADX WARN: Failed to calculate best type for var: r0v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v17 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v35 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v36 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v36 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v7 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void a(p.h7g0 r24, p.d0r r25, p.pbq r26, p.n8l0 r27, p.vzq0 r28, p.iu30 r29, p.qim0 r30, p.b0k r31, int r32) {
        /*
            Method dump skipped, instruction units count: 719
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kln1.a(p.h7g0, p.d0r, p.pbq, p.n8l0, p.vzq0, p.iu30, p.qim0, p.b0k, int):void");
    }

    public static final void b(eyr0 eyr0Var, wxr0 wxr0Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-774289177);
        int i2 = i | (x340Var.i(eyr0Var) ? 4 : 2) | (x340Var.i(wxr0Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            otw.c(eyr0Var, wxr0Var, (qim0) null, (ipb1) null, x340Var, i2 & 126, 12);
            if (z) {
                x340Var.i0(1420677706);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x0d.s(nim0.a, 8.0f, x340Var, false);
            } else {
                x340Var.i0(1420755547);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0((Object) eyr0Var, (Object) wxr0Var, z, i, (byte) 3);
        }
    }

    public static final void c(p60 p60Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-935509832);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(p60Var) : x340Var.i(p60Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : 128;
        }
        int i5 = i3 | 3072;
        if (x340Var.Y(i5 & 1, (i5 & 1171) != 1170)) {
            if (i4 != 0) {
                qim0Var = nim0.a;
            }
            if (p60Var.c.length() > 0) {
                x340Var.i0(269617830);
                int iC = l1d.C(p60Var.j);
                if (iC == 0 || iC == 1 || iC == 2) {
                    x340Var.i0(269739536);
                    i(p60Var, qim0Var, function0, x340Var, i5 & 1022);
                    x340Var.r(false);
                } else {
                    x340Var.i0(269812727);
                    j(p60Var, qim0Var, function0, x340Var, i5 & 8190);
                    x340Var.r(false);
                }
                x340Var.r(false);
            } else {
                x340Var.i0(269902410);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1(p60Var, qim0Var2, function0, i, i2);
        }
    }

    public static final void d(s950 s950Var, vx40 vx40Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-700406677);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(s950Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(vx40Var) : x340Var.i(vx40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            v850 v850Var = s950Var.a;
            ujo1.c(l6o1.C(0, 0, 1, x340Var), t3k1.t(v850Var), apo.r(-867401632, new bk0(iu30Var, v850Var == v850.b, vx40Var, s950Var), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(s950Var, vx40Var, iu30Var, i, (byte) 17);
        }
    }

    public static final void e(h7g0 h7g0Var, d0r d0rVar, pbq pbqVar, n8l0 n8l0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1980581570);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(h7g0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(d0rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(pbqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(n8l0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            irn1.u(null, apo.r(1070047921, new b7g0(h7g0Var, pbqVar), x340Var), null, null, apo.r(-1954982153, new jb1(h7g0Var, d0rVar, pbqVar, n8l0Var, iu30Var), x340Var), x340Var, 24624, 13);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0((byte) 3, i, h7g0Var, d0rVar, pbqVar, n8l0Var, iu30Var);
        }
    }

    public static final void f(iyr0 iyr0Var, b0k b0kVar, int i) {
        String strK;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2131963564);
        int i2 = (x340Var.e(iyr0Var.ordinal()) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            int iOrdinal = iyr0Var.ordinal();
            if (iOrdinal == 0) {
                strK = x0d.k(x340Var, -117580194, 2131958062, x340Var, false);
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, -117582081, false);
                }
                strK = x0d.k(x340Var, -117576290, 2131958066, x340Var, false);
            }
            uwr uwrVar = cbx.a;
            uwo1.e(strK, uyn1.B(u291.f(nim0.a, 1.0f), 0.0f, cbx.b(x340Var).b.b, 0.0f, 0.0f, 13), cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mbf0(iyr0Var, i, (byte) 15);
        }
    }

    public static final void g(h7g0 h7g0Var, md1 md1Var, b0k b0kVar, int i) {
        md1 md1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(290687668);
        int i2 = (x340Var.g(h7g0Var) ? 4 : 2) | i | (x340Var.g(md1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            md1Var2 = md1Var;
            otw.c(md1Var2, new pxr0(h7g0Var.a, h7g0Var.c), (qim0) null, (ipb1) null, x340Var, (i2 >> 3) & 14, 12);
        } else {
            md1Var2 = md1Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q0g0(h7g0Var, md1Var2, i, (byte) 3);
        }
    }

    public static final void h(umx0 umx0Var, gw70 gw70Var, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, idd1 idd1Var4, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        idd1 idd1Var5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-665992390);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(umx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            idd1Var5 = idd1Var;
            i2 |= x340Var.i(idd1Var5) ? 256 : 128;
        } else {
            idd1Var5 = idd1Var;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(idd1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(idd1Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(idd1Var4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.g(qim0Var) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            nyx.a(2, (wux) null, apo.r(1121091527, new n(gw70Var, qim0Var, iu30Var, umx0Var, idd1Var4, idd1Var5, idd1Var2, idd1Var3), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(umx0Var, gw70Var, idd1Var, idd1Var2, idd1Var3, idd1Var4, iu30Var, qim0Var, i, (byte) 12);
        }
    }

    public static final void i(p60 p60Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        jdx idxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1750087858);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(p60Var) : b0kVar3.i(p60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            int iC = l1d.C(p60Var.j);
            if (iC != 0) {
                idxVar = (iC == 1 || iC != 2) ? jdx.c : ldx.c;
            } else {
                idxVar = new idx(4);
            }
            jdx jdxVar = idxVar;
            qim0 qim0VarX = uyn1.x(qim0Var, 16.0f);
            String str = p60Var.c;
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                foo1.c(new gbx(new y50(str), function0), jdxVar, qim0VarX, null, yla.r(b0kVar3), null, null, null, null, null, apo.r(644456019, new g02(p60Var, (byte) 1), b0kVar3), b0kVar2, 0, 48, 2008);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e0z(p60Var, qim0Var, function0, i, (byte) 0);
        }
    }

    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    public static final void j(p60 p60Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        ?? r3;
        qim0 qim0Var2;
        boolean z;
        p60 p60Var2 = p60Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-2072015088);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar2.g(p60Var2) : b0kVar2.i(p60Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i((Object) null) ? 2048 : 1024;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            fra fraVar = een.N0;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var, cbx.a(b0kVar2).a.a.a(), er31.b(8.0f)), 1.0f), 16.0f);
            boolean z2 = (i2 & 896) == 256;
            Object objT = b0kVar2.T();
            if (z2 || objT == m4cVar) {
                objT = new ivw(function0, (byte) 11);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarX2 = bin.x(qim0VarX, false, null, null, null, (Function0) objT, 15);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z3 = ((x340) b0kVar2).S;
            Function0 function2 = hmb0.t1;
            if (z3) {
                b0kVar2.l(function2);
            } else {
                b0kVar2.v0();
            }
            vu30 vu30Var = y580.O0;
            nko1.H(jw31VarA, b0kVar2, vu30Var);
            vu30 vu30Var2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, vu30Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar);
            nko1.F(b0kVar2);
            vu30 vu30Var3 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, vu30Var3);
            String str = p60Var2.a;
            String str2 = p60Var2.d;
            int length = str.length();
            String str3 = str2;
            qim0 qim0Var3 = nim0.a;
            if (length > 0) {
                b0kVar2.i0(1454408222);
                int i3 = p60Var2.j;
                isl islVar = isl.a;
                if (i3 == 5) {
                    b0kVar2.i0(1454454939);
                    qim0 qim0VarR = u291.r(qim0Var3, 44.0f);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM2 = b0kVar2.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarR);
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(function2);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(gfh0VarC, b0kVar2, vu30Var);
                    nko1.H(xos0VarM2, b0kVar2, vu30Var2);
                    x0d.q(iHashCode2, b0kVar2, lljVar, b0kVar2);
                    nko1.H(qim0VarE2, b0kVar2, vu30Var3);
                    long j = cbx.a(b0kVar2).b.f;
                    long jG = z4p1.g(4281611316L);
                    int i4 = i2;
                    qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                    boolean z4 = (i4 & 14) == 4 || ((i4 & 8) != 0 && b0kVar2.i(p60Var2));
                    Object objT2 = b0kVar2.T();
                    if (z4 || objT2 == m4cVar) {
                        objT2 = new pdy(p60Var2, (byte) 8);
                        b0kVar2.s0(objT2);
                    }
                    qim0Var2 = qim0Var3;
                    function1 = function2;
                    rhx0.b((Function0) objT2, qim0VarD, j, 3.0f, jG, 0, 0.0f, b0kVar2, 0);
                    b0kVar2 = b0kVar2;
                    w0h1.a(xxq0.d(str), islVar, u291.r(qim0Var2, 16.0f), cbx.a(b0kVar2).b.f, 0L, huj.d(str), b0kVar2, 56, 16);
                    b0kVar2.r(true);
                    b0kVar2.r(false);
                    z = false;
                } else {
                    function1 = function2;
                    qim0Var2 = qim0Var3;
                    b0kVar2.i0(1455335153);
                    z = false;
                    w0h1.a(xxq0.d(str), islVar, u291.r(qim0Var2, 16.0f), cbx.a(b0kVar2).b.f, 0L, huj.d(str), b0kVar2, 56, 16);
                    b0kVar2.r(false);
                }
                b0kVar2.r(z);
                r3 = z;
            } else {
                vu30Var = vu30Var;
                vu30Var2 = vu30Var2;
                vu30Var3 = vu30Var3;
                lljVar = lljVar;
                function1 = function2;
                r3 = 0;
                qim0Var2 = qim0Var3;
                str3 = str3;
                b0kVar2.i0(1455599862);
                b0kVar2.r(false);
            }
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, (int) r3);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarF);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, vu30Var);
            nko1.H(xos0VarM3, b0kVar2, vu30Var2);
            x0d.q(iHashCode3, b0kVar2, lljVar, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, vu30Var3);
            p60Var2 = p60Var;
            b0k b0kVar3 = b0kVar2;
            uwo1.e(p60Var2.c, null, cbx.d(b0kVar2).k, 0L, new a0e1(5), null, 0, false, null, 0, null, b0kVar3, 0, 0, 2026);
            b0kVar2 = b0kVar3;
            b0kVar2.i0(-1784724099);
            if (str3.length() > 0) {
                b0kVar2.i0(-1784671802);
                uwo1.e(str3, null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, new a0e1(5), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2018);
                b0kVar2 = b0kVar2;
                b0kVar2.r((boolean) r3);
            } else {
                b0kVar2.i0(-1784471604);
                b0kVar2.r((boolean) r3);
            }
            us71.m(b0kVar2, (boolean) r3, true, true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new e0z(p60Var2, qim0Var, function0, i, (byte) 1);
        }
    }

    public static final void k(dlg1 dlg1Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(230066807);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(dlg1Var) : x340Var.i(dlg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfx.h(13, apo.r(217248938, new xaf1(dlg1Var, iu30Var, (byte) 11), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cwr0(dlg1Var, iu30Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013a  */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:117:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:118:0x0215  */
    /* JADX WARN: Code duplicated, block: B:121:0x022d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x022f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0246  */
    /* JADX WARN: Code duplicated, block: B:129:0x024e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x0254  */
    /* JADX WARN: Code duplicated, block: B:135:0x027a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0291 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x0293  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:142:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:146:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:150:0x0320  */
    /* JADX WARN: Code duplicated, block: B:153:0x0331  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7 A[PHI: r21
      0x00b7: PHI (r21v11 int) = (r21v0 int), (r21v6 int), (r21v7 int) binds: [B:61:0x00b5, B:71:0x00d2, B:70:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0114  */
    /* JADX WARN: Code duplicated, block: B:89:0x0116  */
    /* JADX WARN: Code duplicated, block: B:92:0x011c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0125  */
    /* JADX WARN: Code duplicated, block: B:96:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x012f  */
    public static final void l(iec iecVar, qim0 qim0Var, boolean z, djc0 djc0Var, boolean z2, u7h u7hVar, vnr0 vnr0Var, b0k b0kVar, int i, int i2) {
        int i3;
        djc0 cjc0Var;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean zI;
        boolean z4;
        qim0 qim0Var2;
        u7h u7hVar2;
        vnr0 vnr0Var2;
        boolean z5;
        djc0 djc0Var2;
        h311 h311VarV;
        int i10;
        qim0 qim0Var3;
        qim0 qim0Var4;
        u7h u7hVar3;
        vnr0 vnr0Var3;
        u7h u7hVar4;
        djc0 djc0Var3;
        long j;
        long j2;
        u7h u7hVar5;
        ven0 ven0VarG;
        boolean zH;
        Object objT;
        long j3;
        boolean zH2;
        Object objT2;
        long j4;
        qim0 qim0VarD;
        boolean zF;
        Object objT3;
        boolean zF2;
        Object objT4;
        boolean z6;
        Object objT5;
        u7h u7hVar6;
        qam1 qam1Var;
        iec iecVar2;
        Object objT6;
        String str;
        gbx gbxVar;
        jax haxVar;
        boolean zI2;
        Object objT7;
        int i11;
        m4c m4cVar = fkj0.X;
        gec gecVar = iecVar.a;
        Integer num = gecVar.d;
        gec gecVar2 = iecVar.b;
        String str2 = gecVar2.a;
        Integer num2 = gecVar2.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1340230140);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(iecVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                i3 |= x340Var.g(qim0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (x340Var.h(z)) {
                    i11 = 256;
                } else {
                    i11 = 128;
                }
                i3 |= i11;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    cjc0Var = djc0Var;
                    int i13 = x340Var.g(cjc0Var) ? 2048 : 1024;
                    i3 |= i13;
                } else {
                    cjc0Var = djc0Var;
                }
                i3 |= i13;
            } else {
                cjc0Var = djc0Var;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    if (x340Var.h(z3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (x340Var.g(u7hVar)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 64;
                i9 = 1572864;
                if (i8 == 0) {
                    i3 |= i9;
                } else if ((i & 1572864) == 0) {
                    if ((i & 2097152) == 0) {
                        zI = x340Var.g(vnr0Var);
                    } else {
                        zI = x340Var.i(vnr0Var);
                    }
                    if (zI) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((i3 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var.Y(i3 & 1, z4)) {
                    x340Var.d0();
                    i10 = i & 1;
                    qim0Var3 = nim0.a;
                    if (i10 != 0 || x340Var.E()) {
                        if (i12 != 0) {
                            qim0Var4 = qim0Var3;
                        } else {
                            qim0Var4 = qim0Var;
                        }
                        if ((i2 & 8) != 0) {
                            cjc0Var = new cjc0(1);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        }
                        if (i6 != 0) {
                            u7hVar3 = null;
                        } else {
                            u7hVar3 = u7hVar;
                        }
                        if (i8 != 0) {
                            vnr0Var3 = null;
                        } else {
                            vnr0Var3 = vnr0Var;
                        }
                        u7hVar4 = u7hVar3;
                        djc0Var3 = cjc0Var;
                    } else {
                        x340Var.b0();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        qim0Var4 = qim0Var;
                        vnr0Var3 = vnr0Var;
                        i3 = i3;
                        z3 = z3;
                        djc0Var3 = cjc0Var;
                        u7hVar4 = u7hVar;
                    }
                    x340Var.s();
                    uwr uwrVar = cbx.a;
                    j = cbx.a(x340Var).a.c;
                    j2 = cbx.a(x340Var).b.a;
                    u7hVar5 = u7hVar4;
                    qim0 qim0Var5 = qim0Var4;
                    ven0VarG = rwq.g(iecVar.c, Boolean.FALSE, null, x340Var, 48, 2);
                    gdx gdxVarR = yla.r(x340Var);
                    zH = x340Var.h(((Boolean) ven0VarG.getValue()).booleanValue()) | x340Var.g(num) | x340Var.g(num2);
                    objT = x340Var.T();
                    if (zH || objT == m4cVar) {
                        objT = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), num, num2, j));
                        x340Var.s0(objT);
                    }
                    j3 = ((u7h) objT).a;
                    zH2 = x340Var.h(((Boolean) ven0VarG.getValue()).booleanValue());
                    objT2 = x340Var.T();
                    if (zH2 || objT2 == m4cVar) {
                        objT2 = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), gecVar.c, gecVar2.c, j2));
                        x340Var.s0(objT2);
                    }
                    j4 = ((u7h) objT2).a;
                    if (z3) {
                        qim0VarD = u291.f(qim0Var3, 1.0f);
                    } else {
                        qim0VarD = u291.D(qim0Var3, (era) null, 3);
                    }
                    qim0 qim0VarThen = qim0VarD.then(qim0Var5);
                    zF = x340Var.f(j4);
                    objT3 = x340Var.T();
                    if (zF || objT3 == m4cVar) {
                        objT3 = new q9j0((byte) 18, j4);
                        x340Var.s0(objT3);
                    }
                    vu30 vu30Var = (vu30) objT3;
                    zF2 = x340Var.f(j3);
                    objT4 = x340Var.T();
                    if (zF2 || objT4 == m4cVar) {
                        objT4 = new q9j0((byte) 19, j3);
                        x340Var.s0(objT4);
                    }
                    vu30 vu30Var2 = (vu30) objT4;
                    z6 = (i3 & 458752) == 131072;
                    objT5 = x340Var.T();
                    if (!z6 || objT5 == m4cVar) {
                        u7hVar6 = u7hVar5;
                        objT5 = new jsf(u7hVar6, (byte) 4);
                        x340Var.s0(objT5);
                    } else {
                        u7hVar6 = u7hVar5;
                    }
                    hdx hdxVar = new hdx(0, vu30Var, vu30Var2, (vu30) objT5, (hw61) null, 17);
                    qam1Var = (qam1) x340Var.k(sam1.a);
                    if (z) {
                        x340Var.i0(497537584);
                        iecVar2 = iecVar;
                        zI2 = x340Var.i(iecVar2) | x340Var.i(qam1Var);
                        objT7 = x340Var.T();
                        if (zI2 || objT7 == m4cVar) {
                            objT7 = new rl21(iecVar2, qam1Var, (byte) 11);
                            x340Var.s0(objT7);
                        }
                        gbx gbxVar2 = new gbx(z50.c, (Function0) objT7);
                        x340Var.r(false);
                        gbxVar = gbxVar2;
                        str = str2;
                    } else {
                        iecVar2 = iecVar;
                        x340Var.i0(497750988);
                        objT6 = x340Var.T();
                        if (objT6 == m4cVar) {
                            objT6 = oa41.c;
                            x340Var.s0(objT6);
                        }
                        str = str2;
                        gbx gbxVar3 = new gbx(new y50(str), (Function0) objT6);
                        x340Var.r(false);
                        gbxVar = gbxVar3;
                    }
                    if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                        haxVar = jax.a;
                    } else {
                        haxVar = new hax(str);
                    }
                    iec iecVar3 = iecVar2;
                    djc0 djc0Var4 = djc0Var3;
                    boolean z7 = z3;
                    vnr0 vnr0Var4 = vnr0Var3;
                    foo1.c(gbxVar, hdxVar, qim0VarThen, haxVar, gdxVarR, null, null, null, null, null, apo.r(1466026875, new wr1(z7, vnr0Var4, iecVar3, gdxVarR, djc0Var4, ven0VarG), x340Var), x340Var, 0, 48, 1992);
                    x340Var = x340Var;
                    djc0Var2 = djc0Var4;
                    u7hVar2 = u7hVar6;
                    z5 = z7;
                    vnr0Var2 = vnr0Var4;
                    qim0Var2 = qim0Var5;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    u7hVar2 = u7hVar;
                    vnr0Var2 = vnr0Var;
                    z5 = z3;
                    djc0Var2 = cjc0Var;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu(iecVar, qim0Var2, z, djc0Var2, z5, u7hVar2, vnr0Var2, i, i2);
                }
            }
            i3 |= 24576;
            z3 = z2;
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (x340Var.g(u7hVar)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            i9 = 1572864;
            if (i8 == 0) {
                i3 |= i9;
            } else if ((i & 1572864) == 0) {
                if ((i & 2097152) == 0) {
                    zI = x340Var.g(vnr0Var);
                } else {
                    zI = x340Var.i(vnr0Var);
                }
                if (zI) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i3 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i3 & 1, z4)) {
                x340Var.d0();
                i10 = i & 1;
                qim0Var3 = nim0.a;
                if (i10 != 0) {
                    if (i12 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if ((i2 & 8) != 0) {
                        cjc0Var = new cjc0(1);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        u7hVar3 = null;
                    } else {
                        u7hVar3 = u7hVar;
                    }
                    if (i8 != 0) {
                        vnr0Var3 = null;
                    } else {
                        vnr0Var3 = vnr0Var;
                    }
                    u7hVar4 = u7hVar3;
                    djc0Var3 = cjc0Var;
                } else {
                    if (i12 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if ((i2 & 8) != 0) {
                        cjc0Var = new cjc0(1);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        u7hVar3 = null;
                    } else {
                        u7hVar3 = u7hVar;
                    }
                    if (i8 != 0) {
                        vnr0Var3 = null;
                    } else {
                        vnr0Var3 = vnr0Var;
                    }
                    u7hVar4 = u7hVar3;
                    djc0Var3 = cjc0Var;
                }
                x340Var.s();
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).a.c;
                j2 = cbx.a(x340Var).b.a;
                u7hVar5 = u7hVar4;
                qim0 qim0Var6 = qim0Var4;
                ven0VarG = rwq.g(iecVar.c, Boolean.FALSE, null, x340Var, 48, 2);
                gdx gdxVarR2 = yla.r(x340Var);
                zH = x340Var.h(((Boolean) ven0VarG.getValue()).booleanValue()) | x340Var.g(num) | x340Var.g(num2);
                objT = x340Var.T();
                if (zH) {
                    objT = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), num, num2, j));
                    x340Var.s0(objT);
                } else {
                    objT = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), num, num2, j));
                    x340Var.s0(objT);
                }
                j3 = ((u7h) objT).a;
                zH2 = x340Var.h(((Boolean) ven0VarG.getValue()).booleanValue());
                objT2 = x340Var.T();
                if (zH2) {
                    objT2 = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), gecVar.c, gecVar2.c, j2));
                    x340Var.s0(objT2);
                } else {
                    objT2 = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), gecVar.c, gecVar2.c, j2));
                    x340Var.s0(objT2);
                }
                j4 = ((u7h) objT2).a;
                if (z3) {
                    qim0VarD = u291.f(qim0Var3, 1.0f);
                } else {
                    qim0VarD = u291.D(qim0Var3, (era) null, 3);
                }
                qim0 qim0VarThen2 = qim0VarD.then(qim0Var6);
                zF = x340Var.f(j4);
                objT3 = x340Var.T();
                if (zF) {
                    objT3 = new q9j0((byte) 18, j4);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new q9j0((byte) 18, j4);
                    x340Var.s0(objT3);
                }
                vu30 vu30Var3 = (vu30) objT3;
                zF2 = x340Var.f(j3);
                objT4 = x340Var.T();
                if (zF2) {
                    objT4 = new q9j0((byte) 19, j3);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new q9j0((byte) 19, j3);
                    x340Var.s0(objT4);
                }
                vu30 vu30Var4 = (vu30) objT4;
                if ((i3 & 458752) == 131072) {
                }
                objT5 = x340Var.T();
                if (z6) {
                    u7hVar6 = u7hVar5;
                    objT5 = new jsf(u7hVar6, (byte) 4);
                    x340Var.s0(objT5);
                } else {
                    u7hVar6 = u7hVar5;
                    objT5 = new jsf(u7hVar6, (byte) 4);
                    x340Var.s0(objT5);
                }
                hdx hdxVar2 = new hdx(0, vu30Var3, vu30Var4, (vu30) objT5, (hw61) null, 17);
                qam1Var = (qam1) x340Var.k(sam1.a);
                if (z) {
                    x340Var.i0(497537584);
                    iecVar2 = iecVar;
                    zI2 = x340Var.i(iecVar2) | x340Var.i(qam1Var);
                    objT7 = x340Var.T();
                    if (zI2) {
                        objT7 = new rl21(iecVar2, qam1Var, (byte) 11);
                        x340Var.s0(objT7);
                    } else {
                        objT7 = new rl21(iecVar2, qam1Var, (byte) 11);
                        x340Var.s0(objT7);
                    }
                    gbx gbxVar4 = new gbx(z50.c, (Function0) objT7);
                    x340Var.r(false);
                    gbxVar = gbxVar4;
                    str = str2;
                } else {
                    iecVar2 = iecVar;
                    x340Var.i0(497750988);
                    objT6 = x340Var.T();
                    if (objT6 == m4cVar) {
                        objT6 = oa41.c;
                        x340Var.s0(objT6);
                    }
                    str = str2;
                    gbx gbxVar5 = new gbx(new y50(str), (Function0) objT6);
                    x340Var.r(false);
                    gbxVar = gbxVar5;
                }
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    haxVar = jax.a;
                } else {
                    haxVar = new hax(str);
                }
                iec iecVar4 = iecVar2;
                djc0 djc0Var5 = djc0Var3;
                boolean z8 = z3;
                vnr0 vnr0Var5 = vnr0Var3;
                foo1.c(gbxVar, hdxVar2, qim0VarThen2, haxVar, gdxVarR2, null, null, null, null, null, apo.r(1466026875, new wr1(z8, vnr0Var5, iecVar4, gdxVarR2, djc0Var5, ven0VarG), x340Var), x340Var, 0, 48, 1992);
                x340Var = x340Var;
                djc0Var2 = djc0Var5;
                u7hVar2 = u7hVar6;
                z5 = z8;
                vnr0Var2 = vnr0Var5;
                qim0Var2 = qim0Var6;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                u7hVar2 = u7hVar;
                vnr0Var2 = vnr0Var;
                z5 = z3;
                djc0Var2 = cjc0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu(iecVar, qim0Var2, z, djc0Var2, z5, u7hVar2, vnr0Var2, i, i2);
            }
        }
        i3 |= 48;
        if ((i & 384) == 0) {
            if (x340Var.h(z)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i3 |= i11;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                cjc0Var = djc0Var;
                if (x340Var.g(cjc0Var)) {
                }
                i3 |= i13;
            } else {
                cjc0Var = djc0Var;
            }
            i3 |= i13;
        } else {
            cjc0Var = djc0Var;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                if (x340Var.h(z3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                if (x340Var.g(u7hVar)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            i8 = i2 & 64;
            i9 = 1572864;
            if (i8 == 0) {
                i3 |= i9;
            } else if ((i & 1572864) == 0) {
                if ((i & 2097152) == 0) {
                    zI = x340Var.g(vnr0Var);
                } else {
                    zI = x340Var.i(vnr0Var);
                }
                if (zI) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((i3 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var.Y(i3 & 1, z4)) {
                x340Var.d0();
                i10 = i & 1;
                qim0Var3 = nim0.a;
                if (i10 != 0) {
                    if (i12 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if ((i2 & 8) != 0) {
                        cjc0Var = new cjc0(1);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        u7hVar3 = null;
                    } else {
                        u7hVar3 = u7hVar;
                    }
                    if (i8 != 0) {
                        vnr0Var3 = null;
                    } else {
                        vnr0Var3 = vnr0Var;
                    }
                    u7hVar4 = u7hVar3;
                    djc0Var3 = cjc0Var;
                } else {
                    if (i12 != 0) {
                        qim0Var4 = qim0Var3;
                    } else {
                        qim0Var4 = qim0Var;
                    }
                    if ((i2 & 8) != 0) {
                        cjc0Var = new cjc0(1);
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    }
                    if (i6 != 0) {
                        u7hVar3 = null;
                    } else {
                        u7hVar3 = u7hVar;
                    }
                    if (i8 != 0) {
                        vnr0Var3 = null;
                    } else {
                        vnr0Var3 = vnr0Var;
                    }
                    u7hVar4 = u7hVar3;
                    djc0Var3 = cjc0Var;
                }
                x340Var.s();
                uwr uwrVar3 = cbx.a;
                j = cbx.a(x340Var).a.c;
                j2 = cbx.a(x340Var).b.a;
                u7hVar5 = u7hVar4;
                qim0 qim0Var7 = qim0Var4;
                ven0VarG = rwq.g(iecVar.c, Boolean.FALSE, null, x340Var, 48, 2);
                gdx gdxVarR3 = yla.r(x340Var);
                zH = x340Var.h(((Boolean) ven0VarG.getValue()).booleanValue()) | x340Var.g(num) | x340Var.g(num2);
                objT = x340Var.T();
                if (zH) {
                    objT = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), num, num2, j));
                    x340Var.s0(objT);
                } else {
                    objT = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), num, num2, j));
                    x340Var.s0(objT);
                }
                j3 = ((u7h) objT).a;
                zH2 = x340Var.h(((Boolean) ven0VarG.getValue()).booleanValue());
                objT2 = x340Var.T();
                if (zH2) {
                    objT2 = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), gecVar.c, gecVar2.c, j2));
                    x340Var.s0(objT2);
                } else {
                    objT2 = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), gecVar.c, gecVar2.c, j2));
                    x340Var.s0(objT2);
                }
                j4 = ((u7h) objT2).a;
                if (z3) {
                    qim0VarD = u291.f(qim0Var3, 1.0f);
                } else {
                    qim0VarD = u291.D(qim0Var3, (era) null, 3);
                }
                qim0 qim0VarThen3 = qim0VarD.then(qim0Var7);
                zF = x340Var.f(j4);
                objT3 = x340Var.T();
                if (zF) {
                    objT3 = new q9j0((byte) 18, j4);
                    x340Var.s0(objT3);
                } else {
                    objT3 = new q9j0((byte) 18, j4);
                    x340Var.s0(objT3);
                }
                vu30 vu30Var5 = (vu30) objT3;
                zF2 = x340Var.f(j3);
                objT4 = x340Var.T();
                if (zF2) {
                    objT4 = new q9j0((byte) 19, j3);
                    x340Var.s0(objT4);
                } else {
                    objT4 = new q9j0((byte) 19, j3);
                    x340Var.s0(objT4);
                }
                vu30 vu30Var6 = (vu30) objT4;
                if ((i3 & 458752) == 131072) {
                }
                objT5 = x340Var.T();
                if (z6) {
                    u7hVar6 = u7hVar5;
                    objT5 = new jsf(u7hVar6, (byte) 4);
                    x340Var.s0(objT5);
                } else {
                    u7hVar6 = u7hVar5;
                    objT5 = new jsf(u7hVar6, (byte) 4);
                    x340Var.s0(objT5);
                }
                hdx hdxVar3 = new hdx(0, vu30Var5, vu30Var6, (vu30) objT5, (hw61) null, 17);
                qam1Var = (qam1) x340Var.k(sam1.a);
                if (z) {
                    x340Var.i0(497537584);
                    iecVar2 = iecVar;
                    zI2 = x340Var.i(iecVar2) | x340Var.i(qam1Var);
                    objT7 = x340Var.T();
                    if (zI2) {
                        objT7 = new rl21(iecVar2, qam1Var, (byte) 11);
                        x340Var.s0(objT7);
                    } else {
                        objT7 = new rl21(iecVar2, qam1Var, (byte) 11);
                        x340Var.s0(objT7);
                    }
                    gbx gbxVar6 = new gbx(z50.c, (Function0) objT7);
                    x340Var.r(false);
                    gbxVar = gbxVar6;
                    str = str2;
                } else {
                    iecVar2 = iecVar;
                    x340Var.i0(497750988);
                    objT6 = x340Var.T();
                    if (objT6 == m4cVar) {
                        objT6 = oa41.c;
                        x340Var.s0(objT6);
                    }
                    str = str2;
                    gbx gbxVar7 = new gbx(new y50(str), (Function0) objT6);
                    x340Var.r(false);
                    gbxVar = gbxVar7;
                }
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    haxVar = jax.a;
                } else {
                    haxVar = new hax(str);
                }
                iec iecVar5 = iecVar2;
                djc0 djc0Var6 = djc0Var3;
                boolean z9 = z3;
                vnr0 vnr0Var6 = vnr0Var3;
                foo1.c(gbxVar, hdxVar3, qim0VarThen3, haxVar, gdxVarR3, null, null, null, null, null, apo.r(1466026875, new wr1(z9, vnr0Var6, iecVar5, gdxVarR3, djc0Var6, ven0VarG), x340Var), x340Var, 0, 48, 1992);
                x340Var = x340Var;
                djc0Var2 = djc0Var6;
                u7hVar2 = u7hVar6;
                z5 = z9;
                vnr0Var2 = vnr0Var6;
                qim0Var2 = qim0Var7;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                u7hVar2 = u7hVar;
                vnr0Var2 = vnr0Var;
                z5 = z3;
                djc0Var2 = cjc0Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new vu(iecVar, qim0Var2, z, djc0Var2, z5, u7hVar2, vnr0Var2, i, i2);
            }
        }
        i3 |= 24576;
        z3 = z2;
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            if (x340Var.g(u7hVar)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        i8 = i2 & 64;
        i9 = 1572864;
        if (i8 == 0) {
            i3 |= i9;
        } else if ((i & 1572864) == 0) {
            if ((i & 2097152) == 0) {
                zI = x340Var.g(vnr0Var);
            } else {
                zI = x340Var.i(vnr0Var);
            }
            if (zI) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((i3 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x340Var.Y(i3 & 1, z4)) {
            x340Var.d0();
            i10 = i & 1;
            qim0Var3 = nim0.a;
            if (i10 != 0) {
                if (i12 != 0) {
                    qim0Var4 = qim0Var3;
                } else {
                    qim0Var4 = qim0Var;
                }
                if ((i2 & 8) != 0) {
                    cjc0Var = new cjc0(1);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    u7hVar3 = null;
                } else {
                    u7hVar3 = u7hVar;
                }
                if (i8 != 0) {
                    vnr0Var3 = null;
                } else {
                    vnr0Var3 = vnr0Var;
                }
                u7hVar4 = u7hVar3;
                djc0Var3 = cjc0Var;
            } else {
                if (i12 != 0) {
                    qim0Var4 = qim0Var3;
                } else {
                    qim0Var4 = qim0Var;
                }
                if ((i2 & 8) != 0) {
                    cjc0Var = new cjc0(1);
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    z3 = false;
                }
                if (i6 != 0) {
                    u7hVar3 = null;
                } else {
                    u7hVar3 = u7hVar;
                }
                if (i8 != 0) {
                    vnr0Var3 = null;
                } else {
                    vnr0Var3 = vnr0Var;
                }
                u7hVar4 = u7hVar3;
                djc0Var3 = cjc0Var;
            }
            x340Var.s();
            uwr uwrVar4 = cbx.a;
            j = cbx.a(x340Var).a.c;
            j2 = cbx.a(x340Var).b.a;
            u7hVar5 = u7hVar4;
            qim0 qim0Var8 = qim0Var4;
            ven0VarG = rwq.g(iecVar.c, Boolean.FALSE, null, x340Var, 48, 2);
            gdx gdxVarR4 = yla.r(x340Var);
            zH = x340Var.h(((Boolean) ven0VarG.getValue()).booleanValue()) | x340Var.g(num) | x340Var.g(num2);
            objT = x340Var.T();
            if (zH) {
                objT = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), num, num2, j));
                x340Var.s0(objT);
            } else {
                objT = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), num, num2, j));
                x340Var.s0(objT);
            }
            j3 = ((u7h) objT).a;
            zH2 = x340Var.h(((Boolean) ven0VarG.getValue()).booleanValue());
            objT2 = x340Var.T();
            if (zH2) {
                objT2 = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), gecVar.c, gecVar2.c, j2));
                x340Var.s0(objT2);
            } else {
                objT2 = new u7h(z(((Boolean) ven0VarG.getValue()).booleanValue(), gecVar.c, gecVar2.c, j2));
                x340Var.s0(objT2);
            }
            j4 = ((u7h) objT2).a;
            if (z3) {
                qim0VarD = u291.f(qim0Var3, 1.0f);
            } else {
                qim0VarD = u291.D(qim0Var3, (era) null, 3);
            }
            qim0 qim0VarThen4 = qim0VarD.then(qim0Var8);
            zF = x340Var.f(j4);
            objT3 = x340Var.T();
            if (zF) {
                objT3 = new q9j0((byte) 18, j4);
                x340Var.s0(objT3);
            } else {
                objT3 = new q9j0((byte) 18, j4);
                x340Var.s0(objT3);
            }
            vu30 vu30Var7 = (vu30) objT3;
            zF2 = x340Var.f(j3);
            objT4 = x340Var.T();
            if (zF2) {
                objT4 = new q9j0((byte) 19, j3);
                x340Var.s0(objT4);
            } else {
                objT4 = new q9j0((byte) 19, j3);
                x340Var.s0(objT4);
            }
            vu30 vu30Var8 = (vu30) objT4;
            if ((i3 & 458752) == 131072) {
            }
            objT5 = x340Var.T();
            if (z6) {
                u7hVar6 = u7hVar5;
                objT5 = new jsf(u7hVar6, (byte) 4);
                x340Var.s0(objT5);
            } else {
                u7hVar6 = u7hVar5;
                objT5 = new jsf(u7hVar6, (byte) 4);
                x340Var.s0(objT5);
            }
            hdx hdxVar4 = new hdx(0, vu30Var7, vu30Var8, (vu30) objT5, (hw61) null, 17);
            qam1Var = (qam1) x340Var.k(sam1.a);
            if (z) {
                x340Var.i0(497537584);
                iecVar2 = iecVar;
                zI2 = x340Var.i(iecVar2) | x340Var.i(qam1Var);
                objT7 = x340Var.T();
                if (zI2) {
                    objT7 = new rl21(iecVar2, qam1Var, (byte) 11);
                    x340Var.s0(objT7);
                } else {
                    objT7 = new rl21(iecVar2, qam1Var, (byte) 11);
                    x340Var.s0(objT7);
                }
                gbx gbxVar8 = new gbx(z50.c, (Function0) objT7);
                x340Var.r(false);
                gbxVar = gbxVar8;
                str = str2;
            } else {
                iecVar2 = iecVar;
                x340Var.i0(497750988);
                objT6 = x340Var.T();
                if (objT6 == m4cVar) {
                    objT6 = oa41.c;
                    x340Var.s0(objT6);
                }
                str = str2;
                gbx gbxVar9 = new gbx(new y50(str), (Function0) objT6);
                x340Var.r(false);
                gbxVar = gbxVar9;
            }
            if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                haxVar = jax.a;
            } else {
                haxVar = new hax(str);
            }
            iec iecVar6 = iecVar2;
            djc0 djc0Var7 = djc0Var3;
            boolean z10 = z3;
            vnr0 vnr0Var7 = vnr0Var3;
            foo1.c(gbxVar, hdxVar4, qim0VarThen4, haxVar, gdxVarR4, null, null, null, null, null, apo.r(1466026875, new wr1(z10, vnr0Var7, iecVar6, gdxVarR4, djc0Var7, ven0VarG), x340Var), x340Var, 0, 48, 1992);
            x340Var = x340Var;
            djc0Var2 = djc0Var7;
            u7hVar2 = u7hVar6;
            z5 = z10;
            vnr0Var2 = vnr0Var7;
            qim0Var2 = qim0Var8;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            u7hVar2 = u7hVar;
            vnr0Var2 = vnr0Var;
            z5 = z3;
            djc0Var2 = cjc0Var;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu(iecVar, qim0Var2, z, djc0Var2, z5, u7hVar2, vnr0Var2, i, i2);
        }
    }

    public static final em3 m() {
        return new em3();
    }

    public static final void n(int i, int i2, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1168597354);
        int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            tob1 tob1VarA = w191.a(z4p1.e(i), irn1.o0(CtaType.CTA_WAITLISTED_FIELD_NUMBER, 0, null, 6), "trackColorAnimation", x340Var, 384, 8);
            String strN0 = cwl1.n0(2131962872, new Object[]{str}, x340Var);
            qim0 qim0VarF = dug.f(u291.f(qim0Var, 1.0f), ((u7h) tob1VarA.getValue()).a, d4o1.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 8.0f, 12.0f);
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new hqa1(strN0, (byte) 1);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarY, false, (iu30) objT);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(mnx.c, isl.a, u291.r(nim0.a, 16.0f), 0L, 0L, false, x340Var, mnx.d | 48, 56);
            String strN1 = cwl1.n0(2131962871, new Object[]{str}, x340Var);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(strN1, uyn1.B(wnb0Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), cbx.d(x340Var).j, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1720);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gy0((byte) 17, i, i2, str, qim0Var);
        }
    }

    public static final void o(iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-797466728);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            gfx.h(13, apo.r(850975237, new iuy0(iu30Var, (byte) 26), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new luy0(iu30Var, i, (byte) 4);
        }
    }

    public static final void p(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, dlg1 dlg1Var, bmg1 bmg1Var) {
        int i2;
        x340 x340Var;
        dlg1 dlg1Var2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        String string;
        img1 img1Var;
        String string2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1411776827);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(bmg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var2.g(dlg1Var) : x340Var2.i(dlg1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = zdg1.P0;
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarD, false, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var2, 0);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            Context context = (Context) x340Var2.k(AndroidCompositionLocals_androidKt.b);
            jmg1 jmg1Var = bmg1Var.h;
            hmg1 hmg1Var = hmg1.a;
            boolean zJ = u890.j(jmg1Var, hmg1Var);
            gmg1 gmg1Var = gmg1.a;
            img1 img1Var2 = img1.a;
            emg1 emg1Var = emg1.a;
            fmg1 fmg1Var = fmg1.a;
            if (zJ || u890.j(jmg1Var, fmg1Var) || u890.j(jmg1Var, emg1Var)) {
                string = context.getString(2131957109, bmg1Var.a);
            } else if (u890.j(jmg1Var, gmg1Var)) {
                string = context.getString(2131957108);
            } else {
                if (!u890.j(jmg1Var, img1Var2)) {
                    eg.o();
                    return;
                }
                string = context.getString(2131957110);
            }
            String str = string;
            str.getClass();
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).c;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = zdg1.Q0;
                x340Var2.s0(objT2);
            }
            uwo1.e(str, s161.b(qim0VarZ, false, (iu30) objT2), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2024);
            if (u890.j(jmg1Var, hmg1Var) || u890.j(jmg1Var, fmg1Var) || u890.j(jmg1Var, emg1Var)) {
                img1Var = img1Var2;
                string2 = context.getString(2131957104);
            } else if (u890.j(jmg1Var, gmg1Var)) {
                string2 = context.getString(2131957103);
                img1Var = img1Var2;
            } else {
                img1Var = img1Var2;
                if (!u890.j(jmg1Var, img1Var)) {
                    eg.o();
                    return;
                }
                string2 = context.getString(2131957105);
            }
            string2.getClass();
            lee1 lee1Var2 = cbx.d(x340Var2).j;
            float f = cbx.b(x340Var2).b.b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            img1 img1Var3 = img1Var;
            uwo1.e(string2, uyn1.y(qim0Var3, f, 16.0f), lee1Var2, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2024);
            x340Var = x340Var2;
            if (u890.j(jmg1Var, gmg1Var)) {
                x340Var.i0(1476969868);
                iu30Var2 = iu30Var;
                dlg1Var2 = dlg1Var;
                k(dlg1Var2, iu30Var2, x340Var, (i3 >> 3) & 126);
                x340Var.r(false);
            } else {
                iu30Var2 = iu30Var;
                dlg1Var2 = dlg1Var;
                if (u890.j(jmg1Var, img1Var3)) {
                    x340Var.i0(1476972317);
                    o(iu30Var2, x340Var, (i3 >> 6) & 14);
                    x340Var.r(false);
                } else {
                    if (!u890.j(jmg1Var, fmg1Var) && !u890.j(jmg1Var, hmg1Var) && !u890.j(jmg1Var, emg1Var)) {
                        throw p3d1.k(x340Var, 1476968884, false);
                    }
                    x340Var.i0(-1458404187);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    yto1.e(0, 0, 2, x340Var, uyn1.B(qim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                    x340Var.r(false);
                }
            }
            if (u890.j(jmg1Var, gmg1Var)) {
                dlg1Var2.v();
            } else if (u890.j(jmg1Var, img1Var3)) {
                dlg1Var2.x();
            } else if (!u890.j(jmg1Var, hmg1Var) && !u890.j(jmg1Var, fmg1Var) && !u890.j(jmg1Var, emg1Var)) {
                eg.o();
                return;
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            dlg1Var2 = dlg1Var;
            iu30Var2 = iu30Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new awr0(bmg1Var, dlg1Var2, iu30Var2, qim0Var2, i, (byte) 1);
        }
    }

    public static final void q(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var, dlg1 dlg1Var, bmg1 bmg1Var) {
        int i2;
        iu30 iu30Var2;
        dlg1 dlg1Var2;
        qim0 qim0Var2;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-865224716);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(bmg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(dlg1Var) : x340Var.i(dlg1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            Float fValueOf = Float.valueOf(0.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarE = dug.e(qim0VarD, v9c.t(new mmr0[]{new mmr0(fValueOf, new u7h(((wex) ((gmt) zex.a.c).c).d)), new mmr0(Float.valueOf(0.5f), new u7h(cbx.a(x340Var).a.c)), new mmr0(Float.valueOf(1.0f), new u7h(cbx.a(x340Var).a.c))}, 0.0f, 0.0f, 14), null, 0.0f, 6);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarE);
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
            nko1.H(qim0VarE2, x340Var, y580.Y);
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            p(i3 & 1022, x340Var, iu30Var, null, dlg1Var, bmg1Var);
            iu30Var2 = iu30Var;
            dlg1Var2 = dlg1Var;
            if (p7h.M(new jmg1[]{fmg1.a, hmg1.a}).contains(bmg1Var.h)) {
                qim0Var2 = qim0Var3;
                z = true;
                x340Var.i0(-972172728);
                x340Var.r(false);
            } else {
                x340Var.i0(-972883868);
                boolean z2 = (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(dlg1Var2))) | (i5 == 256);
                Object objT = x340Var.T();
                if (z2 || objT == fkj0.X) {
                    objT = new bwr0(dlg1Var2, iu30Var2, (byte) 2);
                    x340Var.s0(objT);
                }
                qim0Var2 = qim0Var3;
                z = true;
                wro1.l(new gbx(z50.c, (Function0) objT), uyn1.z(0.0f, cbx.b(x340Var).b.c, 1, h2c.a.a(qim0Var2, een.f)), null, null, null, aoj.a, x340Var, 196608, 28);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            iu30Var2 = iu30Var;
            dlg1Var2 = dlg1Var;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new awr0(bmg1Var, dlg1Var2, iu30Var2, qim0Var2, i, (byte) 2);
        }
    }

    public static final g3d0 r(mia1 mia1Var) {
        if (mia1Var == null) {
            return null;
        }
        boolean z = mia1Var.b;
        String str = mia1Var.a;
        Parcelable.Creator creator = ztc.CREATOR;
        if (u890.j(str, "name")) {
            return new x2d0(z);
        }
        if (u890.j(str, "artist.name")) {
            return new s2d0(z);
        }
        return u890.j(str, "album.name") ? new q2d0(z) : u2d0.a;
    }

    public static final Object s(nfa0 nfa0Var, nma0 nma0Var, n490 n490Var) {
        jd01 jd01Var = new jd01(n490Var, kme.c.U0(16384), nfa0Var.a);
        try {
            Object objY = new vfc1(nfa0Var, rjm1.c, jd01Var, nma0Var.getDescriptor(), (t4o) null).Y(nma0Var);
            jd01Var.t();
            return objY;
        } finally {
            jd01Var.N();
        }
    }

    public static final void t(nfa0 nfa0Var, o490 o490Var, nma0 nma0Var, Object obj) {
        new wfc1(nfa0Var.a.e ? new o1k(o490Var, nfa0Var) : new fjs0(o490Var), nfa0Var, rjm1.c, new jga0[rjm1.h.b()]).i(nma0Var, obj);
    }

    public static final float u(int i, int i2, boolean z) {
        return z ? v(i, i2) + 100.0f : v(i, i2);
    }

    public static final float v(int i, int i2) {
        return (i * CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER) + i2;
    }

    public static byte[] w(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final qim0 x(qim0 qim0Var, ima0 ima0Var, ysb0 ysb0Var, qqq0 qqq0Var, boolean z, boolean z2) {
        return qim0Var.then(new ctb0(ima0Var, ysb0Var, qqq0Var, z, z2));
    }

    public static boolean y(kpb kpbVar) {
        return kpbVar.a();
    }

    public static final long z(boolean z, Integer num, Integer num2, long j) {
        if (z) {
            return num != null ? z4p1.e(num.intValue()) : j;
        }
        return num2 != null ? z4p1.e(num2.intValue()) : u7h.b(j, 0.3f, 0.0f, 0.0f, 0.0f, 14);
    }
}
