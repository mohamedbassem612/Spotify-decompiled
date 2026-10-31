package p;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.icu.text.BreakIterator;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class vno1 {
    public static final gn10 a = new gn10("video-preview-carousel-npv-scroll");
    public static b180 b;

    public static final void a(v3d v3dVar, ur80 ur80Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        int i3 = v3dVar.c;
        int i4 = v3dVar.b;
        int i5 = ur80Var.b;
        int i6 = ur80Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(666365168);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(v3dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(ur80Var) ? 32 : 16;
        }
        int i7 = i2 | 384;
        if (!x340Var.Y(i7 & 1, (i7 & 147) != 146)) {
            x340Var.b0();
            qim0Var2 = qim0Var;
        } else {
            if (ur80Var.e()) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new rc60(v3dVar, ur80Var, i, (byte) 0);
                    return;
                }
                return;
            }
            Rect rect = v3dVar.a;
            if (rect.isEmpty() || i4 == 0 || i3 == 0) {
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new rc60(v3dVar, ur80Var, i, (byte) 1);
                    return;
                }
                return;
            }
            wat watVar = (wat) x340Var.k(t4k.h);
            float fX0 = watVar.X0(8.0f);
            float fX1 = watVar.X0(8.0f);
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).c.c;
            float fD = ur80Var.d() / i4;
            float fB = ur80Var.b() / i3;
            float f = i6;
            float f2 = ((rect.left * fD) + f) - fX0;
            float f3 = i5;
            float f4 = ((rect.top * fB) + f3) - fX0;
            float f5 = fX0 * 2.0f;
            float fWidth = (rect.width() * fD) + f5;
            float fHeight = (rect.height() * fB) + f5;
            float fMax = Math.max(f2, f);
            float fMax2 = Math.max(f4, f3);
            float fMin = Math.min(f2 + fWidth, ur80Var.c) - fMax;
            float fMin2 = Math.min(f4 + fHeight, ur80Var.d) - fMax2;
            if (fMin <= 0.0f || fMin2 <= 0.0f) {
                h311 h311VarV3 = x340Var.v();
                if (h311VarV3 != null) {
                    h311VarV3.d = new rc60(v3dVar, ur80Var, i, (byte) 2);
                    return;
                }
                return;
            }
            mic0 mic0VarS = v9c.s(p7h.M(new u7h[]{new u7h(j), new u7h(u7h.b(j, 0.0f, 0.0f, 0.0f, 0.0f, 14))}), fMax2, fMax2 + fMin2, 8);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            boolean zI = x340Var.i(mic0VarS) | x340Var.d(fMax) | x340Var.d(fMax2) | x340Var.d(fMin) | x340Var.d(fMin2) | x340Var.d(fX1);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                sc60 sc60Var = new sc60(mic0VarS, fMax, fMax2, fMin, fMin2, fX1, (byte) 0);
                x340Var.s0(sc60Var);
                objT = sc60Var;
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarD);
            qim0Var2 = qim0Var3;
        }
        h311 h311VarV4 = x340Var.v();
        if (h311VarV4 != null) {
            h311VarV4.d = new ze10(v3dVar, ur80Var, qim0Var2, i, (byte) 29);
        }
    }

    public static final void b(int i, j2i j2iVar, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-709502251);
        if (x340Var.Y(i & 1, (i & 3) != 2)) {
            kiv kivVar = pd41.a;
            nd41 nd41Var = (nd41) x340Var.k(kivVar);
            ld41 ld41VarG = sgc1.G(x340Var);
            Object[] objArr = {nd41Var};
            df41 df41Var = new df41(new gub0(nd41Var, ld41VarG, (byte) 0), new n75((byte) 28));
            boolean zI = x340Var.i(nd41Var) | x340Var.i(ld41VarG);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new qga0(nd41Var, ld41VarG, (byte) 4);
                x340Var.s0(objT);
            }
            hub0 hub0Var = (hub0) k5p1.u(objArr, df41Var, (Function0) objT, x340Var, 0);
            mod.b(kivVar.a(hub0Var), apo.r(-412824043, new f14(j2iVar, hub0Var, (byte) 19), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ai3(j2iVar, i, (byte) 2);
        }
    }

    public static final void c(b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1623541462);
        if (b0kVar3.Y(i & 1, i != 0)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(nim0.a, 1.0f), new uvx(1, (pgx) null, 3, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 490), null, false, null, null, null, null, null, uni.c, null, uni.d, null, null, null, uni.e, b0kVar2, 805306438, 196656, 30204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new htu(i, (byte) 23);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(ctf ctfVar, String str, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        String strO0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1282013886);
        int i2 = i | (x340Var.i(ctfVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zS = ((add) x340Var.k(ade0.c)).s();
            String strO1 = cwl1.o0(x340Var, zS ? 2131953650 : 2131953649);
            if (ctfVar.equals(atf.a)) {
                x340Var.i0(640284020);
                strO0 = cwl1.n0(zS ? 2131953646 : 2131953645, new Object[]{str}, x340Var);
                x340Var.r(false);
            } else {
                if (!(ctfVar instanceof btf)) {
                    throw p3d1.k(x340Var, 640282795, false);
                }
                x340Var.i0(640291872);
                strO0 = cwl1.o0(x340Var, zS ? 2131953648 : 2131953647);
                x340Var.r(false);
            }
            String str2 = strO0;
            String strO2 = cwl1.o0(x340Var, R.string.ok);
            String strO3 = cwl1.o0(x340Var, 2131953644);
            if (ihc1.y0(strO2)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            zgx zgxVar = new zgx(strO2, new gbx(new y50(strO2), function0));
            if (ihc1.y0(strO3)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            mqo1.d(function0, null, null, strO1, str2, zgxVar, new zgx(strO3, new gbx(new y50(strO3), function0)), x340Var, 2359302, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvg0(ctfVar, str, function0, i, (byte) 10);
        }
    }

    public static final void e(String str, rb61 rb61Var, qim0 qim0Var, boolean z, hux huxVar, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-80648623);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.e(rb61Var.ordinal()) ? 32 : 16) | 384 | (x340Var.h(z) ? 2048 : 1024) | (x340Var.i(huxVar) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            uwr uwrVar = cbx.a;
            zsc zscVar = zex.a;
            boolean zG = x340Var.g(zscVar);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                long j = u7h.j;
                u7h u7hVar = new u7h(j);
                vex vexVar = (vex) zscVar.b;
                objT = p7h.M(new u7h[]{u7hVar, new u7h(u7h.b(vexVar.b, 0.8f, 0.0f, 0.0f, 0.0f, 14)), new u7h(vexVar.b), new u7h(u7h.b(vexVar.b, 0.8f, 0.0f, 0.0f, 0.0f, 14)), new u7h(j)});
                x340Var.s0(objT);
            }
            List list = (List) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = c97.b(0.0f);
                x340Var.s0(objT2);
            }
            o95 o95Var = (o95) objT2;
            boolean zI = x340Var.i(o95Var) | ((i2 & 112) == 32);
            Object objT3 = x340Var.T();
            if (zI || objT3 == obj) {
                objT3 = new w621(rb61Var, o95Var, (lnm) null, (byte) 4);
                x340Var.s0(objT3);
            }
            qxd0.t(rb61Var, x340Var, (vu30) objT3);
            gfx.b(rb61Var == rb61.b ? 6 : 1, apo.r(-156564282, new uu(rb61Var, list, o95Var, function0, str, huxVar, z), x340Var), x340Var, 48);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(str, (Object) rb61Var, qim0Var2, z, (Object) huxVar, (cv30) function0, i, (byte) 25);
        }
    }

    public static final void f(float f, float f2, float f3, b0k b0kVar, int i, int i2) {
        float f4;
        int i3;
        float f5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1671820022);
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 = i | 384;
            f4 = f3;
        } else if ((i & 384) == 0) {
            f4 = f3;
            i3 = (x340Var.d(f4) ? 256 : 128) | i;
        } else {
            f4 = f3;
            i3 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            float f6 = i4 != 0 ? 0.0f : f4;
            qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, f6, 0.0f, 0.0f, 13);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarB, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
            f5 = f6;
        } else {
            x340Var.b0();
            f5 = f4;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h010(f, f2, f5, i, i2);
        }
    }

    public static final void g(Function0 function0, b0k b0kVar, int i) {
        h311 h311VarV;
        h621 h621Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2022972426);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                scx scxVarM = pno1.m(x340Var);
                Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                boolean zI = x340Var.i(ven0Var) | ((i2 & 14) == 4);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new swi0(function0, ven0Var, (byte) 20);
                    x340Var.s0(objT2);
                }
                x74.f((Function0) objT2, scxVarM, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(1250269941, new p8e1(ven0Var, function0, context, (byte) 4), x340Var), x340Var, 12582912, 48, 1916);
            } else {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    h621Var = new h621(function0, i, (byte) 21);
                }
            }
            h311VarV.d = h621Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h621Var = new h621(function0, i, (byte) 22);
            h311VarV.d = h621Var;
        }
    }

    public static final void h(Context context, SpannableString spannableString, int i, int i2) {
        Drawable drawable = context.getDrawable(2131232474);
        if (drawable != null) {
            drawable.setTint(context.getColor(2131101181));
            drawable.setBounds(0, 0, 24, 24);
            spannableString.setSpan(new ImageSpan(drawable, Build.VERSION.SDK_INT >= 29 ? 2 : 1), i, i2, 18);
        }
    }

    public static final void i(Context context, SpannableString spannableString, int i, int i2) {
        Drawable drawable = context.getDrawable(2131231790);
        if (drawable != null) {
            drawable.setTint(context.getColor(2131101181));
            drawable.setBounds(0, 0, 24, 24);
            spannableString.setSpan(new ImageSpan(drawable, Build.VERSION.SDK_INT >= 29 ? 2 : 1), i, i2, 18);
        }
    }

    public static int j(float f, int i) {
        return uah.i(Color.argb((int) (f * 255.0f), 0, 0, 0), i);
    }

    public static vdn k() {
        vdn vdnVar = new vdn();
        vdnVar.a = "";
        vdnVar.b = null;
        vdnVar.c = null;
        vdnVar.d = null;
        return vdnVar;
    }

    public static final int l(String str) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.ROOT);
        characterInstance.setText(str);
        int i = 0;
        while (characterInstance.next() != -1) {
            i++;
        }
        return i;
    }

    public static final wtw m(tf51 tf51Var) {
        if (tf51Var instanceof hsw) {
            hsw hswVar = (hsw) tf51Var;
            mr20 show = hswVar.getShow();
            mr20 mr20VarG = hswVar.g();
            maa maaVar = (maa) hswVar.d().c.invoke();
            j2i j2iVar = hswVar.d().a;
            if (j2iVar == null) {
                j2iVar = uni.a;
            }
            return new wtw(show, mr20VarG, new xtw(maaVar, j2iVar, hswVar.d().b));
        }
        if (tf51Var instanceof vek1) {
            vek1 vek1Var = (vek1) tf51Var;
            return new wtw(vek1Var.getShow(), new huz(Boolean.FALSE, (byte) 10), new xtw(new e27(vek1Var), uni.f, uni.g));
        }
        if (!(tf51Var instanceof prj0)) {
            eg.o();
            return null;
        }
        prj0 prj0Var = (prj0) tf51Var;
        mr20 show2 = prj0Var.getShow();
        huz huzVar = new huz(Boolean.FALSE, (byte) 10);
        maa maaVar2 = (maa) prj0Var.d().c.invoke();
        j2i j2iVar2 = prj0Var.d().a;
        if (j2iVar2 == null) {
            j2iVar2 = uni.b;
        }
        return new wtw(show2, huzVar, new xtw(maaVar2, j2iVar2, prj0Var.d().b));
    }

    public static final void n(Context context, SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(new l0e1(context, 2132018079, -1), i, i2, 33);
    }

    public static final ga80 o(hw61 hw61Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        jy20 jy20Var = (jy20) x340Var.k(ky20.a);
        uwr uwrVar = cbx.a;
        avw0 avw0Var = cbx.b(x340Var).c;
        boolean zD = ((((i & 14) ^ 6) > 4 && x340Var.g(hw61Var)) || (i & 6) == 4) | x340Var.d(2.0f) | x340Var.g(jy20Var);
        Object objT = x340Var.T();
        if (zD || objT == fkj0.X) {
            jy20Var.getClass();
            objT = new iy20(ll20.c1, hw61Var, (p3v) null);
            x340Var.s0(objT);
        }
        return (ga80) objT;
    }

    public static final String p(int i) {
        switch (l1d.C(i)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return "show";
            case 1:
                return "album";
            case 2:
                return "episode";
            case 3:
                return "segment";
            case 4:
                return "work";
            case 5:
                return "audiobook_series";
            case 6:
                return "music_video_prerelease";
            default:
                eg.o();
                return null;
        }
    }

    public static final boolean q(o0d0 o0d0Var, j7e0 j7e0Var) {
        if ((o0d0Var instanceof l0d0) && u890.j(((l0d0) o0d0Var).a, j7e0Var.c)) {
            return true;
        }
        return (o0d0Var instanceof n0d0) && ((n0d0) o0d0Var).a.equals(j7e0Var.b);
    }

    public static void r(Object[] objArr) {
        for (int i = 0; i < 1; i++) {
            if (objArr[i] == null) {
                bhn0.i(f4i1.c(i, "at index "));
                return;
            }
        }
    }
}
