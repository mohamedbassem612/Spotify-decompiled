package p;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import com.spotify.wrapped.v1.proto.Outline;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class l2p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        byte b2;
        qim0 qim0Var2;
        h311 h311VarV;
        an9 an9Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-480280148);
        int i2 = 2;
        int i3 = ((i & 6) == 0 ? (x340Var.i(c380Var) ? 4 : 2) | i : i) | 48;
        boolean z = true;
        boolean z2 = false;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            List listD1 = o7h.d1(c380Var, 4);
            boolean zIsEmpty = listD1.isEmpty();
            qim0 qim0Var3 = nim0.a;
            if (zIsEmpty) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    an9Var = new an9(c380Var, qim0Var3, i, (byte) 0);
                }
            } else {
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                float f = 40.0f;
                float size = ((listD1.size() - 1) * 20.0f) + 40.0f;
                cua cuaVar = cbx.b(x340Var).f;
                hw61 hw61VarB = er31.b(4.0f);
                qim0 qim0VarS = u291.s(qim0Var3, size, 40.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarS);
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
                x340Var.i0(375529410);
                int i4 = 0;
                for (Object obj : listD1) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    ao9 ao9Var = (ao9) obj;
                    Uri uri = Uri.parse(ao9Var.c);
                    jsl jslVar = new jsl(ao9Var.b);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var).f;
                    cua cuaVar3 = cbx.b(x340Var).f;
                    zvx zvxVar = new zvx();
                    qim0 qim0VarD = eqr0.D(i4 * 20.0f, 0.0f, i2, qim0Var3);
                    if (i4 > 0) {
                        x340Var.i0(1872234522);
                        cvx cvxVar = cbx.b(x340Var).b;
                        qim0 qim0VarO = sto1.o(qim0Var3, 4.0f, hw61VarB, false, 0L, 0L, 28);
                        x340Var.r(z2);
                        qim0Var3 = qim0VarO;
                    } else {
                        x340Var.i0(1872236937);
                        x340Var.r(z2);
                    }
                    eso1.e(uri, jslVar, qim0VarD.then(qim0Var3), new p3v(f), zvxVar, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 0, 0, 4064);
                    z = true;
                    z2 = z2;
                    qim0Var3 = qim0Var3;
                    hw61VarB = hw61VarB;
                    i2 = i2;
                    f = f;
                    i4 = i5;
                }
                x340Var.r(z2);
                b2 = 1;
                x340Var.r(true);
                qim0Var2 = qim0Var3;
            }
            h311VarV.d = an9Var;
        }
        b2 = 1;
        x340Var.b0();
        qim0Var2 = qim0Var;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            an9Var = new an9(c380Var, qim0Var2, i, b2);
            h311VarV.d = an9Var;
        }
    }

    public static final void b(c380 c380Var, Function0 function0, qim0 qim0Var, u7h u7hVar, boolean z, b0k b0kVar, int i) {
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1097998184);
        int i2 = i | (b0kVar2.i(c380Var) ? 4 : 2) | (b0kVar2.i(function0) ? 32 : 16) | 384 | (b0kVar2.g(u7hVar) ? 2048 : 1024) | (b0kVar2.h(z) ? 16384 : 8192);
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cua cuaVar = cbx.b(b0kVar2).f;
            cr31 cr31VarB = er31.b(8.0f);
            long jA = cbx.a(b0kVar2).a.a.a();
            long j = u7hVar != null ? u7hVar.a : jA;
            String strO0 = cwl1.o0(b0kVar2, 2131953071);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = dug.e(i1p1.q(u291.f(qim0Var3, 1.0f).then(z ? uyn1.y(qim0Var3, 16.0f, 8.0f) : qim0Var3), cr31VarB), v9c.k(new mmr0[]{new mmr0(Float.valueOf(0.0f), new u7h(j)), new mmr0(Float.valueOf(0.5f), new u7h(jA)), new mmr0(Float.valueOf((float) r10), new u7h(jA))}, 0.0f, 0.0f, 14), null, 0.0f, 6);
            boolean zG = b0kVar2.g(strO0);
            Object objT = b0kVar2.T();
            if (zG || objT == fkj0.X) {
                objT = new nb9(strO0, (byte) 1);
                b0kVar2.s0(objT);
            }
            qim0 qim0VarX = uyn1.x(bin.x(s161.a(qim0VarE, (iu30) objT), false, null, null, null, function0, 15), 8.0f);
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarX);
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
            nko1.H(jw31VarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, y580.Y);
            a(c380Var, null, b0kVar2, i2 & 14);
            uwo1.e(cwl1.o0(b0kVar2, 2131953071), new wnb0(1.0f, true), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.a, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2032);
            b0kVar2 = b0kVar2;
            w0h1.a(xpx.c, isl.a, uyn1.B(qim0Var3, 0.0f, 0.0f, 8.0f, 0.0f, 11), cbx.a(b0kVar2).c.a, 0L, false, b0kVar2, xpx.d | 48, 48);
            b0kVar2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ey((Object) c380Var, (cv30) function0, qim0Var2, (Object) u7hVar, z, i, (byte) 6);
        }
    }

    public static final void c(r8d1 r8d1Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2021024234);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(r8d1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(nim0.a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            function1 = function0;
            tho1.l(r8d1Var.b, r8d1Var.c, function1, apo.r(469646105, new jb50(r8d1Var, (byte) 17), x340Var), x340Var, (i2 & 896) | 24576 | ((i2 << 6) & 7168));
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(r8d1Var, function1, i);
        }
    }

    public static final void d(jlw0 jlw0Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1718053339);
        int i2 = (b0kVar3.i(jlw0Var) ? 4 : 2) | i | (b0kVar3.i(qim0Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0VarK = !((Boolean) ven0Var.getValue()).booleanValue() ? d9y0.k(qim0Var, 0.0f) : qim0Var;
            Uri uri = Uri.parse(jlw0Var.a);
            czo1.f(b0kVar3);
            jmr0 jmr0Var = czo1.f(b0kVar3).b;
            boolean zI = b0kVar3.i(ven0Var);
            Object objT2 = b0kVar3.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new r9y0(ven0Var, (byte) 26);
                b0kVar3.s0(objT2);
            }
            iu30 iu30Var = (iu30) objT2;
            boolean zI2 = b0kVar3.i(ven0Var);
            Object objT3 = b0kVar3.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new r9y0(ven0Var, (byte) 27);
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            eso1.h(oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, jmr0Var, true, false, (j6m) null, iu30Var, (iu30) objT3, (iu30) null, 0L, b0kVar2, 103022592, 0, 118430), new jsl(jlw0Var.b), qim0VarK, (p3v) null, (zvx) null, (ecx) null, mif1.S0, (tl3) null, (ColorFilter) null, b0kVar2, 224256, 384);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new j7n0(jlw0Var, qim0Var, i, (byte) 1);
        }
    }

    public static final nwd e(y4m1 y4m1Var, String str) {
        return new nwd(rqt0.u(new yv8(y4m1Var.b(str), (byte) 1)), (byte) 12);
    }

    public static rzq f(l2r l2rVar) {
        return new rzq(l2rVar, (ukj0) null);
    }

    public static final tm20 g(dm20 dm20Var, ol20 ol20Var, boolean z, um20 um20Var, em20 em20Var) {
        switch (dm20Var.c.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new qm20(ol20Var, z, um20Var, em20Var);
            case 1:
                return new lm20(ol20Var, z, em20Var);
            case 2:
                return new jm20(ol20Var, um20Var, em20Var);
            case 3:
                return new hm20(ol20Var);
            case 4:
                return new gm20(ol20Var, em20Var);
            case 5:
                return new pm20(ol20Var, em20Var);
            case 6:
                return new mm20(ol20Var, em20Var);
            case 7:
                return new om20(ol20Var, em20Var);
            case 8:
                return new km20(ol20Var);
            case 9:
                return new rm20(ol20Var);
            case 10:
                return new sm20(ol20Var);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new nm20(ol20Var, um20Var, em20Var);
            case grn1.d /* 12 */:
                return new im20(ol20Var);
            default:
                eg.o();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r3 == r5) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(com.spotify.wrapped.v1.proto.SceneTemplate.VideoEntity r19, p.gw70 r20, p.woa r21, p.pe r22, p.tjs0 r23, p.bju r24, p.onm r25) {
        /*
            r0 = r19
            r1 = r20
            r2 = r24
            r3 = r25
            boolean r4 = r3 instanceof p.wkj1
            if (r4 == 0) goto L1b
            r4 = r3
            p.wkj1 r4 = (p.wkj1) r4
            int r5 = r4.f
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f = r5
            goto L20
        L1b:
            p.wkj1 r4 = new p.wkj1
            r4.<init>(r3)
        L20:
            java.lang.Object r3 = r4.e
            int r5 = r4.f
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L48
            if (r5 == r7) goto L3a
            if (r5 != r6) goto L34
            p.woa r0 = r4.a
            p.hm5.M(r3)
            r9 = r0
            goto L73
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r0)
            return r8
        L3a:
            boolean r0 = r4.d
            p.xkj1 r1 = r4.c
            p.xkj1 r2 = r4.b
            p.hm5.M(r3)
            r15 = r0
            r13 = r1
            r12 = r2
            goto Lb7
        L48:
            p.hm5.M(r3)
            boolean r3 = p.pwo1.v(r22, r23)
            p.d9n r5 = p.d9n.a
            if (r3 == 0) goto L90
            boolean r9 = r0.s()
            if (r9 == 0) goto L90
            float r9 = r22.a()
            r10 = 1069547520(0x3fc00000, float:1.5)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L64
            goto L90
        L64:
            r9 = r21
            r4.a = r9
            r4.d = r3
            r4.f = r6
            java.lang.Object r3 = q(r0, r1, r2, r4)
            if (r3 != r5) goto L73
            goto Lb2
        L73:
            p.rkj1 r3 = (p.rkj1) r3
            p.vkj1 r0 = new p.vkj1
            p.flv r1 = p.ilv.a
            r1.getClass()
            p.ceo r1 = p.flv.f
            r2 = 0
            r4 = 0
            r19 = r0
            r23 = r1
            r22 = r2
            r20 = r3
            r24 = r4
            r21 = r9
            r19.<init>(r20, r21, r22, r23, r24)
            return r0
        L90:
            p.xkj1 r6 = new p.xkj1
            r9 = 0
            r6.<init>(r0, r9)
            p.xkj1 r10 = new p.xkj1
            r10.<init>(r0, r7)
            p.ykj1 r11 = new p.ykj1
            r11.<init>(r0, r1, r8, r9)
            r4.a = r8
            r4.b = r6
            r4.c = r10
            r4.d = r3
            r4.f = r7
            java.lang.String r0 = "entity"
            java.lang.Object r0 = r2.e(r0, r11, r4)
            if (r0 != r5) goto Lb3
        Lb2:
            return r5
        Lb3:
            r15 = r3
            r12 = r6
            r13 = r10
            r3 = r0
        Lb7:
            r14 = r3
            p.yj41 r14 = (p.yj41) r14
            p.dyy r11 = new p.dyy
            r16 = 0
            r17 = 0
            r18 = 1008(0x3f0, float:1.413E-42)
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l2p1.h(com.spotify.wrapped.v1.proto.SceneTemplate$VideoEntity, p.gw70, p.woa, p.pe, p.tjs0, p.bju, p.onm):java.lang.Object");
    }

    public static rzq i(dmh1 dmh1Var, ukj0 ukj0Var) {
        return new rzq(dmh1Var, ukj0Var);
    }

    public static final boolean j(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static final s4d1 k(ji0 ji0Var) {
        List list = ji0Var.O0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof s4d1) {
                arrayList.add(obj);
            }
        }
        return (s4d1) o7h.s0(arrayList);
    }

    public static final List l(ji0 ji0Var) {
        s4d1 s4d1VarK = k(ji0Var);
        if (s4d1VarK == null) {
            return z6x.a;
        }
        ArrayList<m7d1> arrayList = s4d1VarK.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (m7d1 m7d1Var : arrayList) {
            String str = m7d1Var.c;
            String str2 = m7d1Var.d;
            String str3 = m7d1Var.a;
            int iC = l1d.C(m7d1Var.b);
            int i = 1;
            if (iC != 0) {
                if (iC != 1) {
                    i = 3;
                    if (iC != 2) {
                        if (iC != 3) {
                            eg.o();
                            return null;
                        }
                        i = 4;
                    }
                } else {
                    i = 2;
                }
            }
            ArrayList<o7d1> arrayList3 = m7d1Var.e;
            ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
            for (o7d1 o7d1Var : arrayList3) {
                arrayList4.add(new y6d1(o7d1Var.a, o7d1Var.c, o7d1Var.b, false));
            }
            arrayList2.add(new z6d1(i, str, str2, str3, arrayList4, false));
        }
        return arrayList2;
    }

    public static final boolean m(kak0 kak0Var) {
        q6w0 q6w0Var;
        lhg1 lhg1Var = kak0Var.Q0;
        lhg1 lhg1Var2 = kak0Var.S0;
        if (!u890.j(lhg1Var2.b.b, kak0Var.T0) || !u890.j(lhg1Var2.b.h, kak0Var.U0) || !u890.j(lhg1Var, kak0Var.V0)) {
            return true;
        }
        b8w0 b8w0Var = lhg1Var2.a.a;
        b8w0 b8w0Var2 = b8w0.b;
        if (b8w0Var == b8w0Var2) {
            if (((lhg1Var == null || (q6w0Var = lhg1Var.a) == null) ? null : q6w0Var.a) == b8w0Var2) {
                return false;
            }
        }
        if (lhg1Var2.equals(lhg1Var)) {
            return false;
        }
        if (u890.j(kak0Var.W0, j8w0.a)) {
            return lhg1Var != null;
        }
        return !lhg1Var2.equals(kak0Var.h);
    }

    public static int n(float f) {
        return Float.hashCode(f);
    }

    public static final void o(byp bypVar, int i) {
        BehaviorRetainingAppBarLayout behaviorRetainingAppBarLayout = (BehaviorRetainingAppBarLayout) bypVar.b;
        behaviorRetainingAppBarLayout.setBackgroundColor(i);
        if (!behaviorRetainingAppBarLayout.isLaidOut() || behaviorRetainingAppBarLayout.isLayoutRequested()) {
            behaviorRetainingAppBarLayout.addOnLayoutChangeListener(new g360(bypVar, i, (byte) 1));
            return;
        }
        Drawable background = ((Toolbar) bypVar.g).getBackground();
        if (background != null) {
            background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.DST_OVER));
        }
    }

    public static final hh11 p(lg11 lg11Var) {
        return new hh11(lg11Var.a, lg11Var.b, lg11Var.c, lg11Var.d, !lg11Var.e, lg11Var.h, lg11Var.f, lg11Var.g, lg11Var.j, lg11Var.k, lg11Var.i, lg11Var.l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object q(SceneTemplate.VideoEntity videoEntity, gw70 gw70Var, bju bjuVar, onm onmVar) {
        zkj1 zkj1Var;
        SceneTemplate.VideoEntity videoEntity2;
        p811 p811Var;
        p811 p811Var2;
        if (onmVar instanceof zkj1) {
            zkj1Var = (zkj1) onmVar;
            int i = zkj1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                zkj1Var.e = i - Integer.MIN_VALUE;
            } else {
                zkj1Var = new zkj1(onmVar);
            }
        } else {
            zkj1Var = new zkj1(onmVar);
        }
        Object obj = zkj1Var.d;
        int i2 = zkj1Var.e;
        gqb gqbVar = null;
        if (i2 == 0) {
            p811 p811VarU = cy30.u(obj);
            p811 p811Var3 = new p811();
            sh6 sh6Var = new sh6((byte) 13, p811VarU, p811Var3, bjuVar, videoEntity, gw70Var, null);
            zkj1Var.a = videoEntity;
            zkj1Var.b = p811VarU;
            zkj1Var.c = p811Var3;
            zkj1Var.e = 1;
            Object objS = smo1.s(sh6Var, zkj1Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            videoEntity2 = videoEntity;
            p811Var = p811VarU;
            p811Var2 = p811Var3;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p811Var2 = zkj1Var.c;
            p811Var = zkj1Var.b;
            videoEntity2 = zkj1Var.a;
            hm5.M(obj);
        }
        yj41 yj41Var = (yj41) p811Var.a;
        xkj1 xkj1Var = new xkj1(videoEntity2, (byte) 2);
        xkj1 xkj1Var2 = new xkj1(videoEntity2, (byte) 3);
        Uri uri = Uri.parse(videoEntity2.n().getUrl());
        Bitmap bitmap = (Bitmap) p811Var2.a;
        Outline outlineP = videoEntity2.n().p();
        if (outlineP != null) {
            if (((outlineP.p() == 0 || outlineP.n().length() <= 0) ? null : outlineP) != null) {
                gqbVar = new gqb(z4p1.e(Color.parseColor(outlineP.n())), outlineP.p());
            }
        }
        return new rkj1(yj41Var, xkj1Var, xkj1Var2, new did(uri, bitmap, gqbVar), (fb90) null, 16.0f, 16.0f);
    }
}
