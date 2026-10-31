package p;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.work.impl.WorkDatabase;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class j541 {
    public static final xrj0 a = new xrj0((byte) 12, 2, 3);
    public static final xrj0 b = new xrj0((byte) 13, 3, 4);
    public static final xrj0 c = new xrj0((byte) 14, 4, 5);
    public static final xrj0 d = new xrj0((byte) 15, 5, 6);
    public static b180 e;

    public static void A(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iL = L(i, parcel);
        parcel.writeIntArray(iArr);
        M(iL, parcel);
    }

    public static void B(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        K(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void C(Parcel parcel, int i, long j) {
        K(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void D(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int iL = L(i, parcel);
        parcel.writeLongArray(jArr);
        M(iL, parcel);
    }

    public static void E(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int iL = L(i, parcel);
        parcelable.writeToParcel(parcel, i2);
        M(iL, parcel);
    }

    public static void F(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int iL = L(i, parcel);
        parcel.writeString(str);
        M(iL, parcel);
    }

    public static void G(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iL = L(i, parcel);
        parcel.writeStringArray(strArr);
        M(iL, parcel);
    }

    public static void H(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iL = L(i, parcel);
        parcel.writeStringList(list);
        M(iL, parcel);
    }

    public static void I(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int iL = L(i, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        M(iL, parcel);
    }

    public static void J(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int iL = L(i, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        M(iL, parcel);
    }

    public static void K(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int L(int i, Parcel parcel) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void M(int i, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }

    public static final void a(uel uelVar, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        h311 h311VarV;
        afl aflVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1470289457);
        int i2 = i | (x340Var.i(uelVar) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                boolean zI = x340Var.i(ven0Var) | ((i2 & 896) == 256);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new cb(function0, ven0Var, (byte) 9);
                    x340Var.s0(objT2);
                }
                x74.f((Function0) objT2, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(947169678, new e6j(uelVar, iu30Var, (byte) 8), x340Var), x340Var, 12607488, 48, 1902);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    aflVar = new afl(uelVar, iu30Var, function0, i, (byte) 0);
                }
            }
            h311VarV.d = aflVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            aflVar = new afl(uelVar, iu30Var, function0, i, (byte) 1);
            h311VarV.d = aflVar;
        }
    }

    public static final void b(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1026295798);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfx.b(4, apo.r(-1552966293, new uc0(qim0Var, z), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uc0(z, qim0Var, i, (byte) 12);
        }
    }

    public static final void c(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1575657946);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            gra graVar = een.h;
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0Var2 = nim0.a;
            qim0 qim0VarV = u291.v(qim0Var2, 32.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarH = u291.h(qim0VarV, 16.0f);
            long j = cbx.a(x340Var).c.c;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarH, j, er31.b(8.0f));
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new i3o(str2, (byte) 22);
                x340Var.s0(objT);
            }
            qim0 qim0VarN = anm1.N(str, s161.b(qim0VarF, false, (iu30) objT));
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarV2 = u291.v(qim0Var2, 16.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarH2 = u291.h(qim0VarV2, 4.0f);
            long j2 = cbx.a(x340Var).a.c;
            cua cuaVar2 = cbx.b(x340Var).f;
            t1c.a(dug.f(qim0VarH2, j2, er31.b(4.0f)), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a4f(str, str2, qim0Var2, i, (byte) 2);
        }
    }

    public static final void d(xhy xhyVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        iu30 iu30Var2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        why whyVar = xhyVar.a;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1172231876);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.i(xhyVar) ? 4 : 2) | 48 | (b0kVar3.i(iu30Var) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(anm1.N("entityLinkingCard", u291.f(qim0Var3, 1.0f)), z4p1.e(whyVar.h), er31.b(16.0f));
            boolean z = whyVar.i;
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objT = b0kVar3.T();
            if (z2 || objT == m4cVar) {
                objT = new y9y(iu30Var, (byte) 12);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarF, z, null, null, null, (Function0) objT, 14);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z3 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            eso1.e(Uri.parse(whyVar.f), isl.a, u291.r(uyn1.x(i1p1.q(qim0Var3, er31.b(8.0f)), 8.0f), 80.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar3, 48, 0, 4088);
            qim0 qim0VarY = uyn1.y(new wnb0(1.0f, true), 8.0f, 4.0f);
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, b0kVar3, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM2 = b0kVar3.m();
            qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarY);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(mbhVarA, b0kVar3, lljVar);
            nko1.H(xos0VarM2, b0kVar3, lljVar2);
            x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE2, b0kVar3, lljVar4);
            String str = whyVar.d;
            cjc0 cjc0Var = new cjc0(2);
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(b0kVar3).h, 0L, null, null, 2, false, cjc0Var, 0, null, b0kVar3, 0, 0, 1722);
            b0kVar2 = b0kVar3;
            g(whyVar.e, whyVar.b, b0kVar2, 0);
            b0kVar2.r(true);
            boolean z4 = xhyVar.b;
            qim0Var2 = qim0Var3;
            qim0 qim0VarB = uyn1.B(u291.r(qim0Var2, 48.0f), 8.0f, 0.0f, 16.0f, 0.0f, 10);
            boolean z5 = whyVar.i;
            boolean z6 = i3 == 256;
            Object objT2 = b0kVar2.T();
            if (z6 || objT2 == m4cVar) {
                iu30Var2 = iu30Var;
                objT2 = new y9y(iu30Var2, (byte) 13);
                b0kVar2.s0(objT2);
            } else {
                iu30Var2 = iu30Var;
            }
            b(0, b0kVar2, bin.x(qim0VarB, z5, null, null, null, (Function0) objT2, 14), z4);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            iu30Var2 = iu30Var;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w((byte) 20, i, xhyVar, qim0Var2, iu30Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    public static final void e(u3z0 u3z0Var, boolean z, boolean z2, String str, mlq mlqVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        String strW;
        boolean z3;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-993158);
        int i2 = i | (x340Var2.i(u3z0Var) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.h(z2) ? 256 : 128) | (x340Var2.g(str) ? 2048 : 1024) | (x340Var2.i(mlqVar) ? 16384 : 8192) | (x340Var2.i(function0) ? 131072 : 65536) | 1572864;
        if (x340Var2.Y(i2 & 1, (599187 & i2) != 599186)) {
            if (str == null) {
                strW = null;
            } else {
                String str2 = str.length() > 0 ? str : null;
                if (str2 != null) {
                    strW = nhc1.W("https://p.scdn.co/mp3-preview/{id}", "{id}", str2);
                } else {
                    strW = null;
                }
            }
            int i3 = u3z0Var.a;
            int i4 = u3z0Var.b;
            String str3 = u3z0Var.d;
            boolean zI = x340Var2.i(u3z0Var);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new fhk0(u3z0Var, (byte) 8);
                x340Var2.s0(objT);
            }
            xjw0 xjw0Var = new xjw0(strW, z, i3, i4, str3, (vu30) objT, z2, function0);
            boolean zG = x340Var2.g(u3z0Var.d);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new zjw0((sfn0) ((ojq) mlqVar.a.c).t.get());
                x340Var2.s0(objT2);
            }
            zjw0 zjw0Var = (zjw0) objT2;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = z2 ? u291.f(qim0Var3, 1.0f) : u291.d(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            lzj.b(i2 & 896, 2, u3z0Var.c, x340Var2, (qim0) null, z2);
            pbh pbhVar = pbh.a;
            if (z2) {
                x340Var2.i0(-1868808365);
                op71.g(x340Var2, u291.r(qim0Var3, 16.0f));
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1868740258);
                op71.g(x340Var2, pbhVar.a(1.0f, qim0Var3, true));
                x340Var2.r(false);
            }
            otw.c(zjw0Var, xjw0Var, (qim0) null, (ipb1) null, x340Var2, 8, 12);
            x340Var = x340Var2;
            if (z2) {
                x340Var.i0(-1868591117);
                op71.g(x340Var, u291.r(qim0Var3, 16.0f));
                x340Var.r(false);
                z3 = true;
            } else {
                x340Var.i0(-1868523010);
                z3 = true;
                op71.g(x340Var, pbhVar.a(1.0f, qim0Var3, true));
                x340Var.r(false);
            }
            x340Var.r(z3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vl(u3z0Var, z, z2, str, mlqVar, function0, qim0Var2, i);
        }
    }

    public static final void f(r7x0 r7x0Var, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1527012840);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(r7x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var2);
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
            int i4 = i3 & 1022;
            sgc1.k(r7x0Var, z, iu30Var, (qim0) null, x340Var, i4);
            c8o.c(r7x0Var, iu30Var, (qim0) null, x340Var, ((i3 >> 3) & 112) | (i3 & 14));
            poz0.i(r7x0Var.q, x340Var, 0);
            syo1.a(r7x0Var, z, iu30Var, null, x340Var, i4);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y20(r7x0Var, z, iu30Var, qim0Var2, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    public static final void g(String str, String str2, b0k b0kVar, int i) {
        String strI;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1188738738);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (str == null) {
                strI = str2;
            } else {
                String str3 = !ihc1.y0(str) ? str : null;
                if (str3 != null) {
                    strI = xcg1.i(str2, " • ", str3);
                } else {
                    strI = str2;
                }
            }
            cjc0 cjc0Var = new cjc0(2);
            uwr uwrVar = cbx.a;
            uwo1.e(strI, null, cbx.d(x340Var).j, 0L, null, null, 2, false, cjc0Var, 0, null, x340Var, 0, 0, 1722);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 8, i, str, str2);
        }
    }

    public static final void h(String str, String str2, String str3, long j, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2081726042);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = uyn1.x(dug.f(i1p1.q(u291.b(0.0f, 220.0f, 1, u291.v(qim0Var3, 192.0f)), er31.b(16.0f)), j, d4o1.a), 8.0f);
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            gfx.b(18, apo.r(-1850181989, new zp51(cuaVar, cvxVar, str, str2, z, str3), x340Var), x340Var, 54);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sr21(str, str2, str3, j, z, qim0Var2, i);
        }
    }

    public static final Single i(BluetoothAdapter bluetoothAdapter, Context context) {
        return Single.create(new ow3(bluetoothAdapter, context));
    }

    public static int j(Parcel parcel) {
        return L(20293, parcel);
    }

    public static void k(Buffer buffer) {
        buffer.clear();
    }

    public static WorkDatabase l(Context context, Executor executor, ytw0 ytw0Var, boolean z) {
        bn31 bn31VarT;
        if (z) {
            bn31VarT = new bn31(context, WorkDatabase.class, (String) null);
            bn31VarT.i = true;
        } else {
            bn31VarT = u890.t(context, WorkDatabase.class, "androidx.work.workdb");
            bn31VarT.h = new n8b0(context);
        }
        bn31VarT.f = executor;
        bn31VarT.d.add(new nfg());
        bn31VarT.a(new trj0[]{yrj0.d});
        bn31VarT.a(new trj0[]{new uq21(context, 2, 3)});
        bn31VarT.a(new trj0[]{xrj0.h});
        bn31VarT.a(new trj0[]{xrj0.i});
        bn31VarT.a(new trj0[]{new uq21(context, 5, 6)});
        bn31VarT.a(new trj0[]{xrj0.j});
        bn31VarT.a(new trj0[]{xrj0.k});
        bn31VarT.a(new trj0[]{xrj0.l});
        bn31VarT.a(new trj0[]{new ewl1(context)});
        bn31VarT.a(new trj0[]{new uq21(context, 10, 11)});
        bn31VarT.a(new trj0[]{xrj0.d});
        bn31VarT.a(new trj0[]{xrj0.e});
        bn31VarT.a(new trj0[]{xrj0.f});
        bn31VarT.a(new trj0[]{xrj0.g});
        bn31VarT.a(new trj0[]{new uq21(context, 21, 22)});
        bn31VarT.n = false;
        bn31VarT.o = true;
        bn31VarT.p = true;
        return bn31VarT.c();
    }

    public static x650 m(Context context) {
        Resources resources = context.getResources();
        ThreadLocal threadLocal = qx21.a;
        return new x650(w650.a, resources.getColor(2131101589, null), context.getResources().getColor(2131102821, null), false);
    }

    public static void n(int i, Parcel parcel) {
        M(i, parcel);
    }

    public static final HashMap o(su5 su5Var) {
        Integer num = su5Var.d;
        String str = su5Var.c;
        HashMap map = new HashMap();
        String str2 = su5Var.e;
        boolean z = true;
        boolean z2 = str2 == null || str2.length() == 0;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (str2 != null && !z2) {
            if (str2 == null) {
                str2 = "";
            }
            map.put(opq0.d, str2);
        } else if (str == null || z) {
            if ((num != null ? num.intValue() : 0) >= 0) {
                map.put(opq0.b, new npq0(num != null ? num.intValue() : 0));
            }
        } else {
            if (str == null) {
                str = "";
            }
            map.put(opq0.c, str);
        }
        if (!map.isEmpty()) {
            return map;
        }
        Logger.k("Unknown UriOptionExtras", new Object[0]);
        hhg1.n("Unknown option extras");
        return null;
    }

    public static final HashMap p(String[] strArr) {
        if (strArr.length == 0) {
            Logger.k("Attempting to get UriOptionExtras for empty option extras", new Object[0]);
            hhg1.n("Option extras cannot be empty.");
            return null;
        }
        HashMap map = new HashMap();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            boolean zEquals = lowerCase.equals("alarm");
            mpq0 mpq0Var = mpq0.c;
            mpq0 mpq0Var2 = zEquals ? mpq0.a : lowerCase.equals("default") ? mpq0.b : mpq0Var;
            if (mpq0Var != mpq0Var2) {
                opq0 opq0Var = opq0.a;
                if (map.containsKey(opq0Var)) {
                    Logger.k("Found duplicate UriOptionExtras", new Object[0]);
                    k220.q("Duplicate use not allowed for value of option extra [%s]", Arrays.copyOf(new Object[]{"streamtype"}, 1));
                    return null;
                }
                map.put(opq0Var, mpq0Var2);
            } else {
                try {
                    int i = Integer.parseInt(str);
                    opq0 opq0Var2 = opq0.b;
                    if (map.containsKey(opq0Var2)) {
                        Logger.k("Found duplicate UriOptionExtras", new Object[0]);
                        throw new IllegalArgumentException(String.format("Duplicate use not allowed for value of option extra [%s]", Arrays.copyOf(new Object[]{"trackIndex"}, 1)));
                    }
                    map.put(opq0Var2, new npq0(Math.max(i, 0)));
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        HashMap map2 = map.isEmpty() ? null : map;
        if (map2 != null) {
            return map2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unknown option extras");
        Logger.k("Unknown UriOptionExtras", new Object[0]);
        throw illegalArgumentException;
    }

    public static xbc q(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        tr80 tr80Var = new tr80(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
        lr80 it = tr80Var.iterator();
        while (((sr80) it).c) {
            it.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrK1 = o7h.k1(arrayList);
        return new xbc(Arrays.copyOf(iArrK1, iArrK1.length));
    }

    public static final cd81 r(c700 c700Var) {
        if (!(c700Var instanceof kwz)) {
            if (!(c700Var instanceof nwz)) {
                if (c700Var instanceof pwz) {
                    return new uc81(((pwz) c700Var).a, true);
                }
                if (c700Var instanceof txz) {
                    return xc81.a;
                }
                if (c700Var instanceof f300) {
                    return zc81.a;
                }
                if (c700Var instanceof lxz) {
                    return vc81.a;
                }
                if (c700Var instanceof i300) {
                    return ad81.a;
                }
                if (c700Var instanceof w500) {
                    return bd81.a;
                }
                if (c700Var instanceof mxz) {
                    return wc81.a;
                }
                if (!(c700Var instanceof gzz)) {
                    if (!(c700Var instanceof hzz)) {
                        return null;
                    }
                }
            }
            return tc81.a;
        }
        return sc81.a;
    }

    public static void s(Parcel parcel, int i, boolean z) {
        K(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void t(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        K(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void u(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iL = L(i, parcel);
        parcel.writeBundle(bundle);
        M(iL, parcel);
    }

    public static void v(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iL = L(i, parcel);
        parcel.writeByteArray(bArr);
        M(iL, parcel);
    }

    public static void w(Parcel parcel, double d2) {
        K(parcel, 9, 8);
        parcel.writeDouble(d2);
    }

    public static void x(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        K(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void y(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iL = L(i, parcel);
        parcel.writeStrongBinder(iBinder);
        M(iL, parcel);
    }

    public static void z(Parcel parcel, int i, int i2) {
        K(parcel, i, 4);
        parcel.writeInt(i2);
    }
}
