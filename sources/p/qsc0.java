package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qsc0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qsc0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        byte b2 = 6;
        byte b3 = 5;
        byte b4 = 7;
        byte b5 = 9;
        byte b6 = 11;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((lt0) obj3).collect(new ap70(vr20Var, (rxc0) obj2, (rsc0) obj, b2), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((mr20) obj3).collect(new ap70(vr20Var, (haa0) obj2, (String) obj, b4), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((ezc) obj3).collect(new ap70(vr20Var, (ArrayList) obj2, (ArrayList) obj, b5), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ((ezc) obj3).collect(new a8d0(vr20Var, (lpd0) obj2, (h290) obj), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                mr20[] mr20VarArr = (mr20[]) obj3;
                Object objS = fc11.s(new ldd0(mr20VarArr, (byte) 1), lnmVar, vr20Var, new qd0((lnm) null, (nbw) obj2, (j2e0) obj, (byte) 28), mr20VarArr);
                return objS == d9nVar ? objS : rih1Var;
            case 5:
                Object objCollect5 = ((ezc) obj3).collect(new ap70((Object) vr20Var, obj2, obj, (byte) 12), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 6:
                Object objCollect6 = ((mr20) obj3).collect(new ap70((Object) vr20Var, obj2, obj, (byte) 13), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 7:
                ((ay8) obj3).collect(new a110((byte) 2, (q0i0) obj2, obj, vr20Var), lnmVar);
                return d9nVar;
            case 8:
                Object objCollect7 = ((mr20) obj3).collect(new ap70((Object) vr20Var, obj2, obj, (byte) 14), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 9:
                ((ay8) obj3).collect(new ap70((Object) vr20Var, obj2, obj, (byte) 16), lnmVar);
                return d9nVar;
            case 10:
                Object objCollect8 = ((dbs) obj3).collect(new ap70((Object) vr20Var, obj2, obj, (byte) 17), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 11:
                Object objCollect9 = ((mr20) obj3).collect(new ap70((Object) vr20Var, obj2, obj, (byte) 21), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 12:
                Object objCollect10 = ((any) obj3).collect(new a110((byte) 3, (afo0) obj2, obj, vr20Var), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 13:
                mr20[] mr20VarArr2 = (mr20[]) obj3;
                Object objS2 = fc11.s(new ldd0(mr20VarArr2, (byte) 6), lnmVar, vr20Var, new c6e0((lnm) null, (ArrayList) obj2, (el9) obj, b3), mr20VarArr2);
                return objS2 == d9nVar ? objS2 : rih1Var;
            case 14:
                Object objCollect11 = ((iib) obj3).collect(new ap70((Object) vr20Var, obj2, obj, (byte) 23), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 15:
                Object objCollect12 = ((mr20) obj3).collect(new ap70((Object) vr20Var, obj2, obj, (byte) 24), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 16:
                Object objCollect13 = ((ezc) obj3).collect(new ap70((Object) vr20Var, obj2, obj, (byte) 25), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Object objCollect14 = ((mr20) obj3).collect(new ap70((Object) vr20Var, obj2, obj, (byte) 26), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Object objCollect15 = ((mr20) obj3).collect(new buc0(vr20Var, (zl5) obj2, (String) obj, b6), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Object objCollect16 = ((mr20) obj3).collect(new s4q0(vr20Var, (n2s0) obj2, (e3s0) obj), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Object objCollect17 = ((evz) obj3).collect(new buc0(vr20Var, (b5s0) obj2, (String) obj, (byte) 15), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Object objCollect18 = ((ezc) obj3).collect(new uqs0((byte) 2, (g3t0) obj2, (dma1) obj, vr20Var), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
            case 22:
                Object objCollect19 = ((ezc) obj3).collect(new uqs0((byte) 3, (cf3) obj2, (hti0) obj, vr20Var), lnmVar);
                return objCollect19 == d9nVar ? objCollect19 : rih1Var;
            case 23:
                Object objCollect20 = ((kge) obj3).collect(new buc0(vr20Var, (y1u0) obj2, (String) obj, (byte) 19), lnmVar);
                return objCollect20 == d9nVar ? objCollect20 : rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Object objCollect21 = ((m441) obj3).collect(new uqs0((byte) 5, (String) obj2, (hx21) obj, vr20Var), lnmVar);
                return objCollect21 == d9nVar ? objCollect21 : rih1Var;
            case 25:
                Object objCollect22 = ((jge) obj3).collect(new uqs0((byte) 7, (ArrayList) obj2, (yqu0) obj, vr20Var), lnmVar);
                return objCollect22 == d9nVar ? objCollect22 : rih1Var;
            case 26:
                Object objCollect23 = ((wzv0) obj3).collect(new zdd0(vr20Var, (LinkedHashMap) obj2, (cex0) obj, (byte) 1), lnmVar);
                return objCollect23 == d9nVar ? objCollect23 : rih1Var;
            case 27:
                Object objCollect24 = ((ezc) obj3).collect(new uqs0((byte) 8, (dxy) obj2, (LinkedHashSet) obj, vr20Var), lnmVar);
                return objCollect24 == d9nVar ? objCollect24 : rih1Var;
            case 28:
                Object objCollect25 = ((ezc) obj3).collect(new uqs0((byte) 9, (xix0) obj2, (Set) obj, vr20Var), lnmVar);
                return objCollect25 == d9nVar ? objCollect25 : rih1Var;
            default:
                Object objCollect26 = ((fu20) obj3).collect(new uqs0((byte) 11, (ags0) obj2, (String) obj, vr20Var), lnmVar);
                return objCollect26 == d9nVar ? objCollect26 : rih1Var;
        }
    }
}
