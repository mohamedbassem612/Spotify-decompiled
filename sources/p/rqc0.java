package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rqc0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return sqc0.a;
            case 1:
                parcel.readInt();
                return tqc0.a;
            case 2:
                parcel.readInt();
                return uqc0.a;
            case 3:
                parcel.readInt();
                return vqc0.a;
            case 4:
                parcel.readInt();
                return wqc0.a;
            case 5:
                parcel.readInt();
                return xqc0.a;
            case 6:
                parcel.readInt();
                return yqc0.a;
            case 7:
                parcel.readInt();
                return zqc0.a;
            case 8:
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.createStringArrayList());
                }
                return new arc0(arrayList);
            case 9:
                parcel.readInt();
                return brc0.a;
            case 10:
                parcel.readInt();
                return crc0.a;
            case 11:
                parcel.readInt();
                return drc0.a;
            case 12:
                parcel.readInt();
                return erc0.a;
            case 13:
                parcel.readInt();
                return frc0.a;
            case 14:
                parcel.readInt();
                return grc0.a;
            case 15:
                return new hrc0(parcel.readString());
            case 16:
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet.add(Integer.valueOf(parcel.readInt()));
                }
                return new irc0(linkedHashSet);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new jrc0(parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                parcel.readInt();
                return krc0.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                parcel.readInt();
                return lrc0.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                parcel.readInt();
                return mrc0.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                parcel.readInt();
                return nrc0.a;
            case 22:
                parcel.readInt();
                return qrc0.a;
            case 23:
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    linkedHashSet2.add(dlc0.valueOf(parcel.readString()));
                }
                return new rrc0(linkedHashSet2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new exc0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 25:
                String string = parcel.readString();
                ben parcelable = parcel.readParcelable(qxc0.class.getClassLoader());
                pxc0 pxc0VarCreateFromParcel = parcel.readInt() == 0 ? null : pxc0.CREATOR.createFromParcel(parcel);
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string4 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                wls0 wls0VarValueOf = wls0.valueOf(parcel.readString());
                x7i1 parcelable2 = parcel.readParcelable(qxc0.class.getClassLoader());
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i7);
                int iF = 0;
                while (true) {
                    String str = string;
                    if (iF == i7) {
                        int i8 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i8);
                        int iH = 0;
                        while (iH != i8) {
                            iH = x0d.h(qxc0.class, parcel, arrayList2, iH, 1);
                        }
                        int i9 = parcel.readInt();
                        ArrayList arrayList3 = new ArrayList(i9);
                        int iH2 = 0;
                        while (iH2 != i9) {
                            iH2 = x0d.h(qxc0.class, parcel, arrayList3, iH2, 1);
                        }
                        int i10 = parcel.readInt();
                        ArrayList arrayList4 = new ArrayList(i10);
                        int iH3 = 0;
                        while (iH3 != i10) {
                            iH3 = x0d.h(qxc0.class, parcel, arrayList4, iH3, 1);
                        }
                        int i11 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                        int i12 = 0;
                        while (i12 != i11) {
                            linkedHashMap2.put(dlc0.valueOf(parcel.readString()), Integer.valueOf(parcel.readInt()));
                            i12++;
                            i11 = i11;
                        }
                        return new qxc0(str, parcelable, pxc0VarCreateFromParcel, string2, string3, z, string4, z2, wls0VarValueOf, parcelable2, linkedHashMap, arrayList2, arrayList3, arrayList4, linkedHashMap2, parcel.readInt(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt(), parcel.readInt(), r2q0.valueOf(parcel.readString()), parcel.readInt() != 0 ? pxc0.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                    }
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                    string = str;
                }
                break;
            case 26:
                return new pxc0(parcel.readString(), parcel.readString());
            case 27:
                bqq0 bqq0Var = (bqq0) bqq0.CREATOR.createFromParcel(parcel);
                oqz0 oqz0Var = (oqz0) oqz0.CREATOR.createFromParcel(parcel);
                un90 parcelable3 = parcel.readParcelable(sxc0.class.getClassLoader());
                int i13 = parcel.readInt();
                int i14 = parcel.readInt();
                mn01 parcelable4 = parcel.readParcelable(sxc0.class.getClassLoader());
                int i15 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i15);
                int iH4 = 0;
                while (iH4 != i15) {
                    iH4 = x0d.h(sxc0.class, parcel, arrayList5, iH4, 1);
                }
                return new sxc0(bqq0Var, oqz0Var, parcelable3, i13, i14, parcelable4, arrayList5, parcel.createStringArrayList());
            case 28:
                return new fzc0((Intent) parcel.readParcelable(fzc0.class.getClassLoader()), parcel.readString(), (ezc0) parcel.readParcelable(fzc0.class.getClassLoader()));
            default:
                parcel.readInt();
                return azc0.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new sqc0[i];
            case 1:
                return new tqc0[i];
            case 2:
                return new uqc0[i];
            case 3:
                return new vqc0[i];
            case 4:
                return new wqc0[i];
            case 5:
                return new xqc0[i];
            case 6:
                return new yqc0[i];
            case 7:
                return new zqc0[i];
            case 8:
                return new arc0[i];
            case 9:
                return new brc0[i];
            case 10:
                return new crc0[i];
            case 11:
                return new drc0[i];
            case 12:
                return new erc0[i];
            case 13:
                return new frc0[i];
            case 14:
                return new grc0[i];
            case 15:
                return new hrc0[i];
            case 16:
                return new irc0[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new jrc0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new krc0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new lrc0[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new mrc0[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new nrc0[i];
            case 22:
                return new qrc0[i];
            case 23:
                return new rrc0[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new exc0[i];
            case 25:
                return new qxc0[i];
            case 26:
                return new pxc0[i];
            case 27:
                return new sxc0[i];
            case 28:
                return new fzc0[i];
            default:
                return new azc0[i];
        }
    }
}
