package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qn00 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:82:0x01df  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e1  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        int i;
        int i2 = 3;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return rn00.b;
            case 1:
                parcel.readInt();
                return sn00.b;
            case 2:
                parcel.readInt();
                return wq00.a;
            case 3:
                return new xq00(parcel.readString());
            case 4:
                int i3 = 2;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                String string4 = parcel.readString();
                if (string4 != null) {
                    if (string4.equals("Idle")) {
                        i3 = 1;
                    } else if (!string4.equals("Replacing")) {
                        if (string4.equals("Replaced")) {
                            i3 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.playlistmixing.extendedversionspage.domain.ReplacementState.".concat(string4));
                        }
                    }
                    return new fy00(i3, string, string2, z2, string3);
                }
                bhn0.i("Name is null");
                i3 = 0;
                return new fy00(i3, string, string2, z2, string3);
            case 5:
                return new v710(parcel.readInt(), parcel.readString(), parcel.readString());
            case 6:
                return new td10(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readParcelable(td10.class.getClassLoader()));
            case 7:
                return new qd10(parcel.readInt());
            case 8:
                return new rd10(parcel.readInt());
            case 9:
                return new ud10(parcel.readInt());
            case 10:
                parcel.readInt();
                return vd10.a;
            case 11:
                parcel.readInt();
                return wd10.a;
            case 12:
                parcel.readInt();
                return ge10.a;
            case 13:
                parcel.readInt();
                return he10.a;
            case 14:
                parcel.readInt();
                return ie10.a;
            case 15:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string8 = parcel.readString();
                xd10 parcelable = parcel.readParcelable(le10.class.getClassLoader());
                String string9 = parcel.readString();
                if (string9 != null) {
                    if (string9.equals("FACE")) {
                        i2 = 1;
                    } else if (string9.equals("BACK_BUTTON")) {
                        i2 = 2;
                    } else if (!string9.equals("NONE")) {
                        hhg1.n("No enum constant com.spotify.profile.elements.faceheader.api.FaceHeaderElement.IconType.".concat(string9));
                    }
                    String string10 = parcel.readString();
                    Integer num = numValueOf;
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new le10(string5, string6, string7, num, string8, parcelable, i2, string10, string11, string12, z, parcel.readParcelable(le10.class.getClassLoader()), parcel.createStringArrayList());
                }
                bhn0.i("Name is null");
                i2 = 0;
                String string13 = parcel.readString();
                Integer num2 = numValueOf;
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new le10(string5, string6, string7, num2, string8, parcelable, i2, string13, string14, string15, z, parcel.readParcelable(le10.class.getClassLoader()), parcel.createStringArrayList());
            case 16:
                return new ve10(parcel.readString(), parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new we10(parcel.readString(), parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new xe10(parcel.readString(), parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new ye10(parcel.readString(), parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new lf10(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Object) null, (FacebookException) null, false);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new li10(parcel.readInt());
            case 22:
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                String string18 = parcel.readString();
                if (string18 != null) {
                    if (string18.equals("HUB_SECTION")) {
                        i = 1;
                    } else if (string18.equals("DEEPLINK")) {
                        i = 2;
                    } else {
                        if (!string18.equals("NOTIFICATION")) {
                            if (string18.equals("UNKNOWN")) {
                                i2 = 4;
                            } else {
                                hhg1.n("No enum constant com.spotify.culturalmoments.faneventredemption.FanEventRedemptionEntryReason.".concat(string18));
                            }
                        }
                        i = i2;
                    }
                    return new jk10(i, string16, string17, z3, parcel.readString());
                }
                bhn0.i("Name is null");
                i = 0;
                return new jk10(i, string16, string17, z3, parcel.readString());
            case 23:
                return new bn10(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new gn10(parcel.readString());
            case 25:
                int iF = 0;
                String string19 = parcel.readString();
                String string20 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                String string21 = parcel.readString();
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
                while (iF != i4) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new pn10(string19, string20, arrayListCreateStringArrayList, string21, linkedHashMap);
            case 26:
                return new xn10(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                return new do10(parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                parcel.readInt();
                return ko10.a;
            default:
                parcel.readInt();
                return lo10.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new rn00[i];
            case 1:
                return new sn00[i];
            case 2:
                return new wq00[i];
            case 3:
                return new xq00[i];
            case 4:
                return new fy00[i];
            case 5:
                return new v710[i];
            case 6:
                return new td10[i];
            case 7:
                return new qd10[i];
            case 8:
                return new rd10[i];
            case 9:
                return new ud10[i];
            case 10:
                return new vd10[i];
            case 11:
                return new wd10[i];
            case 12:
                return new ge10[i];
            case 13:
                return new he10[i];
            case 14:
                return new ie10[i];
            case 15:
                return new le10[i];
            case 16:
                return new ve10[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new we10[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new xe10[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new ye10[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new lf10[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new li10[i];
            case 22:
                return new jk10[i];
            case 23:
                return new bn10[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new gn10[i];
            case 25:
                return new pn10[i];
            case 26:
                return new xn10[i];
            case 27:
                return new do10[i];
            case 28:
                return new ko10[i];
            default:
                return new lo10[i];
        }
    }
}
