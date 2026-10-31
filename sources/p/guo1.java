package p;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.v1.proto.Paragraph;
import defpackage.m;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class guo1 {
    public static b180 a;

    public static final j0d1 A(faa0 faa0Var) {
        return new j0d1(faa0Var);
    }

    public static j0d1 B() {
        return new j0d1((faa0) null);
    }

    public static final boolean C(ven0 ven0Var) {
        return ((Boolean) ven0Var.getValue()).booleanValue();
    }

    public static final y58 D(PlayerState playerState, ne2 ne2Var, boolean z, cn4 cn4Var) {
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        if (contextTrack != null) {
            int iC = l1d.C(l4o1.P(contextTrack) ? 2 : 1);
            if (iC != 0) {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
            } else if (z || cn4Var.a()) {
            }
            if (playerState.signals().contains("switch-to-video") || tdu0.a(playerState) != 0) {
                if (!ne2Var.equals(ie2.a)) {
                    int iA = tdu0.a(playerState);
                    int i = 0;
                    if (iA != 0) {
                        if (iA != 1 && !cn4Var.c()) {
                            iA = 0;
                        }
                        i = iA;
                    }
                    return new w58(i);
                }
            } else if (playerState.signals().contains("switch-to-audio")) {
                return v58.a;
            }
        }
        return x58.a;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:4:0x0017  */
    public static final long E(ur80 ur80Var, ur80 ur80Var2) {
        float fMin;
        int i = ur80Var2.a;
        int i2 = ur80Var2.d;
        int i3 = ur80Var2.a;
        int i4 = ur80Var2.c;
        int i5 = ur80Var2.b;
        int i6 = ur80Var.c;
        int i7 = ur80Var.b;
        int i8 = ur80Var.d;
        int i9 = ur80Var.a;
        float fMin2 = 1.0f;
        if (i >= i6) {
            fMin = 0.0f;
        } else if (i4 <= i9) {
            fMin = 1.0f;
        } else if (ur80Var2.d() == 0) {
            fMin = 0.0f;
        } else {
            fMin = (((Math.min(ur80Var.c, i4) + Math.max(i9, i3)) / 2) - i3) / ur80Var2.d();
        }
        if (i5 >= i8) {
            fMin2 = 0.0f;
        } else if (i2 > i7) {
            if (ur80Var2.b() == 0) {
                fMin2 = 0.0f;
            } else {
                fMin2 = (((Math.min(i8, i2) + Math.max(i7, i5)) / 2) - i5) / ur80Var2.b();
            }
        }
        return sgc1.u(fMin, fMin2);
    }

    public static final float F(float f, ksg ksgVar) {
        float fFloatValue = ((Number) ksgVar.n()).floatValue() - ((Number) ksgVar.m()).floatValue();
        if (fFloatValue > 0.0f) {
            return yoi1.o((f - ((Number) ksgVar.m()).floatValue()) / fFloatValue, 0.0f, 1.0f);
        }
        return 0.0f;
    }

    public static void G(Spannable spannable) {
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            int spanStart = spannable.getSpanStart(uRLSpan);
            int spanEnd = spannable.getSpanEnd(uRLSpan);
            spannable.removeSpan(uRLSpan);
            spannable.setSpan(new e170(uRLSpan.getURL()), spanStart, spanEnd, 0);
        }
    }

    public static final Object H(vu30 vu30Var, lnm lnmVar) {
        i0d1 i0d1Var = new i0d1(lnmVar, lnmVar.getContext());
        return wgo1.E(i0d1Var, true, i0d1Var, vu30Var);
    }

    public static final int I(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 1;
        }
        if (iC == 1) {
            return 2;
        }
        eg.o();
        return 0;
    }

    public static final ArrayList J(List list) {
        List<yab0> listA1 = o7h.a1(list, new ktg0((byte) 12));
        ArrayList arrayList = new ArrayList(q7h.U(listA1, 10));
        for (yab0 yab0Var : listA1) {
            arrayList.add(new xab0(yab0Var.b, yab0Var.c, (String) null, false));
        }
        return arrayList;
    }

    public static String K(int i) {
        if (i == 1) {
            return "Strictness.None";
        }
        if (i == 2) {
            return "Strictness.Loose";
        }
        if (i == 3) {
            return "Strictness.Normal";
        }
        if (i == 4) {
            return "Strictness.Strict";
        }
        return i == 0 ? "Strictness.Unspecified" : "Invalid";
    }

    public static final void a(hux huxVar, int i, Function0 function0, qim0 qim0Var, boolean z, float f, b0k b0kVar, int i2, int i3) {
        boolean z2;
        int i4;
        float f2;
        int i5;
        qim0 qim0Var2;
        float f3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-388647184);
        int i6 = i2 | ((i2 & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        int i7 = i6 | 3072;
        int i8 = i3 & 16;
        if (i8 != 0) {
            i4 = i6 | 27648;
            z2 = z;
        } else {
            z2 = z;
            i4 = i7 | (x340Var.h(z2) ? 16384 : 8192);
        }
        int i9 = i3 & 32;
        if (i9 != 0) {
            i5 = i4 | 196608;
            f2 = f;
        } else {
            f2 = f;
            i5 = i4 | (x340Var.d(f2) ? 131072 : 65536);
        }
        if (x340Var.Y(i5 & 1, (74899 & i5) != 74898)) {
            if (i8 != 0) {
                z2 = true;
            }
            float f4 = i9 != 0 ? 0.0f : f2;
            String strO0 = cwl1.o0(x340Var, i);
            boolean z3 = (i5 & 896) == 256;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new y1(function0, (byte) 3);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx(18);
            jax haxVar = z2 ? jax.a : new hax(strO0);
            j2i j2iVarR = apo.r(262353401, new gf(huxVar, strO0, f4, (byte) 0), x340Var);
            float f5 = f4;
            qim0 qim0Var3 = nim0.a;
            wro1.h(gbxVar, idxVar, qim0Var3, haxVar, null, null, false, null, null, j2iVarR, x340Var, 384, 6, 1000);
            qim0Var2 = qim0Var3;
            f3 = f5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            f3 = f2;
        }
        boolean z4 = z2;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hf(huxVar, i, function0, qim0Var2, z4, f3, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0196  */
    /* JADX WARN: Code duplicated, block: B:63:0x0199  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bc  */
    public static final void b(m0t m0tVar, jkr0 jkr0Var, n8l1 n8l1Var, Consumer consumer, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar;
        ven0 ven0VarG;
        spx spxVar;
        int i2;
        boolean zI;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1048188325);
        int i3 = i | (x340Var.i(m0tVar) ? 4 : 2) | (x340Var.i(jkr0Var) ? 32 : 16) | (x340Var.g(n8l1Var) ? 256 : 128) | (x340Var.i(consumer) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Object objT2 = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT2 == m4cVar2) {
                objT2 = yv91.a(new of(jkr0Var, (byte) 1));
                x340Var.s0(objT2);
            }
            tob1 tob1Var = (tob1) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar2) {
                objT3 = yv91.a(new of(jkr0Var, (byte) 0));
                x340Var.s0(objT3);
            }
            tob1 tob1Var2 = (tob1) objT3;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            lsx lsxVar = lsx.c;
            boolean zBooleanValue = ((Boolean) tob1Var.getValue()).booleanValue();
            int i4 = i3 & 896;
            boolean zI2 = x340Var.i(jkr0Var) | (i4 == 256);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar2) {
                objT4 = new jf(jkr0Var, n8l1Var, (byte) 0);
                x340Var.s0(objT4);
            }
            a(lsxVar, 2131960417, (Function0) objT4, null, zBooleanValue, -90.0f, x340Var, lsx.d, 8);
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            jsx jsxVar = jsx.c;
            boolean zBooleanValue2 = ((Boolean) tob1Var2.getValue()).booleanValue();
            boolean zI3 = (i4 == 256) | x340Var.i(jkr0Var);
            Object objT5 = x340Var.T();
            if (zI3) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT5 == m4cVar) {
                }
                a(jsxVar, 2131959122, (Function0) objT5, null, zBooleanValue2, -90.0f, x340Var, jsx.d, 8);
                op71.g(x340Var, u291.h(nim0Var, 8.0f));
                ven0VarG = rwq.g(new nf(yoi1.g(m0tVar.d), (byte) 0), Boolean.FALSE, null, x340Var, 48, 2);
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    spxVar = spx.c;
                } else {
                    spxVar = xpx.c;
                }
                if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                    i2 = 2131959684;
                } else {
                    i2 = 2131959805;
                }
                int i5 = i2;
                zI = x340Var.i(consumer);
                objT = x340Var.T();
                if (zI || objT == m4cVar) {
                    objT = new kf(consumer, (byte) 0);
                    x340Var.s0(objT);
                }
                a(spxVar, i5, (Function0) objT, null, false, 0.0f, x340Var, 8, 56);
                x340Var.r(true);
            }
            objT5 = new jf(jkr0Var, n8l1Var, (byte) 1);
            x340Var.s0(objT5);
            a(jsxVar, 2131959122, (Function0) objT5, null, zBooleanValue2, -90.0f, x340Var, jsx.d, 8);
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            ven0VarG = rwq.g(new nf(yoi1.g(m0tVar.d), (byte) 0), Boolean.FALSE, null, x340Var, 48, 2);
            if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                spxVar = spx.c;
            } else {
                spxVar = xpx.c;
            }
            if (((Boolean) ven0VarG.getValue()).booleanValue()) {
                i2 = 2131959684;
            } else {
                i2 = 2131959805;
            }
            int i6 = i2;
            zI = x340Var.i(consumer);
            objT = x340Var.T();
            if (zI) {
                objT = new kf(consumer, (byte) 0);
                x340Var.s0(objT);
            } else {
                objT = new kf(consumer, (byte) 0);
                x340Var.s0(objT);
            }
            a(spxVar, i6, (Function0) objT, null, false, 0.0f, x340Var, 8, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m((Object) m0tVar, (Object) jkr0Var, (Object) n8l1Var, (Object) consumer, qim0Var, i, (byte) 1);
        }
    }

    public static final void c(fof fofVar, mj1 mj1Var, kp71 kp71Var, gln glnVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(27669709);
        int i2 = i | (x340Var.g(fofVar) ? 4 : 2) | (x340Var.i(mj1Var) ? 32 : 16) | (x340Var.i(kp71Var) ? 256 : 128) | (x340Var.i(glnVar) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarC = u291.c(qim0Var3, 1.0f);
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
            hm5.a(fofVar.c, (qim0) null, rmf.t, (tl3) null, (String) null, (iu30) null, apo.r(1824711818, new d34(fofVar, glnVar, kp71Var, mj1Var, (byte) 1), x340Var), x340Var, 1573248, 58);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m((Object) fofVar, (Object) mj1Var, (Object) kp71Var, (Object) glnVar, qim0Var2, i, (byte) 24);
        }
    }

    public static final void d(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-748787490);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 384 | (x340Var.h(z) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            cr31 cr31VarB = er31.b(20.0f);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.z(u291.f(qim0Var4, 1.0f), (fra) null, 3), cr31VarB);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = bin.x(dug.f(qim0VarQ, cbx.a(x340Var).a.b.a(), d4o1.a), false, null, null, null, function0, 15);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarX, 16.0f, 12.0f);
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
            uwo1.e(str, new wnb0(1.0f, true), cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, i2 & 14, 0, 1712);
            x340Var = x340Var;
            if (z) {
                x340Var.i0(-458130827);
                wox woxVar = wox.c;
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(qim0Var4, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                qim0Var3 = qim0Var4;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(woxVar, isl.a, u291.r(qim0VarB, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, wox.d | 48, 48);
                x340Var.r(false);
            } else {
                qim0Var3 = qim0Var4;
                x340Var.i0(-457860600);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pfg(str, function0, qim0Var2, z, i);
        }
    }

    public static final void e(final qim0 qim0Var, final zen0 zen0Var, final ven0 ven0Var, final es41 es41Var, final hw61 hw61Var, final long j, final float f, final j2i j2iVar, b0k b0kVar, final int i) {
        float f2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(848986741);
        int i2 = i | (x340Var.g(qim0Var) ? 4 : 2) | (x340Var.g(zen0Var) ? 32 : 16) | (x340Var.g(es41Var) ? 2048 : 1024) | (x340Var.g(hw61Var) ? 16384 : 8192) | (x340Var.f(j) ? 131072 : 65536) | (x340Var.d(0.0f) ? 1048576 : 524288) | (x340Var.d(f) ? 8388608 : 4194304) | (x340Var.g((Object) null) ? 67108864 : 33554432) | (x340Var.i(j2iVar) ? 536870912 : 268435456);
        if (x340Var.Y(i2 & 1, (i2 & 306783379) != 306783378)) {
            mhg1 mhg1VarU = bno1.u(zen0Var, "DropDownMenu", x340Var, (((i2 >> 3) & 14) | 48) & 126, 0);
            n8b1 n8b1VarW = t890.w(x340Var, 2);
            n8b1 n8b1VarW2 = t890.w(x340Var, 5);
            k9 k9Var = mhg1VarU.a;
            hrr0 hrr0Var = mhg1VarU.d;
            boolean zBooleanValue = ((Boolean) k9Var.P0()).booleanValue();
            x340Var.i0(143964305);
            float f3 = zBooleanValue ? 1.0f : 0.8f;
            x340Var.r(false);
            Float fValueOf = Float.valueOf(f3);
            boolean zBooleanValue2 = ((Boolean) hrr0Var.getValue()).booleanValue();
            x340Var.i0(143964305);
            float f4 = zBooleanValue2 ? 1.0f : 0.8f;
            x340Var.r(false);
            Float fValueOf2 = Float.valueOf(f4);
            mhg1VarU.f();
            x340Var.i0(-745957716);
            x340Var.r(false);
            tzg1 tzg1Var = rno1.a;
            fhg1 fhg1VarO = bno1.o(mhg1VarU, fValueOf, fValueOf2, n8b1VarW, tzg1Var, x340Var, 0);
            boolean zBooleanValue3 = ((Boolean) mhg1VarU.a.P0()).booleanValue();
            x340Var.i0(892761509);
            float f5 = zBooleanValue3 ? 1.0f : 0.0f;
            x340Var.r(false);
            Float fValueOf3 = Float.valueOf(f5);
            boolean zBooleanValue4 = ((Boolean) hrr0Var.getValue()).booleanValue();
            x340Var.i0(892761509);
            float f6 = zBooleanValue4 ? 1.0f : 0.0f;
            x340Var.r(false);
            Float fValueOf4 = Float.valueOf(f6);
            mhg1VarU.f();
            x340Var.i0(2839488);
            x340Var.r(false);
            fhg1 fhg1VarO2 = bno1.o(mhg1VarU, fValueOf3, fValueOf4, n8b1VarW2, tzg1Var, x340Var, 0);
            boolean zBooleanValue5 = ((Boolean) x340Var.k(cn80.a)).booleanValue();
            boolean zH = x340Var.h(zBooleanValue5) | x340Var.g(fhg1VarO) | ((i2 & 112) == 32) | x340Var.g(fhg1VarO2);
            Object objT = x340Var.T();
            if (zH || objT == fkj0.X) {
                f2 = 0.0f;
                eti0 eti0Var = new eti0(zBooleanValue5, zen0Var, ven0Var, fhg1VarO, fhg1VarO2);
                x340Var.s0(eti0Var);
                objT = eti0Var;
            } else {
                f2 = 0.0f;
            }
            int i3 = i2 >> 9;
            int i4 = i2 >> 6;
            w3d1.a(i541.C(nim0.a, (iu30) objT), hw61Var, j, 0L, f2, f, (qqb) null, apo.r(-1463404422, new g7t(qim0Var, es41Var, j2iVar, (byte) 3), x340Var), x340Var, (i3 & 896) | (i3 & 112) | 12582912 | (57344 & i4) | (458752 & i4) | (i4 & 3670016), 8);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30(qim0Var, zen0Var, ven0Var, es41Var, hw61Var, j, f, j2iVar, i) { // from class: p.fti0
                public final /* synthetic */ qim0 a;
                public final /* synthetic */ zen0 b;
                public final /* synthetic */ ven0 c;
                public final /* synthetic */ es41 d;
                public final /* synthetic */ hw61 e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float g;
                public final /* synthetic */ j2i h;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(385);
                    guo1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (b0k) obj, iP);
                    return rih1.a;
                }
            };
        }
    }

    public static final void f(j2i j2iVar, Function0 function0, qim0 qim0Var, vu30 vu30Var, boolean z, wsi0 wsi0Var, vzq0 vzq0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1325192924);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(vu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i((Object) null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.g(wsi0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.g(vzq0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= x340Var.g((Object) null) ? 67108864 : 33554432;
        }
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            qim0 qim0VarW = uyn1.w(u291.u(u291.f(bin.v(qim0Var, null, ai31.a(0.0f, 6, true), z, null, null, function0, 24), 1.0f), 112.0f, 48.0f, 280.0f, 0.0f, 8), vzq0Var);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
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
            llj lljVar = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var, y580.Y);
            q9e1.a(((k2h1) x340Var.k(o2h1.a)).m, apo.r(865999929, new gti0(vu30Var, wsi0Var, z, j2iVar), x340Var), x340Var, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kvf(j2iVar, function0, qim0Var, vu30Var, z, wsi0Var, vzq0Var, i);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r17v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v20 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r19v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v8 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r20v4 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final void g(float r42, p.iu30 r43, p.qim0 r44, p.qim0 r45, boolean r46, p.ksg r47, int r48, java.util.List r49, kotlin.jvm.functions.Function0 r50, kotlin.jvm.functions.Function0 r51, p.vu30 r52, p.vu30 r53, p.idn0 r54, p.swx r55, int r56, java.lang.String r57, boolean r58, p.zwx r59, p.b0k r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instruction units count: 1069
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.guo1.g(float, p.iu30, p.qim0, p.qim0, boolean, p.ksg, int, java.util.List, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, p.vu30, p.vu30, p.idn0, p.swx, int, java.lang.String, boolean, p.zwx, p.b0k, int, int, int):void");
    }

    public static final void h(boolean z, boolean z2, swx swxVar, zwx zwxVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2055049403);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.g(swxVar) ? 256 : 128) | (x340Var.g(zwxVar) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            long j = z ? swxVar.a : swxVar.b;
            tob1 tob1VarA = z95.a(z2 ? zwxVar.d : zwxVar.a, (fe5) null, "Encore seekbar thumb size", x340Var, 384, 10);
            float f = zwxVar.b / 2.0f;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(uyn1.z(0.0f, f, 1, nim0Var), zwxVar.a);
            gra graVar = een.h;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (qim0Var != nim0Var) {
                x340Var.i0(71897179);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0Var);
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
                t1c.a(dug.f(u291.m(nim0Var, ((p3v) tob1VarA.getValue()).a), j, er31.a), x340Var, 0);
                x340Var.r(true);
                x340Var.r(false);
            } else {
                x340Var.i0(72077227);
                t1c.a(dug.f(u291.m(nim0Var, ((p3v) tob1VarA.getValue()).a), j, er31.a), x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(z, z2, (Object) swxVar, (Object) zwxVar, qim0Var, i, (byte) 9);
        }
    }

    public static final void i(vu30 vu30Var, vu30 vu30Var2, b0k b0kVar, int i) {
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(718703274);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.i(vu30Var) ? 4 : 2) | i | (x340Var.i(vu30Var2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = eqr0.D(0.0f, -10.0f, 1, u291.f(nim0Var, 1.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarD);
            jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
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
            if (vu30Var == null) {
                x340Var.i0(1404694501);
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(-1894349924);
                us71.j(i2 & 14, vu30Var, x340Var, false);
            }
            x340Var.r(true);
            gfh0 gfh0VarC2 = t1c.c(graVar, z);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            if (vu30Var2 == null) {
                x340Var.i0(-2096720210);
                x340Var.r(false);
            } else {
                x340Var.i0(-1314562125);
                us71.j((i2 >> 3) & 14, vu30Var2, x340Var, false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wwx(vu30Var, vu30Var2, i);
        }
    }

    public static final void j(float f, ksg ksgVar, List list, boolean z, swx swxVar, zwx zwxVar, int i, b0k b0kVar, int i2) {
        Object xwxVar;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-670163866);
        int i4 = i2 | (x340Var.d(f) ? 4 : 2) | (x340Var.d(0.0f) ? 32 : 16) | (x340Var.g(ksgVar) ? 256 : 128) | (x340Var.g(list) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.g(swxVar) ? 131072 : 65536) | (x340Var.g(zwxVar) ? 1048576 : 524288) | (x340Var.e(l1d.C(i)) ? 8388608 : 4194304) | (x340Var.h(false) ? 67108864 : 33554432);
        if (x340Var.Y(i4 & 1, (i4 & 38347923) != 38347922)) {
            long j = z ? swxVar.c : swxVar.d;
            long j2 = z ? swxVar.e : swxVar.f;
            float f2 = zwxVar.b;
            qim0 qim0VarH = u291.h(u291.f(nim0.a, 1.0f), f2);
            boolean zD = ((i4 & 29360128) == 8388608) | x340Var.d(f2) | ((234881024 & i4) == 67108864) | ((3670016 & i4) == 1048576) | ((i4 & 14) == 4) | ((i4 & 896) == 256) | ((i4 & 112) == 32) | x340Var.f(j2) | x340Var.f(j) | ((458752 & i4) == 131072) | ((i4 & 7168) == 2048);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                i3 = 0;
                xwxVar = new xwx(f2, i, zwxVar, f, ksgVar, j2, j, swxVar, list);
                x340Var.s0(xwxVar);
            } else {
                xwxVar = objT;
                i3 = 0;
            }
            j0o1.b(i3, x340Var, (iu30) xwxVar, qim0VarH);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ywx(f, ksgVar, list, z, swxVar, zwxVar, i, i2);
        }
    }

    public static final void k(String str, iu30 iu30Var, qim0 qim0Var, Long l, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String str2;
        String m231Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-656930541);
        int i2 = (x340Var.g(l) ? 2048 : 1024) | i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.a;
            String strO0 = cwl1.o0(x340Var, 2131955906);
            String strN0 = null;
            if (l == null) {
                x340Var.i0(1548639814);
                x340Var.r(false);
                str2 = strO0;
            } else {
                x340Var.i0(1548639815);
                try {
                    str2 = strO0;
                    try {
                        m231Var = DateFormat.getDateInstance(2, ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0)).format(new Date(Math.multiplyExact(l.longValue(), 1000L)));
                    } catch (Throwable th) {
                        th = th;
                        m231Var = new m231(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str2 = strO0;
                }
                if (m231Var instanceof m231) {
                    m231Var = null;
                }
                String str3 = m231Var;
                if (str3 == null || str3.length() <= 0) {
                    str3 = null;
                }
                if (str3 == null) {
                    x340Var.i0(815600154);
                } else {
                    x340Var.i0(815600155);
                    strN0 = cwl1.n0(2131955905, new Object[]{str3}, x340Var);
                }
                x340Var.r(false);
                x340Var.r(false);
            }
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new yx00(iu30Var, (byte) 9);
                x340Var.s0(objT);
            }
            o(str, j, str2, strN0, (Function0) objT, x340Var, (i2 & 14) | 196608);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(str, iu30Var, qim0Var2, l, i, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:102:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:105:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x013f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0143  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:96:0x025e  */
    /* JADX WARN: Code duplicated, block: B:98:0x026b  */
    public static final void l(String str, String str2, String str3, u7h u7hVar, boolean z, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        u7h u7hVar2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        u7h u7hVar3;
        boolean z4;
        h311 h311VarV;
        u7h u7hVar4;
        boolean z5;
        era eraVar;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z6;
        n4k n4kVar;
        boolean z7;
        Object objT;
        boolean z8;
        int i7;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(853462189);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(str3) ? 256 : 128;
        }
        int i8 = i & 3072;
        nim0 nim0Var = nim0.a;
        if (i8 == 0) {
            i3 |= x340Var.i(nim0Var) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                u7hVar2 = u7hVar;
                i3 |= x340Var.g(u7hVar2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (x340Var.h(z2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((1572864 & i) == 0) {
                    if (x340Var.i(j2iVar)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
                i6 = i3;
                if ((i6 & 599187) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (x340Var.Y(i6 & 1, z3)) {
                    if (i9 != 0) {
                        u7hVar4 = null;
                    } else {
                        u7hVar4 = u7hVar2;
                    }
                    if (i4 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarH = l6o1.H(voo1.y(dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a), voo1.f), l6o1.C(0, 0, 1, x340Var), false, 14);
                    cvx cvxVar = cbx.b(x340Var).b;
                    qim0 qim0VarY = uyn1.y(qim0VarH, 16.0f, cbx.b(x340Var).b.d);
                    eraVar = een.Q0;
                    mbhVarA = jbh.a(new d36(cbx.b(x340Var).b.c, true, new um5(false)), eraVar, x340Var, 0);
                    iHashCode = Long.hashCode(x340Var.T);
                    xos0VarM = x340Var.m();
                    qim0VarE = zr7.E(x340Var, qim0VarY);
                    hzj.A.getClass();
                    if (j06Var != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    z6 = x340Var.S;
                    n4kVar = hmb0.t1;
                    if (z6) {
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
                    z(str, u7hVar4, x340Var, (i6 & 14) | ((i6 >> 9) & 112));
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    cvx cvxVar2 = cbx.b(x340Var).b;
                    u7h u7hVar5 = u7hVar4;
                    mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
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
                    qim0 qim0VarN = anm1.N("fan_event_redemption_title", u291.f(nim0Var, 1.0f));
                    if ((i6 & 458752) == 131072) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    objT = x340Var.T();
                    if (!z7 || objT == fkj0.X) {
                        z8 = true;
                        objT = new mj10((byte) 1, z5);
                        x340Var.s0(objT);
                    } else {
                        z8 = true;
                    }
                    boolean z9 = z5;
                    uwo1.e(str2, s161.b(qim0VarN, false, (iu30) objT), lee1.a(cbx.d(x340Var).e, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679), cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i6 >> 3) & 14, 0, 2016);
                    x340Var = x340Var;
                    if (str3 == null) {
                        x340Var.i0(439295111);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(439295112);
                        uwo1.e(str3, u291.f(nim0Var, 1.0f), lee1.a(cbx.d(x340Var).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679), cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                        x340Var.r(false);
                    }
                    x340Var.r(true);
                    dv20.l((i6 >> 18) & 14, j2iVar, x340Var, true);
                    u7hVar3 = u7hVar5;
                    z4 = z9;
                } else {
                    x340Var.b0();
                    u7hVar3 = u7hVar2;
                    z4 = z2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yc5(str, str2, str3, u7hVar3, z4, j2iVar, i, i2);
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if (x340Var.i(j2iVar)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i6 = i3;
            if ((i6 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i6 & 1, z3)) {
                if (i9 != 0) {
                    u7hVar4 = null;
                } else {
                    u7hVar4 = u7hVar2;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarH2 = l6o1.H(voo1.y(dug.f(qim0VarF3, cbx.a(x340Var).a.a.a(), d4o1.a), voo1.f), l6o1.C(0, 0, 1, x340Var), false, 14);
                cvx cvxVar3 = cbx.b(x340Var).b;
                qim0 qim0VarY2 = uyn1.y(qim0VarH2, 16.0f, cbx.b(x340Var).b.d);
                eraVar = een.Q0;
                mbhVarA = jbh.a(new d36(cbx.b(x340Var).b.c, true, new um5(false)), eraVar, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarY2);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z6 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z6) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, x340Var, lljVar7);
                nko1.F(x340Var);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar8);
                z(str, u7hVar4, x340Var, (i6 & 14) | ((i6 >> 9) & 112));
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                cvx cvxVar4 = cbx.b(x340Var).b;
                u7h u7hVar6 = u7hVar4;
                mbh mbhVarA3 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF4);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA3, x340Var, lljVar5);
                nko1.H(xos0VarM3, x340Var, lljVar6);
                x0d.q(iHashCode3, x340Var, lljVar7, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar8);
                qim0 qim0VarN2 = anm1.N("fan_event_redemption_title", u291.f(nim0Var, 1.0f));
                if ((i6 & 458752) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objT = x340Var.T();
                if (z7) {
                    z8 = true;
                    objT = new mj10((byte) 1, z5);
                    x340Var.s0(objT);
                } else {
                    z8 = true;
                    objT = new mj10((byte) 1, z5);
                    x340Var.s0(objT);
                }
                boolean z10 = z5;
                uwo1.e(str2, s161.b(qim0VarN2, false, (iu30) objT), lee1.a(cbx.d(x340Var).e, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679), cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i6 >> 3) & 14, 0, 2016);
                x340Var = x340Var;
                if (str3 == null) {
                    x340Var.i0(439295111);
                    x340Var.r(false);
                } else {
                    x340Var.i0(439295112);
                    uwo1.e(str3, u291.f(nim0Var, 1.0f), lee1.a(cbx.d(x340Var).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679), cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                    x340Var.r(false);
                }
                x340Var.r(true);
                dv20.l((i6 >> 18) & 14, j2iVar, x340Var, true);
                u7hVar3 = u7hVar6;
                z4 = z10;
            } else {
                x340Var.b0();
                u7hVar3 = u7hVar2;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(str, str2, str3, u7hVar3, z4, j2iVar, i, i2);
            }
        }
        i3 |= 24576;
        u7hVar2 = u7hVar;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (x340Var.h(z2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((1572864 & i) == 0) {
                if (x340Var.i(j2iVar)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
            i6 = i3;
            if ((i6 & 599187) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i6 & 1, z3)) {
                if (i9 != 0) {
                    u7hVar4 = null;
                } else {
                    u7hVar4 = u7hVar2;
                }
                if (i4 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                qim0 qim0VarF5 = u291.f(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                qim0 qim0VarH3 = l6o1.H(voo1.y(dug.f(qim0VarF5, cbx.a(x340Var).a.a.a(), d4o1.a), voo1.f), l6o1.C(0, 0, 1, x340Var), false, 14);
                cvx cvxVar5 = cbx.b(x340Var).b;
                qim0 qim0VarY3 = uyn1.y(qim0VarH3, 16.0f, cbx.b(x340Var).b.d);
                eraVar = een.Q0;
                mbhVarA = jbh.a(new d36(cbx.b(x340Var).b.c, true, new um5(false)), eraVar, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarY3);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z6 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z6) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar9 = y580.O0;
                nko1.H(mbhVarA, x340Var, lljVar9);
                llj lljVar10 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar10);
                Integer numValueOf3 = Integer.valueOf(iHashCode);
                llj lljVar11 = y580.R0;
                nko1.H(numValueOf3, x340Var, lljVar11);
                nko1.F(x340Var);
                llj lljVar12 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar12);
                z(str, u7hVar4, x340Var, (i6 & 14) | ((i6 >> 9) & 112));
                qim0 qim0VarF6 = u291.f(nim0Var, 1.0f);
                cvx cvxVar6 = cbx.b(x340Var).b;
                u7h u7hVar7 = u7hVar4;
                mbh mbhVarA4 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarF6);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA4, x340Var, lljVar9);
                nko1.H(xos0VarM4, x340Var, lljVar10);
                x0d.q(iHashCode4, x340Var, lljVar11, x340Var);
                nko1.H(qim0VarE4, x340Var, lljVar12);
                qim0 qim0VarN3 = anm1.N("fan_event_redemption_title", u291.f(nim0Var, 1.0f));
                if ((i6 & 458752) == 131072) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objT = x340Var.T();
                if (z7) {
                    z8 = true;
                    objT = new mj10((byte) 1, z5);
                    x340Var.s0(objT);
                } else {
                    z8 = true;
                    objT = new mj10((byte) 1, z5);
                    x340Var.s0(objT);
                }
                boolean z11 = z5;
                uwo1.e(str2, s161.b(qim0VarN3, false, (iu30) objT), lee1.a(cbx.d(x340Var).e, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679), cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i6 >> 3) & 14, 0, 2016);
                x340Var = x340Var;
                if (str3 == null) {
                    x340Var.i0(439295111);
                    x340Var.r(false);
                } else {
                    x340Var.i0(439295112);
                    uwo1.e(str3, u291.f(nim0Var, 1.0f), lee1.a(cbx.d(x340Var).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679), cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                    x340Var.r(false);
                }
                x340Var.r(true);
                dv20.l((i6 >> 18) & 14, j2iVar, x340Var, true);
                u7hVar3 = u7hVar7;
                z4 = z11;
            } else {
                x340Var.b0();
                u7hVar3 = u7hVar2;
                z4 = z2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yc5(str, str2, str3, u7hVar3, z4, j2iVar, i, i2);
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((1572864 & i) == 0) {
            if (x340Var.i(j2iVar)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        i6 = i3;
        if ((i6 & 599187) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i6 & 1, z3)) {
            if (i9 != 0) {
                u7hVar4 = null;
            } else {
                u7hVar4 = u7hVar2;
            }
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            qim0 qim0VarF7 = u291.f(nim0Var, 1.0f);
            uwr uwrVar4 = cbx.a;
            qim0 qim0VarH4 = l6o1.H(voo1.y(dug.f(qim0VarF7, cbx.a(x340Var).a.a.a(), d4o1.a), voo1.f), l6o1.C(0, 0, 1, x340Var), false, 14);
            cvx cvxVar7 = cbx.b(x340Var).b;
            qim0 qim0VarY4 = uyn1.y(qim0VarH4, 16.0f, cbx.b(x340Var).b.d);
            eraVar = een.Q0;
            mbhVarA = jbh.a(new d36(cbx.b(x340Var).b.c, true, new um5(false)), eraVar, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarY4);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z6 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z6) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar13 = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar13);
            llj lljVar14 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar14);
            Integer numValueOf4 = Integer.valueOf(iHashCode);
            llj lljVar15 = y580.R0;
            nko1.H(numValueOf4, x340Var, lljVar15);
            nko1.F(x340Var);
            llj lljVar16 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar16);
            z(str, u7hVar4, x340Var, (i6 & 14) | ((i6 >> 9) & 112));
            qim0 qim0VarF8 = u291.f(nim0Var, 1.0f);
            cvx cvxVar8 = cbx.b(x340Var).b;
            u7h u7hVar8 = u7hVar4;
            mbh mbhVarA5 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarF8);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA5, x340Var, lljVar13);
            nko1.H(xos0VarM5, x340Var, lljVar14);
            x0d.q(iHashCode5, x340Var, lljVar15, x340Var);
            nko1.H(qim0VarE5, x340Var, lljVar16);
            qim0 qim0VarN4 = anm1.N("fan_event_redemption_title", u291.f(nim0Var, 1.0f));
            if ((i6 & 458752) == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            objT = x340Var.T();
            if (z7) {
                z8 = true;
                objT = new mj10((byte) 1, z5);
                x340Var.s0(objT);
            } else {
                z8 = true;
                objT = new mj10((byte) 1, z5);
                x340Var.s0(objT);
            }
            boolean z12 = z5;
            uwo1.e(str2, s161.b(qim0VarN4, false, (iu30) objT), lee1.a(cbx.d(x340Var).e, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679), cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, (i6 >> 3) & 14, 0, 2016);
            x340Var = x340Var;
            if (str3 == null) {
                x340Var.i0(439295111);
                x340Var.r(false);
            } else {
                x340Var.i0(439295112);
                uwo1.e(str3, u291.f(nim0Var, 1.0f), lee1.a(cbx.d(x340Var).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 3, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679), cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2016);
                x340Var.r(false);
            }
            x340Var.r(true);
            dv20.l((i6 >> 18) & 14, j2iVar, x340Var, true);
            u7hVar3 = u7hVar8;
            z4 = z12;
        } else {
            x340Var.b0();
            u7hVar3 = u7hVar2;
            z4 = z2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(str, str2, str3, u7hVar3, z4, j2iVar, i, i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void m(lk10 lk10Var, iu30 iu30Var, qim0 qim0Var, boolean z, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z2;
        String strK;
        int i2;
        int i3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(847794534);
        int i4 = i | (b0kVar3.g(lk10Var) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 3456 | (b0kVar3.i(function0) ? 16384 : 8192);
        if (b0kVar3.Y(i4 & 1, (i4 & 9363) != 9362)) {
            az20 az20Var = (az20) b0kVar3.k(t4k.i);
            k6a1 k6a1Var = (k6a1) b0kVar3.k(t4k.q);
            fk10 fk10Var = lk10Var.c;
            int i5 = fk10Var == null ? -1 : dk10.a[fk10Var.ordinal()];
            if (i5 != -1) {
                if (i5 == 1) {
                    i2 = -1313224480;
                    i3 = 2131955912;
                } else {
                    if (i5 != 2) {
                        throw p3d1.k(b0kVar3, -1313226659, false);
                    }
                    i2 = -1313220732;
                    i3 = 2131955920;
                }
                strK = x0d.k(b0kVar3, i2, i3, b0kVar3, false);
            } else {
                b0kVar3.i0(-2055062441);
                b0kVar3.r(false);
                strK = null;
            }
            b0kVar2 = b0kVar3;
            l(lk10Var.e, cwl1.o0(b0kVar3, 2131955919), cwl1.o0(b0kVar3, 2131955916), null, false, apo.r(1217104710, new uuy((Object) lk10Var, (Object) az20Var, (Object) k6a1Var, (Object) iu30Var, strK, (Object) function0, (byte) 2), b0kVar3), b0kVar2, 1575936, 48);
            qim0Var2 = nim0.a;
            z2 = true;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
            z2 = z;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ey(lk10Var, iu30Var, qim0Var2, z2, function0, i);
        }
    }

    public static final void n(int i, String str, b0k b0kVar, qim0 qim0Var) {
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1796861493);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            l(str2, cwl1.o0(x340Var, 2131955907), null, null, true, wni.a, x340Var, (i2 & 14) | 1772928, 16);
            qim0Var = nim0.a;
        } else {
            str2 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str2, qim0Var, i, (byte) 26);
        }
    }

    public static final void o(String str, long j, String str2, String str3, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1440645999);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(nim0.a) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 >> 3;
            l(str, str2, str3, new u7h(j), true, apo.r(-977437071, new vgz(function0, (byte) 10), x340Var), x340Var, (i2 & 14) | 1769472 | (i3 & 112) | (i3 & 896) | ((i2 >> 6) & 7168) | ((i2 << 9) & 57344), 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si6(str, j, str2, str3, function0, i);
        }
    }

    public static final void p(String str, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1615350625);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.c;
            String strO0 = cwl1.o0(x340Var, 2131955918);
            String strO1 = cwl1.o0(x340Var, 2131955917);
            boolean z = (i2 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new yx00(iu30Var, (byte) 10);
                x340Var.s0(objT);
            }
            o(str, j, strO0, strO1, (Function0) objT, x340Var, (i2 & 14) | 196608);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zj10(str, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void q(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1695334841);
        byte b = 0;
        byte b2 = 1;
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            kiv kivVar = t4k.n;
            Object objK = x340Var.k(kivVar);
            flb0 flb0Var = flb0.a;
            if (objK == flb0Var) {
                x340Var.i0(-1199698904);
                j2iVar.invoke(x340Var, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(-1199671624);
                mod.b(kivVar.a(flb0Var), apo.r(-2069856341, new ak10(j2iVar, b), x340Var), x340Var, 56);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ak10(j2iVar, i, b2);
        }
    }

    public static final void r(hl01 hl01Var, i4m0 i4m0Var, Function0 function0, Function0 function1, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, pl01 pl01Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1238401656);
        int i2 = i | (x340Var.g(hl01Var) ? 4 : 2) | (x340Var.i(i4m0Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | (x340Var.i(iu30Var2) ? 131072 : 65536) | (x340Var.i(vu30Var) ? 1048576 : 524288) | (x340Var.i(pl01Var) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean zI = x340Var.i(pl01Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new ak01(pl01Var, (byte) 0);
                x340Var.s0(objT);
            }
            qxd0.i(rih1.a, (iu30) objT, x340Var);
            nyx.a(2, (wux) null, apo.r(-389176891, new ydi0(hl01Var, function0, iu30Var2, function1, i4m0Var, iu30Var, vu30Var), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(hl01Var, i4m0Var, function0, function1, iu30Var, iu30Var2, vu30Var, pl01Var, i);
        }
    }

    public static final void s(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1107577392);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarS = u291.s(uyn1.z(0.0f, 10.0f, 1, nim0Var), 36.0f, 4.0f);
            uwr uwrVar = cbx.a;
            t1c.a(dug.f(qim0VarS, cbx.a(x340Var).c.b, er31.b(4.0f)), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xgr0(i, (byte) 29);
        }
    }

    public static final void t(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var;
        Function0 function1 = function0;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1784263481);
        int i2 = i | (x340Var2.i(function1) ? 4 : 2);
        if (x340Var2.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
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
            String strO0 = cwl1.o0(x340Var2, 2131960930);
            lee1 lee1Var = cbx.d(x340Var2).d;
            yfu yfuVar = ajx.a;
            Object obj = yfuVar.b;
            gxo1.c(strO0, null, lee1Var, cbx.a(x340Var2).b.a, new a0e1(3), 0, false, null, null, 150.0f, (FontWeight) ((bjx) yfuVar.c).e, null, x340Var2, 0, 0, 2530);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            uwo1.e(ydh.g(16.0f, 2131960929, x340Var2, x340Var2, nim0Var), null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2018);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            String strG = ydh.g(16.0f, 2131960928, x340Var2, x340Var2, nim0Var);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z || objT == fkj0.X) {
                objT = new lpx0(function0, (byte) 24);
                x340Var2.s0(objT);
            }
            Function0 function2 = (Function0) objT;
            if (ihc1.y0(strG)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strG), function2);
            idx idxVar = new idx();
            gdx gdxVarR = yla.r(x340Var2);
            j2i j2iVarR = apo.r(272722226, new p9y0(strG, (byte) 8), x340Var2);
            function1 = function0;
            foo1.c(gbxVar, idxVar, null, null, gdxVarR, null, null, null, null, null, j2iVarR, x340Var2, 0, 48, 2012);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function1, i, (byte) 27);
        }
    }

    public static final void u(List list, String str, long j, tk51 tk51Var, b0k b0kVar, int i) {
        qim0 qim0Var;
        Function0 function0;
        int i2;
        vu30 vu30Var;
        vu30 vu30Var2;
        llj lljVar;
        vj01 vj01Var;
        Paragraph paragraph;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1500918249);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(list) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.f(j) ? 256 : 128) | (x340Var.i(tk51Var) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = dug.f(u291.f(qim0Var2, 1.0f), j, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar2);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var4);
            if (str.length() > 0) {
                x340Var.i0(1633334868);
                qim0Var = qim0Var2;
                vu30Var2 = vu30Var4;
                lljVar = lljVar3;
                function0 = function1;
                vu30Var = vu30Var3;
                cwl1.f(oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070), (String) null, h2c.a.b(qim0Var), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, x340Var, 48, 104);
                x340Var = x340Var;
                i2 = 0;
                x340Var.r(false);
            } else {
                qim0Var = qim0Var2;
                function0 = function1;
                i2 = 0;
                vu30Var = vu30Var3;
                vu30Var2 = vu30Var4;
                lljVar = lljVar3;
                x340Var.i0(1633549171);
                x340Var.r(false);
            }
            qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, i2);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar2);
            nko1.H(xos0VarM2, x340Var, vu30Var);
            x0d.q(iHashCode2, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var2);
            s(x340Var, 0);
            qim0 qim0VarF3 = u291.f(qim0Var, 1.0f);
            mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar2);
            nko1.H(xos0VarM3, x340Var, vu30Var);
            x0d.q(iHashCode3, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE3, x340Var, vu30Var2);
            x340Var.i0(-638896585);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vj01 vj01Var2 = (wj01) it.next();
                if (tk51Var == null || !(vj01Var2 instanceof vj01) || (paragraph = (vj01Var = vj01Var2).c) == null) {
                    x340Var.i0(-1904838598);
                    x340 x340Var2 = x340Var;
                    fuo1.k(vj01Var2, null, vj01Var2 instanceof vj01, x340Var2, 0, 6);
                    x340Var = x340Var2;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1905160130);
                    otw.c(tk51Var, new sk51(vj01Var.b, paragraph, true), (qim0) null, (ipb1) null, x340Var, (i3 >> 9) & 14, 12);
                    x340Var.r(false);
                }
            }
            x340Var.r(false);
            x340Var.r(true);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cg6(list, str, j, tk51Var, i);
        }
    }

    public static final void v(fl01 fl01Var, i4m0 i4m0Var, iu30 iu30Var, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        int i3;
        int i4;
        List list = fl01Var.e;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1088028247);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(fl01Var) : b0kVar3.i(fl01Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(i4m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(vu30Var) ? 2048 : 1024;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarX = poo1.x(lhc.g(b0kVar3).e, b0kVar3);
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
            Object objT = b0kVar3.T();
            if (objT == m4cVar) {
                objT = new key(i4m0Var, new r9y0(ven0VarS, (byte) 5));
                b0kVar3.s0(objT);
            }
            key keyVar = (key) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = new tk51(i4m0Var);
                b0kVar3.s0(objT2);
            }
            tk51 tk51Var = (tk51) objT2;
            boolean zG = b0kVar3.g(list);
            Object objT3 = b0kVar3.T();
            Object obj = objT3;
            if (zG || objT3 == m4cVar) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    if (((wj01) it.next()) instanceof rj01) {
                        i4 = i5 + 1;
                        i3 = i4;
                    } else {
                        i3 = i5;
                        i4 = 0;
                    }
                    arrayList.add(Integer.valueOf(i4));
                    i5 = i3;
                }
                b0kVar3.s0(arrayList);
                obj = arrayList;
            }
            List list3 = (List) obj;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar) {
                objT4 = new xtb0(fl01Var.h, fl01Var.i);
                b0kVar3.s0(objT4);
            }
            xtb0 xtb0Var = (xtb0) objT4;
            ven0 ven0VarS2 = v8r.s(vu30Var, b0kVar3);
            boolean zI = b0kVar3.i(xtb0Var) | b0kVar3.i(ven0VarS2);
            Object objT5 = b0kVar3.T();
            if (zI || objT5 == m4cVar) {
                objT5 = new ywj(xtb0Var, ven0VarS2, null, (byte) 4);
                b0kVar3.s0(objT5);
            }
            qxd0.t(xtb0Var, b0kVar3, (vu30) objT5);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, vk80VarX.a(), 7);
            boolean zI2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && b0kVar3.i(fl01Var))) | b0kVar3.i(tk51Var) | b0kVar3.i(keyVar) | b0kVar3.g(list3);
            Object objT6 = b0kVar3.T();
            if (zI2 || objT6 == m4cVar) {
                vvu0 vvu0Var = new vvu0(fl01Var, tk51Var, keyVar, list3, (byte) 15);
                b0kVar3.s0(vvu0Var);
                objT6 = vvu0Var;
            }
            b0kVar2 = b0kVar3;
            ujo1.d(qim0VarF, xtb0Var, zzq0VarJ, false, null, null, null, false, null, (iu30) objT6, b0kVar2, 0, 504);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(fl01Var, i4m0Var, iu30Var, vu30Var, i, (byte) 22);
        }
    }

    public static final void w(b0k b0kVar, int i) {
        byte b;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(152897297);
        j06 j06Var = ((x340) b0kVar2).a;
        if (b0kVar2.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            String strO0 = cwl1.o0(b0kVar2, 2131960936);
            lee1 lee1Var = cbx.d(b0kVar2).d;
            yfu yfuVar = ajx.a;
            Object obj = yfuVar.b;
            gxo1.c(strO0, null, lee1Var, cbx.a(b0kVar2).b.a, new a0e1(3), 0, false, null, null, 150.0f, (FontWeight) ((bjx) yfuVar.c).e, null, b0kVar2, 0, 0, 2530);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            uwo1.e(ydh.g(16.0f, 2131960935, b0kVar2, b0kVar2, nim0Var), null, cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2018);
            b0kVar2 = b0kVar2;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            mta mtaVar = ywx0.k(nim0Var, 16.0f, b0kVar2, b0kVar2).d;
            qim0 qim0VarH = u291.h(nim0Var, 48.0f);
            b = 0;
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarH);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            xto1.e(null, 3, cbx.a(b0kVar2).b.a, 0L, b0kVar2, 48, 9);
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            b = 0;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new fk01(i, b);
        }
    }

    public static final void x(String str, String str2, boolean z, String str3, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-393994452);
        int i2 = (b0kVar3.g(str) ? 4 : 2) | i | (b0kVar3.g(str2) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= b0kVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.g(str3) ? 2048 : 1024;
        }
        int i3 = i2 | (b0kVar3.i(function0) ? 16384 : 8192);
        if (!b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        } else {
            if (ihc1.y0(str2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(new y50(str2), function0), new idx(4), anm1.N("fan_event_redemption_primary_button", nim0.a), z ? jax.a : new hax(str3), yla.r(b0kVar3), null, null, null, null, null, apo.r(672311083, new ps00(str, (byte) 2), b0kVar3), b0kVar2, 0, 48, 1992);
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bk10(str, str2, z, str3, function0, i, (byte) 0);
        }
    }

    public static final void y(String str, String str2, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(55686955);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024) | (x340Var.h(true) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT;
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            k6a1 k6a1Var = (k6a1) x340Var.k(t4k.q);
            boolean zG = x340Var.g(context);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                Object systemService = context.getSystemService("accessibility");
                objT2 = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
                x340Var.s0(objT2);
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) objT2;
            Boolean bool = Boolean.TRUE;
            boolean zI = x340Var.i(accessibilityManager) | ((i2 & 57344) == 16384) | x340Var.i(lz20Var) | x340Var.i(k6a1Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                piu piuVar = new piu(accessibilityManager, lz20Var, k6a1Var, (lnm) null, (byte) 12);
                x340Var.s0(piuVar);
                objT3 = piuVar;
            }
            qxd0.t(bool, x340Var, (vu30) objT3);
            q(6, apo.r(212681572, new ta5(str, str2, iu30Var, lz20Var, cwl1.o0(x340Var, 2131955908), cwl1.n0(2131955909, new Object[]{Integer.valueOf(str.length())}, x340Var), function0, (byte) 20), x340Var), x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qfx(str, str2, iu30Var, function0, i, (byte) 14);
        }
    }

    public static final void z(String str, u7h u7hVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1841937668);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(u7hVar) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            q(6, apo.r(1549805475, new ksf(u7hVar, str), x340Var), x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new say(str, u7hVar, i, (byte) 5);
        }
    }
}
