package p;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class t3p1 {
    public static b180 a;
    public static b180 b;

    public static final Function0 A(Function0 function0, iu30 iu30Var, z511 z511Var) {
        if (((Boolean) iu30Var.invoke(Integer.valueOf(z511Var.e()))).booleanValue()) {
            function0.invoke();
            return df.d;
        }
        r01 r01Var = new r01(function0, iu30Var, z511Var);
        z511Var.w(r01Var);
        return new q01(0, r01Var, r01.class, "cancel", "cancel()V", 0, (byte) 0);
    }

    public static final void B(kg kgVar, v161 v161Var) {
        Object objG = v161Var.k().a.g(z161.g);
        if (objG == null) {
            objG = null;
        }
        f4h f4hVar = (f4h) objG;
        if (f4hVar != null) {
            int i = f4hVar.a;
            int i2 = f4hVar.b;
            Object objG2 = v161Var.k().a.g(z161.K);
            if (objG2 == null) {
                objG2 = Boolean.FALSE;
            }
            kgVar.n(jg.b(((Boolean) objG2).booleanValue(), i, 1, i2, 1));
        }
        v161 v161VarL = v161Var.l();
        if (v161VarL == null) {
            return;
        }
        Object objG3 = v161VarL.k().a.g(z161.e);
        if (objG3 == null) {
            objG3 = null;
        }
        if (objG3 != null) {
            Object objG4 = v161VarL.k().a.g(z161.f);
            d4h d4hVar = (d4h) (objG4 != null ? objG4 : null);
            if (d4hVar == null || (d4hVar.a >= 0 && d4hVar.b >= 0)) {
                if (v161Var.k().a.c(z161.K)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = v161.j(4, v161VarL);
                    int size = listJ.size();
                    int i3 = 0;
                    for (int i4 = 0; i4 < size; i4++) {
                        v161 v161Var2 = (v161) listJ.get(i4);
                        if (v161Var2.k().a.c(z161.K)) {
                            arrayList.add(v161Var2);
                            if (v161Var2.c.w() < v161Var.c.w()) {
                                i3++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zV = v(arrayList);
                    int i5 = zV ? 0 : i3;
                    int i6 = zV ? i3 : 0;
                    Object objG5 = v161Var.k().a.g(z161.K);
                    if (objG5 == null) {
                        objG5 = Boolean.FALSE;
                    }
                    kgVar.n(jg.b(((Boolean) objG5).booleanValue(), i5, 1, i6, 1));
                }
            }
        }
    }

    public static final m7c C(o5e0 o5e0Var, x340 x340Var) {
        yvg1 yvg1Var;
        if (o5e0Var instanceof i5e0) {
            int iOrdinal = ((i5e0) o5e0Var).b.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    yvg1Var = new yvg1(2131959523, 2131959522, Integer.valueOf(Build.VERSION.SDK_INT < 29 ? 2131959524 : 2131959525));
                } else if (iOrdinal == 2) {
                    yvg1Var = new yvg1(2131959530, 2131959529, Integer.valueOf(Build.VERSION.SDK_INT < 29 ? 2131959524 : 2131959525));
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return null;
                    }
                    yvg1Var = new yvg1(2131959532, 2131959531, 2131959524);
                }
            } else {
                yvg1Var = new yvg1(2131959528, 2131959527, 2131959526);
            }
        } else {
            yvg1Var = new yvg1(2131959535, 2131959534, 2131959533);
        }
        return new m7c(cwl1.o0(x340Var, ((Number) yvg1Var.a).intValue()), cwl1.o0(x340Var, ((Number) yvg1Var.b).intValue()), cwl1.o0(x340Var, ((Number) yvg1Var.c).intValue()));
    }

    public static final i280 D(nwq0 nwq0Var) {
        int iOrdinal = nwq0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return i280.c;
            }
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
        }
        return i280.a;
    }

    public static final void a(final int i, final Function0 function0, b0k b0kVar, final boolean z) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1339183247);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            q3p1.b(i2 & 126, 0, function0, x340Var, z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.zt9
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t3p1.a(czo1.p(i | 1), function0, (b0k) obj, z);
                    return rih1.a;
                }
            };
        }
    }

    public static final void b(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-467882150);
        if (x340Var.Y(i & 1, i != 0)) {
            era eraVar = een.Q0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 48);
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
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            qim0 qim0VarQ = i1p1.q(u291.s(nim0Var, 36.0f, 4.0f), er31.b(2.0f));
            uwr uwrVar = cbx.a;
            t1c.a(dug.f(qim0VarQ, ((vex) zex.a.e).j, d4o1.a), x340Var, 0);
            x0d.s(nim0Var, 8.0f, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ry90(i, (byte) 27);
        }
    }

    public static final void c(kkk0 kkk0Var, iu30 iu30Var, xsk xskVar, b0k b0kVar, int i) {
        int i2;
        jez jezVar;
        w8w0 w8w0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(555956471);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kkk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(xskVar) : x340Var.i(xskVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            jkk0 jkk0Var = kkk0Var.a;
            jez jezVar2 = jkk0Var.e;
            if (jezVar2 != null) {
                jezVar = jezVar2;
            } else {
                Map map = kkk0Var.b;
                if (map == null || (w8w0Var = (w8w0) map.get(jkk0Var.c)) == null) {
                    jezVar = null;
                } else {
                    jezVar2 = w8w0Var.b.a;
                    jezVar = jezVar2;
                }
            }
            boolean z = jkk0Var.l;
            boolean z2 = jkk0Var.m;
            List listA = xskVar.a();
            jez jezVar3 = jkk0Var.e;
            gez gezVar = jkk0Var.n;
            s69 s69Var = gezVar != null ? gezVar.a : null;
            gez gezVar2 = jkk0Var.o;
            s69 s69Var2 = gezVar2 != null ? gezVar2.a : null;
            jez jezVar4 = jkk0Var.p;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = uak0.e1;
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            gce0 gce0Var = gce0.U0;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new k2g0(iu30Var, (byte) 16);
                x340Var.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            boolean zI = x340Var.i(kkk0Var) | (i3 == 32);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new okk0(iu30Var, kkk0Var, (byte) 0);
                x340Var.s0(objT3);
            }
            f(new hkc1(z, z2, jezVar, listA, jezVar3, s69Var, s69Var2, jezVar4, "mixing_style_picker_eq_custom", iu30Var2, gce0Var, vu30Var, (zu30) objT3), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pkk0(kkk0Var, iu30Var, xskVar, i, (byte) 0);
        }
    }

    public static final void d(kkk0 kkk0Var, iu30 iu30Var, xsk xskVar, b0k b0kVar, int i) {
        int i2;
        ha20 ha20Var;
        w8w0 w8w0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2024825771);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kkk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(xskVar) : x340Var.i(xskVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            jkk0 jkk0Var = kkk0Var.a;
            ha20 ha20Var2 = jkk0Var.f;
            if (ha20Var2 != null) {
                ha20Var = ha20Var2;
            } else {
                Map map = kkk0Var.b;
                if (map == null || (w8w0Var = (w8w0) map.get(jkk0Var.c)) == null) {
                    ha20Var = null;
                } else {
                    ha20Var2 = w8w0Var.c.a;
                    ha20Var = ha20Var2;
                }
            }
            boolean z = jkk0Var.q;
            boolean z2 = jkk0Var.r;
            List listB = xskVar.b();
            ha20 ha20Var3 = jkk0Var.f;
            r920 r920Var = jkk0Var.s;
            s69 s69Var = r920Var != null ? r920Var.a : null;
            r920 r920Var2 = jkk0Var.t;
            s69 s69Var2 = r920Var2 != null ? r920Var2.a : null;
            ha20 ha20Var4 = jkk0Var.u;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qkk0.b;
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            gce0 gce0Var = gce0.V0;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new k2g0(iu30Var, (byte) 17);
                x340Var.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            boolean zI = (i3 == 32) | x340Var.i(kkk0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new okk0(iu30Var, kkk0Var, (byte) 1);
                x340Var.s0(objT3);
            }
            f(new hkc1(z, z2, ha20Var, listB, ha20Var3, s69Var, s69Var2, ha20Var4, "mixing_style_picker_filter_custom", iu30Var2, gce0Var, vu30Var, (zu30) objT3), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pkk0(kkk0Var, iu30Var, xskVar, i, (byte) 1);
        }
    }

    public static final void e(kkk0 kkk0Var, iu30 iu30Var, xsk xskVar, b0k b0kVar, int i) {
        int i2;
        w8w0 w8w0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-94092783);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kkk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(xskVar) : x340Var.i(xskVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            jkk0 jkk0Var = kkk0Var.a;
            rx30 rx30Var = jkk0Var.B;
            if (rx30Var == null) {
                Map map = kkk0Var.b;
                rx30Var = (map == null || (w8w0Var = (w8w0) map.get(jkk0Var.c)) == null) ? null : w8w0Var.d.a;
            }
            rx30 rx30Var2 = rx30Var;
            boolean z = jkk0Var.v;
            boolean z2 = jkk0Var.w;
            int i3 = xskVar.a.d().l;
            z6x z6xVar = (i3 == 5 || i3 == 6 || i3 == 8) ? c2t.x : c2t.s;
            rx30 rx30Var3 = jkk0Var.B;
            rx30 rx30Var4 = jkk0Var.z;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qkk0.c;
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            gce0 gce0Var = gce0.W0;
            int i4 = i2 & 112;
            boolean z3 = i4 == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new k2g0(iu30Var, (byte) 18);
                x340Var.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            boolean zI = (i4 == 32) | x340Var.i(kkk0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new okk0(iu30Var, kkk0Var, (byte) 2);
                x340Var.s0(objT3);
            }
            f(new hkc1(z, z2, rx30Var2, z6xVar, rx30Var3, (s69) null, (s69) null, rx30Var4, "mixing_style_picker_fx_custom", iu30Var2, gce0Var, vu30Var, (zu30) objT3), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pkk0(kkk0Var, iu30Var, xskVar, i, (byte) 2);
        }
    }

    public static final void f(hkc1 hkc1Var, b0k b0kVar, int i) {
        int iIndexOf;
        Object obj = hkc1Var.e;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1022087723);
        int i2 = (x340Var.i(hkc1Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = hkc1Var.a;
            List listN0 = hkc1Var.d;
            if (obj != null && !listN0.contains(obj)) {
                listN0 = o7h.N0(Collections.singletonList(obj), listN0);
            }
            if (hkc1Var.b && z) {
                iIndexOf = 0;
            } else {
                iIndexOf = listN0.indexOf(hkc1Var.c);
                if (z) {
                    iIndexOf++;
                }
            }
            byte b2 = 3;
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            Integer numValueOf = Integer.valueOf(iIndexOf);
            boolean zE = x340Var.e(iIndexOf) | x340Var.g(xtb0VarA);
            Object objT = x340Var.T();
            if (zE || objT == m4cVar) {
                objT = new x0e(iIndexOf, xtb0VarA, (lnm) null, b2);
                x340Var.s0(objT);
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            boolean zI = x340Var.i(hkc1Var) | x340Var.i(listN0);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new uah0(hkc1Var, listN0, (byte) 22);
                x340Var.s0(objT2);
            }
            ujo1.d(qim0VarD, xtb0VarA, null, false, null, null, null, false, null, (iu30) objT2, x340Var, 6, 508);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fhk0(hkc1Var, i, (byte) 1);
        }
    }

    public static final void g(kkk0 kkk0Var, iu30 iu30Var, xsk xskVar, b0k b0kVar, int i) {
        int i2;
        jkk0 jkk0Var = kkk0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(908049066);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kkk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(xskVar) : x340Var.i(xskVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            vaa0 vaa0Var = jkk0Var.E;
            List list = xskVar.a.d().l == 5 ? c2t.C : c2t.B;
            vaa0 vaa0Var2 = jkk0Var.E;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qkk0.d;
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            gce0 gce0Var = gce0.X0;
            boolean z = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new k2g0(iu30Var, (byte) 19);
                x340Var.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = w7k0.a1;
                x340Var.s0(objT3);
            }
            f(new hkc1(false, false, vaa0Var, list, vaa0Var2, (s69) null, (s69) null, (Object) null, "mixing_style_picker_jogwheel_custom", iu30Var2, gce0Var, vu30Var, (zu30) objT3), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pkk0(kkk0Var, iu30Var, xskVar, i, (byte) 3);
        }
    }

    public static final void h(kkk0 kkk0Var, iu30 iu30Var, xsk xskVar, b0k b0kVar, int i) {
        int i2;
        z6x z6xVar;
        jkk0 jkk0Var = kkk0Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1713287231);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kkk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(xskVar) : x340Var.i(xskVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            m7f0 m7f0Var = jkk0Var.C;
            boolean z = jkk0Var.D;
            int i3 = xskVar.a.d().l;
            if (i3 != 5) {
                z6xVar = i3 != 8 ? c2t.y : c2t.A;
            } else {
                z6xVar = c2t.z;
            }
            z6x z6xVar2 = z6xVar;
            m7f0 m7f0Var2 = jkk0Var.C;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qkk0.e;
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            gce0 gce0Var = gce0.Y0;
            boolean z2 = (i2 & 112) == 32;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new k2g0(iu30Var, (byte) 20);
                x340Var.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = w7k0.b1;
                x340Var.s0(objT3);
            }
            f(new hkc1(z, z, m7f0Var, z6xVar2, m7f0Var2, (s69) null, (s69) null, (Object) null, "mixing_style_picker_looping_custom", iu30Var2, gce0Var, vu30Var, (zu30) objT3), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pkk0(kkk0Var, iu30Var, xskVar, i, (byte) 4);
        }
    }

    public static final void i(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-594295837);
        int i4 = (x340Var.e(i) ? 4 : 2) | i3 | (x340Var.e(i2) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.Z, x340Var, 6);
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
            x340Var.i0(958524769);
            for (int i5 = 0; i5 < i; i5++) {
                qim0 qim0VarQ = i1p1.q(u291.r(nim0.a, 8.0f), er31.a);
                if (i5 == i2) {
                    x340Var.i0(1145975960);
                    uwr uwrVar = cbx.a;
                    j = cbx.a(x340Var).b.a;
                    x340Var.r(false);
                } else {
                    x340Var.i0(1146040967);
                    x340Var.r(false);
                    uwr uwrVar2 = cbx.a;
                    j = ((vex) zex.a.e).j;
                }
                t1c.a(dug.f(qim0VarQ, j, d4o1.a), x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f0e((byte) 8, i, i2, i3, qim0Var);
        }
    }

    public static final void j(String str, String str2, String str3, String str4, boolean z, int i, qim0 qim0Var, String str5, boolean z2, String str6, boolean z3, b0k b0kVar, int i2, int i3, int i4) {
        qim0 qim0Var2;
        int i5;
        String str7;
        int i6;
        int i7;
        int i8;
        int i9;
        b0k b0kVar2;
        boolean z4;
        String str8;
        String str9;
        qim0 qim0Var3;
        long j;
        float f;
        boolean z5;
        float f2;
        boolean z6;
        lee1 lee1Var;
        qim0 qim0Var4;
        long j2;
        boolean z7;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-77687905);
        j06 j06Var = ((x340) b0kVar3).a;
        int i10 = (b0kVar3.g(str) ? 4 : 2) | i2 | (b0kVar3.g(str2) ? 32 : 16) | (b0kVar3.g(str3) ? 256 : 128) | (b0kVar3.g(str4) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i10 |= b0kVar3.h(z) ? 16384 : 8192;
        }
        int i11 = i10 | (b0kVar3.e(i) ? 131072 : 65536);
        int i12 = i4 & 64;
        if (i12 != 0) {
            i5 = i11 | 1572864;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i5 = i11 | (b0kVar3.i(qim0Var2) ? 1048576 : 524288);
        }
        int i13 = i4 & 128;
        if (i13 != 0) {
            i6 = i5 | 12582912;
            str7 = str5;
        } else {
            str7 = str5;
            i6 = i5 | (b0kVar3.g(str7) ? 8388608 : 4194304);
        }
        int i14 = i4 & 256;
        if (i14 != 0) {
            i7 = i6 | 100663296;
        } else {
            i7 = i6 | (b0kVar3.h(z2) ? 67108864 : 33554432);
        }
        int i15 = i4 & 512;
        if (i15 != 0) {
            i8 = i7 | 805306368;
        } else {
            i8 = i7 | (b0kVar3.g(str6) ? 536870912 : 268435456);
        }
        if ((i3 & 6) == 0) {
            i9 = i3 | (b0kVar3.h(z3) ? 4 : 2);
        } else {
            i9 = i3;
        }
        if (b0kVar3.Y(i8 & 1, ((i8 & 306783379) == 306783378 && (i9 & 3) == 2) ? false : true)) {
            qim0 qim0Var5 = nim0.a;
            if (i12 != 0) {
                qim0Var2 = qim0Var5;
            }
            if (i13 != 0) {
                str7 = null;
            }
            boolean z8 = i14 != 0 ? false : z2;
            String str10 = i15 != 0 ? null : str6;
            klz0 klz0Var = (klz0) b0kVar3.k(llz0.a);
            long j3 = klz0Var.a.e;
            if (z) {
                b0kVar3.i0(-1643618166);
                b0kVar3.r(false);
                j = j3;
            } else {
                b0kVar3.i0(-1643616957);
                uwr uwrVar = cbx.a;
                long j4 = cbx.a(b0kVar3).b.a;
                b0kVar3.r(false);
                j = j4;
            }
            long jB = u7h.b(j, 0.8f, 0.0f, 0.0f, 0.0f, 14);
            long j5 = j;
            boolean z9 = str7 != null;
            if (z && z9) {
                f = 1.5f;
            } else {
                f = ((!z || z9) && (z || !z9)) ? 0.67f : 1.0f;
            }
            hcx hcxVar = z3 ? hcx.c : hcx.d;
            if (z3) {
                b0kVar3.i0(-1643607929);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(b0kVar3).b;
                z5 = false;
                b0kVar3.r(false);
                f2 = 6.0f;
            } else {
                b0kVar3.i0(-1643606617);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(b0kVar3).b;
                z5 = false;
                b0kVar3.r(false);
                f2 = 8.0f;
            }
            if (z3) {
                b0kVar3.i0(-1643604340);
                lee1Var = cbx.d(b0kVar3).k;
                z6 = false;
            } else {
                z6 = z5;
                b0kVar3.i0(-1643603155);
                lee1Var = cbx.d(b0kVar3).h;
            }
            b0kVar3.r(z6);
            lee1 lee1Var2 = lee1Var;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            float f3 = f2;
            String str11 = str7;
            jw31 jw31VarA = ew31.a(new d36(f3, true, new um5(false)), een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z10 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z10) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            Uri uri = Uri.parse(str3 == null ? "" : str3);
            if (z) {
                b0kVar3.i0(1483690617);
                avw0 avw0Var = cbx.b(b0kVar3).c;
                qim0 qim0VarE2 = d1u.E(2.0f, j3, qim0Var5, er31.a);
                b0kVar3.r(false);
                qim0Var4 = qim0VarE2;
            } else {
                b0kVar3.i0(1483864713);
                b0kVar3.r(false);
                qim0Var4 = qim0Var5;
            }
            bmq0.a(uri, qim0Var4, hcxVar, str, str2, 0L, 0L, false, b0kVar3, (i8 << 9) & 64512, 224);
            long j6 = cbx.a(b0kVar3).b.a;
            cjc0 cjc0Var = new cjc0(2);
            pw31 pw31Var = pw31.a;
            gxo1.c(str4, pw31Var.a(1.0f, qim0Var5, true), lee1Var2, j6, null, 2, false, cjc0Var, null, 0.0f, null, null, b0kVar3, (i8 >> 9) & 14, 0, 3920);
            b0kVar2 = b0kVar3;
            qim0 qim0VarA = pw31Var.a(f, qim0Var5, true);
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            jw31 jw31VarA2 = ew31.a(new d36(12.0f, true, new g21(een.R0, (byte) 29)), een.O0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarA);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(jw31VarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            if (str11 == null) {
                b0kVar2.i0(-1623420197);
                b0kVar2.r(false);
                qim0Var2 = qim0Var2;
                z7 = true;
            } else {
                b0kVar2.i0(-1623420196);
                if (z8) {
                    b0kVar2.i0(1843719912);
                    b0kVar2.r(false);
                    j2 = j3;
                } else {
                    b0kVar2.i0(1843763002);
                    long j7 = cbx.a(b0kVar2).b.a;
                    b0kVar2.r(false);
                    j2 = j7;
                }
                long j8 = z8 ? klz0Var.a.c : ((vex) zex.a.e).i;
                qim0 qim0VarC = pw31Var.c(qim0Var5);
                cua cuaVar = cbx.b(b0kVar2).f;
                qim0 qim0VarF2 = dug.f(qim0VarC, j8, er31.b(16.0f));
                cvx cvxVar4 = cbx.b(b0kVar2).b;
                cvx cvxVar5 = cbx.b(b0kVar2).b;
                qim0 qim0VarY = uyn1.y(qim0VarF2, 8.0f, 4.0f);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM3 = b0kVar2.m();
                qim0 qim0VarE4 = zr7.E(b0kVar2, qim0VarY);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, lljVar);
                nko1.H(xos0VarM3, b0kVar2, lljVar2);
                x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE4, b0kVar2, lljVar4);
                gxo1.c(str11, null, cbx.d(b0kVar2).m, j2, new a0e1(3), 0, false, new cjc0(1), null, 0.0f, null, null, b0kVar2, 0, 0, 3938);
                z7 = true;
                b0kVar2.r(true);
                b0kVar2.r(false);
            }
            str8 = str10;
            w2g0.c(pw31Var.c(pw31Var.a(1.0f, qim0Var5, z7)), een.i, apo.r(864337985, new kcu0(i, j5, jB, str8, z), b0kVar2), b0kVar2, 3072, 4);
            b0kVar2.r(z7);
            b0kVar2.r(z7);
            z4 = z8;
            str9 = str11;
            qim0Var3 = qim0Var2;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z4 = z2;
            str8 = str6;
            str9 = str7;
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lcu0(str, str2, str3, str4, z, i, qim0Var3, str9, z4, str8, z3, i2, i3, i4);
        }
    }

    public static final void k(oo11 oo11Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(320551927);
        int i2 = (x340Var.i(oo11Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfx.g(18, apo.r(699664490, new tc11(oo11Var, (Context) x340Var.k(AndroidCompositionLocals_androidKt.b)), x340Var), x340Var, 54);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tc11(oo11Var, qim0Var, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0171  */
    /* JADX WARN: Code duplicated, block: B:109:0x0173  */
    public static final void l(fkc1 fkc1Var, kkk0 kkk0Var, iu30 iu30Var, xsk xskVar, hvj0 hvj0Var, b0k b0kVar, int i) {
        fkc1 fkc1Var2;
        boolean z;
        w8w0 w8w0Var;
        w8w0 w8w0Var2;
        w8w0 w8w0Var3;
        w8w0 w8w0Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1476056492);
        int i2 = i | (x340Var.e(fkc1Var.ordinal()) ? 4 : 2) | (x340Var.i(kkk0Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | (x340Var.g(xskVar) ? 2048 : 1024) | (x340Var.g(hvj0Var) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            b(x340Var, 0);
            jkk0 jkk0Var = kkk0Var.a;
            if (jkk0Var.A) {
                Map map = kkk0Var.b;
                b8w0 b8w0Var = jkk0Var.c;
                int iOrdinal = fkc1Var.ordinal();
                if (iOrdinal == 0) {
                    if (!jkk0Var.h) {
                        duk1 duk1Var = jkk0Var.d;
                        if (duk1Var == null) {
                            duk1Var = (map == null || (w8w0Var = (w8w0) map.get(b8w0Var)) == null) ? null : w8w0Var.a.a;
                        }
                        if (duk1Var == duk1.b) {
                            z = false;
                        }
                    }
                    z = true;
                } else if (iOrdinal == 1) {
                    if (!jkk0Var.m) {
                        jez jezVar = jkk0Var.e;
                        if (jezVar == null) {
                            jezVar = (map == null || (w8w0Var2 = (w8w0) map.get(b8w0Var)) == null) ? null : w8w0Var2.b.a;
                        }
                        if (jezVar == jez.b) {
                            z = false;
                        }
                    }
                    z = true;
                } else if (iOrdinal == 2) {
                    if (!jkk0Var.r) {
                        ha20 ha20Var = jkk0Var.f;
                        if (ha20Var == null) {
                            ha20Var = (map == null || (w8w0Var3 = (w8w0) map.get(b8w0Var)) == null) ? null : w8w0Var3.c.a;
                        }
                        if (ha20Var == ha20.b) {
                            z = false;
                        }
                    }
                    z = true;
                } else if (iOrdinal == 3) {
                    if (!jkk0Var.w) {
                        rx30 rx30Var = jkk0Var.B;
                        if (rx30Var == null) {
                            rx30Var = (map == null || (w8w0Var4 = (w8w0) map.get(b8w0Var)) == null) ? null : w8w0Var4.d.a;
                        }
                        if (rx30Var == null || rx30Var == rx30.b) {
                            z = false;
                        }
                    }
                    z = true;
                } else if (iOrdinal == 4) {
                    m7f0 m7f0Var = jkk0Var.C;
                    if (m7f0Var == null || m7f0Var == m7f0.b) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    if (iOrdinal != 5) {
                        eg.o();
                        return;
                    }
                    vaa0 vaa0Var = jkk0Var.E;
                    if (vaa0Var == null || vaa0Var == vaa0.b) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            fkc1Var2 = fkc1Var;
            m(fkc1Var2, hvj0Var, z, x340Var, (i2 & 14) | ((i2 >> 9) & 112));
            qim0 qim0VarH = u291.h(uyn1.z(16.0f, 0.0f, 2, u291.f(nim0Var, 1.0f)), 0.5f);
            uwr uwrVar = cbx.a;
            t1c.a(dug.f(qim0VarH, ((vex) zex.a.e).j, d4o1.a), x340Var, 0);
            int iOrdinal2 = fkc1Var2.ordinal();
            if (iOrdinal2 == 0) {
                x340Var.i0(-1420491385);
                t(kkk0Var, iu30Var, xskVar, x340Var, (i2 >> 3) & 1022);
                x340Var.r(false);
            } else if (iOrdinal2 == 1) {
                x340Var.i0(-1420485245);
                c(kkk0Var, iu30Var, xskVar, x340Var, (i2 >> 3) & 1022);
                x340Var.r(false);
            } else if (iOrdinal2 == 2) {
                x340Var.i0(-1420479097);
                d(kkk0Var, iu30Var, xskVar, x340Var, (i2 >> 3) & 1022);
                x340Var.r(false);
            } else if (iOrdinal2 == 3) {
                x340Var.i0(-1420472797);
                e(kkk0Var, iu30Var, xskVar, x340Var, (i2 >> 3) & 1022);
                x340Var.r(false);
            } else if (iOrdinal2 == 4) {
                x340Var.i0(-1420466616);
                h(kkk0Var, iu30Var, xskVar, x340Var, (i2 >> 3) & 1022);
                x340Var.r(false);
            } else {
                if (iOrdinal2 != 5) {
                    throw p3d1.k(x340Var, -1420492140, false);
                }
                x340Var.i0(-1420460247);
                g(kkk0Var, iu30Var, xskVar, x340Var, (i2 >> 3) & 1022);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            fkc1Var2 = fkc1Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e9g0((byte) 9, i, fkc1Var2, kkk0Var, iu30Var, xskVar, hvj0Var);
        }
    }

    public static final void m(fkc1 fkc1Var, hvj0 hvj0Var, boolean z, b0k b0kVar, int i) {
        hvj0 hvj0Var2 = hvj0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2010541924);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.e(fkc1Var.ordinal()) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(hvj0Var2) : x340Var.i(hvj0Var2) ? 32 : 16;
        }
        int i3 = i2 | (x340Var.h(z) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = uyn1.y(u291.f(u291.h(nim0Var, 48.0f), 1.0f), 16.0f, 12.0f);
            fra fraVar = een.N0;
            jw31 jw31VarA = ew31.a(h36.g, fraVar, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            jw31 jw31VarA2 = ew31.a(h36.a, fraVar, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            t1c.a(dug.f(i1p1.q(u291.h(u291.v(nim0Var, 5.0f), 19.0f), er31.b(2.5f)), f5p1.k(x340Var, fkc1Var.b), d4o1.a), x340Var, 0);
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            String strO0 = cwl1.o0(x340Var, fkc1Var.a);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var.r(true);
            hvj0Var2 = hvj0Var;
            otw.c(hvj0Var2, new yxj0(2, z), (qim0) null, (ipb1) null, x340Var, (i3 >> 3) & 14, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rkk0(fkc1Var, hvj0Var2, z, i);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r15v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v6 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r15v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v7 ??, new type: boolean
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
    /* JADX WARN: Failed to calculate best type for var: r15v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v8 ??, new type: boolean
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
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: boolean
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
    public static final void n(boolean r26, kotlin.jvm.functions.Function0 r27, p.iu30 r28, p.j2i r29, p.b0k r30, int r31) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t3p1.n(boolean, kotlin.jvm.functions.Function0, p.iu30, p.j2i, p.b0k, int):void");
    }

    public static final void o(kkk0 kkk0Var, iu30 iu30Var, xsk xskVar, hvj0 hvj0Var, b0k b0kVar, int i) {
        c380 c380Var;
        jkr0 jkr0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1644321927);
        int i2 = i | (x340Var.i(kkk0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(xskVar) ? 256 : 128) | (x340Var.g(hvj0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            jkk0 jkk0Var = kkk0Var.a;
            uao0 uao0Var = kkk0Var.c;
            fkc1 fkc1Var = jkk0Var.b;
            boolean zE = x340Var.e(jkk0Var.F) | x340Var.e(uao0Var.ordinal());
            Object objT = x340Var.T();
            if (zE || objT == m4cVar) {
                Parcelable.Creator creator = fkc1.CREATOR;
                objT = boo1.C(jkk0Var.F, uao0Var);
                x340Var.s0(objT);
            }
            c380 c380Var2 = (c380) objT;
            int iIndexOf = c380Var2.indexOf(fkc1Var);
            if (iIndexOf < 0) {
                iIndexOf = 0;
            }
            boolean zG = x340Var.g(c380Var2);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new k27(c380Var2, (byte) 3);
                x340Var.s0(objT2);
            }
            jkr0 jkr0VarB = lkr0.b(iIndexOf, (Function0) objT2, x340Var, 0, 2);
            boolean zG2 = ((i2 & 112) == 32) | x340Var.g(c380Var2) | x340Var.i(kkk0Var) | x340Var.g(jkr0VarB);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == m4cVar) {
                c380Var = c380Var2;
                a38 a38Var = new a38(c380Var, kkk0Var, jkr0VarB, iu30Var, (lnm) null);
                jkr0Var = jkr0VarB;
                x340Var.s0(a38Var);
                objT3 = a38Var;
            } else {
                jkr0Var = jkr0VarB;
                c380Var = c380Var2;
            }
            qxd0.s(fkc1Var, c380Var, (vu30) objT3, x340Var);
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarD);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
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
            wnb0 wnb0VarQ = kk0.q(x340Var, qim0VarE, y580.Y, 1.0f, true);
            zzq0 zzq0VarH = uyn1.h(2, 24.0f, 0.0f);
            c380 c380Var3 = c380Var;
            j2i j2iVarR = apo.r(1272857854, new rl6(c380Var, kkk0Var, iu30Var, xskVar, hvj0Var), x340Var);
            jkr0 jkr0Var2 = jkr0Var;
            w0h1.c(jkr0Var2, wnb0VarQ, zzq0VarH, (gdr0) null, 0, 12.0f, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, j2iVarR, x340Var, 196992, 16344);
            i(c380Var3.size(), ((err0) jkr0Var2.d.c).s(), 0, x340Var, uyn1.z(0.0f, 16.0f, 1, new tq60(een.Q0)));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new w0f0(i, kkk0Var, iu30Var, xskVar, hvj0Var, (byte) 23);
        }
    }

    public static final void p(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1836326580);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N(str2, uyn1.y(bin.x(u291.f(qim0Var3, 1.0f), false, null, null, null, function0, 15), 16.0f, 14.0f));
            jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            uwr uwrVar = cbx.a;
            uwo1.e(str, null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2034);
            x340Var = x340Var;
            qim0 qim0VarR = u291.r(qim0Var3, 24.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarR);
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
            if (z) {
                x340Var.i0(-709568697);
                w0h1.a(ilx.c, isl.a, u291.r(qim0Var3, 24.0f), cbx.a(x340Var).b.f, 0L, false, x340Var, ilx.d | 432, 48);
                x340Var.r(false);
            } else {
                x340Var.i0(-709348628);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new br30(str, z, function0, str2, qim0Var2, i);
        }
    }

    public static final void q(final String str, final iu30 iu30Var, final qim0 qim0Var, final boolean z, lee1 lee1Var, final vu30 vu30Var, elk1 elk1Var, final kua0 kua0Var, bua0 bua0Var, final int i, int i2, final hw61 hw61Var, final j4e1 j4e1Var, b0k b0kVar, final int i3) {
        String str2;
        int i4;
        iu30 iu30Var2;
        b0k b0kVar2;
        final lee1 lee1Var2;
        final elk1 elk1Var2;
        final bua0 bua0Var2;
        final int i5;
        lee1 lee1Var3;
        elk1 elk1Var3;
        bua0 bua0Var3;
        int i6;
        boolean z2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-154966360);
        if ((i3 & 6) == 0) {
            str2 = str;
            i4 = (b0kVar3.g(str2) ? 4 : 2) | i3;
        } else {
            str2 = str;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            iu30Var2 = iu30Var;
            i4 |= b0kVar3.i(iu30Var2) ? 32 : 16;
        } else {
            iu30Var2 = iu30Var;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar3.g(qim0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar3.h(z) ? 2048 : 1024;
        }
        int i7 = i4 | 24576;
        if ((196608 & i3) == 0) {
            i7 = 90112 | i4;
        }
        int i8 = 1572864 | i7;
        if ((12582912 & i3) == 0) {
            i8 |= b0kVar3.i(vu30Var) ? 8388608 : 4194304;
        }
        int i9 = i8 | 905969664;
        if (b0kVar3.Y(i9 & 1, ((i9 & 306783379) == 306783378 && (((b0kVar3.g(kua0Var) ? (char) 0 : (char) 0) | 28086) & 306783379) == 306783378 && ((((b0kVar3.g(hw61Var) ? ' ' : (char) 16) | 6) | (b0kVar3.g(j4e1Var) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            b0kVar3.d0();
            if ((i3 & 1) == 0 || b0kVar3.E()) {
                lee1Var3 = (lee1) b0kVar3.k(q9e1.a);
                elk1Var3 = m9x0.X0;
                bua0Var3 = bua0.d;
                i6 = 1;
            } else {
                b0kVar3.b0();
                lee1Var3 = lee1Var;
                elk1Var3 = elk1Var;
                bua0Var3 = bua0Var;
                i6 = i2;
            }
            b0kVar3.s();
            b0kVar3.i0(488210003);
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = ktd.n(b0kVar3);
            }
            idn0 idn0Var = (idn0) objT;
            b0kVar3.r(false);
            b0kVar3.i0(1401227490);
            long jC = lee1Var3.c();
            if (jC != 16) {
                z2 = false;
                bua0Var3 = bua0Var3;
            } else {
                boolean zBooleanValue = ((Boolean) e6p1.g(idn0Var, b0kVar3, 0).getValue()).booleanValue();
                if (z) {
                    jC = zBooleanValue ? j4e1Var.a : j4e1Var.b;
                } else {
                    jC = j4e1Var.c;
                }
                z2 = false;
            }
            long j = jC;
            b0kVar3.r(z2);
            b0kVar2 = b0kVar3;
            bua0 bua0Var4 = bua0Var3;
            mod.b(sce1.a.a(j4e1Var.k), apo.r(1459735400, new v5e1(qim0Var, j4e1Var, str2, iu30Var2, z, lee1Var3.e(new lee1(j, 0L, (FontWeight) null, (FontFamily) null, 0L, 0L, 0, 0, 0L, (shc0) null, 0, 16777214)), kua0Var, bua0Var4, i, i6, elk1Var3, idn0Var, vu30Var, hw61Var), b0kVar2), b0kVar2, 56);
            bua0Var2 = bua0Var4;
            elk1Var2 = elk1Var3;
            lee1Var2 = lee1Var3;
            i5 = i6;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            lee1Var2 = lee1Var;
            elk1Var2 = elk1Var;
            bua0Var2 = bua0Var;
            i5 = i2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.s5e1
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = czo1.p(i3 | 1);
                    String str3 = str;
                    iu30 iu30Var3 = iu30Var;
                    qim0 qim0Var2 = qim0Var;
                    boolean z3 = z;
                    lee1 lee1Var4 = lee1Var2;
                    vu30 vu30Var2 = vu30Var;
                    elk1 elk1Var4 = elk1Var2;
                    kua0 kua0Var2 = kua0Var;
                    bua0 bua0Var5 = bua0Var2;
                    int i10 = i;
                    boolean z4 = i5;
                    hw61 hw61Var2 = hw61Var;
                    j4e1 j4e1Var2 = j4e1Var;
                    t3p1.q(str3, iu30Var3, qim0Var2, z3, lee1Var4, vu30Var2, elk1Var4, kua0Var2, bua0Var5, i10, z4 ? 1 : 0, hw61Var2, j4e1Var2, (b0k) obj, iP);
                    return rih1.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x026e  */
    /* JADX WARN: Code duplicated, block: B:160:0x029c  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:166:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:168:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:170:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:172:0x0304  */
    /* JADX WARN: Code duplicated, block: B:173:0x0308  */
    /* JADX WARN: Code duplicated, block: B:178:0x0323  */
    /* JADX WARN: Code duplicated, block: B:181:0x0335  */
    /* JADX WARN: Code duplicated, block: B:184:0x034e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0353  */
    /* JADX WARN: Code duplicated, block: B:189:0x0358  */
    /* JADX WARN: Code duplicated, block: B:191:0x035d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0365  */
    /* JADX WARN: Code duplicated, block: B:196:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:202:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:204:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:206:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:208:0x0422  */
    /* JADX WARN: Code duplicated, block: B:209:0x0426  */
    /* JADX WARN: Code duplicated, block: B:214:0x0441  */
    /* JADX WARN: Code duplicated, block: B:216:0x0453  */
    /* JADX WARN: Code duplicated, block: B:219:0x0473  */
    /* JADX WARN: Code duplicated, block: B:221:0x0484  */
    /* JADX WARN: Code duplicated, block: B:223:0x0488  */
    /* JADX WARN: Code duplicated, block: B:226:0x0491  */
    /* JADX WARN: Code duplicated, block: B:228:0x0495  */
    /* JADX WARN: Code duplicated, block: B:232:0x049e  */
    /* JADX WARN: Code duplicated, block: B:236:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:239:0x04db  */
    /* JADX WARN: Code duplicated, block: B:240:0x04df  */
    /* JADX WARN: Code duplicated, block: B:243:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:245:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:248:0x0510  */
    /* JADX WARN: Code duplicated, block: B:251:0x0529  */
    /* JADX WARN: Code duplicated, block: B:252:0x052c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0530  */
    /* JADX WARN: Code duplicated, block: B:255:0x0533  */
    /* JADX WARN: Code duplicated, block: B:258:0x0541  */
    /* JADX WARN: Code duplicated, block: B:259:0x0563  */
    /* JADX WARN: Code duplicated, block: B:262:0x0591  */
    /* JADX WARN: Code duplicated, block: B:263:0x0595  */
    /* JADX WARN: Code duplicated, block: B:268:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:271:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:273:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:274:0x0603  */
    /* JADX WARN: Code duplicated, block: B:279:0x061e  */
    /* JADX WARN: Code duplicated, block: B:281:0x0630  */
    public static final void r(vu30 vu30Var, final vu30 vu30Var2, xu30 xu30Var, final vu30 vu30Var3, final vu30 vu30Var4, vu30 vu30Var5, final vu30 vu30Var6, final boolean z, final w5e1 w5e1Var, final o5e1 o5e1Var, final j2i j2iVar, vu30 vu30Var7, vzq0 vzq0Var, b0k b0kVar, final int i, final int i2) {
        int i3;
        int i4;
        vzq0 vzq0Var2;
        xu30 xu30Var2;
        x340 x340Var;
        Object l6e1Var;
        m4c m4cVar;
        tl3 tl3Var;
        llj lljVar;
        boolean z2;
        float fN;
        float fM;
        float F;
        float f;
        float f2;
        tl3 tl3Var2;
        qim0 qim0VarB;
        float f3;
        float f4;
        qim0 qim0VarB2;
        int iK;
        boolean z3;
        int iK2;
        final o5e1 o5e1Var2;
        boolean z4;
        Object objT;
        final byte b2;
        int iK3;
        int iK4;
        int iK5;
        int iK6;
        int iK7;
        final vu30 vu30Var8 = vu30Var;
        final vu30 vu30Var9 = vu30Var5;
        vu30 vu30Var10 = vu30Var7;
        gra graVar = een.h;
        m4c m4cVar2 = fkj0.X;
        tl3 tl3Var3 = een.d;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1086465551);
        j06 j06Var = x340Var2.a;
        int i5 = i & 6;
        nim0 nim0Var = nim0.a;
        m4c m4cVar3 = m4cVar2;
        if (i5 == 0) {
            i3 = i | (x340Var2.g(nim0Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var2.i(vu30Var8) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var2.i(vu30Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var2.i(xu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var2.i(vu30Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var2.i(vu30Var4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= x340Var2.i(vu30Var9) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= x340Var2.i(vu30Var6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= x340Var2.h(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= x340Var2.g(w5e1Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? x340Var2.g(o5e1Var) : x340Var2.i(o5e1Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var2.i(j2iVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var2.i(vu30Var10) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var2.g(vzq0Var) ? 2048 : 1024;
        }
        int i6 = i4;
        if (x340Var2.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            long j = ((k2h1) x340Var2.k(o2h1.a)).l.b.c;
            long j2 = h1h1.l;
            if (!TextUnit.e(j)) {
                j = j2;
            }
            float fY = ((wat) x340Var2.k(t4k.h)).y(j) / 2.0f;
            int i7 = i6 & 14;
            boolean zD = ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i7 == 4 || ((i6 & 8) != 0 && x340Var2.g(o5e1Var))) | ((i6 & 7168) == 2048) | x340Var2.d(fY);
            Object objT2 = x340Var2.T();
            if (zD) {
                vzq0Var2 = vzq0Var;
                x340Var = x340Var2;
                m4cVar = m4cVar3;
                l6e1Var = new l6e1(z, w5e1Var, o5e1Var, vzq0Var2, fY);
                x340Var.s0(l6e1Var);
            } else if (objT2 == m4cVar3) {
                m4cVar3 = m4cVar3;
                vzq0Var2 = vzq0Var;
                x340Var = x340Var2;
                m4cVar = m4cVar3;
                l6e1Var = new l6e1(z, w5e1Var, o5e1Var, vzq0Var2, fY);
                x340Var.s0(l6e1Var);
            } else {
                x340Var = x340Var2;
                m4cVar = m4cVar3;
                l6e1Var = objT2;
                vzq0Var2 = vzq0Var;
            }
            l6e1 l6e1Var2 = (l6e1) l6e1Var;
            flb0 flb0Var = (flb0) x340Var.k(t4k.n);
            int iK8 = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, (qim0) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0219: INVOKE (r15v7 'qim0VarE' p.qim0) = (r2v7 'x340Var' p.x340), (wrap p.qim0:?: CAST (p.qim0) (r22v2 ?? I:??[OBJECT, ARRAY])) STATIC call: p.zr7.E(p.b0k, p.qim0):p.qim0 A[DECLARE_VAR] (LINE:538) in method: p.t3p1.r(p.vu30, p.vu30, p.xu30, p.vu30, p.vu30, p.vu30, p.vu30, boolean, p.w5e1, p.o5e1, p.j2i, p.vu30, p.vzq0, p.b0k, int, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
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
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v2 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1656
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.t3p1.r(p.vu30, p.vu30, p.xu30, p.vu30, p.vu30, p.vu30, p.vu30, boolean, p.w5e1, p.o5e1, p.j2i, p.vu30, p.vzq0, p.b0k, int, int):void");
        }

        public static final void s(int i, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(1244787671);
            int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.i(qim0Var) ? 16384 : 8192);
            if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
                wro1.h(new gbx(z50.c, function0), new idx(18), qim0Var, null, yla.s(x340Var), new zzq0(8.0f, 8.0f, 8.0f, 8.0f), false, null, null, apo.r(-869093330, new ke3(z, str, str2, (byte) 2), x340Var), x340Var, 12582912 | ((i2 >> 6) & 896), 6, 792);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new br30(z, function0, str, str2, qim0Var, i);
            }
        }

        public static final void t(kkk0 kkk0Var, iu30 iu30Var, xsk xskVar, b0k b0kVar, int i) {
            int i2;
            w8w0 w8w0Var;
            x340 x340Var = (x340) b0kVar;
            x340Var.k0(-1496814135);
            if ((i & 6) == 0) {
                i2 = (x340Var.i(kkk0Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= x340Var.i(iu30Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= (i & 512) == 0 ? x340Var.g(xskVar) : x340Var.i(xskVar) ? 256 : 128;
            }
            if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
                jkk0 jkk0Var = kkk0Var.a;
                duk1 duk1Var = jkk0Var.d;
                if (duk1Var == null) {
                    Map map = kkk0Var.b;
                    duk1Var = (map == null || (w8w0Var = (w8w0) map.get(jkk0Var.c)) == null) ? null : w8w0Var.a.a;
                }
                duk1 duk1Var2 = duk1Var;
                boolean z = jkk0Var.g;
                boolean z2 = jkk0Var.h;
                List listC = xskVar.c();
                duk1 duk1Var3 = jkk0Var.d;
                s69 s69Var = jkk0Var.i;
                s69 s69Var2 = jkk0Var.j;
                duk1 duk1Var4 = jkk0Var.k;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = qkk0.g;
                    x340Var.s0(objT);
                }
                iu30 iu30Var2 = (iu30) objT;
                gce0 gce0Var = gce0.Z0;
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new k2g0(iu30Var, (byte) 21);
                    x340Var.s0(objT2);
                }
                vu30 vu30Var = (vu30) objT2;
                boolean z4 = i3 == 32;
                Object objT3 = x340Var.T();
                if (z4 || objT3 == m4cVar) {
                    objT3 = new t7i(iu30Var, (byte) 7);
                    x340Var.s0(objT3);
                }
                f(new hkc1(z, z2, duk1Var2, listC, duk1Var3, s69Var, s69Var2, duk1Var4, "mixing_style_picker_volume_custom", iu30Var2, gce0Var, vu30Var, (zu30) objT3), x340Var, 0);
            } else {
                x340Var.b0();
            }
            h311 h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new pkk0(kkk0Var, iu30Var, xskVar, i, (byte) 5);
            }
        }

        public static final void u(dko0 dko0Var, String str, cvy0 cvy0Var) {
            Bundle bundle = new Bundle();
            bundle.putString("NOTIFICATION_EXTRAS_APP_DEVICE_ID", cvy0Var.b);
            bundle.putString("NOTIFICATION_EXTRAS_MESSAGE_ID", cvy0Var.c);
            bundle.putString("NOTIFICATION_EXTRAS_OPPORTUNITY_ID", cvy0Var.a);
            bundle.putString("NOTIFICATION_EXTRAS_URI", str);
            String str2 = cvy0Var.d;
            if (str2 != null) {
                bundle.putString("NOTIFICATION_EXTRAS_COLLAPSE_KEY", str2);
            }
            Bundle bundle2 = dko0Var.t;
            if (bundle2 == null) {
                dko0Var.t = new Bundle(bundle);
            } else {
                bundle2.putAll(bundle);
            }
        }

        public static final boolean v(ArrayList arrayList) {
            z6x z6xVar;
            long j;
            if (arrayList.size() >= 2) {
                if (arrayList.size() <= 1) {
                    z6xVar = z6x.a;
                } else {
                    z6x arrayList2 = new ArrayList();
                    Object obj = arrayList.get(0);
                    int iL = p7h.L(arrayList);
                    int i = 0;
                    while (i < iL) {
                        i++;
                        Object obj2 = arrayList.get(i);
                        v161 v161Var = (v161) obj2;
                        v161 v161Var2 = (v161) obj;
                        arrayList2.add(new Offset((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (v161Var2.g().f() >> 32)) - Float.intBitsToFloat((int) (v161Var.g().f() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (v161Var2.g().f() & 4294967295L)) - Float.intBitsToFloat((int) (v161Var.g().f() & 4294967295L))))) & 4294967295L)));
                        obj = obj2;
                    }
                    z6xVar = arrayList2;
                }
                if (((Collection) z6xVar).size() == 1) {
                    j = ((Offset) o7h.q0(z6xVar)).a;
                } else {
                    if (z6xVar.isEmpty()) {
                        p5d0.d("Empty collection can't be reduced.");
                    }
                    Object objQ0 = o7h.q0(z6xVar);
                    int iL2 = p7h.L(z6xVar);
                    if (1 <= iL2) {
                        int i2 = 1;
                        while (true) {
                            objQ0 = new Offset(Offset.g(((Offset) objQ0).a, ((Offset) z6xVar.get(i2)).a));
                            if (i2 == iL2) {
                                break;
                            }
                            i2++;
                        }
                    }
                    j = ((Offset) objQ0).a;
                }
                if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                    return false;
                }
            }
            return true;
        }

        public static final PendingIntent w(wmy wmyVar, int i, String str, cvy0 cvy0Var) {
            String str2 = cvy0Var.b;
            boolean zEquals = str.equals("client:notification:action:resend_email_verification");
            String str3 = cvy0Var.a;
            String str4 = cvy0Var.c;
            return zEquals ? wmyVar.q("EMAIL_VERIFICATION_INTENT_ACTION", AppLifecycleServicePendingIntent.EMAIL_VERIFY, new z261(str3, str4, i, str2)) : wmyVar.q("OPEN_URL_INTENT_ACTION", AppLifecycleServicePendingIntent.OPEN_URL, new vjq0(str3, i, str4, str, false, str2));
        }

        public static final Object x(vu30 vu30Var, lnm lnmVar) {
            fs20 fs20Var = new fs20(lnmVar, lnmVar.getContext());
            return wgo1.E(fs20Var, true, fs20Var, vu30Var);
        }

        public static final boolean y(v161 v161Var) {
            Object objG = v161Var.k().a.g(z161.f);
            if (objG == null) {
                objG = null;
            }
            if (objG != null) {
                return true;
            }
            Object objG2 = v161Var.k().a.g(z161.e);
            return (objG2 != null ? objG2 : null) != null;
        }

        public static final boolean z(yyq yyqVar) {
            if ((yyqVar instanceof wyq) || (yyqVar instanceof xyq)) {
                return true;
            }
            if (yyqVar instanceof vyq) {
                return ((vyq) yyqVar).a.a();
            }
            if (!(yyqVar instanceof uyq)) {
                eg.o();
                return false;
            }
            List list = ((uyq) yyqVar).a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!z((yyq) it.next())) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
