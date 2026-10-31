package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class don1 {
    public static final m3d0 a = new m3d0("originalIndex", true);
    public static b180 b;

    public static mr20 A(mr20 mr20Var, wsc0 wsc0Var) {
        List list = wsc0Var.e;
        if (list.isEmpty()) {
            return new huz(b7x.a, (byte) 10);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return hu20.e(mr20Var, new ekv(new lu2(o7h.p1(arrayList), (byte) 1), dkv.b, (lnm) null));
            }
            zuc0 zuc0Var = (zuc0) it.next();
            iey0 iey0Var = f7p1.m(zuc0Var.c) ? null : new iey0(zuc0Var.c);
            if (iey0Var != null) {
                arrayList.add(iey0Var);
            }
        }
    }

    public static final lvl0 B(urk0 urk0Var, o2z o2zVar) {
        d8r0 d8r0Var = o2zVar.m;
        return new lvl0(new mjl0(new mjl0(urk0Var, d8r0Var.b, d8r0Var.a, d8r0Var.e), d8r0Var.d), o2zVar.l, (byte) 3);
    }

    public static final Bitmap C(int i, Bitmap bitmap) {
        int iMin = Math.min(i / bitmap.getWidth(), i / bitmap.getHeight());
        if (iMin <= 0) {
            hhg1.n("Failed requirement.");
            return null;
        }
        int width = bitmap.getWidth() * iMin;
        int height = bitmap.getHeight() * iMin;
        int i2 = (i - width) / 2;
        int i3 = (i - height) / 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(-1);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rect = new Rect(i2, i3, width + i2, height + i3);
        Paint paint = new Paint();
        paint.setFilterBitmap(false);
        canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        return bitmapCreateBitmap;
    }

    public static final ia00 D(inx0 inx0Var) {
        return n3o1.q(inx0Var).a(cnx0.c, cnx0.d);
    }

    public static final void E(x4t x4tVar, Object obj, iu30 iu30Var) {
        jdo0 jdo0Var;
        if (!((pim0) x4tVar).a.N0) {
            qf80.c("visitAncestors called on an unattached node");
        }
        pim0 pim0Var = ((pim0) x4tVar).a.e;
        hmb0 hmb0VarB = oap1.B(x4tVar);
        while (hmb0VarB != null) {
            if ((((pim0) hmb0VarB.e1.g).d & 262144) != 0) {
                while (pim0Var != null) {
                    if ((pim0Var.c & 262144) != 0) {
                        pim0 pim0VarS = pim0Var;
                        bfn0 bfn0Var = null;
                        while (pim0VarS != null) {
                            if (pim0VarS instanceof dpg1) {
                                dpg1 dpg1Var = (dpg1) pim0VarS;
                                if (!(obj.equals(dpg1Var.n()) ? ((Boolean) iu30Var.invoke(dpg1Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((pim0VarS.c & 262144) != 0 && (pim0VarS instanceof l5t)) {
                                int i = 0;
                                for (pim0 pim0Var2 = ((l5t) pim0VarS).P0; pim0Var2 != null; pim0Var2 = pim0Var2.f) {
                                    if ((pim0Var2.c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            pim0VarS = pim0Var2;
                                        } else {
                                            if (bfn0Var == null) {
                                                bfn0Var = new bfn0(0, new pim0[16]);
                                            }
                                            if (pim0VarS != null) {
                                                bfn0Var.b(pim0VarS);
                                                pim0VarS = null;
                                            }
                                            bfn0Var.b(pim0Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            pim0VarS = oap1.s(bfn0Var);
                        }
                    }
                    pim0Var = pim0Var.e;
                }
            }
            hmb0VarB = hmb0VarB.v();
            pim0Var = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
        }
    }

    public static final void F(dpg1 dpg1Var, iu30 iu30Var) {
        jdo0 jdo0Var;
        pim0 pim0Var = (pim0) dpg1Var;
        if (!pim0Var.a.N0) {
            qf80.c("visitAncestors called on an unattached node");
        }
        pim0 pim0Var2 = pim0Var.a.e;
        hmb0 hmb0VarB = oap1.B(dpg1Var);
        while (hmb0VarB != null) {
            if ((((pim0) hmb0VarB.e1.g).d & 262144) != 0) {
                while (pim0Var2 != null) {
                    if ((pim0Var2.c & 262144) != 0) {
                        pim0 pim0VarS = pim0Var2;
                        bfn0 bfn0Var = null;
                        while (pim0VarS != null) {
                            boolean zBooleanValue = true;
                            if (pim0VarS instanceof dpg1) {
                                dpg1 dpg1Var2 = (dpg1) pim0VarS;
                                if (u890.j(dpg1Var.n(), dpg1Var2.n()) && dpg1Var.getClass() == dpg1Var2.getClass()) {
                                    zBooleanValue = ((Boolean) iu30Var.invoke(dpg1Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else if ((pim0VarS.c & 262144) != 0 && (pim0VarS instanceof l5t)) {
                                int i = 0;
                                for (pim0 pim0Var3 = ((l5t) pim0VarS).P0; pim0Var3 != null; pim0Var3 = pim0Var3.f) {
                                    if ((pim0Var3.c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            pim0VarS = pim0Var3;
                                        } else {
                                            if (bfn0Var == null) {
                                                bfn0Var = new bfn0(0, new pim0[16]);
                                            }
                                            if (pim0VarS != null) {
                                                bfn0Var.b(pim0VarS);
                                                pim0VarS = null;
                                            }
                                            bfn0Var.b(pim0Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            pim0VarS = oap1.s(bfn0Var);
                        }
                    }
                    pim0Var2 = pim0Var2.e;
                }
            }
            hmb0VarB = hmb0VarB.v();
            pim0Var2 = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
        }
    }

    public static final void G(pim0 pim0Var, String str, iu30 iu30Var) {
        if (!pim0Var.a.N0) {
            qf80.c("visitSubtreeIf called on an unattached node");
        }
        bfn0 bfn0Var = new bfn0(0, new pim0[16]);
        pim0 pim0Var2 = pim0Var.a;
        pim0 pim0Var3 = pim0Var2.f;
        if (pim0Var3 == null) {
            oap1.g(bfn0Var, pim0Var2);
        } else {
            bfn0Var.b(pim0Var3);
        }
        while (true) {
            int i = bfn0Var.c;
            if (i == 0) {
                return;
            }
            pim0 pim0Var4 = (pim0) bfn0Var.l(i - 1);
            if ((pim0Var4.d & 262144) != 0) {
                pim0 pim0Var5 = pim0Var4;
                while (true) {
                    if (pim0Var5 != null && pim0Var5.N0) {
                        if ((pim0Var5.c & 262144) != 0) {
                            pim0 pim0VarS = pim0Var5;
                            bfn0 bfn0Var2 = null;
                            while (pim0VarS != null) {
                                if (pim0VarS instanceof dpg1) {
                                    dpg1 dpg1Var = (dpg1) pim0VarS;
                                    cpg1 cpg1Var = str.equals(dpg1Var.n()) ? (cpg1) iu30Var.invoke(dpg1Var) : cpg1.a;
                                    if (cpg1Var == cpg1.c) {
                                        return;
                                    }
                                    if (cpg1Var == cpg1.b) {
                                        break;
                                    }
                                } else if ((pim0VarS.c & 262144) != 0 && (pim0VarS instanceof l5t)) {
                                    int i2 = 0;
                                    for (pim0 pim0Var6 = ((l5t) pim0VarS).P0; pim0Var6 != null; pim0Var6 = pim0Var6.f) {
                                        if ((pim0Var6.c & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                pim0VarS = pim0Var6;
                                            } else {
                                                if (bfn0Var2 == null) {
                                                    bfn0Var2 = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarS != null) {
                                                    bfn0Var2.b(pim0VarS);
                                                    pim0VarS = null;
                                                }
                                                bfn0Var2.b(pim0Var6);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                pim0VarS = oap1.s(bfn0Var2);
                            }
                        }
                        pim0Var5 = pim0Var5.f;
                    }
                }
            }
            oap1.g(bfn0Var, pim0Var4);
        }
    }

    public static final void H(dpg1 dpg1Var, iu30 iu30Var) {
        pim0 pim0Var = (pim0) dpg1Var;
        if (!pim0Var.a.N0) {
            qf80.c("visitSubtreeIf called on an unattached node");
        }
        bfn0 bfn0Var = new bfn0(0, new pim0[16]);
        pim0 pim0Var2 = pim0Var.a;
        pim0 pim0Var3 = pim0Var2.f;
        if (pim0Var3 == null) {
            oap1.g(bfn0Var, pim0Var2);
        } else {
            bfn0Var.b(pim0Var3);
        }
        while (true) {
            int i = bfn0Var.c;
            if (i == 0) {
                return;
            }
            pim0 pim0Var4 = (pim0) bfn0Var.l(i - 1);
            if ((pim0Var4.d & 262144) != 0) {
                pim0 pim0Var5 = pim0Var4;
                while (true) {
                    if (pim0Var5 != null && pim0Var5.N0) {
                        if ((pim0Var5.c & 262144) != 0) {
                            pim0 pim0VarS = pim0Var5;
                            bfn0 bfn0Var2 = null;
                            while (pim0VarS != null) {
                                if (pim0VarS instanceof dpg1) {
                                    dpg1 dpg1Var2 = (dpg1) pim0VarS;
                                    cpg1 cpg1Var = (u890.j(dpg1Var.n(), dpg1Var2.n()) && dpg1Var.getClass() == dpg1Var2.getClass()) ? (cpg1) iu30Var.invoke(dpg1Var2) : cpg1.a;
                                    if (cpg1Var == cpg1.c) {
                                        return;
                                    }
                                    if (cpg1Var == cpg1.b) {
                                        break;
                                    }
                                } else if ((pim0VarS.c & 262144) != 0 && (pim0VarS instanceof l5t)) {
                                    int i2 = 0;
                                    for (pim0 pim0Var6 = ((l5t) pim0VarS).P0; pim0Var6 != null; pim0Var6 = pim0Var6.f) {
                                        if ((pim0Var6.c & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                pim0VarS = pim0Var6;
                                            } else {
                                                if (bfn0Var2 == null) {
                                                    bfn0Var2 = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarS != null) {
                                                    bfn0Var2.b(pim0VarS);
                                                    pim0VarS = null;
                                                }
                                                bfn0Var2.b(pim0Var6);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                pim0VarS = oap1.s(bfn0Var2);
                            }
                        }
                        pim0Var5 = pim0Var5.f;
                    }
                }
            }
            oap1.g(bfn0Var, pim0Var4);
        }
    }

    public static final void a(qb50 qb50Var, nb50 nb50Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        hax haxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(465309335);
        int i2 = i | (x340Var.i(qb50Var) ? 4 : 2) | (x340Var.g(nb50Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ib50(nb50Var, iu30Var, (byte) 0);
                x340Var.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            idx idxVar = new idx(4);
            if (qb50Var.e) {
                x340Var.i0(485687432);
                haxVar = new hax(cwl1.o0(x340Var, 2131956391));
                x340Var.r(false);
            } else if (qb50Var.d) {
                x340Var.i0(485696843);
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                x340Var.i0(485693086);
                haxVar = new hax(cwl1.o0(x340Var, 2131956424));
                x340Var.r(false);
            }
            hax haxVar2 = haxVar;
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.b;
            qim0 qim0Var3 = nim0.a;
            foo1.c(gbxVar, idxVar, anm1.N("graduation_terms_button_test_tag", uyn1.B(qim0Var3, 0.0f, f, 0.0f, 0.0f, 13)), haxVar2, null, null, null, null, null, null, apo.r(695065336, new jb50(qb50Var, (byte) 0), x340Var), x340Var, 0, 48, 2024);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kb50(qb50Var, nb50Var, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void b(int i, String str, nb50 nb50Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(162081041);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar3.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar3.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? b0kVar3.g(nb50Var) : b0kVar3.i(nb50Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 >> 6;
            ven0 ven0VarS = v8r.s(nb50Var, b0kVar3);
            ven0 ven0VarS2 = v8r.s(iu30Var, b0kVar3);
            String strO0 = cwl1.o0(b0kVar3, 2131956420);
            String strN0 = cwl1.n0(i, new Object[]{strO0}, b0kVar3);
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar3).c.c;
            FontFamily fontFamily = cbx.d(b0kVar3).g.a.f;
            boolean zG = b0kVar3.g(strN0) | b0kVar3.g(strO0) | ((i3 & 112) == 32) | b0kVar3.f(j) | b0kVar3.g(fontFamily);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                String strSubstring = strN0.substring(0, ihc1.w0(strN0, strO0, 0, false, 6));
                String strSubstring2 = strN0.substring(strO0.length() + strSubstring.length(), strN0.length());
                ye5 ye5Var = new ye5();
                ye5Var.g(strSubstring);
                vhg.c(ye5Var, strO0, str, new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61406), new lb50(str, ven0VarS, ven0VarS2, (byte) 0));
                ye5Var.g(strSubstring2);
                objT = ye5Var.p();
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            uwo1.d((af5) objT, cbx.a(b0kVar3).b.a, qim0Var, cbx.d(b0kVar3).g, null, null, 0, false, null, 0, null, null, b0kVar2, i4 & 896, 0, 4080);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(i, str, nb50Var, iu30Var, qim0Var, i2, (byte) 11);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(qb50 qb50Var, nb50 nb50Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        qim0 qim0VarF;
        v850 v850Var = qb50Var.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(60123400);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qb50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(nb50Var) : x340Var.i(nb50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = v850Var.ordinal();
            if (iOrdinal == 0) {
                x340Var.i0(1944023803);
                uwr uwrVar = cbx.a;
                qim0VarF = dug.f(nim0.a, cbx.a(x340Var).a.c, d4o1.a);
                x340Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, 1944018634, false);
                }
                x340Var.i0(1944020616);
                x340Var.r(false);
                qim0VarF = t3k1.t(v850Var);
            }
            ujo1.c(l6o1.C(0, 0, 1, x340Var), qim0VarF, apo.r(-650264141, new mb50(iu30Var, qb50Var, nb50Var), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(qb50Var, nb50Var, iu30Var, i, (byte) 18);
        }
    }

    public static final void d(qb50 qb50Var, nb50 nb50Var, iu30 iu30Var, b0k b0kVar, int i) {
        iu30 iu30Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1247949448);
        int i2 = i | (x340Var.i(qb50Var) ? 4 : 2) | (x340Var.g(nb50Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            String str = qb50Var.b;
            uwr uwrVar = cbx.a;
            b(2131956422, str, nb50Var, iu30Var, uyn1.B(nim0Var, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13), x340Var, (i2 << 3) & 8064);
            iu30Var2 = iu30Var;
            x340Var = x340Var;
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new z720(iu30Var2, (byte) 15);
                x340Var.s0(objT);
            }
            h(qb50Var, nb50Var, (iu30) objT, uyn1.B(nim0Var, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13), x340Var, i2 & 126);
            x340Var.r(true);
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb50(qb50Var, nb50Var, iu30Var2, i, (byte) 1);
        }
    }

    public static final void e(qb50 qb50Var, nb50 nb50Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1090340887);
        int i2 = i | (x340Var.i(qb50Var) ? 4 : 2) | (x340Var.g(nb50Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = qb50Var.b;
            uwr uwrVar = cbx.a;
            b(2131956423, str, nb50Var, iu30Var, uyn1.B(nim0.a, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13), x340Var, (i2 << 3) & 8064);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb50(qb50Var, nb50Var, iu30Var, i, (byte) 2);
        }
    }

    public static final void f(qb50 qb50Var, nb50 nb50Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-256882533);
        int i2 = i | (x340Var.i(qb50Var) ? 4 : 2) | (x340Var.g(nb50Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String str = qb50Var.b;
            uwr uwrVar = cbx.a;
            b(2131956421, str, nb50Var, iu30Var, uyn1.B(nim0.a, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13), x340Var, (i2 << 3) & 8064);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mb50(qb50Var, nb50Var, iu30Var, i, (byte) 3);
        }
    }

    public static final void g(hux huxVar, long j, String str, String str2, gbx gbxVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(9367789);
        int i2 = i | (b0kVar3.i(huxVar) ? 4 : 2) | (b0kVar3.f(j) ? 32 : 16) | (b0kVar3.g(str) ? 256 : 128) | (b0kVar3.g(str2) ? 2048 : 1024) | (b0kVar3.g(gbxVar) ? 16384 : 8192);
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            b0kVar2 = b0kVar3;
            jto1.b(null, null, null, false, null, null, gbxVar, null, null, apo.r(-767768490, new p7g0(j, huxVar), b0kVar3), null, apo.r(-199212363, new z3y(str2, (byte) 28), b0kVar3), uyi.b, null, null, apo.r(-1446654415, new z3y(str, (byte) 29), b0kVar3), b0kVar2, ((i2 << 6) & 3670016) | 805306368, 197040, 26047);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new rb9(huxVar, j, str, str2, gbxVar, i);
        }
    }

    public static final void h(qb50 qb50Var, nb50 nb50Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-985149148);
        int i2 = i | (x340Var.i(qb50Var) ? 4 : 2) | (x340Var.g(nb50Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = qb50Var.d;
            fra fraVar = een.N0;
            boolean z3 = !qb50Var.e;
            boolean zH = ((i2 & 896) == 256) | ((i2 & 112) == 32) | x340Var.h(z2);
            Object objT = x340Var.T();
            if (zH || objT == m4cVar) {
                objT = new vm1(nb50Var, iu30Var, z2);
                x340Var.s0(objT);
            }
            qim0 qim0VarF = u291.f(bin.x(qim0Var, z3, null, null, null, (Function0) objT, 14), 1.0f);
            boolean zH2 = x340Var.h(z2);
            Object objT2 = x340Var.T();
            if (zH2 || objT2 == m4cVar) {
                objT2 = new mj10((byte) 5, z2);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT2);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
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
            nim0 nim0Var = nim0.a;
            if (z2) {
                x340Var.i0(-1028381412);
                klx klxVar = klx.c;
                uwr uwrVar = cbx.a;
                z = true;
                w0h1.a(klxVar, isl.a, (qim0) null, cbx.a(x340Var).c.c, 0L, false, x340Var, klx.d | 48, 52);
                x340Var.r(false);
            } else {
                z = true;
                x340Var.i0(-1028181524);
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                qim0 qim0VarR = d7e.r(1.0f, u291.v(nim0Var, 24.0f), false);
                cr31 cr31Var = er31.a;
                qim0 qim0VarQ = i1p1.q(qim0VarR, cr31Var);
                avw0 avw0Var = cbx.b(x340Var).c;
                t1c.a(d1u.E(2.0f, cbx.a(x340Var).c.b, qim0VarQ, cr31Var), x340Var, 0);
                x340Var.r(false);
            }
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(kk0.j(6.0f, 2131956425, x340Var, x340Var, nim0Var), null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kb50(qb50Var, nb50Var, iu30Var, qim0Var, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2 A[PHI: r3 r8
      0x00c2: PHI (r3v12 int) = (r3v7 int), (r3v7 int), (r3v14 int) binds: [B:71:0x00cc, B:65:0x00be, B:66:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00c2: PHI (r8v23 p.qim0) = (r8v4 p.qim0), (r8v2 p.qim0), (r8v2 p.qim0) binds: [B:71:0x00cc, B:65:0x00be, B:66:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x015b  */
    /* JADX WARN: Code duplicated, block: B:89:0x016a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0179 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b7  */
    public static final void i(iec iecVar, int i, boolean z, boolean z2, qim0 qim0Var, djc0 djc0Var, b0k b0kVar, int i2, int i3) {
        iec iecVar2;
        int i4;
        qim0 qim0Var2;
        djc0 djc0Var2;
        boolean z3;
        qim0 qim0Var3;
        djc0 djc0Var3;
        h311 h311VarV;
        int i5;
        qim0 qim0Var4;
        djc0 cjc0Var;
        int i6;
        qim0 qim0Var5;
        boolean z4;
        Object objT;
        hsi1 hsi1Var;
        int i7;
        ven0 ven0VarR;
        boolean z5;
        qim0 qim0VarN;
        boolean zG;
        Object objT2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(679322197);
        if ((i2 & 6) == 0) {
            iecVar2 = iecVar;
            i4 = (x340Var.i(iecVar2) ? 4 : 2) | i2;
        } else {
            iecVar2 = iecVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var.h(z2) ? 2048 : 1024;
        }
        int i8 = i3 & 16;
        if (i8 == 0) {
            if ((i2 & 24576) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.g(qim0Var2) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                if ((i3 & 32) == 0) {
                    djc0Var2 = djc0Var;
                    int i9 = x340Var.g(djc0Var2) ? 131072 : 65536;
                    i4 |= i9;
                } else {
                    djc0Var2 = djc0Var;
                }
                i4 |= i9;
            } else {
                djc0Var2 = djc0Var;
            }
            if ((74899 & i4) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i4 & 1, z3)) {
                x340Var.d0();
                i5 = i2 & 1;
                qim0Var4 = nim0.a;
                if (i5 != 0 || x340Var.E()) {
                    if (i8 != 0) {
                        qim0Var2 = qim0Var4;
                    }
                    if ((i3 & 32) != 0) {
                        cjc0Var = new cjc0(1);
                        i6 = i4 & (-458753);
                        qim0Var5 = qim0Var2;
                    }
                    x340Var.s();
                    if ((i6 & 112) == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    objT = x340Var.T();
                    if (z4 || objT == m4cVar) {
                        ilv.a.getClass();
                        objT = new hsi1("buttonScale", Float.valueOf(0.8f), Float.valueOf(1.0f), new pxg1(666, i, flv.b), rno1.a);
                        x340Var.s0(objT);
                    }
                    hsi1Var = (hsi1) objT;
                    i7 = 8 | ((i6 >> 3) & 112);
                    ven0VarR = zod.R(hsi1Var, z, (Function0) null, x340Var, i7, 4);
                    if (((Number) zod.R(new hsi1("buttonClickable", 0, 1, new zu91(i), rno1.b), z, (Function0) null, x340Var, i7, 4).getValue()).intValue() <= 0 || !z2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    x340Var.i0(-6356876);
                    qim0VarN = anm1.N("wrapped-share-button", qim0Var5);
                    if (z2) {
                        zG = x340Var.g(ven0VarR) | x340Var.i(hsi1Var);
                        objT2 = x340Var.T();
                        if (zG || objT2 == m4cVar) {
                            objT2 = new hf31(hsi1Var, ven0VarR, (byte) 15);
                            x340Var.s0(objT2);
                        }
                        qim0VarN = qim0VarN.then(i541.C(qim0Var4, (iu30) objT2));
                    }
                    x340Var.r(false);
                    djc0 djc0Var4 = cjc0Var;
                    kln1.l(iecVar2, qim0VarN, z5, djc0Var4, false, null, null, x340Var, (i6 & 14) | ((i6 >> 6) & 7168), 112);
                    djc0Var2 = djc0Var4;
                    x340Var = x340Var;
                    qim0Var3 = qim0Var5;
                } else {
                    x340Var.b0();
                    if ((i3 & 32) != 0) {
                        i4 &= -458753;
                    }
                }
                i6 = i4;
                qim0Var5 = qim0Var2;
                cjc0Var = djc0Var2;
                x340Var.s();
                if ((i6 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objT = x340Var.T();
                if (z4) {
                    ilv.a.getClass();
                    objT = new hsi1("buttonScale", Float.valueOf(0.8f), Float.valueOf(1.0f), new pxg1(666, i, flv.b), rno1.a);
                    x340Var.s0(objT);
                } else {
                    ilv.a.getClass();
                    objT = new hsi1("buttonScale", Float.valueOf(0.8f), Float.valueOf(1.0f), new pxg1(666, i, flv.b), rno1.a);
                    x340Var.s0(objT);
                }
                hsi1Var = (hsi1) objT;
                i7 = 8 | ((i6 >> 3) & 112);
                ven0VarR = zod.R(hsi1Var, z, (Function0) null, x340Var, i7, 4);
                if (((Number) zod.R(new hsi1("buttonClickable", 0, 1, new zu91(i), rno1.b), z, (Function0) null, x340Var, i7, 4).getValue()).intValue() <= 0) {
                    z5 = true;
                } else {
                    z5 = true;
                }
                x340Var.i0(-6356876);
                qim0VarN = anm1.N("wrapped-share-button", qim0Var5);
                if (z2) {
                    zG = x340Var.g(ven0VarR) | x340Var.i(hsi1Var);
                    objT2 = x340Var.T();
                    if (zG) {
                        objT2 = new hf31(hsi1Var, ven0VarR, (byte) 15);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new hf31(hsi1Var, ven0VarR, (byte) 15);
                        x340Var.s0(objT2);
                    }
                    qim0VarN = qim0VarN.then(i541.C(qim0Var4, (iu30) objT2));
                }
                x340Var.r(false);
                djc0 djc0Var5 = cjc0Var;
                kln1.l(iecVar2, qim0VarN, z5, djc0Var5, false, null, null, x340Var, (i6 & 14) | ((i6 >> 6) & 7168), 112);
                djc0Var2 = djc0Var5;
                x340Var = x340Var;
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            djc0Var3 = djc0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new gk41(iecVar, i, z, z2, qim0Var3, djc0Var3, i2, i3);
            }
        }
        i4 |= 24576;
        qim0Var2 = qim0Var;
        if ((196608 & i2) == 0) {
            if ((i3 & 32) == 0) {
                djc0Var2 = djc0Var;
                if (x340Var.g(djc0Var2)) {
                }
                i4 |= i9;
            } else {
                djc0Var2 = djc0Var;
            }
            i4 |= i9;
        } else {
            djc0Var2 = djc0Var;
        }
        if ((74899 & i4) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i4 & 1, z3)) {
            x340Var.d0();
            i5 = i2 & 1;
            qim0Var4 = nim0.a;
            if (i5 != 0) {
                if (i8 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i3 & 32) != 0) {
                    cjc0Var = new cjc0(1);
                    i6 = i4 & (-458753);
                    qim0Var5 = qim0Var2;
                } else {
                    i6 = i4;
                    qim0Var5 = qim0Var2;
                    cjc0Var = djc0Var2;
                }
            } else {
                if (i8 != 0) {
                    qim0Var2 = qim0Var4;
                }
                if ((i3 & 32) != 0) {
                    cjc0Var = new cjc0(1);
                    i6 = i4 & (-458753);
                    qim0Var5 = qim0Var2;
                } else {
                    i6 = i4;
                    qim0Var5 = qim0Var2;
                    cjc0Var = djc0Var2;
                }
            }
            x340Var.s();
            if ((i6 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objT = x340Var.T();
            if (z4) {
                ilv.a.getClass();
                objT = new hsi1("buttonScale", Float.valueOf(0.8f), Float.valueOf(1.0f), new pxg1(666, i, flv.b), rno1.a);
                x340Var.s0(objT);
            } else {
                ilv.a.getClass();
                objT = new hsi1("buttonScale", Float.valueOf(0.8f), Float.valueOf(1.0f), new pxg1(666, i, flv.b), rno1.a);
                x340Var.s0(objT);
            }
            hsi1Var = (hsi1) objT;
            i7 = 8 | ((i6 >> 3) & 112);
            ven0VarR = zod.R(hsi1Var, z, (Function0) null, x340Var, i7, 4);
            if (((Number) zod.R(new hsi1("buttonClickable", 0, 1, new zu91(i), rno1.b), z, (Function0) null, x340Var, i7, 4).getValue()).intValue() <= 0) {
                z5 = true;
            } else {
                z5 = true;
            }
            x340Var.i0(-6356876);
            qim0VarN = anm1.N("wrapped-share-button", qim0Var5);
            if (z2) {
                zG = x340Var.g(ven0VarR) | x340Var.i(hsi1Var);
                objT2 = x340Var.T();
                if (zG) {
                    objT2 = new hf31(hsi1Var, ven0VarR, (byte) 15);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new hf31(hsi1Var, ven0VarR, (byte) 15);
                    x340Var.s0(objT2);
                }
                qim0VarN = qim0VarN.then(i541.C(qim0Var4, (iu30) objT2));
            }
            x340Var.r(false);
            djc0 djc0Var6 = cjc0Var;
            kln1.l(iecVar2, qim0VarN, z5, djc0Var6, false, null, null, x340Var, (i6 & 14) | ((i6 >> 6) & 7168), 112);
            djc0Var2 = djc0Var6;
            x340Var = x340Var;
            qim0Var3 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        djc0Var3 = djc0Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gk41(iecVar, i, z, z2, qim0Var3, djc0Var3, i2, i3);
        }
    }

    public static final void j(wbm1 wbm1Var, long j, b0k b0kVar, int i) {
        String quantityString;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-943375709);
        int i2 = i | (x340Var.g(wbm1Var) ? 4 : 2) | (x340Var.f(j) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            if (wbm1Var.c) {
                quantityString = x0d.k(x340Var, -2134635810, 2131956042, x340Var, false);
            } else {
                x340Var.i0(-345951488);
                Resources resources = ((Context) x340Var.k(AndroidCompositionLocals_androidKt.b)).getResources();
                int i3 = wbm1Var.a;
                quantityString = resources.getQuantityString(2131820775, i3, Integer.valueOf(i3));
                quantityString.getClass();
                x340Var.r(false);
            }
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(quantityString, null, cbx.d(x340Var).k, j, null, null, 2, false, cjc0Var, 0, null, x340Var, (i2 << 6) & 7168, 0, 1714);
            uwo1.e(" • ".concat(wbm1Var.b), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1714);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk7(wbm1Var, j, i, (byte) 12);
        }
    }

    public static final jk20 k(Intent intent) {
        jk20 m231Var;
        if (((ik20) kk20.a.get()) != null) {
            return null;
        }
        try {
            String action = intent.getAction();
            Uri data = intent.getData();
            String scheme = data != null ? data.getScheme() : null;
            Uri data2 = intent.getData();
            m231Var = new jk20(intent.getFlags(), action, scheme, intent.getExtras() != null, data2 != null ? data2.getHost() : null);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return m231Var instanceof m231 ? null : m231Var;
    }

    public static final List l(boolean z) {
        return p7h.M(new m3d0[]{new m3d0("addTime", z), new m3d0("album.name", true), new m3d0("discNumber", true), new m3d0("trackNumber", true), a});
    }

    public static final List m(boolean z) {
        return p7h.M(new m3d0[]{new m3d0("album.name", z), new m3d0("artist.name", true), new m3d0("discNumber", true), new m3d0("trackNumber", true), a});
    }

    public static final List n(boolean z) {
        return p7h.M(new m3d0[]{new m3d0("artist.name", z), new m3d0("album.name", true), new m3d0("discNumber", true), new m3d0("trackNumber", true), a});
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:55:0x010b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0146  */
    /* JADX WARN: Code duplicated, block: B:69:0x014e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0158  */
    /* JADX WARN: Code duplicated, block: B:73:0x015c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0164  */
    /* JADX WARN: Code duplicated, block: B:77:0x016e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0172  */
    /* JADX WARN: Code duplicated, block: B:81:0x017a  */
    public static final Map o(Map map) {
        String str;
        iey0 iey0Var;
        xv00 xv00Var;
        jo70 mmr0Var;
        tka0 tka0Var;
        jd11 jd11Var;
        ArrayList<mmr0> arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (true) {
            jo70 jo70Var = null;
            if (!it.hasNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (mmr0 mmr0Var2 : arrayList) {
                    iey0 iey0Var2 = (iey0) mmr0Var2.a;
                    Object arrayList2 = linkedHashMap.get(iey0Var2);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(iey0Var2, arrayList2);
                    }
                    ((List) arrayList2).add(mmr0Var2.b);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof jo70) {
                            arrayList3.add(obj);
                        }
                    }
                    jo70 jo70Var2 = (jo70) o7h.s0(arrayList3);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof xkk1) {
                            arrayList4.add(obj2);
                        }
                    }
                    xkk1 xkk1Var = (xkk1) o7h.s0(arrayList4);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof hll) {
                            arrayList5.add(obj3);
                        }
                    }
                    hll hllVar = (hll) o7h.s0(arrayList5);
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof hzy) {
                            arrayList6.add(obj4);
                        }
                    }
                    hzy hzyVar = (hzy) o7h.s0(arrayList6);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj5 : list) {
                        if (obj5 instanceof iix0) {
                            arrayList7.add(obj5);
                        }
                    }
                    iix0 iix0Var = (iix0) o7h.s0(arrayList7);
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj6 : list) {
                        if (obj6 instanceof h2v) {
                            arrayList8.add(obj6);
                        }
                    }
                    h2v h2vVar = (h2v) o7h.s0(arrayList8);
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj7 : list) {
                        if (obj7 instanceof zoy0) {
                            arrayList9.add(obj7);
                        }
                    }
                    zoy0 zoy0Var = (zoy0) o7h.s0(arrayList9);
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj8 : list) {
                        if (obj8 instanceof w281) {
                            arrayList10.add(obj8);
                        }
                    }
                    w281 w281Var = (w281) o7h.s0(arrayList10);
                    ArrayList arrayList11 = new ArrayList();
                    for (Object obj9 : list) {
                        if (obj9 instanceof mdz) {
                            arrayList11.add(obj9);
                        }
                    }
                    linkedHashMap2.put(key, (jo70Var2 == null || xkk1Var == null) ? null : new wnb1(jo70Var2, xkk1Var, hllVar, hzyVar, iix0Var, h2vVar, zoy0Var, w281Var, (mdz) o7h.s0(arrayList11)));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    if (((wnb1) entry2.getValue()) != null) {
                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                    }
                }
                ArrayList arrayList12 = new ArrayList(linkedHashMap3.size());
                for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                    Object key2 = entry3.getKey();
                    Object value = entry3.getValue();
                    value.getClass();
                    arrayList12.add(new mmr0(key2, value));
                }
                return sqg0.T(arrayList12);
            }
            Map.Entry entry4 = (Map.Entry) it.next();
            jh5 jh5Var = (jh5) entry4.getKey();
            h3r h3rVar = (k3r) entry4.getValue();
            if (h3rVar instanceof h3r) {
                Logger.d("Failed to load data for key: " + jh5Var + ", error: " + h3rVar.a, new Object[0]);
            } else if (!(h3rVar instanceof i3r)) {
                if (!(h3rVar instanceof j3r)) {
                    eg.o();
                    return null;
                }
                Object obj10 = jh5Var.b;
                if (obj10 instanceof a2v) {
                    a2v a2vVar = (a2v) obj10;
                    int iC = l1d.C(a2vVar.b);
                    if (iC == 0) {
                        str = a2vVar.a;
                        iey0Var = new iey0(str);
                        xv00Var = jh5Var.a;
                        if (xv00Var instanceof xv00) {
                            tka0Var = xv00Var.a;
                            jd11Var = rc11.a;
                            if (u890.j(tka0Var, jd11Var.b(jo70.class))) {
                                Object obj11 = ((j3r) h3rVar).a;
                                mmr0Var = new mmr0(iey0Var, obj11 instanceof jo70 ? (jo70) obj11 : null);
                            } else if (u890.j(tka0Var, jd11Var.b(xkk1.class))) {
                                Object obj12 = ((j3r) h3rVar).a;
                                mmr0Var = new mmr0(iey0Var, obj12 instanceof xkk1 ? (xkk1) obj12 : null);
                            } else if (u890.j(tka0Var, jd11Var.b(hll.class))) {
                                Object obj13 = ((j3r) h3rVar).a;
                                mmr0Var = new mmr0(iey0Var, obj13 instanceof hll ? (hll) obj13 : null);
                            } else if (u890.j(tka0Var, jd11Var.b(hzy.class))) {
                                Object obj14 = ((j3r) h3rVar).a;
                                mmr0Var = new mmr0(iey0Var, obj14 instanceof hzy ? (hzy) obj14 : null);
                            } else if (u890.j(tka0Var, jd11Var.b(zoy0.class))) {
                                Object obj15 = ((j3r) h3rVar).a;
                                mmr0Var = new mmr0(iey0Var, obj15 instanceof zoy0 ? (zoy0) obj15 : null);
                            } else if (u890.j(tka0Var, jd11Var.b(w281.class))) {
                                Object obj16 = ((j3r) h3rVar).a;
                                mmr0Var = new mmr0(iey0Var, obj16 instanceof w281 ? (w281) obj16 : null);
                            } else if (u890.j(tka0Var, jd11Var.b(mdz.class))) {
                                Object obj17 = ((j3r) h3rVar).a;
                                mmr0Var = new mmr0(iey0Var, obj17 instanceof mdz ? (mdz) obj17 : null);
                            }
                            jo70Var = mmr0Var;
                        } else {
                            if (xv00Var instanceof hjx0) {
                                Object obj18 = ((j3r) h3rVar).a;
                                mmr0Var = new mmr0(iey0Var, obj18 instanceof iix0 ? (iix0) obj18 : null);
                            } else if (xv00Var instanceof b2v) {
                                Object obj19 = ((j3r) h3rVar).a;
                                mmr0Var = new mmr0(iey0Var, obj19 instanceof h2v ? (h2v) obj19 : null);
                            }
                            jo70Var = mmr0Var;
                        }
                    } else if (iC != 1) {
                        eg.o();
                        return null;
                    }
                } else if (obj10 instanceof String) {
                    str = (String) obj10;
                    iey0Var = new iey0(str);
                    xv00Var = jh5Var.a;
                    if (xv00Var instanceof xv00) {
                        tka0Var = xv00Var.a;
                        jd11Var = rc11.a;
                        if (u890.j(tka0Var, jd11Var.b(jo70.class))) {
                            Object obj110 = ((j3r) h3rVar).a;
                            mmr0Var = new mmr0(iey0Var, obj110 instanceof jo70 ? (jo70) obj110 : null);
                        } else if (u890.j(tka0Var, jd11Var.b(xkk1.class))) {
                            Object obj111 = ((j3r) h3rVar).a;
                            mmr0Var = new mmr0(iey0Var, obj111 instanceof xkk1 ? (xkk1) obj111 : null);
                        } else if (u890.j(tka0Var, jd11Var.b(hll.class))) {
                            Object obj112 = ((j3r) h3rVar).a;
                            mmr0Var = new mmr0(iey0Var, obj112 instanceof hll ? (hll) obj112 : null);
                        } else if (u890.j(tka0Var, jd11Var.b(hzy.class))) {
                            Object obj113 = ((j3r) h3rVar).a;
                            mmr0Var = new mmr0(iey0Var, obj113 instanceof hzy ? (hzy) obj113 : null);
                        } else if (u890.j(tka0Var, jd11Var.b(zoy0.class))) {
                            Object obj114 = ((j3r) h3rVar).a;
                            mmr0Var = new mmr0(iey0Var, obj114 instanceof zoy0 ? (zoy0) obj114 : null);
                        } else if (u890.j(tka0Var, jd11Var.b(w281.class))) {
                            Object obj115 = ((j3r) h3rVar).a;
                            mmr0Var = new mmr0(iey0Var, obj115 instanceof w281 ? (w281) obj115 : null);
                        } else if (u890.j(tka0Var, jd11Var.b(mdz.class))) {
                            Object obj116 = ((j3r) h3rVar).a;
                            mmr0Var = new mmr0(iey0Var, obj116 instanceof mdz ? (mdz) obj116 : null);
                        }
                        jo70Var = mmr0Var;
                    } else {
                        if (xv00Var instanceof hjx0) {
                            Object obj117 = ((j3r) h3rVar).a;
                            mmr0Var = new mmr0(iey0Var, obj117 instanceof iix0 ? (iix0) obj117 : null);
                        } else if (xv00Var instanceof b2v) {
                            Object obj118 = ((j3r) h3rVar).a;
                            mmr0Var = new mmr0(iey0Var, obj118 instanceof h2v ? (h2v) obj118 : null);
                        }
                        jo70Var = mmr0Var;
                    }
                }
            }
            if (jo70Var != null) {
                arrayList.add(jo70Var);
            }
        }
    }

    public static final ComposeView p(Context context) {
        ComposeView composeView = new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setViewCompositionStrategy(p5x0.W0);
        return composeView;
    }

    public static final int q(float f, Context context) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final dpg1 r(l6o0 l6o0Var) {
        jdo0 jdo0Var;
        if (!((pim0) l6o0Var).a.N0) {
            qf80.c("visitAncestors called on an unattached node");
        }
        dpg1 dpg1Var = ((pim0) l6o0Var).a.e;
        hmb0 hmb0VarB = oap1.B(l6o0Var);
        while (hmb0VarB != null) {
            if ((((pim0) hmb0VarB.e1.g).d & 262144) != 0) {
                while (dpg1Var != null) {
                    if ((((pim0) dpg1Var).c & 262144) != 0) {
                        dpg1 dpg1VarS = dpg1Var;
                        bfn0 bfn0Var = null;
                        while (dpg1VarS != null) {
                            if (dpg1VarS instanceof dpg1) {
                                dpg1 dpg1Var2 = dpg1VarS;
                                if (u890.j(l6o0Var.R0, dpg1Var2.n()) && l6o0.class == dpg1Var2.getClass()) {
                                    return dpg1Var2;
                                }
                            }
                            if ((((pim0) dpg1VarS).c & 262144) != 0 && (dpg1VarS instanceof l5t)) {
                                int i = 0;
                                for (dpg1 dpg1Var3 = ((l5t) dpg1VarS).P0; dpg1Var3 != null; dpg1Var3 = ((pim0) dpg1Var3).f) {
                                    if ((((pim0) dpg1Var3).c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dpg1VarS = dpg1Var3;
                                        } else {
                                            if (bfn0Var == null) {
                                                bfn0Var = new bfn0(0, new pim0[16]);
                                            }
                                            if (dpg1VarS != null) {
                                                bfn0Var.b(dpg1VarS);
                                                dpg1VarS = null;
                                            }
                                            bfn0Var.b(dpg1Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            dpg1VarS = oap1.s(bfn0Var);
                        }
                    }
                    dpg1Var = ((pim0) dpg1Var).e;
                }
            }
            hmb0VarB = hmb0VarB.v();
            dpg1Var = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
        }
        return null;
    }

    public static final void s(l030 l030Var) {
        jdo0 jdo0Var;
        if (!((pim0) l030Var).a.N0) {
            qf80.c("visitAncestors called on an unattached node");
        }
        dpg1 dpg1Var = ((pim0) l030Var).a.e;
        hmb0 hmb0VarB = oap1.B(l030Var);
        while (hmb0VarB != null) {
            if ((((pim0) hmb0VarB.e1.g).d & 262144) != 0) {
                while (dpg1Var != null) {
                    if ((((pim0) dpg1Var).c & 262144) != 0) {
                        dpg1 dpg1VarS = dpg1Var;
                        bfn0 bfn0Var = null;
                        while (dpg1VarS != null) {
                            if (dpg1VarS instanceof dpg1) {
                                if (m030.O0 == dpg1VarS.n()) {
                                    return;
                                }
                            }
                            if ((((pim0) dpg1VarS).c & 262144) != 0 && (dpg1VarS instanceof l5t)) {
                                int i = 0;
                                for (dpg1 dpg1Var2 = ((l5t) dpg1VarS).P0; dpg1Var2 != null; dpg1Var2 = ((pim0) dpg1Var2).f) {
                                    if ((((pim0) dpg1Var2).c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dpg1VarS = dpg1Var2;
                                        } else {
                                            if (bfn0Var == null) {
                                                bfn0Var = new bfn0(0, new pim0[16]);
                                            }
                                            if (dpg1VarS != null) {
                                                bfn0Var.b(dpg1VarS);
                                                dpg1VarS = null;
                                            }
                                            bfn0Var.b(dpg1Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            dpg1VarS = oap1.s(bfn0Var);
                        }
                    }
                    dpg1Var = ((pim0) dpg1Var).e;
                }
            }
            hmb0VarB = hmb0VarB.v();
            dpg1Var = (hmb0VarB == null || (jdo0Var = hmb0VarB.e1) == null) ? null : (gpd1) jdo0Var.f;
        }
    }

    public static final String t(int i, Resources resources) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return resources.getString(2131956067);
        }
        if (iC == 1) {
            return resources.getString(2131956069);
        }
        if (iC == 2) {
            return resources.getString(2131956066);
        }
        eg.o();
        return null;
    }

    public static final sia0 u(l3b0 l3b0Var) {
        return ulo1.q(l3b0Var.r, sia0.c);
    }

    public static final oja0 v(w3b0 w3b0Var) {
        return ulo1.q(w3b0Var.o, oja0.g);
    }

    public static final ia00 w(h6w h6wVar) {
        return n3o1.q(h6wVar).a(bnx0.b, cnx0.b);
    }

    public static final boolean x(Uri uri) {
        String schemeSpecificPart;
        return u890.j(uri.getScheme(), "spotify") && (schemeSpecificPart = uri.getSchemeSpecificPart()) != null && nhc1.Y(schemeSpecificPart, "nl:", false);
    }

    public static Set y(String str) {
        List listX;
        Pattern patternCompile = Pattern.compile("[,\\s]+");
        int iEnd = 0;
        ihc1.N0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listX = arrayList;
        } else {
            listX = k4p1.x(str.toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listX) {
            if (!ihc1.y0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Locale localeForLanguageTag = Locale.forLanguageTag((String) it.next());
            String strI = "Thai";
            if (!u890.j(localeForLanguageTag.getLanguage(), "th") && !u890.j(localeForLanguageTag.getScript(), "Thai")) {
                strI = "Deva";
                if (!u890.j(localeForLanguageTag.getLanguage(), "hi") && !u890.j(localeForLanguageTag.getScript(), "Deva")) {
                    strI = localeForLanguageTag.getScript().length() > 0 ? xcg1.i(localeForLanguageTag.getLanguage(), "-", localeForLanguageTag.getScript()) : localeForLanguageTag.getLanguage();
                }
            }
            arrayList3.add(strI);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            String str2 = (String) obj2;
            str2.getClass();
            if (str2.length() > 0) {
                arrayList4.add(obj2);
            }
        }
        return o7h.p1(arrayList4);
    }

    public static final Observable z(rzq rzqVar) {
        return Observable.create(new lqr(rzqVar, (byte) 20)).distinctUntilChanged();
    }
}
