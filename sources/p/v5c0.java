package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v5c0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ v5c0(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList;
        int iH = 0;
        int iH2 = 0;
        int iH3 = 0;
        int iH4 = 0;
        switch (this.a) {
            case 0:
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                while (iH != i) {
                    iH = x0d.h(w5c0.class, parcel, arrayList2, iH, 1);
                }
                return new w5c0(arrayList2);
            case 1:
                parcel.readInt();
                return x5c0.b;
            case 2:
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                while (iH4 != i2) {
                    iH4 = x0d.h(y5c0.class, parcel, arrayList3, iH4, 1);
                }
                return new y5c0(arrayList3);
            case 3:
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                while (iH3 != i3) {
                    iH3 = x0d.h(z5c0.class, parcel, arrayList4, iH3, 1);
                }
                return new z5c0(arrayList4);
            case 4:
                parcel.readInt();
                return a6c0.b;
            case 5:
                parcel.readInt();
                return b6c0.b;
            case 6:
                parcel.readInt();
                return c6c0.b;
            case 7:
                parcel.readInt();
                return m6c0.a;
            case 8:
                e8a e8aVarValueOf = e8a.valueOf(parcel.readString());
                String string = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i4);
                int iD = 0;
                while (iD != i4) {
                    iD = dsl0.d(z4a.CREATOR, parcel, arrayList5, iD, 1);
                }
                return new n6c0(e8aVarValueOf, string, arrayList5, (sco) (parcel.readInt() == 0 ? null : sco.CREATOR.createFromParcel(parcel)), (sco) (parcel.readInt() != 0 ? sco.CREATOR.createFromParcel(parcel) : null), parcel.readString(), parcel.readInt() != 0);
            case 9:
                parcel.readInt();
                return u7c0.a;
            case 10:
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashMap.put(parcel.readParcelable(w7c0.class.getClassLoader()), parcel.readValue(w7c0.class.getClassLoader()));
                }
                return new w7c0(linkedHashMap);
            case 11:
                return new e8c0(parcel.readString(), parcel.readString());
            case 12:
                return new vgc0(parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (ugc0) parcel.readParcelable(vgc0.class.getClassLoader()));
            case 13:
                return new sgc0(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            case 14:
                parcel.readInt();
                return tgc0.a;
            case 15:
                return new xgc0(parcel.readInt(), parcel.readParcelable(xgc0.class.getClassLoader()), parcel.readInt() != 0);
            case 16:
                return new ygc0(parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new khc0(parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new vhc0(parcel.readInt());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                aic0 aic0Var = (aic0) (parcel.readInt() == 0 ? null : aic0.CREATOR.createFromParcel(parcel));
                String string2 = parcel.readString();
                pqe1 parcelable = parcel.readParcelable(xhc0.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i7 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(i7);
                    while (iH2 != i7) {
                        iH2 = x0d.h(xhc0.class, parcel, arrayList6, iH2, 1);
                    }
                    arrayList = arrayList6;
                }
                return new xhc0(aic0Var, string2, parcelable, arrayList, parcel.createStringArrayList());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new aic0((kq70) (parcel.readInt() == 0 ? null : kq70.CREATOR.createFromParcel(parcel)), parcel.readParcelable(aic0.class.getClassLoader()), parcel.readString(), parcel.readString(), (dic0) (parcel.readInt() != 0 ? dic0.CREATOR.createFromParcel(parcel) : null));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new dic0(parcel.readString(), parcel.readString(), parcel.readString());
            case 22:
                return new fic0(parcel.readString());
            case 23:
                return new slc0(parcel.readString());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new cmc0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 25:
                return new ymc0(parcel.readInt(), parcel.readParcelable(ymc0.class.getClassLoader()));
            case 26:
                return new eoc0(parcel.readString(), parcel.readParcelable(eoc0.class.getClassLoader()), parcel.readParcelable(eoc0.class.getClassLoader()), dpu0.CREATOR.createFromParcel(parcel));
            case 27:
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyT = PlaylistRequestDecorationPolicy.t(parcel.createByteArray());
                g3d0 parcelable2 = parcel.readParcelable(trc0.class.getClassLoader());
                int i8 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    linkedHashSet.add(parcel.readParcelable(trc0.class.getClassLoader()));
                }
                return new trc0(playlistRequestDecorationPolicyT, parcelable2, linkedHashSet, parcel.readInt() != 0, parcel.readParcelable(trc0.class.getClassLoader()), parcel.readParcelable(trc0.class.getClassLoader()), prc0.valueOf(parcel.readString()), parcel.readInt(), parcel.createStringArrayList());
            case 28:
                parcel.readInt();
                return pqc0.a;
            default:
                return new qqc0(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new w5c0[i];
            case 1:
                return new x5c0[i];
            case 2:
                return new y5c0[i];
            case 3:
                return new z5c0[i];
            case 4:
                return new a6c0[i];
            case 5:
                return new b6c0[i];
            case 6:
                return new c6c0[i];
            case 7:
                return new m6c0[i];
            case 8:
                return new n6c0[i];
            case 9:
                return new u7c0[i];
            case 10:
                return new w7c0[i];
            case 11:
                return new e8c0[i];
            case 12:
                return new vgc0[i];
            case 13:
                return new sgc0[i];
            case 14:
                return new tgc0[i];
            case 15:
                return new xgc0[i];
            case 16:
                return new ygc0[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new khc0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new vhc0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new xhc0[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new aic0[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new dic0[i];
            case 22:
                return new fic0[i];
            case 23:
                return new slc0[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new cmc0[i];
            case 25:
                return new ymc0[i];
            case 26:
                return new eoc0[i];
            case 27:
                return new trc0[i];
            case 28:
                return new pqc0[i];
            default:
                return new qqc0[i];
        }
    }
}
