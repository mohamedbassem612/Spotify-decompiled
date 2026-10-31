package p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class a8o {
    public static xto1 a;
    public static b180 b;
    public static b180 c;

    public static final boolean A(long j) {
        return !z4h1.b(j, u7h.j) && ((double) z4p1.B(j)) <= 0.5d;
    }

    public static final boolean B(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object C(n381 n381Var, List list, String str, onm onmVar) {
        v6f0 v6f0Var;
        ox91 m231Var;
        if (onmVar instanceof v6f0) {
            v6f0Var = (v6f0) onmVar;
            int i = v6f0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                v6f0Var.b = i - Integer.MIN_VALUE;
            } else {
                v6f0Var = new v6f0(onmVar);
            }
        } else {
            v6f0Var = new v6f0(onmVar);
        }
        Object objJ = v6f0Var.a;
        int i2 = v6f0Var.b;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new n6f0((String) it.next(), str));
                }
                Single map = rca.D((rca) n381Var.b, new y6f0(arrayList), (fq21) null, 2, (Object) null).map(new n801(n381Var, (byte) 29));
                v6f0Var.b = 1;
                objJ = fc11.j(map, v6f0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            m231Var = (ox91) objJ;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (!(m231Var instanceof m231)) {
            ox91 ox91Var = m231Var;
            boolean z = ox91Var instanceof mx91;
            ox91 ox91Var2 = p6f0.a;
            if (z) {
                m231Var = ox91Var2;
            } else {
                if (!(ox91Var instanceof nx91)) {
                    eg.o();
                    return null;
                }
                List list3 = ((b7f0) ((nx91) ox91Var).a).a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list3) {
                    if (((c8u) obj).b != null) {
                        arrayList2.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList2) {
                    String str2 = ((c8u) obj2).a;
                    Object objH = linkedHashMap.get(str2);
                    if (objH == null) {
                        objH = cfm0.h(str2, linkedHashMap);
                    }
                    ((List) objH).add(obj2);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    Iterable<c8u> iterable = (Iterable) entry.getValue();
                    ArrayList arrayList3 = new ArrayList(q7h.U(iterable, 10));
                    for (c8u c8uVar : iterable) {
                        String str3 = c8uVar.b;
                        str3.getClass();
                        arrayList3.add(new q6f0(str3, c8uVar.c));
                    }
                    linkedHashMap2.put(key, arrayList3);
                }
                ox91 r6f0Var = linkedHashMap2.isEmpty() ? null : new r6f0(linkedHashMap2);
                if (r6f0Var != null) {
                    m231Var = r6f0Var;
                } else {
                    m231Var = ox91Var2;
                }
            }
        }
        Throwable thA = e331.a(m231Var);
        return thA == null ? (s6f0) m231Var : new o6f0(thA);
    }

    public static final qim0 D(qim0 qim0Var, Function0 function0) {
        return qim0Var.then(new xqd1(function0));
    }

    public static Next E(kak0 kak0Var, z2k0 z2k0Var) {
        return Next.i(kak0.a(kak0Var, (pdm0) null, (Boolean) null, (ycu0) null, (lhg1) null, (lhg1) null, (lhg1) null, (xx8) null, (List) null, (List) null, (Float) null, (lhg1) null, (lhg1) null, (lhg1) null, (String) null, (String) null, (lhg1) null, (m8w0) null, false, 0, 0, 0, giq0.a, (uia) null, (uia) null, (Float) null, (Float) null, (Float) null, (Float) null, false, false, (String) null, false, (lhg1) null, (Boolean) null, (Integer) null, (lyj0) null, 0L, (Integer) null, (Integer) null, -1, 1048574), Collections.singleton(new q0k0(z2k0Var.b, true)));
    }

    public static final void a(mdb1 mdb1Var, xfx xfxVar, cce cceVar, sp00 sp00Var, v1k v1kVar, v1k v1kVar2, FlowableObserveOn flowableObserveOn, fbm fbmVar, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-960935233);
        int i2 = i | (x340Var.i(mdb1Var) ? 4 : 2) | (x340Var.i(xfxVar) ? 32 : 16) | (x340Var.i(cceVar) ? 256 : 128) | (x340Var.i(sp00Var) ? 2048 : 1024) | (x340Var.i(v1kVar) ? 16384 : 8192) | (x340Var.i(v1kVar2) ? 131072 : 65536) | (x340Var.i(flowableObserveOn) ? 1048576 : 524288) | (x340Var.i(fbmVar) ? 8388608 : 4194304) | 100663296;
        if (x340Var.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            float fM = dsa0.m(x340Var, 2131167119);
            float fM2 = dsa0.m(x340Var, 2131165904);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.j(dsa0.m(x340Var, 2131167029), 0.0f, 2, u291.f(qim0Var3, 1.0f)), fM2, fM2 / 3.0f, fM2, 0.0f, 8);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
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
            x340Var.i0(390138119);
            x340Var.r(false);
            boolean z = (i2 & 896) == 256 || x340Var.g(cceVar);
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new hf2((a62) cceVar.b, (mwn0) cceVar.c, (hnl) cceVar.d, false);
                x340Var.s0(objT);
            }
            qim0 qim0VarR = u291.r(qim0Var3, fM);
            rih1 rih1Var = rih1.a;
            otw.c((xpw) objT, rih1Var, qim0VarR, (ipb1) null, x340Var, 48, 8);
            boolean zG = x340Var.g(v1kVar) | x340Var.g(xfxVar);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = q1o1.u(v1kVar.e(voo1.l(xfxVar)), (qim0) null, new FrameLayout.LayoutParams(-1, -2), 3);
                x340Var.s0(objT2);
            }
            otw.c((xpw) objT2, rih1Var, new wnb0(1.0f, true), (ipb1) null, x340Var, 48, 8);
            boolean zG2 = x340Var.g(v1kVar2) | x340Var.g(xfxVar);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = q1o1.u(v1kVar2.f(flowableObserveOn, fbmVar, voo1.m(xfxVar)), (qim0) null, (FrameLayout.LayoutParams) null, 7);
                x340Var.s0(objT3);
            }
            otw.c((xpw) objT3, rih1Var, u291.r(qim0Var3, fM), (ipb1) null, x340Var, 48, 8);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zx(mdb1Var, xfxVar, cceVar, sp00Var, v1kVar, v1kVar2, flowableObserveOn, fbmVar, qim0Var2, i, (byte) 1);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        qim0 qim0Var2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1242847833);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            qim0Var2 = qim0Var;
            i2 |= b0kVar3.i(qim0Var2) ? 256 : 128;
        } else {
            qim0Var2 = qim0Var;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            ncf0 ncf0VarG = h5p1.G(new pcf0(str), str, (xu30) null, b0kVar3, (i2 << 12) & 57344, 46);
            b0kVar2 = b0kVar3;
            mp10.e(ncf0VarG.c(), grn1.v(ncf0VarG.c(), z, b0kVar3, i2 & 112), qim0Var2, false, false, false, null, false, null, een.h, mif1.P0, false, false, null, null, false, b0kVar2, i2 & 896, 0, 63992);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ryh(str, z, qim0Var, i, (byte) 4);
        }
    }

    public static final void c(ma90 ma90Var, float f, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        ma90 ma90Var2 = ma90Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1277712898);
        int i2 = i | (x340Var2.g(ma90Var2) ? 4 : 2) | (x340Var2.d(f) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(qim0Var) ? 2048 : 1024);
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            m5r0 m5r0Var = ma90Var2.d;
            boolean z = f > 0.95f;
            mbh mbhVarA = jbh.a(new d36(48.0f, true, new um5(false)), een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            qim0 qim0VarO = grn1.o(grn1.z(f), f);
            String str = m5r0Var.b;
            uwr uwrVar = cbx.a;
            boolean z2 = z;
            uwo1.e(str, qim0VarO, lee1.a(cbx.d(x340Var2).g, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, yah.a, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), cbx.a(x340Var2).b.a, new a0e1(3), (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, x340Var2, 0, 0, 1696);
            qim0 qim0VarO2 = grn1.o(grn1.z(f), f);
            boolean zH = x340Var2.h(z2) | ((i2 & 896) == 256);
            Object objT = x340Var2.T();
            if (zH || objT == fkj0.X) {
                objT = new y96(z2, function0, (byte) 5);
                x340Var2.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            ma90Var2 = ma90Var;
            foo1.c(gbxVar, ma90Var2.b ? jdx.c : new idx(), qim0VarO2, (max) null, yla.r(x340Var2), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1944533453, new jj50(m5r0Var, ma90Var2, (byte) 24), x340Var2), x340Var2, 0, 48, 2008);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ys(ma90Var2, f, function0, qim0Var, i, (byte) 7);
        }
    }

    public static final void d(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-173759563);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
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
            ldx ldxVar = ldx.c;
            gdx gdxVarR = yla.r(x340Var);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j160(function0, (byte) 20);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, (qim0) null, (max) null, gdxVarR, (vzq0) null, false, (idn0) null, (ga80) null, eti.a, x340Var, 0, 6, 988);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 16);
        }
    }

    public static final void e(ma90 ma90Var, boolean z, Function0 function0, iu30 iu30Var, Function0 function1, b0k b0kVar, int i) {
        int i2;
        m5r0 m5r0Var = ma90Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-795922770);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(ma90Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function1) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if (m5r0Var.g.length() > 0) {
                x340Var.i0(1179428866);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT);
                }
                c9n c9nVar = (c9n) objT;
                boolean zI = x340Var.i(c9nVar) | x340Var.i(iu30Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new qb90(c9nVar, iu30Var, (byte) 0);
                    x340Var.s0(objT2);
                }
                cso1.k(rih1.a, (iac0) null, (iu30) objT2, x340Var, 6);
                x340Var.r(false);
            } else {
                x340Var.i0(1179569172);
                x340Var.r(false);
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(u291.d(nim0Var, 1.0f), yah.a, d4o1.a);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
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
            b(i2 & 112, m5r0Var.f, x340Var, u291.d(nim0Var, 1.0f), z);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarX = uyn1.x(too1.y(qim0VarF2, lhc.g(x340Var).f), 24.0f);
            h2c h2cVar = h2c.a;
            d((i2 >> 6) & 14, function0, x340Var, h2cVar.a(qim0VarX, graVar));
            uwr uwrVar = cbx.a;
            float fU = grn1.u(3500, irn1.o0(400, 0, ((jhx) cbx.c(x340Var).a.b).b, 2), z, x340Var, ((i2 << 3) & 896) | 6);
            g(384, apo.r(-516284004, new b470(ma90Var, fU, function1), x340Var), x340Var, uyn1.B(h2cVar.a(u291.c(u291.f(nim0Var, 1.0f), 0.4f), een.X), 24.0f, 0.0f, 24.0f, 48.0f, 2), fU >= 1.0f);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(ma90Var, z, function0, iu30Var, function1, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void f(ArrayList arrayList, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        byte b2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1744834185);
        int i2 = (x340Var.i(arrayList) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            String strO0 = cwl1.o0(x340Var, 2131952905);
            lee1 lee1Var = cbx.d(x340Var).h;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = xuv0.e1;
                x340Var.s0(objT);
            }
            uwo1.e(strO0, s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            x340Var = x340Var;
            x340Var.i0(1468708015);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g9w0 g9w0Var = (k9w0) it.next();
                if (g9w0Var instanceof f9w0) {
                    x340Var.i0(1650646031);
                    f9w0 f9w0Var = (f9w0) g9w0Var;
                    r(f9w0Var.a, f9w0Var.b, null, x340Var, 0, 4);
                    x340Var.r(false);
                } else if (g9w0Var instanceof g9w0) {
                    x340Var.i0(1650648655);
                    g9w0 g9w0Var2 = g9w0Var;
                    r(g9w0Var2.a, g9w0Var2.b, null, x340Var, 0, 4);
                    x340Var.r(false);
                } else if (g9w0Var instanceof i9w0) {
                    x340Var.i0(1650651215);
                    i9w0 i9w0Var = (i9w0) g9w0Var;
                    r(i9w0Var.a, i9w0Var.b, null, x340Var, 0, 4);
                    x340Var.r(false);
                } else if (g9w0Var instanceof h9w0) {
                    x340Var.i0(1650654446);
                    h9w0 h9w0Var = (h9w0) g9w0Var;
                    String str = h9w0Var.a;
                    String str2 = h9w0Var.b;
                    ArrayList arrayList2 = h9w0Var.c;
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((e311) it2.next()).f);
                    }
                    r(str, str2, arrayList3, x340Var, 0, 0);
                    x340Var.r(false);
                } else {
                    if (!(g9w0Var instanceof j9w0)) {
                        throw p3d1.k(x340Var, 1650644646, false);
                    }
                    x340Var.i0(1650658092);
                    x340Var.r(false);
                }
            }
            x340Var.r(false);
            b2 = 1;
            x340Var.r(true);
        } else {
            b2 = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pwu0(arrayList, i, b2);
        }
    }

    public static final void g(int i, j2i j2iVar, b0k b0kVar, qim0 qim0Var, boolean z) {
        j2i j2iVar2;
        qim0 qim0Var2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1919303903);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            j2iVar2 = j2iVar;
            z2 = z;
            qim0Var2 = qim0Var;
            w2g0.c(qim0Var2, (tl3) null, apo.r(618932363, new o3(z2, l6o1.C(0, 0, 1, x340Var), false, j2iVar2, (byte) 20), x340Var), x340Var, (i2 & 14) | 3072, 6);
        } else {
            j2iVar2 = j2iVar;
            qim0Var2 = qim0Var;
            z2 = z;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rbh(i, j2iVar2, qim0Var2, z2);
        }
    }

    public static final void h(hux huxVar, String str, b0k b0kVar, int i) {
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(236116050);
        int i2 = i | ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var).b.b, 0L, false, x340Var, 56 | (i2 & 14), 48);
            str2 = str;
            uwo1.e(str2, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 2034);
            x340Var.r(true);
        } else {
            str2 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new grc(huxVar, str2, i, (byte) 5);
        }
    }

    public static final void i(final Function0 function0, final long j, final eem0 eem0Var, final o95 o95Var, final j2i j2iVar, b0k b0kVar, final int i) {
        int i2;
        long j2;
        eem0 eem0Var2;
        Enum r6;
        boolean z;
        boolean z2;
        Object obj;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(766784632);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= x340Var.f(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            eem0Var2 = eem0Var;
            i2 |= x340Var.g(eem0Var2) ? 256 : 128;
        } else {
            eem0Var2 = eem0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(o95Var) : x340Var.i(o95Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(j2iVar) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            wat watVar = (wat) x340Var.k(t4k.h);
            Enum r5 = (flb0) x340Var.k(t4k.n);
            v340 v340VarU = tgp1.u(x340Var);
            ven0 ven0VarS = v8r.s(j2iVar, x340Var);
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            Object obj2 = fkj0.X;
            if (objT == obj2) {
                objT = new el70((byte) 15);
                x340Var.s0(objT);
            }
            UUID uuid = (UUID) k5p1.s(objArr, (Function0) objT, x340Var, 48);
            Object objT2 = x340Var.T();
            if (objT2 == obj2) {
                objT2 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            boolean zG = x340Var.g(view) | x340Var.g(watVar);
            Object objT3 = x340Var.T();
            if (zG || objT3 == obj2) {
                r6 = r5;
                z = true;
                z2 = false;
                tdm0 tdm0Var = new tdm0(function0, eem0Var2, j2, view, r6, watVar, uuid, o95Var, c9nVar);
                j2i j2iVar2 = new j2i(-1051373467, new x94(ven0VarS, (byte) 8), true);
                qdm0 qdm0Var = tdm0Var.h;
                qdm0Var.setParentCompositionContext(v340VarU);
                qdm0Var.O0.setValue(j2iVar2);
                qdm0Var.P0 = true;
                qdm0Var.k();
                x340Var.s0(tdm0Var);
                obj = tdm0Var;
            } else {
                r6 = r5;
                z = true;
                z2 = false;
                obj = objT3;
            }
            final tdm0 tdm0Var2 = (tdm0) obj;
            boolean zI = x340Var.i(tdm0Var2);
            Object objT4 = x340Var.T();
            if (zI || objT4 == obj2) {
                objT4 = new gv20(tdm0Var2, (byte) 25);
                x340Var.s0(objT4);
            }
            qxd0.i(tdm0Var2, (iu30) objT4, x340Var);
            int i3 = i2;
            boolean zI2 = x340Var.i(tdm0Var2) | ((i3 & 14) == 4 ? z : z2) | ((i3 & 896) == 256 ? z : z2) | ((i3 & 112) == 32 ? z : z2) | x340Var.e(r6.ordinal());
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == obj2) {
                final Enum r7 = r6;
                objT5 = new Function0() { // from class: p.fem0
                    public final Object invoke() {
                        tdm0Var2.d(function0, eem0Var, j, r7);
                        return rih1.a;
                    }
                };
                x340Var.s0(objT5);
            }
            qxd0.S((Function0) objT5, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.gem0
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    a8o.i(function0, j, eem0Var, o95Var, j2iVar, (b0k) obj3, czo1.p(i | 1));
                    return rih1.a;
                }
            };
        }
    }

    public static final void j(t7w0 t7w0Var, s8w0 s8w0Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-643025272);
        int i2 = (b0kVar3.i(t7w0Var) ? 4 : 2) | i | (b0kVar3.i(s8w0Var) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(function1) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            nyx.a(0, (wux) null, apo.r(1992461595, new e9g0(function1, t7w0Var, function0, t7w0Var.a, s8w0Var, (byte) 27), b0kVar3), b0kVar2, 3072, 7);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, t7w0Var, s8w0Var, function0, function1, (byte) 25);
        }
    }

    public static final void k(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        int i2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1258863555);
        int i4 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            if (z) {
                i2 = -1412896185;
                i3 = 2131952903;
            } else {
                i2 = -1412893685;
                i3 = 2131952904;
            }
            String strK = x0d.k(x340Var, i2, i3, x340Var, false);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            qim0 qim0VarA = uyn1.A(dug.e(u291.f(qim0Var, 1.0f), v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(jA, 0.0f, 0.0f, 0.0f, 0.0f, 14)), new u7h(jA)}), 0.0f, ((wat) x340Var.k(t4k.h)).X0(32.0f), 10), (hw61) null, 0.0f, 6), cbx.b(x340Var).e.b, 32.0f, cbx.b(x340Var).e.b, cbx.b(x340Var).e.b);
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
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            if (ihc1.y0(strK)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strK), function0), new idx(4), qim0VarF, z ? new hax(strK) : jax.a, yla.r(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(3883614, new mv8(z, strK, (byte) 8), x340Var), x340Var, 0, 48, 1992);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(z, function0, qim0Var, i, (byte) 18);
        }
    }

    public static final void l(e9w0 e9w0Var, b0k b0kVar, int i) {
        byte b2;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1800647913);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.i(e9w0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean zA = ef.b(x340Var).a();
            nim0 nim0Var = nim0.a;
            n4k n4kVar = hmb0.t1;
            if (zA) {
                x340Var.i0(-1039430048);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar4);
                nko1.H(xos0VarM, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, lljVar);
                int i3 = i2 & 14;
                m(e9w0Var, x340Var, i3);
                n(e9w0Var, u291.f(nim0Var, 1.0f), x340Var, i3);
                x340Var.r(true);
                x340Var.r(false);
                b2 = 0;
            } else {
                x340Var.i0(-1039175569);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(16.0f, true, new um5(false)), een.N0, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, lljVar2);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar);
                int i4 = i2 & 14;
                m(e9w0Var, x340Var, i4);
                n(e9w0Var, new wnb0(1.0f, true), x340Var, i4);
                x340Var.r(true);
                b2 = 0;
                x340Var.r(false);
            }
        } else {
            b2 = 0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o7w0(e9w0Var, i, b2);
        }
    }

    public static final void m(e9w0 e9w0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(964206153);
        int i2 = (x340Var.i(e9w0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String str = e9w0Var.e;
            if (str == null) {
                x340Var.i0(-75686715);
                x340Var.r(false);
            } else {
                x340Var.i0(-75686714);
                Uri uri = Uri.parse(str);
                qim0 qim0VarR = u291.r(nim0.a, 120.0f);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                eso1.e(uri, isl.a, i1p1.q(qim0VarR, er31.b(6.0f)), null, null, null, null, null, null, null, false, false, x340Var, 24624, 0, 4072);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o7w0(e9w0Var, i, (byte) 1);
        }
    }

    public static final void n(e9w0 e9w0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1556689929);
        int i2 = (x340Var.i(e9w0Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var, 0);
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
            String str = e9w0Var.b;
            lee1 lee1Var = cbx.d(x340Var).d;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = p7w0.b;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(nim0.a, false, (iu30) objT), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            p(x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hws0(e9w0Var, qim0Var, i, (byte) 23);
        }
    }

    public static final void o(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1570168597);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else if (z) {
            x340Var.i0(403992458);
            uwr uwrVar = cbx.a;
            uwo1.e(str, u291.f(qim0Var, 1.0f), lee1.a(cbx.d(x340Var).m, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, yah.a, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16775167), 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i2 >> 3) & 14, 0, 2024);
            x340Var.r(false);
        } else {
            x340Var.i0(404183821);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ltj(z, str, qim0Var, i, (byte) 2);
        }
    }

    public static final void p(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1573512782);
        if (x340Var.Y(i & 1, i != 0)) {
            String strO0 = cwl1.o0(x340Var, 2131952909);
            String strN0 = cwl1.n0(2131952908, new Object[]{strO0}, x340Var);
            int iW0 = ihc1.w0(strN0, strO0, 0, false, 6);
            ye5 ye5VarO = kk0.o(-317285704, x340Var);
            if (iW0 < 0) {
                x340Var.i0(-2057704843);
                x340Var.r(false);
                ye5VarO.g(strN0);
            } else {
                x340Var.i0(-2057654964);
                ye5VarO.g(strN0.substring(0, iW0));
                uwr uwrVar = cbx.a;
                int iO = ye5VarO.o(new zma1(cbx.a(x340Var).b.a, 0L, cbx.d(x340Var).k.a.c, (FontStyle) null, (FontSynthesis) null, cbx.d(x340Var).k.a.f, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65498));
                try {
                    ye5VarO.g(strO0);
                    ye5VarO.k(iO);
                    ye5VarO.g(strN0.substring(strO0.length() + iW0));
                    x340Var.r(false);
                } catch (Throwable th) {
                    ye5VarO.k(iO);
                    throw th;
                }
            }
            af5 af5VarP = ye5VarO.p();
            x340Var.r(false);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            wsx wsxVar = wsx.c;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(wsxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var).c.c, 0L, false, x340Var, wsx.d | 48, 48);
            uwo1.d(af5VarP, cbx.a(x340Var).b.b, (qim0) null, cbx.d(x340Var).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var, 0, 0, 4084);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xgr0(i, (byte) 15);
        }
    }

    public static final void q(vnr0 vnr0Var, yk31 yk31Var, boolean z, String str, String str2, dzo1 dzo1Var, kj31 kj31Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1096645188);
        int i2 = i | (x340Var.i(vnr0Var) ? 4 : 2) | (x340Var.g(yk31Var) ? 32 : 16) | (x340Var.d(61.5f) ? 256 : 128) | (x340Var.d(0.58f) ? 2048 : 1024) | (x340Var.h(z) ? 16384 : 8192) | (x340Var.d(16.0f) ? 131072 : 65536) | (x340Var.g(str) ? 1048576 : 524288) | (x340Var.g(str2) ? 8388608 : 4194304) | (x340Var.g(dzo1Var) ? 67108864 : 33554432) | (x340Var.i(kj31Var) ? 536870912 : 268435456);
        int i3 = 6 | (x340Var.i(function0) ? ' ' : (char) 16);
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            int iA = (int) (((crl1) x340Var.k(t4k.u)).a() & 4294967295L);
            boolean zE = x340Var.e(iA) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864) | ((i3 & 112) == 32) | x340Var.i(idn0Var) | ((i2 & 112) == 32) | ((57344 & i2) == 16384) | x340Var.i(kj31Var) | ((i2 & 14) == 4 || x340Var.i(vnr0Var)) | ((3670016 & i2) == 1048576) | ((i2 & 458752) == 131072);
            Object objT2 = x340Var.T();
            if (zE || objT2 == m4cVar) {
                ob8 ob8Var = new ob8(iA, str, str2, dzo1Var, function0, idn0Var, yk31Var, z, kj31Var, vnr0Var);
                x340Var.s0(ob8Var);
                objT2 = ob8Var;
            }
            qim0 qim0Var3 = nim0.a;
            ejo1.l(6, 0, x340Var, (vu30) objT2, qim0Var3);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qw1(vnr0Var, yk31Var, z, str, str2, dzo1Var, kj31Var, qim0Var2, function0, i);
        }
    }

    public static final void r(String str, String str2, List list, b0k b0kVar, int i, int i2) {
        List list2;
        int i3;
        List list3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1074290777);
        j06 j06Var = x340Var.a;
        int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            list2 = list;
        } else {
            list2 = list;
            i3 = i4 | (x340Var.g(list2) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            List list4 = i5 != 0 ? z6x.a : list2;
            List listM = p7h.M(new String[]{str, str2});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
            String strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
            boolean zG = x340Var.g(strY0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new zqu0(strY0, (byte) 11);
                x340Var.s0(objT);
            }
            qim0 qim0VarA = s161.a(nim0.a, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            int i6 = i3;
            List list5 = list4;
            uwo1.e("•", (qim0) null, cbx.d(x340Var).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 6, 0, 2042);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(2.0f, true, new um5(false)), een.P0, x340Var, 0);
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
            cvx cvxVar3 = cbx.b(x340Var).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            cvx cvxVar4 = cbx.b(x340Var).b;
            k5p1.d((qim0) null, d36Var, new d36(4.0f, true, new um5(false)), (pl3) null, 0, 0, apo.r(-231260984, new uf(str, list5, (byte) 2), x340Var), x340Var, 1572864, 57);
            uwo1.e(str2, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i6 >> 3) & 14, 0, 2034);
            x340Var.r(true);
            x340Var.r(true);
            list3 = list5;
        } else {
            x340Var.b0();
            list3 = list2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new r27(str, str2, list3, i, i2, (byte) 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x0140  */
    /* JADX WARN: Code duplicated, block: B:59:0x0142  */
    /* JADX WARN: Code duplicated, block: B:62:0x0149  */
    /* JADX WARN: Code duplicated, block: B:64:0x014d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0190  */
    /* JADX WARN: Code duplicated, block: B:68:0x0195  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void s(Function0 function0, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        int i4;
        xu30 xu30Var2;
        int i5;
        boolean z;
        qim0 qim0Var3;
        xu30 xu30Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        qim0 qim0Var5;
        xu30 xu30Var4;
        float f;
        u85 u85Var;
        jw31 jw31VarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z2;
        Object objT;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1548292000);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    xu30Var2 = xu30Var;
                    if (x340Var.i(xu30Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i3 & 1, z)) {
                    qim0Var4 = nim0.a;
                    if (i6 != 0) {
                        qim0Var5 = qim0Var4;
                    } else {
                        qim0Var5 = qim0Var2;
                    }
                    if (i4 != 0) {
                        xu30Var4 = pnj.a;
                    } else {
                        xu30Var4 = xu30Var2;
                    }
                    f = ((p3v) x340Var.k(jw80.c)).a;
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var).g;
                    float fAbs = Math.abs(((f - 24.0f) / 2.0f) - cbx.b(x340Var).b.a);
                    qim0 qim0VarF = u291.f(qim0Var5, 1.0f);
                    u85Var = (erl1) x340Var.k(szf0.b);
                    if (u85Var == null) {
                        x340Var.i0(-241884180);
                        WeakHashMap weakHashMap = osl1.x;
                        u85Var = lhc.g(x340Var).g;
                    } else {
                        x340Var.i0(-241885792);
                    }
                    x340Var.r(false);
                    qim0 qim0VarB = uyn1.B(too1.y(qim0VarF, new bgc0(u85Var, 16)), 0.0f, 0.0f, fAbs, 0.0f, 11);
                    jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
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
                    nko1.H(jw31VarA, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    Integer numValueOf = Integer.valueOf(((i3 >> 3) & 112) | 6);
                    pw31 pw31Var = pw31.a;
                    xu30Var4.invoke(pw31Var, x340Var, numValueOf);
                    op71.g(x340Var, pw31Var.a(1.0f, qim0Var4, true));
                    ldx ldxVar = ldx.c;
                    if ((i3 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objT = x340Var.T();
                    if (z2 || objT == fkj0.X) {
                        objT = new uuc1(function0, (byte) 15);
                        x340Var.s0(objT);
                    }
                    wro1.h(new gbx(z50.c, (Function0) objT), ldxVar, u291.r(qim0Var4, f), (max) null, (gdx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), false, (idn0) null, (ga80) null, apo.r(1002853509, new rvd1((byte) 6, 2, false), x340Var), x340Var, 0, 6, 952);
                    x340Var.r(true);
                    xu30Var3 = xu30Var4;
                    qim0Var3 = qim0Var5;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    xu30Var3 = xu30Var2;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new qx1(function0, qim0Var3, xu30Var3, i, i2, (byte) 23);
                }
            }
            i3 |= 384;
            xu30Var2 = xu30Var;
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i6 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                if (i4 != 0) {
                    xu30Var4 = pnj.a;
                } else {
                    xu30Var4 = xu30Var2;
                }
                f = ((p3v) x340Var.k(jw80.c)).a;
                uwr uwrVar2 = cbx.a;
                zov0 zov0Var2 = cbx.b(x340Var).g;
                float fAbs2 = Math.abs(((f - 24.0f) / 2.0f) - cbx.b(x340Var).b.a);
                qim0 qim0VarF2 = u291.f(qim0Var5, 1.0f);
                u85Var = (erl1) x340Var.k(szf0.b);
                if (u85Var == null) {
                    x340Var.i0(-241884180);
                    WeakHashMap weakHashMap2 = osl1.x;
                    u85Var = lhc.g(x340Var).g;
                } else {
                    x340Var.i0(-241885792);
                }
                x340Var.r(false);
                qim0 qim0VarB2 = uyn1.B(too1.y(qim0VarF2, new bgc0(u85Var, 16)), 0.0f, 0.0f, fAbs2, 0.0f, 11);
                jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                Integer numValueOf2 = Integer.valueOf(((i3 >> 3) & 112) | 6);
                pw31 pw31Var2 = pw31.a;
                xu30Var4.invoke(pw31Var2, x340Var, numValueOf2);
                op71.g(x340Var, pw31Var2.a(1.0f, qim0Var4, true));
                ldx ldxVar2 = ldx.c;
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = x340Var.T();
                if (z2) {
                    objT = new uuc1(function0, (byte) 15);
                    x340Var.s0(objT);
                } else {
                    objT = new uuc1(function0, (byte) 15);
                    x340Var.s0(objT);
                }
                wro1.h(new gbx(z50.c, (Function0) objT), ldxVar2, u291.r(qim0Var4, f), (max) null, (gdx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), false, (idn0) null, (ga80) null, apo.r(1002853509, new rvd1((byte) 6, 2, false), x340Var), x340Var, 0, 6, 952);
                x340Var.r(true);
                xu30Var3 = xu30Var4;
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                xu30Var3 = xu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1(function0, qim0Var3, xu30Var3, i, i2, (byte) 23);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                xu30Var2 = xu30Var;
                if (x340Var.i(xu30Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i6 != 0) {
                    qim0Var5 = qim0Var4;
                } else {
                    qim0Var5 = qim0Var2;
                }
                if (i4 != 0) {
                    xu30Var4 = pnj.a;
                } else {
                    xu30Var4 = xu30Var2;
                }
                f = ((p3v) x340Var.k(jw80.c)).a;
                uwr uwrVar3 = cbx.a;
                zov0 zov0Var3 = cbx.b(x340Var).g;
                float fAbs3 = Math.abs(((f - 24.0f) / 2.0f) - cbx.b(x340Var).b.a);
                qim0 qim0VarF3 = u291.f(qim0Var5, 1.0f);
                u85Var = (erl1) x340Var.k(szf0.b);
                if (u85Var == null) {
                    x340Var.i0(-241884180);
                    WeakHashMap weakHashMap3 = osl1.x;
                    u85Var = lhc.g(x340Var).g;
                } else {
                    x340Var.i0(-241885792);
                }
                x340Var.r(false);
                qim0 qim0VarB3 = uyn1.B(too1.y(qim0VarF3, new bgc0(u85Var, 16)), 0.0f, 0.0f, fAbs3, 0.0f, 11);
                jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarB3);
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
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                Integer numValueOf3 = Integer.valueOf(((i3 >> 3) & 112) | 6);
                pw31 pw31Var3 = pw31.a;
                xu30Var4.invoke(pw31Var3, x340Var, numValueOf3);
                op71.g(x340Var, pw31Var3.a(1.0f, qim0Var4, true));
                ldx ldxVar3 = ldx.c;
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objT = x340Var.T();
                if (z2) {
                    objT = new uuc1(function0, (byte) 15);
                    x340Var.s0(objT);
                } else {
                    objT = new uuc1(function0, (byte) 15);
                    x340Var.s0(objT);
                }
                wro1.h(new gbx(z50.c, (Function0) objT), ldxVar3, u291.r(qim0Var4, f), (max) null, (gdx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), false, (idn0) null, (ga80) null, apo.r(1002853509, new rvd1((byte) 6, 2, false), x340Var), x340Var, 0, 6, 952);
                x340Var.r(true);
                xu30Var3 = xu30Var4;
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                xu30Var3 = xu30Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1(function0, qim0Var3, xu30Var3, i, i2, (byte) 23);
            }
        }
        i3 |= 384;
        xu30Var2 = xu30Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            qim0Var4 = nim0.a;
            if (i6 != 0) {
                qim0Var5 = qim0Var4;
            } else {
                qim0Var5 = qim0Var2;
            }
            if (i4 != 0) {
                xu30Var4 = pnj.a;
            } else {
                xu30Var4 = xu30Var2;
            }
            f = ((p3v) x340Var.k(jw80.c)).a;
            uwr uwrVar4 = cbx.a;
            zov0 zov0Var4 = cbx.b(x340Var).g;
            float fAbs4 = Math.abs(((f - 24.0f) / 2.0f) - cbx.b(x340Var).b.a);
            qim0 qim0VarF4 = u291.f(qim0Var5, 1.0f);
            u85Var = (erl1) x340Var.k(szf0.b);
            if (u85Var == null) {
                x340Var.i0(-241884180);
                WeakHashMap weakHashMap4 = osl1.x;
                u85Var = lhc.g(x340Var).g;
            } else {
                x340Var.i0(-241885792);
            }
            x340Var.r(false);
            qim0 qim0VarB4 = uyn1.B(too1.y(qim0VarF4, new bgc0(u85Var, 16)), 0.0f, 0.0f, fAbs4, 0.0f, 11);
            jw31VarA = ew31.a(h36.g, een.N0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarB4);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Integer numValueOf4 = Integer.valueOf(((i3 >> 3) & 112) | 6);
            pw31 pw31Var4 = pw31.a;
            xu30Var4.invoke(pw31Var4, x340Var, numValueOf4);
            op71.g(x340Var, pw31Var4.a(1.0f, qim0Var4, true));
            ldx ldxVar4 = ldx.c;
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            objT = x340Var.T();
            if (z2) {
                objT = new uuc1(function0, (byte) 15);
                x340Var.s0(objT);
            } else {
                objT = new uuc1(function0, (byte) 15);
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldxVar4, u291.r(qim0Var4, f), (max) null, (gdx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), false, (idn0) null, (ga80) null, apo.r(1002853509, new rvd1((byte) 6, 2, false), x340Var), x340Var, 0, 6, 952);
            x340Var.r(true);
            xu30Var3 = xu30Var4;
            qim0Var3 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            xu30Var3 = xu30Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1(function0, qim0Var3, xu30Var3, i, i2, (byte) 23);
        }
    }

    public static final void t(cce cceVar, ybl1 ybl1Var, o0i o0iVar, boolean z, boolean z2, int i, int i2, Function0 function0, Function0 function1, Function0 function2, Function0 function3, iu30 iu30Var, iu30 iu30Var2, Function0 function4, Function0 function5, ylv ylvVar, b0k b0kVar, int i3) {
        b0k b0kVar2;
        m4c m4cVar;
        Integer num;
        boolean z3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-531877743);
        int i4 = i3 | (b0kVar3.i(cceVar) ? 4 : 2) | (b0kVar3.g(ybl1Var) ? 32 : 16) | (b0kVar3.i(o0iVar) ? 256 : 128) | (b0kVar3.h(z) ? 2048 : 1024) | (b0kVar3.h(z2) ? 16384 : 8192) | (b0kVar3.e(i) ? 131072 : 65536) | (b0kVar3.e(i2) ? 1048576 : 524288) | (b0kVar3.i(function0) ? 8388608 : 4194304) | (b0kVar3.i(function1) ? 67108864 : 33554432) | (b0kVar3.i(function2) ? 536870912 : 268435456);
        if (b0kVar3.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (599187 & ((((((0 | (b0kVar3.i(function3) ? (char) 4 : (char) 2)) | (b0kVar3.i(iu30Var) ? ' ' : (char) 16)) | (b0kVar3.i(iu30Var2) ? 256 : 128)) | (b0kVar3.i(function4) ? (char) 2048 : (char) 1024)) | (b0kVar3.i(function5) ? (char) 16384 : (char) 8192)) | (b0kVar3.i(ylvVar) ? (char) 0 : (char) 0))) == 599186) ? false : true)) {
            Object objT = b0kVar3.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = bb00.h(i, b0kVar3);
            }
            hdn0 hdn0Var = (hdn0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar2) {
                objT2 = bb00.h(i2, b0kVar3);
            }
            hdn0 hdn0Var2 = (hdn0) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar2) {
                objT3 = new sfx0();
                b0kVar3.s0(objT3);
            }
            sfx0 sfx0Var = (sfx0) objT3;
            Object objT4 = b0kVar3.T();
            if (objT4 == m4cVar2) {
                objT4 = v8r.q(n511.e);
                b0kVar3.s0(objT4);
            }
            ven0 ven0Var = (ven0) objT4;
            kiv kivVar = t4k.h;
            float fX0 = ((wat) b0kVar3.k(kivVar)).X0(20.0f);
            Object objT5 = b0kVar3.T();
            if (objT5 == m4cVar2) {
                objT5 = yv91.a(new gj41(fX0, ven0Var));
                b0kVar3.s0(objT5);
            }
            tob1 tob1Var = (tob1) objT5;
            Integer numValueOf = Integer.valueOf(i);
            Integer numValueOf2 = Integer.valueOf(i2);
            boolean z4 = ((i4 & 458752) == 131072) | ((i4 & 3670016) == 1048576);
            Object objT6 = b0kVar3.T();
            if (z4 || objT6 == m4cVar2) {
                m4cVar = m4cVar2;
                num = numValueOf2;
                z3 = false;
                lyg0 lyg0Var = new lyg0(i, i2, hdn0Var, hdn0Var2, (lnm) null);
                b0kVar3.s0(lyg0Var);
                objT6 = lyg0Var;
            } else {
                m4cVar = m4cVar2;
                num = numValueOf2;
                z3 = false;
            }
            qxd0.s(numValueOf, num, (vu30) objT6, b0kVar3);
            kxt0 kxt0Var = o0iVar.c.a;
            boolean z5 = (kxt0Var == null || !kxt0Var.d) ? z3 : true;
            qim0 qim0VarI = nim0.a;
            qim0 qim0VarD = u291.d(qim0VarI, 1.0f);
            if (z5) {
                qim0VarI = zr7.i(qim0VarI, new cex((n511) tob1Var.getValue(), sfx0Var, (byte) 22));
            }
            qim0 qim0VarThen = qim0VarD.then(qim0VarI);
            b0kVar3.j0(475845883);
            wat watVar = (wat) b0kVar3.k(kivVar);
            b0kVar3.j0(-492369756);
            Object objT7 = b0kVar3.T();
            m4c m4cVar3 = m4cVar;
            if (objT7 == m4cVar3) {
                objT7 = x0d.o(watVar, b0kVar3);
            }
            b0kVar3.r(z3);
            ufh0 ufh0Var = (ufh0) objT7;
            b0kVar3.j0(-492369756);
            Object objT8 = b0kVar3.T();
            if (objT8 == m4cVar3) {
                objT8 = x0d.m(b0kVar3);
            }
            b0kVar3.r(z3);
            xhl xhlVar = (xhl) objT8;
            b0kVar3.j0(-492369756);
            Object objT9 = b0kVar3.T();
            if (objT9 == m4cVar3) {
                objT9 = v8r.q(Boolean.FALSE);
                b0kVar3.s0(objT9);
            }
            b0kVar3.r(z3);
            ven0 ven0Var2 = (ven0) objT9;
            b0kVar3.j0(-492369756);
            Object objT10 = b0kVar3.T();
            if (objT10 == m4cVar3) {
                objT10 = x0d.n(xhlVar, b0kVar3);
            }
            b0kVar3.r(z3);
            nil nilVar = (nil) objT10;
            b0kVar3.j0(-492369756);
            Object objT11 = b0kVar3.T();
            if (objT11 == m4cVar3) {
                objT11 = bb00.i(rih1.a, f331.X0, b0kVar3);
            }
            b0kVar3.r(z3);
            ven0 ven0Var3 = (ven0) objT11;
            b0kVar2 = b0kVar3;
            who1.h(s161.b(qim0VarThen, z3, new tu(ufh0Var, (byte) 28)), apo.i(b0kVar2, -1488813576, new wbl1(ven0Var3, xhlVar, new su(ven0Var2, nilVar, (byte) 24), sfx0Var, z, ybl1Var, z2, ylvVar, function4, iu30Var, iu30Var2, function5, o0iVar, cceVar, function0, function1, function2, function3, i, hdn0Var, i2, hdn0Var2, ven0Var)), new ru(ven0Var3, ufh0Var, nilVar, ven0Var2, (byte) 24), b0kVar2, 48);
            b0kVar2.r(false);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xbl1(cceVar, ybl1Var, o0iVar, z, z2, i, i2, function0, function1, function2, function3, iu30Var, iu30Var2, function4, function5, ylvVar, i3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void u(e9w0 e9w0Var, s8w0 s8w0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        String strK;
        s8w0 s8w0Var2 = s8w0Var;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1420157415);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.i(e9w0Var) ? 4 : 2) | (b0kVar2.i(s8w0Var2) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = e9w0Var.l;
            o8w0 o8w0Var = str != null ? new o8w0(e9w0Var.a, str) : null;
            String str2 = e9w0Var.f;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            era eraVar = een.P0;
            mbh mbhVarA = jbh.a(d36Var, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
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
            String strO0 = cwl1.o0(b0kVar2, 2131952914);
            lee1 lee1Var = cbx.d(b0kVar2).h;
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = p7w0.c;
                b0kVar2.s0(objT);
            }
            o8w0 o8w0Var2 = o8w0Var;
            uwo1.e(strO0, s161.b(nim0Var, false, (iu30) objT), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2040);
            uwo1.e(e9w0Var.d, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
            Object objT2 = b0kVar2.T();
            if (objT2 == m4cVar) {
                objT2 = p7w0.d;
                b0kVar2.s0(objT2);
            }
            qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT2);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            mbh mbhVarA2 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarB);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            if (ihc1.y0(str2)) {
                b0kVar2.i0(1449323893);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1449242208);
                h(ktx.c, str2, b0kVar2, ktx.d);
                b0kVar2.r(false);
            }
            xk41 xk41Var = e9w0Var.g;
            if (xk41Var == null) {
                b0kVar2.i0(1449372097);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1449372098);
                xrx xrxVar = xrx.c;
                int iC = l1d.C(xk41Var.a);
                if (iC == 0) {
                    strK = x0d.k(b0kVar2, 1039713515, 2131952907, b0kVar2, false);
                } else if (iC == 1) {
                    strK = x0d.k(b0kVar2, 1039697453, 2131952911, b0kVar2, false);
                } else if (iC == 2) {
                    b0kVar2.i0(1039701608);
                    n7r n7rVar = xk41Var.b;
                    if (n7rVar == null) {
                        n7rVar = n7r.a;
                    }
                    strK = cwl1.n0(2131952913, new Object[]{DateFormatSymbols.getInstance(((Configuration) b0kVar2.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0)).getWeekdays()[n7rVar.a()]}, b0kVar2);
                    b0kVar2.r(false);
                } else {
                    if (iC != 3) {
                        throw p3d1.k(b0kVar2, 1039695642, false);
                    }
                    strK = x0d.k(b0kVar2, 1039709487, 2131952912, b0kVar2, false);
                }
                h(xrxVar, strK, b0kVar2, xrx.d);
                b0kVar2.r(false);
            }
            zlk1 zlk1Var = e9w0Var.h;
            if (zlk1Var == null) {
                b0kVar2.i0(1450155281);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1450155282);
                h(xox.c, cwl1.n0(2131952906, new Object[]{zlk1Var.b}, b0kVar2), b0kVar2, xox.d);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
            if (o8w0Var2 != null) {
                b0kVar2.i0(555876528);
                s8w0Var2 = s8w0Var;
                b0kVar2 = b0kVar2;
                otw.c(s8w0Var2, o8w0Var2, (qim0) null, (ipb1) null, b0kVar2, 8 | ((i2 >> 3) & 14), 12);
                b0kVar2.r(false);
            } else {
                s8w0Var2 = s8w0Var;
                b0kVar2 = b0kVar2;
                b0kVar2.i0(555952447);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hws0(e9w0Var, s8w0Var2, i, (byte) 24);
        }
    }

    public static final k740 v(peq peqVar, mr20 mr20Var) {
        return peqVar.a(new any(mr20Var, (byte) 25));
    }

    public static xto1 w(Context context, y7o y7oVar) {
        xto1 hco0Var;
        synchronized (a8o.class) {
            if (a == null && Build.VERSION.SDK_INT >= 30) {
                if (c8o.p(context).getBoolean("android.net.http.EnableTelemetry", y7oVar == y7o.e || y7oVar == y7o.c)) {
                    try {
                        a = new b8o();
                    } catch (Exception unused) {
                    }
                }
            }
            hco0Var = a;
            if (hco0Var == null) {
                hco0Var = new hco0();
                a = hco0Var;
            }
        }
        return hco0Var;
    }

    public static int x(float f, Resources resources) {
        return (int) (f * resources.getDisplayMetrics().density);
    }

    public static int y(float f, Resources resources) {
        int iRound = Math.round(resources.getDisplayMetrics().density * f);
        if (iRound != 0) {
            return iRound;
        }
        if (f == 0.0f) {
            return 0;
        }
        return f > 0.0f ? 1 : -1;
    }

    public static final pnb z(zc8 zc8Var) {
        p6o p6oVar = zc8Var.c;
        ArrayList arrayList = p6oVar.b;
        ArrayList arrayList2 = p6oVar.a;
        if (arrayList.isEmpty()) {
            return uh21.N0;
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((n6o) it.next()).a);
        }
        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((l6o) it2.next()).a);
        }
        return new onb(arrayList3, arrayList4);
    }
}
