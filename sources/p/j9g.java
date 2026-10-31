package p;

import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusResponse;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;
import com.spotify.localfiles.mediastoreimpl.LocalFilesProperties$TestHelper;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class j9g implements Update {
    public final Next a(Object obj, Object obj2) {
        y8g y8gVar;
        nra nraVar;
        tco tcoVar;
        String str;
        nra nraVar2;
        sce sceVar;
        i050 i050Var;
        aih1 aih1Var;
        String str2;
        i050 i050Var2;
        aih1 aih1Var2;
        h9g h9gVar;
        d5g d5gVar;
        zsa zsaVar;
        t2d1 t2d1Var;
        q7g q7gVar = (q7g) obj2;
        s8g s8gVar = ((t8g) obj).a;
        boolean z = false;
        tco tcoVar2 = null;
        str = null;
        String str3 = null;
        lraVarB = null;
        lra lraVarB = null;
        p6g j6gVar = null;
        Object j6gVar2 = null;
        k6gVar = null;
        k6g k6gVar = null;
        k6g k6gVar2 = null;
        tcoVar2 = null;
        if (q7gVar instanceof g7g) {
            g7g g7gVar = (g7g) q7gVar;
            j331 j331Var = g7gVar.a;
            j331 j331Var2 = g7gVar.b;
            v231 v231Var = j331Var instanceof v231 ? (v231) j331Var : null;
            if (v231Var != null && (t2d1Var = (t2d1) v231Var.a) != null) {
                z = t2d1Var.a;
            }
            if (z && !(j331Var2 instanceof v231)) {
                return Next.h(new t8g(c8g.a));
            }
            v231 v231Var2 = j331Var2 instanceof v231 ? (v231) j331Var2 : null;
            if (v231Var2 != null && (zsaVar = (zsa) v231Var2.a) != null) {
                str3 = zsaVar.a;
            }
            return Next.i(new t8g(new g8g(new t7g(z, str3))), Collections.singleton(new f6g(z, str3)));
        }
        if (q7gVar instanceof k7g) {
            k7g k7gVar = (k7g) q7gVar;
            if (s8gVar instanceof g8g) {
                try {
                    return s7g.b((g8g) s8gVar, k7gVar);
                } catch (Throwable th) {
                    n57.t("Invalid BE response", th);
                    return Next.i(new t8g(new d8g(((g8g) s8gVar).a)), Collections.singleton(new i6g(2)));
                }
            }
            Logger.d("Received " + k7gVar + " with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        if (q7gVar instanceof j7g) {
            if (s8gVar instanceof g8g) {
                return Next.i(new t8g(new d8g(((g8g) s8gVar).a)), Collections.singleton(new i6g(1)));
            }
            Logger.d("Received " + j7g.a + " with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        if (q7gVar instanceof y6g) {
            y6g y6gVar = (y6g) q7gVar;
            if (!(s8gVar instanceof e8g)) {
                Logger.d("Received " + y6gVar + " with incompatible state " + s8gVar, new Object[0]);
                return Next.j();
            }
            int iC = l1d.C(y6gVar.a);
            if (iC == 0) {
                d5gVar = ((e8g) s8gVar).b.d;
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                d5gVar = ((e8g) s8gVar).b.e;
            }
            if (d5gVar.a) {
                return Next.j();
            }
            e8g e8gVar = (e8g) s8gVar;
            h9g h9gVar2 = e8gVar.b;
            d5g d5gVar2 = h9gVar2.d;
            d5g d5gVar3 = h9gVar2.e;
            boolean zEquals = d5gVar.equals(d5gVar2);
            lra lraVar = h9gVar2.d.g;
            ora oraVar = lraVar.e;
            d5g d5gVarA = d5g.a(d5gVar2, zEquals, lra.a(lraVar, oraVar != null ? ora.a(oraVar, false) : null, false, 495), 62);
            boolean zEquals2 = d5gVar.equals(d5gVar3);
            lra lraVar2 = d5gVar3.g;
            ora oraVar2 = lraVar2.e;
            return Next.i(new t8g(e8g.a(e8gVar, s7g.c(h9g.a(h9gVar2, d5gVarA, d5g.a(d5gVar3, zEquals2, lra.a(lraVar2, oraVar2 != null ? ora.a(oraVar2, false) : null, false, 495), 62))), 0, 5)), Collections.singleton(new n6g(d5gVar.d)));
        }
        if (q7gVar instanceof d7g) {
            e8g e8gVar2 = s8gVar instanceof e8g ? (e8g) s8gVar : null;
            if (e8gVar2 != null && (h9gVar = e8gVar2.b) != null) {
                lraVarB = h9gVar.b();
            }
            if (lraVarB != null) {
                return Next.a(Collections.singleton(new b6g(lraVarB.d)));
            }
            Logger.d("Received " + d7g.a + " with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        if (q7gVar instanceof h7g) {
            if (s8gVar instanceof e8g) {
                e8g e8gVar3 = (e8g) s8gVar;
                h9g h9gVar3 = e8gVar3.b;
                lra lraVarB2 = h9gVar3.b();
                if ((lraVarB2 != null ? lraVarB2.e : null) != null) {
                    d5g d5gVarA2 = h9gVar3.d;
                    if (d5gVarA2.a) {
                        d5gVarA2 = s7g.a(d5gVarA2);
                    }
                    d5g d5gVarA3 = h9gVar3.e;
                    if (d5gVarA3.a) {
                        d5gVarA3 = s7g.a(d5gVarA3);
                    }
                    return Next.h(new t8g(e8g.a(e8gVar3, s7g.c(h9g.a(h9gVar3, d5gVarA2, d5gVarA3)), 0, 5)));
                }
            }
            Logger.d("Received " + h7g.a + " with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        boolean z2 = q7gVar instanceof z6g;
        o6g o6gVar = o6g.a;
        if (z2) {
            boolean z3 = s8gVar instanceof e8g;
            z6g z6gVar = z6g.a;
            if (!z3) {
                Logger.d("Received " + z6gVar + " with incompatible state " + s8gVar, new Object[0]);
                return Next.j();
            }
            e8g e8gVar4 = (e8g) s8gVar;
            h9g h9gVar4 = e8gVar4.b;
            d5g d5gVarG = h9gVar4.g();
            if (d5gVarG == null) {
                Logger.d("Received " + z6gVar + " with no selected provider " + h9gVar4, new Object[0]);
                return Next.j();
            }
            String str4 = d5gVarG.d;
            lra lraVar3 = d5gVarG.g;
            ora oraVar3 = lraVar3.e;
            if (oraVar3 != null && !oraVar3.b) {
                Logger.d("Received " + z6gVar + " without ticking check box " + h9gVar4, new Object[0]);
                return Next.j();
            }
            tly0 tly0Var = lraVar3.h;
            if (tly0Var instanceof sly0) {
                return Next.i(new t8g(e8g.a(e8gVar4, null, 1, 3)), f46.S0(new p6g[]{new z5g(((sly0) tly0Var).a), new h6g(str4)}));
            }
            if (tly0Var instanceof rly0) {
                return Next.i(new t8g(e8g.a(e8gVar4, null, 2, 3)), f46.S0(new p6g[]{new y5g(((rly0) tly0Var).a), new h6g(str4)}));
            }
            if (tly0Var instanceof qly0) {
                t7g t7gVar = e8gVar4.a;
                i050 i050Var3 = ((qly0) tly0Var).a;
                t8g t8gVar = new t8g(new m8g(t7gVar, h9gVar4, i050Var3));
                h6g h6gVar = new h6g(str4);
                aih1 aih1Var3 = i050Var3.d;
                return Next.i(t8gVar, dm61.B0(new p6g[]{o6gVar, h6gVar, aih1Var3 != null ? new l6g(aih1Var3.b) : null}));
            }
            if (!(tly0Var instanceof ply0)) {
                eg.o();
                return null;
            }
            Logger.d("Received " + z6gVar + " with " + ply0.a + " " + tly0Var, new Object[0]);
            return Next.j();
        }
        boolean z4 = q7gVar instanceof i7g;
        v7g v7gVar = v7g.a;
        d6g d6gVar = d6g.a;
        if (z4) {
            if (s8gVar instanceof c8g) {
                return Next.i(new t8g(f8g.a), Collections.singleton(e6g.a));
            }
            if (s8gVar instanceof d8g) {
                t7g t7gVar2 = ((d8g) s8gVar).a;
                return Next.i(new t8g(new g8g(t7gVar2)), Collections.singleton(new f6g(t7gVar2.a, t7gVar2.b)));
            }
            if (s8gVar instanceof q8g) {
                i050 i050Var4 = ((q8g) s8gVar).b;
                t8g t8gVar2 = new t8g(new n8g(i050Var4));
                aih1 aih1Var4 = i050Var4.d;
                return Next.i(t8gVar2, dm61.B0(new p6g[]{o6gVar, aih1Var4 != null ? new l6g(aih1Var4.b) : null}));
            }
            if (s8gVar instanceof p8g) {
                p8g p8gVar = (p8g) s8gVar;
                t7g t7gVar3 = p8gVar.b;
                h9g h9gVar5 = p8gVar.c;
                i050 i050Var5 = p8gVar.d;
                t8g t8gVar3 = new t8g(new m8g(t7gVar3, h9gVar5, i050Var5));
                aih1 aih1Var5 = i050Var5.d;
                return Next.i(t8gVar3, dm61.B0(new p6g[]{o6gVar, aih1Var5 != null ? new l6g(aih1Var5.b) : null}));
            }
            if (s8gVar instanceof y7g) {
                return Next.i(new t8g(v7gVar), Collections.singleton(d6gVar));
            }
            if (s8gVar instanceof x7g) {
                x7g x7gVar = (x7g) s8gVar;
                return Next.i(new t8g(new u7g(x7gVar.a, x7gVar.b)), Collections.singleton(d6gVar));
            }
            Logger.d("Received " + i7g.a + " with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        boolean z5 = q7gVar instanceof b7g;
        qwf qwfVar = pwf.a;
        if (z5) {
            return Next.a(Collections.singleton(new w5g(qwfVar)));
        }
        if (q7gVar instanceof u6g) {
            if (s8gVar instanceof q8g) {
                return Next.a(Collections.singleton(new w5g(qwfVar)));
            }
            if (s8gVar instanceof p8g) {
                p8g p8gVar2 = (p8g) s8gVar;
                boolean z6 = p8gVar2.a;
                t7g t7gVar4 = p8gVar2.b;
                return z6 ? Next.h(new t8g(new e8g(t7gVar4, p8gVar2.c, 3))) : Next.i(new t8g(new g8g(t7gVar4)), Collections.singleton(new f6g(t7gVar4.a, t7gVar4.b)));
            }
            if (s8gVar instanceof y7g) {
                return Next.a(Collections.singleton(new w5g(qwfVar)));
            }
            if (s8gVar instanceof x7g) {
                t7g t7gVar5 = ((x7g) s8gVar).a;
                return Next.i(new t8g(new g8g(t7gVar5)), Collections.singleton(new f6g(t7gVar5.a, t7gVar5.b)));
            }
            Logger.d("Received " + u6g.a + " with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        if (q7gVar instanceof c7g) {
            return Next.a(f46.S0(new c6g[]{new z5g(((c7g) q7gVar).a), new w5g(qwfVar)}));
        }
        boolean z7 = q7gVar instanceof f7g;
        qwf qwfVar2 = rwf.a;
        if (z7) {
            f7g f7gVar = (f7g) q7gVar;
            g250 g250Var = f7gVar.a;
            if (g250Var instanceof f250) {
                f250 f250Var = (f250) g250Var;
                uuy0 uuy0Var = f250Var.b;
                if ((uuy0Var != null ? uuy0Var.b : 0) == 1) {
                    qwfVar2 = qwf.a;
                }
                int i = uuy0Var != null ? uuy0Var.b : 0;
                String string = f250Var.a;
                if (i == 1) {
                    string = Uri.parse(string).buildUpon().appendQueryParameter("uc_payment_pending", LocalFilesProperties$TestHelper.TRUE).build().toString();
                }
                string.getClass();
                return Next.a(f46.S0(new c6g[]{new z5g(string), new w5g(qwfVar2)}));
            }
            if (!(g250Var instanceof c250) && !(g250Var instanceof d250)) {
                if (!(g250Var instanceof b250)) {
                    eg.o();
                    return null;
                }
                n57.e("Unexpected GPB checkout result: " + g250Var);
                return Next.j();
            }
            if (s8gVar instanceof j8g) {
                w5g w5gVar = new w5g(qwfVar);
                String str5 = ((j8g) s8gVar).a;
                if (str5 != null) {
                    j6gVar = g250Var instanceof d250 ? new j6g(str5) : new k6g(str5, 8);
                }
                return Next.a(dm61.B0(new p6g[]{w5gVar, j6gVar}));
            }
            if (s8gVar instanceof e8g) {
                tly0 tly0Var2 = ((e8g) s8gVar).b.e.g.h;
                qly0 qly0Var = tly0Var2 instanceof qly0 ? (qly0) tly0Var2 : null;
                String str6 = (qly0Var == null || (i050Var2 = qly0Var.a) == null || (aih1Var2 = i050Var2.d) == null) ? null : aih1Var2.b;
                if (str6 != null) {
                    j6gVar2 = g250Var instanceof d250 ? new j6g(str6) : new k6g(str6, 8);
                }
                return Next.a(dm61.A0(j6gVar2));
            }
            Logger.d("Received " + f7gVar + " with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        if (q7gVar instanceof l7g) {
            if (s8gVar instanceof e8g) {
                e8g e8gVar5 = (e8g) s8gVar;
                if (e8gVar5.c == 1) {
                    return Next.i(new t8g(new u7g(e8gVar5.a, e8gVar5.b)), Collections.singleton(d6gVar));
                }
            }
            return s8gVar instanceof k8g ? Next.i(new t8g(v7gVar), Collections.singleton(d6gVar)) : Next.j();
        }
        if (q7gVar instanceof m7g) {
            m7g m7gVar = (m7g) q7gVar;
            GetSessionStatusResponse getSessionStatusResponse = m7gVar.a;
            if (s8gVar instanceof v7g) {
                if (getSessionStatusResponse.o() == aq40.f) {
                    qwfVar = qwfVar2;
                }
                return Next.a(Collections.singleton(new w5g(qwfVar)));
            }
            if (!(s8gVar instanceof u7g)) {
                Logger.d("Received " + m7gVar + " with incompatible state " + s8gVar, new Object[0]);
                return Next.j();
            }
            int i2 = r7g.b[getSessionStatusResponse.o().ordinal()];
            if (i2 == 1) {
                return Next.a(Collections.singleton(new w5g(qwfVar2)));
            }
            if (i2 != 2) {
                t7g t7gVar6 = ((u7g) s8gVar).a;
                return Next.i(new t8g(new g8g(t7gVar6)), Collections.singleton(new f6g(t7gVar6.a, t7gVar6.b)));
            }
            u7g u7gVar = (u7g) s8gVar;
            return Next.h(new t8g(new e8g(u7gVar.a, u7gVar.b, 0)));
        }
        if (q7gVar instanceof e7g) {
            if (s8gVar instanceof v7g) {
                return Next.h(new t8g(y7g.a));
            }
            if (s8gVar instanceof u7g) {
                u7g u7gVar2 = (u7g) s8gVar;
                return Next.h(new t8g(new x7g(u7gVar2.a, u7gVar2.b)));
            }
            Logger.d("Received " + e7g.a + " with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        if (q7gVar instanceof x6g) {
            x6g x6gVar = (x6g) q7gVar;
            SubmitCheckoutResponse submitCheckoutResponse = x6gVar.a;
            if (s8gVar instanceof n8g) {
                if (!submitCheckoutResponse.s()) {
                    return Next.h(new t8g(new q8g(false, ((n8g) s8gVar).a)));
                }
                i050 i050Var6 = ((n8g) s8gVar).a;
                aih1 aih1Var6 = i050Var6.d;
                return Next.i(new t8g(new j8g(aih1Var6 != null ? aih1Var6.b : null)), Collections.singleton(new x5g(i050Var6)));
            }
            if (s8gVar instanceof m8g) {
                if (submitCheckoutResponse.s()) {
                    m8g m8gVar = (m8g) s8gVar;
                    return Next.i(new t8g(new e8g(m8gVar.a, m8gVar.b, 3)), Collections.singleton(new x5g(m8gVar.c)));
                }
                m8g m8gVar2 = (m8g) s8gVar;
                return Next.h(new t8g(new p8g(false, m8gVar2.a, m8gVar2.b, m8gVar2.c)));
            }
            Logger.d("Received " + x6gVar + " with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        if (q7gVar instanceof o7g) {
            o7g o7gVar = (o7g) q7gVar;
            Throwable th2 = o7gVar.a;
            if (s8gVar instanceof n8g) {
                i050 i050Var7 = ((n8g) s8gVar).a;
                t8g t8gVar4 = new t8g(new q8g(true, i050Var7));
                aih1 aih1Var7 = i050Var7.d;
                if (aih1Var7 != null && (str2 = aih1Var7.b) != null) {
                    k6gVar = new k6g(str2, th2 instanceof IOException ? 1 : 2);
                }
                return Next.i(t8gVar4, dm61.A0(k6gVar));
            }
            if (!(s8gVar instanceof m8g)) {
                Logger.d("Received " + o7gVar + " with incompatible state " + s8gVar, new Object[0]);
                return Next.j();
            }
            m8g m8gVar3 = (m8g) s8gVar;
            t7g t7gVar7 = m8gVar3.a;
            h9g h9gVar6 = m8gVar3.b;
            t8g t8gVar5 = new t8g(new p8g(true, t7gVar7, h9gVar6, m8gVar3.c));
            tly0 tly0Var3 = h9gVar6.e.g.h;
            qly0 qly0Var2 = tly0Var3 instanceof qly0 ? (qly0) tly0Var3 : null;
            String str7 = (qly0Var2 == null || (i050Var = qly0Var2.a) == null || (aih1Var = i050Var.d) == null) ? null : aih1Var.b;
            if (str7 != null) {
                k6gVar2 = new k6g(str7, th2 instanceof IOException ? 1 : 2);
            }
            return Next.i(t8gVar5, dm61.A0(k6gVar2));
        }
        if (q7gVar instanceof v6g) {
            if ((s8gVar instanceof e8g) && (sceVar = ((e8g) s8gVar).b.f) != null) {
                return Next.a(Collections.singleton(new a6g(sceVar.c)));
            }
            Logger.d("Received ChangeCountryClicked with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        if (q7gVar instanceof a7g) {
            a7g a7gVar = (a7g) q7gVar;
            if (!(s8gVar instanceof e8g) || ((e8g) s8gVar).b.f == null) {
                Logger.d("Received CountryPicked with incompatible state " + s8gVar, new Object[0]);
                return Next.j();
            }
            String str8 = a7gVar.a.c;
            if (str8 != null) {
                return Next.a(f46.S0(new c6g[]{new z5g(str8), new w5g(qwfVar)}));
            }
            Logger.g("Selected a country without URL, likely to be the current country", new Object[0]);
            return Next.j();
        }
        if (q7gVar instanceof p7g) {
            if (s8gVar instanceof e8g) {
                h9g h9gVar7 = ((e8g) s8gVar).b;
                lra lraVarB3 = h9gVar7.b();
                if (lraVarB3 != null && (nraVar2 = lraVarB3.a) != null) {
                    tcoVar2 = nraVar2.b;
                }
                if (tcoVar2 != null) {
                    lra lraVarB4 = h9gVar7.b();
                    return (lraVarB4 == null || (nraVar = lraVarB4.a) == null || (tcoVar = nraVar.b) == null || (str = tcoVar.b) == null) ? Next.j() : Next.a(f46.S0(new c6g[]{new z5g(str), new w5g(qwfVar)}));
                }
            }
            Logger.d("Received UnavailableBannerCtaClicked with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        if (q7gVar instanceof w6g) {
            if ((s8gVar instanceof e8g) && (y8gVar = ((e8g) s8gVar).b.g) != null) {
                return Next.a(f46.S0(new p6g[]{g6g.a, new z5g(y8gVar.b), new w5g(qwfVar)}));
            }
            Logger.d("Received ChangeProductClicked with incompatible state " + s8gVar, new Object[0]);
            return Next.j();
        }
        if (!(q7gVar instanceof n7g)) {
            eg.o();
            return null;
        }
        n7g n7gVar = (n7g) q7gVar;
        int iOrdinal = n7gVar.a.ordinal();
        if (iOrdinal == 0) {
            return Next.a(Collections.singleton(new w5g(qwfVar2)));
        }
        if (iOrdinal == 1) {
            return s8gVar instanceof l8g ? Next.a(Collections.singleton(new w5g(qwfVar))) : Next.j();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return Next.a(Collections.singleton(new w5g(qwfVar)));
            }
            eg.o();
            return null;
        }
        if (s8gVar instanceof l8g) {
            return Next.a(Collections.singleton(new w5g(qwfVar)));
        }
        if (s8gVar instanceof e8g) {
            t7g t7gVar8 = ((e8g) s8gVar).a;
            return Next.i(new t8g(new g8g(t7gVar8)), Collections.singleton(new f6g(t7gVar8.a, t7gVar8.b)));
        }
        Logger.d("Received " + n7gVar + " with incompatible state " + s8gVar, new Object[0]);
        return Next.j();
    }
}
