package p;

import android.widget.FrameLayout;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.connectivity.productstate.ConvertProductStateValueException;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class yto {
    public static final j2i a;
    public static b180 b;
    public static b180 c;

    static {
        new j2i(759698998, new dh((byte) 2), false);
        a = new j2i(486633673, new dh((byte) 3), false);
    }

    public static final void a(hpf1 hpf1Var, u961 u961Var, ContextTrack contextTrack, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String strO;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(307985744);
        int i2 = i | (x340Var.i(hpf1Var) ? 4 : 2) | (x340Var.i(u961Var) ? 32 : 16) | (x340Var.i(contextTrack) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float fM = dsa0.m(x340Var, 2131166956);
            float fM2 = dsa0.m(x340Var, 2131165905);
            String strB0 = contextTrack != null ? l4o1.b0(contextTrack) : null;
            if (strB0 == null) {
                strB0 = "";
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(dsa0.m(x340Var, 2131166830), 0.0f, 2, u291.f(qim0Var3, 1.0f));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-1378445132);
            boolean zG = x340Var.g(u961Var);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = cgj1.H(((u27) ((kly0) u961Var.c).get()).a(Flowable.I(Boolean.TRUE)), (qim0) null, new FrameLayout.LayoutParams(-1, -1), 3);
                x340Var.s0(objT);
            }
            tyq tyqVar = (tyq) objT;
            if (contextTrack != null) {
                strO = l4o1.o(contextTrack);
                if (strO == null) {
                    strO = l4o1.s(contextTrack);
                }
            } else {
                strO = null;
            }
            if (strO == null) {
                strO = "";
            }
            otw.c(tyqVar, new x27(strB0, strO), u291.r(uyn1.B(qim0Var3, fM2, 0.0f, fM2 / 2.0f, 0.0f, 10), fM), (ipb1) null, x340Var, 0, 8);
            x340Var.r(false);
            boolean zG2 = x340Var.g(u961Var);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = cgj1.H((syq) ((kly0) u961Var.b).get(), (qim0) null, new FrameLayout.LayoutParams(-1, -2), 3);
                x340Var.s0(objT2);
            }
            tyq tyqVar2 = (tyq) objT2;
            String strUri = contextTrack != null ? contextTrack.uri() : null;
            if (strUri == null) {
                strUri = "";
            }
            otw.c(tyqVar2, new nof1(strUri, contextTrack != null ? l4o1.a0(contextTrack, "pointer.uri") : null), uyn1.A(new wnb0(1.0f, true), fM2, fM2, fM2 * 2.0f, fM2), (ipb1) null, x340Var, 0, 8);
            boolean zG3 = x340Var.g(u961Var);
            Object objT3 = x340Var.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = q1o1.u(new jpg0(((yl1) ((kly0) u961Var.d).get()).a(voo1.i((xfx) u961Var.a)), b03.b), null, new FrameLayout.LayoutParams(-1, -1), 3);
                x340Var.s0(objT3);
            }
            otw.c((xpw) objT3, rih1.a, u291.r(qim0Var3, fM), (ipb1) null, x340Var, 48, 8);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, (Object) hpf1Var, (Object) u961Var, (Object) contextTrack, (Object) qim0Var2, (byte) 25);
        }
    }

    public static final void b(List list, xnk xnkVar, Function0 function0, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        String strU;
        int i2;
        int i3;
        int i4;
        x340 x340Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(1453749434);
        j06 j06Var = x340Var3.a;
        int i5 = i | (x340Var3.g(list) ? 4 : 2) | (x340Var3.e(xnkVar.ordinal()) ? 32 : 16) | (x340Var3.i(function0) ? 256 : 128) | (x340Var3.i(iu30Var) ? 2048 : 1024) | 24576 | (x340Var3.i(iu30Var2) ? 131072 : 65536) | (x340Var3.i(function1) ? 1048576 : 524288);
        if (x340Var3.Y(i5 & 1, (599187 & i5) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            qim0 qim0VarX = uyn1.x(qim0VarF, 16.0f);
            long jB = u7h.b(u7h.b, 0.5f, 0.0f, 0.0f, 0.0f, 14);
            cua cuaVar = cbx.b(x340Var3).f;
            qim0 qim0VarF2 = dug.f(qim0VarX, jB, er31.b(6.0f));
            cvx cvxVar2 = cbx.b(x340Var3).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarF2, 12.0f);
            int i6 = i5 & 14;
            boolean z = (i6 == 4) | ((3670016 & i5) == 1048576);
            Object objT = x340Var3.T();
            if (z || objT == m4cVar) {
                objT = new gmj(list, function1, (byte) 14);
                x340Var3.s0(objT);
            }
            qim0 qim0VarX3 = bin.x(qim0VarX2, false, null, null, null, (Function0) objT, 15);
            fra fraVar = een.N0;
            cvx cvxVar3 = cbx.b(x340Var3).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var3, 0);
            int iHashCode = Long.hashCode(x340Var3.T);
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarX3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            boolean z2 = x340Var3.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var3, lljVar3);
            nko1.F(x340Var3);
            llj lljVar4 = y580.Y;
            wnb0 wnb0VarQ = kk0.q(x340Var3, qim0VarE, lljVar4, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var3, 0);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var3, wnb0VarQ);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(mbhVarA, x340Var3, lljVar);
            nko1.H(xos0VarM2, x340Var3, lljVar2);
            x0d.q(iHashCode2, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE2, x340Var3, lljVar4);
            uwo1.e(cwl1.o0(x340Var3, 2131955762), null, cbx.d(x340Var3).h, cbx.a(x340Var3).b.a, null, null, 0, false, new cjc0(1), 0, null, x340Var3, 0, 0, 1778);
            cvx cvxVar4 = cbx.b(x340Var3).b;
            jw31 jw31VarA2 = ew31.a(new d36(6.0f, true, new um5(false)), fraVar, x340Var3, 0);
            int iHashCode3 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM3 = x340Var3.m();
            qim0 qim0VarE3 = zr7.E(x340Var3, qim0Var3);
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(jw31VarA2, x340Var3, lljVar);
            nko1.H(xos0VarM3, x340Var3, lljVar2);
            x0d.q(iHashCode3, x340Var3, lljVar3, x340Var3);
            nko1.H(qim0VarE3, x340Var3, lljVar4);
            List<fbh0> listD1 = o7h.d1(list, 2);
            ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
            for (fbh0 fbh0Var : listD1) {
                arrayList.add(new phx(10, 0L, fbh0Var.c, (String) null, fbh0Var.b));
            }
            fc11.a(mqo1.A(arrayList), (qim0) null, hcx.b, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var3, 24968, 490);
            if (list.size() == 1) {
                x340Var3.i0(622621505);
                strU = cwl1.n0(2131955761, new Object[]{((fbh0) o7h.q0(list)).b}, x340Var3);
                x340Var3.r(false);
            } else {
                x340Var3.i0(622624810);
                strU = cwl1.U(2131820684, list.size(), new Object[]{Integer.valueOf(list.size())}, x340Var3);
                x340Var3.r(false);
            }
            uwr uwrVar2 = cbx.a;
            uwo1.e(strU, null, cbx.d(x340Var3).j, cbx.a(x340Var3).b.a, null, null, 0, false, new cjc0(2), 0, null, x340Var3, 0, 0, 1778);
            x340Var3.r(true);
            x340Var3.r(true);
            int size = list.size();
            isl islVar = isl.a;
            if (size == 1) {
                x340Var3.i0(2023322062);
                if (wnk.a[xnkVar.ordinal()] == 1) {
                    x340Var3.i0(2023389518);
                    uox uoxVar = uox.c;
                    long j = cbx.a(x340Var3).b.a;
                    boolean z3 = ((i5 & 7168) == 2048) | (i6 == 4);
                    Object objT2 = x340Var3.T();
                    if (z3 || objT2 == m4cVar) {
                        objT2 = new vnk(iu30Var, list, (byte) 0);
                        x340Var3.s0(objT2);
                    }
                    i3 = i6;
                    i4 = 4;
                    i2 = i5;
                    w0h1.a(uoxVar, islVar, bin.x(qim0Var3, false, null, null, null, (Function0) objT2, 15), j, 0L, false, x340Var3, uox.d | 48, 48);
                    x340Var2 = x340Var3;
                    x340Var2.r(false);
                } else {
                    i2 = i5;
                    i3 = i6;
                    i4 = 4;
                    x340Var3.i0(2023667929);
                    fsx fsxVar = fsx.c;
                    long j2 = cbx.a(x340Var3).b.a;
                    boolean z4 = (i2 & 896) == 256;
                    Object objT3 = x340Var3.T();
                    if (z4 || objT3 == m4cVar) {
                        objT3 = new ugj(function0, (byte) 5);
                        x340Var3.s0(objT3);
                    }
                    w0h1.a(fsxVar, islVar, bin.x(qim0Var3, false, null, null, null, (Function0) objT3, 15), j2, 0L, false, x340Var3, fsx.d | 48, 48);
                    x340Var2 = x340Var3;
                    x340Var2.r(false);
                }
                fpx fpxVar = fpx.c;
                long j3 = cbx.a(x340Var2).b.a;
                boolean z5 = (i3 == i4) | ((i2 & 458752) == 131072);
                Object objT4 = x340Var2.T();
                if (z5 || objT4 == m4cVar) {
                    objT4 = new vnk(iu30Var2, list, (byte) 1);
                    x340Var2.s0(objT4);
                }
                x340 x340Var4 = x340Var2;
                w0h1.a(fpxVar, islVar, bin.x(qim0Var3, false, null, null, null, (Function0) objT4, 15), j3, 0L, false, x340Var4, fpx.d | 48, 48);
                x340Var = x340Var4;
                x340Var.r(false);
            } else {
                x340Var3.i0(2024161883);
                w0h1.a(plx.c, islVar, (qim0) null, cbx.a(x340Var3).b.a, 0L, false, x340Var3, plx.d | 48, 52);
                x340Var = x340Var3;
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var3;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ta5(list, xnkVar, function0, iu30Var, qim0Var2, iu30Var2, function1, i, (byte) 10);
        }
    }

    public static final void c(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1890581312);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131959389);
            String strO1 = cwl1.o0(x340Var, 2131959388);
            String strO2 = cwl1.o0(x340Var, 2131959387);
            z50 z50Var = z50.c;
            function2 = function0;
            mqo1.d(function2, null, null, strO0, strO1, new zgx(strO2, new gbx(z50Var, function0)), new zgx(cwl1.o0(x340Var, 2131959386), new gbx(z50Var, function1)), x340Var, (i2 & 14) | 2359296, 6);
        } else {
            function2 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function2, function1, i, (byte) 16);
        }
    }

    public static final void d(ArrayList arrayList, float f, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1656075964);
        int i2 = (x340Var.i(arrayList) ? 4 : 2) | i | (x340Var.d(f) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.g(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            w2g0.c(u291.f(qim0Var, 1.0f), een.e, apo.r(-248288878, new i9f1(f, arrayList, z, z2), x340Var), x340Var, 3120, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jx10(arrayList, f, z, z2, qim0Var, i);
        }
    }

    public static final void e(yj41 yj41Var, vnr0 vnr0Var, int i, float f, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-471245424);
        int i5 = i2 | (x340Var.i(yj41Var) ? 4 : 2) | (x340Var.i(vnr0Var) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.d(f) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.h(z2) ? 131072 : 65536);
        int i6 = i3 & 64;
        if (i6 != 0) {
            i4 = i5 | 1572864;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i4 = i5 | (x340Var.g(qim0Var2) ? 1048576 : 524288);
        }
        if (x340Var.Y(i4 & 1, (599187 & i4) != 599186)) {
            qim0 qim0Var4 = nim0.a;
            if (i6 != 0) {
                qim0Var2 = qim0Var4;
            }
            String strC = f4i1.c(i, "imageScaleUp-");
            ilv.a.getClass();
            qim0 qim0Var5 = qim0Var2;
            ven0 ven0VarR = zod.R(new hsi1(strC, Float.valueOf(0.5f), Float.valueOf(1.0f), new pxg1(666, (i + 1) * 83, flv.b), rno1.a), z, (Function0) null, x340Var, ((i4 >> 9) & 112) | 8, 4);
            float f2 = ((Number) ven0VarR.getValue()).floatValue() <= 0.5f ? 0.0f : 1.0f;
            x340Var.i0(-1895258805);
            qim0 qim0VarR = u291.r(qim0Var5, f);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v7f1.e;
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(qim0VarR, (iu30) objT);
            if (z2) {
                boolean zG = x340Var.g(ven0VarR) | x340Var.d(f2);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new og6((byte) 2, f2, ven0VarR);
                    x340Var.s0(objT2);
                }
                qim0VarA = qim0VarA.then(i541.C(qim0Var4, (iu30) objT2));
            }
            x340Var.r(false);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            yk4 yk4Var = new yk4(yj41Var.a);
            as80 as80Var = mif1.P0;
            uwr uwrVar = cbx.a;
            cbx.a.getClass();
            eso1.f(yk4Var, isl.a, v8r.j(qim0Var4, yj41Var.c), new p3v(f), (zvx) null, uwr.a(), as80Var, (tl3) null, (ColorFilter) null, x340Var, (i4 & 7168) | 1597488, 384);
            qgo1.f(omo1.q(vnr0Var, cbx.d(x340Var).d, cbx.d(x340Var).d, x340Var), h2c.a.a(qim0Var4, een.Y), null, 0, false, null, x340Var, 8, 60);
            x340Var = x340Var;
            x340Var.r(true);
            qim0Var3 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new j9f1(yj41Var, vnr0Var, i, f, z, z2, qim0Var3, i2, i3);
        }
    }

    public static final void f(c380 c380Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1168600753);
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131953752);
            String strO1 = cwl1.o0(x340Var, 2131953751);
            int size = c380Var.size();
            Object[] objArr = c380Var.size() == 1 ? new String[]{o7h.q0(c380Var)} : new Object[0];
            String strU = cwl1.U(2131820616, size, Arrays.copyOf(objArr, objArr.length), x340Var);
            int size2 = c380Var.size();
            Object[] objArr2 = c380Var.size() == 1 ? new String[]{o7h.q0(c380Var)} : new Object[0];
            String strU2 = cwl1.U(2131820615, size2, Arrays.copyOf(objArr2, objArr2.length), x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z = (i2 & 896) == 256;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new cb(function1, ven0Var, (byte) 18);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1221064642);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function2, null, null, strU, strU2, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function1)), x340Var, 2359296, 6);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(1221484723);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ojn(c380Var, function0, function1, i, (byte) 1);
        }
    }

    public static final void g(r8w0 r8w0Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1750069634);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(r8w0Var) : x340Var.i(r8w0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = r8w0Var instanceof q8w0;
            gdx gdxVarS = yla.s(x340Var);
            String strO0 = cwl1.o0(x340Var, 2131952928);
            String strO1 = cwl1.o0(x340Var, 2131952929);
            if (!z) {
                strO1 = strO0;
            }
            if (r8w0Var.equals(p8w0.a)) {
                x340Var.i0(-1810245970);
                x340Var.r(false);
            } else {
                if (!z) {
                    throw p3d1.k(x340Var, -1810247550, false);
                }
                x340Var.i0(-282968690);
                Long l = ((q8w0) r8w0Var).a;
                if (l == null) {
                    x340Var.i0(-282948417);
                    x340Var.r(false);
                    strO0 = null;
                } else {
                    x340Var.i0(-282948416);
                    long jLongValue = l.longValue() / 1000;
                    int i3 = (int) (jLongValue / 3600);
                    int i4 = ((int) (jLongValue / 60)) - (i3 * 60);
                    long j = jLongValue % 60;
                    strO0 = cwl1.n0(2131952927, new Object[]{i3 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(j)}, 3)) : String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Long.valueOf(j)}, 2))}, x340Var);
                    x340Var.r(false);
                }
                if (strO0 == null) {
                    strO0 = x0d.k(x340Var, -1810236551, 2131952926, x340Var, false);
                } else {
                    x340Var.i0(-1810243340);
                    x340Var.r(false);
                }
                x340Var.r(false);
            }
            mod.b(jw80.c.a(new p3v(0.0f)), apo.r(928355906, new ofi0(strO1, function0, z, gdxVarS, strO0), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0((Object) r8w0Var, (Object) function0, i, (byte) 14);
        }
    }

    public static final void h(wi90 wi90Var, int i, int i2, boolean z, boolean z2, qim0 qim0Var, b0k b0kVar, int i3) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1855418102);
        j06 j06Var = ((x340) b0kVar2).a;
        int i4 = i3 | (b0kVar2.i(wi90Var) ? 4 : 2) | (b0kVar2.e(i) ? 32 : 16) | (b0kVar2.e(i2) ? 256 : 128) | (b0kVar2.h(z) ? 2048 : 1024) | (b0kVar2.h(z2) ? 16384 : 8192) | 196608;
        if (b0kVar2.Y(i4 & 1, (74899 & i4) != 74898)) {
            String strC = f4i1.c(i, "Top-five-item-");
            ilv.a.getClass();
            ven0 ven0VarR = zod.R(new hsi1(strC, Float.valueOf(1.0f), Float.valueOf(0.0f), new pxg1(666, (i + 1) * 83, flv.b), rno1.a), z, (Function0) null, b0kVar2, 8 | ((i4 >> 6) & 112), 4);
            float f = (!z2 || ((Number) ven0VarR.getValue()).floatValue() < 1.0f) ? 1.0f : 0.0f;
            float fM0 = ((wat) b0kVar2.k(t4k.h)).M0(i2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v7f1.f;
                b0kVar2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
            boolean zG = ((57344 & i4) == 16384) | b0kVar2.g(ven0VarR);
            Object objT2 = b0kVar2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new kjz0(z2, ven0VarR, (byte) 1);
                b0kVar2.s0(objT2);
            }
            qim0 qim0VarB2 = eqr0.B(qim0VarB, (iu30) objT2);
            boolean zD = b0kVar2.d(f);
            Object objT3 = b0kVar2.T();
            if (zD || objT3 == m4cVar) {
                objT3 = new vbk0((byte) 27, f);
                b0kVar2.s0(objT3);
            }
            qim0 qim0VarC = i541.C(qim0VarB2, (iu30) objT3);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, b0kVar2, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarC);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z3 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            vnr0 vnr0Var = (vnr0) wi90Var.a.invoke(b0kVar2, 0);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar2;
            qgo1.f(omo1.q(vnr0Var, lee1.a(cbx.d(b0kVar2).k, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), lee1.a(cbx.d(b0kVar2).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), b0kVar2), u291.v(qim0Var3, fM0), new a0e1(5), 2, false, null, b0kVar2, 3080, 48);
            wnb0 wnb0VarK = c13.k(qim0Var3, 16.0f, b0kVar2, 1.0f, true);
            cvx cvxVar = cbx.b(b0kVar2).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, wnb0VarK);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            qgo1.f(omo1.q((vnr0) wi90Var.c.invoke(b0kVar2, 0), lee1.a(cbx.d(b0kVar2).k, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), lee1.a(cbx.d(b0kVar2).h, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), b0kVar2), null, new a0e1(5), 2, false, null, b0kVar2, 3080, 50);
            vnr0 vnr0Var2 = (vnr0) wi90Var.d.invoke(b0kVar2, 0);
            if (vnr0Var2 == null) {
                b0kVar2.i0(1146560378);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1146560379);
                qgo1.f(omo1.q(vnr0Var2, lee1.a(cbx.d(b0kVar2).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), lee1.a(cbx.d(b0kVar2).g, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, wi90Var.f, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), b0kVar2), null, new a0e1(5), 2, false, null, b0kVar2, 3080, 50);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ig6(wi90Var, i, i2, z, z2, qim0Var2, i3, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:167:0x034d  */
    /* JADX WARN: Code duplicated, block: B:170:0x035e  */
    /* JADX WARN: Code duplicated, block: B:173:0x036d  */
    /* JADX WARN: Code duplicated, block: B:176:0x037d  */
    /* JADX WARN: Code duplicated, block: B:179:0x038c  */
    /* JADX WARN: Code duplicated, block: B:182:0x039a  */
    /* JADX WARN: Code duplicated, block: B:183:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:186:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:192:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:198:0x041d  */
    /* JADX WARN: Code duplicated, block: B:201:0x046b  */
    /* JADX WARN: Code duplicated, block: B:202:0x046d  */
    /* JADX WARN: Code duplicated, block: B:205:0x047b  */
    /* JADX WARN: Code duplicated, block: B:206:0x047d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0496  */
    /* JADX WARN: Code duplicated, block: B:216:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:220:0x0512  */
    /* JADX WARN: Code duplicated, block: B:226:0x0549  */
    /* JADX WARN: Code duplicated, block: B:229:0x056e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0570  */
    /* JADX WARN: Code duplicated, block: B:236:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:239:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:241:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:242:0x0601  */
    /* JADX WARN: Code duplicated, block: B:245:0x063b  */
    /* JADX WARN: Code duplicated, block: B:246:0x063d  */
    /* JADX WARN: Code duplicated, block: B:249:0x0661  */
    /* JADX WARN: Code duplicated, block: B:250:0x0663  */
    /* JADX WARN: Code duplicated, block: B:253:0x066c  */
    /* JADX WARN: Code duplicated, block: B:254:0x066e  */
    /* JADX WARN: Code duplicated, block: B:257:0x067d  */
    /* JADX WARN: Code duplicated, block: B:258:0x067f  */
    /* JADX WARN: Code duplicated, block: B:261:0x0689  */
    /* JADX WARN: Code duplicated, block: B:262:0x068b  */
    /* JADX WARN: Code duplicated, block: B:266:0x0695  */
    /* JADX WARN: Code duplicated, block: B:271:0x06d0  */
    public static final void i(uia uiaVar, int i, float f, int i2, lel1 lel1Var, jti0 jti0Var, int i3, yqg yqgVar, qim0 qim0Var, jel1 jel1Var, zge1 zge1Var, float f2, float f3, List list, float f4, iu30 iu30Var, xu30 xu30Var, b0k b0kVar, int i4) throws Throwable {
        xu30 xu30Var2;
        b0k b0kVar2;
        boolean z;
        ArrayList arrayList;
        int size;
        ArrayList arrayList2;
        Object objT;
        c9n c9nVar;
        Object objT2;
        ven0 ven0Var;
        Object objT3;
        ven0 ven0Var2;
        Object objT4;
        ven0 ven0Var3;
        Object objT5;
        drr0 drr0Var;
        Object objT6;
        err0 err0Var;
        Object objT7;
        ven0 ven0Var4;
        boolean zI;
        Object objT8;
        boolean zI2;
        Object df6Var;
        b0k b0kVar3;
        char c2;
        jti0 jti0Var2;
        drr0 drr0Var2;
        ven0 ven0Var5;
        boolean z2;
        boolean z3;
        boolean zI3;
        Object mdl1Var;
        b0k b0kVar4;
        m4c m4cVar;
        jti0 jti0Var3;
        lel1 lel1Var2;
        c9n c9nVar2;
        boolean zI4;
        Object objT9;
        boolean zI5;
        Object objT10;
        boolean zI6;
        Object objT11;
        boolean z4;
        boolean zI7;
        Object objT12;
        Throwable th;
        lel1 lel1Var3;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        qim0 qim0VarD;
        int i5;
        boolean z5;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objT13;
        qim0 qim0Var2;
        m4c m4cVar2 = fkj0.X;
        b0k b0kVar5 = (x340) b0kVar;
        b0kVar5.k0(-709514795);
        int i7 = i4 | (b0kVar5.i(uiaVar) ? 4 : 2) | (b0kVar5.e(i) ? 32 : 16) | (b0kVar5.d(f) ? 256 : 128) | (b0kVar5.e(i2) ? 2048 : 1024) | (b0kVar5.g(lel1Var) ? 16384 : 8192) | (b0kVar5.i(jti0Var) ? 131072 : 65536) | (b0kVar5.e(l1d.C(i3)) ? 1048576 : 524288) | (b0kVar5.g(yqgVar) ? 8388608 : 4194304) | 100663296 | (b0kVar5.i(jel1Var) ? 536870912 : 268435456);
        int i8 = 0 | (b0kVar5.i(zge1Var) ? (char) 4 : (char) 2) | (b0kVar5.d(f2) ? 32 : 16) | (b0kVar5.d(f3) ? (char) 256 : (char) 128) | (b0kVar5.i(list) ? (char) 2048 : (char) 1024) | (b0kVar5.d(f4) ? (char) 16384 : (char) 8192) | (b0kVar5.i(iu30Var) ? (char) 0 : (char) 0);
        if (b0kVar5.Y(i7 & 1, ((306783379 & i7) == 306783378 && (i8 & 599187) == 599186) ? false : true)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar5).b.f;
            Object objT14 = b0kVar5.T();
            if (objT14 == m4cVar2) {
                objT14 = v8r.q(Boolean.FALSE);
                b0kVar5.s0(objT14);
            }
            ven0 ven0Var6 = (ven0) objT14;
            tob1 tob1VarA = w191.a(u7h.b(j, f, 0.0f, 0.0f, 0.0f, 14), null, "downBeatColorAnimation", b0kVar5, 384, 10);
            tob1 tob1VarA2 = w191.a(u7h.b(cbx.a(b0kVar5).b.b, f, 0.0f, 0.0f, 0.0f, 14), null, "beatColorAnimation", b0kVar5, 384, 10);
            int i9 = i7 & 112;
            boolean zG = (i9 == 32) | b0kVar5.g(zge1Var) | b0kVar5.g(uiaVar);
            Object objT15 = b0kVar5.T();
            if (zG || objT15 == m4cVar2) {
                objT15 = zge1Var != null ? new yge1(zge1Var, uiaVar != null ? uiaVar.b : null, i) : null;
                b0kVar5.s0(objT15);
            }
            yge1 yge1Var = (yge1) objT15;
            int iO = k1u.o(f3, i);
            boolean zG2 = b0kVar5.g(yge1Var) | b0kVar5.e(iO);
            Object objT16 = b0kVar5.T();
            if (zG2 || objT16 == m4cVar2) {
                if (yge1Var != null) {
                    if (iO < 1) {
                        iO = 1;
                    }
                    LinkedHashMap linkedHashMap = yge1Var.c;
                    Integer numValueOf = Integer.valueOf(iO);
                    Object obj = linkedHashMap.get(numValueOf);
                    if (obj == null) {
                        z = true;
                        xge1 xge1Var = new xge1(yge1Var.a, o7h.t1(yge1Var.b, iO, iO, true, lcl1.g));
                        linkedHashMap.put(numValueOf, xge1Var);
                        obj = xge1Var;
                    } else {
                        z = true;
                    }
                    objT16 = (xge1) obj;
                } else {
                    i7 = i7;
                    z = true;
                    objT16 = null;
                }
                b0kVar5.s0(objT16);
            } else {
                i7 = i7;
                z = true;
            }
            xge1 xge1Var2 = (xge1) objT16;
            boolean zG3 = b0kVar5.g(jel1Var) | b0kVar5.g(uiaVar) | (i9 == 32 ? z : false);
            Object objT17 = b0kVar5.T();
            if (zG3 || objT17 == m4cVar2) {
                if (jel1Var != null) {
                    ArrayList<hia> arrayList3 = uiaVar != null ? uiaVar.b : null;
                    ArrayList arrayList4 = jel1Var.a;
                    Integer num = (Integer) o7h.G0(arrayList4);
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = (Integer) o7h.D0(arrayList4);
                    int iIntValue2 = (num2 != null ? num2.intValue() : 0) - iIntValue;
                    if (iIntValue2 == 0) {
                        arrayList = new ArrayList(q7h.U(arrayList4, 10));
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            ((Number) it.next()).intValue();
                            arrayList.add(Float.valueOf(0.5f));
                        }
                    } else {
                        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(Float.valueOf((((Number) it2.next()).intValue() - iIntValue) / iIntValue2));
                        }
                        arrayList = arrayList5;
                    }
                    ArrayList arrayList6 = new ArrayList(q7h.U(arrayList, 10));
                    int i10 = 0;
                    for (Object obj2 : arrayList) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            p7h.T();
                            throw null;
                        }
                        arrayList6.add(new qes0(((Number) obj2).floatValue(), i10 * 100, false, false));
                        i10 = i11;
                    }
                    ArrayList arrayList7 = new ArrayList(arrayList6);
                    if (i != 0 && arrayList3 != null) {
                        for (hia hiaVar : arrayList3) {
                            int iY = h7p1.y(hiaVar) / 100;
                            if (iY >= 0 && iY < arrayList7.size()) {
                                if (h7p1.w(hiaVar)) {
                                    arrayList7.set(iY, qes0.a((qes0) arrayList7.get(iY), 10));
                                } else if (!((qes0) arrayList7.get(iY)).c) {
                                    arrayList7.set(iY, qes0.a((qes0) arrayList7.get(iY), 14));
                                }
                            }
                        }
                    }
                    objT17 = new res0(arrayList4.size() * 100, arrayList7);
                } else {
                    objT17 = null;
                }
                b0kVar5.s0(objT17);
            }
            res0 res0Var = (res0) objT17;
            if (xge1Var2 != null) {
                arrayList2 = xge1Var2.a;
            } else {
                if (res0Var != null) {
                    arrayList2 = res0Var.a;
                } else {
                    size = 0;
                }
                objT = b0kVar5.T();
                if (objT == m4cVar2) {
                    objT = qxd0.M(o6x.a, b0kVar5);
                    b0kVar5.s0(objT);
                }
                c9nVar = (c9n) objT;
                objT2 = b0kVar5.T();
                if (objT2 == m4cVar2) {
                    objT2 = v8r.q((Object) null);
                    b0kVar5.s0(objT2);
                }
                ven0Var = (ven0) objT2;
                objT3 = b0kVar5.T();
                if (objT3 == m4cVar2) {
                    objT3 = v8r.q((Object) null);
                    b0kVar5.s0(objT3);
                }
                ven0Var2 = (ven0) objT3;
                objT4 = b0kVar5.T();
                if (objT4 == m4cVar2) {
                    objT4 = v8r.q((Object) null);
                    b0kVar5.s0(objT4);
                }
                ven0Var3 = (ven0) objT4;
                objT5 = b0kVar5.T();
                if (objT5 == m4cVar2) {
                    objT5 = us71.i(i2, b0kVar5);
                }
                drr0Var = (drr0) objT5;
                objT6 = b0kVar5.T();
                if (objT6 == m4cVar2) {
                    objT6 = bb00.h(0, b0kVar5);
                }
                err0Var = (hdn0) objT6;
                objT7 = b0kVar5.T();
                if (objT7 == m4cVar2) {
                    objT7 = v8r.q((Object) null);
                    b0kVar5.s0(objT7);
                }
                ven0Var4 = (ven0) objT7;
                Integer numValueOf2 = Integer.valueOf(i2);
                zI = b0kVar5.i(ven0Var4);
                objT8 = b0kVar5.T();
                if (zI || objT8 == m4cVar2) {
                    objT8 = new pad1(ven0Var4, (lnm) null, (byte) 5);
                    b0kVar5.s0(objT8);
                }
                qxd0.t(numValueOf2, b0kVar5, (vu30) objT8);
                Integer num3 = (Integer) jti0Var.g;
                zI2 = b0kVar5.i(jti0Var) | b0kVar5.i(ven0Var) | b0kVar5.i(ven0Var2) | b0kVar5.i(ven0Var3) | b0kVar5.i(ven0Var6) | b0kVar5.i(drr0Var);
                Object objT18 = b0kVar5.T();
                if (!zI2 || objT18 == m4cVar2) {
                    b0kVar3 = b0kVar5;
                    c2 = 2048;
                    jti0Var2 = jti0Var;
                    df6Var = new df6(jti0Var2, ven0Var, ven0Var2, ven0Var3, ven0Var6, drr0Var, (lnm) null);
                    drr0Var2 = drr0Var;
                    ven0Var2 = ven0Var2;
                    ven0Var = ven0Var;
                    ven0Var5 = ven0Var6;
                    b0kVar3.s0(df6Var);
                } else {
                    b0kVar3 = b0kVar5;
                    ven0Var5 = ven0Var6;
                    c2 = 2048;
                    jti0Var2 = jti0Var;
                    df6Var = objT18;
                    drr0Var2 = drr0Var;
                }
                qxd0.t(num3, b0kVar3, (vu30) df6Var);
                Integer numValueOf3 = Integer.valueOf(i2);
                Integer numValueOf4 = Integer.valueOf(err0Var.s());
                Boolean boolValueOf = Boolean.valueOf(jti0Var2.b);
                boolean zI8 = b0kVar3.i(ven0Var5) | b0kVar3.i(jti0Var2);
                if ((i7 & 7168) == c2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z11 = zI8 | z2;
                if ((i7 & 57344) != 16384) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                zI3 = z11 | z3 | b0kVar3.i(ven0Var) | b0kVar3.i(drr0Var2) | b0kVar3.i(c9nVar);
                Object objT19 = b0kVar3.T();
                if (!zI3 || objT19 == m4cVar2) {
                    b0kVar4 = b0kVar3;
                    jti0 jti0Var4 = jti0Var2;
                    m4cVar = m4cVar2;
                    mdl1Var = new mdl1(jti0Var4, i2, lel1Var, c9nVar, ven0Var5, ven0Var, drr0Var2, (lnm) null);
                    jti0Var3 = jti0Var4;
                    lel1Var2 = lel1Var;
                    c9nVar2 = c9nVar;
                    b0kVar4.s0(mdl1Var);
                } else {
                    c9nVar2 = c9nVar;
                    jti0Var3 = jti0Var2;
                    m4cVar = m4cVar2;
                    mdl1Var = objT19;
                    b0kVar4 = b0kVar3;
                    lel1Var2 = lel1Var;
                }
                qxd0.r(numValueOf3, numValueOf4, boolValueOf, (vu30) mdl1Var, b0kVar4);
                zI4 = b0kVar4.i(lel1Var2) | b0kVar4.i(jti0Var3) | b0kVar4.i(drr0Var2);
                objT9 = b0kVar4.T();
                if (zI4 || objT9 == m4cVar) {
                    objT9 = new jyi1(lel1Var2, jti0Var3, drr0Var2, (byte) 13);
                    b0kVar4.s0(objT9);
                }
                r6v r6vVarC = k6v.c((iu30) objT9, b0kVar4);
                float f5 = lel1Var2.c;
                qim0Var = nim0.a;
                qim0 qim0VarH = u291.h(u291.v(qim0Var, f5), lel1Var2.d);
                zI5 = b0kVar4.i(jti0Var3);
                objT10 = b0kVar4.T();
                if (zI5 || objT10 == m4cVar) {
                    objT10 = new ae4(jti0Var3, (byte) 19);
                    b0kVar4.s0(objT10);
                }
                qim0 qim0VarB = f8d1.b(qim0VarH, rih1.a, (PointerInputEventHandler) objT10);
                boolean z12 = jti0Var3.a;
                zI6 = b0kVar4.i(ven0Var) | b0kVar4.i(ven0Var2) | b0kVar4.i(ven0Var3) | b0kVar4.i(ven0Var5) | b0kVar4.i(jti0Var3);
                objT11 = b0kVar4.T();
                if (zI6 || objT11 == m4cVar) {
                    jti0 jti0Var5 = jti0Var3;
                    n93 n93Var = new n93(jti0Var5, ven0Var, ven0Var2, ven0Var3, ven0Var5, (lnm) null);
                    jti0Var3 = jti0Var5;
                    b0kVar4.s0(n93Var);
                    objT11 = n93Var;
                }
                xu30 xu30Var3 = (xu30) objT11;
                boolean zI9 = b0kVar4.i(ven0Var2) | b0kVar4.i(c9nVar2);
                if ((i7 & 29360128) == 8388608) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zI7 = zI9 | z4 | b0kVar4.i(drr0Var2) | b0kVar4.i(jti0Var3) | b0kVar4.i(lel1Var2) | b0kVar4.i(ven0Var3) | b0kVar4.i(ven0Var5) | b0kVar4.i(ven0Var4) | b0kVar4.i(err0Var);
                objT12 = b0kVar4.T();
                if (!zI7 || objT12 == m4cVar) {
                    ven0 ven0Var7 = ven0Var5;
                    drr0 drr0Var3 = drr0Var2;
                    lel1 lel1Var4 = lel1Var2;
                    th = null;
                    pdl1 pdl1Var = new pdl1(c9nVar2, yqgVar, jti0Var3, lel1Var4, drr0Var3, ven0Var7, ven0Var4, err0Var, ven0Var3, ven0Var2, (lnm) null);
                    lel1Var3 = lel1Var4;
                    drr0Var2 = drr0Var3;
                    b0kVar4.s0(pdl1Var);
                    objT12 = pdl1Var;
                } else {
                    lel1Var3 = lel1Var2;
                    th = null;
                }
                qim0 qim0VarB2 = k6v.b(qim0VarB, r6vVarC, qqq0.b, z12, (idn0) null, false, xu30Var3, (xu30) objT12, false, 152);
                gfh0VarC = t1c.c(een.d, false);
                iHashCode = Long.hashCode(((x340) b0kVar4).T);
                xos0VarM = b0kVar4.m();
                qim0VarE = zr7.E(b0kVar4, qim0VarB2);
                hzj.A.getClass();
                if (((x340) b0kVar4).a != null) {
                    tgp1.p();
                    throw th;
                }
                b0kVar4.m0();
                if (((x340) b0kVar4).S) {
                    b0kVar4.l(hmb0.t1);
                } else {
                    b0kVar4.v0();
                }
                nko1.H(gfh0VarC, b0kVar4, y580.O0);
                nko1.H(xos0VarM, b0kVar4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                nko1.F(b0kVar4);
                nko1.H(qim0VarE, b0kVar4, y580.Y);
                qim0VarD = u291.d(qim0Var, 1.0f);
                i5 = size;
                boolean zI10 = b0kVar4.i(lel1Var3) | b0kVar4.i(drr0Var2) | b0kVar4.e(i5);
                if ((i8 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean zI11 = zI10 | z5 | b0kVar4.i(xge1Var2) | b0kVar4.i(list) | b0kVar4.i((Object) 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0658: ARITH (r4v42 'zI11' boolean) = (wrap boolean:0x0651: ARITH (wrap boolean:0x064c: ARITH (wrap boolean:0x0645: ARITH (wrap boolean:0x063e: ARITH (r4v37 'zI10' boolean) | (r13v26 'z5' boolean) A[DONT_WRAP, WRAPPED] (LINE:1599)) | (wrap boolean:0x0641: INVOKE (r15v25 'b0kVar4' p.b0k), (r2v9 'xge1Var2' p.xge1) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:1602)) A[DONT_WRAP, WRAPPED] (LINE:1606)) | (wrap boolean:0x0648: INVOKE (r15v25 'b0kVar4' p.b0k), (r51v0 'list' java.util.List) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:1609)) A[DONT_WRAP, WRAPPED] (LINE:1613)) | (wrap boolean:0x064d: INVOKE (r15v25 'b0kVar4' p.b0k), (wrap java.lang.Object:?: CAST (java.lang.Object) (r17v3 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:1614)) A[DONT_WRAP, WRAPPED] (LINE:1618)) | (wrap boolean:0x0654: INVOKE (r15v25 'b0kVar4' p.b0k), (r16v26 'tob1VarA2' p.tob1) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:1621)) A[DECLARE_VAR] (LINE:1625) in method: p.yto.i(p.uia, int, float, int, p.lel1, p.jti0, int, p.yqg, p.qim0, p.jel1, p.zge1, float, float, java.util.List, float, p.iu30, p.xu30, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v3 ??
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 1808
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.yto.i(p.uia, int, float, int, p.lel1, p.jti0, int, p.yqg, p.qim0, p.jel1, p.zge1, float, float, java.util.List, float, p.iu30, p.xu30, p.b0k, int):void");
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.connectivity.productstate.ConvertProductStateValueException */
            public static final boolean j(String str) throws ConvertProductStateValueException {
                if (jhc1.F(str)) {
                    return false;
                }
                if (nhc1.S(str, "true", true) || "1".equals(str)) {
                    return true;
                }
                if (nhc1.S(str, "false", true) || "0".equals(str)) {
                    return false;
                }
                str.getClass();
                throw new ConvertProductStateValueException(gvg.h("Value ", str, " couldn't be converted to target type ", Boolean.class.getCanonicalName()));
            }

            public static final boolean k(String str, boolean z) {
                Boolean boolL = l(str);
                return boolL != null ? boolL.booleanValue() : z;
            }

            public static final Boolean l(String str) {
                if (jhc1.F(str)) {
                    return null;
                }
                if (nhc1.S(str, "true", true) || "1".equals(str)) {
                    return Boolean.TRUE;
                }
                if (nhc1.S(str, "false", true) || "0".equals(str)) {
                    return Boolean.FALSE;
                }
                return null;
            }

            public static final b180 m() {
                b180 b180Var = c;
                if (b180Var != null) {
                    return b180Var;
                }
                a180 a180Var = new a180("Encore.Vector.VideoVertical16", 16.0f, 16.0f, 16.0f, 16.0f, 0L, 0, false, 96);
                int i = bui1.a;
                long j = u7h.b;
                n6a1 n6a1Var = new n6a1(j);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new f9s0(11.196f, 8.0f));
                arrayList.add(new e9s0(6.0f, 5.0f));
                arrayList.add(new r9s0(6.0f));
                arrayList.add(b9s0.c);
                a180.a(a180Var, arrayList, n6a1Var, 1.0f, 2, 1.0f);
                n6a1 n6a1Var2 = new n6a1(j);
                cwh0 cwh0VarG = lf51.g(15.002f, 1.75f);
                cwh0VarG.b(1.75f, 1.75f, false, false, 13.252f, 0.0f);
                cwh0VarG.i(-10.5f);
                cwh0VarG.c(1.75f, 1.75f, false, false, -1.75f, 1.75f);
                cwh0VarG.v(12.5f);
                cwh0VarG.g(0.0f, 0.966f, 0.783f, 1.75f, 1.75f, 1.75f);
                cwh0VarG.i(10.5f);
                cwh0VarG.c(1.75f, 1.75f, false, false, 1.75f, -1.75f);
                cwh0VarG.e();
                cwh0VarG.l(13.252f, 1.5f);
                cwh0VarG.c(0.25f, 0.25f, false, true, 0.25f, 0.25f);
                cwh0VarG.v(12.5f);
                cwh0VarG.c(0.25f, 0.25f, false, true, -0.25f, 0.25f);
                cwh0VarG.i(-10.5f);
                cwh0VarG.c(0.25f, 0.25f, false, true, -0.25f, -0.25f);
                cwh0VarG.j(2.502f, 1.75f);
                cwh0VarG.c(0.25f, 0.25f, false, true, 0.25f, -0.25f);
                cwh0VarG.e();
                a180.a(a180Var, cwh0VarG.a, n6a1Var2, 1.0f, 2, 1.0f);
                b180 b180VarB = a180Var.b();
                c = b180VarB;
                return b180VarB;
            }

            public static String n(y570 y570Var) {
                od70 od70VarT = y570Var.t();
                if (od70VarT != null) {
                    return od70VarT.a.a;
                }
                return null;
            }

            public static final ven0 o(Object obj, Object obj2, Object obj3, vu30 vu30Var, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(obj);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                boolean zI = x340Var.i(vu30Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new zv91(vu30Var, ven0Var, (lnm) null, (byte) 1);
                    x340Var.s0(objT2);
                }
                qxd0.s(obj2, obj3, (vu30) objT2, x340Var);
                return ven0Var;
            }

            public static final ven0 p(Object obj, Object obj2, vu30 vu30Var, b0k b0kVar, int i) {
                x340 x340Var = (x340) b0kVar;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(obj);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                boolean zI = x340Var.i(vu30Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new zv91(vu30Var, ven0Var, (lnm) null, (byte) 0);
                    x340Var.s0(objT2);
                }
                qxd0.t(obj2, x340Var, (vu30) objT2);
                return ven0Var;
            }

            public static final ven0 q(Object obj, b0k b0kVar, vu30 vu30Var) {
                x340 x340Var = (x340) b0kVar;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(obj);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                boolean zI = x340Var.i(vu30Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new zfe(vu30Var, ven0Var, (lnm) null, (byte) 12);
                    x340Var.s0(objT2);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT2);
                return ven0Var;
            }

            public static final ven0 r(Object obj, Object[] objArr, vu30 vu30Var, b0k b0kVar) {
                x340 x340Var = (x340) b0kVar;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(obj);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                boolean zI = x340Var.i(vu30Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new zv91(vu30Var, ven0Var, (lnm) null, (byte) 2);
                    x340Var.s0(objT2);
                }
                qxd0.u(objArrCopyOf, (vu30) objT2, x340Var);
                return ven0Var;
            }

            public static final int s(m7f0 m7f0Var) {
                switch (m7f0Var.ordinal()) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        return 2131958759;
                    case 1:
                        return 2131958762;
                    case 2:
                        return 2131958757;
                    case 3:
                        return 2131958756;
                    case 4:
                        return 2131958761;
                    case 5:
                        return 2131958758;
                    case 6:
                        return 2131958760;
                    case 7:
                        return 2131958763;
                    default:
                        eg.o();
                        return 0;
                }
            }

            public static final rmd t(List list) {
                List<pmd> list2 = list;
                int iS = zno1.s(q7h.U(list2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (pmd pmdVar : list2) {
                    linkedHashMap.put(pmdVar.a, Boolean.valueOf(pmdVar.b));
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (((pmd) obj).c) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((pmd) it.next()).a);
                }
                return new rmd(linkedHashMap, o7h.p1(arrayList2));
            }

            public static final ql10 u(omd omdVar) {
                switch (omdVar.ordinal()) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        return ql10.b;
                    case 1:
                        return ql10.c;
                    case 2:
                        return ql10.a;
                    case 3:
                        return ql10.d;
                    case 4:
                        return ql10.e;
                    case 5:
                        return ql10.f;
                    case 6:
                        return ql10.g;
                    default:
                        eg.o();
                        return null;
                }
            }

            public static Next v(kak0 kak0Var) {
                return Next.h(kak0.a(kak0Var, mdm0.a, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -17, 1048575));
            }

            public static final void w(en31 en31Var, c5r c5rVar) {
                boolean zContainsKey;
                abg abgVar = c5rVar.d;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Set setK = en31Var.k();
                List list = c5rVar.n;
                int size = list.size();
                boolean[] zArr = new boolean[size];
                Iterator it = setK.iterator();
                while (true) {
                    int i = -1;
                    if (!it.hasNext()) {
                        int size2 = list.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i2 = size2 - 1;
                                if (size2 >= size || !zArr[size2]) {
                                    hhg1.n("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                    return;
                                } else if (i2 < 0) {
                                    break;
                                } else {
                                    size2 = i2;
                                }
                            }
                        }
                        for (trj0 trj0Var : en31Var.e(linkedHashMap)) {
                            byte b2 = trj0Var.a;
                            byte b3 = trj0Var.b;
                            LinkedHashMap linkedHashMap2 = abgVar.a;
                            if (linkedHashMap2.containsKey(Integer.valueOf(b2))) {
                                b7x b7xVar = (Map) linkedHashMap2.get(Integer.valueOf(b2));
                                if (b7xVar == null) {
                                    b7xVar = b7x.a;
                                }
                                zContainsKey = b7xVar.containsKey(Integer.valueOf(b3));
                            } else {
                                zContainsKey = false;
                            }
                            if (!zContainsKey) {
                                abgVar.b(trj0Var);
                            }
                        }
                        return;
                    }
                    tka0 tka0Var = (tka0) it.next();
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i3 = size3 - 1;
                            if (tka0Var.m(list.get(size3))) {
                                zArr[size3] = true;
                                i = size3;
                                break;
                            } else if (i3 < 0) {
                                break;
                            } else {
                                size3 = i3;
                            }
                        }
                    }
                    if (i < 0) {
                        bhn0.k("A required auto migration spec (", tka0Var.o(), ") is missing in the database configuration.");
                        return;
                    }
                    linkedHashMap.put(tka0Var, list.get(i));
                }
            }

            public static final void x(LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                        hhg1.f(f4i1.c(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                        return;
                    }
                }
            }

            public static final void y(en31 en31Var, c5r c5rVar) {
                LinkedHashMap linkedHashMapL = en31Var.l();
                List list = c5rVar.m;
                boolean[] zArr = new boolean[list.size()];
                for (Map.Entry entry : linkedHashMapL.entrySet()) {
                    tka0 tka0Var = (tka0) entry.getKey();
                    for (tka0 tka0Var2 : (List) entry.getValue()) {
                        int size = list.size() - 1;
                        if (size < 0) {
                            size = -1;
                            break;
                        }
                        while (true) {
                            int i = size - 1;
                            if (tka0Var2.m(list.get(size))) {
                                zArr[size] = true;
                                break;
                            } else {
                                if (i < 0) {
                                    size = -1;
                                    break;
                                }
                                size = i;
                            }
                        }
                        if (size < 0) {
                            bhn0.m("A required type converter (", tka0Var2.o(), ") for ", tka0Var.o(), " is missing in the database configuration.");
                            return;
                        }
                        en31Var.j.put(tka0Var2, list.get(size));
                    }
                }
                int size2 = list.size() - 1;
                if (size2 < 0) {
                    return;
                }
                while (true) {
                    int i2 = size2 - 1;
                    if (!zArr[size2]) {
                        hhg1.n(cy30.m("Unexpected type converter ", list.get(size2), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."));
                        return;
                    } else if (i2 < 0) {
                        return;
                    } else {
                        size2 = i2;
                    }
                }
            }
        }
