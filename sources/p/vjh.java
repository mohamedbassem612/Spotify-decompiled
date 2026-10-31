package p;

import android.content.Context;
import android.net.ConnectivityManager;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vjh extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vjh(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                wjh wjhVar = (wjh) obj;
                luk lukVar = wjhVar.d;
                if (lukVar != null) {
                    return lukVar.e(new d26(wjhVar, (byte) 8));
                }
                return null;
            case 1:
                xmh xmhVar = (xmh) obj;
                return sbl.A(new vmh(xmhVar, (byte) 0), n4.z, xmhVar.S0, rng.a1, xmhVar.T0);
            case 2:
                ((los) ((umf0) obj).d).a(ixb.c);
                return rih1Var;
            case 3:
                aqh aqhVar = (aqh) obj;
                luk lukVar2 = aqhVar.b;
                if (lukVar2 != null) {
                    return lukVar2.e(new d26(aqhVar, (byte) 9));
                }
                return null;
            case 4:
                kqh kqhVar = (kqh) obj;
                luk lukVar3 = kqhVar.b;
                if (lukVar3 != null) {
                    return (kqh) lukVar3.e(new d26(kqhVar, (byte) 10));
                }
                return null;
            case 5:
                return ((u0i) obj).a((l0i) null);
            case 6:
                ((gwb) obj).d.invoke();
                return rih1Var;
            case 7:
                return new u7h(z4p1.e(((u5s0) obj).b));
            case 8:
                return bin.C(((tet0) obj).d);
            case 9:
                ((tbr0) obj).a(l231.a);
                return rih1Var;
            case 10:
                return v8r.q(Boolean.valueOf(((mq51) obj).b));
            case 11:
                return hvp0.b((hvp0) obj);
            case 12:
                return ((z2k) obj).j.c();
            case 13:
                df41 df41Var = vr21.b;
                return new vr21(((ulx0) obj) == ulx0.b);
            case 14:
                return new xho((kko) ((v1k) obj).d);
            case 15:
                ((bhk) ((i7d) obj).Z).j.setValue((Object) null);
                return rih1Var;
            case 16:
                ynk ynkVar = (ynk) obj;
                luk lukVar4 = ynkVar.b;
                if (lukVar4 != null) {
                    return lukVar4.e(new d26(ynkVar, (byte) 11));
                }
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                rrk rrkVar = (rrk) obj;
                return new kpg0(rrkVar.a, new qrk((Object) rrkVar, (byte) (null == true ? 1 : 0)));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                tm tmVar = (tm) obj;
                return ((bnr) tmVar.d).a((d0r) tmVar.c);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return cwl1.H(((qa2) obj).b);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return flo1.l(guo1.B(), ((e0l) obj).e);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                r1l r1lVar = (r1l) obj;
                if (r1lVar.c) {
                    r1lVar.c = false;
                    r1lVar.b.invoke();
                }
                return rih1Var;
            case 22:
                return smo1.e(flo1.l(((fal) obj).d, guo1.B()).y(new z8n("ConnectionQualityDataSaver")));
            case 23:
                return Boolean.valueOf(((dma1) ((aod) obj).b).h(hbl.a, false));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (ConnectivityManager) ((Context) ((gal) obj).b).getApplicationContext().getSystemService(ConnectivityManager.class);
            case 25:
                return new pzs(((pcl) obj).a.c(), 2131961691, (byte) 19);
            case 26:
                x2p x2pVar = (x2p) ((j8p) obj).a.b;
                f1n0 f1n0Var = (f1n0) ((lzp) x2pVar.c).a.T2.get();
                c8o.l(f1n0Var);
                String strD = ((qop) x2pVar.d).d();
                sb7 sb7Var = (sb7) ((lzp) x2pVar.c).a.V5.get();
                c8o.l(sb7Var);
                return new kpg0(new tm(f1n0Var, strD, sb7Var), vll.T0);
            case 27:
                return (iuj) ((etl) obj).a.get();
            case 28:
                v3h1 v3h1Var = (v3h1) obj;
                eyl eylVarF = v3h1Var.f();
                if (eylVarF != null) {
                    return new utl(new vtl(eylVarF, eylVarF.b), new vtl(eylVarF, eylVarF.c), new vtl(eylVarF, new v7l(eylVarF, (byte) 9)), o7h.Z0(eylVarF.d.keySet()));
                }
                int iA = v3h1Var.a();
                ArrayList arrayList = new ArrayList(iA);
                ArrayList arrayList2 = new ArrayList(iA);
                ArrayList arrayList3 = new ArrayList(iA);
                for (int i = 0; i < iA; i++) {
                    y3h1 y3h1VarI = v3h1Var.i(i);
                    arrayList.add(y3h1VarI.a.getId());
                    arrayList2.add(upn1.i(y3h1VarI.a.getItem()));
                    arrayList3.add(y3h1VarI.c);
                }
                tr80 tr80VarK = p7h.K(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                lr80 it = tr80VarK.iterator();
                while (((sr80) it).c) {
                    Object next = it.next();
                    if (arrayList3.get(((Number) next).intValue()) != null) {
                        arrayList4.add(next);
                    }
                }
                return new utl(arrayList, arrayList2, arrayList3, arrayList4);
            default:
                yub0 yub0VarG = ((fvb0) obj).g();
                int i2 = yub0VarG.l;
                avb0 avb0Var = (avb0) o7h.C0(yub0VarG.m);
                return Boolean.valueOf(i2 > 0 && (avb0Var != null ? avb0Var.a : 0) >= i2 - 8);
        }
    }
}
