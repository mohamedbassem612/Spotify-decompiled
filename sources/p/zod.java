package p;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.spotify.collection.downloaded.service.OffliningService;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class zod {
    public static volatile int a;
    public static final Object b = new Object();
    public static final lac c = new lac();
    public static b180 d;
    public static b180 e;

    public static final String A(uwz0 uwz0Var) {
        if (uwz0Var instanceof swz0) {
            return "none";
        }
        if (!(uwz0Var instanceof twz0)) {
            eg.o();
            return null;
        }
        Set set = ((twz0) uwz0Var).a;
        if (set == null) {
            return "unknown";
        }
        Set set2 = w7x.a;
        if ((set == null ? set2 : set).contains(a7o0.b)) {
            return "cellular";
        }
        if (set == null) {
            set = set2;
        }
        return set.contains(a7o0.a) ? "wlan" : "unknown";
    }

    public static int B() {
        synchronized (b) {
            try {
                if (a == 0) {
                    a = H();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public static final String C(m0u0 m0u0Var) {
        return (String) m0u0Var.a.d.get("betamax_override_feature_identifier");
    }

    public static final String D(hoh0 hoh0Var) {
        String str = (String) hoh0Var.b().get("playback_id");
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return hoh0Var.c();
    }

    public static fql0 E(String str) {
        return new fql0(str);
    }

    public static final ie5 F(Float f, boolean z, zfv zfvVar, b0k b0kVar, int i) {
        Float f2;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = new o95(f, rno1.a, (Object) null, 12);
            x340Var.s0(objT);
        }
        o95 o95Var = (o95) objT;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zI = ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && x340Var.h(z)) || (i & 48) == 32) | x340Var.i(o95Var) | ((((i & 14) ^ 6) > 4 && x340Var.i(f)) || (i & 6) == 4) | x340Var.i(zfvVar);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            f2 = f;
            objT2 = new du2(z, o95Var, f2, zfvVar, (lnm) null, (byte) 3);
            x340Var.s0(objT2);
        } else {
            f2 = f;
        }
        qxd0.s(f2, boolValueOf, (vu30) objT2, x340Var);
        return o95Var.c;
    }

    public static final Object G(Object obj, boolean z, tzg1 tzg1Var, zfv zfvVar, b0k b0kVar, int i) {
        Object obj2;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = new o95(obj, tzg1Var, (Object) null, 12);
            x340Var.s0(objT);
        }
        o95 o95Var = (o95) objT;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zI = ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && x340Var.h(z)) || (i & 48) == 32) | x340Var.i(o95Var) | ((((i & 14) ^ 6) > 4 && x340Var.i(obj)) || (i & 6) == 4) | x340Var.i(zfvVar);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            obj2 = obj;
            du2 du2Var = new du2(z, o95Var, obj2, zfvVar, (lnm) null);
            x340Var.s0(du2Var);
            objT2 = du2Var;
        } else {
            obj2 = obj;
        }
        qxd0.s(obj2, boolValueOf, (vu30) objT2, x340Var);
        return o95Var.e();
    }

    public static int H() {
        ClassLoader classLoader = zod.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
        if (resourceAsStream == null) {
            eg.m("Car API level file car-app-api.level not found");
            return 0;
        }
        try {
            String line = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
            int i = Integer.parseInt(line);
            if (i >= 1 && i <= 9) {
                return i;
            }
            throw new IllegalStateException("Unrecognized Car API level: " + line);
        } catch (IOException unused) {
            eg.m("Unable to read Car API level file");
            return 0;
        }
    }

    public static final int I(int i, rhc rhcVar) {
        return i == -1234567890 ? rhcVar.d() : i;
    }

    public static final int J(byte[] bArr, int i) {
        return i == -1234567890 ? bArr.length : i;
    }

    public static final lac K(lac lacVar) {
        return lacVar == c ? new lac() : lacVar;
    }

    public static final md80 L(ArrayList arrayList, at80 at80Var) {
        int iOrdinal = at80Var.ordinal();
        jj8 jj8Var = jj8.f;
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            md80 md80Var = md80.c;
            if (!arrayList.contains(jj8.a)) {
                md80Var = null;
            }
            if (md80Var == null) {
                md80Var = md80.b;
                if (arrayList.contains(jj8Var)) {
                }
            }
            return md80Var;
        }
        md80 md80Var2 = md80.b;
        if (arrayList.contains(jj8Var)) {
            return md80Var2;
        }
        return null;
    }

    public static final int M(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static final long N(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final short O(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public static final ven0 P(c380 c380Var, boolean z, String str, Function0 function0, Function0 function1, b0k b0kVar, int i, int i2) {
        Function0 function2;
        Function0 function3;
        m4c m4cVar = fkj0.X;
        boolean z2 = (i2 & 2) != 0 ? false : z;
        String str2 = (i2 & 4) != 0 ? null : str;
        if ((i2 & 8) != 0) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = fki.h;
                x340Var.s0(objT);
            }
            function2 = (Function0) objT;
        } else {
            function2 = function0;
        }
        if ((i2 & 16) != 0) {
            x340 x340Var2 = (x340) b0kVar;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = fki.i;
                x340Var2.s0(objT2);
            }
            function3 = (Function0) objT2;
        } else {
            function3 = function1;
        }
        if (c380Var.isEmpty()) {
            eg.m("valueAnimations can not be empty");
            return null;
        }
        int i3 = (i & 896) ^ 384;
        boolean z3 = (i3 > 256 && ((x340) b0kVar).g(str2)) || (i & 384) == 256;
        x340 x340Var3 = (x340) b0kVar;
        Object objT3 = x340Var3.T();
        if (z3 || objT3 == m4cVar) {
            objT3 = bb00.h(0, x340Var3);
        }
        err0 err0Var = (hdn0) objT3;
        err0 err0Var2 = err0Var;
        boolean zE = ((i3 > 256 && x340Var3.g(str2)) || (i & 384) == 256) | x340Var3.e(err0Var2.s());
        Object objT4 = x340Var3.T();
        if (zE || objT4 == m4cVar) {
            objT4 = v8r.q(c380Var.get(err0Var2.s()));
            x340Var3.s0(objT4);
        }
        hsi1 hsi1Var = (hsi1) ((ven0) objT4).getValue();
        boolean zI = ((((57344 & i) ^ 24576) > 16384 && x340Var3.g(function3)) || (i & 24576) == 16384) | ((((i & 7168) ^ 3072) > 2048 && x340Var3.g(function2)) || (i & 3072) == 2048) | x340Var3.i(err0Var) | x340Var3.i(c380Var);
        Object objT5 = x340Var3.T();
        if (zI || objT5 == m4cVar) {
            f80 f80Var = new f80(function2, c380Var, function3, err0Var, (byte) 21);
            x340Var3.s0(f80Var);
            objT5 = f80Var;
        }
        return R(hsi1Var, z2, (Function0) objT5, x340Var3, i & ContentType.LONG_FORM_ON_DEMAND, 0);
    }

    public static void Q(Context context, String str, boolean z) {
        Intent intent = new Intent(context, (Class<?>) OffliningService.class);
        intent.putExtra("uri", str);
        intent.putExtra("state", z);
        intent.setAction("com.spotify.collection.downloaded.service.OffliningService.action.UPDATE");
        context.startService(intent);
    }

    public static final ven0 R(hsi1 hsi1Var, boolean z, Function0 function0, b0k b0kVar, int i, int i2) {
        Function0 function1;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        Object obj = hsi1Var.b;
        String str = hsi1Var.a;
        boolean z2 = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = fki.t;
                x340Var.s0(objT);
            }
            function1 = (Function0) objT;
        } else {
            function1 = function0;
        }
        b0k b0kVar3 = (x340) b0kVar;
        boolean zG = b0kVar3.g(str);
        Object objT2 = b0kVar3.T();
        if (zG || objT2 == m4cVar) {
            objT2 = v8r.q(obj);
            b0kVar3.s0(objT2);
        }
        ven0 ven0Var = (ven0) objT2;
        boolean zG2 = b0kVar3.g(str);
        Object objT3 = b0kVar3.T();
        if (zG2 || objT3 == m4cVar) {
            objT3 = p3d1.m(0L, b0kVar3);
        }
        frr0 frr0Var = (frr0) objT3;
        boolean zG3 = b0kVar3.g(str);
        Object objT4 = b0kVar3.T();
        if (zG3 || objT4 == m4cVar) {
            objT4 = v8r.q(Boolean.FALSE);
            b0kVar3.s0(objT4);
        }
        ven0 ven0Var2 = (ven0) objT4;
        boolean zG4 = b0kVar3.g(str);
        Object objT5 = b0kVar3.T();
        if (zG4 || objT5 == m4cVar) {
            hrd1 hrd1Var = new hrd1(hsi1Var.d, hsi1Var.e, obj, hsi1Var.c, (oe5) null);
            b0kVar3.s0(hrd1Var);
            objT5 = hrd1Var;
        }
        hrd1 hrd1Var2 = (hrd1) objT5;
        Boolean boolValueOf = Boolean.valueOf(z2);
        boolean zI = b0kVar3.i(frr0Var) | ((((i & ContentType.LONG_FORM_ON_DEMAND) ^ 48) > 32 && b0kVar3.h(z2)) || (i & 48) == 32) | b0kVar3.i(ven0Var2) | b0kVar3.i(ven0Var) | b0kVar3.i(hrd1Var2) | ((((i & 896) ^ 384) > 256 && b0kVar3.g(function1)) || (i & 384) == 256);
        Object objT6 = b0kVar3.T();
        if (zI || objT6 == m4cVar) {
            b0kVar2 = b0kVar3;
            mtj mtjVar = new mtj(z2, ven0Var, hrd1Var2, function1, frr0Var, ven0Var2, null);
            b0kVar2.s0(mtjVar);
            objT6 = mtjVar;
        } else {
            b0kVar2 = b0kVar3;
        }
        qxd0.s(boolValueOf, str, (vu30) objT6, b0kVar2);
        return ven0Var;
    }

    public static final ven0 S(hsi1 hsi1Var, boolean z, boolean z2, Function0 function0, b0k b0kVar, int i, int i2) {
        Function0 function1;
        Object obj = hsi1Var.c;
        if ((i2 & 8) != 0) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = fki.X;
                x340Var.s0(objT);
            }
            function1 = (Function0) objT;
        } else {
            function1 = function0;
        }
        if (z2) {
            x340 x340Var2 = (x340) b0kVar;
            x340Var2.i0(-1553533830);
            ven0 ven0VarR = R(hsi1Var, z, function1, x340Var2, ((i >> 3) & 896) | (i & 126), 0);
            x340Var2.r(false);
            return ven0VarR;
        }
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.i0(-1553373715);
        String strE = f4i1.e(hsi1Var.a, "-disabled");
        Number number = (Number) obj;
        float fFloatValue = number.floatValue();
        float fFloatValue2 = number.floatValue();
        Function0 function2 = function1;
        ven0 ven0VarR2 = R(new hsi1(strE, Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2), irn1.j0(), rno1.a), z, function2, x340Var3, (i & ContentType.LONG_FORM_ON_DEMAND) | ((i >> 3) & 896), 0);
        x340Var3.r(false);
        return ven0VarR2;
    }

    public static qim0 T(qim0 qim0Var, long j, float f, float f2, float f3, boolean z) {
        return exd0.q(qim0Var, new ete1(j, f, z, f2, f3));
    }

    public static final ova U(cki1 cki1Var) {
        int iOrdinal = cki1Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return ova.a;
            }
            if (iOrdinal == 2) {
                return ova.b;
            }
            if (iOrdinal == 3) {
                return ova.c;
            }
            if (iOrdinal != 4) {
                eg.o();
                return null;
            }
        }
        return null;
    }

    public static final String V(byte b2) {
        char[] cArr = xa4.b;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final String W(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = xa4.b;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        eqr0.o(i2, 8, 8);
        return new String(cArr2, i2, 8 - i2);
    }

    public static final void a(boolean z, boolean z2, iu30 iu30Var, eyh0 eyh0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1437279212);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : SemanticState.Focused) | (x340Var.g(eyh0Var) ? 2048 : SemanticState.ReadOnly) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                ec2 ec2Var = new ec2(ven0VarS, !z);
                x340Var.s0(ec2Var);
                objT = ec2Var;
            }
            ec2 ec2Var2 = (ec2) objT;
            ec2Var2.d(!z);
            cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
            boolean zI = x340Var.i(cir0Var) | x340Var.i(ec2Var2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cc2(cir0Var, ec2Var2, (byte) 0);
                x340Var.s0(objT2);
            }
            qxd0.i(cir0Var, (iu30) objT2, x340Var);
            irn1.u((qim0) null, g5i.b, (vu30) null, (erl1) null, apo.r(1615345555, new o3(z2, iu30Var, eyh0Var), x340Var), x340Var, 24624, 13);
            if (z) {
                x340Var.i0(1458585394);
                int i3 = i2 & 7168;
                int i4 = i2 & 896;
                boolean z3 = (i4 == 256) | (i3 == 2048);
                Object objT3 = x340Var.T();
                if (z3 || objT3 == m4cVar) {
                    objT3 = new dc2(eyh0Var, iu30Var, (byte) 0);
                    x340Var.s0(objT3);
                }
                Function0 function0 = (Function0) objT3;
                boolean z4 = (i4 == 256) | (i3 == 2048);
                Object objT4 = x340Var.T();
                if (z4 || objT4 == m4cVar) {
                    objT4 = new dc2(eyh0Var, iu30Var, (byte) 1);
                    x340Var.s0(objT4);
                }
                wgo1.i(function0, (Function0) objT4, cwl1.o0(x340Var, 2131952044), cwl1.o0(x340Var, 2131952041), cwl1.o0(x340Var, 2131952042), cwl1.o0(x340Var, 2131952043), x340Var, 0, 0);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1459296534);
                x340Var.r(false);
            }
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(z, z2, iu30Var, eyh0Var, qim0Var2, i, (byte) 1);
        }
    }

    public static final void b(String str, c380 c380Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-713061826);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(c380Var) ? 32 : 16) | (x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
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
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e("•", uyn1.B(nim0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 6, 0, 2040);
            i8p1.i(str, c380Var, iu30Var, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, 0L, x340Var, i2 & 1022, 72);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xx00(str, c380Var, iu30Var, i, (byte) 20);
        }
    }

    public static final void c(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        qim0 qim0Var2;
        iu30 iu30Var2;
        iu30 iu30Var3 = iu30Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(747813859);
        int i2 = i | (x340Var.i(iu30Var3) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, qim0Var3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            String strO0 = cwl1.o0(x340Var, 2131957228);
            lee1 lee1Var = cbx.d(x340Var).d;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = jl30.b;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(qim0Var3, false, (iu30) objT), lee1Var, 0L, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
            String strO1 = cwl1.o0(x340Var, 2131957227);
            lee1 lee1Var2 = cbx.d(x340Var).h;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarZ2 = uyn1.z(0.0f, 16.0f, 1, qim0Var3);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = jl30.c;
                x340Var.s0(objT2);
            }
            uwo1.e(strO1, s161.b(qim0VarZ2, false, (iu30) objT2), lee1Var2, 0L, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
            String strN0 = cwl1.n0(2131957223, new Object[]{cwl1.o0(x340Var, 2131957216)}, x340Var);
            c9 c9VarS = mqo1.s(new mae1[]{new mae1(cwl1.o0(x340Var, 2131957216), "https://www.spotify.com/safetyandprivacy/parental-guide/plain/")});
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT3 = x340Var.T();
            if (z || objT3 == m4cVar) {
                iu30Var2 = iu30Var;
                objT3 = new z720(iu30Var2, (byte) 9);
                x340Var.s0(objT3);
            } else {
                iu30Var2 = iu30Var;
            }
            b(strN0, c9VarS, (iu30) objT3, x340Var, 0);
            cvx cvxVar3 = cbx.b(x340Var).b;
            String strN1 = cwl1.n0(2131957226, new Object[]{ydh.g(12.0f, 2131957237, x340Var, x340Var, qim0Var3)}, x340Var);
            c9 c9VarS2 = mqo1.s(new mae1[]{new mae1(cwl1.o0(x340Var, 2131957237), "https://support.spotify.com/article/shuffle-play/plain/")});
            boolean z2 = i3 == 4;
            Object objT4 = x340Var.T();
            if (z2 || objT4 == m4cVar) {
                objT4 = new z720(iu30Var2, (byte) 10);
                x340Var.s0(objT4);
            }
            b(strN1, c9VarS2, (iu30) objT4, x340Var, 0);
            cvx cvxVar4 = cbx.b(x340Var).b;
            String strN2 = cwl1.n0(2131957224, new Object[]{ydh.g(12.0f, 2131957231, x340Var, x340Var, qim0Var3)}, x340Var);
            c9 c9VarS3 = mqo1.s(new mae1[]{new mae1(cwl1.o0(x340Var, 2131957231), "https://support.spotify.com/article/managed-accounts/plain/")});
            boolean z3 = i3 == 4;
            Object objT5 = x340Var.T();
            if (z3 || objT5 == m4cVar) {
                objT5 = new z720(iu30Var2, (byte) 11);
                x340Var.s0(objT5);
            }
            b(strN2, c9VarS3, (iu30) objT5, x340Var, 0);
            String strO2 = cwl1.o0(x340Var, 2131957225);
            lee1 lee1Var3 = cbx.d(x340Var).h;
            cvx cvxVar5 = cbx.b(x340Var).b;
            qim0 qim0VarZ3 = uyn1.z(0.0f, 16.0f, 1, qim0Var3);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = jl30.d;
                x340Var.s0(objT6);
            }
            iu30Var3 = iu30Var;
            uwo1.e(strO2, s161.b(qim0VarZ3, false, (iu30) objT6), lee1Var3, 0L, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2024);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l52(iu30Var3, qim0Var2, i, (byte) 2);
        }
    }

    public static final void d(ziu ziuVar, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-745654524);
        int i2 = (x340Var.i(ziuVar) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(function0) ? SemanticState.Hidden : SemanticState.Focused);
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else {
            if (!ziuVar.c) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new xs21(ziuVar, qim0Var, function0, i, (byte) 0);
                    return;
                }
                return;
            }
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            int iJ = up30.j(ziuVar, x340Var);
            Boolean bool = Boolean.TRUE;
            boolean zI = x340Var.i(ziuVar) | x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new d821(ziuVar, ven0Var, (lnm) null, (byte) 10);
                x340Var.s0(objT2);
            }
            qxd0.t(bool, x340Var, (vu30) objT2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            fq7.g(((Boolean) ven0Var.getValue()).booleanValue(), uyn1.x(qim0Var, 4.0f), xay.e(2, irn1.o0(iJ, 0, (dlv) null, 6)), xay.f(2, irn1.o0(iJ, 0, (dlv) null, 6)), (String) null, apo.r(1968539100, new rt11(function0, ziuVar, (byte) 5), x340Var), x340Var, 196608, 16);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new xs21(ziuVar, qim0Var, function0, i, (byte) 1);
        }
    }

    public static final ag01 e(k291 k291Var) {
        return new ag01(k291Var);
    }

    public static final void f(hqk1 hqk1Var, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        gbx gbxVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-867875693);
        int i2 = i | (b0kVar3.g(hqk1Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar3.i(function1) ? SemanticState.Modal : SemanticState.ReadOnly) | 24576;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            String str = "voice-option-" + hqk1Var.a;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N(str, qim0Var3);
            if (function1 == null) {
                b0kVar3.i0(818629270);
                b0kVar3.r(false);
                gbxVar = null;
            } else {
                b0kVar3.i0(818629271);
                boolean zG = b0kVar3.g(function1);
                Object objT = b0kVar3.T();
                if (zG || objT == fkj0.X) {
                    objT = new tpj1(function1, (byte) 13);
                    b0kVar3.s0(objT);
                }
                gbx gbxVar2 = new gbx(z50.c, (Function0) objT);
                b0kVar3.r(false);
                gbxVar = gbxVar2;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarN, (uvx) null, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-542478775, new xy30(function0, z, (byte) 5), b0kVar3), (xu30) null, (xu30) null, apo.r(-94195765, new vpk1(hqk1Var, (byte) 0), b0kVar3), hqk1Var.e ? krj.a : null, (xu30) null, (xu30) null, apo.r(595460559, new vpk1(hqk1Var, (byte) 1), b0kVar3), b0kVar2, 100663296, 196656, 26302);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ofi0(hqk1Var, z, function0, function1, qim0Var2, i, (byte) 26);
        }
    }

    public static final void g(c380 c380Var, String str, boolean z, qpj1 qpj1Var, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2026801747);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.h(z) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.g(qpj1Var) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.i(iu30Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var.i(iu30Var2) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarC = u291.c(u291.f(qim0Var3, 1.0f), 0.66f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarC, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            uwo1.e(cwl1.o0(x340Var, 2131952954), h2c.a.a(qim0Var3, een.h), cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
            uwo1.e(cwl1.o0(x340Var, 2131952953), new tq60(een.Q0), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.a));
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarX = poo1.x(new bgc0(lhc.g(x340Var).g, 32), x340Var);
            cvx cvxVar4 = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            boolean z3 = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((i2 & 896) == 256) | ((i2 & 458752) == 131072);
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                gdv gdvVar = new gdv(c380Var, str, qpj1Var, iu30Var, z, iu30Var2);
                x340Var.s0(gdvVar);
                objT = gdvVar;
            }
            ujo1.d((qim0) null, (xtb0) null, vk80VarX, false, d36Var, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var, 0, 491);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uu(c380Var, str, z, qpj1Var, iu30Var, iu30Var2, qim0Var2, i);
        }
    }

    public static final iu30 h(ven0 ven0Var) {
        return (iu30) ven0Var.getValue();
    }

    public static final boolean i(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static void j(String str, boolean z) {
        if (z) {
            return;
        }
        hhg1.n(str);
    }

    public static void k(boolean z) {
        if (z) {
            return;
        }
        bhn0.q();
    }

    public static void l(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void m(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            bb00.j(sb, "Must be called on ", name2, " thread, but got ", name);
            bhn0.h(".", sb);
        }
    }

    public static void n(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        eg.m(str);
    }

    public static void o(String str) {
        if (TextUtils.isEmpty(str)) {
            hhg1.n("Given String is empty or null");
        }
    }

    public static void p(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            hhg1.n(str2);
        }
    }

    public static void q() {
        r("Must not be called on the main application thread");
    }

    public static void r(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        eg.m(str);
    }

    public static void s(Object obj) {
        if (obj != null) {
            return;
        }
        bhn0.i("null reference");
    }

    public static void t(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bhn0.i(str);
    }

    public static final void u(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbS = cy30.s(j, "size=", " offset=");
            sbS.append(j2);
            sbS.append(" byteCount=");
            sbS.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbS.toString());
        }
    }

    public static void v(String str, boolean z) {
        if (z) {
            return;
        }
        eg.m(str);
    }

    public static void w(boolean z) {
        if (z) {
            return;
        }
        bhn0.w();
    }

    public static final boolean x(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            i1k0.B("Could not find " + str + ". If expected, import the dependency into your app.");
            return false;
        }
    }

    public static final ven0 y(String str, rk41 rk41Var, zfv zfvVar, b0k b0kVar) {
        Float fValueOf = Float.valueOf(0.0f);
        return R(new hsi1(str, fValueOf, fValueOf, zfvVar, rno1.a), rk41Var.a, null, b0kVar, 0, 4);
    }

    public static final String z(gbl gblVar) {
        switch (gblVar == null ? -1 : ive0.a[gblVar.ordinal()]) {
            case 1:
                return "3g";
            case 2:
                return "4g";
            case 3:
                return "edge";
            case 4:
                return "ethernet";
            case 5:
                return "gprs";
            case 6:
                return "none";
            case 7:
                return "wlan";
            case 8:
                return "companion_proxy";
            default:
                return "unknown";
        }
    }
}
