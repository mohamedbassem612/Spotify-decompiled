package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wpo1 {
    public static final cen1 a = new cen1();
    public static b180 b;

    public static int A(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return 11;
            case grn1.d /* 12 */:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 15;
            default:
                return 0;
        }
    }

    public static final void a(int i, int i2, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i3;
        boolean z2;
        int i4;
        b0k b0kVar2;
        boolean z3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-14418210);
        if ((i & 6) == 0) {
            i3 = i | (b0kVar3.g(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(function0) ? 32 : 16;
        }
        int i5 = i3 | (b0kVar3.i(qim0Var) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i5 | (b0kVar3.h(z2) ? 2048 : 1024);
        }
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            if (i6 != 0) {
                z2 = false;
            }
            boolean z4 = (i4 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z4 || objT == fkj0.X) {
                objT = new vj0(function0, (byte) 2);
                b0kVar3.s0(objT);
            }
            boolean z5 = z2;
            b0kVar2 = b0kVar3;
            poo1.g(z5, (iu30) objT, new nex(4), yoo1.z(b0kVar3), u291.x(0.0f, 214.0f, 1, qim0Var), 0, null, null, null, null, null, null, null, false, null, apo.r(-224302789, new nl(str, (byte) 23), b0kVar3), b0kVar2, (i4 >> 9) & 14, 196608, 32736);
            z3 = z5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z3 = z2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j87(str, qim0Var, z3, function0, i, i2);
        }
    }

    public static final void b(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(978934001);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            eso1.e(Uri.parse(str), isl.a, u291.d(nim0.a, 1.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y5d0(str, i, (byte) 23);
        }
    }

    public static final void c(hdi0 hdi0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(619513283);
        int i2 = (x340Var.i(hdi0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = hdi0Var.a;
            ncf0 ncf0VarG = h5p1.G(new pcf0(str), str, null, x340Var, 0, 46);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            as80 as80Var = mif1.R0;
            fcf0 fcf0VarC = ncf0VarG.c();
            boolean z = hdi0Var.b;
            mp10.f(fcf0VarC, qim0VarD, z, false, !z ? new acf0(0.0f) : null, Integer.MAX_VALUE, (ddf0) null, (tl3) null, as80Var, x340Var, 1572864, 0, 2064296);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yih0(hdi0Var, i, (byte) 9);
        }
    }

    public static final void d(z0j0 z0j0Var, boolean z, String str, c380 c380Var, ctf ctfVar, bqm bqmVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-843302738);
        int i2 = i | (x340Var.i(z0j0Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(c380Var) ? 2048 : 1024) | (x340Var.i(ctfVar) ? 16384 : 8192) | (x340Var.i(bqmVar) ? 131072 : 65536) | (x340Var.g(qim0Var) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            otw.c(bqmVar, new aqm(new wpm(z0j0Var.b, ctfVar, z0j0Var.c), z, str, c380Var), (qim0) null, (ipb1) null, x340Var, (i2 >> 15) & 14, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uu(z0j0Var, z, str, c380Var, ctfVar, bqmVar, qim0Var, i);
        }
    }

    public static final void e(odi0 odi0Var, j2i j2iVar, Function0 function0, Function0 function1, Function0 function2, fns fnsVar, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(447891662);
        int i2 = i | (b0kVar3.i(odi0Var) ? 4 : 2) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(function1) ? 2048 : 1024) | (b0kVar3.i(function2) ? 16384 : 8192) | (b0kVar3.i(fnsVar) ? 131072 : 65536) | 1572864;
        if (b0kVar3.Y(i2 & 1, (599187 & i2) != 599186)) {
            boolean zG = b0kVar3.g(odi0Var.f);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = bb00.h(0, b0kVar3);
            }
            b0kVar2 = b0kVar3;
            w2g0.c((qim0) null, (tl3) null, apo.r(2020853284, new pih((hdn0) objT, odi0Var, function0, function1, j2iVar, function2, fnsVar), b0kVar3), b0kVar2, 3072, 7);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ydi0((Object) odi0Var, (Object) j2iVar, (Object) function0, (Object) function1, (Object) function2, (Object) fnsVar, (Object) qim0Var2, i, (byte) 0);
        }
    }

    public static final void f(float f, long j, Function0 function0, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1100547216);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.f(j) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            int iI0 = ((wat) x340Var.k(t4k.h)).i0(182.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            gho1.b(f, iI0, apo.r(-1539698126, new pqu(f, iI0, j, j2iVar), x340Var), x340Var, (i2 & 14) | 384);
            if (f != 0.0f || function0 == null) {
                z = true;
                x340Var.i0(-11369480);
                x340Var.r(false);
            } else {
                x340Var.i0(-11646248);
                qim0 qim0VarH = u291.h(u291.f(qim0Var3, 1.0f), 182.0f);
                gfh0 gfh0VarC2 = t1c.c(een.X, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarH);
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
                qim0 qim0VarH2 = u291.h(u291.f(qim0Var3, 1.0f), 110.0f);
                boolean z3 = (i2 & 7168) == 2048;
                Object objT = x340Var.T();
                if (z3 || objT == fkj0.X) {
                    objT = new isr0(function0, (byte) 8);
                    x340Var.s0(objT);
                }
                t1c.a(bin.x(qim0VarH2, false, null, null, null, (Function0) objT, 15), x340Var, 0);
                z = true;
                x340Var.r(true);
                x340Var.r(false);
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r9g0(f, j, function0, qim0Var2, j2iVar, i);
        }
    }

    public static final void g(int i, int i2, b0k b0kVar, boolean z) {
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1546175426);
        int i3 = (x340Var.h(z) ? 4 : 2) | i2 | (x340Var.e(i) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            z2 = z;
            fq7.g(z2, (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(-1882148886, new ut1(x340Var.k(t4k.h), i, (byte) 8), x340Var), x340Var, (i3 & 14) | 196608, 30);
        } else {
            z2 = z;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zdx(z2, i, i2);
        }
    }

    public static final void h(String str, String str2, boolean z, b0k b0kVar, int i) {
        u7h m231Var;
        lee1 lee1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(869027421);
        int i2 = (x340Var.h(z) ? 256 : 128) | i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            try {
                m231Var = new u7h(z4p1.e(Color.parseColor(str2)));
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            u7h u7hVar = m231Var;
            long j = u7hVar != null ? u7hVar.a : u7h.f;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            if (z) {
                x340Var.i0(1911704775);
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(x340Var).g;
            } else {
                x340Var.i0(1911705862);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(x340Var).j;
            }
            x340Var.r(false);
            uwo1.e(str, qim0VarF, lee1Var, j, new a0e1(5), null, 2, false, new cjc0(2), 0, null, x340Var, i2 & 14, 0, 1696);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke3(i, str, str2, z);
        }
    }

    public static final void i(pdi0 pdi0Var, boolean z, b0k b0kVar, int i) {
        b0k b0kVar2;
        lee1 lee1Var;
        u7h m231Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1689076981);
        int i2 = (b0kVar3.i(pdi0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = pdi0Var.a;
            if (z) {
                b0kVar3.i0(294663797);
                uwr uwrVar = cbx.a;
                lee1Var = cbx.d(b0kVar3).c;
            } else {
                b0kVar3.i0(294664886);
                uwr uwrVar2 = cbx.a;
                lee1Var = cbx.d(b0kVar3).d;
            }
            b0kVar3.r(false);
            lee1 lee1Var2 = lee1Var;
            try {
                m231Var = new u7h(z4p1.e(Color.parseColor(pdi0Var.b)));
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            u7h u7hVar = m231Var;
            long j = u7hVar != null ? u7hVar.a : u7h.f;
            cjc0 cjc0Var = new cjc0(2);
            uwr uwrVar3 = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(str, null, lee1Var2, j, null, null, 2, false, cjc0Var, 0, new px8(cbx.d(b0kVar3).e.a.b, cbx.d(b0kVar3).d.a.b, 0L, (mx8) null, 12), b0kVar2, 0, 8, 690);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cw1(pdi0Var, z, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void j(rdi0 rdi0Var, tob1 tob1Var, fns fnsVar, boolean z, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        u7h m231Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-708707899);
        int i2 = (x340Var.h(z) ? 2048 : 1024) | i | (x340Var.i(rdi0Var) ? 4 : 2) | (x340Var.i(tob1Var) ? 32 : 16) | (x340Var.i(fnsVar) ? 256 : 128);
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (rdi0Var instanceof pdi0) {
            x340Var.i0(1831516228);
            i((pdi0) rdi0Var, z, x340Var, ((i2 >> 6) & 112) | (i2 & 14));
            x340Var.r(false);
        } else {
            if (!(rdi0Var instanceof qdi0)) {
                throw p3d1.k(x340Var, 1831513724, false);
            }
            x340Var.i0(942500390);
            String str = ((qdi0) rdi0Var).a;
            try {
                m231Var = new u7h(z4p1.e(Color.parseColor(((qdi0) rdi0Var).b)));
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            u7h u7hVar = m231Var;
            crn1.h(fnsVar, str, u7hVar != null ? u7hVar.a : u7h.f, tob1Var, z, null, x340Var, ((i2 >> 6) & 14) | ((i2 << 6) & 7168) | ((i2 << 3) & 57344));
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90((Object) rdi0Var, (Object) tob1Var, (Object) fnsVar, z, i, (byte) 13);
        }
    }

    public static AtomicReference k() {
        return new AtomicReference(null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.credentials.internal.FrameworkClassParsingException */
    public static CreateCredentialException l(String str, String str2) {
        Exception excW;
        try {
            CreatePublicKeyCredentialDomException createPublicKeyCredentialDomException = new CreatePublicKeyCredentialDomException((String) null, new w0((byte) 26));
            if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excW = crm0.w(new w0((byte) 0), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excW = crm0.w(new w0((byte) 1), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excW = crm0.w(new w0((byte) 2), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excW = crm0.w(new w0((byte) 3), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excW = crm0.w(new w0((byte) 4), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excW = crm0.w(new w0((byte) 5), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excW = crm0.w(new w0((byte) 6), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excW = crm0.w(new w0((byte) 7), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excW = crm0.w(new w0((byte) 8), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excW = crm0.w(new w0((byte) 9), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excW = crm0.w(new w0((byte) 10), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excW = crm0.w(new w0((byte) 11), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excW = crm0.w(new w0((byte) 12), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excW = crm0.w(new w0((byte) 13), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excW = crm0.w(new w0((byte) 14), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excW = crm0.w(new w0((byte) 15), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excW = crm0.w(new w0((byte) 16), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excW = crm0.w(new w0((byte) 17), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excW = crm0.w(new w0((byte) 18), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excW = crm0.w(new w0((byte) 19), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excW = crm0.w(new w0((byte) 20), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excW = crm0.w(new w0((byte) 21), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excW = crm0.w(new w0((byte) 22), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excW = crm0.w(new w0((byte) 23), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excW = crm0.w(new w0((byte) 24), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excW = crm0.w(new w0((byte) 25), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excW = crm0.w(new w0((byte) 26), str2, createPublicKeyCredentialDomException);
            } else if (str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excW = crm0.w(new w0((byte) 27), str2, createPublicKeyCredentialDomException);
            } else {
                if (!str.equals("androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                excW = crm0.w(new w0((byte) 28), str2, createPublicKeyCredentialDomException);
            }
            return (CreateCredentialException) excW;
        } catch (FrameworkClassParsingException unused) {
            return new CreateCredentialCustomException(str, str2);
        }
    }

    public static final txs0 m(ro41 ro41Var) {
        Object next;
        Iterator it = ro41Var.i.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((txs0) next).c) {
                return (txs0) next;
            }
        }
        next = null;
        return (txs0) next;
    }

    public static final Object n(AtomicReference atomicReference) {
        rg61 rg61Var = (rg61) atomicReference.get();
        if (rg61Var != null) {
            return rg61Var.b;
        }
        return null;
    }

    public static final int o(ro41 ro41Var) {
        List<gxs0> list = ro41Var.c;
        int i = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        for (gxs0 gxs0Var : list) {
            if ((gxs0Var instanceof gxs0) && gxs0Var.d && (i = i + 1) < 0) {
                p7h.S();
                throw null;
            }
        }
        return i;
    }

    public static final int p(ro41 ro41Var) {
        return Math.max(ro41Var.h - o(ro41Var), 0);
    }

    public static final ArrayList q(ro41 ro41Var) {
        return o7h.N0(o7h.j0(ro41Var.t), z561.k0(new sgg1(zy00.f, z561.T(zy00.e, z561.f0(zy00.d, new i46(ro41Var.c, (byte) 1))))));
    }

    public static final go80 r(klm klmVar, ibp0 ibp0Var, ibp0 ibp0Var2, ibp0 ibp0Var3, ibp0 ibp0Var4, ibp0 ibp0Var5, ibp0 ibp0Var6, ibp0 ibp0Var7, ibp0 ibp0Var8, ibp0 ibp0Var9, ibp0 ibp0Var10, ibp0 ibp0Var11, ibp0 ibp0Var12, ibp0 ibp0Var13, ibp0 ibp0Var14, ibp0 ibp0Var15, yap0 yap0Var, ibp0 ibp0Var16, ibp0 ibp0Var17, sap0 sap0Var) {
        return klmVar.a("AccountSwitcherCredentialsDaemon", new lap0(ibp0Var, ibp0Var2, ibp0Var3, ibp0Var4, ibp0Var5, ibp0Var6, ibp0Var7, ibp0Var8, ibp0Var9, ibp0Var10, ibp0Var11, ibp0Var12, ibp0Var13, ibp0Var14, ibp0Var15, yap0Var, ibp0Var16, ibp0Var17, sap0Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object s(gw70 gw70Var, String str, yr80 yr80Var, onm onmVar) {
        l0c0 l0c0Var;
        if (onmVar instanceof l0c0) {
            l0c0Var = (l0c0) onmVar;
            int i = l0c0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                l0c0Var.b = i - Integer.MIN_VALUE;
            } else {
                l0c0Var = new l0c0(onmVar);
            }
        } else {
            l0c0Var = new l0c0(onmVar);
        }
        Object objJ = l0c0Var.a;
        int i2 = l0c0Var.b;
        if (i2 == 0) {
            hm5.M(objJ);
            ixg ixgVarF = gw70Var.f(str);
            if (yr80Var != null) {
                long j = yr80Var.a;
                ixgVarF.p((int) (j >> 32), (int) (j & 4294967295L), 2);
                ixgVarF.b.o = dg41.b;
            }
            ixgVarF.g = false;
            Single singleI = ixgVarF.i();
            l0c0Var.b = 1;
            objJ = fc11.j(singleI, l0c0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return objJ;
    }

    public static boolean t(u25 u25Var) {
        return u25Var.c();
    }

    public static final boolean u(ro41 ro41Var) {
        return o(ro41Var) >= ro41Var.h;
    }

    public static final hgx v(vfx vfxVar) {
        return new hgx(vfxVar.a, vfxVar.b, (byte) 0);
    }

    public static final Object w(jq70 jq70Var, gw70 gw70Var, long j, a8d1 a8d1Var) {
        if (jq70Var instanceof tp70) {
            return ((tp70) jq70Var).a;
        }
        if (jq70Var instanceof wp70) {
            return s(gw70Var, ((wp70) jq70Var).a, new yr80(j), a8d1Var);
        }
        eg.o();
        return null;
    }

    public static final String x(String str, String str2) {
        int iW0 = ihc1.w0(str, "\n----\n*Device & App Info:*", 0, false, 6);
        if (iW0 < 0) {
            return xcg1.i(str, "\n\n", str2);
        }
        return ihc1.M0(str, iW0, iW0, "\n\n" + str2).toString();
    }

    public static final Bitmap y(Bitmap bitmap, Bitmap bitmap2, long j) {
        float fMin = Math.min(((int) (j >> 32)) / bitmap.getWidth(), ((int) (j & 4294967295L)) / bitmap.getHeight());
        if (fMin >= 1.0f) {
            return jon1.O(bitmap, bitmap2);
        }
        int width = (int) (bitmap.getWidth() * fMin);
        if (width < 1) {
            width = 1;
        }
        int height = (int) (bitmap.getHeight() * fMin);
        int i = height >= 1 ? height : 1;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.getClass();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, width, i), new Paint(2));
            jon1.k(canvas, bitmap2, width, i);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    public static final Object z(AtomicReference atomicReference, iu30 iu30Var, vu30 vu30Var, onm onmVar) {
        return smo1.s(new ciw0(iu30Var, atomicReference, vu30Var, (lnm) null, (byte) 18), onmVar);
    }
}
