package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.culturalmoments.stories.v1.Button;
import com.spotify.culturalmoments.stories.v1.FullscreenVideoStory;
import com.spotify.culturalmoments.stories.v1.Text;
import com.spotify.culturalmoments.stories.v1.VideoErrorConfiguration;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bu51 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu51(Object obj, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                bu51 bu51Var = new bu51((int) b2, (lnm) obj3, (byte) 0);
                bu51Var.b = (Set) obj;
                bu51Var.c = (m7e0) obj2;
                return bu51Var.invokeSuspend(rih1Var);
            case 1:
                bu51 bu51Var2 = new bu51((int) b2, (lnm) obj3, (byte) 1);
                bu51Var2.b = (jt61) obj;
                bu51Var2.c = obj2;
                return bu51Var2.invokeSuspend(rih1Var);
            case 2:
                Object obj4 = ((e331) obj2).a;
                bu51 bu51Var3 = new bu51((int) b2, (lnm) obj3, (byte) 2);
                bu51Var3.b = (t681) obj;
                bu51Var3.c = obj4;
                return bu51Var3.invokeSuspend(rih1Var);
            case 3:
                bu51 bu51Var4 = new bu51((vi11) this.c, (lnm) obj3, b2);
                bu51Var4.b = (tv80) obj2;
                bu51Var4.invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                bu51 bu51Var5 = new bu51(this.c, (lnm) obj3, (byte) 4);
                bu51Var5.b = (tv80) obj2;
                bu51Var5.invokeSuspend(rih1Var);
                return rih1Var;
            case 5:
                bu51 bu51Var6 = new bu51(this.c, (lnm) obj3, (byte) 5);
                bu51Var6.b = (Throwable) obj2;
                bu51Var6.invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                bu51 bu51Var7 = new bu51((int) b2, (lnm) obj3, (byte) 6);
                bu51Var7.b = (e090) obj;
                bu51Var7.c = (e090) obj2;
                return bu51Var7.invokeSuspend(rih1Var);
            case 7:
                bu51 bu51Var8 = new bu51(this.c, (lnm) obj3, (byte) 7);
                bu51Var8.b = (c691) obj;
                bu51Var8.invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                bu51 bu51Var9 = new bu51((int) b2, (lnm) obj3, (byte) 8);
                bu51Var9.b = (fxa1) obj;
                bu51Var9.c = (fxa1) obj2;
                return bu51Var9.invokeSuspend(rih1Var);
            case 9:
                bu51 bu51Var10 = new bu51((int) b2, (lnm) obj3, (byte) 9);
                bu51Var10.b = (nwb1) obj;
                bu51Var10.c = (g951) obj2;
                return bu51Var10.invokeSuspend(rih1Var);
            case 10:
                bu51 bu51Var11 = new bu51(this.c, (lnm) obj3, (byte) 10);
                bu51Var11.b = (g8c1) obj2;
                return bu51Var11.invokeSuspend(rih1Var);
            case 11:
                bu51 bu51Var12 = new bu51((int) b2, (lnm) obj3, (byte) 11);
                bu51Var12.b = (List) obj;
                bu51Var12.c = (vab0) obj2;
                return bu51Var12.invokeSuspend(rih1Var);
            case 12:
                bu51 bu51Var13 = new bu51(this.c, (lnm) obj3, (byte) 12);
                bu51Var13.b = (tqw) obj2;
                bu51Var13.invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                bu51 bu51Var14 = new bu51((int) b2, (lnm) obj3, (byte) 13);
                bu51Var14.b = (dsf1) obj;
                bu51Var14.c = (cxc0) obj2;
                return bu51Var14.invokeSuspend(rih1Var);
            case 14:
                bu51 bu51Var15 = new bu51((int) b2, (lnm) obj3, (byte) 14);
                bu51Var15.b = (puf1) obj;
                bu51Var15.c = (String) obj2;
                return bu51Var15.invokeSuspend(rih1Var);
            case 15:
                bu51 bu51Var16 = new bu51(this.c, (lnm) obj3, (byte) 15);
                bu51Var16.b = (tqw) obj2;
                bu51Var16.invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                bu51 bu51Var17 = new bu51((int) b2, (lnm) obj3, (byte) 16);
                bu51Var17.b = (qkg1) obj;
                bu51Var17.c = (bdk0) obj2;
                return bu51Var17.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                bu51 bu51Var18 = new bu51((int) b2, (lnm) obj3, (byte) 17);
                bu51Var18.b = (Integer) obj;
                bu51Var18.c = (mmr0) obj2;
                return bu51Var18.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                bu51 bu51Var19 = new bu51((int) b2, (lnm) obj3, (byte) 18);
                bu51Var19.b = (lax) obj;
                bu51Var19.c = (lax) obj2;
                return bu51Var19.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                bu51 bu51Var20 = new bu51((int) b2, (lnm) obj3, (byte) 19);
                bu51Var20.b = (a7q0) obj;
                bu51Var20.c = (uxn) obj2;
                return bu51Var20.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                bu51 bu51Var21 = new bu51((int) b2, (lnm) obj3, (byte) 20);
                bu51Var21.b = (hwt) obj;
                bu51Var21.c = (k1r) obj2;
                return bu51Var21.invokeSuspend(rih1Var);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                bu51 bu51Var22 = new bu51(this.c, (lnm) obj3, (byte) 21);
                bu51Var22.b = (tv80) obj2;
                bu51Var22.invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                bu51 bu51Var23 = new bu51(this.c, (lnm) obj3, (byte) 22);
                bu51Var23.b = (tqw) obj2;
                bu51Var23.invokeSuspend(rih1Var);
                return rih1Var;
            default:
                bu51 bu51Var24 = new bu51((int) b2, (lnm) obj3, (byte) 23);
                bu51Var24.b = (k8m1) obj;
                bu51Var24.c = (n1i) obj2;
                return bu51Var24.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        k581 k581Var;
        t45 t45Var;
        Button buttonO;
        Text textQ;
        Text textR;
        String string;
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bwn0 bwn0VarP = null;
        switch (b) {
            case 0:
                Set set = (Set) this.b;
                m7e0 m7e0Var = (m7e0) this.c;
                hm5.M(obj);
                List list = m7e0Var.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (set.contains(((l7e0) obj2).a())) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((l7e0) it.next()).getUri());
                }
                return arrayList2;
            case 1:
                jt61 jt61Var = (jt61) this.b;
                Object obj3 = this.c;
                hm5.M(obj);
                return new sv61(jt61Var, obj3);
            case 2:
                t681 t681Var = (t681) this.b;
                Object obj4 = this.c;
                hm5.M(obj);
                if (e331.a(obj4) != null) {
                    return new s681(t681Var.a());
                }
                ArrayList arrayList3 = new ArrayList();
                for (na81 na81Var : (List) obj4) {
                    ah40 ah40Var = na81Var.d;
                    int iR = t6p1.r(ah40Var.b);
                    if (iR == 0) {
                        k581Var = null;
                    } else {
                        String str = ah40Var.a;
                        String str2 = na81Var.a;
                        String str3 = na81Var.b;
                        String str4 = na81Var.c;
                        gcz gczVar = na81Var.f;
                        k581Var = new k581(iR, gczVar != null ? t6p1.r(gczVar.a.b) : 0, str, str2, str3, str4);
                    }
                    if (k581Var != null) {
                        arrayList3.add(k581Var);
                    }
                }
                return new q681(arrayList3);
            case 3:
                tv80 tv80Var = (tv80) this.b;
                hm5.M(obj);
                ((xv61) ((vi11) this.c).d).a(rc11.a.b(ivw0.class), "campfire-show-suggestions").a("0", "1", tv80Var);
                return rih1Var;
            case 4:
                tv80 tv80Var2 = (tv80) this.b;
                hm5.M(obj);
                ((xv61) ((e821) this.c).c).a(rc11.a.b(ivw0.class), "campfire-include-in-suggestions").a("0", "1", tv80Var2);
                return rih1Var;
            case 5:
                Throwable th = (Throwable) this.b;
                hm5.M(obj);
                if (th instanceof CancellationException) {
                    jqd0 jqd0Var = (jqd0) ((dea0) this.c).h;
                    if (jqd0Var.b && (t45Var = (t45) jqd0Var.d) != null) {
                        t45Var.g("load_latest_rows_data");
                    }
                    jqd0Var.y(2);
                }
                return rih1Var;
            case 6:
                e090 e090Var = (e090) this.b;
                e090 e090Var2 = (e090) this.c;
                hm5.M(obj);
                return new mmr0(e090Var, e090Var2);
            case 7:
                c691 c691Var = (c691) this.b;
                hm5.M(obj);
                kvs0 kvs0Var = (kvs0) ((smp0) this.c).d;
                bwn0 bwn0Var = c691Var.a;
                kvs0Var.b(jvs0.c, bwn0Var != null ? bwn0Var : "");
                return rih1Var;
            case 8:
                fxa1 fxa1Var = (fxa1) this.b;
                fxa1 fxa1Var2 = (fxa1) this.c;
                hm5.M(obj);
                return ((fxa1Var2 instanceof cxa1) && (fxa1Var instanceof dxa1)) ? fxa1Var : fxa1Var2;
            case 9:
                nwb1 nwb1Var = (nwb1) this.b;
                g951 g951Var = (g951) this.c;
                hm5.M(obj);
                if (g951Var instanceof t851) {
                    return nwb1.a(nwb1Var, null, null, 3);
                }
                if (g951Var instanceof v851) {
                    return nwb1.a(nwb1Var, z6x.a, null, 2);
                }
                if (g951Var instanceof c951) {
                    return nwb1.a(nwb1Var, ((c951) g951Var).a, null, 2);
                }
                if (g951Var instanceof o851) {
                    return nwb1.a(nwb1Var, null, ((o851) g951Var).a, 3);
                }
                eg.o();
                return null;
            case 10:
                g8c1 g8c1Var = (g8c1) this.b;
                hm5.M(obj);
                FullscreenVideoStory fullscreenVideoStory = (FullscreenVideoStory) this.c;
                String manifestId = fullscreenVideoStory.getManifestId();
                v290 v290Var = (v290) g8c1Var.f.d;
                String manifestId2 = fullscreenVideoStory.getManifestId();
                v290Var.getClass();
                String strN = wqn1.n(manifestId2);
                try {
                    Uri uri = Uri.parse(strN);
                    uri.getClass();
                    fij1 fij1Var = new fij1(fullscreenVideoStory.n().q(), uri, manifestId);
                    r2a1 r2a1Var = new r2a1(g8c1Var, fullscreenVideoStory, (byte) 18);
                    VideoErrorConfiguration videoErrorConfigurationP = fullscreenVideoStory.p();
                    String strO = (videoErrorConfigurationP == null || (textR = videoErrorConfigurationP.r()) == null) ? null : textR.o();
                    if (strO == null) {
                        strO = "";
                    }
                    gpr0 gpr0VarI = zho1.I(2132018023, strO, fullscreenVideoStory.p().r().p());
                    VideoErrorConfiguration videoErrorConfigurationP2 = fullscreenVideoStory.p();
                    String strO2 = (videoErrorConfigurationP2 == null || (textQ = videoErrorConfigurationP2.q()) == null) ? null : textQ.o();
                    if (strO2 == null) {
                        strO2 = "";
                    }
                    gpr0 gpr0VarI2 = zho1.I(2132018003, strO2, fullscreenVideoStory.p().q().p());
                    Integer numL = zho1.L(fullscreenVideoStory.p().n());
                    int iIntValue = numL != null ? numL.intValue() : -16777216;
                    VideoErrorConfiguration videoErrorConfigurationP3 = fullscreenVideoStory.p();
                    if (videoErrorConfigurationP3 != null && (buttonO = videoErrorConfigurationP3.o()) != null) {
                        bwn0VarP = buttonO.p();
                    }
                    fec fecVar = new fec(zho1.L(fullscreenVideoStory.p().o().q()), bwn0VarP != null ? bwn0VarP : "", zho1.L(fullscreenVideoStory.p().o().n()));
                    return Collections.singletonList(new vk41(f46.Q0(new zda[]{new zoj1(fij1Var, r2a1Var, gpr0VarI, gpr0VarI2, iIntValue, new hec(fecVar, fecVar, new huz(Boolean.TRUE, (byte) 10), new esa1(g8c1Var, fullscreenVideoStory, (byte) 11)), (dzp0) g8c1Var.f.c)})));
                } catch (Exception unused) {
                    k220.f("Error parsing uri: ".concat(strN));
                    return null;
                }
            case 11:
                List list2 = (List) this.b;
                vab0 vab0Var = (vab0) this.c;
                hm5.M(obj);
                return new rvs0(list2, vab0Var != null ? vab0Var.b : null);
            case 12:
                tqw tqwVar = (tqw) this.b;
                hm5.M(obj);
                if (tqwVar != null) {
                    tv80 tv80VarY = n3o1.y(tqwVar);
                    vbe1 vbe1Var = (vbe1) this.c;
                    ((lzn0) vbe1Var.d).a((String) vbe1Var.f, tv80VarY, (Bundle) null);
                }
                return rih1Var;
            case 13:
                dsf1 dsf1Var = (dsf1) this.b;
                cxc0 cxc0Var = (cxc0) this.c;
                hm5.M(obj);
                Map map = cxc0Var.f.q;
                Set set2 = h4d0.a;
                String str5 = (String) map.get("generation_status");
                if (str5 == null || (string = ihc1.e1(str5).toString()) == null) {
                    string = "";
                }
                List listE1 = o7h.e1(3, o7h.O0(qyo1.u(string), dsf1Var.b));
                List list3 = listE1;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    z = false;
                } else {
                    Iterator it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            h4d0 h4d0Var = (h4d0) it2.next();
                            h4d0Var.getClass();
                            if (h4d0.a.contains(h4d0Var)) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                }
                h4d0 h4d0Var2 = (h4d0) o7h.C0(listE1);
                boolean z2 = z && (h4d0Var2 != null && h4d0Var2.b());
                bwn0 bwn0Var2 = (String) cxc0Var.f.q.get("tracklist_summary");
                bwn0 bwn0Var3 = bwn0Var2 != null ? bwn0Var2 : "";
                return new dsf1(bwn0Var3, listE1, z2 && !ihc1.y0(bwn0Var3));
            case 14:
                puf1 puf1Var = (puf1) this.b;
                String str6 = (String) this.c;
                hm5.M(obj);
                return new kuf1(puf1Var, str6);
            case 15:
                tqw tqwVar2 = (tqw) this.b;
                hm5.M(obj);
                lzn0 lzn0Var = (lzn0) ((et90) this.c).d;
                tv80 tv80VarY2 = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                lzn0Var.f(new dwn0("spotify:upsell:premium_in_app_destination", "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY2 != null ? new bwn0(tv80VarY2) : null));
                return rih1Var;
            case 16:
                qkg1 qkg1Var = (qkg1) this.b;
                bdk0 bdk0Var = (bdk0) this.c;
                hm5.M(obj);
                return new pkg1(qkg1Var, bdk0Var);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Integer num = (Integer) this.b;
                mmr0 mmr0Var = (mmr0) this.c;
                hm5.M(obj);
                boolean zBooleanValue = ((Boolean) mmr0Var.a).booleanValue();
                int iIntValue2 = ((Number) mmr0Var.b).intValue();
                if (!zBooleanValue) {
                    return null;
                }
                if (num != null) {
                    iIntValue2 = num.intValue();
                }
                return new Integer(iIntValue2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                lax laxVar = (lax) this.b;
                lax laxVar2 = (lax) this.c;
                hm5.M(obj);
                return laxVar instanceof gax ? laxVar : laxVar2;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                a7q0 a7q0Var = (a7q0) this.b;
                uxn uxnVar = (uxn) this.c;
                hm5.M(obj);
                return new a3j1(a7q0Var, uxnVar);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hwt hwtVar = (hwt) this.b;
                k1r k1rVar = (k1r) this.c;
                hm5.M(obj);
                p6j1 p6j1Var = (p6j1) u890.k(k1rVar, (d0r) null, (n4r) null);
                return new u810(hwtVar, p6j1Var.a, p6j1Var.b, p6j1Var.c);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                tv80 tv80Var3 = (tv80) this.b;
                hm5.M(obj);
                ((xv61) ((hce1) this.c).b).a(rc11.a.b(ivw0.class), "view-listening-activity").a("1", "0", tv80Var3);
                return rih1Var;
            case 22:
                tqw tqwVar3 = (tqw) this.b;
                hm5.M(obj);
                ahl1 ahl1Var = (ahl1) this.c;
                ahl1Var.b.a(ixb.c);
                tv80 tv80VarY3 = tqwVar3 != null ? n3o1.y(tqwVar3) : null;
                lzn0 lzn0Var2 = ahl1Var.c;
                if (tv80VarY3 != null) {
                    lzn0Var2.a(ahl1.h, tv80VarY3, (Bundle) null);
                } else {
                    lzn0Var2.h(ahl1.h);
                }
                return rih1Var;
            default:
                k8m1 k8m1Var = (k8m1) this.b;
                n1i n1iVar = (n1i) this.c;
                hm5.M(obj);
                return new k8m1(k8m1Var.b, n1iVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu51(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
