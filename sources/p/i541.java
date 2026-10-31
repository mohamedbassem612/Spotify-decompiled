package p;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class i541 {
    public static kd31 a;
    public static b180 b;
    public static o860 c;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static void A(int i, Parcel parcel) throws SafeParcelReader.ParseException {
        if (parcel.dataPosition() != i) {
            throw new SafeParcelReader.ParseException(gvg.l(new StringBuilder(String.valueOf(i).length() + 26), "Overread allowed size end=", i), parcel);
        }
    }

    public static int B(int i) {
        return (char) i;
    }

    public static final qim0 C(qim0 qim0Var, iu30 iu30Var) {
        return qim0Var.then(new m6b(iu30Var));
    }

    public static qim0 D(qim0 qim0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, long j, hw61 hw61Var, boolean z, long j2, long j3, int i, f2b f2bVar, int i2) {
        return qim0Var.then(new ee50((i2 & 1) != 0 ? 1.0f : f, (i2 & 2) != 0 ? 1.0f : f2, (i2 & 4) != 0 ? 1.0f : f3, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 0.0f : f5, (i2 & 32) != 0 ? 0.0f : f6, 0.0f, 0.0f, (i2 & 256) != 0 ? 0.0f : f7, 8.0f, (i2 & 1024) != 0 ? ofg1.b : j, (i2 & 2048) != 0 ? d4o1.a : hw61Var, (i2 & 4096) != 0 ? false : z, (vc21) null, (i2 & 16384) != 0 ? he50.a : j2, (32768 & i2) != 0 ? he50.a : j3, (65536 & i2) != 0 ? 0 : i, 3, (i2 & 262144) != 0 ? null : f2bVar, rkb0.a));
    }

    public static qim0 E(qim0 qim0Var, float f, float f2, float f3, float f4, hw61 hw61Var, int i) {
        float f5 = (i & 1) != 0 ? 1.0f : f;
        float f6 = (i & 2) != 0 ? 1.0f : f2;
        float f7 = (i & 4) != 0 ? 1.0f : f3;
        float f8 = (i & 32) != 0 ? 0.0f : f4;
        long j = ofg1.b;
        hw61 hw61Var2 = (i & 2048) != 0 ? d4o1.a : hw61Var;
        long j2 = he50.a;
        return D(qim0Var, f5, f6, f7, 0.0f, 0.0f, f8, 0.0f, j, hw61Var2, false, j2, j2, 0, null, 524288);
    }

    public static o860 F() {
        o860 o860Var;
        o860 o860Var2 = c;
        if (o860Var2 != null) {
            return o860Var2;
        }
        try {
            o860Var = new o860(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), (byte) 17);
        } catch (NoSuchMethodException unused) {
            o860Var = new o860((Object) null, (Object) null, (Object) null, (Object) null, (byte) 17);
        }
        c = o860Var;
        return o860Var;
    }

    public static final boolean G(rsf0 rsf0Var, int i) {
        if (rsf0Var instanceof nsf0) {
            return i == ((nsf0) rsf0Var).a;
        }
        if (rsf0Var instanceof qsf0) {
            return i == ((qsf0) rsf0Var).a;
        }
        if (!(rsf0Var instanceof psf0) && !(rsf0Var instanceof osf0)) {
            eg.o();
        }
        return false;
    }

    public static boolean H(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static boolean I(int i, Parcel parcel) throws SafeParcelReader.ParseException {
        Y(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static Boolean J(int i, Parcel parcel) throws SafeParcelReader.ParseException {
        int iT = T(i, parcel);
        if (iT == 0) {
            return null;
        }
        Z(parcel, iT, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static byte K(int i, Parcel parcel) throws SafeParcelReader.ParseException {
        Y(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static double L(int i, Parcel parcel) throws SafeParcelReader.ParseException {
        Y(parcel, i, 8);
        return parcel.readDouble();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static float M(int i, Parcel parcel) throws SafeParcelReader.ParseException {
        Y(parcel, i, 4);
        return parcel.readFloat();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static Float N(int i, Parcel parcel) throws SafeParcelReader.ParseException {
        int iT = T(i, parcel);
        if (iT == 0) {
            return null;
        }
        Z(parcel, iT, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int O(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder P(int i, Parcel parcel) {
        int iT = T(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iT);
        return strongBinder;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static int Q(int i, Parcel parcel) throws SafeParcelReader.ParseException {
        Y(parcel, i, 4);
        return parcel.readInt();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static Integer R(int i, Parcel parcel) throws SafeParcelReader.ParseException {
        int iT = T(i, parcel);
        if (iT == 0) {
            return null;
        }
        Z(parcel, iT, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static long S(int i, Parcel parcel) throws SafeParcelReader.ParseException {
        Y(parcel, i, 8);
        return parcel.readLong();
    }

    public static int T(int i, Parcel parcel) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void U(int i, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + T(i, parcel));
    }

    public static why V(zkb zkbVar, Context context, int i) {
        int i2;
        String strY0;
        String str = zkbVar.a;
        vkb vkbVar = zkbVar.e;
        boolean z = vkbVar instanceof vkb;
        if (z) {
            int iC = l1d.C(vkbVar.a);
            if (iC != 2) {
                i2 = iC != 3 ? 2131952169 : 2131955570;
            } else {
                i2 = 2131962538;
            }
        } else if (vkbVar.equals(pzs0.Z)) {
            i2 = 2131952444;
        } else if (vkbVar.equals(qzs0.N0)) {
            i2 = 2131952579;
        } else if (vkbVar.equals(rzs0.Z)) {
            i2 = 2131955571;
        } else if (vkbVar.equals(s321.N0)) {
            i2 = 2131959896;
        } else if (vkbVar.equals(u321.N0)) {
            i2 = 2131962401;
        } else {
            if (!(vkbVar instanceof wkb)) {
                eg.o();
                return null;
            }
            i2 = 2131962687;
        }
        String string = context.getString(i2);
        String str2 = zkbVar.b;
        if (z) {
            strY0 = o7h.y0(vkbVar.b, (CharSequence) null, (String) null, (String) null, vay.Z, 31);
        } else {
            strY0 = vkbVar instanceof wkb ? o7h.y0(((wkb) vkbVar).a, (CharSequence) null, (String) null, (String) null, vay.N0, 31) : null;
        }
        if (strY0 == null) {
            strY0 = zkbVar.c;
        }
        String str3 = strY0;
        lq70 lq70Var = (lq70) o7h.s0(zkbVar.d);
        String str4 = lq70Var != null ? lq70Var.b : null;
        if (str4 == null) {
            str4 = "";
        }
        return new why(i, "", string, str, str2, str3, str4, vkbVar instanceof wkb ? ((wkb) vkbVar).b.a : str, true);
    }

    public static final zby W(oiy oiyVar, int i) {
        vby vbyVarU = xzo1.u(oiyVar.a);
        Boolean bool = oiyVar.b;
        int i2 = 1;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC != 1) {
                eg.o();
                return null;
            }
            i2 = 2;
        }
        return new zby(vbyVarU, (vby0) null, zBooleanValue, i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static int X(Parcel parcel) throws SafeParcelReader.ParseException {
        int i = parcel.readInt();
        int iT = T(i, parcel);
        char c2 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new SafeParcelReader.ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iT + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new SafeParcelReader.ParseException(sb.toString(), parcel);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static void Y(Parcel parcel, int i, int i2) throws SafeParcelReader.ParseException {
        int iT = T(i, parcel);
        if (iT == i2) {
            return;
        }
        String hexString = Integer.toHexString(iT);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iT).length() + 4 + 1);
        c13.n(i2, iT, "Expected size ", " got ", sb);
        throw new SafeParcelReader.ParseException(l1d.q(sb, " (0x", hexString, ")"), parcel);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    public static void Z(Parcel parcel, int i, int i2) throws SafeParcelReader.ParseException {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        c13.n(i2, i, "Expected size ", " got ", sb);
        throw new SafeParcelReader.ParseException(l1d.q(sb, " (0x", hexString, ")"), parcel);
    }

    public static final void a(idl idlVar, kdl kdlVar, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(740042834);
        int i2 = i | (x340Var.i(idlVar) ? 4 : 2) | (x340Var.i(kdlVar) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(iu30Var2) ? 2048 : 1024) | (x340Var.i(vu30Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            String str = kdlVar.a;
            boolean z = (i2 & 112) == 32 || x340Var.i(kdlVar);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new v7l(kdlVar, (byte) 2);
                x340Var.s0(objT);
            }
            dgo1.c(str, (iu30) objT, apo.r(-287668074, new xdl(idlVar, kdlVar, iu30Var, iu30Var2, vu30Var), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xdl(idlVar, kdlVar, iu30Var, iu30Var2, vu30Var, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(pfl pflVar, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        int i2;
        boolean z;
        af5 af5Var;
        int i3 = pflVar.a;
        ifl iflVar = pflVar.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(655639128);
        int i4 = 2;
        int i5 = i | (x340Var.g(pflVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128) | (x340Var.i(vu30Var) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i5 & 1, (i5 & 9363) != 9362)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new idl();
                x340Var.s0(objT);
            }
            idl idlVar = (idl) objT;
            boolean zE = x340Var.e(iflVar.ordinal());
            Object objT2 = x340Var.T();
            if (zE || objT2 == m4cVar) {
                int iOrdinal = iflVar.ordinal();
                if (iOrdinal == 0) {
                    i4 = 1;
                } else if (iOrdinal != 1) {
                    eg.o();
                    return;
                }
                objT2 = new h9l0(i4);
                x340Var.s0(objT2);
            }
            h9l0 h9l0Var = (h9l0) objT2;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarC = u291.c(u291.f(qim0Var3, 1.0f), 0.66f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarC, cbx.a(x340Var).a.a.c(), d4o1.a);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 8.0f, 16.0f, 0.0f, 8);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            String strO0 = cwl1.o0(x340Var, 2131952808);
            lee1 lee1Var = cbx.d(x340Var).e;
            long j = cbx.a(x340Var).b.a;
            era eraVar = een.Q0;
            tq60 tq60Var = new tq60(eraVar);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = tqk.c1;
                x340Var.s0(objT3);
            }
            uwo1.e(strO0, s161.b(tq60Var, false, (iu30) objT3), lee1Var, j, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 2.0f));
            int iC = l1d.C(i3);
            if (iC == 0) {
                i2 = 2131952807;
            } else {
                if (iC != 1) {
                    eg.o();
                    return;
                }
                i2 = 2131952817;
            }
            uwo1.e(cwl1.o0(x340Var, i2), new tq60(eraVar), cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var3, 16.0f));
            boolean zI = x340Var.i(h9l0Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new ydl(h9l0Var, (byte) 1);
                x340Var.s0(objT4);
            }
            dgo1.c(iflVar, (iu30) objT4, apo.r(-30818970, new sxj(pflVar, idlVar, iu30Var, iu30Var2, vu30Var, (byte) 8), x340Var), x340Var, 384);
            int iC2 = l1d.C(i3);
            if (iC2 == 0) {
                x340Var.i0(295599452);
                f65 f65Var = (f65) x340Var.k(t4k.s);
                boolean zI2 = x340Var.i(f65Var);
                Object objT5 = x340Var.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new ptj(1, f65Var, f65.class, "openUri", "openUri(Ljava/lang/String;)V", 0, (byte) 5);
                    x340Var.s0(objT5);
                }
                z = true;
                af5 af5VarA = wmo1.A(2131952813, 2131952815, "https://www.spotify.com/legal/privacy-policy", null, (iu30) objT5, x340Var, 384, 8);
                x340Var.r(false);
                af5Var = af5VarA;
            } else {
                if (iC2 != 1) {
                    throw p3d1.k(x340Var, -129013440, false);
                }
                x340Var.i0(-128999711);
                af5 af5Var2 = new af5(cwl1.o0(x340Var, 2131952811));
                x340Var.r(false);
                af5Var = af5Var2;
                z = true;
            }
            lee1 lee1Var2 = cbx.d(x340Var).j;
            long j2 = cbx.a(x340Var).b.b;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            cvx cvxVar6 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarF2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarW = uyn1.w(qim0VarB2, poo1.x(new bgc0(lhc.g(x340Var).g, 32), x340Var));
            cvx cvxVar7 = cbx.b(x340Var).b;
            uwo1.d(af5Var, j2, uyn1.B(qim0VarW, 0.0f, 0.0f, 0.0f, 16.0f, 7), lee1Var2, new a0e1(3), null, 0, false, null, 0, null, null, x340Var, 0, 0, 4064);
            x340Var = x340Var;
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 9, i, (Object) pflVar, (Object) iu30Var, (Object) iu30Var2, (Object) vu30Var, (Object) qim0Var2);
        }
    }

    public static final void c(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0VarC;
        lw4 lw4Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(800103978);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            cb80 cb80VarG = t5p1.g(t5p1.r("glow_rotation", x340Var, 0), 0.0f, 1.0f, irn1.Y(irn1.o0(4000, 0, mlv.d, 2), 1, 0L, 4), "glow_progress", x340Var, 29112, 0);
            List list = dw40.a;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(dw40.b.get(0));
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cw40(ven0Var, (lnm) null);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = t3k1.g();
                x340Var.s0(objT3);
            }
            vw4 vw4Var = (vw4) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = ww4.a();
                x340Var.s0(objT4);
            }
            u8s0 u8s0Var = (u8s0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = ww4.a();
                x340Var.s0(objT5);
            }
            u8s0 u8s0Var2 = (u8s0) objT5;
            boolean z = Build.VERSION.SDK_INT >= 31;
            wat watVar = (wat) x340Var.k(t4k.h);
            Object objT6 = x340Var.T();
            Object obj = objT6;
            if (objT6 == m4cVar) {
                if (z) {
                    lw4Var = null;
                } else {
                    lw4 lw4VarL = fdg1.l();
                    lw4VarL.g(1);
                    lw4Var = lw4VarL;
                }
                x340Var.s0(lw4Var);
                obj = lw4Var;
            }
            lw4 lw4Var2 = (lw4) obj;
            Object objT7 = x340Var.T();
            if (objT7 == m4cVar) {
                objT7 = !z ? new BlurMaskFilter(watVar.X0(45.0f), BlurMaskFilter.Blur.NORMAL) : null;
                x340Var.s0(objT7);
            }
            BlurMaskFilter blurMaskFilter = (BlurMaskFilter) objT7;
            if (z) {
                x340Var.i0(100814427);
                Object objT8 = x340Var.T();
                if (objT8 == m4cVar) {
                    objT8 = vc40.T0;
                    x340Var.s0(objT8);
                }
                qim0VarC = fc11.n(C(qim0Var, (iu30) objT8), 45.0f, 45.0f, (hw61) null);
                x340Var.r(false);
            } else {
                x340Var.i0(100816592);
                Object objT9 = x340Var.T();
                if (objT9 == m4cVar) {
                    objT9 = vc40.U0;
                    x340Var.s0(objT9);
                }
                qim0VarC = C(qim0Var, (iu30) objT9);
                x340Var.r(false);
            }
            boolean zI2 = x340Var.i(u8s0Var) | x340Var.i(vw4Var) | x340Var.i(cb80VarG) | x340Var.i(ven0Var) | x340Var.i(lw4Var2) | x340Var.i(blurMaskFilter) | x340Var.i(u8s0Var2);
            Object objT10 = x340Var.T();
            if (zI2 || objT10 == m4cVar) {
                z1 z1Var = new z1(u8s0Var, vw4Var, ven0Var, lw4Var2, blurMaskFilter, u8s0Var2, cb80VarG, (byte) 8);
                x340Var.s0(z1Var);
                objT10 = z1Var;
            }
            j0o1.b(0, x340Var, (iu30) objT10, qim0VarC);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ns30(qim0Var, i, (byte) 4);
        }
    }

    public static final void d(ysf0 ysf0Var, Boolean bool, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) throws Throwable {
        int i2;
        b0k b0kVar2;
        xtb0 xtb0Var;
        Object sr1Var;
        xtb0 xtb0Var2;
        ven0 ven0Var;
        tob1 tob1Var;
        int i3;
        Throwable th;
        qim0 qim0VarR;
        qim0 qim0VarB;
        int i4;
        Object v4e0Var;
        ptb0 ptb0Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1812453001);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(ysf0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = i & 48;
        qim0 qim0Var = nim0.a;
        if (i5 == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(bool) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = v8r.q(ysf0Var.e);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var2 = (ven0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = us71.i(ysf0Var.h, b0kVar3);
            }
            drr0 drr0Var = (drr0) objT2;
            float f = ysf0Var.h;
            boolean z = ysf0Var.k;
            boolean z2 = ysf0Var.q;
            ArrayList arrayList = ysf0Var.c;
            boolean zD = b0kVar3.d(f);
            Object objT3 = b0kVar3.T();
            if (zD || objT3 == m4cVar) {
                drr0Var.t(ysf0Var.h);
                objT3 = yv91.a(new ptf0(drr0Var, (byte) 0));
                b0kVar3.s0(objT3);
            }
            tob1 tob1Var2 = (tob1) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT4);
            }
            tob1 tob1Var3 = (ven0) objT4;
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT5);
            }
            ven0 ven0Var3 = (ven0) objT5;
            int i6 = i2 & 14;
            boolean z3 = i6 == 4;
            Object objT6 = b0kVar3.T();
            if (z3 || objT6 == m4cVar) {
                objT6 = new bsc0(ven0Var2, ysf0Var, (byte) 19);
                b0kVar3.s0(objT6);
            }
            wqn1.h(ysf0Var, xtb0VarA, (Function0) objT6, b0kVar3, i6);
            Boolean bool2 = (Boolean) tob1Var3.getValue();
            bool2.getClass();
            int i7 = 57344 & i2;
            boolean zG = (i7 == 16384) | b0kVar3.g(tob1Var2);
            Object objT7 = b0kVar3.T();
            if (zG || objT7 == m4cVar) {
                xtb0Var = xtb0VarA;
                sr1Var = new sr1(iu30Var, tob1Var3, ven0Var3, tob1Var2, (lnm) null, (byte) 29);
                b0kVar3.s0(sr1Var);
            } else {
                sr1Var = objT7;
                xtb0Var = xtb0VarA;
            }
            qxd0.t(bool2, b0kVar3, (vu30) sr1Var);
            j6p1.j(((Boolean) tob1Var3.getValue()).booleanValue(), ((Number) tob1Var2.getValue()).floatValue(), b0kVar3, 0);
            boolean zD2 = b0kVar3.d(((Number) tob1Var2.getValue()).floatValue()) | b0kVar3.g(arrayList);
            Object objT8 = b0kVar3.T();
            if (zD2 || objT8 == m4cVar) {
                objT8 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT8);
            }
            tob1 tob1Var4 = (ven0) objT8;
            boolean zG2 = b0kVar3.g(arrayList) | b0kVar3.d(((Number) tob1Var2.getValue()).floatValue());
            Object objT9 = b0kVar3.T();
            if (zG2 || objT9 == m4cVar) {
                jv91 jv91VarO = ekb.o();
                iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
                jv91 jv91VarU = ekb.u(jv91VarO);
                try {
                    ptb0 ptb0VarH = xtb0Var.h();
                    ekb.C(jv91VarO, jv91VarU, iu30VarE);
                    b0kVar3.s0(ptb0VarH);
                    objT9 = ptb0VarH;
                } catch (Throwable th2) {
                    ekb.C(jv91VarO, jv91VarU, iu30VarE);
                    throw th2;
                }
            }
            ptb0 ptb0Var2 = (ptb0) objT9;
            if (!z2 || ((Boolean) tob1Var4.getValue()).booleanValue()) {
                xtb0Var2 = xtb0Var;
                tob1Var3 = tob1Var3;
                ven0Var = ven0Var3;
                tob1Var = tob1Var4;
                b0kVar3.i0(1543570763);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1543317059);
                boolean zG3 = b0kVar3.g(xtb0Var) | b0kVar3.i(ptb0Var2) | b0kVar3.g(tob1Var4);
                Object objT10 = b0kVar3.T();
                if (zG3 || objT10 == m4cVar) {
                    tob1Var = tob1Var4;
                    ven0Var = ven0Var3;
                    xtb0 xtb0Var3 = xtb0Var;
                    v4e0Var = new v4e0(xtb0Var3, ptb0Var2, tob1Var, (lnm) null, (byte) 11);
                    xtb0Var2 = xtb0Var3;
                    ptb0Var = ptb0Var2;
                    b0kVar3.s0(v4e0Var);
                } else {
                    xtb0 xtb0Var4 = xtb0Var;
                    ptb0Var = ptb0Var2;
                    ven0Var = ven0Var3;
                    tob1Var = tob1Var4;
                    v4e0Var = objT10;
                    xtb0Var2 = xtb0Var4;
                }
                qxd0.s(xtb0Var2, ptb0Var, (vu30) v4e0Var, b0kVar3);
                b0kVar3.r(false);
            }
            boolean zG4 = b0kVar3.g(xtb0Var2);
            Object objT11 = b0kVar3.T();
            if (zG4 || objT11 == m4cVar) {
                objT11 = new nxb0(xtb0Var2, (byte) 1);
                b0kVar3.s0(objT11);
            }
            iu30Var2.invoke(objT11);
            qim0 qim0VarN = anm1.N("#LyricsTextTag", ((z2 && ((Boolean) tob1Var.getValue()).booleanValue()) ? u291.d(qim0Var, 1.0f) : qim0Var).then(qim0Var));
            boolean z4 = ysf0Var.a instanceof vsf0;
            float fX0 = ((wat) b0kVar3.k(t4k.h)).X0(ysf0Var.s);
            boolean zC = xtb0Var2.c();
            boolean zD3 = xtb0Var2.d();
            if (z4) {
                i3 = i6;
                th = null;
                qim0VarR = exd0.r(D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983039), new edg1(fX0, zC, zD3, (byte) 1));
            } else {
                i3 = i6;
                th = null;
                qim0VarR = qim0Var;
            }
            qim0 qim0VarThen = qim0VarN.then(qim0VarR);
            Object objT12 = b0kVar3.T();
            if (objT12 == m4cVar) {
                objT12 = new qae0(tob1Var3, ven0Var, drr0Var, (byte) 18);
                b0kVar3.s0(objT12);
            }
            vu30 vu30Var2 = (vu30) objT12;
            if (z) {
                qim0VarB = f8d1.b(qim0Var, rih1.a, new ae4(vu30Var2, (byte) 5));
            } else {
                qim0VarB = qim0Var;
            }
            qim0 qim0VarThen2 = qim0VarThen.then(qim0VarB);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarThen2);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw th;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(gfh0VarC, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            qim0 qim0VarL = bmq0.L(qim0Var, new br41(z && !((Boolean) tob1Var3.getValue()).booleanValue()), th);
            Object objT13 = b0kVar3.T();
            if (objT13 == m4cVar) {
                objT13 = klf0.c1;
                b0kVar3.s0(objT13);
            }
            qim0 qim0VarB2 = s161.b(qim0VarL, false, (iu30) objT13);
            d36 d36Var = new d36(ysf0Var.i, true, new um5(false));
            boolean z5 = ysf0Var.k;
            tob1 tob1Var5 = tob1Var2;
            int i8 = i2;
            boolean zG5 = (i3 == 4) | (i7 == 16384) | b0kVar3.g(tob1Var5) | ((i8 & 896) == 256) | ((i8 & 7168) == 2048);
            Object objT14 = b0kVar3.T();
            if (zG5 || objT14 == m4cVar) {
                i4 = 3;
                tob1 tob1Var6 = tob1Var3;
                z1 z1Var = new z1(ysf0Var, vu30Var, iu30Var, ven0Var2, bool, tob1Var6, tob1Var5, (byte) 11);
                tob1Var3 = tob1Var6;
                tob1Var5 = tob1Var5;
                b0kVar3.s0(z1Var);
                objT14 = z1Var;
            } else {
                i4 = 3;
            }
            Throwable th3 = th;
            ujo1.d(qim0VarB2, xtb0Var2, null, false, d36Var, null, null, z5, null, (iu30) objT14, b0kVar3, 0, 364);
            b0kVar2 = b0kVar3;
            fq7.g(((Boolean) tob1Var3.getValue()).booleanValue(), h2c.a.a(qim0Var, een.h), xay.e(i4, th3), xay.f(i4, th3), (String) null, apo.r(-431127847, new qdd0(tob1Var5, (byte) 1), b0kVar2), b0kVar2, 200064, 16);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(ysf0Var, bool, vu30Var, iu30Var, iu30Var2, i);
        }
    }

    public static final void e(ysf0 ysf0Var, qim0 qim0Var, Boolean bool, vu30 vu30Var, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) throws Throwable {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(385336505);
        int i2 = i | (x340Var.g(ysf0Var) ? 4 : 2) | 48 | (x340Var.g(bool) ? 256 : 128) | (x340Var.i(vu30Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(iu30Var2) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean z = ysf0Var.a instanceof wsf0;
            qim0 qim0Var3 = nim0.a;
            if (z && ysf0Var.t) {
                x340Var.i0(941209047);
                int i3 = i2 & 1022;
                int i4 = i2 >> 3;
                yap1.d(ysf0Var, qim0Var3, bool, iu30Var, iu30Var2, x340Var, i3 | (i4 & 7168) | (i4 & 57344));
                x340Var.r(false);
            } else {
                x340Var.i0(941216794);
                d(ysf0Var, bool, vu30Var, iu30Var, iu30Var2, x340Var, i2 & 524286);
                x340Var.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy((Object) ysf0Var, (Object) qim0Var2, (Object) bool, (Object) vu30Var, (Object) iu30Var, (Object) iu30Var2, i, (byte) 17);
        }
    }

    public static final void f(j3n0 j3n0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1969137092);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(j3n0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarZ = u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).e.b;
            float f2 = cbx.b(x340Var).e.b;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, f, 0.0f, f2, 8.0f, 2);
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarB, jA, er31.b(16.0f));
            float f3 = cbx.b(x340Var).e.b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, f3, 8.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String str = j3n0Var.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(wnb0Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            gfx.g(8, apo.r(-1343363373, new loi0(j3n0Var, iu30Var, (byte) 19), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(j3n0Var, iu30Var, i, (byte) 16);
        }
    }

    public static final void g(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1045655782);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = bin.x(dug.f(qim0Var, cbx.a(x340Var).a.b.a(), er31.b(3.0f)), false, null, null, null, function0, 15);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, 4.0f, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(str, null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var, i, (byte) 23);
        }
    }

    public static final void h(c380 c380Var, vu30 vu30Var, qim0 qim0Var, String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2130853969);
        int i2 = (x340Var.i(c380Var) ? 4 : 2) | i | (x340Var.i(vu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0Var = nim0.a;
            qim0 qim0VarN = str != null ? anm1.N(str, qim0Var) : qim0Var;
            d36 d36Var = new d36(10.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            k5p1.d(qim0VarN, d36Var, new d36(16.0f, true, new um5(false)), null, 0, 0, apo.r(-1223782602, new nu31(c380Var, vu30Var, str, (byte) 18), x340Var), x340Var, 1572864, 56);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, c380Var, vu30Var, qim0Var2, str, (byte) 20);
        }
    }

    public static final boolean j(o161 o161Var) {
        d261 d261Var = z161.s;
        nen0 nen0Var = o161Var.a;
        Object objG = nen0Var.g(d261Var);
        if (objG == null) {
            objG = null;
        }
        if (u890.j(objG, m9h.T0)) {
            return false;
        }
        return nen0Var.b(m161.g) || nen0Var.b(m161.h);
    }

    public static final boolean k(o161 o161Var) {
        return o161Var.a.b(z161.r);
    }

    public static final boolean l(o161 o161Var) {
        nen0 nen0Var = o161Var.a;
        if (nen0Var.b(m161.g) || nen0Var.b(m161.h) || nen0Var.b(z161.r) || nen0Var.b(z161.s)) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 34 && nen0Var.b(yoi1.g);
    }

    public static final int n(rsf0 rsf0Var, bmf0 bmf0Var) {
        String str = bmf0Var.b;
        int i = bmf0Var.a;
        if (!(rsf0Var instanceof psf0)) {
            if (rsf0Var instanceof nsf0) {
                nsf0 nsf0Var = (nsf0) rsf0Var;
                if (i == nsf0Var.a) {
                    return nsf0Var.b;
                }
            } else {
                if (!(rsf0Var instanceof qsf0)) {
                    if (rsf0Var instanceof osf0) {
                        return str.length();
                    }
                    eg.o();
                    return 0;
                }
                qsf0 qsf0Var = (qsf0) rsf0Var;
                int i2 = qsf0Var.a;
                if (i < i2) {
                    return str.length();
                }
                if (i == i2) {
                    return qsf0Var.b;
                }
            }
        }
        return 0;
    }

    public static Bundle o(int i, Parcel parcel) {
        int iT = T(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iT);
        return bundle;
    }

    public static byte[] p(int i, Parcel parcel) {
        int iT = T(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iT);
        return bArrCreateByteArray;
    }

    public static int[] q(int i, Parcel parcel) {
        int iT = T(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iT);
        return iArrCreateIntArray;
    }

    public static long[] r(int i, Parcel parcel) {
        int iT = T(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iT);
        return jArrCreateLongArray;
    }

    public static Parcelable s(Parcel parcel, int i, Parcelable.Creator creator) {
        int iT = T(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iT);
        return parcelable;
    }

    public static String t(int i, Parcel parcel) {
        int iT = T(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iT);
        return string;
    }

    public static String[] u(int i, Parcel parcel) {
        int iT = T(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iT);
        return strArrCreateStringArray;
    }

    public static ArrayList v(int i, Parcel parcel) {
        int iT = T(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iT);
        return arrayListCreateStringArrayList;
    }

    public static Object[] w(Parcel parcel, int i, Parcelable.Creator creator) {
        int iT = T(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iT);
        return objArrCreateTypedArray;
    }

    public static ArrayList x(Parcel parcel, int i, Parcelable.Creator creator) {
        int iT = T(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iT == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iT);
        return arrayListCreateTypedArrayList;
    }

    public static final String y(String str, dar darVar) {
        StringBuilder sbT = l1d.t("Cannot deserialize ", str, " with '");
        sbT.append(rc11.a.b(darVar.getClass()).r());
        sbT.append("'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.");
        return sbT.toString();
    }

    public static final String z(uax uaxVar, String str) {
        StringBuilder sbT = l1d.t("Cannot serialize ", str, " with '");
        sbT.append(rc11.a.b(uaxVar.getClass()).r());
        sbT.append("'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.");
        return sbT.toString();
    }
}
