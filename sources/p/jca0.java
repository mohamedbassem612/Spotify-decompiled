package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jca0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2;
        switch (this.a) {
            case 0:
                return new kca0((hqr0) parcel.readParcelable(kca0.class.getClassLoader()), xea0.valueOf(parcel.readString()));
            case 1:
                return new yma0(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0);
            case 2:
                return new doa0(parcel);
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("NOT_CHECKED")) {
                        i = 1;
                    } else if (!string2.equals("DATE_INVALID")) {
                        if (string2.equals("VALID")) {
                            i = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.genalphaaccountcreation.birthday.page.mobius.DateValidationState.".concat(string2));
                        }
                    }
                    return new qva0(string, i, xgk1.valueOf(parcel.readString()));
                }
                bhn0.i("Name is null");
                i = 0;
                return new qva0(string, i, xgk1.valueOf(parcel.readString()));
            case 4:
                return new pwa0(parcel.readParcelable(pwa0.class.getClassLoader()));
            case 5:
                return new qwa0(parcel.readInt(), parcel.readInt(), parcel.readParcelable(qwa0.class.getClassLoader()), parcel.readParcelable(qwa0.class.getClassLoader()));
            case 6:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                dxr0 parcelable = parcel.readParcelable(twa0.class.getClassLoader());
                String string6 = parcel.readString();
                boolean z = true;
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z = false;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new twa0(string3, string4, string5, parcelable, string6, string7, z, z, parcel.readInt(), parcel.readString(), parcel.readParcelable(twa0.class.getClassLoader()), parcel.readParcelable(twa0.class.getClassLoader()), parcel.readParcelable(twa0.class.getClassLoader()));
            case 7:
                return new hxa0(parcel.readParcelable(hxa0.class.getClassLoader()), parcel.readParcelable(hxa0.class.getClassLoader()), parcel.readParcelable(hxa0.class.getClassLoader()), parcel.readParcelable(hxa0.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 8:
                return new lxa0(parcel.readParcelable(lxa0.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readParcelable(lxa0.class.getClassLoader()), parcel.readParcelable(lxa0.class.getClassLoader()));
            case 9:
                parcel.readInt();
                return txa0.a;
            case 10:
                return new uxa0(parcel.readString());
            case 11:
                return new vxa0(parcel.readString());
            case 12:
                return new wxa0(parcel.readParcelable(wxa0.class.getClassLoader()));
            case 13:
                return new mya0(parcel.readString(), parcel.readParcelable(mya0.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readParcelable(mya0.class.getClassLoader()), parcel.readParcelable(mya0.class.getClassLoader()), parcel.readInt() != 0);
            case 14:
                return new k1b0(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            case 15:
                return new eab0(parcel.readInt() != 0, parcel.readInt() != 0);
            case 16:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                boolean z2 = true;
                String string10 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                if (parcel.readInt() == 0) {
                    z2 = false;
                }
                return new fab0(string8, string9, string10, z2, z2, (eab0) (parcel.readInt() == 0 ? null : eab0.CREATOR.createFromParcel(parcel)));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new sab0(parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new xab0(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new nbb0(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iD = 0;
                while (iD != i2) {
                    iD = dsl0.d(xab0.CREATOR, parcel, arrayList, iD, 1);
                }
                return new bcb0(string11, string12, arrayList, parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iD2 = 0;
                while (iD2 != i3) {
                    iD2 = dsl0.d(nbb0.CREATOR, parcel, arrayList2, iD2, 1);
                }
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                if (string14 != null) {
                    if (string14.equals("TYPED")) {
                        i = 1;
                    } else if (!string14.equals("LEGACY_CALLBACK")) {
                        hhg1.n("No enum constant com.spotify.lyrics.languagepicker.page.LanguagePickerResultDeliveryMode.".concat(string14));
                    }
                    return new fcb0(arrayList2, string13, i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new fcb0(arrayList2, string13, i);
            case 22:
                return new icb0(parcel.readString());
            case 23:
                return new jcb0(parcel.readString());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                parcel.readInt();
                return feb0.a;
            case 25:
                int iD3 = 0;
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (iD3 != i4) {
                    iD3 = dsl0.d(rib0.CREATOR, parcel, arrayList3, iD3, 1);
                }
                return new cib0(string15, string16, string17, arrayList3, (qhs0) (parcel.readInt() != 0 ? qhs0.CREATOR.createFromParcel(parcel) : null));
            case 26:
                return new hib0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                return new iib0(parcel.readString(), hib0.CREATOR.createFromParcel(parcel), parcel.readString());
            case 28:
                return new qib0(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString());
            default:
                String string18 = parcel.readString();
                String string19 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                int i5 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i5);
                int iF = 0;
                while (iF != i5) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new rib0(string18, string19, z3, linkedHashMap, parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readParcelable(rib0.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new kca0[i];
            case 1:
                return new yma0[i];
            case 2:
                return new doa0[i];
            case 3:
                return new qva0[i];
            case 4:
                return new pwa0[i];
            case 5:
                return new qwa0[i];
            case 6:
                return new twa0[i];
            case 7:
                return new hxa0[i];
            case 8:
                return new lxa0[i];
            case 9:
                return new txa0[i];
            case 10:
                return new uxa0[i];
            case 11:
                return new vxa0[i];
            case 12:
                return new wxa0[i];
            case 13:
                return new mya0[i];
            case 14:
                return new k1b0[i];
            case 15:
                return new eab0[i];
            case 16:
                return new fab0[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new sab0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new xab0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new nbb0[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new bcb0[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new fcb0[i];
            case 22:
                return new icb0[i];
            case 23:
                return new jcb0[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new feb0[i];
            case 25:
                return new cib0[i];
            case 26:
                return new hib0[i];
            case 27:
                return new iib0[i];
            case 28:
                return new qib0[i];
            default:
                return new rib0[i];
        }
    }
}
