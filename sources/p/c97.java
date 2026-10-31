package p;

import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Duration;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.First;
import com.spotify.mobius.Next;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class c97 {
    public static final ke5 a = new ke5(Float.POSITIVE_INFINITY);
    public static final le5 b = new le5(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final me5 c = new me5(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ne5 d = new ne5(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ke5 e = new ke5(Float.NEGATIVE_INFINITY);
    public static final le5 f = new le5(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final me5 g = new me5(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final ne5 h = new ne5(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static b180 i;
    public static b180 j;

    /* JADX WARN: Code duplicated, block: B:100:0x012c  */
    /* JADX WARN: Code duplicated, block: B:101:0x012e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x013b  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:113:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x014c  */
    /* JADX WARN: Code duplicated, block: B:117:0x014e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0152  */
    /* JADX WARN: Code duplicated, block: B:120:0x0154  */
    /* JADX WARN: Code duplicated, block: B:122:0x0158  */
    /* JADX WARN: Code duplicated, block: B:124:0x015c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0197  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:137:0x0206  */
    /* JADX WARN: Code duplicated, block: B:138:0x020a  */
    /* JADX WARN: Code duplicated, block: B:141:0x0246  */
    /* JADX WARN: Code duplicated, block: B:143:0x028c  */
    /* JADX WARN: Code duplicated, block: B:144:0x028e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0295 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x0297  */
    /* JADX WARN: Code duplicated, block: B:151:0x02db  */
    /* JADX WARN: Code duplicated, block: B:154:0x0324  */
    /* JADX WARN: Code duplicated, block: B:155:0x0328  */
    /* JADX WARN: Code duplicated, block: B:158:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:159:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:162:0x040f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:190:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x0554  */
    /* JADX WARN: Code duplicated, block: B:210:0x057d  */
    /* JADX WARN: Code duplicated, block: B:212:0x0581  */
    /* JADX WARN: Code duplicated, block: B:215:0x0596  */
    /* JADX WARN: Code duplicated, block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a  */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    public static final void a(String str, String str2, qim0 qim0Var, String str3, String str4, String str5, Function0 function0, String str6, Function0 function1, Function0 function2, b0k b0kVar, int i2, int i3) {
        int i4;
        String str7;
        int i5;
        String str8;
        int i6;
        int i7;
        String str9;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z;
        x340 x340Var;
        Function0 function3;
        String str10;
        Function0 function4;
        String str11;
        String str12;
        String str13;
        Function0 function5;
        h311 h311VarV;
        String str14;
        String str15;
        Function0 function6;
        String str16;
        Function0 function7;
        Function0 function8;
        String str17;
        era eraVar;
        f36 f36Var;
        int i17;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        n4k n4kVar;
        qim0 qim0Var2;
        qim0 qim0VarY;
        Function0 function9;
        String str18;
        String str19;
        x340 x340Var2;
        float f2;
        x340 x340Var3;
        String str20;
        String str21;
        String str22;
        Function0 function10;
        gbx gbxVar;
        boolean z3;
        Object objT;
        m4c m4cVar = fkj0.X;
        x340 x340Var4 = (x340) b0kVar;
        x340Var4.k0(1057532875);
        j06 j06Var = x340Var4.a;
        if ((i2 & 6) == 0) {
            i4 = (x340Var4.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var4.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var4.i(qim0Var) ? 256 : 128;
        }
        int i18 = i3 & 8;
        if (i18 == 0) {
            if ((i2 & 3072) == 0) {
                str7 = str3;
                i4 |= x340Var4.g(str7) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    str8 = str4;
                    if (x340Var4.g(str8)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    str9 = str5;
                } else {
                    str9 = str5;
                    if ((i2 & 196608) == 0) {
                        if (x340Var4.g(str9)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (x340Var4.i(function0)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i4 |= i10;
                }
                i11 = i3 & 128;
                if (i11 != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (x340Var4.g(str6)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i4 |= i12;
                    }
                    i13 = i3 & 256;
                    if (i13 != 0) {
                        i4 |= 100663296;
                    } else if ((i2 & 100663296) == 0) {
                        if (x340Var4.i(function1)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i4 |= i14;
                    }
                    i15 = i3 & 512;
                    if (i15 != 0) {
                        i4 |= 805306368;
                    } else if ((i2 & 805306368) == 0) {
                        if (x340Var4.i(function2)) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i4 |= i16;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var4.Y(i4 & 1, z)) {
                        if (i18 != 0) {
                            str14 = null;
                        } else {
                            str14 = str7;
                        }
                        if (i5 != 0) {
                            str15 = null;
                        } else {
                            str15 = str8;
                        }
                        if (i7 != 0) {
                            str9 = null;
                        }
                        if (i9 != 0) {
                            function6 = null;
                        } else {
                            function6 = function0;
                        }
                        if (i11 != 0) {
                            str16 = null;
                        } else {
                            str16 = str6;
                        }
                        if (i13 != 0) {
                            function7 = null;
                        } else {
                            function7 = function1;
                        }
                        if (i15 != 0) {
                            function8 = null;
                        } else {
                            function8 = function2;
                        }
                        qim0 qim0VarD = u291.d(qim0Var, 1.0f);
                        uwr uwrVar = cbx.a;
                        str17 = str14;
                        qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var4).a.c, d4o1.a);
                        eraVar = een.Q0;
                        f36Var = h36.c;
                        i17 = i4;
                        mbhVarA = jbh.a(f36Var, eraVar, x340Var4, 0);
                        iHashCode = Long.hashCode(x340Var4.T);
                        xos0VarM = x340Var4.m();
                        qim0VarE = zr7.E(x340Var4, qim0VarF);
                        hzj.A.getClass();
                        if (j06Var != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var4.m0();
                        z2 = x340Var4.S;
                        n4kVar = hmb0.t1;
                        if (z2) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        llj lljVar = y580.O0;
                        nko1.H(mbhVarA, x340Var4, lljVar);
                        llj lljVar2 = y580.N0;
                        nko1.H(xos0VarM, x340Var4, lljVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        llj lljVar3 = y580.R0;
                        nko1.H(numValueOf, x340Var4, lljVar3);
                        nko1.F(x340Var4);
                        llj lljVar4 = y580.Y;
                        nko1.H(qim0VarE, x340Var4, lljVar4);
                        qim0Var2 = nim0.a;
                        Function0 function11 = function6;
                        Function0 function12 = function7;
                        qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
                        if (function8 != null) {
                            qim0VarY = voo1.y(qim0Var2, voo1.e);
                        } else {
                            qim0VarY = qim0Var2;
                        }
                        qim0 qim0VarH = u291.h(qim0VarF2.then(qim0VarY), 56.0f);
                        function9 = function8;
                        gfh0 gfh0VarC = t1c.c(een.h, false);
                        str18 = str9;
                        str19 = str15;
                        int iHashCode2 = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM2 = x340Var4.m();
                        qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarH);
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(gfh0VarC, x340Var4, lljVar);
                        nko1.H(xos0VarM2, x340Var4, lljVar2);
                        x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                        nko1.H(qim0VarE2, x340Var4, lljVar4);
                        w0h1.a(wsx.c, isl.a, u291.r(qim0Var2, 24.0f), cbx.a(x340Var4).b.a, 0L, false, x340Var4, wsx.d | 48, 48);
                        x340Var2 = x340Var4;
                        if (function9 != null) {
                            x340Var2.i0(-1965675960);
                            fux fuxVar = fux.c;
                            jsl jslVar = new jsl(cwl1.o0(x340Var2, 2131952080));
                            qim0 qim0VarA = h2c.a.a(qim0Var2, een.g);
                            cvx cvxVar = cbx.b(x340Var2).b;
                            qim0 qim0VarR = u291.r(uyn1.z(16.0f, 0.0f, 2, qim0VarA), 24.0f);
                            pm31 pm31Var = new pm31(0);
                            if ((i17 & 1879048192) == 536870912) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objT = x340Var2.T();
                            if (z3 || objT == m4cVar) {
                                objT = new y1(function9, (byte) 27);
                                x340Var2.s0(objT);
                            }
                            f2 = 0.0f;
                            w0h1.a(fuxVar, jslVar, bin.x(qim0VarR, false, null, pm31Var, null, (Function0) objT, 11), cbx.a(x340Var2).b.a, 0L, false, x340Var2, fux.d, 48);
                            x340Var2 = x340Var2;
                            x340Var2.r(false);
                        } else {
                            f2 = 0.0f;
                            x340Var2.i0(-1965173357);
                            x340Var2.r(false);
                        }
                        x340Var2.r(true);
                        pbh pbhVar = pbh.a;
                        op71.g(x340Var2, pbhVar.a(1.0f, qim0Var2, true));
                        qim0 qim0VarZ = uyn1.z(cbx.b(x340Var2).b.c, f2, 2, qim0Var2);
                        mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
                        int iHashCode3 = Long.hashCode(x340Var2.T);
                        xos0 xos0VarM3 = x340Var2.m();
                        qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarZ);
                        x340Var2.m0();
                        if (x340Var2.S) {
                            x340Var2.l(n4kVar);
                        } else {
                            x340Var2.v0();
                        }
                        nko1.H(mbhVarA2, x340Var2, lljVar);
                        nko1.H(xos0VarM3, x340Var2, lljVar2);
                        x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                        nko1.H(qim0VarE3, x340Var2, lljVar4);
                        x340 x340Var5 = x340Var2;
                        uwo1.e(str, u291.f(qim0Var2, 1.0f), cbx.d(x340Var2).c, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var5, i17 & 14, 0, 2016);
                        cvx cvxVar2 = cbx.b(x340Var5).b;
                        uwo1.e(str2, u291.f(qim0Var2, 1.0f), kk0.p(qim0Var2, 16.0f, x340Var5, x340Var5).g, cbx.a(x340Var5).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var5, (i17 >> 3) & 14, 0, 2016);
                        x340Var3 = x340Var5;
                        if (str17 != null) {
                            x340Var3.i0(-2005727909);
                            cvx cvxVar3 = cbx.b(x340Var3).b;
                            uwo1.e(str17, u291.f(qim0Var2, 1.0f), kk0.p(qim0Var2, 16.0f, x340Var3, x340Var3).g, cbx.a(x340Var3).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var3, (i17 >> 9) & 14, 0, 2016);
                            x340Var3 = x340Var3;
                            x340Var3.r(false);
                        } else {
                            x340Var3.i0(-2005412701);
                            x340Var3.r(false);
                        }
                        cvx cvxVar4 = cbx.b(x340Var3).b;
                        op71.g(x340Var3, u291.h(qim0Var2, 16.0f));
                        z50 z50Var = z50.c;
                        if (str19 != null || function11 == null) {
                            str20 = str19;
                            str21 = str18;
                            x340Var3.i0(-2004808573);
                            x340Var3.r(false);
                        } else {
                            x340Var3.i0(-2005253516);
                            if (str18 != null) {
                                x340Var3.i0(-2005171676);
                                boolean z4 = (i17 & 3670016) == 1048576;
                                Object objT2 = x340Var3.T();
                                if (z4 || objT2 == m4cVar) {
                                    objT2 = new y1(function11, (byte) 28);
                                    x340Var3.s0(objT2);
                                }
                                Function0 function13 = (Function0) objT2;
                                if (ihc1.y0(str18)) {
                                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                                    return;
                                } else {
                                    str21 = str18;
                                    gbxVar = new gbx(new y50(str21), function13);
                                    x340Var3.r(false);
                                }
                            } else {
                                str21 = str18;
                                x340Var3.i0(-2005071453);
                                boolean z5 = (i17 & 3670016) == 1048576;
                                Object objT3 = x340Var3.T();
                                if (z5 || objT3 == m4cVar) {
                                    objT3 = new y1(function11, (byte) 29);
                                    x340Var3.s0(objT3);
                                }
                                gbxVar = new gbx(z50Var, (Function0) objT3);
                                x340Var3.r(false);
                            }
                            str20 = str19;
                            x340 x340Var6 = x340Var3;
                            foo1.c(gbxVar, new idx(4), null, null, null, null, null, null, null, null, apo.r(807813422, new nl(str20, (byte) 15), x340Var3), x340Var6, 0, 48, 2044);
                            x340Var3 = x340Var6;
                            x340Var3.r(false);
                        }
                        if (str16 != 0 || 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v9 kotlin.jvm.functions.Function0
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 1448
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.c97.a(java.lang.String, java.lang.String, p.qim0, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.b0k, int, int):void");
                    }

                    public static o95 b(float f2) {
                        return new o95(Float.valueOf(f2), rno1.a, Float.valueOf(0.01f), 8);
                    }

                    /* JADX WARN: Code duplicated, block: B:100:0x01d7  */
                    /* JADX WARN: Code duplicated, block: B:103:0x021d  */
                    /* JADX WARN: Code duplicated, block: B:104:0x0229  */
                    /* JADX WARN: Code duplicated, block: B:106:0x0281  */
                    /* JADX WARN: Code duplicated, block: B:107:0x028b  */
                    /* JADX WARN: Code duplicated, block: B:109:0x02b5  */
                    /* JADX WARN: Code duplicated, block: B:111:0x02bb  */
                    /* JADX WARN: Code duplicated, block: B:114:0x02ca  */
                    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
                    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
                    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
                    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
                    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
                    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
                    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
                    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
                    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
                    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
                    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
                    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
                    /* JADX WARN: Code duplicated, block: B:52:0x0099  */
                    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
                    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
                    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
                    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
                    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
                    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
                    /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
                    /* JADX WARN: Code duplicated, block: B:68:0x00d6  */
                    /* JADX WARN: Code duplicated, block: B:71:0x00e0 A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:72:0x00e2  */
                    /* JADX WARN: Code duplicated, block: B:75:0x00f9  */
                    /* JADX WARN: Code duplicated, block: B:76:0x00fb  */
                    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
                    /* JADX WARN: Code duplicated, block: B:80:0x0106  */
                    /* JADX WARN: Code duplicated, block: B:83:0x010e A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:84:0x0110  */
                    /* JADX WARN: Code duplicated, block: B:89:0x0158  */
                    /* JADX WARN: Code duplicated, block: B:91:0x0163  */
                    /* JADX WARN: Code duplicated, block: B:92:0x0167  */
                    /* JADX WARN: Code duplicated, block: B:95:0x0199 A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:96:0x019b  */
                    /* JADX WARN: Code duplicated, block: B:99:0x01d3  */
                    public static final void c(String str, qim0 qim0Var, String str2, vu30 vu30Var, boolean z, Function0 function0, b0k b0kVar, int i2, int i3) {
                        String str3;
                        int i4;
                        vu30 vu30Var2;
                        int i5;
                        int i6;
                        Function0 function1;
                        boolean z2;
                        boolean z3;
                        String str4;
                        vu30 vu30Var3;
                        qim0 qim0Var2;
                        h311 h311VarV;
                        vu30 vu30Var4;
                        boolean z4;
                        Object objT;
                        m4c m4cVar;
                        o95 o95Var;
                        Object objT2;
                        o95 o95Var2;
                        int i7;
                        boolean z5;
                        boolean z6;
                        Object objT3;
                        boolean z7;
                        boolean z8;
                        boolean z9;
                        Object objT4;
                        o95 o95Var3;
                        qim0 qim0Var3;
                        era eraVar;
                        b36 b36Var;
                        mbh mbhVarA;
                        String str5;
                        int iHashCode;
                        xos0 xos0VarM;
                        qim0 qim0VarE;
                        boolean z10;
                        n4k n4kVar;
                        int i8;
                        boolean zI;
                        Object objT5;
                        String str6;
                        int i9;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1252856922);
                        j06 j06Var = x340Var.a;
                        int i10 = (x340Var.g(str) ? 4 : 2) | i2;
                        int i11 = i10 | 48;
                        int i12 = i3 & 4;
                        if (i12 != 0) {
                            i4 = i10 | 432;
                            str3 = str2;
                        } else {
                            str3 = str2;
                            i4 = i11 | (x340Var.g(str3) ? 256 : 128);
                        }
                        int i13 = i3 & 8;
                        if (i13 == 0) {
                            if ((i2 & 3072) == 0) {
                                vu30Var2 = vu30Var;
                                i4 |= x340Var.i(vu30Var2) ? 2048 : 1024;
                            }
                            i5 = i3 & 16;
                            if (i5 != 0) {
                                if ((i2 & 24576) == 0) {
                                    if (x340Var.h(z)) {
                                        i6 = 16384;
                                    } else {
                                        i6 = 8192;
                                    }
                                    i4 |= i6;
                                }
                                if ((196608 & i2) == 0) {
                                    function1 = function0;
                                    if (x340Var.i(function1)) {
                                        i9 = 131072;
                                    } else {
                                        i9 = 65536;
                                    }
                                    i4 |= i9;
                                } else {
                                    function1 = function0;
                                }
                                if ((74899 & i4) != 74898) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (x340Var.Y(i4 & 1, z2)) {
                                    if (i12 != 0) {
                                        str3 = null;
                                    }
                                    if (i13 != 0) {
                                        vu30Var4 = null;
                                    } else {
                                        vu30Var4 = vu30Var2;
                                    }
                                    if (i5 != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = z;
                                    }
                                    objT = x340Var.T();
                                    m4cVar = fkj0.X;
                                    if (objT == m4cVar) {
                                        objT = b(30.0f);
                                        x340Var.s0(objT);
                                    }
                                    o95Var = (o95) objT;
                                    objT2 = x340Var.T();
                                    if (objT2 == m4cVar) {
                                        objT2 = b(0.0f);
                                        x340Var.s0(objT2);
                                    }
                                    o95Var2 = (o95) objT2;
                                    boolean zI2 = x340Var.i(o95Var);
                                    i7 = i4 & 57344;
                                    if (i7 == 16384) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    z6 = zI2 | z5;
                                    objT3 = x340Var.T();
                                    if (z6 || objT3 == m4cVar) {
                                        objT3 = new yg10((byte) 1, o95Var, (lnm) null, z4);
                                        x340Var.s0(objT3);
                                    }
                                    rih1 rih1Var = rih1.a;
                                    qxd0.t(rih1Var, x340Var, (vu30) objT3);
                                    boolean zI3 = x340Var.i(o95Var2);
                                    if (i7 == 16384) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    boolean z11 = zI3 | z7;
                                    if ((458752 & i4) == 131072) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    z9 = z11 | z8;
                                    objT4 = x340Var.T();
                                    if (!z9 || objT4 == m4cVar) {
                                        o95Var3 = o95Var2;
                                        hl0 hl0Var = new hl0(o95Var3, z4, function1, (lnm) null, (byte) 11);
                                        x340Var.s0(hl0Var);
                                        objT4 = hl0Var;
                                    } else {
                                        o95Var3 = o95Var2;
                                    }
                                    qxd0.t(rih1Var, x340Var, (vu30) objT4);
                                    qim0Var3 = nim0.a;
                                    qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                                    eraVar = een.Q0;
                                    b36Var = h36.e;
                                    mbhVarA = jbh.a(b36Var, eraVar, x340Var, 0);
                                    str5 = str3;
                                    iHashCode = Long.hashCode(x340Var.T);
                                    xos0VarM = x340Var.m();
                                    qim0VarE = zr7.E(x340Var, qim0VarD);
                                    hzj.A.getClass();
                                    if (j06Var != null) {
                                        tgp1.p();
                                        throw null;
                                    }
                                    x340Var.m0();
                                    z10 = x340Var.S;
                                    n4kVar = hmb0.t1;
                                    if (z10) {
                                        x340Var.l(n4kVar);
                                    } else {
                                        x340Var.v0();
                                    }
                                    llj lljVar = y580.O0;
                                    nko1.H(mbhVarA, x340Var, lljVar);
                                    llj lljVar2 = y580.N0;
                                    nko1.H(xos0VarM, x340Var, lljVar2);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    i8 = i4;
                                    llj lljVar3 = y580.R0;
                                    nko1.H(numValueOf, x340Var, lljVar3);
                                    nko1.F(x340Var);
                                    llj lljVar4 = y580.Y;
                                    nko1.H(qim0VarE, x340Var, lljVar4);
                                    boolean z12 = z4;
                                    qim0 qim0VarZ = u291.z(qim0Var3, (fra) null, 3);
                                    zI = x340Var.i(o95Var);
                                    objT5 = x340Var.T();
                                    if (zI || objT5 == m4cVar) {
                                        objT5 = new wqe(o95Var, (byte) 9);
                                        x340Var.s0(objT5);
                                    }
                                    qim0 qim0VarK = d9y0.k(eqr0.B(qim0VarZ, (iu30) objT5), ((Number) o95Var3.e()).floatValue());
                                    mbh mbhVarA2 = jbh.a(b36Var, eraVar, x340Var, 0);
                                    int iHashCode2 = Long.hashCode(x340Var.T);
                                    xos0 xos0VarM2 = x340Var.m();
                                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarK);
                                    x340Var.m0();
                                    if (x340Var.S) {
                                        x340Var.l(n4kVar);
                                    } else {
                                        x340Var.v0();
                                    }
                                    nko1.H(mbhVarA2, x340Var, lljVar);
                                    nko1.H(xos0VarM2, x340Var, lljVar2);
                                    x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                                    nko1.H(qim0VarE2, x340Var, lljVar4);
                                    uwr uwrVar = cbx.a;
                                    qim0Var2 = qim0Var3;
                                    uwo1.e(str, uyn1.z(cbx.b(x340Var).b.d, 0.0f, 2, qim0Var3), cbx.d(x340Var).c, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, i8 & 14, 0, 2024);
                                    if (str5 == null) {
                                        x340Var.i0(-914210359);
                                        x340Var.r(false);
                                        str6 = str5;
                                    } else {
                                        x340Var.i0(-914210358);
                                        lee1 lee1Var = cbx.d(x340Var).j;
                                        cvx cvxVar = cbx.b(x340Var).b;
                                        str6 = str5;
                                        uwo1.e(str6, uyn1.B(qim0Var2, cbx.b(x340Var).b.d, 16.0f, cbx.b(x340Var).b.d, 0.0f, 8), lee1Var, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i8 >> 6) & 14, 0, 2024);
                                        x340Var.r(false);
                                    }
                                    if (vu30Var4 == null) {
                                        x340Var.i0(-913812071);
                                        x340Var.r(false);
                                    } else {
                                        x340Var.i0(-913812070);
                                        cvx cvxVar2 = cbx.b(x340Var).b;
                                        op71.g(x340Var, u291.h(qim0Var2, 16.0f));
                                        vu30Var4.invoke(x340Var, 0);
                                        x340Var.r(false);
                                    }
                                    x340Var.r(true);
                                    x340Var.r(true);
                                    vu30Var3 = vu30Var4;
                                    str4 = str6;
                                    z3 = z12;
                                } else {
                                    x340Var.b0();
                                    z3 = z;
                                    str4 = str3;
                                    vu30Var3 = vu30Var2;
                                    qim0Var2 = qim0Var;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new yc5(str, qim0Var2, str4, vu30Var3, z3, function0, i2, i3);
                                }
                            }
                            i4 |= 24576;
                            if ((196608 & i2) == 0) {
                                function1 = function0;
                                if (x340Var.i(function1)) {
                                    i9 = 131072;
                                } else {
                                    i9 = 65536;
                                }
                                i4 |= i9;
                            } else {
                                function1 = function0;
                            }
                            if ((74899 & i4) != 74898) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i4 & 1, z2)) {
                                if (i12 != 0) {
                                    str3 = null;
                                }
                                if (i13 != 0) {
                                    vu30Var4 = null;
                                } else {
                                    vu30Var4 = vu30Var2;
                                }
                                if (i5 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                objT = x340Var.T();
                                m4cVar = fkj0.X;
                                if (objT == m4cVar) {
                                    objT = b(30.0f);
                                    x340Var.s0(objT);
                                }
                                o95Var = (o95) objT;
                                objT2 = x340Var.T();
                                if (objT2 == m4cVar) {
                                    objT2 = b(0.0f);
                                    x340Var.s0(objT2);
                                }
                                o95Var2 = (o95) objT2;
                                boolean zI4 = x340Var.i(o95Var);
                                i7 = i4 & 57344;
                                if (i7 == 16384) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                z6 = zI4 | z5;
                                objT3 = x340Var.T();
                                if (z6) {
                                    objT3 = new yg10((byte) 1, o95Var, (lnm) null, z4);
                                    x340Var.s0(objT3);
                                } else {
                                    objT3 = new yg10((byte) 1, o95Var, (lnm) null, z4);
                                    x340Var.s0(objT3);
                                }
                                rih1 rih1Var2 = rih1.a;
                                qxd0.t(rih1Var2, x340Var, (vu30) objT3);
                                boolean zI5 = x340Var.i(o95Var2);
                                if (i7 == 16384) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                boolean z13 = zI5 | z7;
                                if ((458752 & i4) == 131072) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 = z13 | z8;
                                objT4 = x340Var.T();
                                if (z9) {
                                    o95Var3 = o95Var2;
                                    hl0 hl0Var2 = new hl0(o95Var3, z4, function1, (lnm) null, (byte) 11);
                                    x340Var.s0(hl0Var2);
                                    objT4 = hl0Var2;
                                } else {
                                    o95Var3 = o95Var2;
                                    hl0 hl0Var3 = new hl0(o95Var3, z4, function1, (lnm) null, (byte) 11);
                                    x340Var.s0(hl0Var3);
                                    objT4 = hl0Var3;
                                }
                                qxd0.t(rih1Var2, x340Var, (vu30) objT4);
                                qim0Var3 = nim0.a;
                                qim0 qim0VarD2 = u291.d(qim0Var3, 1.0f);
                                eraVar = een.Q0;
                                b36Var = h36.e;
                                mbhVarA = jbh.a(b36Var, eraVar, x340Var, 0);
                                str5 = str3;
                                iHashCode = Long.hashCode(x340Var.T);
                                xos0VarM = x340Var.m();
                                qim0VarE = zr7.E(x340Var, qim0VarD2);
                                hzj.A.getClass();
                                if (j06Var != null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                z10 = x340Var.S;
                                n4kVar = hmb0.t1;
                                if (z10) {
                                    x340Var.l(n4kVar);
                                } else {
                                    x340Var.v0();
                                }
                                llj lljVar5 = y580.O0;
                                nko1.H(mbhVarA, x340Var, lljVar5);
                                llj lljVar6 = y580.N0;
                                nko1.H(xos0VarM, x340Var, lljVar6);
                                Integer numValueOf2 = Integer.valueOf(iHashCode);
                                i8 = i4;
                                llj lljVar7 = y580.R0;
                                nko1.H(numValueOf2, x340Var, lljVar7);
                                nko1.F(x340Var);
                                llj lljVar8 = y580.Y;
                                nko1.H(qim0VarE, x340Var, lljVar8);
                                boolean z14 = z4;
                                qim0 qim0VarZ2 = u291.z(qim0Var3, (fra) null, 3);
                                zI = x340Var.i(o95Var);
                                objT5 = x340Var.T();
                                if (zI) {
                                    objT5 = new wqe(o95Var, (byte) 9);
                                    x340Var.s0(objT5);
                                } else {
                                    objT5 = new wqe(o95Var, (byte) 9);
                                    x340Var.s0(objT5);
                                }
                                qim0 qim0VarK2 = d9y0.k(eqr0.B(qim0VarZ2, (iu30) objT5), ((Number) o95Var3.e()).floatValue());
                                mbh mbhVarA3 = jbh.a(b36Var, eraVar, x340Var, 0);
                                int iHashCode3 = Long.hashCode(x340Var.T);
                                xos0 xos0VarM3 = x340Var.m();
                                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarK2);
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(n4kVar);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(mbhVarA3, x340Var, lljVar5);
                                nko1.H(xos0VarM3, x340Var, lljVar6);
                                x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
                                nko1.H(qim0VarE3, x340Var, lljVar8);
                                uwr uwrVar2 = cbx.a;
                                qim0Var2 = qim0Var3;
                                uwo1.e(str, uyn1.z(cbx.b(x340Var).b.d, 0.0f, 2, qim0Var3), cbx.d(x340Var).c, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, i8 & 14, 0, 2024);
                                if (str5 == null) {
                                    x340Var.i0(-914210359);
                                    x340Var.r(false);
                                    str6 = str5;
                                } else {
                                    x340Var.i0(-914210358);
                                    lee1 lee1Var2 = cbx.d(x340Var).j;
                                    cvx cvxVar3 = cbx.b(x340Var).b;
                                    str6 = str5;
                                    uwo1.e(str6, uyn1.B(qim0Var2, cbx.b(x340Var).b.d, 16.0f, cbx.b(x340Var).b.d, 0.0f, 8), lee1Var2, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i8 >> 6) & 14, 0, 2024);
                                    x340Var.r(false);
                                }
                                if (vu30Var4 == null) {
                                    x340Var.i0(-913812071);
                                    x340Var.r(false);
                                } else {
                                    x340Var.i0(-913812070);
                                    cvx cvxVar4 = cbx.b(x340Var).b;
                                    op71.g(x340Var, u291.h(qim0Var2, 16.0f));
                                    vu30Var4.invoke(x340Var, 0);
                                    x340Var.r(false);
                                }
                                x340Var.r(true);
                                x340Var.r(true);
                                vu30Var3 = vu30Var4;
                                str4 = str6;
                                z3 = z14;
                            } else {
                                x340Var.b0();
                                z3 = z;
                                str4 = str3;
                                vu30Var3 = vu30Var2;
                                qim0Var2 = qim0Var;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yc5(str, qim0Var2, str4, vu30Var3, z3, function0, i2, i3);
                            }
                        }
                        i4 |= 3072;
                        vu30Var2 = vu30Var;
                        i5 = i3 & 16;
                        if (i5 != 0) {
                            if ((i2 & 24576) == 0) {
                                if (x340Var.h(z)) {
                                    i6 = 16384;
                                } else {
                                    i6 = 8192;
                                }
                                i4 |= i6;
                            }
                            if ((196608 & i2) == 0) {
                                function1 = function0;
                                if (x340Var.i(function1)) {
                                    i9 = 131072;
                                } else {
                                    i9 = 65536;
                                }
                                i4 |= i9;
                            } else {
                                function1 = function0;
                            }
                            if ((74899 & i4) != 74898) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i4 & 1, z2)) {
                                if (i12 != 0) {
                                    str3 = null;
                                }
                                if (i13 != 0) {
                                    vu30Var4 = null;
                                } else {
                                    vu30Var4 = vu30Var2;
                                }
                                if (i5 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                objT = x340Var.T();
                                m4cVar = fkj0.X;
                                if (objT == m4cVar) {
                                    objT = b(30.0f);
                                    x340Var.s0(objT);
                                }
                                o95Var = (o95) objT;
                                objT2 = x340Var.T();
                                if (objT2 == m4cVar) {
                                    objT2 = b(0.0f);
                                    x340Var.s0(objT2);
                                }
                                o95Var2 = (o95) objT2;
                                boolean zI6 = x340Var.i(o95Var);
                                i7 = i4 & 57344;
                                if (i7 == 16384) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                z6 = zI6 | z5;
                                objT3 = x340Var.T();
                                if (z6) {
                                    objT3 = new yg10((byte) 1, o95Var, (lnm) null, z4);
                                    x340Var.s0(objT3);
                                } else {
                                    objT3 = new yg10((byte) 1, o95Var, (lnm) null, z4);
                                    x340Var.s0(objT3);
                                }
                                rih1 rih1Var3 = rih1.a;
                                qxd0.t(rih1Var3, x340Var, (vu30) objT3);
                                boolean zI7 = x340Var.i(o95Var2);
                                if (i7 == 16384) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                boolean z15 = zI7 | z7;
                                if ((458752 & i4) == 131072) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                z9 = z15 | z8;
                                objT4 = x340Var.T();
                                if (z9) {
                                    o95Var3 = o95Var2;
                                    hl0 hl0Var4 = new hl0(o95Var3, z4, function1, (lnm) null, (byte) 11);
                                    x340Var.s0(hl0Var4);
                                    objT4 = hl0Var4;
                                } else {
                                    o95Var3 = o95Var2;
                                    hl0 hl0Var5 = new hl0(o95Var3, z4, function1, (lnm) null, (byte) 11);
                                    x340Var.s0(hl0Var5);
                                    objT4 = hl0Var5;
                                }
                                qxd0.t(rih1Var3, x340Var, (vu30) objT4);
                                qim0Var3 = nim0.a;
                                qim0 qim0VarD3 = u291.d(qim0Var3, 1.0f);
                                eraVar = een.Q0;
                                b36Var = h36.e;
                                mbhVarA = jbh.a(b36Var, eraVar, x340Var, 0);
                                str5 = str3;
                                iHashCode = Long.hashCode(x340Var.T);
                                xos0VarM = x340Var.m();
                                qim0VarE = zr7.E(x340Var, qim0VarD3);
                                hzj.A.getClass();
                                if (j06Var != null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                z10 = x340Var.S;
                                n4kVar = hmb0.t1;
                                if (z10) {
                                    x340Var.l(n4kVar);
                                } else {
                                    x340Var.v0();
                                }
                                llj lljVar9 = y580.O0;
                                nko1.H(mbhVarA, x340Var, lljVar9);
                                llj lljVar10 = y580.N0;
                                nko1.H(xos0VarM, x340Var, lljVar10);
                                Integer numValueOf3 = Integer.valueOf(iHashCode);
                                i8 = i4;
                                llj lljVar11 = y580.R0;
                                nko1.H(numValueOf3, x340Var, lljVar11);
                                nko1.F(x340Var);
                                llj lljVar12 = y580.Y;
                                nko1.H(qim0VarE, x340Var, lljVar12);
                                boolean z16 = z4;
                                qim0 qim0VarZ3 = u291.z(qim0Var3, (fra) null, 3);
                                zI = x340Var.i(o95Var);
                                objT5 = x340Var.T();
                                if (zI) {
                                    objT5 = new wqe(o95Var, (byte) 9);
                                    x340Var.s0(objT5);
                                } else {
                                    objT5 = new wqe(o95Var, (byte) 9);
                                    x340Var.s0(objT5);
                                }
                                qim0 qim0VarK3 = d9y0.k(eqr0.B(qim0VarZ3, (iu30) objT5), ((Number) o95Var3.e()).floatValue());
                                mbh mbhVarA4 = jbh.a(b36Var, eraVar, x340Var, 0);
                                int iHashCode4 = Long.hashCode(x340Var.T);
                                xos0 xos0VarM4 = x340Var.m();
                                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarK3);
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(n4kVar);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(mbhVarA4, x340Var, lljVar9);
                                nko1.H(xos0VarM4, x340Var, lljVar10);
                                x0d.q(iHashCode4, x340Var, lljVar11, x340Var);
                                nko1.H(qim0VarE4, x340Var, lljVar12);
                                uwr uwrVar3 = cbx.a;
                                qim0Var2 = qim0Var3;
                                uwo1.e(str, uyn1.z(cbx.b(x340Var).b.d, 0.0f, 2, qim0Var3), cbx.d(x340Var).c, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, i8 & 14, 0, 2024);
                                if (str5 == null) {
                                    x340Var.i0(-914210359);
                                    x340Var.r(false);
                                    str6 = str5;
                                } else {
                                    x340Var.i0(-914210358);
                                    lee1 lee1Var3 = cbx.d(x340Var).j;
                                    cvx cvxVar5 = cbx.b(x340Var).b;
                                    str6 = str5;
                                    uwo1.e(str6, uyn1.B(qim0Var2, cbx.b(x340Var).b.d, 16.0f, cbx.b(x340Var).b.d, 0.0f, 8), lee1Var3, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i8 >> 6) & 14, 0, 2024);
                                    x340Var.r(false);
                                }
                                if (vu30Var4 == null) {
                                    x340Var.i0(-913812071);
                                    x340Var.r(false);
                                } else {
                                    x340Var.i0(-913812070);
                                    cvx cvxVar6 = cbx.b(x340Var).b;
                                    op71.g(x340Var, u291.h(qim0Var2, 16.0f));
                                    vu30Var4.invoke(x340Var, 0);
                                    x340Var.r(false);
                                }
                                x340Var.r(true);
                                x340Var.r(true);
                                vu30Var3 = vu30Var4;
                                str4 = str6;
                                z3 = z16;
                            } else {
                                x340Var.b0();
                                z3 = z;
                                str4 = str3;
                                vu30Var3 = vu30Var2;
                                qim0Var2 = qim0Var;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yc5(str, qim0Var2, str4, vu30Var3, z3, function0, i2, i3);
                            }
                        }
                        i4 |= 24576;
                        if ((196608 & i2) == 0) {
                            function1 = function0;
                            if (x340Var.i(function1)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i4 |= i9;
                        } else {
                            function1 = function0;
                        }
                        if ((74899 & i4) != 74898) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i4 & 1, z2)) {
                            if (i12 != 0) {
                                str3 = null;
                            }
                            if (i13 != 0) {
                                vu30Var4 = null;
                            } else {
                                vu30Var4 = vu30Var2;
                            }
                            if (i5 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            objT = x340Var.T();
                            m4cVar = fkj0.X;
                            if (objT == m4cVar) {
                                objT = b(30.0f);
                                x340Var.s0(objT);
                            }
                            o95Var = (o95) objT;
                            objT2 = x340Var.T();
                            if (objT2 == m4cVar) {
                                objT2 = b(0.0f);
                                x340Var.s0(objT2);
                            }
                            o95Var2 = (o95) objT2;
                            boolean zI8 = x340Var.i(o95Var);
                            i7 = i4 & 57344;
                            if (i7 == 16384) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z6 = zI8 | z5;
                            objT3 = x340Var.T();
                            if (z6) {
                                objT3 = new yg10((byte) 1, o95Var, (lnm) null, z4);
                                x340Var.s0(objT3);
                            } else {
                                objT3 = new yg10((byte) 1, o95Var, (lnm) null, z4);
                                x340Var.s0(objT3);
                            }
                            rih1 rih1Var4 = rih1.a;
                            qxd0.t(rih1Var4, x340Var, (vu30) objT3);
                            boolean zI9 = x340Var.i(o95Var2);
                            if (i7 == 16384) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            boolean z17 = zI9 | z7;
                            if ((458752 & i4) == 131072) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            z9 = z17 | z8;
                            objT4 = x340Var.T();
                            if (z9) {
                                o95Var3 = o95Var2;
                                hl0 hl0Var6 = new hl0(o95Var3, z4, function1, (lnm) null, (byte) 11);
                                x340Var.s0(hl0Var6);
                                objT4 = hl0Var6;
                            } else {
                                o95Var3 = o95Var2;
                                hl0 hl0Var7 = new hl0(o95Var3, z4, function1, (lnm) null, (byte) 11);
                                x340Var.s0(hl0Var7);
                                objT4 = hl0Var7;
                            }
                            qxd0.t(rih1Var4, x340Var, (vu30) objT4);
                            qim0Var3 = nim0.a;
                            qim0 qim0VarD4 = u291.d(qim0Var3, 1.0f);
                            eraVar = een.Q0;
                            b36Var = h36.e;
                            mbhVarA = jbh.a(b36Var, eraVar, x340Var, 0);
                            str5 = str3;
                            iHashCode = Long.hashCode(x340Var.T);
                            xos0VarM = x340Var.m();
                            qim0VarE = zr7.E(x340Var, qim0VarD4);
                            hzj.A.getClass();
                            if (j06Var != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            z10 = x340Var.S;
                            n4kVar = hmb0.t1;
                            if (z10) {
                                x340Var.l(n4kVar);
                            } else {
                                x340Var.v0();
                            }
                            llj lljVar13 = y580.O0;
                            nko1.H(mbhVarA, x340Var, lljVar13);
                            llj lljVar14 = y580.N0;
                            nko1.H(xos0VarM, x340Var, lljVar14);
                            Integer numValueOf4 = Integer.valueOf(iHashCode);
                            i8 = i4;
                            llj lljVar15 = y580.R0;
                            nko1.H(numValueOf4, x340Var, lljVar15);
                            nko1.F(x340Var);
                            llj lljVar16 = y580.Y;
                            nko1.H(qim0VarE, x340Var, lljVar16);
                            boolean z18 = z4;
                            qim0 qim0VarZ4 = u291.z(qim0Var3, (fra) null, 3);
                            zI = x340Var.i(o95Var);
                            objT5 = x340Var.T();
                            if (zI) {
                                objT5 = new wqe(o95Var, (byte) 9);
                                x340Var.s0(objT5);
                            } else {
                                objT5 = new wqe(o95Var, (byte) 9);
                                x340Var.s0(objT5);
                            }
                            qim0 qim0VarK4 = d9y0.k(eqr0.B(qim0VarZ4, (iu30) objT5), ((Number) o95Var3.e()).floatValue());
                            mbh mbhVarA5 = jbh.a(b36Var, eraVar, x340Var, 0);
                            int iHashCode5 = Long.hashCode(x340Var.T);
                            xos0 xos0VarM5 = x340Var.m();
                            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarK4);
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(n4kVar);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(mbhVarA5, x340Var, lljVar13);
                            nko1.H(xos0VarM5, x340Var, lljVar14);
                            x0d.q(iHashCode5, x340Var, lljVar15, x340Var);
                            nko1.H(qim0VarE5, x340Var, lljVar16);
                            uwr uwrVar4 = cbx.a;
                            qim0Var2 = qim0Var3;
                            uwo1.e(str, uyn1.z(cbx.b(x340Var).b.d, 0.0f, 2, qim0Var3), cbx.d(x340Var).c, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, i8 & 14, 0, 2024);
                            if (str5 == null) {
                                x340Var.i0(-914210359);
                                x340Var.r(false);
                                str6 = str5;
                            } else {
                                x340Var.i0(-914210358);
                                lee1 lee1Var4 = cbx.d(x340Var).j;
                                cvx cvxVar7 = cbx.b(x340Var).b;
                                str6 = str5;
                                uwo1.e(str6, uyn1.B(qim0Var2, cbx.b(x340Var).b.d, 16.0f, cbx.b(x340Var).b.d, 0.0f, 8), lee1Var4, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i8 >> 6) & 14, 0, 2024);
                                x340Var.r(false);
                            }
                            if (vu30Var4 == null) {
                                x340Var.i0(-913812071);
                                x340Var.r(false);
                            } else {
                                x340Var.i0(-913812070);
                                cvx cvxVar8 = cbx.b(x340Var).b;
                                op71.g(x340Var, u291.h(qim0Var2, 16.0f));
                                vu30Var4.invoke(x340Var, 0);
                                x340Var.r(false);
                            }
                            x340Var.r(true);
                            x340Var.r(true);
                            vu30Var3 = vu30Var4;
                            str4 = str6;
                            z3 = z18;
                        } else {
                            x340Var.b0();
                            z3 = z;
                            str4 = str3;
                            vu30Var3 = vu30Var2;
                            qim0Var2 = qim0Var;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yc5(str, qim0Var2, str4, vu30Var3, z3, function0, i2, i3);
                        }
                    }

                    public static final void d(Function0 function0, b0k b0kVar, int i2) {
                        Function0 function1 = function0;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1931146713);
                        int i3 = i2 | (x340Var.i(function1) ? 4 : 2);
                        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
                            nim0 nim0Var = nim0.a;
                            qim0 qim0VarY = uyn1.y(u291.f(nim0Var, 1.0f), 16.0f, 24.0f);
                            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
                            int iHashCode = Long.hashCode(x340Var.T);
                            xos0 xos0VarM = x340Var.m();
                            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
                            String strO0 = cwl1.o0(x340Var, 2131962573);
                            uwr uwrVar = cbx.a;
                            uwo1.e(strO0, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                            uwo1.e(ydh.g(4.0f, 2131962571, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
                            op71.g(x340Var, u291.h(nim0Var, 16.0f));
                            boolean z = (i3 & 14) == 4;
                            Object objT = x340Var.T();
                            if (z || objT == fkj0.X) {
                                objT = new pt61(function0, (byte) 17);
                                x340Var.s0(objT);
                            }
                            function1 = function0;
                            foo1.c(new gbx(z50.c, (Function0) objT), jdx.c, null, null, yla.s(x340Var), null, null, null, null, null, uij.a, x340Var, 0, 48, 2012);
                            x340Var = x340Var;
                            x340Var.r(true);
                        } else {
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new h621(function1, i2, (byte) 9);
                        }
                    }

                    public static final void e(int i2, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
                        x340 x340Var;
                        x340 x340Var2 = (x340) b0kVar;
                        x340Var2.k0(-538284722);
                        int i3 = i2 | (x340Var2.g(str) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.g(qim0Var) ? 256 : 128);
                        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
                            fra fraVar = een.O0;
                            qim0 qim0VarZ = u291.z(u291.f(qim0Var, 1.0f), (fra) null, 3);
                            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 48);
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
                            nko1.H(jw31VarA, x340Var2, y580.O0);
                            nko1.H(xos0VarM, x340Var2, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                            nko1.F(x340Var2);
                            nko1.H(qim0VarE, x340Var2, y580.Y);
                            uwr uwrVar = cbx.a;
                            lee1 lee1VarQ = vgo1.q(cbx.d(x340Var2).e, z, x340Var2);
                            long j2 = cbx.a(x340Var2).b.a;
                            wnb0 wnb0Var = new wnb0(1.0f, true);
                            Object objT = x340Var2.T();
                            if (objT == fkj0.X) {
                                objT = nhe1.O0;
                                x340Var2.s0(objT);
                            }
                            uwo1.e(str, s161.b(wnb0Var, false, (iu30) objT), lee1VarQ, j2, null, null, 0, false, null, 0, null, x340Var2, i3 & 14, 0, 2032);
                            x340Var = x340Var2;
                            x340Var.r(true);
                        } else {
                            x340Var = x340Var2;
                            x340Var.b0();
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ltj(str, z, qim0Var, i2, (byte) 7);
                        }
                    }

                    public static final void f(qwk1 qwk1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
                        int i3;
                        qim0 qim0Var2;
                        x340 x340Var = (x340) b0kVar;
                        x340Var.k0(-1304659343);
                        if ((i2 & 6) == 0) {
                            i3 = (x340Var.g(qwk1Var) ? 4 : 2) | i2;
                        } else {
                            i3 = i2;
                        }
                        if ((i2 & 48) == 0) {
                            i3 |= x340Var.i(iu30Var) ? 32 : 16;
                        }
                        int i4 = i3 | 384;
                        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
                            qim0 qim0Var3 = nim0.a;
                            k5p1.d(u291.f(qim0Var3, 1.0f), h36.g, null, null, 0, 0, apo.r(-1378214612, new sgi1(qwk1Var, iu30Var, (byte) 12), x340Var), x340Var, 1572864, 60);
                            qim0Var2 = qim0Var3;
                        } else {
                            x340Var.b0();
                            qim0Var2 = qim0Var;
                        }
                        h311 h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ixi1(qwk1Var, iu30Var, qim0Var2, i2, (byte) 12);
                        }
                    }

                    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
                    
                        if (p.o95.b(r2, r3, r4, (java.lang.Float) null, (p.iu30) null, r7, 12) == r0) goto L29;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public static final java.lang.Object h(p.o95 r16, boolean r17, p.onm r18) {
                        /*
                            r0 = r18
                            boolean r1 = r0 instanceof p.kr30
                            if (r1 == 0) goto L16
                            r1 = r0
                            p.kr30 r1 = (p.kr30) r1
                            int r2 = r1.d
                            r3 = -2147483648(0xffffffff80000000, float:-0.0)
                            r4 = r2 & r3
                            if (r4 == 0) goto L16
                            int r2 = r2 - r3
                            r1.d = r2
                        L14:
                            r7 = r1
                            goto L1c
                        L16:
                            p.kr30 r1 = new p.kr30
                            r1.<init>(r0)
                            goto L14
                        L1c:
                            java.lang.Object r0 = r7.c
                            int r1 = r7.d
                            r9 = 500(0x1f4, float:7.0E-43)
                            r10 = 1065353216(0x3f800000, float:1.0)
                            r11 = 3
                            r12 = 2
                            r2 = 1
                            r13 = 6
                            r14 = 0
                            r15 = 0
                            p.d9n r3 = p.d9n.a
                            if (r1 == 0) goto L51
                            if (r1 == r2) goto L48
                            if (r1 == r12) goto L3f
                            if (r1 != r11) goto L39
                            p.hm5.M(r0)
                            goto Lb1
                        L39:
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            p.eg.m(r0)
                            return r15
                        L3f:
                            boolean r1 = r7.b
                            p.o95 r2 = r7.a
                            p.hm5.M(r0)
                            r0 = r3
                            goto L94
                        L48:
                            boolean r1 = r7.b
                            p.o95 r2 = r7.a
                            p.hm5.M(r0)
                            r0 = r3
                            goto L78
                        L51:
                            p.hm5.M(r0)
                            r0 = r3
                            java.lang.Float r3 = new java.lang.Float
                            r3.<init>(r10)
                            p.pxg1 r4 = p.irn1.o0(r9, r14, r15, r13)
                            r1 = r16
                            r7.a = r1
                            r5 = r17
                            r7.b = r5
                            r7.d = r2
                            r5 = 0
                            r6 = 0
                            r8 = 12
                            r2 = r1
                            java.lang.Object r1 = p.o95.b(r2, r3, r4, r5, r6, r7, r8)
                            if (r1 != r0) goto L74
                            goto Lb0
                        L74:
                            r2 = r16
                            r1 = r17
                        L78:
                            java.lang.Float r3 = new java.lang.Float
                            r3.<init>(r10)
                            r4 = 1500(0x5dc, float:2.102E-42)
                            p.pxg1 r4 = p.irn1.o0(r4, r14, r15, r13)
                            r7.a = r2
                            r7.b = r1
                            r7.d = r12
                            r5 = 0
                            r6 = 0
                            r8 = 12
                            java.lang.Object r3 = p.o95.b(r2, r3, r4, r5, r6, r7, r8)
                            if (r3 != r0) goto L94
                            goto Lb0
                        L94:
                            if (r1 == 0) goto Lb1
                            java.lang.Float r3 = new java.lang.Float
                            r4 = 0
                            r3.<init>(r4)
                            p.pxg1 r4 = p.irn1.o0(r9, r14, r15, r13)
                            r7.a = r15
                            r7.b = r1
                            r7.d = r11
                            r5 = 0
                            r6 = 0
                            r8 = 12
                            java.lang.Object r1 = p.o95.b(r2, r3, r4, r5, r6, r7, r8)
                            if (r1 != r0) goto Lb1
                        Lb0:
                            return r0
                        Lb1:
                            p.rih1 r0 = p.rih1.a
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.c97.h(p.o95, boolean, p.onm):java.lang.Object");
                    }

                    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
                    
                        if (p.o95.b(r2, r3, r4, (java.lang.Float) null, (p.iu30) null, r7, 12) == r0) goto L29;
                     */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public static final java.lang.Object i(p.o95 r16, boolean r17, p.onm r18) {
                        /*
                            r0 = r18
                            boolean r1 = r0 instanceof p.lr30
                            if (r1 == 0) goto L16
                            r1 = r0
                            p.lr30 r1 = (p.lr30) r1
                            int r2 = r1.d
                            r3 = -2147483648(0xffffffff80000000, float:-0.0)
                            r4 = r2 & r3
                            if (r4 == 0) goto L16
                            int r2 = r2 - r3
                            r1.d = r2
                        L14:
                            r7 = r1
                            goto L1c
                        L16:
                            p.lr30 r1 = new p.lr30
                            r1.<init>(r0)
                            goto L14
                        L1c:
                            java.lang.Object r0 = r7.c
                            int r1 = r7.d
                            r9 = 500(0x1f4, float:7.0E-43)
                            r10 = 0
                            r11 = 3
                            r12 = 2
                            r2 = 1
                            r13 = 6
                            r14 = 0
                            r15 = 0
                            p.d9n r3 = p.d9n.a
                            if (r1 == 0) goto L50
                            if (r1 == r2) goto L47
                            if (r1 == r12) goto L3e
                            if (r1 != r11) goto L38
                            p.hm5.M(r0)
                            goto Lb1
                        L38:
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            p.eg.m(r0)
                            return r15
                        L3e:
                            boolean r1 = r7.b
                            p.o95 r2 = r7.a
                            p.hm5.M(r0)
                            r0 = r3
                            goto L93
                        L47:
                            boolean r1 = r7.b
                            p.o95 r2 = r7.a
                            p.hm5.M(r0)
                            r0 = r3
                            goto L77
                        L50:
                            p.hm5.M(r0)
                            r0 = r3
                            java.lang.Float r3 = new java.lang.Float
                            r3.<init>(r10)
                            p.pxg1 r4 = p.irn1.o0(r9, r14, r15, r13)
                            r1 = r16
                            r7.a = r1
                            r5 = r17
                            r7.b = r5
                            r7.d = r2
                            r5 = 0
                            r6 = 0
                            r8 = 12
                            r2 = r1
                            java.lang.Object r1 = p.o95.b(r2, r3, r4, r5, r6, r7, r8)
                            if (r1 != r0) goto L73
                            goto Lb0
                        L73:
                            r2 = r16
                            r1 = r17
                        L77:
                            java.lang.Float r3 = new java.lang.Float
                            r3.<init>(r10)
                            r4 = 1500(0x5dc, float:2.102E-42)
                            p.pxg1 r4 = p.irn1.o0(r4, r14, r15, r13)
                            r7.a = r2
                            r7.b = r1
                            r7.d = r12
                            r5 = 0
                            r6 = 0
                            r8 = 12
                            java.lang.Object r3 = p.o95.b(r2, r3, r4, r5, r6, r7, r8)
                            if (r3 != r0) goto L93
                            goto Lb0
                        L93:
                            if (r1 == 0) goto Lb1
                            java.lang.Float r3 = new java.lang.Float
                            r4 = -1041235968(0xffffffffc1f00000, float:-30.0)
                            r3.<init>(r4)
                            p.pxg1 r4 = p.irn1.o0(r9, r14, r15, r13)
                            r7.a = r15
                            r7.b = r1
                            r7.d = r11
                            r5 = 0
                            r6 = 0
                            r8 = 12
                            java.lang.Object r1 = p.o95.b(r2, r3, r4, r5, r6, r7, r8)
                            if (r1 != r0) goto Lb1
                        Lb0:
                            return r0
                        Lb1:
                            p.rih1 r0 = p.rih1.a
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.c97.i(p.o95, boolean, p.onm):java.lang.Object");
                    }

                    public static final Next j(fu1 fu1Var, k031 k031Var) {
                        if (k031Var instanceof i031) {
                            return e6p1.k(fu1Var, new ss1(((i031) k031Var).a));
                        }
                        if (!(k031Var instanceof j031)) {
                            eg.o();
                            return null;
                        }
                        tv80 tv80Var = ((j031) k031Var).a;
                        yv51 yv51Var = (yv51) fu1Var.b.b.get("atp");
                        return Next.a(Collections.singleton(new cp1(1, yv51Var != null ? yv51Var.a : null, tv80Var)));
                    }

                    public static final void k(th30 th30Var, haa haaVar) {
                        g0i g0iVarM0 = th30Var.x.m0();
                        if (g0iVarM0 == null) {
                            g0iVarM0 = null;
                        }
                        if (g0iVarM0 != null) {
                            z6b z6bVar = new z6b(g0iVarM0, (byte) 0);
                            z6bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                            g0iVarM0.addContentView(z6bVar, z6bVar.getLayoutParams());
                            ((zf30) haaVar).s1.a(new i83(z6bVar, (byte) 2));
                            z6bVar.postDelayed(new s10(z6bVar, (byte) 16), 1000L);
                        }
                    }

                    public static final Next l(fu1 fu1Var, Set set, iu30 iu30Var) {
                        fu1 fu1Var2 = (fu1) iu30Var.invoke(fu1Var);
                        fu1 fu1VarB = fu1.b(fu1Var2, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(fu1Var2.h, null, null, null, null, null, null, null, 111), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023);
                        return !fu1VarB.equals(fu1Var) ? Next.i(fu1VarB, set) : Next.a(set);
                    }

                    public static nrk0 m(Integer num, r6h1 r6h1Var) {
                        return new nrk0(num, r6h1Var);
                    }

                    public static final int n(View view, int i2) {
                        int i3 = 0;
                        int i4 = Integer.MAX_VALUE;
                        Object obj = null;
                        while (view != null) {
                            Object tag = view.getTag(i2);
                            if (tag != null) {
                                if (obj != null) {
                                    if (!tag.equals(obj)) {
                                        break;
                                    }
                                } else {
                                    obj = tag;
                                }
                                i4 = i3;
                            }
                            i3++;
                            Object objP = dm5.P(view);
                            view = objP instanceof View ? (View) objP : null;
                        }
                        return i4;
                    }

                    public static final qzj o(View view) {
                        return q(p(view));
                    }

                    public static final View p(View view) {
                        if (!view.isAttachedToWindow()) {
                            return view;
                        }
                        int iMin = Math.min(n(view, 2131431630), n(view, 2131431635));
                        View view2 = view;
                        int i2 = 0;
                        View view3 = view2;
                        while (view != null) {
                            if (i2 == iMin) {
                                if (!(view.getParent() instanceof ViewGroup)) {
                                    return view2;
                                }
                            } else if (q(view) == null) {
                                i2++;
                                Object objP = dm5.P(view);
                                View view4 = view2;
                                view2 = view;
                                view = objP instanceof View ? (View) objP : null;
                                view3 = view4;
                            }
                            return view;
                        }
                        return view3;
                    }

                    public static final qzj q(View view) {
                        Object tag = view.getTag(2131427575);
                        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
                        if (weakReference != null) {
                            return (qzj) weakReference.get();
                        }
                        return null;
                    }

                    public static final First r(gud0 gud0Var) {
                        return First.b(gud0Var);
                    }

                    public static final gud0 s(ysd0 ysd0Var) {
                        psd0 psd0Var = ysd0Var.a;
                        if (psd0Var instanceof zrd0) {
                            return std0.a;
                        }
                        if (psd0Var instanceof asd0) {
                            return ttd0.a;
                        }
                        if (psd0Var instanceof osd0) {
                            return eud0.a;
                        }
                        if (psd0Var instanceof ksd0) {
                            return wtd0.a;
                        }
                        if (psd0Var instanceof jsd0) {
                            return new vtd0(ysd0Var.b);
                        }
                        eg.n("Cannot map ", psd0Var, " to availability");
                        return null;
                    }

                    public static final Next t(fu1 fu1Var, k031 k031Var) {
                        ma61 ma61Var = fu1Var.h;
                        wka1 wka1Var = fu1Var.r;
                        if (u890.j(wka1Var, vka1.a) || (wka1Var instanceof uka1)) {
                            return u890.j(ma61Var.e, k031Var) ? Next.j() : Next.h(fu1.b(fu1Var, (String) null, (fo1) null, false, 0L, 0, false, ma61.a(ma61Var, null, null, null, null, k031Var, null, null, 111), (pia1) null, (c380) null, (c380) null, false, (Set) null, false, (wka1) null, (Set) null, 2097023));
                        }
                        return j(fu1Var, k031Var);
                    }

                    public static final void u(View view, qzj qzjVar) {
                        view.setTag(2131427575, new WeakReference(qzjVar));
                    }

                    public static final xkg0 v(tv80 tv80Var) {
                        String str;
                        xkg0 xkg0Var = new xkg0();
                        xkg0Var.put("interaction_id", tv80Var.a.a);
                        y6r0 y6r0Var = tv80Var.b;
                        if (y6r0Var != null && (str = y6r0Var.a) != null) {
                        }
                        xkg0Var.put("authenticated", String.valueOf(tv80Var.c));
                        xkg0Var.put("event_creation_timestamp", String.valueOf(tv80Var.d));
                        xkg0Var.put("event_logged_timestamp", String.valueOf(tv80Var.e));
                        String str2 = tv80Var.h;
                        if (str2 != null) {
                        }
                        String str3 = tv80Var.i;
                        if (str3 != null) {
                        }
                        String str4 = tv80Var.t;
                        if (str4 != null) {
                            xkg0Var.put("leaf_specification_id", str4);
                        }
                        return xkg0Var.b();
                    }

                    public static final yrw w(yo60 yo60Var, hwt hwtVar) {
                        String str = yo60Var.a;
                        myp0 myp0Var = yo60Var.d;
                        q8i0 q8i0VarA = kno1.A(yo60Var, hwtVar);
                        String str2 = yo60Var.b;
                        if (!q8i0VarA.equals(m8i0.a) || str2 == null || str2.length() == 0) {
                            return !ihc1.y0(str) ? new yrw(Collections.singletonList(new zrw(str))) : new yrw(z6x.a);
                        }
                        Duration duration = myp0Var.a;
                        long jP = duration.p();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        Integer numValueOf = Integer.valueOf((int) ((((long) duration.o()) / 1000000) + timeUnit.toMillis(jP)));
                        Duration duration2 = myp0Var.b;
                        int iO = (int) ((((long) duration2.o()) / 1000000) + timeUnit.toMillis(duration2.p()));
                        Integer numValueOf2 = Integer.valueOf(iO);
                        if (iO <= 0) {
                            numValueOf2 = null;
                        }
                        return new yrw(Collections.singletonList(new asw(numValueOf, str2, numValueOf2)));
                    }

                    public static final Next x(gud0 gud0Var, rtd0 rtd0Var) {
                        Logger.b("[LiveSharing]: Updating mobius loop with: model: " + gud0Var + ", event: " + rtd0Var, new Object[0]);
                        if (rtd0Var instanceof ktd0) {
                            return Next.h(new ztd0(((ktd0) rtd0Var).a));
                        }
                        if (rtd0Var instanceof ysd0) {
                            ysd0 ysd0Var = (ysd0) rtd0Var;
                            return ysd0Var.a instanceof jsd0 ? Next.i(s(ysd0Var), Collections.singleton(usd0.a)) : Next.h(s(ysd0Var));
                        }
                        boolean z = rtd0Var instanceof atd0;
                        qsd0 qsd0Var = qsd0.a;
                        fud0 fud0Var = fud0.a;
                        if (z) {
                            return Next.i(fud0Var, Collections.singleton(qsd0Var));
                        }
                        if (rtd0Var instanceof ltd0) {
                            return Next.h(ytd0.a);
                        }
                        boolean z2 = rtd0Var instanceof itd0;
                        xsd0 xsd0Var = tsd0.a;
                        xsd0 xsd0Var2 = ssd0.a;
                        if (z2) {
                            return Next.i(new utd0(((itd0) rtd0Var).a), f46.S0(new xsd0[]{xsd0Var2, xsd0Var}));
                        }
                        if (rtd0Var instanceof zsd0) {
                            return Next.a(Collections.singleton(qsd0Var));
                        }
                        if (rtd0Var instanceof qtd0) {
                            if (gud0Var instanceof std0) {
                                return Next.a(Collections.singleton(wsd0.a));
                            }
                            Logger.k("[LiveSharing]: Attempted to start live sharing session when state is " + gud0Var + ". Expected CanHost state.", new Object[0]);
                            return Next.h(gud0Var);
                        }
                        if (rtd0Var instanceof btd0) {
                            if (gud0Var instanceof ttd0) {
                                return Next.a(Collections.singleton(rsd0.a));
                            }
                            Logger.k("[LiveSharing]: Attempted to join live sharing session when state is " + gud0Var + ". Expected CanJoin state.", new Object[0]);
                            return Next.h(gud0Var);
                        }
                        if (rtd0Var instanceof ftd0) {
                            return Next.a(Collections.singleton(xsd0Var));
                        }
                        if (rtd0Var instanceof mtd0) {
                            return Next.h(aud0.a);
                        }
                        if (rtd0Var instanceof ntd0) {
                            return Next.i(bud0.a, f46.S0(new xsd0[]{xsd0Var, vsd0.a}));
                        }
                        if ((rtd0Var instanceof ptd0) || rtd0Var.equals(gtd0.a)) {
                            return Next.a(Collections.singleton(xsd0Var2));
                        }
                        if (rtd0Var instanceof jtd0) {
                            return Next.a(Collections.singleton(xsd0Var));
                        }
                        if (rtd0Var instanceof dtd0) {
                            return Next.i(dud0.a, Collections.singleton(xsd0Var2));
                        }
                        if (rtd0Var instanceof ctd0) {
                            return Next.a(Collections.singleton(xsd0Var2));
                        }
                        if (rtd0Var.equals(htd0.a)) {
                            return Next.i(xtd0.a, f46.S0(new xsd0[]{xsd0Var2, xsd0Var}));
                        }
                        if (rtd0Var.equals(gtd0.b)) {
                            return Next.i(fud0Var, Collections.singleton(xsd0Var2));
                        }
                        eg.o();
                        return null;
                    }

                    public static Next y(kak0 kak0Var, x1k0 x1k0Var) {
                        Object next;
                        Object next2;
                        lhg1 lhg1Var;
                        xx8 xx8Var;
                        String str = x1k0Var.a;
                        List list = kak0Var.Y;
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!u890.j(((sr10) next).b, str));
                        sr10 sr10Var = (sr10) next;
                        Iterator it2 = list.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!((sr10) next2).d);
                        sr10 sr10Var2 = (sr10) next2;
                        boolean zEquals = str.equals((!kak0Var.O0 || sr10Var2 == null) ? "core" : sr10Var2.b);
                        if (sr10Var == null || (lhg1Var = sr10Var.c) == null) {
                            lhg1Var = kak0Var.h;
                        }
                        lhg1 lhg1Var2 = lhg1Var;
                        if (!zEquals) {
                            return x1p1.t(x1p1.C(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, lhg1Var2, lhg1Var2, (String) null, (String) null, (lhg1) null, k8w0.a, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -4587521, 1048575))), 3);
                        }
                        String str2 = sr10Var != null ? sr10Var.b : null;
                        if (str2 == null) {
                            xx8Var = kak0Var.X;
                        } else {
                            xx8Var = str2.equals("core") ? xx8.a : xx8.b;
                        }
                        return x1p1.t(x1p1.C(x1p1.D(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, lhg1Var2, (lhg1) null, (lhg1) null, xx8Var, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1Var2, (String) null, (String) null, (lhg1) null, j8w0.a, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -4457601, 1048575)))), 3);
                    }
                }
