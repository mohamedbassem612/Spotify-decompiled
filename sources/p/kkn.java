package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class kkn implements okn {
    public static final h7h b = new h7h(false, false);
    public static b180 c;
    public static b180 d;
    public final /* synthetic */ byte a;

    public static final long A(long j, long j2) {
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? t(j) : z(j, j2);
        }
        if (j != j2) {
            return jfv.w(t(j2));
        }
        ytw0 ytw0Var = jfv.b;
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(Intent intent, DisplayMetrics displayMetrics, ffe1 ffe1Var, cn3 cn3Var, Uri uri, onm onmVar) {
        hv91 hv91Var;
        if (onmVar instanceof hv91) {
            hv91Var = (hv91) onmVar;
            int i = hv91Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hv91Var.f = i - Integer.MIN_VALUE;
            } else {
                hv91Var = new hv91(onmVar);
            }
        } else {
            hv91Var = new hv91(onmVar);
        }
        Object objC = hv91Var.e;
        int i2 = hv91Var.f;
        if (i2 == 0) {
            hm5.M(objC);
            hv91Var.a = intent;
            hv91Var.b = displayMetrics;
            hv91Var.c = cn3Var;
            hv91Var.d = uri;
            hv91Var.f = 1;
            objC = uri == null ? ffe1Var.c(hv91Var) : uri;
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri = hv91Var.d;
            cn3Var = hv91Var.c;
            displayMetrics = hv91Var.b;
            intent = hv91Var.a;
            hm5.M(objC);
        }
        Uri uri2 = (Uri) objC;
        mmr0 mmr0Var = uri == null ? gv91.p : gv91.o;
        if (uri2 != null) {
            if (uri == null) {
                cn3Var.b(intent, new Uri[]{uri2});
            }
            try {
                double d2 = ((double) displayMetrics.widthPixels) * 0.8d;
                double d3 = ((double) displayMetrics.heightPixels) * 0.4d;
                vga0 vga0Var = new vga0();
                j9k1.z(vga0Var, "posX", (Number) mmr0Var.a);
                j9k1.z(vga0Var, "posY", (Number) mmr0Var.b);
                j9k1.z(vga0Var, "rotation", new Integer(0));
                j9k1.z(vga0Var, "width", new Double(d2));
                j9k1.z(vga0Var, "height", new Double(d3));
                j9k1.A(vga0Var, "uri", uri2.toString());
                intent.putExtra("sticker", vga0Var.a().toString()).getClass();
            } catch (Exception e) {
                Logger.d(e.getMessage(), new Object[0]);
            }
        }
        return rih1.a;
    }

    public static x7f1 C(long j, long j2, long j3, long j4, long j5, b0k b0kVar, int i) {
        return p((dah) ((x340) b0kVar).k(eah.a)).a(j, (i & 2) != 0 ? u7h.k : j2, (i & 4) != 0 ? u7h.k : j3, (i & 8) != 0 ? u7h.k : j4, (i & 16) != 0 ? u7h.k : j5, u7h.k);
    }

    public static final ox30 D(ox30 ox30Var, bpo bpoVar, s69 s69Var) {
        switch (bpoVar.ordinal()) {
            case 6:
            case 7:
                return ox30.a(ox30Var, s69Var, (s69) null, (s69) null, 6);
            case 8:
            case 9:
                return ox30.a(ox30Var, (s69) null, s69Var, (s69) null, 5);
            case 10:
            case 11:
                return ox30.a(ox30Var, (s69) null, (s69) null, s69Var, 3);
            default:
                return ox30Var;
        }
    }

    public static final void a(fxl fxlVar, eyh0 eyh0Var, v1r0 v1r0Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-988187955);
        int i2 = i | (x340Var.i(fxlVar) ? 4 : 2) | (x340Var.i(eyh0Var) ? 32 : 16) | (x340Var.i(v1r0Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float f = fxlVar.a.a;
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(j9k1.x(u291.f(anm1.N("agnostic_content_layer", qim0Var3), 1.0f), new yy2((byte) 0, f)), u7h.b, d4o1.a);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            boolean zG = x340Var.g(eyh0Var) | x340Var.g(v1r0Var);
            Object objT = x340Var.T();
            Object obj = objT;
            if (zG || objT == m4cVar) {
                dvs dvsVar = new dvs(((xfx) ((fwo) eyh0Var.b).get()).c.b);
                dvsVar.q(((k2p0) ((kly0) eyh0Var.c).get()).a(vy2.a, v1r0Var, pzo0.f));
                t6 t6Var = new t6(context, eyh0Var, dvsVar, (byte) 9);
                FrameLayout frameLayout = new FrameLayout(context);
                View view = new View(context);
                view.setId(2131427919);
                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 0, 48));
                View view2 = new View(context);
                view2.setId(2131427918);
                frameLayout.addView(view2, new FrameLayout.LayoutParams(-1, 0, 80));
                frameLayout.addView((View) t6Var.invoke(frameLayout), -1, -1);
                x340Var.s0(frameLayout);
                obj = frameLayout;
            }
            View view3 = (View) obj;
            boolean zI = x340Var.i(view3);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new xy2(view3, (byte) 0);
                x340Var.s0(objT2);
            }
            dm5.a((iu30) objT2, u291.d(qim0Var3, 1.0f), (iu30) null, x340Var, 0, 4);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, fxlVar, eyh0Var, v1r0Var, qim0Var2, (byte) 24);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void b(olb olbVar, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        int i3 = olbVar.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1160826792);
        int i4 = (i & 6) == 0 ? (x340Var.g(olbVar) ? 4 : 2) | i : i;
        if (x340Var.Y(i4 & 1, (i4 & 3) != 2)) {
            x340Var.i0(1893765960);
            StringBuilder sb = new StringBuilder();
            sb.append(cwl1.o0(x340Var, 2131952593));
            List<String> list = olbVar.d;
            String str = olbVar.b;
            if (i3 != 3) {
                sb.append(" • ");
            }
            int iC = l1d.C(i3);
            if (iC == 0) {
                x340Var.i0(-1607047405);
                sb.append(cwl1.o0(x340Var, 2131952597));
                x340Var.r(false);
            } else if (iC == 1) {
                x340Var.i0(-1607044367);
                sb.append(cwl1.o0(x340Var, 2131952592));
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var, -1607049348, false);
                }
                x340Var.i0(-1607041478);
                x340Var.r(false);
            }
            sb.append("\n");
            sb.append(cwl1.n0(2131952596, new Object[]{olbVar.c}, x340Var));
            if (ihc1.y0(str)) {
                x340Var.i0(1721593420);
                x340Var.r(false);
            } else {
                x340Var.i0(1721479061);
                sb.append("\n");
                sb.append(cwl1.n0(2131952595, new Object[]{str}, x340Var));
                x340Var.r(false);
            }
            if (!list.isEmpty()) {
                sb.append("\n");
                for (String str2 : list) {
                    sb.append("\n");
                    sb.append(str2);
                }
            }
            String string = sb.toString();
            x340Var.r(false);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            int iOrdinal = ((flb0) x340Var.k(t4k.n)).ordinal();
            if (iOrdinal == 0) {
                i2 = 1;
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return;
                }
                i2 = 2;
            }
            lee1 lee1VarA = lee1.a(lee1Var, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, i2, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16711679);
            long j = cbx.a(x340Var).b.b;
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(string, anm1.N("audiobook_details_element", uyn1.z(16.0f, 0.0f, 2, qim0VarF)), lee1VarA, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new du0(olbVar, i, (byte) 7);
        }
    }

    public static final void c(ffk ffkVar, iu30 iu30Var, aod0 aod0Var, qim0 qim0Var, yqg yqgVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(413258637);
        int i2 = i | (b0kVar3.i(ffkVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(aod0Var) ? 256 : 128) | 3072 | (b0kVar3.g(yqgVar) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(16.0f, 8.0f, 0.0f, 8.0f);
            tvx tvxVarB = gto1.B(1, b0kVar3, 3);
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            uvx uvxVar = new uvx(0, (pgx) null, 2, zzq0Var, (zzq0) null, tvx.a(tvxVarB, 2.0f, 6), (hw61) null, 1, new p3v(48.0f), 83);
            boolean z = ((i2 & 57344) == 16384) | ((i2 & 112) == 32);
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new sn8(iu30Var, yqgVar, (byte) 2);
                b0kVar3.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0("Navigate to concert")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50("Navigate to concert"), function0), (gbx) null, (xu30) null, apo.r(-2120494026, new gfk(ffkVar, (byte) 0), b0kVar3), (xu30) null, apo.r(779063125, new gfk(ffkVar, (byte) 1), b0kVar3), apo.r(2073481972, new e6j(ffkVar, aod0Var, (byte) 4), b0kVar3), (xu30) null, (xu30) null, apo.r(1661771217, new gfk(ffkVar, (byte) 2), b0kVar3), b0kVar2, 805306432, 197040, 26044);
                qim0Var2 = qim0Var3;
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sxj((byte) 5, i, ffkVar, iu30Var, aod0Var, qim0Var2, yqgVar);
        }
    }

    public static final void d(ArrayList arrayList, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-963597532);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            k5p1.d(qim0VarF, new d36(4.0f, true, new um5(false)), (g36) null, (pl3) null, 0, 0, apo.r(1764410015, new hf50(arrayList, (byte) 2), x340Var), x340Var, 1572864, 60);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x6w0(arrayList, i, (byte) 0);
        }
    }

    public static final void e(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1932799527);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Uri uri = Uri.parse(str == null ? "" : str);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(6.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarQ = i1p1.q(qim0Var3, cr31VarB);
            box boxVar = box.c;
            eso1.e(uri, isl.a, qim0VarQ, new p3v(120.0f), null, null, null, null, null, new nux(boxVar, boxVar), false, false, x340Var, 1073766448, 0, 3552);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var2, i, (byte) 16);
        }
    }

    public static final void f(w6w0 w6w0Var, s8w0 s8w0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-220061925);
        int i2 = (i & 6) == 0 ? (b0kVar3.i(w6w0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(s8w0Var) : b0kVar3.i(s8w0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            e9w0 e9w0Var = w6w0Var.a.a;
            String str = e9w0Var.l;
            String strN0 = null;
            o8w0 o8w0Var = str != null ? new o8w0(e9w0Var.a, str) : null;
            ArrayList arrayList = e9w0Var.i;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof h9w0) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                r7h.W(((h9w0) it.next()).c, arrayList3);
            }
            ArrayList arrayList4 = !arrayList3.isEmpty() ? arrayList3 : null;
            if (arrayList4 == null) {
                b0kVar3.i0(-1744226131);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1744226130);
                Object objT = b0kVar3.T();
                if (objT == fkj0.X) {
                    objT = xuv0.c1;
                    b0kVar3.s0(objT);
                }
                strN0 = cwl1.n0(2131952915, new Object[]{o7h.y0(arrayList4, ", ", (String) null, (String) null, (iu30) objT, 30)}, b0kVar3);
                b0kVar3.r(false);
            }
            ArrayList arrayListO0 = o7h.o0(p7h.M(new String[]{e9w0Var.b.concat("."), e9w0Var.c, strN0}));
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : arrayListO0) {
                if (!ihc1.y0((String) obj2)) {
                    arrayList5.add(obj2);
                }
            }
            j2i j2iVarR = apo.r(698743726, new q3(o7h.y0(arrayList5, " ", (String) null, (String) null, (iu30) null, 62), o8w0Var, cwl1.o0(b0kVar3, w6w0Var.b ? 2131952929 : 2131952928), iu30Var, ef.b(b0kVar3).a(), e9w0Var, arrayList3, s8w0Var), b0kVar3);
            b0kVar2 = b0kVar3;
            nyx.a(0, (wux) null, j2iVarR, b0kVar2, 3072, 7);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lzs0(w6w0Var, s8w0Var, iu30Var, qim0Var2, i, (byte) 9);
        }
    }

    public static final void g(e9w0 e9w0Var, ArrayList arrayList, o8w0 o8w0Var, s8w0 s8w0Var, qim0 qim0Var, b0k b0kVar, int i) {
        Function0 function0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(947768200);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(e9w0Var) ? 4 : 2) | (x340Var.g(arrayList) ? 32 : 16) | (x340Var.g(o8w0Var) ? 256 : 128) | (x340Var.i(s8w0Var) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(h36.g, eraVar, x340Var, 0);
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
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
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
            mbh mbhVarA2 = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            String str = e9w0Var.c;
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            if (arrayList.isEmpty()) {
                x340Var.i0(-663852506);
                x340Var.r(false);
            } else {
                x340Var.i0(-663973592);
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 4.0f));
                d(arrayList, x340Var, (i2 >> 3) & 14);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            fra fraVar = een.N0;
            cvx cvxVar3 = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE3, lljVar4, 1.0f, true);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, wnb0VarQ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            if (o8w0Var != null) {
                x340Var.i0(-2092488477);
                otw.c(s8w0Var, o8w0Var, (qim0) null, (ipb1) null, x340Var, ((i2 >> 9) & 14) | 8 | ((i2 >> 3) & 112), 12);
                x340Var.r(false);
            } else {
                x340Var.i0(-2092404870);
                x340Var.r(false);
            }
            x340Var.r((boolean) r13);
            plx plxVar = plx.c;
            long j = cbx.a(x340Var).b.b;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(plxVar, isl.a, u291.r(nim0Var, 16.0f), j, 0L, false, x340Var, plx.d | 48, 48);
            x340Var = x340Var;
            x340Var.r((boolean) r13);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 26, i, e9w0Var, arrayList, o8w0Var, s8w0Var, qim0Var);
        }
    }

    public static final iy61 h(qa90 qa90Var) {
        return qa90Var.g == null ? gy61.a : hy61.a;
    }

    public static x7f1 l(long j, long j2, long j3, b0k b0kVar, int i) {
        long j4 = u7h.k;
        long j5 = (i & 4) != 0 ? j4 : j2;
        long j6 = (i & 8) != 0 ? j4 : j3;
        x7f1 x7f1VarP = p((dah) ((x340) b0kVar).k(eah.a));
        return x7f1VarP.a(j, j4, j5, j6, j4, x7f1VarP.f);
    }

    public static final boolean m(String str, String str2) {
        return u890.j(str, str2);
    }

    public static on00 n(b8f1 b8f1Var, b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == m4cVar) {
            objT = new ya4((byte) 9);
            x340Var.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        n8b1 n8b1VarW = t890.w(b0kVar, 4);
        e9r e9rVarA = wxa1.a(b0kVar);
        boolean zG = ((x340) b0kVar).g(b8f1Var) | ((x340) b0kVar).g(function0);
        x340 x340Var2 = (x340) b0kVar;
        boolean zG2 = zG | x340Var2.g(n8b1VarW) | x340Var2.g(e9rVarA);
        Object objT2 = x340Var2.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = new on00(b8f1Var, n8b1VarW, e9rVarA, function0);
            x340Var2.s0(objT2);
        }
        return (on00) objT2;
    }

    public static x7f1 p(dah dahVar) {
        x7f1 x7f1Var = dahVar.Z;
        if (x7f1Var != null) {
            return x7f1Var;
        }
        x7f1 x7f1Var2 = new x7f1(eah.d(dahVar, 35), eah.d(dahVar, 37), eah.d(dahVar, 18), eah.d(dahVar, 18), eah.d(dahVar, 19), eah.d(dahVar, 19));
        dahVar.Z = x7f1Var2;
        return x7f1Var2;
    }

    public static int s(String str) {
        return str.hashCode();
    }

    public static final long t(long j) {
        if (j < 0) {
            ytw0 ytw0Var = jfv.b;
            return jfv.d;
        }
        ytw0 ytw0Var2 = jfv.b;
        return jfv.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(kj31 kj31Var, ti31 ti31Var, String str, onm onmVar) {
        vi31 vi31Var;
        if (onmVar instanceof vi31) {
            vi31Var = (vi31) onmVar;
            int i = vi31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vi31Var.c = i - Integer.MIN_VALUE;
            } else {
                vi31Var = new vi31(onmVar);
            }
        } else {
            vi31Var = new vi31(onmVar);
        }
        Object objS = vi31Var.b;
        int i2 = vi31Var.c;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objS);
            vi31Var.a = kj31Var;
            vi31Var.c = 1;
            objS = smo1.s(new m311(ti31Var, str, lnmVar, (byte) 22), vi31Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kj31Var = vi31Var.a;
            hm5.M(objS);
        }
        oi31 oi31Var = (oi31) objS;
        if (oi31Var != null) {
            return kj31Var.a(oi31Var);
        }
        return null;
    }

    public static k2t0 v(b8f1 b8f1Var, b0k b0kVar) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        if (objT == m4cVar) {
            objT = new ya4((byte) 9);
            x340Var.s0(objT);
        }
        Function0 function0 = (Function0) objT;
        boolean zG = ((x340) b0kVar).g(b8f1Var) | ((x340) b0kVar).g(function0);
        x340 x340Var2 = (x340) b0kVar;
        Object objT2 = x340Var2.T();
        if (zG || objT2 == m4cVar) {
            objT2 = new k2t0(b8f1Var, function0);
            x340Var2.s0(objT2);
        }
        return (k2t0) objT2;
    }

    public static final ox30 w(ox30 ox30Var, bpo bpoVar, s69 s69Var) {
        switch (bpoVar.ordinal()) {
            case 6:
            case 7:
                s69 s69Var2 = ox30Var.a;
                if (s69Var2 != null) {
                    s69Var = s69Var2;
                }
                return ox30.a(ox30Var, s69Var, (s69) null, (s69) null, 6);
            case 8:
            case 9:
                s69 s69Var3 = ox30Var.b;
                if (s69Var3 != null) {
                    s69Var = s69Var3;
                }
                return ox30.a(ox30Var, (s69) null, s69Var, (s69) null, 5);
            case 10:
            case 11:
                s69 s69Var4 = ox30Var.c;
                if (s69Var4 != null) {
                    s69Var = s69Var4;
                }
                return ox30.a(ox30Var, (s69) null, (s69) null, s69Var, 3);
            default:
                return ox30Var;
        }
    }

    public static final long x(long j, long j2) {
        ngv ngvVar = ngv.b;
        long jU = jfv.u(j2, ngvVar);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            if (!jfv.n(j2) || (j ^ jU) >= 0) {
                return j;
            }
            hhg1.n("Summing infinities of different signs");
            return 0L;
        }
        if (((jU - 1) | 1) == Long.MAX_VALUE) {
            long jE = jfv.e(j2);
            long jU2 = jfv.u(jE, ngvVar);
            return (1 | (jU2 - 1)) == Long.MAX_VALUE ? jU2 : x(x(j, jE), jfv.p(j2, jE));
        }
        long j3 = j + jU;
        if (((jU ^ j3) & (j ^ j3)) < 0) {
            return j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return j3;
    }

    public static final long y(long j, long j2) {
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? jfv.w(t(j2)) : z(j, j2);
    }

    public static final long z(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        ngv ngvVar = ngv.b;
        if (j4 >= 0) {
            return fdg1.l0(j3, ngvVar);
        }
        ngv ngvVar2 = ngv.d;
        if (ngvVar.compareTo(ngvVar2) >= 0) {
            return jfv.w(t(j3));
        }
        long jX = fj30.x(1L, ngvVar2, ngvVar);
        long j5 = (j / jX) - (j2 / jX);
        long j6 = (j % jX) - (j2 % jX);
        ytw0 ytw0Var = jfv.b;
        return jfv.q(fdg1.l0(j5, ngvVar2), fdg1.l0(j6, ngvVar));
    }

    public abstract boolean i(int i, int i2);

    public abstract boolean j(int i, int i2);

    public ln41 k() {
        if (this instanceof s9m0) {
            return new jn41(((s9m0) this).e);
        }
        return this instanceof w9m0 ? new jn41(((w9m0) this).e) : kn41.a;
    }

    public Object o(int i, int i2) {
        return null;
    }

    public abstract int q();

    public abstract int r();

    public String toString() {
        switch (this.a) {
            case 11:
                if (this instanceof u9m0) {
                    return "NotInitialized";
                }
                if (this instanceof t9m0) {
                    return "Initializing";
                }
                if (this instanceof s9m0) {
                    return "Initialized";
                }
                if (this instanceof w9m0) {
                    return "WaitingForShutdownHooks";
                }
                if (this instanceof v9m0) {
                    return "ShuttingDown";
                }
                eg.o();
                return null;
            default:
                return super.toString();
        }
    }
}
