package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lbe0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:93:0x019a A[LOOP:1: B:92:0x0198->B:93:0x019a, LOOP_END] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3 = 4;
        int i4 = 3;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return mbe0.a;
            case 1:
                parcel.readInt();
                return tbe0.a;
            case 2:
                parcel.readInt();
                return ube0.a;
            case 3:
                return new wde0(parcel.readString(), parcel.readParcelable(wde0.class.getClassLoader()));
            case 4:
                return new oge0(parcel.readString(), parcel.readString());
            case 5:
                return new pge0(parcel.readString());
            case 6:
                return new qge0(parcel.readString());
            case 7:
                return new sge0(parcel.readParcelable(sge0.class.getClassLoader()), parcel.readFloat(), parcel.readString(), parcel.readString());
            case 8:
                return new ihe0(parcel.readString());
            case 9:
                return new nhe0(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 10:
                return new jhe0(parcel.readString());
            case 11:
                rne0 rne0VarCreateFromParcel = parcel.readInt() != 0 ? rne0.CREATOR.createFromParcel(parcel) : null;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("NOT_REQUESTED")) {
                        i3 = 1;
                    } else if (string2.equals("REQUESTING")) {
                        i3 = 2;
                    } else if (string2.equals("COMPLETED")) {
                        i3 = 3;
                    } else if (!string2.equals("FAILED")) {
                        hhg1.n("No enum constant com.spotify.bluejay.onboarding.customization.steps.location.logic.LocationRequestStatus.".concat(string2));
                    }
                    return new rie0(rne0VarCreateFromParcel, string, i3);
                }
                bhn0.i("Name is null");
                i3 = 0;
                return new rie0(rne0VarCreateFromParcel, string, i3);
            case 12:
                int iD = 0;
                String string3 = parcel.readString();
                nhe0 nhe0VarCreateFromParcel = parcel.readInt() != 0 ? nhe0.CREATOR.createFromParcel(parcel) : null;
                String string4 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i5);
                int iD2 = 0;
                while (iD2 != i5) {
                    iD2 = dsl0.d(nhe0.CREATOR, parcel, arrayList2, iD2, 1);
                }
                String string5 = parcel.readString();
                if (string5 != null) {
                    if (string5.equals("IDLE")) {
                        i = 1;
                    } else if (string5.equals("SEARCHING")) {
                        i = 2;
                    } else if (string5.equals("HAS_RESULTS")) {
                        i = 3;
                    } else {
                        if (!string5.equals("NO_RESULTS")) {
                            if (string5.equals("ERROR")) {
                                i3 = 5;
                            } else {
                                hhg1.n("No enum constant com.spotify.trendingnearyou.locationsearch.domain.SearchState.".concat(string5));
                            }
                        }
                        i = i3;
                    }
                    i2 = parcel.readInt();
                    arrayList = new ArrayList(i2);
                    while (iD != i2) {
                        iD = dsl0.d(nhe0.CREATOR, parcel, arrayList, iD, 1);
                    }
                    return new ume0(string3, nhe0VarCreateFromParcel, string4, arrayList2, i, arrayList);
                }
                bhn0.i("Name is null");
                i = 0;
                i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(nhe0.CREATOR, parcel, arrayList, iD, 1);
                }
                return new ume0(string3, nhe0VarCreateFromParcel, string4, arrayList2, i, arrayList);
            case 13:
                return new dne0(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (string7 != null) {
                    if (string7.equals("DEFAULT")) {
                        i4 = 1;
                    } else if (string7.equals("SET_PREFERRED")) {
                        i4 = 2;
                    } else if (!string7.equals("SET_BROWSE")) {
                        hhg1.n("No enum constant com.spotify.liveevents.locationsearch.domain.LocationSearchPageState.".concat(string7));
                    }
                    return new ene0(string6, i4);
                }
                bhn0.i("Name is null");
                i4 = 0;
                return new ene0(string6, i4);
            case 15:
                return new fne0(parcel.readString());
            case 16:
                return new gne0((jj40) parcel.readParcelable(gne0.class.getClassLoader()));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new rne0(parcel.readString(), parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new wne0(parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new xne0(parcel.readString(), parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                parcel.readInt();
                return eue0.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new hwe0(parcel.readString(), parcel.readParcelable(hwe0.class.getClassLoader()));
            case 22:
                return new pwe0((owe0) parcel.readParcelable(pwe0.class.getClassLoader()));
            case 23:
                parcel.readInt();
                return jwe0.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new kwe0(parcel.readString());
            case 25:
                parcel.readInt();
                return lwe0.a;
            case 26:
                parcel.readInt();
                return mwe0.a;
            case 27:
                parcel.readInt();
                return nwe0.a;
            case 28:
                return new vwe0(parcel.readParcelable(vwe0.class.getClassLoader()));
            default:
                parcel.readInt();
                return qwe0.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mbe0[i];
            case 1:
                return new tbe0[i];
            case 2:
                return new ube0[i];
            case 3:
                return new wde0[i];
            case 4:
                return new oge0[i];
            case 5:
                return new pge0[i];
            case 6:
                return new qge0[i];
            case 7:
                return new sge0[i];
            case 8:
                return new ihe0[i];
            case 9:
                return new nhe0[i];
            case 10:
                return new jhe0[i];
            case 11:
                return new rie0[i];
            case 12:
                return new ume0[i];
            case 13:
                return new dne0[i];
            case 14:
                return new ene0[i];
            case 15:
                return new fne0[i];
            case 16:
                return new gne0[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new rne0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new wne0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new xne0[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new eue0[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new hwe0[i];
            case 22:
                return new pwe0[i];
            case 23:
                return new jwe0[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new kwe0[i];
            case 25:
                return new lwe0[i];
            case 26:
                return new mwe0[i];
            case 27:
                return new nwe0[i];
            case 28:
                return new vwe0[i];
            default:
                return new qwe0[i];
        }
    }
}
