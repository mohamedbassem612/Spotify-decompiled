package p;

import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ukm0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ukm0(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public static final boolean a(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        kls0 kls0Var = (kls0) this.b;
        String str = ((ovs0) this.c).g;
        if (str == null) {
            str = "";
        }
        otw.c(kls0Var, new oxs0(str), (qim0) null, (ipb1) null, b0kVar, 0, 12);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        String str = ((w4a) this.b).e;
        float f = ows0.d;
        cr31 cr31VarB = er31.b(f);
        pux puxVar = ows0.h;
        nim0 nim0Var = nim0.a;
        ows0.d(str, cr31VarB, puxVar, d7e.r(2.0f, u291.f(nim0Var, 1.0f), false), x340Var, 512);
        if (((gxs0) this.c).d) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-1535549271);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-1535786638);
            t1c.a(dug.f(i1p1.q(d7e.r(2.0f, u291.f(nim0Var, 1.0f), false), er31.b(f)), ows0.a, d4o1.a), x340Var3, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        g2c g2cVar = (g2c) obj;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        String str = ((qpl) this.b).h;
        float f = ows0.c;
        cr31 cr31VarB = er31.b(f);
        pux puxVar = ows0.g;
        nim0 nim0Var = nim0.a;
        ows0.d(str, cr31VarB, puxVar, d7e.r(1.0f, u291.f(nim0Var, 1.0f), false), x340Var, 512);
        if (((gxs0) this.c).d) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-2038062872);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-2038271409);
            t1c.a(dug.f(i1p1.q(g2cVar.b(nim0Var), er31.b(f)), ows0.a, d4o1.a), x340Var3, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        max maxVar;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.c;
        j3t0 j3t0Var = (j3t0) this.b;
        boolean z = j3t0Var.a;
        if (j3t0Var.c) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(656838881);
            x340Var2.r(false);
            maxVar = jax.a;
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(656840619);
            max haxVar = new hax(cwl1.o0(x340Var3, 2131959754));
            x340Var3.r(false);
            maxVar = haxVar;
        }
        qim0 qim0VarN = anm1.N("pip_setting_element_switch", nim0.a);
        x340 x340Var4 = x340Var;
        boolean zG = x340Var4.g(iu30Var);
        Object objT = x340Var4.T();
        if (zG || objT == fkj0.X) {
            objT = new azr0(iu30Var, (byte) 10);
            x340Var4.s0(objT);
        }
        anm1.c(z, (iu30) objT, qim0VarN, maxVar, (idn0) null, x340Var4, 0, 16);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        Rect rect;
        hsl1 hsl1Var = (hsl1) obj2;
        h5t0 h5t0Var = (h5t0) this.b;
        View view = (View) this.c;
        h5t0Var.f = hsl1Var.a.i(519).d;
        RecyclerView recyclerViewB = h5t0.b(view);
        if (recyclerViewB != null) {
            rect = new Rect();
            recyclerViewB.getGlobalVisibleRect(rect);
            rect.bottom -= h5t0Var.f;
        } else {
            rect = null;
        }
        h5t0Var.d = rect;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new x37(h5t0Var, view, (byte) 14));
            return hsl1Var;
        }
        m511 m511VarW = hap1.w(view);
        Rect rect2 = new Rect((int) m511VarW.a, (int) m511VarW.b, (int) m511VarW.c, (int) m511VarW.d);
        h5t0Var.e = rect2;
        Object objInvoke = h5t0Var.b.invoke(Boolean.valueOf(h5t0.c(rect2, h5t0Var.d)));
        if (objInvoke != null) {
            h5t0Var.c.invoke(objInvoke);
        }
        return hsl1Var;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        anm1.c(((v6y0) this.b).c, (iu30) null, (qim0) null, (max) this.c, (idn0) null, (b0k) obj2, 48, 20);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        u1p1.m(((mvt0) this.b).e, (iu30) this.c, (b0k) obj2, 0);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        kno1.e(er31.a, apo.r(-1876628567, new t1t0((hnu0) this.b, (byte) 15), b0kVar), null, apo.r(1383303143, new psr0((String) this.c, (byte) 15), b0kVar), b0kVar, 25008, 8);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        af5 af5Var;
        af5 af5Var2;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        uwr uwrVar = cbx.a;
        lee1 lee1Var = cbx.d(x340Var).h;
        String str = (String) this.b;
        enu0 enu0Var = (gnu0) this.c;
        inu0 sender = enu0Var.getSender();
        enu0 enu0Var2 = enu0Var instanceof enu0 ? enu0Var : null;
        knu0 knu0Var = enu0Var2 != null ? enu0Var2.b : null;
        if (knu0Var != null && knu0Var.a() && (knu0Var instanceof inu0)) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1216823784);
            af5Var = z5p1.j(cwl1.n0(2131959903, new Object[]{((inu0) knu0Var).b, str}, x340Var2), str, x340Var2);
            x340Var2.r(false);
        } else {
            if (knu0Var == null || !knu0Var.a()) {
                if (knu0Var instanceof inu0) {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(2117482937);
                    af5Var2 = new af5(cwl1.n0(2131959905, new Object[]{((inu0) knu0Var).b}, x340Var3));
                    x340Var3.r(false);
                } else if (sender instanceof inu0) {
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(2117489465);
                    af5 af5Var3 = new af5(cwl1.n0(2131959901, new Object[]{sender.b}, x340Var4));
                    x340Var4.r(false);
                    af5Var2 = af5Var3;
                } else {
                    x340 x340Var5 = x340Var;
                    x340Var5.i0(2117495108);
                    x340Var5.r(false);
                    af5Var = new af5("");
                }
                uwo1.f(af5Var2, anm1.N("playlist_invitation_share_row_card_title", nim0.a), lee1Var, null, null, null, 2, false, null, 0, null, null, x340Var, 0, 0, 4024);
                return rih1.a;
            }
            x340 x340Var6 = x340Var;
            x340Var6.i0(1217170736);
            af5Var = z5p1.j(cwl1.n0(2131959899, new Object[]{str}, x340Var6), str, x340Var6);
            x340Var6.r(false);
        }
        af5Var2 = af5Var;
        uwo1.f(af5Var2, anm1.N("playlist_invitation_share_row_card_title", nim0.a), lee1Var, null, null, null, 2, false, null, 0, null, null, x340Var, 0, 0, 4024);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ((hou0) this.b).k((af5) this.c, (qim0) null, (b0k) obj2, 0);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:139:0x0612 A[PHI: r16
      0x0612: PHI (r16v11 java.lang.Integer) = (r16v6 java.lang.Integer), (r16v9 java.lang.Integer) binds: [B:138:0x0610, B:144:0x062a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:151:0x064a A[PHI: r10
      0x064a: PHI (r10v40 java.lang.Integer) = (r10v31 java.lang.Integer), (r10v36 java.lang.Integer) binds: [B:150:0x0648, B:156:0x0668] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        long j;
        b0k b0kVar;
        int size;
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        qim0 qim0Var = nim0.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                srt0 srt0Var = (srt0) obj5;
                nkm0 nkm0Var = (okm0) obj4;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar2, 0);
                x340 x340Var = (x340) b0kVar2;
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
                hzj.A.getClass();
                x340 x340Var2 = (x340) b0kVar2;
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, b0kVar2, y580.O0);
                nko1.H(xos0VarM, b0kVar2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                nko1.F(b0kVar2);
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                nkm0 nkm0Var2 = nkm0Var;
                String str = nkm0Var2.a;
                boolean zJ = u890.j(srt0Var, new mrt0(str));
                zkt0 zkt0Var = zkt0.c;
                zkt0 zkt0Var2 = zJ ? zkt0.a : u890.j(srt0Var, new krt0(str)) ? zkt0.b : zkt0Var;
                if (zkt0Var2 != zkt0Var) {
                    x340Var2.i0(1200907145);
                    uwr uwrVar = cbx.a;
                    j = cbx.a(b0kVar2).c.c;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1200984304);
                    j = ((u7h) x340Var2.k(qgx.a)).a;
                    x340Var2.r(false);
                }
                if (zkt0Var2 != zkt0Var) {
                    x340Var2.i0(1201117573);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar2).b;
                    b0kVar = b0kVar2;
                    wkt0.a(zkt0Var2, u291.r(uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 12.0f), (ksl) null, 0L, false, b0kVar, 0, 28);
                    x340Var2.r(false);
                } else {
                    b0kVar = b0kVar2;
                    x340Var2.i0(1201313617);
                    x340Var2.r(false);
                }
                uwo1.e(nkm0Var2.b, null, null, j, null, null, 2, false, new cjc0(1), 0, null, b0kVar, 0, 0, 1718);
                x340Var2.r(true);
                return rih1Var;
            case 1:
                llj lljVar = y580.Y;
                vu30 vu30Var = y580.R0;
                vu30 vu30Var2 = y580.N0;
                llj lljVar2 = y580.O0;
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                int i = p3v.b(((i2c) obj).d() / 2.0f, 260.0f) > 0 ? 3 : 2;
                qim0 qim0VarB = uyn1.B(u291.f(qim0Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7);
                cm0 cm0Var = (cm0) obj5;
                ehm0 ehm0Var = (ehm0) obj4;
                mbh mbhVarA = jbh.a(f36Var, een.P0, b0kVar3, 0);
                x340 x340Var3 = (x340) b0kVar3;
                int i2 = i;
                int iHashCode2 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM2 = x340Var3.m();
                qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarB);
                hzj.A.getClass();
                x340 x340Var4 = (x340) b0kVar3;
                if (x340Var4.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(mbhVarA, b0kVar3, lljVar2);
                nko1.H(xos0VarM2, b0kVar3, vu30Var2);
                nko1.H(Integer.valueOf(iHashCode2), b0kVar3, vu30Var);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE2, b0kVar3, lljVar);
                cm0Var.f(b0kVar3, 0);
                x340Var4.i0(1745803630);
                int i3 = i2;
                ArrayList arrayListS1 = o7h.s1(ehm0Var.b, i3, i3);
                int size2 = arrayListS1.size();
                int i4 = 0;
                while (i4 < size2) {
                    List list = (List) arrayListS1.get(i4);
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    ArrayList arrayList = arrayListS1;
                    qim0 qim0Var2 = qim0Var;
                    int i5 = i3;
                    jw31 jw31VarA2 = ew31.a(new d36(6.0f, true, new um5(false)), een.Z, b0kVar3, 0);
                    vu30 vu30Var3 = vu30Var2;
                    int iHashCode3 = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM3 = x340Var4.m();
                    qim0 qim0VarE3 = zr7.E(b0kVar3, qim0VarF);
                    hzj.A.getClass();
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(jw31VarA2, b0kVar3, lljVar2);
                    vu30 vu30Var4 = vu30Var3;
                    nko1.H(xos0VarM3, b0kVar3, vu30Var4);
                    nko1.H(Integer.valueOf(iHashCode3), b0kVar3, vu30Var);
                    nko1.F(b0kVar3);
                    nko1.H(qim0VarE3, b0kVar3, lljVar);
                    x340Var4.i0(-1408127282);
                    int size3 = list.size();
                    int i6 = 0;
                    while (i6 < size3) {
                        ow01 ow01Var = (ow01) list.get(i6);
                        int i7 = size2;
                        if (1.0f <= 0.0d) {
                            of80.a("invalid weight; must be greater than zero");
                        }
                        wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        vu30 vu30Var5 = vu30Var;
                        int iHashCode4 = Long.hashCode(x340Var4.T);
                        xos0 xos0VarM4 = x340Var4.m();
                        qim0 qim0VarE4 = zr7.E(b0kVar3, wnb0Var);
                        hzj.A.getClass();
                        x340Var4.m0();
                        if (x340Var4.S) {
                            x340Var4.l(n4kVar);
                        } else {
                            x340Var4.v0();
                        }
                        nko1.H(gfh0VarC, b0kVar3, lljVar2);
                        nko1.H(xos0VarM4, b0kVar3, vu30Var4);
                        vu30Var = vu30Var5;
                        nko1.H(Integer.valueOf(iHashCode4), b0kVar3, vu30Var);
                        nko1.F(b0kVar3);
                        nko1.H(qim0VarE4, b0kVar3, lljVar);
                        b0k b0kVar4 = b0kVar3;
                        otw.c((ud1) cm0Var.i, new nx01(ow01Var.c, ow01Var.a, ow01Var.b, ow01Var.d, ow01Var.e), (qim0) null, (ipb1) null, b0kVar4, 0, 12);
                        x340Var4.r(true);
                        i6++;
                        size2 = i7;
                        b0kVar3 = b0kVar4;
                        vu30Var4 = vu30Var4;
                    }
                    vu30 vu30Var6 = vu30Var4;
                    int i8 = size2;
                    b0k b0kVar5 = b0kVar3;
                    x340Var4.r(false);
                    x340Var4.i0(-1408116356);
                    int size4 = i5 - list.size();
                    for (int i9 = 0; i9 < size4; i9++) {
                        if (1.0f <= 0.0d) {
                            of80.a("invalid weight; must be greater than zero");
                        }
                        t1c.a(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), b0kVar5, 0);
                    }
                    x340Var4.r(false);
                    x340Var4.r(true);
                    i4++;
                    size2 = i8;
                    b0kVar3 = b0kVar5;
                    qim0Var = qim0Var2;
                    i3 = i5;
                    vu30Var2 = vu30Var6;
                    arrayListS1 = arrayList;
                }
                x340Var4.r(false);
                x340Var4.r(true);
                return rih1Var;
            case 2:
                Function0 function0 = (Function0) obj;
                x340 x340Var5 = (b0k) obj2;
                hqm0 hqm0Var = (hqm0) obj5;
                int iIntValue = ((Number) obj3).intValue();
                ArrayList arrayList2 = hqm0Var.b;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var5.i(function0) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int iC = l1d.C(hqm0Var.c);
                    if (iC == 0) {
                        x340Var6.i0(1823199355);
                        rqg0.j(arrayList2, hqm0Var.a, function0, ((jqm0) obj4).a, null, x340Var6, (iIntValue << 6) & 896);
                        x340Var6.r(false);
                    } else if (iC == 1) {
                        x340Var6.i0(1823207255);
                        ejo1.a(arrayList2, function0, null, x340Var6, (iIntValue << 3) & 112);
                        x340Var6.r(false);
                    } else {
                        if (iC != 2) {
                            throw p3d1.k(x340Var6, 1823197373, false);
                        }
                        x340Var6.i0(1823210104);
                        ejo1.i(arrayList2, function0, null, x340Var6, (iIntValue << 3) & 112);
                        x340Var6.r(false);
                    }
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                ux uxVar = (ux) obj5;
                if (uxVar != null || (uxVar = (ux) ((ven0) obj4).getValue()) != null) {
                    int i10 = (uxVar.b - 1) * 15000;
                    lsx lsxVar = uxVar.a == 2 ? lsx.c : jsx.c;
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarR = u291.r(uyn1.z(cbx.b(x340Var7).b.b, 0.0f, 2, qim0Var), 72.0f);
                    zsc zscVar = zex.a;
                    qim0 qim0VarF2 = dug.f(qim0VarR, ((vex) zscVar.b).a, er31.b(12.0f));
                    cvx cvxVar2 = cbx.b(x340Var7).b;
                    qim0 qim0VarN = anm1.N("multitap-seek-accumulator-chip", uyn1.x(qim0VarF2, 12.0f));
                    era eraVar = een.Q0;
                    cvx cvxVar3 = cbx.b(x340Var7).b;
                    mbh mbhVarA2 = jbh.a(new d36(4.0f, false, new g21(een.N0, (byte) 28)), eraVar, x340Var7, 48);
                    x340 x340Var8 = x340Var7;
                    int iHashCode5 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM5 = x340Var8.m();
                    qim0 qim0VarE5 = zr7.E(x340Var7, qim0VarN);
                    hzj.A.getClass();
                    x340 x340Var9 = x340Var7;
                    if (x340Var9.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var9.m0();
                    if (x340Var9.S) {
                        x340Var9.l(n4kVar);
                    } else {
                        x340Var9.v0();
                    }
                    nko1.H(mbhVarA2, x340Var7, y580.O0);
                    nko1.H(xos0VarM5, x340Var7, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode5), x340Var7, y580.R0);
                    nko1.F(x340Var7);
                    nko1.H(qim0VarE5, x340Var7, y580.Y);
                    zov0 zov0Var = cbx.b(x340Var7).g;
                    w0h1.a(lsxVar, isl.a, u291.r(qim0Var, 24.0f), 0L, 0L, false, x340Var7, 56, 56);
                    int i11 = vpd1.b;
                    int iAbs = Math.abs(i10) / 1000;
                    uwo1.e(iAbs < 60 ? iAbs + "s" : (iAbs / 60) + ":" + ihc1.F0(2, String.valueOf(iAbs % 60)), null, cbx.d(x340Var7).g, ((vex) zscVar.b).b, null, null, 0, false, null, 0, null, x340Var7, 0, 0, 2034);
                    x340Var9.r(true);
                }
                return rih1Var;
            case 4:
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                WeakHashMap weakHashMap = osl1.x;
                qim0 qim0VarO = td6.o(lhc.g(x340Var10).g, 32, qim0Var);
                e27 e27Var = (e27) obj5;
                iu30 iu30Var = (iu30) obj4;
                mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var10, 0);
                x340 x340Var11 = x340Var10;
                int iHashCode6 = Long.hashCode(x340Var11.T);
                xos0 xos0VarM6 = x340Var11.m();
                qim0 qim0VarE6 = zr7.E(x340Var10, qim0VarO);
                hzj.A.getClass();
                x340 x340Var12 = x340Var10;
                if (x340Var12.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                nko1.H(mbhVarA3, x340Var10, y580.O0);
                nko1.H(xos0VarM6, x340Var10, y580.N0);
                nko1.H(Integer.valueOf(iHashCode6), x340Var10, y580.R0);
                nko1.F(x340Var10);
                nko1.H(qim0VarE6, x340Var10, y580.Y);
                String strO0 = cwl1.o0(x340Var10, 2131959076);
                uwr uwrVar4 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var10).h;
                long j2 = cbx.a(x340Var10).b.a;
                cjc0 cjc0Var = new cjc0(2);
                cvx cvxVar4 = cbx.b(x340Var10).b;
                qim0 qim0VarF3 = u291.f(uyn1.x(qim0Var, 16.0f), 1.0f);
                Object objT = x340Var12.T();
                if (objT == m4cVar) {
                    objT = sbn0.Z;
                    x340Var12.s0(objT);
                }
                uwo1.e(strO0, s161.b(qim0VarF3, false, (iu30) objT), lee1Var, j2, new a0e1(3), null, 2, false, cjc0Var, 0, null, x340Var10, 0, 0, 1696);
                rqo1.g(0, 1, x340Var10, null);
                x340Var12.i0(-2113573288);
                for (jgn0 jgn0Var : jgn0.c) {
                    boolean zG = x340Var12.g(iu30Var);
                    Object objT2 = x340Var12.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new wck0(iu30Var, (byte) 7);
                        x340Var12.s0(objT2);
                    }
                    e27Var.e(jgn0Var, (iu30) objT2, (qim0) null, x340Var10, 0);
                }
                x340Var12.r(false);
                x340Var12.r(true);
                return rih1Var;
            case 5:
                xxr0 xxr0Var = (xxr0) obj;
                x340 x340Var13 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? x340Var13.g(xxr0Var) : x340Var13.i(xxr0Var) ? 4 : 2;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    otw.c((xfd) obj5, new wfd(xxr0Var.a, ((Boolean) ((ven0) obj4).getValue()).booleanValue()), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 6:
                i2c i2cVar = (i2c) obj;
                x340 x340Var15 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                stn0 stn0Var = (stn0) obj5;
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var15.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    Object objT3 = x340Var16.T();
                    if (objT3 == m4cVar2) {
                        objT3 = v8r.q(Boolean.TRUE);
                        x340Var16.s0(objT3);
                    }
                    ven0 ven0Var = (ven0) objT3;
                    float fD = i2cVar.d();
                    c380 c380Var = stn0Var.a;
                    int size5 = c380Var.size();
                    if (size5 < 1) {
                        size5 = 1;
                    }
                    float f = fD / size5;
                    ArrayList arrayList3 = new ArrayList(q7h.U(c380Var, 10));
                    Iterator it = c380Var.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((btn0) it.next()).c);
                    }
                    Set setP1 = o7h.p1(arrayList3);
                    Object objT4 = x340Var16.T();
                    if (objT4 == m4cVar2) {
                        objT4 = new bw91();
                        x340Var16.s0(objT4);
                    }
                    bw91 bw91Var = (bw91) objT4;
                    int i12 = 0;
                    for (Object obj6 : c380Var) {
                        boolean z2 = z;
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            p7h.T();
                            throw null;
                        }
                        btn0 btn0Var = (btn0) obj6;
                        Integer numU = ern1.u(bw91Var, btn0Var);
                        if (numU == null) {
                            Integer numValueOf = Integer.valueOf(i12);
                            if (i12 != 0) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                size = numValueOf.intValue();
                            } else {
                                numValueOf = Integer.valueOf(bw91Var.size());
                                if (i12 != ((rr80) p7h.K(c380Var)).b) {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    size = numValueOf.intValue();
                                } else {
                                    Integer numU2 = ern1.u(bw91Var, (btn0) o7h.t0(i12 - 1, c380Var));
                                    Integer numValueOf2 = numU2 != null ? Integer.valueOf(numU2.intValue() + 1) : null;
                                    if (numValueOf2 == null) {
                                        Integer numU3 = ern1.u(bw91Var, (btn0) o7h.t0(i13, c380Var));
                                        numValueOf2 = numU3 != null ? Integer.valueOf(numU3.intValue() - 1) : null;
                                        if (numValueOf2 != null) {
                                            size = numValueOf2.intValue();
                                        } else {
                                            size = bw91Var.size();
                                        }
                                    } else {
                                        size = numValueOf2.intValue();
                                    }
                                }
                            }
                            bw91Var.add(size, btn0Var);
                        } else {
                            bw91Var.set(numU.intValue(), btn0Var);
                        }
                        i12 = i13;
                        z = z2;
                    }
                    boolean z3 = z;
                    x340Var16.i0(576235058);
                    stn0 stn0Var2 = new stn0(mqo1.F(bw91Var), stn0Var.b, stn0Var.c, stn0Var.d);
                    jw31 jw31VarA3 = ew31.a(h36.a, een.Z, x340Var16, 0);
                    int iHashCode7 = Long.hashCode(x340Var16.T);
                    xos0 xos0VarM7 = x340Var16.m();
                    qim0 qim0VarE7 = zr7.E(x340Var16, (qim0) obj4);
                    hzj.A.getClass();
                    if (x340Var16.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    nko1.H(jw31VarA3, x340Var16, y580.O0);
                    nko1.H(xos0VarM7, x340Var16, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode7), x340Var16, y580.R0);
                    nko1.F(x340Var16);
                    nko1.H(qim0VarE7, x340Var16, y580.Y);
                    stn0Var2.a(6, apo.r(1541801705, new jtn0(setP1, f, ven0Var, bw91Var), x340Var16), x340Var16);
                    x340Var16.r(z3);
                    x340Var16.r(false);
                    boolean zG2 = x340Var16.g(stn0Var);
                    Object objT5 = x340Var16.T();
                    if (zG2 || objT5 == m4cVar2) {
                        objT5 = new s2n0(stn0Var, ven0Var, (byte) 12);
                        x340Var16.s0(objT5);
                    }
                    qxd0.S((Function0) objT5, x340Var16);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                n3o1.c((i3o1) obj5, (iu30) obj4, (b0k) obj2, 0);
                return rih1Var;
            case 8:
                x340 x340Var17 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    qim0 qim0VarD = u291.d(qim0Var, 1.0f);
                    Uri uri = (Uri) obj5;
                    s2o s2oVar = (s2o) obj4;
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode8 = Long.hashCode(x340Var18.T);
                    xos0 xos0VarM8 = x340Var18.m();
                    qim0 qim0VarE8 = zr7.E(x340Var18, qim0VarD);
                    hzj.A.getClass();
                    if (x340Var18.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var18.m0();
                    if (x340Var18.S) {
                        x340Var18.l(n4kVar);
                    } else {
                        x340Var18.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var18, y580.O0);
                    nko1.H(xos0VarM8, x340Var18, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode8), x340Var18, y580.R0);
                    nko1.F(x340Var18);
                    nko1.H(qim0VarE8, x340Var18, y580.Y);
                    uri.getClass();
                    String str2 = s2oVar.a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    bmq0.a(uri, (qim0) null, hcx.a, (String) null, str2, 0L, 0L, false, x340Var18, 384, 234);
                    x340Var18.r(true);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var19 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (u890.j(((eno0) obj5).a, (String) obj4)) {
                    x340 x340Var20 = x340Var19;
                    x340Var20.i0(1085183207);
                    ilx ilxVar = ilx.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var20, 2131957165));
                    uwr uwrVar5 = cbx.a;
                    long j3 = cbx.a(x340Var20).b.c;
                    zov0 zov0Var2 = cbx.b(x340Var20).g;
                    w0h1.a(ilxVar, jslVar, u291.r(qim0Var, 16.0f), j3, 0L, false, x340Var20, ilx.d, 48);
                    x340Var20.r(false);
                } else {
                    x340 x340Var21 = x340Var19;
                    x340Var21.i0(1085555486);
                    x340Var21.r(false);
                }
                return rih1Var;
            case 10:
                ((Number) obj3).intValue();
                otw.c((umf0) obj5, new tg7(((l6p0) obj4).a, true), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj3).intValue();
                float f2 = ((bor0) obj4).e;
                z6p1.g((vnr0) obj5, uyn1.y(qim0Var, 4.0f + f2, f2), (b0k) obj2, 8);
                return rih1Var;
            case grn1.d /* 12 */:
                b0k b0kVar6 = (b0k) obj2;
                ((Number) obj3).intValue();
                fdq0 fdq0Var = (fdq0) obj5;
                jmr0 jmr0Var = (jmr0) obj4;
                eso1.h(oi7.a(Uri.parse(fdq0Var.d), (gw70) null, (xb10) null, (yqi1) null, jmr0Var, jmr0Var, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar6, 2359296, 0, 130974), new jsl(fdq0Var.b), (qim0) null, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, b0kVar6, 0, 508);
                return rih1Var;
            case 13:
                x340 x340Var22 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF4 = u291.f(qim0Var, 1.0f);
                uwr uwrVar6 = cbx.a;
                qim0 qim0VarZ = uyn1.z(cbx.b(x340Var22).b.c, 0.0f, 2, qim0VarF4);
                WeakHashMap weakHashMap2 = osl1.x;
                qim0 qim0VarP = x0d.p(lhc.g(x340Var22).g, 32, qim0VarZ);
                smp0 smp0Var = (smp0) obj5;
                ofq0 ofq0Var = (ofq0) obj4;
                mbh mbhVarA4 = jbh.a(f36Var, een.Q0, x340Var22, 0);
                x340 x340Var23 = x340Var22;
                int iHashCode9 = Long.hashCode(x340Var23.T);
                xos0 xos0VarM9 = x340Var23.m();
                qim0 qim0VarE9 = zr7.E(x340Var22, qim0VarP);
                hzj.A.getClass();
                x340 x340Var24 = x340Var22;
                if (x340Var24.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var24.m0();
                if (x340Var24.S) {
                    x340Var24.l(n4kVar);
                } else {
                    x340Var24.v0();
                }
                nko1.H(mbhVarA4, x340Var22, y580.O0);
                nko1.H(xos0VarM9, x340Var22, y580.N0);
                nko1.H(Integer.valueOf(iHashCode9), x340Var22, y580.R0);
                nko1.F(x340Var22);
                nko1.H(qim0VarE9, x340Var22, y580.Y);
                op71.g(x340Var22, u291.h(qim0Var, cbx.b(x340Var22).b.a));
                boolean zB = ef.a(x340Var22).b(6);
                ncf0 ncf0VarG = h5p1.G(new ocf0(2131886088), null, null, x340Var22, 0, 62);
                kbf0 kbf0VarN = zpn1.n(ncf0VarG.c(), zB, false, null, 0.0f, Integer.MAX_VALUE, x340Var22, 956);
                fcf0 fcf0VarC = ncf0VarG.c();
                boolean zI = x340Var24.i(kbf0VarN);
                Object objT6 = x340Var24.T();
                if (zI || objT6 == fkj0.X) {
                    objT6 = new uk1(kbf0VarN, (byte) 15);
                    x340Var24.s0(objT6);
                }
                mp10.e(fcf0VarC, (Function0) objT6, u291.r(qim0Var, 120.0f), false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, mif1.Q0, false, false, (Map) null, (jj7) null, false, x340Var22, 0, 0, 64504);
                cvx cvxVar5 = cbx.b(x340Var22).b;
                uwo1.e(eqq.n(qim0Var, 16.0f, x340Var22, 2131959504, x340Var22), u291.f(qim0Var, 1.0f), cbx.d(x340Var22).e, cbx.a(x340Var22).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var22, 0, 0, 2016);
                cvx cvxVar6 = cbx.b(x340Var22).b;
                uwo1.e(eqq.n(qim0Var, 8.0f, x340Var22, 2131959503, x340Var22), u291.f(qim0Var, 1.0f), cbx.d(x340Var22).j, cbx.a(x340Var22).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var22, 0, 0, 2016);
                op71.g(x340Var22, u291.h(qim0Var, cbx.b(x340Var22).b.a));
                cxp cxpVar = (cxp) smp0Var.d;
                q7r0 q7r0VarG = ((cir0) x340Var24.k(k2r0.a)).g();
                cxpVar.getClass();
                otw.c(new zh1(q7r0VarG, (byte) 1), new lab0(ofq0Var.a), (qim0) null, (ipb1) null, x340Var22, 8, 12);
                cvx cvxVar7 = cbx.b(x340Var22).b;
                ydh.l(qim0Var, 16.0f, x340Var22, x340Var24, true);
                return rih1Var;
            case 14:
                b6r0 b6r0Var = (b6r0) obj5;
                return qon1.o(b6r0Var.c, b6r0Var.b, (iac0) obj, (bbr0) obj2, (Function0) obj3, b6r0Var.d, null, (xnn0) obj4);
            case 15:
                byp bypVar = (byp) obj5;
                return o7r0.c((qp60) bypVar.c, (qe41) obj4, (iac0) obj, (bbr0) obj2, (Function0) obj3, (String) bypVar.a, (fkk1) bypVar.g, 64);
            case 16:
                b0k b0kVar7 = (b0k) obj2;
                ((Number) obj3).intValue();
                ((j2i) obj5).invoke(lnn1.n((vzq0) obj4, uyn1.h(2, zjy.p(0.0f, new p3v((((i2c) obj).d() - dsa0.m(b0kVar7, 2131166901)) / 2.0f)).a, 0.0f)), b0kVar7, 0);
                return rih1Var;
            case 17:
                x340 x340Var25 = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj4;
                String strO1 = cwl1.o0(x340Var25, 2131957159);
                boolean z4 = ((bcb0) obj5).b == null;
                x340 x340Var26 = x340Var25;
                boolean zG3 = x340Var26.g(iu30Var2);
                Object objT7 = x340Var26.T();
                if (zG3 || objT7 == fkj0.X) {
                    objT7 = new dgq0(iu30Var2, (byte) 14);
                    x340Var26.s0(objT7);
                }
                gbx gbxVar = new gbx(z50.c, (Function0) objT7);
                uwr uwrVar7 = cbx.a;
                cvx cvxVar8 = cbx.b(x340Var26).b;
                rzn1.g(strO1, gbxVar, anm1.N("off_row", uyn1.z(8.0f, 0.0f, 2, qim0Var)), z4, x340Var26, 0);
                return rih1Var;
            case 18:
                x340 x340Var27 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN2 = anm1.N("parental_hub_entity_row_trailing_action", qim0Var);
                j2i j2iVar = (j2i) obj5;
                xxr0 xxr0Var2 = (xxr0) obj4;
                gfh0 gfh0VarC3 = t1c.c(een.d, false);
                x340 x340Var28 = x340Var27;
                int iHashCode10 = Long.hashCode(x340Var28.T);
                xos0 xos0VarM10 = x340Var28.m();
                qim0 qim0VarE10 = zr7.E(x340Var27, qim0VarN2);
                hzj.A.getClass();
                x340 x340Var29 = x340Var27;
                if (x340Var29.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var29.m0();
                if (x340Var29.S) {
                    x340Var29.l(n4kVar);
                } else {
                    x340Var29.v0();
                }
                nko1.H(gfh0VarC3, x340Var27, y580.O0);
                nko1.H(xos0VarM10, x340Var27, y580.N0);
                nko1.H(Integer.valueOf(iHashCode10), x340Var27, y580.R0);
                nko1.F(x340Var27);
                nko1.H(qim0VarE10, x340Var27, y580.Y);
                j2iVar.invoke(xxr0Var2, x340Var27, 0);
                x340Var29.r(true);
                return rih1Var;
            case 19:
                return d(obj, obj2, obj3);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return e(obj, obj2, obj3);
            case 21:
                return f(obj, obj2, obj3);
            case 22:
                return g(obj, obj2, obj3);
            case 23:
                return h(obj, obj2, obj3);
            case 24:
                return i(obj, obj2, obj3);
            case 25:
                return j(obj, obj2, obj3);
            case 26:
                return k(obj, obj2, obj3);
            case 27:
                return m(obj, obj2, obj3);
            case 28:
                return n(obj, obj2, obj3);
            default:
                ((Number) obj3).intValue();
                ((ulc) obj5).a(0, (Function0) obj4, (b0k) obj2, (qim0) null);
                return rih1Var;
        }
    }
}
