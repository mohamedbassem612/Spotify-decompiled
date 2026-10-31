package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.common.uri.SpotifyUriParserException;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class i8p1 {
    public static b180 a;
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:49:0x0189  */
    public static final void a(Function0 function0, b0k b0kVar, int i) {
        int i2;
        byte b2;
        m4c m4cVar;
        ven0 ven0Var;
        lnm lnmVar;
        boolean zI;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2069783677);
        int i3 = i & 6;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 = i | (x340Var.i(nim0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ven0 ven0VarS = v8r.s(function0, x340Var);
            ncf0 ncf0VarG = h5p1.G(new ocf0(2131886204), null, null, x340Var, 0, 62);
            Object objT2 = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT2 == m4cVar2) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            kbf0 kbf0VarN = zpn1.n(ncf0VarG.c(), ((Boolean) ven0Var2.getValue()).booleanValue(), false, null, 0.0f, 0, x340Var, 1020);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            fcf0 fcf0VarC = ncf0VarG.c();
            boolean zI2 = x340Var.i(kbf0VarN);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar2) {
                objT3 = new uk1(kbf0VarN, (byte) 0);
                x340Var.s0(objT3);
            }
            mp10.e(fcf0VarC, (Function0) objT3, u291.r(nim0Var, 162.0f), false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, (j6m) null, false, false, (Map) null, (jj7) null, false, x340Var, 0, 0, 65528);
            x340Var = x340Var;
            x340Var.r(true);
            Boolean boolValueOf = Boolean.valueOf(kbf0VarN.j());
            boolean zI3 = x340Var.i(kbf0VarN) | x340Var.i(ven0Var2) | x340Var.i(ven0VarS);
            Object objT4 = x340Var.T();
            if (zI3) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT4 != m4cVar) {
                    ven0Var = ven0Var2;
                    lnmVar = null;
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT4);
                zI = x340Var.i(ven0Var);
                objT = x340Var.T();
                if (!zI || objT == m4cVar) {
                    b2 = 0;
                    objT = new vk1(ven0Var, lnmVar, (byte) 0);
                    x340Var.s0(objT);
                } else {
                    b2 = 0;
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT);
            }
            ven0Var = ven0Var2;
            hb1 hb1Var = new hb1(kbf0VarN, ven0Var, ven0VarS, (lnm) null, (byte) 2);
            lnmVar = null;
            x340Var.s0(hb1Var);
            objT4 = hb1Var;
            qxd0.t(boolValueOf, x340Var, (vu30) objT4);
            zI = x340Var.i(ven0Var);
            objT = x340Var.T();
            if (zI) {
                b2 = 0;
                objT = new vk1(ven0Var, lnmVar, (byte) 0);
                x340Var.s0(objT);
            } else {
                b2 = 0;
                objT = new vk1(ven0Var, lnmVar, (byte) 0);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
        } else {
            b2 = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1(function0, i, b2);
        }
    }

    public static final void b(int i, int i2, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        qim0 qim0Var2;
        long j;
        boolean z;
        jax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1215214571);
        j06 j06Var = x340Var.a;
        int i3 = (x340Var.e(l1d.C(i)) ? 4 : 2) | i2 | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = i != 3;
            boolean z3 = i == 1;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("mixing_beatmatch_toggle_row", uyn1.z(20.0f, 0.0f, 2, u291.f(qim0Var3, 1.0f)));
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
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
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, lljVar4, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarQ);
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
            String strO0 = cwl1.o0(x340Var, 2131958617);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            if (z2) {
                x340Var.i0(-1274340961);
                j = cbx.a(x340Var).b.a;
            } else {
                x340Var.i0(-1274339806);
                j = cbx.a(x340Var).c.b;
            }
            x340Var.r(false);
            uwo1.e(strO0, null, lee1Var, j, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1572864, 0, 1714);
            if (z2) {
                z = false;
                x340Var.i0(-849404953);
                x340Var.r(false);
            } else {
                x340Var.i0(-849691579);
                uwo1.e(cwl1.o0(x340Var, 2131958618), null, cbx.d(x340Var).j, cbx.a(x340Var).c.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1572864, 0, 1714);
                z = false;
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
            op71.g(x340Var, u291.v(qim0Var2, 16.0f));
            iu30 iu30Var2 = z2 ? iu30Var : null;
            if (z2) {
                x340Var.i0(2108594245);
                x340Var.r(z);
                haxVar = jax.a;
            } else {
                x340Var.i0(2108596125);
                haxVar = new hax(cwl1.o0(x340Var, 2131958618));
                x340Var.r(z);
            }
            anm1.c(z3, iu30Var2, (qim0) null, haxVar, (idn0) null, x340Var, 0, 20);
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(i, iu30Var, qim0Var2, i2);
        }
    }

    public static final void c(ulh ulhVar, Function0 function0, Function0 function1, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1712833624);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ulhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        nim0 nim0Var = nim0.a;
        if (i3 == 0) {
            i2 |= x340Var.i(nim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            boolean zH = x340Var.h(ulhVar.d != null) | x340Var.e(l1d.C(ulhVar.e));
            Object objT = x340Var.T();
            if (zH || objT == m4cVar) {
                objT = yv91.a(new ame(xtb0VarA, ulhVar, (byte) 23));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            Boolean bool = (Boolean) tob1Var.getValue();
            bool.getClass();
            boolean zI = x340Var.i(tob1Var) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new xlh(function0, tob1Var, (lnm) null, (byte) 0);
                x340Var.s0(objT2);
            }
            qxd0.t(bool, x340Var, (vu30) objT2);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var).a.a.a(), d4o1.a);
            boolean zI2 = x340Var.i(ulhVar) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new o0d(ulhVar, j2iVar, function1, (byte) 12);
                x340Var.s0(objT3);
            }
            s3o1.d(qim0VarF2, xtb0VarA, null, null, null, null, false, null, (iu30) objT3, x340Var, 0, 508);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqa(ulhVar, function0, function1, j2iVar, i);
        }
    }

    public static final void d(ulh ulhVar, d0r d0rVar, n6p n6pVar, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(518736798);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(ulhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(d0rVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(n6pVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(function1) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if (b0kVar3.Y(i3 & 1, (i3 & 74899) != 74898)) {
            boolean zG = b0kVar3.g(d0rVar);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                wzn wznVar = (wzn) n6pVar.a.c;
                Context context = (Context) ((amh) wznVar.b).a.get();
                c8o.l(context);
                amh amhVar = (amh) wznVar.b;
                kly0 kly0Var = amhVar.c;
                k0a1 k0a1Var = (k0a1) amhVar.k.get();
                c8o.l(k0a1Var);
                f1n0 f1n0Var = (f1n0) amhVar.i.get();
                c8o.l(f1n0Var);
                i4q i4qVar = (i4q) amhVar.d.get();
                c8o.l(i4qVar);
                dg30 dg30Var = (dg30) kly0Var.get();
                c8o.l(dg30Var);
                eg0 eg0Var = new eg0(dg30Var);
                dg30 dg30Var2 = (dg30) kly0Var.get();
                c8o.l(dg30Var2);
                jjz jjzVar = (jjz) amhVar.g.get();
                c8o.l(jjzVar);
                oi oiVar = new oi(dg30Var2, jjzVar, ((Boolean) amhVar.l.get()).booleanValue(), (byte) 11);
                kt91 kt91Var = (kt91) amhVar.j.get();
                c8o.l(kt91Var);
                h4q h4qVar = (h4q) amhVar.b.get();
                c8o.l(h4qVar);
                uhh uhhVar = new uhh(context, k0a1Var, f1n0Var, i4qVar, eg0Var, oiVar, kt91Var, h4qVar, d0rVar);
                b0kVar3.s0(uhhVar);
                objT = uhhVar;
            }
            int i4 = i3 >> 3;
            b0kVar2 = b0kVar3;
            c(ulhVar, function0, function1, apo.r(1475468716, new nzd((uhh) objT, ulhVar, d0rVar, (byte) 3), b0kVar3), b0kVar2, (i3 & 14) | 24576 | ((i3 >> 12) & 112) | (i4 & 896) | (i4 & 7168));
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(ulhVar, d0rVar, n6pVar, function0, function1, qim0Var2, i, (byte) 10);
        }
    }

    public static final void e(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(311732469);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new kcx((byte) 1, z);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            dv20.l(6, j2iVar, x340Var, true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rbh(z, qim0Var2, j2iVar, i, (byte) 2);
        }
    }

    public static final void f(t7q0 t7q0Var, bc71 bc71Var, Function0 function0, yxb0 yxb0Var, nu nuVar, yuu0 yuu0Var, e821 e821Var, boolean z, boolean z2, qim0 qim0Var, tyq tyqVar, b0k b0kVar, int i) {
        Function0 function1;
        qim0 qim0Var2;
        qim0 qim0Var3;
        int i2;
        e271 c271Var;
        boolean z3;
        String str;
        qim0 qim0VarI;
        int i3;
        boolean z4;
        boolean z5 = z2;
        gra graVar = een.h;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1567943832);
        j06 j06Var = x340Var.a;
        int i4 = i | (x340Var.g(t7q0Var) ? 4 : 2) | (x340Var.g(bc71Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.i(yxb0Var) ? 2048 : 1024) | (x340Var.i(nuVar) ? 16384 : 8192) | (x340Var.i(yuu0Var) ? 131072 : 65536) | (x340Var.i(e821Var) ? 1048576 : 524288) | (x340Var.h(z) ? 8388608 : 4194304) | (x340Var.h(z5) ? 67108864 : 33554432) | 805306368;
        if (x340Var.Y(i4 & 1, ((i4 & 306783379) == 306783378 && ((x340Var.i(tyqVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            gfh0 gfh0VarC = t1c.c(een.f, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var4);
            hzj.A.getClass();
            Object obj = null;
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z6 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
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
            if (t7q0Var instanceof h7q0) {
                x340Var.i0(1564772806);
                wol wolVar = ((h7q0) t7q0Var).a;
                if (wolVar instanceof wol) {
                    x340Var.i0(2128688712);
                    lg31 lg31Var = wolVar.b;
                    String str2 = lg31Var != null ? lg31Var.a : null;
                    String str3 = str2 != null ? str2 : "";
                    qim0Var3 = qim0Var4;
                    i3 = i4;
                    otw.c(nuVar, new ur40(str3, lg31Var != null ? lg31Var.b : null, lg31Var != null ? lg31Var.c : 0, lg31Var != null ? lg31Var.d : 0), (qim0) null, (ipb1) null, x340Var, (i4 >> 12) & 14, 12);
                    x340Var = x340Var;
                    z4 = false;
                    x340Var.r(false);
                } else {
                    qim0Var3 = qim0Var4;
                    i3 = i4;
                    z4 = false;
                    if (wolVar instanceof mpl) {
                        x340Var.i0(1565267721);
                        if (tyqVar == null) {
                            x340Var.i0(1565267720);
                            x340Var.r(false);
                        } else {
                            x340Var.i0(1565267721);
                            otw.c(tyqVar, new bwb1(((mpl) wolVar).a), (qim0) null, (ipb1) null, x340Var, 0, 12);
                            z4 = false;
                            x340Var.r(false);
                        }
                        x340Var.r(z4);
                    } else {
                        x340Var.i0(1565508622);
                        x340Var.r(false);
                    }
                }
                x340Var.r(z4);
                i2 = i3;
                z5 = z2;
            } else if (t7q0Var instanceof f7q0) {
                x340Var.i0(1565694963);
                f7q0 f7q0Var = (f7q0) t7q0Var;
                String str4 = f7q0Var.a;
                qz61 qz61Var = f7q0Var.g;
                if (f7q0Var.e instanceof q7q0) {
                    x340Var.i0(1565666412);
                    boolean zG = x340Var.g(str4);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        objT = yuu0Var.a("", "");
                        x340Var.s0(objT);
                    }
                    tvu0 tvu0Var = (tvu0) objT;
                    avu0 avu0Var = new avu0((String) null, (String) null, f7q0Var.a, (w4i1) null, (String) null, 27);
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = td80.f;
                        x340Var.s0(objT2);
                    }
                    otw.c(tvu0Var, new dvu0(avu0Var, false, (iu30) objT2), (qim0) null, (ipb1) null, x340Var, 0, 12);
                    x340Var.r(false);
                    z5 = z2;
                    qim0Var3 = qim0Var4;
                    i2 = i4;
                    z3 = false;
                } else {
                    qim0Var3 = qim0Var4;
                    x340Var.i0(1566408676);
                    String strK = nzy.k(str4);
                    if (u890.j(bc71Var, kb71.a)) {
                        x340Var.i0(1566441133);
                        qim0 qim0VarN = anm1.N("InputFieldShareCardLoading", u291.r(qim0Var3, 48.0f));
                        gfh0 gfh0VarC2 = t1c.c(graVar, false);
                        i2 = i4;
                        int iHashCode2 = Long.hashCode(x340Var.T);
                        xos0 xos0VarM2 = x340Var.m();
                        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
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
                        xto1.e(null, 3, 0L, 0L, x340Var, 48, 13);
                        x340Var = x340Var;
                        x340Var.r(true);
                        z3 = false;
                        x340Var.r(false);
                        z5 = z2;
                    } else {
                        i2 = i4;
                        x340Var.i0(1566816729);
                        zb71 zb71VarL = wro1.L(o0p1.r(bc71Var == null ? jb71.a : bc71Var, f7q0Var.f));
                        oz61 oz61VarL = zb71VarL != null ? kuo1.l(zb71VarL, false) : null;
                        boolean zG2 = x340Var.g(strK) | x340Var.g(qz61Var) | x340Var.g(oz61VarL) | ((29360128 & i2) == 8388608) | x340Var.g(e821Var);
                        Object objT3 = x340Var.T();
                        if (zG2 || objT3 == m4cVar) {
                            if (!z || nzy.j(strK) || e821Var == null || (qz61Var == null && oz61VarL == null)) {
                                objT3 = null;
                            } else {
                                if (qz61Var != null && oz61VarL != null) {
                                    c271Var = new e271(strK, qz61Var, oz61VarL);
                                } else if (qz61Var != null) {
                                    c271Var = new d271(qz61Var);
                                } else {
                                    c271Var = oz61VarL != null ? new c271(strK, oz61VarL) : new f271(strK);
                                }
                                objT3 = e821Var.h(c271Var);
                            }
                            x340Var.s0(objT3);
                        }
                        tyq tyqVar2 = (tyq) objT3;
                        if (tyqVar2 != null) {
                            x340Var.i0(1568365737);
                            z5 = z2;
                            boolean zS = luo1.s(qz61Var, true, z5);
                            if (zb71VarL == null) {
                                str = strK;
                                qim0VarI = qim0Var3;
                            } else {
                                str = strK;
                                qim0VarI = zr7.i(qim0Var3, new tf((Object) str, obj, (Object) zb71VarL, zS, (byte) 0));
                            }
                            puo1.h(tyqVar2, str, true, qim0VarI, x340Var, 384);
                            z3 = false;
                            x340Var.r(false);
                        } else {
                            z5 = z2;
                            x340Var.i0(1569101553);
                            otw.c(yxb0Var, new aq71(strK, (String) null, f7q0Var.c, (bc71) null, f7q0Var.f, 8), (qim0) null, (ipb1) null, x340Var, (i2 >> 9) & 14, 12);
                            z3 = false;
                            x340Var.r(false);
                        }
                        x340Var.r(z3);
                    }
                    x340Var.r(z3);
                }
                x340Var.r(z3);
            } else {
                z5 = z2;
                qim0Var3 = qim0Var4;
                i2 = i4;
                x340Var.i0(2128843638);
                x340Var.r(false);
            }
            cr31 cr31Var = er31.a;
            mgx mgxVar = mgx.e;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            zzq0 zzq0Var = new zzq0(4.0f, 4.0f, 4.0f, 4.0f);
            qim0 qim0VarC = eqr0.C(qim0Var3, 5.0f, -5.0f);
            boolean z7 = (i2 & 896) == 256;
            Object objT4 = x340Var.T();
            if (z7 || objT4 == m4cVar) {
                function1 = function0;
                objT4 = new j160(function1, (byte) 13);
                x340Var.s0(objT4);
            } else {
                function1 = function0;
            }
            x340 x340Var2 = x340Var;
            cwl1.b(qim0VarC, graVar, cr31Var, mgxVar, zzq0Var, (max) null, false, (idn0) null, new vch(vno1.o(cr31Var, x340Var, 0)), new gbx(z50.c, (Function0) objT4), (gbx) null, xsi.a, x340Var2, 3126, 48, 1248);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            function1 = function0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new seb(t7q0Var, bc71Var, function1, yxb0Var, nuVar, yuu0Var, e821Var, z, z5, qim0Var2, tyqVar, i);
        }
    }

    public static final void g(be50 be50Var, float f, qim0 qim0Var, long j, float f2, float f3, b0k b0kVar, int i) {
        int i2;
        float f4;
        float f5;
        int i3;
        rkb rkbVar;
        ven0 ven0Var;
        byte b2;
        ven0 ven0Var2;
        qim0 qim0Var2 = qim0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-574515857);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(be50Var) : x340Var.i(be50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            f4 = f;
            i2 |= x340Var.d(f4) ? 32 : 16;
        } else {
            f4 = f;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(1.8f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            f5 = f2;
            i2 |= x340Var.d(f5) ? 131072 : 65536;
        } else {
            f5 = f2;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var.d(f3) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (i2 & 599187) != 599186)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q((Object) null);
                x340Var.s0(objT);
            }
            ven0 ven0Var3 = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                i3 = 4;
                objT2 = v8r.q(new Size(0L));
                x340Var.s0(objT2);
            } else {
                i3 = 4;
            }
            ven0 ven0Var4 = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                try {
                    RenderScript renderScriptCreate = RenderScript.create(context);
                    renderScriptCreate.getClass();
                    rkbVar = new rkb(renderScriptCreate, ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate)));
                } catch (Exception unused) {
                    rkbVar = null;
                }
                x340Var.s0(rkbVar);
                objT3 = rkbVar;
            }
            rkb rkbVar2 = (rkb) objT3;
            boolean zI = x340Var.i(rkbVar2);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new zw11(rkbVar2, (byte) 5);
                x340Var.s0(objT4);
            }
            qxd0.i(rih1.a, (iu30) objT4, x340Var);
            boolean z = (i2 & 896) == 256;
            Object objT5 = x340Var.T();
            Object obj = objT5;
            if (z || objT5 == m4cVar) {
                float[] fArr = new float[20];
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[i3] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = 1.0f;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[11] = 0.0f;
                fArr[12] = 1.0f;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[i3] = 0.0f;
                fArr[5] = 0.0f;
                fArr[6] = 1.0f;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[11] = 0.0f;
                fArr[12] = 1.0f;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                fArr[0] = 1.6295999f;
                fArr[1] = -0.57199997f;
                fArr[2] = -0.057599995f;
                fArr[5] = -0.1704f;
                fArr[6] = 1.2279999f;
                fArr[7] = -0.057599995f;
                fArr[10] = -0.1704f;
                fArr[11] = -0.57199997f;
                fArr[12] = 1.7423999f;
                c9h c9hVar = new c9h(new ColorMatrixColorFilter(fArr));
                c9hVar.b = fArr;
                x340Var.s0(c9hVar);
                obj = c9hVar;
            }
            ColorFilter colorFilter = (ColorFilter) obj;
            Object[] objArr = {be50Var, rkbVar2, Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(f3)};
            boolean zI2 = ((i2 & 14) == i3 || ((i2 & 8) != 0 && x340Var.i(be50Var))) | x340Var.i(rkbVar2) | x340Var.i(ven0Var4) | ((i2 & 112) == 32) | ((((57344 & i2) ^ 24576) > 16384 && x340Var.f(j)) || (i2 & 24576) == 16384) | ((458752 & i2) == 131072) | ((i2 & 3670016) == 1048576) | x340Var.i(ven0Var3);
            Object objT6 = x340Var.T();
            if (zI2 || objT6 == m4cVar) {
                ven0Var = ven0Var3;
                float f6 = f5;
                b2 = 8;
                ven0Var2 = ven0Var4;
                cd21 cd21Var = new cd21(f, f6, f3, j, rkbVar2, (lnm) null, be50Var, ven0Var2, ven0Var);
                x340Var.s0(cd21Var);
                objT6 = cd21Var;
            } else {
                ven0Var = ven0Var3;
                ven0Var2 = ven0Var4;
                b2 = 8;
            }
            qxd0.u(objArr, (vu30) objT6, x340Var);
            boolean zI3 = x340Var.i(ven0Var2) | x340Var.i(ven0Var) | x340Var.i(colorFilter);
            Object objT7 = x340Var.T();
            if (zI3 || objT7 == m4cVar) {
                objT7 = new v721(ven0Var2, ven0Var, colorFilter, b2);
                x340Var.s0(objT7);
            }
            qim0Var2 = qim0Var;
            op71.g(x340Var, exd0.s(qim0Var2, (iu30) objT7));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dd21(be50Var, f, qim0Var2, j, f2, f3, i);
        }
    }

    public static final void h(he81 he81Var, VideoSurfaceView videoSurfaceView, gw70 gw70Var, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(602853281);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(he81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(videoSurfaceView) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(gw70Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(idd1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(idd1Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(idd1Var3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            nyx.a(2, (wux) null, apo.r(1899276532, new wy51((Object) gw70Var, (Object) qim0Var, (Object) iu30Var, (Object) he81Var, (Object) videoSurfaceView, (Object) idd1Var, (Object) idd1Var2, (Object) idd1Var3, (byte) 3, false), x340Var), x340Var, 3078, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f1c(he81Var, videoSurfaceView, gw70Var, idd1Var, idd1Var2, idd1Var3, iu30Var, qim0Var, i, (byte) 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0130  */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:104:0x0145  */
    /* JADX WARN: Code duplicated, block: B:107:0x0155  */
    /* JADX WARN: Code duplicated, block: B:108:0x0158  */
    /* JADX WARN: Code duplicated, block: B:111:0x0161  */
    /* JADX WARN: Code duplicated, block: B:112:0x0164  */
    /* JADX WARN: Code duplicated, block: B:118:0x0173  */
    /* JADX WARN: Code duplicated, block: B:121:0x0182  */
    /* JADX WARN: Code duplicated, block: B:123:0x0196  */
    /* JADX WARN: Code duplicated, block: B:137:0x01da  */
    /* JADX WARN: Code duplicated, block: B:141:0x020f  */
    /* JADX WARN: Code duplicated, block: B:147:0x0222  */
    /* JADX WARN: Code duplicated, block: B:150:0x023a A[LOOP:1: B:148:0x0234->B:150:0x023a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0278  */
    /* JADX WARN: Code duplicated, block: B:158:0x028a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0292  */
    /* JADX WARN: Code duplicated, block: B:162:0x029d  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:169:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:172:0x0305  */
    /* JADX WARN: Code duplicated, block: B:175:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x010a  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0121  */
    public static final void i(String str, c380 c380Var, iu30 iu30Var, qim0 qim0Var, lee1 lee1Var, long j, long j2, b0k b0kVar, int i, int i2) {
        int i3;
        c380 c380Var2;
        qim0 qim0Var2;
        lee1 lee1Var2;
        long j3;
        long j4;
        int i4;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        lee1 lee1Var3;
        long j5;
        h311 h311VarV;
        qim0 qim0Var4;
        lee1 lee1Var4;
        long j6;
        qim0 qim0Var5;
        lee1 lee1Var5;
        int i5;
        ven0 ven0VarS;
        int i6;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objT;
        ArrayList arrayList;
        Iterator it;
        int i7;
        Object next;
        List list;
        boolean zG;
        Object objT2;
        zma1 zma1Var;
        boolean zG2;
        Object objT3;
        ArrayList arrayList2;
        Iterator it2;
        List list2;
        boolean zG3;
        Object objT4;
        ye5 ye5Var;
        Iterator it3;
        int i8;
        Object next2;
        int i9;
        int i10;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1540249185);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            c380Var2 = c380Var;
            i3 |= b0kVar3.g(c380Var2) ? 32 : 16;
        } else {
            c380Var2 = c380Var;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    lee1Var2 = lee1Var;
                    int i12 = b0kVar3.i(lee1Var2) ? 16384 : 8192;
                    i3 |= i12;
                } else {
                    lee1Var2 = lee1Var;
                }
                i3 |= i12;
            } else {
                lee1Var2 = lee1Var;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j3 = j;
                    int i13 = b0kVar3.f(j3) ? 131072 : 65536;
                    i3 |= i13;
                } else {
                    j3 = j;
                }
                i3 |= i13;
            } else {
                j3 = j;
            }
            if ((i & 1572864) == 0) {
                j4 = j2;
                if ((i2 & 64) == 0 || !b0kVar3.f(j4)) {
                    i10 = 524288;
                } else {
                    i10 = 1048576;
                }
                i3 |= i10;
            } else {
                j4 = j2;
            }
            i4 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i4 & 1, z)) {
                b0kVar3.d0();
                if ((i & 1) != 0 || b0kVar3.E()) {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i2 & 16) != 0) {
                        uwr uwrVar = cbx.a;
                        lee1Var4 = cbx.d(b0kVar3).m;
                        i4 &= -57345;
                    } else {
                        lee1Var4 = lee1Var2;
                    }
                    if ((i2 & 32) != 0) {
                        uwr uwrVar2 = cbx.a;
                        j6 = cbx.a(b0kVar3).b.b;
                        i4 &= -458753;
                    } else {
                        j6 = j3;
                    }
                    if ((i2 & 64) != 0) {
                        uwr uwrVar3 = cbx.a;
                        j4 = cbx.a(b0kVar3).c.f;
                        qim0Var5 = qim0Var4;
                        i5 = i4 & (-3670017);
                        lee1Var5 = lee1Var4;
                    } else {
                        qim0Var5 = qim0Var4;
                        lee1Var5 = lee1Var4;
                        i5 = i4;
                    }
                } else {
                    b0kVar3.b0();
                    i5 = (i2 & 16) != 0 ? i4 & (-57345) : i4;
                    if ((i2 & 32) != 0) {
                        i5 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i5 &= -3670017;
                    }
                    long j7 = j3;
                    qim0Var5 = qim0Var2;
                    lee1Var5 = lee1Var2;
                    j6 = j7;
                }
                b0kVar3.s();
                ven0VarS = v8r.s(iu30Var, b0kVar3);
                i6 = i5 & 14;
                if (i6 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z5 = z2;
                if ((i5 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z5 | z3;
                objT = b0kVar3.T();
                if (!z4 || objT == obj) {
                    arrayList = new ArrayList();
                    it = c380Var2.iterator();
                    while (it.hasNext()) {
                        Iterator it4 = it;
                        next = it4.next();
                        int i14 = i5;
                        if (ihc1.h0(str, ((mae1) next).a, false)) {
                            arrayList.add(next);
                        }
                        it = it4;
                        i5 = i14;
                    }
                    i7 = i5;
                    objT = o7h.a1(arrayList, new hzx0(str, (byte) 2));
                    b0kVar3.s0(objT);
                } else {
                    i7 = i5;
                }
                list = (List) objT;
                zG = b0kVar3.g(lee1Var5.a.f) | ((((i7 & 3670016) ^ 1572864) <= 1048576 && b0kVar3.f(j4)) || (i7 & 1572864) == 1048576);
                objT2 = b0kVar3.T();
                if (zG || objT2 == obj) {
                    objT2 = new zma1(j4, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, lee1Var5.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61406);
                    b0kVar3.s0(objT2);
                }
                zma1Var = (zma1) objT2;
                zG2 = (i6 == 4) | b0kVar3.g(list);
                objT3 = b0kVar3.T();
                if (zG2 || objT3 == obj) {
                    List list3 = list;
                    arrayList2 = new ArrayList(q7h.U(list3, 10));
                    it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((mae1) it2.next()).a);
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[0]);
                    objT3 = ihc1.Q0(str, (String[]) Arrays.copyOf(strArr, strArr.length), 0, 6);
                    b0kVar3.s0(objT3);
                }
                list2 = (List) objT3;
                zG3 = b0kVar3.g(list2) | b0kVar3.g(list) | b0kVar3.g(zma1Var);
                objT4 = b0kVar3.T();
                if (zG3 || objT4 == obj) {
                    ye5Var = new ye5();
                    it3 = list2.iterator();
                    i8 = 0;
                    while (it3.hasNext()) {
                        next2 = it3.next();
                        i9 = i8 + 1;
                        if (i8 < 0) {
                            p7h.T();
                            throw null;
                        }
                        ye5Var.g((String) next2);
                        if (i8 < list.size()) {
                            mae1 mae1Var = (mae1) list.get(i8);
                            vhg.c(ye5Var, mae1Var.a, mae1Var.b, zma1Var, new ry71(ven0VarS, (byte) 16));
                        }
                        it3 = it3;
                        i8 = i9;
                    }
                    objT4 = ye5Var.p();
                    b0kVar3.s0(objT4);
                }
                int i15 = i7 >> 3;
                b0kVar2 = b0kVar3;
                uwo1.d((af5) objT4, j6, qim0Var5, lee1Var5, null, null, 0, false, null, 0, null, null, b0kVar2, ((i7 >> 12) & 112) | (i15 & 896) | (i15 & 7168), 0, 4080);
                j5 = j6;
                qim0Var3 = qim0Var5;
                lee1Var3 = lee1Var5;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
                lee1Var3 = lee1Var2;
                j5 = j3;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new bfe1(str, c380Var, iu30Var, qim0Var3, lee1Var3, j5, j4, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                lee1Var2 = lee1Var;
                if (b0kVar3.i(lee1Var2)) {
                }
                i3 |= i12;
            } else {
                lee1Var2 = lee1Var;
            }
            i3 |= i12;
        } else {
            lee1Var2 = lee1Var;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j3 = j;
                if (b0kVar3.f(j3)) {
                }
                i3 |= i13;
            } else {
                j3 = j;
            }
            i3 |= i13;
        } else {
            j3 = j;
        }
        if ((i & 1572864) == 0) {
            j4 = j2;
            if ((i2 & 64) == 0) {
                i10 = 524288;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        } else {
            j4 = j2;
        }
        i4 = i3;
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i4 & 1, z)) {
            b0kVar3.d0();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar4 = cbx.a;
                    lee1Var4 = cbx.d(b0kVar3).m;
                    i4 &= -57345;
                } else {
                    lee1Var4 = lee1Var2;
                }
                if ((i2 & 32) != 0) {
                    uwr uwrVar5 = cbx.a;
                    j6 = cbx.a(b0kVar3).b.b;
                    i4 &= -458753;
                } else {
                    j6 = j3;
                }
                if ((i2 & 64) != 0) {
                    uwr uwrVar6 = cbx.a;
                    j4 = cbx.a(b0kVar3).c.f;
                    qim0Var5 = qim0Var4;
                    i5 = i4 & (-3670017);
                    lee1Var5 = lee1Var4;
                } else {
                    qim0Var5 = qim0Var4;
                    lee1Var5 = lee1Var4;
                    i5 = i4;
                }
            } else {
                if (i11 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i2 & 16) != 0) {
                    uwr uwrVar7 = cbx.a;
                    lee1Var4 = cbx.d(b0kVar3).m;
                    i4 &= -57345;
                } else {
                    lee1Var4 = lee1Var2;
                }
                if ((i2 & 32) != 0) {
                    uwr uwrVar8 = cbx.a;
                    j6 = cbx.a(b0kVar3).b.b;
                    i4 &= -458753;
                } else {
                    j6 = j3;
                }
                if ((i2 & 64) != 0) {
                    uwr uwrVar9 = cbx.a;
                    j4 = cbx.a(b0kVar3).c.f;
                    qim0Var5 = qim0Var4;
                    i5 = i4 & (-3670017);
                    lee1Var5 = lee1Var4;
                } else {
                    qim0Var5 = qim0Var4;
                    lee1Var5 = lee1Var4;
                    i5 = i4;
                }
            }
            b0kVar3.s();
            ven0VarS = v8r.s(iu30Var, b0kVar3);
            i6 = i5 & 14;
            if (i6 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = z2;
            if ((i5 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z6 | z3;
            objT = b0kVar3.T();
            if (z4) {
                arrayList = new ArrayList();
                it = c380Var2.iterator();
                while (it.hasNext()) {
                    Iterator it5 = it;
                    next = it5.next();
                    int i16 = i5;
                    if (ihc1.h0(str, ((mae1) next).a, false)) {
                        arrayList.add(next);
                    }
                    it = it5;
                    i5 = i16;
                }
                i7 = i5;
                objT = o7h.a1(arrayList, new hzx0(str, (byte) 2));
                b0kVar3.s0(objT);
            } else {
                arrayList = new ArrayList();
                it = c380Var2.iterator();
                while (it.hasNext()) {
                    Iterator it6 = it;
                    next = it6.next();
                    int i17 = i5;
                    if (ihc1.h0(str, ((mae1) next).a, false)) {
                        arrayList.add(next);
                    }
                    it = it6;
                    i5 = i17;
                }
                i7 = i5;
                objT = o7h.a1(arrayList, new hzx0(str, (byte) 2));
                b0kVar3.s0(objT);
            }
            list = (List) objT;
            zG = b0kVar3.g(lee1Var5.a.f) | ((((i7 & 3670016) ^ 1572864) <= 1048576 && b0kVar3.f(j4)) || (i7 & 1572864) == 1048576);
            objT2 = b0kVar3.T();
            if (zG) {
                objT2 = new zma1(j4, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, lee1Var5.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61406);
                b0kVar3.s0(objT2);
            } else {
                objT2 = new zma1(j4, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, lee1Var5.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61406);
                b0kVar3.s0(objT2);
            }
            zma1Var = (zma1) objT2;
            zG2 = (i6 == 4) | b0kVar3.g(list);
            objT3 = b0kVar3.T();
            if (zG2) {
                List list4 = list;
                arrayList2 = new ArrayList(q7h.U(list4, 10));
                it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((mae1) it2.next()).a);
                }
                String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
                objT3 = ihc1.Q0(str, (String[]) Arrays.copyOf(strArr2, strArr2.length), 0, 6);
                b0kVar3.s0(objT3);
            } else {
                List list5 = list;
                arrayList2 = new ArrayList(q7h.U(list5, 10));
                it2 = list5.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((mae1) it2.next()).a);
                }
                String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                objT3 = ihc1.Q0(str, (String[]) Arrays.copyOf(strArr3, strArr3.length), 0, 6);
                b0kVar3.s0(objT3);
            }
            list2 = (List) objT3;
            zG3 = b0kVar3.g(list2) | b0kVar3.g(list) | b0kVar3.g(zma1Var);
            objT4 = b0kVar3.T();
            if (zG3) {
                ye5Var = new ye5();
                it3 = list2.iterator();
                i8 = 0;
                while (it3.hasNext()) {
                    next2 = it3.next();
                    i9 = i8 + 1;
                    if (i8 < 0) {
                        p7h.T();
                        throw null;
                    }
                    ye5Var.g((String) next2);
                    if (i8 < list.size()) {
                        mae1 mae1Var2 = (mae1) list.get(i8);
                        vhg.c(ye5Var, mae1Var2.a, mae1Var2.b, zma1Var, new ry71(ven0VarS, (byte) 16));
                    }
                    it3 = it3;
                    i8 = i9;
                }
                objT4 = ye5Var.p();
                b0kVar3.s0(objT4);
            } else {
                ye5Var = new ye5();
                it3 = list2.iterator();
                i8 = 0;
                while (it3.hasNext()) {
                    next2 = it3.next();
                    i9 = i8 + 1;
                    if (i8 < 0) {
                        p7h.T();
                        throw null;
                    }
                    ye5Var.g((String) next2);
                    if (i8 < list.size()) {
                        mae1 mae1Var3 = (mae1) list.get(i8);
                        vhg.c(ye5Var, mae1Var3.a, mae1Var3.b, zma1Var, new ry71(ven0VarS, (byte) 16));
                    }
                    it3 = it3;
                    i8 = i9;
                }
                objT4 = ye5Var.p();
                b0kVar3.s0(objT4);
            }
            int i18 = i7 >> 3;
            b0kVar2 = b0kVar3;
            uwo1.d((af5) objT4, j6, qim0Var5, lee1Var5, null, null, 0, false, null, 0, null, null, b0kVar2, ((i7 >> 12) & 112) | (i18 & 896) | (i18 & 7168), 0, 4080);
            j5 = j6;
            qim0Var3 = qim0Var5;
            lee1Var3 = lee1Var5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
            lee1Var3 = lee1Var2;
            j5 = j3;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bfe1(str, c380Var, iu30Var, qim0Var3, lee1Var3, j5, j4, i, i2);
        }
    }

    public static final Bitmap j(Bitmap bitmap, float f) {
        Bitmap bitmapCopy;
        if (f <= 0.0f || (bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true)) == null) {
            return bitmap;
        }
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            fArr[i] = i / 8.0f;
        }
        int[] iArr = new int[9];
        for (int i2 = 0; i2 < 9; i2++) {
            iArr[i2] = Color.argb(jch0.U(e4p1.k(fArr[i2]) * 255.0f), 0, 0, 0);
        }
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, iArr, fArr, Shader.TileMode.CLAMP));
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        new Canvas(bitmapCopy).drawRect(0.0f, 0.0f, bitmapCopy.getWidth(), bitmapCopy.getHeight(), paint);
        return bitmapCopy;
    }

    public static void k(int i, Object obj) {
        if (obj != null) {
            return;
        }
        bhn0.i(f4i1.c(i, "at index "));
    }

    public static void l(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            k(i2, objArr[i2]);
        }
    }

    public static void m(Object... objArr) {
        l(objArr.length, objArr);
    }

    public static final Observable n(zf30 zf30Var, dar0 dar0Var, th30 th30Var, Observable observable, yun0 yun0Var, axn0 axn0Var) {
        return Observable.combineLatest(Observable.create(new sp00(zf30Var, yun0Var, axn0Var, th30Var, (byte) 16)), observable, dar0Var.a(), wdu0.N0).distinctUntilChanged();
    }

    public static final Rect o(View view, ViewGroup viewGroup) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        return rect;
    }

    public static final y6b1 p(String str) {
        try {
            y6b1 y6b1Var = new y6b1(str, false);
            if (y6b1Var.c == v6b1.T0) {
                return y6b1Var;
            }
            return null;
        } catch (SpotifyUriParserException unused) {
            return null;
        }
    }

    public static Object[] q(int i, Object[] objArr) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i);
    }

    public static rrk0 r() {
        r6h1 r6h1Var = r6h1.c;
        return new rrk0((byte) 6);
    }
}
