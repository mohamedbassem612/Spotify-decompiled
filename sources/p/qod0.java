package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.yourupdates.domain.models.FetchMode;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qod0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        i = 1;
        i = 1;
        int i = 1;
        int iD = 0;
        switch (this.a) {
            case 0:
                zu50 zu50VarCreateFromParcel = parcel.readInt() == 0 ? null : zu50.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(uf51.CREATOR, parcel, arrayList, iD, 1);
                }
                return new rod0(zu50VarCreateFromParcel, arrayList, (pa30) (parcel.readInt() == 0 ? null : pa30.CREATOR.createFromParcel(parcel)), parcel.readInt() != 0 ? a6x.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            case 1:
                parcel.readInt();
                return zqd0.a;
            case 2:
                parcel.readInt();
                return ard0.a;
            case 3:
                parcel.readInt();
                return brd0.a;
            case 4:
                parcel.readInt();
                return crd0.a;
            case 5:
                parcel.readInt();
                return erd0.a;
            case 6:
                parcel.readInt();
                return frd0.a;
            case 7:
                parcel.readInt();
                return trd0.a;
            case 8:
                parcel.readInt();
                return urd0.a;
            case 9:
                return new bwd0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 10:
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    i = 0;
                } else {
                    String string2 = parcel.readString();
                    if (string2 == null) {
                        bhn0.i("Name is null");
                    } else if (!string2.equals("SHARE")) {
                        hhg1.n("No enum constant com.spotify.liveroom.livestreampage.InitialAction.".concat(string2));
                    }
                }
                return new vzd0(string, i);
            case 11:
                return new d5e0(parcel.readString());
            case 12:
                parcel.readInt();
                return e5e0.a;
            case 13:
                parcel.readInt();
                return g5e0.a;
            case 14:
                return new cae0(parcel.readString());
            case 15:
                parcel.readInt();
                return tae0.a;
            case 16:
                return new uae0(parcel.readParcelable(uae0.class.getClassLoader()));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new yae0((Throwable) parcel.readSerializable());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new vae0(parcel.readString());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                parcel.readInt();
                return abe0.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                parcel.readInt();
                return cbe0.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                parcel.readInt();
                return dbe0.a;
            case 22:
                return new gbe0(parcel.readParcelable(gbe0.class.getClassLoader()));
            case 23:
                return new hbe0(FetchMode.valueOf(parcel.readString()));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                parcel.readInt();
                return ibe0.a;
            case 25:
                return new jbe0(FetchMode.valueOf(parcel.readString()));
            case 26:
                return new kbe0(FetchMode.valueOf(parcel.readString()), parcel.readParcelable(kbe0.class.getClassLoader()));
            case 27:
                parcel.readInt();
                return nbe0.a;
            case 28:
                parcel.readInt();
                return new qbe0();
            default:
                return new rbe0(FetchMode.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new rod0[i];
            case 1:
                return new zqd0[i];
            case 2:
                return new ard0[i];
            case 3:
                return new brd0[i];
            case 4:
                return new crd0[i];
            case 5:
                return new erd0[i];
            case 6:
                return new frd0[i];
            case 7:
                return new trd0[i];
            case 8:
                return new urd0[i];
            case 9:
                return new bwd0[i];
            case 10:
                return new vzd0[i];
            case 11:
                return new d5e0[i];
            case 12:
                return new e5e0[i];
            case 13:
                return new g5e0[i];
            case 14:
                return new cae0[i];
            case 15:
                return new tae0[i];
            case 16:
                return new uae0[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new yae0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new vae0[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new abe0[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new cbe0[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new dbe0[i];
            case 22:
                return new gbe0[i];
            case 23:
                return new hbe0[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new ibe0[i];
            case 25:
                return new jbe0[i];
            case 26:
                return new kbe0[i];
            case 27:
                return new nbe0[i];
            case 28:
                return new qbe0[i];
            default:
                return new rbe0[i];
        }
    }
}
