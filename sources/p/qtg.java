package p;

import android.icu.text.DateIntervalFormat;
import android.icu.util.DateInterval;
import android.icu.util.TimeZone;
import android.os.Bundle;
import com.spotify.mobius.Next;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qtg {
    public static final sf9 a = new sf9();
    public static b180 b;
    public static b180 c;

    /* JADX WARN: Code duplicated, block: B:128:0x031e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0323  */
    /* JADX WARN: Code duplicated, block: B:133:0x0337  */
    /* JADX WARN: Code duplicated, block: B:134:0x0339  */
    /* JADX WARN: Code duplicated, block: B:137:0x0341  */
    /* JADX WARN: Code duplicated, block: B:138:0x0343  */
    /* JADX WARN: Code duplicated, block: B:144:0x0354  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:148:0x03af  */
    /* JADX WARN: Code duplicated, block: B:152:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:155:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:160:0x0407  */
    /* JADX WARN: Code duplicated, block: B:192:0x04fc  */
    public static final void a(String str, String str2, String str3, iu30 iu30Var, qim0 qim0Var, String str4, String str5, Function0 function0, Function0 function1, Function0 function2, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        iu30 iu30Var2;
        String str6;
        x340 x340Var;
        String str7;
        String str8;
        m4c m4cVar;
        uwg uwgVar;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objT;
        byte b2;
        boolean z5;
        boolean zI;
        Object objT2;
        Object objT3;
        jax haxVar;
        float f;
        boolean z6;
        gbx gbxVar;
        Function0 function3 = function0;
        Function0 function4 = function2;
        boolean z7 = z;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1535767646);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i3 = (x340Var2.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var2.i(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var2.g(str4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= x340Var2.g(str5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= x340Var2.i(function3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= x340Var2.i(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= x340Var2.i(function4) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (x340Var2.h(z7) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i4 | 3504;
        if (x340Var2.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 1171) == 1170) ? false : true)) {
            y7e1 y7e1VarD = c4p1.D(0, 3, null, x340Var2);
            Object[] objArr = new Object[0];
            Object objT4 = x340Var2.T();
            m4c m4cVar2 = fkj0.X;
            if (objT4 == m4cVar2) {
                objT4 = cu9.Q0;
                x340Var2.s0(objT4);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT4, x340Var2, 48);
            Object objT5 = x340Var2.T();
            if (objT5 == m4cVar2) {
                objT5 = yv91.a(new tr1(y7e1VarD, (byte) 11));
                x340Var2.s0(objT5);
            }
            tob1 tob1Var = (tob1) objT5;
            boolean zI2 = ((234881024 & i3) == 67108864) | x340Var2.i(y7e1VarD);
            Object objT6 = x340Var2.T();
            if (zI2 || objT6 == m4cVar2) {
                objT6 = new cfb(function1, y7e1VarD, (lnm) null);
                x340Var2.s0(objT6);
            }
            qxd0.s(y7e1VarD, function1, (vu30) objT6, x340Var2);
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var2).a.c, d4o1.a);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, l6o1.H(voo1.y(too1.j(qim0VarF, lhc.g(x340Var2).g), voo1.f), l6o1.C(0, 0, 1, x340Var2), false, 14));
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var2, 0);
            int i6 = i3;
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z8 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z8) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            nim0 nim0Var = nim0.a;
            uwo1.e(str, ab80.o(nim0Var, 16.0f, x340Var2, nim0Var, 1.0f), cbx.d(x340Var2).h, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, i6 & 14, 0, 2024);
            op71.g(x340Var2, u291.h(nim0Var, 24.0f));
            qim0 qim0VarX = u291.x(0.0f, 678.0f, 1, nim0Var);
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            uwo1.e(str2, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).e, 0L, null, null, 0, false, null, 0, null, x340Var2, (i6 >> 3) & 14, 0, 2040);
            op71.g(x340Var2, u291.h(nim0Var, 8.0f));
            fyx fyxVarV = sok.v(x340Var2);
            kua0 kua0Var = new kua0(0, (Boolean) null, 7, 7, 115);
            int i7 = i6 & 7168;
            boolean zI3 = x340Var2.i(tob1Var) | (i7 == 2048) | x340Var2.i(y7e1VarD);
            Object objT7 = x340Var2.T();
            if (zI3) {
                m4cVar = m4cVar2;
            } else {
                if (objT7 != m4cVar) {
                    m4cVar = m4cVar2;
                    iu30Var2 = iu30Var;
                }
                yta0 yta0Var = (yta0) objT7;
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    uwgVar = null;
                } else {
                    uwgVar = uwg.N0;
                }
                qim0 qim0VarN = anm1.N("password_field", u291.f(nim0Var, 1.0f));
                if ((i5 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((1879048192 & i6) == 536870912) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z2 | z3;
                objT = x340Var2.T();
                if (!z4 || objT == m4cVar) {
                    function4 = function2;
                    z7 = z;
                    b2 = 2;
                    objT = new zt2(z7, function4, (byte) 2);
                    x340Var2.s0(objT);
                } else {
                    function4 = function2;
                    z7 = z;
                    b2 = 2;
                }
                rwo1.a(y7e1VarD, fyxVarV, s161.b(qim0VarN, false, (iu30) objT), null, null, null, apo.r(1391742974, new xd2(ven0Var, b2), x340Var2), false, null, null, kua0Var, yta0Var, d6e1.b, null, null, uwgVar, null, null, 0.0f, false, x340Var2, 1572864, 0, 0, 2017208);
                op71.g(x340Var2, u291.h(nim0Var, 24.0f));
                if (i7 == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zI = z5 | x340Var2.i(y7e1VarD);
                objT2 = x340Var2.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new efb(iu30Var2, y7e1VarD, (byte) 0);
                    x340Var2.s0(objT2);
                }
                z50 z50Var = z50.c;
                gbx gbxVar2 = new gbx(z50Var, (Function0) objT2);
                idx idxVar = new idx(6);
                qim0 qim0VarN2 = anm1.N("password_primary_button", nim0Var);
                objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = c7b.t;
                    x340Var2.s0(objT3);
                }
                qim0 qim0VarB = s161.b(qim0VarN2, false, (iu30) objT3);
                if (((Boolean) tob1Var.getValue()).booleanValue()) {
                    x340Var2.i0(-197659070);
                    x340Var2.r(false);
                    haxVar = jax.a;
                } else {
                    x340Var2.i0(-197604293);
                    haxVar = new hax(cwl1.o0(x340Var2, 2131954984));
                    x340Var2.r(false);
                }
                str7 = str3;
                foo1.c(gbxVar2, idxVar, qim0VarB, haxVar, null, null, null, null, null, null, apo.r(-2101751405, new j3b(str7, (byte) 6), x340Var2), x340Var2, 0, 48, 2024);
                x340Var = x340Var2;
                if (str4 != null || function0 == null) {
                    str6 = str4;
                    str8 = str5;
                    function3 = function0;
                    f = 16.0f;
                    z6 = false;
                    x340Var.i0(-196710160);
                    x340Var.r(false);
                } else {
                    f = 16.0f;
                    v8i0.i(16.0f, -197252164, x340Var, x340Var, nim0Var);
                    if (str5 != null) {
                        x340Var.i0(-197115485);
                        boolean z9 = (i6 & 29360128) == 8388608;
                        Object objT8 = x340Var.T();
                        if (z9 || objT8 == m4cVar) {
                            function3 = function0;
                            objT8 = new pj8(function3, (byte) 7);
                            x340Var.s0(objT8);
                        } else {
                            function3 = function0;
                        }
                        Function0 function5 = (Function0) objT8;
                        if (ihc1.y0(str5)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return;
                        } else {
                            str8 = str5;
                            gbxVar = new gbx(new y50(str8), function5);
                            x340Var.r(false);
                        }
                    } else {
                        str8 = str5;
                        function3 = function0;
                        x340Var.i0(-197001591);
                        boolean z10 = (i6 & 29360128) == 8388608;
                        Object objT9 = x340Var.T();
                        if (z10 || objT9 == m4cVar) {
                            objT9 = new pj8(function3, (byte) 8);
                            x340Var.s0(objT9);
                        }
                        gbxVar = new gbx(z50Var, (Function0) objT9);
                        x340Var.r(false);
                    }
                    str6 = str4;
                    foo1.c(gbxVar, jdx.c, null, null, yla.s(x340Var), null, null, null, null, null, apo.r(-197401384, new j3b(str6, (byte) 7), x340Var), x340Var, 0, 48, 2012);
                    x340Var = x340Var;
                    z6 = false;
                    x340Var.r(false);
                }
                x340Var.r(true);
                op71.g(x340Var, new wnb0(1.0f, true));
                x340Var.i0(-1042067910);
                x340Var.r(z6);
                op71.g(x340Var, u291.h(nim0Var, f));
                x340Var.r(true);
            }
            m4cVar = m4cVar2;
            iu30Var2 = iu30Var;
            objT7 = new dfb(iu30Var2, y7e1VarD, tob1Var);
            x340Var2.s0(objT7);
            yta0 yta0Var2 = (yta0) objT7;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                uwgVar = null;
            } else {
                uwgVar = uwg.N0;
            }
            qim0 qim0VarN3 = anm1.N("password_field", u291.f(nim0Var, 1.0f));
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((1879048192 & i6) == 536870912) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z2 | z3;
            objT = x340Var2.T();
            if (z4) {
                function4 = function2;
                z7 = z;
                b2 = 2;
                objT = new zt2(z7, function4, (byte) 2);
                x340Var2.s0(objT);
            } else {
                function4 = function2;
                z7 = z;
                b2 = 2;
                objT = new zt2(z7, function4, (byte) 2);
                x340Var2.s0(objT);
            }
            rwo1.a(y7e1VarD, fyxVarV, s161.b(qim0VarN3, false, (iu30) objT), null, null, null, apo.r(1391742974, new xd2(ven0Var, b2), x340Var2), false, null, null, kua0Var, yta0Var2, d6e1.b, null, null, uwgVar, null, null, 0.0f, false, x340Var2, 1572864, 0, 0, 2017208);
            op71.g(x340Var2, u291.h(nim0Var, 24.0f));
            if (i7 == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            zI = z5 | x340Var2.i(y7e1VarD);
            objT2 = x340Var2.T();
            if (zI) {
                objT2 = new efb(iu30Var2, y7e1VarD, (byte) 0);
                x340Var2.s0(objT2);
            } else {
                objT2 = new efb(iu30Var2, y7e1VarD, (byte) 0);
                x340Var2.s0(objT2);
            }
            z50 z50Var2 = z50.c;
            gbx gbxVar3 = new gbx(z50Var2, (Function0) objT2);
            idx idxVar2 = new idx(6);
            qim0 qim0VarN4 = anm1.N("password_primary_button", nim0Var);
            objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = c7b.t;
                x340Var2.s0(objT3);
            }
            qim0 qim0VarB2 = s161.b(qim0VarN4, false, (iu30) objT3);
            if (((Boolean) tob1Var.getValue()).booleanValue()) {
                x340Var2.i0(-197659070);
                x340Var2.r(false);
                haxVar = jax.a;
            } else {
                x340Var2.i0(-197604293);
                haxVar = new hax(cwl1.o0(x340Var2, 2131954984));
                x340Var2.r(false);
            }
            str7 = str3;
            foo1.c(gbxVar3, idxVar2, qim0VarB2, haxVar, null, null, null, null, null, null, apo.r(-2101751405, new j3b(str7, (byte) 6), x340Var2), x340Var2, 0, 48, 2024);
            x340Var = x340Var2;
            if (str4 != null) {
                str6 = str4;
                str8 = str5;
                function3 = function0;
                f = 16.0f;
                z6 = false;
                x340Var.i0(-196710160);
                x340Var.r(false);
            } else {
                str6 = str4;
                str8 = str5;
                function3 = function0;
                f = 16.0f;
                z6 = false;
                x340Var.i0(-196710160);
                x340Var.r(false);
            }
            x340Var.r(true);
            op71.g(x340Var, new wnb0(1.0f, true));
            x340Var.i0(-1042067910);
            x340Var.r(z6);
            op71.g(x340Var, u291.h(nim0Var, f));
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var;
            str6 = str4;
            x340Var = x340Var2;
            str7 = str3;
            str8 = str5;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffb(str, str2, str7, iu30Var2, qim0Var, str6, str8, function3, function1, function4, z7, i, i2);
        }
    }

    public static final void b(Function0 function0, b0k b0kVar, int i) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-210478189);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            function1 = function0;
            mqo1.e(function1, new i3u(4, true, true, false), null, gji.a, gji.b, apo.r(1363674005, new bvk(function0, (byte) 17), x340Var), null, x340Var, (i2 & 14) | 224256, 68);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvk(function1, i, (byte) 18);
        }
    }

    public static final void c(Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-900558672);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(function1) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0Var2 = nim0.a;
            j82.s(function1, qim0Var2, (vu30) null, (vu30) null, (r891) null, (bke1) null, apo.r(846109784, new h621(function0, (byte) 11), x340Var), x340Var, ((i2 >> 3) & 14) | 1572912, 60);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yv60(function0, function1, qim0Var2, i, (byte) 3);
        }
    }

    public static final void d(String str, vy71 vy71Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1200899020);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(vy71Var) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            dem0.a(function0, qim0Var3, vy71Var, 0.0f, false, (hw61) null, 0L, 0L, 0.0f, 0L, (vu30) null, (vu30) null, (eem0) null, apo.r(476439342, new iww0(str, (byte) 8), b0kVar3), b0kVar2, ((i2 >> 6) & 126) | ((i2 << 3) & 896), 3072, 8184);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pby0(i, str, vy71Var, function0, qim0Var2, (byte) 18);
        }
    }

    public static final void e(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1080911676);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            bzn1.e(qim0VarF, apo.r(-315795996, new zsd1(str, (byte) 5), x340Var), false, null, new qgr0(cbx.a(x340Var).a.c), null, null, null, x340Var, 48, 236);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var, i, (byte) 25);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.fra */
    public static final void f(z7l1 z7l1Var, l6k1 l6k1Var, Function0 function0, Function0 function1, Function0 function2, ksw kswVar, iac0 iac0Var, qim0 qim0Var, b0k b0kVar, int i) throws fra {
        int i2;
        ksw kswVar2;
        Function0 function3;
        x340 x340Var;
        qim0 qim0Var2;
        ven0 ven0VarI;
        x340 x340Var2;
        boolean z;
        boolean z2;
        int i3;
        rih1 rih1Var;
        boolean z3;
        fra fraVar;
        xtb0 xtb0Var;
        e4y e4yVar = e4y.Z0;
        Object obj = fkj0.X;
        y7l1 y7l1Var = z7l1Var.a;
        Object obj2 = y7l1Var.b;
        boolean z4 = y7l1Var.c;
        x7l1 x7l1Var = y7l1Var.a;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(-219654202);
        if ((i & 6) == 0) {
            i2 = (x340Var3.i(z7l1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var3.g(l6k1Var) : x340Var3.i(l6k1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var3.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var3.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var3.i(function2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= x340Var3.g(kswVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var3.i(iac0Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= (i & 16777216) == 0 ? x340Var3.g(e4yVar) : x340Var3.i(e4yVar) ? 8388608 : 4194304;
        }
        int i4 = 100663296 | i2;
        if (x340Var3.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            Object objT = x340Var3.T();
            if (objT == obj) {
                objT = new a9l1();
                x340Var3.s0(objT);
            }
            a9l1 a9l1Var = (a9l1) objT;
            Object objT2 = x340Var3.T();
            if (objT2 == obj) {
                List list = x7l1Var.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((w7l1) it.next()).f);
                }
                objT2 = new lvd(arrayList);
                x340Var3.s0(objT2);
            }
            lvd lvdVar = (lvd) objT2;
            xtb0 xtb0VarA = aub0.a(0, x340Var3, 3);
            boolean zG = x340Var3.g(x7l1Var.a);
            Object objT3 = x340Var3.T();
            if (zG || objT3 == obj) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var3.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            boolean zG2 = x340Var3.g(x7l1Var.a);
            Object objT4 = x340Var3.T();
            if (zG2 || objT4 == obj) {
                abu0 abu0Var = (abu0) function1.invoke();
                objT4 = abu0Var != null ? abu0Var.e(x7l1Var.a, true) : null;
                x340Var3.s0(objT4);
            }
            zau0 zau0Var = (zau0) objT4;
            bpb1 bpb1Var = zau0Var != null ? zau0Var.b : null;
            if (bpb1Var == null) {
                x340Var3.i0(1812990970);
                x340Var3.r(false);
                x340Var2 = x340Var3;
                ven0VarI = null;
            } else {
                x340Var3.i0(-634253081);
                bpb1 bpb1Var2 = bpb1Var;
                ven0VarI = f4p1.i(bpb1Var2, bpb1Var2.getValue(), iac0Var.getLifecycle(), w8c0.d, o6x.a, x340Var3, 0);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            }
            if (ven0VarI == null) {
                x340Var2.i0(1813064410);
                Object objT5 = x340Var2.T();
                if (objT5 == obj) {
                    objT5 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT5);
                }
                ven0VarI = (ven0) objT5;
                z = false;
            } else {
                z = false;
                x340Var2.i0(-634253688);
            }
            x340Var2.r(z);
            ven0 ven0Var2 = ven0VarI;
            boolean zG3 = x340Var2.g(x7l1Var.b);
            Object objT6 = x340Var2.T();
            if (zG3 || objT6 == obj) {
                List list2 = x7l1Var.b;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        } else if (((w7l1) it2.next()).a.b.c) {
                            z2 = true;
                            break;
                        }
                    }
                } else {
                    z2 = false;
                    break;
                }
                objT6 = Boolean.valueOf(z2);
                x340Var2.s0(objT6);
            }
            if (((Boolean) objT6).booleanValue()) {
                x340Var2.i0(1813276264);
                tl7 tl7Var = (tl7) function2.invoke();
                String str = x7l1Var.a;
                int i5 = i4 & 7168;
                i3 = i4;
                boolean zG4 = x340Var2.g(ven0Var) | x340Var2.i(zau0Var) | (i5 == 2048);
                Object objT7 = x340Var2.T();
                if (zG4 || objT7 == obj) {
                    objT7 = new jlm(zau0Var, ven0Var, function1, (byte) 4);
                    x340Var2.s0(objT7);
                }
                Function0 function4 = (Function0) objT7;
                boolean zG5 = (i5 == 2048) | x340Var2.g(ven0Var) | x340Var2.i(zau0Var);
                Object objT8 = x340Var2.T();
                if (zG5 || objT8 == obj) {
                    objT8 = new o8e1(zau0Var, ven0Var, function1, (byte) 27);
                    x340Var2.s0(objT8);
                }
                x340 x340Var4 = x340Var2;
                kswVar2 = kswVar;
                i1o1.b(kswVar2, tl7Var, str, function4, (Function0) objT8, x340Var4, (i3 >> 15) & 14, 0);
                x340Var2 = x340Var4;
                x340Var2.r(false);
            } else {
                i3 = i4;
                kswVar2 = kswVar;
                x340Var2.i0(1813664508);
                x340Var2.r(false);
            }
            Object objT9 = x340Var2.T();
            if (objT9 == obj) {
                objT9 = new d8l1(zau0Var, ven0Var, function1);
                x340Var2.s0(objT9);
            }
            d8l1 d8l1Var = (d8l1) objT9;
            boolean zI = x340Var2.i(iac0Var);
            Object objT10 = x340Var2.T();
            if (zI || objT10 == obj) {
                objT10 = new t6j1(iac0Var, d8l1Var, (lnm) null, (byte) 18);
                x340Var2.s0(objT10);
            }
            qxd0.t(d8l1Var, x340Var2, (vu30) objT10);
            boolean zI2 = x340Var2.i(iac0Var);
            Object objT11 = x340Var2.T();
            if (zI2 || objT11 == obj) {
                objT11 = new hij1(iac0Var, d8l1Var, (byte) 20);
                x340Var2.s0(objT11);
            }
            qxd0.i(iac0Var, (iu30) objT11, x340Var2);
            Object objT12 = x340Var2.T();
            if (objT12 == obj) {
                objT12 = v8r.q(fg91.b);
                x340Var2.s0(objT12);
            }
            ven0 ven0Var3 = (ven0) objT12;
            Object objT13 = x340Var2.T();
            if (objT13 == obj) {
                objT13 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT13);
            }
            ven0 ven0Var4 = (ven0) objT13;
            if (zau0Var != null) {
                Boolean bool = (Boolean) ven0Var2.getValue();
                bool.getClass();
                ven0Var4.setValue(bool);
                rih1Var = rih1.a;
            } else {
                rih1Var = null;
            }
            if (rih1Var == null) {
                x340Var2.i0(-634203058);
                Object objT14 = x340Var2.T();
                if (objT14 == obj) {
                    objT14 = new i2g1(ven0Var4, (byte) 18);
                    x340Var2.s0(objT14);
                }
                n9p1.e(kswVar2, (iu30) objT14, x340Var2, ((i3 >> 15) & 14) | 48);
                z3 = false;
            } else {
                z3 = false;
                x340Var2.i0(-634205755);
            }
            x340Var2.r(z3);
            c9 c9VarF = mqo1.F(x7l1Var.b);
            int iB = c9VarF.b();
            boolean zD = x340Var2.d(0.9f) | x340Var2.g(xtb0VarA) | x340Var2.g(c9VarF) | x340Var2.e(iB);
            Object objT15 = x340Var2.T();
            if (zD || objT15 == obj) {
                objT15 = yv91.a(new ynd1(iB, xtb0VarA, c9VarF, (byte) 4));
                x340Var2.s0(objT15);
            }
            List list3 = (List) ((tob1) objT15).getValue();
            List list4 = x7l1Var.b;
            boolean zI3 = x340Var2.i(lvdVar) | x340Var2.i(z7l1Var);
            Object objT16 = x340Var2.T();
            if (zI3 || objT16 == obj) {
                fraVar = null;
                objT16 = new t6j1(lvdVar, z7l1Var, (lnm) null, (byte) 19);
                x340Var2.s0(objT16);
            } else {
                fraVar = null;
            }
            qxd0.t(list4, x340Var2, (vu30) objT16);
            Boolean boolValueOf = Boolean.valueOf(xtb0VarA.j.b());
            boolean zG6 = x340Var2.g(xtb0VarA) | x340Var2.g(list3);
            Object objT17 = x340Var2.T();
            if (zG6 || objT17 == obj) {
                xtb0Var = xtb0VarA;
                objT17 = new mxj1(xtb0Var, list3, ven0Var3, fraVar, (byte) 3);
                x340Var2.s0(objT17);
            } else {
                xtb0Var = xtb0VarA;
            }
            qxd0.s(boolValueOf, list3, (vu30) objT17, x340Var2);
            boolean zG7 = x340Var2.g(x7l1Var.b) | x340Var2.h(z4);
            Object objT18 = x340Var2.T();
            if (zG7 || objT18 == obj) {
                objT18 = (!z4 || x7l1Var.b.isEmpty()) ? new bs3() : new fz81(((w7l1) o7h.A0(x7l1Var.b)).f);
                x340Var2.s0(objT18);
            }
            gj90 gj90Var = (gj90) objT18;
            boolean zBooleanValue = ((Boolean) ven0Var4.getValue()).booleanValue();
            c9 c9Var = (c9) ven0Var3.getValue();
            boolean zI4 = x340Var2.i(lvdVar);
            Object objT19 = x340Var2.T();
            if (zI4 || objT19 == obj) {
                objT19 = new fak1(lvdVar, (byte) 8);
                x340Var2.s0(objT19);
            }
            x340 x340Var5 = x340Var2;
            ljo1.l(zBooleanValue, c9Var, gj90Var, (vu30) objT19, x340Var5, 0);
            float fM0 = ((wat) x340Var5.k(t4k.h)).M0(y7l1Var.f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var3, 1.0f), fraVar, 3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var5, 0);
            int iHashCode = Long.hashCode(x340Var5.T);
            xos0 xos0VarM = x340Var5.m();
            qim0 qim0VarE = zr7.E(x340Var5, qim0VarZ);
            hzj.A.getClass();
            if (x340Var5.a == null) {
                tgp1.p();
                throw fraVar;
            }
            x340Var5.m0();
            if (x340Var5.S) {
                x340Var5.l(hmb0.t1);
            } else {
                x340Var5.v0();
            }
            nko1.H(mbhVarA, x340Var5, y580.O0);
            nko1.H(xos0VarM, x340Var5, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
            nko1.F(x340Var5);
            nko1.H(qim0VarE, x340Var5, y580.Y);
            if (obj2 == null || function0 == null) {
                function3 = function0;
                x340Var5.i0(872681158);
                x340Var5.r(false);
            } else {
                x340Var5.i0(872461089);
                function3 = function0;
                ggo1.d(obj2, function3, uyn1.z(fM0, 0.0f, 2, qim0Var3), x340Var5, (i3 >> 3) & 112);
                x340Var5.r(false);
            }
            w2g0.c(u291.f(qim0Var3, 1.0f), (tl3) null, apo.r(1570347922, new vz2(fM0, z7l1Var, xtb0Var, l6k1Var, lvdVar, iac0Var, a9l1Var, zau0Var), x340Var5), x340Var5, 3078, 6);
            x340Var = x340Var5;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            kswVar2 = kswVar;
            function3 = function0;
            x340Var = x340Var3;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(z7l1Var, l6k1Var, function3, function1, function2, kswVar2, iac0Var, qim0Var2, i, (byte) 16);
        }
    }

    public static final boolean g(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    public static final void h(ven0 ven0Var) {
        ven0Var.setValue(Boolean.TRUE);
    }

    public static final String i(ydk ydkVar) {
        h7r h7rVar;
        h7r h7rVar2;
        if (ydkVar == null || (h7rVar = ydkVar.b) == null || (h7rVar2 = ydkVar.c) == null) {
            return "";
        }
        try {
            Locale localeForLanguageTag = Locale.forLanguageTag(upn1.p());
            String str = h7rVar.a;
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
            LocalDateTime localDateTime = LocalDateTime.parse(str, dateTimeFormatter);
            ZoneOffset zoneOffset = ZoneOffset.UTC;
            long epochMilli = localDateTime.atOffset(zoneOffset).plusMinutes(h7rVar.b).toInstant().toEpochMilli();
            long epochMilli2 = LocalDateTime.parse(h7rVar2.a, dateTimeFormatter).atOffset(zoneOffset).plusMinutes(h7rVar2.b).toInstant().toEpochMilli();
            DateIntervalFormat dateIntervalFormat = DateIntervalFormat.getInstance("yMMM", localeForLanguageTag);
            dateIntervalFormat.setTimeZone(TimeZone.GMT_ZONE);
            String str2 = dateIntervalFormat.format(new DateInterval(epochMilli, epochMilli2));
            str2.getClass();
            return str2;
        } catch (DateTimeParseException unused) {
            return "";
        }
    }

    public static juk0 j(r6h1 r6h1Var) {
        return new juk0(r6h1Var);
    }

    public static Bundle o(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    public static Next p(kak0 kak0Var, o2k0 o2k0Var) {
        return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, giq0.a, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -1, 1048574), Collections.singleton(new q0k0(o2k0Var.a, false)));
    }

    public static final ot2 q(String str, ot2 ot2Var) {
        if (str == null) {
            return ot2Var;
        }
        if (ot2Var == null) {
            ot2Var = new ot2((String) null, (String) null, (String) null, (Integer) null, (Boolean) null, 63);
        }
        return new ot2(ot2Var.a, ot2Var.b, ot2Var.c, ot2Var.d, ot2Var.e, str);
    }

    public abstract WeakReference k();

    public abstract w4f1 l();

    public abstract wnw0 m();

    public abstract gmc n();
}
