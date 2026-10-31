package p;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.contentagnostic.v2.ColorSet;
import com.spotify.contentagnostic.v2.RgbaColor;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class bin {
    public static b180 a;
    public static b180 b;

    public static void A(DrawScope drawScope, yk4 yk4Var, float f, float f2, float f3, float f4, u8s0 u8s0Var) {
        tw4 tw4Var = (tw4) u8s0Var;
        tw4Var.n();
        tw4Var.e(ila0.e(f, f2, f + f3, f2 + f3, f4, f4), 1);
        cab cabVarA1 = drawScope.a1();
        long jU = cabVarA1.u();
        cabVarA1.p().q();
        try {
            ((dg8) cabVarA1.b).i(tw4Var, 1);
            long j = (int) f3;
            DrawScope.G(drawScope, yk4Var, 0L, 0L, (((long) ((int) f)) << 32) | (((long) ((int) f2)) & 4294967295L), (j << 32) | (j & 4294967295L), 1.0f, (ColorFilter) null, 0, 966);
        } finally {
            i3a.n(cabVarA1, jU);
        }
    }

    public static final Object B(cxc cxcVar, String str, onm onmVar) {
        ohd ohdVar = new ohd(1, aym.t(onmVar));
        ohdVar.t();
        ne neVar = new ne((byte) 9);
        neVar.e0(str);
        neVar.t();
        jf01 jf01VarA = cxcVar.a(new ln21(neVar));
        ohdVar.n(new b1u(jf01VarA, (byte) 2));
        jf01VarA.d(new m021(ohdVar, str, (byte) 10));
        return ohdVar.r();
    }

    public static final String C(long j) {
        if (j < 0) {
            hhg1.f(l1d.l(j, "Negative time value: "));
            return null;
        }
        long j2 = (j / 3600000) % 24;
        long j3 = (j / 60000) % 60;
        long j4 = (j / 1000) % 60;
        return j2 == 0 ? String.format(null, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2)) : String.format(null, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)}, 3));
    }

    public static final boolean D(i6 i6Var) {
        p811 p811Var = new p811();
        don1.E(i6Var, rj40.P0, new dqc(new q94(p811Var, (byte) 1), (byte) 4));
        return p811Var.a != null;
    }

    public static final boolean E(KeyEvent keyEvent) {
        long jR = ern1.r(keyEvent);
        int i = toa0.P;
        return toa0.a(jR, toa0.i) || toa0.a(jR, toa0.s) || toa0.a(jR, toa0.F) || toa0.a(jR, toa0.r);
    }

    public static final void F(xpw xpwVar, Object obj, Object obj2, i8h1 i8h1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1207378603);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xpwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(obj2) : x340Var.i(obj2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(i8h1Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            op80 op80VarB = gfe0.b(x340Var);
            if (xpwVar.a().c(obj, obj2, op80VarB)) {
                Object objD = xpwVar.a().d(obj, obj2, op80VarB);
                l7h1 l7h1Var = objD instanceof l7h1 ? (l7h1) objD : null;
                if (l7h1Var != null) {
                    i8h1Var.f(l7h1Var, (Set) null);
                }
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m5r(i, xpwVar, obj, obj2, i8h1Var, (byte) 4);
        }
    }

    public static final lvl0 G(urk0 urk0Var, efk efkVar) {
        d8r0 d8r0Var = efkVar.h;
        return new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), efkVar.g, (byte) 3);
    }

    public static final long H(RgbaColor rgbaColor) {
        return z4p1.f(rgbaColor.s(), rgbaColor.r(), rgbaColor.p(), rgbaColor.o());
    }

    public static final afx I(ColorSet colorSet) {
        int i = ihx.f;
        return ihx.d(colorSet.u() ? H(colorSet.o()) : u7h.d, colorSet.v() ? H(colorSet.p()) : u7h.d, colorSet.w() ? H(colorSet.r()) : u7h.d, colorSet.y() ? H(colorSet.t()) : u7h.d, colorSet.x() ? H(colorSet.s()) : u7h.d);
    }

    public static Next J(kak0 kak0Var, x2k0 x2k0Var) {
        mmr0 mmr0Var;
        s69 s69Var = x2k0Var.b;
        s69 s69Var2 = x2k0Var.c;
        bpo bpoVar = x2k0Var.e;
        q6w0 q6w0Var = kak0Var.S0.a;
        ox30 ox30Var = q6w0Var.N0;
        if (ox30Var == null) {
            ox30Var = new ox30((s69) null, (s69) null, (s69) null);
        }
        ox30 ox30Var2 = q6w0Var.O0;
        if (ox30Var2 == null) {
            ox30Var2 = new ox30((s69) null, (s69) null, (s69) null);
        }
        int iOrdinal = x2k0Var.a.ordinal();
        if (iOrdinal == 0) {
            mmr0Var = new mmr0(kkn.D(ox30Var, bpoVar, s69Var), kkn.w(ox30Var2, bpoVar, s69Var2));
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            mmr0Var = new mmr0(kkn.w(ox30Var, bpoVar, s69Var2), kkn.D(ox30Var2, bpoVar, s69Var));
        }
        return x1p1.t(x1p1.B(x1p1.x(x1p1.F(Next.h(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, lhg1.a(kak0Var.S0, q6w0.a(q6w0Var, (buk1) null, (hez) null, (fa20) null, (px30) null, (taa0) null, (k7f0) null, (s69) null, (s69) null, (gez) null, (gez) null, (r920) null, (r920) null, (ox30) mmr0Var.a, (ox30) mmr0Var.b, (x6b) null, 40959), (ruq0) null, false, false, 14), (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, (giq0) null, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -262145, 1048575)), kak0Var))), 1);
    }

    public static final void a(r4g r4gVar, uy2 uy2Var, ContextTrack contextTrack, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        h311 h311VarV;
        wy2 wy2Var;
        boolean z;
        boolean z2;
        Object obj;
        String str;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1918975933);
        int i2 = i | (x340Var.i(r4gVar) ? 4 : 2) | (x340Var.i(uy2Var) ? 32 : 16) | (x340Var.i(contextTrack) ? 256 : 128) | 3072;
        boolean z3 = true;
        boolean z4 = false;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            if (r4gVar != null) {
                List list = r4gVar.a;
                if (!list.isEmpty()) {
                    String strB0 = contextTrack != null ? l4o1.b0(contextTrack) : null;
                    if (strB0 == null) {
                        strB0 = "";
                    }
                    qim0 qim0VarZ = uyn1.z(dsa0.m(x340Var, 2131166830), 0.0f, 2, l6o1.t(u291.h(uyn1.B(u291.f(anm1.N("agnostic_chips_row", qim0Var3), 1.0f), 0.0f, dsa0.m(x340Var, 2131167033), 0.0f, 0.0f, 13), dsa0.m(x340Var, 2131165793)), l6o1.C(0, 0, 1, x340Var), 14));
                    jw31 jw31VarA = ew31.a(new d36(dsa0.m(x340Var, 2131165906), true, new um5(false)), een.N0, x340Var, 0);
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
                    x340Var.i0(153652615);
                    for (q4g q4gVar : o7h.j0(list)) {
                        x340Var.f0(99741460, q4gVar);
                        boolean zG = x340Var.g(uy2Var);
                        Object objT = x340Var.T();
                        if (zG || objT == fkj0.X) {
                            int iOrdinal = q4gVar.ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == z3) {
                                    boolean z5 = z4;
                                    duy duyVar = (duy) uy2Var.b.get();
                                    boolean z6 = z3;
                                    z = z6;
                                    z2 = z5;
                                    objT = new kpg0(new kuy(duyVar.a, duyVar.b, duyVar.c, z6, z5, duyVar.d, duyVar.e), fw2.R0);
                                } else if (iOrdinal == 2) {
                                    z = z3;
                                    z2 = z4;
                                    obj = null;
                                    objT = null;
                                } else if (iOrdinal == 3) {
                                    vsy vsyVar = (vsy) uy2Var.c.get();
                                    boolean z7 = z4;
                                    objT = new xzq(new fty(vsyVar.a, vsyVar.b, vsyVar.c, vsyVar.d, z7), fw2.S0);
                                    z = z3;
                                    z2 = z7;
                                } else if (iOrdinal != 4) {
                                    eg.o();
                                    return;
                                } else {
                                    objT = new kpg0((xpw) uy2Var.d.get(), fw2.T0);
                                    z = z3;
                                    z2 = z4;
                                }
                                obj = null;
                            } else {
                                z = z3;
                                z2 = z4;
                                obj = null;
                                objT = new xzq(cgj1.H(((e68) uy2Var.a.get()).a(), (qim0) null, (FrameLayout.LayoutParams) null, 7), fw2.Q0);
                            }
                            x340Var.s0(objT);
                        } else {
                            z = z3;
                            z2 = z4;
                            obj = null;
                        }
                        maa maaVar = (maa) objT;
                        if (maaVar != null) {
                            x340Var.i0(99744738);
                            str = strB0;
                            otw.c(maaVar, str, (qim0) null, (ipb1) null, x340Var, 0, 12);
                        } else {
                            str = strB0;
                            x340Var.i0(-1202834288);
                        }
                        x340Var.r(z2);
                        x340Var.r(z2);
                        strB0 = str;
                        z3 = z;
                        z4 = z2;
                    }
                    x340Var.r(z4);
                    x340Var.r(z3);
                    qim0Var2 = qim0Var3;
                }
                h311VarV.d = wy2Var;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                wy2Var = new wy2(r4gVar, uy2Var, contextTrack, qim0Var3, i, (byte) 0);
                h311VarV.d = wy2Var;
            }
            return;
        }
        x340Var.b0();
        qim0Var2 = qim0Var;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            wy2Var = new wy2(r4gVar, uy2Var, contextTrack, qim0Var2, i, (byte) 1);
            h311VarV.d = wy2Var;
        }
    }

    public static final void b(int i, int i2, qim0 qim0Var, float f, float f2, float f3, b0k b0kVar, int i3) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1013272189);
        int i4 = (x340Var.e(i) ? 4 : 2) | i3 | (x340Var.e(i2) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128) | 74752;
        if (x340Var.Y(i4 & 1, (74899 & i4) != 74898)) {
            x340Var.d0();
            if ((i3 & 1) == 0 || x340Var.E()) {
                f = 8.0f;
                f2 = 24.0f;
                f3 = 8.0f;
            } else {
                x340Var.b0();
            }
            x340Var.s();
            jw31 jw31VarA = ew31.a(new d36(f3, true, new um5(false)), een.Z, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(161386344);
            int i5 = 0;
            while (i5 < i2) {
                qim0 qim0VarS = u291.s(nim0.a, ((p3v) z95.a(i == i5 ? f2 : f, (fe5) null, "dotWidth", x340Var, 384, 10).getValue()).a, f);
                uwr uwrVar = cbx.a;
                t1c.a(dug.f(qim0VarS, ((yex) zex.a.d).h, er31.a(50)), x340Var, 0);
                i5++;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        float f4 = f;
        float f5 = f2;
        float f6 = f3;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s990(i, i2, qim0Var, f4, f5, f6, i3);
        }
    }

    public static final void c(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1123497602);
        int i2 = (x340Var.d(248.0f) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = v8r.p(new shc1[]{new shc1(new hr20(CtaType.BUY_TICKETS_FIELD_NUMBER, 0), new hr20(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER), new j2i(-2110606376, new qza(2, (byte) 2), true)), new shc1(new hr20(CtaType.CTA_SHARE_FIELD_NUMBER, 0), new hr20(CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER, CtaType.BUY_TICKETS_FIELD_NUMBER), new j2i(228214007, new qza(2, (byte) 3), true)), new shc1(new hr20(1000, 0), new hr20(180, CtaType.CTA_SHARE_FIELD_NUMBER), j2iVar)});
                x340Var.s0(objT);
            }
            x340Var.i0(675201242);
            ek60 ek60VarListIterator = ((bw91) objT).listIterator();
            int i3 = 0;
            while (true) {
                ek60 ek60Var = ek60VarListIterator;
                if (!ek60Var.hasNext()) {
                    x340Var.r(false);
                    x340Var.r(true);
                    break;
                }
                Object next = ek60Var.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                shc1 shc1Var = (shc1) next;
                h(shc1Var.a, shc1Var.b, nim0.a, shc1Var.c, x340Var, 384);
                i3 = i4;
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new klb((byte) 0, i, j2iVar, qim0Var);
        }
    }

    public static final void d(c380 c380Var, sip sipVar, qim0 qim0Var, boolean z, long j, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        long j2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1701167902);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(sipVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        int i3 = i2 | 27648;
        if (!x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.b0();
            z2 = z;
            j2 = j;
        } else {
            if (c380Var.isEmpty()) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ri60(c380Var, sipVar, qim0Var, i, (byte) 9);
                    return;
                }
                return;
            }
            boolean z3 = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                objT = new k27(c380Var, (byte) 2);
                x340Var.s0(objT);
            }
            kes kesVarB = lkr0.b(0, (Function0) objT, x340Var, 0, 3);
            x340Var.i0(1121476697);
            Integer numValueOf = Integer.valueOf(kesVarB.o());
            boolean zI = ((i3 & 57344) == 16384) | x340Var.i(kesVarB);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new bu(kesVarB, (lnm) null, (byte) 19);
                x340Var.s0(objT2);
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT2);
            x340Var.r(false);
            qim0 qim0VarD = u291.d(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            w0h1.c(kesVarB, new wnb0(1.0f, true), (vzq0) null, (gdr0) null, 0, 0.0f, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(217418251, new wh(c380Var, sipVar, (byte) 15), x340Var), x340Var, 0, 16380);
            int iS = ((err0) ((jkr0) kesVarB).d.c).s();
            int iL = kesVarB.l();
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            b(iS, iL, uyn1.z(0.0f, 12.0f, 1, nim0.a), 0.0f, 0.0f, 0.0f, x340Var, 0);
            x340Var.r(true);
            z2 = true;
            j2 = 4000;
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new t990(c380Var, sipVar, qim0Var, z2, j2, i);
        }
    }

    public static final void e(String str, String str2, String str3, gw70 gw70Var, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        long jA;
        boolean z;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-241515788);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.g(str3) ? 256 : 128) | (x340Var.i(gw70Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = str2 != null ? 1 : 2;
            float f = str2 != null ? 8.0f : 10.0f;
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            if (((Boolean) k1u.m(idn0Var, x340Var, 0).getValue()).booleanValue()) {
                x340Var.i0(-168420935);
                uwr uwrVar = cbx.a;
                jA = cbx.a(x340Var).a.a.b();
                x340Var.r(false);
            } else {
                x340Var.i0(-168419240);
                uwr uwrVar2 = cbx.a;
                jA = cbx.a(x340Var).a.a.a();
                x340Var.r(false);
            }
            float f2 = f;
            int i4 = i3;
            tob1 tob1VarA = w191.a(jA, null, "bannerBgColor", x340Var, 384, 10);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, u291.f(qim0Var3, 1.0f));
            boolean z3 = (57344 & i2) == 16384;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == obj) {
                objT2 = new zg20(function0, (byte) 13);
                x340Var.s0(objT2);
            }
            qim0 qim0VarN = anm1.N("root", dug.f(v(qim0VarZ, idn0Var, null, false, null, null, (Function0) objT2, 28), ((u7h) tob1VarA.getValue()).a, er31.b(8.0f)));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            rih1 rih1Var = null;
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            op71.g(x340Var, u291.v(qim0Var3, 8.0f));
            if (str3 == null) {
                x340Var.i0(-1407344625);
                z = false;
                x340Var.r(false);
            } else {
                x340Var.i0(-1407344624);
                boolean zG = x340Var.g(str3);
                Object objT3 = x340Var.T();
                if (zG || objT3 == obj) {
                    objT3 = Uri.parse(str3);
                    x340Var.s0(objT3);
                }
                mod.b(oi7.a.a(gw70Var), apo.r(-1540912055, new n640((Uri) objT3), x340Var), x340Var, 56);
                z = false;
                ab80.p(qim0Var3, 8.0f, x340Var, false);
                rih1Var = rih1.a;
            }
            if (rih1Var == null) {
                x340Var.i0(-322478761);
                op71.g(x340Var, u291.v(qim0Var3, 4.0f));
            } else {
                x340Var.i0(-322493331);
            }
            x340Var.r(z);
            qim0 qim0VarZ2 = uyn1.z(0.0f, f2, 1, new wnb0(1.0f, true));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ2);
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
            uwo1.e(str, null, cbx.d(x340Var).k, 0L, null, null, 2, false, new cjc0(i4), 0, null, x340Var, i2 & 14, 0, 1722);
            x340Var = x340Var;
            if (str2 == null) {
                x340Var.i0(693279692);
                x340Var.r(false);
                z2 = true;
            } else {
                x340Var.i0(693279693);
                uwo1.e(str2, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1714);
                x340Var = x340Var;
                x340Var.r(false);
                z2 = true;
            }
            x340Var.r(z2);
            op71.g(x340Var, u291.v(qim0Var3, 8.0f));
            plx plxVar = plx.c;
            long j = ((yex) zex.a.d).g;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(plxVar, isl.a, u291.r(qim0Var3, 16.0f), j, 0L, true, x340Var, plx.d | 196656, 16);
            ab80.p(qim0Var3, 8.0f, x340Var, z2);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uuy(str, (Object) str2, (Object) str3, (Object) gw70Var, (Object) function0, (Object) qim0Var2, i, (byte) 5);
        }
    }

    public static final void f(o990 o990Var, boolean z, Function0 function0, zja1 zja1Var, sip sipVar, b0k b0kVar, int i) {
        int i2;
        boolean z2;
        gdx gdxVarR;
        Function0 function1 = function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2033848692);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(o990Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(zja1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(sipVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            klz0 klz0Var = (klz0) x340Var.k(llz0.a);
            aka1 aka1Var = (aka1) x340Var.k(bka1.a);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarD, 16.0f);
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z3 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
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
            c380 c380Var = o990Var.d;
            l990 l990Var = o990Var.c;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            pbh pbhVar = pbh.a;
            int i3 = i2;
            d(c380Var, sipVar, pbhVar.a(0.8f, qim0VarF, true), false, 0L, x340Var, (i2 >> 9) & 112);
            qim0 qim0VarA = pbhVar.a(0.2f, u291.f(nim0Var, 1.0f), true);
            mbh mbhVarA2 = jbh.a(h36.f, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            boolean z4 = l990Var instanceof l990;
            if (z4) {
                x340Var.i0(935799870);
                l990 l990Var2 = l990Var;
                String str = l990Var2.b;
                bpo1.m(l990Var2.a, str, l990Var2.c, nhc1.W(klz0Var.b.a.c, "{displayName}", str == null ? l990Var2.a : str), z ? hcx.a : hcx.b, null, x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(936349562);
                x340Var.r(false);
            }
            boolean zI = x340Var.i(zja1Var) | x340Var.i(aka1Var) | ((i3 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                function1 = function0;
                objT = new u990(zja1Var, aka1Var, function1, (byte) 0);
                x340Var.s0(objT);
            } else {
                function1 = function0;
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            hdx hdxVarD = lzj.d(klz0Var.a);
            if (z) {
                x340Var.i0(-523975187);
                gdxVarR = yla.s(x340Var);
                z2 = false;
            } else {
                z2 = false;
                x340Var.i0(-523974290);
                gdxVarR = yla.r(x340Var);
            }
            x340Var.r(z2);
            foo1.c(gbxVar, hdxVarD, null, null, gdxVarR, null, null, null, null, null, apo.r(-103910359, new jj50((Object) o990Var, (Object) klz0Var, (byte) 23), x340Var), x340Var, 0, 48, 2012);
            x340Var = x340Var;
            if (z4) {
                x340Var.i0(937029051);
                l990 l990Var3 = l990Var;
                String str2 = l990Var3.b;
                if (str2 == null) {
                    str2 = l990Var3.a;
                }
                uwo1.e(nhc1.W(klz0Var.b.a.d, "{displayName}", str2), null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, new a0e1(3), null, 2, false, new cjc0(1), 0, new px8(fc11.G(8), fc11.G(11), 0L, (mx8) null, 12), x340Var, 0, 8, 674);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(937550874);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1((Object) o990Var, z, (Object) function1, (Object) zja1Var, (Object) sipVar, i, (byte) 20);
        }
    }

    public static final void g(o990 o990Var, Function0 function0, zja1 zja1Var, sip sipVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2085800305);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(o990Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(zja1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(sipVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            klz0 klz0Var = (klz0) x340Var.k(llz0.a);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            vzq0 vzq0Var = o990Var.a;
            jlz0 jlz0Var = klz0Var.a;
            j2i j2iVarR = apo.r(-1817107187, new d34(o990Var, function0, zja1Var, sipVar, (byte) 4), x340Var);
            jlz0 jlz0Var2 = jlz0.i;
            lzj.c((Integer) null, vzq0Var, jlz0Var, qim0VarD, j2iVarR, x340Var, 24582);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ke20(i, o990Var, function0, zja1Var, sipVar, (byte) 24);
        }
    }

    public static final void h(hr20 hr20Var, hr20 hr20Var2, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1524760820);
        int i2 = i | (x340Var.i(hr20Var) ? 4 : 2) | (x340Var.i(hr20Var2) ? 32 : 16) | (x340Var.i(j2iVar) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            tob1 tob1VarB = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? 360.0f : 270.0f, hr20Var, (String) null, (iu30) null, x340Var, (i2 << 3) & 112, 28);
            tob1 tob1VarB2 = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? 0.0f : 4.0f, hr20Var2, (String) null, (iu30) null, x340Var, i2 & 112, 28);
            boolean zI = x340Var.i(tob1VarB) | x340Var.i(tob1VarB2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new dy(tob1VarB, tob1VarB2, (byte) 3);
                x340Var.s0(objT2);
            }
            qim0Var2 = qim0Var;
            qim0 qim0VarC = i541.C(qim0Var2, (iu30) objT2);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            j2iVar.invoke(x340Var, Integer.valueOf((i2 >> 9) & 14));
            x340Var.r(true);
            boolean zI2 = x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new vk1(ven0Var, (lnm) null, (byte) 4);
                x340Var.s0(objT3);
            }
            qxd0.t("bookAnimation", x340Var, (vu30) objT3);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wb6(i, (Object) hr20Var, (Object) hr20Var2, (Object) qim0Var2, (Object) j2iVar, (byte) 25);
        }
    }

    public static final void i(k990 k990Var, sip sipVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-640293541);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(k990Var) ? 4 : 2) | (x340Var.i(sipVar) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = x340Var.g(k990Var.c);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = sipVar.a();
                x340Var.s0(objT);
            }
            yhv yhvVar = (yhv) objT;
            era eraVar = een.Q0;
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            pbh pbhVar = pbh.a;
            qim0 qim0VarA = pbhVar.a(0.55f, qim0VarF, true);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
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
            otw.c(yhvVar, new vhv(k990Var.c, k990Var.d, true), (qim0) null, (ipb1) null, x340Var, 8, 12);
            x340Var.r(true);
            qim0 qim0VarA2 = pbhVar.a(0.45f, u291.f(nim0Var, 1.0f), true);
            mbh mbhVarA2 = jbh.a(h36.e, eraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarA2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            String str = k990Var.a;
            uwr uwrVar = cbx.a;
            gxo1.c(str, null, lee1.a(cbx.d(x340Var).a, 0L, fc11.G(64), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, fc11.D(0.9d), (u8e1) null, (wdt0) null, (shc0) null, 0, 16646141), cbx.a(x340Var).b.a, new a0e1(3), 2, false, new cjc0(2), new px8(fc11.G(24), fc11.G(64), 0L, (mx8) null, 12), 0.0f, (FontWeight) ((bjx) ajx.a.c).f, null, x340Var, 134217728, 0, 2626);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            gxo1.c(k990Var.b, null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), 2, false, new cjc0(2), new px8(fc11.G(12), fc11.G(14), 0L, (mx8) null, 12), 0.0f, null, null, x340Var, 134217728, 0, 3650);
            x340Var = x340Var;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bp50((Object) k990Var, (Object) sipVar, (Object) qim0Var, i, (byte) 28);
        }
    }

    public static final void j(adn adnVar, gw70 gw70Var, iu30 iu30Var, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        Object hu91Var;
        int i3;
        List list;
        Object iu91Var;
        drr0 drr0Var;
        String str;
        tob1 tob1Var;
        float f;
        drr0 drr0Var2;
        ven0 ven0Var;
        ven0 ven0Var2;
        ven0 ven0Var3;
        ven0 ven0Var4;
        ven0 ven0Var5;
        ven0 ven0Var6;
        ven0 ven0Var7;
        float f2;
        ven0 ven0Var8;
        String str2;
        String str3;
        int i4;
        Object df6Var;
        Set set;
        m4c m4cVar;
        m4c m4cVar2 = fkj0.X;
        mu91 mu91Var = adnVar.f;
        List list2 = adnVar.N0;
        zhd zhdVar = adnVar.g;
        yy30 yy30Var = adnVar.e;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1141749215);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(adnVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 2048 : 1024;
        }
        int i5 = i2 | 24576;
        if (b0kVar3.Y(i5 & 1, (i5 & 9363) != 9362)) {
            wat watVar = (wat) b0kVar3.k(t4k.h);
            float fX0 = watVar.X0(30.0f);
            b0kVar3.i0(2004346012);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            float fX1 = watVar.X0(4.0f);
            b0kVar3.r(false);
            long j = cbx.a(b0kVar3).b.a;
            Object objT = b0kVar3.T();
            if (objT == m4cVar2) {
                objT = p3d1.n(0L, b0kVar3);
            }
            ven0 ven0Var9 = (ven0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar2) {
                objT2 = us71.i(0.0f, b0kVar3);
            }
            drr0 drr0Var3 = (drr0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar2) {
                objT3 = us71.i(1300.0f, b0kVar3);
            }
            drr0 drr0Var4 = (drr0) objT3;
            yy30 yy30Var2 = yy30.d;
            yy30 yy30Var3 = yy30.c;
            boolean z = yy30Var == yy30Var3 || yy30Var == yy30Var2;
            Context context = (Context) b0kVar3.k(AndroidCompositionLocals_androidKt.b);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = z;
            boolean zH = b0kVar3.h(z2) | b0kVar3.i(context) | b0kVar3.i(drr0Var3) | b0kVar3.i(drr0Var4);
            Object objT4 = b0kVar3.T();
            if (zH || objT4 == m4cVar2) {
                objT4 = new eu91(z2, context, drr0Var3, drr0Var4);
                b0kVar3.s0(objT4);
            }
            qxd0.i(boolValueOf, (iu30) objT4, b0kVar3);
            boolean zD = b0kVar3.d(fX0) | b0kVar3.d(fX1);
            Object objT5 = b0kVar3.T();
            if (zD || objT5 == m4cVar2) {
                float f3 = 0.45f * fX0;
                float f4 = 0.35f * f3;
                if (fX1 <= f4) {
                    f4 = fX1;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                float f5 = -f3;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                long jT = t(f4, jFloatToRawIntBits, jFloatToRawIntBits2);
                long jT2 = t(f4, jFloatToRawIntBits, jFloatToRawIntBits3);
                long jT3 = t(f4, jFloatToRawIntBits2, jFloatToRawIntBits);
                long jT4 = t(f4, jFloatToRawIntBits2, jFloatToRawIntBits3);
                long jT5 = t(f4, jFloatToRawIntBits3, jFloatToRawIntBits2);
                long jT6 = t(f4, jFloatToRawIntBits3, jFloatToRawIntBits);
                tw4 tw4VarA = ww4.a();
                int i6 = (int) (jT >> 32);
                int i7 = (int) (jT & 4294967295L);
                tw4VarA.k(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
                tw4VarA.j(Float.intBitsToFloat((int) (jT3 >> 32)), Float.intBitsToFloat((int) (jT3 & 4294967295L)));
                tw4VarA.m(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), Float.intBitsToFloat((int) (jT4 >> 32)), Float.intBitsToFloat((int) (jT4 & 4294967295L)));
                tw4VarA.j(Float.intBitsToFloat((int) (jT5 >> 32)), Float.intBitsToFloat((int) (jT5 & 4294967295L)));
                tw4VarA.m(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)), Float.intBitsToFloat((int) (jT6 >> 32)), Float.intBitsToFloat((int) (jT6 & 4294967295L)));
                tw4VarA.j(Float.intBitsToFloat((int) (jT2 >> 32)), Float.intBitsToFloat((int) (jT2 & 4294967295L)));
                tw4VarA.m(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat(i6), Float.intBitsToFloat(i7));
                tw4VarA.g();
                b0kVar3.s0(tw4VarA);
                objT5 = tw4VarA;
            }
            u8s0 u8s0Var = (u8s0) objT5;
            Object objT6 = b0kVar3.T();
            if (objT6 == m4cVar2) {
                objT6 = c97.b(0.0f);
                b0kVar3.s0(objT6);
            }
            o95 o95Var = (o95) objT6;
            t5u t5uVar = mu91Var.b;
            int i8 = i5 & 14;
            boolean zI = b0kVar3.i(o95Var) | (i8 == 4);
            Object objT7 = b0kVar3.T();
            if (zI || objT7 == m4cVar2) {
                objT7 = new gu91(adnVar, o95Var, null);
                b0kVar3.s0(objT7);
            }
            qxd0.t(t5uVar, b0kVar3, (vu30) objT7);
            Object objT8 = b0kVar3.T();
            z6x z6xVar = z6x.a;
            if (objT8 == m4cVar2) {
                objT8 = v8r.q(z6xVar);
                b0kVar3.s0(objT8);
            }
            ven0 ven0Var10 = (ven0) objT8;
            Object objT9 = b0kVar3.T();
            if (objT9 == m4cVar2) {
                objT9 = v8r.q(z6xVar);
                b0kVar3.s0(objT9);
            }
            ven0 ven0Var11 = (ven0) objT9;
            Object objT10 = b0kVar3.T();
            if (objT10 == m4cVar2) {
                objT10 = c97.b(1.0f);
                b0kVar3.s0(objT10);
            }
            o95 o95Var2 = (o95) objT10;
            List list3 = mu91Var.a;
            boolean zI2 = (i8 == 4) | b0kVar3.i(o95Var2) | b0kVar3.i(ven0Var10) | b0kVar3.i(ven0Var11);
            Object objT11 = b0kVar3.T();
            if (zI2 || objT11 == m4cVar2) {
                i3 = 2;
                list = list3;
                hu91Var = new hu91(adnVar, o95Var2, ven0Var10, ven0Var11, (lnm) null);
                b0kVar3.s0(hu91Var);
            } else {
                i3 = 2;
                list = list3;
                hu91Var = objT11;
            }
            qxd0.t(list, b0kVar3, (vu30) hu91Var);
            cb80 cb80VarG = t5p1.g(t5p1.r("candy", b0kVar3, 0), 1.0f, 0.8f, irn1.Y(irn1.o0(CtaType.BUY_TICKETS_FIELD_NUMBER, 0, mlv.d, i3), i3, 0L, 4), "candyPulsate", b0kVar3, 29112, 0);
            Object objT12 = b0kVar3.T();
            if (objT12 == m4cVar2) {
                objT12 = v8r.q(z6xVar);
                b0kVar3.s0(objT12);
            }
            ven0 ven0Var12 = (ven0) objT12;
            Object objT13 = b0kVar3.T();
            if (objT13 == m4cVar2) {
                objT13 = v8r.q(0);
                b0kVar3.s0(objT13);
            }
            tob1 tob1Var2 = (ven0) objT13;
            Object objT14 = b0kVar3.T();
            if (objT14 == m4cVar2) {
                objT14 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT14);
            }
            ven0 ven0Var13 = (ven0) objT14;
            Object objT15 = b0kVar3.T();
            if (objT15 == m4cVar2) {
                objT15 = v8r.q(list2);
                b0kVar3.s0(objT15);
            }
            ven0 ven0Var14 = (ven0) objT15;
            Object objT16 = b0kVar3.T();
            if (objT16 == m4cVar2) {
                objT16 = v8r.q(zhdVar);
                b0kVar3.s0(objT16);
            }
            ven0 ven0Var15 = (ven0) objT16;
            Object objT17 = b0kVar3.T();
            if (objT17 == m4cVar2) {
                objT17 = v8r.q(0);
                b0kVar3.s0(objT17);
            }
            ven0 ven0Var16 = (ven0) objT17;
            boolean zI3 = (i8 == 4) | b0kVar3.i(ven0Var14) | b0kVar3.i(ven0Var15) | b0kVar3.i(ven0Var16) | b0kVar3.i(ven0Var11) | b0kVar3.i(ven0Var12) | b0kVar3.d(fX0) | b0kVar3.i(ven0Var13) | b0kVar3.i(tob1Var2) | b0kVar3.i(drr0Var3) | b0kVar3.i(drr0Var4);
            Object objT18 = b0kVar3.T();
            if (zI3 || objT18 == m4cVar2) {
                drr0Var = drr0Var3;
                b0kVar2 = b0kVar3;
                str = null;
                tob1Var = tob1Var2;
                f = fX0;
                drr0Var2 = drr0Var4;
                iu91Var = new iu91(adnVar, f, ven0Var14, ven0Var15, ven0Var11, ven0Var16, ven0Var12, ven0Var13, tob1Var, drr0Var, drr0Var2, null);
                ven0Var = ven0Var14;
                ven0Var2 = ven0Var16;
                ven0Var3 = ven0Var12;
                ven0Var4 = ven0Var15;
                ven0Var5 = ven0Var11;
                b0kVar2.s0(iu91Var);
            } else {
                str = null;
                b0kVar2 = b0kVar3;
                tob1Var = tob1Var2;
                iu91Var = objT18;
                ven0Var2 = ven0Var16;
                ven0Var3 = ven0Var12;
                drr0Var = drr0Var3;
                f = fX0;
                ven0Var5 = ven0Var11;
                ven0Var = ven0Var14;
                drr0Var2 = drr0Var4;
                ven0Var4 = ven0Var15;
            }
            qxd0.t(yy30Var, b0kVar2, (vu30) iu91Var);
            Integer numValueOf = Integer.valueOf(((Number) tob1Var.getValue()).intValue());
            int i9 = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x04a4: ARITH (r4v39 'i9' int) = (r19v2 int) & (896 int) A[DECLARE_VAR] (LINE:1189) in method: p.bin.j(p.adn, p.gw70, p.iu30, p.vu30, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v2 int
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1915
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.bin.j(p.adn, p.gw70, p.iu30, p.vu30, p.qim0, p.b0k, int):void");
        }

        public static final long k(ven0 ven0Var) {
            return ((yr80) ven0Var.getValue()).a;
        }

        public static final void l(String str, long j, qim0 qim0Var, b0k b0kVar, int i) {
            ikx ikxVar;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-679374539);
            int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                if (str.equals("arrow-left")) {
                    ikxVar = ikx.c;
                } else {
                    ikxVar = str.equals("arrow-right") ? jkx.c : null;
                }
                if (ikxVar == null) {
                    h311 h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new z0o(str, j, qim0Var, i, (byte) 4);
                        return;
                    }
                    return;
                }
                w0h1.a(ikxVar, isl.a, u291.r(qim0Var, 12.0f), j, 0L, false, x340Var, 56 | ((i2 << 6) & 7168), 48);
            } else {
                x340Var.b0();
            }
            h311 h311VarV2 = x340Var.v();
            if (h311VarV2 != null) {
                h311VarV2.d = new z0o(str, j, qim0Var, i, (byte) 3);
            }
        }

        public static final void m(s6f1 s6f1Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i, int i2) {
            int i3;
            int i4;
            b0k b0kVar2 = (x340) b0kVar;
            b0kVar2.k0(-2037587355);
            int i5 = (b0kVar2.g(s6f1Var) ? 4 : 2) | i;
            int i6 = i2 & 2;
            if (i6 != 0) {
                i3 = i5 | 48;
            } else {
                i3 = i5 | (b0kVar2.g(qim0Var) ? 32 : 16);
            }
            int i7 = i2 & 4;
            if (i7 != 0) {
                i4 = i3 | 384;
            } else {
                i4 = i3 | (b0kVar2.i(function0) ? 256 : 128);
            }
            if (b0kVar2.Y(i4 & 1, (i4 & 147) != 146)) {
                qim0 qim0Var2 = nim0.a;
                if (i6 != 0) {
                    qim0Var = qim0Var2;
                }
                if (i7 != 0) {
                    Object objT = b0kVar2.T();
                    if (objT == fkj0.X) {
                        objT = orc1.d1;
                        b0kVar2.s0(objT);
                    }
                    function0 = (Function0) objT;
                }
                qim0 qim0VarZ = uyn1.z(6.0f, 0.0f, 2, qim0Var);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(b0kVar2).b;
                jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, b0kVar2, 48);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
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
                nko1.H(qim0VarE, b0kVar2, y580.Y);
                l(s6f1Var.b, s6f1Var.c, i541.C(qim0Var2, new w7f1(-1.0f, function0)), b0kVar2, 0);
                qgo1.f((vnr0) s6f1Var.a.invoke(b0kVar2, 0), null, null, 0, false, null, b0kVar2, 8, 62);
                b0kVar2 = b0kVar2;
                l(s6f1Var.d, s6f1Var.e, i541.C(qim0Var2, new w7f1(1.0f, function0)), b0kVar2, 0);
                b0kVar2.r(true);
            } else {
                b0kVar2.b0();
            }
            qim0 qim0Var3 = qim0Var;
            Function0 function1 = function0;
            h311 h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new r27((byte) 16, i, i2, s6f1Var, function1, qim0Var3);
            }
        }

        public static final boolean n(oa80 oa80Var) {
            return (oa80Var.i || !oa80Var.h || oa80Var.d) ? false : true;
        }

        public static final boolean o(oa80 oa80Var) {
            return oa80Var.h && !oa80Var.d;
        }

        public static final boolean p(KeyEvent keyEvent) {
            return ern1.t(keyEvent) == 1 && E(keyEvent);
        }

        public static final boolean q(KeyEvent keyEvent) {
            return ern1.t(keyEvent) == 2 && E(keyEvent);
        }

        public static final mmr0 r(MobiusLoop mobiusLoop) {
            Object obj = mobiusLoop.i;
            obj.getClass();
            bpb1 bpb1VarB = gio1.b(obj);
            return new mmr0(mobiusLoop.b(new qlo(bpb1VarB, (byte) 2)), bpb1VarB);
        }

        public static final z5w0 s(c6w0 c6w0Var) {
            return new z5w0(c6w0Var);
        }

        public static final long t(float f, long j, long j2) {
            int i = (int) (j >> 32);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat(i);
            int i2 = (int) (j & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat(i2);
            float fSqrt = f / ((float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat)));
            return (((long) Float.floatToRawIntBits((fIntBitsToFloat * fSqrt) + Float.intBitsToFloat(i))) << 32) | (((long) Float.floatToRawIntBits((fIntBitsToFloat2 * fSqrt) + Float.intBitsToFloat(i2))) & 4294967295L);
        }

        public static final qim0 u(qim0 qim0Var, idn0 idn0Var, ga80 ga80Var, boolean z, String str, pm31 pm31Var, Function0 function0) {
            dhg dhgVarThen;
            if (ga80Var != null) {
                dhgVarThen = new dhg(idn0Var, ga80Var, false, z, str, pm31Var, function0);
            } else if (ga80Var == null) {
                dhgVarThen = new dhg(idn0Var, (ga80) null, false, z, str, pm31Var, function0);
            } else {
                nim0 nim0Var = nim0.a;
                dhgVarThen = idn0Var != null ? da80.a(nim0Var, idn0Var, ga80Var).then(new dhg(idn0Var, (ga80) null, false, z, str, pm31Var, function0)) : zr7.i(nim0Var, new fhg(ga80Var, z, str, pm31Var, function0));
            }
            return qim0Var.then(dhgVarThen);
        }

        public static /* synthetic */ qim0 v(qim0 qim0Var, idn0 idn0Var, ga80 ga80Var, boolean z, String str, pm31 pm31Var, Function0 function0, int i) {
            if ((i & 4) != 0) {
                z = true;
            }
            return u(qim0Var, idn0Var, ga80Var, z, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : pm31Var, function0);
        }

        public static qim0 w(Function0 function0) {
            return zr7.i(nim0.a, new ehg(function0, (byte) 0));
        }

        public static qim0 x(qim0 qim0Var, boolean z, String str, pm31 pm31Var, idn0 idn0Var, Function0 function0, int i) {
            if ((i & 1) != 0) {
                z = true;
            }
            return qim0Var.then(new dhg((i & 8) != 0 ? null : idn0Var, (ga80) null, true, z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : pm31Var, function0));
        }

        public static qim0 y(qim0 qim0Var, idn0 idn0Var, ga80 ga80Var, boolean z, String str, pm31 pm31Var, String str2, Function0 function0, Function0 function1, int i) {
            ech echVarI;
            if ((i & 4) != 0) {
                z = true;
            }
            boolean z2 = z;
            String str3 = (i & 8) != 0 ? null : str;
            pm31 pm31Var2 = (i & 16) != 0 ? null : pm31Var;
            String str4 = (i & 32) != 0 ? null : str2;
            Function0 function2 = (i & 64) != 0 ? null : function0;
            if (ga80Var != null) {
                echVarI = new ech(str3, str4, function1, function2, (Function0) null, ga80Var, idn0Var, pm31Var2, false, z2);
            } else if (ga80Var == null) {
                echVarI = new ech(str3, str4, function1, function2, (Function0) null, (ga80) null, idn0Var, pm31Var2, false, z2);
            } else {
                nim0 nim0Var = nim0.a;
                if (idn0Var != null) {
                    echVarI = da80.a(nim0Var, idn0Var, ga80Var).then(new ech(str3, str4, function1, function2, (Function0) null, (ga80) null, idn0Var, pm31Var2, false, z2));
                } else {
                    echVarI = zr7.i(nim0Var, new ghg(ga80Var, z2, str3, pm31Var2, function1, str4, function2, null));
                }
            }
            return qim0Var.then(echVarI);
        }

        public static qim0 z(qim0 qim0Var, pm31 pm31Var, String str, Function0 function0, Function0 function1, int i) {
            return qim0Var.then(new ech((String) null, (i & 8) != 0 ? null : str, function1, function0, (Function0) null, (ga80) null, (idn0) null, (i & 4) != 0 ? null : pm31Var, true, true));
        }
    }
