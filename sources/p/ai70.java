package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ai70 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2;
        int iD = 0;
        switch (this.a) {
            case 0:
                String string = parcel.readString();
                if (string != null) {
                    if (string.equals("PHONE_SPEAKERS")) {
                        i = 1;
                    } else if (!string.equals("EXTERNAL_SPEAKER")) {
                        if (string.equals("OTHER_DEVICE")) {
                            i = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.jam.features.notificationcenter.api.IPLNotificationCenter.Notification.DeviceOnboardingNudge.OutputDeviceType.".concat(string));
                        }
                    }
                    return new bi70(i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new bi70(i);
            case 1:
                parcel.readInt();
                return ci70.c;
            case 2:
                parcel.readInt();
                return di70.c;
            case 3:
                parcel.readInt();
                return ei70.c;
            case 4:
                parcel.readInt();
                return fi70.c;
            case 5:
                parcel.readInt();
                return gi70.c;
            case 6:
                parcel.readInt();
                return hi70.c;
            case 7:
                parcel.readInt();
                return ii70.c;
            case 8:
                return new ki70(parcel.readString());
            case 9:
                return new li70(parcel.readString());
            case 10:
                parcel.readInt();
                return mi70.c;
            case 11:
                parcel.readInt();
                return ni70.c;
            case 12:
                return new pi70(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 13:
                parcel.readInt();
                return qi70.c;
            case 14:
                parcel.readInt();
                return ri70.c;
            case 15:
                return new si70(parcel.readInt() != 0, parcel.readString());
            case 16:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(nj70.CREATOR, parcel, arrayList, iD, 1);
                }
                return new ti70(arrayList, fj70.CREATOR.createFromParcel(parcel));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                tv80 parcelable = parcel.readParcelable(ui70.class.getClassLoader());
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("HOST")) {
                        i = 1;
                    } else if (!string2.equals("PARTICIPANT")) {
                        hhg1.n("No enum constant com.spotify.jam.features.notificationcenter.api.IPLNotificationCenter.Notification.ListeningActivityJoinJamConfirmationDialog.CurrentUserJamRole.".concat(string2));
                    }
                    return new ui70(i, parcel.readString(), parcelable);
                }
                bhn0.i("Name is null");
                i = 0;
                return new ui70(i, parcel.readString(), parcelable);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                parcel.readInt();
                return vi70.c;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new wi70(parcel.readString());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new xi70(parcel.readInt() != 0, parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new yi70(parcel.readInt() != 0);
            case 22:
                return new zi70(parcel.readInt() != 0);
            case 23:
                return new aj70(parcel.readInt(), parcel.readString(), parcel.createStringArrayList());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                parcel.readInt();
                return bj70.c;
            case 25:
                parcel.readInt();
                return cj70.c;
            case 26:
                parcel.readInt();
                return dj70.c;
            case 27:
                parcel.readInt();
                return ej70.c;
            case 28:
                return new fj70(parcel.readString(), parcel.readString(), parcel.readString());
            default:
                return new gj70(parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new bi70[i];
            case 1:
                return new ci70[i];
            case 2:
                return new di70[i];
            case 3:
                return new ei70[i];
            case 4:
                return new fi70[i];
            case 5:
                return new gi70[i];
            case 6:
                return new hi70[i];
            case 7:
                return new ii70[i];
            case 8:
                return new ki70[i];
            case 9:
                return new li70[i];
            case 10:
                return new mi70[i];
            case 11:
                return new ni70[i];
            case 12:
                return new pi70[i];
            case 13:
                return new qi70[i];
            case 14:
                return new ri70[i];
            case 15:
                return new si70[i];
            case 16:
                return new ti70[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new ui70[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new vi70[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new wi70[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new xi70[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new yi70[i];
            case 22:
                return new zi70[i];
            case 23:
                return new aj70[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new bj70[i];
            case 25:
                return new cj70[i];
            case 26:
                return new dj70[i];
            case 27:
                return new ej70[i];
            case 28:
                return new fj70[i];
            default:
                return new gj70[i];
        }
    }
}
