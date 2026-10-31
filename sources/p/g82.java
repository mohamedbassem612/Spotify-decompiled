package p;

import android.content.Context;
import android.widget.FrameLayout;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g82 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g82(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke() {
        f0u f0uVar;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                h82 h82Var = (h82) obj;
                return new kpg0((smp0) h82Var.c, new jm1(h82Var, (byte) 12));
            case 1:
                return (i8h1) ((jwo) obj).get();
            case 2:
                zwg zwgVar = ((fi2) obj).G1;
                if (zwgVar == null) {
                    u890.C("actions");
                    throw null;
                }
                i8h1 i8h1Var = (i8h1) zwgVar.b;
                x6h1 x6h1VarC = ((bqk0) zwgVar.d).b.c();
                x6h1VarC.i.add(new a7h1("go_back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
                ((kg0) zwgVar.a).d(new ckt(1), true);
                return rih1Var;
            case 3:
                ((yo2) ((hu2) obj).a.get()).i();
                return rih1Var;
            case 4:
                return Integer.valueOf(((es41) ((u961) obj).a).a.s());
            case 5:
                nnr nnrVarK = ((g0l) obj).k();
                if (nnrVarK == null || (f0uVar = nnrVarK.c) == null) {
                    f0uVar = f0u.a;
                }
                return f0uVar.name();
            case 6:
                return new kpg0((nu) obj, b03.O0);
            case 7:
                return q1o1.u(new jpg0((d83) obj, b03.Q0), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 8:
                asn asnVar = (asn) ((hyo) obj).a.b;
                lzn0 lzn0Var = (lzn0) ((nzp) asnVar.a).b.i.get();
                c8o.l(lzn0Var);
                koc0 koc0Var = ((qbt) asnVar.b).b;
                nzp nzpVar = (nzp) asnVar.a;
                gr6 gr6Var = (gr6) nzpVar.b.Q5.get();
                c8o.l(gr6Var);
                daq daqVar = nzpVar.a;
                gw70 gw70Var = (gw70) daqVar.d8.get();
                c8o.l(gw70Var);
                nww0 nww0Var = (nww0) daqVar.Jn.get();
                c8o.l(nww0Var);
                af10 af10Var = new af10(gw70Var, nww0Var);
                uu00 uu00Var = (uu00) daqVar.a5.get();
                c8o.l(uu00Var);
                return new kpg0(new res(lzn0Var, koc0Var, gr6Var, af10Var, uu00Var), q83.S0);
            case 9:
                ka3 ka3Var = (ka3) obj;
                gal galVar = (gal) ((iyo) ka3Var.d).a.b;
                Context context = (Context) ((vzp) galVar.b).b.x1.a;
                c8o.l(context);
                boolean zS = bno1.s(context);
                vzp vzpVar = (vzp) galVar.b;
                o241 o241Var = (o241) vzpVar.b.u4.get();
                c8o.l(o241Var);
                luk lukVar = (luk) vzpVar.b.L1.get();
                c8o.l(lukVar);
                return new kpg0(new iz0(zS, o241Var, new dp4(false, false, lukVar)), new tsm1(ka3Var, (byte) 21));
            case 10:
                qa3 qa3Var = (qa3) obj;
                return new kpg0(qa3Var.c.a(new pa3(qa3Var.a), new l2(qa3Var, (lnm) null, (byte) 5)), new ma3(qa3Var, (byte) 1));
            case 11:
                return (tl7) ((vh) obj).c;
            case 12:
                rb3 rb3Var = (rb3) obj;
                oql oqlVar = (oql) ((qyo) rb3Var.d).a.b;
                lzn0 lzn0Var2 = (lzn0) ((yzp) oqlVar.b).a.i.get();
                c8o.l(lzn0Var2);
                xfx xfxVar = (xfx) ((yzp) oqlVar.b).a.q1.get();
                c8o.l(xfxVar);
                return q1o1.u(new jpg0(new rt01(lzn0Var2, xfxVar, (byte) 5), new jm1(rb3Var, (byte) 25)), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 13:
                ce3 ce3Var = (ce3) obj;
                return q1o1.u(new jpg0(ce3Var.c.a(), new jm1(ce3Var, (byte) 29)), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 14:
                bg3 bg3Var = (bg3) obj;
                gzo gzoVar = (gzo) bg3Var.d;
                e4b1 e4b1Var = (e4b1) bg3Var.g;
                gal galVar2 = (gal) gzoVar.a.b;
                xfx xfxVar2 = (xfx) ((ozp) galVar2.b).b.q1.get();
                c8o.l(xfxVar2);
                wfx wfxVar = xfxVar2.c;
                vwf1 vwf1Var = new vwf1(wfxVar, new zfx(wfxVar, (byte) 7));
                ozp ozpVar = (ozp) galVar2.b;
                o241 o241Var2 = (o241) ozpVar.a.u4.get();
                c8o.l(o241Var2);
                luk lukVar2 = (luk) ozpVar.a.L1.get();
                c8o.l(lukVar2);
                dp4 dp4Var = new dp4(false, false, lukVar2);
                ux3 ux3Var = (ux3) ozpVar.b.d8.get();
                c8o.l(ux3Var);
                return new xqw(new jpg0(new hg3(vwf1Var, e4b1Var, o241Var2, dp4Var, ux3Var), new ve3(bg3Var, (byte) 1)));
            case 15:
                zg3 zg3Var = (zg3) obj;
                asn asnVar2 = (asn) ((hzo) zg3Var.e).a.b;
                lzn0 lzn0Var3 = (lzn0) ((b0q) asnVar2.a).a.i.get();
                c8o.l(lzn0Var3);
                r6h1 r6h1Var = ((bct) asnVar2.b).e;
                xfx xfxVar3 = (xfx) ((b0q) asnVar2.a).a.q1.get();
                c8o.l(xfxVar3);
                return q1o1.u(new jpg0(new rt01(lzn0Var3, r6h1Var, xfxVar3), new ve3(zg3Var, (byte) 3)), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            case 16:
                ((ps3) obj).c.d("back");
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(((Context) ((ow3) obj).b).getResources().getAssets().open("app_remote_allow_list.csv"), nne.a), 8192);
                    try {
                        Map mapV = sqg0.V(new sgg1(dt3.e, z561.T(dt3.d, z561.R(new hjc0(bufferedReader)))));
                        bufferedReader.close();
                        return mapV;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(bufferedReader, th);
                            throw th2;
                        }
                    }
                } catch (Exception e) {
                    v8i0.j("Failed to read app-remote allow list file: ", e.getMessage());
                    return b7xVar;
                }
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                r34 r34Var = (r34) obj;
                luk lukVar3 = r34Var.c;
                if (lukVar3 != null) {
                    return (r34) lukVar3.e(new d42(r34Var, (byte) 1));
                }
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                v34 v34Var = (v34) obj;
                luk lukVar4 = v34Var.b;
                if (lukVar4 != null) {
                    return (v34) lukVar4.e(new d42(v34Var, (byte) 2));
                }
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                w34 w34Var = (w34) obj;
                luk lukVar5 = w34Var.c;
                if (lukVar5 != null) {
                    return lukVar5.e(new d42(w34Var, (byte) 3));
                }
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                x34 x34Var = (x34) obj;
                luk lukVar6 = x34Var.c;
                if (lukVar6 != null) {
                    return lukVar6.e(new d42(x34Var, (byte) 4));
                }
                return null;
            case 22:
                y34 y34Var = (y34) obj;
                luk lukVar7 = y34Var.b;
                if (lukVar7 != null) {
                    return lukVar7.e(new d42(y34Var, (byte) 5));
                }
                return null;
            case 23:
                z34 z34Var = (z34) obj;
                feh1 feh1Var = z34Var.b;
                if (feh1Var != null) {
                    return feh1Var.e(new d42(z34Var, (byte) 6));
                }
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                a44 a44Var = (a44) obj;
                luk lukVar8 = a44Var.m;
                if (lukVar8 != null) {
                    return lukVar8.e(new d42(a44Var, (byte) 7));
                }
                return null;
            case 25:
                g44 g44Var = (g44) obj;
                luk lukVar9 = g44Var.b;
                if (lukVar9 != null) {
                    return lukVar9.e(new d42(g44Var, (byte) 8));
                }
                return null;
            case 26:
                i44 i44Var = (i44) obj;
                luk lukVar10 = i44Var.h;
                if (lukVar10 != null) {
                    return lukVar10.e(new d42(i44Var, (byte) 9));
                }
                return null;
            case 27:
                j44 j44Var = (j44) obj;
                luk lukVar11 = j44Var.i;
                if (lukVar11 != null) {
                    return lukVar11.e(new d42(j44Var, (byte) 10));
                }
                return null;
            case 28:
                k44 k44Var = (k44) obj;
                luk lukVar12 = k44Var.b;
                if (lukVar12 != null) {
                    return lukVar12.e(new d42(k44Var, (byte) 11));
                }
                return null;
            default:
                l44 l44Var = (l44) obj;
                luk lukVar13 = l44Var.c;
                if (lukVar13 != null) {
                    return (l44) lukVar13.e(new d42(l44Var, (byte) 12));
                }
                return null;
        }
    }
}
