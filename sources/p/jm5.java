package p;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.tooling.DiagnosticComposeException;
import androidx.glance.session.TimeoutCancellationException;
import com.spotify.mobius.Next;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class jm5 {
    public static final float[] a = {0.10248421f, 0.4999985f, 0.8975158f};
    public static b180 b;
    public static b180 c;

    public static /* synthetic */ void a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final void b(int i, long j, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1899462675);
        int i2 = (x340Var.f(j) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarR = u291.r(qim0Var3, 16.0f);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ps((byte) 1, j);
                x340Var.s0(objT);
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarR);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e82(j, qim0Var2, i, (byte) 0);
        }
    }

    public static final void c(int i, String str, String str2, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2128070003);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            uwo1.e(str, (qim0) null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2034);
            uwo1.e(str2, (qim0) null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b071(str, str2, qim0Var2, i, (byte) 5);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1666193438);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            cso1.e(cyo1.x(x340Var, 2131233094), u291.r(qim0Var, 16.0f), (j6m) null, (tl3) null, x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 29);
        }
    }

    public static final void e(int i, String str, b0k b0kVar, qim0 qim0Var) {
        byte b2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(922264573);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            vbe.s(cwl1.o0(x340Var, 2131957795), (qim0) null, cbx.a(x340Var).b.c, 0L, cbx.d(x340Var).k, false, x340Var, 196608, 10);
            b2 = 1;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b2 = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pij1(str, qim0Var2, i, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x013b  */
    /* JADX WARN: Code duplicated, block: B:42:0x014d  */
    /* JADX WARN: Code duplicated, block: B:45:0x018e  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:54:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void f(String str, String str2, qim0 qim0Var, boolean z, b0k b0kVar, int i, int i2) {
        boolean z2;
        boolean z3;
        qim0 qim0Var2;
        boolean z4;
        h311 h311VarV;
        qim0 qim0Var3;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        qim0 qim0Var4;
        boolean z5;
        boolean z6;
        float f;
        float f2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(2093883073);
        int i3 = (x340Var2.g(str) ? 4 : 2) | i | (x340Var2.g(str2) ? 32 : 16);
        int i4 = i3 | 384;
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i4 |= x340Var2.h(z2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var2.Y(i4 & 1, z3)) {
                if (i5 != 0) {
                    z2 = false;
                }
                qim0Var3 = nim0.a;
                qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
                mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                iHashCode = Long.hashCode(x340Var2.T);
                xos0VarM = x340Var2.m();
                qim0VarE = zr7.E(x340Var2, qim0VarF);
                hzj.A.getClass();
                if (x340Var2.a != null) {
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
                if (z2) {
                    x340Var2.i0(-990511761);
                    String strO0 = cwl1.o0(x340Var2, 2131957795);
                    uwr uwrVar = cbx.a;
                    qim0Var4 = qim0Var3;
                    z5 = false;
                    vbe.s(strO0, (qim0) null, cbx.a(x340Var2).b.c, cbx.a(x340Var2).b.c, cbx.d(x340Var2).k, false, x340Var2, 0, 34);
                    x340Var2.r(false);
                    z6 = true;
                } else {
                    qim0Var4 = qim0Var3;
                    z5 = false;
                    x340Var2.i0(-990218997);
                    String strO1 = cwl1.o0(x340Var2, 2131957795);
                    uwr uwrVar2 = cbx.a;
                    z6 = true;
                    uwo1.e(strO1, (qim0) null, cbx.d(x340Var2).k, cbx.a(x340Var2).c.f, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                    x340Var2 = x340Var2;
                    x340Var2.r(false);
                }
                f = 2.0f;
                if (z2 != 0) {
                    x340Var2.i0(-724669441);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    x340Var2.r(z5);
                    f2 = 6.0f;
                } else {
                    x340Var2.i0(-724667809);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    x340Var2.r(z5);
                    f2 = 2.0f;
                }
                op71.g(x340Var2, u291.h(qim0Var4, f2));
                x340Var = x340Var2;
                uwo1.e(str, (qim0) null, cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i4 & 14, 0, 2034);
                if (z2 != 0) {
                    x340Var.i0(-724659234);
                    cvx cvxVar3 = cbx.b(x340Var).b;
                    x340Var.r(z5);
                    f = 12.0f;
                } else {
                    x340Var.i0(-724657633);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    x340Var.r(z5);
                }
                op71.g(x340Var, u291.h(qim0Var4, f));
                uwo1.e(str2, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i4 >> 3) & 14, 0, 2034);
                x340Var2 = x340Var;
                x340Var2.r(z6);
                z4 = z2;
                qim0Var2 = qim0Var4;
            } else {
                x340Var2.b0();
                qim0Var2 = qim0Var;
                z4 = z2;
            }
            h311VarV = x340Var2.v();
            if (h311VarV != null) {
                h311VarV.d = new sl(str, str2, qim0Var2, z4, i, i2, (byte) 2);
            }
        }
        i4 = i3 | 3456;
        z2 = z;
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var2.Y(i4 & 1, z3)) {
            if (i5 != 0) {
                z2 = false;
            }
            qim0Var3 = nim0.a;
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            iHashCode = Long.hashCode(x340Var2.T);
            xos0VarM = x340Var2.m();
            qim0VarE = zr7.E(x340Var2, qim0VarF2);
            hzj.A.getClass();
            if (x340Var2.a != null) {
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
            if (z2) {
                x340Var2.i0(-990511761);
                String strO2 = cwl1.o0(x340Var2, 2131957795);
                uwr uwrVar3 = cbx.a;
                qim0Var4 = qim0Var3;
                z5 = false;
                vbe.s(strO2, (qim0) null, cbx.a(x340Var2).b.c, cbx.a(x340Var2).b.c, cbx.d(x340Var2).k, false, x340Var2, 0, 34);
                x340Var2.r(false);
                z6 = true;
            } else {
                qim0Var4 = qim0Var3;
                z5 = false;
                x340Var2.i0(-990218997);
                String strO3 = cwl1.o0(x340Var2, 2131957795);
                uwr uwrVar4 = cbx.a;
                z6 = true;
                uwo1.e(strO3, (qim0) null, cbx.d(x340Var2).k, cbx.a(x340Var2).c.f, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                x340Var2 = x340Var2;
                x340Var2.r(false);
            }
            f = 2.0f;
            if (z2 != 0) {
                x340Var2.i0(-724669441);
                cvx cvxVar5 = cbx.b(x340Var2).b;
                x340Var2.r(z5);
                f2 = 6.0f;
            } else {
                x340Var2.i0(-724667809);
                cvx cvxVar6 = cbx.b(x340Var2).b;
                x340Var2.r(z5);
                f2 = 2.0f;
            }
            op71.g(x340Var2, u291.h(qim0Var4, f2));
            x340Var = x340Var2;
            uwo1.e(str, (qim0) null, cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i4 & 14, 0, 2034);
            if (z2 != 0) {
                x340Var.i0(-724659234);
                cvx cvxVar7 = cbx.b(x340Var).b;
                x340Var.r(z5);
                f = 12.0f;
            } else {
                x340Var.i0(-724657633);
                cvx cvxVar8 = cbx.b(x340Var).b;
                x340Var.r(z5);
            }
            op71.g(x340Var, u291.h(qim0Var4, f));
            uwo1.e(str2, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i4 >> 3) & 14, 0, 2034);
            x340Var2 = x340Var;
            x340Var2.r(z6);
            z4 = z2;
            qim0Var2 = qim0Var4;
        } else {
            x340Var2.b0();
            qim0Var2 = qim0Var;
            z4 = z2;
        }
        h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new sl(str, str2, qim0Var2, z4, i, i2, (byte) 2);
        }
    }

    public static final void g(Throwable th, Function0 function0) {
        r(th, function0);
    }

    public static final Object h(r4r r4rVar, vu30 vu30Var, onm onmVar) {
        return r4rVar.a(new dt40(vu30Var, (lnm) null, (byte) 4), onmVar);
    }

    public static luk0 i(Integer num, r6h1 r6h1Var) {
        return new luk0(num, r6h1Var);
    }

    public static final boolean j(int i, int i2) {
        return i == i2;
    }

    public static final View k(Activity activity) {
        if (dhn.a.contains(jm5.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            dhn.a(jm5.class, th);
            return null;
        }
    }

    public static int l(int i) {
        return Integer.hashCode(i);
    }

    public static final boolean m() {
        String str = Build.FINGERPRINT;
        if (nhc1.Y(str, "generic", false) || nhc1.Y(str, "unknown", false)) {
            return true;
        }
        String str2 = Build.MODEL;
        if (ihc1.h0(str2, "google_sdk", false) || ihc1.h0(str2, "Emulator", false) || ihc1.h0(str2, "Android SDK built for x86", false) || ihc1.h0(Build.MANUFACTURER, "Genymotion", false)) {
            return true;
        }
        return (nhc1.Y(Build.BRAND, "generic", false) && nhc1.Y(Build.DEVICE, "generic", false)) || "google_sdk".equals(Build.PRODUCT);
    }

    public static final boolean n(ccd0 ccd0Var) {
        return ccd0Var.f && ccd0Var.d;
    }

    public static l1h1 o(List list, j1h1 j1h1Var, n9r n9rVar, ArrayList arrayList) {
        if (j1h1Var == null) {
            a(1);
            throw null;
        }
        if (n9rVar == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        l1h1 l1h1VarP = p(list, j1h1Var, n9rVar, arrayList, null);
        if (l1h1VarP != null) {
            return l1h1VarP;
        }
        eg.f("Substitution failed");
        return null;
    }

    public static l1h1 p(List list, j1h1 j1h1Var, n9r n9rVar, List list2, boolean[] zArr) {
        byte b2;
        if (j1h1Var == null) {
            a(6);
            throw null;
        }
        if (n9rVar == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            b2 = 1;
            if (!it.hasNext()) {
                break;
            }
            y0h1 y0h1Var = (y0h1) it.next();
            z0h1 z0h1VarZ1 = z0h1.z1(y0h1Var.x(), i, y0h1Var.getAnnotations(), n9rVar, y0h1Var.getName(), y0h1Var.J(), y0h1Var.u());
            map.put(y0h1Var.g(), new f1h1(1, z0h1VarZ1.m()));
            map2.put(y0h1Var, z0h1VarZ1);
            list2.add(z0h1VarZ1);
            i++;
        }
        qhb1 qhb1Var = new qhb1(map, b2);
        l1h1 l1h1VarE = l1h1.e(j1h1Var, qhb1Var);
        l1h1 l1h1VarE2 = l1h1.e(new uod(j1h1Var, b2), qhb1Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            y0h1 y0h1Var2 = (y0h1) it2.next();
            z0h1 z0h1Var = (z0h1) map2.get(y0h1Var2);
            for (a8b0 a8b0Var : y0h1Var2.getUpperBounds()) {
                jfg jfgVarS = a8b0Var.t0().s();
                a8b0 a8b0VarH = (((jfgVarS instanceof y0h1) && rzn1.w((y0h1) jfgVarS, (h0h1) null, (Set) null)) ? l1h1VarE : l1h1VarE2).h(3, a8b0Var);
                if (a8b0VarH == null) {
                    return null;
                }
                if (a8b0VarH != a8b0Var && zArr != null) {
                    zArr[0] = true;
                }
                if (z0h1Var.Z) {
                    eg.m("Type parameter descriptor is already initialized: ".concat(z0h1Var.B1()));
                    return null;
                }
                if (!d4o1.i(a8b0VarH)) {
                    z0h1Var.Y.add(a8b0VarH);
                }
            }
            if (z0h1Var.Z) {
                eg.m("Type parameter descriptor is already initialized: ".concat(z0h1Var.B1()));
                return null;
            }
            z0h1Var.Z = true;
        }
        return l1h1VarE;
    }

    public static String q(int i) {
        if (i == 0) {
            return "Clear";
        }
        if (i == 1) {
            return "Src";
        }
        if (i == 2) {
            return "Dst";
        }
        if (i == 3) {
            return "SrcOver";
        }
        if (i == 4) {
            return "DstOver";
        }
        if (i == 5) {
            return "SrcIn";
        }
        if (i == 6) {
            return "DstIn";
        }
        if (i == 7) {
            return "SrcOut";
        }
        if (i == 8) {
            return "DstOut";
        }
        if (i == 9) {
            return "SrcAtop";
        }
        if (i == 10) {
            return "DstAtop";
        }
        if (i == 11) {
            return "Xor";
        }
        if (i == 12) {
            return "Plus";
        }
        if (i == 13) {
            return "Modulate";
        }
        if (i == 14) {
            return "Screen";
        }
        if (i == 15) {
            return "Overlay";
        }
        if (i == 16) {
            return "Darken";
        }
        if (i == 17) {
            return "Lighten";
        }
        if (i == 18) {
            return "ColorDodge";
        }
        if (i == 19) {
            return "ColorBurn";
        }
        if (i == 20) {
            return "HardLight";
        }
        if (i == 21) {
            return "Softlight";
        }
        if (i == 22) {
            return "Difference";
        }
        if (i == 23) {
            return "Exclusion";
        }
        if (i == 24) {
            return "Multiply";
        }
        if (i == 25) {
            return "Hue";
        }
        if (i == 26) {
            return "Saturation";
        }
        if (i == 27) {
            return "Color";
        }
        return i == 28 ? "Luminosity" : "Unknown";
    }

    public static final boolean r(Throwable th, Function0 function0) {
        List listAsList;
        Object objInvoke;
        Integer num = go90.a;
        DiagnosticComposeException diagnosticComposeException = null;
        if (num == null || num.intValue() >= 19) {
            listAsList = Arrays.asList(th.getSuppressed());
        } else {
            Method method = tct0.b;
            listAsList = (method == null || (objInvoke = method.invoke(th, null)) == null) ? z6x.a : Arrays.asList((Throwable[]) objInvoke);
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) listAsList.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            xyj xyjVar = (xyj) function0.invoke();
            if (xyjVar != null) {
                boolean z2 = xyjVar.b;
                List list = xyjVar.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((zyj) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                xyjVar.getClass();
                diagnosticComposeException = new DiagnosticComposeException(xyjVar);
            }
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (diagnosticComposeException != null) {
            j2h1.h(th, diagnosticComposeException);
        }
        return z;
    }

    public static Next s(kak0 kak0Var, r1k0 r1k0Var) {
        return Next.i(kak0.a(kak0Var, ndm0.a, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048575), Collections.singleton(new f0k0(kak0Var.S0, r1k0Var.a)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.glance.session.TimeoutCancellationException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object t(t8e1 t8e1Var, lc41 lc41Var, onm onmVar) throws TimeoutCancellationException {
        pve1 pve1Var;
        if (onmVar instanceof pve1) {
            pve1Var = (pve1) onmVar;
            int i = pve1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pve1Var.c = i - Integer.MIN_VALUE;
            } else {
                pve1Var = new pve1(onmVar);
            }
        } else {
            pve1Var = new pve1(onmVar);
        }
        Object obj = pve1Var.b;
        int i2 = pve1Var.c;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lc41 lc41Var2 = pve1Var.a;
                hm5.M(obj);
                return obj;
            }
            hm5.M(obj);
            pve1Var.a = lc41Var;
            pve1Var.c = 1;
            Object objS = smo1.s(new bfb1(lc41Var, t8e1Var, (lnm) null, (byte) 15), pve1Var);
            d9n d9nVar = d9n.a;
            return objS == d9nVar ? d9nVar : objS;
        } catch (TimeoutCancellationException e) {
            if (e.b == lc41Var.hashCode()) {
                return null;
            }
            throw e;
        }
    }
}
