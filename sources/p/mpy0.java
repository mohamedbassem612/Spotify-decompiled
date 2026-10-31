package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mpy0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mr20 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mpy0(mr20 mr20Var, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = mr20Var;
        this.c = obj;
        this.d = obj2;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 13;
        byte b3 = 17;
        byte b4 = 6;
        byte b5 = 1;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.d;
        Object obj2 = this.c;
        m441 m441Var = this.b;
        switch (b) {
            case 0:
                Object objCollect = m441Var.collect(new uqs0((byte) 13, (npy0) obj2, (gpt) obj, vr20Var), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = m441Var.collect(new uqs0((byte) 14, (waz0) obj2, (Set) obj, vr20Var), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((vd0) m441Var).collect(new tzy0(vr20Var, (cf01) obj2, (ze01) obj), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ((ht20) m441Var).collect(new uqs0((byte) 15, (rq01) obj2, (oq01) obj, vr20Var), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ((ezc) m441Var).collect(new uqs0((byte) 16, (yy1) obj2, (hti0) obj, vr20Var), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ((c64) m441Var).collect(new ubr(vr20Var, (String) obj2, (String) obj, (byte) 1), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ((dbs) m441Var).collect(new uqs0((byte) 17, (pzx) obj2, (hti0) obj, vr20Var), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = ((wzv0) m441Var).collect(new nw9(vr20Var, (Set) obj2, (rg31) obj), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                Object objCollect9 = ((kge) m441Var).collect(new ru11(vr20Var, (bq41) obj2, (String) obj, (byte) 5), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 9:
                Object objCollect10 = ((qt20) m441Var).collect(new uqs0((byte) 18, (xe01) obj2, (wm70) obj, vr20Var), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 10:
                ((ay8) m441Var).collect(new uqs0((byte) 20, (oe51) obj2, (ve51) obj, vr20Var), lnmVar);
                return d9nVar;
            case 11:
                ((ay8) m441Var).collect(new uqs0((byte) 22, (String) obj2, (List) obj, vr20Var), lnmVar);
                return d9nVar;
            case 12:
                Object objCollect11 = ((zo51) m441Var).collect(new zdd0(vr20Var, (LinkedHashMap) obj2, (lc71) obj, (byte) 2), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 13:
                Object objCollect12 = ((vd0) m441Var).collect(new uqs0((byte) 26, (r481) obj2, (ContextTrack) obj, vr20Var), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 14:
                Object objCollect13 = ((sr0) m441Var).collect(new uqs0((byte) 28, (id81) obj2, (hd81) obj, vr20Var), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case 15:
                Object objCollect14 = ((cly0) m441Var).collect(new efb1(vr20Var, (yeb1) obj2, (List) obj, (byte) 0), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case 16:
                Object objCollect15 = m441Var.collect(new efb1(vr20Var, (o93) obj2, (hti0) obj, b5), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Object objCollect16 = m441Var.collect(new ip61(vr20Var, (d520) obj2, (hbd1) obj), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Object objCollect17 = m441Var.collect(new efb1(vr20Var, (String) obj2, (myq0) obj, (byte) 4), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Object objCollect18 = ((ezc) m441Var).collect(new v880(vr20Var, (y880) obj2, (gpt) obj, (byte) 1), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Object objCollect19 = ((kge) m441Var).collect(new ru11(vr20Var, (hre1) obj2, (String) obj, b2), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Object objCollect20 = ((evz) m441Var).collect(new efb1(vr20Var, (icf1) obj2, (g2z) obj, b4), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case 22:
                ((ay8) m441Var).collect(new efb1(vr20Var, (pdf1) obj2, (xdf1) obj, (byte) 7), lnmVar);
                return d9nVar;
            case 23:
                Object objCollect21 = ((ezc) m441Var).collect(new ru11(vr20Var, (String) obj2, (le71) obj), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Object objCollect22 = ((ezc) m441Var).collect(new ru11(vr20Var, (rcy) obj2, (String) obj, b3), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 25:
                Object objCollect23 = m441Var.collect(new efb1(vr20Var, (uvf1) obj2, (String) obj, (byte) 8), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case 26:
                Object objCollect24 = ((ve01) m441Var).a.collect(new i6e1((byte) 6, (tva1) obj2, (hyf1) obj, vr20Var), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 27:
                Object objCollect25 = ((ph11) m441Var).collect(new efb1(vr20Var, (cig1) obj2, (String) obj, (byte) 10), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            case 28:
                Object objCollect26 = ((a1b1) m441Var).collect(new efb1(vr20Var, (ftg1) obj2, (htg1) obj, (byte) 12), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
            default:
                Object objCollect27 = m441Var.collect(new xfv0(vr20Var, (wei1) obj2, (oei1) obj), lnmVar);
                return objCollect27 == d9nVar ? objCollect27 : rih1Var;
        }
    }
}
