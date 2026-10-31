package p;

import android.content.res.Resources;
import android.text.SpannableString;
import android.text.util.Linkify;
import androidx.car.app.model.CarIcon;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import j$.time.Instant;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class lnn1 {
    public static final m a = new m((byte) 21);
    public static b180 b;

    public static final void a(ro30 ro30Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1064032744);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ro30Var) : x340Var.i(ro30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ujo1.c(l6o1.C(0, 0, 1, x340Var), t3k1.t(v850.a), apo.r(-787333795, new xh00(iu30Var, ro30Var), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(ro30Var, iu30Var, i, (byte) 21);
        }
    }

    public static final void b(vzq0 vzq0Var, umf0 umf0Var, String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1360979113);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(vzq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(umf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarW = uyn1.w(nim0Var, vzq0Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
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
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            int i3 = (i2 >> 3) & 14;
            otw.c(umf0Var, new o7g0(str, iyr0.a), (qim0) null, (ipb1) null, x340Var, i3, 12);
            otw.c(umf0Var, new o7g0(str, iyr0.b), (qim0) null, (ipb1) null, x340Var, i3, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0((Object) vzq0Var, (Object) umf0Var, (Object) str, i, (byte) 15);
        }
    }

    public static final void c(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1656524004);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new zg20(function0, (byte) 25);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx(4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            foo1.c(gbxVar, idxVar, anm1.N("graduation_supervision_button_test_tag", uyn1.B(qim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13)), null, null, null, null, null, null, null, tqi.a, x340Var, 0, 48, 2040);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb50(qim0Var, function0, i, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:279:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:610:0x0bde A[PHI: r1
      0x0bde: PHI (r1v66 p.xz7) = (r1v65 p.xz7), (r1v68 p.xz7), (r1v68 p.xz7) binds: [B:612:0x0be2, B:606:0x0bd5, B:608:0x0bd9] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void d(float f, Integer num, mt71 mt71Var, qim0 qim0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, f08 f08Var, xz7 xz7Var, g08 g08Var, pk1 pk1Var, Function0 function0, Function0 function1, iu30 iu30Var, boolean z8, iu30 iu30Var2, Function0 function2, Function0 function3, d08 d08Var, hp80 hp80Var, String str2, boolean z9, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z10;
        int i4;
        boolean z11;
        int i5;
        boolean z12;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        x340 x340Var;
        qim0 qim0Var2;
        boolean z13;
        boolean z14;
        boolean z15;
        String str3;
        g08 g08Var2;
        pk1 pk1Var2;
        Function0 function4;
        Function0 function5;
        iu30 iu30Var3;
        Function0 function6;
        Function0 function7;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        f08 f08Var2;
        xz7 xz7Var2;
        boolean z20;
        g08 g08Var3;
        pk1 pk1Var3;
        Function0 function8;
        Function0 function9;
        iu30 iu30Var4;
        Function0 function10;
        Function0 function11;
        boolean z21;
        iu30 iu30Var5;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        String str4;
        xz7 xz7Var3;
        Function0 function12;
        Function0 function13;
        Function0 function14;
        qim0 qim0Var3;
        Function0 function15;
        f08 f08Var3;
        p3g p3gVar;
        Function0 function16;
        Function0 function17;
        o95 o95Var;
        int i21;
        Object obj;
        Function0 function18;
        d08 d08Var2;
        iu30 iu30Var6;
        int i22;
        boolean z26;
        long j;
        String str5;
        String str6;
        String str7;
        boolean z27;
        qam1 qam1Var;
        c08 c08Var;
        Function0 function19;
        qim0 qim0VarA;
        boolean z28;
        boolean z29;
        String str8;
        Function0 function20;
        xz7 xz7Var4;
        g08 g08Var4;
        pk1 pk1Var4;
        xz7 xz7Var5;
        String str9;
        boolean z30;
        dg dgVar;
        Map map;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1247475423);
        int i23 = i | (x340Var2.d(f) ? 4 : 2) | (x340Var2.g(num) ? 32 : 16) | (x340Var2.i(mt71Var) ? 256 : 128);
        int i24 = i23 | 3072;
        int i25 = i2 & 16;
        if (i25 != 0) {
            i3 = i23 | 27648;
        } else {
            i3 = i24 | (x340Var2.h(z) ? 16384 : 8192);
        }
        int i26 = i2 & 32;
        if (i26 != 0) {
            i4 = i3 | 196608;
            z10 = z2;
        } else {
            z10 = z2;
            i4 = i3 | (x340Var2.h(z10) ? 131072 : 65536);
        }
        int i27 = i2 & 64;
        if (i27 != 0) {
            i5 = i4 | 1572864;
            z11 = z3;
        } else {
            z11 = z3;
            i5 = i4 | (x340Var2.h(z11) ? 1048576 : 524288);
        }
        int i28 = i2 & 128;
        if (i28 != 0) {
            i7 = i5 | 12582912;
            z12 = z4;
            i6 = 131072;
        } else {
            z12 = z4;
            i6 = 131072;
            i7 = i5 | (x340Var2.h(z12) ? 8388608 : 4194304);
        }
        int i29 = i2 & 256;
        if (i29 != 0) {
            i8 = i7 | 100663296;
        } else {
            i8 = i7 | (x340Var2.h(z5) ? 67108864 : 33554432);
        }
        int i30 = i2 & 512;
        if (i30 != 0) {
            i9 = i8 | 805306368;
        } else {
            i9 = i8 | (x340Var2.h(z6) ? 536870912 : 268435456);
        }
        int i31 = i2 & 1024;
        if (i31 != 0) {
            i11 = 6;
            i10 = i31;
        } else {
            i10 = i31;
            i11 = x340Var2.h(z7) ? 4 : 2;
        }
        int i32 = i2 & 2048;
        if (i32 != 0) {
            i12 = i11 | 48;
        } else {
            i12 = i11 | (x340Var2.g(str) ? 32 : 16);
        }
        int i33 = i12;
        int i34 = i2 & 4096;
        if (i34 != 0) {
            i13 = i33 | 384;
        } else {
            i13 = i33 | (x340Var2.g(f08Var) ? 256 : 128);
        }
        int i35 = i2 & 8192;
        if (i35 != 0) {
            i14 = i13 | 3072;
        } else {
            i14 = i13 | (x340Var2.g(xz7Var) ? 2048 : 1024);
        }
        int i36 = i2 & 16384;
        if (i36 != 0) {
            i15 = i14 | 24576;
        } else {
            i15 = i14 | (x340Var2.g(g08Var) ? 16384 : 8192);
        }
        int i37 = i15 | (((i2 & 32768) == 0 && x340Var2.g(pk1Var)) ? i6 : 65536);
        int i38 = i2 & 65536;
        if (i38 != 0) {
            i16 = i37 | 1572864;
        } else {
            i16 = i37 | (x340Var2.i(function0) ? 1048576 : 524288);
        }
        int i39 = i2 & i6;
        if (i39 != 0) {
            i17 = i16 | 12582912;
        } else {
            i17 = i16 | (x340Var2.i(function1) ? 8388608 : 4194304);
        }
        int i40 = i2 & 262144;
        if (i40 != 0) {
            i18 = i17 | 100663296;
        } else {
            i18 = i17 | (x340Var2.i(iu30Var) ? 67108864 : 33554432);
        }
        int i41 = i18 | (x340Var2.h(z8) ? 536870912 : 268435456);
        int i42 = x340Var2.i(iu30Var2) ? 4 : 2;
        int i43 = i2 & 2097152;
        if (i43 != 0) {
            i19 = i42 | 48;
        } else {
            i19 = i42 | (x340Var2.i(function2) ? 32 : 16);
        }
        int i44 = i19;
        int i45 = i2 & 4194304;
        if (i45 != 0) {
            i20 = i44 | 384;
        } else {
            i20 = i44 | (x340Var2.i(function3) ? 256 : 128);
        }
        int i46 = i20 | (x340Var2.i(d08Var) ? 2048 : 1024) | (x340Var2.i(hp80Var) ? 16384 : 8192) | (x340Var2.g(str2) ? i6 : 65536) | (x340Var2.h(z9) ? 1048576 : 524288);
        if (x340Var2.Y(i9 & 1, ((i9 & 306783379) == 306783378 && (i41 & 306783379) == 306783378 && (i46 & 599187) == 599186) ? false : true)) {
            x340Var2.d0();
            int i47 = i & 1;
            qim0 qim0Var4 = nim0.a;
            if (i47 == 0 || x340Var2.E()) {
                boolean z31 = i25 != 0 ? false : z;
                if (i26 != 0) {
                    z10 = false;
                }
                if (i27 != 0) {
                    z11 = false;
                }
                if (i28 != 0) {
                    z12 = false;
                }
                boolean z32 = i29 != 0 ? false : z5;
                boolean z33 = i30 != 0 ? true : z6;
                z20 = i10 != 0 ? false : z7;
                String str10 = i32 != 0 ? null : str;
                f08 f08Var4 = i34 != 0 ? null : f08Var;
                xz7 xz7Var6 = i35 != 0 ? null : xz7Var;
                g08Var3 = i36 != 0 ? null : g08Var;
                if ((i2 & 32768) != 0) {
                    pk1Var3 = new pk1(qk1.a, false, (String) null, (String) null, tk1.c, 14);
                    i41 &= -458753;
                } else {
                    pk1Var3 = pk1Var;
                }
                if (i38 != 0) {
                    Object objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = w3l1.c1;
                        x340Var2.s0(objT);
                    }
                    function8 = (Function0) objT;
                } else {
                    function8 = function0;
                }
                boolean z34 = z31;
                if (i39 != 0) {
                    Object objT2 = x340Var2.T();
                    if (objT2 == m4cVar) {
                        objT2 = w3l1.d1;
                        x340Var2.s0(objT2);
                    }
                    function9 = (Function0) objT2;
                } else {
                    function9 = function1;
                }
                Function0 function21 = function9;
                if (i40 != 0) {
                    Object objT3 = x340Var2.T();
                    if (objT3 == m4cVar) {
                        objT3 = m5m1.d1;
                        x340Var2.s0(objT3);
                    }
                    iu30Var4 = (iu30) objT3;
                } else {
                    iu30Var4 = iu30Var;
                }
                iu30 iu30Var7 = iu30Var4;
                if (i43 != 0) {
                    Object objT4 = x340Var2.T();
                    if (objT4 == m4cVar) {
                        objT4 = w3l1.e1;
                        x340Var2.s0(objT4);
                    }
                    function10 = (Function0) objT4;
                } else {
                    function10 = function2;
                }
                Function0 function22 = function10;
                if (i45 != 0) {
                    Object objT5 = x340Var2.T();
                    if (objT5 == m4cVar) {
                        objT5 = wam1.b;
                        x340Var2.s0(objT5);
                    }
                    function11 = (Function0) objT5;
                } else {
                    function11 = function3;
                }
                z21 = z34;
                iu30Var5 = iu30Var7;
                z22 = z11;
                z23 = z32;
                z24 = z12;
                z25 = z33;
                str4 = str10;
                xz7Var3 = xz7Var6;
                function12 = function21;
                function13 = function22;
                function14 = function11;
                qim0Var3 = qim0Var4;
                function15 = function8;
                f08Var3 = f08Var4;
            } else {
                x340Var2.b0();
                if ((i2 & 32768) != 0) {
                    i41 &= -458753;
                }
                qim0Var3 = qim0Var;
                z21 = z;
                z23 = z5;
                z25 = z6;
                z20 = z7;
                f08Var3 = f08Var;
                g08Var3 = g08Var;
                pk1Var3 = pk1Var;
                function15 = function0;
                function12 = function1;
                iu30Var5 = iu30Var;
                function14 = function3;
                z24 = z12;
                str4 = str;
                xz7Var3 = xz7Var;
                z22 = z11;
                function13 = function2;
            }
            x340Var2.s();
            int i48 = i9;
            Object objT6 = x340Var2.T();
            if (objT6 == m4cVar) {
                objT6 = new q811();
                x340Var2.s0(objT6);
            }
            q811 q811Var = (q811) objT6;
            boolean z35 = z10;
            if (z25 || q811Var.a == null) {
                q811Var.a = mt71Var;
            }
            mt71 mt71Var2 = (mt71) q811Var.a;
            if (mt71Var2 == null) {
                mt71Var2 = mt71Var;
            }
            Object objT7 = x340Var2.T();
            if (objT7 == m4cVar) {
                objT7 = new q811();
                x340Var2.s0(objT7);
            }
            q811 q811Var2 = (q811) objT7;
            boolean z36 = mt71Var2.a() != null;
            Object obj2 = q811Var2.a;
            Function0 function23 = function15;
            Boolean bool = Boolean.TRUE;
            boolean zJ = u890.j(obj2, bool);
            ceo ceoVar = ka5.a;
            p3g p3gVar2 = p3g.a;
            if (z25 || !zJ) {
                p3g p3gVar3 = p3g.b;
                if (z25 && z21 && z36 && (z24 || z23 || zJ)) {
                    p3gVar = p3gVar2;
                } else {
                    p3gVar = p3gVar3;
                }
            } else {
                p3gVar = p3gVar2;
            }
            xz7 xz7Var7 = xz7Var3;
            q811Var2.a = Boolean.valueOf(p3gVar == p3gVar2);
            Object objT8 = x340Var2.T();
            if (objT8 == m4cVar) {
                objT8 = new l4g(p3gVar);
                x340Var2.s0(objT8);
            }
            l4g l4gVar = (l4g) objT8;
            int i49 = i41 & 29360128;
            boolean zE = x340Var2.e(p3gVar.ordinal()) | x340Var2.i(l4gVar) | (i49 == 8388608);
            Object objT9 = x340Var2.T();
            if (zE || objT9 == m4cVar) {
                function16 = function12;
                objT9 = new q4m1(l4gVar, p3gVar, function16, (lnm) null, (byte) 4);
                x340Var2.s0(objT9);
            } else {
                function16 = function12;
            }
            qxd0.t(p3gVar, x340Var2, (vu30) objT9);
            Object objT10 = x340Var2.T();
            if (objT10 == m4cVar) {
                objT10 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT10);
            }
            ven0 ven0Var = (ven0) objT10;
            Object objT11 = x340Var2.T();
            if (objT11 == m4cVar) {
                objT11 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT11);
            }
            ven0 ven0Var2 = (ven0) objT11;
            Object objT12 = x340Var2.T();
            if (objT12 == m4cVar) {
                objT12 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT12);
            }
            ven0 ven0Var3 = (ven0) objT12;
            qim0Var2 = qim0Var3;
            Object objT13 = x340Var2.T();
            if (objT13 == m4cVar) {
                objT13 = v8r.q(bool);
                x340Var2.s0(objT13);
            }
            ven0 ven0Var4 = (ven0) objT13;
            mt71 mt71Var3 = mt71Var2;
            Object objT14 = x340Var2.T();
            f08 f08Var5 = f08Var3;
            if (objT14 == m4cVar) {
                objT14 = c97.b(1.0f);
                x340Var2.s0(objT14);
            }
            o95 o95Var2 = (o95) objT14;
            Boolean boolValueOf = Boolean.valueOf(e(ven0Var));
            boolean zI = x340Var2.i(ven0Var) | x340Var2.i(ven0Var4) | x340Var2.i(ven0Var2) | (i49 == 8388608) | x340Var2.i(o95Var2);
            Object objT15 = x340Var2.T();
            if (zI || objT15 == m4cVar) {
                Function0 function24 = function16;
                objT15 = new qag1(function24, o95Var2, ven0Var, ven0Var4, ven0Var2, (lnm) null);
                function17 = function24;
                o95Var = o95Var2;
                x340Var2.s0(objT15);
            } else {
                function17 = function16;
                o95Var = o95Var2;
            }
            qxd0.t(boolValueOf, x340Var2, (vu30) objT15);
            boolean z37 = ((Boolean) ven0Var.getValue()).booleanValue() || ((Boolean) ven0Var2.getValue()).booleanValue();
            if (p3gVar != p3gVar2) {
                i21 = 1;
            } else {
                i21 = z37 ? 3 : 2;
            }
            int i50 = i46 & 458752;
            p3g p3gVar4 = p3gVar;
            boolean z38 = i50 == i6;
            Object objT16 = x340Var2.T();
            if (z38 || objT16 == m4cVar) {
                e08 e08Var = new e08();
                e08Var.c = 1;
                x340Var2.s0(e08Var);
                obj = e08Var;
            } else {
                obj = objT16;
            }
            e08 e08Var2 = (e08) obj;
            sju sjuVarA = mt71Var3.a();
            String str11 = sjuVarA != null ? sjuVarA.c : null;
            boolean zE2 = (i50 == 131072) | x340Var2.e(l1d.C(i21)) | x340Var2.g(str11);
            Object objT17 = x340Var2.T();
            if (zE2 || objT17 == m4cVar) {
                int iC = l1d.C(i21);
                if (iC != 0) {
                    function18 = function14;
                    if (iC == 1) {
                        if (!e08Var2.b) {
                            e08Var2.b = true;
                            e08Var2.a = str11;
                        } else if (!u890.j(e08Var2.a, str11)) {
                            e08Var2.a = str11;
                            e08Var2.c = 2;
                        }
                        objT17 = new zz7(str11, e08Var2.c);
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return;
                        }
                        objT17 = new a08(str11, z20 ? 1 : 2);
                    }
                } else {
                    function18 = function14;
                    objT17 = b08.a;
                }
                x340Var2.s0(objT17);
            } else {
                function18 = function14;
            }
            c08 c08Var2 = (c08) objT17;
            Object[] objArr = {d08Var, hp80Var, str2, Boolean.valueOf(z9), c08Var2};
            boolean zI2 = ((i46 & 3670016) == 1048576) | x340Var2.i(d08Var) | (i50 == 131072) | x340Var2.i(c08Var2) | x340Var2.i(hp80Var);
            Object objT18 = x340Var2.T();
            if (zI2 || objT18 == m4cVar) {
                objT18 = new o96(d08Var, str2, z9, c08Var2, hp80Var, (byte) 15);
                d08Var2 = d08Var;
                x340Var2.s0(objT18);
            } else {
                d08Var2 = d08Var;
            }
            qxd0.j(objArr, (iu30) objT18, x340Var2);
            boolean zI3 = x340Var2.i(ven0Var) | x340Var2.i(c08Var2) | (i50 == 131072) | x340Var2.i(d08Var2) | x340Var2.i(hp80Var);
            Object objT19 = x340Var2.T();
            if (zI3 || objT19 == m4cVar) {
                objT19 = new kbp0(c08Var2, ven0Var, str2, d08Var2, hp80Var, (byte) 22);
                x340Var2.s0(objT19);
            }
            Function0 function25 = (Function0) objT19;
            Object objT20 = x340Var2.T();
            if (objT20 == m4cVar) {
                objT20 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT20);
            }
            ven0 ven0Var5 = (ven0) objT20;
            Boolean boolValueOf2 = Boolean.valueOf(z8);
            boolean zG = ((i41 & 1879048192) == 536870912) | x340Var2.g(function25) | ((i46 & 14) == 4) | x340Var2.i(ven0Var5);
            Object objT21 = x340Var2.T();
            if (zG || objT21 == m4cVar) {
                objT21 = new q4m1(z8, function25, iu30Var2, ven0Var5, (lnm) null);
                x340Var2.s0(objT21);
            }
            qxd0.t(boolValueOf2, x340Var2, (vu30) objT21);
            boolean zE3 = x340Var2.e(p3gVar4.ordinal()) | x340Var2.i(ven0Var) | x340Var2.i(ven0Var2) | x340Var2.i((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0702: ARITH (r3v25 'zE3' boolean) = (wrap boolean:0x06fd: ARITH (wrap boolean:0x06f8: ARITH (wrap boolean:0x06f3: ARITH (wrap boolean:0x06eb: INVOKE 
                  (r8v1 'x340Var2' p.x340)
                  (wrap int:0x06e7: INVOKE (r41v3 'p3gVar4' p.p3g) VIRTUAL call: java.lang.Enum.ordinal():int A[MD:():int (c), WRAPPED] (LINE:134))
                 VIRTUAL call: p.x340.e(int):boolean A[WRAPPED] (LINE:134)) | (wrap boolean:0x06ef: INVOKE (r8v1 'x340Var2' p.x340), (r13v25 'ven0Var' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) A[DONT_WRAP, WRAPPED] (LINE:134)) | (wrap boolean:0x06f4: INVOKE (r8v1 'x340Var2' p.x340), (r6v8 'ven0Var2' p.ven0) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) A[DONT_WRAP, WRAPPED] (LINE:134)) | (wrap boolean:0x06f9: INVOKE (r8v1 'x340Var2' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r64v3 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) A[DONT_WRAP, WRAPPED] (LINE:134)) | (wrap boolean:0x06fe: INVOKE (r8v1 'x340Var2' p.x340), (r2v71 'o95Var' p.o95) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED]) A[DECLARE_VAR] (LINE:134) in method: p.lnn1.d(float, java.lang.Integer, p.mt71, p.qim0, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, p.f08, p.xz7, p.g08, p.pk1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.iu30, boolean, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.d08, p.hp80, java.lang.String, boolean, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r64v3 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 3518
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.lnn1.d(float, java.lang.Integer, p.mt71, p.qim0, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, p.f08, p.xz7, p.g08, p.pk1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.iu30, boolean, p.iu30, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.d08, p.hp80, java.lang.String, boolean, p.b0k, int, int):void");
        }

        public static final boolean e(ven0 ven0Var) {
            return ((Boolean) ven0Var.getValue()).booleanValue();
        }

        public static n25 f() {
            return new n25(false, false, false, false, false, (feh1) null);
        }

        public static kjv g(iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
            return new kjv(iu30Var3, iu30Var2, (u841) null, iu30Var);
        }

        public static kjv h(iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3) {
            return new kjv(iu30Var3, iu30Var2, (u841) null, iu30Var);
        }

        public static void i(ArrayList arrayList, SpannableString spannableString, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter) {
            boolean z;
            Matcher matcher = pattern.matcher(spannableString);
            while (matcher.find()) {
                int iStart = matcher.start();
                int iEnd = matcher.end();
                String strGroup = matcher.group(0);
                if ((matchFilter == null || matchFilter.acceptMatch(spannableString, iStart, iEnd)) && strGroup != null) {
                    rlc0 rlc0Var = new rlc0();
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            break;
                        }
                        String str = strArr[i];
                        if (strGroup.regionMatches(true, 0, str, 0, str.length())) {
                            z = true;
                            if (!strGroup.regionMatches(false, 0, str, 0, str.length())) {
                                strGroup = str.concat(strGroup.substring(str.length()));
                                break;
                            }
                            break;
                        }
                        i++;
                    }
                    if (!z && strArr.length > 0) {
                        strGroup = l1d.n(strArr[0], strGroup, new StringBuilder());
                    }
                    rlc0Var.b = strGroup;
                    rlc0Var.c = iStart;
                    rlc0Var.d = iEnd;
                    arrayList.add(rlc0Var);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0038  */
        public static final String j(Resources resources, cet0 cet0Var, String str) {
            uft0 uft0Var = cet0Var.b;
            int i = 2131959799;
            if ((!(uft0Var instanceof uft0) || !uft0Var.a) && ((!(uft0Var instanceof vft0) || !((vft0) uft0Var).a) && (!(uft0Var instanceof tft0) || !((tft0) uft0Var).b))) {
                if ((uft0Var instanceof tft0) && ((tft0) uft0Var).c) {
                    i = 2131959798;
                } else if (cet0Var.a) {
                    i = 2131959800;
                } else if ((uft0Var instanceof zft0) && ((zft0) uft0Var).a) {
                    i = 2131959802;
                } else if ((uft0Var instanceof qft0) && ((qft0) uft0Var).b) {
                    i = 2131959798;
                } else if ((!(uft0Var instanceof qft0) || !((qft0) uft0Var).a) && (!(uft0Var instanceof rft0) || !((rft0) uft0Var).a)) {
                    i = 2131959801;
                }
            }
            return resources.getString(i, str);
        }

        public static void k(File file, InputStream inputStream) throws Throwable {
            byte[] bArr = new byte[8192];
            GZIPOutputStream gZIPOutputStream = null;
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i <= 0) {
                            gZIPOutputStream2.finish();
                            eth.l(gZIPOutputStream2);
                            return;
                        }
                        gZIPOutputStream2.write(bArr, 0, i);
                    } catch (Throwable th) {
                        th = th;
                        gZIPOutputStream = gZIPOutputStream2;
                        eth.l(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public static final boolean l(m1b1 m1b1Var) {
            l1b1 l1b1Var = m1b1Var != null ? m1b1Var.a : null;
            k1b1 k1b1Var = l1b1Var instanceof k1b1 ? (k1b1) l1b1Var : null;
            if (k1b1Var == null) {
                return false;
            }
            long epochSecond = Instant.now().getEpochSecond();
            return k1b1Var.a <= epochSecond && epochSecond <= k1b1Var.b;
        }

        public static final boolean m(lhg1 lhg1Var, kkg1 kkg1Var, String str, String str2, Map map, Map map2) {
            if (!kkg1.d(str2, str, lhg1Var)) {
                return false;
            }
            ruq0 ruq0Var = lhg1Var.b;
            return !ruq0Var.O0 || jch0.E(ruq0Var, map, map2);
        }

        public static final hdh n(vzq0 vzq0Var, vzq0 vzq0Var2) {
            return new hdh(vzq0Var, vzq0Var2, e0r0.a);
        }

        public static void o(File file, ArrayList arrayList) {
            String str;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                thc thcVar = (thc) it.next();
                InputStream inputStreamA = null;
                try {
                    inputStreamA = thcVar.a();
                    if (inputStreamA != null) {
                        switch (thcVar.a) {
                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                str = thcVar.c;
                                break;
                            default:
                                str = thcVar.c;
                                break;
                        }
                        k(new File(file, str), inputStreamA);
                    }
                } catch (IOException unused) {
                } finally {
                    eth.l((Closeable) null);
                }
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException */
        public static final String[] p(Metadata metadata) throws InconsistentKotlinMetadataException {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                return strArrD1;
            }
            throw new InconsistentKotlinMetadataException("Metadata is missing: kotlin.Metadata.data1 must not be an empty array", null);
        }

        public static final nsw q(inx0 inx0Var, kly0 kly0Var, qfv qfvVar) {
            return jch0.j(new wmx0(qfvVar, kly0Var, (byte) 0));
        }

        public static final CarIcon r(hvc hvcVar) {
            dp5 dp5Var = sjo0.d;
            if (dp5Var != null) {
                return ((ovc) sqg0.G(hvcVar.getClass(), (gg11) dp5Var.b)).a(hvcVar);
            }
            u890.C("_calImageLoader");
            throw null;
        }

        public static final psw s(h6w h6wVar, gw70 gw70Var, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, idd1 idd1Var4) {
            j2i j2iVar = new j2i(2069588592, new xmx0(gw70Var, idd1Var, idd1Var2, idd1Var3, idd1Var4), true);
            ien0 ien0Var = qsw.a;
            return new psw(j2iVar, (byte) 0);
        }

        public static void t() {
            bpb1 bpb1Var = fk41.b;
            Boolean bool = Boolean.FALSE;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, bool);
        }
    }
