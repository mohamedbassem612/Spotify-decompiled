package p;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.concertcampaignview.v1.CampaignRoutingWithStatus;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d1c extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1c(Object obj, Object obj2, Object obj3, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object invoke() {
        byte b = 4;
        switch (this.a) {
            case 0:
                ((ven0) this.c).setValue((Integer) this.b);
                ((ven0) this.d).setValue(Boolean.FALSE);
                return rih1.a;
            case 1:
                o0i o0iVar = (o0i) this.d;
                p2c p2cVar = (p2c) this.c;
                l2c l2cVar = (l2c) this.b;
                x2g0 x2g0Var = l2cVar.f;
                lnm lnmVar = null;
                if (x2g0Var instanceof j2c) {
                    x2g0Var.getClass();
                    String strC = x2g0Var.C();
                    tv80 tv80VarD = p2cVar.b.d(o0iVar.e, "boxed_entity_row", zmo1.s(strC), l2cVar.X, new nb9(strC, (byte) 25));
                    p2cVar.i.a(7, b7x.a);
                    p2cVar.c.a(strC, tv80VarD, (Bundle) null);
                } else if (x2g0Var instanceof k2c) {
                    fn31.T(o0iVar.a, (o8n) null, 0, new sxa(p2cVar, o0iVar, l2cVar, lnmVar, (byte) 6), 3);
                }
                return rih1.a;
            case 2:
                Set<mmr0> set = (Set) this.b;
                hbc hbcVar = (hbc) this.c;
                BluetoothDevice bluetoothDevice = (BluetoothDevice) this.d;
                for (mmr0 mmr0Var : set) {
                    hbcVar.b.invoke(bluetoothDevice, (UUID) mmr0Var.a, (byte[]) mmr0Var.b);
                }
                return rih1.a;
            case 3:
                vxc vxcVar = (vxc) this.b;
                bcl1 bcl1Var = vxcVar.c;
                hp80 hp80Var = ((o0i) this.c).e;
                uxc uxcVar = (uxc) this.d;
                tv80 tv80VarF = bcl1.f(bcl1Var, hp80Var, "call_to_action_events_button", uxcVar.d.a.c, (String) null, jpc.P0, 8);
                lzn0 lzn0Var = vxcVar.b;
                String strR = i1k0.r();
                w900 w900Var = uxcVar.d;
                ArrayList arrayList = w900Var.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((u900) it.next()).d);
                }
                String str = w900Var.a.c;
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("multi_event_card_uris", new ArrayList<>(arrayList2));
                bundle.putString("multi_event_card_artist_uri", str);
                lzn0Var.a(strR, tv80VarF, bundle);
                return rih1.a;
            case 4:
                vxc vxcVar2 = (vxc) this.b;
                bcl1 bcl1Var2 = vxcVar2.c;
                hp80 hp80Var2 = ((o0i) this.c).e;
                zxc zxcVar = (zxc) this.d;
                vxcVar2.b.a(zxcVar.d, bcl1.f(bcl1Var2, hp80Var2, "call_to_action_navigation_button", zxcVar.a, (String) null, new ayc(zxcVar, (byte) 0), 8), (Bundle) null);
                return rih1.a;
            case 5:
                eyc eycVar = (eyc) this.b;
                z0i z0iVar = eycVar.c;
                if (z0iVar != null) {
                    fyc fycVar = (fyc) this.c;
                    bcl1.f((bcl1) fycVar.b, ((o0i) this.d).e, "call_to_action_sheet_button", (String) null, eycVar.e, jpc.Q0, 4);
                    ((hcl1) fycVar.c).c.m((Object) null, new icl1(z0iVar, false));
                }
                return rih1.a;
            case 6:
                xu30 xu30Var = (xu30) this.b;
                String title = ((fpd) this.c).getTitle();
                xu30Var.invoke(new apd(new lwc(title != null ? title : ""), (nwc) null, new dvc((String) null, 2), (p80) null, (y6x0) null, (Float) null, 250), 0, (ouk0) this.d);
                return rih1.a;
            case 7:
                x8b0 x8b0Var = (x8b0) ((tob1) this.b).getValue();
                int size = ((rnc0) ((tob1) this.c).getValue()).b.size();
                int i = x8b0Var.a;
                return Boolean.valueOf((x8b0Var.c == 0 || x8b0Var.b + i >= 50) && i == size && !(((ajc1) ((tob1) this.d).getValue()) instanceof zic1));
            case 8:
                i8h1 i8h1Var = (i8h1) this.b;
                x6h1 x6h1VarC = ((o0e) this.d).d.b.c();
                x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((ven0) this.c).setValue(Boolean.TRUE);
                return rih1.a;
            case 9:
                bcl1.f((bcl1) ((fyc) this.b).b, ((o0i) this.d).e, "chapter_navigation_list_button", (String) null, (String) null, xj.R0, 12);
                ((ven0) this.c).setValue(Boolean.TRUE);
                return rih1.a;
            case 10:
                bcl1 bcl1Var3 = (bcl1) ((fyc) this.b).b;
                ven0 ven0Var = (ven0) this.c;
                bcl1Var3.g((t480) ven0Var.getValue());
                ven0Var.setValue((Object) null);
                ((ven0) this.d).setValue(Boolean.FALSE);
                return rih1.a;
            case 11:
                ((iu30) this.b).invoke(new dpe((String) this.c, ((jre) this.d) instanceof ire));
                return rih1.a;
            case 12:
                nwe nweVar = (nwe) this.b;
                nweVar.r1(true);
                fn31.T(cto1.q(nweVar), (o8n) null, 0, new sxa((cwe) this.c, (gob) this.d, nweVar, null, (byte) 27), 3);
                return rih1.a;
            case 13:
                jqd0 jqd0Var = (jqd0) this.b;
                jqd0Var.b = false;
                t45 t45VarA = ((zle1) jqd0Var.c).a("load_sidedrawer_campfire_rows");
                t45VarA.h = "android-social-sidedrawer";
                t45.m(t45VarA, "load_sidedrawer_campfire_rows", 4);
                jqd0Var.d = t45VarA;
                return eth.t(((iqf) this.c).a, new huz((Object) null, (byte) 10), new w9f((aiq) this.d, (jqd0) this.b, (byte) 8));
            case 14:
                wsf wsfVar = (wsf) this.c;
                hur hurVar = wsfVar.c;
                we1 we1Var = new we1(new idd1(new ame(wsfVar, (u9c0) this.d, (byte) 8)), (byte) 1);
                ssf ssfVar = (ssf) this.b;
                if (ssfVar instanceof qsf) {
                    qsf qsfVar = (qsf) ssfVar;
                    return rqt0.t(new vd0(hurVar.l(Collections.singleton(qsfVar.a)), we1Var, qsfVar, (byte) 18), eqe.Z);
                }
                if (ssfVar instanceof rsf) {
                    rsf rsfVar = (rsf) ssfVar;
                    return new vd0(new x010(hurVar.l(o7h.p1(rsfVar.a)), new nwd(wsfVar.a.e.a(), (byte) 5), new vm0(3, (lnm) null, (byte) 6), (byte) 1), we1Var, rsfVar, (byte) 19);
                }
                eg.o();
                return null;
            case 15:
                WebResourceError webResourceError = (WebResourceError) this.c;
                dsk0 dsk0Var = ((pyf) this.b).g2;
                if (dsk0Var == null) {
                    u890.C("webviewEventsFact");
                    throw null;
                }
                String str2 = webResourceError.getErrorCode() + ": " + ((Object) webResourceError.getDescription());
                String string = ((WebResourceRequest) this.d).getUrl().toString();
                x6h1 x6h1VarC2 = dsk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("page_error", (String) null, (Integer) null, string, str2));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA2;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 16:
                ((iu30) this.b).invoke(new o4g(((m4g) this.c).b, ((p220) this.d).b));
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                fn31.T((c9n) this.b, (o8n) null, 0, new mbg((iu30) this.d, (ven0) this.c, (lnm) null), 3);
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (((ubg) this.b).b) {
                    ((ven0) this.c).setValue(Boolean.TRUE);
                } else {
                    ((Function0) this.d).invoke();
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                i8h1 i8h1Var2 = (i8h1) this.b;
                wwk0 wwk0Var = (wwk0) this.d;
                wwk0Var.getClass();
                x6h1 x6h1VarC3 = wwk0Var.b.c();
                x6h1VarC3.i.add(new a7h1("keep_editing_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                b7x b7xVar2 = b7x.a;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_hide", 1, b7xVar2), y6h1VarA3, wwk0Var.a, System.currentTimeMillis()), (xj61) null);
                ((ven0) this.c).setValue(Boolean.FALSE);
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                i8h1 i8h1Var3 = (i8h1) this.b;
                vwk0 vwk0Var = (vwk0) this.c;
                vwk0Var.getClass();
                x6h1 x6h1VarC4 = vwk0Var.a.c();
                x6h1VarC4.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA4 = x6h1VarC4.a();
                b7x b7xVar3 = b7x.a;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("ui_navigate_back", 1, b7xVar3), y6h1VarA4, r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((Function0) this.d).invoke();
                return rih1.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                i34 i34Var = (i34) this.b;
                vlh vlhVar = ((ffh) this.c).d;
                RecyclerView recyclerView = (RecyclerView) ((kap1) i34Var.b).b;
                vlhVar.getClass();
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                kjh kjhVar = vlhVar.a;
                recyclerView.setAdapter(kjhVar);
                recyclerView.j(vlhVar.b);
                i34Var.c = kjhVar.L(new dfh((iu30) this.d, (byte) 0));
                return rih1.a;
            case 22:
                y7e1 y7e1Var = (y7e1) this.b;
                String string2 = y7e1Var.d().d.toString();
                h4e1 h4e1VarH = y7e1Var.h();
                try {
                    h4e1VarH.k(0, h4e1VarH.c.length(), "");
                    y7e1Var.a(h4e1VarH);
                    y7e1Var.c();
                    az20.a((az20) this.c);
                    ((iu30) this.d).invoke(string2);
                    return rih1.a;
                } catch (Throwable th) {
                    y7e1Var.c();
                    throw th;
                }
            case 23:
                mjh mjhVar = (mjh) this.b;
                bcl1 bcl1Var4 = mjhVar.b;
                hp80 hp80Var3 = ((o0i) this.c).e;
                ljh ljhVar = (ljh) this.d;
                bcl1.f(bcl1Var4, hp80Var3, "comments_button", ljhVar.a, (String) null, cgh.U0, 8);
                tmh.a((tmh) mjhVar.c, ljhVar.a, (lik1) mjhVar.d, false, ljhVar.d, 4);
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                uyl uylVar = (uyl) this.b;
                f1r f1rVarB = fq7.B(uylVar);
                uzj uzjVar = new uzj((d0r) this.c, uylVar, f1rVarB);
                lwb0 lwb0Var = (lwb0) this.d;
                uzjVar.g(uylVar);
                uzjVar.c = f1rVarB;
                uzjVar.h(lwb0Var);
                return uzjVar;
            case 25:
                xbk xbkVar = (xbk) this.b;
                ArrayList arrayListN0 = o7h.N0(xbkVar.e, xbkVar.d);
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayListN0, 10));
                Iterator it2 = arrayListN0.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((CampaignRoutingWithStatus) it2.next()).n().n());
                }
                rak rakVar = (rak) this.c;
                d520 d520Var = rakVar.c;
                String str3 = xbkVar.a;
                nbk nbkVar = xbkVar.b;
                fn31.T(cto1.q((iac0) d520Var.g), (o8n) null, 0, new q35(nbkVar.b, nbkVar.d, xbkVar.c, d520Var, str3, (gbk) this.d, arrayList3, nbkVar.e, rakVar.X, (lnm) null), 3);
                return rih1.a;
            case 26:
                ((bhk) ((i7d) this.b).Z).j.setValue((Object) null);
                ((iu30) this.c).invoke(new blk(((w9r) this.d).a));
                return rih1.a;
            case 27:
                return new kpg0((br0) this.b, new kjk((Context) this.c, (urk) this.d, b));
            case 28:
                bab1 bab1Var = (bab1) this.b;
                String str4 = (String) o7h.C0((List) bab1Var.b.getValue());
                if (u890.j(str4, "not_interested_reasons")) {
                    ((iu30) this.c).invoke(mo0.b);
                } else if (u890.j(str4, "report_ad_categories") || o7h.i0(ht71.a, str4)) {
                    ((Function0) this.d).invoke();
                }
                aab1.b(bab1Var.d);
                return rih1.a;
            default:
                List list = (List) this.b;
                nil nilVar = (nil) this.c;
                xhl xhlVar = nilVar.a;
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object objG = ((afh0) list.get(i2)).g();
                    vhl vhlVar = objG instanceof vhl ? (vhl) objG : null;
                    if (vhlVar != null) {
                        ihl ihlVar = vhlVar.a;
                        vhlVar.b.invoke(new dhl(ihlVar.c, xhlVar.b(ihlVar)));
                    }
                    nilVar.f.add(vhlVar);
                }
                xhlVar.a((ynb1) this.d);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1c(Object obj, Object obj2, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = ven0Var;
    }
}
