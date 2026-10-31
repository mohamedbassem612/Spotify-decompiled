package p;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sr0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sr0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                Object objCollect = ((mr20) obj4).collect(new u60(vr20Var, (kly0) obj3, (pr0) obj2, (wb10) obj, (byte) 2), lnmVar);
                return objCollect == d9nVar ? objCollect : rih1Var;
            case 1:
                Object objCollect2 = ((ezc) obj4).collect(new u60(vr20Var, (yy1) obj3, (hti0) obj2, (qxc0) obj, (byte) 3), lnmVar);
                return objCollect2 == d9nVar ? objCollect2 : rih1Var;
            case 2:
                Object objCollect3 = ((x010) obj4).collect(new u60(vr20Var, (String) obj3, (String) obj2, (u961) obj, (byte) 4), lnmVar);
                return objCollect3 == d9nVar ? objCollect3 : rih1Var;
            case 3:
                Object objCollect4 = ((te1) obj4).collect(new u60(vr20Var, (yy1) obj3, (hti0) obj2, (qxc0) obj, (byte) 5), lnmVar);
                return objCollect4 == d9nVar ? objCollect4 : rih1Var;
            case 4:
                Object objCollect5 = ((x010) obj4).collect(new u60(vr20Var, (bl3) obj3, (ak3) obj2, (String) obj, (byte) 6), lnmVar);
                return objCollect5 == d9nVar ? objCollect5 : rih1Var;
            case 5:
                Object objCollect6 = ((huz) obj4).collect(new h50(vr20Var, (m4c) obj3, (View) obj2, (ViewGroup) obj), lnmVar);
                return objCollect6 == d9nVar ? objCollect6 : rih1Var;
            case 6:
                Object objCollect7 = ((mr20) obj4).collect(new u60(vr20Var, (aiq) obj3, (kb61) obj2, (jqd0) obj, (byte) 11), lnmVar);
                return objCollect7 == d9nVar ? objCollect7 : rih1Var;
            case 7:
                Object objCollect8 = ((ezc) obj4).collect(new u60(vr20Var, (ArrayList) obj3, (String) obj2, (dpk) obj, (byte) 13), lnmVar);
                return objCollect8 == d9nVar ? objCollect8 : rih1Var;
            case 8:
                ((ay8) obj4).collect(new u60(vr20Var, (String) obj3, (som) obj2, (vsm) obj, (byte) 14), lnmVar);
                return d9nVar;
            case 9:
                Object objCollect9 = ((te1) obj4).collect(new u60(vr20Var, (qxc0) obj3, (yy1) obj2, (hti0) obj, (byte) 17), lnmVar);
                return objCollect9 == d9nVar ? objCollect9 : rih1Var;
            case 10:
                Object objCollect10 = ((fu20) obj4).collect(new u60(vr20Var, (p811) obj3, (p811) obj2, (dhc0) obj, (byte) 22), lnmVar);
                return objCollect10 == d9nVar ? objCollect10 : rih1Var;
            case 11:
                ((ay8) obj4).collect(new u60(vr20Var, (i1e) obj3, (String) obj2, (xom1) obj, (byte) 25), lnmVar);
                return d9nVar;
            case 12:
                Object objCollect11 = ((bge) obj4).collect(new u60(vr20Var, (y2e0) obj3, (Boolean) obj2, (Boolean) obj, (byte) 26), lnmVar);
                return objCollect11 == d9nVar ? objCollect11 : rih1Var;
            case 13:
                Object objCollect12 = ((huz) obj4).collect(new u60(vr20Var, (p1f0) obj3, (Uri) obj2, (ParcelFileDescriptor[]) obj, (byte) 29), lnmVar);
                return objCollect12 == d9nVar ? objCollect12 : rih1Var;
            case 14:
                ((ay8) obj4).collect(new ygi0(vr20Var, (dlk0) obj3, (String) obj2, (String) obj), lnmVar);
                return d9nVar;
            case 15:
                ((ay8) obj4).collect(new o4r0(vr20Var, (String) obj3, (y6h1) obj2, (zl5) obj), lnmVar);
                return d9nVar;
            case 16:
                Object objCollect13 = ((mr20) obj4).collect(new o4r0(vr20Var, (zl5) obj3, (String) obj2, (y6h1) obj), lnmVar);
                return objCollect13 == d9nVar ? objCollect13 : rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Object objCollect14 = ((ht20) obj4).collect(new ywm0(vr20Var, (qns0) obj3, (String) obj2, (Set) obj, (byte) 2), lnmVar);
                return objCollect14 == d9nVar ? objCollect14 : rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((ay8) obj4).collect(new ywm0(vr20Var, (String) obj3, (String) obj2, (String) obj, (byte) 3), lnmVar);
                return d9nVar;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((ay8) obj4).collect(new ywm0(vr20Var, (tvu0) obj3, (zvz0) obj2, (dvu0) obj, (byte) 4), lnmVar);
                return d9nVar;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Object objCollect15 = ((p1e0) obj4).collect(new ywm0(vr20Var, (yy1) obj3, (qxc0) obj2, (String) obj, (byte) 6), lnmVar);
                return objCollect15 == d9nVar ? objCollect15 : rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Object objCollect16 = ((h5y0) obj4).collect(new d7n(vr20Var, (lmy0) obj3, (String) obj2, (iu30) obj), lnmVar);
                return objCollect16 == d9nVar ? objCollect16 : rih1Var;
            case 22:
                mr20[] mr20VarArr = (mr20[]) obj4;
                Object objS = fc11.s(new ldd0(mr20VarArr, (byte) 14), lnmVar, vr20Var, new m53((rh11) obj3, (waz0) obj2, (um01) obj, (lnm) null, (byte) 12), mr20VarArr);
                return objS == d9nVar ? objS : rih1Var;
            case 23:
                ((ay8) obj4).collect(new ywm0(vr20Var, (cn01) obj3, (um01) obj2, (di4) obj, (byte) 8), lnmVar);
                return d9nVar;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Object objCollect17 = ((lt20) obj4).collect(new ywm0(vr20Var, (String) obj3, (yx41) obj2, (l7m0) obj, (byte) 10), lnmVar);
                return objCollect17 == d9nVar ? objCollect17 : rih1Var;
            case 25:
                mr20[] mr20VarArr2 = (mr20[]) obj4;
                Object objS2 = fc11.s(new vrl(mr20VarArr2), lnmVar, vr20Var, new m53((id81) obj3, (hd81) obj2, (zau0) obj, (lnm) null, (byte) 13), mr20VarArr2);
                return objS2 == d9nVar ? objS2 : rih1Var;
            default:
                Object objCollect18 = ((mr20) obj4).collect(new ywm0(vr20Var, (jl1) obj3, (hti0) obj2, (qxc0) obj, (byte) 12), lnmVar);
                return objCollect18 == d9nVar ? objCollect18 : rih1Var;
        }
    }
}
