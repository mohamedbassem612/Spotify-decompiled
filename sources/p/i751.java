package p;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i751 {
    public final lzn0 a;
    public final yh2 b;
    public final mzr0 c;
    public final jxp0 d;
    public final c8b e;
    public final wr00 f;
    public final t740 g;
    public final dlg1 h;
    public final vb2 i;
    public final a0m j;
    public final by3 k;
    public final l651 l;
    public final t751 m;
    public final wen0 n;
    public final c9n o;

    public i751(lzn0 lzn0Var, yh2 yh2Var, mzr0 mzr0Var, jxp0 jxp0Var, c8b c8bVar, wr00 wr00Var, t740 t740Var, dlg1 dlg1Var, vb2 vb2Var, a0m a0mVar, by3 by3Var, l651 l651Var, t751 t751Var, wen0 wen0Var, c9n c9nVar) {
        this.a = lzn0Var;
        this.b = yh2Var;
        this.c = mzr0Var;
        this.d = jxp0Var;
        this.e = c8bVar;
        this.f = wr00Var;
        this.g = t740Var;
        this.h = dlg1Var;
        this.i = vb2Var;
        this.j = a0mVar;
        this.k = by3Var;
        this.l = l651Var;
        this.m = t751Var;
        this.n = wen0Var;
        this.o = c9nVar;
    }

    public final void a(hd51 hd51Var) {
        String str;
        boolean z = hd51Var instanceof tc51;
        lzn0 lzn0Var = this.a;
        Bundle bundle = null;
        if (z) {
            tc51 tc51Var = (tc51) hd51Var;
            String str2 = tc51Var.b;
            boolean z2 = tc51Var.e;
            tv80 tv80Var = tc51Var.c;
            dwn0 dwn0Var = new dwn0(str2, "", false, false, 0, 0, z2, b690.b, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null);
            gto1 gto1Var = tc51Var.d;
            if (gto1Var != null) {
                Bundle bundle2 = new Bundle();
                if (gto1Var instanceof ob10) {
                    bundle2.putSerializable("queryCompletionSource", gyh.a);
                } else if (gto1Var instanceof tb10) {
                    bundle2.putSerializable("queryCompletionSource", gyh.b);
                } else if (gto1Var instanceof qb10) {
                    bundle2.putSerializable("queryCompletionSource", gyh.d);
                } else if (gto1Var instanceof sb10) {
                    sb10 sb10Var = (sb10) gto1Var;
                    bundle2.putString("playlist_image_uri_intent_key", sb10Var.b);
                    bundle2.putString("session_id_intent_key", sb10Var.c);
                    bundle2.putString("message_id_intent_key", sb10Var.d);
                } else if (gto1Var instanceof rb10) {
                    bundle2.putSerializable("queryCompletionSource", gyh.e);
                } else {
                    if (!(gto1Var instanceof pb10)) {
                        eg.o();
                        return;
                    }
                    pb10 pb10Var = (pb10) gto1Var;
                    String str3 = pb10Var.c;
                    bundle2.putParcelable("martini-launch-parameters", new r6h0(pb10Var.e));
                    bundle2.putBoolean("martini-open-with-keyboard", str3 == null);
                    bundle2.putString("martini-input-placeholder", pb10Var.b);
                    bundle2.putString("martini-prompt", str3);
                    List list = pb10Var.d;
                    bundle2.putStringArrayList("martini-chat-suggestions", list != null ? new ArrayList<>(list) : null);
                }
                bundle = bundle2;
            }
            l651 l651Var = l651.b;
            l651 l651Var2 = this.l;
            if (l651Var2 == l651Var && nhc1.Y(str2, "spotify:search:", false)) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSerializable("searchOrigin", l651Var2);
            }
            lzn0Var.i(dwn0Var, bundle);
            return;
        }
        if (hd51Var instanceof yc51) {
            this.b.c(((yc51) hd51Var).b, (String) null);
            return;
        }
        if (hd51Var instanceof ad51) {
            this.e.a(((ad51) hd51Var).b, false);
            return;
        }
        if (hd51Var instanceof uc51) {
            lzn0Var.e();
            return;
        }
        if (hd51Var.equals(wc51.b)) {
            bpb1 bpb1Var = this.n;
            ue20 ue20Var = (ue20) bpb1Var.getValue();
            if (ue20Var instanceof re20) {
                re20 re20VarA = re20.a((re20) ue20Var, null, false, 6);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, re20VarA);
                return;
            } else {
                if (!(ue20Var instanceof te20)) {
                    if (u890.j(ue20Var, se20.a)) {
                        return;
                    }
                    eg.o();
                    return;
                }
                List list2 = ((te20) ue20Var).a;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(db20.a((db20) it.next(), false));
                }
                te20 te20Var = new te20(arrayList, null);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, te20Var);
                return;
            }
        }
        boolean z3 = hd51Var instanceof sc51;
        t751 t751Var = this.m;
        if (z3) {
            t751Var.a();
            return;
        }
        if (hd51Var instanceof bd51) {
            bd51 bd51Var = (bd51) hd51Var;
            String str4 = bd51Var.b;
            tv80 tv80Var2 = bd51Var.c;
            boolean z4 = bd51Var.d;
            boolean z5 = bd51Var.e;
            mzr0 mzr0Var = this.c;
            String strSubstring = ((e8r0) mzr0Var.a).a().e;
            if (sgy.c(str4) || sgy.d(str4)) {
                if (tv80Var2 != null) {
                    vgm vgmVar = (vgm) mzr0Var.c;
                    while (true) {
                        Parcelable.Creator creator = lik1.CREATOR;
                        if (oap1.o(strSubstring) || !ihc1.h0(strSubstring, ":", false)) {
                            break;
                        }
                        int iB0 = ihc1.B0(strSubstring, ":", 0, 6);
                        if (iB0 != -1) {
                            strSubstring = strSubstring.substring(0, iB0);
                        }
                    }
                    vgmVar.d(str4, strSubstring, tv80Var2, new tgm((String) null, false, false, true, true, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -41, 1));
                    return;
                }
                return;
            }
            waz0 waz0Var = (waz0) mzr0Var.f;
            bbz0 bbz0VarA = waz0Var.a();
            vsf1 vsf1Var = new vsf1((String) null, (String) null, true, (String) null, false, bbz0VarA.a, true, false, z4 || z5 || !waz0Var.b(bbz0VarA, str4), true, (String) null, false, false, false, true, false, (ugo0) null, (ok51) null, false, (g371) null, false, false, false, false, false, false, z4, false, (p860) null, (String) null, false, false, -536905061, 63);
            lik1 lik1Var = new lik1(strSubstring);
            dmf1 dmf1Var = new dmf1(str4, lik1Var, (String) null, vsf1Var, (Map) null);
            if (!((bmf1) mzr0Var.g).a.a()) {
                mfm mfmVarA = ((i4q) mzr0Var.d).a(lik1Var);
                Observable observableD = ((jsf1) mzr0Var.b).d(dmf1Var);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.b(mfmVarA, observableD, yon1.G1("CONTEXTMENU_TRACK", "contextmenu/track", 442, "contextmenu"), (bjm) null, tv80Var2, 20);
                return;
            }
            yhm yhmVar = (yhm) mzr0Var.e;
            if (tv80Var2 != null) {
                yhmVar.a(dmf1Var, tv80Var2);
                return;
            } else {
                yhmVar.a(dmf1Var, (tv80) null);
                return;
            }
        }
        if (hd51Var instanceof gd51) {
            t751Var.c(((gd51) hd51Var).b);
            return;
        }
        if (hd51Var instanceof cd51) {
            this.f.a(((cd51) hd51Var).b);
            return;
        }
        if (hd51Var instanceof zc51) {
            fn31.T(this.o, (o8n) null, 0, new lc41(this, hd51Var, (lnm) null, (byte) 16), 3);
            return;
        }
        if (hd51Var instanceof dd51) {
            dd51 dd51Var = (dd51) hd51Var;
            String str5 = dd51Var.b;
            String str6 = dd51Var.c;
            tv80 tv80Var3 = dd51Var.d;
            w951 w951Var = dd51Var.e;
            if (u890.j(w951Var, v951.a)) {
                str = "spotify:windowed-song:click";
            } else {
                if (!u890.j(w951Var, t951.a) && !u890.j(w951Var, u951.a)) {
                    eg.o();
                    return;
                }
                str = "spotify:gated-song:click";
            }
            this.g.a(str5, str6, str, dd51Var.b, tv80Var3);
            return;
        }
        if (hd51Var instanceof fd51) {
            dlg1 dlg1Var = this.h;
            x1i1 x1i1Var = (x1i1) dlg1Var.a;
            e940 e940Var = ((fd51) hd51Var).b;
            if (!((di4) dlg1Var.c).J()) {
                if (e940Var == null) {
                    return;
                }
                x1i1.a(x1i1Var, new z740(2, e940Var.a, e940Var.b), 6);
                return;
            }
            Activity activity = (Activity) ((laz) dlg1Var.b).b;
            c1i1 c1i1Var = new c1i1("search-gated-content", activity.getString(2131961508), activity.getString(2131961506), (azh1) null, new b1i1(activity.getString(2131961507), nik1.b2.a), (b1i1) null);
            dn81 dn81Var = x1i1Var.b;
            Parcelable u1i1Var = new u1i1(c1i1Var);
            a1r0 a1r0Var = (a1r0) dn81Var.b;
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("upsells_page_params", u1i1Var);
            a1r0.j(a1r0Var, "spotify:internal:upsells-sheet", (String) null, bundle3, false, 2);
            return;
        }
        if (hd51Var instanceof vc51) {
            tv80 tv80Var4 = ((vc51) hd51Var).b;
            if (tv80Var4 != null) {
                e7p0.e((e7p0) this.d.b, tv80Var4);
                return;
            } else {
                n57.e("Can't open NPV, interactionLoggingResult is null");
                return;
            }
        }
        if (hd51Var instanceof xc51) {
            xc51 xc51Var = (xc51) hd51Var;
            vb2.b(this.i, new db2(xc51Var.c), true, xc51Var.b);
            return;
        }
        if (!(hd51Var instanceof ed51)) {
            eg.o();
            return;
        }
        boolean z6 = ((ed51) hd51Var).b;
        kt91 kt91Var = (kt91) this.j.b;
        int i = z6 ? 2131961500 : 2131954603;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        er91 er91Var = new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }
}
