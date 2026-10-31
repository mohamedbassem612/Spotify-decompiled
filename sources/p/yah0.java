package p;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class yah0 {
    public static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static b180 b;
    public static b180 c;

    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r10v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v3 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: boolean
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: boolean
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
    public static final void a(java.lang.String r31, p.zau0 r32, boolean r33, p.qim0 r34, p.b0k r35, int r36) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yah0.a(java.lang.String, p.zau0, boolean, p.qim0, p.b0k, int):void");
    }

    public static final void b(int i, int i2, b0k b0kVar, hux huxVar) {
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(571631559);
        int i3 = ((i2 & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i2 | (x340Var.e(i) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, x340Var, 56 | (i3 & 14), 56);
            b2 = 1;
            uwo1.e(cwl1.o0(x340Var, i), new wnb0(1.0f, true), cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dfd0(huxVar, i, i2, b2);
        }
    }

    public static final void c(rqm0 rqm0Var, d0r d0rVar, l7p l7pVar, h0p h0pVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1604509498);
        int i2 = i | (b0kVar3.g(rqm0Var) ? 4 : 2) | (b0kVar3.i(d0rVar) ? 32 : 16) | (b0kVar3.i(l7pVar) ? 256 : 128) | (b0kVar3.i(h0pVar) ? 2048 : 1024);
        nim0 nim0Var = nim0.a;
        int i3 = i2 | (b0kVar3.i(nim0Var) ? 16384 : 8192);
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uqk uqkVarA = l7pVar.a(d0rVar);
            qx6 qx6VarA = h0pVar.a(d0rVar);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarC = hqq0.C(lhc.g(b0kVar3).g, b0kVar3);
            d36 d36Var = new d36(8.0f, true, new um5(false));
            boolean zI = b0kVar3.i(qx6VarA) | ((i3 & 14) == 4) | b0kVar3.i(d0rVar) | b0kVar3.i(uqkVarA);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                ntf0 ntf0Var = new ntf0(rqm0Var, qx6VarA, d0rVar, uqkVarA, (byte) 15);
                b0kVar3.s0(ntf0Var);
                objT = ntf0Var;
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarF, (xtb0) null, vk80VarC, false, d36Var, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, b0kVar2, 0, 490);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new oqm0(rqm0Var, d0rVar, l7pVar, h0pVar, i);
        }
    }

    public static final void d(String str, String str2, String str3, String str4, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i, int i2) {
        int i3;
        Function0 function3;
        b0k b0kVar2;
        Function0 function4;
        Function0 function5;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-865958581);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.g(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar3.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= b0kVar3.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                function3 = function2;
                int i4 = b0kVar3.i(function3) ? 1048576 : 524288;
                i3 |= i4;
            } else {
                function3 = function2;
            }
            i3 |= i4;
        } else {
            function3 = function2;
        }
        if (b0kVar3.Y(i3 & 1, (599187 & i3) != 599186)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                    function5 = function1;
                }
                b0kVar3.s();
                z50 z50Var = z50.c;
                int i5 = (i3 >> 18) & 14;
                int i6 = i3 << 9;
                b0kVar2 = b0kVar3;
                mqo1.d(function5, (i3u) null, (hux) null, str, str2, new zgx(str3, new gbx(z50Var, function0)), new zgx(str4, new gbx(z50Var, function1)), b0kVar2, (i6 & 57344) | i5 | (i6 & 7168) | 2359296, 6);
                function4 = function5;
            } else {
                b0kVar3.b0();
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
            }
            function5 = function3;
            b0kVar3.s();
            z50 z50Var2 = z50.c;
            int i7 = (i3 >> 18) & 14;
            int i8 = i3 << 9;
            b0kVar2 = b0kVar3;
            mqo1.d(function5, (i3u) null, (hux) null, str, str2, new zgx(str3, new gbx(z50Var2, function0)), new zgx(str4, new gbx(z50Var2, function1)), b0kVar2, (i8 & 57344) | i7 | (i8 & 7168) | 2359296, 6);
            function4 = function5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            function4 = function3;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ra5(str, str2, str3, str4, function0, function1, function4, i, i2);
        }
    }

    public static final void e(String str, Function0 function0, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        xu30 xu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1529511826);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            xu30 xu30VarR = apo.r(-2103641509, new t1(str, function0, (byte) 4), x340Var);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("InviteByQrCodeRow", uyn1.z(16.0f, 0.0f, 2, u291.f(u291.h(qim0Var3, 90.0f), 1.0f)));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (0.75f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarB = uyn1.B(new wnb0(0.75f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.75f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String strO0 = cwl1.o0(x340Var, 2131962316);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, anm1.N("InviteByQrCodeRowTitle", qim0Var3), cbx.d(x340Var).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            uwo1.e(ydh.g(4.0f, 2131962315, x340Var, x340Var, qim0Var3), anm1.N("InviteByQrCodeRowSubTitle", qim0Var3), cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            x340Var.r(true);
            if (0.25f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            float f = 0.25f;
            if (0.25f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            cwl1.b(new wnb0(f, true), (tl3) null, (hw61) null, (pgx) null, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(1483193843, new cex((Object) str, (Object) xu30VarR, (byte) 27), x340Var), x340Var, 0, 48, 2046);
            x340Var.r(true);
            xu30Var2 = xu30VarR;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            xu30Var2 = xu30Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(str, function0, qim0Var2, xu30Var2, i);
        }
    }

    public static final void f(qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-865305089);
        int i2 = i | 6;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 26);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f), uvxVar, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, q2j.d, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, q2j.e, b0kVar2, 805306432, 196608, 32252);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new one0(qim0Var2, i, (byte) 10);
        }
    }

    public static final void g(rqm0 rqm0Var, d0r d0rVar, l7p l7pVar, h0p h0pVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(88499685);
        int i2 = i | (x340Var.g(rqm0Var) ? 4 : 2) | (x340Var.i(d0rVar) ? 32 : 16) | (x340Var.i(l7pVar) ? 256 : 128) | (x340Var.i(h0pVar) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nyx.a(2, (wux) null, apo.r(-1145219144, new oqm0(rqm0Var, d0rVar, l7pVar, h0pVar), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0(rqm0Var, d0rVar, l7pVar, h0pVar, qim0Var2, i);
        }
    }

    public static final void h(yaq0 yaq0Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        af5 af5Var;
        String str = yaq0Var.b;
        Object obj = fkj0.X;
        String str2 = yaq0Var.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-427607066);
        int i2 = i | (b0kVar3.i(yaq0Var) ? 4 : 2) | (b0kVar3.i(qim0Var) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String str3 = yaq0Var.c;
            boolean zG = b0kVar3.g(yaq0Var);
            Object objT = b0kVar3.T();
            if (zG || objT == obj) {
                objT = Integer.valueOf((str.length() == 0 || str3 == null) ? -1 : ihc1.w0(str2, str3, 0, false, 6));
                b0kVar3.s0(objT);
            }
            int iIntValue = ((Number) objT).intValue();
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar3).b.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, f, 12.0f);
            if (str3 == null || iIntValue == -1) {
                b0kVar3.i0(1386488274);
                b0kVar3.r(false);
                StringBuilder sb = new StringBuilder(16);
                ArrayList arrayListM = xvj1.m();
                new ArrayList();
                sb.append(str2);
                String string = sb.toString();
                ArrayList arrayList = new ArrayList(arrayListM.size());
                int size = arrayListM.size();
                for (int iG = 0; iG < size; iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList, iG, 1)) {
                }
                af5Var = new af5(string, arrayList);
            } else {
                b0kVar3.i0(31532976);
                ye5 ye5Var = new ye5();
                ye5Var.e(0, iIntValue, str2);
                boolean z = (i2 & 896) == 256;
                Object objT2 = b0kVar3.T();
                if (z || objT2 == obj) {
                    objT2 = new wck0(iu30Var, (byte) 19);
                    b0kVar3.s0(objT2);
                }
                vhg.d(ye5Var, str3, str, (iu30) objT2);
                ye5Var.e(str3.length() + iIntValue, str2.length(), str2);
                af5Var = ye5Var.p();
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            uwo1.d(af5Var, cbx.a(b0kVar3).b.b, qim0VarY, cbx.d(b0kVar3).j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, b0kVar2, 0, 0, 4064);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(yaq0Var, qim0Var, iu30Var, i, (byte) 15);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-158009989);
        if (x340Var.Y(i & 1, i != 0)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarF);
            mbh mbhVarA = jbh.a(new d36(cbx.b(x340Var).b.b, true, new um5(false)), een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            b(2131962124, zlx.d, x340Var, zlx.c);
            b(2131962125, urx.d, x340Var, urx.c);
            b(2131962126, zmx.d, x340Var, zmx.c);
            b(2131962127, dtx.d, x340Var, dtx.c);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xgr0(i, (byte) 18);
        }
    }

    public static final void j(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        String str2;
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1257619158);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (b0kVar3.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(function0) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            long jE = z4p1.e(context.getColor(2131100252));
            long jE2 = z4p1.e(context.getColor(2131104462));
            qim0 qim0VarR = d7e.r(1.0f, u291.c(qim0Var, 1.0f), true);
            boolean z = (i2 & 896) == 256;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new j160(function0, (byte) 24);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            zgo1.i(str2, bin.x(qim0VarR, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), jE, jE2, izy0.Thin, "", dzy0.b, (fzy0) null, (jzy0) null, b0kVar2, (i2 & 14) | 1794048, 384);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new o82(str, qim0Var, function0, i, (byte) 7);
        }
    }

    public static final void k(float f, float f2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1729343414);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.d(f2) ? 32 : 16) | 128;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, 0.0f, 0.0f, 0.0f, 13);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarB, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cru(f, f2, i, (byte) 5);
        }
    }

    public static final void l(aqb0 aqb0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        j2i j2iVar = ujj.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1795521630);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(aqb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(aqb0.c(aqb0Var), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarD);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            k4s0.i((i2 >> 6) & 14, j2iVar, x340Var, true, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(aqb0Var, qim0Var, i);
        }
    }

    public static final Boolean m(boolean z) {
        return Boolean.valueOf(z);
    }

    public static final Character n(char c2) {
        return new Character(c2);
    }

    public static final Float o(float f) {
        return new Float(f);
    }

    public static final Integer p(int i) {
        return new Integer(i);
    }

    public static final Long q(long j) {
        return new Long(j);
    }

    public static final Next r(Next next, ojf0 ojf0Var) {
        if (next.d()) {
            ojf0 ojf0Var2 = (ojf0) next.g();
            kfm0 kfm0Var = ojf0Var2.O0;
            kfm0 kfm0Var2 = kfm0Var instanceof kfm0 ? kfm0Var : null;
            if (kfm0Var2 != null) {
                def0 def0VarE = c921.E(ojf0Var2);
                List list = def0VarE != null ? def0VarE.b : null;
                def0 def0VarE2 = c921.E(ojf0Var);
                if (!u890.j(list, def0VarE2 != null ? def0VarE2.b : null)) {
                    return Next.i(ojf0.a(ojf0Var2, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, new kfm0(new p061(w7x.a, false), kfm0Var2.b), false, (dn21) null, (sr3) null, 1032191), next.b());
                }
            }
        }
        return next;
    }

    public static Bundle s(Uri uri, String str, String str2) {
        Parcelable parcelableB = nik1.p.b(str);
        Bundle bundle = new Bundle();
        bundle.putParcelable("track_view_uri", parcelableB);
        bundle.putString("track_uri", str);
        if (uri != null && uri.toString().length() > 0) {
            bundle.putString("external_referrer", uri.toString());
        }
        if (str2 != null && str2.length() != 0) {
            bundle.putString("share_id", str2);
        }
        return bundle;
    }

    public static final Next t(ojf0 ojf0Var) {
        return ((ojf0Var.O0 instanceof ffm0) && (ojf0Var.P0 instanceof ifm0)) ? Next.i(ojf0.a(ojf0Var, (dof1) null, (String) null, (xpf0) null, (bff0) null, false, (aog1) null, (String) null, (xx81) null, (List) null, false, ifm0.a, false, (dn21) null, (sr3) null, 770047), Collections.singleton(vhf0.a)) : Next.a(f46.S0(new yhf0[]{new whf0(false), lhf0.a}));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    public static final Next u(ojf0 ojf0Var, fif0 fif0Var, tv80 tv80Var) {
        boolean zContains;
        aef0 aef0Var;
        boolean z;
        String str;
        int length;
        def0 def0VarE;
        p061 p061Var;
        int i = fif0Var.a;
        kfm0 kfm0Var = ojf0Var.O0;
        vpf0 vpf0Var = ojf0Var.c;
        if (kfm0Var instanceof jfm0) {
            return Next.j();
        }
        if (!(vpf0Var instanceof vpf0)) {
            return Next.j();
        }
        a9h a9hVar = vpf0Var.a;
        gy71 gy71Var = null;
        kfm0 kfm0Var2 = kfm0Var instanceof kfm0 ? kfm0Var : null;
        Set linkedHashSet = (kfm0Var2 == null || (p061Var = kfm0Var2.a) == null) ? null : p061Var.a;
        int i2 = 0;
        if (linkedHashSet != null) {
            Set set = linkedHashSet;
            ArrayList arrayList = new ArrayList(q7h.U(set, 10));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((vhc0) it.next()).a));
            }
            zContains = arrayList.contains(Integer.valueOf(i));
        } else {
            zContains = false;
        }
        def0 def0VarE2 = c921.E(ojf0Var);
        if (def0VarE2 == null || (aef0Var = (aef0) o7h.t0(i, a9hVar.a.a)) == null) {
            z = false;
        } else {
            String str2 = aef0Var.b;
            if (ihc1.y0(str2)) {
                z = false;
            } else {
                String str3 = (String) o7h.t0(i, def0VarE2.b);
                if (str3 == null) {
                    str3 = "";
                }
                if (str2.length() > 200 || str3.length() > 200) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        if (z) {
            linkedHashSet = Collections.singleton(new vhc0(i));
        } else if (c921.E(ojf0Var) != null) {
            linkedHashSet = w7x.a;
        } else if (!zContains) {
            linkedHashSet = new LinkedHashSet();
            ba80 ba80VarU1 = o7h.u1(a9hVar.a.a);
            int iS = zno1.s(q7h.U(ba80VarU1, 10));
            if (iS < 16) {
                iS = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
            ca80 it2 = ba80VarU1.iterator();
            while (true) {
                ca80 ca80Var = it2;
                if (!((Iterator) ca80Var.c).hasNext()) {
                    break;
                }
                aa80 aa80Var = (aa80) ca80Var.next();
                linkedHashMap.put(Integer.valueOf(aa80Var.a), aa80Var.b);
            }
            Iterator it3 = p7h.M(new Integer[]{0, -1, 1, -2, 2}).iterator();
            while (it3.hasNext()) {
                int iIntValue = ((Number) it3.next()).intValue() + i;
                aef0 aef0Var2 = (aef0) linkedHashMap.get(Integer.valueOf(iIntValue));
                if (aef0Var2 != null && (str = aef0Var2.b) != null && (length = str.length() + i2) <= 200) {
                    linkedHashSet.add(new vhc0(iIntValue));
                    i2 = length;
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return Next.j();
        }
        LinkedHashMap linkedHashMapY = y(a9hVar.a.a, linkedHashSet);
        dof1 dof1Var = ojf0Var.a;
        c9 c9VarZ = z ? c921.z(ojf0Var, Collections.singletonList(Integer.valueOf(i))) : fg91.b;
        if (z && (def0VarE = c921.E(ojf0Var)) != null) {
            gy71Var = new gy71(def0VarE.a, def0VarE.c);
        }
        return Next.a(Collections.singleton(new zhf0(linkedHashMapY, dof1Var, a9hVar, tv80Var, 2, c9VarZ, gy71Var)));
    }

    public static AppWidgetManager v(Context context) {
        return AppWidgetManager.getInstance(context);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object w(z2h z2hVar, ArrayList arrayList, ArrayList arrayList2, onm onmVar) {
        vzk vzkVar;
        if (onmVar instanceof vzk) {
            vzkVar = (vzk) onmVar;
            int i = vzkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzkVar.c = i - Integer.MIN_VALUE;
            } else {
                vzkVar = new vzk(onmVar);
            }
        } else {
            vzkVar = new vzk(onmVar);
        }
        Object objI = vzkVar.b;
        int i2 = vzkVar.c;
        if (i2 == 0) {
            hm5.M(objI);
            vzkVar.a = arrayList2;
            vzkVar.c = 1;
            z2hVar.getClass();
            objI = arrayList.isEmpty() ? z6x.a : b5p1.i(new qbk(new lt20(new vd0(new wef(yoi1.g(z2hVar.a.b(new oi("bluejay-confirm-generation", false, new s6(arrayList, (byte) 20)))), (byte) 5), arrayList, z2hVar, (byte) 23), new re1(3, (lnm) null, (byte) 14), (byte) 0), z2hVar, (byte) 3), vzkVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList2 = vzkVar.a;
            hm5.M(objI);
        }
        List list = (List) objI;
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        for (m6t0 m6t0Var : arrayList2) {
            String str = m6t0Var.a;
            String str2 = m6t0Var.b;
            String str3 = m6t0Var.c;
            List listSingletonList = m6t0Var.d;
            if (listSingletonList.isEmpty()) {
                listSingletonList = Collections.singletonList(m6t0Var.c);
            }
            arrayList3.add(new s781(str, str2, str3, listSingletonList, new Integer(0), 1));
        }
        List list2 = list;
        ArrayList arrayList4 = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList4.add(((s781) it.next()).a);
        }
        Set setP1 = o7h.p1(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!setP1.contains(((s781) obj).a)) {
                arrayList5.add(obj);
            }
        }
        return mqo1.A(o7h.N0(list2, arrayList5));
    }

    public static final Object x(vu30 vu30Var) {
        Thread.interrupted();
        return jo31.t(o6x.a, new p2z0(vu30Var, (lnm) null, (byte) 23));
    }

    public static final LinkedHashMap y(List list, Set set) {
        ba80 ba80VarU1 = o7h.u1(list);
        ArrayList<aa80> arrayList = new ArrayList();
        ca80 it = ba80VarU1.iterator();
        while (true) {
            ca80 ca80Var = it;
            if (!((Iterator) ca80Var.c).hasNext()) {
                break;
            }
            Object next = ca80Var.next();
            if (set.contains(new vhc0(((aa80) next).a))) {
                arrayList.add(next);
            }
        }
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (aa80 aa80Var : arrayList) {
            linkedHashMap.put(String.valueOf(aa80Var.a), ((aef0) aa80Var.b).b);
        }
        return linkedHashMap;
    }

    public static final String z(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }
}
