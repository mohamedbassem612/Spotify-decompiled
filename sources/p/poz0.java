package p;

import android.content.res.Resources;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.AdvertisementType;
import com.comscore.streaming.ContentType;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableNever;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class poz0 {
    public static b180 a;

    public static e280 B(Object obj) {
        return obj == null ? e280.c : new e280(obj, (byte) 0);
    }

    public static final boolean C(z1g1 z1g1Var) {
        ArrayList arrayList = z1g1Var.k;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((w1g1) it.next()).b, arrayList2);
        }
        return arrayList2.contains("MOGEF-19+");
    }

    public static final boolean D(z1g1 z1g1Var) {
        if (!z1g1Var.m.isEmpty()) {
            return false;
        }
        ArrayList arrayList = z1g1Var.n;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r7h.W(((v1g1) it.next()).a, arrayList2);
        }
        return u890.j(o7h.X0(arrayList2), "premium");
    }

    public static int E(int i, int i2) {
        return (i << 3) | i2;
    }

    public static n8d0 F(n8d0 n8d0Var) {
        n8d0Var.getClass();
        return n8d0Var.isDone() ? n8d0Var : upn1.t(new mx30(n8d0Var, (byte) 1));
    }

    public static void G(boolean z, n8d0 n8d0Var, mzc mzcVar, n5u n5uVar) {
        n8d0Var.getClass();
        mzcVar.getClass();
        n5uVar.getClass();
        n8d0Var.b(new nx30((Object) n8d0Var, (Object) new h0y(mzcVar, (byte) 16), (byte) 0), n5uVar);
        if (z) {
            mzcVar.a(new a6n(n8d0Var, (byte) 25), n5u.a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public static final boolean H(k4a0 k4a0Var, k4a0 k4a0Var2) {
        boolean zEquals;
        si41 si41Var = k4a0Var.a;
        si41 si41Var2 = k4a0Var2.a;
        boolean z = si41Var2.d != null && k4a0Var2.b.contains(r2a0.b.a);
        boolean z2 = si41Var.d != null && k4a0Var.b.contains(r2a0.b.a);
        String str = si41Var.d;
        String str2 = si41Var2.d;
        if (str == null) {
            if (str2 == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str2 == null) {
            zEquals = false;
        } else {
            zEquals = str.equals(str2);
        }
        return z && !(z2 && zEquals);
    }

    public static final boolean I(k4a0 k4a0Var) {
        si41 si41Var = k4a0Var.a;
        if (!si41Var.a || si41Var.d == null) {
            return false;
        }
        return !si41Var.b || si41Var.c;
    }

    public static dce J(n8d0 n8d0Var, ci7 ci7Var, Executor executor) {
        dce dceVar = new dce(ci7Var, n8d0Var);
        n8d0Var.b(dceVar, executor);
        return dceVar;
    }

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1371058145);
        j06 j06Var = x340Var.a;
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0Var = nim0.a;
            qim0 qim0VarR = d7e.r(1.0f, uyn1.x(qim0Var, 4.0f), false);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarR, jA, er31.b(4.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            qim0 qim0VarR2 = u291.r(qim0Var, 24.0f);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarR2);
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
            w0h1.a(hrx.c, new jsl(cwl1.o0(x340Var, 2131952331)), (qim0) null, cbx.a(x340Var).b.b, 0L, false, x340Var, hrx.d, 52);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 7);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(i04 i04Var, Function0 function0, qim0 qim0Var, Function0 function1, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        qim0 qim0Var3;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2052460201);
        int i2 = i | (x340Var.g(i04Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384 | (x340Var.i(function1) ? SemanticState.Modal : SemanticState.ReadOnly);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            if (objT == obj) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            boolean zBooleanValue = ((Boolean) k1u.m(idn0Var, x340Var, 0).getValue()).booleanValue();
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = irn1.j0();
                x340Var.s0(objT2);
            }
            fe5 fe5Var = (zu91) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = irn1.o0(AdvertisementType.OTHER, 0, new ceo(0.3f, 0.0f, 0.0f, 1.0f), 2);
                x340Var.s0(objT3);
            }
            tob1 tob1VarB = z95.b(zBooleanValue ? 0.96f : 1.0f, zBooleanValue ? fe5Var : (pxg1) objT3, "AnchorCardScale", (iu30) null, x340Var, 3072, 20);
            Object objT4 = x340Var.T();
            if (objT4 == obj) {
                objT4 = yv91.a(new bu2(tob1VarB, (byte) 1));
                x340Var.s0(objT4);
            }
            tob1 tob1Var = (tob1) objT4;
            ven0 ven0VarS = v8r.s(function0, x340Var);
            ven0 ven0VarS2 = v8r.s(function1, x340Var);
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = new ma0(ven0VarS, (byte) 13);
                x340Var.s0(objT5);
            }
            Function0 function2 = (Function0) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == obj) {
                objT6 = new ma0(ven0VarS2, (byte) 14);
                x340Var.s0(objT6);
            }
            Function0 function3 = (Function0) objT6;
            boolean zBooleanValue2 = ((Boolean) tob1Var.getValue()).booleanValue();
            qim0 qim0Var4 = nim0.a;
            if (zBooleanValue2) {
                x340Var.i0(1688384563);
                boolean zI = x340Var.i(tob1VarB);
                Object objT7 = x340Var.T();
                if (zI || objT7 == obj) {
                    objT7 = new lq2(tob1VarB, (byte) 1);
                    x340Var.s0(objT7);
                }
                qim0 qim0VarC = i541.C(qim0Var4, (iu30) objT7);
                x340Var.r(false);
                qim0Var3 = qim0VarC;
            } else {
                x340Var.i0(1688520343);
                x340Var.r(false);
                qim0Var3 = qim0Var4;
            }
            qim0 qim0VarY = bin.y(qim0Var3, idn0Var, (ga80) null, false, (String) null, new pm31(0), (String) null, function3, function2, 428);
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
            if (i04Var instanceof g04) {
                x340Var.i0(1598058516);
                a(null, x340Var, 0);
                x340Var.r(false);
            } else {
                if (!(i04Var instanceof h04)) {
                    throw p3d1.k(x340Var, 1598057420, false);
                }
                x340Var.i0(1598059801);
                e((h04) i04Var, x340Var, ((i2 << 3) & ContentType.LONG_FORM_ON_DEMAND) | 6);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i04Var, function0, qim0Var2, function1, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x015b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0166  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void c(int i, int i2, Function0 function0, b0k b0kVar, boolean z) {
        boolean z2;
        int i3;
        Function0 function1;
        boolean z3;
        boolean z4;
        Function0 function2;
        h311 h311VarV;
        boolean z5;
        Function0 function3;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        jax haxVar;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(723807664);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = i | (x340Var.h(z2) ? 4 : 2);
        } else {
            z2 = z;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                function1 = function0;
                i3 |= x340Var.i(function1) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i5 != 0) {
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = i0f0.d1;
                        x340Var.s0(objT);
                    }
                    function3 = (Function0) objT;
                } else {
                    function3 = function1;
                }
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarY = voo1.y(uyn1.B(qim0VarF, 0.0f, 16.0f, 0.0f, 0.0f, 13), voo1.g);
                float f = cbx.b(x340Var).e.b;
                float f2 = cbx.b(x340Var).e.b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(qim0VarY, f, 0.0f, f2, 16.0f, 2);
                gfh0VarC = t1c.c(een.e, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                if (x340Var.a != null) {
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
                gbx gbxVar = new gbx(z50.c, function3);
                Function0 function4 = function3;
                idx idxVar = new idx(6);
                if (z5) {
                    x340Var.i0(368262142);
                    x340Var.r(false);
                    haxVar = jax.a;
                } else {
                    x340Var.i0(368264059);
                    haxVar = new hax(cwl1.o0(x340Var, 2131957898));
                    x340Var.r(false);
                }
                foo1.c(gbxVar, idxVar, (qim0) null, haxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, fyi.b, x340Var, 0, 48, 2028);
                x340Var.r(true);
                z4 = z5;
                function2 = function4;
            } else {
                x340Var.b0();
                z4 = z2;
                function2 = function1;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new rta0((byte) 1, i, i2, function2, z4);
            }
        }
        i3 |= 48;
        function1 = function0;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (i5 != 0) {
                objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = i0f0.d1;
                    x340Var.s0(objT);
                }
                function3 = (Function0) objT;
            } else {
                function3 = function1;
            }
            qim0 qim0VarF2 = u291.f(nim0.a, 1.0f);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarY2 = voo1.y(uyn1.B(qim0VarF2, 0.0f, 16.0f, 0.0f, 0.0f, 13), voo1.g);
            float f3 = cbx.b(x340Var).e.b;
            float f4 = cbx.b(x340Var).e.b;
            cvx cvxVar4 = cbx.b(x340Var).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarY2, f3, 0.0f, f4, 16.0f, 2);
            gfh0VarC = t1c.c(een.e, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarB2);
            hzj.A.getClass();
            if (x340Var.a != null) {
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
            gbx gbxVar2 = new gbx(z50.c, function3);
            Function0 function5 = function3;
            idx idxVar2 = new idx(6);
            if (z5) {
                x340Var.i0(368262142);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(368264059);
                haxVar = new hax(cwl1.o0(x340Var, 2131957898));
                x340Var.r(false);
            }
            foo1.c(gbxVar2, idxVar2, (qim0) null, haxVar, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, fyi.b, x340Var, 0, 48, 2028);
            x340Var.r(true);
            z4 = z5;
            function2 = function5;
        } else {
            x340Var.b0();
            z4 = z2;
            function2 = function1;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rta0((byte) 1, i, i2, function2, z4);
        }
    }

    public static final void d(bff0 bff0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1224696818);
        int i2 = i | (b0kVar2.i(bff0Var) ? 32 : 16) | (b0kVar2.i(function0) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar2.i(function1) ? SemanticState.Modal : SemanticState.ReadOnly);
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 >> 3;
            j(bff0Var, 0, function1, b0kVar2, (i3 & 896) | (i3 & 14) | 48);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            if (!(((double) 1.0f) > 0.0d)) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarThen = qim0VarF.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(qim0VarThen, cbx.b(b0kVar2).b.b);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, b0kVar2, 54);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarX);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            uwo1.e(cwl1.o0(b0kVar2, 2131957899), (qim0) null, cbx.d(b0kVar2).g, z4p1.e(bff0Var.d), (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
            b0kVar2 = b0kVar2;
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            foo1.c(new gbx(z50.c, function0), jdx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1712505241, new mbf0(bff0Var, (byte) 3), b0kVar2), b0kVar2, 48, 48, 2044);
            b0kVar2.r(true);
            c(0, 3, null, b0kVar2, false);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qae0(bff0Var, function0, function1, i, (byte) 17);
        }
    }

    public static final void e(h04 h04Var, b0k b0kVar, int i) {
        int i2;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1757986812);
        int i3 = i & 6;
        h2c h2cVar = h2c.a;
        if (i3 == 0) {
            i2 = (x340Var.i(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(h04Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarX = uyn1.x(nim0Var, 4.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            bpo1.c(h04Var.b, h04Var.d, (qim0) null, z37.c, false, u7h.b, false, x340Var, 24576, 196);
            x340Var.r(true);
            if (h04Var.c) {
                x340Var.i0(-1551347227);
                qim0 qim0VarA = h2cVar.a(nim0Var, een.f);
                z = false;
                jm5.d(qim0VarA, x340Var, 0);
            } else {
                z = false;
                x340Var.i0(-847077651);
            }
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0(h04Var, i, (byte) 3);
        }
    }

    public static final void f(jpf0 jpf0Var, q8q q8qVar, vu30 vu30Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Set set = jpf0Var.g;
        String str = jpf0Var.d;
        String str2 = jpf0Var.c;
        bff0 bff0Var = jpf0Var.b;
        Set set2 = jpf0Var.f;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1113646841);
        int i2 = i | (b0kVar2.g(jpf0Var) ? 32 : 16) | (b0kVar2.i(q8qVar) ? SemanticState.Hidden : SemanticState.Focused) | (b0kVar2.i(vu30Var) ? SemanticState.Modal : SemanticState.ReadOnly) | (b0kVar2.i(function0) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (b0kVar2.i(function1) ? 131072 : 65536);
        if (b0kVar2.Y(i2 & 1, (i2 & 74899) != 74898)) {
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                int i3 = Flowable.a;
                FlowableNever flowableNever = FlowableNever.b;
                objT = q8qVar.a(flowableNever, flowableNever);
                b0kVar2.s0(objT);
            }
            xpw xpwVar = (xpw) objT;
            boolean zG = b0kVar2.g(jpf0Var.a) | b0kVar2.g(bff0Var) | b0kVar2.g(str2) | b0kVar2.g(str) | b0kVar2.g(set2);
            Object objT2 = b0kVar2.T();
            if (zG || objT2 == m4cVar) {
                Set set3 = set2;
                frf0 frf0Var = new frf0(new yqf0(str2, str, jpf0Var.a, dhf0.e, false), new erf0(new arf0(new whc0(((Number) o7h.p0(set3)).intValue(), ((Number) o7h.z0(set3)).intValue())), 1, jpf0Var.b, 1, true, true), new pm0(vu30Var, (byte) 4), klf0.O0);
                b0kVar2.s0(frf0Var);
                objT2 = frf0Var;
            }
            frf0 frf0Var2 = (frf0) objT2;
            ipb1 ipb1VarC = wpb1.C("lyrics_text_element", xpwVar, frf0Var2, b0kVar2, 518, 8);
            int i4 = i2 >> 9;
            j(bff0Var, set.size(), function1, b0kVar2, i4 & 896);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            if (!(((double) 1.0f) > 0.0d)) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarThen = qim0VarF.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false));
            uwr uwrVar = cbx.a;
            otw.c(xpwVar, frf0Var2, uyn1.x(qim0VarThen, cbx.b(b0kVar2).e.b), ipb1VarC, b0kVar2, 64, 0);
            b0kVar2 = b0kVar2;
            c(i4 & ContentType.LONG_FORM_ON_DEMAND, 0, function0, b0kVar2, !set.isEmpty());
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 28, i, jpf0Var, q8qVar, vu30Var, function0, function1);
        }
    }

    public static final void g(bff0 bff0Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1037923418);
        int i2 = (x340Var.i(bff0Var) ? 32 : 16) | i | (x340Var.i(function0) ? SemanticState.Hidden : SemanticState.Focused);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = (i2 >> 3) & 14;
            j(bff0Var, 0, function0, x340Var, (i2 & 896) | i3 | 48);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            if (!(((double) 1.0f) > 0.0d)) {
                of80.a("invalid weight; must be greater than zero");
            }
            ot11.d(bff0Var, qim0VarF.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), x340Var, i3);
            c(0, 3, null, x340Var, false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d0e0(bff0Var, function0, i, (byte) 25);
        }
    }

    public static final void h(b9l1 b9l1Var, q9l1 q9l1Var, fal1 fal1Var, m0t m0tVar, vm70 vm70Var, o0i o0iVar, gij1 gij1Var, boolean z, vu30 vu30Var, iu30 iu30Var, c2u0 c2u0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        Object axm0Var;
        o0i o0iVar2 = o0iVar;
        gij1 gij1Var2 = gij1Var;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1625043695);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(b9l1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(q9l1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(fal1Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(m0tVar) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(vm70Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? b0kVar3.g(o0iVar2) : b0kVar3.i(o0iVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= b0kVar3.g(gij1Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= b0kVar3.h(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 536870912 : 268435456;
        }
        int i3 = i2;
        boolean z2 = true;
        if (b0kVar3.Y(i3 & 1, ((i3 & 306783379) == 306783378 && ((b0kVar3.i(c2u0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            int i4 = i3 >> 12;
            ven0 ven0VarS = v8r.s(vm70Var, b0kVar3);
            ven0 ven0VarS2 = v8r.s(vu30Var, b0kVar3);
            ven0 ven0VarS3 = v8r.s(iu30Var, b0kVar3);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zG = b0kVar3.g((vm70) ven0VarS.getValue());
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                objT2 = UUID.randomUUID().toString();
                b0kVar3.s0(objT2);
            }
            objT2.getClass();
            String str = (String) objT2;
            int i5 = i3 & 3670016;
            boolean zG2 = (i5 == 1048576) | b0kVar3.g(q9l1Var) | b0kVar3.g((vm70) ven0VarS.getValue());
            Object objT3 = b0kVar3.T();
            if (zG2 || objT3 == m4cVar) {
                vm70 vm70Var2 = (vm70) ven0VarS.getValue();
                if (vm70Var2 != null) {
                    vm70Var2.setIdentifier(str);
                }
                clj1 clj1Var = gij1Var2.b;
                String str2 = clj1Var.e;
                if (ihc1.y0(str2)) {
                    str2 = "e57a3dcbd5174b20a9bfa81db99ec7d2";
                }
                objT3 = new lsm0(n3p1.q(clj1Var), new ksm0(new gec1(str2), gij1Var2.a, q9l1Var.m, q9l1Var.p, "", gij1Var2.i, gij1Var2.t, q9l1Var.e, q9l1Var.l), gij1Var2.d, false, !clj1Var.f ? new jsm0(Long.valueOf(clj1Var.c), Long.valueOf(clj1Var.d)) : null, 0L, gij1Var2.f ? new ism0(5000L) : null, str, false, 0, 1832);
                b0kVar3.s0(objT3);
            }
            lsm0 lsm0Var = (lsm0) objT3;
            boolean z3 = i5 == 1048576;
            Object objT4 = b0kVar3.T();
            if (z3 || objT4 == m4cVar) {
                objT4 = v8r.q((Object) null);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) objT4;
            boolean zG3 = b0kVar3.g((p091) ven0Var2.getValue());
            Object objT5 = b0kVar3.T();
            if (zG3 || objT5 == m4cVar) {
                p091 p091Var = (p091) ven0Var2.getValue();
                objT5 = b3k1.d;
                if (p091Var != null && p091Var.b < p091Var.a) {
                    objT5 = b3k1.b;
                }
                b0kVar3.s0(objT5);
            }
            b3k1 b3k1Var = (b3k1) objT5;
            vm70 vm70Var3 = (vm70) ven0VarS.getValue();
            boolean zG4 = b0kVar3.g(ven0VarS) | b0kVar3.e(b3k1Var.ordinal());
            Object objT6 = b0kVar3.T();
            if (zG4 || objT6 == m4cVar) {
                objT6 = new hyg0(b3k1Var, ven0VarS, (lnm) null, (byte) 16);
                b0kVar3.s0(objT6);
            }
            qxd0.s(b3k1Var, vm70Var3, (vu30) objT6, b0kVar3);
            vm70 vm70Var4 = (vm70) ven0VarS.getValue();
            r091 r091Var = (r091) ven0Var.getValue();
            boolean zG5 = b0kVar3.g(ven0VarS);
            Object objT7 = b0kVar3.T();
            if (zG5 || objT7 == m4cVar) {
                objT7 = new vs3(ven0VarS, ven0Var, (lnm) null, (byte) 6);
                b0kVar3.s0(objT7);
            }
            qxd0.s(vm70Var4, r091Var, (vu30) objT7, b0kVar3);
            r091 r091Var2 = (r091) ven0Var.getValue();
            boolean zG6 = b0kVar3.g(ven0Var2);
            Object objT8 = b0kVar3.T();
            if (zG6 || objT8 == m4cVar) {
                objT8 = new pg6(ven0Var, ven0Var2, (lnm) null, (byte) 4);
                b0kVar3.s0(objT8);
            }
            qxd0.t(r091Var2, b0kVar3, (vu30) objT8);
            p091 p091Var2 = (p091) ven0Var2.getValue();
            boolean zG7 = b0kVar3.g(ven0Var2) | b0kVar3.g(ven0VarS2);
            Object objT9 = b0kVar3.T();
            if (zG7 || objT9 == m4cVar) {
                objT9 = new vs3(ven0Var2, ven0VarS2, (lnm) null, (byte) 7);
                b0kVar3.s0(objT9);
            }
            qxd0.t(p091Var2, b0kVar3, (vu30) objT9);
            tm51 tm51Var = (tm51) b0kVar3.k(die1.a);
            r091 r091Var3 = (r091) ven0Var.getValue();
            boolean zG8 = b0kVar3.g(tm51Var);
            Object objT10 = b0kVar3.T();
            if (zG8 || objT10 == m4cVar) {
                objT10 = new uah0(tm51Var, ven0Var, (byte) 28);
                b0kVar3.s0(objT10);
            }
            qxd0.h(r091Var3, tm51Var, (iu30) objT10, b0kVar3);
            boolean zI = ((i3 & 29360128) == 8388608) | b0kVar3.i(b9l1Var) | b0kVar3.i(lsm0Var) | b0kVar3.g(ven0VarS3) | (i5 == 1048576) | b0kVar3.i(q9l1Var) | b0kVar3.i(c2u0Var) | b0kVar3.i(fal1Var) | b0kVar3.i(m0tVar);
            if ((i3 & 458752) != 131072) {
                o0iVar2 = o0iVar;
                if ((i3 & 262144) == 0 || !b0kVar3.i(o0iVar2)) {
                    z2 = false;
                }
            } else {
                o0iVar2 = o0iVar;
            }
            boolean z4 = zI | z2;
            Object objT11 = b0kVar3.T();
            if (z4 || objT11 == m4cVar) {
                gij1Var2 = gij1Var;
                b0kVar2 = b0kVar3;
                axm0Var = new axm0(ven0Var, z, b9l1Var, lsm0Var, gij1Var2, q9l1Var, c2u0Var, ven0VarS3, fal1Var, m0tVar, o0iVar2);
                b0kVar2.s0(axm0Var);
            } else {
                b0kVar2 = b0kVar3;
                axm0Var = objT11;
                gij1Var2 = gij1Var;
            }
            oto1.c(gij1Var2, o0iVar2, (iu30) axm0Var, b0kVar2, ((i3 >> 18) & 14) | 64 | (i4 & ContentType.LONG_FORM_ON_DEMAND));
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rpr(b9l1Var, q9l1Var, fal1Var, m0tVar, vm70Var, o0iVar2, gij1Var2, z, vu30Var, iu30Var, c2u0Var, i);
        }
    }

    public static final void i(String str, b0k b0kVar, int i) {
        String str2;
        psr0 psr0Var;
        h311 h311VarV;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1479296060);
        int i2 = (x340Var.i((Object) null) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (str == null || str.length() == 0) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    psr0Var = new psr0(str, i, (byte) 24);
                }
            } else {
                fra fraVar = een.N0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                cvx cvxVar2 = cbx.b(x340Var).b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarB = uyn1.B(nim0Var, 16.0f, 16.0f, 16.0f, 0.0f, 8);
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 48);
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
                x340Var.i0(1337096636);
                x340Var.r(false);
                String str3 = (str == null || str.length() <= 0) ? null : str;
                if (str3 == null) {
                    x340Var.i0(1338129773);
                    x340Var.r(false);
                    z = true;
                } else {
                    x340Var.i0(1338129774);
                    dmx dmxVar = dmx.c;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    w0h1.a(dmxVar, isl.a, u291.m(nim0Var, 16.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, dmx.d | 48, 48);
                    cvx cvxVar4 = cbx.b(x340Var).b;
                    op71.g(x340Var, u291.v(nim0Var, 6.0f));
                    cjc0 cjc0Var = new cjc0(1);
                    lee1 lee1Var = cbx.d(x340Var).j;
                    long j = cbx.a(x340Var).b.a;
                    x340Var = x340Var;
                    uwo1.e(str3, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 1572864, 0, 1714);
                    x340Var.r(false);
                    z = true;
                }
                x340Var.r(z);
                str2 = str;
            }
            h311VarV.d = psr0Var;
        }
        str2 = str;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            psr0Var = new psr0(str2, i, (byte) 25);
            h311VarV.d = psr0Var;
        }
    }

    public static final void j(bff0 bff0Var, int i, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        bff0 bff0Var2 = bff0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(679172766);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(bff0Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(function0) ? 256 : SemanticState.Focused;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, qim0VarF);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            qim0 qim0VarN = anm1.N("#SelectorHeaderBackButton", u291.r(nim0Var, 48.0f));
            String strO0 = cwl1.o0(x340Var, 2131957896);
            boolean z2 = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new tze0(function0, (byte) 4);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(new y50(strO0), (Function0) objT), ldx.c, qim0VarN, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, fyi.a, x340Var, 48, 6, 1016);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0Var);
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
            bff0Var2 = bff0Var;
            uwo1.e(cwl1.o0(x340Var, 2131957901), (qim0) null, cbx.d(x340Var).k, z4p1.e(bff0Var2.c), new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2018);
            uwo1.e(cwl1.U(2131820744, i, new Object[]{Integer.valueOf(i)}, x340Var), anm1.N("#SelectorHeaderSubtitle", nim0Var), cbx.d(x340Var).j, z4p1.e(bff0Var2.d), new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 48, 0, 2016);
            x340Var = x340Var;
            x340Var.r(true);
            op71.g(x340Var, u291.r(nim0Var, 48.0f));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(bff0Var2, i, function0, i2, (byte) 11);
        }
    }

    public static final uo5 k(Socket socket) {
        return new uo5(new zsc(socket));
    }

    public static final uo5 l(a6a1 a6a1Var) {
        return new uo5(a6a1Var);
    }

    public static final Set n(k4a0 k4a0Var) {
        w3a0 w3a0Var;
        boolean z = k4a0Var.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean zI = I(k4a0Var);
        Set set = k4a0Var.b;
        ee9 ee9Var = r2a0.b.a;
        y3a0 y3a0Var = null;
        z3a0 y3a0Var2 = (!zI || set.contains(ee9Var)) ? (zI || !set.contains(ee9Var)) ? null : new y3a0(Collections.singleton(ee9Var)) : new w3a0(Collections.singleton(ee9Var));
        if (y3a0Var2 != null) {
            linkedHashSet.add(y3a0Var2);
        }
        boolean zI2 = I(k4a0Var);
        ee9 ee9Var2 = r2a0.c.a;
        z3a0 y3a0Var3 = (!zI2 || set.contains(ee9Var2)) ? (zI2 || !set.contains(ee9Var2)) ? null : new y3a0(Collections.singleton(ee9Var2)) : new w3a0(Collections.singleton(ee9Var2));
        if (y3a0Var3 != null) {
            linkedHashSet.add(y3a0Var3);
        }
        boolean z2 = z && I(k4a0Var);
        ce9 ce9Var = new ce9(cih1.b);
        z3a0 y3a0Var4 = (!z2 || set.contains(ce9Var)) ? (z2 || !set.contains(ce9Var)) ? null : new y3a0(Collections.singleton(ce9Var)) : new w3a0(Collections.singleton(ce9Var));
        if (y3a0Var4 != null) {
            linkedHashSet.add(y3a0Var4);
        }
        boolean z3 = z && I(k4a0Var);
        ce9 ce9Var2 = new ce9(cih1.c);
        z3a0 y3a0Var5 = (!z3 || set.contains(ce9Var2)) ? (z3 || !set.contains(ce9Var2)) ? null : new y3a0(Collections.singleton(ce9Var2)) : new w3a0(Collections.singleton(ce9Var2));
        if (y3a0Var5 != null) {
            linkedHashSet.add(y3a0Var5);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSet) {
            if (obj instanceof w3a0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r7h.W(((w3a0) it.next()).a, arrayList2);
            }
            w3a0Var = new w3a0(o7h.p1(arrayList2));
        } else {
            w3a0Var = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSet) {
            if (obj2 instanceof y3a0) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                r7h.W(((y3a0) it2.next()).a, arrayList4);
            }
            y3a0Var = new y3a0(o7h.p1(arrayList4));
        }
        return dm61.B0(new z3a0[]{w3a0Var, y3a0Var});
    }

    public static Object o(ViewGroup viewGroup, boolean z) {
        e441 m231Var;
        ViewGroup viewGroup2 = viewGroup;
        while (!u890.j(viewGroup2.getTag(), 2131430188)) {
            ViewParent parent = viewGroup2.getParent();
            viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 == null) {
                viewGroup2 = null;
                break;
            }
        }
        if (viewGroup2 == null) {
            try {
                throw new IllegalStateException("Failed to find parent");
            } catch (Throwable th) {
                m231 m231Var2 = new m231(th);
                Throwable thA = e331.a(m231Var2);
                if (thA != null) {
                    n57.t("Failed to check required views", new IllegalArgumentException(thA.getMessage()));
                }
                return m231Var2;
            }
        }
        if (viewGroup2.getWidth() <= 0 || viewGroup2.getHeight() <= 0) {
            return new m231(new IllegalStateException("Root dimensions not available"));
        }
        try {
            m231Var = p(viewGroup2, viewGroup, z);
        } catch (Throwable th2) {
            m231Var = new m231(th2);
        }
        Throwable thA2 = e331.a(m231Var);
        if (thA2 != null) {
            n57.t("Failed to check required views", new IllegalArgumentException(thA2.getMessage()));
        }
        return m231Var;
    }

    public static e441 p(ViewGroup viewGroup, ViewGroup viewGroup2, boolean z) {
        Resources resources = viewGroup2.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131166830) + resources.getDimensionPixelSize(2131167033);
        View viewFindViewById = viewGroup.findViewById(2131427919);
        if (viewFindViewById == null) {
            eg.m("Failed to find carousel_item_safe_barrier_top");
            return null;
        }
        View viewFindViewById2 = viewGroup.findViewById(2131427918);
        if (viewFindViewById2 == null) {
            eg.m("Failed to find carousel_item_safe_barrier_bottom");
            return null;
        }
        boolean zEquals = d9y0.n((int) (viewGroup.getWidth() / viewGroup2.getContext().getResources().getDisplayMetrics().density), (int) (viewGroup.getHeight() / viewGroup2.getContext().getResources().getDisplayMetrics().density)).a.equals(ltl1.d);
        double width = (((double) viewGroup2.getWidth()) - (((double) (viewFindViewById2.getY() - (viewFindViewById.getY() + viewFindViewById.getHeight()))) * 0.75d)) / 2.0d;
        if (!z && zEquals) {
            dimensionPixelSize = Math.max(dimensionPixelSize, (int) width);
        }
        int bottom = viewFindViewById.getBottom() - viewGroup2.getTop();
        if (bottom < 0) {
            bottom = 0;
        }
        int bottom2 = viewGroup2.getBottom() - viewFindViewById2.getTop();
        return new e441(dimensionPixelSize, dimensionPixelSize, bottom, bottom2 >= 0 ? bottom2 : 0);
    }

    public static xah r(b0k b0kVar) {
        return ((vu40) ((x340) b0kVar).k(wu40.a)).a;
    }

    public static void s() {
        Parcelable.Creator creator = pia1.CREATOR;
    }

    public static edt t(b0k b0kVar) {
        return ((vu40) ((x340) b0kVar).k(wu40.a)).e;
    }

    public static Object u(Future future) {
        o0c.q("Future was expected to be done, " + future, future.isDone());
        return z(future);
    }

    public static nx61 v(b0k b0kVar) {
        return ((vu40) ((x340) b0kVar).k(wu40.a)).d;
    }

    public static int w(int i) {
        return i >>> 3;
    }

    public static int x(int i) {
        return i & 7;
    }

    public static l2h1 y(b0k b0kVar) {
        return ((vu40) ((x340) b0kVar).k(wu40.a)).b;
    }

    public static Object z(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public void A(y341 y341Var, Object obj) {
        d441 d441VarG1 = y341Var.g1(q());
        try {
            m(d441VarG1, obj);
            d441VarG1.f1();
            o0c.v(d441VarG1, (Throwable) null);
            jhc1.x(y341Var);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0c.v(d441VarG1, th);
                throw th2;
            }
        }
    }

    public abstract void m(d441 d441Var, Object obj);

    public abstract String q();
}
